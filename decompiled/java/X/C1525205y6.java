package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.EffectAssetDownloader$downloadMusic$1$deferred$1", f = "EffectAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1525205y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends List<? extends MusicModel>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1416470mxp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525205y6(C1416470mxp c1416470mxp, InterfaceC1364105Vn<? super C1525205y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1416470mxp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1525205y6 c1525205y6 = new C1525205y6(this.LLILLJJLI, interfaceC1364105Vn);
        c1525205y6.LL = obj;
        return c1525205y6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectAssetDownloader@f641.downloadMusic$1$deferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C1525305y7(this.LLILLJJLI, null), 3);
        C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadMusic$1$deferred$1");
        return c099gLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends List<? extends MusicModel>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
