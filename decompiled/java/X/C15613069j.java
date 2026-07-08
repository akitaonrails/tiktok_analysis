package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler$handlePhotoClick$1$1$1", f = "DMCameraClickHandler.kt", l = {}, m = "invokeSuspend")
public final class C15613069j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DefaultPhotoClickHandler LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ BaseTemplate LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15613069j(DefaultPhotoClickHandler defaultPhotoClickHandler, View view, Aweme aweme, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, C013C c013c, boolean z, InterfaceC1364105Vn<? super C15613069j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = defaultPhotoClickHandler;
        this.LLILLJJLI = view;
        this.LLILLL = aweme;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = baseTemplate;
        this.LLILZLL = c013c;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15613069j(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultPhotoClickHandler@36be.handlePhotoClick$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DefaultPhotoClickHandler.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL.element, null, this.LLIZ, 32);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultPhotoClickHandler@36be.handlePhotoClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
