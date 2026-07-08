package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916730zyh extends C09AY implements Function0<Fragment> {
    public final /* synthetic */ ComplianceBusinessActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916730zyh(ComplianceBusinessActivityAssem complianceBusinessActivityAssem) {
        super(0);
        this.LL = complianceBusinessActivityAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.198i, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function0
    public final Fragment invoke() {
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            return SAFExtensionKt.LJIJJ(fragmentLJI);
        }
        return null;
    }
}
