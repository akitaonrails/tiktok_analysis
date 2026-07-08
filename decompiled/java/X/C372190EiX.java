package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372190EiX extends AbstractC2255721DQs<C0EPM> implements C0EPM, InterfaceC379610EuV {
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public C2217061Bpw LLILLJJLI;
    public C364440EQo LLILLL = new C364440EQo();
    public C364440EQo LLILZ = new C364440EQo();
    public String LLILZIL = "";
    public String LLILZLL = "";

    public C0EPM W1() {
        return this;
    }

    @Override // X.C0EPM
    public String LLIILZL() {
        return this.LLILZIL;
    }

    @Override // X.C0EPM
    public C364440EQo LLLZIL() {
        return this.LLILLL;
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

    @Override // X.C0EPM
    public String iH() {
        return this.LLILZLL;
    }

    @Override // X.C0EPM
    public C364440EQo u4() {
        return this.LLILZ;
    }

    public C372190EiX(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0EPM
    public void LLJJL(C364440EQo c364440EQo) {
        this.LLILLL = c364440EQo;
    }

    @Override // X.C0EPM
    public void LLLLZIL(String str) {
        if (str == null) {
            str = "";
        }
        this.LLILZIL = str;
    }

    @Override // X.C0EPM
    public void c40(String str) {
        if (str == null) {
            str = "";
        }
        this.LLILZLL = str;
    }

    @Override // X.C0EPM
    public void q(C364440EQo c364440EQo) {
        this.LLILZ = c364440EQo;
    }

    @Override // X.C0EPM
    public AbstractC2217051Bpv LLLFFI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C2217061Bpw c2217061Bpw = this.LLILLJJLI;
        if (c2217061Bpw != null) {
            if (videoPublishEditModel == null) {
                videoPublishEditModel = c2217061Bpw.LIZ;
            }
            c2217061Bpw.LIZ = videoPublishEditModel;
            c2217061Bpw.LJFF = !z;
            return c2217061Bpw;
        }
        if (videoPublishEditModel == null) {
            return null;
        }
        C2217061Bpw c2217061Bpw2 = new C2217061Bpw(videoPublishEditModel);
        c2217061Bpw2.LJFF = !z;
        this.LLILLJJLI = c2217061Bpw2;
        return c2217061Bpw2;
    }
}
