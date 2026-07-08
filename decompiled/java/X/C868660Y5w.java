package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.utils.MediaMsgRefresher$scheduleRefreshJob$job$1", f = "MediaMsgRefresher.kt", l = {80}, m = "invokeSuspend")
public final class C868660Y5w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C868670Y5x LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C868660Y5w(long j, C868670Y5x c868670Y5x, long j2, C869590Y9l c869590Y9l, String str, InterfaceC1364105Vn<? super C868660Y5w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c868670Y5x;
        this.LLILZ = j2;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C868660Y5w(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaMsgRefresher@c7f8.scheduleRefreshJob$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MediaMsgRefresher@c7f8.scheduleRefreshJob$job$1");
                return objLJFF;
            }
        }
        if (((ConcurrentHashMap) this.LLILLL.LJ).get(C2286608xc.LJFF(this.LLILZ)) == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MediaMsgRefresher@c7f8.scheduleRefreshJob$job$1");
            return unit;
        }
        this.LLILLL.LIZ.LJIIZILJ().getDomain().LIZ.LJJII(this.LLILZIL.getMsgType(), "proactive", C2097608Jq.LJ(), this.LLILZ);
        C870180YBs c870180YBsLIZ = this.LLILLL.LIZ.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILZLL;
        List listSingletonList = Collections.singletonList(this.LLILZIL);
        final C868670Y5x c868670Y5x = this.LLILLL;
        final long j2 = this.LLILZ;
        final C869590Y9l c869590Y9l = this.LLILZIL;
        c870180YBsLIZ.LLJILJILJ(new InterfaceC863600XuI<List<? extends C869590Y9l>>() { // from class: X.0Y5v
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                C868780Y6i c868780Y6i = c868670Y5x.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refresh media msg failed, error = ");
                sbLIZ.append(c0ymw);
                C868780Y6i.LJ(c868780Y6i, "MediaMsgRefresher", C2188811AlT.LIZIZ(sbLIZ), 4);
                c868670Y5x.LIZ.LJIIZILJ().getDomain().LIZ.LJJIFFI(j2, "proactive", c869590Y9l.getMsgType(), false, true, C2097608Jq.LJ());
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
            @Override // X.InterfaceC863600XuI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(java.util.List<? extends X.C869590Y9l> r16) {
                /*
                    r15 = this;
                    r2 = r16
                    java.util.List r2 = (java.util.List) r2
                    X.0Y5x r0 = r1
                    X.0Y6i r4 = r0.LIZLLL
                    java.lang.String r3 = "  proactive refresh msg success"
                    r1 = 4
                    java.lang.String r0 = "MediaMsgRefresher"
                    X.C868780Y6i.LJ(r4, r0, r3, r1)
                    X.0Y5x r3 = r1
                    long r0 = r2
                    r3.LIZJ(r0)
                    X.0Y5x r0 = r1
                    X.0YEM r0 = r0.LIZ
                    X.0XwD r0 = r0.LJIIZILJ()
                    X.0Y52 r0 = r0.getDomain()
                    X.0Y4c r7 = r0.LIZ
                    long r8 = r2
                    X.0Y9l r0 = r4
                    int r11 = r0.getMsgType()
                    java.util.Map r14 = X.C2097608Jq.LJ()
                    r12 = 1
                    if (r2 == 0) goto L62
                    long r0 = r2
                    java.util.Iterator r6 = r2.iterator()
                L3a:
                    boolean r2 = r6.hasNext()
                    r13 = 1
                    if (r2 == 0) goto L60
                    java.lang.Object r5 = r6.next()
                    r2 = r5
                    X.0Y9l r2 = (X.C869590Y9l) r2
                    long r3 = r2.getMsgId()
                    int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r2 != 0) goto L3a
                L50:
                    X.0Y9l r5 = (X.C869590Y9l) r5
                    if (r5 == 0) goto L62
                    boolean r0 = X.C870360YCk.LIZIZ(r5)
                    if (r0 != r12) goto L62
                L5a:
                    java.lang.String r10 = "proactive"
                    r7.LJJIFFI(r8, r10, r11, r12, r13, r14)
                    return
                L60:
                    r5 = 0
                    goto L50
                L62:
                    r13 = 0
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C868650Y5v.onSuccess(java.lang.Object):void");
            }
        }, str, listSingletonList);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaMsgRefresher@c7f8.scheduleRefreshJob$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
