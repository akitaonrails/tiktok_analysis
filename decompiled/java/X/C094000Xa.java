package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wuk.c;

/* JADX INFO: renamed from: X.00Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C094000Xa implements InterfaceC1621520sIY {
    public final List<C00XY> LIZ = new ArrayList();
    public final /* synthetic */ c LIZIZ;

    public final void LIZIZ() {
        List<C00XY> list = this.LIZ;
        c cVar = this.LIZIZ;
        Iterator<C00XY> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(cVar.LIZJ);
        }
        c cVar2 = this.LIZIZ;
        cVar2.LIZIZ.onNext(cVar2.LIZJ);
    }

    public C094000Xa(c cVar) {
        this.LIZIZ = cVar;
    }

    @Override // X.InterfaceC1621520sIY
    public final void LIZ(final AbstractC23051091l abstractC23051091l) {
        ((ArrayList) this.LIZ).add(new C00XY(abstractC23051091l) { // from class: X.00XX
            public final AbstractC23051091l LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00XX) && Intrinsics.LJFF(this.LIZ, ((C00XX) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Add(filter=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = abstractC23051091l;
            }

            @Override // X.C00XY
            public final void LIZ(List<AbstractC23051091l> list) {
                if (!list.contains(this.LIZ)) {
                    list.add(this.LIZ);
                }
            }
        });
    }

    public final void LIZJ(final AbstractC23051091l abstractC23051091l) {
        ((ArrayList) this.LIZ).add(new C00XY(abstractC23051091l) { // from class: X.00XZ
            public final AbstractC23051091l LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00XZ) && Intrinsics.LJFF(this.LIZ, ((C00XZ) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Remove(filter=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = abstractC23051091l;
            }

            @Override // X.C00XY
            public final void LIZ(List<AbstractC23051091l> list) {
                list.remove(this.LIZ);
            }
        });
    }

    public final void LIZLLL(final Function1<? super AbstractC23051091l, Boolean> function1) {
        ((ArrayList) this.LIZ).add(new C00XY(function1) { // from class: X.00XW
            public final Function1<AbstractC23051091l, Boolean> LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00XW) && Intrinsics.LJFF(this.LIZ, ((C00XW) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RemoveWithPredicate(predicate=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function1;
            }

            @Override // X.C00XY
            public final void LIZ(List<AbstractC23051091l> list) {
                Iterator<AbstractC23051091l> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (this.LIZ.invoke(it2.next()).booleanValue()) {
                        it2.remove();
                    }
                }
            }
        });
    }
}
