package X;

import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18M6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M6 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ AwemePruningModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18M6(int i, AwemePruningModel awemePruningModel, Long l, boolean z) {
        super(1);
        this.LL = awemePruningModel;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        String string;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        AwemePruningModel awemePruningModel = this.LL;
        String str3 = "";
        if (awemePruningModel == null || (str = awemePruningModel.eventType) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("enter_from", str);
        AwemePruningModel awemePruningModel2 = this.LL;
        if (awemePruningModel2 != null && (str2 = awemePruningModel2.authorUid) != null) {
            str3 = str2;
        }
        c957403oi2.LIZLLL("author_id", str3);
        c957403oi2.LIZLLL("item_order", String.valueOf(this.LLILLJJLI + 1));
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLILLL ? 1 : 0));
        c957403oi2.LIZLLL("is_from_comment", "1");
        Long l = this.LLILZ;
        if (l == null || (string = l.toString()) == null) {
            string = "-1";
        }
        c957403oi2.LIZLLL("click_to_show_duration", string);
        return Unit.LIZ;
    }
}
