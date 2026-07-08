package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService$preloadIBE$1", f = "CommerceIBEService.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1062870dlV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IBEInfo LLILLJJLI;
    public final /* synthetic */ CommerceIBEService LLILLL;
    public final /* synthetic */ C1057930ddX LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Function1<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1062870dlV(IBEInfo iBEInfo, CommerceIBEService commerceIBEService, C1057930ddX c1057930ddX, Context context, Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C1062870dlV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iBEInfo;
        this.LLILLL = commerceIBEService;
        this.LLILZ = c1057930ddX;
        this.LLILZIL = context;
        this.LLILZLL = function1;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1062870dlV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1062870dlV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
