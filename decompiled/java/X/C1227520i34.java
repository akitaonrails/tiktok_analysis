package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.0i34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227520i34 extends C09AY implements Function1<C0Y8T, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<C0Y8T, Unit> LLILLJJLI;
    public final /* synthetic */ AbstractC1225770i0F LLILLL;
    public final /* synthetic */ List<IMUser> LLILZ;
    public final /* synthetic */ List<IMUser> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC1227250i2d LLIZ;
    public final /* synthetic */ AbstractC1225780i0G LLIZLLLIL;
    public final /* synthetic */ Fragment LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1227520i34(boolean z, Function1<? super C0Y8T, Unit> function1, AbstractC1225770i0F abstractC1225770i0F, List<? extends IMUser> list, List<? extends IMUser> list2, String str, InterfaceC1227250i2d interfaceC1227250i2d, AbstractC1225780i0G abstractC1225780i0G, Fragment fragment) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = abstractC1225770i0F;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = str;
        this.LLIZ = interfaceC1227250i2d;
        this.LLIZLLLIL = abstractC1225780i0G;
        this.LLJ = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0Y8T c0y8t) {
        List<IMUser> list;
        InterfaceC1227250i2d interfaceC1227250i2d;
        C1226960i2A c1226960i2A;
        Function1<AbstractC1225770i0F, Map<String, String>> function1;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C0Y8T c0y8t2 = c0y8t;
        if (this.LL) {
            IMLiveDataService.LIZ.getClass();
            IMLiveDataService value = C1227780i3U.LIZIZ.getValue();
            if (value != null) {
                value.LIZIZ(c0y8t2.getConversationId());
            }
        }
        Function1<C0Y8T, Unit> function12 = this.LLILLJJLI;
        if (function12 != null) {
            function12.invoke(c0y8t2);
        }
        InterfaceC1226510i1R interfaceC1226510i1R = this.LLILLL.LLILLL;
        Map<String, String> mapInvoke = null;
        if (interfaceC1226510i1R != null) {
            interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
        }
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null) {
            iMGroupChatApiLIZ.LJIJJLI(c0y8t2.getConversationId(), this.LLILZ);
        } else {
            C1618506Vj.LIZJ(null, new AwS368S0200000_2(c0y8t2, (C0Y8T) this.LLILZ, (List<? extends IMUser>) 166));
        }
        if ((!this.LLILZIL.isEmpty()) || C1229100i5c.LIZ.LJIIL(c0y8t2)) {
            if (C1229100i5c.LIZ.LJIIL(c0y8t2)) {
                list = this.LLILZ;
            } else {
                list = this.LLILZIL;
            }
            int size = list.size();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                Fragment fragment = this.LLJ;
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJ(fragment.getResources().getQuantityString(2131755339, size, Integer.valueOf(size)));
                c1389890mGx.LJIIJJI();
            }
            if (!TextUtils.isEmpty(this.LLILZLL) && this.LLILZ.size() == this.LLILZIL.size() && (interfaceC1227250i2d = this.LLIZ) != null) {
                String str = this.LLILZLL;
                AbstractC1225780i0G abstractC1225780i0G = this.LLIZLLLIL;
                if ((abstractC1225780i0G instanceof C1226960i2A) && (c1226960i2A = (C1226960i2A) abstractC1225780i0G) != null && (function1 = c1226960i2A.LLJJI) != null) {
                    mapInvoke = function1.invoke(this.LLILLL);
                }
                interfaceC1227250i2d.LIZJ(null, str, null, null, mapInvoke);
            }
        }
        if (this.LLILZIL.size() < this.LLILZ.size() || this.LLILZ.isEmpty()) {
            EnterChatParams enterChatParams = new EnterChatParams(this.LLJ.getContext(), 3, c0y8t2.getConversationId());
            AbstractC1225780i0G abstractC1225780i0G2 = this.LLIZLLLIL;
            enterChatParams.setNewGroupChat(true);
            enterChatParams.setChatType(3);
            enterChatParams.setEnterFrom(17);
            enterChatParams.setEnterMethodForMob(abstractC1225780i0G2.LJIIIZ().LIZLLL());
            enterChatParams.setSessionId(c0y8t2.getConversationId());
            enterChatParams.setEnterFromForMob(abstractC1225780i0G2.LJIIIZ().LIZJ());
            enterChatParams.setQuickChat(true);
            C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
        }
        return Unit.LIZ;
    }
}
