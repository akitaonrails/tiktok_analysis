package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363314m7 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20363214m6 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20363314m7(C20363214m6 c20363214m6, int i) {
        super(1);
        this.LL = c20363214m6;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        DataChannel dataChannel = this.LL.LLILLL;
        if (dataChannel != null) {
            C20366014mY.LIZ(dataChannel, this.LLILLJJLI, "live_center_view_more");
        }
        Iterator<Function1<View, Unit>> it2 = this.LL.getMoreClickListenerList().iterator();
        while (it2.hasNext()) {
            it2.next().invoke(view);
        }
        return Unit.LIZ;
    }
}
