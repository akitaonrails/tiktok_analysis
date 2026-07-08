package X;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09R1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09R1 implements TypeVariable<GenericDeclaration>, Type {
    public final C09R2 LL;

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<C09RO> upperBounds = this.LL.getUpperBounds();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(upperBounds, 10));
        Iterator<C09RO> it2 = upperBounds.iterator();
        while (it2.hasNext()) {
            arrayList.add(C2371409Qy.LIZ(it2.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.LL.getName();
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("An operation is not implemented: ");
        sbLIZ2.append(strLIZIZ);
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }

    public C09R1(C09R2 c09r2) {
        this.LL = c09r2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && Intrinsics.LJFF(getName(), ((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }
}
