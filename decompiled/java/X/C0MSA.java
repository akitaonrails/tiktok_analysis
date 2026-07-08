package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MSA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSA extends AbstractC1658550tGH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final InterfaceC1731706qJ LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MSA.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = 8;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC1658550tGH
    public CreativeModel Z1() {
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null) {
            return editModel.creativeModel;
        }
        return null;
    }

    public C0MSA(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
