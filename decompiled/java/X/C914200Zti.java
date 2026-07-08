package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Zti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914200Zti extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914200Zti(C0YY9 c0yy9, C0YYD c0yyd, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yy9;
        this.l1 = c0yyd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914200Zti(C0YYA c0yya, C0YYB c0yyb, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yya;
        this.l1 = c0yyb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914200Zti(C0YYI c0yyi, C0YYH c0yyh, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yyi;
        this.l1 = c0yyh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914200Zti(InterfaceC876060YYi interfaceC876060YYi, C876120YYo c876120YYo, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC876060YYi;
        this.l1 = c876120YYo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914200Zti(SessionListSingleChatVH sessionListSingleChatVH, C0Z8L c0z8l, int i) {
        super(4);
        this.$t = i;
        this.l0 = sessionListSingleChatVH;
        this.l1 = c0z8l;
    }

    public static final Object invoke$0(C914200Zti c914200Zti, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        CompletionBlock completionBlock = (CompletionBlock) obj4;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        GECPigeon.Companion.getClass();
        AbstractC2252651DEx abstractC2252651DEx = C872060YIy.LIZ().LIZJ().LIZJ;
        C0YYA c0yya = (C0YYA) c914200Zti.l0;
        C23250099c.LIZLLL(c054g, abstractC2252651DEx, null, new C875760YXe(pigeonConversationDetailContainer, completionBlock, c0yya, (C0YXO) obj3, (String) obj, (C0YYB) c914200Zti.l1, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C914200Zti c914200Zti, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(c054g, C872060YIy.LIZ().LIZJ().LIZJ, null, new C875840YXm(pigeonConversationDetailContainer, (CompletionBlock) obj4, (C0YYI) c914200Zti.l0, (C0YYH) c914200Zti.l1, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C914200Zti c914200Zti, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        C2252321DDq c2252321DDqLJIIIZ;
        String str2 = (String) obj;
        C0YXO c0yxo = (C0YXO) obj3;
        CompletionBlock completionBlock = (CompletionBlock) obj4;
        String token = ((InterfaceC876060YYi) c914200Zti.l0).getToken();
        String imUserId = ((InterfaceC876060YYi) c914200Zti.l0).getImUserId();
        String idcRegion = ((InterfaceC876060YYi) c914200Zti.l0).getIdcRegion();
        if (idcRegion == null) {
            idcRegion = "";
        }
        C0YWT c0ywt = new C0YWT(0, token, imUserId, "", idcRegion, Collections.singletonList(((InterfaceC876060YYi) c914200Zti.l0).getWsUrl()), ((InterfaceC876060YYi) c914200Zti.l0).getApiUrl(), ((InterfaceC876060YYi) c914200Zti.l0).getFpId().intValue(), ((InterfaceC876060YYi) c914200Zti.l0).getAppId().intValue(), ((InterfaceC876060YYi) c914200Zti.l0).getAppKey(), ((InterfaceC876060YYi) c914200Zti.l0).getFrontierServiceId().intValue(), 6144);
        if (!C0YWN.LIZ(c0ywt)) {
            C2382909Vj.LIZ(completionBlock, 2003, "invalid auth info", null, 4);
            C876120YYo c876120YYo = (C876120YYo) c914200Zti.l1;
            InterfaceC876060YYi interfaceC876060YYi = (InterfaceC876060YYi) c914200Zti.l0;
            GECPigeon gECPigeon = c0yxo.LLILZIL;
            c876120YYo.getClass();
            Pair[] pairArr = new Pair[11];
            pairArr[0] = new Pair("client", interfaceC876060YYi.getTenantId());
            pairArr[1] = new Pair("container_id", interfaceC876060YYi.getContainerId());
            pairArr[2] = new Pair("im_id", interfaceC876060YYi.getImUserId());
            String idcRegion2 = interfaceC876060YYi.getIdcRegion();
            if (idcRegion2 == null) {
                idcRegion2 = "";
            }
            pairArr[3] = new Pair("idc_region", idcRegion2);
            pairArr[4] = new Pair("biz_service_id", interfaceC876060YYi.getBizServiceId());
            pairArr[5] = new Pair("api_url", interfaceC876060YYi.getApiUrl());
            pairArr[6] = new Pair("ws_url", interfaceC876060YYi.getWsUrl());
            pairArr[7] = new Pair("app_id", interfaceC876060YYi.getAppId());
            pairArr[8] = new Pair("app_key", interfaceC876060YYi.getAppKey());
            pairArr[9] = new Pair("status_code", 2003);
            PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApi = (PigeonIMLoginStateComponentApi) C0YXD.LIZLLL(gECPigeon, C13LE.LIZ(PigeonIMLoginStateComponentApi.class));
            if (pigeonIMLoginStateComponentApi != null && (c2252321DDqLJIIIZ = pigeonIMLoginStateComponentApi.LJIIIZ()) != null && ((Boolean) c2252321DDqLJIIIZ.getValue()).booleanValue()) {
                str = "true";
            } else {
                str = "false";
            }
            pairArr[10] = new Pair("is_login", str);
            C1018703yb.LIZIZ("pigeon_init_jsb_invoke_end", C2097608Jq.LJIIIIZZ(pairArr));
        } else {
            c0yxo.LIZLLL(str2, c0ywt);
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(str2, C13LE.LIZ(InterfaceC876080YYk.class));
            InterfaceC876080YYk interfaceC876080YYk = (InterfaceC876080YYk) xBaseModelLIZJ;
            interfaceC876080YYk.setCode(1);
            interfaceC876080YYk.setMsg("success");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C914200Zti c914200Zti, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(c054g, C872060YIy.LIZ().LIZJ().LIZJ, null, new C875800YXi(pigeonConversationDetailContainer, (CompletionBlock) obj4, (C0YXO) obj3, (C0YY9) c914200Zti.l0, (C0YYD) c914200Zti.l1, null), 2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C914200Zti c914200Zti, Object obj, Object obj2, Object obj3, Object obj4) {
        C786410Ut5.R7(((SessionListSingleChatVH) c914200Zti.l0).S6(), (View.OnClickListener) ((SessionListSingleChatVH) c914200Zti.l0).b7().LJII.getValue());
        C912070ZqH.LIZIZ.LJIJJLI().LIZ(C888510YtN.LIZ((C0Z8L) c914200Zti.l1), C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }
}
