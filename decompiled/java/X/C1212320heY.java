package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0heY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212320heY<T> {
    public final String LIZ;
    public final Function2<T, T, T> LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccessibilityKey: ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1212320heY(String str) {
        this(str, new C1212250heR());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1212320heY(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.LIZ = str;
        this.LIZIZ = function2;
    }

    public C1212320heY(String str, int i) {
        this(str);
        this.LIZJ = true;
    }

    public C1212320heY(String str, Function2 function2, boolean z) {
        this(str, function2);
        this.LIZJ = z;
    }
}
