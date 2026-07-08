package Y;

import X.AbstractC642900PJo;
import X.C09JN;
import X.C0PP3;
import X.C0Q73;
import X.C0R4T;
import X.C1C7U;
import X.C643520PLy;
import X.C675430QeT;
import X.C675460QeW;
import X.C689760R3u;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.os.Message;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AfS106S0300000_10 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS106S0300000_10 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS106S0300000_10.accept$0(Y.AfS106S0300000_10, java.lang.Object):void");
    }

    public static final void accept$1(AfS106S0300000_10 afS106S0300000_10, Object obj) {
        String str;
        C1C7U.LIZ("CompatDefaultLoadMore@2222.loadInternal$6");
        Throwable th = (Throwable) obj;
        Long lLJI = ((C643520PLy) afS106S0300000_10.l0).LJFF.LJI();
        if (lLJI != null) {
            C643520PLy c643520PLy = (C643520PLy) afS106S0300000_10.l0;
            Long lValueOf = Long.valueOf(lLJI.longValue());
            String str2 = c643520PLy.LJ.LIZ;
            if (!C0PP3.LIZIZ(th)) {
                str = "error";
            } else {
                str = "timeout";
            }
            C0PP3.LIZJ(0, str2, "inflow", lValueOf, str);
        }
        AbstractC642900PJo abstractC642900PJo = (AbstractC642900PJo) afS106S0300000_10.l1;
        if (abstractC642900PJo != null) {
            abstractC642900PJo.LIZJ = "error";
            abstractC642900PJo.LIZIZ();
        }
        Function1 function1 = (Function1) afS106S0300000_10.l2;
        Message messageObtain = Message.obtain();
        messageObtain.obj = th;
        function1.invoke(messageObtain);
        C1C7U.LIZIZ("CompatDefaultLoadMore@2222.loadInternal$6");
    }

    public static final void accept$2(AfS106S0300000_10 afS106S0300000_10, Object obj) {
        C1C7U.LIZ("ShopLegacySparkView@8dc2.loadDynamicViewWithGlobalProps$2");
        TemplateData templateData = (TemplateData) obj;
        C675430QeT c675430QeT = (C675430QeT) afS106S0300000_10.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS106S0300000_10.l1;
        c675430QeT.LJIIJJI = dynamicPatch;
        Map map = (Map) afS106S0300000_10.l2;
        c675430QeT.getClass();
        C0Q73 c0q73 = C0Q73.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL;
        String str = dynamicPatch.schema;
        C0R4T c0r4t = new C0R4T(c675430QeT, 15);
        C689760R3u c689760R3u = new C689760R3u(c675430QeT, 2);
        C675460QeW c675460QeW = new C675460QeW(c675430QeT);
        c0q73.getClass();
        C0Q73.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, str, templateData, false, c0r4t, c689760R3u, map, c675460QeW);
        C1C7U.LIZIZ("ShopLegacySparkView@8dc2.loadDynamicViewWithGlobalProps$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS106S0300000_10(Object obj, C643520PLy c643520PLy, AbstractC642900PJo abstractC642900PJo, Function1<? super Message, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = c643520PLy;
        this.l2 = abstractC642900PJo;
    }
}
