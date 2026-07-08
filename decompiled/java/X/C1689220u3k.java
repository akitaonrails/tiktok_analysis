package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689220u3k extends C09AY implements InterfaceC1631620sYq<InterfaceC1686920u02, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ImNotificationViewModel LL;
    public final /* synthetic */ Function1<C1689420u44, Unit> LLILLJJLI;
    public final /* synthetic */ Function1<AbstractC1689280u3q, Unit> LLILLL;
    public final /* synthetic */ Function1<AbstractC1689280u3q, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ C05P1<AbstractC1689260u3o> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1689220u3k(ImNotificationViewModel imNotificationViewModel, Function1<? super C1689420u44, Unit> function1, Function1<? super AbstractC1689280u3q, Unit> function12, Function1<? super AbstractC1689280u3q, Unit> function13, Function0<Unit> function0, Function1<? super Integer, Unit> function14, C05P1<? extends AbstractC1689260u3o> c05p1) {
        super(3);
        this.LL = imNotificationViewModel;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = function13;
        this.LLILZIL = function0;
        this.LLILZLL = function14;
        this.LLIZ = c05p1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1686920u02 r11, X.InterfaceC1680500tpg r12, java.lang.Integer r13) {
        /*
            r10 = this;
            r7 = r12
            X.0u02 r11 = (X.InterfaceC1686920u02) r11
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r3 = r13.intValue()
            r0 = r3 & 6
            if (r0 != 0) goto L17
            boolean r0 = r7.LJJIIJ(r11)
            if (r0 == 0) goto La3
            r0 = 4
        L16:
            r3 = r3 | r0
        L17:
            r1 = r3 & 19
            r0 = 18
            if (r1 != r0) goto L29
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L29
            r7.LIZJ()
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.05P1<X.0u3o> r0 = r10.LLIZ
            java.lang.Object r1 = r0.getValue()
            X.0u3o r1 = (X.AbstractC1689260u3o) r1
            boolean r0 = r1 instanceof X.C1689290u3r
            if (r0 == 0) goto L44
            r0 = -416536230(0xffffffffe72c295a, float:-8.1300984E23)
            r7.LJJIIJZLJL(r0)
            r0 = r3 & 14
            X.C1689210u3j.LIZJ(r11, r7, r0)
            r7.LJ()
            goto L26
        L44:
            boolean r0 = r1 instanceof X.C1689300u3s
            if (r0 == 0) goto L84
            r0 = -416535005(0xffffffffe72c2e23, float:-8.130981E23)
            r7.LJJIIJZLJL(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r7.LJJIIJZLJL(r0)
            com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel r0 = r10.LL
            boolean r0 = r7.LJII(r0)
            com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel r1 = r10.LL
            java.lang.Object r2 = r7.LJJ()
            if (r0 != 0) goto L6b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L75
        L6b:
            kotlin.jvm.internal.AwS551S0100000_7 r2 = new kotlin.jvm.internal.AwS551S0100000_7
            r0 = 302(0x12e, float:4.23E-43)
            r2.<init>(r1, r0)
            r7.LJJIJIIJI(r2)
        L75:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r7.LJ()
            r1 = r3 & 14
            r0 = 0
            X.C1689210u3j.LIZIZ(r11, r2, r7, r1, r0)
            r7.LJ()
            goto L26
        L84:
            boolean r0 = r1 instanceof X.C1689240u3m
            if (r0 == 0) goto La6
            r0 = -416529354(0xffffffffe72c4436, float:-8.135053E23)
            r7.LJJIIJZLJL(r0)
            X.0u3m r1 = (X.C1689240u3m) r1
            kotlin.jvm.functions.Function1<X.0u44, kotlin.Unit> r2 = r10.LLILLJJLI
            kotlin.jvm.functions.Function1<X.0u3q, kotlin.Unit> r3 = r10.LLILLL
            kotlin.jvm.functions.Function1<X.0u3q, kotlin.Unit> r4 = r10.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r10.LLILZIL
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r6 = r10.LLILZLL
            r8 = 0
            r9 = r8
            X.C1689210u3j.LIZ(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r7.LJ()
            goto L26
        La3:
            r0 = 2
            goto L16
        La6:
            r0 = -416537838(0xffffffffe72c2312, float:-8.12894E23)
            r7.LJJIIJZLJL(r0)
            r7.LJ()
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689220u3k.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
