package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20330614gq extends C09AY implements Function0<C891950Yyv> {
    public C20330614gq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Yyv] */
    @Override // kotlin.jvm.functions.Function0
    public final C891950Yyv invoke() {
        return new InterfaceC1617930sCl() { // from class: X.0Yyv
            @Override // X.InterfaceC1617930sCl
            public final void LIZ() {
                InterfaceC890430YwT interfaceC890430YwTLJJJ;
                IIMBusinessChatService.LIZ.getClass();
                IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                if (iIMBusinessChatService != null) {
                    iIMBusinessChatService.LIZ();
                }
                IMChatListApi iMChatListApi = (IMChatListApi) PluggableExtentionKt.pluggableSpiForReal(IMChatListApi.class);
                if (iMChatListApi != null && (interfaceC890430YwTLJJJ = iMChatListApi.LJJJ()) != null) {
                    interfaceC890430YwTLJJJ.LJFF();
                }
                IMAIServiceAPI.LIZ.getClass();
                AnonymousClass0629.LIZ().LIZ().LIZIZ();
                IMRelationLabelService.LIZ.getClass();
                IMRelationLabelService value = C0ZCJ.LIZIZ.getValue();
                if (value != null) {
                    value.clearCache();
                }
            }

            @Override // X.InterfaceC1617930sCl
            public final void LIZIZ() {
                IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
                if (iAwemeImManager != null) {
                    iAwemeImManager.LIZIZ();
                }
            }

            @Override // X.InterfaceC1617930sCl
            public final LiveData<Map<Integer, Integer>> LIZJ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym2).LJIIZILJ();
            }

            @Override // X.InterfaceC1617930sCl
            public final void LIZLLL() {
                IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
                if (iAwemeImManager != null) {
                    iAwemeImManager.LIZIZ();
                }
            }
        };
    }
}
