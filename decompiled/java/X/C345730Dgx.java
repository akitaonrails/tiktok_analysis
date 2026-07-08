package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity$initViews$5$2$netData$1", f = "NewCoverPreviewActivity.kt", l = {}, m = "invokeSuspend")
public final class C345730Dgx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C345750Dgz>>, Object> {
    public final /* synthetic */ C259800zU<List<Aweme>> LL;
    public final /* synthetic */ NewCoverPreviewActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345730Dgx(C259800zU<List<Aweme>> c259800zU, NewCoverPreviewActivity newCoverPreviewActivity, InterfaceC1364105Vn<? super C345730Dgx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = newCoverPreviewActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345730Dgx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel cover;
        C1C7U.LIZ("NewCoverPreviewActivity@cf98.initViews$5$2$netData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> items = this.LL.element;
        if (items == null) {
            C11NZ c11nzLIZ = C1220830hsH.LIZ((String) this.LLILLJJLI.LLILZ.getValue());
            c11nzLIZ.getClass();
            C345800Dh4 c345800Dh4 = new C345800Dh4();
            c11nzLIZ.LIZIZ(c345800Dh4);
            T tLIZ = c345800Dh4.LIZ();
            if (tLIZ != 0) {
                items = ((FeedItemList) tLIZ).getItems();
            } else {
                throw new NoSuchElementException();
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
        for (Aweme aweme : items) {
            Video video = aweme.getVideo();
            if (video != null) {
                cover = video.getCover();
            } else {
                cover = null;
            }
            AwemeExtKt.isTop(aweme);
            arrayList.add(new C345750Dgz(cover, null, true));
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LL(arrayList, 12));
        C1C7U.LIZIZ("NewCoverPreviewActivity@cf98.initViews$5$2$netData$1");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C345750Dgz>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
