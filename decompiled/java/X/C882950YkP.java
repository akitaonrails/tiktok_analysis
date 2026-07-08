package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.prompt.MessageRequestPromptInboxBannerAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.prompt.MessageRequestPromptInboxBannerAssem$onResume$1", f = "MessageRequestPromptInboxBannerAssem.kt", l = {66}, m = "invokeSuspend")
public final class C882950YkP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ MessageRequestPromptInboxBannerAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882950YkP(MessageRequestPromptInboxBannerAssem messageRequestPromptInboxBannerAssem, InterfaceC1364105Vn<? super C882950YkP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = messageRequestPromptInboxBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C882950YkP(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.1BGS] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Integer num;
        MessageRequestPromptData messageRequestPromptData;
        Integer num2;
        String str;
        C1C7U.LIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                List list = (List) this.LL;
                C155000ia.LIZIZ(obj);
                arrayList = list;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C0Y9G> listLJIIJ = C876470YZx.LIZ().LJIIJ(EnumC871430YGn.ALL_STRANGER);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
            Iterator<C0Y9G> it2 = listLJIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(C0YNP.LJII(it2.next().LIZ)));
            }
            this.LLILLL.getClass();
            MessageRequestPromptData messageRequestPromptData2 = C888800Ytq.LIZLLL().inboxBannerPromptData;
            if (messageRequestPromptData2 != null && (num = messageRequestPromptData2.timing) != null && num.intValue() == 0) {
                IMContactApi.LIZ.getClass();
                ?? LJ = C069P.LIZ().LJ();
                this.LL = arrayList;
                this.LLILLJJLI = 1;
                obj = LJ.LJIILIIL("im_message_request_list", arrayList, this, true, false, false);
                arrayList = arrayList;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
                    return objLJFF;
                }
            }
            this.LLILLL.getClass();
            messageRequestPromptData = C888800Ytq.LIZLLL().inboxBannerPromptData;
            if (messageRequestPromptData == null && (num2 = messageRequestPromptData.timing) != null && num2.intValue() == 1 && (!arrayList.isEmpty())) {
                this.LLILLL.ho();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
                return unit;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
            return unit2;
        }
        MessageRequestPromptInboxBannerAssem messageRequestPromptInboxBannerAssem = this.LLILLL;
        Iterator it3 = ((Iterable) obj).iterator();
        while (it3.hasNext()) {
            MatchedFriendStruct matchedFriend = ((IMUser) it3.next()).getMatchedFriend();
            if (matchedFriend != null) {
                str = matchedFriend.recType;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                messageRequestPromptInboxBannerAssem.ho();
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
                return unit3;
            }
        }
        this.LLILLL.getClass();
        messageRequestPromptData = C888800Ytq.LIZLLL().inboxBannerPromptData;
        if (messageRequestPromptData == null) {
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestPromptInboxBannerAssem@cb56.onResume$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
