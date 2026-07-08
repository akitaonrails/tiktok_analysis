package X;

import com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733880SqY extends C09AY implements Function0<InterfaceC898260ZLs> {
    public final /* synthetic */ LoginFollowComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733880SqY(LoginFollowComponent loginFollowComponent) {
        super(0);
        this.LL = loginFollowComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC898260ZLs invoke() {
        C19EG c19egLIZ = this.LL.getPanelContext().LIZ();
        if (c19egLIZ != null) {
            return C1076010e6h.LIZJ.LIZIZ().LIZIZ(c19egLIZ);
        }
        return null;
    }
}
