package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577700r9s implements InterfaceC1853660yKy {
    public final RecyclerView LIZ;
    public final C2252331DDr LIZIZ;
    public final C2252331DDr LIZJ;
    public final C1577690r9r LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1853660yKy
    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZ.addOnChildAttachStateChangeListener(this.LIZLLL);
    }

    @Override // X.InterfaceC1853660yKy
    public final void LJI() {
        if (this.LJ) {
            this.LJ = false;
            this.LIZ.removeOnChildAttachStateChangeListener(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC1853660yKy
    public final C2252331DDr getEvents() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0r9r] */
    public C1577700r9s(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 8, EnumC2252401DDy.DROP_OLDEST);
        this.LIZIZ = c2252331DDrLIZ;
        this.LIZJ = c2252331DDrLIZ;
        this.LIZLLL = new InterfaceC21676519sR() { // from class: X.0r9r
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                LIZ(view, true);
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
                LIZ(view, false);
            }

            public final void LIZ(View view, boolean z) {
                Integer numValueOf = Integer.valueOf(this.LL.LIZ.getChildAdapterPosition(view));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                this.LL.LIZIZ.LIZJ(new C1557630qdV(new InterfaceC1557660qdY(z, numValueOf) { // from class: X.00DD
                    public final boolean LIZ;
                    public final Integer LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C00DD)) {
                            return false;
                        }
                        C00DD c00dd = (C00DD) obj;
                        return this.LIZ == c00dd.LIZ && Intrinsics.LJFF(this.LIZIZ, c00dd.LIZIZ);
                    }

                    public final int hashCode() {
                        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
                        Integer num = this.LIZIZ;
                        return iZ2 + (num == null ? 0 : num.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ChildAttachChanged(attached=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", layoutPosition=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = z;
                        this.LIZIZ = numValueOf;
                    }
                }));
            }
        };
    }
}
