package Y;

import X.C15QK;
import X.C786410Ut5;
import X.InterfaceC855080XgY;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AObjectS289S0200000_14 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS289S0200000_14 aObjectS289S0200000_14) {
        ((VideoPublishContainerScene) aObjectS289S0200000_14.l1).add(R.id.drg, (C15QK) aObjectS289S0200000_14.l0, "PUgcTemplateEditPreviewScene");
        return null;
    }

    public static final Object invoke$1(AObjectS289S0200000_14 aObjectS289S0200000_14) {
        ((VideoPublishContainerScene) aObjectS289S0200000_14.l1).show((Scene) aObjectS289S0200000_14.l0);
        return null;
    }

    public static final Object invoke$2(AObjectS289S0200000_14 aObjectS289S0200000_14) {
        final VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS289S0200000_14.l0;
        final View view = (View) aObjectS289S0200000_14.l1;
        videoPublishContainerScene.getClass();
        final InterfaceC855080XgY interfaceC855080XgYLJJJJJ = ComplianceServiceProvider.LJI().LJJJJJ(videoPublishContainerScene.LLLLIILL.creativeModel.ansaPromptModel);
        if (interfaceC855080XgYLJJJJJ == null) {
            return Unit.LIZ;
        }
        View viewLIZLLL = interfaceC855080XgYLJJJJJ.LIZLLL(videoPublishContainerScene.LLZZ);
        if (viewLIZLLL != null) {
            videoPublishContainerScene.LLZZJLIL = viewLIZLLL;
        }
        View view2 = videoPublishContainerScene.LLZZJLIL;
        if (view2 == null) {
            return Unit.LIZ;
        }
        videoPublishContainerScene.LLZZLLIL = Boolean.FALSE;
        final Pair<Integer, Integer> pairLIZJ = interfaceC855080XgYLJJJJJ.LIZJ(view2);
        C786410Ut5.x3(videoPublishContainerScene.LLZZJLIL.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0XgK
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                videoPublishContainerScene.LLZZZIL = this;
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.sgc);
                if (viewGroup.getChildAt(0).getMeasuredHeight() > (videoPublishContainerScene.LLZZLLIL.booleanValue() ? viewGroup.getMeasuredHeight() : viewGroup.getMeasuredHeight() - ((Integer) pairLIZJ.getSecond()).intValue())) {
                    interfaceC855080XgYLJJJJJ.LIZIZ(videoPublishContainerScene.LLZZJLIL);
                    C786410Ut5.C3(videoPublishContainerScene.LLZZJLIL.getViewTreeObserver(), this);
                } else {
                    interfaceC855080XgYLJJJJJ.LIZ(videoPublishContainerScene.LLZZJLIL);
                }
                videoPublishContainerScene.LLZZLLIL = Boolean.TRUE;
            }
        });
        return Unit.LIZ;
    }

    public AObjectS289S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
