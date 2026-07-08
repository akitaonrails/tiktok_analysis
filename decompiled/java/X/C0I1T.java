package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0I1T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1T {
    public static final C0I1T LIZ = new C0I1T();

    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        String string = a0.LJLIIIL(str).toString();
        for (int i = 0; i < string.length(); i++) {
            sb.append(C1E91.LIZJ(string.charAt(i)));
        }
        return sb.toString();
    }

    public static String LIZJ(int i, Editable editable, boolean z) {
        boolean z2;
        if (editable != null && editable.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && i != 0) {
            if (u.LJIIZILJ(editable.toString(), e3.g, false)) {
                return "";
            }
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, i).iterator();
            Object obj = null;
            while (it2.LLILLL) {
                Object next = it2.next();
                if (editable.charAt(((Number) next).intValue()) == '@') {
                    obj = next;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int iIntValue = num.intValue();
                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(iIntValue, i, ForegroundColorSpan.class);
                if (foregroundColorSpanArr != null && foregroundColorSpanArr.length != 0) {
                    return null;
                }
                String string = editable.subSequence(iIntValue + 1, i).toString();
                if (a0.LJJIIZI(string, "  ", false) || a0.LJJIJ(string, '\n')) {
                    return null;
                }
                if (z) {
                    string = a0.LJLIIIL(string).toString();
                }
                if (string.length() > 24) {
                    return null;
                }
                return string;
            }
        }
        return null;
    }

    public static SpannableString LIZIZ(int i, String str, Integer num, String str2) {
        Object c098200Yq;
        if (a0.LJJIJ(str2, '.')) {
            str2 = u.LJJIFFI(str2, e3.d, "\\.", false);
        }
        SpannableString spannableString = new SpannableString(str);
        if (num == null) {
            return spannableString;
        }
        try {
            Matcher matcher = PatternProtector.compile(str2).matcher(spannableString);
            if (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (iStart >= i) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(num.intValue()), iStart, iEnd, 33);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return spannableString;
    }
}
