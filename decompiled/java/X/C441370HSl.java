package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$fetchStatusOnceAppSession$1$1", f = "MixStudioStatusRepoImpl.kt", l = {}, m = "invokeSuspend")
public final class C441370HSl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public final /* synthetic */ MixStudioStatusResponse LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441370HSl(Integer num, MixStudioStatusRepoImpl mixStudioStatusRepoImpl, MixStudioStatusResponse mixStudioStatusResponse, InterfaceC1364105Vn<? super C441370HSl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = mixStudioStatusRepoImpl;
        this.LLILZ = mixStudioStatusResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441370HSl c441370HSl = new C441370HSl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c441370HSl.LL = obj;
        return c441370HSl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.fetchStatusOnceAppSession$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Integer num = this.LLILLJJLI;
        if (num != null) {
            this.LLILLL.LJJIJIIJI(interfaceC497601wk, num.intValue(), this.LLILZ.mixStudioTask.results, Integer.MAX_VALUE, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.fetchStatusOnceAppSession$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
