package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lnn.q;

/* JADX INFO: renamed from: X.0syd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647610syd extends AbstractC2255721DQs<InterfaceC1646780sxI> implements InterfaceC1646780sxI, InterfaceC379610EuV {
    public static final C1647660syi LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1646780sxI LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647650syh.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public InterfaceC1441305kZ<Long> LLIZ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0syi] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647610syd.class, "simpleCountDownApi", "getSimpleCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/countdown/SimpleCountDownApi;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1647610syd.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1647610syd.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1647610syd.class, "commonCameraApiComponent", "getCommonCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0syi
        };
        LLJI = 8;
    }

    public final void W1() {
        InterfaceC1441305kZ<Long> interfaceC1441305kZ = this.LLIZ;
        if (interfaceC1441305kZ != null) {
            getRecordControlApi().NT().LIZIZ(interfaceC1441305kZ);
        }
        this.LLIZ = null;
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJ[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZIL.getValue(this, LLJ[2]);
    }

    public final InterfaceC1650190t2n o2() {
        return (InterfaceC1650190t2n) this.LLILZLL.getValue(this, LLJ[3]);
    }

    public final InterfaceC1647650syh w2() {
        return (InterfaceC1647650syh) this.LLILLL.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordControlApi().isRecording().LIZ(this, new AObjectS246S0100000_25(this, 150));
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), null, null, new C1647600syc(this, null), 3);
    }

    public InterfaceC1646780sxI Z1() {
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

    public C1647610syd(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final InterfaceC1441305kZ<Long> X1(final long j, final Function0<Unit> function0) {
        return new InterfaceC1441305kZ() { // from class: X.0sye
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Long l = (Long) obj;
                if (l != null) {
                    long jLongValue = j - l.longValue();
                    if (1000 <= jLongValue && jLongValue < 3001 && !this.w2().oi()) {
                        long j2 = 180;
                        int iAbs = (int) Math.abs(((j2 * jLongValue) / ((long) LivePreCreateNextRoomPlayer.ENABLE)) - j2);
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1647630syf(this, iAbs, null), 2);
                    }
                    if (jLongValue <= 0) {
                        function0.invoke();
                    }
                }
            }
        };
    }
}
