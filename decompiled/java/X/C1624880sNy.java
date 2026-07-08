package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624880sNy implements InterfaceC1624870sNx, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C19GS LLILLJJLI;
    public final InterfaceC1650230t2r LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624880sNy.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1624880sNy(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = (C19GS) c1drg.LJII(C19GS.class, null);
        this.LLILLL = (InterfaceC1650230t2r) c1drg.LJII(InterfaceC1650230t2r.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
    }

    @Override // X.InterfaceC1624870sNx
    public final GameStickerHandler LIZ(InterfaceC1625000sOA interfaceC1625000sOA, InterfaceC1637800sio interfaceC1637800sio) {
        return new GameStickerHandler((LifecycleOwner) this.LL.LJII(LifecycleOwner.class, null), C452501pT.LIZIZ(new AwS269S0300000_25(this, interfaceC1625000sOA, interfaceC1637800sio, 16)), new AwS569S0100000_25(interfaceC1625000sOA, 871));
    }
}
