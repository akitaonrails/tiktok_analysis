package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C0UX3;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C19322110iZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C758560TpG;
import X.C766270U4b;
import X.C771680UOw;
import X.InterfaceC20354714kj;
import X.InterfaceC771690UOx;
import X.InterfaceC771710UOz;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.TitleEditDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.RoomTitleEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TitleConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveTitleAbility;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class RoomTitleEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("room_title", 0, 40100006, 0, C1697810uHb.LJIIJJI("title_ongoing", "never"), null, 20464);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJLIIIJ(java.lang.String r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L16
            com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TitleConfig> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TitleConfig.class
            java.lang.Object r0 = r1.LJII(r3, r0)     // Catch: java.lang.Throwable -> L1b
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TitleConfig r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TitleConfig) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.changedTitle     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L17
        L16:
            r1 = r2
        L17:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1b
            goto L27
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L27:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 != 0) goto L2e
            r2 = r1
        L2e:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.RoomTitleEntity.LJJLIIIJ(java.lang.String):java.lang.String");
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        String strLJJLIIIJ = LJJLIIIJ(c20424814w2.LJII);
        boolean zLJJIL = true;
        if (MultiGuestLiveTitleAbility.INSTANCE.getValue() > 0) {
            if (!C500260Jjc.LJJIL() && !this.LLJIJIL) {
                zLJJIL = false;
            }
        } else {
            zLJJIL = C500260Jjc.LJJIL();
        }
        return new C20361314ln(C497740JfY.LJIJI(2131851336), C497740JfY.LJIJI(2131851336), R.attr.e6u, R.attr.e6u, Collections.singletonList(strLJJLIIIJ), null, i, null, zLJJIL, null, 3712);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        if (C500260Jjc.LJJ() && MultiGuestLiveTitleAbility.INSTANCE.getValue() <= 0) {
            C766270U4b.LIZLLL(2131854672);
            interfaceC979390bar.LJFF();
            return;
        }
        String strLJJLIIIJ = LJJLIIIJ(c20361214lm.LJI);
        if (C758560TpG.LIZ) {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && C19322110iZ.LJFF(fragmentManager, new TitleEditDialog(strLJJLIIIJ, new AwS397S0200000_31(interfaceC979390bar, this, 17)), this.LLJJJJJIL.LIZ, null, 0) <= 0) {
                interfaceC979390bar.LIZLLL(this.LLJJJJJIL.LIZLLL, "open sheet fail");
                return;
            }
            return;
        }
        if (C500260Jjc.LJJ()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showTitleEditDialog(strLJJLIIIJ, "playbook", this.LLJ, new C0UX3() { // from class: X.14kg
                @Override // X.C0UX3
                public final void LIZ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LIZ(true);
                    }
                }

                @Override // X.C0UX3
                public final void LIZIZ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LJ();
                    }
                }

                @Override // X.C0UX3
                public final void LIZJ(String str) {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        TitleConfig titleConfig = new TitleConfig();
                        if (str == null) {
                            str = "";
                        }
                        titleConfig.changedTitle = str;
                        interfaceC979390bar2.LJI(this.LJJJIL().LIZLLL, C1516000pYM.LIZJ(titleConfig), true);
                    }
                }
            });
            return;
        }
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC771690UOx interfaceC771690UOx = new InterfaceC771690UOx() { // from class: X.14kf
            @Override // X.InterfaceC771690UOx
            public final void LIZ() {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZ(true);
                }
            }

            @Override // X.InterfaceC771690UOx
            public final void LIZIZ() {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZLLL(this.LLJJJJJIL.LIZLLL, "open sheet fail");
                }
                InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                if (interfaceC979390bar3 != null) {
                    interfaceC979390bar3.LJ();
                }
            }

            @Override // X.InterfaceC771690UOx
            public final void LIZJ(String str) {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    TitleConfig titleConfig = new TitleConfig();
                    if (str == null) {
                        str = "";
                    }
                    titleConfig.changedTitle = str;
                    interfaceC979390bar2.LJI(this.LLJJJJJIL.LIZLLL, C1516000pYM.LIZJ(titleConfig), true);
                }
                InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                if (interfaceC979390bar3 != null) {
                    interfaceC979390bar3.LJ();
                }
            }
        };
        broadcastKit.getClass();
        C771680UOw.LIZJ = true;
        C771680UOw.LIZLLL = false;
        C771680UOw.LJ = strLJJLIIIJ;
        C771680UOw.LJIIL = interfaceC771690UOx;
        DataChannel dataChannel2 = C771680UOw.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(PreviewCoverEditVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        String strLJJLIIIJ = LJJLIIIJ(c20361214lm.LJI);
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC771690UOx interfaceC771690UOx = new InterfaceC771690UOx() { // from class: X.14ki
            @Override // X.InterfaceC771690UOx
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }

            @Override // X.InterfaceC771690UOx
            public final void LIZIZ() {
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }

            @Override // X.InterfaceC771690UOx
            public final void LIZJ(String str2) {
                RoomTitleEntity roomTitleEntity = this.LIZ;
                TitleConfig titleConfig = new TitleConfig();
                if (str2 == null) {
                    str2 = "";
                }
                titleConfig.changedTitle = str2;
                PlayEntityUtilKt.LIZJ(roomTitleEntity, titleConfig, c20361214lm, interfaceC20354714kj, true);
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }
        };
        broadcastKit.getClass();
        C771680UOw.LIZJ = true;
        C771680UOw.LIZLLL = false;
        C771680UOw.LJ = strLJJLIIIJ;
        C771680UOw.LJIIL = interfaceC771690UOx;
        DataChannel dataChannel = C771680UOw.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(PreviewCoverEditVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        if (C500260Jjc.LJJ() && MultiGuestLiveTitleAbility.INSTANCE.getValue() <= 0) {
            C766270U4b.LIZLLL(2131854672);
            if (interfaceC20354714kj != null) {
                interfaceC20354714kj.LJIIJ();
                return;
            }
            return;
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showTitleEditDialog(LJJLIIIJ(c20361214lm.LJI), "playbook", this.LLJ, new C0UX3() { // from class: X.14kh
            @Override // X.C0UX3
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }

            @Override // X.C0UX3
            public final void LIZIZ() {
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }

            @Override // X.C0UX3
            public final void LIZJ(String str4) {
                RoomTitleEntity roomTitleEntity = this.LIZ;
                TitleConfig titleConfig = new TitleConfig();
                if (str4 == null) {
                    str4 = "";
                }
                titleConfig.changedTitle = str4;
                PlayEntityUtilKt.LIZJ(roomTitleEntity, titleConfig, c20361214lm, interfaceC20354714kj, true);
            }
        });
    }
}
