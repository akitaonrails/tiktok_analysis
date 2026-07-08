package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.header.CampaignHeaderAssem$startCountDown$2", f = "CampaignHeaderAssem.kt", l = {142, 144}, m = "invokeSuspend")
public final class C23234098m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ TextView LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23234098m(long j, TextView textView, InterfaceC1364105Vn<? super C23234098m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23234098m(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "CampaignHeaderAssem@88f1.startCountDown$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 == r2) goto L5a
            if (r0 != r3) goto L6e
            int r6 = r8.LLILLJJLI
            int r0 = r8.LL
            java.lang.Object r5 = r8.LLILLL
            android.view.View r5 = (android.view.View) r5
            X.C155000ia.LIZIZ(r9)
        L1e:
            r5.invalidate()
            int r6 = r6 + 1
        L23:
            if (r6 >= r0) goto L68
            r8.LLILLL = r5
            r8.LL = r0
            r8.LLILLJJLI = r6
            r8.LLILZ = r3
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r1 != r4) goto L1e
            X.C1C7U.LIZIZ(r7)
            return r4
        L39:
            X.C155000ia.LIZIZ(r9)
            long r5 = r8.LLILZIL
            r1 = 24
            X.13Jk r0 = X.EnumC19990213Jk.HOURS
            long r0 = X.C19990313Jl.LJII(r1, r0)
            long r0 = X.C19990113Jj.LJIIZILJ(r5, r0)
            long r0 = X.C19990113Jj.LJIIIZ(r0)
            r8.LLILZ = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r4) goto L5d
            X.C1C7U.LIZIZ(r7)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r9)
        L5d:
            long r0 = r8.LLILZIL
            long r1 = X.C19990113Jj.LJIIJJI(r0)
            int r0 = (int) r1
            android.widget.TextView r5 = r8.LLILZLL
            r6 = 0
            goto L23
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23234098m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
