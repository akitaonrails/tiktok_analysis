package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509580Jye extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509580Jye(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(1);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C16F5 c16f5NR = this.LL.NR();
        if (c16f5NR != null) {
            c16f5NR.setText(str2);
        }
        return Unit.LIZ;
    }
}
