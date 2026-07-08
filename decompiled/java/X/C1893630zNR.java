package X;

import android.content.Context;
import android.view.View;
import com.bytedance.touchpoint.api.model.IncentiveShareTextLink;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893630zNR implements InterfaceC1217270hmX {
    public static final C1893630zNR LL = new C1893630zNR();

    @Override // X.InterfaceC1217270hmX
    public final boolean LIZ(String str, String str2, HashMap map, List list) {
        boolean z;
        boolean z2;
        String str3;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        if (C2178808gE.LIZ().LJ(40) != null) {
            z = true;
        } else {
            z = false;
        }
        if (map != null && (str3 = (String) map.get("incentive_share_text_link_operation_type")) != null && str3.equals("1")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1217270hmX
    public final void LIZIZ(final Context context, final String str, List<String> list, Function1<? super View.OnClickListener, Unit> function1, Function2<? super String, ? super String, Unit> function2) {
        final boolean z;
        try {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            final IncentiveShareTextLink incentiveShareTextLink = (IncentiveShareTextLink) C2178808gE.LIZ().LJ(40);
            if (incentiveShareTextLink == null) {
                return;
            }
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            int i = incentiveShareTextLink.LIZ;
            Integer num = incentiveShareTextLink.LIZJ;
            c1893680zNW.getClass();
            C1893680zNW.LJIIJJI(i, num);
            if (incentiveShareTextLink.LIZIZ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = incentiveShareTextLink.icon;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = incentiveShareTextLink.text;
            if (str4 != null) {
                str3 = str4;
            }
            function2.invoke(str2, str3);
            function1.invoke(new View.OnClickListener() { // from class: X.0zNS
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1893580zNM c1893580zNM = C1893580zNM.LIZ;
                    Context context2 = context;
                    Integer numValueOf = Integer.valueOf(incentiveShareTextLink.LIZ);
                    IncentiveShareTextLink incentiveShareTextLink2 = incentiveShareTextLink;
                    String str5 = incentiveShareTextLink2.jumpLink;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C1893580zNM.LJ(c1893580zNM, context2, numValueOf, str5, incentiveShareTextLink2.LIZIZ, false, incentiveShareTextLink2.LJ, null, str, 64);
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    boolean z2 = z;
                    IncentiveShareTextLink incentiveShareTextLink3 = incentiveShareTextLink;
                    int i2 = incentiveShareTextLink3.LIZ;
                    Integer num2 = incentiveShareTextLink3.LIZJ;
                    c1894320zOY.getClass();
                    if (z2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        c1894320zOY.getClass();
                        C1894320zOY.LJIILJJIL(i2, linkedHashMap, num2, null, null);
                    }
                }
            });
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = incentiveShareTextLink.LIZ;
            Integer num2 = incentiveShareTextLink.LIZJ;
            c1894320zOY.getClass();
            if (z) {
                HashMap map = new HashMap();
                c1894320zOY.getClass();
                C1894320zOY.LJIJJ(i2, map, num2, null, null, "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
