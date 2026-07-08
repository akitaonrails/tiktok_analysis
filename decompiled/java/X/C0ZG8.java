package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZG8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.DetailFeedDMViewModel$sendMessageForProfilePageRepostTabAfterFetchIMUser$sendMsgTask$1", f = "DetailFeedDMViewModel.kt", l = {276}, m = "invokeSuspend")
public final class C0ZG8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C0ZG9 LL;
    public C0ZG9 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0ZG9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZG8(C0ZG9 c0zg9, InterfaceC1364105Vn<? super C0ZG8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0zg9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZG8(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0ZG9 c0zg9;
        C0ZG9 c0zg92;
        Object next;
        Map<String, String> linkedHashMap;
        String str;
        String str2;
        Object objLJIILIIL = obj;
        C1C7U.LIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$sendMsgTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c0zg9 = this.LLILLJJLI;
                c0zg92 = this.LL;
                C155000ia.LIZIZ(objLJIILIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIILIIL);
            c0zg9 = this.LLILZ;
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            List listSingletonList = Collections.singletonList(c0zg9.LIZLLL);
            this.LL = c0zg9;
            this.LLILLJJLI = c0zg9;
            this.LLILLL = 1;
            objLJIILIIL = c1bgsLJ.LJIILIIL("quick_dm_box", listSingletonList, this, true, false, false);
            if (objLJIILIIL == objLJFF) {
                C1C7U.LIZIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$sendMsgTask$1");
                return objLJFF;
            }
            c0zg92 = c0zg9;
        }
        Iterator it2 = ((Iterable) objLJIILIIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((BaseContact) next).getUid(), c0zg9.LIZLLL)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMUser iMUser = (IMUser) next;
        if (iMUser == null) {
            C1C7U.LIZIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$sendMsgTask$1");
            return false;
        }
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
        String string = c0zg9.LIZ.toString();
        Aweme aweme = c0zg9.LIZJ;
        String str3 = c0zg9.LJFF;
        if (str3 == null) {
            str3 = "";
        }
        EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_FRIENDS_PROFILE_REPOST_TAB;
        C0ZH0 c0zh0 = C0ZH0.REPOST;
        if (Intrinsics.LJFF(iMUser.getUid(), AwemeExtKt.getAuthorUid(c0zg9.LIZJ))) {
            Pair[] pairArr = new Pair[2];
            if (c0zg92.LIZIZ.isQuickReply()) {
                str = "emoji";
            } else {
                str = "text";
            }
            pairArr[0] = new Pair("dm_reply_type", str);
            if (C729510SjV.LJJIJIL(c0zg9.LIZJ)) {
                str2 = "story";
            } else {
                str2 = "post";
            }
            pairArr[1] = new Pair("story_type", str2);
            linkedHashMap = C2097608Jq.LJIIJ(pairArr);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        shareService.LJJJIL(string, iMUser, aweme, str3, enumC896890ZGl, null, c0zh0, null, false, null, null, linkedHashMap, null, null);
        C1C7U.LIZIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$sendMsgTask$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
