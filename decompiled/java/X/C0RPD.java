package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RPD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPD extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ InteractInfoAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RPD(InteractInfoAreaComponent interactInfoAreaComponent) {
        super(1);
        this.LL = interactInfoAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        boolean zLIZ;
        if (Intrinsics.LJFF(str, "meta_tag")) {
            zLIZ = C721902rp.LIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme());
        } else {
            zLIZ = false;
        }
        return Boolean.valueOf(zLIZ);
    }
}
