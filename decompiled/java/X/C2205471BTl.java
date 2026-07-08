package X;

import X.C1BU1;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.1BTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205471BTl<T extends C1BU1> implements C1BUC, InterfaceC1177120gjm<T> {
    public final T LIZ;
    public final C1BSB LIZIZ;
    public final LatLng LIZJ;
    public final Set<T> LIZLLL;

    public C2205471BTl() {
        throw null;
    }

    @Override // X.InterfaceC1177120gjm
    public final int getSize() {
        return 1;
    }

    @Override // X.InterfaceC1177120gjm
    public final C1178490glz getPosition() {
        LatLng latLng = this.LIZJ;
        return new C1178490glz(latLng.latitude, latLng.longitude);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuadItem{mClusterItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1BUC
    public final C1BSB LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1177120gjm
    public final /* bridge */ /* synthetic */ Collection getItems() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2205471BTl(C1BU1 c1bu1) {
        this.LIZ = c1bu1;
        LatLng latLngLIZ = C1BSE.LIZ(c1bu1.getPosition());
        this.LIZJ = latLngLIZ;
        this.LIZIZ = C2205481BTm.LJ.LIZIZ(latLngLIZ);
        this.LIZLLL = Collections.singleton(c1bu1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2205471BTl)) {
            return false;
        }
        return ((C2205471BTl) obj).LIZ.equals(this.LIZ);
    }
}
