package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.092j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$setupBitmapReadyListener$bitmapReadyCallback$1$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C23075092j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ h LL;
    public final /* synthetic */ C535700Kzg LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23075092j(h hVar, C535700Kzg c535700Kzg, Bitmap bitmap, InterfaceC1364105Vn<? super C23075092j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hVar;
        this.LLILLJJLI = c535700Kzg;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23075092j(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.setupBitmapReadyListener$bitmapReadyCallback$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLLLLIL(false);
        MediaModel mediaModel = (MediaModel) C13LP.LJJJLL(this.LLILLJJLI.LIZIZ);
        if (mediaModel != null) {
            str = mediaModel.id;
        } else {
            str = null;
        }
        h hVar = this.LL;
        hVar.LLLII = C23250099c.LIZLLL((InterfaceC497601wk) hVar.LLLI.getValue(), null, null, new C23071092f(this.LLILLL, hVar, str, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.setupBitmapReadyListener$bitmapReadyCallback$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
