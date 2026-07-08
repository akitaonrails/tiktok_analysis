package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS106S0400000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS35S1400000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS8S3300000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MES, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MES {
    public static final C0MES LIZ = new C0MES();
    public static C214799194j LIZIZ;

    public static void LIZLLL(C19A3 c19a3) {
        C214799194j c214799194j = LIZIZ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
            c19a3.remove(c214799194j);
        }
        LIZIZ = null;
    }

    public static void LJ(C0MET c0met) {
        Context context = c0met.LIZ;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = c0met.LIZIZ;
        C1391820mK4.LIZIZ(c1397580mTM, c0hti.LIZ(context));
        c1397580mTM.LJI(c0met.LIZJ);
        c1397580mTM.LIZIZ(c0met.LIZLLL);
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(c0met, 382));
        c1397580mTM.LJ(new AwS587S0100000_8(c0met, 383));
        c1397580mTM.LIZLLL(new AwS587S0100000_8(c0met, 384));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static AILiveDialogConfigList.AILiveDialogConfig LIZJ(Integer num, String str, String str2) {
        String str3;
        String strLIZJ = C545800Las.LIZJ(str);
        String strValueOf = String.valueOf(num);
        Map mapLJ = (Map) C0C64.LJIILLIIL().LJJII(Map.class, AILiveDialogConfigList.LIZ, "ai_alive_dialog_config", true);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (!mapLJ.isEmpty() && strLIZJ != null && strLIZJ.length() != 0 && strValueOf.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            sbLIZ.append('_');
            sbLIZ.append(strValueOf);
            try {
                AILiveDialogConfigList.AILiveDialogConfig aILiveDialogConfig = (AILiveDialogConfigList.AILiveDialogConfig) GsonProtectorUtils.fromJson(new Gson(), GsonProtectorUtils.toJson(new Gson(), mapLJ.getOrDefault(C2188811AlT.LIZIZ(sbLIZ), null)), AILiveDialogConfigList.AILiveDialogConfig.class);
                if (aILiveDialogConfig != null && (str3 = aILiveDialogConfig.action) != null) {
                    if (str3.length() != 0 && aILiveDialogConfig != null) {
                        if (C1533950q1J.LJ(str2)) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            aILiveDialogConfig.subtitle = str2;
                        }
                        if (aILiveDialogConfig.cancelBtn.length() == 0) {
                            aILiveDialogConfig.cancelBtn = C0MED.LIZ(C0MEB.POST_POP_UP_PHOTO_ERROR_CTA_NOT, new Object[0]);
                        }
                        String str4 = aILiveDialogConfig.action;
                        if (Intrinsics.LJFF(str4, C0MEC.FAIL_QUOTA.getValue())) {
                            aILiveDialogConfig.topIcon = R.drawable.uo;
                            if (aILiveDialogConfig.title.length() == 0) {
                                aILiveDialogConfig.title = C0MED.LIZ(C0MEB.POST_POP_UP_NO_TRIES_TITLE, new Object[0]);
                            }
                            if (aILiveDialogConfig.subtitle.length() == 0) {
                                aILiveDialogConfig.subtitle = C0MED.LIZ(C0MEB.POST_POP_UP_NO_TRIES_DESC, Integer.valueOf(C290650BaJ.LIZ()));
                            }
                            if (aILiveDialogConfig.confirmBtn.length() == 0) {
                                aILiveDialogConfig.confirmBtn = C0MED.LIZ(C0MEB.POST_POP_UP_NO_TRIES_CTA_NOTIFY, new Object[0]);
                            }
                            aILiveDialogConfig.btnVertical = false;
                        } else {
                            if (Intrinsics.LJFF(str4, C0MEC.FAIL_CHANGE_PROMPT.getValue())) {
                                aILiveDialogConfig.topIcon = R.drawable.qp;
                                if (aILiveDialogConfig.title.length() == 0) {
                                    aILiveDialogConfig.title = C0MED.LIZ(C0MEB.POST_POP_UP_PROMPT_ERROR_TITLE, new Object[0]);
                                }
                                if (aILiveDialogConfig.subtitle.length() == 0) {
                                    aILiveDialogConfig.subtitle = C0MED.LIZ(C0MEB.POST_POP_UP_PROMPT_ERROR_DESC, new Object[0]);
                                }
                                if (aILiveDialogConfig.confirmBtn.length() == 0) {
                                    aILiveDialogConfig.confirmBtn = C0MED.LIZ(C0MEB.POST_POP_UP_PROMPT_ERROR_CTA_CHANGE, new Object[0]);
                                }
                                aILiveDialogConfig.btnVertical = true;
                                return aILiveDialogConfig;
                            }
                            if (Intrinsics.LJFF(str4, C0MEC.FAIL_CHANGE_IMAGE.getValue())) {
                                aILiveDialogConfig.topIcon = R.drawable.re;
                                if (aILiveDialogConfig.title.length() == 0) {
                                    aILiveDialogConfig.title = C0MED.LIZ(C0MEB.POST_POP_UP_PHOTO_ERROR_TITLE, new Object[0]);
                                }
                                if (aILiveDialogConfig.subtitle.length() == 0) {
                                    aILiveDialogConfig.subtitle = C0MED.LIZ(C0MEB.POST_POP_UP_PHOTO_ERROR_DESC, new Object[0]);
                                }
                                if (aILiveDialogConfig.confirmBtn.length() == 0) {
                                    aILiveDialogConfig.confirmBtn = C0MED.LIZ(C0MEB.POST_POP_UP_PHOTO_ERROR_CTA_CHANGE, new Object[0]);
                                }
                                aILiveDialogConfig.btnVertical = true;
                                return aILiveDialogConfig;
                            }
                        }
                        return aILiveDialogConfig;
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static void LIZ(Context context, SpannableStringBuilder spannableStringBuilder, String str, Function0 function0) {
        C580750Mq9 c580750Mq9 = new C580750Mq9(function0, 0);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, str, 0, false, 6);
        int length = str.length() + iLJJJ;
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, c580750Mq9, iLJJJ, length, 33);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, true), iLJJJ, length, 33);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.ee, context)), iLJJJ, length, 33);
        }
    }

    public static void LJII(Context context, VideoPublishEditModel videoPublishEditModel, Function0 function0, Function0 function02) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_ai_star;
        c1397580mTM.LJIIIZ = new C340190DVh(0, context, c419910GdJ.LIZ(context));
        c1397580mTM.LJI(C0MED.LIZ(C0MEB.EDITING_PAGE_LEAVE_POP_UP_TITLE, new Object[0]));
        c1397580mTM.LIZIZ(C0MED.LIZ(C0MEB.EDITING_PAGE_LEAVE_POP_UP_BODY, new Object[0]));
        C985403tE.LIZ(c1397580mTM, new AwS106S0400000_8(context, videoPublishEditModel, function02, function0, 3));
        c1397580mTM.LJ(new AwS587S0100000_8(videoPublishEditModel, 385));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static SpannableStringBuilder LIZIZ(Context context, VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str, String str2, String str3, Function0 function0) {
        String strLIZ = C0MED.LIZ(C0MEB.EDITING_PAGE_INTRO_SHEET_DISCLAIMER_PLACEHOLDER, new Object[0]);
        String strLIZ2 = C0MED.LIZ(C0MEB.EDITING_PAGE_INTRO_SHEET_DISCLAIMER_PLACEHOLDER2, new Object[0]);
        String strLIZ3 = C0MED.LIZ(C0MEB.EDITING_PAGE_INTRO_SHEET_DISCLAIMER_LEARN_MORE_LINK, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0MED.LIZ(C0MEB.EDITING_PAGE_INTRO_SHEET_DISCLAIMER, strLIZ, strLIZ2, strLIZ3));
        LIZ(context, spannableStringBuilder, strLIZ, new AwS8S3300000_8(context, videoPublishEditModel, shortVideoContext, str, str2, str3, 0));
        LIZ(context, spannableStringBuilder, strLIZ2, new AwS8S3300000_8(function0, (Function0<Unit>) videoPublishEditModel, (VideoPublishEditModel) shortVideoContext, (ShortVideoContext) str, str2, str3, (String) 1));
        LIZ(context, spannableStringBuilder, strLIZ3, new AwS8S3300000_8(context, videoPublishEditModel, shortVideoContext, str, str2, str3, 2));
        return spannableStringBuilder;
    }

    public static void LJFF(Context context, C19A3 c19a3, VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str, int i, Function0 function0, Function0 function02, Function0 function03) {
        C0M8O.LIZ.getClass();
        C0M8O.LJ();
        String strLIZ = C2539709xL.LIZ();
        C0MF5.LIZ.getClass();
        final C0MFM c0mfm = new C0MFM(strLIZ, C0MF5.LIZJ(), LIZIZ(context, videoPublishEditModel, shortVideoContext, str, null, null, new AwS252S0300000_8(c19a3, (C19A3) function0, (Function0<Unit>) function02, (Function0<Unit>) 22)), new AwS35S1400000_8(c19a3, (C19A3) function0, (Function0<Unit>) videoPublishEditModel, (VideoPublishEditModel) shortVideoContext, (ShortVideoContext) str, (String) 1), new AwS35S1400000_8(c19a3, (C19A3) function03, (Function0<Unit>) videoPublishEditModel, (VideoPublishEditModel) shortVideoContext, (ShortVideoContext) str, (String) 2), new AwS35S1400000_8(c19a3, (C19A3) function02, (Function0<Unit>) videoPublishEditModel, (VideoPublishEditModel) shortVideoContext, (ShortVideoContext) str, (String) 3));
        Scene scene = new Scene(c0mfm) { // from class: X.0MEV
            public final C0MFM LLJI;

            {
                this.LLJI = c0mfm;
            }

            @Override // com.bytedance.scene.Scene
            public final void onViewCreated(View view, Bundle bundle) {
                super.onViewCreated(view, bundle);
                if (Build.VERSION.SDK_INT >= 35) {
                    C14K9.LJIJJ(this.mView, new C0TVI() { // from class: X.0DMD
                        @Override // X.C0TVI
                        public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                            C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                            view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                            return c20246014Ju;
                        }
                    });
                }
                new C0MFL(this.LLJI, getLifecycle(), view, requireSceneContext());
            }

            @Override // com.bytedance.scene.Scene
            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return C786410Ut5.Td(layoutInflater, R.layout.sz, viewGroup, false);
            }
        };
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        C18YA c18ya = new C18YA();
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLJJIJI = true;
        c214799194j.LLJILLL = i;
        c214799194j.LLJJ = "EditAIGCGuideDialogScene";
        c214799194j.LLJJI = scene;
        c214799194j.LLJJLIIIJLLLLLLLZ = false;
        c18ya.LIZIZ(EnumC214804194o.FREEDOM_HEIGHT);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLLII = true;
        c214799194j2.LLLFZ = false;
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c19a3, 586);
        C214799194j c214799194j3 = c18ya.LIZ;
        c214799194j3.LLJLLL = awS552S0100000_8;
        c214799194j3.LLJLILLLLZIIL = creativeBottomSheetBehavior;
        LIZIZ = c214799194j3;
        c214799194j3.LLLLL(c19a3);
        C564410MBr.LIZ.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "show", str, null, null);
    }
}
