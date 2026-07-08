package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.android.live.liveinteract.multilive.model.GetRunningNoticeboardMaterialContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetRunningNoticeboardMaterialContentResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.text.a0;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseResponse;

/* JADX INFO: renamed from: X.01zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517301zv implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            default:
                return null;
        }
    }

    public C517301zv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(C517301zv c517301zv, Object obj) {
        C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "nleEditor operation");
        return C953290aul.LIZ(AbstractC19484711Kz.LJIJJLI(obj), (AbstractC19484711Kz) c517301zv.l0);
    }

    public static final Object apply$1(C517301zv c517301zv, Object obj) {
        Pair pair = (Pair) obj;
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI(pair.getFirst());
        NoticeboardGuestController noticeboardGuestController = (NoticeboardGuestController) c517301zv.l0;
        String str = (String) pair.getSecond();
        noticeboardGuestController.getClass();
        C480460Ism.LIZ().getClass();
        return C953290aul.LIZ(c19475311HjLJIJJLI, ((NoticeboardGuestController.ImageXService) C480460Ism.LIZIZ(NoticeboardGuestController.ImageXService.class)).getImageMetaInfo(str).LJJIJIIJI(C11S5.LIZ()).LJIILL(new C515701zf(str, 2)).LJIIL(new C515701zf(str, 5)));
    }

    public static final Object apply$10(C517301zv c517301zv, Object obj) {
        return c517301zv.l0;
    }

    public static final Object apply$2(C517301zv c517301zv, Object obj) {
        return C11NZ.LJJIJLIJ((Throwable) c517301zv.l0);
    }

    public static final Object apply$3(C517301zv c517301zv, Object obj) {
        return C11NZ.LJJIJLIJ((Throwable) c517301zv.l0);
    }

    public static final Object apply$4(C517301zv c517301zv, Object obj) {
        return C11NZ.LJJIJLIJ((Throwable) c517301zv.l0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(C517301zv c517301zv, Object obj) {
        EnigmaIAPPurchaseResponse.Data data = (EnigmaIAPPurchaseResponse.Data) ((BaseResponse) obj).data;
        if (data != null) {
            String str = data.contractId;
            String str2 = data.mpPayload;
            if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                return new C290601Aq((C1B0X) c517301zv.l0, str, str2);
            }
        }
        throw new C2197961B0o("Missing contractId or iapPayload", null);
    }

    public static final Object apply$6(C517301zv c517301zv, Object obj) {
        return new C297001Dc((C1B0X) c517301zv.l0, (String) obj);
    }

    public static final Object apply$7(C517301zv c517301zv, Object obj) {
        return new Pair((C290601Aq) c517301zv.l0, obj);
    }

    public static final Object apply$8(C517301zv c517301zv, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            C013C c013c = (C013C) c517301zv.l0;
            if (c013c.element) {
                c013c.element = false;
                Boolean bool2 = Boolean.TRUE;
                return new Pair(bool2, bool2);
            }
        }
        return new Pair(bool, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$9(C517301zv c517301zv, Object obj) {
        long jLongValue;
        long j;
        String strU3;
        NoticeboardGuestController noticeboardGuestController = (NoticeboardGuestController) c517301zv.l0;
        noticeboardGuestController.getClass();
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        GetRunningNoticeboardMaterialContentParams getRunningNoticeboardMaterialContentParams = new GetRunningNoticeboardMaterialContentParams();
        Long l = NoticeboardGuestController.LJIILIIL;
        long id = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        getRunningNoticeboardMaterialContentParams.noticeboardId = jLongValue;
        String str = noticeboardGuestController.LJII;
        if (str == null) {
            str = "";
        }
        getRunningNoticeboardMaterialContentParams.mediaNodeId = str;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
            j = CastLongProtector.parseLong(strU3);
        } else {
            j = 0;
        }
        getRunningNoticeboardMaterialContentParams.channelId = j;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        }
        getRunningNoticeboardMaterialContentParams.roomId = id;
        C19482011Jy c19482011JyLJIL = iNoticeboardApi.getRunningMaterialContent(getRunningNoticeboardMaterialContentParams).LJJIJIIJI(C11S5.LIZ()).LJIILL(new C09JN() { // from class: X.00R6
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("NoticeboardGuestController@b397.getImageInfoFromServer$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRunningMaterialContent success log_id=");
                sbLIZ.append(((BaseResponse) obj2).LIZIZ);
                C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("NoticeboardGuestController@b397.getImageInfoFromServer$2");
            }
        }).LJIIL(new C09JN() { // from class: X.00So
            @Override // X.C09JN
            public final void accept(Object obj2) {
                String str2;
                C1C7U.LIZ("NoticeboardGuestController@b397.getImageInfoFromServer$3");
                Throwable th = (Throwable) obj2;
                if (th instanceof C477520Io2) {
                    str2 = ((C477520Io2) th).getxTtLogId();
                } else {
                    str2 = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRunningMaterialContent fail log_id=");
                sbLIZ.append(str2);
                C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("NoticeboardGuestController@b397.getImageInfoFromServer$3");
            }
        }).LJIL(new InterfaceC1487280oo2() { // from class: X.00Gm
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                GetRunningNoticeboardMaterialContentResponse.ResponseData responseData = (GetRunningNoticeboardMaterialContentResponse.ResponseData) ((BaseResponse) obj2).data;
                return new Pair(responseData.imageUrl, responseData.imageMetaUrl);
            }
        }).LJIIZILJ(new C517301zv(noticeboardGuestController, 1)).LJIL(new InterfaceC1487280oo2() { // from class: X.01G6
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Pair pair = (Pair) obj2;
                return new C01G7((String) pair.getFirst(), (NoticeboardGuestController.ImageMetaData) pair.getSecond());
            }
        });
        if (c19482011JyLJIL instanceof C01G8) {
            return ((C01G8) c19482011JyLJIL).LIZ();
        }
        return new C11IO(c19482011JyLJIL);
    }
}
