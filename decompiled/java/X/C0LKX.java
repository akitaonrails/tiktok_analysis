package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LKX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKX extends C09JG {
    public final NLEEditor LIZ;
    public final boolean LIZIZ;

    public C0LKX() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LKX)) {
            return false;
        }
        C0LKX c0lkx = (C0LKX) obj;
        return Intrinsics.LJFF(this.LIZ, c0lkx.LIZ) && this.LIZIZ == c0lkx.LIZIZ;
    }

    public final int hashCode() {
        NLEEditor nLEEditor = this.LIZ;
        return ((nLEEditor == null ? 0 : nLEEditor.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RestoreTaskInput(nleEditor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromCrashRestore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LKX(boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.LIZ = null;
        this.LIZIZ = z;
    }
}
