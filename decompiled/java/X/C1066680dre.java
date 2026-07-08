package X;

import android.content.Context;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountUserService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS132S0400000_3;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS58S2100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066680dre {
    public static final C1066680dre LIZ = new C1066680dre();

    public static final void LIZ(String str, Map map) {
        if (map != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("click_position", str);
            c2344009Gk.LIZJ(0, "is_from_external");
            c2344009Gk.LJII(map);
            C20684815ws.LJIILLIIL("news_anchor_h5_page_click", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1066690drf LIZIZ(Context context, final String str, String str2, Map map, String str3) {
        Object c098200Yq;
        Context context2;
        String curUserId = null;
        if (((Boolean) C00Z2.LIZ.getValue()).booleanValue()) {
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = str;
            WeakReference weakReference = new WeakReference(context);
            if (((Boolean) C00Z1.LIZ.getValue()).booleanValue()) {
                context2 = null;
            } else {
                context2 = context;
            }
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.url = str;
            sparkThirdContext.bizCert = new ThirdPartyBizCert(402685965);
            sparkThirdContext.callback = new C2202311BHh() { // from class: X.0T5y
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZJ(String str4) {
                    C259800zU<String> c259800zU2 = c259800zU;
                    T t = str4;
                    if (str4 == null) {
                        t = str;
                    }
                    c259800zU2.element = t;
                    new AwS556S0100000_12(c259800zU2, (C259800zU<TuxSheet>) 975);
                }
            };
            List<C12O0> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C12O0(context.getString(2131838803), R.drawable.d91, new AwS132S0400000_3(context2, (Context) weakReference, (WeakReference<Context>) c259800zU, (C259800zU<String>) map, (Map<String, String>) 2)), new C12O0(context.getString(2131847874), R.raw.icon_link, new AwS132S0400000_3(context2, (Context) weakReference, (WeakReference<Context>) c259800zU, (C259800zU<String>) map, (Map<String, String>) 3)));
            if (C1533950q1J.LJ(str2) && C1533950q1J.LJ(str3)) {
                C0XQ7.LJ();
                AccountUserService accountUserServiceLJIIJ = C0XQ7.LIZ.LJIIJ();
                if (accountUserServiceLJIIJ != null) {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                }
                if (!Intrinsics.LJFF(str2, curUserId)) {
                    ListProtector.add(listLJIILJJIL, 0, new C12O0(context.getString(R.string.s65), R.raw.icon_flag, new AwS58S2100000_18(str2, str3, (String) map, (Map<String, String>) 2)));
                }
            }
            sparkThirdContext.actions = listLJIILJJIL;
            sparkThirdContext.disableOpenInSystem = true;
            C1554300qY8.LIZIZ(context, sparkThirdContext);
            return new C1066690drf(true, false);
        }
        C013C c013c = new C013C();
        c013c.element = true;
        try {
            final AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(context, str, c013c, 10);
            new C828330WeV(new ThirdPartyBizCert(402685965)).LIZIZ(context, str, new InterfaceC828360WeY() { // from class: X.0drd
                @Override // X.InterfaceC828360WeY
                public final void LIZ(Context context3, String str4) {
                    awS132S1200000_16.invoke();
                }
            }, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return new C1066690drf(C189200o6.m8isSuccessimpl(c098200Yq), c013c.element);
    }
}
