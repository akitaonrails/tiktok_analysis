package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0VYA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYA extends RuntimeException {
    public static final long serialVersionUID = 3026362227162912146L;
    public final List<Throwable> LL;
    public final String LLILLJJLI;
    public C0VYD LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0VYD] */
    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.LLILLL == null) {
            ?? r6 = new RuntimeException() { // from class: X.0VYD
                public static final long serialVersionUID = 3875212506787802066L;

                @Override // java.lang.Throwable
                public final String getMessage() {
                    return "Chain of Causes for CompositeException In Order Received =>";
                }
            };
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it2 = this.LL.iterator();
            ?? r4 = r6;
            while (it2.hasNext()) {
                Throwable next = it2.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th : arrayList) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        r4.initCause(next);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    Throwable cause3 = r4.getCause();
                    if (cause3 != null && r4 != cause3) {
                        do {
                            r4 = cause3;
                            cause3 = cause3.getCause();
                            if (cause3 != null) {
                            }
                        } while (cause3 != r4);
                    }
                }
            }
            this.LLILLL = r6;
        }
        return this.LLILLL;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.LL.size();
    }

    public List<Throwable> getExceptions() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public C0VYA(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C0VYA) {
                    linkedHashSet.addAll(((C0VYA) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.LL = listUnmodifiableList;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(listUnmodifiableList.size());
            sbLIZ.append(" exceptions occurred. ");
            this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final void LIZIZ(C0VYE c0vye) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.LL) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            LIZ(sb, th, "\t");
            i++;
        }
        c0vye.LIZ(sb.toString());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(final PrintStream printStream) {
        LIZIZ(new C0VYE(printStream) { // from class: X.0VYC
            public final PrintStream LIZ;

            {
                this.LIZ = printStream;
            }

            @Override // X.C0VYE
            public final void LIZ(Object obj) {
                this.LIZ.println(obj);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0VYA(Throwable... thArr) {
        List listAsList;
        if (thArr == null) {
            listAsList = Collections.singletonList(new NullPointerException("exceptions was null"));
        } else {
            listAsList = Arrays.asList(thArr);
        }
        this(listAsList);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(final PrintWriter printWriter) {
        LIZIZ(new C0VYE(printWriter) { // from class: X.0VYB
            public final PrintWriter LIZ;

            {
                this.LIZ = printWriter;
            }

            @Override // X.C0VYE
            public final void LIZ(Object obj) {
                this.LIZ.println(obj);
            }
        });
    }

    public static void LIZ(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            LIZ(sb, th.getCause(), "");
        }
    }
}
