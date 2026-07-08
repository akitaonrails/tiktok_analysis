package Y;

import X.C1189060h32;
import X.C123100dR;
import X.C13LP;
import X.C1C7U;
import X.C2156708cf;
import X.C2344009Gk;
import X.InterfaceC2156608ce;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS2S2100000_3 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ArrayList arrayList;
        List listLL;
        List list = (List) this.l2;
        if (list == null || (listLL = C13LP.LL(list, 5)) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                String str = ((PoiData) it2.next()).poiId;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList(arrayList2);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1189060h32.LJJIFFI(c2344009Gk, "enter_from", "video_post_page");
        C1189060h32.LJJIFFI(c2344009Gk, "invoke_reason", this.s0);
        C1189060h32.LJJIFFI(c2344009Gk, "invoke_reasults", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        if (!C123100dR.LIZ(this.s1)) {
            C1189060h32.LJJIFFI(c2344009Gk, "is_use_content", CardStruct.IStatusCode.DEFAULT);
        } else {
            C1189060h32.LJJIFFI(c2344009Gk, "is_use_content", "1");
            C1189060h32.LJJIFFI(c2344009Gk, "content_param", this.s1);
        }
    }

    public static final void run$0(ARunnableS2S2100000_3 aRunnableS2S2100000_3) {
        Function2 function2 = (Function2) aRunnableS2S2100000_3.l2;
        String str = aRunnableS2S2100000_3.s0;
        String str2 = aRunnableS2S2100000_3.s1;
        C1C7U.LIZ("GameResourceProvider$download$2@b1e9.onStart$1L");
        if (function2 != null) {
            function2.invoke(str, str2);
        }
        C1C7U.LIZIZ("GameResourceProvider$download$2@b1e9.onStart$1L");
    }

    public static final void run$1(ARunnableS2S2100000_3 aRunnableS2S2100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("HttpUtils@e291.doPostRequest$1");
        try {
            C2156708cf.LIZJ(aRunnableS2S2100000_3.s0, aRunnableS2S2100000_3.s1, (InterfaceC2156608ce) aRunnableS2S2100000_3.l2);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("HttpUtils@e291.doPostRequest$1");
    }

    public static final void run$2(ARunnableS2S2100000_3 aRunnableS2S2100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMobHelper@e78c.mobPostLocationRecommendation$1");
        try {
            aRunnableS2S2100000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMobHelper@e78c.mobPostLocationRecommendation$1");
    }

    public ARunnableS2S2100000_3(String str, String str2, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
    }
}
