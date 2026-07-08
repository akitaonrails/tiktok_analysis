package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0KX8;
import X.C0UA2;
import X.C0UFE;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20348414ji;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5180020c;
import X.C748880TZe;
import X.C930940aKi;
import X.C937280aUw;
import X.C946060aj6;
import X.C979160baU;
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
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.model.PropsEffectChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomEffect;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS180S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class PropEffectEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("stickers", 0, 35600000, 0, C1697810uHb.LJIIJJI("sticker_ongoing", "sticker_finish_setting", "sticker_finished", "never"), "sticker_finish_setting", 4080);
    public final AFwS276S0000000_31 LLJJJJLIIL = AFwS276S0000000_31.get$arr$(10);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 116));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.STICKER, (C20348414ji) this.LLJJL.getValue());
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
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            LJJLIIIJ((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, str, new RoomEffect("", null)));
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        boolean z;
        Room room;
        Object objInvoke;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        C0KX8 c0kx8;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && !PlayEntityUtilKt.LJIIJJI(dataChannel)) {
            return true;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null && (c0kx8 = (C0KX8) dataChannel2.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LIZJ) {
            z = false;
        } else {
            z = true;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null && roomLJJLI.cppVersion == 1) {
            DataChannel dataChannel3 = this.LLJ;
            AFwS276S0000000_31 aFwS276S0000000_31 = this.LLJJJJLIIL;
            if ((dataChannel3 == null || PlayEntityUtilKt.LJIIJJI(dataChannel3)) && (room = (Room) dataChannelGlobal.gg0(C930940aKi.class)) != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                objInvoke = aFwS276S0000000_31.invoke(anchorLevelPermission);
            } else {
                objInvoke = C0UFE.ON;
            }
            if (objInvoke != C0UFE.ON) {
                return false;
            }
        }
        return z;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJ((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, c20361214lm.LJI, new RoomEffect("", null)))) {
            ((C20348414ji) this.LLJJL.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.STICKER, (C20348414ji) this.LLJJL.getValue());
        }
    }

    public final boolean LJJLIIIJ(RoomEffect roomEffect) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (roomEffect != null && roomEffect.id.length() != 0) {
            if (Intrinsics.LJFF(roomEffect.id, str) && enumC771230UNd == EnumC771230UNd.APPLYING) {
                LJJIJ();
                return true;
            }
        } else if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJJIJ();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        return C500260Jjc.LJJIIZ(((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, c20361214lm.LJI, new RoomEffect("", null))).id);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV = null;
        String str = ((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, c20424814w2.LJII, new RoomEffect("", null))).id;
        if (!a0.LJJJIL(str)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5180020c(str, 10), str, null, 0.0f, 207);
        }
        return new C20361314ln(C497740JfY.LJIJI(2131840772), C497740JfY.LJIJI(2131840772), R.attr.d1h, R.attr.d1h, C13BV.INSTANCE, c20365714mV, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        RoomEffect roomEffect = (RoomEffect) C937280aUw.LIZJ(RoomEffect.class, c20361214lm.LJI, new RoomEffect("", null));
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSingleToolSelectorDialog(fragmentManager, new C0UA2(roomEffect.id, EnumC20429014wi.PROPS, new InterfaceC761540Tu4() { // from class: X.14jj
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
                            String str = c20355014km.LIZ;
                            if (str == null) {
                                str = "";
                            }
                            String json = GsonProtectorUtils.toJson(gson, new RoomEffect(str, null));
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
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) throws JSONException {
        RoomEffect roomEffect = (RoomEffect) C937280aUw.LIZJ(RoomEffect.class, c20361214lm.LJI, new RoomEffect("", null));
        if (Intrinsics.LJFF(str, "liveCenter")) {
            ((C20348414ji) this.LLJJL.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.STICKER, (C20348414ji) this.LLJJL.getValue());
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
        DataChannel dataChannel = this.LLJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource_id", roomEffect.id);
        jSONObject.put(Scene.SCENE_SERVICE, "play_book");
        iBroadcastService.openOrApplyHostToolsAbility(enumC773040UUc, dataChannel, context, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        FragmentManager fragmentManager;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 117));
        }
        Object objLIZJ = C937280aUw.LIZJ(RoomEffect.class, c20361214lm.LJI, new RoomEffect("", null));
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(PropsEffectChannel.class, new C946060aj6(objLIZJ, str3, new AwS180S0400000_31(this, (PropEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 2), null, new AwS575S0100000_31(this, 118), new AwS240S0300000_31(this, (PropEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 12), new C979160baU(this), new AwS240S0300000_31(this, (PropEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 13), false, this.LLIZ, null, null, 13848));
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            DataChannel dataChannel3 = this.LLJ;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            iBroadcastService.openStickerPropsDialog(str3, dataChannel3, fragmentManager, C500260Jjc.LJJLI());
        }
    }
}
