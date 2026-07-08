package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0svD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645490svD extends C09AY implements Function1<C12IL, Unit> {
    public final /* synthetic */ Function1<C12IL, Unit> LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1645490svD(Function1<? super C12IL, Unit> function1, ShortVideoContext shortVideoContext, boolean z, boolean z2, Function0<String> function0, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function0;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C12IL c12il) {
        Function1 function1 = this.LL;
        if (function1 == null) {
            final ShortVideoContext shortVideoContext = this.LLILLJJLI;
            final boolean z = this.LLILLL;
            final boolean z2 = this.LLILZ;
            Function0<String> function0 = this.LLILZIL;
            final boolean z3 = this.LLILZLL;
            final boolean z4 = this.LLIZ;
            final boolean z5 = this.LLIZLLLIL;
            final String strInvoke = function0.invoke();
            function1 = new C12IK(shortVideoContext, z, z2, strInvoke, z3, z4, z5) { // from class: X.12IJ
                public final ShortVideoContext LLILZLL;
                public final boolean LLIZ;

                /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final kotlin.Unit invoke(X.C12IL r8) {
                    /*
                        r7 = this;
                        X.12IL r8 = (X.C12IL) r8
                        super.LIZ(r8)
                        X.0C64 r2 = X.C0C64.LJIILLIIL()
                        r1 = 31744(0x7c00, float:4.4483E-41)
                        java.lang.String r0 = "default_beauty_off"
                        r5 = 1
                        r6 = 0
                        boolean r4 = r2.LJIIIZ(r1, r0, r5, r6)
                        X.1Ds4 r0 = X.C0CHQ.LIZ()
                        X.0o1f r0 = r0.getAccountService()
                        boolean r3 = r0.isLogin()
                        boolean r0 = r7.LLIZ
                        if (r0 == 0) goto L32
                        X.12I1 r0 = new X.12I1
                        r0.<init>()
                        r8.LJIJ = r0
                        r0 = 366(0x16e, float:5.13E-43)
                        kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
                        r8.LJ = r0
                    L32:
                        if (r4 == 0) goto L49
                        if (r3 == 0) goto L49
                        X.12Hy r1 = new X.12Hy
                        X.1Ds4 r0 = X.C0CHQ.LIZ()
                        X.0o1f r0 = r0.getAccountService()
                        java.lang.String r0 = r0.getCurrentUserID()
                        r1.<init>(r0)
                        r8.LJIJ = r1
                    L49:
                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LLILZLL
                        com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                        com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
                        com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig r1 = r0.recordPageOptionalConfig
                        r0 = 0
                        if (r1 == 0) goto L5a
                        boolean r0 = r1.nopeMemory
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    L5a:
                        java.lang.String r2 = "exterior_record_page_memory"
                        if (r0 == 0) goto L94
                        boolean r1 = r0.booleanValue()
                        android.os.Bundle r0 = new android.os.Bundle
                        r0.<init>()
                        r0.putBoolean(r2, r1)
                        boolean r0 = r0.getBoolean(r2)
                        if (r0 != r5) goto L94
                        X.12IN r0 = new X.12IN
                        r0.<init>()
                        r8.LJIJ = r0
                        X.C1651050t4B.LIZ = r5
                        r0 = 367(0x16f, float:5.14E-43)
                        kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
                        r8.LIZLLL = r0
                        r0 = 368(0x170, float:5.16E-43)
                        kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
                        r8.LJ = r0
                    L89:
                        kotlin.jvm.internal.AwS9S0020000_29 r1 = new kotlin.jvm.internal.AwS9S0020000_29
                        r0 = 1
                        r1.<init>(r4, r3, r0)
                        r8.LJIL = r1
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        return r0
                    L94:
                        X.C1651050t4B.LIZ = r6
                        goto L89
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C12IJ.invoke(java.lang.Object):java.lang.Object");
                }

                {
                    super(z2, strInvoke, z3, z4, z5);
                    this.LLILZLL = shortVideoContext;
                    this.LLIZ = z;
                }
            };
        }
        function1.invoke(c12il);
        return Unit.LIZ;
    }
}
