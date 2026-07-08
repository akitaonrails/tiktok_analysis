package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;

/* JADX INFO: renamed from: X.0ELp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363150ELp extends AbstractC381020Ewm<InterfaceC363170ELr> implements InterfaceC363170ELr, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C363150ELp.class, "trackGenerateApi", "getTrackGenerateApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/i2v/I2vTrackGeneratingApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public InterfaceC363170ELr X1() {
        return this;
    }

    public final InterfaceC363160ELq Z1() {
        return (InterfaceC363160ELq) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC363170ELr
    public void start() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI;
        NLETrackSlot nLETrackSlotDI2 = Z1().dI2("", "", new C0ELT("/data/data/com.ss.android.ugc.trill/files/mask_test.png", 6000L, 0L, null, null, null, null, null, 0.0f, null, true, null, false, false, false, 31740), false, new EditorProAIGCTemplateModel(null, null, null, null, null, null, null, 0, null, 511, null));
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (interfaceC351350Dq1LLFII = c0e48W1.LLFII()) != null && (nLEEditorLJI = interfaceC351350Dq1LLFII.LJI()) != null) {
            C350410DoV.LIZLLL(nLEEditorLJI, true, null, false, true);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C363140ELo(this, nLETrackSlotDI2, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C363150ELp(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC363160ELq.class, null);
    }
}
