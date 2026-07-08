package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05G1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask$run$1$loginUid$1", f = "StorageLegoTask.kt", l = {}, m = "invokeSuspend")
public final class C05G1 extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StorageLegoTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G1(StorageLegoTask storageLegoTask, InterfaceC1364105Vn<? super C05G1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storageLegoTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05G1 c05g1 = new C05G1(this.LLILLJJLI, interfaceC1364105Vn);
        c05g1.LL = obj;
        return c05g1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageLegoTask@c623.run$1$loginUid$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) this.LL;
        boolean z = false;
        if (((IAccountService) this.LLILLJJLI.LLILLJJLI.getValue()).LJIIJ().isLogin() && str.length() > 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StorageLegoTask@c623.run$1$loginUid$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
