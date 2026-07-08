package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825780xc0 {
    public final Context LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final C490610JLv LIZJ = new InterfaceC1826050xcR() { // from class: X.0JLv
        @Override // X.InterfaceC1826050xcR
        public final void LIZ(Context context, String str) {
            Window window;
            Activity activityLIZ = C06MM.LIZ(context);
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, str, new Bundle());
        }

        @Override // X.InterfaceC1826050xcR
        public final void LIZJ(Context context, String str, Map<String, String> map) {
            C490590JLt.LIZ.getClass();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C490590JLt.LIZIZ(str, map), new Bundle());
        }

        @Override // X.InterfaceC1826050xcR
        public final void LIZLLL(Context context, String str, Map<String, String> map) {
            C490590JLt.LIZ.getClass();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C490590JLt.LIZIZ(str, map), new Bundle());
        }

        @Override // X.InterfaceC1826050xcR
        public final void LJ(Context context, String str, Map<String, String> map) {
            C490590JLt.LIZ.getClass();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C490590JLt.LIZIZ(str, map), new Bundle());
        }

        @Override // X.InterfaceC1826050xcR
        public final void LIZIZ(Context context, String str, String str2, Map map, String str3) {
            if (str2 != null && str2.length() != 0) {
                Uri uri = UriProtector.parse(str);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_schema");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                String strLIZIZ = C490620JLw.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str2, C490620JLw.LIZ(str3));
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                    if (Intrinsics.LJFF(str4, "sku_schema")) {
                        builderClearQuery.appendQueryParameter(str4, strLIZIZ);
                    } else {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str4).iterator();
                        while (it2.hasNext()) {
                            builderClearQuery.appendQueryParameter(str4, it2.next());
                        }
                    }
                }
                if (!UriProtector.getQueryParameterNames(uri).contains("sku_schema")) {
                    builderClearQuery.appendQueryParameter("sku_schema", strLIZIZ);
                }
                str = builderClearQuery.build().toString();
            }
            C490590JLt.LIZ.getClass();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C490590JLt.LIZIZ(str, map), new Bundle());
        }
    };
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1826090xcV(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C1826100xcW(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C1826080xcU(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1826070xcT(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C1826110xcX(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1826060xcS(this));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JLv] */
    public C1825780xc0(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = context;
        this.LIZIZ = interfaceC665370Q7z;
    }

    public final void LIZ(Context context, AbstractC1781930wTH abstractC1781930wTH, EnumC1420700n4e enumC1420700n4e) {
        if (abstractC1781930wTH instanceof C1781870wTB) {
            C1781870wTB c1781870wTB = (C1781870wTB) abstractC1781930wTH;
            int i = C1782090wTX.LIZ[c1781870wTB.LLILZLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ((C1825840xc6) this.LJII.getValue()).LIZ(new C1825850xc7(context, c1781870wTB.LLIZ, enumC1420700n4e, this.LIZIZ));
                                return;
                            }
                            throw new C1954807lC();
                        }
                        ((C1825830xc5) this.LIZLLL.getValue()).LIZ(new C1825890xcB(context, c1781870wTB.LLIZ, "", null, enumC1420700n4e, this.LIZIZ, 24));
                        return;
                    }
                    ((C1825810xc3) this.LJFF.getValue()).LIZ(new C1825990xcL(context, new C1781880wTC(c1781870wTB.LLJI, c1781870wTB.LL, null, c1781870wTB.LLIZ, 0, 0, false), enumC1420700n4e, this.LIZIZ));
                    return;
                }
                C1825820xc4 c1825820xc4 = (C1825820xc4) this.LJI.getValue();
                long j = c1781870wTB.LLJI;
                String str = c1781870wTB.LL;
                String str2 = c1781870wTB.LLILLJJLI;
                if (str2 == null) {
                    str2 = "";
                }
                c1825820xc4.LIZ(new C1825980xcK(context, new C1781850wT9(j, str, false, str2, c1781870wTB.LLIZ), enumC1420700n4e, this.LIZIZ));
                return;
            }
            ((C1825790xc1) this.LJ.getValue()).LIZ(new C1825920xcE(context, new C1781730wSx(c1781870wTB.LLJI, c1781870wTB.LL, c1781870wTB.LLIZ), enumC1420700n4e, this.LIZIZ));
            return;
        }
        if (abstractC1781930wTH instanceof C1781720wSw) {
            ((C1825830xc5) this.LIZLLL.getValue()).LIZ(new C1825890xcB(context, ((C1781720wSw) abstractC1781930wTH).LLILZ, "", null, enumC1420700n4e, this.LIZIZ, 24));
            return;
        }
        if (abstractC1781930wTH instanceof C1781730wSx) {
            ((C1825790xc1) this.LJ.getValue()).LIZ(new C1825920xcE(context, (C1781730wSx) abstractC1781930wTH, enumC1420700n4e, this.LIZIZ));
            return;
        }
        if (abstractC1781930wTH instanceof C1781850wT9) {
            ((C1825820xc4) this.LJI.getValue()).LIZ(new C1825980xcK(context, (C1781850wT9) abstractC1781930wTH, enumC1420700n4e, this.LIZIZ));
        } else if (abstractC1781930wTH instanceof C1781880wTC) {
            ((C1825810xc3) this.LJFF.getValue()).LIZ(new C1825990xcL(context, (C1781880wTC) abstractC1781930wTH, enumC1420700n4e, this.LIZIZ));
        } else {
            if (!(abstractC1781930wTH instanceof C1782030wTR)) {
                return;
            }
            ((C1825840xc6) this.LJII.getValue()).LIZ(new C1825850xc7(context, ((C1782030wTR) abstractC1781930wTH).LLILZ, enumC1420700n4e, this.LIZIZ));
        }
    }
}
