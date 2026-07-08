package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZQL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQL extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ InterfaceC889250YuZ LL;
    public final /* synthetic */ C0ZQI LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ Photo2StickerViewModel LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ C0ZSY LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZQL(C19EG c19eg, C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, C0ZQI c0zqi, C0ZSY c0zsy, Photo2StickerViewModel photo2StickerViewModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(1);
        this.LL = interfaceC889250YuZ;
        this.LLILLJJLI = c0zqi;
        this.LLILLL = lifecycleCoroutineScope;
        this.LLILZ = photo2StickerViewModel;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = c0zsy;
        this.LLIZ = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.show();
        this.LLILLJJLI.LJ(C0ZL0.PHOTO2STICKER, null);
        C23250099c.LIZLLL(this.LLILLL, C0PEM.LIZJ, null, new C0ZQM(this.LLILZ, view, this.LLILZIL, this.LL, this.LLILZLL, this.LLIZ, null), 2);
        return Unit.LIZ;
    }
}
