package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;

/* JADX INFO: renamed from: X.0F71, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F71 extends C21674119s3 {
    public float LJIILL;
    public final /* synthetic */ EditCaptionScene.HighLightLayoutManager LJIILLIIL;

    @Override // X.C21674119s3
    public final int LJIILL() {
        return -1;
    }

    @Override // X.AbstractC21674019s2
    public final PointF LIZ(int i) {
        return this.LJIILLIIL.computeScrollVectorForPosition(i);
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionFragment -> calculateSpeedPerPixel ");
        sbLIZ.append(this.LJIILL);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        return this.LJIILL / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F71(EditCaptionScene.HighLightLayoutManager highLightLayoutManager, Context context) {
        super(context);
        this.LJIILLIIL = highLightLayoutManager;
        this.LJIILL = 25.0f;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        EditCaptionScene.HighLightLayoutManager highLightLayoutManager = this.LJIILLIIL;
        if (highLightLayoutManager.LLILLJJLI) {
            return i3 - i;
        }
        return (i3 - i) + ((int) C12ES.LIZJ(52.0f, highLightLayoutManager.LL));
    }
}
