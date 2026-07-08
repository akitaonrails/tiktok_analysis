package X;

import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: X.0pxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531870pxx extends AbstractC1532350pyj<C1531820pxs> {
    public final C1532340pyi LIZJ;

    @Override // X.AbstractC1532350pyj
    public final AbstractC1532350pyj<C1531820pxs> LIZ(C1532710pzJ c1532710pzJ) {
        return this;
    }

    @Override // X.AbstractC1532350pyj
    public final void LIZLLL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final Integer LIZJ() {
        return ((C1531820pxs) this.LIZ).LIZIZ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1531870pxx(final C1531820pxs c1531820pxs) {
        super(c1531820pxs, C1531820pxs.class);
        this.LIZJ = new C1532340pyi(this, new C1530890pwN() { // from class: X.0pxy
            @Override // X.C1530890pwN, X.InterfaceC1532190pyT
            public final String getFilepath() {
                File fileLJII = c1531820pxs.LJII();
                if (fileLJII != null) {
                    return fileLJII.getAbsolutePath();
                }
                return null;
            }

            @Override // X.C1530890pwN, X.InterfaceC1532190pyT
            public final Map<String, String> getHttpResponseHeaders() {
                return c1531820pxs.LJ();
            }

            @Override // X.C1530890pwN, X.InterfaceC1532190pyT
            public final Integer getResourceSize() {
                return c1531820pxs.LIZIZ();
            }

            @Override // X.C1530890pwN, X.InterfaceC1532190pyT
            public final String getResourceUniqueId() {
                return c1531820pxs.LJ;
            }

            @Override // X.C1530890pwN, X.InterfaceC1532190pyT
            public final Long getVersion() {
                C1531820pxs c1531820pxs2 = c1531820pxs;
                Long l = c1531820pxs2.LIZ;
                return l == null ? c1531820pxs2.LJFF : l;
            }

            {
                super(null, null, null, null, null, 31);
            }
        });
    }
}
