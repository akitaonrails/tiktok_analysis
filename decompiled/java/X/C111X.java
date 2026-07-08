package X;

import com.bef.effectsdk.message.MessageCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.111X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C111X implements MessageCenter.Listener {
    public final Function1<Boolean, Unit> LL;

    public C111X(AwS608S0100000_29 awS608S0100000_29) {
        this.LL = awS608S0100000_29;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if ((Intrinsics.LJFF(str, "entry_point") || Intrinsics.LJFF(str, "head")) && i2 == 3) {
            C01TT.LIZLLL(new AwS573S0100000_29(this, 931));
        }
    }
}
