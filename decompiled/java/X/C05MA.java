package X;

import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$getThoughtInfoFlow$1", f = "SocialThoughtDataCenter.kt", l = {382}, m = "invokeSuspend")
public final class C05MA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ SocialThoughtDataCenter LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC332260D0u<ThoughtInfo> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MA(boolean z, SocialThoughtDataCenter socialThoughtDataCenter, String str, InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0u, InterfaceC1364105Vn<? super C05MA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = socialThoughtDataCenter;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MA c05ma = new C05MA(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05ma.LLILLJJLI = obj;
        return c05ma;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(1:(1:5)(2:16|17))(13:10|(2:12|(2:14|15))|18|(2:20|(1:22)(3:24|(1:33)(1:28)|(2:72|73)(1:32)))|23|78|34|37|(1:39)|40|(6:76|42|45|(1:47)|48|(2:65|(3:66|74|67)(2:62|63))(7:50|(1:64)(1:54)|(0)|(1:59)|66|74|67))|70|71)|6|(2:8|9)|18|(0)|23|78|34|37|(0)|40|(0)|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r2 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05MA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
