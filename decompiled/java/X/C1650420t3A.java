package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650420t3A implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 469));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 468));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650420t3A.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650420t3A.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650420t3A.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1650420t3A.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1650420t3A(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1647520syU.class, null);
    }
}
