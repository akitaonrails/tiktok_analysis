package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122020fIu extends C09AY implements Function1<AbstractC1122060fIy, Unit> {
    public final /* synthetic */ IHostPCS LL;
    public final /* synthetic */ C1122000fIs LLILLJJLI;
    public final /* synthetic */ C1121790fIX LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122020fIu(IHostPCS iHostPCS, C1122000fIs c1122000fIs, C1121790fIX c1121790fIX, String str, String str2) {
        super(1);
        this.LL = iHostPCS;
        this.LLILLJJLI = c1122000fIs;
        this.LLILLL = c1121790fIX;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1122060fIy abstractC1122060fIy) {
        Long lValueOf;
        User userLJIJJLI;
        AbstractC1122060fIy abstractC1122060fIy2 = abstractC1122060fIy;
        if (abstractC1122060fIy2 instanceof C1122090fJ1) {
            C20441214yg.LIZIZ("ServicePlusTitleUnderstandingDelegate", "EnvPrepareResult Success");
            this.LL.ok1(this.LLILLJJLI);
            DataChannel dataChannel = this.LLILLL.LIZ;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_ai_anchor_opt_in_start");
            c474500IjALIZ.LJIJJLI(dataChannel);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
                lValueOf = Long.valueOf(userLJIJJLI.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "user_id");
            c474500IjALIZ.LJJII(str, "room_title");
            c474500IjALIZ.LJJII(str2, "anchor_intro");
            c474500IjALIZ.LIZ();
        } else if (abstractC1122060fIy2 instanceof C1122070fIz) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnvPrepareResult Error: ");
            sbLIZ.append(((C1122070fIz) abstractC1122060fIy2).LIZ.LIZIZ);
            C20441214yg.LJ("ServicePlusTitleUnderstandingDelegate", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
