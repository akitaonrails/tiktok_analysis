package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371209Qw implements WildcardType, Type {
    public static final C2371309Qx LLILLL;
    public static final C2371209Qw LLILZ = new C2371209Qw(null, null);
    public final Type LL;
    public final Type LLILLJJLI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.LL;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09Qx] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLL = new Object(defaultConstructorMarker) { // from class: X.09Qx
        };
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.LLILLJJLI;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        if (this.LLILLJJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("? super ");
            sbLIZ.append(C2371409Qy.LJ(this.LLILLJJLI));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        Type type = this.LL;
        if (type == null || Intrinsics.LJFF(type, Object.class)) {
            return "?";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("? extends ");
        sbLIZ2.append(C2371409Qy.LJ(this.LL));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C2371209Qw(Type type, Type type2) {
        this.LL = type;
        this.LLILLJJLI = type2;
    }
}
