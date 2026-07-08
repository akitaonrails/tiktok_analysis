package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AFwS326S0000000_1;

/* JADX INFO: renamed from: X.0zN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893400zN4 extends C09AY implements Function0<Unit> {
    public C1893400zN4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1893410zN5.LIZ.getClass();
        if (!C1893410zN5.LIZJ && (C1868970yjf.LIZ().enablePreCreateWebView || C1868970yjf.LIZ().enablePreRenderWebView)) {
            C1893410zN5.LIZJ = true;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1097680efe c1097680efe = new C1097680efe();
            c1097680efe.LJIIZILJ = true;
            c1097680efe.LIZ = C1868970yjf.LIZ().biz;
            c1097680efe.LJ = !C1868970yjf.LIZ().enablePreRenderWebView;
            c1097680efe.LJIIIIZZ = AFwS315S0000000_28.get$arr$(42);
            c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(14);
            c1097680efe.LJIJJLI = C1868970yjf.LIZ().allowSchemaList;
            c1097680efe.LJIL = C1868970yjf.LIZ().denySchemaList;
            C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
            C01U6.LIZJ(AFwS217S0000000_28.get$arr$(657));
        }
        boolean z = C1868970yjf.LIZ().enableGeckoPreload || ((Boolean) C1893430zN7.LIZ.getValue()).booleanValue();
        if (!C1893410zN5.LIZLLL && z) {
            C1893410zN5.LIZLLL = true;
            C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
            if (c1893370zN1 != null) {
                c1893370zN1.LJIILIIL();
            }
        }
        return Unit.LIZ;
    }
}
