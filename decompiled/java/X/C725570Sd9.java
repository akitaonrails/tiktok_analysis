package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Sd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$handleDoubleClick$2", f = "VideoDiggVM.kt", l = {}, m = "invokeSuspend")
public final class C725570Sd9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoDiggVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725570Sd9(VideoDiggVM videoDiggVM, String str, String str2, Aweme aweme, InterfaceC1364105Vn<? super C725570Sd9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoDiggVM;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C725570Sd9(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        Aweme aweme;
        C1C7U.LIZ("VideoDiggVM@76c8.handleDoubleClick$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        String authorUid = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        String str = this.LL.eventType;
        if (str == null) {
            str = "";
        }
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJJI("login_title", this.LLILLJJLI, c627150Oin.LIZ);
        C786410Ut5.LJJJI("group_id", this.LLILLL, c627150Oin.LIZ);
        VideoItemParams item = this.LL.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
        C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(this.LLILLL), c627150Oin.LIZ);
        C0XPD.LIZIZ(activityLIZ, str, "click_like", c627150Oin.LIZ, new C738960Syk(this.LL, this.LLILZ, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoDiggVM@76c8.handleDoubleClick$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
