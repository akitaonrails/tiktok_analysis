package Y;

import X.C0P0T;
import X.C1308910kAL;
import X.C1350960lGA;
import X.C1352480lIc;
import X.C1380930m2V;
import X.C1380980m2a;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C1395850mQZ;
import X.C1395870mQb;
import X.C1395890mQd;
import X.C1697810uHb;
import X.C19EG;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C621180OYa;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1352970lJP;
import X.InterfaceC1395860mQa;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.share.AmberAlertSharePackage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.BubbleReactionCell;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS56S0400000_21 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0mJd, X.0mJg] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
    public static final void onClick$0(ACListenerS56S0400000_21 aCListenerS56S0400000_21, View view) {
        int iIntValue;
        ?? linearLayout;
        float f;
        boolean z;
        boolean z2;
        int i;
        float[] fArr;
        if (Intrinsics.LJFF(((C1395890mQd) aCListenerS56S0400000_21.l0).LIZ, "speed")) {
            ((InterfaceC1395860mQa) aCListenerS56S0400000_21.l1).LIZ(((C1395890mQd) aCListenerS56S0400000_21.l0).LIZ);
            C1395870mQb c1395870mQb = (C1395870mQb) aCListenerS56S0400000_21.l2;
            View view2 = (View) aCListenerS56S0400000_21.l3;
            List<C1395850mQZ> listLIZLLL = ((InterfaceC1395860mQa) aCListenerS56S0400000_21.l1).LIZLLL(((C1395890mQd) aCListenerS56S0400000_21.l0).LIZ);
            C0P0T c0p0t = c1395870mQb.LIZLLL;
            ?? r4 = 0;
            r4 = 0;
            if (c0p0t != null && c0p0t.isShowing()) {
                c1395870mQb.LJ();
                return;
            }
            if (listLIZLLL.isEmpty()) {
                return;
            }
            Context context = view2.getContext();
            ?? c1391550mJd = new C1391550mJd(context);
            c1391550mJd.LLILLJJLI.LIZIZ = view2;
            c1391550mJd.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            InterfaceC1395860mQa interfaceC1395860mQa = c1395870mQb.LIZJ;
            ?? r2 = 0;
            r2 = 0;
            if (interfaceC1395860mQa == null) {
                linearLayout = new View(context);
            } else {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                int i2 = 17;
                linearLayout.setGravity(17);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(26));
                gradientDrawable.setColor(C2441009hQ.LJIIL(5066061, C814420VxA.LIZIZ(127.5f)));
                linearLayout.setBackground(gradientDrawable);
                linearLayout.setPadding(0, 0, 0, 0);
                int i3 = 0;
                for (C1395850mQZ c1395850mQZ : listLIZLLL) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C1395850mQZ c1395850mQZ2 = c1395850mQZ;
                        ?? tuxTextView = new TuxTextView(context, r2, 6, r4 == true ? 1 : 0);
                        tuxTextView.setText(c1395850mQZ2.LIZIZ);
                        tuxTextView.setGravity(i2);
                        tuxTextView.setSingleLine(true);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setTextColor(iIntValue);
                        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        tuxTextView.setEnabled(c1395850mQZ2.LIZLLL);
                        tuxTextView.setClickable(c1395850mQZ2.LIZLLL);
                        tuxTextView.setFocusable(c1395850mQZ2.LIZLLL);
                        if (c1395850mQZ2.LIZLLL) {
                            f = 1.0f;
                        } else {
                            f = 0.4f;
                        }
                        C786410Ut5.B5(tuxTextView, f);
                        boolean z3 = c1395850mQZ2.LIZJ;
                        if (i3 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 == listLIZLLL.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        if (z3) {
                            i = 570425343;
                        } else {
                            i = 0;
                        }
                        gradientDrawable2.setColor(i);
                        float fLIZIZ = C418440Gaw.LIZIZ(26);
                        if (z && z2) {
                            fArr = new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ};
                        } else if (z) {
                            fArr = new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f};
                        } else {
                            fArr = new float[8];
                            if (z2) {
                                fArr[0] = 0.0f;
                                fArr[1] = 0.0f;
                                fArr[2] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[4] = fLIZIZ;
                                fArr[5] = fLIZIZ;
                                fArr[6] = fLIZIZ;
                                fArr[7] = fLIZIZ;
                            } else {
                                int i5 = 0;
                                do {
                                    fArr[i5] = 0.0f;
                                    i5++;
                                } while (i5 < 8);
                            }
                        }
                        gradientDrawable2.setCornerRadii(fArr);
                        tuxTextView.setBackground(gradientDrawable2);
                        C786410Ut5.h9(tuxTextView, new ACListenerS86S0300000_21(interfaceC1395860mQa, c1395850mQZ2, c1395870mQb, 4));
                        linearLayout.addView(tuxTextView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
                        i3 = i4;
                        r4 = 0;
                        r2 = 0;
                        i2 = 17;
                    } else {
                        C1697810uHb.LJIJI();
                        throw r2;
                    }
                }
            }
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LJIILLIIL = linearLayout;
            c1391600mJi.LJIIL = r4;
            c1391550mJd.LJI(r4);
            c1391550mJd.LJIIIZ(true, r2);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LIZLLL = enumC1235690iGF;
            c1391600mJi2.LJII = -1001L;
            c1391550mJd.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-12));
            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
            c1395870mQb.LIZLLL = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            return;
        }
        ((InterfaceC1395860mQa) aCListenerS56S0400000_21.l1).LIZ(((C1395890mQd) aCListenerS56S0400000_21.l0).LIZ);
    }

    public static final void onClick$1(ACListenerS56S0400000_21 aCListenerS56S0400000_21, View view) {
        Function0 function0 = (Function0) aCListenerS56S0400000_21.l0;
        if (function0 != null) {
            function0.invoke();
        }
        Activity activity = ((C1380980m2a) aCListenerS56S0400000_21.l1).LIZ;
        if (activity != null) {
            C621180OYa.LIZ.LJIIZILJ((AmberAlertSharePackage) aCListenerS56S0400000_21.l2, activity, (C1380930m2V) aCListenerS56S0400000_21.l3);
        }
    }

    public static final void onClick$2(ACListenerS56S0400000_21 aCListenerS56S0400000_21, View view) {
        String enterFrom;
        int iLIZ;
        NowPostInfo nowPostInfo;
        String str = null;
        int iLJ = ((INowsTabService) ServiceManager.get().getService(INowsTabService.class)).LJ((C19EG) ((BubbleReactionCell) aCListenerS56S0400000_21.l0).itemView.getContext(), ((LikeItem) aCListenerS56S0400000_21.l1).getAweme(), (NowFeedMobHierarchyData) aCListenerS56S0400000_21.l2, EnumC1352970lJP.REACTION, null);
        NowFeedMobHierarchyData nowFeedMobHierarchyData = (NowFeedMobHierarchyData) aCListenerS56S0400000_21.l2;
        if (nowFeedMobHierarchyData != null) {
            enterFrom = nowFeedMobHierarchyData.getEnterFrom();
        } else {
            enterFrom = null;
        }
        String uid = ((User) aCListenerS56S0400000_21.l3).getUid();
        Aweme aweme = ((LikeItem) aCListenerS56S0400000_21.l1).getAweme();
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str = nowPostInfo.nowMediaType;
        }
        Aweme aweme2 = ((LikeItem) aCListenerS56S0400000_21.l1).getAweme();
        if (aweme2 != null) {
            iLIZ = C1352480lIc.LIZ(aweme2);
        } else {
            iLIZ = 1;
        }
        C1350960lGA.LIZ(enterFrom, iLJ, iLIZ, uid, str, "click_head", "reaction");
    }

    public ACListenerS56S0400000_21(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
