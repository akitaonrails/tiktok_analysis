package X;

import Y.ARunnableS115S0100000_15;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.PreviewPackageContainerTopValueChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.MultiGuestLayoutExtra;

/* JADX INFO: renamed from: X.0anO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948720anO extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL = 1;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1002));

    public final FrameLayout LJJI() {
        return (FrameLayout) this.LLJ.getValue();
    }

    public final void LJJIFFI() {
        int i = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        if ((i2 != 5 && i2 != 6) || i <= 0) {
            C786410Ut5.LJZ(8, LJJI());
            return;
        }
        AwS155S0101000_15 awS155S0101000_15 = new AwS155S0101000_15(this, i, 5);
        if (this.LLILZ.getMeasuredHeight() == 0) {
            HandlerHook.viewPost(this.LLILZ, new ARunnableS115S0100000_15(awS155S0101000_15, 168));
        } else {
            awS155S0101000_15.invoke();
        }
    }

    public final void LJJ() {
        if (LJJI().getBackground() == null) {
            LJJI().setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{C20736316Cj.LIZIZ(R.attr.exg, this.LLILZ.getContext()), 0}));
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        C786410Ut5.LJJJLZIJ(LJJI(), this.LLILZ);
        this.LLILZLL.zQ2(this);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        int iIntValue;
        int i;
        super.LJIJ(interfaceC940060aZQ);
        Integer num = (Integer) this.LLILZLL.gg0(PreviewPackageContainerTopValueChannel.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLIZ = iIntValue;
        MultiGuestLayoutExtra multiGuestLayoutExtra = C940770aaZ.LIZ().getDataSource().LJIILIIL().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            i = multiGuestLayoutExtra.currentPanelLayoutType;
        } else {
            i = 1;
        }
        this.LLIZLLLIL = i;
        if (i != 5 && i != 6) {
            C786410Ut5.LJZ(8, LJJI());
        } else {
            LJJ();
            C786410Ut5.LJZ(0, LJJI());
            LJJIFFI();
        }
        this.LLILZ.addView(LJJI());
        DataChannel dataChannel = this.LLILZLL;
        dataChannel.CQ2(PreviewPackageContainerTopValueChannel.class, this, new AwS594S0100000_15(this, 942));
        dataChannel.CQ2(MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, this, new AwS594S0100000_15(this, 943));
    }

    public C948720anO(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
