package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509570Jyd extends C09AY implements Function2<Integer, Float, Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509570Jyd(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(2);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Float f) {
        int iIntValue = num.intValue();
        float fFloatValue = f.floatValue();
        C16F5 c16f5NR = this.LL.NR();
        if (c16f5NR != null) {
            C786410Ut5.LLJJJJ(c16f5NR, iIntValue);
        }
        C16F5 c16f5NR2 = this.LL.NR();
        if (c16f5NR2 != null) {
            C786410Ut5.k5(c16f5NR2, fFloatValue);
        }
        return Unit.LIZ;
    }
}
