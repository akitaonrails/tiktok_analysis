package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.draft.model.AwemeDraftExtension$loadThumbCoverAsync$callback$1$onGetVideoCoverSuccess$1", f = "AwemeDraftExt.kt", l = {}, m = "invokeSuspend")
public final class C2491609pa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IEffectService.OnVideoCoverCallback LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491609pa(IEffectService.OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap, InterfaceC1364105Vn<? super C2491609pa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = onVideoCoverCallback;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2491609pa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeDraftExtension@e329.loadThumbCoverAsync$callback$1$onGetVideoCoverSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onGetVideoCoverSuccess(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeDraftExtension@e329.loadThumbCoverAsync$callback$1$onGetVideoCoverSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
