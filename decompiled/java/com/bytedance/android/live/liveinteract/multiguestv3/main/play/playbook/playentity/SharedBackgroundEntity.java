package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C0UA2;
import X.C1161920gLG;
import X.C13BV;
import X.C1555540qa8;
import X.C1697810uHb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C2217371BqR;
import X.C259800zU;
import X.C334801Rq;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5180020c;
import X.C5182020e;
import X.C748880TZe;
import X.C916490ZxP;
import X.C930480aJy;
import X.C935460aS0;
import X.C935540aS8;
import X.C937280aUw;
import X.C946060aj6;
import X.C947860am0;
import X.C956790b0P;
import X.C979100baO;
import X.EnumC20429014wi;
import X.EnumC937290aUx;
import X.InterfaceC20354714kj;
import X.InterfaceC665370Q7z;
import X.InterfaceC761540Tu4;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.wallpaper.ShareBgSwitchLayoutController;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.ShareBgMultiEffectChannel;
import com.bytedance.android.livesdk.model.SharedBgStatusChangeEvent;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS131S1200000_15;
import kotlin.jvm.internal.AwS171S0400000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class SharedBackgroundEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("shared_background", 0, 35600000, 0, C1697810uHb.LJIIJJI("wallpaper_ongoing", "wallpaper_finish_setting", "wallpaper_finished", "never"), "wallpaper_finish_setting", 4080);
    public SharedEffect LLJJJJLIIL;
    public LayoutConfig LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJIJLIJ() {
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state2;
        String str;
        String str2;
        C935540aS8 state3;
        DataChannel dataChannel = this.LLJ;
        SharedEffect sharedEffect = null;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null && (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null && state.LLILLL && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbility.GL0()) != null && (state2 = multiGuestSharedBgAnchorViewModelGL02.getState()) != null && (str = state2.LLILZ) != null && !a0.LJJJIL(str)) {
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL03 = iSharedBgAbility.GL0();
            if (multiGuestSharedBgAnchorViewModelGL03 == null || (state3 = multiGuestSharedBgAnchorViewModelGL03.getState()) == null || (str2 = state3.LLILZ) == null) {
                str2 = "";
            }
            sharedEffect = new SharedEffect(str2, "", null);
        }
        this.LLJJJJLIIL = sharedEffect;
        this.LLJJL = C947860am0.LIZIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final ISharedBgAbility LJJLIIIJ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null) {
            return null;
        }
        return (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 331));
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJI(Function2 function2) {
        Context context;
        String str;
        boolean z;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL03;
        C935540aS8 state;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        WeakReference<Context> weakReference = this.LLJI;
        if (weakReference != null && (context = weakReference.get()) != null) {
            SharedEffect sharedEffect = this.LLJJJJLIIL;
            if (sharedEffect != null) {
                str = sharedEffect.id;
            } else {
                str = null;
            }
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                ISharedBgAbility iSharedBgAbilityLJJLIIIJ = LJJLIIIJ();
                if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL03 = iSharedBgAbilityLJJLIIIJ.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL03.getState()) != null && state.LL && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.layoutType == 1) {
                    C935460aS0.LIZ(context, new AwS131S1200000_15(this, (SharedBackgroundEntity) str, (String) function2, (Function2<? super Boolean, ? super String, Unit>) 3), new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 211));
                    return;
                }
                ISharedBgAbility iSharedBgAbilityLJJLIIIJ2 = LJJLIIIJ();
                if (iSharedBgAbilityLJJLIIIJ2 != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbilityLJJLIIIJ2.GL0()) != null) {
                    multiGuestSharedBgAnchorViewModelGL02.zQ2(str, "playbook_undo", new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 212), new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 213));
                    return;
                } else {
                    function2.invoke(Boolean.FALSE, "sharedBgAbility is null");
                    return;
                }
            }
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ3 = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ3 != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ3.GL0()) != null) {
                AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(this, (SharedBackgroundEntity) function2, (Function2<? super Boolean, ? super String, Unit>) 79);
                AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = multiGuestSharedBgAnchorViewModelGL0.LLILZLL;
                if (aigcWallpaperAnchorViewModel == null) {
                    return;
                }
                BaseAigcWallpaperViewModel.vQ2(aigcWallpaperAnchorViewModel, "", "", "", "", 4, true, null, new AwS416S0200000_15(multiGuestSharedBgAnchorViewModelGL0, awS381S0200000_15, 59), true, 64);
                return;
            }
            function2.invoke(Boolean.FALSE, "sharedBgAbility is null");
            return;
        }
        function2.invoke(Boolean.FALSE, "context is null");
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            LJJLIIIJILLIZJL((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, str, new SharedEffect("", "", null)));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        if (!LJJLIIIJILLIZJL((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null)))) {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null) {
                dataChannel.CQ2(SharedBgStatusChangeEvent.class, this, new AwS381S0200000_15(c20361214lm, this, 39));
            }
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ.GL0()) != null) {
                MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL0, new C2217371BqR() { // from class: X.0baP
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C935540aS8) obj).LLILLL);
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj, Object obj2) {
                        ((C935540aS8) obj).LLILLL = ((Boolean) obj2).booleanValue();
                    }
                }, LJJJJ(), new AwS381S0200000_15(c20361214lm, this, 40));
            }
        }
    }

    public final boolean LJJLIIIJILLIZJL(SharedEffect sharedEffect) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        String str;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL03;
        C935540aS8 state3;
        if (sharedEffect.id.length() == 0) {
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL03 = iSharedBgAbilityLJJLIIIJ.GL0()) != null && (state3 = multiGuestSharedBgAnchorViewModelGL03.getState()) != null && state3.LLILLL) {
                LJJIJ();
                return true;
            }
        } else {
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ2 = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ2 != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ2.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null && state.LLILLL) {
                String str2 = sharedEffect.id;
                ISharedBgAbility iSharedBgAbilityLJJLIIIJ3 = LJJLIIIJ();
                if (iSharedBgAbilityLJJLIIIJ3 != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbilityLJJLIIIJ3.GL0()) != null && (state2 = multiGuestSharedBgAnchorViewModelGL02.getState()) != null) {
                    str = state2.LLILZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    LJJIJ();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        boolean z2;
        if (((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null))).id.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return !z2;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV = null;
        String str = ((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20424814w2.LJII, new SharedEffect("", "", null))).id;
        if (!a0.LJJJIL(str)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5180020c(str, 4), str, null, 0.0f, 207);
        }
        return new C20361314ln(C497740JfY.LJIJI(2131843396), C497740JfY.LJIJI(2131843396), R.attr.dvp, R.attr.dvp, C13BV.INSTANCE, c20365714mV, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 16);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSingleToolSelectorDialog(fragmentManager, new C0UA2(sharedEffect.id, EnumC20429014wi.SHARED_BACKGROUND_EFFECT, new InterfaceC761540Tu4() { // from class: X.0baR
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
                            String str2 = "";
                            if (str != null) {
                                str2 = str;
                            }
                            String json = GsonProtectorUtils.toJson(gson, new SharedEffect(str2, str2, null));
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
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        if (sharedEffect.id.length() != 0) {
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbilityLJJLIIIJ.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL02.getState()) != null && state.LL && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.layoutType == 1) {
                C935460aS0.LIZ(context, new AwS80S1300000_15(this, sharedEffect, str, interfaceC953350aur, 1), new AwS559S0100000_15(interfaceC953350aur, 332));
                return;
            }
            ISharedBgAbility iSharedBgAbilityLJJLIIIJ2 = LJJLIIIJ();
            if (iSharedBgAbilityLJJLIIIJ2 == null || (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ2.GL0()) == null) {
                return;
            }
            multiGuestSharedBgAnchorViewModelGL0.zQ2(sharedEffect.id, str, new AwS559S0100000_15(interfaceC953350aur, 333), new AwS559S0100000_15(interfaceC953350aur, 334));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 335));
        }
        Object objLIZJ = C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(ShareBgMultiEffectChannel.class, new C946060aj6(objLIZJ, str3, new AwS171S0400000_15(this, (SharedBackgroundEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 0), null, new AwS559S0100000_15(this, 336), new AwS224S0300000_15(this, (SharedBackgroundEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 25), new C979100baO(this), new AwS224S0300000_15(this, (SharedBackgroundEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 26), false, this.LLIZ, null, null, 13848));
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null) {
            dataChannel2.LC0(ShareBgSwitchLayoutController.ShareBgSwitchLayoutEvent.class, EnumC937290aUx.PLAYBOOK);
        }
    }
}
