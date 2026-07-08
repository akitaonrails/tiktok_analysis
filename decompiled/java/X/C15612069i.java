package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler$handlePhotoClick$1$1", f = "DMCameraClickHandler.kt", l = {60}, m = "invokeSuspend")
public final class C15612069i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ DefaultPhotoClickHandler LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ C869590Y9l LLILZLL;
    public final /* synthetic */ BaseTemplate LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15612069i(long j, DefaultPhotoClickHandler defaultPhotoClickHandler, View view, Aweme aweme, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, boolean z, InterfaceC1364105Vn<? super C15612069i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = defaultPhotoClickHandler;
        this.LLILZ = view;
        this.LLILZIL = aweme;
        this.LLILZLL = c869590Y9l;
        this.LLIZ = baseTemplate;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15612069i(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultPhotoClickHandler@36be.handlePhotoClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C013C c013c = new C013C();
            C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LLILLJJLI);
            if (c869590Y9lLJJJ != null && (c869590Y9lLJJJ.getMsgStatus() == 0 || c869590Y9lLJJJ.getMsgStatus() == 1)) {
                c013c.element = true;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C15613069j c15613069j = new C15613069j(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, c013c, this.LLIZLLLIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c15613069j) == objLJFF) {
                C1C7U.LIZIZ("DefaultPhotoClickHandler@36be.handlePhotoClick$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultPhotoClickHandler@36be.handlePhotoClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
