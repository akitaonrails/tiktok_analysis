package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingSwitchModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$onReturnStreaksPushOutAppSettings$1", f = "SingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1640406ba extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SingleChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640406ba(boolean z, Context context, SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC1364105Vn<? super C1640406ba> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = singleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640406ba(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strGQ2;
        List<PushSettingSwitchModel> list;
        C1C7U.LIZ("SingleChatNoticeViewModel@3e8d.onReturnStreaksPushOutAppSettings$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL && C824390WVp.LIZJ(this.LLILLJJLI)) {
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            if (c19328310jZ.LIZJ()) {
                PushSettings pushSettingsLJ = c19328310jZ.LJ();
                Boolean boolValueOf = null;
                if (pushSettingsLJ != null && (list = pushSettingsLJ.extraPushSettings) != null) {
                    boolean z = false;
                    if (!list.isEmpty()) {
                        Iterator<PushSettingSwitchModel> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PushSettingSwitchModel next = it2.next();
                            if (Intrinsics.LJFF(next.itemId, "im_push_select") && next.status == 1) {
                                z = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                if (Intrinsics.LJFF(boolValueOf, true)) {
                    strGQ2 = this.LLILLL.GQ2("im_push,im_push_select", "im_push_preview_v2", "dm_streaks_push");
                } else {
                    strGQ2 = this.LLILLL.GQ2("im_push", "im_push_preview_v2", "dm_streaks_push");
                }
            } else {
                strGQ2 = this.LLILLL.GQ2("im_push", "im_push_preview_v2", "dm_streaks_push");
            }
            C19296410eQ.LIZIZ.batchSetPushSettingItems(strGQ2, 1, true, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatNoticeViewModel@3e8d.onReturnStreaksPushOutAppSettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
