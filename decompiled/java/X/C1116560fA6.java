package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.dataChannel.StarCommentPurchasePageEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116560fA6 extends AbstractC1116630fAD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1116590fA9 interfaceC1116590fA9 = (InterfaceC1116590fA9) xBaseParamModel;
        String content = interfaceC1116590fA9.getContent();
        if (content == null) {
            content = "";
        }
        String emotes2 = interfaceC1116590fA9.getEmotes();
        if (emotes2 == null) {
            emotes2 = "";
        }
        String enterFrom = interfaceC1116590fA9.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        Pair<List<EmoteModel>, List<EmoteWithIndex>> pairDM2 = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).dM2(emotes2);
        if ((!a0.LJJJIL(emotes2)) && (!pairDM2.getFirst().isEmpty())) {
            C0KBS c0kbs = C0KBS.LIZ;
            C0KBS.LJI(pairDM2.getFirst(), C497740JfY.LJIILJJIL(), true, -1, ((EmoteModel) ListProtector.get(pairDM2.getFirst(), 0)).packageId, "live_room_message_list", new C1116250f9b(enterFrom, content, pairDM2));
        } else {
            DataChannelGlobal.LLILZ.FQ2(StarCommentPurchasePageEvent.class, new C1116330f9j(enterFrom, content, null));
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1116690fAJ.class, null);
        ((InterfaceC1116690fAJ) xBaseModelLIZJ).setCode(1);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
