package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.longpress.LongPressPolicyProvider;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893630Z3x extends AbstractC903090Zbn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final Fragment LLILLJJLI;
    public final SessionInfo LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final C0ZQZ<C893640Z3y> LLILZLL;
    public final FragmentManager LLIZ;
    public final C01GW<C06N8> LLIZLLLIL;
    public final LongPressPolicyProvider LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public C0ZL5 LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C01GW LLJJ;
    public final C2252321DDq LLJJI;
    public final AnonymousClass0951 LLJJIII;
    public C0ZL0 LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public Function0<C0ZRM> LLJJIJIL;
    public final AtomicBoolean LLJJJ;
    public volatile String LLJJJIL;
    public final C01GW LLJJJJ;
    public final LongPressConfig.MovingLongPressPanelConfig LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C893630Z3x.class, "longPressViewModel", "getLongPressViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/LongPressViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C893630Z3x.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final RecyclerView LJ() {
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this.LLILLJJLI, null), ChatRoomScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility != null) {
            return messagePowerListAbility.LLII();
        }
        return null;
    }

    public final boolean LJFF() {
        C893640Z3y c893640Z3y;
        C0ZQZ<C893640Z3y> c0zqz = this.LLILZLL;
        return c0zqz != null && c0zqz.LIZJ() && (c893640Z3y = (C893640Z3y) this.LLILZLL.LIZ()) != null && c893640Z3y.LIZJ();
    }

    public final Map<String, String> LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        C0ZRM c0zrmInvoke;
        Map<String, String> map;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String strLIZJ = C453750Hqn.LIZJ(c869590Y9l);
        if (strLIZJ != null) {
            linkedHashMap2.put("sticker_type", strLIZJ);
        }
        String strLIZIZ = C453750Hqn.LIZIZ(c869590Y9l);
        if (strLIZIZ != null) {
            linkedHashMap2.put("sticker_id", strLIZIZ);
        }
        linkedHashMap.putAll(linkedHashMap2);
        if (this.LLILLL.getChatType() == 3) {
            LIZ(c869590Y9l.getConversationId(), linkedHashMap);
        }
        IMAIServiceAPI.LIZ.getClass();
        boolean zLJJIIJ = AnonymousClass0629.LIZ().LIZ().LJJIIJ(c869590Y9l);
        if (zLJJIIJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_ai_auto_reply", str);
        if (zLJJIIJ) {
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                str2 = "creator";
            } else {
                str2 = "user";
            }
            linkedHashMap.put("feedback_role", str2);
        }
        Function0<C0ZRM> function0 = this.LLJJIJIL;
        if (function0 != null && (c0zrmInvoke = function0.invoke()) != null && (map = c0zrmInvoke.LIZ) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public final void LIZ(String str, Map map) {
        boolean z;
        String str2;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str3;
        String strLJI = C1229100i5c.LJI(str);
        if (strLJI.length() > 0) {
            map.put("group_type", strLJI);
        }
        if (this.LLJJJIL.length() > 0) {
            str2 = this.LLJJJIL;
        } else {
            String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(str);
            if (strLJJIFFI != null && strLJJIFFI.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            str2 = "";
            if (!z) {
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strLJJIFFI, null, "im_local_db");
                if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str3 = userB2CAccountInfo.userTags) != null) {
                    str2 = str3;
                }
                if (str2.length() > 0) {
                    this.LLJJJIL = str2;
                }
            }
        }
        if (str2.length() > 0) {
            map.put("group_owner_account_type", str2);
        }
    }

    public final void LIZLLL(C0ZL0 c0zl0, Function0<Unit> function0) {
        if (function0 != null) {
            if (!LJFF()) {
                function0.invoke();
                return;
            } else {
                this.LLJJIJI = c0zl0;
                this.LLJJIJIIJIL = function0;
            }
        }
        ((C0ZLB) this.LLJJJJLIIL.getValue()).LIZIZ(c0zl0);
    }

    public final Map<String, String> LIZJ(C869590Y9l c869590Y9l, String str, boolean z, C0ZRM c0zrm) {
        boolean z2;
        Object obj;
        Integer numValueOf;
        String str2;
        StickerTemplate stickerTemplate;
        Pair[] pairArr = new Pair[4];
        if (c869590Y9l.getMsgType() == 1805 && C441280HSc.LIZ() && C1644806cI.LIZJ() && (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) != null && stickerTemplate.stickerCreateScene == C0IBD.StickerCreateScene_ImagineStudio.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_studio_generated", obj);
        pairArr[1] = new Pair("message_type_v2", str);
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_ai_auto_reply", str3);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ != null) {
            numValueOf = Integer.valueOf(iMessageAnalyticsUtilsLIZ.LJI(c869590Y9l));
        } else {
            numValueOf = null;
        }
        pairArr[3] = new Pair("awe_type", String.valueOf(numValueOf));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (!c0zrm.LIZ.isEmpty()) {
            mapLJIIJ.putAll(c0zrm.LIZ);
        }
        if (this.LLILLL.getChatType() == 3) {
            LIZ(c869590Y9l.getConversationId(), mapLJIIJ);
        }
        if (z) {
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                str2 = "creator";
            } else {
                str2 = "user";
            }
            mapLJIIJ.put("feedback_role", str2);
        }
        return mapLJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a8  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C893630Z3x(androidx.fragment.app.Fragment r31, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r32, boolean r33, java.lang.String r34, X.C0ZQZ<X.C893640Z3y> r35, androidx.fragment.app.FragmentManager r36, X.C01GW<? extends X.C06N8> r37, com.ss.android.ugc.aweme.im.messagelist.api.longpress.LongPressPolicyProvider r38) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C893630Z3x.<init>(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, boolean, java.lang.String, X.0ZQZ, androidx.fragment.app.FragmentManager, X.01GW, com.ss.android.ugc.aweme.im.messagelist.api.longpress.LongPressPolicyProvider):void");
    }
}
