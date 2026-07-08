package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UED, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel$showDizzinessEffect$1", f = "MatchHammerViewModel.kt", l = {1030, 1037, 1045, 1048, 1052}, m = "invokeSuspend")
public final class C0UED extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public MatchHammerViewModel LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0UEA LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ MatchHammerViewModel LLJI;
    public final /* synthetic */ UUID LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UED(C0UEA c0uea, String str, String str2, MatchHammerViewModel matchHammerViewModel, UUID uuid, InterfaceC1364105Vn<? super C0UED> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0uea;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = matchHammerViewModel;
        this.LLJIJIL = uuid;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UED c0ued = new C0UED(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c0ued.LLILZLL = obj;
        return c0ued;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[PHI: r2 r3 r4 r11 r12
      0x00d5: PHI (r2v5 com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel) = 
      (r2v3 com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel)
      (r2v6 com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel)
     binds: [B:21:0x005d, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r3v5 java.util.UUID) = (r3v3 java.util.UUID), (r3v6 java.util.UUID) binds: [B:21:0x005d, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r4v4 java.lang.Object) = (r4v1 java.lang.Object), (r4v5 java.lang.Object) binds: [B:21:0x005d, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r11v2 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:21:0x005d, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:21:0x005d, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UED.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
