package X;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12QA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QA implements InterfaceC19359210oY {
    public C1397510mTF LIZ;

    public static String LIZJ(C12QB c12qb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text=");
        sbLIZ.append(c12qb.LIZIZ());
        sbLIZ.append(", type=");
        sbLIZ.append(c12qb.type());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19359210oY
    public final C12Q8 LIZ(final Activity activity, AbstractC1207960hXW abstractC1207960hXW) {
        return new C12Q8() { // from class: X.12Q9
            @Override // X.C12Q8
            public final void LIZ() {
                C1397510mTF c1397510mTF = this.LIZ.LIZ;
                if (c1397510mTF != null) {
                    c1397510mTF.LIZIZ(null);
                }
                this.LIZ.LIZ = null;
            }

            @Override // X.C12Q8
            public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
                String strLIZJ;
                String strLIZJ2;
                C12QA c12qa = this.LIZ;
                Activity activity2 = activity;
                c12qa.getClass();
                CharSequence charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(activity2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createTuxDialog: ");
                sbLIZ.append((Object) charSequenceLJIIIIZZ);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(str2);
                sbLIZ.append(", ");
                if (c12qb != null) {
                    strLIZJ = C12QA.LIZJ(c12qb);
                } else {
                    strLIZJ = null;
                }
                sbLIZ.append(strLIZJ);
                sbLIZ.append(", ");
                if (c12qb2 != null) {
                    strLIZJ2 = C12QA.LIZJ(c12qb2);
                } else {
                    strLIZJ2 = null;
                }
                sbLIZ.append(strLIZJ2);
                C2188811AlT.LIZIZ(sbLIZ);
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity2), R.layout.dk7, null, false);
                if (str == null || str.length() == 0) {
                    str = activity2.getResources().getString(2131857103);
                }
                if (str2 == null || str2.length() == 0) {
                    str2 = activity2.getResources().getString(2131857096);
                }
                ((TextView) viewTd.findViewById(R.id.zw3)).setText(str);
                ((TextView) viewTd.findViewById(R.id.zw2)).setText(str2);
                C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                c1397580mTM.LJII = false;
                C1207020hW0.LIZ(c1397580mTM, viewTd);
                C384000F3u.LIZ(c1397580mTM, new FrameLayout(activity2) { // from class: X.06VU
                    @Override // android.view.ViewGroup, android.view.View
                    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        return true;
                    }

                    {
                        super(activity2, null, 0);
                        if (C960203pA.LIZIZ(activity2)) {
                            activity2.getTheme().applyStyle(R.style.y1, true);
                        } else {
                            activity2.getTheme().applyStyle(R.style.y4, true);
                        }
                        View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(activity2), R.layout.dk_, this, true);
                        View viewFindViewById = viewTd2.findViewById(R.id.w39);
                        TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_step_index);
                        TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.tv_step_content);
                        TuxIconView tuxIconView = (TuxIconView) viewFindViewById.findViewById(R.id.lvv);
                        View viewFindViewById2 = viewTd2.findViewById(R.id.w3_);
                        TextView textView2 = (TextView) viewFindViewById2.findViewById(R.id.tv_step_index);
                        TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById2.findViewById(R.id.tv_step_content);
                        C21411818qq c21411818qq = (C21411818qq) viewFindViewById2.findViewById(R.id.lvv);
                        textView.setText("1");
                        String string = getContext().getResources().getString(2131857100);
                        tuxTextView.setText(C06YR.LIZ(getContext().getResources().getString(2131857099, string), string));
                        tuxTextView.setTuxFont(81);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
                        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zw);
                        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
                        textView2.setText("2");
                        String string2 = getContext().getResources().getString(2131857102);
                        tuxTextView2.setText(C06YR.LIZ(getContext().getResources().getString(2131857101, string2), string2));
                        tuxTextView2.setTuxFont(81);
                        c21411818qq.setSizeVariant(1);
                    }
                });
                c1397580mTM.LJIILIIL = 0;
                C985403tE.LIZ(c1397580mTM, new AwS124S0400000_29(c12qa, c12qb, activity2, c12qb2, 3));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                this.LIZ.LIZ = c1397510mTF;
                c1397510mTF.LIZLLL();
            }
        };
    }

    public static void LIZIZ(C1397620mTQ c1397620mTQ, C12QB c12qb, Activity activity) {
        if (c12qb == null) {
            return;
        }
        if (c12qb.type() != C12QJ.OK && c12qb.type() != C12QJ.SETTINGS) {
            String strLIZIZ = c12qb.LIZIZ();
            if (strLIZIZ == null) {
                strLIZIZ = activity.getResources().getString(2131857097);
            }
            c1397620mTQ.LIZJ(1, strLIZIZ, new AwS608S0100000_29(c12qb, 623));
            return;
        }
        String strLIZIZ2 = c12qb.LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = activity.getResources().getString(2131857097);
        }
        c1397620mTQ.LIZJ(0, strLIZIZ2, new AwS608S0100000_29(c12qb, 622));
    }
}
