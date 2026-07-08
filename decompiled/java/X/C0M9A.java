package X;

import android.text.TextUtils;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M9A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9A extends C09AY implements Function1<C433800Gzi, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ C05P0<String> LLILLJJLI;
    public final /* synthetic */ C05P0<Size> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ PurePreviewMediaEngine LLILZIL;
    public final /* synthetic */ C05P0<InterfaceC420801kM> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9A(SocMediaResource socMediaResource, C05P0<String> c05p0, C05P0<Size> c05p02, boolean z, PurePreviewMediaEngine purePreviewMediaEngine, C05P0<InterfaceC420801kM> c05p03) {
        super(1);
        this.LL = socMediaResource;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = z;
        this.LLILZIL = purePreviewMediaEngine;
        this.LLILZLL = c05p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C433800Gzi c433800Gzi) {
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
        C05P0<String> c05p0 = this.LLILLJJLI;
        C1404305eb c1404305eb = PurePreviewMediaEngine.Companion;
        if (!Intrinsics.LJFF(c05p0.getValue(), this.LL.LIZ())) {
            InterfaceC529900KqK interfaceC529900KqK = new InterfaceC529900KqK() { // from class: X.0M9B
                @Override // X.InterfaceC529900KqK
                public final void LIZ() {
                }

                @Override // X.InterfaceC529900KqK
                public final void onFailure(Throwable th) {
                }

                @Override // X.InterfaceC529900KqK
                public final void LIZIZ() {
                    System.currentTimeMillis();
                }
            };
            Size value = this.LLILLL.getValue();
            if (value != null) {
                boolean z = this.LLILZ;
                SocMediaResource socMediaResource2 = this.LL;
                PurePreviewMediaEngine purePreviewMediaEngine = this.LLILZIL;
                C05P0<InterfaceC420801kM> c05p02 = this.LLILZLL;
                C05P0<String> c05p03 = this.LLILLJJLI;
                InterfaceC420801kM value2 = c05p02.getValue();
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
                purePreviewMediaEngine.imageLoader.getClass();
                c05p02.setValue(C0L2B.LIZIZ(c433800Gzi2, socMediaResource2, value, interfaceC529900KqK));
                c05p03.setValue(socMediaResource2.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
