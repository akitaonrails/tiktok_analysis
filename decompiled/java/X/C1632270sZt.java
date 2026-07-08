package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.EffectPreloadManager$tryStartShootWithoutWaitingDownload$1", f = "EffectPreloadManager.kt", l = {176, 178, 185}, m = "invokeSuspend")
public final class C1632270sZt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1632250sZr LLILLL;
    public final /* synthetic */ Runnable LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ Music LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ ShootExtraData LLJI;
    public final /* synthetic */ AbstractC1661070tKL LLJIJIL;
    public final /* synthetic */ InterfaceC1661080tKM LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632270sZt(C1632250sZr c1632250sZr, Runnable runnable, Context context, String str, Map<String, String> map, Music music, String str2, ShootExtraData shootExtraData, AbstractC1661070tKL abstractC1661070tKL, InterfaceC1661080tKM interfaceC1661080tKM, InterfaceC1364105Vn<? super C1632270sZt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1632250sZr;
        this.LLILZ = runnable;
        this.LLILZIL = context;
        this.LLILZLL = str;
        this.LLIZ = map;
        this.LLIZLLLIL = music;
        this.LLJ = str2;
        this.LLJI = shootExtraData;
        this.LLJIJIL = abstractC1661070tKL;
        this.LLJILJIL = interfaceC1661080tKM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1632270sZt c1632270sZt = new C1632270sZt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1632270sZt.LLILLJJLI = obj;
        return c1632270sZt;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r21
            java.lang.String r9 = "EffectPreloadManager@9d7.tryStartShootWithoutWaitingDownload$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r20
            int r0 = r7.LL
            r5 = 0
            r4 = 3
            r1 = 2
            r8 = 1
            if (r0 == 0) goto L29
            if (r0 == r8) goto L24
            if (r0 == r1) goto L7b
            if (r0 != r4) goto Lbc
            X.C155000ia.LIZIZ(r2)
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L24:
            java.lang.Object r3 = r7.LLILLJJLI
            X.0sZr r3 = (X.C1632250sZr) r3
            goto L48
        L29:
            X.C155000ia.LIZIZ(r2)
            X.0sZr r0 = r7.LLILLL
            X.0956 r0 = r0.LIZIZ
            if (r0 != 0) goto L69
            X.0sZr r3 = r7.LLILLL
            android.content.Context r2 = r7.LLILZIL
            java.lang.String r1 = r7.LLILZLL
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LLIZ
            r7.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L51
            r7.LL = r8     // Catch: java.lang.Throwable -> L51
            r3.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = X.C1632250sZr.LIZ(r2, r1, r0, r7)     // Catch: java.lang.Throwable -> L51
            if (r2 != r6) goto L4b
            goto Lc4
        L48:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L51
        L4b:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2     // Catch: java.lang.Throwable -> L51
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L51
            goto L5d
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L5d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L64
            r2 = r5
        L64:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            r3.LIZJ = r2
            goto L7e
        L69:
            X.0sZr r0 = r7.LLILLL
            X.0956 r0 = r0.LIZIZ
            if (r0 == 0) goto L7e
            r7.LL = r1
            java.lang.Object r0 = r0.LJJZ(r7)
            if (r0 != r6) goto L7e
            X.C1C7U.LIZIZ(r9)
            return r6
        L7b:
            X.C155000ia.LIZIZ(r2)
        L7e:
            X.0sZr r0 = r7.LLILLL
            com.ss.android.ugc.effectmanager.effect.model.Effect r13 = r0.LIZJ
            if (r13 != 0) goto L8f
            java.lang.Runnable r0 = r7.LLILZ
            r0.run()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L8f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0sZu r10 = new X.0sZu
            X.0sZr r11 = r7.LLILLL
            java.lang.String r12 = r7.LLILZLL
            com.ss.android.ugc.aweme.music.model.Music r14 = r7.LLIZLLLIL
            java.lang.String r15 = r7.LLJ
            com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r2 = r7.LLJI
            X.0tKL r1 = r7.LLJIJIL
            X.0tKM r0 = r7.LLJILJIL
            r19 = 0
            r17 = r1
            r18 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7.LLILLJJLI = r5
            r7.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r10)
            if (r0 != r6) goto L1e
            X.C1C7U.LIZIZ(r9)
            return r6
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc4:
            X.C1C7U.LIZIZ(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1632270sZt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
