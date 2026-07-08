package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics$trackEnterChatPerformance$1", f = "IMChatRoomAnalytics.kt", l = {593}, m = "invokeSuspend")
public final class C894150Z5x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C830490Whz LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ SessionInfo LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ List<RecyclerView.ViewHolder> LLJIJIL;
    public final /* synthetic */ InterfaceC1493105sv LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C894150Z5x(long j, SessionInfo sessionInfo, int i, long j2, int i2, String str, boolean z, boolean z2, List<? extends RecyclerView.ViewHolder> list, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C894150Z5x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = sessionInfo;
        this.LLILZIL = i;
        this.LLILZLL = j2;
        this.LLIZ = i2;
        this.LLIZLLLIL = str;
        this.LLJ = z;
        this.LLJI = z2;
        this.LLJIJIL = list;
        this.LLJILJIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C894150Z5x(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C830490Whz c830490Whz;
        Integer numLJ;
        String string;
        Object[] objArr;
        C1C7U.LIZ("IMChatRoomAnalytics@6d9e.trackEnterChatPerformance$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c830490Whz = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c830490Whz = new C830490Whz();
            c830490Whz.put("duration", String.valueOf(this.LLILLL));
            int enterFrom = this.LLILZ.getEnterFrom();
            boolean zIsReportPage = this.LLILZ.isReportPage();
            c830490Whz.put("is_quick_chat", String.valueOf(this.LLILZ.isQuickChat() ? 1 : 0));
            c830490Whz.put("is_new_group", C1529305yl.LIZ(Boolean.valueOf(this.LLILZ.isNewGroupChat())));
            c830490Whz.put("invitee_group_status", String.valueOf(this.LLILZ.getInviteeGroupStatus()));
            c830490Whz.put("enter_from_v2", String.valueOf(enterFrom));
            c830490Whz.put("msg_list_size", String.valueOf(this.LLILZIL));
            c830490Whz.put("is_report_page", String.valueOf(zIsReportPage ? 1 : 0));
            c830490Whz.put("rv_onlayout_cost", String.valueOf(this.LLILZLL));
            c830490Whz.put("rv_onlayout_exception_count", String.valueOf(this.LLIZ));
            c830490Whz.put("has_push_msg", this.LLIZLLLIL);
            SessionInfo sessionInfo = this.LLILZ;
            if (sessionInfo != null) {
                numLJ = C2286608xc.LJ(sessionInfo.getUnreadCount());
            } else {
                numLJ = null;
            }
            c830490Whz.put("unread_cnt", String.valueOf(numLJ));
            IMNetworkSaasApi.LIZ.getClass();
            IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
            if (iMNetworkSaasApiLIZ != null) {
                string = C2286608xc.LJ(iMNetworkSaasApiLIZ.getNqeNetworkLevel()).toString();
            } else {
                string = null;
            }
            c830490Whz.put("network_level", string);
            String str = "1";
            if (this.LLJ) {
                objArr = "1";
            } else {
                objArr = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("is_delayed_enter", objArr);
            if (!this.LLJI) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("is_delayed_enter_timeout", str);
            List<RecyclerView.ViewHolder> list = this.LLJIJIL;
            ArrayList arrayList = new ArrayList();
            for (RecyclerView.ViewHolder viewHolder : list) {
                if (viewHolder.itemView.getVisibility() == 0) {
                    arrayList.add(viewHolder);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((RecyclerView.ViewHolder) it2.next()).itemView);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object tag = ((View) it3.next()).getTag(R.id.k_t);
                if ((tag instanceof Integer) && tag != null) {
                    arrayList3.add(tag);
                }
            }
            c830490Whz.put("message_type", C13LP.LJJLIIIJ(arrayList3, ",", ",", ",", 0, null, null, 56));
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object tag2 = ((View) it4.next()).getTag(R.id.k_u);
                if ((tag2 instanceof String) && tag2 != null) {
                    arrayList4.add(tag2);
                }
            }
            c830490Whz.put(Scene.SCENE_SERVICE, C13LP.LJJLIIIJ(arrayList4, ",", ",", ",", 0, null, null, 56));
            IIMNewMessageAnalytics.LIZ.getClass();
            IIMNewMessageAnalytics value = C894100Z5s.LIZIZ.getValue();
            if (value != null) {
                String conversationId = this.LLILZ.getConversationId();
                this.LL = c830490Whz;
                this.LLILLJJLI = 1;
                if (value.LIZIZ(conversationId, c830490Whz, new C891480YyA(), this) == objLJFF) {
                    C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.trackEnterChatPerformance$1");
                    return objLJFF;
                }
            }
        }
        Map<String, String> mapLIZIZ = ChatRoomEventTrackingStore.LIZIZ.LIZIZ(this.LLILZ.getUuid());
        IIMNewMessageAnalytics.LIZ.getClass();
        IIMNewMessageAnalytics value2 = C894100Z5s.LIZIZ.getValue();
        if (value2 != null) {
            value2.LIZ(null, c830490Whz, mapLIZIZ);
        }
        this.LLJILJIL.sendEvent("enter_chat_performance_v2", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.trackEnterChatPerformance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
