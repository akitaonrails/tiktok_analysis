package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1$1$2", f = "StickerPropDetailHelper.kt", l = {}, m = "invokeSuspend")
public final class C614480O8g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NewFaceStickerBean LL;
    public final /* synthetic */ InterfaceC614550O8n LLILLJJLI;
    public final /* synthetic */ C0O7A<C614520O8k> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614480O8g(C0O7A c0o7a, InterfaceC614550O8n interfaceC614550O8n, NewFaceStickerBean newFaceStickerBean, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newFaceStickerBean;
        this.LLILLJJLI = interfaceC614550O8n;
        this.LLILLL = c0o7a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        NewFaceStickerBean newFaceStickerBean = this.LL;
        return new C614480O8g(this.LLILLL, this.LLILLJJLI, newFaceStickerBean, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C614490O8h c614490O8h;
        C1C7U.LIZ("StickerPropDetailHelperKt@9b29.collectSticker$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NewFaceStickerBean newFaceStickerBean = this.LL;
        newFaceStickerBean.isFavorite = !newFaceStickerBean.isFavorite;
        InterfaceC614550O8n interfaceC614550O8n = this.LLILLJJLI;
        Throwable cause = ((C0O7B) this.LLILLL).LIZLLL.getCause();
        ExceptionResult exceptionResult = null;
        if ((cause instanceof C614490O8h) && (c614490O8h = (C614490O8h) cause) != null) {
            exceptionResult = c614490O8h.getExceptionResult();
        }
        interfaceC614550O8n.zC(newFaceStickerBean, exceptionResult);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerPropDetailHelperKt@9b29.collectSticker$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
