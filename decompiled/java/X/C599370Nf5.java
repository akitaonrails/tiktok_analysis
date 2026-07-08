package X;

import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599370Nf5 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599370Nf5(int i, int i2, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, List list) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = num;
        this.LLILZLL = list;
        this.LLIZ = num2;
        this.LLIZLLLIL = l;
        this.LLJ = str4;
        this.LLJI = l2;
        this.LLJIJIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("type", Integer.valueOf(this.LL));
        String str = this.LLILLJJLI;
        if (str != null) {
            c957403oi2.LIZLLL("enter_from", str);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("author_id", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("group_id", str3);
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("req_type", num);
        }
        c957403oi2.LIZLLL("product_ids", C13LP.LJJLIIIJ(this.LLILZLL, ",", null, null, 0, null, null, 62));
        Integer num2 = this.LLILZIL;
        if (num2 != null) {
            num2.intValue();
            c957403oi2.LIZLLL("req_type", num2);
        }
        Integer num3 = this.LLIZ;
        if (num3 != null) {
            c957403oi2.LIZLLL("error_code", Integer.valueOf(num3.intValue()));
        }
        Long l = this.LLIZLLLIL;
        if (l != null) {
            c957403oi2.LIZLLL("duration", Long.valueOf(l.longValue()));
        }
        String str4 = this.LLJ;
        if (str4 != null) {
            c957403oi2.LIZLLL("log_id", str4);
        }
        Long l2 = this.LLJI;
        if (l2 != null) {
            c957403oi2.LIZLLL("click_duration", Long.valueOf(l2.longValue()));
        }
        c957403oi2.LIZLLL(Scene.SCENE_SERVICE, Integer.valueOf(this.LLJIJIL));
        return Unit.LIZ;
    }
}
