package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.tab.FriendTopTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583010rIR extends C09AY implements Function0<ViewOnClickListenerC1584850rLP> {
    public final /* synthetic */ FriendTopTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583010rIR(FriendTopTabProtocol friendTopTabProtocol) {
        super(0);
        this.LL = friendTopTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewOnClickListenerC1584850rLP invoke() {
        Context context = this.LL.LLILZIL;
        if (context != null) {
            return new ViewOnClickListenerC1584850rLP(context);
        }
        "context is null".toString();
        throw new IllegalArgumentException("context is null");
    }
}
