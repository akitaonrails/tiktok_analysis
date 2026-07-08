package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareProductSensor$tryToShowQSBForSelfAwemeShare$1$hasHandle$1", f = "QuickExternalShareProductSensor.kt", l = {}, m = "invokeSuspend")
public final class C608720NuA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608720NuA(VideoItemParams videoItemParams, String str, InterfaceC1364105Vn<? super C608720NuA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoItemParams;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608720NuA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1$hasHandle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> set = C608890NuR.LIZ;
        VideoItemParams videoItemParams = this.LL;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C608890NuR.LIZ(aid, "has_showed_trigger_source", this.LLILLJJLI);
        C1C7U.LIZIZ("QuickExternalShareProductSensor@3aa2.tryToShowQSBForSelfAwemeShare$1$hasHandle$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
