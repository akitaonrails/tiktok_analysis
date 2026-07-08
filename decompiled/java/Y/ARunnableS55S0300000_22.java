package Y;

import X.AbstractC1433570nPP;
import X.C013C;
import X.C0CHQ;
import X.C12ES;
import X.C1394440mOI;
import X.C13LP;
import X.C1412860ms0;
import X.C1412940ms8;
import X.C1414450muZ;
import X.C1423010n8N;
import X.C1424590nAv;
import X.C1424770nBD;
import X.C1424850nBL;
import X.C1428120nGc;
import X.C1428140nGe;
import X.C1428150nGf;
import X.C1433500nPI;
import X.C1439650nZD;
import X.C1439700nZI;
import X.C1443060nei;
import X.C1443200new;
import X.C1444110ngP;
import X.C1445600nio;
import X.C1447790nmL;
import X.C1447920nmY;
import X.C1450860nrI;
import X.C1453390nvN;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1456350o09;
import X.C1457270o1d;
import X.C19510811Va;
import X.C19719512Dh;
import X.C19719612Di;
import X.C1C7U;
import X.C20642515q3;
import X.C2188811AlT;
import X.C294110Bft;
import X.C295820Bie;
import X.C304920BxK;
import X.C528180KnY;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.InterfaceC1437705jz;
import X.InterfaceC1446740nke;
import X.InterfaceC1453510nvZ;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorClickAction;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorGeneralType;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.gamora.editor.mixediting.resource.utils.MixAssetDownloader;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS55S0300000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int height;
        FrameLayout.LayoutParams layoutParams;
        int i = C1428150nGf.LIZ;
        C1428140nGe c1428140nGe = ((C1428120nGc) this.l0).LLLLILI().LIZ;
        RectF rectFLIZJ = C1428150nGf.LIZJ();
        if (rectFLIZJ.height() > 0.0f && rectFLIZJ.width() > 0.0f) {
            height = (int) rectFLIZJ.centerY();
        } else if (((View) this.l1).getHeight() <= 0) {
            return;
        } else {
            height = ((View) this.l1).getHeight() / 2;
        }
        int height2 = height - ((((View) this.l2).getHeight() > 0 ? ((View) this.l2).getHeight() : ((View) this.l2).getMeasuredHeight()) / 2);
        ViewGroup.LayoutParams layoutParams2 = ((View) this.l2).getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null || layoutParams.topMargin == height2) {
            return;
        }
        layoutParams.topMargin = height2 >= 0 ? height2 : 0;
        C786410Ut5.W5((View) this.l2, layoutParams);
    }

    public final void LIZ$1() {
        List<AnchorTransData> value = ((C19510811Va) this.l0).LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
        if (value != null) {
            C13LP.LJLLLL(new AComparatorS41S0000000_22(3), value);
            ArrayList arrayList = (ArrayList) this.l1;
            for (AnchorTransData anchorTransData : value) {
                if (anchorTransData.businessType != EnumC1430380nKG.TTS_VOICE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.PROP.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.ANCHOR_SOUND_SYNC.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.ANCHOR_EDIT_EFFECT.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.AI_SELF_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.GREEN_SCREEN_ANCHOR_TYPE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.AI_IMAGINE_ANCHOR_TYPE.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.SOCIAL_AVATAR_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.CT_FILTER_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.CT_AI_MAGIC_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.AI_PLAYGROUND_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.LYRIC_EFFECT_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE() && anchorTransData.businessType != EnumC1430380nKG.AI_PORTRAIT_ANCHOR_TYPE.getTYPE() && !C1394440mOI.LIZJ(anchorTransData.businessType)) {
                    if (C294110Bft.LIZIZ()) {
                        arrayList.clear();
                    }
                    arrayList.add(anchorTransData);
                }
            }
        }
        List<AnchorTransData> listLIZIZ = C19719512Dh.LIZIZ(C19510811Va.LJII((ArrayList) this.l1));
        if (!C304920BxK.LIZ()) {
            ((C19510811Va) this.l0).getClass();
            C19719612Di.LJJIIJ(listLIZIZ, AFwS248S0000000_14.get$arr$(317), true);
        }
        if (C294110Bft.LIZIZ()) {
            ((C19510811Va) this.l0).getClass();
            C19510811Va.LJJIJIIJI(listLIZIZ);
            if (!listLIZIZ.isEmpty()) {
                Object objLJJJJZI = C13LP.LJJJJZI(listLIZIZ);
                C19510811Va c19510811Va = (C19510811Va) this.l0;
                AnchorTransData anchorTransData2 = (AnchorTransData) objLJJJJZI;
                if (anchorTransData2.businessType == EnumC1430380nKG.PROP.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.ANCHOR_SOUND_SYNC.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.TTS_VOICE.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.CT_AI_MAGIC_ANCHOR.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.AI_PLAYGROUND_ANCHOR.getTYPE() || anchorTransData2.businessType == EnumC1430380nKG.LYRIC_EFFECT_ANCHOR.getTYPE() || C1394440mOI.LIZJ(anchorTransData2.businessType)) {
                    int i = anchorTransData2.businessType;
                    UrlModel urlModel = anchorTransData2.anchorIcon;
                    c19510811Va.LLJJIJIIJIL = new AnchorPublishStruct(i, urlModel, anchorTransData2.title, "", anchorTransData2.url, urlModel, "", anchorTransData2.anchorContent, false, false, null, null, 3, AFwS210S0000000_22.get$arr$(95), null, c19510811Va.LJIILL(), true, "", null, false, C20642515q3.LIZ().getResources().getString(2131833505), null, false, 1, "", anchorTransData2.display, false, "", 0, "", AnchorGeneralType.DEFAULT.getType(), AnchorClickAction.NONE.getType(), 0, "", "");
                }
            }
        }
        C19510811Va c19510811Va2 = (C19510811Va) this.l0;
        c19510811Va2.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("creator_m10n_android_paid_content_prevent_non_commercial_music_is_enabled", false) && !c19510811Va2.LJJ()) {
            C19719612Di.LJJIIJ(listLIZIZ, AFwS261S0000000_22.get$arr$(78), true);
        }
        C19510811Va c19510811Va3 = (C19510811Va) this.l0;
        List list = (List) this.l2;
        c19510811Va3.getClass();
        if (!C528180KnY.LIZJ()) {
            C19719612Di.LJJIIJ(listLIZIZ, AFwS261S0000000_22.get$arr$(79), true);
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((CreateAnchorInfo) it2.next()).getType() == EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE()) {
                    break;
                }
            } else if (value != null) {
                Iterator<AnchorTransData> it3 = value.iterator();
                while (it3.hasNext()) {
                    if (it3.next().businessType == EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE()) {
                    }
                }
            }
        }
        ((C19510811Va) this.l0).LJIILL().extensionDataRepo.getUpdateAnchors().setValue(listLIZIZ);
    }

    public final void LIZ$2() {
        MixAssetDownloader mixAssetDownloader = (MixAssetDownloader) this.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFail(), name=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getTitle());
        sbLIZ.append(", data=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getAsset_id());
        sbLIZ.append(", type=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getAsset_consumer_type());
        sbLIZ.append(", ");
        sbLIZ.append((Exception) this.l2);
        C2188811AlT.LIZIZ(sbLIZ);
        mixAssetDownloader.getClass();
        LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> linkedList = ((MixAssetDownloader) this.l0).LLILZ;
        C1412860ms0 c1412860ms0 = (C1412860ms0) this.l1;
        ArrayList arrayList = new ArrayList();
        for (Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair : linkedList) {
            if (MixAssetDownloader.LJII(pair.getFirst(), c1412860ms0)) {
                arrayList.add(pair);
            }
        }
        Exception exc = (Exception) this.l2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1437705jz) ((Pair) it2.next()).getSecond()).LIZ(exc);
        }
        C1412940ms8.LIZ(C1412940ms8.LIZ, (C1412860ms0) this.l1, false, 1, ((MixAssetDownloader) this.l0).LLILLL.invoke());
        MixAssetDownloader mixAssetDownloader2 = (MixAssetDownloader) this.l0;
        C1412860ms0 c1412860ms02 = (C1412860ms0) this.l1;
        C1414450muZ.LJFF(mixAssetDownloader2.LLILZ, new AwS388S0200000_22(mixAssetDownloader2, c1412860ms02, 279));
        C1414450muZ.LJFF(mixAssetDownloader2.LLILZIL, new AwS388S0200000_22(mixAssetDownloader2, c1412860ms02, 280));
        mixAssetDownloader2.LJFF();
    }

    public final void LIZ$3() {
        ((C1453390nvN) this.l0).LJIIIZ = new RectF(0.0f, 0.0f, ((View) this.l1).getWidth(), ((View) this.l1).getHeight());
        Collection<C1450860nrI> collectionValues = ((C1453390nvN) this.l0).LJFF.values();
        C1453390nvN c1453390nvN = (C1453390nvN) this.l0;
        for (C1450860nrI c1450860nrI : collectionValues) {
            if (c1450860nrI.LIZIZ.width() <= 0.0f) {
                RectF rectF = c1450860nrI.LIZIZ;
                RectF rectF2 = c1453390nvN.LJIIIZ;
                if (rectF2 == null) {
                    rectF2 = null;
                }
                rectF.set(rectF2);
                c1450860nrI.LIZIZ.offset(c1453390nvN.LJIILL().transX, c1453390nvN.LJIILL().transY);
            }
        }
        C1453390nvN c1453390nvN2 = (C1453390nvN) this.l0;
        InterfaceC1453510nvZ interfaceC1453510nvZ = (InterfaceC1453510nvZ) this.l2;
        c1453390nvN2.LJ = interfaceC1453510nvZ;
        interfaceC1453510nvZ.setEnableFakeFeedView(c1453390nvN2.LJIIJ.enableFakeFeedView);
        ((InterfaceC1453510nvZ) this.l2).setEnableStoryFakeFeedView(((C1453390nvN) this.l0).LJIIJ.enableFakeStoryFeedView);
    }

    public static final void run$0(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TapToAddTextGuideScene@e182.positionOverlayInPhotoArea$2");
        try {
            aRunnableS55S0300000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TapToAddTextGuideScene@e182.positionOverlayInPhotoArea$2");
    }

    public static final void run$1(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MultiAnchorPublishExtension@182f.callbackAnchors$1$2");
        try {
            aRunnableS55S0300000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.callbackAnchors$1$2");
    }

    public static final void run$10(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onFail$1");
        try {
            aRunnableS55S0300000_22.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onFail$1");
    }

    public static final void run$11(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishTask@7c51.invokeCallback$1");
        try {
            List list = (List) aRunnableS55S0300000_22.l0;
            Function1 function1 = (Function1) aRunnableS55S0300000_22.l1;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                function1.invoke((AbstractC1433570nPP) it2.next());
            }
            ((Function1) aRunnableS55S0300000_22.l1).invoke(((C1433500nPI) aRunnableS55S0300000_22.l2).LLJILJILJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishTask@7c51.invokeCallback$1");
    }

    public static final void run$12(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("CanvasGestureTransformAssist@db77.initBorder$1");
        try {
            aRunnableS55S0300000_22.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CanvasGestureTransformAssist@db77.initBorder$1");
    }

    public static final void run$13(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishParallelDraftList@4fa0.retryOtherDraft$1$2$1");
        try {
            C1439650nZD.LJFF = true;
            C0CHQ.LIZ().getPublishService().LJIIL().LJFF(((C1439700nZI) aRunnableS55S0300000_22.l0).LIZ, (AwemeDraft) aRunnableS55S0300000_22.l1, (PublishFailureReason) aRunnableS55S0300000_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishParallelDraftList@4fa0.retryOtherDraft$1$2$1");
    }

    public static final void run$14(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishParallelDraftList@4fa0.retryOtherDraftWithNewPanel$1$2$1");
        try {
            C1439650nZD.LIZJ = true;
            C0CHQ.LIZ().getPublishService().LJIIL().LJFF(((C1439700nZI) aRunnableS55S0300000_22.l0).LIZ, (AwemeDraft) aRunnableS55S0300000_22.l1, (PublishFailureReason) aRunnableS55S0300000_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishParallelDraftList@4fa0.retryOtherDraftWithNewPanel$1$2$1");
    }

    public static final void run$15(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("UploadRecoverPanel@8905.loadCover$1$onGetVideoCoverSuccess$1$1");
        try {
            ((ImageView) aRunnableS55S0300000_22.l0).setImageBitmap((Bitmap) aRunnableS55S0300000_22.l1);
            C1445600nio.LIZ((ImageView) aRunnableS55S0300000_22.l0, C12ES.LIZJ(2.0f, ((C1443060nei) aRunnableS55S0300000_22.l2).LL));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadRecoverPanel@8905.loadCover$1$onGetVideoCoverSuccess$1$1");
    }

    public static final void run$2(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditorThumbnailPlaceholderHelper@e902.registerSharpImageAwait$1$1");
        try {
            if (!C1457270o1d.LIZIZ) {
                C786410Ut5.LJJJJ((Bitmap) aRunnableS55S0300000_22.l0);
                C1457270o1d.LIZ.getClass();
                C1457270o1d.LJ("sharp bitmap recycled on main thread, placeholder was cleared");
            } else {
                C1457270o1d c1457270o1d = C1457270o1d.LIZ;
                InterfaceC1446740nke interfaceC1446740nke = (InterfaceC1446740nke) aRunnableS55S0300000_22.l1;
                ImageView imageView = (ImageView) aRunnableS55S0300000_22.l2;
                Bitmap bitmap = (Bitmap) aRunnableS55S0300000_22.l0;
                c1457270o1d.getClass();
                C1457270o1d.LJIIJ(interfaceC1446740nke, imageView, bitmap, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorThumbnailPlaceholderHelper@e902.registerSharpImageAwait$1$1");
    }

    public static final void run$3(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishProgressView@ba68.startSwitchAnimation1$animator1$1");
        try {
            ((C1447790nmL) aRunnableS55S0300000_22.l0).LLJJ.LIZLLL((C1447920nmY) aRunnableS55S0300000_22.l1);
            ((Function0) aRunnableS55S0300000_22.l2).invoke();
            ((C1447790nmL) aRunnableS55S0300000_22.l0).LJII();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishProgressView@ba68.startSwitchAnimation1$animator1$1");
    }

    public static final void run$4(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishProgressView@ba68.startSwitchAnimation2$animator2$1");
        try {
            ((C1447790nmL) aRunnableS55S0300000_22.l0).LLJJ.LIZLLL((C1447920nmY) aRunnableS55S0300000_22.l1);
            ((Function0) aRunnableS55S0300000_22.l2).invoke();
            ((C1447790nmL) aRunnableS55S0300000_22.l0).LJII();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishProgressView@ba68.startSwitchAnimation2$animator2$1");
    }

    public static final void run$5(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("UploadRecoverAgsPanel@3539.loadCover$1$onGetVideoCoverSuccess$1$1");
        try {
            ((ImageView) aRunnableS55S0300000_22.l0).setImageBitmap((Bitmap) aRunnableS55S0300000_22.l1);
            C1445600nio.LIZ((ImageView) aRunnableS55S0300000_22.l0, C12ES.LIZJ(2.0f, ((C1443200new) aRunnableS55S0300000_22.l2).LL));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadRecoverAgsPanel@3539.loadCover$1$onGetVideoCoverSuccess$1$1");
    }

    public static final void run$6(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.asyncExtractCoverNew$2$successCallbackExtend$1");
        try {
            if (C295820Bie.LIZIZ() == 2) {
                ((C1455260nyO) aRunnableS55S0300000_22.l0).LLLLLZ(true, (C1456350o09) aRunnableS55S0300000_22.l1);
            }
            ((Runnable) aRunnableS55S0300000_22.l2).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.asyncExtractCoverNew$2$successCallbackExtend$1");
    }

    public static final void run$7(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditStickerCompileComponent@a7e2.compileStickers$1");
        try {
            if (((C013C) aRunnableS55S0300000_22.l0).element) {
                ((C1444110ngP) aRunnableS55S0300000_22.l1).JY0().oL2();
                ((C013C) aRunnableS55S0300000_22.l0).element = false;
            }
            ((Function0) aRunnableS55S0300000_22.l2).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditStickerCompileComponent@a7e2.compileStickers$1");
    }

    public static final void run$8(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.asyncExtractCoverNew$2$successCallbackExtend$1");
        try {
            if (C295820Bie.LIZIZ() == 2) {
                ((C1455250nyN) aRunnableS55S0300000_22.l0).LLLLLZ(true, (C1456350o09) aRunnableS55S0300000_22.l1);
            }
            ((Runnable) aRunnableS55S0300000_22.l2).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.asyncExtractCoverNew$2$successCallbackExtend$1");
    }

    public static final void run$9(ARunnableS55S0300000_22 aRunnableS55S0300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MultiColTemplateScene@5338.initObservers$12$1");
        try {
            C1424770nBD c1424770nBDLLLLLJLJLL = ((C1424590nAv) aRunnableS55S0300000_22.l0).LLLLLJLJLL();
            TemplateCategoryData templateCategoryData = (TemplateCategoryData) aRunnableS55S0300000_22.l1;
            C1423010n8N c1423010n8N = (C1423010n8N) aRunnableS55S0300000_22.l2;
            C1424850nBL c1424850nBL = c1424770nBDLLLLLJLJLL.LLIZLLLIL.get(templateCategoryData.key);
            if (c1424850nBL != null) {
                c1424850nBL.LJIIJJI(c1423010n8N);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiColTemplateScene@5338.initObservers$12$1");
    }

    public ARunnableS55S0300000_22(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
