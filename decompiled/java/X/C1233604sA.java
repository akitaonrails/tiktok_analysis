package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1233604sA implements InterfaceC460300I3g {
    public final String LIZIZ;
    public final Function1<Context, CharSequence> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextOnDemand(id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", getTextConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        C1233604sA c1233604sA;
        if (this == obj) {
            return true;
        }
        String str = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1233604sA.class, cls)) {
            return false;
        }
        String str2 = this.LIZIZ;
        if ((obj instanceof C1233604sA) && (c1233604sA = (C1233604sA) obj) != null) {
            str = c1233604sA.LIZIZ;
        }
        if (Intrinsics.LJFF(str2, str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1233604sA(String str, Function1<? super Context, ? extends CharSequence> function1) {
        this.LIZIZ = str;
        this.LIZJ = function1;
    }
}
