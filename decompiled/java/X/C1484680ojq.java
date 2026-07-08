package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ojq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484680ojq {
    public final C1482580ogS LIZ;

    public final C1482560ogQ LIZ() {
        C1482580ogS c1482580ogS = this.LIZ;
        if (c1482580ogS.LJFF == null && TextUtils.isEmpty(c1482580ogS.LIZ)) {
            this.LIZ.getClass();
            throw new IllegalArgumentException("SourceID is required.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (final C1058540deW c1058540deW : (ArrayList) this.LIZ.LIZJ) {
            InterfaceC1479740obs interfaceC1479740obs = new InterfaceC1479740obs() { // from class: X.0ojw
                @Override // X.InterfaceC1479740obs
                public final int LJIIIZ() {
                    return c1058540deW.LIZJ;
                }

                @Override // X.InterfaceC1479740obs
                public final String LJIIJ() {
                    return c1058540deW.LJII;
                }

                @Override // X.InterfaceC1479740obs
                public final String LJIIJJI() {
                    return this.LIZIZ.LIZ.LIZ;
                }

                @Override // X.InterfaceC1479740obs
                public final String getAccessKey() {
                    return c1058540deW.LJFF;
                }

                @Override // X.InterfaceC1479740obs
                public final int getBitRate() {
                    C1484750ojx c1484750ojx = c1058540deW.LJI;
                    if (c1484750ojx == null) {
                        return 0;
                    }
                    return c1484750ojx.LIZ;
                }

                @Override // X.InterfaceC1479740obs
                public final String getGearName() {
                    C1484750ojx c1484750ojx = c1058540deW.LJI;
                    if (c1484750ojx == null) {
                        return null;
                    }
                    return c1484750ojx.LIZIZ;
                }

                @Override // X.InterfaceC1479740obs
                public final String getKey() {
                    return c1058540deW.LIZIZ;
                }

                @Override // X.InterfaceC1479740obs
                public final int getQualityType() {
                    C1484750ojx c1484750ojx = c1058540deW.LJI;
                    if (c1484750ojx == null) {
                        return 0;
                    }
                    return c1484750ojx.LIZJ;
                }

                @Override // X.InterfaceC1479740obs
                public final long getSize() {
                    return c1058540deW.LJ;
                }

                @Override // X.InterfaceC1479740obs
                public final String getUri() {
                    c1058540deW.getClass();
                    return null;
                }

                @Override // X.InterfaceC1479740obs
                public final List<String> getUrls() {
                    return c1058540deW.LIZLLL;
                }
            };
            if (c1058540deW.LJI == null) {
                arrayList.add(interfaceC1479740obs);
            } else {
                arrayList2.add(interfaceC1479740obs);
            }
        }
        if (this.LIZ.LJFF == null && arrayList.size() == 0 && this.LIZ.LIZLLL == null) {
            throw new IllegalArgumentException("PlayItem or DashItem is required.");
        }
        return new C1482560ogQ(this, arrayList, arrayList2);
    }

    public C1484680ojq(C1482580ogS c1482580ogS) {
        this.LIZ = c1482580ogS;
    }
}
