package X;

import Y.AObjectS246S0100000_25;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0syx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647810syx extends AbstractC2255721DQs<InterfaceC1646830sxN> implements InterfaceC1646830sxN, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public DMGroupChatStickerModel LLILZIL;
    public final C1647810syx LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final C1647820syy LLILZLL = new C0FUD() { // from class: X.0syy
        @Override // X.C0FUD
        public final boolean LJIILIIL() {
            return true;
        }

        @Override // X.C0FUD
        public final boolean LJIILJJIL(int i) {
            return true;
        }

        @Override // X.C0FUD
        public final boolean LJIJJLI(float f, float f2, int i, RectF rectF, EnumC1466150oFx enumC1466150oFx) {
            return true;
        }

        @Override // X.C0FUD
        public final boolean LJJIFFI(float f, int i, RectF rectF) {
            return true;
        }

        @Override // X.C0FUD
        public final boolean LJJII(float f, int i, RectF rectF) {
            return true;
        }

        @Override // X.C0FUD
        public final boolean LJJIIJ(int i) {
            return true;
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647810syx.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647810syx.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZLLLIL = 8;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public final DMGroupChatStickerModel o2() {
        return (DMGroupChatStickerModel) C13LP.LJJJLL(getShortVideoContext().creativeModel.stickerModel.dmGroupChatStickerModel);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS604S0100000_25(this, 90));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
        if (c05yf != null) {
            InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
            getRecordControlApi().lC2().LIZ(this, new AObjectS246S0100000_25(interfaceC1647520syU, 113));
            getRecordControlApi().Vt0().LIZ(this, new AObjectS246S0100000_25(interfaceC1647520syU, 114));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS604S0100000_25(this, 91));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
        if (c05yf != null) {
            InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
            interfaceC1647520syU.mF(new AwS426S0200000_25(interfaceC1647520syU, this, 32));
        }
    }

    public C1647810syx Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0syy] */
    public C1647810syx(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void X1(C0FTJ<? extends StickerModel> c0ftj) {
        C0FFE c0ffe;
        c0ftj.setAlpha(0.6f);
        if ((c0ftj instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj) != null) {
            c0ffe.LJJIIZ(this.LLILZLL);
        }
        c0ftj.setVisible(true);
    }

    public final void W1(InterfaceC1647520syU interfaceC1647520syU, DMGroupChatStickerModel dMGroupChatStickerModel) {
        interfaceC1647520syU.lJ(dMGroupChatStickerModel, false);
        C0FTJ c0ftj = (C0FTJ) C13LP.LJJJLL(interfaceC1647520syU.LLLLLZ(EnumC1466150oFx.DM_GROUP_CHAT));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1647400syI(c0ftj, this, null), 3);
    }
}
