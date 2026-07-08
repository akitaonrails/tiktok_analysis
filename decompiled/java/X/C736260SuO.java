package X;

import com.ss.android.ugc.aweme.base.SafeHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736260SuO extends C09AY implements Function0<SafeHandler> {
    public final /* synthetic */ ViewOnTouchListenerC736230SuL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736260SuO(ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL) {
        super(0);
        this.LL = viewOnTouchListenerC736230SuL;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SafeHandler invoke() {
        return new SafeHandler(C948503nH.LIZ(this.LL.LL));
    }
}
