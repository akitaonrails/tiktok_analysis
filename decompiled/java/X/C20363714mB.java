package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14mB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363714mB extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20363814mC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20363714mB(C20363814mC c20363814mC) {
        super(1);
        this.LL = c20363814mC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C20363814mC c20363814mC = this.LL;
        DataChannel dataChannel = c20363814mC.LL;
        if (dataChannel != null) {
            C20366014mY.LIZ(dataChannel, c20363814mC.LLILLJJLI.invoke().intValue() + 1, "live_center_view_more");
        }
        return Unit.LIZ;
    }
}
