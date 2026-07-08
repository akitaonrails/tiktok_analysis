package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492690JTv extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C494330Ja3 LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492690JTv(C494330Ja3 c494330Ja3, C492730JTz c492730JTz) {
        super(1);
        this.LL = c494330Ja3;
        this.LLILLJJLI = c492730JTz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        if (num.intValue() == 2) {
            this.LL.getClass();
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            EnumC492660JTs enumC492660JTs = EnumC492660JTs.CLOSE;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_start_sub_only_live_guidance_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(strValueOf, "anchor_id");
            c474500IjALIZ.LJJII(enumC492660JTs, "click_type");
            c474500IjALIZ.LIZ();
            this.LLILLJJLI.invoke();
        }
        return Unit.LIZ;
    }
}
