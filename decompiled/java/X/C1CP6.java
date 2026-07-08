package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1CP6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP6 extends AbstractC2255721DQs<C1CPB> implements C1CPB, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(119));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 74));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1CP6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    private final C1CP7 Z1() {
        return (C1CP7) this.LLILLL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] */
    public C1CPB getApiComponent() {
        return (C1CPB) this.LLILZ.getValue();
    }

    @Override // X.C1CPB
    public void U21() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        AbstractC1452680nuE abstractC1452680nuEGc;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2;
        Z1().getClass();
        C1CP7.LIZJ();
        AbstractC1452680nuE abstractC1452680nuEGc2 = X1().gc();
        if ((abstractC1452680nuEGc2 != null ? abstractC1452680nuEGc2.LJJ().getState() : null) != VEEditor.VEState.IDLE && (abstractC1452680nuEGc = X1().gc()) != null && (vEEditorAutoStartStopArbiter2 = abstractC1452680nuEGc.LJFF) != null && vEEditorAutoStartStopArbiter2.LLJI) {
            AbstractC1452680nuE abstractC1452680nuEGc3 = X1().gc();
            if (abstractC1452680nuEGc3 != null) {
                abstractC1452680nuEGc3.LJJ().Xe();
            }
            X1().F32(true);
        }
        AbstractC1452680nuE abstractC1452680nuEGc4 = X1().gc();
        if (abstractC1452680nuEGc4 == null || (vEEditorAutoStartStopArbiter = abstractC1452680nuEGc4.LJFF) == null) {
            return;
        }
        vEEditorAutoStartStopArbiter.LLJI = false;
    }

    @Override // X.C1CPB
    public void gi1() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        AbstractC1452680nuE abstractC1452680nuEGc = X1().gc();
        if (abstractC1452680nuEGc != null && (vEEditorAutoStartStopArbiter = abstractC1452680nuEGc.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LLJI = true;
        }
        C1CP7 c1cp7Z1 = Z1();
        AbstractC1452680nuE abstractC1452680nuEGc2 = X1().gc();
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc2 != null ? abstractC1452680nuEGc2.LJJ() : null;
        EnumC856530Xit enumC856530Xit = EnumC856530Xit.AUDIO_LOOP;
        c1cp7Z1.getClass();
        C1CP7.LJFF = interfaceC1452170ntPLJJ;
        C1CP7.LIZIZ = enumC856530Xit;
        C1CP7.LIZ().clear();
        C1CP7.LIZIZ(C1CP8.INITIALIZED);
        C1CP7.LIZLLL(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Z1().getClass();
        C1CP8 c1cp8 = C1CP7.LJI;
        C1CP8 c1cp82 = C1CP8.UNINITIALIZED;
        if (c1cp8 != c1cp82) {
            C1CP7.LJFF = null;
            C1CP7.LIZ().clear();
        }
        C1CP7.LIZIZ(c1cp82);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        U21();
        AbstractC1452680nuE abstractC1452680nuEGc = X1().gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJIIJ(true);
        }
        X1().F32(false);
        Z1().getClass();
        C1CP7.LIZIZ(C1CP8.IDLE);
        super.onResume();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1CP6(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
