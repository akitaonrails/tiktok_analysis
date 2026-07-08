package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handleResult$1$1", f = "EcEditVideoCoverMethod.kt", l = {}, m = "invokeSuspend")
public final class C060S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ CompletionBlock<InterfaceC1463805oC> LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060S(DialogC1389620mGW dialogC1389620mGW, CompletionBlock<InterfaceC1463805oC> completionBlock, VideoPublishEditModel videoPublishEditModel, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C060S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060S(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ(this.LL);
        this.LLILLJJLI.onSuccess(new AnonymousClass0525(this.LLILLL.creativeModel.postPageModel.customCoverWithStickerPath, this.LLILZ), "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$1");
        return unit;
    }
}
