package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.MediaPayload;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomLogicComponent$initChatRoom$1", f = "AiChatRoomLogicComponent.kt", l = {136}, m = "invokeSuspend")
public final class C21289118Sz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C18TC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21289118Sz(C18TC c18tc, InterfaceC1364105Vn<? super C21289118Sz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18tc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21289118Sz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIChatTrackingConfig aIChatTrackingConfig;
        String str;
        AIChatPayload aIChatPayload;
        List<MediaPayload> list;
        String promptType;
        AIChatGenChatRoomModel aIChatGenChatRoomModel;
        C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.initChatRoom$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDqLJI = C21163117rp.LIZIZ().LJI();
            C342430Dbd c342430Dbd = new C342430Dbd(null);
            this.LL = 1;
            obj = C09IC.LJIJ(c2252321DDqLJI, this, c342430Dbd);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.initChatRoom$1");
                return objLJFF;
            }
        }
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) obj;
        if ((interfaceC1157570gEF instanceof C1157450gE3) && (aIChatGenChatRoomModel = this.LLILLJJLI.LLILZ.LJ.chatRoomModel) != null) {
            if (((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ != null) {
                z = false;
            }
            aIChatGenChatRoomModel.isNewUser = Boolean.valueOf(z);
        }
        C18T2.LIZ.getClass();
        C18T2.LIZLLL("ai_chat_room_ready_duration");
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = this.LLILLJJLI.LLILZ;
        c18up.getClass();
        C0LAB c0lab = new C0LAB();
        C18UP.LIZ(c0lab, c18uj);
        AIChatGenConsumptionModel aIChatGenConsumptionModel = c18uj.LJ.consumptionModel;
        if (aIChatGenConsumptionModel != null) {
            AIChatGenPrompt aIChatGenPrompt = aIChatGenConsumptionModel.prompt;
            if (aIChatGenPrompt == null || (promptType = aIChatGenPrompt.getPromptType()) == null) {
                promptType = "";
            }
            c0lab.LJ("vp_prompt_type", promptType);
            c0lab.LJ("pic_cnt", String.valueOf(aIChatGenConsumptionModel.originImageCount));
        }
        AIChatPageConfig aIChatPageConfig = c18uj.LJI;
        if (aIChatPageConfig != null && (aIChatPayload = aIChatPageConfig.payload) != null && (list = aIChatPayload.medias) != null) {
            c0lab.LJ("pic_cnt", String.valueOf(list.size()));
        }
        AIChatPageConfig aIChatPageConfig2 = c18uj.LJI;
        if (aIChatPageConfig2 != null && (aIChatTrackingConfig = aIChatPageConfig2.tracking) != null && (str = aIChatTrackingConfig.awemeId) != null) {
            c0lab.LJ("group_id", str);
        }
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("enter_visual_poet_shoot_page", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.initChatRoom$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
