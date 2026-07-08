package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel$fetchActionBarDataForLightInteraction$1", f = "SocialActionBarLightInteractionViewModel.kt", l = {298}, m = "invokeSuspend")
public final class C908970ZlH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialActionBarLightInteractionViewModel LLILLJJLI;
    public final /* synthetic */ IMUser LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ C1598606Ns LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C908970ZlH(SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel, IMUser iMUser, C869590Y9l c869590Y9l, C1598606Ns c1598606Ns, String str, InterfaceC1364105Vn<? super C908970ZlH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialActionBarLightInteractionViewModel;
        this.LLILLL = iMUser;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = c1598606Ns;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C908970ZlH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String enterFromForMob;
        SessionInfo sessionInfo;
        C909290Zln c909290Zln;
        int chatType;
        String strLIZ;
        SessionInfo sessionInfo2;
        SessionInfo sessionInfo3;
        Keva repo;
        String strLIZIZ;
        Object objXQ2 = obj;
        C1C7U.LIZ("SocialActionBarLightInteractionViewModel@9e54.fetchActionBarDataForLightInteraction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objXQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objXQ2);
            SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel = this.LLILLJJLI;
            IMUser iMUser = this.LLILLL;
            C869590Y9l c869590Y9l = this.LLILZ;
            C1598606Ns c1598606Ns = this.LLILZIL;
            this.LL = 1;
            objXQ2 = socialActionBarLightInteractionViewModel.xQ2(iMUser, c869590Y9l, c1598606Ns, this);
            if (objXQ2 == objLJFF) {
                C1C7U.LIZIZ("SocialActionBarLightInteractionViewModel@9e54.fetchActionBarDataForLightInteraction$1");
                return objLJFF;
            }
        }
        List list = (List) objXQ2;
        SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C909020ZlM.LIZ((ActionBarButtonStrategyConf) it2.next()));
        }
        socialActionBarLightInteractionViewModel2.getClass();
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.LLILLJJLI.LLJJIII = arrayList2.isEmpty();
        SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel3 = this.LLILLJJLI;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C909020ZlM.LIZ((ActionBarButtonStrategyConf) it3.next()));
        }
        socialActionBarLightInteractionViewModel3.getClass();
        C908760Zkw c908760Zkw = new C908760Zkw(new ArrayList(arrayList3));
        this.LLILLJJLI.LLILZ.setValue(c908760Zkw);
        SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel4 = this.LLILLJJLI;
        if (socialActionBarLightInteractionViewModel4.LLJJIJI) {
            socialActionBarLightInteractionViewModel4.LLJJIJI = false;
            if (((Number) C0BBI.LIZ.getValue()).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            String conversationId = null;
            if (z) {
                List<ActionBarButtonConf> list2 = c908760Zkw.LIZ;
                ArrayList arrayList4 = new ArrayList();
                Iterator<ActionBarButtonConf> it4 = list2.iterator();
                while (it4.hasNext()) {
                    String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), it4.next());
                    if (json != null) {
                        arrayList4.add(json);
                    }
                }
                String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                C909060ZlQ c909060ZlQ = C909060ZlQ.LIZ;
                String str = this.LLILZLL;
                synchronized (c909060ZlQ) {
                    repo = C909060ZlQ.LIZIZ;
                    if (repo == null) {
                        repo = Keva.getRepo("action_bar_button_config_list");
                        C909060ZlQ.LIZIZ = repo;
                    }
                }
                String strLIZ2 = C909060ZlQ.LIZ();
                if (strLIZ2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZ2);
                    sbLIZ.append('_');
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                repo.storeStringArray(strLIZIZ, strArr);
                if (((Boolean) C287780BPs.LIZ.getValue()).booleanValue()) {
                    this.LLILLJJLI.getClass();
                    IActionBarMemoryCacheService iActionBarMemoryCacheService = (IActionBarMemoryCacheService) PluggableExtentionKt.pluggableSpiForReal(IActionBarMemoryCacheService.class);
                    if (iActionBarMemoryCacheService != null) {
                        iActionBarMemoryCacheService.LJIIIIZZ(this.LLILZLL, arrayList2);
                    }
                }
            }
            SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel5 = this.LLILLJJLI;
            List<ActionBarButtonConf> list3 = c908760Zkw.LIZ;
            C0I0B.LJFF.LIZIZ();
            socialActionBarLightInteractionViewModel5.getClass();
            C830490Whz c830490Whz = new C830490Whz();
            C457780HxI c457780HxIZQ2 = socialActionBarLightInteractionViewModel5.zQ2();
            if (c457780HxIZQ2 != null && (sessionInfo3 = c457780HxIZQ2.LL) != null) {
                enterFromForMob = sessionInfo3.getEnterFromForMob();
            } else {
                enterFromForMob = null;
            }
            c830490Whz.put("enter_from", enterFromForMob);
            C457780HxI c457780HxIZQ22 = socialActionBarLightInteractionViewModel5.zQ2();
            if (c457780HxIZQ22 != null) {
                sessionInfo = c457780HxIZQ22.LL;
            } else {
                sessionInfo = null;
            }
            if (sessionInfo instanceof C909290Zln) {
                c909290Zln = (C909290Zln) sessionInfo;
            } else {
                c909290Zln = null;
            }
            if (c909290Zln == null || !c909290Zln.isTCM()) {
                z2 = false;
            }
            if (z2) {
                strLIZ = "tcm";
            } else {
                if (sessionInfo != null) {
                    chatType = sessionInfo.getChatType();
                } else {
                    chatType = -1;
                }
                strLIZ = C1677606ha.LIZ(chatType);
            }
            c830490Whz.put("chat_type", strLIZ);
            C457780HxI c457780HxIZQ23 = socialActionBarLightInteractionViewModel5.zQ2();
            if (c457780HxIZQ23 != null && (sessionInfo2 = c457780HxIZQ23.LL) != null) {
                conversationId = sessionInfo2.getConversationId();
            }
            c830490Whz.put("conversation_id", conversationId);
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (ActionBarButtonConf actionBarButtonConf : list3) {
                String str2 = actionBarButtonConf.buttonId;
                if (str2 == null) {
                    str2 = actionBarButtonConf.displayName;
                }
                arrayList5.add(str2);
            }
            c830490Whz.put("action_bar_items", C13LP.LJJLIIIJ(arrayList5, ",", null, null, 0, null, null, 62));
            C20684815ws.LJIILLIIL("process_dm_action_bar", c830490Whz);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialActionBarLightInteractionViewModel@9e54.fetchActionBarDataForLightInteraction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
