package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913740zts extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913740zts(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            ComplianceServiceProvider.LJIJI().LJII(this.LL, this.LLILLJJLI, "pop", null, 2, 0, Boolean.TRUE, null, null);
        }
        return Unit.LIZ;
    }
}
