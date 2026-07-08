package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadConfigData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$uploadImageAndDisplay$2", f = "ImageListViewModel.kt", l = {265, 288, 316}, m = "invokeSuspend")
public final class C1729530v6l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1728990v5t LL;
    public UploadConfigData LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ ImageListViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729530v6l(ImageListViewModel imageListViewModel, String str, InterfaceC1364105Vn<? super C1729530v6l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = imageListViewModel;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729530v6l(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #2 {all -> 0x016a, blocks: (B:44:0x0132, B:45:0x0135, B:48:0x0147, B:49:0x0156, B:40:0x010d), top: B:66:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729530v6l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
