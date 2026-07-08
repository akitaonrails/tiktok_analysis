package X;

import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0Kxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534630Kxx extends AbstractC2255721DQs<InterfaceC534640Kxy> implements InterfaceC534640Kxy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19GS.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C534630Kxx.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C534630Kxx.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    public InterfaceC534640Kxy X1() {
        return this;
    }

    private final C19GS W1() {
        return (C19GS) this.LLILLL.getValue(this, LLILZ[1]);
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    private final void o2() {
        String effectId;
        Effect effect;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", C1428470nHB.LJIILL(Z1()));
        c0lab.LJ("enter_from", Z1().getEnterFrom());
        ApplyRecordEffectInfo applyRecordEffectInfo = Z1().creativeModel.recordEffectModel.applyRecordEffectInfo;
        if (applyRecordEffectInfo == null || (effect = applyRecordEffectInfo.curEffect) == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        c0lab.LJ("prop_id", effectId);
        C20684815ws.LJIILLIIL("ttcrt_content_couldnot_apply_toast", c0lab.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        ApplyRecordEffectInfo applyRecordEffectInfo = Z1().creativeModel.recordEffectModel.applyRecordEffectInfo;
        if (applyRecordEffectInfo != null && applyRecordEffectInfo.needShowFailedToastInEditPage) {
            C19GS c19gsW1 = W1();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833504);
            creativeToastBuilder.duration(3000L);
            C1390380mHk.LIZ(c19gsW1, 11000, creativeToastBuilder);
            o2();
        }
        Z1().creativeModel.recordEffectModel.applyRecordEffectInfo = null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C534630Kxx(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
