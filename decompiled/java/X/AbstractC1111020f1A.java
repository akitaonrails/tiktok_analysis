package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.binder.PublicScreenMetricsLayout;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import java.util.List;
import mr0.x;

/* JADX INFO: renamed from: X.0f1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111020f1A<MODEL extends x> extends RecyclerView.ViewHolder implements InterfaceC1111030f1B {
    public C1109770ez9 LL;
    public MODEL LLILLJJLI;
    public long LLILLL;

    public abstract void L5(C1109770ez9 c1109770ez9, MODEL model);

    @Override // X.InterfaceC1111030f1B
    public int V0() {
        return 0;
    }

    public void LLIILZL() {
        PublicScreenMetricsLayout publicScreenMetricsLayout;
        View view = this.itemView;
        if ((view instanceof PublicScreenMetricsLayout) && (publicScreenMetricsLayout = (PublicScreenMetricsLayout) view) != null) {
            publicScreenMetricsLayout.setViewBinder(null);
        }
        this.LLILLJJLI = null;
        this.LL = null;
    }

    public void onViewAttachedToWindow() {
        MODEL model = this.LLILLJJLI;
        if (model != null) {
            model.onAttach();
        }
    }

    public void onViewDetachedFromWindow() {
        MODEL model = this.LLILLJJLI;
        if (model != null) {
            model.LJJJJL(false);
        }
    }

    public AbstractC1111020f1A(View view) {
        super(view);
        LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
    }

    public static final void I5(TextView textView, boolean z) {
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).eW(textView, z);
    }

    public void N5(C1109770ez9 c1109770ez9, MODEL model, List<Object> list) {
        this.LL = c1109770ez9;
        this.LLILLJJLI = model;
        L5(c1109770ez9, model);
    }
}
