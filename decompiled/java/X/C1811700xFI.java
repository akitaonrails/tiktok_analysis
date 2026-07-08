package X;

import Y.ATListenerS459S0100000_27;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811700xFI {
    public final ConstraintLayout LIZ;
    public final Function0<C954460awe> LIZIZ;
    public final Function0<String> LIZJ;
    public final List<InterfaceC1811720xFK> LIZLLL;

    public static String LIZIZ(InterfaceC1811720xFK interfaceC1811720xFK) {
        if (interfaceC1811720xFK instanceof C1811690xFH) {
            return "MatchHeaderSpacing";
        }
        if (interfaceC1811720xFK instanceof C1811710xFJ) {
            return "SmallWindowScoreOverlapDodge";
        }
        if (interfaceC1811720xFK instanceof C1811480xEw) {
            return "ScoreChipPlacement";
        }
        if (interfaceC1811720xFK instanceof C1811490xEx) {
            return "VirtualTicketSpace";
        }
        if (interfaceC1811720xFK instanceof C1811510xEz) {
            return "CommentaryGeometry";
        }
        if (interfaceC1811720xFK instanceof C1811500xEy) {
            return "StreakBadgeAlignment";
        }
        if (interfaceC1811720xFK instanceof C1812290xGF) {
            return "PowerUpStripGeometry";
        }
        return "UnknownLayoutSection";
    }

    public final void LIZ(AbstractC986700bme abstractC986700bme) {
        long j;
        AbstractC1811580xF6 c1811530xF1;
        C954460awe c954460aweInvoke = this.LIZIZ.invoke();
        if (c954460aweInvoke != null) {
            j = c954460aweInvoke.LJ;
        } else {
            j = 0;
        }
        String strInvoke = this.LIZJ.invoke();
        C124600dg c124600dg = new C124600dg(j, strInvoke);
        InterfaceC1811730xFL.LIZ.getClass();
        new InterfaceC1811730xFL() { // from class: X.0bRT
            public static final int LIZLLL() {
                return C915980Zwa.LJII().LJJLI().size();
            }

            public static final int LIZ(String str) {
                Iterator<C954460awe> it2 = C915980Zwa.LJII().LJJLI().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (!Intrinsics.LJFF(it2.next().LJIIJJI, str)) {
                        i++;
                    } else {
                        return i;
                    }
                }
                return -1;
            }

            public static final boolean LIZIZ(long j2) {
                return C915980Zwa.LJII().LLILZ(j2);
            }

            public static final boolean LIZJ(long j2) {
                List<TeamUsersInfo> listLJJJ;
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 == null || (listLJJJ = interfaceC973730bRjYf2.LJJJ()) == null || listLJJJ.isEmpty()) {
                    return false;
                }
                Iterator<TeamUsersInfo> it2 = listLJJJ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().userIds.containsAll(C1697810uHb.LJIIJJI(Long.valueOf(j2), C930540aK4.LJIIZILJ()))) {
                        return true;
                    }
                }
                return false;
            }
        };
        if (Intrinsics.LJFF(abstractC986700bme, C986710bmf.LIZIZ)) {
            c1811530xF1 = new C1811530xF1(new C1811680xFG(C970370bMJ.LJIIJ(), C970370bMJ.LJIIIZ(), C970370bMJ.LJ(), C970370bMJ.LJIIIIZZ()), new C1778110wN7(C973570bRT.LIZIZ(j), C973570bRT.LIZ(strInvoke), C973570bRT.LIZLLL(), C973570bRT.LIZJ(j)));
        } else if (abstractC986700bme instanceof C986690bmd) {
            if (((C986690bmd) abstractC986700bme).LIZIZ == j) {
                c1811530xF1 = C1811660xFE.LIZ;
            } else {
                c1811530xF1 = C1811670xFF.LIZ;
            }
        } else {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyLayoutState: mode=");
        sbLIZ.append(abstractC986700bme);
        sbLIZ.append(", identity=");
        sbLIZ.append(c124600dg);
        sbLIZ.append(", role=");
        sbLIZ.append(c1811530xF1);
        C20441214yg.LIZIZ("CoHostWindowMatchLayoutCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LIZ);
        for (InterfaceC1811720xFK interfaceC1811720xFK : this.LIZLLL) {
            try {
                interfaceC1811720xFK.LIZ(c1811530xF1, c124600dg, c19mb);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LIZIZ(interfaceC1811720xFK));
                sbLIZ2.append(" applyConstraints failed");
                C20441214yg.LJFF("CoHostWindowMatchLayoutCoordinator", C2188811AlT.LIZIZ(sbLIZ2), th);
            }
        }
        try {
            c19mb.LIZIZ(this.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C20441214yg.LJFF("CoHostWindowMatchLayoutCoordinator", "ConstraintSet.applyTo failed; subsequent direct writes still proceed", th2);
        }
        for (InterfaceC1811720xFK interfaceC1811720xFK2 : this.LIZLLL) {
            try {
                interfaceC1811720xFK2.LIZIZ(c1811530xF1, c124600dg);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(LIZIZ(interfaceC1811720xFK2));
                sbLIZ3.append(" applyDirect failed");
                C20441214yg.LJFF("CoHostWindowMatchLayoutCoordinator", C2188811AlT.LIZIZ(sbLIZ3), th3);
            }
        }
    }

    public C1811700xFI(final ConstraintLayout constraintLayout, final View view, View view2, final C1811520xF0 c1811520xF0, final View view3, final View view4, final View view5, final View view6, C1121720fIQ c1121720fIQ, View view7, C973130bQl c973130bQl, final C21578619ce c21578619ce, final LinearLayout linearLayout, AwS561S0100000_17 awS561S0100000_17, AwS571S0100000_27 awS571S0100000_27) {
        this.LIZ = constraintLayout;
        this.LIZIZ = awS561S0100000_17;
        this.LIZJ = awS571S0100000_27;
        this.LIZLLL = C1697810uHb.LJIIJJI(new InterfaceC1811720xFK(view4) { // from class: X.0xFH
            public static final C07TI LIZIZ = new C07TI(0.0f);
            public static final C07TI LIZJ = new C07TI(0.0f);
            public static final C07TI LIZLLL = new C07TI(16.0f);
            public final View LIZ;

            @Override // X.InterfaceC1811720xFK
            public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
            }

            {
                this.LIZ = view4;
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                C07TI c07ti;
                if (abstractC1811580xF6 instanceof AbstractC1811550xF3) {
                    c07ti = LIZIZ;
                } else if (abstractC1811580xF6 instanceof C1811530xF1) {
                    C1811530xF1 c1811530xF1 = (C1811530xF1) abstractC1811580xF6;
                    boolean z = c1811530xF1.LIZ.LIZ;
                    c07ti = LIZLLL;
                    if (!z && (!LiveMatchDropOffSetting.INSTANCE.isEnable() || !c1811530xF1.LIZ.LIZIZ)) {
                        c07ti = LIZJ;
                    }
                } else {
                    throw new C1954807lC();
                }
                View view8 = this.LIZ;
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c07ti.LIZ);
                c1546210qL5.getClass();
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), view8);
            }
        }, new C1811710xFJ(view5, view2), new InterfaceC1811720xFK(view, c1811520xF0) { // from class: X.0xEw
            public static final C1777030wLN LIZJ;
            public static final C1777030wLN LIZLLL;
            public static final C1777030wLN LJ;
            public final View LIZ;
            public final C1811520xF0 LIZIZ;

            static {
                C1777050wLP c1777050wLP = new C1777050wLP(22.0f, 4.0f, 8.0f, 16.0f, 14.0f, R.style.rn, R.style.rn, 12.0f, 72);
                C1777050wLP c1777050wLP2 = new C1777050wLP(18.0f, 2.0f, 4.0f, 14.0f, 11.0f, R.style.rt, R.style.rt, 10.0f, 92);
                C1811620xFA c1811620xFA = C1811620xFA.LIZ;
                LIZJ = new C1777030wLN(12.0f, 8.0f, c1811620xFA, c1777050wLP2);
                LIZLLL = new C1777030wLN(4.0f, 4.0f, c1811620xFA, c1777050wLP2);
                LJ = new C1777030wLN(8.0f, 0.0f, C1811610xF9.LIZ, c1777050wLP);
            }

            public static C1777030wLN LIZJ(AbstractC1811580xF6 abstractC1811580xF6) {
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811660xFE.LIZ)) {
                    return LIZJ;
                }
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811670xFF.LIZ)) {
                    return LIZLLL;
                }
                if (abstractC1811580xF6 instanceof C1811530xF1) {
                    return LJ;
                }
                throw new C1954807lC();
            }

            {
                this.LIZ = view;
                this.LIZIZ = c1811520xF0;
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                C1777050wLP c1777050wLP = LIZJ(abstractC1811580xF6).LIZLLL;
                View view8 = this.LIZIZ.LIZ;
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1777050wLP.LIZ);
                c1546210qL5.getClass();
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), view8);
                this.LIZIZ.LIZIZ.setPadding(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LIZIZ))), this.LIZIZ.LIZIZ.getPaddingTop(), C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LIZJ))), this.LIZIZ.LIZIZ.getPaddingBottom());
                C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LIZLLL))), this.LIZIZ.LIZJ);
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LIZLLL))), this.LIZIZ.LIZJ);
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LJ))), this.LIZIZ.LIZLLL);
                C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LJFF))), this.LIZIZ.LJ);
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777050wLP.LJFF))), this.LIZIZ.LJ);
                this.LIZIZ.LJFF.setTextAppearance(c1777050wLP.LJI);
                TextView textView = this.LIZIZ.LJFF;
                textView.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, textView.getContext()));
                this.LIZIZ.LJI.setTextAppearance(c1777050wLP.LJII);
                TextView textView2 = this.LIZIZ.LJI;
                textView2.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, textView2.getContext()));
                this.LIZIZ.LJII.setTextSize(2, c1777050wLP.LJIIIIZZ);
                this.LIZIZ.LJIIIZ.setTuxFont(c1777050wLP.LJIIIZ);
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
                C1777030wLN c1777030wLNLIZJ = LIZJ(abstractC1811580xF6);
                Iterator it2 = Collections.singletonList(Integer.valueOf(this.LIZ.getId())).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                    Float fValueOf = Float.valueOf(c1777030wLNLIZJ.LIZ);
                    c1546210qL5.getClass();
                    c19mb.LJJIIJZLJL(iIntValue, 1, C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                    c19mb.LJJIIJZLJL(iIntValue, 2, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777030wLNLIZJ.LIZ))));
                    c19mb.LJI(iIntValue, 4);
                    c19mb.LJI(iIntValue, 3);
                    AbstractC1811570xF5 abstractC1811570xF5 = c1777030wLNLIZJ.LIZJ;
                    if (Intrinsics.LJFF(abstractC1811570xF5, C1811620xFA.LIZ)) {
                        c19mb.LJIIIZ(iIntValue, 3, R.id.win_streak_badge_barrier, 4, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777030wLNLIZJ.LIZIZ))));
                    } else if (Intrinsics.LJFF(abstractC1811570xF5, C1811610xF9.LIZ)) {
                        c19mb.LJIIIZ(iIntValue, 4, 0, 4, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(8.0f))));
                    } else {
                        throw new C1954807lC();
                    }
                }
            }
        }, new InterfaceC1811720xFK(view6, view, constraintLayout) { // from class: X.0xEx
            public static final C1777060wLQ LIZLLL;
            public static final C1777060wLQ LJ;
            public static final C1777060wLQ LJFF;
            public static final C1777060wLQ LJI;
            public final ViewGroup LIZ;
            public final View LIZIZ;
            public final View LIZJ;

            static {
                C1777070wLR c1777070wLR = new C1777070wLR(26.0f, 8.0f, 24.0f, 8.0f, 14.0f);
                C1777070wLR c1777070wLR2 = new C1777070wLR(18.0f, 4.0f, 18.0f, 4.0f, 11.0f);
                C1811650xFD c1811650xFD = C1811650xFD.LIZ;
                LIZLLL = new C1777060wLQ(8.0f, c1811650xFD, c1777070wLR);
                LJ = new C1777060wLQ(4.0f, c1811650xFD, c1777070wLR2);
                LJFF = new C1777060wLQ(8.0f, C1811640xFC.LIZ, c1777070wLR);
                LJI = new C1777060wLQ(8.0f, C1811630xFB.LIZ, c1777070wLR);
            }

            public static C1777060wLQ LIZJ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811660xFE.LIZ)) {
                    return LIZLLL;
                }
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811670xFF.LIZ)) {
                    return LJ;
                }
                if (abstractC1811580xF6 instanceof C1811530xF1) {
                    long j = c124600dg.LIZ;
                    Long lLJII = C930540aK4.LJII();
                    if (lLJII != null && j == lLJII.longValue()) {
                        return LJFF;
                    }
                    C1811530xF1 c1811530xF1 = (C1811530xF1) abstractC1811580xF6;
                    if (c1811530xF1.LIZ.LIZLLL && c1811530xF1.LIZIZ.LIZLLL) {
                        return LJI;
                    }
                    return LJFF;
                }
                throw new C1954807lC();
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2;
                View viewFindViewById = this.LIZ.findViewById(R.id.virtual_ticket_match_tray_view);
                if (viewFindViewById == null) {
                    return;
                }
                C1777070wLR c1777070wLR = LIZJ(abstractC1811580xF6, c124600dg).LIZJ;
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1777070wLR.LIZ);
                c1546210qL5.getClass();
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), viewFindViewById);
                View viewFindViewById2 = viewFindViewById.findViewById(R.id.qjp);
                if (viewFindViewById2 != null) {
                    C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777070wLR.LIZJ))), viewFindViewById2);
                    C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777070wLR.LIZJ))), viewFindViewById2);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777070wLR.LIZIZ))));
                        C786410Ut5.W5(viewFindViewById2, marginLayoutParams2);
                    }
                }
                TextView textView = (TextView) viewFindViewById.findViewById(R.id.qjq);
                if (textView != null) {
                    textView.setTextSize(2, c1777070wLR.LJ);
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777070wLR.LIZLLL))));
                        C786410Ut5.g6(textView, marginLayoutParams);
                    }
                }
            }

            {
                this.LIZ = constraintLayout;
                this.LIZIZ = view6;
                this.LIZJ = view;
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
                C1777060wLQ c1777060wLQLIZJ = LIZJ(abstractC1811580xF6, c124600dg);
                int id = this.LIZIZ.getId();
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1777060wLQLIZJ.LIZ);
                c1546210qL5.getClass();
                c19mb.LJJIIJZLJL(id, 1, C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                c19mb.LJI(this.LIZIZ.getId(), 4);
                c19mb.LJI(this.LIZIZ.getId(), 3);
                AbstractC1811540xF2 abstractC1811540xF2 = c1777060wLQLIZJ.LIZIZ;
                if (Intrinsics.LJFF(abstractC1811540xF2, C1811640xFC.LIZ)) {
                    c19mb.LJIIIZ(this.LIZIZ.getId(), 3, R.id.win_streak_badge_barrier, 4, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777060wLQLIZJ.LIZ))));
                } else if (Intrinsics.LJFF(abstractC1811540xF2, C1811650xFD.LIZ)) {
                    c19mb.LJIIIZ(this.LIZIZ.getId(), 3, this.LIZJ.getId(), 4, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777060wLQLIZJ.LIZ))));
                } else {
                    if (Intrinsics.LJFF(abstractC1811540xF2, C1811630xFB.LIZ)) {
                        c19mb.LJIIIZ(this.LIZIZ.getId(), 4, this.LIZJ.getId(), 3, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777060wLQLIZJ.LIZ))));
                        return;
                    }
                    throw new C1954807lC();
                }
            }
        }, new InterfaceC1811720xFK(view3, view5, view6) { // from class: X.0xEz
            public static final C1777010wLL LIZLLL;
            public static final C1777010wLL LJ;
            public static final C1777010wLL LJFF;
            public final View LIZ;
            public final View LIZIZ;
            public final View LIZJ;

            static {
                C1811600xF8 c1811600xF8 = C1811600xF8.LIZ;
                LIZLLL = new C1777010wLL(24.0f, 0.0f, 8.0f, 12.0f, c1811600xF8);
                LJ = new C1777010wLL(18.0f, 1.0f, 4.0f, 8.0f, C1811590xF7.LIZ);
                LJFF = new C1777010wLL(24.0f, 0.0f, 8.0f, 8.0f, c1811600xF8);
            }

            public static C1777010wLL LIZJ(AbstractC1811580xF6 abstractC1811580xF6) {
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811660xFE.LIZ)) {
                    return LIZLLL;
                }
                if (Intrinsics.LJFF(abstractC1811580xF6, C1811670xFF.LIZ)) {
                    return LJ;
                }
                if (abstractC1811580xF6 instanceof C1811530xF1) {
                    return LJFF;
                }
                throw new C1954807lC();
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                C1777010wLL c1777010wLLLIZJ = LIZJ(abstractC1811580xF6);
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1777010wLLLIZJ.LIZ);
                c1546210qL5.getClass();
                int iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf));
                C500260Jjc.LJJZ(iLIZIZ, this.LIZ);
                C500260Jjc.LJLJLLL(iLIZIZ, this.LIZ);
            }

            {
                this.LIZ = view3;
                this.LIZIZ = view5;
                this.LIZJ = view6;
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
                C1777010wLL c1777010wLLLIZJ = LIZJ(abstractC1811580xF6);
                c19mb.LJJII(c1777010wLLLIZJ.LIZIZ, this.LIZ.getId());
                int id = this.LIZ.getId();
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1777010wLLLIZJ.LIZJ);
                c1546210qL5.getClass();
                c19mb.LJJIIJZLJL(id, 3, C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                c19mb.LJJIIJZLJL(this.LIZ.getId(), 1, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1777010wLLLIZJ.LIZLLL))));
                AbstractC1811560xF4 abstractC1811560xF4 = c1777010wLLLIZJ.LJ;
                if (Intrinsics.LJFF(abstractC1811560xF4, C1811600xF8.LIZ)) {
                    c19mb.LJIIIIZZ(this.LIZ.getId(), 3, this.LIZJ.getId(), 4);
                } else {
                    if (Intrinsics.LJFF(abstractC1811560xF4, C1811590xF7.LIZ)) {
                        c19mb.LJIIIIZZ(this.LIZ.getId(), 3, this.LIZIZ.getId(), 4);
                        return;
                    }
                    throw new C1954807lC();
                }
            }
        }, new C1811500xEy(c1121720fIQ, view7, c973130bQl), new InterfaceC1811720xFK(c21578619ce, linearLayout, view6, view5) { // from class: X.0xGF
            public final View LIZ;
            public final LinearLayout LIZIZ;
            public final View LIZJ;
            public final View LIZLLL;

            @Override // X.InterfaceC1811720xFK
            public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
                boolean z;
                final C1812300xGG c1812300xGGLIZJ = LIZJ(abstractC1811580xF6, c124600dg);
                LinearLayout linearLayout2 = this.LIZIZ;
                linearLayout2.setOrientation(1);
                linearLayout2.setShowDividers(2);
                linearLayout2.setDividerDrawable(new ColorDrawable() { // from class: X.0xGH
                    @Override // android.graphics.drawable.Drawable
                    public final int getIntrinsicHeight() {
                        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                        Float fValueOf = Float.valueOf(c1812300xGGLIZJ.LJ);
                        c1546210qL5.getClass();
                        return C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf));
                    }
                });
                View view8 = this.LIZ;
                EnumC992870bwb enumC992870bwb = c1812300xGGLIZJ.LJFF;
                if (enumC992870bwb == EnumC992870bwb.ONE_ITEM_NO_SCROLL) {
                    z = true;
                } else {
                    z = false;
                }
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf((enumC992870bwb.getValue() * 24.0f) + ((c1812300xGGLIZJ.LJFF.getValue() - 1) * c1812300xGGLIZJ.LJ));
                c1546210qL5.getClass();
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), view8);
                view8.setVerticalFadingEdgeEnabled(!z);
                ATListenerS459S0100000_27 aTListenerS459S0100000_27 = null;
                if (z) {
                    aTListenerS459S0100000_27 = new ATListenerS459S0100000_27(AFwS314S0000000_27.get$arr$(20), 14);
                }
                view8.setOnTouchListener(aTListenerS459S0100000_27);
                C786410Ut5.Ob(view8, c1812300xGGLIZJ.LJI);
                C786410Ut5.pc(view8, c1812300xGGLIZJ.LJI);
                view8.setPivotX(c1812300xGGLIZJ.LIZLLL * C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(24.0f))));
                view8.setPivotY(0.0f);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
            /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1812300xGG LIZJ(X.AbstractC1811580xF6 r19, X.C124600dg r20) {
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1812290xGF.LIZJ(X.0xF6, X.00dg):X.0xGG");
            }

            @Override // X.InterfaceC1811720xFK
            public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
                C1812300xGG c1812300xGGLIZJ = LIZJ(abstractC1811580xF6, c124600dg);
                int id = this.LIZ.getId();
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Float fValueOf = Float.valueOf(c1812300xGGLIZJ.LIZJ);
                c1546210qL5.getClass();
                c19mb.LJJIIJZLJL(id, 1, C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
                c19mb.LJJIIJZLJL(this.LIZ.getId(), 2, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1812300xGGLIZJ.LIZJ))));
                c19mb.LJIIIZ(this.LIZ.getId(), 3, c1812300xGGLIZJ.LIZ, 4, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1812300xGGLIZJ.LIZIZ))));
                c19mb.LJJII(c1812300xGGLIZJ.LIZLLL, this.LIZ.getId());
            }

            {
                this.LIZ = c21578619ce;
                this.LIZIZ = linearLayout;
                this.LIZJ = view6;
                this.LIZLLL = view5;
            }
        });
    }
}
