package X;

import com.ss.ugc.android.editor.components.base.api.IStickerPreviewService;

/* JADX INFO: renamed from: X.0EB8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EB8 extends AbstractC2255721DQs<InterfaceC372990Ejp> implements InterfaceC372990Ejp, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EB8.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public InterfaceC372990Ejp W1() {
        return this;
    }

    private final C0EOK X1() {
        return (C0EOK) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.InterfaceC372990Ejp
    public int[] LLJLLIL() {
        int[] iArrLLJLLIL;
        C0EOK c0eokX1 = X1();
        return (c0eokX1 == null || (iArrLLJLLIL = c0eokX1.LLJLLIL()) == null) ? new int[]{0, 0, 0, 0} : iArrLLJLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
        if (iStickerPreviewServiceLIZIZ != null) {
            iStickerPreviewServiceLIZIZ.initComponent(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
        if (iStickerPreviewServiceLIZIZ != null) {
            iStickerPreviewServiceLIZIZ.onDestroy();
        }
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

    public C0EB8(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC372990Ejp
    public void O2(boolean z) {
        C0EOK c0eokX1 = X1();
        if (c0eokX1 != null) {
            c0eokX1.O2(z);
        }
    }

    @Override // X.InterfaceC372990Ejp
    public void setVisibility(int i) {
        C0EOK c0eokX1 = X1();
        if (c0eokX1 != null) {
            c0eokX1.setVisibility(i);
        }
    }

    @Override // X.InterfaceC372990Ejp
    public void sq(Integer num, Float f, Float f2) {
        C0EOK c0eokX1 = X1();
        if (c0eokX1 != null) {
            c0eokX1.sq(num, f, f2);
        }
    }

    @Override // X.InterfaceC372990Ejp
    public void setDisplayPos(int i, int i2, int i3, int i4) {
        C0EOK c0eokX1 = X1();
        if (c0eokX1 != null) {
            c0eokX1.setDisplayPos(i, i2, i3, i4);
        }
    }
}
