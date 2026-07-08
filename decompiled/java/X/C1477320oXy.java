package X;

import java.util.List;

/* JADX INFO: renamed from: X.0oXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477320oXy implements InterfaceC1478280oZW {
    public final /* synthetic */ InterfaceC1477220oXo LIZ;

    @Override // X.InterfaceC1478280oZW
    public final int getBitRate() {
        return this.LIZ.getBitRate();
    }

    @Override // X.InterfaceC1478280oZW
    public final String getChecksum() {
        return this.LIZ.getChecksum();
    }

    @Override // X.InterfaceC1478280oZW
    public final long getFps() {
        return this.LIZ.getFps();
    }

    @Override // X.InterfaceC1478280oZW
    public final String getGearName() {
        return this.LIZ.getGearName();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getHdrBit() {
        return this.LIZ.getHdrBit();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getHdrType() {
        return this.LIZ.getHdrType();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getQualityType() {
        return this.LIZ.getQualityType();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getSize() {
        return this.LIZ.getSize();
    }

    @Override // X.InterfaceC1478280oZW
    public final String getUrlKey() {
        return this.LIZ.getUrlKey();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getVideoHeight() {
        return this.LIZ.getVideoHeight();
    }

    @Override // X.InterfaceC1478280oZW
    public final int getVideoWidth() {
        return this.LIZ.getVideoWidth();
    }

    @Override // X.InterfaceC1478280oZW
    public final int isBytevc1() {
        return this.LIZ.isBytevc1();
    }

    @Override // X.InterfaceC1478280oZW
    public final List<String> urlList() {
        return this.LIZ.urlList();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimBitRate{bitRate=");
        sbLIZ.append(this.LIZ.getBitRate());
        sbLIZ.append(", gearName='");
        sbLIZ.append(this.LIZ.getGearName());
        sbLIZ.append('\'');
        sbLIZ.append(", qualityType=");
        sbLIZ.append(this.LIZ.getQualityType());
        sbLIZ.append(", isBytevc1=");
        sbLIZ.append(this.LIZ.isBytevc1());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1477320oXy(InterfaceC1477220oXo interfaceC1477220oXo) {
        this.LIZ = interfaceC1477220oXo;
    }
}
