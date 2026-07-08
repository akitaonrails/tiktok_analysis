package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 40, 49, 55, 58}, m = "invokeSuspend")
public final class C2254008sM extends C09AW implements Function2<AbstractC1421005hI<? super List<Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ Iterator<Object> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2254008sM(int i, int i2, Iterator<Object> it2, boolean z, boolean z2, InterfaceC1364105Vn<? super C2254008sM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = it2;
        this.LLJI = z;
        this.LLJIJIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2254008sM c2254008sM = new C2254008sM(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c2254008sM.LLILZLL = obj;
        return c2254008sM;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141 A[PHI: r2 r3
      0x0141: PHI (r2v11 X.08sN) = (r2v7 X.08sN), (r2v12 X.08sN) binds: [B:71:0x013f, B:81:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r3v6 X.05hI) = (r3v4 X.05hI), (r3v7 X.05hI) binds: [B:71:0x013f, B:81:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:28:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x011e -> B:69:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0158 -> B:81:0x0166). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2254008sM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super List<Object>> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
