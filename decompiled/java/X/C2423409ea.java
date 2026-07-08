package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner.DmAutoArchiveGuideBannerVH$onBindItem$3$1$1", f = "DmAutoArchiveGuideBannerVH.kt", l = {}, m = "invokeSuspend")
public final class C2423409ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1389890mGx>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C888280Yt0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2423409ea(boolean z, C888280Yt0 c888280Yt0, InterfaceC1364105Vn<? super C2423409ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c888280Yt0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2423409ea(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            i = 2131830276;
        } else {
            i = 2131834217;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.LL);
        c1389890mGx.LJIIIZ(i);
        if (this.LL) {
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
        }
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("DmAutoArchiveGuideBannerVH@a63c.onBindItem$3$1$1");
        return c1389890mGx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1389890mGx> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
