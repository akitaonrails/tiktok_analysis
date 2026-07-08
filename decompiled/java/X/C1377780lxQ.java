package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.common.model.AwemeStatusBean;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import com.ss.android.ugc.aweme.services.external.ability.VideoStickerEntryMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.GifShareAction$execute$videoStickerPanelShowed$1$1$1", f = "GifShareAction.kt", l = {}, m = "invokeSuspend")
public final class C1377780lxQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDetailList LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1377730lxL LLILLL;
    public final /* synthetic */ DialogC1389620mGW LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C238400w2 LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377780lxQ(AwemeDetailList awemeDetailList, Activity activity, C1377730lxL c1377730lxL, DialogC1389620mGW dialogC1389620mGW, long j, C238400w2 c238400w2, Context context, InterfaceC1364105Vn<? super C1377780lxQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDetailList;
        this.LLILLJJLI = activity;
        this.LLILLL = c1377730lxL;
        this.LLILZ = dialogC1389620mGW;
        this.LLILZIL = j;
        this.LLILZLL = c238400w2;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1377780lxQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        String string;
        List<AwemeStatusBean> list;
        AwemeStatusBean awemeStatusBean;
        Integer status;
        String statusText;
        InteractionPermission allowCreateSticker;
        String str;
        InteractionPermission allowCreateSticker2;
        List<? extends Aweme> list2;
        C1C7U.LIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDetailList awemeDetailList = this.LL;
        String str2 = null;
        if (awemeDetailList != null && (list2 = awemeDetailList.awemeList) != null) {
            aweme = (Aweme) C13LP.LJJJLZIJ(0, list2);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            Activity activity = this.LLILLJJLI;
            final C1377730lxL c1377730lxL = this.LLILLL;
            final DialogC1389620mGW dialogC1389620mGW = this.LLILZ;
            final long j = this.LLILZIL;
            final C238400w2 c238400w2 = this.LLILZLL;
            AwemeDetailList awemeDetailList2 = this.LL;
            Context context = this.LLIZ;
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null && (allowCreateSticker2 = interactPermission.getAllowCreateSticker()) != null && allowCreateSticker2.status == 0) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final Aweme aweme2 = aweme;
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().video2StickerService().video2StickerEdit(activity, aweme, VideoStickerEntryMethod.FEED, new IVideo2StickerService.Callback() { // from class: X.0lxP
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService.Callback
                    public final void onSuccess() {
                        C454640HsE c454640HsE = IMStickerApi.LIZ;
                        c454640HsE.LIZIZ().getImStickerStoreService().LJIILLIIL();
                        C0FNV.LIZ(dialogC1389620mGW);
                        c454640HsE.LIZIZ().getImStickerAnalytics().LJJIL(c1377730lxL.LLILLJJLI, "share as gif", aweme2.getAid(), AwemeExtKt.getAuthorUid(aweme2), C0I0B.LJFF.LIZIZ());
                        c1377730lxL.LIZIZ("", Long.valueOf(SystemClock.elapsedRealtime() - j), Long.valueOf(c238400w2.element), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), Integer.valueOf(EnumC1377810lxT.SUCCESS.getStatus()), "");
                    }

                    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService.Callback
                    public final void onFailed(Exception exc, String str3, int i) {
                        C0FNV.LIZ(dialogC1389620mGW);
                        C1377730lxL c1377730lxL2 = c1377730lxL;
                        Integer numValueOf = Integer.valueOf(EnumC1377810lxT.GET_LOCAL_VIDEO_URL_FAIL.getStatus());
                        c1377730lxL2.LIZIZ(String.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime() - j), Long.valueOf(c238400w2.element), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), numValueOf, str3);
                    }
                }, c1377730lxL.LLILLJJLI, "share as gif");
            } else {
                C0FNV.LIZ(dialogC1389620mGW);
                InteractPermission interactPermission2 = aweme.getInteractPermission();
                if (interactPermission2 != null && (allowCreateSticker = interactPermission2.getAllowCreateSticker()) != null && (str = allowCreateSticker.toast) != null && C123100dR.LIZ(str)) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZJ(str);
                    c1233040iBy.LIZLLL();
                }
                c1377730lxL.LIZIZ(String.valueOf(awemeDetailList2.error_code), C2286608xc.LJFF(SystemClock.elapsedRealtime() - j), C2286608xc.LJFF(c238400w2.element), C2286608xc.LJFF(0L), C2286608xc.LJ(EnumC1377810lxT.CHECK_VIDEO_PERMISSION_FAIL.getStatus()), awemeDetailList2.status_msg);
            }
        } else {
            AwemeDetailList awemeDetailList3 = this.LL;
            C1377730lxL c1377730lxL2 = this.LLILLL;
            long j2 = this.LLILZIL;
            C238400w2 c238400w22 = this.LLILZLL;
            DialogC1389620mGW dialogC1389620mGW2 = this.LLILZ;
            Activity activity2 = this.LLILLJJLI;
            if (awemeDetailList3 != null && (list = awemeDetailList3.awemeStatus) != null && (awemeStatusBean = (AwemeStatusBean) ListProtector.get(list, 0)) != null && (((status = awemeStatusBean.getStatus()) == null || status.intValue() != 0) && (statusText = awemeStatusBean.getStatusText()) != null && C123100dR.LIZ(statusText))) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                c1389890mGx.LJIIJ(statusText);
                c1389890mGx.LJIIJJI();
            }
            Integer numLJ = C2286608xc.LJ(EnumC1377810lxT.VIDEO_REQUEST_FAIL.getStatus());
            Long lLJFF = C2286608xc.LJFF(SystemClock.elapsedRealtime() - j2);
            Long lLJFF2 = C2286608xc.LJFF(c238400w22.element);
            Long lLJFF3 = C2286608xc.LJFF(0L);
            if (awemeDetailList3 != null) {
                string = C2286608xc.LJ(awemeDetailList3.error_code).toString();
                str2 = awemeDetailList3.status_msg;
            } else {
                string = null;
            }
            c1377730lxL2.LIZIZ(string, lLJFF, lLJFF2, lLJFF3, numLJ, str2);
            C0FNV.LIZ(dialogC1389620mGW2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GifShareAction@ac5f.execute$videoStickerPanelShowed$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
