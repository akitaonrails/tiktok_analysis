package X;

import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R1S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1S extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ PageType LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R1S(int i, boolean z, PageType pageType) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = pageType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("album_authorized", this.LL);
        jSONObject2.put("camera_authorized", this.LLILLJJLI ? 1 : 0);
        int i = C0R1R.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "pdp_main_pic_similar";
            } else {
                str = "album";
            }
        } else {
            str = "take_photo";
        }
        jSONObject2.put("button_name", str);
        return Unit.LIZ;
    }
}
