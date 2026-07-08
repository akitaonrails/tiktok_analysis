package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ToW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758100ToW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LiveVisibleScopeSettingFragment LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C758100ToW(String str, boolean z, LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment, Integer num) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = liveVisibleScopeSettingFragment;
        this.LLILZ = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean zLIZJ = C494680Jac.LIZJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_distribution_scope_panel");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LL, "event_action_type");
        c474500IjALIZ.LJJII(C494680Jac.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT, "is_sub_only_live");
        c474500IjALIZ.LJJII(this.LLILLJJLI ? "1" : CardStruct.IStatusCode.DEFAULT, "is_private_account");
        DataChannel dataChannel = this.LLILLL.LL;
        c474500IjALIZ.LJJII(dataChannel != null ? dataChannel.gg0(C0UNN.class) : null, "enter_from");
        Integer num = this.LLILZ;
        if (num != null) {
            boolean z = this.LLILLJJLI;
            int iIntValue = num.intValue();
            if (!z || iIntValue != 0) {
                c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(iIntValue)), "distribution_type");
            }
        } else if (!this.LLILLJJLI && !zLIZJ) {
            c474500IjALIZ.LJJII(C473420IhQ.LIZ(0), "distribution_type");
        }
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
