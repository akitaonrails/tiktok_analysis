package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageChunkResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Chz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320890Chz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<Message> LL;
    public final /* synthetic */ MessageChunkResult LLILLJJLI;
    public final /* synthetic */ C321070CiH LLILLL;
    public final /* synthetic */ C320830Cht LLILZ;
    public final /* synthetic */ C321020CiC LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ C321240CiY LLIZLLLIL;
    public final /* synthetic */ C320810Chr LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320890Chz(C259800zU<Message> c259800zU, MessageChunkResult messageChunkResult, C321070CiH c321070CiH, C320830Cht c320830Cht, C321020CiC c321020CiC, C118300cf c118300cf, C118300cf c118300cf2, C321240CiY c321240CiY, C320810Chr c320810Chr) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = messageChunkResult;
        this.LLILLL = c321070CiH;
        this.LLILZ = c320830Cht;
        this.LLILZIL = c321020CiC;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = c321240CiY;
        this.LLJ = c320810Chr;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C259800zU<Message> c259800zU = this.LL;
        MessageChunkResult messageChunkResult = this.LLILLJJLI;
        ?? r8 = messageChunkResult.messages;
        c259800zU.element = r8;
        if (r8 != 0) {
            C321070CiH c321070CiH = this.LLILLL;
            C320830Cht c320830Cht = this.LLILZ;
            C321020CiC c321020CiC = this.LLILZIL;
            C118300cf c118300cf = this.LLILZLL;
            C118300cf c118300cf2 = this.LLIZ;
            C321240CiY c321240CiY = this.LLIZLLLIL;
            C320810Chr c320810Chr = this.LLJ;
            r8.LJIIJ = c321070CiH;
            CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = r8.LIZIZ();
            if (commerceAgentMixFeedLIZIZ == null || commerceAgentMixFeedLIZIZ.status != 2) {
                CommerceAgentMixFeed commerceAgentMixFeedLIZIZ2 = r8.LIZIZ();
                if (commerceAgentMixFeedLIZIZ2 == null || commerceAgentMixFeedLIZIZ2.status != 4) {
                    r8.LIZJ = 4;
                    int iMax = Math.max(c118300cf.element, c118300cf2.element);
                    c320830Cht.getClass();
                    C320830Cht.LJIIL(r8, c321020CiC, iMax, c321240CiY);
                    C320830Cht.LJIIIZ(c321020CiC);
                    Message message = c259800zU.element;
                    if (C123100dR.LIZ(message != null ? message.replyMsgId : null)) {
                        if (!Intrinsics.LJFF(message != null ? message.replyMsgId : null, CardStruct.IStatusCode.DEFAULT)) {
                            ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
                            C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320560ChS(c320830Cht, null));
                        }
                    }
                } else {
                    c320830Cht.LJIIIIZZ(c321020CiC);
                    C320830Cht.LJI(r8, c320810Chr);
                    C320830Cht.LJIIL(r8, c321020CiC, Math.max(c118300cf.element, c118300cf2.element), c321240CiY);
                    C320830Cht.LJIILIIL(c320830Cht, r8, c321020CiC, Math.max(c118300cf.element, c118300cf2.element), null, c321240CiY, messageChunkResult.extra, 8);
                }
            } else {
                c320830Cht.LJIIIIZZ(c321020CiC);
                C320830Cht.LJ(c320830Cht, r8);
                C320830Cht.LJIIL(r8, c321020CiC, Math.max(c118300cf.element, c118300cf2.element), c321240CiY);
                C320830Cht.LJIILIIL(c320830Cht, r8, c321020CiC, Math.max(c118300cf.element, c118300cf2.element), null, c321240CiY, messageChunkResult.extra, 8);
            }
        }
        return Unit.LIZ;
    }
}
