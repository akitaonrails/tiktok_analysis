package X;

import android.content.Context;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS115S1100000_1;

/* JADX INFO: renamed from: X.03yX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1018303yX implements Function1<C1397660mTU, Unit> {
    public final Context LL;
    public final ButtonAction LLILLJJLI;
    public final int LLILLL;
    public final Map<String, Object> LLILZ;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        Integer num;
        Object obj;
        ButtonActionInfo buttonActionInfo;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        HashMap map;
        ButtonAction buttonAction = this.LLILLJJLI;
        if (buttonAction != null) {
            Integer num2 = buttonAction.buttonActionType;
            String str3 = "";
            if ((num2 != null && num2.intValue() == 3) || ((num = this.LLILLJJLI.buttonActionType) != null && num.intValue() == 4)) {
                Context context = this.LL;
                Map<String, Object> map2 = this.LLILZ;
                ButtonAction buttonAction2 = this.LLILLJJLI;
                if (buttonAction2 != null && (buttonActionInfo = buttonAction2.buttonActionInfo) != null && (str = buttonActionInfo.schema) != null) {
                    if (map2 != null) {
                        obj2 = map2.get("previous_page");
                    } else {
                        obj2 = null;
                    }
                    String str4 = str3;
                    if (obj2 instanceof String) {
                        String str5 = (String) obj2;
                        str4 = str3;
                        if (str5 != null) {
                            str4 = str5;
                        }
                    }
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("error_code", String.valueOf(this.LLILLL)), new Pair("popup_name", "go_to_cart"), new Pair("previous_page", str4), new Pair("action_type", "enter"));
                    c1507790pL7.getClass();
                    C1507790pL7.LIZJ("tiktokec_popup_click", mapLJIIIIZZ);
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    PageFinder pageFinderVia = PageFinder.via(btmSDK.getCurrentResumedPage());
                    String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c869003.d72822", pageFinderVia, null);
                    Map mapCreateReportParams$default = BtmSDK.createReportParams$default(btmSDK, "c869003.d72822", pageFinderVia, null, 4, null);
                    C10483048b c10483048b = new C10483048b();
                    c10483048b.LJIIIIZZ(new AwS115S1100000_1(str4, (String) mapCreateReportParams$default, (Map<String, ? extends Object>) 30));
                    c10483048b.LIZJ(false);
                    C1025203ze c1025203ze = C1025203ze.LIZ;
                    if (map2 != null) {
                        obj3 = map2.get("previous_page");
                    } else {
                        obj3 = null;
                    }
                    if (obj3 instanceof String) {
                        str2 = (String) obj3;
                    } else {
                        str2 = null;
                    }
                    c1025203ze.getClass();
                    if (map2 != null) {
                        map = new HashMap(map2);
                    } else {
                        map = null;
                    }
                    C1025203ze.LIZJ(context, map, null, null, str2, str, false, strCreateJumpSourceBtmToken);
                }
            } else {
                Map<String, Object> map3 = this.LLILZ;
                if (map3 != null) {
                    obj = map3.get("previous_page");
                } else {
                    obj = null;
                }
                Object obj4 = str3;
                obj4 = str3;
                if ((obj instanceof String) && obj != null) {
                    obj4 = obj;
                }
                C1507790pL7 c1507790pL72 = C1507790pL7.LIZ;
                Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("error_code", String.valueOf(this.LLILLL)), new Pair("popup_name", "go_to_cart"), new Pair("previous_page", obj4), new Pair("action_type", "stay"));
                c1507790pL72.getClass();
                C1507790pL7.LIZJ("tiktokec_popup_click", mapLJIIIIZZ2);
            }
        }
        return Unit.LIZ;
    }

    public C1018303yX(Context context, ButtonAction buttonAction, int i, Map<String, ? extends Object> map) {
        this.LL = context;
        this.LLILLJJLI = buttonAction;
        this.LLILLL = i;
        this.LLILZ = map;
    }
}
