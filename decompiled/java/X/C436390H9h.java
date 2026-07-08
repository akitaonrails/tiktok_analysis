package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436390H9h extends AbstractC1664490tPr<C436470H9p, C194N> {
    public final VideoPublishEditModel LLJJJIL;
    public final Function0<InterfaceC1459560o5K> LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 873));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 872));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 874));

    public final C1295960jpS LLLLLJIL() {
        return (C1295960jpS) this.LLJJL.getValue();
    }

    public final ConstraintLayout LLLLLJLJLL() {
        return (ConstraintLayout) this.LLJJJJLIIL.getValue();
    }

    public final void LLLLLL() {
        if (LLLLLJIL().isAnimating()) {
            InterfaceC1459560o5K interfaceC1459560o5KInvoke = this.LLJJJJ.invoke();
            if (interfaceC1459560o5KInvoke != null) {
                interfaceC1459560o5KInvoke.ng1(true);
            }
            C786410Ut5.LL(8, LLLLLJLJLL());
            LLLLLJIL().pauseAnimation();
            C1413450msx c1413450msx = C1413450msx.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
            c1413450msx.getClass();
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("swipe_for_more_effects_fade_out", C1413450msx.LJI(videoPublishEditModel).LIZ);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0H9j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C436470H9p) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 214));
    }

    public C436390H9h(VideoPublishEditModel videoPublishEditModel, AwS566S0100000_22 awS566S0100000_22) {
        this.LLJJJIL = videoPublishEditModel;
        this.LLJJJJ = awS566S0100000_22;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LLLLLJLJLL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LLLLLJLJLL();
    }
}
