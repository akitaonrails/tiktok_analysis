package X;

import Y.AfS177S0100000_8;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LI2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LI2 extends AbstractC2255721DQs<C0LI4> implements C0LI4, InterfaceC379610EuV {
    public static final C0LI3 LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public boolean LLILZ;
    public InterfaceC420801kM LLILZLL;
    public final C11RK<Boolean> LLILLJJLI = new C11RK<>();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 349));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0LI3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LI2.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0LI3
        };
        LLJ = 8;
    }

    public C0LI4 W1() {
        return this;
    }

    private final boolean X1() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILZLL = this.LLILLJJLI.LJIL(((Number) C0BRV.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 16));
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

    public C0LI2(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void Z1(boolean z) {
        if (this.LLILZ) {
            return;
        }
        this.LLILLJJLI.onNext(Boolean.valueOf(z));
    }

    public final void G2(boolean z) {
        if (!z && !getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PUGCTemplateAutoSaveDraftComponet saveDraftInternal ");
            sbLIZ.append(getLifecycle().getCurrentState());
            C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        if (X1()) {
            C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), LJJJLIIL(), LJJJLIIL().getCreationId(), 1, new AwS587S0100000_8(this, 254), 8);
            return;
        }
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "PUGCTemplateAutoSaveDraftComponet saveDraftInternal save draft");
        LJJJLIIL().creativeModel.draftInfoModel.saveDraftScene = "silence";
        C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C0LI1(this, null), 3);
    }

    @Override // X.C0LI4
    public void Qk(boolean z) {
        Z1(false);
    }

    public final void w2(C540340LHc c540340LHc) {
        this.LLILZ = false;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUGCTemplateAutoSaveDraftComponet saveDraftInternal save draft done ");
        sbLIZ.append(c540340LHc.LIZ.isSuc());
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
    }
}
