package X;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem$loadPictureSourceWithCache$1$1", f = "SearchTop1BackgroundAssem.kt", l = {}, m = "invokeSuspend")
public final class C591580NIe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchTop1BackgroundAssem LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591580NIe(SearchTop1BackgroundAssem searchTop1BackgroundAssem, Bitmap bitmap, Fragment fragment, InterfaceC1364105Vn<? super C591580NIe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchTop1BackgroundAssem;
        this.LLILLJJLI = bitmap;
        this.LLILLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591580NIe(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.No(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
