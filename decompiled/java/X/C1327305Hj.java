package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$init$2", f = "StorageSyncer.kt", l = {32}, m = "invokeSuspend")
public final class C1327305Hj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327305Hj(String str, InterfaceC1364105Vn<? super C1327305Hj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1327305Hj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageSyncer@f38a.init$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = C1328305Ht.LLILLL;
            final String str = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.05Hk
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String str2 = (String) obj2;
                    if (!Intrinsics.LJFF(str2, str) && !Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("new user login: ");
                        sbLIZ.append(str2);
                        sbLIZ.append(", trigger update");
                        C1327105Hh.LIZIZ("Syncer", C2188811AlT.LIZIZ(sbLIZ));
                        Object objLIZIZ = C1328805Hy.LIZ.LIZIZ(str2, interfaceC1364105Vn);
                        if (objLIZIZ != C099R.LJFF()) {
                            return Unit.LIZ;
                        }
                        return objLIZIZ;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("StorageSyncer@f38a.init$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
