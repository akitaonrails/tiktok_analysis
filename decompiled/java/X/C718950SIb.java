package X;

import android.text.Layout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718950SIb {
    public static final C718970SId LIZ = new C718970SId(0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C719140SIu());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C719110SIr());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C719130SIt());
    public static final C01GW LJ = C452501pT.LIZIZ(new C719120SIs());

    public static int LIZIZ(String str) {
        try {
            return ((Regex) LJ.getValue()).replace(((Regex) LIZLLL.getValue()).replace(((Regex) LIZJ.getValue()).replace(((Regex) LIZIZ.getValue()).replace(str, ""), ""), ""), "").length();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return 0;
        }
    }

    public static int LIZ(CharSequence charSequence, Layout layout) {
        int length;
        if (charSequence == null || layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount() - 1;
        int ellipsisStart = layout.getEllipsisStart(lineCount);
        if (layout.getEllipsisCount(lineCount) <= 0) {
            return 0;
        }
        int lineStart = layout.getLineStart(lineCount);
        int i = ellipsisStart + lineStart;
        try {
            String string = charSequence.subSequence(lineStart, i).toString();
            for (int length2 = string.length() - 2; -1 < length2 && string.charAt(length2) != ' '; length2--) {
                if (string.charAt(length2) == '#') {
                    length = string.length() - length2;
                    break;
                }
            }
            length = 0;
            return LIZIZ(charSequence.subSequence(i - length, charSequence.length()).toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return 0;
        }
    }

    public static C719090SIp LIZJ(String str, Layout layout, Function1 function1, Function1 function12, Function1 function13, boolean z, boolean z2) {
        int iLIZ;
        C0SIB c0sib;
        if (!z) {
            if (!z2) {
                function13.invoke(LIZ);
                function1.invoke(C0SIB.ONLINE);
                return (C719090SIp) function12.invoke(Boolean.FALSE);
            }
        } else {
            function1.invoke(C0SIB.STRENGTHEN);
        }
        Boolean bool = Boolean.FALSE;
        C719090SIp c719090SIp = (C719090SIp) function12.invoke(bool);
        if (c719090SIp.LIZIZ == null) {
            C0SIB c0sib2 = C0SIB.ONLINE;
            function1.invoke(c0sib2);
            function13.invoke(new C718970SId(EnumC704080Rja.NEGATIVE, c0sib2));
            return (C719090SIp) function12.invoke(bool);
        }
        if (layout == null) {
            iLIZ = 0;
        } else {
            iLIZ = LIZ(str, layout);
        }
        CharSequence text = c719090SIp.LIZ.getText();
        Layout layout2 = c719090SIp.LIZJ;
        if (layout2 == null) {
            layout2 = c719090SIp.LIZIZ;
        }
        if (LIZ(text, layout2) + iLIZ > ((Number) C269040AgY.LIZ.getValue()).intValue()) {
            if (z) {
                c0sib = C0SIB.STRENGTHEN;
            } else {
                c0sib = C0SIB.ONLINE;
            }
            function1.invoke(c0sib);
            function13.invoke(new C718970SId(EnumC704080Rja.POSITIVE, c0sib));
            if (iLIZ > 0) {
                return (C719090SIp) function12.invoke(Boolean.TRUE);
            }
            return c719090SIp;
        }
        if (z2) {
            EnumC704080Rja enumC704080Rja = EnumC704080Rja.NEGATIVE;
            C0SIB c0sib3 = C0SIB.WEAKEN;
            function13.invoke(new C718970SId(enumC704080Rja, c0sib3));
            function1.invoke(c0sib3);
        } else {
            EnumC704080Rja enumC704080Rja2 = EnumC704080Rja.NEGATIVE;
            C0SIB c0sib4 = C0SIB.ONLINE;
            function13.invoke(new C718970SId(enumC704080Rja2, c0sib4));
            function1.invoke(c0sib4);
        }
        return (C719090SIp) function12.invoke(bool);
    }
}
