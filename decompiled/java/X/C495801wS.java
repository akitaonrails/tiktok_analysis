package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper$onServerIntelligentResult$2", f = "PushServerIntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C495801wS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ UnifiedAuthPopupConfig LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Float LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495801wS(boolean z, UnifiedAuthPopupConfig unifiedAuthPopupConfig, Boolean bool, boolean z2, String str, Float f, Integer num, String str2, long j, InterfaceC1364105Vn<? super C495801wS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = bool;
        this.LLILZ = z2;
        this.LLILZIL = str;
        this.LLILZLL = f;
        this.LLIZ = num;
        this.LLIZLLLIL = str2;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495801wS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C19208210Cq c19208210Cq = C19208210Cq.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
            Boolean bool = this.LLILLL;
            boolean z = this.LLILZ;
            String str = this.LLILZIL;
            Float f = this.LLILZLL;
            Integer num = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            long j = this.LLJ;
            c19208210Cq.getClass();
            C19208210Cq.LIZIZ(unifiedAuthPopupConfig, bool, z, str, f, num, str2, j);
        } else {
            C19208210Cq c19208210Cq2 = C19208210Cq.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LLILLJJLI;
            String str3 = this.LLILZIL;
            Float fLIZLLL = C2286608xc.LIZLLL(-1.0f);
            long j2 = this.LLJ;
            c19208210Cq2.getClass();
            C19208210Cq.LIZIZ(unifiedAuthPopupConfig2, false, false, str3, fLIZLLL, null, "cancelled before callback", j2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
