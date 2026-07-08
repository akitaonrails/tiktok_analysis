package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0MSB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSB extends AbstractC1658550tGH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final InterfaceC1731706qJ LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MSB.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = 8;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC1658550tGH
    public CreativeModel Z1() {
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null) {
            return shortVideoContext.creativeModel;
        }
        return null;
    }

    public C0MSB(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    }
}
