package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816310xMj extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1816270xMf LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816310xMj(C1816270xMf c1816270xMf, String str) {
        super(1);
        this.LL = c1816270xMf;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        this.LL.LIZJ.qD1(false);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILLJJLI, "decoration_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("aiConfirm", "popup_scene");
        c474500IjALIZ.LJJII("cancel", "click_position");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
