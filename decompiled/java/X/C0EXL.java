package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EXL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXL implements InterfaceC350220DoC, InterfaceC379610EuV, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final Function1<VideoPublishEditModel, Unit> LLILLJJLI;
    public final C1664750tQH LLILLL;
    public String LLILZ = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXL.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
    }

    public final InterfaceC1446740nke LJI() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035c  */
    @Override // X.InterfaceC350220DoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0EMN r20) {
        /*
            Method dump skipped, instruction units count: 1619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXL.LIZLLL(X.0EMN):void");
    }

    public C0EXL(C1DRG c1drg, AwS584S0100000_5 awS584S0100000_5) {
        this.LL = c1drg;
        this.LLILLJJLI = awS584S0100000_5;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
    }
}
