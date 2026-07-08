package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.AdSparkBizWebViewClientDelegate;
import com.ss.android.ugc.aweme.spark.CommonSparkBizWebChromeDelegate;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0cf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020460cf6 implements InterfaceC1020440cf4 {
    public final C1039050d95 LIZ;

    @Override // X.InterfaceC1020440cf4
    public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1020440cf4
    public final AbstractC1542100qES LIZLLL() {
        return this.LIZ;
    }

    public C1020460cf6(C1039050d95 c1039050d95) {
        this.LIZ = c1039050d95;
    }

    @Override // X.InterfaceC1020440cf4
    public final List<InterfaceC1051730dTX> LIZ(C1051660dTQ c1051660dTQ) {
        ((InterfaceC1000280c8Y) ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17)).LJJIIJ();
        return C1020280ceo.LIZ(c1051660dTQ);
    }

    @Override // X.InterfaceC1020440cf4
    public final InterfaceC1057870ddR LIZJ(final AdSparkHybridContext adSparkHybridContext, final Context context, final String str, final Bundle bundle) {
        if (this.LIZ == null) {
            return null;
        }
        return new InterfaceC1057870ddR() { // from class: X.0d9a
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                String str2 = "";
                if (interfaceC1531560pxS instanceof C1541480qDS) {
                    SparkContext sparkContext = adSparkHybridContext;
                    String str3 = str;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    Uri uri = UriProtector.parse(str2);
                    Bundle bundle2 = bundle;
                    C1038730d8Z c1038730d8Z = new C1038730d8Z();
                    C1041690dDL.LIZ(uri, bundle2, c1038730d8Z);
                    sparkContext.LJJ(C1038730d8Z.class, c1038730d8Z);
                    C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
                    c1541480qDS.LIZLLL = new CommonSparkBizWebChromeDelegate(this.LIZ);
                    c1541480qDS.LIZJ = new AdSparkBizWebViewClientDelegate(this.LIZ);
                    return;
                }
                if (!(interfaceC1531560pxS instanceof C1537910q7h)) {
                    return;
                }
                if (C0BNL.LIZ() == 1 || C0BNL.LIZ() == 3) {
                    C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                    c1537910q7h.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(context), 1073741824));
                    c1537910q7h.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                    C649560Pdq c649560Pdq = new C649560Pdq();
                    c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.PART_ON_LAYOUT.id());
                    c649560Pdq.LIZ = Boolean.TRUE;
                    c1537910q7h.LJIJJ(c649560Pdq);
                }
                C1537910q7h c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS;
                c1537910q7h2.LJJII = AFwS252S0000000_16.get$arr$(600);
                SparkContext sparkContext2 = adSparkHybridContext;
                String str4 = str;
                if (str4 != null) {
                    str2 = str4;
                }
                Uri uri2 = UriProtector.parse(str2);
                Bundle bundle3 = bundle;
                C1027760cqs c1027760cqs = new C1027760cqs();
                C1041690dDL.LIZ(uri2, bundle3, c1027760cqs);
                sparkContext2.LJJ(C1027760cqs.class, c1027760cqs);
                c1537910q7h2.LJIIIIZZ(new C1035640d3a(this.LIZ.LL));
            }
        };
    }
}
