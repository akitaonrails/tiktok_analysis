package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCServiceImpl$doInitClient$4", f = "TakoRTCServiceImpl.kt", l = {389, 391}, m = "invokeSuspend")
public final class C1302040jzG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1301890jz1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302040jzG(C1301890jz1 c1301890jz1, InterfaceC1364105Vn<? super C1302040jzG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1301890jz1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302040jzG(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:7:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "TakoRTCServiceImpl@78f9.doInitClient$4"
            X.C1C7U.LIZ(r12)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LLILLJJLI
            r7 = 10
            r6 = 1
            r4 = 2
            if (r0 == 0) goto L74
            if (r0 == r6) goto L50
            if (r0 != r4) goto L92
            long r2 = r13.LL
            X.C155000ia.LIZIZ(r14)
        L1a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 == 0) goto L3c
            X.0jzH r0 = X.C1302050jzH.LIZ
            r0.getClass()
            long r2 = X.C1302050jzH.LIZ()
            X.13Jk r0 = X.EnumC19990213Jk.SECONDS
            long r0 = X.C19990313Jl.LJII(r7, r0)
            X.0jzI r8 = X.C1302060jzI.LIZ
            r8.getClass()
            X.13Jk r8 = X.EnumC19990213Jk.NANOSECONDS
            long r2 = X.C19990413Jm.LIZIZ(r2, r0, r8)
        L3c:
            X.13Jk r0 = X.EnumC19990213Jk.SECONDS
            long r0 = X.C19990313Jl.LJII(r4, r0)
            r13.LL = r2
            r13.LLILLJJLI = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZJ(r0, r13)
            if (r0 != r5) goto L55
            X.C1C7U.LIZIZ(r12)
            return r5
        L50:
            long r2 = r13.LL
            X.C155000ia.LIZIZ(r14)
        L55:
            long r10 = X.C1302080jzK.LIZJ(r2)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L72
            r0 = 1
        L60:
            r1 = r0 ^ 1
            X.0jz1 r0 = r13.LLILLL
            r13.LL = r2
            r13.LLILLJJLI = r4
            java.lang.Object r14 = r0.LJIIIZ(r1, r13)
            if (r14 != r5) goto L1a
            X.C1C7U.LIZIZ(r12)
            return r5
        L72:
            r0 = 0
            goto L60
        L74:
            X.C155000ia.LIZIZ(r14)
            X.0jzH r0 = X.C1302050jzH.LIZ
            r0.getClass()
            long r2 = X.C1302050jzH.LIZ()
            X.13Jk r0 = X.EnumC19990213Jk.SECONDS
            long r0 = X.C19990313Jl.LJII(r7, r0)
            X.0jzI r8 = X.C1302060jzI.LIZ
            r8.getClass()
            X.13Jk r8 = X.EnumC19990213Jk.NANOSECONDS
            long r2 = X.C19990413Jm.LIZIZ(r2, r0, r8)
            goto L3c
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302040jzG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
