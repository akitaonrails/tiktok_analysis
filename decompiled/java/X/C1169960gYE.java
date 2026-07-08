package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169960gYE {
    public static final C1169960gYE LIZ = new C1169960gYE();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(785));
    public static final Map<String, String> LIZLLL = new LinkedHashMap();
    public static final Map<String, BaseAccountFlowFragment> LJ = new LinkedHashMap();

    public static boolean LIZIZ(EditText editText) {
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk8apgiIomNKO7hjnMpzTICPuVXY7sms3cV34a", null));
        if (editableLLJILLL.length() <= 30) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(editableLLJILLL);
        editText.setText(editableLLJILLL.toString().substring(0, 30));
        Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk8apgiIomNKO7hjnMpzTICPuVXY7sms3cV34a", null));
        if (selectionEnd > editableLLJILLL2.length()) {
            selectionEnd = editableLLJILLL2.length();
        }
        Selection.setSelection(editableLLJILLL2, selectionEnd);
        return true;
    }

    public static void LIZ(int i, Context context, TuxTextView tuxTextView, boolean z) {
        int i2;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        if (z) {
            i2 = R.attr.zs;
        } else {
            i2 = R.attr.a1k;
        }
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i2, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            foregroundColorSpan = null;
        }
        int iMin = Math.min(i, 30);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZJ(C787200UuM.LIZ(iMin), foregroundColorSpan, 33);
        c1360520lVa.LJI("/");
        c1360520lVa.LIZ.append((CharSequence) C787200UuM.LIZ(30));
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c1360500lVY);
        }
    }
}
