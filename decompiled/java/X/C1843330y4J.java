package X;

import android.os.Build;
import android.text.Layout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: X.0y4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843330y4J {
    public static final /* synthetic */ int LIZ = 0;

    public static final EnumC2244751CtV LIZ(String str) {
        Object next;
        EnumC2244751CtV enumC2244751CtV;
        if (Build.VERSION.SDK_INT < 24) {
            return EnumC2244751CtV.UNKOWN;
        }
        try {
            if (str.length() == 0) {
                return EnumC2244751CtV.OTHER;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            str.codePoints().forEach(new IntConsumer() { // from class: X.1CtW
                /* JADX WARN: Code restructure failed: missing block: B:192:0x01d7, code lost:
                
                    if (r10 < 12688) goto L184;
                 */
                /* JADX WARN: Removed duplicated region for block: B:112:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x013e  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x018d  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x01a1  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x01c5  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x01ff  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0211  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x0225  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x022d  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x027f  */
                /* JADX WARN: Removed duplicated region for block: B:232:0x0283  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x00f5  */
                @Override // java.util.function.IntConsumer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(int r10) {
                    /*
                        Method dump skipped, instruction units count: 651
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2244761CtW.accept(int):void");
                }
            });
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                    do {
                        Object next2 = it2.next();
                        int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (enumC2244751CtV = (EnumC2244751CtV) entry.getKey()) == null) {
                return EnumC2244751CtV.OTHER;
            }
            return enumC2244751CtV;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC2244751CtV.UNKOWN;
        }
    }

    public static final int LIZIZ(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        int lineStart = layout.getLineStart(0);
        int lineEnd = layout.getLineEnd(0);
        int ellipsisStart = layout.getEllipsisStart(0);
        if (ellipsisStart == 0) {
            return layout.getText().length();
        }
        if (ellipsisStart != -1) {
            return lineStart + ellipsisStart;
        }
        return lineEnd - lineStart;
    }
}
