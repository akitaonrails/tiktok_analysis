package Y;

import X.C08LX;
import X.C08LY;
import X.C0BRY;
import X.C0WZX;
import X.C1397660mTU;
import X.C13LP;
import X.C1403010mc7;
import X.C1440005kM;
import X.C15O7;
import X.C1939607ik;
import X.C19EG;
import X.C201955140j;
import X.C207218166u;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2491509pZ;
import X.C523330Kfj;
import X.C527240Km2;
import X.C529030Kov;
import X.C530350Kr3;
import X.C533790Kwb;
import X.C535670Kzd;
import X.C556880Lsk;
import X.C559780LxQ;
import X.C576270Miv;
import X.InterfaceC493540JXc;
import X.InterfaceC523740KgO;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdkapi.pcs.model.PcsVideoModel;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS351S0100000_8 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public AObjectS351S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        ((p1) aObjectS351S0100000_8.l0).LJFF.xP1(true, false, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0KeP] */
    public static final Object invoke$1(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) throws Throwable {
        C19EG c19eg;
        LinkedHashMap linkedHashMap;
        Map<String, String> map;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        CreativeModel creativeModel2;
        CreativeInitialModel creativeInitialModel2;
        DMCameraModel dMCameraModel2;
        Map<String, String> map2;
        ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
        if (((MvChoosePhotoScene) aObjectS351S0100000_8.l0).isExteriorEcommerceCommentMode()) {
            ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aObjectS351S0100000_8.l0).chooseMediaViewModel;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.yR2(new AwS587S0100000_8(new MediaListState(arrayList, System.currentTimeMillis(), null), 175));
            }
        } else {
            int i = ((MvChoosePhotoScene) aObjectS351S0100000_8.l0).subEmoteShoType;
            FragmentManager supportFragmentManager = null;
            if (i != 1 && i != 2) {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("choose_photo", arrayList);
                MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aObjectS351S0100000_8.l0;
                Activity activity = mvChoosePhotoScene.mActivity;
                if (activity != null) {
                    C2204961BRm.LJIIL(mvChoosePhotoScene.resultCode, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbTleDEGc=", null));
                }
                MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) aObjectS351S0100000_8.l0;
                String str = mvChoosePhotoScene2.dmSessionID;
                if (str != null) {
                    ShortVideoContext shortVideoContext = mvChoosePhotoScene2.shortVideoContext;
                    if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (creativeInitialModel2 = creativeModel2.initialModel) != null && (dMCameraModel2 = creativeInitialModel2.dmCameraModel) != null && (map2 = dMCameraModel2.openCameraOrAlbumMobMap) != null) {
                        linkedHashMap = new LinkedHashMap(map2);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    ShortVideoContext shortVideoContext2 = mvChoosePhotoScene2.shortVideoContext;
                    if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null) {
                        map = dMCameraModel.openCameraOrAlbumMobMapV2;
                    } else {
                        map = null;
                    }
                    C1440005kM.LIZ(new IMMediaPublishEvent.DMAlbumMediaPublishEvent(str, arrayList, linkedHashMap, map, mvChoosePhotoScene2.dmQuoteMode, mvChoosePhotoScene2.dmBaseHeaderComponent, mvChoosePhotoScene2.dmFeatureAttachmentData, null, null));
                }
                MvChoosePhotoScene.onFinish$default((MvChoosePhotoScene) aObjectS351S0100000_8.l0, false, null, 2, null);
            } else if (arrayList.size() > 0) {
                Activity activityRequireActivity = ((MvChoosePhotoScene) aObjectS351S0100000_8.l0).requireActivity();
                if ((activityRequireActivity instanceof C19EG) && (c19eg = (C19EG) activityRequireActivity) != null) {
                    supportFragmentManager = c19eg.getSupportFragmentManager();
                }
                List<LiveSubMediaModel> listLIZ = C207218166u.LIZ(arrayList);
                final MvChoosePhotoScene mvChoosePhotoScene3 = (MvChoosePhotoScene) aObjectS351S0100000_8.l0;
                C523330Kfj c523330Kfj = new C523330Kfj(supportFragmentManager, listLIZ, mvChoosePhotoScene3.subImageParams, mvChoosePhotoScene3.subEmoteShoType, mvChoosePhotoScene3.subLogInfo, new InterfaceC523740KgO() { // from class: X.0KeP
                    @Override // X.InterfaceC523740KgO
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC523740KgO
                    public final void LIZ(C523320Kfi c523320Kfi) throws Throwable {
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(c523320Kfi.LIZ);
                        Intent intent2 = new Intent();
                        intent2.putParcelableArrayListExtra("choose_live_sub_media", arrayList2);
                        MvChoosePhotoScene mvChoosePhotoScene4 = mvChoosePhotoScene3;
                        Activity activity2 = mvChoosePhotoScene4.mActivity;
                        if (activity2 != null) {
                            C2204961BRm.LJIIL(mvChoosePhotoScene4.resultCode, activity2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbTleDEGc=", null));
                        }
                        MvChoosePhotoScene.onFinish$default(mvChoosePhotoScene3, false, null, 2, null);
                    }
                });
                InterfaceC493540JXc interfaceC493540JXcF6 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).f6();
                if (interfaceC493540JXcF6 != null) {
                    interfaceC493540JXcF6.LIZJ(c523330Kfj);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        AwemeDraft awemeDraft = (AwemeDraft) aObjectS351S0100000_8.l0;
        C15O7.LIZJ(new ACallableS415S0100000_8(awemeDraft, 18));
        C556880Lsk.LIZ.getClass();
        C556880Lsk.LIZ(awemeDraft, "finish");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.size() > 0) {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(arrayList, 0);
            c527240Km2.getClass();
            MediaModel mediaModelLIZIZ = C527240Km2.LIZIZ(tikTokMediaModel);
            PcsVideoModel pcsVideoModel = new PcsVideoModel();
            pcsVideoModel.setFileLocalUriPath(mediaModelLIZIZ.LJFF());
            pcsVideoModel.setFileName(mediaModelLIZIZ.fileName);
            pcsVideoModel.setWidth(mediaModelLIZIZ.width);
            pcsVideoModel.setHeight(mediaModelLIZIZ.height);
            pcsVideoModel.setDuration(mediaModelLIZIZ.duration);
            arrayList2.add(pcsVideoModel);
            Intent intent = new Intent("pcs_choose_video_extra_identifier");
            intent.putParcelableArrayListExtra("pcs_choose_video_extra_identifier", arrayList2);
            Context context = ((MvChoosePhotoScene) aObjectS351S0100000_8.l0).getContext();
            if (context != null) {
                LocalBroadcastManager.LIZ(context).LIZJ(intent);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        int i;
        C529030Kov c529030Kov = (C529030Kov) aObjectS351S0100000_8.l0;
        c529030Kov.getClass();
        if (obj == OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE) {
            c529030Kov.LLL = System.currentTimeMillis();
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[*]firstRefresh: costMs=0 (T+0 baseline) PAGE_SIZE=");
            int i2 = C529030Kov.LLLLIIL;
            sbLIZ.append(i2);
            sbLIZ.append(" IMG_PAGE_SIZE=");
            int i3 = C529030Kov.LLLLIILL;
            sbLIZ.append(i3);
            sbLIZ.append(" videoPage=");
            sbLIZ.append(c529030Kov.LLJLL);
            sbLIZ.append(" imagePage=");
            sbLIZ.append(c529030Kov.LLJLILLLLZIIL);
            C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (c529030Kov.LLJLL == 0) {
                if (C0BRY.LIZ()) {
                    c529030Kov.LLJLIL = true;
                }
                c529030Kov.LLLLILI(4, i2, c529030Kov.LLJLL, c529030Kov.LLLLII, C530350Kr3.LIZ);
            }
            if (c529030Kov.LLJLILLLLZIIL == 0) {
                if (C0BRY.LIZ()) {
                    c529030Kov.LLJL = true;
                }
                if (c529030Kov.LLLIIL) {
                    i = 1;
                } else {
                    i = 3;
                }
                c529030Kov.LLLLILI(i, i3, c529030Kov.LLJLILLLLZIIL, c529030Kov.LLLLII, C530350Kr3.LIZ);
            }
        } else {
            C201955140j.LJIILL(C533790Kwb.LIZIZ, "MvChooseAlbumFragment", "[*]firstRefreshMediaModelsAfterAnimation reject");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS351S0100000_8.l0;
        String str = VideoRecordPermissionActivity._pnsPageId;
        videoRecordPermissionActivity.getClass();
        ARunnableS77S0200000_8 aRunnableS77S0200000_8 = new ARunnableS77S0200000_8((List) obj, videoRecordPermissionActivity, 15);
        String strLLLLLZL = VideoRecordPermissionActivity.LLLLLZL(videoRecordPermissionActivity.getIntent(), "shoot_way");
        if (strLLLLLZL == null) {
            strLLLLLZL = "";
        }
        C535670Kzd.LIZ().LIZLLL(videoRecordPermissionActivity, strLLLLLZL, new AObjectS383S0100000_8(aRunnableS77S0200000_8, 16));
        videoRecordPermissionActivity.finish();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        Intent intent = (Intent) aObjectS351S0100000_8.l0;
        String[] strArr = (String[]) obj;
        String str = VideoRecordPermissionActivity._pnsPageId;
        if (strArr.length == 1 && strArr[0].equals("android.permission.RECORD_AUDIO")) {
            return Boolean.valueOf(Objects.equals(VideoRecordPermissionActivity.LLLLLZL(intent, "shoot_way"), "link_share"));
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$6(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        C559780LxQ c559780LxQ = (C559780LxQ) aObjectS351S0100000_8.l0;
        C2491509pZ.LIZ("cutui.VideoList", "notifyDataSetChanged after setup success");
        c559780LxQ.notifyItemRangeChanged(0, c559780LxQ.getItemCount(), 1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        int i;
        Object next;
        int iIntValue;
        int size;
        if (((Number) obj).intValue() == 0) {
            C576270Miv c576270Miv = (C576270Miv) aObjectS351S0100000_8.l0;
            C08LX c08lx = new C08LX(new C08LY(new C1939607ik(c576270Miv.LIZIZ), new AwS587S0100000_8(c576270Miv, 671)));
            while (true) {
                i = 0;
                if (c08lx.hasNext()) {
                    next = c08lx.next();
                    if (((Number) next).intValue() >= 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Integer num = (Integer) next;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C576270Miv c576270Miv2 = (C576270Miv) aObjectS351S0100000_8.l0;
            if (iIntValue >= 0) {
                i = iIntValue;
            }
            int iIntValue2 = -1;
            if (c576270Miv2.LJII.isEmpty()) {
                size = -1;
            } else {
                size = i % c576270Miv2.LJII.size();
            }
            c576270Miv2.LJI = size;
            C576270Miv c576270Miv3 = (C576270Miv) aObjectS351S0100000_8.l0;
            Integer num2 = (Integer) C13LP.LJJJLZIJ(c576270Miv3.LJI, c576270Miv3.LJII);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            c576270Miv3.LIZ(iIntValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS351S0100000_8.l0;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        if (onClickListener != null) {
            onClickListener.onClick(c1397660mTU.LIZ(), c1397660mTU.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS351S0100000_8 aObjectS351S0100000_8, Object obj) {
        Context context = (Context) aObjectS351S0100000_8.l0;
        String str = DraftBoxActivity._pnsPageId;
        C1403010mc7.LIZ.LJ().LIZLLL(context);
        return Unit.LIZ;
    }
}
