package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0syS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647500syS extends AbstractC2255721DQs<InterfaceC1646860sxQ> implements InterfaceC1646860sxQ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647500syS.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647500syS.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    @Override // X.InterfaceC1646860sxQ
    public boolean ES0() {
        return true;
    }

    public InterfaceC1646860sxQ W1() {
        return this;
    }

    private final InterfaceC1647520syU getInfiniStickerApi() {
        return (InterfaceC1647520syU) this.LLILLL.getValue(this, LLILZ[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC1646860sxQ
    public void J2() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ c0ftj;
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi == null || (listLLLLLZ = infiniStickerApi.LLLLLZ(EnumC1466150oFx.SECRET_REPLIES)) == null || (c0ftj = (C0FTJ) C13LP.LJJJLL(listLLLLLZ)) == null) {
            InterfaceC1647520syU infiniStickerApi2 = getInfiniStickerApi();
            if (infiniStickerApi2 != null) {
                infiniStickerApi2.mn2(EnumC1466150oFx.SECRET_REPLIES, "secret_reply_enter_from", AFwS266S0000000_25.get$arr$(112));
                return;
            }
            return;
        }
        ES0();
        InterfaceC1647520syU infiniStickerApi3 = getInfiniStickerApi();
        if (infiniStickerApi3 != null) {
            infiniStickerApi3.TQ(EnumC1466150oFx.SECRET_REPLIES, c0ftj.getStickerId());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC1647520syU.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647520syU.class, new AwS604S0100000_25(this, 111));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        ES0();
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

    public C1647500syS(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
