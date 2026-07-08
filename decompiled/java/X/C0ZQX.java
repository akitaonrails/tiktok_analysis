package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZQX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZQX extends C2217421BqW implements Function1<ThoughtInfo, Unit> {
    public C0ZQX(SingleTitleBarCenterAssem singleTitleBarCenterAssem) {
        super(1, singleTitleBarCenterAssem, SingleTitleBarCenterAssem.class, "activateThoughtQuoteInInput", "activateThoughtQuoteInInput(Lcom/ss/android/ugc/aweme/social/thought/api/model/ThoughtInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThoughtInfo thoughtInfo) {
        String singleChatFromUserId;
        String displayName;
        ThoughtInfo thoughtInfo2 = thoughtInfo;
        SingleTitleBarCenterAssem singleTitleBarCenterAssem = (SingleTitleBarCenterAssem) this.receiver;
        C0I20 c0i20Hp = singleTitleBarCenterAssem.LLLIILIL;
        if (c0i20Hp == null) {
            synchronized (singleTitleBarCenterAssem) {
                c0i20Hp = singleTitleBarCenterAssem.LLLIILIL;
                if (c0i20Hp == null) {
                    c0i20Hp = singleTitleBarCenterAssem.hp();
                    singleTitleBarCenterAssem.LLLIILIL = c0i20Hp;
                }
            }
        }
        if (c0i20Hp != null) {
            C909290Zln c909290ZlnLp = singleTitleBarCenterAssem.lp();
            if (c909290ZlnLp == null || (singleChatFromUserId = c909290ZlnLp.getSingleChatFromUserId()) == null) {
                singleChatFromUserId = "";
            }
            IMUser iMUser = singleTitleBarCenterAssem.sp().getState().LL;
            if (iMUser == null || (displayName = iMUser.getDisplayName()) == null) {
                displayName = "";
            }
            c0i20Hp.og2(new C459840I1m(thoughtInfo2, singleChatFromUserId, displayName, C0I3C.THOUGHT_BUBBLE));
        }
        try {
            RequestKeyboardAbility requestKeyboardAbility = (RequestKeyboardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(singleTitleBarCenterAssem), RequestKeyboardAbility.class, null);
            if (requestKeyboardAbility != null) {
                requestKeyboardAbility.Fr();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
