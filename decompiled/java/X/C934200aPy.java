package X;

import Y.ACListenerS0S1302000_15;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934200aPy implements InterfaceC934210aPz {
    public final InterfaceC934210aPz LIZ;

    @Override // X.InterfaceC934210aPz
    public final void LIZ(AbstractC939840aZ4 abstractC939840aZ4) {
        this.LIZ.LIZ(abstractC939840aZ4);
    }

    @Override // X.InterfaceC934210aPz
    public final void LIZIZ(C933460aOm c933460aOm) {
        this.LIZ.LIZIZ(c933460aOm);
    }

    @Override // X.InterfaceC934210aPz
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC934210aPz
    public final void LIZLLL(C00YI c00yi, boolean z, AwS594S0100000_15 awS594S0100000_15, Function0 function0) {
        this.LIZ.LIZLLL(c00yi, z, awS594S0100000_15, function0);
    }

    @Override // X.InterfaceC934210aPz
    public final void LJ(boolean z, boolean z2, User user, boolean z3, AwS594S0100000_15 awS594S0100000_15, Function0 function0) {
        this.LIZ.LJ(z, z2, user, z3, awS594S0100000_15, function0);
    }

    @Override // X.InterfaceC934210aPz
    public final void onDetach() {
        this.LIZ.onDetach();
    }

    public C934200aPy(final DataChannel dataChannel, final C934190aPx c934190aPx) {
        AbstractC934100aPo abstractC934100aPo;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            abstractC934100aPo = new AbstractC934100aPo(c934190aPx, dataChannel) { // from class: X.0aPp
                @Override // X.InterfaceC934210aPz
                public final int LIZJ() {
                    return R.layout.he0;
                }
            };
        } else {
            abstractC934100aPo = new AbstractC934100aPo(c934190aPx, dataChannel) { // from class: X.0aPl
                public C934060aPk LIZJ;
                public C934080aPm LIZLLL;

                @Override // X.InterfaceC934210aPz
                public final int LIZJ() {
                    return R.layout.he4;
                }

                @Override // X.AbstractC934100aPo, X.InterfaceC934210aPz
                public final void LIZ(AbstractC939840aZ4 abstractC939840aZ4) {
                    IApplyGuideAbility iApplyGuideAbility;
                    if (this.LIZJ == null) {
                        this.LIZJ = new C934060aPk(abstractC939840aZ4, this.LIZ);
                    }
                    C934060aPk c934060aPk = this.LIZJ;
                    IGuestInviteAbility iGuestInviteAbility = null;
                    if (c934060aPk != null) {
                        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) c934060aPk.LIZIZ.gg0(C956790b0P.class);
                        if (interfaceC665370Q7z != null) {
                            iApplyGuideAbility = (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IApplyGuideAbility.class, null);
                        } else {
                            iApplyGuideAbility = null;
                        }
                        c934060aPk.LIZJ = iApplyGuideAbility;
                    }
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new C934080aPm(abstractC939840aZ4, this.LIZ);
                    }
                    C934080aPm c934080aPm = this.LIZLLL;
                    if (c934080aPm != null) {
                        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) c934080aPm.LIZIZ.gg0(C956790b0P.class);
                        if (interfaceC665370Q7z2 != null) {
                            iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z2, IGuestInviteAbility.class, null);
                        }
                        c934080aPm.LIZJ = iGuestInviteAbility;
                    }
                }

                @Override // X.AbstractC934100aPo, X.InterfaceC934210aPz
                public final void LIZLLL(C00YI c00yi, boolean z, AwS594S0100000_15 awS594S0100000_15, Function0 function0) {
                    final List<ImageModel> list;
                    final int i;
                    int i2;
                    User user;
                    String str;
                    long id;
                    boolean z2;
                    GuestInviteViewModel viewModel;
                    C937550aVN c937550aVN;
                    Animator animatorLIZ;
                    boolean z3;
                    final C934080aPm c934080aPm = this.LIZLLL;
                    if (c934080aPm != null) {
                        View viewLJLLLL = null;
                        if (c00yi != null) {
                            list = c00yi.LIZ;
                            i = c00yi.LIZIZ;
                            i2 = c00yi.LIZJ;
                            user = c00yi.LIZLLL;
                            str = c00yi.LJFF;
                        } else {
                            list = null;
                            i = 0;
                            i2 = 0;
                            user = null;
                            str = null;
                        }
                        LiveIconView liveIconView = (LiveIconView) c934080aPm.LIZ.findViewById(R.id.h35);
                        View viewFindViewById = c934080aPm.LIZ.findViewById(R.id.h38);
                        if (!C930540aK4.LIZLLL() && list != null && !list.isEmpty()) {
                            if (c934080aPm.LIZLLL == null) {
                                ViewStub viewStub = (ViewStub) c934080aPm.LIZ.findViewById(R.id.jap);
                                if (viewStub != null) {
                                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                                }
                                c934080aPm.LIZLLL = viewLJLLLL;
                            }
                            View view = c934080aPm.LIZLLL;
                            if (view != null) {
                                if (user != null) {
                                    id = user.getId();
                                } else {
                                    id = 0;
                                }
                                C931740aM0.LJIIJ(C933710aPB.LJ(c934080aPm.LIZ.getWindow().getPosIdentity()), "show", id, i, "", str);
                                c934080aPm.LJ = view.findViewById(R.id.dwi);
                                if (c934080aPm.LJFF == null) {
                                    c934080aPm.LJFF = (ViewGroup) view.findViewById(R.id.vg_invite);
                                }
                                if (i2 == 1) {
                                    View view2 = c934080aPm.LJ;
                                    if (view2 != null) {
                                        z2 = true;
                                        C786410Ut5.I7(new ACListenerS0S1302000_15(c934080aPm, user, i, 1, str, function0, 0), view2);
                                    } else {
                                        z2 = true;
                                    }
                                    ViewGroup viewGroup = c934080aPm.LJFF;
                                    if (viewGroup != null) {
                                        C786410Ut5.K7(viewGroup, new ACListenerS0S1302000_15(c934080aPm, user, i, z2 ? 1 : 0, str, function0, 1));
                                    }
                                } else {
                                    z2 = true;
                                    z2 = true;
                                    View view3 = c934080aPm.LJ;
                                    if (view3 != null) {
                                        C786410Ut5.I7(new ACListenerS0S1302000_15(c934080aPm, user, i, i2, str, function0, 2), view3);
                                    }
                                    ViewGroup viewGroup2 = c934080aPm.LJFF;
                                    if (viewGroup2 != null) {
                                        C786410Ut5.K7(viewGroup2, new ACListenerS0S1302000_15(c934080aPm, user, i, i2, str, function0, 3));
                                    }
                                }
                                View viewFindViewById2 = view.findViewById(R.id.jcl);
                                if (viewFindViewById2 != null) {
                                    if (i != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    C500260Jjc.LJLJLJ(viewFindViewById2, z3);
                                }
                                TextView textView = (TextView) view.findViewById(R.id.zri);
                                if (textView != null) {
                                    C933710aPB.LIZIZ(textView);
                                }
                                final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.i36);
                                if (frameLayout != null) {
                                    Runnable runnable = new Runnable() { // from class: X.0aPn
                                        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void LIZ() {
                                            /*
                                                r12 = this;
                                                X.0aPm r0 = r1
                                                android.view.ViewGroup r1 = r0.LJFF
                                                if (r1 == 0) goto Lf
                                                X.0aZ4 r0 = r0.LIZ
                                                X.0b0m r0 = r0.getWindow()
                                                X.C933710aPB.LIZ(r1, r0)
                                            Lf:
                                                X.0Ilk r3 = new X.0Ilk
                                                android.widget.FrameLayout r2 = r2
                                                X.0Ill r6 = new X.0Ill
                                                X.0aPm r5 = r1
                                                java.util.List<com.bytedance.android.live.base.model.ImageModel> r1 = r3
                                                int r0 = r4
                                                r5.getClass()
                                                r4 = 1
                                                if (r0 == 0) goto L29
                                                if (r1 == 0) goto L50
                                                int r0 = r1.size()
                                                if (r0 <= r4) goto L50
                                            L29:
                                                r8 = 1094713344(0x41400000, float:12.0)
                                            L2b:
                                                X.0aPm r5 = r1
                                                java.util.List<com.bytedance.android.live.base.model.ImageModel> r1 = r3
                                                int r0 = r4
                                                r5.getClass()
                                                if (r0 != r4) goto L4e
                                                if (r1 == 0) goto L4e
                                                int r0 = r1.size()
                                                if (r0 != r4) goto L4e
                                                r7 = 1
                                            L3f:
                                                r9 = 0
                                                r11 = 6
                                                r10 = r9
                                                r6.<init>(r7, r8, r9, r10, r11)
                                                r3.<init>(r2, r6)
                                                java.util.List<com.bytedance.android.live.base.model.ImageModel> r0 = r3
                                                r3.LIZJ(r0)
                                                return
                                            L4e:
                                                r7 = 0
                                                goto L3f
                                            L50:
                                                X.0aZ4 r0 = r5.LIZ
                                                X.0b0m r0 = r0.getWindow()
                                                int r1 = r0.getWidth()
                                                int r0 = r0.getHeight()
                                                int r0 = java.lang.Math.min(r1, r0)
                                                float r8 = (float) r0
                                                r0 = 1082549862(0x40866666, float:4.2)
                                                float r8 = r8 / r0
                                                r0 = 0
                                                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                                                if (r0 <= 0) goto L29
                                                android.util.DisplayMetrics r0 = X.C497740JfY.LIZIZ
                                                float r0 = r0.density
                                                float r8 = r8 / r0
                                                goto L2b
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC934090aPn.LIZ():void");
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("GuestInviteGuide@c0f6.setGuestInviteGuideUI$1$5");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("GuestInviteGuide@c0f6.setGuestInviteGuideUI$1$5");
                                        }
                                    };
                                    if (frameLayout.getWidth() > 0) {
                                        runnable.run();
                                    } else {
                                        HandlerHook.viewPost(frameLayout, runnable);
                                    }
                                }
                                if (z) {
                                    View view4 = c934080aPm.LJ;
                                    if (view4 != null) {
                                        C786410Ut5.T4(view4, 1.0f);
                                    }
                                    View view5 = c934080aPm.LJ;
                                    if (view5 != null) {
                                        C500260Jjc.LJLJLJ(view5, z2);
                                    }
                                    if (liveIconView != null) {
                                        C500260Jjc.LJLJLJ(liveIconView, false);
                                    }
                                    C500260Jjc.LJLJLJ(viewFindViewById, false);
                                    return;
                                }
                                IGuestInviteAbility iGuestInviteAbility = c934080aPm.LIZJ;
                                if (iGuestInviteAbility == null || (viewModel = iGuestInviteAbility.getViewModel()) == null || (c937550aVN = (C937550aVN) viewModel.LLILZIL.getValue()) == null || (animatorLIZ = c937550aVN.LIZ(c934080aPm.LJ, liveIconView, viewFindViewById)) == null) {
                                    return;
                                }
                                awS594S0100000_15.invoke(animatorLIZ);
                                animatorLIZ.start();
                                return;
                            }
                            return;
                        }
                        View view6 = c934080aPm.LJ;
                        if (view6 != null) {
                            C500260Jjc.LJLJLJ(view6, false);
                        }
                        if (liveIconView != null) {
                            C500260Jjc.LJLJLJ(liveIconView, true);
                        }
                        C500260Jjc.LJLJLJ(viewFindViewById, true);
                        View view7 = c934080aPm.LJ;
                        if (view7 != null) {
                            C786410Ut5.I7(null, view7);
                        }
                        ViewGroup viewGroup3 = c934080aPm.LJFF;
                        if (viewGroup3 == null) {
                            return;
                        }
                        C786410Ut5.K7(viewGroup3, null);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:105:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x01fd  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
                @Override // X.AbstractC934100aPo, X.InterfaceC934210aPz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJ(boolean r19, boolean r20, com.bytedance.android.live.base.model.user.User r21, boolean r22, kotlin.jvm.internal.AwS594S0100000_15 r23, kotlin.jvm.functions.Function0 r24) {
                    /*
                        Method dump skipped, instruction units count: 630
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C934070aPl.LJ(boolean, boolean, com.bytedance.android.live.base.model.user.User, boolean, kotlin.jvm.internal.AwS594S0100000_15, kotlin.jvm.functions.Function0):void");
                }
            };
        }
        this.LIZ = abstractC934100aPo;
    }
}
