package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC568240MQk extends UserVisibleHintGroupScene {
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public ForwardMedia LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public View LLJJJJJIL;
    public InterfaceC568220MQi LLJJJJLIIL;
    public C1DRG LLJJL;
    public Function0<Unit> LLJJLIIIJLLLLLLLZ;

    public final void LLLLIILL(boolean z) {
        int i;
        View view = this.LLJJJJJIL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public void LLLLIL(int i) {
        this.LLJJIJIL = i;
        this.LLJJIJIIJIL = (i * 16) / 9;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(205));
        ArrayList arrayList = null;
        C1664590tQ1.LIZLLL(this, null, false, AFwS239S0000000_8.get$arr$(206), 3);
        C1664600tQ2.LIZ(this, null, new AwS587S0100000_8(this, 438));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJJJJLIIL = (InterfaceC568220MQi) c1drg.LJIIL(null, InterfaceC568220MQi.class);
            C1DRG c1drg2 = this.LLJJL;
            if (c1drg2 != null) {
                arrayList = (ArrayList) c1drg2.LJII(ArrayList.class, null);
            }
            InterfaceC568220MQi interfaceC568220MQi = this.LLJJJJLIIL;
            if (interfaceC568220MQi != null) {
                interfaceC568220MQi.zM0("on_this_day_change_text_style", new AwS587S0100000_8(arrayList, (ArrayList<TikTokMediaModel>) 439));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.deb);
        viewFindViewById.setOutlineProvider(new C0MRE(C11VU.LIZJ(20.0d, requireSceneContext())));
        viewFindViewById.setClipToOutline(true);
        this.LLJJJJJIL = findViewById(R.id.nnp);
        view.setTag(Integer.valueOf(this.LLJJJJ));
    }
}
