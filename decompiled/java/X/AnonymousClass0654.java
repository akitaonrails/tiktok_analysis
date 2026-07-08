package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS35S0300000_2;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.saas.host.api.casting.IIMCastingService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.FollowTaskService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0654, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.FollowTaskService$run$1", f = "FollowTask.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0654 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ FollowTaskService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0654(C869590Y9l c869590Y9l, View view, FollowTaskService followTaskService, InterfaceC1364105Vn<? super AnonymousClass0654> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = view;
        this.LLILLL = followTaskService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0654(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        boolean z;
        String strLIZJ;
        String strLIZ;
        String strLIZIZ;
        C1C7U.LIZ("FollowTaskService@5212.run$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(this.LL, BaseContent.class);
        if (orParseJsonContent == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowTaskService@5212.run$1");
            return unit;
        }
        String str = "";
        if (orParseJsonContent instanceof ShareUserContent) {
            ShareUserContent shareUserContent = (ShareUserContent) orParseJsonContent;
            String secUid = shareUserContent.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            String uid = shareUserContent.getUid();
            if (uid == null) {
                uid = "";
            }
            pair = new Pair(secUid, uid);
        } else if (orParseJsonContent instanceof ShareAwemeContent) {
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) orParseJsonContent;
            String secUid2 = shareAwemeContent.getSecUid();
            if (secUid2 == null) {
                secUid2 = "";
            }
            String user = shareAwemeContent.getUser();
            if (user == null) {
                user = "";
            }
            pair = new Pair(secUid2, user);
        } else if (orParseJsonContent instanceof ShareLiveContent) {
            ShareLiveContent shareLiveContent = (ShareLiveContent) orParseJsonContent;
            String roomSecOwnerId = shareLiveContent.getRoomSecOwnerId();
            if (roomSecOwnerId == null) {
                roomSecOwnerId = "";
            }
            String roomOwnerId = shareLiveContent.getRoomOwnerId();
            if (roomOwnerId == null) {
                roomOwnerId = "";
            }
            pair = new Pair(roomSecOwnerId, roomOwnerId);
        } else {
            pair = new Pair("", "");
        }
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        boolean zIsConnected = false;
        if (str3.length() == 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FollowTaskService@5212.run$1");
            return unit2;
        }
        AnonymousClass0656 anonymousClass0656 = new Object() { // from class: X.0656
        };
        String conversationId = this.LL.getConversationId();
        if (this.LL.getConversationType() == AbstractC1711506n3.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null) {
            zIsConnected = c1d0f.isConnected();
        }
        Boolean boolValueOf = Boolean.valueOf(zIsConnected);
        if (c1d0f == null || (strLIZJ = c1d0f.LIZJ()) == null) {
            strLIZJ = "";
        }
        long jLJII = C0YNP.LJII(conversationId);
        C0I0B.LJFF.LIZIZ();
        anonymousClass0656.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLJII);
        sbLIZ.append("");
        c830490Whz.put("to_user_id", C2188811AlT.LIZIZ(sbLIZ));
        c830490Whz.put("previous_page", "message");
        c830490Whz.put("previous_page_position", "other_places");
        if (z) {
            c830490Whz.put("enter_from", "group_chat");
        } else {
            c830490Whz.put("enter_from", "chat");
        }
        c830490Whz.put("enter_method", "card");
        IIMCastingService.LIZ.getClass();
        C01GW<IIMCastingService> c01gw = AnonymousClass0655.LIZIZ;
        IIMCastingService value = c01gw.getValue();
        if (value == null || (strLIZ = value.LIZ()) == null) {
            strLIZ = "";
        }
        c830490Whz.put(strLIZ, String.valueOf(boolValueOf));
        IIMCastingService value2 = c01gw.getValue();
        if (value2 != null && (strLIZIZ = value2.LIZIZ()) != null) {
            str = strLIZIZ;
        }
        c830490Whz.put(str, strLIZJ);
        C20684815ws.LJIILLIIL("follow", c830490Whz);
        IFollowService iFollowService = (IFollowService) ServiceManager.get().getService(IFollowService.class);
        final View view = this.LLILLJJLI;
        final FollowTaskService followTaskService = this.LLILLL;
        iFollowService.sendRequest(str3, str2, 1, new InterfaceC1252460ihI() { // from class: X.05r3
            @Override // X.InterfaceC1252460ihI
            public final void LIZIZ() {
                C1481605r4.LIZIZ(new ARunnableS102S0100000_2(view, 95));
            }

            @Override // X.InterfaceC1252460ihI
            public final void LIZ(Exception exc) {
                C1481605r4.LIZIZ(new ARunnableS35S0300000_2((Object) followTaskService, (Activity) view, (C259800zU<ECAsyncInflaterV2>) exc, (Lifecycle) 7));
            }
        });
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FollowTaskService@5212.run$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
