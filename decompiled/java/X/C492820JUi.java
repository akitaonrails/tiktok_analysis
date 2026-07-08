package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;

/* JADX INFO: renamed from: X.0JUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel", f = "SceneryPictureViewModel.kt", l = {195, 200}, m = "fetchMediaModelBitmap")
public final class C492820JUi extends AbstractC23140094w {
    public IHostSubscription.Params LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SceneryPictureViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492820JUi(SceneryPictureViewModel sceneryPictureViewModel, InterfaceC1364105Vn<? super C492820JUi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = sceneryPictureViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, null, this);
        C1C7U.LIZIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$1");
        return objVQ2;
    }
}
