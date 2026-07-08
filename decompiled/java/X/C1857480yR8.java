package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857480yR8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IMessageAbility LL;
    public final /* synthetic */ Message LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ List<Message> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857480yR8(IMessageAbility iMessageAbility, Message message, InterfaceC665370Q7z interfaceC665370Q7z, Message message2, int i, List<Message> list) {
        super(0);
        this.LL = iMessageAbility;
        this.LLILLJJLI = message;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = message2;
        this.LLILZIL = i;
        this.LLILZLL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> mapLJ;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        List<BaseImage> list;
        List<BaseImage> list2;
        IMessageAbility iMessageAbility = this.LL;
        if (iMessageAbility != null) {
            iMessageAbility.zG0(Message.LIZLLL(this.LLILLJJLI, null, 0, false, 0, false, null, true, -1, 1572863));
        }
        C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        Message message = this.LLILLJJLI;
        Message message2 = this.LLILZ;
        int i = this.LLILZIL;
        int size = this.LLILZLL.size() + 1;
        c1857470yR7.getClass();
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("is_resend", CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("is_edit", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("interaction_type", "manual_input");
        TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
        pairArr[3] = new Pair("message_content", takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.text : null);
        pairArr[4] = new Pair("message_id", message2.uuid);
        pairArr[5] = new Pair("is_regenerate", "1");
        pairArr[6] = new Pair("regenerate_type", i != 1 ? i != 2 ? "default" : "detailed" : "concise");
        pairArr[7] = new Pair("regenerate_round", String.valueOf(size - 1));
        pairArr[8] = new Pair("server_message_id", message2.msgId);
        pairArr[9] = new Pair("log_id", String.valueOf(message2.ext.log));
        pairArr[10] = new Pair("status_code", CardStruct.IStatusCode.DEFAULT);
        TakoMixFeed takoMixFeedLJIIIZ2 = message2.LJIIIZ();
        pairArr[11] = new Pair("message_type", (takoMixFeedLJIIIZ2 == null || (list2 = takoMixFeedLJIIIZ2.images) == null || !list2.isEmpty()) ? "text_image" : "text");
        TakoMixFeed takoMixFeedLJIIIZ3 = message2.LJIIIZ();
        pairArr[12] = new Pair("image_info", (takoMixFeedLJIIIZ3 == null || (list = takoMixFeedLJIIIZ3.images) == null) ? null : AnonymousClass1418.LJ(list));
        pairArr[13] = new Pair("session_source", (iTakoContextAbility == null || (c13lcAp0 = iTakoContextAbility.Ap0()) == null || (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) == null) ? null : c1864200yby.LLILLJJLI);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility2 != null) {
            iMessageAbility2.Wk0(message, message2, i, size, mapLJ, mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
