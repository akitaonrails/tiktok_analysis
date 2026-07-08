package X;

import Y.ARunnableS115S0100000_15;
import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982720bgE extends AbstractC982270bfV {
    public View LLIZLLLIL;

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageV2BlackBottomComponent";
    }

    @Override // X.AbstractC982270bfV
    public final void LJIJI(List<C954460awe> list) {
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        super.LJIIJ();
        View view = this.LLIZLLLIL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        View view = this.LLIZLLLIL;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS115S0100000_15(this, 177));
        }
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        View viewFindViewById;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.x3k);
        } else {
            viewFindViewById = null;
        }
        this.LLIZLLLIL = viewFindViewById;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        super.LJIILLIIL(enumC982500bfs, j);
        View view = this.LLIZLLLIL;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS115S0100000_15(this, 176));
        }
    }

    public C982720bgE(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list) {
        super(z, dataChannel, awS559S0100000_15, list);
    }
}
