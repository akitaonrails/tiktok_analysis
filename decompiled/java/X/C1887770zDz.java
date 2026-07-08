package X;

import com.bytedance.ies.android.base.runtime.IDependOutService;
import com.ss.android.ugc.aweme.commercialize.runtime.DependOutServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887770zDz extends C09AY implements Function0<C2214461Blk> {
    public C1887770zDz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2214461Blk invoke() {
        Object objLIZ = C04TD.LIZ(IDependOutService.class, false);
        return (objLIZ != null ? (IDependOutService) objLIZ : new DependOutServiceImpl()).LIZ();
    }
}
