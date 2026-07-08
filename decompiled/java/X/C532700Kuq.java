package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import lnn.q;

/* JADX INFO: renamed from: X.0Kuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532700Kuq extends AbstractC2255721DQs<InterfaceC526620Kl2> implements InterfaceC526620Kl2, InterfaceC379610EuV {
    public static final C532710Kur LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public static final String LLJ = "AlbumAIGCComponent";
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC527980KnE.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC526620Kl2 LLILZIL = this;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Kur] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C532700Kuq.class, "effectAdapterComponent", "getEffectAdapterComponent()Lcom/bytedance/creativex/recorder/sticker/api/EffectAdapterComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C532700Kuq.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C532700Kuq.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLILZLL = new Object() { // from class: X.0Kur
        };
        LLIZLLLIL = 8;
    }

    private final InterfaceC527980KnE X1() {
        return (InterfaceC527980KnE) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    private final q yq() {
        return (q) this.LLILZ.getValue(this, LLIZ[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZ[1]);
    }

    private final void Z1() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        C095D c095dLJJ;
        q qVarYq = yq();
        if (qVarYq == null || (interfaceC1624480sNKC0 = qVarYq.C0()) == null || (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) == null || (c095dLJJ = interfaceC1625470sOvLJII.LJJ()) == null) {
            return;
        }
        C861640Xr8 c861640Xr8 = new C861640Xr8(new C532690Kup(this, null), c095dLJJ);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C09IC.LJJI(C2296808zG.LJII(lifecycleScope, C2107308Nj.LIZ.LLIILII()), c861640Xr8);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC527980KnE interfaceC527980KnEX1 = X1();
        if (interfaceC527980KnEX1 != null) {
            interfaceC527980KnEX1.Fv0(this);
        }
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC527980KnE interfaceC527980KnEX1 = X1();
        if (interfaceC527980KnEX1 != null) {
            interfaceC527980KnEX1.Fv0(null);
        }
    }

    public InterfaceC526620Kl2 W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C532700Kuq(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void o2(boolean z, RecordEffectModel recordEffectModel) {
        CreativeModel creativeModel;
        RecordEffectModel recordEffectModel2;
        ApplyRecordEffectInfo applyRecordEffectInfo;
        boolean z2;
        ApplyRecordEffectInfo applyRecordEffectInfo2;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (recordEffectModel2 = creativeModel.recordEffectModel) != null && (applyRecordEffectInfo = recordEffectModel2.applyRecordEffectInfo) != null) {
            if (!z && recordEffectModel != null && (applyRecordEffectInfo2 = recordEffectModel.applyRecordEffectInfo) != null) {
                z2 = applyRecordEffectInfo2.needShowFailedToastInEditPage;
            } else {
                z2 = false;
            }
            applyRecordEffectInfo.needShowFailedToastInEditPage = z2;
            ApplyRecordEffectInfo applyRecordEffectInfoLIZ = ApplyRecordEffectInfo.LIZ(applyRecordEffectInfo, z);
            recordEffectModel2.applyRecordEffectInfo = applyRecordEffectInfoLIZ;
            if (recordEffectModel != null) {
                recordEffectModel.applyRecordEffectInfo = applyRecordEffectInfoLIZ;
            }
        }
    }

    @Override // X.InterfaceC526620Kl2
    public void Zl2(RecordEffectModel recordEffectModel, boolean z) {
        CreativeModel creativeModel;
        RecordEffectModel recordEffectModel2;
        if (z) {
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (recordEffectModel2 = creativeModel.recordEffectModel) != null) {
                recordEffectModel2.applyRecordEffectInfo = null;
            }
            if (recordEffectModel != null) {
                recordEffectModel.applyRecordEffectInfo = null;
                return;
            }
            return;
        }
        o2(false, recordEffectModel);
    }

    @Override // X.InterfaceC526620Kl2
    public void o71(List<C1621190sI1> list, RecordEffectModel recordEffectModel) {
        q qVarYq = yq();
        if (qVarYq != null) {
            qVarYq.RO(list);
        }
        o2(true, recordEffectModel);
    }
}
