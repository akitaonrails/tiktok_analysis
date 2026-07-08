package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.impl.api.SocialGameApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.jsb.SendGameScoreToFriendMethodIDL$handle$2", f = "SendGameScoreToFriendMethodIDL.kt", l = {32}, m = "invokeSuspend")
public final class C1471405pQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1471605pS LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC1471705pT> LLILLL;
    public final /* synthetic */ C1462805o2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471405pQ(InterfaceC1471605pS interfaceC1471605pS, CompletionBlock<InterfaceC1471705pT> completionBlock, C1462805o2 c1462805o2, InterfaceC1364105Vn<? super C1471405pQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1471605pS;
        this.LLILLL = completionBlock;
        this.LLILZ = c1462805o2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1471405pQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        ArrayList arrayList;
        Integer numLJ;
        Float fLIZLLL;
        Integer numLJ2;
        EmojiGameItemConfig next;
        int i;
        String str;
        List<Long> memberIds;
        String containerID;
        C1C7U.LIZ("SendGameScoreToFriendMethodIDL@9ade.handle$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILLJJLI.getConversationId());
            if (c0y8tLIZ != null && (memberIds = c0y8tLIZ.getMemberIds()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
                Iterator<Long> it2 = memberIds.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toString());
                }
            } else {
                arrayList = null;
            }
            SocialGameApi.LIZ.getClass();
            SocialGameApi value = C463701rH.LIZIZ.getValue();
            if (value != null) {
                Number gameId = this.LLILLJJLI.getGameId();
                if (gameId != null) {
                    numLJ = C2286608xc.LJ(gameId.intValue());
                } else {
                    numLJ = null;
                }
                String conversationId = this.LLILLJJLI.getConversationId();
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(arrayList);
                if (strLJI != null) {
                    Number score = this.LLILLJJLI.getScore();
                    if (score != null) {
                        fLIZLLL = C2286608xc.LIZLLL(score.floatValue());
                    } else {
                        fLIZLLL = null;
                    }
                    String emojiText = this.LLILLJJLI.getEmojiText();
                    String emojiText2 = this.LLILLJJLI.getEmojiText();
                    Number emojiType = this.LLILLJJLI.getEmojiType();
                    if (emojiType != null) {
                        numLJ2 = C2286608xc.LJ(emojiType.intValue());
                    } else {
                        numLJ2 = null;
                    }
                    List<EmojiGameItemConfig> list = C1505505uv.LIZ().gameList;
                    InterfaceC1471605pS interfaceC1471605pS = this.LLILLJJLI;
                    Iterator<EmojiGameItemConfig> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(next.id, interfaceC1471605pS.getGameId())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    EmojiGameItemConfig emojiGameItemConfig = next;
                    if (emojiGameItemConfig != null) {
                        str = emojiGameItemConfig.path;
                        i = 1;
                    } else {
                        i = 1;
                        str = null;
                    }
                    this.LL = i;
                    if (value.submitScore(numLJ, conversationId, strLJI, fLIZLLL, emojiText, emojiText2, numLJ2, str, this) == objLJFF) {
                        C1C7U.LIZIZ("SendGameScoreToFriendMethodIDL@9ade.handle$2");
                        return objLJFF;
                    }
                } else {
                    throw new Exception("json error");
                }
            }
        }
        CompletionBlock<InterfaceC1471705pT> completionBlock = this.LLILLL;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILZ.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1471705pT.class, containerID), "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendGameScoreToFriendMethodIDL@9ade.handle$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
