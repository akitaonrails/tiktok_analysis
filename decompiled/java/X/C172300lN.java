package X;

import android.util.Printer;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00lN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C172300lN implements Printer {
    public final Printer LL;
    public final Map<String, Integer> LLILLJJLI = new LinkedHashMap();

    public C172300lN(Printer printer) {
        this.LL = printer;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        Printer printer = this.LL;
        if (printer != null) {
            printer.println(str);
        }
        int iIntValue = 0;
        if (str.charAt(0) == '>') {
            Integer num = (Integer) ((LinkedHashMap) this.LLILLJJLI).get(str);
            if (num != null) {
                iIntValue = num.intValue();
            }
            this.LLILLJJLI.put(str, Integer.valueOf(iIntValue + 1));
        }
    }
}
