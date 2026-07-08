package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$fetchTabList$2", f = "KaraokeViewModel.kt", l = {965, 967, 970}, m = "invokeSuspend")
public final class C097F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097F(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C097F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097F(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "KaraokeViewModel@e9e0.fetchTabList$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L3f
            if (r0 == r4) goto L70
            if (r0 == r5) goto L70
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r8)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r7.LLILLJJLI
            X.0U2Y r0 = r0.LL
            java.util.List<X.0Txp> r2 = r0.LJFF
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5d
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r7.LLILLJJLI
            X.0U2Y r0 = r0.LL
            r7.LL = r1
            java.lang.Object r8 = r0.LJIIIIZZ(r7)
            if (r8 != r3) goto L42
            X.C1C7U.LIZIZ(r6)
            return r3
        L3f:
            X.C155000ia.LIZIZ(r8)
        L42:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L73
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r7.LLILLJJLI
            X.097G r0 = new X.097G
            r0.<init>(r8)
            r7.LL = r4
            java.lang.Object r0 = r1.zQ2(r0, r7)
            if (r0 != r3) goto L73
            X.C1C7U.LIZIZ(r6)
            return r3
        L5d:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r7.LLILLJJLI
            X.097G r0 = new X.097G
            r0.<init>(r2)
            r7.LL = r5
            java.lang.Object r0 = r1.zQ2(r0, r7)
            if (r0 != r3) goto L73
            X.C1C7U.LIZIZ(r6)
            return r3
        L70:
            X.C155000ia.LIZIZ(r8)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C097F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
