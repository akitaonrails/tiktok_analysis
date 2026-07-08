package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881200z3O extends AbstractC1882430z5N {
    public final String LLJILJILJ;
    public final C01GW LLJILLL;
    public C0DKT LLJJ;

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881190z3N(this, null), 2);
    }

    public final String LJIL(String str) {
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        ArrayList arrayList = new ArrayList();
        try {
            c098200Yq = UriProtector.parse(this.LLJILJILJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Uri.EMPTY;
        }
        Uri uri = (Uri) c098200Yq;
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!C1881210z3P.LIZ.contains(str2) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('=');
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (arrayList.isEmpty()) {
            return str;
        }
        return u.LJJIFFI(str, "__MIX_COMMON_HOST_OUTTER_PARAMS=PLACE_HOLDER__", C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62), false);
    }

    public C1881200z3O(Context context, String str) {
        boolean z;
        Object c098200Yq;
        Object c098200Yq2;
        super(context, "universal_page");
        this.LLJILJILJ = str;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1881220z3Q(this));
        this.LLJILLL = c01gwLIZIZ;
        String strLIZIZ = ((C0KYM) c01gwLIZIZ.getValue()).LIZIZ("host_params");
        strLIZIZ = strLIZIZ == null ? "" : strLIZIZ;
        if (strLIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject = new JSONObject(strLIZIZ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject.opt(next));
                }
                C1882380z5I.LJII(LJII(), linkedHashMap);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("CommonMixPageHost", "initCommonParamFromSchema error", thM5exceptionOrNullimpl);
            }
        }
        String strLIZIZ2 = ((C0KYM) this.LLJILLL.getValue()).LIZIZ("common_tracking");
        strLIZIZ2 = strLIZIZ2 == null ? "" : strLIZIZ2;
        if (strLIZIZ2.length() != 0) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                JSONObject jSONObject2 = new JSONObject(strLIZIZ2);
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    linkedHashMap2.put(next2, jSONObject2.opt(next2));
                }
                C1882380z5I.LJII(LJIIIIZZ(), linkedHashMap2);
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                C20441214yg.LJFF("CommonMixPageHost", "initCommonTrackingParamFromSchema error", thM5exceptionOrNullimpl2);
            }
        }
        String strLIZIZ3 = ((C0KYM) this.LLJILLL.getValue()).LIZIZ("biz_name");
        String str2 = strLIZIZ3 != null ? strLIZIZ3 : "";
        C1882380z5I.LJI(LJII(), "biz_name", str2);
        C1882380z5I.LJI(LJII(), "original_schema", this.LLJILJILJ);
        C1882380z5I.LJI(LJIIIIZZ(), "biz_name", str2);
        LJIIZILJ("on_card_request_close");
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIIJ(Object obj, String str) {
        C0DKT c0dkt;
        if (Intrinsics.LJFF(str, "on_card_request_close") && (c0dkt = this.LLJJ) != null) {
            c0dkt.invoke();
        }
    }
}
