package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O1U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$onGetResult$2", f = "IntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C0O1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UnifiedAuthPopupConfig LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function2<Boolean, ServerIntelligentRequest, Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O1U(UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z, boolean z2, Function2<? super Boolean, ? super ServerIntelligentRequest, Unit> function2, String str, String str2, InterfaceC1364105Vn<? super C0O1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = unifiedAuthPopupConfig;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O1U(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0352 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ae  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O1U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
