package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0yXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$handleMessageShow$1$1$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1861400yXS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ Message LLILLJJLI;
    public final /* synthetic */ InterfaceC1861530yXf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861400yXS(MessageViewModel messageViewModel, Message message, InterfaceC1861530yXf interfaceC1861530yXf, InterfaceC1364105Vn<? super C1861400yXS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
        this.LLILLJJLI = message;
        this.LLILLL = interfaceC1861530yXf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861400yXS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLIZ;
        Object next;
        String strLJ;
        String str;
        Map<String, String> map;
        String str2;
        Map<String, String> map2;
        String str3;
        TakoPassExt takoPassExt;
        TakoMixFeed takoMixFeedLJIIIZ;
        List<BaseImage> list;
        String str4;
        C1C7U.LIZ("MessageViewModel@9229.handleMessageShow$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<InterfaceC1858000yRy> list2 = this.LL.getState().LL.LIZ;
        Message message = this.LLILLJJLI;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            mapLIZ = null;
            if (it2.hasNext()) {
                next = it2.next();
                Message messageLIZ = C321970Cjj.LIZ((InterfaceC1858000yRy) next);
                if (messageLIZ != null) {
                    str4 = messageLIZ.uuid;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, message.replyUuid)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Message messageLIZ2 = C321970Cjj.LIZ((InterfaceC1858000yRy) next);
        if (messageLIZ2 != null && (takoMixFeedLJIIIZ = messageLIZ2.LJIIIZ()) != null && (list = takoMixFeedLJIIIZ.images) != null) {
            strLJ = AnonymousClass1418.LJ(list);
        } else {
            strLJ = null;
        }
        this.LL.CQ2(this.LLILLJJLI);
        InterfaceC1861530yXf interfaceC1861530yXf = this.LLILLL;
        Message message2 = this.LLILLJJLI;
        int iDQ2 = this.LL.DQ2(message2);
        String str5 = "";
        if (strLJ == null) {
            strLJ = "";
        }
        Integer numLJ = C2286608xc.LJ(0);
        Message message3 = this.LLILLJJLI;
        long j = message3.serverTime;
        TakoMixFeed takoMixFeedLJIIIZ2 = message3.LJIIIZ();
        if (takoMixFeedLJIIIZ2 == null || (takoPassExt = takoMixFeedLJIIIZ2.ext) == null || (str = takoPassExt.pushSource) == null) {
            str = "";
        }
        Message message4 = this.LLILLJJLI;
        long j2 = message4.LJII;
        TakoMixFeed takoMixFeedLJIIIZ3 = message4.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null && (map2 = takoMixFeedLJIIIZ3.msgExt) != null && (str3 = map2.get("push_id")) != null) {
            str5 = str3;
        }
        TakoMixFeed takoMixFeedLJIIIZ4 = this.LLILLJJLI.LJIIIZ();
        if (takoMixFeedLJIIIZ4 != null && (map = takoMixFeedLJIIIZ4.msgExt) != null && (str2 = map.get("chat_mob_params")) != null) {
            mapLIZ = C1905510zgb.LIZ(str2);
        }
        interfaceC1861530yXf.LIZLLL(message2, 0, true, "personalized_in_app_push", iDQ2, strLJ, null, null, null, 0, numLJ, null, null, new C1862650yZT(j, str, str5, j2, mapLIZ), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.handleMessageShow$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
