package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.draft.model.AwemeDraftExtension$loadThumbCoverAsync$1", f = "AwemeDraftExt.kt", l = {}, m = "invokeSuspend")
public final class C2491909pd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ VideoCoverConfig LLILLJJLI;
    public final /* synthetic */ C2491709pb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491909pd(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, C2491709pb c2491709pb, InterfaceC1364105Vn<? super C2491909pd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = videoCoverConfig;
        this.LLILLL = c2491709pb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2491909pd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeDraftExtension@e329.loadThumbCoverAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MZ9.LJIIIIZZ(this.LL, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeDraftExtension@e329.loadThumbCoverAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
