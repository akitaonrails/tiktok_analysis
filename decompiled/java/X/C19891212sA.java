package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19891212sA implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;
    public final AbstractC19875512pd<Type> LL;
    public final AbstractC19875512pd<Type> LLILLJJLI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return (Type[]) this.LL.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return (Type[]) this.LLILLJJLI.toArray(new Type[0]);
    }

    public final int hashCode() {
        return this.LL.hashCode() ^ this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("?");
        AbstractC19853312m3<Type> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            Type next = it2.next();
            sb.append(" super ");
            sb.append(EnumC19892112sJ.LLILLL.LJFF(next));
        }
        AbstractC19875512pd<Type> abstractC19875512pd = this.LLILLJJLI;
        C1394590mOX c1394590mOX = new C1394590mOX(new C1394600mOY(Object.class));
        abstractC19875512pd.getClass();
        Iterator<Object> it3 = new C19890512s3(abstractC19875512pd, c1394590mOX).iterator();
        while (true) {
            AbstractC19852912lz abstractC19852912lz = (AbstractC19852912lz) it3;
            if (!abstractC19852912lz.hasNext()) {
                return sb.toString();
            }
            Type type = (Type) abstractC19852912lz.next();
            sb.append(" extends ");
            sb.append(EnumC19892112sJ.LLILLL.LJFF(type));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (!this.LL.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.LLILLJJLI.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
            return false;
        }
        return true;
    }

    public C19891212sA(Type[] typeArr, Type[] typeArr2) {
        C19891812sG.LIZ(typeArr, "lower bound for wildcard");
        C19891812sG.LIZ(typeArr2, "upper bound for wildcard");
        EnumC19892112sJ enumC19892112sJ = EnumC19892112sJ.LLILLL;
        this.LL = enumC19892112sJ.LJI(typeArr);
        this.LLILLJJLI = enumC19892112sJ.LJI(typeArr2);
    }
}
