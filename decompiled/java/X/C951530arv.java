package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0arv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951530arv extends C09AY implements InterfaceC1631620sYq<InterfaceC1671930tbr, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C948400ams LL;
    public final /* synthetic */ Handler LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;
    public final /* synthetic */ C948300ami LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function1<AbstractC948140amS, Unit> LLIZLLLIL;
    public final /* synthetic */ C05P0<Boolean> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C951530arv(Handler handler, C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, C948300ami c948300ami, C948400ams c948400ams, String str, Function1 function1, Function1 function12) {
        super(3);
        this.LL = c948400ams;
        this.LLILLJJLI = handler;
        this.LLILLL = function1;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c948300ami;
        this.LLIZ = str;
        this.LLIZLLLIL = function12;
        this.LLJ = c05p03;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1671930tbr r22, X.InterfaceC1680500tpg r23, java.lang.Integer r24) {
        /*
            r21 = this;
            r1 = r24
            r0 = r23
            X.0tpg r0 = (X.InterfaceC1680500tpg) r0
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            r1 = 1111752704(0x42440000, float:49.0)
            float r1 = X.C497740JfY.LIZIZ(r1)
            int r5 = (int) r1
            X.0act r3 = X.C942210act.LIZ
            r1 = r21
            X.0ams r2 = r1.LL
            int r2 = r2.LIZIZ
            r3.getClass()
            java.util.List r2 = X.C942210act.LJI(r2)
            int r2 = r2.size()
            int r5 = r5 * r2
            X.0tVa r2 = X.InterfaceC1668050tVb.LIZ
            r2.getClass()
            X.0jqv r12 = X.C1668040tVa.LIZLLL
            r2 = 1098907648(0x41800000, float:16.0)
            float r2 = X.C497740JfY.LIZIZ(r2)
            int r2 = (int) r2
            int r4 = -r2
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = X.C497740JfY.LIZIZ(r3)
            int r2 = (int) r2
            if (r5 < r2) goto L43
            float r2 = X.C497740JfY.LIZIZ(r3)
            int r5 = (int) r2
        L43:
            int r3 = -r5
            r2 = 1110441984(0x42300000, float:44.0)
            float r2 = X.C497740JfY.LIZIZ(r2)
            int r2 = (int) r2
            int r3 = r3 - r2
            long r13 = (long) r4
            r2 = 32
            long r13 = r13 << r2
            long r4 = (long) r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r13 = r13 | r4
            r2 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
            r0.LJJIIJZLJL(r2)
            android.os.Handler r2 = r1.LLILLJJLI
            boolean r7 = r0.LJII(r2)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r1.LLILLL
            boolean r2 = r0.LJJIIJ(r2)
            r7 = r7 | r2
            android.os.Handler r6 = r1.LLILLJJLI
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = r1.LLILLL
            X.05P0<java.lang.Boolean> r4 = r1.LLILZ
            X.05P0<java.lang.Boolean> r3 = r1.LLILZIL
            java.lang.Object r15 = r0.LJJ()
            if (r7 != 0) goto L82
            X.0tph r2 = X.InterfaceC1680500tpg.LIZ
            r2.getClass()
            X.0tpi r2 = X.C1680510tph.LIZIZ
            if (r15 != r2) goto L94
        L82:
            kotlin.jvm.internal.AwS131S0400000_2 r15 = new kotlin.jvm.internal.AwS131S0400000_2
            r20 = 7
            r17 = r5
            r18 = r4
            r19 = r3
            r16 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r0.LJJIJIIJI(r15)
        L94:
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r0.LJ()
            X.0arq r2 = new X.0arq
            X.0ams r8 = r1.LL
            X.0ami r7 = r1.LLILZLL
            java.lang.String r9 = r1.LLIZ
            kotlin.jvm.functions.Function1<X.0amS, kotlin.Unit> r10 = r1.LLIZLLLIL
            android.os.Handler r3 = r1.LLILLJJLI
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r11 = r1.LLILLL
            X.05P0<java.lang.Boolean> r4 = r1.LLJ
            X.05P0<java.lang.Boolean> r5 = r1.LLILZ
            X.05P0<java.lang.Boolean> r6 = r1.LLILZIL
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 1639169506(0x61b3bde2, float:4.144562E20)
            X.12De r17 = X.C13Z4.LIZJ(r1, r2, r0)
            r19 = 24582(0x6006, float:3.4447E-41)
            r20 = 8
            r16 = 0
            r18 = r0
            X.C1680580tpo.LIZIZ(r12, r13, r15, r16, r17, r18, r19, r20)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C951530arv.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
