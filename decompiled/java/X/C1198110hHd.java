package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM$uploadReTagPoi$2", f = "PoiSearchVM.kt", l = {468}, m = "invokeSuspend")
public final class C1198110hHd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PoiData LLILLL;
    public final /* synthetic */ PoiSearchVM LLILZ;
    public final /* synthetic */ EnumC1198680hIY LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198110hHd(String str, PoiData poiData, PoiSearchVM poiSearchVM, EnumC1198680hIY enumC1198680hIY, C19EG c19eg, InterfaceC1364105Vn<? super C1198110hHd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = poiData;
        this.LLILZ = poiSearchVM;
        this.LLILZIL = enumC1198680hIY;
        this.LLILZLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1198110hHd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[PHI: r2
      0x00ad: PHI (r2v9 java.lang.String) = (r2v6 java.lang.String), (r2v10 java.lang.String) binds: [B:48:0x00ab, B:46:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[PHI: r2
      0x00b1: PHI (r2v8 java.lang.String) = (r2v6 java.lang.String), (r2v9 java.lang.String) binds: [B:48:0x00ab, B:50:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f A[PHI: r12
      0x012f: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v5 java.lang.String) binds: [B:84:0x012b, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0134 A[PHI: r12 r13
      0x0134: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String), (r12v4 java.lang.String) binds: [B:87:0x0130, B:15:0x003b, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String), (r13v3 java.lang.String) binds: [B:87:0x0130, B:15:0x003b, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198110hHd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
