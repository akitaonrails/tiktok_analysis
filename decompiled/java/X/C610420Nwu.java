package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$sendRequest$2$1", f = "OriginMusicListViewModel.kt", l = {286, 288, 288}, m = "invokeSuspend")
public final class C610420Nwu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0O7A<C615970ODz>> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ OriginMusicListViewModel LLILZIL;
    public final /* synthetic */ C610430Nwv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610420Nwu(C259800zU<C0O7A<C615970ODz>> c259800zU, boolean z, OriginMusicListViewModel originMusicListViewModel, C610430Nwv c610430Nwv, InterfaceC1364105Vn<? super C610420Nwu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = originMusicListViewModel;
        this.LLILZLL = c610430Nwv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610420Nwu(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "OriginMusicListViewModel@f6d8.sendRequest$2$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r8 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L23
            if (r0 == r7) goto L66
            if (r0 != r8) goto L7b
            X.00zU r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L1b:
            r5.element = r11
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.00zU r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
            goto L1b
        L29:
            X.C155000ia.LIZIZ(r11)
            X.00zU<X.0O7A<X.0ODz>> r5 = r10.LLILLL
            boolean r0 = r10.LLILZ
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r1 = r10.LLILZIL
            X.0Nwv r0 = r10.LLILZLL
            r10.LL = r5
            r10.LLILLJJLI = r2
            java.lang.Object r11 = r1.BQ2(r0, r10)
            if (r11 != r6) goto L1b
            X.C1C7U.LIZIZ(r9)
            return r6
        L44:
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r0 = r10.LLILZIL
            X.0SvR<X.0ODw> r0 = r0.LL
            X.00hg r4 = r0.getOperator()
            X.0ODw r4 = (X.InterfaceC615940ODw) r4
            X.0Nwv r0 = r10.LLILZLL
            java.lang.String r3 = r0.LIZIZ
            java.lang.String r2 = r0.LIZJ
            int r1 = r0.LIZLLL
            int r0 = r0.LJ
            r10.LL = r5
            r10.LLILLJJLI = r7
            X.01Wa r11 = r4.q(r3, r2, r1, r0)
            if (r11 != r6) goto L6b
            X.C1C7U.LIZIZ(r9)
            return r6
        L66:
            X.00zU r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L6b:
            X.01Wa r11 = (X.InterfaceC346201Wa) r11
            r10.LL = r5
            r10.LLILLJJLI = r8
            java.lang.Object r11 = X.C09IC.LJJIJ(r11, r10)
            if (r11 != r6) goto L1b
            X.C1C7U.LIZIZ(r9)
            return r6
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610420Nwu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
