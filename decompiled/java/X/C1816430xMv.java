package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816430xMv extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ C1816400xMs LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816430xMv(C1816400xMs c1816400xMs, String str, List<String> list) {
        super(1);
        this.LL = c1816400xMs;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        C1816400xMs c1816400xMs = this.LL;
        String str = this.LLILLJJLI;
        String string = this.LLILLL.toString();
        c1816400xMs.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "decoration_entrance");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII("smbReview", "popup_scene");
        c474500IjALIZ.LJJII(string, "block_reason");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
