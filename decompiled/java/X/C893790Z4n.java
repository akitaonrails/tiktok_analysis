package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Z4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893790Z4n {
    public static final int LIZ = EnumC868450Y5b.MsgTypeStreakCommandMessage.getValue();
    public static final int LIZIZ = EnumC868450Y5b.MsgTypeStreakPetCommandMessage.getValue();
    public static final int LIZJ = EnumC868450Y5b.MsgTypeB2CActionBarRefresh.getValue();
    public static final int LIZLLL = EnumC868450Y5b.MESSAGE_TYPE_STATUS.getValue();
    public static final Map<Integer, InterfaceC893720Z4g> LJ = new LinkedHashMap();

    static {
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4s
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.Streak.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IStreakService.LJJIIZ.getClass();
                C06LY.LIZ().d(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4u
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.StreakPet.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJIJJ(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4r
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.StreakGroupPet.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJIJJ(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4v
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.B2CActionBarRefresh.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IIMBusinessChatService.LIZ.getClass();
                IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                if (iIMBusinessChatService != null) {
                    iIMBusinessChatService.LJIIL(businessCommandMessage);
                }
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4o
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.StickerCreationResult.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJIIJJI(businessCommandMessage);
                Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
                if (onResult != null) {
                    onResult.invoke(new C867580Y1s(null));
                }
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4p
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.AIBot.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IMAIServiceAPI.LIZ.getClass();
                AnonymousClass0629.LIZ().LIZIZ().d(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z50
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.GroupAuditAppend.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                C0Z58.LJIIL(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4z
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.GroupAuditAck.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                C0Z58.LJIIL(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4q
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.GroupBizExtUpdate.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJFF(String.valueOf(businessCommandMessage.getConversationId()));
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4x
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.StreakPetRefresh.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJIILL(businessCommandMessage);
            }
        });
        LIZ(new InterfaceC893720Z4g() { // from class: X.0Z4w
            @Override // X.InterfaceC893720Z4g
            public final int LIZ() {
                return EnumC893850Z4t.StreakPetActiveRefresh.getValue();
            }

            @Override // X.InterfaceC893720Z4g
            public final void LIZIZ(BusinessCommandMessage businessCommandMessage) {
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJJIIJ(businessCommandMessage);
            }
        });
    }

    public static void LIZ(InterfaceC893720Z4g interfaceC893720Z4g) {
        LJ.put(Integer.valueOf(interfaceC893720Z4g.LIZ()), interfaceC893720Z4g);
    }
}
