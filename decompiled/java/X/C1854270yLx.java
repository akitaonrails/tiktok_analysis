package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854270yLx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ConvertStyleItem LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854270yLx(int i, Map<String, String> map, String str, ConvertStyleItem convertStyleItem, String str2, String str3, String str4) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = convertStyleItem;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0yLz] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        ?? arrayList;
        C1854290yLz c1854290yLz;
        C1854290yLz c1854290yLz2;
        List<C06X5> styleData;
        C1854260yLw c1854260yLw = C1854260yLw.LIZ;
        int i = this.LL;
        c1854260yLw.getClass();
        WeakReference<C1854290yLz> weakReference = C1854260yLw.LJIIIZ;
        String str = null;
        if (weakReference == null || (c1854290yLz2 = weakReference.get()) == null || (styleData = c1854290yLz2.getStyleData()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(styleData, 10));
            int i2 = 0;
            for (C06X5 c06x5 : styleData) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C06X5 c06x52 = c06x5;
                if (i2 == i) {
                    boolean z = c06x52.LLILLJJLI;
                    c06x52.LLILLJJLI = !z;
                    C1854260yLw.LJIIJ = !z ? c06x52 : null;
                } else {
                    c06x52.LLILLJJLI = false;
                }
                arrayList.add(c06x52);
                i2 = i3;
            }
        }
        WeakReference<C1854290yLz> weakReference2 = C1854260yLw.LJIIIZ;
        if (weakReference2 != null && (c1854290yLz = weakReference2.get()) != 0) {
            c1854290yLz.setStyleData(arrayList);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = this.LLILLJJLI.get("enter_from");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLILLJJLI.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILLJJLI.get("process_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.LLILLL;
        if (str5 == null) {
            str5 = "edit_image_selection";
        }
        String str6 = this.LLILZ.nameStarling;
        C1854260yLw.LIZ.getClass();
        C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
        String strLIZJ = c1852650yJL != null ? C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ)) : null;
        String str7 = this.LLILZIL;
        if (str7 == null) {
            C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
            if (c1852650yJL2 != null) {
                str = c1852650yJL2.LJI;
            }
        } else {
            str = str7;
        }
        String str8 = this.LLILZLL;
        String str9 = this.LLIZ;
        String str10 = this.LLILLJJLI.get("tako_session_id");
        if (str10 == null) {
            str10 = "";
        }
        String str11 = this.LLILLJJLI.get("tako_chat_id");
        C1862330yYx.LJIIZILJ(c1862330yYx, str2, str3, str4, str5, "click_style", str6, strLIZJ, str, str8, str9, null, str10, str11 != null ? str11 : "", 9216);
        return Unit.LIZ;
    }
}
