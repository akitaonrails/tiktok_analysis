package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509590Jyf extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509590Jyf(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(1);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        if (Intrinsics.LJFF(str, this.LL.LLJJIJIIJIL)) {
            C520010KaN.LIZLLL(this.LL);
        }
        return Unit.LIZ;
    }
}
