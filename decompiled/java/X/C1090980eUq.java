package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090980eUq {
    public final View LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC1102150emr LIZJ;
    public final Function1<BarrageMessage, InterfaceC1102120emo> LIZLLL;
    public BarrageMessage LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1090980eUq(View view, DataChannel dataChannel, InterfaceC1102150emr interfaceC1102150emr, Function1<? super BarrageMessage, ? extends InterfaceC1102120emo> function1) {
        this.LIZ = view;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC1102150emr;
        this.LIZLLL = function1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 378));
        this.LJFF = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS561S0100000_17(this, 379));
        this.LJI = c01gwLIZIZ2;
        ACListenerS152S0100000_17 aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 106);
        LinearLayout linearLayout = (LinearLayout) c01gwLIZIZ.getValue();
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, aCListenerS152S0100000_17);
        }
        FrameLayout frameLayout = (FrameLayout) c01gwLIZIZ2.getValue();
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, aCListenerS152S0100000_17);
        }
    }
}
