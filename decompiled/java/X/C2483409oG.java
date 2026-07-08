package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.09oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2483409oG extends Exception {
    public static final long serialVersionUID = 1;
    public final List<Throwable> LL;

    public Throwable[] getCauses() {
        List<Throwable> list = this.LL;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    public List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.LL;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add(th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public List<Throwable> getInnerThrowables() {
        return this.LL;
    }

    public C2483409oG(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.LL) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.LL) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2483409oG(String str, List<? extends Throwable> list) {
        Throwable th;
        if (list != null && list.size() > 0) {
            th = (Throwable) ListProtector.get(list, 0);
        } else {
            th = null;
        }
        super(str, th);
        this.LL = Collections.unmodifiableList(list);
    }

    public C2483409oG(String str, Throwable[] thArr) {
        this(str, (List<? extends Throwable>) Arrays.asList(thArr));
    }
}
