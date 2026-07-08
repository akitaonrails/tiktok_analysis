package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS25S0301000_28;
import Y.ACListenerS52S0201000_28;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.IncentiveCommon;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS149S0201000_28;

/* JADX INFO: renamed from: X.0zUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898010zUV {
    public static final C1898010zUV LIZ = new C1898010zUV();
    public static TuxSheet LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.GradientDrawable LIZ(com.bytedance.touchpoint.api.model.InviteCodeResponse.Button r8) {
        /*
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r6 = 0
            if (r8 == 0) goto L2f
            int r1 = r8.gradientType
            r5 = 0
            if (r1 != 0) goto L38
            if (r8 == 0) goto L2f
            java.util.List<java.lang.String> r0 = r8.bgColor
            if (r0 == 0) goto L2f
            int r0 = r0.size()
            if (r0 <= 0) goto L2f
            X.0SVC r1 = X.C0SVC.LIZ
            if (r8 == 0) goto L27
            java.util.List<java.lang.String> r0 = r8.bgColor
            if (r0 == 0) goto L27
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            java.lang.String r5 = (java.lang.String) r5
        L27:
            int r0 = X.C0SVC.LIZIZ(r1, r5)
        L2b:
            r3.setColor(r0)
            return r3
        L2f:
            X.0SVC r1 = X.C0SVC.LIZ
            java.lang.String r0 = "#FFFFFF"
            int r0 = X.C0SVC.LIZIZ(r1, r0)
            goto L2b
        L38:
            r0 = 1
            if (r1 == r0) goto L7e
            r0 = 2
            if (r1 == r0) goto L7b
            r0 = 3
            if (r1 == r0) goto L78
            r0 = 4
            if (r1 == r0) goto L75
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
        L46:
            if (r8 == 0) goto L81
            java.util.List<java.lang.String> r1 = r8.bgColor
            if (r1 == 0) goto L81
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r7.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0SVC r0 = X.C0SVC.LIZ
            int r0 = X.C0SVC.LIZIZ(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.add(r0)
            goto L5b
        L75:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            goto L46
        L78:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            goto L46
        L7b:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            goto L46
        L7e:
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            goto L46
        L81:
            r7 = r5
            if (r8 != 0) goto Lc2
            r2 = r5
        L85:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto Lb8
            if (r2 == 0) goto Lb8
            int r0 = r2.size()
            if (r0 <= 0) goto Lb8
            if (r7 == 0) goto Lb6
            int[] r0 = X.C13LP.LLII(r7)
        L99:
            if (r2 == 0) goto L9f
            float[] r5 = X.C13LP.LLI(r2)
        L9f:
            r3.setColors(r0, r5)
        La2:
            r3.setGradientType(r6)
            r3.setOrientation(r4)
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r3.setCornerRadius(r0)
            return r3
        Lb6:
            r0 = r5
            goto L99
        Lb8:
            if (r7 == 0) goto Lbe
            int[] r5 = X.C13LP.LLII(r7)
        Lbe:
            r3.setColors(r5)
            goto La2
        Lc2:
            java.util.List<java.lang.Float> r2 = r8.locations
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1898010zUV.LIZ(com.bytedance.touchpoint.api.model.InviteCodeResponse$Button):android.graphics.drawable.GradientDrawable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v78, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.bytedance.touchpoint.api.model.InviteCodeResponse$Button] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.127h, android.view.View, android.widget.TextView] */
    public static void LIZIZ(Activity activity, InviteCodeResponse inviteCodeResponse, Function2 function2, Function0 function0) {
        String str;
        String str2;
        String strLJIJJ;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        int iIntValue;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        InviteCodeResponse.Button button;
        int iLIZLLL;
        InviteCodeResponse.InviteResultPopup inviteResultPopup2;
        List<InviteCodeResponse.Button> list;
        int size;
        ?? r11;
        ?? r0;
        Title title;
        InviteCodeResponse.InviteResultPopup inviteResultPopup3;
        List<InviteCodeResponse.Button> list2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup4;
        List<InviteCodeResponse.Button> list3;
        InviteCodeResponse.InviteResultPopup inviteResultPopup5;
        List<InviteCodeResponse.Button> list4;
        InviteCodeResponse.Button button2;
        Title title2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup6;
        List<InviteCodeResponse.Button> list5;
        InviteCodeResponse.Button button3;
        Title title3;
        InviteCodeResponse.InviteResultPopup inviteResultPopup7;
        Title title4;
        InviteCodeResponse.InviteResultPopup inviteResultPopup8;
        Title title5;
        InviteCodeResponse.InviteResultPopup inviteResultPopup9;
        Title title6;
        InviteCodeResponse.InviteResultPopup inviteResultPopup10;
        Title title7;
        String str9;
        InviteCodeResponse.InviteResultPopup inviteResultPopup11;
        Integer num;
        if (activity == null) {
            return;
        }
        InviteCodeResponse.Data data = inviteCodeResponse.data;
        AttributeSet attributeSet = null;
        if (data != null && data.inviteResultPopup != null) {
            if (LIZIZ == null) {
                View viewSd = C786410Ut5.Sd(R.layout.fwl, C786410Ut5.ne(activity), null);
                InviteCodeResponse.Data data2 = inviteCodeResponse.data;
                int i = -1;
                if (data2 != null && (num = data2.inviterBindStatus) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                if (iIntValue != 1 && iIntValue != 2) {
                    C786410Ut5.LLZZLLIL((C1322110kVd) viewSd.findViewById(R.id.f58), 0);
                    C786410Ut5.LJZL(8, (LinearLayout) viewSd.findViewById(R.id.kzo));
                    C1322110kVd c1322110kVd = (C1322110kVd) viewSd.findViewById(R.id.f58);
                    InviteCodeResponse.Data data3 = inviteCodeResponse.data;
                    if (data3 != null && (inviteResultPopup11 = data3.inviteResultPopup) != null) {
                        str9 = inviteResultPopup11.coverImage;
                    } else {
                        str9 = null;
                    }
                    c1322110kVd.setImageURI(str9);
                } else {
                    C786410Ut5.LLZZLLIL((C1322110kVd) viewSd.findViewById(R.id.f58), 8);
                    C786410Ut5.LJZL(0, (LinearLayout) viewSd.findViewById(R.id.kzo));
                }
                TextView textView = (TextView) viewSd.findViewById(R.id.title);
                InviteCodeResponse.Data data4 = inviteCodeResponse.data;
                if (data4 != null && (inviteResultPopup10 = data4.inviteResultPopup) != null && (title7 = inviteResultPopup10.title) != null) {
                    str3 = title7.text;
                } else {
                    str3 = null;
                }
                textView.setText(str3);
                TextView textView2 = (TextView) viewSd.findViewById(R.id.title);
                C0SVC c0svc = C0SVC.LIZ;
                InviteCodeResponse.Data data5 = inviteCodeResponse.data;
                if (data5 != null && (inviteResultPopup9 = data5.inviteResultPopup) != null && (title6 = inviteResultPopup9.title) != null) {
                    str4 = title6.color;
                } else {
                    str4 = null;
                }
                textView2.setTextColor(C0SVC.LIZIZ(c0svc, str4));
                TextView textView3 = (TextView) viewSd.findViewById(R.id.eu1);
                InviteCodeResponse.Data data6 = inviteCodeResponse.data;
                if (data6 != null && (inviteResultPopup8 = data6.inviteResultPopup) != null && (title5 = inviteResultPopup8.decription) != null) {
                    str5 = title5.text;
                } else {
                    str5 = null;
                }
                textView3.setText(str5);
                TextView textView4 = (TextView) viewSd.findViewById(R.id.eu1);
                InviteCodeResponse.Data data7 = inviteCodeResponse.data;
                if (data7 != null && (inviteResultPopup7 = data7.inviteResultPopup) != null && (title4 = inviteResultPopup7.decription) != null) {
                    str6 = title4.color;
                } else {
                    str6 = null;
                }
                textView4.setTextColor(C0SVC.LIZIZ(c0svc, str6));
                TextView textView5 = (TextView) viewSd.findViewById(R.id.d6g);
                InviteCodeResponse.Data data8 = inviteCodeResponse.data;
                if (data8 != null && (inviteResultPopup6 = data8.inviteResultPopup) != null && (list5 = inviteResultPopup6.buttons) != null && (button3 = (InviteCodeResponse.Button) ListProtector.get(list5, 0)) != null && (title3 = button3.text) != null) {
                    str7 = title3.text;
                } else {
                    str7 = null;
                }
                textView5.setText(str7);
                TextView textView6 = (TextView) viewSd.findViewById(R.id.d6g);
                InviteCodeResponse.Data data9 = inviteCodeResponse.data;
                if (data9 != null && (inviteResultPopup5 = data9.inviteResultPopup) != null && (list4 = inviteResultPopup5.buttons) != null && (button2 = (InviteCodeResponse.Button) ListProtector.get(list4, 0)) != null && (title2 = button2.text) != null) {
                    str8 = title2.color;
                } else {
                    str8 = null;
                }
                textView6.setTextColor(C0SVC.LIZIZ(c0svc, str8));
                C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.d6g);
                InviteCodeResponse.Data data10 = inviteCodeResponse.data;
                if (data10 != null && (inviteResultPopup4 = data10.inviteResultPopup) != null && (list3 = inviteResultPopup4.buttons) != null) {
                    button = (InviteCodeResponse.Button) ListProtector.get(list3, 0);
                } else {
                    button = null;
                }
                c197039127h.setBackground(LIZ(button));
                C786410Ut5.U8((C197039127h) viewSd.findViewById(R.id.d6g), new ACListenerS52S0201000_28(function2, iIntValue, inviteCodeResponse, 0));
                InviteCodeResponse.Data data11 = inviteCodeResponse.data;
                if (data11 != null && (inviteResultPopup2 = data11.inviteResultPopup) != null && (list = inviteResultPopup2.buttons) != null && (size = list.size()) > 1) {
                    int i2 = -2;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins((int) C12ES.LIZJ(32.0f, activity), (int) C12ES.LIZJ(32.0f, activity), (int) C12ES.LIZJ(32.0f, activity), 0);
                    C786410Ut5.J6((C197039127h) viewSd.findViewById(R.id.d6g), layoutParams);
                    int i3 = 1;
                    do {
                        InviteCodeResponse.Data data12 = inviteCodeResponse.data;
                        if (data12 != null && (inviteResultPopup3 = data12.inviteResultPopup) != null && (list2 = inviteResultPopup3.buttons) != null) {
                            r11 = (InviteCodeResponse.Button) ListProtector.get(list2, i3);
                        } else {
                            r11 = attributeSet;
                        }
                        ?? c197039127h2 = new C197039127h(activity, attributeSet, 6, 0);
                        if (r11 != 0 && (title = r11.text) != null) {
                            r0 = title.text;
                        } else {
                            r0 = attributeSet;
                        }
                        c197039127h2.setText(r0);
                        c197039127h2.setButtonSize(3);
                        c197039127h2.setButtonVariant(0);
                        C0SVC c0svc2 = C0SVC.LIZ;
                        ?? r13 = attributeSet;
                        if (r11 != 0) {
                            Title title8 = r11.text;
                            r13 = attributeSet;
                            if (title8 != null) {
                                r13 = title8.color;
                            }
                        }
                        c197039127h2.setTextColor(C0SVC.LIZIZ(c0svc2, r13));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i2);
                        layoutParams2.setMargins((int) C12ES.LIZJ(32.0f, activity), (int) C12ES.LIZJ(6.0f, activity), (int) C12ES.LIZJ(32.0f, activity), (int) C12ES.LIZJ(32.0f, activity));
                        ((ViewGroup) viewSd).addView(c197039127h2, layoutParams2);
                        C786410Ut5.U8(c197039127h2, new ACListenerS25S0301000_28(function2, r11, inviteCodeResponse, iIntValue, 0));
                        c197039127h2.setBackground(LIZ(r11));
                        i3++;
                        attributeSet = null;
                        i = -1;
                        i2 = -2;
                    } while (i3 < size);
                }
                C786410Ut5.a9((TuxIconView) viewSd.findViewById(R.id.e1g), new ACListenerS130S0200000_28(viewSd, inviteCodeResponse, 0));
                C1897570zTn c1897570zTn = (C1897570zTn) C1619720sFe.LIZ.LIZ(2000);
                if (c1897570zTn != null) {
                    iLIZLLL = c1897570zTn.LIZLLL();
                } else {
                    iLIZLLL = 0;
                }
                C01U6.LIZIZ(new AwS149S0201000_28(viewSd, iLIZLLL, function0, 1));
            }
            if (activity instanceof C19EG) {
                FragmentManager supportFragmentManager = ((C19EG) activity).getSupportFragmentManager();
                TuxSheet tuxSheet = LIZIZ;
                if (tuxSheet != null) {
                    tuxSheet.show(supportFragmentManager, "invite_dialog");
                }
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    InviteCodeResponse.Data data13 = inviteCodeResponse.data;
                    if (data13 != null && (inviteResultPopup = data13.inviteResultPopup) != null) {
                        str = inviteResultPopup.popupType;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put("pop_name", str);
                    linkedHashMap.put("position", "now tab");
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    IncentiveCommon incentiveCommon = (IncentiveCommon) C2178808gE.LIZ().LJ(23);
                    if (incentiveCommon != null) {
                        str2 = incentiveCommon.notificationName;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put("activity_name", str2);
                    AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                    if (abstractC1896090zRP != null) {
                        strLJIJJ = abstractC1896090zRP.LJIJJ();
                    } else {
                        strLJIJJ = null;
                    }
                    linkedHashMap.put("region", strLJIJJ);
                    interfaceC1897260zTILIZIZ.LIZ("referral_dialog_pop_show", linkedHashMap);
                }
            }
        }
    }
}
