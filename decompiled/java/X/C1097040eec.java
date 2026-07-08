package X;

import com.bytedance.android.livesdk.game.model.PinCardView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097040eec implements InterfaceC1107960ewE, InterfaceC1059280dfi {
    public final DataChannel LL;
    public final PinCardView LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1108000ewI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @Override // X.InterfaceC1107960ewE
    public final String LJ() {
        return C1152470g61.LIZ(this.LL, false).guessingPinCard;
    }

    @Override // X.InterfaceC1107960ewE
    public final Function1<SparkContext, Unit> LJFF() {
        return new AwS596S0100000_17(this, 690);
    }

    public C1097040eec(DataChannel dataChannel, PinCardView pinCardView) {
        this.LL = dataChannel;
        this.LLILLJJLI = pinCardView;
        this.LLILLL = "";
        this.LLILLL = String.valueOf(System.currentTimeMillis());
    }
}
