package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21289518Td extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIChatGenModel LLILZ;
    public final /* synthetic */ AIChatGenNode LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21289518Td(Context context, AIChatGenModel aIChatGenModel, AIChatGenNode aIChatGenNode, String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = context;
        this.LLILZ = aIChatGenModel;
        this.LLILZIL = aIChatGenNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Bundle bundle;
        C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromEditToolbar");
        CreationChatRoomEnterParams creationChatRoomEnterParams = new CreationChatRoomEnterParams(str, null, new CreativeInfo(null, 0, null, 7, null).getCreationId(), UUID.randomUUID().toString(), "edit_toolbar", "edit_toolbar", this.LL, this.LLILLJJLI, null, "unknow", null, null, null, null);
        Intent intent = new Intent();
        AIChatGenModel aIChatGenModel = this.LLILZ;
        AIChatGenNode aIChatGenNode = this.LLILZIL;
        intent.putExtra("enter_params", creationChatRoomEnterParams);
        if (aIChatGenModel != null) {
            intent.putExtra("key_ai_chat_gen_model", aIChatGenModel);
        }
        intent.putExtra("key_ai_chat_gen_node", (Parcelable) aIChatGenNode);
        Context context = this.LLILLL;
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0MWH.LJIIL(context, bundle, "CreationChatRoomContainerScene", null, 12360, null, false, 104);
        return Unit.LIZ;
    }
}
