package X;

import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeViewModel$queryOrderStatus$2", f = "QrCodeViewModel.kt", l = {99, 143, 145}, m = "invokeSuspend")
public final class C1721890uuR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ QrCodeViewModel LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721890uuR(QrCodeViewModel qrCodeViewModel, Map<String, String> map, InterfaceC1364105Vn<? super C1721890uuR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = qrCodeViewModel;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1721890uuR c1721890uuR = new C1721890uuR(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1721890uuR.LLILZ = obj;
        return c1721890uuR;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:53|(1:55)(1:56)|135|57|(2:59|(6:71|(1:73)|75|(6:77|(2:79|81)(1:80)|(1:90)(1:(1:89)(1:(1:85)(1:88)))|(2:87|91)|92|93)|(1:95)|(1:100)(2:97|(2:99|101)))(2:61|(6:68|(1:70)|75|(0)|(0)|(0)(0))(6:63|(0)(1:67)|75|(0)|(0)|(0)(0))))|74|75|(0)|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:11|(1:145)|12|(1:14)(1:15)|(2:17|19)(1:18)|20|(1:22)(1:23)|(1:25)(1:26)|(1:28)(1:29)|(2:31|33)(1:32)|34|(3:36|127|128)|137|43|(1:48)(2:47|49)|(10:53|(1:55)(1:56)|135|57|(2:59|(6:71|(1:73)|75|(6:77|(2:79|81)(1:80)|(1:90)(1:(1:89)(1:(1:85)(1:88)))|(2:87|91)|92|93)|(1:95)|(1:100)(2:97|(2:99|101)))(2:61|(6:68|(1:70)|75|(0)|(0)|(0)(0))(6:63|(0)(1:67)|75|(0)|(0)|(0)(0))))|74|75|(0)|(0)|(0)(0))|102|147|103|(3:105|133|134)|143|106|119|(5:121|(2:123|124)|8|9|(2:129|130)(0))(3:125|9|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:11|145|12|(1:14)(1:15)|(2:17|19)(1:18)|20|(1:22)(1:23)|(1:25)(1:26)|(1:28)(1:29)|(2:31|33)(1:32)|34|(3:36|127|128)|137|43|(1:48)(2:47|49)|(10:53|(1:55)(1:56)|135|57|(2:59|(6:71|(1:73)|75|(6:77|(2:79|81)(1:80)|(1:90)(1:(1:89)(1:(1:85)(1:88)))|(2:87|91)|92|93)|(1:95)|(1:100)(2:97|(2:99|101)))(2:61|(6:68|(1:70)|75|(0)|(0)|(0)(0))(6:63|(0)(1:67)|75|(0)|(0)|(0)(0))))|74|75|(0)|(0)|(0)(0))|102|147|103|(3:105|133|134)|143|106|119|(5:121|(2:123|124)|8|9|(2:129|130)(0))(3:125|9|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:102:0x0183, B:51:0x00b3], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:102:0x0183, B:53:0x00bd], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:45:0x00a7, B:48:0x00ae], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:59:0x00d2, B:74:0x0106], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:68:0x00f0, B:63:0x00e0], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:71:0x00fb, B:61:0x00db], limit reached: 143 */
    /* JADX WARN: Path cross not found for [B:74:0x0106, B:59:0x00d2], limit reached: 143 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016e A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:57:0x00cd, B:59:0x00d2, B:65:0x00e5, B:67:0x00ed, B:93:0x014e, B:80:0x0126, B:95:0x0160, B:101:0x0179, B:100:0x016e, B:68:0x00f0, B:70:0x00f8, B:71:0x00fb, B:73:0x0103, B:102:0x0183), top: B:135:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:43:0x00a3, B:45:0x00a7, B:51:0x00b3, B:53:0x00bd, B:55:0x00c9, B:75:0x0107, B:77:0x0112, B:92:0x0145), top: B:137:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:57:0x00cd, B:59:0x00d2, B:65:0x00e5, B:67:0x00ed, B:93:0x014e, B:80:0x0126, B:95:0x0160, B:101:0x0179, B:100:0x016e, B:68:0x00f0, B:70:0x00f8, B:71:0x00fb, B:73:0x0103, B:102:0x0183), top: B:135:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:43:0x00a3, B:45:0x00a7, B:51:0x00b3, B:53:0x00bd, B:55:0x00c9, B:75:0x0107, B:77:0x0112, B:92:0x0145), top: B:137:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:57:0x00cd, B:59:0x00d2, B:65:0x00e5, B:67:0x00ed, B:93:0x014e, B:80:0x0126, B:95:0x0160, B:101:0x0179, B:100:0x016e, B:68:0x00f0, B:70:0x00f8, B:71:0x00fb, B:73:0x0103, B:102:0x0183), top: B:135:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01ca -> B:8:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x01d0 -> B:9:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721890uuR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
