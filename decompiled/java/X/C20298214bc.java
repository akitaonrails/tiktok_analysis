package X;

import android.webkit.PermissionRequest;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20298214bc extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ C1553820qXM LL;
    public final /* synthetic */ PermissionRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20298214bc(C1553820qXM c1553820qXM, PermissionRequest permissionRequest) {
        super(1);
        this.LL = c1553820qXM;
        this.LLILLJJLI = permissionRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        c1397630mTR2.LJ(2131858557, new C20297914bZ(this.LL, this.LLILLJJLI));
        c1397630mTR2.LJI(R.string.f1_, new C20298014ba(this.LL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
