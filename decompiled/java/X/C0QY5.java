package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QY5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QY5 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QY5(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = i;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("previous_page", this.LL);
        c957403oi2.LIZLLL("deeplink_type", this.LLILLJJLI);
        c957403oi2.LIZLLL("top_product_ids", this.LLILLL);
        c957403oi2.LIZLLL("creative_id", this.LLILZ);
        c957403oi2.LIZLLL("campaign_id", this.LLILZIL);
        c957403oi2.LIZLLL("schema", this.LLILZLL);
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLIZ));
        String str = this.LLIZLLLIL;
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("error_msg", str);
        c957403oi2.LIZLLL(Scene.SCENE_SERVICE, this.LLJ);
        return Unit.LIZ;
    }
}
