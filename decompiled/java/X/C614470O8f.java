package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1$1$1", f = "StickerPropDetailHelper.kt", l = {}, m = "invokeSuspend")
public final class C614470O8f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC614550O8n LL;
    public final /* synthetic */ NewFaceStickerBean LLILLJJLI;
    public final /* synthetic */ C0O7A<C614520O8k> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614470O8f(C0O7A c0o7a, InterfaceC614550O8n interfaceC614550O8n, NewFaceStickerBean newFaceStickerBean, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC614550O8n;
        this.LLILLJJLI = newFaceStickerBean;
        this.LLILLL = c0o7a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C614470O8f(this.LLILLL, this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StickerPropDetailHelperKt@9b29.collectSticker$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC614550O8n interfaceC614550O8n = this.LL;
        NewFaceStickerBean newFaceStickerBean = this.LLILLJJLI;
        if (C0O7F.LIZJ(this.LLILLL.LIZJ) != EnumC614130O6x.Net) {
            z = true;
        } else {
            z = false;
        }
        interfaceC614550O8n.h50(newFaceStickerBean, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerPropDetailHelperKt@9b29.collectSticker$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
