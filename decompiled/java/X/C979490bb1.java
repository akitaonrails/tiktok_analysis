package X;

import Y.ARunnableS84S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979490bb1 extends RecyclerView.ViewHolder {
    public final C973100bQi LL;
    public final ConstraintLayout LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16FS LLILZ;
    public final /* synthetic */ C979480bb0 LLILZIL;

    public final void I5() {
        C977620bY0 c977620bY0;
        View viewFindViewById;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C977620bY0 c977620bY02;
        C979480bb0 c979480bb0 = this.LLILZIL;
        boolean z = false;
        if (c979480bb0.LJIILJJIL) {
            c979480bb0.LJIILLIIL.LIZJ(c979480bb0.LJIIIIZZ);
            C16FS c16fs = this.LLILZ;
            if (c16fs != null) {
                HandlerHook.viewPostDelay(c16fs, new ARunnableS84S0200000_15(this.LLILZIL, this, 70), 600L);
            }
            this.LLILZIL.LJIILJJIL = false;
        }
        R5();
        S5();
        C979520bb4 c979520bb4 = this.LLILZIL.LJIILIIL;
        boolean z2 = c979520bb4 != null && c979520bb4.LJFF;
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131853727));
        }
        C16F5 c16f52 = this.LLILLL;
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, z2 ? 0 : 8);
        }
        LiveMatchTeamPairSetting liveMatchTeamPairSetting = LiveMatchTeamPairSetting.INSTANCE;
        if (!liveMatchTeamPairSetting.isEnable() && !LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) {
            C973100bQi c973100bQi = this.LL;
            if (c973100bQi != null) {
                c973100bQi.setBackgroundResource(0);
            }
            C973100bQi c973100bQi2 = this.LL;
            if (c973100bQi2 != null) {
                c973100bQi2.p0();
            }
            ConstraintLayout constraintLayout = this.LLILLJJLI;
            if (constraintLayout != null) {
                C500260Jjc.LLFFF(constraintLayout);
            }
            C979480bb0 c979480bb02 = this.LLILZIL;
            if (c979480bb02.LJII || (c977620bY02 = c979480bb02.LJFF) == null) {
                return;
            }
            c977620bY02.LJIJJ = false;
            return;
        }
        C16FS c16fs2 = this.LLILZ;
        int id = c16fs2 != null ? c16fs2.getId() : 0;
        C16F5 c16f53 = this.LLILLL;
        int id2 = c16f53 != null ? c16f53.getId() : 0;
        C973100bQi c973100bQi3 = this.LL;
        int id3 = c973100bQi3 != null ? c973100bQi3.getId() : 0;
        C16FS c16fs3 = this.LLILZ;
        ViewGroup.LayoutParams layoutParams = null;
        ViewParent parent = c16fs3 != null ? c16fs3.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILLL, viewGroup2);
        }
        C16FS c16fs4 = this.LLILZ;
        ViewParent parent2 = c16fs4 != null ? c16fs4.getParent() : null;
        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
        }
        C973100bQi c973100bQi4 = this.LL;
        if (c973100bQi4 != null) {
            c973100bQi4.addView(this.LLILZ);
        }
        C973100bQi c973100bQi5 = this.LL;
        if (c973100bQi5 != null) {
            c973100bQi5.addView(this.LLILLL);
        }
        C973100bQi c973100bQi6 = this.LL;
        if (c973100bQi6 != null) {
            ViewGroup.LayoutParams layoutParams2 = c973100bQi6.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                layoutParams = layoutParams2;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c973100bQi6);
            c973100bQi6.setLayoutParams(layoutParams);
        }
        C973100bQi c973100bQi7 = this.LL;
        if (c973100bQi7 != null && (viewFindViewById = c973100bQi7.findViewById(R.id.mcj)) != null) {
            C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110)), viewFindViewById);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LL);
        c19mb.LJIIIIZZ(id2, 3, R.id.mcj, 4);
        c19mb.LJIIIIZZ(id2, 4, id, 3);
        c19mb.LJIIIIZZ(id, 3, id2, 4);
        c19mb.LJIIIIZZ(id, 6, id3, 6);
        c19mb.LJIIIIZZ(id, 7, id3, 7);
        c19mb.LJIIIIZZ(id, 4, id3, 4);
        c19mb.LJJIIJZLJL(id, 3, 0);
        c19mb.LJJIIJZLJL(id, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c19mb.LIZIZ(this.LL);
        C973100bQi c973100bQi8 = this.LL;
        if (c973100bQi8 != null) {
            c973100bQi8.requestLayout();
        }
        C973100bQi c973100bQi9 = this.LL;
        if (c973100bQi9 != null) {
            c973100bQi9.setBackgroundResource(R.drawable.dzg);
        }
        C973100bQi c973100bQi10 = this.LL;
        if (c973100bQi10 != null) {
            c973100bQi10.i0();
        }
        ConstraintLayout constraintLayout2 = this.LLILLJJLI;
        if (constraintLayout2 != null) {
            C500260Jjc.LJIILIIL(constraintLayout2);
        }
        C979480bb0 c979480bb03 = this.LLILZIL;
        if (c979480bb03.LJII || (c977620bY0 = c979480bb03.LJFF) == null) {
            return;
        }
        EnumC975850bV9 enumC975850bV9 = c979480bb03.LIZJ.LJFF;
        if (liveMatchTeamPairSetting.isEnable() && enumC975850bV9 != EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            z = true;
        }
        c977620bY0.LJIJJ = z;
    }

    public final void N5() {
        if (LiveMatchTeamPairSetting.INSTANCE.isEnable() || LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) {
            return;
        }
        Text textLJI = C978520bZS.LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("giftEventDesc = ");
        sbLIZ.append(textLJI);
        C20441214yg.LIZIZ("TwoMatchInviterViewBinder", C2188811AlT.LIZIZ(sbLIZ));
        C979480bb0 c979480bb0 = this.LLILZIL;
        C978750bZp c978750bZp = c979480bb0.LJIILLIIL;
        boolean z = c979480bb0.LJIIIIZZ;
        if (textLJI == null) {
            textLJI = new Text();
            textLJI.defaultPattern = "";
        }
        c978750bZp.LJFF(z, textLJI, false);
    }

    public final void P5() {
        C16FS c16fs = this.LLILZ;
        if (c16fs != null) {
            c16fs.j0(R.style.a85);
        }
        C16FS c16fs2 = this.LLILZ;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJI(2131841253));
        }
        C16FS c16fs3 = this.LLILZ;
        if (c16fs3 != null) {
            c16fs3.setEnabled(true);
        }
        N5();
        C16FS c16fs4 = this.LLILZ;
        if (c16fs4 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs4, new AwS594S0100000_15(this.LLILZIL, 982));
        }
    }

    public final void R5() {
        Integer numValueOf;
        C979520bb4 c979520bb4 = this.LLILZIL.LJIILIIL;
        Integer numValueOf2 = c979520bb4 != null ? Integer.valueOf(c979520bb4.LIZ) : null;
        if (numValueOf2 != null) {
            if (numValueOf2.intValue() == 0) {
                C16FS c16fs = this.LLILZ;
                if (c16fs != null) {
                    c16fs.j0(R.style.a7g);
                    c16fs.setText(C497740JfY.LJIJI(2131853336));
                    c16fs.setEnabled(false);
                    c16fs.setAllowClickWhenDisabledCompat(true);
                    C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0bb3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && C915980Zwa.LIZIZ().JV1(false).isInProcess()) {
                                C766270U4b.LIZLLL(2131851724);
                            } else if (C915980Zwa.LIZIZ().Dn0().isCatchBean() && C915980Zwa.LIZIZ().JV1(false).isInProcess()) {
                                C766270U4b.LIZLLL(2131851723);
                            } else {
                                C766270U4b.LIZLLL(2131851724);
                                C20441214yg.LJ("TwoMatchInviterViewBinder", "showUnavailableBtn: default state");
                            }
                        }
                    });
                    N5();
                }
            } else if (numValueOf2.intValue() == 1) {
                P5();
            } else if (numValueOf2.intValue() == 2 && C915980Zwa.LJFF().RY(this.LLILZIL.LJIIIIZZ).compareTo(EnumC964170bCJ.INVITED) < 0) {
                C16FS c16fs2 = this.LLILZ;
                if (c16fs2 != null) {
                    c16fs2.LJIIL();
                }
                C973100bQi c973100bQi = this.LL;
                if (c973100bQi != null) {
                    int visibility = c973100bQi.getVisibility();
                    c973100bQi.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c973100bQi);
                }
                C16FS c16fs3 = this.LLILZ;
                if (c16fs3 != null) {
                    c16fs3.setText(C497740JfY.LJIJI(2131843042));
                }
                C16FS c16fs4 = this.LLILZ;
                if (c16fs4 != null) {
                    c16fs4.j0(R.style.a7h);
                }
                C16FS c16fs5 = this.LLILZ;
                if (c16fs5 != null) {
                    c16fs5.setEnabled(true);
                }
                C16FS c16fs6 = this.LLILZ;
                if (c16fs6 != null) {
                    C500260Jjc.LJLIIIL(500L, c16fs6, new AwS381S0200000_15(this, this.LLILZIL, 143));
                }
                N5();
            }
        }
        C979520bb4 c979520bb42 = this.LLILZIL.LJIILIIL;
        if (c979520bb42 == null || (numValueOf = Integer.valueOf(c979520bb42.LIZIZ)) == null) {
            return;
        }
        if (numValueOf.intValue() == 3) {
            L5(true);
            return;
        }
        if (numValueOf.intValue() == 4) {
            L5(false);
        } else if (numValueOf.intValue() == 5) {
            C16FS c16fs7 = this.LLILZ;
            if (c16fs7 != null) {
                c16fs7.LJIIL();
            }
            P5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5() {
        /*
            r8 = this;
            X.0bb0 r2 = r8.LLILZIL
            boolean r0 = r2.LJII
            r1 = 0
            if (r0 == 0) goto Lb0
            X.0bY1 r0 = r2.LJI
            if (r0 == 0) goto Lc0
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ
            if (r0 == 0) goto Lc0
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
        L15:
            X.0bb0 r2 = r8.LLILZIL
            boolean r0 = r2.LJII
            if (r0 == 0) goto L9d
            X.0bY1 r0 = r2.LJI
            if (r0 == 0) goto Lad
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo>> r0 = r0.LJIIJJI
            if (r0 == 0) goto Lad
            java.lang.Object r4 = r0.getValue()
            java.util.Map r4 = (java.util.Map) r4
        L29:
            X.0bb0 r2 = r8.LLILZIL
            boolean r0 = r2.LJII
            if (r0 == 0) goto L8c
            X.0bY1 r0 = r2.LJI
            if (r0 == 0) goto L9b
            androidx.lifecycle.MutableLiveData r0 = r0.LJIIIIZZ
            if (r0 == 0) goto L9b
            java.lang.Object r3 = r0.getValue()
            java.util.Map r3 = (java.util.Map) r3
        L3d:
            X.0bb0 r2 = r8.LLILZIL
            boolean r0 = r2.LJII
            if (r0 == 0) goto L7d
            X.0bY1 r0 = r2.LJI
            if (r0 == 0) goto L51
            androidx.lifecycle.MutableLiveData r0 = r0.LJIILLIIL
            if (r0 == 0) goto L51
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L51:
            X.0bQi r0 = r8.LL
            if (r0 == 0) goto L58
            r0.h0()
        L58:
            if (r5 == 0) goto L78
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L78
            X.0bQi r2 = r8.LL
            if (r2 == 0) goto L78
            if (r1 == 0) goto L7b
            boolean r6 = r1.booleanValue()
        L6a:
            X.0bb0 r0 = r8.LLILZIL
            X.0bb2 r0 = r0.LIZJ
            X.0bV9 r1 = r0.LJFF
            X.0bV9 r0 = X.EnumC975850bV9.INVITER_FROM_FRIEND_RANK
            if (r1 != r0) goto L79
            r7 = 1
        L75:
            r2.l0(r3, r4, r5, r6, r7)
        L78:
            return
        L79:
            r7 = 0
            goto L75
        L7b:
            r6 = 0
            goto L6a
        L7d:
            X.0bY0 r0 = r2.LJFF
            if (r0 == 0) goto L51
            androidx.lifecycle.MutableLiveData r0 = r0.LJIILJJIL
            if (r0 == 0) goto L51
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L51
        L8c:
            X.0bY0 r0 = r2.LJFF
            if (r0 == 0) goto L9b
            androidx.lifecycle.MutableLiveData r0 = r0.LJIIIIZZ
            if (r0 == 0) goto L9b
            java.lang.Object r3 = r0.getValue()
            java.util.Map r3 = (java.util.Map) r3
            goto L3d
        L9b:
            r3 = r1
            goto L3d
        L9d:
            X.0bY0 r0 = r2.LJFF
            if (r0 == 0) goto Lad
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo>> r0 = r0.LJIIJJI
            if (r0 == 0) goto Lad
            java.lang.Object r4 = r0.getValue()
            java.util.Map r4 = (java.util.Map) r4
            goto L29
        Lad:
            r4 = r1
            goto L29
        Lb0:
            X.0bY0 r0 = r2.LJFF
            if (r0 == 0) goto Lc0
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ
            if (r0 == 0) goto Lc0
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
            goto L15
        Lc0:
            r5 = r1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979490bb1.S5():void");
    }

    public final void L5(boolean z) {
        if (z) {
            C16FS c16fs = this.LLILZ;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLILZ;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLILZ;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = this.LLILZ;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C979490bb1(C979480bb0 c979480bb0, View view) {
        super(view);
        this.LLILZIL = c979480bb0;
        this.LL = (C973100bQi) view.findViewById(R.id.o29);
        this.LLILLJJLI = (ConstraintLayout) view.findViewById(R.id.iyt);
        this.LLILLL = (C16F5) view.findViewById(R.id.o27);
        this.LLILZ = (C16FS) view.findViewById(R.id.cra);
        c979480bb0.LJIILLIIL.LIZ(view, c979480bb0.LJIIIZ, new AwS559S0100000_15(c979480bb0, 1014));
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.o31));
    }
}
