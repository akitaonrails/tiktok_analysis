package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0oXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1477120oXe implements InterfaceC1477220oXo {
    public InterfaceC1477220oXo LL;
    public InterfaceC1477220oXo LLILZ;
    public C1477070oXZ LLILZIL;
    public double LLILZLL;
    public String LLILLJJLI = "";
    public int LLILLL = -1;
    public StringBuilder LLIZ = new StringBuilder();
    public String LLIZLLLIL = "non";

    @Override // X.InterfaceC1477220oXo
    public final String getAudioFileId() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        return interfaceC1477220oXo != null ? interfaceC1477220oXo.getAudioFileId() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public final int getBitRate() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getBitRate();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public final String getChecksum() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        return interfaceC1477220oXo != null ? interfaceC1477220oXo.getChecksum() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public final long getFps() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getFps();
        }
        return -1L;
    }

    @Override // X.InterfaceC1477220oXo
    public final String getGearName() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        return interfaceC1477220oXo != null ? interfaceC1477220oXo.getGearName() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public final int getHdrBit() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getHdrBit();
        }
        return 8;
    }

    @Override // X.InterfaceC1477220oXo
    public final int getHdrType() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getHdrType();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public final int getQualityType() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getQualityType();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public final int getSize() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public final String getUrlKey() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        return interfaceC1477220oXo != null ? interfaceC1477220oXo.getUrlKey() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public final int getVideoHeight() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getVideoHeight();
        }
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public final int getVideoWidth() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.getVideoWidth();
        }
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public final int isBytevc1() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        if (interfaceC1477220oXo != null) {
            return interfaceC1477220oXo.isBytevc1();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public final List<String> urlList() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.LL;
        return interfaceC1477220oXo != null ? interfaceC1477220oXo.urlList() : Collections.emptyList();
    }
}
