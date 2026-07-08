package X;

import Y.AObjectS185S0300000_25;
import Y.AObjectS244S0100000_18;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0syD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647350syD extends AbstractC2255721DQs<InterfaceC1646510swr> implements InterfaceC379610EuV, InterfaceC1646510swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI = new h0<>(Boolean.FALSE);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646220swO.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647350syD.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647350syD.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1647350syD.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1647350syD.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1647350syD.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJ = 8;
    }

    public InterfaceC1646510swr W1() {
        return this;
    }

    private final InterfaceC1646220swO Kp() {
        return (InterfaceC1646220swO) this.LLIZ.getValue(this, LLIZLLLIL[4]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILZLL.getValue(this, LLIZLLLIL[3]);
    }

    private final void Xi() {
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        LiveEvent<C1646150swH> liveEventMr1;
        C385670FAf<String> c385670FAfJP0;
        C385670FAf<C1649650t1v> c385670FAfXk1;
        List<String> list = C1638590sk5.LIZ;
        h0<Boolean> h0Var = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        InterfaceC1648570t0B recordControlApi = getRecordControlApi();
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        InterfaceC1646220swO interfaceC1646220swOKp = Kp();
        C1647360syE c1647360syE = new C1647360syE(this);
        h0Var.LIZ(this, new AObjectS244S0100000_18(c1647360syE, 0));
        if (recordControlApi != null && (c385670FAfXk1 = recordControlApi.xk1()) != null) {
            c385670FAfXk1.LIZ(this, new AObjectS306S0200000_25((Object) shortVideoContext, (Object) c1647360syE, (InterfaceC1648570t0B) 2));
        }
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS185S0300000_25(interfaceC1646220swOKp, c1647360syE, shortVideoContext, 0));
        }
        if (interfaceC1646220swOKp != null && (liveEventMr1 = interfaceC1646220swOKp.Mr1()) != null) {
            liveEventMr1.LIZ(this, new AObjectS246S0100000_25(c1647360syE, 41));
        }
        if (interfaceC1648020szIOp == null || (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) == null) {
            return;
        }
        bottomTabIndexChangeEvent.LIZ(this, new AObjectS185S0300000_25(interfaceC1646220swOKp, c1647360syE, shortVideoContext, 1));
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        List<CommentStickerModel> list = getShortVideoContext().creativeModel.stickerModel.commentStickerModels;
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS604S0100000_25((List) list, (List<? extends AbstractC1686530tzP>) 80));
        } else {
            C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
            if (c05yf != null) {
                InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
                Iterator<CommentStickerModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    interfaceC1647520syU.lJ(it2.next(), true);
                }
            }
        }
        Xi();
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

    public C1647350syD(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1646510swr
    public void LJJ(boolean z) {
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS37S0010000_25(z, 2));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
        if (c05yf == null) {
            return;
        }
        InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
        List<StickerModel> listLLLILZLLLI = interfaceC1647520syU.LLLILZLLLI(EnumC1466150oFx.COMMENT);
        ArrayList<CommentStickerModel> arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        for (CommentStickerModel commentStickerModel : arrayList) {
            interfaceC1647520syU.J4(commentStickerModel.copy(commentStickerModel.baseStickerModel, commentStickerModel.commentStickerModel, commentStickerModel.alpha, z, commentStickerModel.isCommentDeleted));
        }
    }
}
