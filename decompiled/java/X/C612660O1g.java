package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612660O1g extends C09AY implements Function1<C612620O1c, Unit> {
    public final /* synthetic */ SceneryPictureViewModel LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612660O1g(SceneryPictureViewModel sceneryPictureViewModel, Bitmap bitmap) {
        super(1);
        this.LL = sceneryPictureViewModel;
        this.LLILLJJLI = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C612620O1c c612620O1c) {
        this.LL.setState(new C612630O1d(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
