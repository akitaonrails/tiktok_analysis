package X;

import android.text.TextUtils;
import android.util.Printer;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2097308Jn implements Printer {
    public final List<Printer> LL = new ArrayList();
    public final List<Printer> LLILLJJLI = new ArrayList();
    public final List<Printer> LLILLL = new ArrayList();
    public boolean LLILZ = false;
    public boolean LLILZIL = false;

    private final void println$redex$base(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>' && this.LLILZIL) {
            for (Object obj : (ArrayList) this.LLILLL) {
                if (!((ArrayList) this.LL).contains(obj)) {
                    ((ArrayList) this.LL).add(obj);
                }
            }
            ((ArrayList) this.LLILLL).clear();
            this.LLILZIL = false;
        }
        ((ArrayList) this.LL).size();
        for (Printer printer : (ArrayList) this.LL) {
            if (printer != null) {
                printer.println(str);
            }
        }
        if (str.charAt(0) == '<' && this.LLILZ) {
            for (Object obj2 : (ArrayList) this.LLILLJJLI) {
                ((ArrayList) this.LL).remove(obj2);
                ((ArrayList) this.LLILLL).remove(obj2);
            }
            ((ArrayList) this.LLILLJJLI).clear();
            this.LLILZ = false;
        }
    }

    private final void println$redex$opt(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>' && this.LLILZIL) {
            ArrayList arrayList = (ArrayList) this.LLILLL;
            int i = 0;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((ArrayList) this.LL).contains(obj)) {
                    ((ArrayList) this.LL).add(obj);
                }
            }
            ((ArrayList) this.LLILLL).clear();
            this.LLILZIL = false;
        }
        ((ArrayList) this.LL).size();
        ArrayList arrayList2 = (ArrayList) this.LL;
        int i2 = 0;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            Printer printer = (Printer) obj2;
            if (printer != null) {
                printer.println(str);
            }
        }
        if (str.charAt(0) == '<' && this.LLILZ) {
            ArrayList arrayList3 = (ArrayList) this.LLILLJJLI;
            int i3 = 0;
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                ((ArrayList) this.LL).remove(obj3);
                ((ArrayList) this.LLILLL).remove(obj3);
            }
            ((ArrayList) this.LLILLJJLI).clear();
            this.LLILZ = false;
        }
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (!ReDexExperimentOpt.getAbTest()) {
            println$redex$base(str);
        } else {
            println$redex$opt(str);
        }
    }
}
