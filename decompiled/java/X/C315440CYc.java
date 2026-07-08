package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM$setUpCountDown$1", f = "EmotePollDetailVM.kt", l = {356, 361, 364}, m = "invokeSuspend")
public final class C315440CYc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ EmotePollDetailVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315440CYc(EmotePollDetailVM emotePollDetailVM, InterfaceC1364105Vn interfaceC1364105Vn, C238400w2 c238400w2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = emotePollDetailVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315440CYc(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:23:0x0058). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "EmotePollDetailVM@7fdb.setUpCountDown$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r14.LL
            r3 = 1000(0x3e8, double:4.94E-321)
            r6 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L21
            if (r0 == r7) goto L46
            if (r0 == r8) goto L55
            if (r0 != r6) goto L77
            X.C155000ia.LIZIZ(r15)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L21:
            X.C155000ia.LIZIZ(r15)
        L24:
            X.00w2 r10 = r14.LLILLJJLI
            long r0 = r10.element
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r9 = 0
            if (r2 <= 0) goto L60
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CYd r1 = new X.0CYd
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM r0 = r14.LLILLL
            r1.<init>(r0, r9, r10)
            r14.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)
            if (r0 != r5) goto L49
            X.C1C7U.LIZIZ(r13)
            return r5
        L46:
            X.C155000ia.LIZIZ(r15)
        L49:
            r14.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r14)
            if (r0 != r5) goto L58
            X.C1C7U.LIZIZ(r13)
            return r5
        L55:
            X.C155000ia.LIZIZ(r15)
        L58:
            X.00w2 r2 = r14.LLILLJJLI
            long r0 = r2.element
            long r0 = r0 - r3
            r2.element = r0
            goto L24
        L60:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CYe r1 = new X.0CYe
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM r0 = r14.LLILLL
            r1.<init>(r0, r9)
            r14.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)
            if (r0 != r5) goto L1b
            X.C1C7U.LIZIZ(r13)
            return r5
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315440CYc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
