package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0scC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.EffectStreamingService$streamFlow$1", f = "EffectStreamingService.kt", l = {58, 60, 80, 88, 167, 176}, m = "invokeSuspend")
public final class C1633700scC extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC1633610sc3>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public InterfaceC1496620p36 LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1633750scH LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633700scC(C1633750scH c1633750scH, Map<String, String> map, InterfaceC1364105Vn<? super C1633700scC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c1633750scH;
        this.LLJ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633700scC c1633700scC = new C1633700scC(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1633700scC.LLIZ = obj;
        return c1633700scC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:27:0x00a2, B:29:0x00a8), top: B:100:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, X.0scD] */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, X.0scD] */
    /* JADX WARN: Type inference failed for: r2v24, types: [T, X.0sod] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01fe -> B:89:0x0201). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1633700scC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC1633610sc3> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final C1633710scD LIZ(C259800zU<EnumC1641410sod> c259800zU, C259800zU<C1633710scD> c259800zU2, C259800zU<C1633710scD> c259800zU3) {
        int i = C1633690scB.LIZ[c259800zU.element.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c259800zU2.element.LIZ(c259800zU3.element);
                }
                throw new C1954807lC();
            }
            return c259800zU3.element;
        }
        return c259800zU2.element;
    }
}
