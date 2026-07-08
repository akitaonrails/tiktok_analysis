package X;

import android.text.TextUtils;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.082T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C082T implements Printer {
    public final List<Printer> LL = new ArrayList();
    public final List<Printer> LLILLJJLI = new ArrayList();
    public final List<Printer> LLILLL = new ArrayList();
    public boolean LLILZ = false;

    @Override // android.util.Printer
    public final void println(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>' && this.LLILZ) {
            for (Object obj : (ArrayList) this.LLILLL) {
                if (!((ArrayList) this.LL).contains(obj)) {
                    ((ArrayList) this.LL).add(obj);
                }
            }
            ((ArrayList) this.LLILLL).clear();
            this.LLILZ = false;
        }
        ((ArrayList) this.LL).size();
        for (Printer printer : (ArrayList) this.LL) {
            if (printer != null && this != printer) {
                printer.println(str);
            }
        }
        str.charAt(0);
    }
}
