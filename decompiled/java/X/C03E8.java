package X;

import Y.ACListenerS136S0100000_1;
import Y.ARunnableS101S0100000_1;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import h0b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03E8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03E8 {
    public static final C03E8 LIZ = new C03E8();

    public static void LIZIZ(LinearLayout linearLayout, List list, a aVar) {
        String name;
        String str;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UserRightDescBlock userRightDescBlock = (UserRightDescBlock) it2.next();
            Integer num = userRightDescBlock.type;
            if (num != null) {
                if (num.intValue() == 1) {
                    String str2 = userRightDescBlock.plainDescription;
                    if (str2 != null) {
                        C03E8 c03e8 = LIZ;
                        int iLLJILJILJ = aVar.LLJILJILJ();
                        int iLJLLL = aVar.LJLLL();
                        c03e8.getClass();
                        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                        tuxTextView.setText(str2);
                        tuxTextView.setTuxFont(iLLJILJILJ);
                        tuxTextView.setTextColorRes(iLJLLL);
                        C426750GoL.LJIIIZ(tuxTextView, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
                        linearLayout.addView(tuxTextView);
                    }
                } else if (num.intValue() == 2) {
                    List<Icon> list2 = userRightDescBlock.logos;
                    if (list2 != null) {
                        LIZ.getClass();
                        C426160GnO c426160GnO = new C426160GnO(linearLayout.getContext(), null, 6);
                        c426160GnO.setGravity(-1);
                        if (list2.isEmpty()) {
                            C786410Ut5.LLZLLLL(c426160GnO, 8);
                        } else {
                            C786410Ut5.a7(c426160GnO, new LinearLayout.LayoutParams(-2, -2));
                            C786410Ut5.LLZLLLL(c426160GnO, 0);
                            AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(c426160GnO, (C426160GnO) list2, (List<Icon>) 58);
                            if (c426160GnO.getWidth() == 0) {
                                HandlerHook.viewPost(c426160GnO, new ARunnableS101S0100000_1(awS402S0200000_1, 42));
                            } else {
                                awS402S0200000_1.invoke();
                            }
                            linearLayout.addView(c426160GnO);
                        }
                    }
                } else if (num.intValue() == 3) {
                    LinkRichText linkRichText = userRightDescBlock.mixLinkDescription;
                    if (linkRichText != null) {
                        C03E8 c03e82 = LIZ;
                        int iLLJILJILJ2 = aVar.LLJILJILJ();
                        int iLJLLL2 = aVar.LJLLL();
                        c03e82.getClass();
                        TuxTextView tuxTextView2 = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                        ArrayList arrayList = new ArrayList();
                        Map<String, LinkText> map = linkRichText.arguments;
                        if (map != null) {
                            Iterator<String> it3 = map.keySet().iterator();
                            while (it3.hasNext()) {
                                LinkText linkText = linkRichText.arguments.get(it3.next());
                                if (linkText != null && (name = linkText.getName()) != null) {
                                    arrayList.add(name);
                                }
                            }
                        }
                        C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                        tuxTextView2.setText(RichTextUtil.LJ(RichTextUtil.LIZ, tuxTextView2.getContext(), linkRichText, null, 0, true, null, null, null, null, false, false, null, null, new AwS580S0100000_1(tuxTextView2, 522), 8168));
                        tuxTextView2.setTuxFont(iLLJILJILJ2);
                        tuxTextView2.setTextColorRes(iLJLLL2);
                        C426750GoL.LJIIIZ(tuxTextView2, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
                        tuxTextView2.setClickable(true);
                        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                        linearLayout.addView(tuxTextView2);
                        if (!arrayList.isEmpty()) {
                            C1748720vbi.LJFF(tuxTextView2, new C049X(), new C5182020e(arrayList, (ArrayList<String>) 293), new AwS580S0100000_1(arrayList, (ArrayList<String>) 523));
                        }
                    }
                } else if (num != null) {
                    if (num.intValue() == 4) {
                        LinkText linkText2 = userRightDescBlock.linkText;
                        if (linkText2 != null) {
                            C03E8 c03e83 = LIZ;
                            int iLJJIIZ = aVar.LJJIIZ();
                            int iLJZI = aVar.LJZI();
                            c03e83.getClass();
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(linearLayout.getContext()), R.layout.ank, linearLayout, false);
                            ((TextView) viewTd.findViewById(R.id.mrt)).setText(linkText2.getText());
                            ((TuxTextView) viewTd.findViewById(R.id.mrt)).setTuxFont(iLJJIIZ);
                            ((TextView) viewTd.findViewById(R.id.mrt)).setTextColor(C7959038z.LIZ(linearLayout.getContext(), linkText2.getTextColor()));
                            ((TuxIconView) viewTd.findViewById(R.id.dr_)).setIconRes(iLJZI);
                            ((TuxIconView) viewTd.findViewById(R.id.dr_)).setTintColor(C7959038z.LIZ(linearLayout.getContext(), linkText2.getTextColor()));
                            if (Intrinsics.LJFF(linkText2.getShowArrow(), Boolean.TRUE)) {
                                C786410Ut5.LJLLLLLL(0, viewTd.findViewById(R.id.dr_));
                            }
                            if (linkText2.getLink() != null) {
                                C786410Ut5.I7(new AjS20S0300000_1(linearLayout, linkText2, viewTd, 28), viewTd);
                            }
                            linearLayout.addView(viewTd);
                            C1748720vbi.LJFF(viewTd, new C049X(), new AwS545S0100000_1(linkText2, 1557), new AwS580S0100000_1(linkText2, 525));
                        }
                    } else if (num.intValue() == 5 && (str = userRightDescBlock.plainDescription) != null) {
                        C03E8 c03e84 = LIZ;
                        int iLLJILJILJ3 = aVar.LLJILJILJ();
                        int iLJLLL3 = aVar.LJLLL();
                        c03e84.getClass();
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        TuxIconView tuxIconView = new TuxIconView(linearLayout.getContext(), null, 0, 6, null);
                        C786410Ut5.M6(tuxIconView, layoutParams);
                        tuxIconView.setIconRes(R.drawable.b5m);
                        tuxIconView.setTintColorRes(R.attr.bf);
                        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        TuxTextView tuxTextView3 = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                        C786410Ut5.R6(tuxTextView3, layoutParams);
                        tuxTextView3.setText(str);
                        tuxTextView3.setTuxFont(iLLJILJILJ3);
                        tuxTextView3.setTextColorRes(iLJLLL3);
                        C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 0, false, 16);
                        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
                        C426750GoL.LJIIIZ(linearLayout2, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
                        linearLayout2.addView(tuxIconView);
                        linearLayout2.addView(tuxTextView3);
                        linearLayout.addView(linearLayout2);
                    }
                }
            }
        }
    }

    public static void LIZ(LinearLayout linearLayout, String str, Integer num, Integer num2, Function0 function0) {
        C01GW c01gw = C954703oH.LIZ;
        View viewLIZ = C954703oH.LIZ(linearLayout.getContext(), R.layout.akx, linearLayout, false);
        TuxTextView tuxTextView = (TuxTextView) viewLIZ.findViewById(R.id.mrt);
        if (tuxTextView != null) {
            if (str != null) {
                tuxTextView.setText(str);
            }
            if (num2 != null) {
                tuxTextView.setTextColorRes(num2.intValue());
            }
            if (num != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
        }
        linearLayout.addView(viewLIZ);
        C786410Ut5.I7(new ACListenerS136S0100000_1(function0, 17), viewLIZ);
    }
}
