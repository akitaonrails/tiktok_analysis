package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453570nvf extends i<InterfaceC1453790nw1, C1428120nGc, C1428140nGe, Unit> implements InterfaceC1453790nw1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final Function0<C1428140nGe> LLJJ;
    public final Function0<Unit> LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453570nvf.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = 8;
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJILLL.getValue(this, LLJJIII[0]);
    }

    @Override // X.InterfaceC1453790nw1
    public void I4() {
        show();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1428140nGe> o2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1453790nw1
    public void pu() {
        hide();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJJI;
    }

    public C1453570nvf(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJ = new AwS566S0100000_22(this, 133);
        this.LLJJI = AFwS210S0000000_22.get$arr$(76);
    }
}
