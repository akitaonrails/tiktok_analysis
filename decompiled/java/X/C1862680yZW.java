package X;

import android.content.Context;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS428S0200000_27;

/* JADX INFO: renamed from: X.0yZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862680yZW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null) {
            iTakoChatPageAbility.q60();
            C21586319dt c21586319dtK6 = iTakoChatPageAbility.k6();
            if (c21586319dtK6 != null) {
                c21586319dtK6.setDrawerLockMode(0);
                c21586319dtK6.openDrawer(8388613);
            }
        }
    }

    public static void LIZLLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        Map<String, String> commonParams;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        } else {
            commonParams = null;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (commonParams != null) {
            str = commonParams.get("enter_from");
        } else {
            str = null;
        }
        if (commonParams != null) {
            str2 = commonParams.get("enter_method");
        } else {
            str2 = null;
        }
        if (commonParams != null) {
            str3 = commonParams.get("process_id");
        } else {
            str3 = null;
        }
        if (commonParams == null || (str4 = commonParams.get("tako_session_id")) == null) {
            str4 = "";
        }
        if (commonParams != null) {
            str5 = commonParams.get("tako_chat_id");
        }
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_new_chat_button_click", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5)));
    }

    public static void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, final Function0 function0) {
        final C21586319dt c21586319dtK6;
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null && (c21586319dtK6 = iTakoChatPageAbility.k6()) != null) {
            c21586319dtK6.addDrawerListener(new DrawerLayout$SimpleDrawerListener() { // from class: X.0yZj
                @Override // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout$DrawerListener
                public final void onDrawerClosed(View view) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    c21586319dtK6.removeDrawerListener(this);
                }
            });
            c21586319dtK6.closeDrawer(8388613);
        }
    }

    public static void LIZJ(Context context, View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        Map<String, String> commonParams;
        String str;
        String str2;
        Lifecycle lifecycle;
        Map<String, String> commonParams2;
        TakoEnterParams takoEnterParamsEh1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        String str3;
        ITakoChatPageAbility iTakoChatPageAbility;
        String strZi1;
        String str4;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        String str5;
        if (view != null) {
            C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
            Context context2 = view.getContext();
            c1519805xE.getClass();
            if (!C0XF1.LIZLLL(context2)) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131832007);
                c1389890mGx.LJIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                c1389890mGx.LJIIJJI();
                return;
            }
        }
        String str6 = null;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        if (takoChatUIAbility != null && takoChatUIAbility.Sb0()) {
            IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
            if (iMessageAbility != null) {
                iMessageAbility.Tk2(CardStruct.IStatusCode.DEFAULT, new AwS393S0200000_27(interfaceC665370Q7z, iMessageAbility, 125), true, true);
                iMessageAbility.w41();
                return;
            }
            return;
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        } else {
            commonParams = null;
        }
        if (commonParams != null) {
            str = commonParams.get("process_id");
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        if (commonParams == null || (str2 = commonParams.get("tako_session_id")) == null) {
            str2 = "";
        }
        if (commonParams != null && (str5 = commonParams.get("tako_chat_id")) != null) {
            str7 = str5;
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility2 != null) {
            TakoInputViewUIAbility takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoInputViewUIAbility.class, null);
            if (takoInputViewUIAbility != null) {
                strZi1 = takoInputViewUIAbility.zi1();
            } else {
                strZi1 = null;
            }
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null && (c13lcAp02 = iTakoContextAbility2.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str4 = c1864200yby2.LLILLJJLI;
            } else {
                str4 = null;
            }
            iMessageAbility2.tV0(strZi1, null, str4, str, str2, str7);
        }
        C07QA.LIZ.getClass();
        if (((Number) C07QA.LIZIZ.getValue()).intValue() == 0 && (iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoChatPageAbility.class, null)) != null) {
            iTakoChatPageAbility.Hy2();
        }
        IMessageAbility iMessageAbility3 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility3 != null) {
            iMessageAbility3.w41();
        }
        String string = UUID.randomUUID().toString();
        C07QG.LIZ.getClass();
        if (C07QG.LIZ()) {
            String string2 = UUID.randomUUID().toString();
            ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility3 != null && (c13lcAp0 = iTakoContextAbility3.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null && (str3 = c1864200yby.LL) != null && str3.length() > 0) {
                C1863550yav.LIZJ(str3);
            }
            String strLIZIZ = C1863550yav.LIZIZ(string, true);
            C1862700yZY.LIZJ(string2, new Pair("tako_session_id", string), null);
            C1862700yZY.LIZJ(string2, new Pair("tako_chat_id", strLIZIZ), null);
            ITakoContextAbility iTakoContextAbility4 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility4 != null) {
                iTakoContextAbility4.PG0(new C144G(string2, string, strLIZIZ));
            }
            ITakoChatPageAbility iTakoChatPageAbility2 = (ITakoChatPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoChatPageAbility.class, null);
            if (iTakoChatPageAbility2 != null && (takoEnterParamsEh1 = iTakoChatPageAbility2.eh1()) != null) {
                takoEnterParamsEh1.setProcessId(string2);
                takoEnterParamsEh1.setTakoChatId(strLIZIZ);
            }
        }
        IMessageAbility iMessageAbility4 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility4 != null) {
            iMessageAbility4.dc1(context, string, new AwS428S0200000_27(interfaceC665370Q7z, iMessageAbility4, 93));
        }
        ITakoContextAbility iTakoContextAbility5 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility5 != null) {
            iTakoContextAbility5.PG0(new C14G0(string, "initiate_new_session"));
        }
        LJ(interfaceC665370Q7z, string, "initiate_new_session");
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ == null || (lifecycle = fragmentLIZ.getLifecycle()) == null) {
            return;
        }
        ITakoContextAbility iTakoContextAbility6 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility6 != null && (commonParams2 = iTakoContextAbility6.getCommonParams()) != null) {
            str6 = commonParams2.get("process_id");
        }
        C1701530uNb.LIZJ(lifecycle, C1701530uNb.LIZLLL(str6, string));
    }

    public static void LJ(InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2) {
        TakoEnterParams takoEnterParamsDN1;
        C1862900yZs c1862900yZs;
        Map<String, String> map;
        Integer numLIZJ;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility != null && (takoEnterParamsDN1 = iMessageAbility.DN1()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = takoEnterParamsDN1.enterFrom;
            String str4 = takoEnterParamsDN1.enterMethod;
            String str5 = takoEnterParamsDN1.processId;
            String strValueOf = String.valueOf(takoEnterParamsDN1.botInfo.botId);
            String enterAwemeId = takoEnterParamsDN1.getEnterAwemeId();
            String enterSearchId = takoEnterParamsDN1.getEnterSearchId();
            String str6 = takoEnterParamsDN1.searchType;
            if (str6 == null) {
                str6 = "";
            }
            C1864020ybg.LIZ.getClass();
            long jLJIIJ = C1864020ybg.LJIIJ(takoEnterParamsDN1);
            boolean z = takoEnterParamsDN1.dynamicIcon;
            String str7 = takoEnterParamsDN1.searchGeneralCardType;
            String str8 = takoEnterParamsDN1.tokenType;
            String str9 = takoEnterParamsDN1.extraFlag;
            String searchKeyword = takoEnterParamsDN1.getSearchKeyword();
            String subEnterMethod = takoEnterParamsDN1.getSubEnterMethod();
            if (subEnterMethod != null) {
                c1862900yZs = new C1862900yZs(takoEnterParamsDN1.getSubProcessId(), subEnterMethod, String.valueOf(takoEnterParamsDN1.botInfo.botId));
            } else {
                c1862900yZs = null;
            }
            FeedIconBubbleInfo feedIconBubbleInfo = takoEnterParamsDN1.feedIconBubbleInfo;
            SuggestionWordInfo suggestionWordInfo = takoEnterParamsDN1.suggestionWordInfo;
            FeedEnterAwemeInfo feedEnterAwemeInfo = takoEnterParamsDN1.feedEnterAwemeInfo;
            String iconState = takoEnterParamsDN1.getIconState();
            String str10 = takoEnterParamsDN1.enterFromLastPage;
            SmartSearchItem smartSearchItem = takoEnterParamsDN1.smartSearchInfo;
            String str11 = takoEnterParamsDN1.universalRank;
            String str12 = takoEnterParamsDN1.listResultType;
            TakoBehaviorCollectData takoBehaviorCollectData = takoEnterParamsDN1.behaviorCollectData;
            if (takoBehaviorCollectData != null) {
                map = takoBehaviorCollectData.chatMobParams;
            } else {
                map = null;
            }
            C07QF.LIZ.getClass();
            if (C07QF.LIZ()) {
                numLIZJ = C1861390yXR.LIZJ(takoEnterParamsDN1);
            } else {
                numLIZJ = null;
            }
            String str13 = takoEnterParamsDN1.takoChatId;
            Long lValueOf = Long.valueOf(jLJIIJ);
            c1862330yYx.getClass();
            C1862330yYx.LJIIIIZZ(str3, str4, str5, strValueOf, enterAwemeId, enterSearchId, str6, lValueOf, z, str7, str8, str9, searchKeyword, c1862900yZs, feedIconBubbleInfo, suggestionWordInfo, feedEnterAwemeInfo, iconState, str10, smartSearchItem, str11, str12, map, numLIZJ, str, str13, str2);
        }
    }
}
