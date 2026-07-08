package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0O48, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$3", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C0O48 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<? extends C0O3E> LL;
    public final /* synthetic */ BookDetailVM LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O48(C0O7A<? extends C0O3E> c0o7a, BookDetailVM bookDetailVM, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O48> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = bookDetailVM;
        this.LLILLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O48(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfoLIZ;
        C1C7U.LIZ("BookDetailVM@4059.toggleFavorite$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O4L.LIZLLL(C0O4K.BOOK, this.LLILLJJLI.vQ2(), this.LLILLJJLI.LLILLJJLI);
        BookDetailVM bookDetailVM = this.LLILLJJLI;
        bookDetailVM.setState(new AwS588S0100000_9(bookDetailVM, 396));
        BookDetail bookDetailLIZ = this.LLILLJJLI.getState().LL.LIZ();
        if (bookDetailLIZ != null) {
            topicRawInfoLIZ = bookDetailLIZ.LIZ();
        } else {
            topicRawInfoLIZ = null;
        }
        C1440005kM.LIZ(new C613490O4l(topicRawInfoLIZ, this.LLILLJJLI.LLILLJJLI));
        C2296808zG.LIZJ(this.LLILLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookDetailVM@4059.toggleFavorite$1$1$3");
        return unit;
    }
}
