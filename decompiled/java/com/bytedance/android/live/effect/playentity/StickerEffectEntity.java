package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01EI;
import X.C01GW;
import X.C0UA2;
import X.C0UD4;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1AZW;
import X.C20352914kR;
import X.C20353114kT;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C2188811AlT;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C766270U4b;
import X.C769010UEp;
import X.C769040UEs;
import X.C769490UGl;
import X.C924810aAp;
import X.C937280aUw;
import X.C946060aj6;
import X.EnumC20429014wi;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC761540Tu4;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ShowStickerPanelEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.model.StickerEffectChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS180S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS49S2100000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS8S1500000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class StickerEffectEntity extends AbstractC20356314kz {
    public LiveEffect LLJJJJLIIL;
    public SharedEffect LLJJL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("effects", 0, 35600000, 0, C1697810uHb.LJIIJJI("effects_ongoing", "effects_finish_setting", "effects_finished", "never"), "effects_finish_setting", 4080);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(62));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 125));

    @Override // X.AbstractC20356314kz
    public final void LJJIJLIJ() {
        this.LLJJL = null;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJ() {
        String resourceId;
        C1161920gLG.LIZJ(IBroadcastService.class);
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).baseComposerManager().qr(C0UD4.LIZIZ));
        SharedEffect sharedEffect = null;
        if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null && !a0.LJJJIL(resourceId)) {
            sharedEffect = new SharedEffect(resourceId, "", null);
        }
        this.LLJJL = sharedEffect;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.EFFECTS, (C20353114kT) this.LLJL.getValue());
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        LJJIL();
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJI(Function2 function2) throws JSONException {
        Context context;
        String str;
        String str2;
        WeakReference<Context> weakReference = this.LLJI;
        if (weakReference != null && (context = weakReference.get()) != null) {
            SharedEffect sharedEffect = this.LLJJL;
            if (sharedEffect != null && (str = sharedEffect.id) != null && !a0.LJJJIL(str)) {
                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                EnumC773040UUc enumC773040UUc = EnumC773040UUc.EFFECTS;
                DataChannel dataChannel = this.LLJ;
                JSONObject jSONObject = new JSONObject();
                SharedEffect sharedEffect2 = this.LLJJL;
                if (sharedEffect2 != null) {
                    str2 = sharedEffect2.id;
                } else {
                    str2 = null;
                }
                jSONObject.put("resource_id", str2);
                jSONObject.put("category", "effect");
                jSONObject.put("panel_name", "livestreaming");
                jSONObject.put("success_tips", "");
                jSONObject.put("fail_tips", "");
                iBroadcastService.openOrApplyHostToolsAbility(enumC773040UUc, dataChannel, context, jSONObject);
            } else {
                ((IEffectService) this.LLJJLIIIJLLLLLLLZ.getValue()).baseComposerManager().lr("livestreaming");
                IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                if (iBroadcastService2 != null) {
                    iBroadcastService2.notifyApplyStatusAndSaveStatus(EnumC773040UUc.EFFECTS, EnumC771230UNd.APPLY_FINISH, null);
                }
            }
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        function2.invoke(Boolean.FALSE, "context is null");
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            SharedEffect sharedEffect = null;
            if (str != null && !a0.LJJJIL(str)) {
                sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, str, new SharedEffect("", "", null));
            }
            LJJLIIIJL(sharedEffect);
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && !PlayEntityUtilKt.LJIIJJI(dataChannel) && !HideEffectEntrySetting.INSTANCE.shouldHide()) {
            return true;
        }
        if (((!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rl2(C924810aAp.LJ().LJIILJJIL)) && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) || HideEffectEntrySetting.INSTANCE.shouldHide()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJL(C20352914kR.LIZ(c20361214lm))) {
            ((C20353114kT) this.LLJL.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.EFFECTS, (C20353114kT) this.LLJL.getValue());
        }
    }

    public final boolean LJJLIIIJJIZ(Object obj) {
        if (!(obj instanceof String)) {
            obj = null;
        }
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).baseComposerManager().qr(C0UD4.LIZIZ));
        if (liveEffect != null && !Intrinsics.LJFF(liveEffect.getResourceId(), obj)) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIIJL(SharedEffect sharedEffect) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.EFFECTS;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (sharedEffect == null) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING) {
                LJJIJ();
                return true;
            }
            return false;
        }
        if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, sharedEffect.id)) {
            LJJIJ();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        String str;
        SharedEffect sharedEffectLIZ = C20352914kR.LIZ(c20361214lm);
        if (sharedEffectLIZ != null) {
            str = sharedEffectLIZ.id;
        } else {
            str = null;
        }
        return C500260Jjc.LJJIIZ(str);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV = null;
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20424814w2.LJII, new SharedEffect("", "", null));
        String str = sharedEffect.id;
        String str2 = sharedEffect.backupResourceId;
        boolean z = true;
        if (!(!a0.LJJJIL(str)) && !(!a0.LJJJIL(str2))) {
            this.LLJJJJLIIL = null;
        } else {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new AwS49S2100000_31(this, str, str2, 3), str, str2, 0.0f, 143);
        }
        String strLJIJI = C497740JfY.LJIJI(2131842712);
        String strLJIJI2 = C497740JfY.LJIJI(2131842712);
        C13BV c13bv = C13BV.INSTANCE;
        if (!this.LLJILJILJ && !this.LLJIJIL) {
            z = false;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.dm9, R.attr.dm9, c13bv, c20365714mV, i, null, z, null, 3712);
    }

    public final void LJJLIIIJ(List<String> list, Function1<? super List<? extends LiveEffect>, Unit> function1) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            function1.invoke(C13BV.INSTANCE);
        } else {
            ((IEffectService) this.LLJJLIIIJLLLLLLLZ.getValue()).getLiveEffectController().LIZLLL(arrayList, function1);
        }
    }

    public static LiveEffect LJJLIIIJILLIZJL(String str, String str2, List list) {
        Object next;
        Object next2;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) next;
        if (liveEffect != null) {
            return liveEffect;
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(((LiveEffect) next2).getResourceId(), str2)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) next2;
        if (liveEffect2 == null) {
            return null;
        }
        return liveEffect2;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(11), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 1), AFwS276S0000000_31.get$arr$(12), C497740JfY.LJIJI(2131840772), Boolean.FALSE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        String str;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        SharedEffect sharedEffectLIZ = C20352914kR.LIZ(c20361214lm);
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                if (sharedEffectLIZ != null) {
                    str = sharedEffectLIZ.id;
                } else {
                    str = null;
                }
                iEffectService.openSingleToolSelectorDialog(fragmentManager, new C0UA2(str, EnumC20429014wi.STICKER_EFFECT, new InterfaceC761540Tu4() { // from class: X.14kU
                    public boolean LIZ;

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZ() {
                        InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                        if (interfaceC979390bar2 != null) {
                            interfaceC979390bar2.LIZ(false);
                        }
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZIZ() {
                        InterfaceC979390bar interfaceC979390bar2;
                        if (this.LIZ || (interfaceC979390bar2 = interfaceC979390bar) == null) {
                            return;
                        }
                        interfaceC979390bar2.LIZJ();
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZJ(C20355014km c20355014km) {
                        if (c20355014km == null) {
                            InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                            if (interfaceC979390bar2 != null) {
                                interfaceC979390bar2.LJI(c20361214lm.LIZIZ, null, !this.LIZ);
                            }
                        } else {
                            Gson gson = C19748512Ol.LIZJ;
                            this.getClass();
                            String str2 = c20355014km.LIZ;
                            String str3 = "";
                            if (str2 != null) {
                                str3 = str2;
                            }
                            String json = GsonProtectorUtils.toJson(gson, new SharedEffect(str3, str3, null));
                            InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                            if (interfaceC979390bar3 != null) {
                                interfaceC979390bar3.LJI(c20361214lm.LIZIZ, json, !this.LIZ);
                            }
                        }
                        this.LIZ = true;
                    }
                }));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC979390bar.LIZLLL(c20361214lm.LIZIZ, "");
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJJI(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJI(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        String resourceId;
        String resourceId2;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 122));
        }
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        LiveEffect liveEffect = this.LLJJJJLIIL;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        boolean zLJJLIIIJJIZ = LJJLIIIJJIZ(resourceId);
        if (zLJJLIIIJJIZ) {
            C766270U4b.LIZLLL(2131854098);
        }
        LJJLIIIJLJLI(null, c20361214lm, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 123), str, lifecycleOwner);
        if (!zLJJLIIIJJIZ) {
            if (this.LLJJJJLIIL != null) {
                String strLIZ = C01EI.LIZ(100, this.LLJJJJJIL.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("use uiEffect, resourceId=");
                LiveEffect liveEffect2 = this.LLJJJJLIIL;
                if (liveEffect2 != null) {
                    resourceId2 = liveEffect2.getResourceId();
                } else {
                    resourceId2 = null;
                }
                sbLIZ.append(resourceId2);
                C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                LJJLIIIJLJLI(this.LLJJJJLIIL, c20361214lm, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 124), str, lifecycleOwner);
            } else {
                String strLIZ2 = C01EI.LIZ(111, this.LLJJJJJIL.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchEffectListInBroadcast, resourceId=");
                sbLIZ2.append(sharedEffect.id);
                sbLIZ2.append(", backupResourceId=");
                sbLIZ2.append(sharedEffect.backupResourceId);
                C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                LJJLIIIJ(C1697810uHb.LJIIJJI(sharedEffect.id, sharedEffect.backupResourceId), new AwS8S1500000_31(this, (StickerEffectEntity) sharedEffect, (SharedEffect) c20361214lm, (C20361214lm) str, (String) lifecycleOwner, (LifecycleOwner) c259800zU, (C259800zU<InterfaceC20354714kj>) 0));
            }
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.SX0(C769010UEp.class, Boolean.FALSE);
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null) {
            dataChannel2.LC0(ShowStickerPanelEvent.class, new C769490UGl(false, false));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) throws JSONException {
        SharedEffect sharedEffectLIZ = C20352914kR.LIZ(c20361214lm);
        if (sharedEffectLIZ != null) {
            if (Intrinsics.LJFF(str, "liveCenter")) {
                ((C20353114kT) this.LLJL.getValue()).LIZ = c20361214lm;
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.EFFECTS, (C20353114kT) this.LLJL.getValue());
            }
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            EnumC773040UUc enumC773040UUc = EnumC773040UUc.EFFECTS;
            DataChannel dataChannel = this.LLJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resource_id", sharedEffectLIZ.id);
            jSONObject.put("category", "effect");
            jSONObject.put("panel_name", "livestreaming");
            jSONObject.put("success_tips", "");
            jSONObject.put("fail_tips", "");
            iBroadcastService.openOrApplyHostToolsAbility(enumC773040UUc, dataChannel, context, jSONObject);
            interfaceC953350aur.LIZIZ();
            return;
        }
        interfaceC953350aur.LIZ(false, true);
    }

    public final void LJJLIIIJLJLI(LiveEffect liveEffect, C20361214lm c20361214lm, Function0<? extends InterfaceC20354714kj> function0, String str, LifecycleOwner lifecycleOwner) {
        String resourceId;
        PlayEntityUtilKt.LJFF(this, c20361214lm, function0.invoke(), lifecycleOwner);
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
                resourceId = "";
            }
            dataChannel.zW(StickerEffectChannel.class, new C946060aj6(new SharedEffect(resourceId, "", liveEffect), str, new AwS180S0400000_31(this, (StickerEffectEntity) c20361214lm, (C20361214lm) function0, (Function0<? extends InterfaceC20354714kj>) c013c, (C013C) 3), null, new AwS575S0100000_31(this, 126), new AwS240S0300000_31(this, (StickerEffectEntity) c20361214lm, (C20361214lm) function0, (Function0<? extends InterfaceC20354714kj>) 16), new AwS240S0300000_31(this, (StickerEffectEntity) c20361214lm, (C20361214lm) function0, (Function0<? extends InterfaceC20354714kj>) 17), new AwS240S0300000_31(this, (StickerEffectEntity) c20361214lm, (C20361214lm) function0, (Function0<? extends InterfaceC20354714kj>) 18), false, this.LLIZ, null, null, 13848));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJJI(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3);
    }
}
