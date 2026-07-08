package X;

import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM$sendRequest$1", f = "PoiQuizPageVM.kt", l = {256}, m = "invokeSuspend")
public final class C1182790gsv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ PoiQuizPageVM LLILZ;
    public final /* synthetic */ LocationData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182790gsv(PoiQuizPageVM poiQuizPageVM, LocationData locationData, InterfaceC1364105Vn<? super C1182790gsv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = poiQuizPageVM;
        this.LLILZIL = locationData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1182790gsv(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5 A[Catch: Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:51:0x00d6, B:54:0x00dd, B:58:0x00ea, B:63:0x0106, B:66:0x010c, B:69:0x0112, B:76:0x0122, B:77:0x0124, B:79:0x0143, B:84:0x014e, B:86:0x0158, B:91:0x0162, B:93:0x0168, B:96:0x016e, B:97:0x0172, B:99:0x0178, B:101:0x018d, B:109:0x019f, B:111:0x01a5, B:112:0x01a7, B:114:0x01ab, B:108:0x0199, B:116:0x01b1, B:118:0x01b9, B:15:0x003b, B:19:0x0048, B:23:0x0055, B:25:0x005b, B:26:0x005d, B:28:0x0065, B:29:0x0067, B:30:0x006e, B:50:0x00cb, B:47:0x00c1, B:48:0x00c4, B:33:0x0075, B:37:0x007c, B:39:0x0090, B:41:0x0096, B:42:0x009a), top: B:123:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ab A[Catch: Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:51:0x00d6, B:54:0x00dd, B:58:0x00ea, B:63:0x0106, B:66:0x010c, B:69:0x0112, B:76:0x0122, B:77:0x0124, B:79:0x0143, B:84:0x014e, B:86:0x0158, B:91:0x0162, B:93:0x0168, B:96:0x016e, B:97:0x0172, B:99:0x0178, B:101:0x018d, B:109:0x019f, B:111:0x01a5, B:112:0x01a7, B:114:0x01ab, B:108:0x0199, B:116:0x01b1, B:118:0x01b9, B:15:0x003b, B:19:0x0048, B:23:0x0055, B:25:0x005b, B:26:0x005d, B:28:0x0065, B:29:0x0067, B:30:0x006e, B:50:0x00cb, B:47:0x00c1, B:48:0x00c4, B:33:0x0075, B:37:0x007c, B:39:0x0090, B:41:0x0096, B:42:0x009a), top: B:123:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01af  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r16v0, types: [long] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1182790gsv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
