package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0i3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227980i3o extends C09AY implements Function2<BaseActionViewModel<?>, Activity, Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227980i3o(String str, long j) {
        super(2);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, Activity activity) {
        Activity activity2 = activity;
        long j = this.LL;
        if (activity2 != null) {
            IMGroupChatDetailAnalytics.LIZ.LJFF("ttsocial_group_chat_show_profile_btn_click", new Pair[]{new Pair("enter_from", "group_setting")}, C0I0B.LJFF.LIZIZ());
            C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, "im", "group_setting").LJFF(activity2, new C1228470i4b(new C1228650i4t("group_setting", "group_setting", EnumC1228990i5R.PUBLIC_GROUP.getValue(), null, EnumC1219960hqs.UNKNOWN.getValue(), null, false, null, null, true, null, false, null, null, null, null, 0, 0, false, null, null, null, -1048, 1), new C1228810i59("group_setting", "group_setting", C461720I8s.LIZIZ(), true, false, null, j, null, null, null, 0, null, null, null, null, null, false, null, null, 4194224)));
        }
        return Unit.LIZ;
    }
}
