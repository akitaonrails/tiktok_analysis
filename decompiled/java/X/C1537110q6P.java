package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537110q6P extends C09AY implements Function0<InterfaceC1540940qCa> {
    public final /* synthetic */ C1051630dTN LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1537070q6L LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537110q6P(C1051630dTN c1051630dTN, C1537480q70 c1537480q70, String str, String str2, C1537070q6L c1537070q6L) {
        super(0);
        this.LL = c1051630dTN;
        this.LLILLJJLI = c1537480q70;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1537070q6L;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1540940qCa invoke() {
        AbstractC1537120q6Q abstractC1537120q6Q;
        int iLIZ = this.LL.LIZ();
        InterfaceC1105930esx interfaceC1105930esxInvoke = null;
        if (iLIZ == 0) {
            C1537480q70 c1537480q70 = this.LLILLJJLI;
            if (c1537480q70 != null) {
                Function1<Context, InterfaceC1540940qCa> function1LJIIL = c1537480q70.LJIIL();
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                return function1LJIIL.invoke(new MutableContextWrapper(C1161970gLL.LIZIZ().LIZJ()));
            }
        } else if (iLIZ == 1) {
            C1097680efe c1097680efe = (C1097680efe) this.LL;
            C1537480q70 c1537480q702 = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            C1537070q6L c1537070q6L = this.LLILZIL;
            if (c1097680efe.LJIJJ != null) {
                if (c1537480q702 != null) {
                    C1530570pvr.LIZJ(c1537480q702, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_PRELOAD_VIEW_START}, null);
                }
                InterfaceC1631620sYq<? super Context, ? super String, ? super C1537480q70, ? extends InterfaceC1105930esx> interfaceC1631620sYq = c1097680efe.LJIJJ;
                if (interfaceC1631620sYq != null) {
                    C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
                    interfaceC1105930esxInvoke = interfaceC1631620sYq.invoke(new MutableContextWrapper(C1161970gLL.LIZIZ().LIZJ()), str, c1537480q702);
                }
                if (c1537480q702 != null) {
                    C1530570pvr.LIZJ(c1537480q702, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_PRELOAD_VIEW_END}, null);
                }
            } else {
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadInfo of ");
                sbLIZ.append(str2);
                sbLIZ.append(" has not implementation kitViewFactory");
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.D, "PreloadTool");
                if (c1537070q6L != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadInfo of ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" has not implementation kitViewFactory");
                    c1537070q6L.LIZJ(str, str2, new C1537080q6M(C2188811AlT.LIZIZ(sbLIZ2)));
                }
                if (c1537480q702 != null && (abstractC1537120q6Q = (AbstractC1537120q6Q) c1537480q702.LJFF(AbstractC1537120q6Q.class)) != null) {
                    do {
                        abstractC1537120q6Q.LIZIZ();
                        abstractC1537120q6Q = abstractC1537120q6Q.LL;
                    } while (abstractC1537120q6Q != null);
                }
            }
        }
        return interfaceC1105930esxInvoke;
    }
}
