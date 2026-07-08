package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$checkValid$1", f = "ReflowSideProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1233520iCk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233520iCk(Uri uri, InterfaceC1364105Vn<? super C1233520iCk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233520iCk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReflowSideProcessor@9181.checkValid$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        new C2000507sZ(this.LL).LIZLLL("@LinkRelation");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReflowSideProcessor@9181.checkValid$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
