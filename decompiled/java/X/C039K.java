package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.039K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039K implements Function1<C1397660mTU, Unit> {
    public final Context LL;
    public final ButtonAction LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function1<FetchInfo, Unit> LLILZ;
    public final Function1<ButtonAction, Boolean> LLILZIL;

    public final boolean LIZ() {
        ButtonActionInfo buttonActionInfo;
        ButtonAction buttonAction = this.LLILLJJLI;
        String str = null;
        if (buttonAction != null && (buttonActionInfo = buttonAction.buttonActionInfo) != null) {
            str = buttonActionInfo.schema;
        }
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        SmartRouter.buildRoute(this.LL, C919503ib.LIZ(str, C2097908Jt.LIZJ(new Pair("trackParams", C1741890vQh.LJIIIIZZ(C2097908Jt.LIZJ(new Pair("previous_page", "order_submit"))))))).open();
        return Unit.LIZ != null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        Function1<ButtonAction, Boolean> function1;
        FetchInfo fetchInfo;
        ButtonAction buttonAction = this.LLILLJJLI;
        if (buttonAction != null && ((function1 = this.LLILZIL) == null || !function1.invoke(buttonAction).booleanValue())) {
            Integer num = this.LLILLJJLI.buttonActionType;
            if (num != null) {
                if (num.intValue() == 1) {
                    this.LLILLL.invoke();
                } else if (num.intValue() == 2) {
                    Function1<FetchInfo, Unit> function12 = this.LLILZ;
                    if (function12 != null) {
                        ButtonActionInfo buttonActionInfo = this.LLILLJJLI.buttonActionInfo;
                        if (buttonActionInfo != null) {
                            fetchInfo = buttonActionInfo.fetchInfo;
                        } else {
                            fetchInfo = null;
                        }
                        function12.invoke(fetchInfo);
                    }
                } else if (num.intValue() == 3) {
                    LIZ();
                } else if (num.intValue() == 4) {
                    if (LIZ()) {
                        this.LLILLL.invoke();
                    } else {
                        C1233040iBy c1233040iBy = new C1233040iBy(this.LL);
                        c1233040iBy.LIZIZ(2131848101);
                        c1233040iBy.LIZLLL();
                    }
                }
            }
            Integer num2 = this.LLILLJJLI.buttonActionType;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                linkedHashMap.put("popup_name", "exception_ux_dialog");
                linkedHashMap.put("action_type", Integer.valueOf(iIntValue));
                C1018703yb.LIZIZ("tiktokec_popup_click", linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C039K(Context context, ButtonAction buttonAction, Function0<Unit> function0, Function1<? super FetchInfo, Unit> function1, Function1<? super ButtonAction, Boolean> function12) {
        this.LL = context;
        this.LLILLJJLI = buttonAction;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }
}
