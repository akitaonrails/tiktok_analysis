package Y;

import X.C0LD1;
import X.C0MV0;
import X.C19EG;
import X.C19EH;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2486109oh;
import X.C529740Kq4;
import X.C529750Kq5;
import X.C529760Kq6;
import X.C529770Kq7;
import X.C570790Ma5;
import X.C570800Ma6;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.external.ui.MusVideoChooseFragmentWrapper;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResponse;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResultBean;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS217S0300000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS176S0300000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C529760Kq6 c529760Kq6 = (C529760Kq6) aCallableS176S0300000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aCallableS176S0300000_8.l1;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aCallableS176S0300000_8.l2;
        c529760Kq6.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.onBindHolder$1$doClick$2L");
        c529760Kq6.LLIZLLLIL.LLLI(c529750Kq5, tikTokMediaModel);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.onBindHolder$1$doClick$2L");
        return null;
    }

    public static final Object call$1(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aCallableS176S0300000_8.l0;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aCallableS176S0300000_8.l1;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aCallableS176S0300000_8.l2;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.onBindHolder$1L");
        if (VEUtils.getVEVideoFileInfo(tikTokMediaModel.LJFF()) != null) {
            tikTokMediaModel.duration = r0.duration;
            c529740Kq4.LLLLILI(c529750Kq5, tikTokMediaModel);
        }
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.onBindHolder$1L");
        return null;
    }

    public static final Object call$2(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C529770Kq7 c529770Kq7 = (C529770Kq7) aCallableS176S0300000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aCallableS176S0300000_8.l1;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aCallableS176S0300000_8.l2;
        c529770Kq7.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.onBindHolder$1$doClick$1L");
        c529770Kq7.LLIZLLLIL.LLLI(c529750Kq5, tikTokMediaModel);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.onBindHolder$1$doClick$1L");
        return null;
    }

    public static final Object call$3(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aCallableS176S0300000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aCallableS176S0300000_8.l1;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aCallableS176S0300000_8.l2;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.lambda$onBindHolder$5$1L");
        c529740Kq4.LLLI(c529750Kq5, tikTokMediaModel);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.lambda$onBindHolder$5$1L");
        return null;
    }

    public static final Object call$4(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C1C7U.LIZ("AVInfoServiceImpl@8a43.audioLegal$1");
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : (List) aCallableS176S0300000_8.l0) {
            if (C2486109oh.LIZLLL((Context) aCallableS176S0300000_8.l1, musicModel.getLocalPath()) && ((IAVInfoService.IFilterMedia) aCallableS176S0300000_8.l2).filter(Integer.valueOf(((List) aCallableS176S0300000_8.l0).indexOf(musicModel)))) {
                arrayList.add(musicModel);
            }
        }
        C1C7U.LIZIZ("AVInfoServiceImpl@8a43.audioLegal$1");
        return arrayList;
    }

    public static final Object call$5(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C1C7U.LIZ("DraftStreamMusicProcessor@cca2.checkMusicLegal$1");
        DraftStreamMusicProcessor draftStreamMusicProcessor = (DraftStreamMusicProcessor) aCallableS176S0300000_8.l0;
        String musicId = ((AVMusic) aCallableS176S0300000_8.l1).getMusicId();
        draftStreamMusicProcessor.getClass();
        PermissionCheckApi.PermissionCheckEntity permissionCheckEntity = new PermissionCheckApi.PermissionCheckEntity();
        permissionCheckEntity.setIdType(3);
        permissionCheckEntity.setId(musicId);
        permissionCheckEntity.setCheckType(3);
        C570790Ma5 c570790Ma5 = new C570790Ma5();
        boolean z = true;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(permissionCheckEntity);
        c570790Ma5.LIZ = arrayList;
        PermissionCheckResponse permissionCheckResponseLIZ = C570800Ma6.LIZ(c570790Ma5);
        if (permissionCheckResponseLIZ == null) {
            C201955140j.LIZ("draft_stream_music_process, permission check failed");
            DraftStreamMusicProcessor.LIZIZ(0, "response is null", musicId);
        } else {
            List<PermissionCheckResultBean> list = permissionCheckResponseLIZ.result;
            String str = "";
            if (list != null && !list.isEmpty()) {
                PermissionCheckResultBean permissionCheckResultBean = (PermissionCheckResultBean) ListProtector.get(list, 0);
                String str2 = permissionCheckResultBean.reason;
                draftStreamMusicProcessor.LLILZ = str2;
                if (permissionCheckResultBean.allowCurrent) {
                    if (str2 != null) {
                        str = str2;
                    }
                    DraftStreamMusicProcessor.LIZIZ(1, str, musicId);
                } else {
                    if (str2 != null) {
                        str = str2;
                    }
                    DraftStreamMusicProcessor.LIZIZ(2, str, musicId);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("draft_stream_music_process, permission check success, result: ");
                sbLIZ.append(draftStreamMusicProcessor.LLILZ);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                z = permissionCheckResultBean.allowCurrent;
            } else {
                DraftStreamMusicProcessor.LIZIZ(1, "", musicId);
            }
        }
        draftStreamMusicProcessor.LLILLL = z;
        DraftStreamMusicProcessor draftStreamMusicProcessor2 = (DraftStreamMusicProcessor) aCallableS176S0300000_8.l0;
        boolean z2 = draftStreamMusicProcessor2.LLILLL;
        if (!z2) {
            InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq = draftStreamMusicProcessor2.LLILLJJLI;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(Boolean.TRUE, Boolean.valueOf(z2), ((DraftStreamMusicProcessor) aCallableS176S0300000_8.l0).LLILZ);
            }
        } else {
            ((Function0) aCallableS176S0300000_8.l2).invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftStreamMusicProcessor@cca2.checkMusicLegal$1");
        return unit;
    }

    public static final Object call$6(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C19EH c19ehLJIIJ;
        C1C7U.LIZ("UIServiceImpl@b916.abilityUiService$1$toMusVideoChooseFragment$1$1");
        FragmentManager supportFragmentManager = ((C19EG) aCallableS176S0300000_8.l0).getSupportFragmentManager();
        if (supportFragmentManager != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(((Integer) aCallableS176S0300000_8.l1).intValue(), (MusVideoChooseFragmentWrapper) aCallableS176S0300000_8.l2);
            c19ehLJIIJ.LJIIJ();
        }
        C1C7U.LIZIZ("UIServiceImpl@b916.abilityUiService$1$toMusVideoChooseFragment$1$1");
        return null;
    }

    public static final Object call$7(ACallableS176S0300000_8 aCallableS176S0300000_8) throws InterruptedException {
        CountDownLatch countDownLatch;
        C1C7U.LIZ("CheckPointServiceImpl@1176.cancelRestoreWithCallback$1");
        C0MV0 c0mv0 = (C0MV0) aCallableS176S0300000_8.l0;
        c0mv0.getClass();
        if (C0LD1.LIZJ() && (countDownLatch = c0mv0.LJIIIZ.get()) != null) {
            boolean zAwait = countDownLatch.await(30L, TimeUnit.SECONDS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("awaitV3PushShowSaveIfNeeded: completed=");
            sbLIZ.append(zAwait);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((C0MV0) aCallableS176S0300000_8.l0).LJIIZILJ((Activity) aCallableS176S0300000_8.l1, (Function0) aCallableS176S0300000_8.l2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.cancelRestoreWithCallback$1");
        return unit;
    }

    public static final Object call$8(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.handleRestorePushDismiss$1");
        C0MV0 c0mv0 = (C0MV0) aCallableS176S0300000_8.l0;
        Activity activity = (Activity) aCallableS176S0300000_8.l1;
        C0MV0.LJJIIJZLJL(c0mv0, activity, 4, false, 0, new AwS217S0300000_8(c0mv0, (C0MV0) activity, (Activity) aCallableS176S0300000_8.l2, (Function0<Unit>) 57), 28);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.handleRestorePushDismiss$1");
        return unit;
    }

    public static final Object call$9(ACallableS176S0300000_8 aCallableS176S0300000_8) {
        boolean z;
        C1C7U.LIZ("CheckPointServiceImpl@1176.handleRestorePushDismiss$2");
        C0MV0 c0mv0 = (C0MV0) aCallableS176S0300000_8.l0;
        Activity activity = (Activity) aCallableS176S0300000_8.l1;
        if (C0LD1.LIZ() != 1 && C0LD1.LIZ() != 2) {
            z = false;
        } else {
            z = true;
        }
        C0MV0.LJJIIJZLJL(c0mv0, activity, 4, z, 2131846552, new AwS217S0300000_8((C0MV0) aCallableS176S0300000_8.l0, (C0MV0) aCallableS176S0300000_8.l1, (Activity) aCallableS176S0300000_8.l2, (Function0<Unit>) 59), 16);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.handleRestorePushDismiss$2");
        return unit;
    }

    public ACallableS176S0300000_8(C529740Kq4 c529740Kq4, C529750Kq5 c529750Kq5, TikTokMediaModel tikTokMediaModel, int i) {
        this.$t = i;
        if (1 - i != 0) {
            this.l0 = c529740Kq4;
            this.l1 = c529750Kq5;
            this.l2 = tikTokMediaModel;
        } else {
            this.l0 = c529740Kq4;
            this.l1 = tikTokMediaModel;
            this.l2 = c529750Kq5;
        }
    }

    public ACallableS176S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
