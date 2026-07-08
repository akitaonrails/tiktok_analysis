package X;

import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895590zQb extends C09AY implements Function0<Unit> {
    public C1895590zQb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1897790zU9 c1897790zU9 = C1897790zU9.LL;
        C1897790zU9.LJIILIIL();
        C1895020zPg.LL.getClass();
        C1898560zVO.LL.getClass();
        C1898560zVO.LJIIJJI();
        if (!C1897980zUS.LIZIZ) {
            ((BaseTouchPointDataVM) C1897980zUS.LIZ.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1895080zPm) obj).LL);
                }
            }, null, new C1897990zUT());
            C1897980zUS.LIZIZ = true;
        }
        return Unit.LIZ;
    }
}
