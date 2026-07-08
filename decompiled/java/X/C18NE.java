package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.GylBackToTopEventParams;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18NE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NE extends FrameLayout implements InterfaceC1164530gPT, InterfaceC1141530foN {
    public static final /* synthetic */ int LLILZLL = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public String LLILLJJLI;
    public C21275518Nt LLILLL;
    public Function1<? super Integer, Unit> LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Map<String, Object> mapLJIIIIZZ;
        String str;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ec_gyl_global_state")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                mapLJIIIIZZ = C1871910yoP.LJIIIIZZ(interfaceC1107590evd);
            } else {
                mapLJIIIIZZ = null;
            }
            C21275518Nt c21275518Nt = this.LLILLL;
            if (c21275518Nt != null && (str = c21275518Nt.LIZIZ) != null) {
                C21272518Mp c21272518Mp = C21272518Mp.LIZ;
                String str2 = c21275518Nt.LIZJ;
                c21272518Mp.getClass();
                C1977107on c1977107on = C21272518Mp.LJII;
                c1977107on.getClass();
                RelatedProductInfo relatedProductInfo = c1977107on.get(C1977107on.LIZ(str, str2));
                if (relatedProductInfo != null) {
                    relatedProductInfo.sessionImpressionInfo.clear();
                    relatedProductInfo.sessionImpressionInfo.add(mapLJIIIIZZ);
                } else {
                    RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, new C13LG(50), new C13LG(50), new C13LG(50), new C13LG(1));
                    relatedProductInfo2.sessionImpressionInfo.add(mapLJIIIIZZ);
                    c1977107on.put(C1977107on.LIZ(str, str2), relatedProductInfo2);
                }
            }
        }
    }

    public C18NE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Integer num;
        if (Intrinsics.LJFF(str, "ec_gyl_back_to_top")) {
            try {
                GylBackToTopEventParams gylBackToTopEventParams = (GylBackToTopEventParams) C08JS.LIZ(str2, GylBackToTopEventParams.class);
                String str3 = null;
                if (gylBackToTopEventParams != null && gylBackToTopEventParams.scene != null) {
                    String str4 = gylBackToTopEventParams.scene;
                    if (this.LLILLL != null) {
                        str3 = "video_anchor_landing_page_guess_like";
                    }
                    if (Intrinsics.LJFF(str4, str3) && Intrinsics.LJFF(gylBackToTopEventParams.actionType, "click") && (num = gylBackToTopEventParams.backType) != null) {
                        int iIntValue = num.intValue();
                        Function1<? super Integer, Unit> function1 = this.LLILZ;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(iIntValue));
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
