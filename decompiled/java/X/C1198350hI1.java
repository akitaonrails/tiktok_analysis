package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel$queryHighlights$1", f = "MyMomentsSharedViewModel.kt", l = {128, 164}, m = "invokeSuspend")
public final class C1198350hI1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MyMomentsSharedViewModel LLILZ;
    public final /* synthetic */ Function2<EnumC1198360hI2, String, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1198350hI1(MyMomentsSharedViewModel myMomentsSharedViewModel, Function2<? super EnumC1198360hI2, ? super String, Unit> function2, InterfaceC1364105Vn<? super C1198350hI1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = myMomentsSharedViewModel;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1198350hI1 c1198350hI1 = new C1198350hI1(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1198350hI1.LLILLL = obj;
        return c1198350hI1;
    }

    /* JADX WARN: Path cross not found for [B:26:0x0078, B:37:0x0098], limit reached: 68 */
    /* JADX WARN: Path cross not found for [B:37:0x0098, B:26:0x0078], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: Exception -> 0x00f6, TryCatch #1 {Exception -> 0x00f6, blocks: (B:24:0x0072, B:26:0x0078, B:27:0x007c, B:28:0x007f, B:38:0x009a, B:44:0x00ab, B:45:0x00b1, B:53:0x00d6, B:54:0x00db, B:55:0x00dc, B:57:0x00e7, B:29:0x0082, B:30:0x0085, B:31:0x0088, B:32:0x008b, B:33:0x008e, B:34:0x0091, B:35:0x0094, B:37:0x0098), top: B:67:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7 A[Catch: Exception -> 0x00f6, TryCatch #1 {Exception -> 0x00f6, blocks: (B:24:0x0072, B:26:0x0078, B:27:0x007c, B:28:0x007f, B:38:0x009a, B:44:0x00ab, B:45:0x00b1, B:53:0x00d6, B:54:0x00db, B:55:0x00dc, B:57:0x00e7, B:29:0x0082, B:30:0x0085, B:31:0x0088, B:32:0x008b, B:33:0x008e, B:34:0x0091, B:35:0x0094, B:37:0x0098), top: B:67:0x0072 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cb -> B:15:0x003b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198350hI1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
