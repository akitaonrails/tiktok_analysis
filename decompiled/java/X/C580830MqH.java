package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.config.PhotoModeTemplateAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580830MqH extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            case 7:
                onLoad$7(this, asyncAVService, j);
                break;
            case 8:
                onLoad$8(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLoad$9(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public static final void onLoad$0(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, (RecordConfig) c580830MqH.l1, (MusicModel) c580830MqH.l2, true);
    }

    public static final void onLoad$1(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        String creationId;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        ShortVideoContext shortVideoContext = ((C569710MWb) c580830MqH.l2).getShortVideoContext();
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        builder.creationId(creationId);
        builder.recordFromTab(EnumC569740MWe.ALBUM.getTab());
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        Intent recordBasicIntent = iRecordServiceRecordService.getRecordBasicIntent(builder.build());
        if (((Bundle) c580830MqH.l0) != null) {
            Bundle bundle = new Bundle((Bundle) c580830MqH.l0);
            try {
                Bundle extras = recordBasicIntent.getExtras();
                if (extras != null) {
                    C786410Ut5.LJJIIJZLJL(bundle, extras);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((C569710MWb) c580830MqH.l2).X1(bundle);
            recordBasicIntent.replaceExtras(bundle);
        }
        iRecordServiceRecordService.startRecord((Context) c580830MqH.l1, recordBasicIntent);
        ((InterfaceC569720MWc) ((C569710MWb) c580830MqH.l2).getDiContainer().LJII(InterfaceC569720MWc.class, null)).su1("jump_to_video_shoot_page", -1L, false, false);
    }

    public static final void onLoad$2(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        ((Function1) c580830MqH.l0).invoke(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        asyncAVService.uiService().recordService().startRecord((C19EG) c580830MqH.l1, ((RecordConfig.Builder) c580830MqH.l2).build());
    }

    public static final void onLoad$3(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startPhotoModeTemplateAlbum(((C1394000mNa) c580830MqH.l0).LJIILJJIL(), (PhotoModeTemplateAnchorConfig) c580830MqH.l1);
        ((C2344009Gk) c580830MqH.l2).LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        InterfaceC1392640mLO interfaceC1392640mLO = ((C1394000mNa) c580830MqH.l0).LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (C123100dR.LIZ(interfaceC1392640mLO.LJI())) {
            C2344009Gk c2344009Gk = (C2344009Gk) c580830MqH.l2;
            InterfaceC1392640mLO interfaceC1392640mLO3 = ((C1394000mNa) c580830MqH.l0).LL;
            if (interfaceC1392640mLO3 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO3;
            }
            c2344009Gk.LJFF("enter_method", interfaceC1392640mLO2.LJI());
        }
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String creationId = ((PhotoModeTemplateAnchorConfig) c580830MqH.l1).getCreativeInfo().getCreationId();
        String strLJIJJLI = ((C1394000mNa) c580830MqH.l0).LJIJJLI();
        String aid = ((C1394000mNa) c580830MqH.l0).LJIIZILJ().getAid();
        if (aid == null) {
            aid = "";
        }
        iRecordMobService.LIZLLL(new C1449410nox(creationId, "photo_trend_template", strLJIJJLI, aid, null, null, null, null, 240), ((C2344009Gk) c580830MqH.l2).LIZ);
    }

    public static final void onLoad$4(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, (RecordConfig) c580830MqH.l1, (MusicModel) c580830MqH.l2, true);
    }

    public static final void onLoad$5(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, ((RecordConfig.Builder) c580830MqH.l1).build(), (MusicModel) c580830MqH.l2, true);
    }

    public static final void onLoad$6(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, ((RecordConfig.Builder) c580830MqH.l1).build(), (MusicModel) c580830MqH.l2, true);
        ((Activity) c580830MqH.l0).finish();
    }

    public static final void onLoad$7(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, ((RecordConfig.Builder) c580830MqH.l1).build(), (MusicModel) c580830MqH.l2, false);
    }

    public static final void onLoad$8(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((C19EG) c580830MqH.l0, (RecordConfig) c580830MqH.l1, (MusicModel) c580830MqH.l2, true);
    }

    public static final void onLoad$9(C580830MqH c580830MqH, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580830MqH.l0, (RecordConfig) c580830MqH.l1, (MusicModel) c580830MqH.l2, true);
    }

    public C580830MqH(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
