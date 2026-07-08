package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterCardHSpacingConfig;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterCardVSpacingConfig;

/* JADX INFO: renamed from: X.0Img, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476680Img extends C0DXR {
    public final int LL;
    public final int LLILLJJLI = (int) C497740JfY.LIZIZ(LiveCenterCardHSpacingConfig.INSTANCE.getFloatValue());
    public final int LLILLL = (int) C497740JfY.LIZIZ(LiveCenterCardVSpacingConfig.INSTANCE.getFloatValue());

    public C476680Img(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if ((this.LL & 1) > 0) {
            int i = this.LLILLJJLI;
            rect.left = i;
            rect.right = i;
        } else {
            rect.left = 0;
            rect.right = 0;
        }
        if (recyclerView.getChildLayoutPosition(view) != 0 && (this.LL & 2) > 0) {
            rect.top = this.LLILLL;
        } else {
            rect.top = 0;
        }
    }
}
