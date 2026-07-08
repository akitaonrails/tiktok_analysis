package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$prepareAudienceSongList$2", f = "KaraokeViewModel.kt", l = {947, 948, 950, 952, 955}, m = "invokeSuspend")
public final class C097I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097I(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C097I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097I(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "KaraokeViewModel@e9e0.prepareAudienceSongList$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 5
            r4 = 4
            r3 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L24
            if (r0 == r5) goto L45
            if (r0 == r6) goto L58
            if (r0 == r3) goto L93
            if (r0 == r4) goto L93
            if (r0 == r7) goto L93
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L24:
            X.C155000ia.LIZIZ(r10)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r9.LLILLJJLI
            X.0U2Y r0 = r0.LL
            java.util.List<X.0Txp> r0 = r0.LJFF
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r9.LLILLJJLI
            X.097K r0 = X.C097K.LIZ
            r9.LL = r5
            java.lang.Object r0 = r1.zQ2(r0, r9)
            if (r0 != r2) goto L48
            X.C1C7U.LIZIZ(r8)
            return r2
        L45:
            X.C155000ia.LIZIZ(r10)
        L48:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r9.LLILLJJLI
            X.0U2Y r0 = r0.LL
            r9.LL = r6
            java.lang.Object r10 = r0.LJIIIIZZ(r9)
            if (r10 != r2) goto L5b
            X.C1C7U.LIZIZ(r8)
            return r2
        L58:
            X.C155000ia.LIZIZ(r10)
        L5b:
            java.util.List r10 = (java.util.List) r10
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L73
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r9.LLILLJJLI
            X.097J r0 = X.C097J.LIZ
            r9.LL = r3
            java.lang.Object r0 = r1.zQ2(r0, r9)
            if (r0 != r2) goto L96
            X.C1C7U.LIZIZ(r8)
            return r2
        L73:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r9.LLILLJJLI
            X.097L r0 = X.C097L.LIZ
            r9.LL = r4
            java.lang.Object r0 = r1.zQ2(r0, r9)
            if (r0 != r2) goto L96
            X.C1C7U.LIZIZ(r8)
            return r2
        L83:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r9.LLILLJJLI
            X.097L r0 = X.C097L.LIZ
            r9.LL = r7
            java.lang.Object r0 = r1.zQ2(r0, r9)
            if (r0 != r2) goto L96
            X.C1C7U.LIZIZ(r8)
            return r2
        L93:
            X.C155000ia.LIZIZ(r10)
        L96:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C097I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
