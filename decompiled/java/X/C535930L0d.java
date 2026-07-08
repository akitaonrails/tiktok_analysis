package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoMvChosenResultImpl$onChosenResultAfterShowDialog$3$1", f = "PhotoMvChosenResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C535930L0d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C535980L0i LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ ArrayList<MediaModel> LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Intent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535930L0d(int i, Intent intent, ShortVideoContext shortVideoContext, C535980L0i c535980L0i, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(2, interfaceC1364105Vn);
        this.LL = c535980L0i;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = arrayList;
        this.LLILZ = c013c;
        this.LLILZIL = i;
        this.LLILZLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C535980L0i c535980L0i = this.LL;
        return new C535930L0d(this.LLILZIL, this.LLILZLL, this.LLILLJJLI, c535980L0i, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ.element, this.LLILZIL, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
