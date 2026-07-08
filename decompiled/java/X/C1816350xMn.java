package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816350xMn extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816350xMn(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LL, "decoration_entrance");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII("aiConfirm", "popup_scene");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
