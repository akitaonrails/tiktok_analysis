package X;

import android.app.Dialog;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Qn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680790Qn7 {
    public static final C680790Qn7 LIZ = new C680790Qn7();

    public static void LIZIZ(EditText editText) {
        int length;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWluc10bpsrvqFPXg1Uyd+nA7uVKBqDrk=", null));
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        editText.setSelection(length);
        editText.setCursorVisible(true);
        editText.requestFocus();
        KeyboardUtils.LIZLLL(editText);
    }

    public static boolean LIZLLL(TuxTextView tuxTextView) {
        Integer numValueOf = Integer.valueOf(tuxTextView.getLineCount() - 1);
        if (numValueOf.intValue() < 0) {
            return false;
        }
        int iIntValue = numValueOf.intValue();
        Layout layout = tuxTextView.getLayout();
        if (layout != null && layout.getEllipsisCount(iIntValue) > 0) {
            return true;
        }
        return false;
    }

    public static String LJ(String str) {
        Object c098200Yq;
        String strLJLJLJ;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (str.length() != 8 && str.length() != 9) {
            if (str.length() == 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            strLJLJLJ = C13LN.LJLJLJ(1, str);
        } else {
            strLJLJLJ = str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C13LN.LL(2, strLJLJLJ));
        sbLIZ2.append(C13LN.LJLL(2, strLJLJLJ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('#');
        sbLIZ3.append(strLIZIZ);
        c098200Yq = C2188811AlT.LIZIZ(sbLIZ3);
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public static void LJFF(TuxSheet tuxSheet) {
        View viewFindViewById;
        GradientDrawable gradientDrawable;
        RadiusLayout radiusLayout;
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null && (radiusLayout = (RadiusLayout) dialog.findViewById(R.id.spp)) != null) {
            radiusLayout.LIZ(0.0f, 0.0f, 0.0f, 0.0f);
        }
        Dialog dialog2 = tuxSheet.getDialog();
        if (dialog2 != null && (viewFindViewById = dialog2.findViewById(R.id.fpl)) != null) {
            Drawable background = viewFindViewById.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
    }

    public static void LIZ(View view, boolean z) {
        if (z) {
            C339190DRl.LIZLLL(view);
        } else {
            C339190DRl.LIZIZ(view);
        }
    }

    public static Typeface LIZJ(float f, int i) {
        C12MF c12mf;
        Typeface typefaceLIZ = null;
        try {
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, i, f, 0.0f, Float.valueOf(f), 0.0f, 0, null, 224);
            if (typefaceLIZIZ == null) {
                LIZ.getClass();
                if (i != 400) {
                    if (i != 500) {
                        if (i == 700) {
                            c12mf = C12MF.BOLD;
                        } else {
                            c12mf = C12MF.REGULAR;
                        }
                    } else {
                        c12mf = C12MF.MEDIUM;
                    }
                } else {
                    c12mf = C12MF.REGULAR;
                }
                C19736612Jw c19736612Jw = C19736612Jw.LIZ;
                c19736612Jw.getClass();
                InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) C19736612Jw.LIZJ.getValue(c19736612Jw, C19736612Jw.LIZIZ[0]);
                if (interfaceC1609810rzf == null) {
                    return null;
                }
                typefaceLIZ = interfaceC1609810rzf.LIZ(c12mf.getVALUE());
                return typefaceLIZ;
            }
            return typefaceLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return typefaceLIZ;
        }
    }
}
