package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.sticker.service.secretreplies.SecretRepliesApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Sw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesManager$deleteSecretReply$1", f = "SecretRepliesManager.kt", l = {}, m = "invokeSuspend")
public final class C737270Sw1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C737240Svy LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737270Sw1(C737240Svy c737240Svy, String str, InterfaceC1364105Vn<? super C737270Sw1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c737240Svy;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737270Sw1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecretRepliesManager@ff73.deleteSecretReply$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C737280Sw2 c737280Sw2LJFF = this.LL.LJFF();
        String str = this.LLILLJJLI;
        c737280Sw2LJFF.getClass();
        try {
            SecretRepliesApi.LIZIZ.postRemoveOrReportSecretReply(str, 4).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecretRepliesManager@ff73.deleteSecretReply$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
