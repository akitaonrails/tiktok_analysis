package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$onViewCreated$4$1$1", f = "EcVideoGuideAssem.kt", l = {}, m = "invokeSuspend")
public final class C592980NNo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcVideoGuideAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592980NNo(EcVideoGuideAssem ecVideoGuideAssem, InterfaceC1364105Vn<? super C592980NNo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecVideoGuideAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592980NNo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcVideoGuideAssem@5df3.onViewCreated$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcVideoGuideAssem ecVideoGuideAssem = this.LL;
        ecVideoGuideAssem.LLLJIL = null;
        ((LinkedHashMap) ecVideoGuideAssem.LLLLIILLL).clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.onViewCreated$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
