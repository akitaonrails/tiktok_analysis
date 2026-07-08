package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;

/* JADX INFO: renamed from: X.0sOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625400sOo implements InterfaceC1622160sJa {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public final C1664750tQH LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1625400sOo.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1622160sJa
    public final int LIZ() {
        return d4.LIZLLL((ShortVideoContext) this.LIZ.getValue(this, LIZIZ[0]));
    }

    @Override // X.InterfaceC1622160sJa
    public final boolean LIZIZ() {
        return d4.LJJIIZI((ShortVideoContext) this.LIZ.getValue(this, LIZIZ[0]));
    }

    @Override // X.InterfaceC1622160sJa
    public final boolean LIZJ() {
        return d4.LJJIJ((ShortVideoContext) this.LIZ.getValue(this, LIZIZ[0]));
    }

    public C1625400sOo(C1DRG c1drg) {
        this.LIZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
    }
}
