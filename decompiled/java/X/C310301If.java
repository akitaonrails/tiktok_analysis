package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: renamed from: X.01If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C310301If extends C09AY implements Function2<Boolean, Integer, Unit> {
    public final /* synthetic */ CountdownForAllConfig LL;
    public final /* synthetic */ CountDownForAllV2AnchorWidget LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C310301If(CountdownForAllConfig countdownForAllConfig, CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget, boolean z, int i) {
        super(2);
        this.LL = countdownForAllConfig;
        this.LLILLJJLI = countDownForAllV2AnchorWidget;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel;
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
        C946050aj5 c946050aj5LIZ;
        CountdownForAllConfig countdownForAllConfig;
        Long lValueOf;
        int i;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Boolean boolLJIILLIIL;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        if (zBooleanValue) {
            if (this.LL.targetScore > 0 && (!a0.LJJJIL(r1.resourceId))) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851938));
            }
            CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel2 = (CountDownForAllV2AnchorViewModel) this.LLILLJJLI.LL;
            if (countDownForAllV2AnchorViewModel2 != null && (countdownForAllConfig = (CountdownForAllConfig) countDownForAllV2AnchorViewModel2.LLILZIL.LJIJI.getValue()) != null) {
                int i2 = this.LLILZ;
                CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = this.LLILLJJLI;
                long j = countdownForAllConfig.duration / 60;
                long j2 = countdownForAllConfig.targetScore;
                String str = countdownForAllConfig.resourceId;
                VM vm = countDownForAllV2AnchorWidget.LL;
                if (vm != 0) {
                    lValueOf = Long.valueOf(vm.xQ2());
                } else {
                    lValueOf = null;
                }
                HashMap map = new HashMap();
                C01Z4.LIZ(null, map);
                map.put("duration", String.valueOf(j));
                map.put("is_customed_dur", String.valueOf(i2));
                int size = 0;
                if (j2 > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                map.put("is_set_target", String.valueOf(i));
                map.put("countdown_target", String.valueOf(j2));
                if (lValueOf != null) {
                    map.put("play_id", String.valueOf(lValueOf.longValue()));
                }
                if (str != null) {
                    if (!a0.LJJJIL(str)) {
                        map.put("sticker_id", str);
                        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listLJJIII) {
                                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                                if (C930540aK4.LJJII(linkPlayerInfo.mUser)) {
                                    String str2 = linkPlayerInfo.mInteractIdStr;
                                    MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                                    if (multiGuestDataHolderLIZJ == null || (boolLJIILLIIL = multiGuestDataHolderLIZJ.LJIILLIIL(str2)) == null || !boolLJIILLIIL.booleanValue()) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            size = arrayList.size();
                        }
                        C310501Ih.LIZIZ = size;
                        map.put("begin_sticker_apply_guest_cnt", String.valueOf(size));
                    } else {
                        map.put("begin_sticker_apply_guest_cnt", CardStruct.IStatusCode.DEFAULT);
                        C310501Ih.LIZIZ = 0;
                    }
                }
                C0KX4.LIZ("livesdk_multi_anchor_countdown_all_apply", map, null, true);
                C310501Ih.LIZ = i2;
            }
            CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = this.LLILLJJLI.LLIZ;
            if (countDownForAllV2SettingsDialog != null) {
                countDownForAllV2SettingsDialog.close(1);
            }
        }
        if (this.LLILLL && (countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LLILLJJLI.LL) != null && (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) != null && !zBooleanValue && (c946050aj5LIZ = c310701Ij.LIZ()) != null) {
            c946050aj5LIZ.LIZJ(iIntValue);
        }
        return Unit.LIZ;
    }
}
