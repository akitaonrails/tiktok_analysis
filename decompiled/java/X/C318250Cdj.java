package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.mobileeffect.MobileEffectUtilsKt$fetchDraftPath2MobileEffect$draft$1", f = "MobileEffectUtils.kt", l = {}, m = "invokeSuspend")
public final class C318250Cdj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CKEDraftInfo>, Object> {
    public final /* synthetic */ InterfaceC318260Cdk LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318250Cdj(InterfaceC318260Cdk interfaceC318260Cdk, String str, InterfaceC1364105Vn<? super C318250Cdj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC318260Cdk;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318250Cdj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUtilsKt@d72a.fetchDraftPath2MobileEffect$draft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CKEDraftInfo cKEDraftInfoLJFF = this.LL.LJFF(C0CHQ.LIZ, this.LLILLJJLI);
        C1C7U.LIZIZ("MobileEffectUtilsKt@d72a.fetchDraftPath2MobileEffect$draft$1");
        return cKEDraftInfoLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CKEDraftInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
