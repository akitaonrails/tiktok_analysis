package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS96S1200000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Soj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$showShareGuideAnimation$1$2", f = "VideoShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C732750Soj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoShareViewModel LL;
    public final /* synthetic */ UrlModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732750Soj(VideoShareViewModel videoShareViewModel, UrlModel urlModel, String str, InterfaceC1364105Vn<? super C732750Soj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoShareViewModel;
        this.LLILLJJLI = urlModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C732750Soj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoShareViewModel videoShareViewModel = this.LL;
        UrlModel urlModel = this.LLILLJJLI;
        String str = this.LLILLL;
        videoShareViewModel.getClass();
        videoShareViewModel.LLIZ = EnumC732770Sol.INNER_SHARE;
        videoShareViewModel.runOnUIThread(new AwS96S1200000_11(videoShareViewModel, urlModel, str, 11));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
