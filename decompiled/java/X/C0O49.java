package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0010000_9;
import njp.a;

/* JADX INFO: renamed from: X.0O49, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$1", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C0O49 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BookDetailVM LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O49(BookDetailVM bookDetailVM, boolean z, InterfaceC1364105Vn<? super C0O49> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bookDetailVM;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O49(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfoLIZ;
        C1C7U.LIZ("BookDetailVM@4059.toggleFavorite$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O4L.LIZLLL(C0O4K.BOOK, this.LL.vQ2(), !this.LLILLJJLI);
        this.LL.setState(new AwS24S0010000_9(this.LLILLJJLI, 11));
        BookDetail bookDetailLIZ = this.LL.getState().LL.LIZ();
        if (bookDetailLIZ != null) {
            topicRawInfoLIZ = bookDetailLIZ.LIZ();
        } else {
            topicRawInfoLIZ = null;
        }
        C1440005kM.LIZ(new C613490O4l(topicRawInfoLIZ, !this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookDetailVM@4059.toggleFavorite$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
