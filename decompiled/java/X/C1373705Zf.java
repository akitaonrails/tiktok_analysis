package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$detectZoomPanGesture$2", f = "TakoContentPreviewAssem.kt", l = {1581, 1583}, m = "invokeSuspend")
public final class C1373705Zf extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<C1378605aS, C1378605aS, Float, Boolean> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1373705Zf(InterfaceC1631620sYq<? super C1378605aS, ? super C1378605aS, ? super Float, Boolean> interfaceC1631620sYq, InterfaceC1364105Vn<? super C1373705Zf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1373705Zf c1373705Zf = new C1373705Zf(this.LLJ, interfaceC1364105Vn);
        c1373705Zf.LLIZLLLIL = obj;
        return c1373705Zf;
    }

    /* JADX WARN: Path cross not found for [B:13:0x0049, B:20:0x007a], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:20:0x007a, B:13:0x0049], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:22:0x0085, B:24:0x008d], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:24:0x008d, B:22:0x0085], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:43:0x00f1, B:9:0x0035], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:9:0x0035, B:43:0x00f1], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0162 -> B:7:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373705Zf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
