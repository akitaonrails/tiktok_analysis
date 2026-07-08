package X;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0obI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479380obI implements Serializable {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C1479420obM LLILLL;
    public final List<C1477890oYt> LLILZ;

    public final List<C1477890oYt> getCaptionInfos() {
        return this.LLILZ;
    }

    public final boolean getEnableAutoCaption() {
        return this.LL;
    }

    public final boolean getHasOriginalAudio() {
        return this.LLILLJJLI;
    }

    public final C1479420obM getOriginalLanguageInfo() {
        return this.LLILLL;
    }

    public C1479380obI(boolean z, boolean z2, C1479420obM c1479420obM, List<C1477890oYt> list) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c1479420obM;
        this.LLILZ = list;
    }
}
