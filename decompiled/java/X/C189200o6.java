package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C189200o6<T> implements Serializable {
    public static final C189300o7 Companion;
    public final Object LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.00o7] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Object(defaultConstructorMarker) { // from class: X.00o7
        };
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C189200o6 m1boximpl(Object obj) {
        return new C189200o6(obj);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m2constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C189200o6) && Intrinsics.LJFF(obj, ((C189200o6) obj2).m10unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.LJFF(obj, obj2);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return m3equalsimpl(this.LL, obj);
    }

    public int hashCode() {
        return m6hashCodeimpl(this.LL);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m10unboximpl() {
        return this.LL;
    }

    public String toString() {
        return m9toStringimpl(this.LL);
    }

    public /* synthetic */ C189200o6(Object obj) {
        this.LL = obj;
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m5exceptionOrNullimpl(Object obj) {
        if (obj instanceof C098200Yq) {
            return ((C098200Yq) obj).exception;
        }
        return null;
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m7isFailureimpl(Object obj) {
        return obj instanceof C098200Yq;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m8isSuccessimpl(Object obj) {
        return !(obj instanceof C098200Yq);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m9toStringimpl(Object obj) {
        if (obj instanceof C098200Yq) {
            return ((C098200Yq) obj).toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(");
        sbLIZ.append(obj);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
