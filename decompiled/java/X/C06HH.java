package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$onStreakExtensionUpdate$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C06HD LLILLJJLI;
    public StreakExtension LLILLL;
    public StreakPetData LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C06HD LLILZLL;
    public final /* synthetic */ StreakExtension LLIZ;
    public final /* synthetic */ StreakPetData LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HH(C06HD c06hd, StreakExtension streakExtension, StreakPetData streakPetData, InterfaceC1364105Vn<? super C06HH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c06hd;
        this.LLIZ = streakExtension;
        this.LLIZLLLIL = streakPetData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HH(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "StreakPetWidget@92f0.onStreakExtensionUpdate$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r3 = 0
            r8 = 1
            if (r0 == 0) goto L25
            if (r0 != r8) goto L1d
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r6 = r11.LLILZ
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension r9 = r11.LLILLL
            X.06HD r4 = r11.LLILLJJLI
            X.1DEV r2 = r11.LL
            X.C155000ia.LIZIZ(r12)
            goto L44
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.C155000ia.LIZIZ(r12)
            X.06HD r4 = r11.LLILZLL
            X.1DEV r2 = r4.LLJJIJI
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension r9 = r11.LLIZ
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r6 = r11.LLIZLLLIL
            r11.LL = r2
            r11.LLILLJJLI = r4
            r11.LLILLL = r9
            r11.LLILZ = r6
            r11.LLILZIL = r8
            java.lang.Object r0 = r2.LIZLLL(r3, r11)
            if (r0 != r1) goto L44
            X.C1C7U.LIZIZ(r10)
            return r1
        L44:
            r4.getClass()     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = X.C296670Bk1.LIZ()     // Catch: java.lang.Throwable -> Lbe
            r7 = 0
            if (r0 == 0) goto L67
            boolean r0 = X.C1571306Df.LJ(r6)     // Catch: java.lang.Throwable -> Lbe
            r5 = r0 ^ 1
            int r1 = r6.conversationType     // Catch: java.lang.Throwable -> Lbe
            int r0 = X.AbstractC1711506n3.LIZIZ     // Catch: java.lang.Throwable -> Lbe
            if (r1 != r0) goto L5c
            r1 = 1
            goto L5d
        L5c:
            r1 = 0
        L5d:
            boolean r0 = r9.shouldDisplayPromotionalWidget     // Catch: java.lang.Throwable -> Lbe
            if (r5 == 0) goto L67
            if (r1 == 0) goto L67
            if (r0 == 0) goto L67
            r5 = 1
            goto L68
        L67:
            r5 = 0
        L68:
            boolean r0 = X.C1590806Ks.LIZ     // Catch: java.lang.Throwable -> Lbe
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "onStreakExtensionUpdate shouldShowGroupHatchingWidget="
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r5 == 0) goto L77
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbe
            X.C1590806Ks.LIZ(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r5 == 0) goto L8c
            boolean r0 = r9.shouldDisplayPromotionalWidget     // Catch: java.lang.Throwable -> Lbe
            if (r0 != 0) goto L89
            r8 = 0
        L89:
            r4.LJI(r8)     // Catch: java.lang.Throwable -> Lbe
        L8c:
            r4.LJII()     // Catch: java.lang.Throwable -> Lbe
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto La9
            X.06Gk r1 = X.C1567806Bw.LJIIIIZZ(r0, r7)     // Catch: java.lang.Throwable -> Lbe
        L97:
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> Lbe
            X.06Gp r1 = r4.LIZJ(r6, r1, r0)     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r4.LLJ     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto Lab
            boolean r0 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto Lab
            r1.LIZ()     // Catch: java.lang.Throwable -> Lbe
            goto Lb5
        La9:
            r1 = r3
            goto L97
        Lab:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.LLJI     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto Lb5
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> Lbe
        Lb5:
            r2.LIZIZ(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lbe:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbe
            r2.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06HH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
