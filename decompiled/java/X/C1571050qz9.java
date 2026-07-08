package X;

import android.content.Context;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.ProfileTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571050qz9 extends C09AY implements Function0<C1255210ilj> {
    public final /* synthetic */ ProfileTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571050qz9(ProfileTabProtocol profileTabProtocol) {
        super(0);
        this.LL = profileTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1255210ilj invoke() {
        Context context = this.LL.LLILLL;
        if (context == null) {
            context = null;
        }
        return new C1255210ilj(context);
    }
}
