package X;

import Y.AfS151S0200000_15;
import Y.AfS2S1000100_15;
import Y.AfS34S1000000_15;
import Y.AkS105S1100000_15;
import Y.AkS16S0000100_15;
import Y.AkS3S2100100_15;
import Y.AkS42S1000000_15;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardTemplateParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardTemplateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenParams;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateDeleteParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.NoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play.SimpleUser;

/* JADX INFO: renamed from: X.0auf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953230auf {
    public static boolean LJFF;
    public static final C953230auf LIZ = new C953230auf();
    public static List<NoticeboardTemplate> LIZIZ = new ArrayList();
    public static List<NoticeboardTemplate> LIZJ = new ArrayList();
    public static long LIZLLL = 100;
    public static final HashMap<Long, String> LJ = new HashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC952800aty> LJI = new ConcurrentHashMap<>();

    public static Long LJFF() {
        Long l;
        C953770avX c953770avXLJIIIIZZ = C953760avW.LIZIZ.LIZ().LJIIIIZZ();
        if (c953770avXLJIIIIZZ == null || (l = c953770avXLJIIIIZZ.LJIIL) == null) {
            return null;
        }
        if (Intrinsics.LJFF(c953770avXLJIIIIZZ.LJII, LJI(l.longValue()))) {
            return l;
        }
        return null;
    }

    public static boolean LJIIJJI() {
        return LJFF && MultiguestNoticeboardV2Setting.INSTANCE.templateEnable();
    }

    public static void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeAllCallback, callbackMap: ");
        sbLIZ.append(LJI);
        C20441214yg.LIZIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        C176600m4.LIZJ(AFwS203S0000000_15.get$arr$(115));
    }

    public static C19482011Jy LJ() {
        C480460Ism.LIZ().getClass();
        return C191300oR.LIZJ(C191300oR.LIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).idGen(new IdGenParams()).LJJIJIIJI(C11S5.LIZ()), "TemplateManager_noticeboard", "idGen")).LJIL(new InterfaceC1487280oo2() { // from class: X.00Gn
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Long.valueOf(((IdGenResponse.ResponseData) ((BaseResponse) obj).data).id);
            }
        });
    }

    public static int LJIIIZ() {
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        UserService userService = UserService.getInstance();
        return (userService == null || (interfaceC500940JkiUser = userService.user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || currentUser.getSecret() != 1) ? 1 : 2;
    }

    public static String LJI(long j) {
        return LJ.get(Long.valueOf(j));
    }

    public static C19482011Jy LJIIIIZZ(long j) {
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        GetNoticeboardTemplateParams getNoticeboardTemplateParams = new GetNoticeboardTemplateParams();
        getNoticeboardTemplateParams.noticeboardTemplateId = j;
        return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.getNoticeboardTemplate(getNoticeboardTemplateParams), "TemplateManager_noticeboard", "getNoticeboardTemplate")).LJJIJIIJI(C11S5.LIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.00Go
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                NoticeboardTemplate noticeboardTemplate = ((GetNoticeboardTemplateResponse.ResponseData) ((BaseResponse) obj).data).template;
                if (noticeboardTemplate != null) {
                    return noticeboardTemplate;
                }
                throw new C294201Ca() { // from class: X.00m6
                    public static final int $stable = 8;
                };
            }
        });
    }

    public static boolean LJIIJ(String str) {
        for (NoticeboardTemplate noticeboardTemplate : LIZIZ) {
            if (Intrinsics.LJFF(noticeboardTemplate.mediaNodeId, str)) {
                if (noticeboardTemplate != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean LJIIL(long j) {
        NoticeboardTemplate next;
        SimpleUser simpleUser;
        Iterator<NoticeboardTemplate> it2 = LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.noticeboardTemplateId == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NoticeboardTemplate noticeboardTemplate = next;
        if (noticeboardTemplate != null && (simpleUser = noticeboardTemplate.authorInfo) != null && simpleUser.userId == UserService.getInstance().user().getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(long j) {
        for (NoticeboardTemplate noticeboardTemplate : LIZIZ) {
            if (noticeboardTemplate.noticeboardTemplateId == j) {
                if (noticeboardTemplate != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(long j) {
        for (NoticeboardTemplate noticeboardTemplate : LIZIZ) {
            if (noticeboardTemplate.noticeboardTemplateId == j) {
                if (noticeboardTemplate != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void LJIILL(InterfaceC952800aty interfaceC952800aty) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeCallback, callback: ");
        sbLIZ.append(interfaceC952800aty);
        C20441214yg.LIZIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        C176600m4.LIZJ(new AwS559S0100000_15(interfaceC952800aty, 355));
    }

    public static void LIZ(String str, InterfaceC953300aum interfaceC953300aum) {
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", "start cancelUseTemplate");
        String string = UUID.randomUUID().toString();
        if (interfaceC953300aum != null) {
            LJI.put(string, interfaceC953300aum);
        }
        C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
        Long lValueOf = null;
        InterfaceC953300aum interfaceC953300aum2 = null;
        if (c915050Zv5.LIZ().LJIIIIZZ() == null && C934890aR5.LIZ()) {
            InterfaceC952800aty interfaceC952800atyRemove = LJI.remove(string);
            if (interfaceC952800atyRemove instanceof InterfaceC953300aum) {
                interfaceC953300aum2 = (InterfaceC953300aum) interfaceC952800atyRemove;
            }
            C176600m4.LIZJ(new AwS559S0100000_15(interfaceC953300aum2, 354));
            return;
        }
        C953770avX c953770avXLJIIIIZZ = c915050Zv5.LIZ().LJIIIIZZ();
        if (c953770avXLJIIIIZZ != null) {
            lValueOf = Long.valueOf(c953770avXLJIIIIZZ.LIZJ);
        }
        new C11QI(C191300oR.LIZIZ(LJIILLIIL(AbstractC19484711Kz.LJIJJLI(0).LJJ(C11S5.LIZ()).LJIL(new AkS105S1100000_15(lValueOf, str, 0)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS34S1000000_15(string, 1)), string), "TemplateManager_noticeboard", "cancelUseTemplate")).LJIILL().LJIIZILJ();
    }

    public static void LIZJ(long j, InterfaceC952920auA interfaceC952920auA) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteTemplate start templateId=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        String string = UUID.randomUUID().toString();
        LJI.put(string, interfaceC952920auA);
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardTemplateDeleteParams noticeboardTemplateDeleteParams = new NoticeboardTemplateDeleteParams();
        noticeboardTemplateDeleteParams.noticeboardTemplateId = j;
        new C11QI(LJIILLIIL(C191300oR.LIZIZ(C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.deleteTemplate(noticeboardTemplateDeleteParams), "TemplateManager_noticeboard", "deleteTemplate")).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJIL(new AkS16S0000100_15(j, 1)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS2S1000100_15(string, j, 1)), "TemplateManager_noticeboard", "deleteTemplate"), string)).LJIILL().LJIIZILJ();
    }

    public static void LIZLLL(final int i, InterfaceC952880au6 interfaceC952880au6) {
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchTemplateList start fetchType=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        final String string = UUID.randomUUID().toString();
        if (interfaceC952880au6 != null) {
            LJI.put(string, interfaceC952880au6);
        }
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardTemplateFetchListParams noticeboardTemplateFetchListParams = new NoticeboardTemplateFetchListParams();
        noticeboardTemplateFetchListParams.fetchType = i;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        noticeboardTemplateFetchListParams.roomId = id;
        new C11QI(LJIILLIIL(C191300oR.LIZIZ(C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.fetchTemplateList(noticeboardTemplateFetchListParams), "TemplateManager_noticeboard", "fetchTemplateList")).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0au5
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC952880au6 interfaceC952880au62;
                C1C7U.LIZ("TemplateManager@b4e9.fetchTemplateList$3");
                BaseResponse baseResponse = (BaseResponse) obj;
                C20441214yg.LJIIIZ("TemplateManager_noticeboard", "fetchTemplateList success");
                NoticeboardTemplateFetchListResponse.ResponseData responseData = (NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data;
                C953230auf.LJFF = responseData.isOfficialUser;
                for (NoticeboardTemplate noticeboardTemplate : responseData.myTemplates) {
                    C953230auf.LJ.put(Long.valueOf(noticeboardTemplate.noticeboardTemplateId), noticeboardTemplate.mediaNodeId);
                }
                for (NoticeboardTemplate noticeboardTemplate2 : ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).recommendedTemplates) {
                    C953230auf.LJ.put(Long.valueOf(noticeboardTemplate2.noticeboardTemplateId), noticeboardTemplate2.mediaNodeId);
                }
                int i2 = i;
                if (i2 != 2) {
                    if (i2 != 3) {
                        C953230auf c953230auf = C953230auf.LIZ;
                        List<NoticeboardTemplate> list = ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).myTemplates;
                        c953230auf.getClass();
                        C953230auf.LIZIZ = list;
                        C953230auf.LIZJ = ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).recommendedTemplates;
                    } else {
                        C953230auf c953230auf2 = C953230auf.LIZ;
                        List<NoticeboardTemplate> list2 = ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).recommendedTemplates;
                        c953230auf2.getClass();
                        C953230auf.LIZJ = list2;
                    }
                } else {
                    C953230auf c953230auf3 = C953230auf.LIZ;
                    List<NoticeboardTemplate> list3 = ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).myTemplates;
                    c953230auf3.getClass();
                    C953230auf.LIZIZ = list3;
                }
                C953230auf c953230auf4 = C953230auf.LIZ;
                long j = ((NoticeboardTemplateFetchListResponse.ResponseData) baseResponse.data).createNumLimit;
                c953230auf4.getClass();
                C953230auf.LIZLLL = j;
                InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(string);
                if ((interfaceC952800aty instanceof InterfaceC952880au6) && (interfaceC952880au62 = (InterfaceC952880au6) interfaceC952800aty) != null) {
                    interfaceC952880au62.onSuccess();
                }
                C1C7U.LIZIZ("TemplateManager@b4e9.fetchTemplateList$3");
            }
        }).LJIIL(new AfS34S1000000_15(string, 2)), "TemplateManager_noticeboard", "fetchTemplateList"), string)).LJIILL().LJIIZILJ();
    }

    public static final LinearLayout LJII(int i, Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ezs, context));
        gradientDrawable.setSize(C439101nJ.LIZ(4), C439101nJ.LIZ(4));
        view.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C439101nJ.LIZ(5), C439101nJ.LIZ(5));
        layoutParams.setMarginStart(C439101nJ.LIZ(6));
        layoutParams.setMarginEnd(C439101nJ.LIZ(6));
        layoutParams.topMargin = C439101nJ.LIZ(7);
        linearLayout.addView(view, layoutParams);
        C16F5 c16f5 = new C16F5(context, null);
        c16f5.setText(i);
        c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezs, context));
        linearLayout.addView(c16f5, new LinearLayout.LayoutParams(-2, -2));
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public static C19481311Jr LJIILLIIL(AbstractC19484711Kz abstractC19484711Kz, final String str) {
        return abstractC19484711Kz.LJJ(C1701940uOG.LIZIZ()).LJIIJ(new InterfaceC781210Ukh() { // from class: X.0auk
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C953230auf.LJI.remove(str);
            }
        });
    }

    public static void LJIJ(Context context, Function0 function0, Function0 function02) {
        C176600m4.LIZJ(new AwS259S0300000_15(context, (Context) function0, (Function0<Unit>) function02, (Function0<Unit>) 17));
    }

    public static void LJIIZILJ(final long j, final EnumC952780atw enumC952780atw, final String str, InterfaceC952790atx interfaceC952790atx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveTemplate start templateId=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        final String string = UUID.randomUUID().toString();
        if (interfaceC952790atx != null) {
            LJI.put(string, interfaceC952790atx);
        }
        new C11QI(C191300oR.LIZIZ(LJIILLIIL(AbstractC19484711Kz.LJIJJLI(0).LJJ(C1701940uOG.LIZIZ()).LJIIZILJ(new AkS16S0000100_15(j, 0)).LJIIZILJ(new AkS16S0000100_15(j, 2)).LJJ(C11S5.LIZ()).LJIL(new AkS16S0000100_15(j, 3)).LJJ(C1701940uOG.LIZIZ()).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0ZzB
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return AbstractC19484711Kz.LJII(new C987170bnP((Pair) obj, 2));
            }
        }).LJIILL(new C09JN() { // from class: X.0atu
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC952790atx interfaceC952790atx2;
                NoticeboardTemplate noticeboardTemplate;
                C1C7U.LIZ("TemplateManager@b4e9.saveTemplate$5");
                Pair pair = (Pair) obj;
                Object first = pair.getFirst();
                NoticeboardTemplateSaveResponse.ResponseData responseData = (NoticeboardTemplateSaveResponse.ResponseData) ((BaseResponse) pair.getSecond()).data;
                if (responseData != null && (noticeboardTemplate = responseData.template) != null) {
                    C953230auf.LJ.put(Long.valueOf(noticeboardTemplate.noticeboardTemplateId), (String) first);
                }
                C953230auf.LIZ.getClass();
                C19719612Di.LJJIIJ(C953230auf.LIZJ, new C5178020a(j, 2), true);
                InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(string);
                if ((interfaceC952800aty instanceof InterfaceC952790atx) && (interfaceC952790atx2 = (InterfaceC952790atx) interfaceC952800aty) != null) {
                    interfaceC952790atx2.LJ();
                }
                if (C952770atv.LIZ[enumC952780atw.ordinal()] == 1) {
                    C766270U4b.LIZLLL(2131854965);
                    C946850akN.LJIIIZ(EnumC971520bOA.SAVE, Long.valueOf(j), str, EnumC937290aUx.NOTICEBOARD_CLICK, "in_spots");
                }
                C1C7U.LIZIZ("TemplateManager@b4e9.saveTemplate$5");
            }
        }), string), "TemplateManager_noticeboard", "saveTemplate")).LJIILL().LJIIZILJ();
    }

    public static void LJIJI(String str, final long j, final int i, InterfaceC953310aun interfaceC953310aun) {
        InterfaceC953310aun interfaceC953310aun2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTemplatePrivateStatus start mediaNodeId=");
        sbLIZ.append(str);
        sbLIZ.append(" templateId=");
        sbLIZ.append(j);
        sbLIZ.append(" materialInfo=");
        sbLIZ.append((Object) null);
        sbLIZ.append(" privateStatus=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        final String string = UUID.randomUUID().toString();
        LJI.put(string, interfaceC953310aun);
        Iterator<NoticeboardTemplate> it2 = LIZIZ.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (it2.next().noticeboardTemplateId == j) {
                if (i2 != -1) {
                    NoticeboardTemplate noticeboardTemplate = new NoticeboardTemplate();
                    noticeboardTemplate.noticeboardTemplateId = ((NoticeboardTemplate) ListProtector.get(LIZIZ, i2)).noticeboardTemplateId;
                    noticeboardTemplate.mediaNodeId = ((NoticeboardTemplate) ListProtector.get(LIZIZ, i2)).mediaNodeId;
                    noticeboardTemplate.convertNoticeboardMaterialInfo = ((NoticeboardTemplate) ListProtector.get(LIZIZ, i2)).convertNoticeboardMaterialInfo;
                    noticeboardTemplate.privateStatus = i;
                    noticeboardTemplate.reviewStatus = ((NoticeboardTemplate) ListProtector.get(LIZIZ, i2)).reviewStatus;
                    noticeboardTemplate.authorInfo = ((NoticeboardTemplate) ListProtector.get(LIZIZ, i2)).authorInfo;
                    ListProtector.set(LIZIZ, i2, noticeboardTemplate);
                }
            } else {
                i2++;
            }
        }
        InterfaceC952800aty interfaceC952800aty = LJI.get(string);
        if ((interfaceC952800aty instanceof InterfaceC953310aun) && (interfaceC953310aun2 = (InterfaceC953310aun) interfaceC952800aty) != null) {
            interfaceC953310aun2.LIZIZ();
        }
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardTemplateUpdateParams noticeboardTemplateUpdateParams = new NoticeboardTemplateUpdateParams();
        noticeboardTemplateUpdateParams.mediaNodeId = str;
        noticeboardTemplateUpdateParams.noticeboardMaterialInfo = null;
        noticeboardTemplateUpdateParams.privateStatus = i;
        noticeboardTemplateUpdateParams.noticeboardTemplateId = j;
        noticeboardTemplateUpdateParams.roomId = C950220apo.LIZLLL();
        noticeboardTemplateUpdateParams.updateType = 1;
        new C11QI(LJIILLIIL(C191300oR.LIZIZ(C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.updateTemplate(noticeboardTemplateUpdateParams), "TemplateManager_noticeboard", "updateTemplatePrivateStatus")).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0aug
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC953310aun interfaceC953310aun3;
                C1C7U.LIZ("TemplateManager@b4e9.updateTemplatePrivateStatus$3");
                C20441214yg.LJIIIZ("TemplateManager_noticeboard", "updateTemplate successfully");
                C953230auf.LIZ.getClass();
                List<NoticeboardTemplate> list = C953230auf.LIZIZ;
                long j2 = j;
                Iterator<NoticeboardTemplate> it3 = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (it3.next().noticeboardTemplateId == j2) {
                        if (i3 != -1) {
                            NoticeboardTemplate noticeboardTemplate2 = new NoticeboardTemplate();
                            int i4 = i;
                            C953230auf.LIZ.getClass();
                            noticeboardTemplate2.noticeboardTemplateId = ((NoticeboardTemplate) ListProtector.get(C953230auf.LIZIZ, i3)).noticeboardTemplateId;
                            noticeboardTemplate2.mediaNodeId = ((NoticeboardTemplate) ListProtector.get(C953230auf.LIZIZ, i3)).mediaNodeId;
                            noticeboardTemplate2.convertNoticeboardMaterialInfo = ((NoticeboardTemplate) ListProtector.get(C953230auf.LIZIZ, i3)).convertNoticeboardMaterialInfo;
                            noticeboardTemplate2.privateStatus = i4;
                            noticeboardTemplate2.reviewStatus = ((NoticeboardTemplate) ListProtector.get(C953230auf.LIZIZ, i3)).reviewStatus;
                            noticeboardTemplate2.authorInfo = ((NoticeboardTemplate) ListProtector.get(C953230auf.LIZIZ, i3)).authorInfo;
                            ListProtector.set(C953230auf.LIZIZ, i3, noticeboardTemplate2);
                        }
                    } else {
                        i3++;
                    }
                }
                InterfaceC952800aty interfaceC952800aty2 = C953230auf.LJI.get(string);
                if ((interfaceC952800aty2 instanceof InterfaceC953310aun) && (interfaceC953310aun3 = (InterfaceC953310aun) interfaceC952800aty2) != null) {
                    interfaceC953310aun3.LIZIZ();
                }
                C1C7U.LIZIZ("TemplateManager@b4e9.updateTemplatePrivateStatus$3");
            }
        }).LJIIL(new C09JN() { // from class: X.0T6n
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TemplateManager@b4e9.updateTemplatePrivateStatus$4");
                C20441214yg.LJ("TemplateManager_noticeboard", "updateTemplate failed");
                C1C7U.LIZIZ("TemplateManager@b4e9.updateTemplatePrivateStatus$4");
            }
        }), "TemplateManager_noticeboard", "updateTemplatePrivateStatus"), string)).LJIILL().LJIIZILJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(final long r12, java.lang.String r14, final java.lang.String r15, final webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo r16, X.C953100auS r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953230auf.LJIL(long, java.lang.String, java.lang.String, webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo, X.0auS):void");
    }

    public static void LJIJJ(final String str, Long l, final String str2, final C917840Zza c917840Zza, EnumC952840au2 enumC952840au2, EnumC952890au7 enumC952890au7) {
        InterfaceC19473011Gm interfaceC19473011GmLJIJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadToCloudAndCreateTemplate start mediaNodeId=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        C19482011Jy c19482011JyLIZJ = C953370aut.LIZJ(c917840Zza);
        if (l == null) {
            interfaceC19473011GmLJIJJLI = LJ();
        } else {
            interfaceC19473011GmLJIJJLI = AbstractC19484711Kz.LJIJJLI(l);
        }
        new C11QI(C191300oR.LIZIZ(AbstractC19484711Kz.LJJJ(c19482011JyLIZJ, interfaceC19473011GmLJIJJLI, new InterfaceC500500Jk0() { // from class: X.0aTt
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new Pair(obj, obj2);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0aui
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                C953270auj c953270auj = (C953270auj) pair.getFirst();
                long jLongValue = ((Number) pair.getSecond()).longValue();
                Iterator<CloudDraftItemManager.Label> it2 = c917840Zza.LIZLLL.labels.iterator();
                long length = 0;
                while (it2.hasNext()) {
                    length += (long) it2.next().text.length();
                }
                C480460Ism.LIZ().getClass();
                INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
                NoticeboardTemplateCreateParams noticeboardTemplateCreateParams = new NoticeboardTemplateCreateParams();
                String str3 = str;
                String strLJIJI = str2;
                C917840Zza c917840Zza2 = c917840Zza;
                noticeboardTemplateCreateParams.mediaNodeId = str3;
                NoticeboardMaterialInfo noticeboardMaterialInfo = new NoticeboardMaterialInfo();
                noticeboardMaterialInfo.backgroundImageUri = c953270auj.LIZ;
                noticeboardMaterialInfo.coverImageUri = c953270auj.LIZIZ;
                noticeboardMaterialInfo.configJsonUri = c953270auj.LIZJ;
                if (strLJIJI.length() == 0) {
                    strLJIJI = C497740JfY.LJIJI(2131853998);
                }
                noticeboardMaterialInfo.title = strLJIJI;
                noticeboardMaterialInfo.textCharCount = length;
                noticeboardMaterialInfo.textBoxCount = c917840Zza2.LIZLLL.labels.size();
                noticeboardMaterialInfo.thumbCoverImageUri = c953270auj.LIZLLL;
                noticeboardTemplateCreateParams.noticeboardMaterialInfo = noticeboardMaterialInfo;
                C953230auf.LIZ.getClass();
                noticeboardTemplateCreateParams.privateStatus = C953230auf.LJIIIZ();
                noticeboardTemplateCreateParams.noticeboardTemplateId = jLongValue;
                return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.createTemplate(noticeboardTemplateCreateParams), "TemplateManager_noticeboard", "createTemplate"));
            }
        }).LJIL(new AkS42S1000000_15(str, 0)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS151S0200000_15(enumC952840au2, enumC952890au7, 27)), "TemplateManager_noticeboard", "uploadToCloudAndCreateTemplate")).LJIILL().LJIIZILJ();
    }

    public static void LJIJJLI(String str, String str2, C917840Zza c917840Zza, final long j, final EnumC952830au1 enumC952830au1, final String str3, final EnumC952890au7 enumC952890au7, C953830avd c953830avd) {
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", "start uploadToCloudAndUpdateTemplate");
        final String string = UUID.randomUUID().toString();
        if (c953830avd != null) {
            LJI.put(string, c953830avd);
        }
        new C11QI(LJIILLIIL(C953370aut.LIZJ(c917840Zza).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJIIZILJ(new AkS3S2100100_15(j, str, str2, c917840Zza, 1)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0atz
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC952860au4 interfaceC952860au4;
                C1C7U.LIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$3");
                C20441214yg.LJIIIZ("TemplateManager_noticeboard", "create template success");
                NoticeboardTemplate noticeboardTemplate = ((NoticeboardTemplateUpdateResponse.ResponseData) ((BaseResponse) obj).data).template;
                if (noticeboardTemplate != null) {
                    EnumC952830au1 enumC952830au12 = enumC952830au1;
                    String str4 = str3;
                    EnumC952890au7 enumC952890au72 = enumC952890au7;
                    String str5 = string;
                    long j2 = j;
                    C953230auf.LJ.put(Long.valueOf(noticeboardTemplate.noticeboardTemplateId), noticeboardTemplate.mediaNodeId);
                    C953230auf.LIZ.getClass();
                    Iterator<NoticeboardTemplate> it2 = C953230auf.LIZIZ.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().noticeboardTemplateId == j2) {
                            if (i != -1) {
                                C953230auf.LIZ.getClass();
                                ListProtector.set(C953230auf.LIZIZ, i, noticeboardTemplate);
                            }
                        } else {
                            i++;
                        }
                    }
                    int i2 = C952820au0.LIZ[enumC952830au12.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C766270U4b.LIZLLL(2131854962);
                            EnumC971520bOA enumC971520bOA = EnumC971520bOA.SAVE;
                            Long lValueOf = Long.valueOf(noticeboardTemplate.noticeboardTemplateId);
                            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                            if (enumC952890au72 == null) {
                                enumC952890au72 = EnumC952890au7.PREVIEW_SETTING;
                            }
                            multiCanvasUtils.getClass();
                            C946850akN.LJIIIZ(enumC971520bOA, lValueOf, str4, MultiCanvasUtils.LJIIJJI(enumC952890au72), "in_spots");
                        }
                    } else {
                        C766270U4b.LIZLLL(2131854965);
                        C946850akN.LJIIIZ(EnumC971520bOA.SAVE, Long.valueOf(noticeboardTemplate.noticeboardTemplateId), str4, EnumC937290aUx.NOTICEBOARD_CLICK, "in_spots");
                    }
                    InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(str5);
                    if ((interfaceC952800aty instanceof InterfaceC952860au4) && (interfaceC952860au4 = (InterfaceC952860au4) interfaceC952800aty) != null) {
                        interfaceC952860au4.LIZLLL(noticeboardTemplate);
                    }
                }
                C1C7U.LIZIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$3");
            }
        }).LJIIL(new AfS34S1000000_15(string, 3)), string)).LJIILL().LJIIZILJ();
    }
}
