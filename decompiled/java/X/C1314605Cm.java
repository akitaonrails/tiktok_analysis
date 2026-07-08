package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryViewModel$deleteHistoryAll$1$success$1", f = "AdWebHistoryViewModel.kt", l = {236}, m = "invokeSuspend")
public final class C1314605Cm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ AdWebHistoryViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314605Cm(AdWebHistoryViewModel adWebHistoryViewModel, InterfaceC1364105Vn<? super C1314605Cm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adWebHistoryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1314605Cm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C1C7U.LIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1$success$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1053550dWT c1053550dWTVQ2 = this.LLILLJJLI.vQ2();
            this.LL = 1;
            obj = c1053550dWTVQ2.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1$success$1");
                return objLJFF;
            }
        }
        AdWebHistoryDeleteResponse adWebHistoryDeleteResponse = (AdWebHistoryDeleteResponse) obj;
        if (adWebHistoryDeleteResponse == null || (num = adWebHistoryDeleteResponse.statusCode) == null || num.intValue() != 0) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1$success$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
