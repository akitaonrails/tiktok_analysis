package Y;

import X.AbstractC540910LJh;
import X.AbstractC848400XPy;
import X.AnonymousClass0207;
import X.C099R;
import X.C09AE;
import X.C0LAB;
import X.C0LSZ;
import X.C0LY8;
import X.C0LYD;
import X.C0LYF;
import X.C0LYG;
import X.C0LYH;
import X.C0LYK;
import X.C0LYP;
import X.C0LYS;
import X.C0LYV;
import X.C0M0P;
import X.C0MAY;
import X.C0MDK;
import X.C0MDX;
import X.C0MGL;
import X.C0MKE;
import X.C0MKG;
import X.C0MKI;
import X.C0MM5;
import X.C0MMH;
import X.C0MMP;
import X.C0MUK;
import X.C0XQ7;
import X.C0ZDN;
import X.C13LP;
import X.C1414390muT;
import X.C1458370o3P;
import X.C1660680tJi;
import X.C1664590tQ1;
import X.C1954807lC;
import X.C19EG;
import X.C1DPV;
import X.C1DPW;
import X.C1DPX;
import X.C20143013rg;
import X.C201955140j;
import X.C20622515mp;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2253081DGo;
import X.C2286608xc;
import X.C23250099c;
import X.C370670Eg5;
import X.C433180Gyi;
import X.C438070HFt;
import X.C443120HZe;
import X.C522090Kdj;
import X.C522130Kdn;
import X.C522250Kdz;
import X.C523280Kfe;
import X.C525070KiX;
import X.C525110Kib;
import X.C525630KjR;
import X.C525660KjU;
import X.C525740Kjc;
import X.C525840Kjm;
import X.C525870Kjp;
import X.C525890Kjr;
import X.C525920Kju;
import X.C525930Kjv;
import X.C525950Kjx;
import X.C526050Kk7;
import X.C526060Kk8;
import X.C526070Kk9;
import X.C526080KkA;
import X.C526450Kkl;
import X.C528200Kna;
import X.C528760KoU;
import X.C530690Krb;
import X.C533930Kwp;
import X.C536210L1f;
import X.C536240L1i;
import X.C537520L6g;
import X.C537540L6i;
import X.C538330L9j;
import X.C538540LAe;
import X.C539070LCf;
import X.C540870LJd;
import X.C544720LXy;
import X.C544730LXz;
import X.C547140Ld2;
import X.C549180LgK;
import X.C552700Lm0;
import X.C557190LtF;
import X.C557670Lu1;
import X.C561950M2f;
import X.C563470M8b;
import X.C563650M8t;
import X.C564410MBr;
import X.C566170MIl;
import X.C571500MbE;
import X.C574800MgY;
import X.C578310MmD;
import X.C786410Ut5;
import X.EnumC1641610sox;
import X.EnumC545550LaT;
import X.EnumC545560LaU;
import X.EnumC578300MmC;
import X.InterfaceC1364105Vn;
import X.InterfaceC1623190sLF;
import X.InterfaceC20597015ii;
import X.InterfaceC332260D0u;
import X.InterfaceC346701Wf;
import X.InterfaceC434700H2u;
import X.InterfaceC525940Kjw;
import X.InterfaceC526090KkB;
import X.InterfaceC549230LgP;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import a6n.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.bugfixab.AIGCCloseActivityAfterEditPageLaunched;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import mn3.e0;
import t28.c;
import t28.h;

