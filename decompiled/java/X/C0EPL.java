package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EPL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPL extends AbstractC2255721DQs<C0EPP> implements C0EPP, InterfaceC379610EuV {
    public static final int LLILLL = 8;
    public final C1DRG LL;
    public final C0EPN LLILLJJLI;

    public C0EPP W1() {
        return this;
    }

    @Override // X.C0EPP
    public String LLIILZL() {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            return c0epn.LLIILZL();
        }
        return null;
    }

    @Override // X.C0EPP
    public C364440EQo LLLZIL() {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            return c0epn.LLLZIL();
        }
        return null;
    }

    @Override // X.C0EPP
    public C364440EQo u4() {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            return c0epn.LLLZIL();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0EPP
    public void LLJJL(C364440EQo c364440EQo) {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            c0epn.LLJJL(c364440EQo);
        }
    }

    @Override // X.C0EPP
    public void LLLLZIL(String str) {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            c0epn.LLLLZIL(str);
        }
    }

    @Override // X.C0EPP
    public void q(C364440EQo c364440EQo) {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            c0epn.LLJJL(c364440EQo);
        }
    }

    public C0EPL(C1DRG c1drg, C0EPN c0epn) {
        this.LL = c1drg;
        this.LLILLJJLI = c0epn;
    }

    @Override // X.C0EPP
    public AbstractC2217051Bpv LLLFFI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C0EPN c0epn = this.LLILLJJLI;
        if (c0epn != null) {
            return c0epn.LLLFFI(videoPublishEditModel, z);
        }
        return null;
    }
}
