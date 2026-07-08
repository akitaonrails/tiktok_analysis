package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2370809Qs implements ParameterizedType, Type {
    public final Class<?> LL;
    public final Type LLILLJJLI;
    public final Type[] LLILLL;

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.LLILLJJLI;
        if (type != null) {
            sb.append(C2371409Qy.LJ(type));
            sb.append(e3.c);
            sb.append(this.LL.getSimpleName());
        } else {
            sb.append(C2371409Qy.LJ(this.LL));
        }
        Type[] typeArr = this.LLILLL;
        if (typeArr.length != 0) {
            C13LQ.LJJIJIIJIL(typeArr, sb, ", ", "<", ">", -1, "...", C2370909Qt.LL);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode();
        Type type = this.LLILLJJLI;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.LLILLL);
    }

    public final String toString() {
        return getTypeName();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.LLILLL;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.LJFF(this.LL, parameterizedType.getRawType()) && Intrinsics.LJFF(this.LLILLJJLI, parameterizedType.getOwnerType()) && Arrays.equals(this.LLILLL, parameterizedType.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C2370809Qs(Class<?> cls, Type type, List<? extends Type> list) {
        this.LL = cls;
        this.LLILLJJLI = type;
        this.LLILLL = (Type[]) ((ArrayList) list).toArray(new Type[0]);
    }
}
