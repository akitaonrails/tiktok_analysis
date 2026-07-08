package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854300yM0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854300yM0(Function0<Unit> function0, Map<String, String> map, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        ConvertStyleItem convertStyleItem;
        TuxSheet tuxSheet;
        this.LL.invoke();
        WeakReference<TuxSheet> weakReference = C1854260yLw.LJIIIIZZ;
        if (weakReference != null && (tuxSheet = weakReference.get()) != null) {
            tuxSheet.dismiss();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LLILLJJLI.get("enter_from");
        if (str == null) {
            str = "";
        }
        String str2 = this.LLILLJJLI.get("enter_method");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLILLJJLI.get("process_id");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILLL;
        if (str4 == null) {
            str4 = "edit_image_selection";
        }
        C06X5 c06x5 = C1854260yLw.LJIIJ;
        String str5 = (c06x5 == null || (convertStyleItem = c06x5.LLILLL) == null) ? null : convertStyleItem.nameStarling;
        C1854260yLw.LIZ.getClass();
        C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
        String strLIZJ = c1852650yJL != null ? C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ)) : null;
        String str6 = this.LLILZ;
        String str7 = this.LLILZIL;
        String str8 = this.LLILZLL;
        String str9 = this.LLILLJJLI.get("tako_session_id");
        if (str9 == null) {
            str9 = "";
        }
        String str10 = this.LLILLJJLI.get("tako_chat_id");
        C1862330yYx.LJIIZILJ(c1862330yYx, str, str2, str3, str4, "click_cancel", str5, strLIZJ, str6, str7, str8, null, str9, str10 != null ? str10 : "", 9216);
        return Unit.LIZ;
    }
}