/* JADX INFO: loaded from: classes9.dex */
public class AgS289S0100000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return emit$20(this, obj, interfaceC1364105Vn);
            case 21:
                return emit$21(this, obj, interfaceC1364105Vn);
            case 22:
                return emit$22(this, obj, interfaceC1364105Vn);
            case 23:
                return emit$23(this, obj, interfaceC1364105Vn);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return emit$24(this, obj, interfaceC1364105Vn);
            case 25:
                return emit$25(this, obj, interfaceC1364105Vn);
            case 26:
                return emit$26(this, obj, interfaceC1364105Vn);
            case 27:
                return emit$27(this, obj, interfaceC1364105Vn);
            case 28:
                return emit$28(this, obj, interfaceC1364105Vn);
            case 29:
                return emit$29(this, obj, interfaceC1364105Vn);
            case 30:
                return emit$30(this, obj, interfaceC1364105Vn);
            case 31:
                return emit$31(this, obj, interfaceC1364105Vn);
            case 32:
                return emit$32(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return emit$33(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return emit$34(this, obj, interfaceC1364105Vn);
            case 35:
                return emit$35(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return emit$36(this, obj, interfaceC1364105Vn);
            case 37:
                return emit$37(this, obj, interfaceC1364105Vn);
            case 38:
                return emit$38(this, obj, interfaceC1364105Vn);
            case 39:
                return emit$39(this, obj, interfaceC1364105Vn);
            case 40:
                return emit$40(this, obj, interfaceC1364105Vn);
            case 41:
                return emit$41(this, obj, interfaceC1364105Vn);
            case 42:
                return emit$42(this, obj, interfaceC1364105Vn);
            case 43:
                return emit$43(this, obj, interfaceC1364105Vn);
            case 44:
                return emit$44(this, obj, interfaceC1364105Vn);
            case 45:
                return emit$45(this, obj, interfaceC1364105Vn);
            case 46:
                return emit$46(this, obj, interfaceC1364105Vn);
            case 47:
                return emit$47(this, obj, interfaceC1364105Vn);
            case 48:
                return emit$48(this, obj, interfaceC1364105Vn);
            case 49:
                return emit$49(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS289S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public AgS289S0100000_8(Context context, ForwardMedia forwardMedia, int i) {
        this.$t = i;
        this.l0 = context;
    }

    public static final Object emit$0(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) agS289S0100000_8.l0;
        C0MM5.LIZ.getClass();
        Object objEmit = interfaceC346701Wf.emit(C0MM5.LJIIIZ((C0MMH) obj), interfaceC1364105Vn);
        if (objEmit != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objEmit;
    }

    public static final Object emit$1(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objEmit = ((InterfaceC346701Wf) agS289S0100000_8.l0).emit(obj, interfaceC1364105Vn);
        if (objEmit != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objEmit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.AgS289S0100000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C546790LcT
            if (r0 == 0) goto L51
            r5 = r8
            X.0LcT r5 = (X.C546790LcT) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r5.LLILLJJLI
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L3c
            if (r2 != r3) goto L57
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.0LU9 r7 = (X.C0LU9) r7
            r5.LLILLL = r2
            r5.LLILLJJLI = r0
            com.ss.android.ugc.aweme.aikit.api.create.CreateState r1 = X.C546730LcN.LIZLLL(r7)
            if (r1 != r4) goto L41
            return r4
        L3c:
            X.01Wf r2 = r5.LLILLL
            X.C155000ia.LIZIZ(r1)
        L41:
            if (r1 != 0) goto L45
            com.ss.android.ugc.aweme.aikit.api.create.CreateState$NullState r1 = com.ss.android.ugc.aweme.aikit.api.create.CreateState.NullState.INSTANCE
        L45:
            r0 = 0
            r5.LLILLL = r0
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L25
            return r4
        L51:
            X.0LcT r5 = new X.0LcT
            r5.<init>(r6, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$10(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$11(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i = C578310MmD.LIZ[((EnumC578300MmC) obj).ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            C370670Eg5 c370670Eg5 = ((C1414390muT) agS289S0100000_8.l0).LLJILJIL;
            if (c370670Eg5 != null) {
                c370670Eg5.LIZ();
            }
        } else {
            C370670Eg5 c370670Eg52 = ((C1414390muT) agS289S0100000_8.l0).LLJILJIL;
            if (c370670Eg52 != null) {
                c370670Eg52.LIZIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((MediaModel) obj2).LJIILJJIL()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int size2 = list.size() - size;
        C525840Kjm c525840Kjm = (C525840Kjm) agS289S0100000_8.l0;
        c525840Kjm.i3(new C525740Kjc(list, c525840Kjm, size, size2));
        return Unit.LIZ;
    }

    public static final Object emit$13(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<? extends TikTokMediaModel> list = (List) obj;
        ((C526450Kkl) agS289S0100000_8.l0).i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 98));
        if (((C526450Kkl) agS289S0100000_8.l0).LLJJI.LIZ(list)) {
            ((C526450Kkl) agS289S0100000_8.l0).show();
        } else {
            ((C526450Kkl) agS289S0100000_8.l0).hide();
        }
        return Unit.LIZ;
    }

    public static final Object emit$14(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC526090KkB interfaceC526090KkB = (InterfaceC526090KkB) obj;
        if (interfaceC526090KkB instanceof C526080KkA) {
            ((C526050Kk7) agS289S0100000_8.l0).H2((C526080KkA) interfaceC526090KkB);
        } else if (interfaceC526090KkB instanceof C526070Kk9) {
            ((C526050Kk7) agS289S0100000_8.l0).G2((C526070Kk9) interfaceC526090KkB);
        } else if (interfaceC526090KkB instanceof C526060Kk8) {
            ((C526050Kk7) agS289S0100000_8.l0).T2((C526060Kk8) interfaceC526090KkB);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$15(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        String strLJJLIIIJ;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        String str5;
        String str6;
        String creationId;
        CreativeModel creativeModel;
        LivePhotoModel livePhotoModel;
        List<? extends MediaModel> list;
        CreativeModel creativeModel2;
        CommonMobParamModel commonMobParamModel;
        List<String> list2;
        List<TikTokMediaModel> list3 = ((C525660KjU) obj).LIZ;
        int size = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (TikTokMediaModel tikTokMediaModel : list3) {
            if (tikTokMediaModel.LJIILJJIL()) {
                C2286608xc.LJ(i3);
                i3++;
            } else if (tikTokMediaModel.LJIIL()) {
                C2286608xc.LJ(i5);
                i5++;
            } else {
                i4++;
            }
        }
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        String strLJIJJLI = "";
        if (shortVideoContext == null || (str = shortVideoContext.uploadMethod) == null) {
            str = "";
        }
        c0lab.LJ("upload_method", str);
        ShortVideoContext shortVideoContext2 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        String creationId2 = null;
        if (shortVideoContext2 != null && (list2 = shortVideoContext2.uploadTabNameList) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c0lab.LJ("upload_tab_name", strLJJLIIIJ);
        ShortVideoContext shortVideoContext3 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext3 == null || (str2 = shortVideoContext3.albumPreviewNextMethod) == null) {
            str2 = "";
        }
        c0lab.LJ("upload_next_method", str2);
        c0lab.LJ("content_source", "upload");
        if (list3.size() == 1) {
            str3 = "single_content";
        } else {
            str3 = "multiple_content";
        }
        c0lab.LJ("upload_type", str3);
        if (list3.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_multi_content");
        c0lab.LIZ(list3.size(), "current_content_nums");
        c0lab.LIZ(i4, "pic_cnt");
        c0lab.LIZ(i5, "highlights_cnt");
        c0lab.LIZ(i3, "video_cnt");
        c0lab.LIZ(C530690Krb.LIZ(list3), "source_is_hdr");
        ShortVideoContext shortVideoContext4 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext4 != null) {
            strLJIJJLI = shortVideoContext4.LJIJJLI();
        }
        c0lab.LJ("shoot_tab_name", strLJIJJLI);
        ShortVideoContext shortVideoContext5 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext5 != null && (creativeModel2 = shortVideoContext5.creativeModel) != null && (commonMobParamModel = creativeModel2.commonMobModel) != null && commonMobParamModel.isUploadDirectEnter) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_upload_direct_enter");
        String str7 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str5);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str6);
        c0lab.LJ("has_upload_permission", C522250Kdz.LIZ());
        C523280Kfe.LIZ.getClass();
        if (!C523280Kfe.LIZJ(true)) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_private_access", str7);
        c0lab.LJ("content_size", C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, AnonymousClass0207.get$arr$(42), 30));
        c0lab.LJ("shoot_way", ((C526050Kk7) agS289S0100000_8.l0).o2().shootWay);
        c0lab.LJ("enter_from", ((C526050Kk7) agS289S0100000_8.l0).o2().enterFrom);
        ShortVideoContext shortVideoContext6 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext6 != null) {
            creationId = shortVideoContext6.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext7 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext7 != null) {
            creationId2 = shortVideoContext7.getCreationId();
        }
        c0lab.LJ("creation_id", creationId2);
        ShortVideoContext shortVideoContext8 = ((C526050Kk7) agS289S0100000_8.l0).getShortVideoContext();
        if (shortVideoContext8 != null && (creativeModel = shortVideoContext8.creativeModel) != null && (livePhotoModel = creativeModel.livePhotoModel) != null && (list = livePhotoModel.importedLivePhotoList) != null) {
            size = list.size();
        }
        c0lab.LIZ(size, "live_photo_cnt");
        ((C526050Kk7) agS289S0100000_8.l0).W1("upload_content_next", c0lab);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$16(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C526390Kkf
            if (r0 == 0) goto L39
            r4 = r7
            X.0Kkf r4 = (X.C526390Kkf) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L3f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            boolean r0 = r6 instanceof X.C525660KjU
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L39:
            X.0Kkf r4 = new X.0Kkf
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$16(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$17(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC525940Kjw interfaceC525940Kjw = (InterfaceC525940Kjw) obj;
        if (interfaceC525940Kjw instanceof C525920Kju) {
            ((C525070KiX) agS289S0100000_8.l0).o2(((C525920Kju) interfaceC525940Kjw).LIZ);
        } else if (interfaceC525940Kjw instanceof C525890Kjr) {
            List<TikTokMediaModel> list = ((C525890Kjr) interfaceC525940Kjw).LIZ;
            C525070KiX c525070KiX = (C525070KiX) agS289S0100000_8.l0;
            Iterator<TikTokMediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                c525070KiX.o2(it2.next());
            }
        } else if (interfaceC525940Kjw instanceof C525930Kjv) {
            ((C525070KiX) agS289S0100000_8.l0).w2(((C525930Kjv) interfaceC525940Kjw).LIZ);
        } else if (interfaceC525940Kjw instanceof C525870Kjp) {
            List<TikTokMediaModel> list2 = ((C525870Kjp) interfaceC525940Kjw).LIZ;
            C525070KiX c525070KiX2 = (C525070KiX) agS289S0100000_8.l0;
            Iterator<TikTokMediaModel> it3 = list2.iterator();
            while (it3.hasNext()) {
                c525070KiX2.w2(it3.next());
            }
        } else if (!(interfaceC525940Kjw instanceof C525950Kjx)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$18(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C525630KjR) agS289S0100000_8.l0).dg0((C525660KjU) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$19(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C526400Kkg
            if (r0 == 0) goto L39
            r4 = r7
            X.0Kkg r4 = (X.C526400Kkg) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L3f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            boolean r0 = r6 instanceof X.C525660KjU
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L39:
            X.0Kkg r4 = new X.0Kkg
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$19(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$2(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) agS289S0100000_8.l0;
        C0MM5.LIZ.getClass();
        Object objEmit = interfaceC346701Wf.emit(C0MM5.LJIIIZ((C0MMH) obj), interfaceC1364105Vn);
        if (objEmit != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objEmit;
    }

    public static final Object emit$20(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C536210L1f) agS289S0100000_8.l0).LJJII(((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object emit$21(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        C566170MIl c566170MIl = (C566170MIl) agS289S0100000_8.l0;
        c566170MIl.LLILLJJLI.LIZ(C1664590tQ1.LJIIIZ(c566170MIl));
        ((C566170MIl) agS289S0100000_8.l0).o2();
        return Unit.LIZ;
    }

    public static final Object emit$22(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        String string2;
        C528200Kna c528200Kna;
        ((Boolean) obj).booleanValue();
        C201955140j.LIZLLL(C552700Lm0.LIZIZ, "ChooseAiContentFragment", "Flow triggered: page selected with initial data loaded, triggering mobEnterAiImageTab");
        C528760KoU c528760KoU = (C528760KoU) agS289S0100000_8.l0;
        Bundle bundle = c528760KoU.mArguments;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "video_shoot_page";
        }
        Bundle bundle2 = c528760KoU.mArguments;
        if (bundle2 != null) {
            string2 = bundle2.getString("shoot_tab_name");
        } else {
            string2 = null;
        }
        ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) c528760KoU.LLLZIIL.getValue();
        int i = 1;
        if (chooseMediaViewModel != null) {
            c528200Kna = new C528200Kna();
            for (TikTokMediaModel tikTokMediaModel : chooseMediaViewModel.LLJIJIL) {
                if (tikTokMediaModel.LJIILJJIL()) {
                    c528200Kna.LJ++;
                } else {
                    c528200Kna.LIZLLL++;
                }
                if (tikTokMediaModel.LJIIIZ()) {
                    c528200Kna.LIZIZ++;
                }
                if (tikTokMediaModel.LJI()) {
                    c528200Kna.LIZ++;
                }
                if (tikTokMediaModel.LJII()) {
                    c528200Kna.LIZJ++;
                }
            }
        } else {
            c528200Kna = new C528200Kna();
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", c528760KoU.LLLIIIL);
        c0lab.LJ("shoot_way", c528760KoU.LLLIIIIL);
        c0lab.LJ("shoot_tab_name", string2);
        c0lab.LJ("enter_from", string);
        c0lab.LIZ(c528200Kna.LIZ, "ai_alive_cnt");
        c0lab.LIZ(c528200Kna.LIZIZ, "ai_self_cnt");
        c0lab.LIZ(c528200Kna.LIZJ, "offline_effect_cnt");
        c0lab.LIZ(c528200Kna.LIZLLL, "pic_cnt");
        c0lab.LIZ(c528200Kna.LJ, "video_cnt");
        c0lab.LIZ(0, "live_photo_cnt");
        if (!c528760KoU.LLZ()) {
            i = 0;
        } else if (!C13LP.LLIIII(((ChooseMediaViewModel) c528760KoU.LLLZIIL.getValue()).LLJIJIL).isEmpty()) {
            i = 2;
        }
        c0lab.LIZ(i, "has_ai_self_create_entrance");
        C20684815ws.LJIILLIIL("enter_ai_image_tab", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object emit$23(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC525940Kjw interfaceC525940Kjw = (InterfaceC525940Kjw) obj;
        if (interfaceC525940Kjw instanceof C525930Kjv) {
            ((C525110Kib) agS289S0100000_8.l0).Z1(((C525930Kjv) interfaceC525940Kjw).LIZ);
        } else if (interfaceC525940Kjw instanceof C525870Kjp) {
            C525870Kjp c525870Kjp = (C525870Kjp) interfaceC525940Kjw;
            if (c525870Kjp.LIZIZ) {
                C1458370o3P.LIZ.getClass();
                C1458370o3P.LJJIFFI(false);
            } else {
                List<TikTokMediaModel> list = c525870Kjp.LIZ;
                C525110Kib c525110Kib = (C525110Kib) agS289S0100000_8.l0;
                Iterator<TikTokMediaModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    c525110Kib.Z1(it2.next());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$24(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC526090KkB interfaceC526090KkB = (InterfaceC526090KkB) obj;
        if (interfaceC526090KkB instanceof C526060Kk8) {
            if (((C522090Kdj) agS289S0100000_8.l0).LIZ != null) {
            }
        } else if (interfaceC526090KkB instanceof C526070Kk9) {
            C522130Kdn c522130Kdn = ((C522090Kdj) agS289S0100000_8.l0).LIZ;
            if (c522130Kdn != null) {
                C526070Kk9 c526070Kk9 = (C526070Kk9) interfaceC526090KkB;
                c522130Kdn.LIZJ(c526070Kk9.LIZ, c526070Kk9.LIZIZ);
            }
        } else if (interfaceC526090KkB instanceof C526080KkA) {
            C522130Kdn c522130Kdn2 = ((C522090Kdj) agS289S0100000_8.l0).LIZ;
            if (c522130Kdn2 != null) {
                c522130Kdn2.LIZIZ(((C526080KkA) interfaceC526090KkB).LIZ);
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$25(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C526640Kl4
            if (r0 == 0) goto L41
            r4 = r7
            X.0Kl4 r4 = (X.C526640Kl4) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L41:
            X.0Kl4 r4 = new X.0Kl4
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$25(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$26(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC540910LJh abstractC540910LJh = (AbstractC540910LJh) obj;
        if (abstractC540910LJh instanceof C540870LJd) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((DMPlaygroundTopTabScene) agS289S0100000_8.l0).LLJILLL;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                layoutManager.scrollToPosition(((C540870LJd) abstractC540910LJh).LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$27(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((SocialMediaPickerViewModel) agS289S0100000_8.l0).vQ2((List) ((C443120HZe) obj).getFirst());
        return Unit.LIZ;
    }

    public static final Object emit$28(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((SocialMediaPickerViewModel) agS289S0100000_8.l0).onEvent$social_creation_mediapicker_release(new C563470M8b(true));
        return Unit.LIZ;
    }

    public static final Object emit$29(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC549230LgP interfaceC549230LgP = (InterfaceC549230LgP) obj;
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeCameoState ");
        sbLIZ.append(interfaceC549230LgP);
        c547140Ld2.LIZJ("AITheaterCameoControlComponent", C2188811AlT.LIZIZ(sbLIZ));
        C549180LgK c549180LgK = (C549180LgK) agS289S0100000_8.l0;
        c549180LgK.LLILLL.postValue(c549180LgK.q3(interfaceC549230LgP));
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) agS289S0100000_8.l0;
        C0MM5.LIZ.getClass();
        Object objEmit = interfaceC346701Wf.emit(C0MM5.LJIIIZ((C0MMH) obj), interfaceC1364105Vn);
        if (objEmit != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objEmit;
    }

    public static final Object emit$30(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0M0P c0m0p;
        float f;
        C0M0P c0m0p2;
        C539070LCf c539070LCf = (C539070LCf) obj;
        DraftViewModel draftViewModel = (DraftViewModel) agS289S0100000_8.l0;
        Iterator it2 = ((ArrayList) draftViewModel.LLILZ).iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            C561950M2f c561950M2f = (C561950M2f) it2.next();
            if (c561950M2f.LIZ() == 106) {
                String str2 = c539070LCf.LIZ;
                if ((c561950M2f instanceof C0M0P) && (c0m0p2 = (C0M0P) c561950M2f) != null) {
                    str = c0m0p2.LJ;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    if (i >= 0) {
                        Object obj2 = ListProtector.get(draftViewModel.LLILZ, i);
                        if ((obj2 instanceof C0M0P) && (c0m0p = (C0M0P) obj2) != null) {
                            EnumC545550LaT enumC545550LaT = c539070LCf.LIZJ;
                            if (enumC545550LaT == EnumC545550LaT.COMPLETE) {
                                f = 100.0f;
                            } else {
                                f = c539070LCf.LIZIZ;
                            }
                            c0m0p.LJIILJJIL = f;
                            c0m0p.LJIILIIL = enumC545550LaT;
                            c0m0p.LJIILL = c539070LCf.LIZLLL;
                            C0MAY c0may = C0MAY.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("updateDraftDataWithAsyncTask: index: ");
                            sbLIZ.append(i);
                            sbLIZ.append(", ");
                            sbLIZ.append(c539070LCf);
                            C201955140j.LIZLLL(c0may, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
                            if (c539070LCf.LIZJ != EnumC545550LaT.NONE) {
                                z = true;
                            }
                            draftViewModel.LLJLL.LJIIIZ(new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
                        }
                    }
                }
            }
            i++;
        }
        return Unit.LIZ;
    }

    public static final Object emit$31(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        InterfaceC434700H2u interfaceC434700H2u = (InterfaceC434700H2u) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        if (interfaceC434700H2u instanceof PromptModel) {
            C0MDX c0mdx = (C0MDX) agS289S0100000_8.l0;
            PromptModel promptModel = (PromptModel) interfaceC434700H2u;
            c0mdx.getClass();
            new C0ZDN(c0mdx.requireSceneContext()).LIZ(0);
            c0mdx.LLJLL = new C0MDK(promptModel);
            PromptPageMobParam promptPageMobParam = c0mdx.LLLLILI().LIZ.LIZIZ.getAILivePhotoModel().mobParam;
            PromptType promptType = promptModel.promptType;
            if (promptType == PromptType.RECOMMEND_FROM_GPT) {
                promptPageMobParam.hasGeneratePrompt = true;
            }
            if (promptType == PromptType.RECOMMEND_PRESET) {
                promptPageMobParam.hasPresetPrompt = true;
            }
            c0mdx.LLLLIL().LJ.invoke(promptPageMobParam);
            c0mdx.LLLLIL().LIZ.invoke(promptModel);
            C564410MBr.LIZ.getClass();
            C564410MBr.LJIJJ(c0mdx.LLLLILI().LIZ.LIZIZ, iIntValue + 1, promptModel);
        } else if (interfaceC434700H2u instanceof C433180Gyi) {
            C438070HFt c438070HFtLLLLLJLJLL = ((C0MDX) agS289S0100000_8.l0).LLLLLJLJLL();
            C0MDX c0mdx2 = (C0MDX) agS289S0100000_8.l0;
            c438070HFtLLLLLJLJLL.getPromptListView().scrollToPosition(0);
            c438070HFtLLLLLJLJLL.setPrompts(c0mdx2.LLLLLL().LIZJ());
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel videoPublishEditModel = ((C0MDX) agS289S0100000_8.l0).LLLLILI().LIZ.LIZIZ;
            c564410MBr.getClass();
            C20684815ws.LJIILLIIL("ai_livephoto_prompt_shuffle", C564410MBr.LJI(videoPublishEditModel).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object emit$32(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C0MDX) agS289S0100000_8.l0).LLLLLLL();
        return Unit.LIZ;
    }

    public static final Object emit$33(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(new AwS23S0010000_8(((Boolean) obj).booleanValue(), 12));
        return Unit.LIZ;
    }

    public static final Object emit$34(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AIGCGenerationComponent aIGCGenerationComponent = (AIGCGenerationComponent) agS289S0100000_8.l0;
        aIGCGenerationComponent.i3(new AwS374S0200000_8((C0LY8) obj, aIGCGenerationComponent, 136));
        return Unit.LIZ;
    }

    public static final Object emit$35(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Activity activity;
        Activity activity2;
        Function1<Activity, Unit> function1;
        Function1<Activity, Unit> function12;
        e0 cameraApiComponent;
        C2253081DGo c2253081DGoIU1;
        e0 cameraApiComponent2;
        C2253081DGo c2253081DGoIU12;
        C0LYS c0lys = (C0LYS) obj;
        if (c0lys instanceof C0LYH) {
            AIGCGenerationComponent aIGCGenerationComponent = (AIGCGenerationComponent) agS289S0100000_8.l0;
            C0LYH c0lyh = (C0LYH) c0lys;
            String str = c0lyh.LIZ;
            if (str == null) {
                str = "";
            }
            aIGCGenerationComponent.n5(str, c0lyh.LIZIZ);
        } else if (c0lys instanceof C0LYG) {
            ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(new AwS587S0100000_8(c0lys, 501));
        } else if (c0lys instanceof C544730LXz) {
            ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(AFwS239S0000000_8.get$arr$(223));
        } else if (c0lys instanceof C0LYF) {
            ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(new AwS587S0100000_8(c0lys, 502));
        } else if (c0lys instanceof C0LYD) {
            ((AIGCGenerationComponent) agS289S0100000_8.l0).show();
            ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(new AwS587S0100000_8(c0lys, 503));
            C0LYD c0lyd = (C0LYD) c0lys;
            if (c0lyd.LIZIZ > 0) {
                ((AIGCGenerationComponent) agS289S0100000_8.l0).i3(AFwS239S0000000_8.get$arr$(224));
                AIGCGenerationComponent aIGCGenerationComponent2 = (AIGCGenerationComponent) agS289S0100000_8.l0;
                aIGCGenerationComponent2.LLJJJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(aIGCGenerationComponent2), null, null, new C0LYP(c0lys, (AIGCGenerationComponent) agS289S0100000_8.l0, null), 3);
            }
            if (c0lyd.LIZ && (cameraApiComponent2 = ((AIGCGenerationComponent) agS289S0100000_8.l0).getCameraApiComponent()) != null && (c2253081DGoIU12 = cameraApiComponent2.IU1()) != null) {
                c2253081DGoIU12.LIZLLL(EnumC545560LaU.EFFECT_DISCOVER_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_EFFECT_DISCOVERY_OPEN, EnumC1641610sox.PAGE_INVISIBLE));
            }
        } else if (c0lys instanceof C0LYK) {
            ((AIGCGenerationComponent) agS289S0100000_8.l0).hide();
            C09AE c09ae = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJJJJJIL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            AIGCGenerationComponent aIGCGenerationComponent3 = (AIGCGenerationComponent) agS289S0100000_8.l0;
            aIGCGenerationComponent3.LLJJJJJIL = null;
            if (((C0LYK) c0lys).LIZ && (cameraApiComponent = aIGCGenerationComponent3.getCameraApiComponent()) != null && (c2253081DGoIU1 = cameraApiComponent.IU1()) != null) {
                c2253081DGoIU1.LIZIZ(EnumC545560LaU.EFFECT_DISCOVER_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_CLOSE_EFFECT_DISCOVER, null), Boolean.FALSE);
            }
        } else if (c0lys instanceof C0LYV) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("aigc_offline_processing_draft_fix__killswitch", false) && C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ) == null) {
                Activity activity3 = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ.mActivity;
                if (activity3 != null) {
                    activity3.finish();
                }
            } else {
                InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ);
                if (interfaceC20597015iiLJ != null) {
                    interfaceC20597015iiLJ.finish();
                }
            }
        } else if (c0lys instanceof C544720LXy) {
            if (AIGCCloseActivityAfterEditPageLaunched.isEnabled()) {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("aigc_offline_processing_draft_fix__killswitch", false) && C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ) == null) {
                    Activity activity4 = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ.mActivity;
                    if (activity4 != null && (function12 = ((C544720LXy) c0lys).LIZ) != null) {
                        function12.invoke(activity4);
                    }
                } else if (C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ) != null && (activity2 = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ.mActivity) != null && (function1 = ((C544720LXy) c0lys).LIZ) != null) {
                    function1.invoke(activity2);
                }
            } else {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("aigc_offline_processing_draft_fix__killswitch", false) && C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ) == null) {
                    Activity activity5 = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ.mActivity;
                    if (activity5 != null) {
                        Function1<Activity, Unit> function13 = ((C544720LXy) c0lys).LIZ;
                        if (function13 != null) {
                            function13.invoke(activity5);
                        }
                        activity5.finish();
                    }
                } else {
                    InterfaceC20597015ii interfaceC20597015iiLJ2 = C20622515mp.LJ(((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ);
                    if (interfaceC20597015iiLJ2 != null && (activity = ((AIGCGenerationComponent) agS289S0100000_8.l0).LLJILJILJ.mActivity) != null) {
                        Function1<Activity, Unit> function14 = ((C544720LXy) c0lys).LIZ;
                        if (function14 != null) {
                            function14.invoke(activity);
                        }
                        interfaceC20597015iiLJ2.finish();
                    }
                }
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$36(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C537020L4i
            if (r0 == 0) goto L3e
            r4 = r7
            X.0L4i r4 = (X.C537020L4i) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3e:
            X.0L4i r4 = new X.0L4i
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$36(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$37(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ViewGroup viewGroupRN;
        TuxIconView tuxIconView;
        int i;
        InterfaceC1623190sLF interfaceC1623190sLFU = ((l0) agS289S0100000_8.l0).U();
        if (interfaceC1623190sLFU != null && (viewGroupRN = interfaceC1623190sLFU.RN()) != null && (tuxIconView = (TuxIconView) viewGroupRN.findViewById(R.id.kg9)) != null) {
            if (obj == null) {
                i = R.dimen.wr;
            } else {
                i = R.dimen.wq;
            }
            C786410Ut5.x5(tuxIconView, C20143013rg.LIZIZ(tuxIconView.getResources(), i));
        }
        return Unit.LIZ;
    }

    public static final Object emit$38(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C557670Lu1) agS289S0100000_8.l0).updateBitmapInternal((Bitmap) ((Pair) obj).getSecond());
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$39(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C557700Lu4
            if (r0 == 0) goto L44
            r4 = r7
            X.0Lu4 r4 = (X.C557700Lu4) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = r6
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L44:
            X.0Lu4 r4 = new X.0Lu4
            r4.<init>(r5, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$39(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$4(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0MM5 c0mm5 = C0MM5.LIZ;
        Context context = (Context) agS289S0100000_8.l0;
        c0mm5.getClass();
        C0MM5.LIZJ(context, (C0MKE) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$40(Y.AgS289S0100000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C553470LnF
            if (r0 == 0) goto L4f
            r5 = r8
            X.0LnF r5 = (X.C553470LnF) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r5.LLILLJJLI
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L3c
            if (r2 != r3) goto L55
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.05f1 r7 = (X.AbstractC1406905f1) r7
            r5.LLILLL = r2
            r5.LLILLJJLI = r0
            java.lang.Object r1 = X.C1406505ex.LIZ(r7, r5)
            if (r1 != r4) goto L41
            return r4
        L3c:
            X.01Wf r2 = r5.LLILLL
            X.C155000ia.LIZIZ(r1)
        L41:
            if (r1 == 0) goto L25
            r0 = 0
            r5.LLILLL = r0
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L25
            return r4
        L4f:
            X.0LnF r5 = new X.0LnF
            r5.<init>(r6, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$40(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$41(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((InterfaceC332260D0u) agS289S0100000_8.l0).setValue(obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$42(Y.AgS289S0100000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C0LCW
            if (r0 == 0) goto L42
            r5 = r8
            X.0LCW r5 = (X.C0LCW) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            X.0LCf r0 = (X.C539070LCf) r0
            X.0LaT r1 = r0.LIZJ
            X.0LaT r0 = X.EnumC545550LaT.COMPLETE
            if (r1 == r0) goto L39
            X.0LaT r0 = X.EnumC545550LaT.FAILED
            if (r1 != r0) goto L22
        L39:
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L42:
            X.0LCW r5 = new X.0LCW
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$42(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$43(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0LX9
            if (r0 == 0) goto L3f
            r4 = r7
            X.0LX9 r4 = (X.C0LX9) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0LXL r6 = (X.C0LXL) r6
            if (r6 == 0) goto L3d
            X.0LSZ r0 = X.C0LXK.LIZJ(r6)
        L34:
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3d:
            r0 = 0
            goto L34
        L3f:
            X.0LX9 r4 = new X.0LX9
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$43(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$44(Y.AgS289S0100000_8 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0LX8
            if (r0 == 0) goto L5a
            r6 = r9
            X.0LX8 r6 = (X.C0LX8) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L60
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r8, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r8.iterator()
        L3d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r1.next()
            X.0LXL r0 = (X.C0LXL) r0
            X.0LSZ r0 = X.C0LXK.LIZJ(r0)
            r2.add(r0)
            goto L3d
        L51:
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L5a:
            X.0LX8 r6 = new X.0LX8
            r6.<init>(r7, r9)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$44(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$45(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        IAIPortraitLauncher iAIPortraitLauncherLIZ;
        String str;
        String str2;
        AIPortraitTabFragment aIPortraitTabFragment = (AIPortraitTabFragment) agS289S0100000_8.l0;
        C19EG activity = aIPortraitTabFragment.getActivity();
        if (activity != null) {
            AIGC.RecallWay recallWay = null;
            IAIPortraitFeatureService iAIPortraitFeatureService = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
            if (iAIPortraitFeatureService != null && (iAIPortraitLauncherLIZ = iAIPortraitFeatureService.LIZ()) != null) {
                AIGCEntranceInfo aIGCEntranceInfo = aIPortraitTabFragment.LLJJ;
                if (aIGCEntranceInfo != null) {
                    str = aIGCEntranceInfo.enterFrom;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (aIGCEntranceInfo != null) {
                    recallWay = aIGCEntranceInfo.recallWay;
                }
                String strValueOf = String.valueOf(recallWay);
                AIGCEntranceInfo aIGCEntranceInfo2 = aIPortraitTabFragment.LLJJ;
                if (aIGCEntranceInfo2 != null && (str2 = aIGCEntranceInfo2.shootWay) != null) {
                    str3 = str2;
                }
                iAIPortraitLauncherLIZ.openAssetHub(activity, str, strValueOf, str3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$46(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj != null) {
            c cVar = (c) agS289S0100000_8.l0;
            a aVar = cVar.LLIZLLLIL;
            if (aVar == null) {
                aVar = null;
            }
            if (!Intrinsics.LJFF(obj, aVar.LJIILJJIL)) {
                a aVar2 = cVar.LLIZLLLIL;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.LJIILJJIL = null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$47(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        h hVar = (h) agS289S0100000_8.l0;
        C0MGL c0mgl = (C0MGL) hVar.LLJJIJI.getValue(hVar, h.LLJJLIIIJLLLLLLLZ[0]);
        if (c0mgl != null) {
            c0mgl.yp0("to_ai_self", -1L);
        }
        return Unit.LIZ;
    }

    public static final Object emit$48(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C0LSZ> list = (List) obj;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_TASK size=");
        sbLIZ.append(list.size());
        C201955140j.LIZLLL(c563650M8t, C538540LAe.LLJJJ, C2188811AlT.LIZIZ(sbLIZ));
        if (list.isEmpty()) {
            ((C538540LAe) agS289S0100000_8.l0).d5();
            return Unit.LIZ;
        }
        ((C538540LAe) agS289S0100000_8.l0).P4(list);
        C538540LAe c538540LAe = (C538540LAe) agS289S0100000_8.l0;
        c538540LAe.K4(list, new AwS552S0100000_8(c538540LAe, 1122), new AwS587S0100000_8((C538540LAe) agS289S0100000_8.l0, 766), new AwS587S0100000_8((C538540LAe) agS289S0100000_8.l0, 768));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$49(Y.AgS289S0100000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C545290La3
            if (r0 == 0) goto L3b
            r4 = r7
            X.0La3 r4 = (X.C545290La3) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0LSZ r6 = (X.C0LSZ) r6
            X.0LY5 r0 = X.C0LXA.LIZ(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3b:
            X.0La3 r4 = new X.0La3
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$49(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$5(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ArrayList<ImportVideoInfo> arrayList;
        boolean zBooleanValue;
        C0MKG c0mkg = (C0MKG) obj;
        C0MM5 c0mm5 = C0MM5.LIZ;
        Context context = (Context) agS289S0100000_8.l0;
        c0mm5.getClass();
        long jLIZ = C0MM5.LIZIZ.LIZ();
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C537520L6g.LIZLLL(intent, c0mkg.LIZ);
        Pair<Integer, Integer> pair = c0mkg.LIZLLL;
        String str = c0mkg.LJ;
        VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(str);
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, videoFileInfoLJIIJ);
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = null;
        EditPreviewInfo editPreviewInfoLIZ = new C538330L9j(pair.getFirst().intValue(), pair.getSecond().intValue(), 12).LIZ(new EditVideoSegment(str, null, videoFileInfoLJIIJ));
        List listSingletonList = Collections.singletonList(editVideoSegment);
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(editPreviewInfoLIZ.getVideoList());
        if (multiEditVideoRecordDataLIZIZ != null) {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it2 = listSingletonList.iterator();
            long duration = 0;
            while (it2.hasNext()) {
                duration += ((EditVideoSegment) it2.next()).getVideoFileInfo().getDuration();
            }
            multiEditVideoRecordDataLIZIZ.endTime = Math.min(duration, C536240L1i.LIZ());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                boolean z = true;
                if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() != 1) {
                    z = false;
                }
                multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        }
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[6];
            int i4 = iArr[8];
            long j = iArr[3];
            arrayList.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, null, null, iArr[7], 1.0f, str, str, false, null, null, 0L, 98304, null));
        }
        C0MUK.LIZIZ(intent).editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = editPreviewInfoLIZ;
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayList;
        C0MMP.LIZ(intent, c0mkg, jLIZ, "share_to_story", "share", "upload");
        CommonMobParamModel commonMobParamModel = C0MUK.LIZIZ(intent).commonMobModel;
        commonMobParamModel.isUploadDirectEnter = true;
        commonMobParamModel.isFromIMShareToStory = true;
        Boolean boolIsIMShareMentionVideoToPost = c0mkg.LIZIZ.isIMShareMentionVideoToPost();
        if (boolIsIMShareMentionVideoToPost != null) {
            zBooleanValue = boolIsIMShareMentionVideoToPost.booleanValue();
        } else {
            zBooleanValue = false;
        }
        commonMobParamModel.isIMShareVideoToPost = zBooleanValue;
        if (C0MKI.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(context, intent, false);
        } else {
            C1660680tJi.LIZ().LJIILIIL(context, intent);
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0MKE c0mke = (C0MKE) obj;
        C0MKE c0mke2 = new C0MKE(c0mke.LIZ, c0mke.LIZIZ, c0mke.LIZJ, c0mke.LIZLLL, c0mke.LJ, c0mke.LJFF, c0mke.LJI, 11, c0mke.LJIIIIZZ);
        C0MM5 c0mm5 = C0MM5.LIZ;
        Context context = (Context) agS289S0100000_8.l0;
        c0mm5.getClass();
        C0MM5.LIZJ(context, c0mke2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.AgS289S0100000_8 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C0MKX
            if (r0 == 0) goto L47
            r7 = r10
            X.0MKX r7 = (X.C0MKX) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.0MKF r9 = (X.C0MKF) r9
            X.0MMG r3 = new X.0MMG
            java.util.List<java.lang.String> r0 = r9.LJ
            java.lang.Object r2 = X.C13LP.LJJJJZI(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 14
            r0 = 0
            r3.<init>(r2, r0, r0, r1)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L47:
            X.0MKX r7 = new X.0MKX
            r7.<init>(r8, r10)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS289S0100000_8.emit$7(Y.AgS289S0100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$8(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz == null) {
            return Unit.LIZ;
        }
        String str = c0lsz.LJ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1179202463) {
            if (iHashCode != 108966002) {
                if (iHashCode == 2066319421 && str.equals("FAILED")) {
                    Object objLIZIZ = ((C557190LtF) agS289S0100000_8.l0).LIZIZ(c0lsz, interfaceC1364105Vn);
                    if (objLIZIZ == C099R.LJFF()) {
                        return objLIZIZ;
                    }
                    return Unit.LIZ;
                }
            } else if (str.equals("FINISHED")) {
                Object objLIZJ = ((C557190LtF) agS289S0100000_8.l0).LIZJ(c0lsz, interfaceC1364105Vn);
                if (objLIZJ == C099R.LJFF()) {
                    return objLIZJ;
                }
                return Unit.LIZ;
            }
        } else if (str.equals("STARTED")) {
            ((C557190LtF) agS289S0100000_8.l0).LIZLLL(c0lsz);
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS289S0100000_8 agS289S0100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz == null) {
            return Unit.LIZ;
        }
        String str = c0lsz.LJ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1179202463) {
            if (iHashCode != 108966002) {
                if (iHashCode == 2066319421 && str.equals("FAILED")) {
                    Object objLIZIZ = ((C557190LtF) agS289S0100000_8.l0).LIZIZ(c0lsz, interfaceC1364105Vn);
                    if (objLIZIZ == C099R.LJFF()) {
                        return objLIZIZ;
                    }
                    return Unit.LIZ;
                }
            } else if (str.equals("FINISHED")) {
                Object objLIZJ = ((C557190LtF) agS289S0100000_8.l0).LIZJ(c0lsz, interfaceC1364105Vn);
                if (objLIZJ == C099R.LJFF()) {
                    return objLIZJ;
                }
                return Unit.LIZ;
            }
        } else if (str.equals("STARTED")) {
            ((C557190LtF) agS289S0100000_8.l0).LIZLLL(c0lsz);
        }
        return Unit.LIZ;
    }
}
