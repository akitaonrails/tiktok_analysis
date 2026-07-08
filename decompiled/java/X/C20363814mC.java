package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363814mC extends AbstractC960470b6L<C00UN> {
    public final DataChannel LL;
    public final Function0<Integer> LLILLJJLI;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C500260Jjc.LJLIIIL(500L, this.itemView, new C20363714mB(this));
    }

    public C20363814mC(View view, DataChannel dataChannel, Function0<Integer> function0) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = function0;
    }
}
