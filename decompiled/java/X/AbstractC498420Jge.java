package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.LabelConfig;
import com.bytedance.android.live.base.model.user.NumberConfig;
import com.bytedance.android.live.base.model.user.ProfileCardPanel;
import com.bytedance.android.live.base.model.user.ProfileContent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardCreatorLeagueBadgeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC498420Jge extends AbstractC495800JcQ<Unit> {
    public C498400Jgc LLILZIL;
    public List<BadgeStruct> LLILZLL;
    public AnimatorSet LLIZ;
    public RunnableC498430Jgf LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public ImageView LLJJJIL;
    public C16F5 LLJJJJ;

    public abstract int LJJIIJZLJL();

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.layout.gxj : R.layout.gxi;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        ConstraintLayout constraintLayout;
        View view = this.LLILLL;
        if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
            constraintLayout.setMinWidth(LJJIIJ());
        }
        View view2 = this.LLILLL;
        this.LLJJJIL = view2 != null ? (ImageView) view2.findViewById(R.id.llk) : null;
        View view3 = this.LLILLL;
        this.LLJJJJ = view3 != null ? (C16F5) view3.findViewById(R.id.zqz) : null;
    }

    public final C421350Gfd LJIJJLI() {
        return (C421350Gfd) this.LLJIJIL.getValue();
    }

    public final C1295960jpS LJIL() {
        return (C1295960jpS) this.LLJILJIL.getValue();
    }

    public final ConstraintLayout LJJ() {
        return (ConstraintLayout) this.LLJILJILJ.getValue();
    }

    public final ImageView LJJI() {
        return (ImageView) this.LLJJIJIIJIL.getValue();
    }

    public final C421360Gfe LJJIFFI() {
        return (C421360Gfe) this.LLJJIJI.getValue();
    }

    public final C421360Gfe LJJII() {
        return (C421360Gfe) this.LLJILLL.getValue();
    }

    public final LinearLayout LJJIII() {
        return (LinearLayout) this.LLJJIJIL.getValue();
    }

    public final int LJJIIJ() {
        List<BadgeStruct> list;
        int iLJIIZILJ = (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx() && this.LL.LJ) ? C497740JfY.LJIIZILJ() : C497740JfY.LJIIIZ(R.dimen.arw);
        int i = 48;
        if (LiveProfileCardCreatorLeagueBadgeSetting.INSTANCE.enable() && (list = this.LLILZLL) != null && list.size() > 3) {
            i = 56;
        }
        return (iLJIIZILJ - ((int) C497740JfY.LIZIZ(i))) / 3;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        ArrayList<Animator> childAnimations;
        C500260Jjc.LJIILIIL(this.LLILLL);
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null && (childAnimations = animatorSet.getChildAnimations()) != null) {
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
        }
        AnimatorSet animatorSet2 = this.LLIZ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLIZ = null;
        RunnableC498430Jgf runnableC498430Jgf = this.LLIZLLLIL;
        if (runnableC498430Jgf != null && (view = this.LLILLL) != null) {
            HandlerHook.viewRemoveCallbacks(view, runnableC498430Jgf);
        }
        this.LLIZLLLIL = null;
        LJJIJIIJIL();
        LJJIJIIJI();
        ConstraintLayout constraintLayoutLJJ = LJJ();
        ViewGroup.LayoutParams layoutParams = constraintLayoutLJJ != null ? constraintLayoutLJJ.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
        ConstraintLayout constraintLayoutLJJ2 = LJJ();
        if (constraintLayoutLJJ2 != null) {
            C786410Ut5.m6(constraintLayoutLJJ2, marginLayoutParams);
        }
    }

    public final void LJJIJ() {
        C421360Gfe c421360GfeLJJIFFI = LJJIFFI();
        if (c421360GfeLJJIFFI != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421360GfeLJJIFFI);
            c421360GfeLJJIFFI.setTranslationY(0.0f);
        }
        ImageView imageViewLJJI = LJJI();
        if (imageViewLJJI != null) {
            C786410Ut5.gd(imageViewLJJI, 0.0f);
        }
        C421360Gfe c421360GfeLJJIFFI2 = LJJIFFI();
        if (c421360GfeLJJIFFI2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421360GfeLJJIFFI2);
            c421360GfeLJJIFFI2.setAlpha(1.0f);
        }
        ImageView imageViewLJJI2 = LJJI();
        if (imageViewLJJI2 != null) {
            C786410Ut5.V4(imageViewLJJI2, 1.0f);
        }
        C500260Jjc.LJIILIIL(LJJI());
    }

    public final void LJJIJIIJI() {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout constraintLayoutLJJ = LJJ();
        if (constraintLayoutLJJ != null) {
            ConstraintLayout constraintLayoutLJJ2 = LJJ();
            if (constraintLayoutLJJ2 == null || (layoutParams = constraintLayoutLJJ2.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.width = -2;
            }
            C786410Ut5.m6(constraintLayoutLJJ, layoutParams);
        }
        ConstraintLayout constraintLayoutLJJ3 = LJJ();
        if (constraintLayoutLJJ3 != null) {
            constraintLayoutLJJ3.setMinimumWidth(0);
        }
        ConstraintLayout constraintLayoutLJJ4 = LJJ();
        if (constraintLayoutLJJ4 != null) {
            constraintLayoutLJJ4.requestLayout();
        }
    }

    public final void LJJIJIIJIL() {
        C1295960jpS c1295960jpSLJIL = LJIL();
        if (c1295960jpSLJIL != null) {
            c1295960jpSLJIL.cancelAnimation();
        }
        C1295960jpS c1295960jpSLJIL2 = LJIL();
        if (c1295960jpSLJIL2 != null) {
            c1295960jpSLJIL2.setProgress(0.0f);
        }
        C1295960jpS c1295960jpSLJIL3 = LJIL();
        if (c1295960jpSLJIL3 != null) {
            C500260Jjc.LJIILIIL(c1295960jpSLJIL3);
        }
        C421350Gfd c421350GfdLJIJJLI = LJIJJLI();
        if (c421350GfdLJIJJLI != null) {
            C500260Jjc.LLFFF(c421350GfdLJIJJLI);
        }
        C421360Gfe c421360GfeLJJII = LJJII();
        if (c421360GfeLJJII != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421360GfeLJJII);
            c421360GfeLJJII.setAlpha(1.0f);
        }
        LinearLayout linearLayoutLJJIII = LJJIII();
        if (linearLayoutLJJIII != null) {
            C786410Ut5.W4(linearLayoutLJJIII, 1.0f);
        }
    }

    public final void LJJIJIL() {
        LJJIJ();
        LJJIJIIJI();
        C500260Jjc.LLFFF(LJJII());
        C500260Jjc.LJIILIIL((View) this.LLJJ.getValue());
        C500260Jjc.LJIILIIL((View) this.LLJJI.getValue());
        C500260Jjc.LJIILIIL((View) this.LLJJIII.getValue());
    }

    public AbstractC498420Jge(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 677));
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 680));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 678));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 679));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 681));
        this.LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 687));
        this.LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 686));
        this.LLJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 683));
        this.LLJJIII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 682));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 685));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 684));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 688));
        this.LLJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 689));
    }

    public static final int LJJIIZI(String str) {
        int color = 0;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    color = Color.parseColor(str);
                    return color;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return color;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r7 <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r7) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.LJJ()
            if (r5 != 0) goto L7
            return
        L7:
            r4 = 0
            if (r7 <= 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.LJJ()
            if (r3 == 0) goto L4b
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r0 = 0
            if (r1 == 0) goto L49
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L1b:
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L47
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L47
            int r1 = r1.getWidth()
        L2b:
            if (r2 == 0) goto L45
            int r0 = r2.getMarginStart()
        L31:
            int r1 = r1 - r0
            if (r2 == 0) goto L38
            int r4 = r2.getMarginEnd()
        L38:
            int r1 = r1 - r4
            if (r1 <= 0) goto L4b
            int r7 = java.lang.Math.min(r7, r1)
            if (r7 > 0) goto L4b
        L41:
            r6.LJJIJIIJI()
            return
        L45:
            r0 = 0
            goto L31
        L47:
            r1 = 0
            goto L2b
        L49:
            r2 = r0
            goto L1b
        L4b:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.width = r7
            X.C786410Ut5.m6(r5, r0)
            r5.setMinimumWidth(r7)
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC498420Jge.LJIIZILJ(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08c7  */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.0Jgf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(com.bytedance.android.live.base.model.user.BadgeStruct r28) {
        /*
            Method dump skipped, instruction units count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC498420Jge.LJIJ(com.bytedance.android.live.base.model.user.BadgeStruct):void");
    }

    public final int LJIJI(String str) {
        if (LJJII() == null || str.length() == 0) {
            return 0;
        }
        return (int) Math.ceil(r2.getPaint().measureText(str));
    }

    public final boolean LJJIIZ(User user) {
        ConstraintLayout constraintLayout;
        if (LJIIIIZZ(user)) {
            return false;
        }
        Object obj = null;
        if (LiveProfileCardCreatorLeagueBadgeSetting.INSTANCE.enable()) {
            View view = this.LLILLL;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                constraintLayout.setMinWidth(LJJIIJ());
            }
        }
        this.LLILZIL = new C498400Jgc((C495920Jcc) this.LL, user);
        List<BadgeStruct> badgeList = user.getBadgeList();
        this.LLILZLL = badgeList;
        if (badgeList == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (BadgeStruct badgeStruct : badgeList) {
            if (badgeStruct.exhibitionType == 0) {
                arrayList.add(badgeStruct);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((BadgeStruct) next).badgeScene == LJJIIJZLJL()) {
                obj = next;
                break;
            }
        }
        BadgeStruct badgeStruct2 = (BadgeStruct) obj;
        if (badgeStruct2 == null) {
            return false;
        }
        LJIJ(badgeStruct2);
        C500260Jjc.LLFFF(this.LLILLL);
        return true;
    }

    @Override // X.AbstractC495790JcP
    public final /* bridge */ /* synthetic */ boolean LJIIIZ(User user, Object obj) {
        return LJJIIZ(user);
    }

    public final int LJIJJ(float f, String str) {
        try {
            StringBuilder sb = new StringBuilder(str);
            String upperCase = Integer.toHexString((int) (f * 255)).toUpperCase(Locale.ROOT);
            int length = str.length();
            if (length != 7) {
                if (length != 9) {
                    return LJJIIZI(sb.toString());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(upperCase);
                sbLIZ.append(sb.substring(3, 9));
                return LJJIIZI(C2188811AlT.LIZIZ(sbLIZ));
            }
            sb.insert(1, upperCase);
            return LJJIIZI(sb.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LJJIIZI(str);
        }
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIL(User user, User user2, Object obj, Object obj2) {
        String str;
        Object next;
        CombineBadgeStruct combineBadgeStruct;
        List<BadgeStruct> badgeList;
        Object next2;
        CombineBadgeStruct combineBadgeStruct2;
        long j;
        String str2;
        ProfileContent profileContent;
        LabelConfig labelConfig;
        ProfileContent profileContent2;
        LabelConfig labelConfig2;
        ProfileContent profileContent3;
        NumberConfig numberConfig;
        ProfileContent profileContent4;
        NumberConfig numberConfig2;
        List<BadgeStruct> badgeList2 = user.getBadgeList();
        if (badgeList2 != null) {
            ArrayList arrayList = new ArrayList();
            for (BadgeStruct badgeStruct : badgeList2) {
                if (badgeStruct.exhibitionType == 0) {
                    arrayList.add(badgeStruct);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((BadgeStruct) next).badgeScene == LJJIIJZLJL()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BadgeStruct badgeStruct2 = (BadgeStruct) next;
            if (badgeStruct2 != null && (combineBadgeStruct = badgeStruct2.combineBadgeStruct) != null && (badgeList = user2.getBadgeList()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (BadgeStruct badgeStruct3 : badgeList) {
                    if (badgeStruct3.exhibitionType == 0) {
                        arrayList2.add(badgeStruct3);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((BadgeStruct) next2).badgeScene == LJJIIJZLJL()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                BadgeStruct badgeStruct4 = (BadgeStruct) next2;
                if (badgeStruct4 != null && (combineBadgeStruct2 = badgeStruct4.combineBadgeStruct) != null) {
                    ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
                    long j2 = 0;
                    if (profileCardPanel != null && (profileContent4 = profileCardPanel.profileContent) != null && (numberConfig2 = profileContent4.numberConfig) != null) {
                        j = numberConfig2.number;
                    } else {
                        j = 0;
                    }
                    String strLJIIIIZZ = C1850730yGF.LJIIIIZZ(j);
                    ProfileCardPanel profileCardPanel2 = combineBadgeStruct2.profileCardPanel;
                    if (profileCardPanel2 != null && (profileContent3 = profileCardPanel2.profileContent) != null && (numberConfig = profileContent3.numberConfig) != null) {
                        j2 = numberConfig.number;
                    }
                    String strLJIIIIZZ2 = C1850730yGF.LJIIIIZZ(j2);
                    ProfileCardPanel profileCardPanel3 = combineBadgeStruct.profileCardPanel;
                    if (profileCardPanel3 != null && (profileContent2 = profileCardPanel3.profileContent) != null && (labelConfig2 = profileContent2.labelConfig) != null) {
                        str2 = labelConfig2.label;
                    } else {
                        str2 = null;
                    }
                    ProfileCardPanel profileCardPanel4 = combineBadgeStruct2.profileCardPanel;
                    if (profileCardPanel4 != null && (profileContent = profileCardPanel4.profileContent) != null && (labelConfig = profileContent.labelConfig) != null) {
                        str = labelConfig.label;
                    }
                    if (!Intrinsics.LJFF(strLJIIIIZZ, strLJIIIIZZ2) || !Intrinsics.LJFF(str2, str)) {
                        LJJIIZ(user2);
                    }
                }
            }
        }
    }
}
