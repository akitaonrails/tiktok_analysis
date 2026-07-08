package X;

import Y.ACListenerS150S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestQuickConnectModuleShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930310aJh extends AbstractC960470b6L<C929370aIB> {
    public final Function0<Unit> LL;
    public final View LLILLJJLI;

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
    }

    public C930310aJh(LayoutInflater layoutInflater, ViewGroup viewGroup, Function0<Unit> function0, DataChannel dataChannel) {
        Boolean bool;
        super(C786410Ut5.Td(layoutInflater, R.layout.heq, viewGroup, false));
        this.LL = function0;
        View viewFindViewById = this.itemView.findViewById(R.id.h2u);
        View viewFindViewById2 = this.itemView.findViewById(R.id.yd5);
        this.LLILLJJLI = viewFindViewById2;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 322), this.itemView.findViewById(R.id.cv3));
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(MultiGuestQuickConnectModuleShowChannel.class)) != null && bool.booleanValue() && viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        }
        if (C930540aK4.LJIJJLI()) {
            View view = this.itemView;
            view.setBackgroundColor(C20736316Cj.LIZJ(R.attr.ezn, view));
            if (viewFindViewById2 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
        }
    }
}
