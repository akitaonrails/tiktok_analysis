package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0U31, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader$downloadSongInfo$2$deferredList$1$1", f = "KaraokeDownloader.kt", l = {137}, m = "invokeSuspend")
public final class C0U31 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ Pair<String, String> LLILLJJLI;
    public final /* synthetic */ C0U22 LLILLL;
    public final /* synthetic */ C0U33 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U31(Pair<String, String> pair, C0U22 c0u22, C0U33 c0u33, InterfaceC1364105Vn<? super C0U31> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pair;
        this.LLILLL = c0u22;
        this.LLILZ = c0u33;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U31(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("KaraokeDownloader@4c6a.downloadSongInfo$2$deferredList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            String first = this.LLILLJJLI.getFirst();
            String second = this.LLILLJJLI.getSecond();
            long j = this.LLILLL.LIZ;
            boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.getSecond(), this.LLILLL.LJIIIZ.LIZIZ());
            boolean zLJFF2 = Intrinsics.LJFF(this.LLILLJJLI.getSecond(), this.LLILLL.LJIIIIZZ.LIZIZ());
            C0U33 c0u33 = this.LLILZ;
            this.LL = 1;
            c0u33.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C20441214yg.LIZIZ("KaraokeDownloader", "onStart0");
            C207209166l c207209166l = new C207209166l(second, EnumC771350UNp.LIVE_KARAOKE, null, null, first, null, false, 0, false, 1004);
            C20441214yg.LIZIZ("KaraokeDownloader", "onStart1");
            C207232167i.LIZIZ(c207209166l, new C0U3N(j, c0u33, c23260099m, zLJFF, zLJFF2));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2$deferredList$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2$deferredList$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
