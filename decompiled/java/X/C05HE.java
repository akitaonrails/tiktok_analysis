package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05HE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$Companion$getInstance$initUid$awaitUid$1", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
public final class C05HE extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C05HE(InterfaceC1364105Vn<? super C05HE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05HE c05he = new C05HE(interfaceC1364105Vn);
        c05he.LL = obj;
        return c05he;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource$Companion@a5ce.getInstance$initUid$awaitUid$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) this.LL;
        boolean z = true;
        if (str.length() <= 0 || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StorageDataSource$Companion@a5ce.getInstance$initUid$awaitUid$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
