package X;

import android.webkit.PermissionRequest;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20297914bZ extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1553820qXM LL;
    public final /* synthetic */ PermissionRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20297914bZ(C1553820qXM c1553820qXM, PermissionRequest permissionRequest) {
        super(1);
        this.LL = c1553820qXM;
        this.LLILLJJLI = permissionRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) throws Throwable {
        C1553820qXM c1553820qXM = this.LL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("white_list_ready", "1"), new Pair("host", this.LLILLJJLI.getOrigin().toString()), new Pair("host_in_whitelist", CardStruct.IStatusCode.DEFAULT), new Pair("white_list_enable", "1"), new Pair("dialog_action", "allow"));
        c1553820qXM.getClass();
        C1520080pew.LIZLLL("rd_pipo_camera_whitelist", mapLJIIIIZZ);
        PermissionRequest permissionRequest = this.LLILLJJLI;
        C2204961BRm.LLJILJIL(permissionRequest, permissionRequest.getResources(), new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vN1X62VsZZnLTU0mDqsm/HKapD8BsigsMKMemtDUQ==", null));
        return Unit.LIZ;
    }
}
