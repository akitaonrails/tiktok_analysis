package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.ExtensionsKt$detectZoomAndDrag$7", f = "Extensions.kt", l = {55, 57}, m = "invokeSuspend")
public final class C1373905Zh extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1395205d8 LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ Function0<Boolean> LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;
    public final /* synthetic */ Function2<C1378605aS, C1378605aS, Unit> LLJILJIL;
    public final /* synthetic */ Function0<Unit> LLJILJILJ;
    public final /* synthetic */ InterfaceC1631620sYq<C1378605aS, C1378605aS, Float, Unit> LLJILLL;
    public final /* synthetic */ Function1<C1395705dD, Unit> LLJJ;
    public final /* synthetic */ Function0<Unit> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1373905Zh(Function0<Boolean> function0, Function0<Unit> function02, Function2<? super C1378605aS, ? super C1378605aS, Unit> function2, Function0<Unit> function03, InterfaceC1631620sYq<? super C1378605aS, ? super C1378605aS, ? super Float, Unit> interfaceC1631620sYq, Function1<? super C1395705dD, Unit> function1, Function0<Unit> function04, InterfaceC1364105Vn<? super C1373905Zh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = function0;
        this.LLJIJIL = function02;
        this.LLJILJIL = function2;
        this.LLJILJILJ = function03;
        this.LLJILLL = interfaceC1631620sYq;
        this.LLJJ = function1;
        this.LLJJI = function04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1373905Zh c1373905Zh = new C1373905Zh(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
        c1373905Zh.LLJ = obj;
        return c1373905Zh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        if (r1 > 0) goto L71;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00cf, B:23:0x0081], limit reached: 82 */
    /* JADX WARN: Path cross not found for [B:36:0x00e1, B:43:0x0108], limit reached: 82 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[LOOP:1: B:13:0x0055->B:14:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fd -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373905Zh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
