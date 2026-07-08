package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: renamed from: X.0DXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340880DXy extends FrameLayout {
    public String LL;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public ImageView.ScaleType LLILZLL;
    public final C01GW LLIZ;

    private final ImageView getImageCover() {
        return (ImageView) this.LLIZ.getValue();
    }

    public final void LIZ() {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(this, c19egLIZIZ);
        if (lifecycleOwnerLJIJI == null) {
            return;
        }
        String str = this.LL;
        Integer num = this.LLILLJJLI;
        Integer num2 = this.LLILLL;
        Integer num3 = this.LLILZ;
        Integer num4 = this.LLILZIL;
        if (str == null || num == null || num2 == null || num3 == null || num4 == null) {
            return;
        }
        int iIntValue = num4.intValue();
        int iIntValue2 = num3.intValue();
        int iIntValue3 = num2.intValue();
        int iIntValue4 = num.intValue();
        if (str.length() == 0 || iIntValue4 >= iIntValue2 || iIntValue3 >= iIntValue || iIntValue4 < 0 || iIntValue3 < 0) {
            return;
        }
        C948503nH.LJ(lifecycleOwnerLJIJI, C0PEM.LIZJ, new C1468105ot(str, lifecycleOwnerLJIJI, new Rect(iIntValue4, iIntValue3, iIntValue2, iIntValue), getImageCover(), null));
        C357001a4.LIZ(lifecycleOwnerLJIJI, new AwS87S1000000_2(str, 28));
    }

    public C340880DXy(Context context) {
        super(context, null, 0);
        this.LLILZLL = ImageView.ScaleType.CENTER_CROP;
        this.LLIZ = C452501pT.LIZIZ(new AwS405S0200000_4(context, this, 57));
        addView(getImageCover());
        LIZ();
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.LLILZLL = scaleType;
        getImageCover().setScaleType(scaleType);
    }

    public final void setSpriteThumbUrl(String str) {
        this.LL = str;
        LIZ();
    }
}
