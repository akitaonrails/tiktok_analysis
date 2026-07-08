package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.CapCutHelperKt$updateCCMetaDataAnchorAsync$1$1", f = "CapCutHelper.kt", l = {}, m = "invokeSuspend")
public final class C353201Ys extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353201Ys(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C353201Ys> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353201Ys(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CapCutHelperKt@f8be.updateCCMetaDataAnchorAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C580650Mpz.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CapCutHelperKt@f8be.updateCCMetaDataAnchorAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
