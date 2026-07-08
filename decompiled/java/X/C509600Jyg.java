package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509600Jyg extends C09AY implements Function1<C512220K6y, Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509600Jyg(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(1);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512220K6y c512220K6y) throws Throwable {
        if (Intrinsics.LJFF(c512220K6y.LJFF, this.LL.LLJJIJIIJIL)) {
            SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LL;
            subPrivilegeDetailFullPage.LLJJL = true;
            subPrivilegeDetailFullPage.PR();
            C520010KaN.LIZLLL(this.LL);
        }
        return Unit.LIZ;
    }
}
