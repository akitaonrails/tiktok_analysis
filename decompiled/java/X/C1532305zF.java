package X;

import com.bytedance.effectcreatormobile.infrastructure.storage.dao.AMEBaseDB;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.storage.dao.DBApiImpl$init$2", f = "DBApiImpl.kt", l = {}, m = "invokeSuspend")
public final class C1532305zF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AMEBaseDB>, Object> {
    public final /* synthetic */ C1532505zH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532305zF(C1532505zH c1532505zH, InterfaceC1364105Vn<? super C1532305zF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1532505zH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1532305zF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DBApiImpl@1996.init$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        C844470XAv.LIZ.getClass();
        AbstractC796540VMm abstractC796540VMmLIZIZ = C0OGG.LIZ(C844470XAv.LIZ(), AMEBaseDB.class, "ame_base_db").LIZIZ();
        C1C7U.LIZIZ("DBApiImpl@1996.init$2");
        return abstractC796540VMmLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AMEBaseDB> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
