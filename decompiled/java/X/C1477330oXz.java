package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0oXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477330oXz implements InterfaceC1478280oZW {
    public C1477320oXy LIZ;
    public C1477670oYX LIZIZ;
    public double LIZJ;

    @Override // X.InterfaceC1478280oZW
    public final int getHdrBit() {
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final int getHdrType() {
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final int getBitRate() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getBitRate();
        }
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final String getChecksum() {
        C1477320oXy c1477320oXy = this.LIZ;
        return c1477320oXy != null ? c1477320oXy.getChecksum() : "";
    }

    @Override // X.InterfaceC1478280oZW
    public final long getFps() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getFps();
        }
        return -1L;
    }

    @Override // X.InterfaceC1478280oZW
    public final String getGearName() {
        C1477320oXy c1477320oXy = this.LIZ;
        return c1477320oXy != null ? c1477320oXy.getGearName() : "";
    }

    @Override // X.InterfaceC1478280oZW
    public final int getQualityType() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getQualityType();
        }
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final int getSize() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final String getUrlKey() {
        C1477320oXy c1477320oXy = this.LIZ;
        return c1477320oXy != null ? c1477320oXy.getUrlKey() : "";
    }

    @Override // X.InterfaceC1478280oZW
    public final int getVideoHeight() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getVideoHeight();
        }
        return -1;
    }

    @Override // X.InterfaceC1478280oZW
    public final int getVideoWidth() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.getVideoWidth();
        }
        return -1;
    }

    @Override // X.InterfaceC1478280oZW
    public final int isBytevc1() {
        C1477320oXy c1477320oXy = this.LIZ;
        if (c1477320oXy != null) {
            return c1477320oXy.isBytevc1();
        }
        return 0;
    }

    @Override // X.InterfaceC1478280oZW
    public final List<String> urlList() {
        C1477320oXy c1477320oXy = this.LIZ;
        return c1477320oXy != null ? c1477320oXy.urlList() : Collections.emptyList();
    }
}
