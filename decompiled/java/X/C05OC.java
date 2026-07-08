package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.utils.SleepHourMusicManager$adjustVolume$1", f = "SleepHourMusicManager.kt", l = {85}, m = "invokeSuspend")
public final class C05OC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<Float> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OC(long j, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OC(this.LLILZLL, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:6:0x001b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "SleepHourMusicManager@9c2b.adjustVolume$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r5 = 1
            if (r0 == 0) goto L4b
            if (r0 != r5) goto L5c
            float r4 = r8.LLILLL
            int r3 = r8.LLILLJJLI
            java.lang.Object r2 = r8.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r9)
        L1b:
            r1 = r3
            X.15Ja r0 = X.C05OG.LIZIZ
            if (r0 == 0) goto L23
            r0.LJIILLIIL(r4, r4)
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            int r3 = r1 + 1
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r4 = r0.floatValue()
            if (r1 == 0) goto L1b
            long r0 = r8.LLILZLL
            r8.LL = r2
            r8.LLILLJJLI = r3
            r8.LLILLL = r4
            r8.LLILZ = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r6) goto L1b
            X.C1C7U.LIZIZ(r7)
            return r6
        L4b:
            X.C155000ia.LIZIZ(r9)
            java.util.List<java.lang.Float> r0 = r8.LLILZIL
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
            goto L23
        L56:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05OC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
