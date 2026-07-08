package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSevenSheetFragment;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.TuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052100dU8 {
    public static final C1052100dU8 LIZ = new C1052100dU8();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(InterfaceC1036100d4K interfaceC1036100d4K, String str) {
        if (interfaceC1036100d4K instanceof CommerceAgentSevenSheetFragment) {
            CommerceAgentBaseFragment commerceAgentBaseFragment = (CommerceAgentBaseFragment) interfaceC1036100d4K;
            if (str != null) {
                CommerceAgentEnterParams commerceAgentEnterParams = commerceAgentBaseFragment.LLJIJIL;
                if (commerceAgentEnterParams != null) {
                    commerceAgentEnterParams.setAutoSendMsgContent(str);
                }
                commerceAgentBaseFragment.SR(commerceAgentBaseFragment.LLJIJIL);
            }
        }
    }

    public static final Pair LIZ(Aweme aweme, BotConfig botConfig, long j, String str, List list, String str2, String str3, Function1 function1, String str4, String str5) {
        C321640CjC.LIZ = aweme;
        C321640CjC.LIZIZ = str4;
        C321640CjC.LIZJ = str5;
        C321090CiJ.LIZ = botConfig;
        CommerceAgentEnterParams commerceAgentEnterParams = new CommerceAgentEnterParams("", "", false, null, null, null, null, null, null, 0, null, str, Long.valueOf(j), false, null, null, null, null, null, true, null, false, list, str2, str3, function1, 3663868, null);
        CommerceAgentSevenSheetFragment.LLJJJ.getClass();
        CommerceAgentSevenSheetFragment commerceAgentSevenSheetFragment = new CommerceAgentSevenSheetFragment(0);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "commerce_agent_enter_param", commerceAgentEnterParams);
        commerceAgentSevenSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = commerceAgentSevenSheetFragment;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLIZLLLIL = true;
        c1390920mIc.LJI(48);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJLLL = false;
        if (C299110Bnx.LIZ()) {
            TuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour tuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour = new TuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour();
            tuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour.LJIJI = false;
            c1390920mIc.LIZ.LLLIIIIL = tuxCommerceAgentIgnoreRecyclerAndPagerSheetBehaviour;
        } else {
            CommerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour commerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour = new CommerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour();
            commerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour.setDraggable(false);
            c1390920mIc.LIZ.LLLIIII = commerceAgentIgnoreRecyclerAndPagerBottomSheetBehaviour;
        }
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        commerceAgentSevenSheetFragment.w2(tuxSheet2);
        return new Pair(tuxSheet2, commerceAgentSevenSheetFragment);
    }
}
