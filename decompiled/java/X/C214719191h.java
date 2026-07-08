package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.191h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C214719191h extends AbstractC1542070qEP {
    public InterfaceC1163110gNB LLILLJJLI;
    public SparkContext LLILLL;

    public void LJJIJL(SparkContext sparkContext) {
        throw null;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLILLJJLI;
        if (interfaceC1163110gNB != null) {
            return interfaceC1163110gNB.LJJL();
        }
        return null;
    }

    @Override // X.AbstractC1542070qEP
    public final void LIZ(SparkContext sparkContext) {
        Object objJG1;
        this.LLILLL = sparkContext;
        IHostHybrid iHostHybrid = (IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class);
        if (iHostHybrid != null) {
            objJG1 = iHostHybrid.jG1();
        } else {
            objJG1 = null;
        }
        if (objJG1 instanceof InterfaceC1163110gNB) {
            this.LLILLJJLI = (InterfaceC1163110gNB) objJG1;
        }
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLILLJJLI;
        if (interfaceC1163110gNB != null) {
            interfaceC1163110gNB.LJIIJ(context);
        }
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        View viewLJJJLIIL;
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLILLJJLI;
        if (interfaceC1163110gNB != null) {
            viewLJJJLIIL = interfaceC1163110gNB.LJJJLIIL(interfaceC1051240dSk);
        } else {
            viewLJJJLIIL = null;
        }
        if (viewLJJJLIIL instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) viewLJJJLIIL;
            LiveIconView liveIconView = new LiveIconView(viewGroup.getContext(), null);
            liveIconView.setIconAttr(R.attr.eny);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(30.0f), (int) C497740JfY.LIZIZ(30.0f));
            layoutParams.gravity = 8388661;
            layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(20.0f));
            layoutParams.topMargin = ((int) C497740JfY.LIZIZ(20.0f)) + C497740JfY.LJIJ() + C2084308En.LIZ(viewGroup.getContext());
            C786410Ut5.g8(liveIconView, new ACListenerS166S0100000_32(this, 108));
            viewGroup.addView(liveIconView, layoutParams);
        }
        return viewLJJJLIIL;
    }
}
