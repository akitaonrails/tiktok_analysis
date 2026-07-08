package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Izn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC484810Izn extends ConstraintLayout {
    public Handler LL;
    public PreviewSurveyViewModel LLILLJJLI;

    public abstract void h0(int i);

    public abstract ViewGroup.LayoutParams i0();

    public abstract void l0();

    public void e0() {
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        Handler handler = this.LL;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 209);
        PreviewSurveyViewModel previewSurveyViewModel = this.LLILLJJLI;
        C786410Ut5.LJLIIL((previewSurveyViewModel == null || (surveyData = previewSurveyViewModel.LL) == null || (surveyShowMode = surveyData.showMode) == null) ? 30000L : surveyShowMode.showDurationMs, handler, aRunnableS107S0100000_7);
    }

    public void reset() {
        this.LL.removeCallbacksAndMessages(null);
    }

    public final void p0() {
        MutableLiveData<C483240IxG> mutableLiveData;
        reset();
        PreviewSurveyViewModel previewSurveyViewModel = this.LLILLJJLI;
        if (previewSurveyViewModel == null || (mutableLiveData = previewSurveyViewModel.LLJLLL) == null) {
            return;
        }
        mutableLiveData.setValue(new C483240IxG(EnumC484840Izq.ROUTE, C2097908Jt.LIZJ(new Pair("exit_method", "submit")), 2));
    }

    public final PreviewSurveyViewModel getSurveyViewModel() {
        return this.LLILLJJLI;
    }

    public final Handler getUiHandler() {
        return this.LL;
    }

    public static void n0(TuxIconView tuxIconView) {
        if (((Number) C07BC.LIZ.getValue()).intValue() == 1 && tuxIconView != null) {
            int i = C428220Gqi.LIZIZ;
            int i2 = C428220Gqi.LIZ;
            int i3 = C428220Gqi.LIZJ;
            C12ES.LJIIZILJ(i2, i2, tuxIconView);
            tuxIconView.setPadding(i, i, i, i);
            C500260Jjc.LJLJL(i3, tuxIconView);
            C500260Jjc.LJJLJLI(i3, tuxIconView);
        }
    }

    public void j0(String str) {
        MutableLiveData<C483240IxG> mutableLiveData;
        reset();
        PreviewSurveyViewModel previewSurveyViewModel = this.LLILLJJLI;
        if (previewSurveyViewModel != null && (mutableLiveData = previewSurveyViewModel.LLJLLL) != null) {
            mutableLiveData.setValue(new C483240IxG(EnumC484840Izq.NULL, C2097908Jt.LIZJ(new Pair("exit_method", str)), 2));
        }
    }

    public final void setSurveyViewModel(PreviewSurveyViewModel previewSurveyViewModel) {
        this.LLILLJJLI = previewSurveyViewModel;
    }

    public final void setUiHandler(Handler handler) {
        this.LL = handler;
    }

    public AbstractC484810Izn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new BPEAHandler(Looper.getMainLooper());
    }
}
