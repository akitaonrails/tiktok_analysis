package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M99, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M99 extends C09AY implements Function1<C433800Gzi, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ Size LLILLJJLI;
    public final /* synthetic */ C05P0<String> LLILLL;
    public final /* synthetic */ BasicMediaEngine LLILZ;
    public final /* synthetic */ C05P0<Size> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C05P0<InterfaceC420801kM> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M99(SocMediaResource socMediaResource, Size size, C05P0<String> c05p0, BasicMediaEngine basicMediaEngine, C05P0<Size> c05p02, boolean z, C05P0<InterfaceC420801kM> c05p03) {
        super(1);
        this.LL = socMediaResource;
        this.LLILLJJLI = size;
        this.LLILLL = c05p0;
        this.LLILZ = basicMediaEngine;
        this.LLILZIL = c05p02;
        this.LLILZLL = z;
        this.LLIZ = c05p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C433800Gzi c433800Gzi) {
        Size value;
        ImageView.ScaleType scaleType;
        String str;
        C433800Gzi c433800Gzi2 = c433800Gzi;
        if (TextUtils.isEmpty(this.LL.tiktokMediaModel.mediaRatio)) {
            SocMediaResource socMediaResource = this.LL;
            C0M9C c0m9c = MediaEngine.Companion;
            TikTokMediaModel tikTokMediaModel = socMediaResource.tiktokMediaModel;
            int i = tikTokMediaModel.width;
            int i2 = tikTokMediaModel.height;
            c0m9c.getClass();
            if (i > i2) {
                str = "horizontal";
            } else if (i < i2) {
                str = "vertical";
            } else {
                str = "square";
            }
            socMediaResource.tiktokMediaModel.mediaRatio = str;
        }
        if (!Intrinsics.LJFF(this.LLILLL.getValue(), this.LL.LIZ())) {
            final BasicMediaEngine basicMediaEngine = this.LLILZ;
            InterfaceC529900KqK interfaceC529900KqK = new InterfaceC529900KqK() { // from class: X.0M98
                public long LIZ;

                @Override // X.InterfaceC529900KqK
                public final void onFailure(Throwable th) {
                }

                @Override // X.InterfaceC529900KqK
                public final void LIZ() {
                    C0LJI c0ljiLIZ;
                    if (this.LIZ <= 0 || (c0ljiLIZ = basicMediaEngine.LIZ()) == null) {
                        return;
                    }
                    c0ljiLIZ.LIZ(SystemClock.elapsedRealtime() - this.LIZ);
                }

                @Override // X.InterfaceC529900KqK
                public final void LIZIZ() {
                    this.LIZ = SystemClock.elapsedRealtime();
                }
            };
            if (!C0LJ5.LIZIZ() || !C0LJ5.LIZ().enableEarlyGridRender || (value = this.LLILLJJLI) == null) {
                value = this.LLILZIL.getValue();
                if (value != null) {
                }
            }
            boolean z = this.LLILZLL;
            SocMediaResource socMediaResource2 = this.LL;
            BasicMediaEngine basicMediaEngine2 = this.LLILZ;
            C05P0<InterfaceC420801kM> c05p0 = this.LLIZ;
            C05P0<String> c05p02 = this.LLILLL;
            InterfaceC420801kM value2 = c05p0.getValue();
            if (value2 != null) {
                value2.dispose();
            }
            if (z) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                C054G c054g = C0L2B.LIZ;
                if (C567840MOw.LIZ(socMediaResource2)) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                } else {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            }
            c433800Gzi2.setScaleType(scaleType);
            basicMediaEngine2.imageLoader.getClass();
            c05p0.setValue(C0L2B.LIZIZ(c433800Gzi2, socMediaResource2, value, interfaceC529900KqK));
            c05p02.setValue(socMediaResource2.LIZ());
        }
        return Unit.LIZ;
    }
}
