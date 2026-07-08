package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580850MqJ extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C580850MqJ(android.view.View.OnClickListener r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            int r5 = 9 - r5
            if (r5 == 0) goto Lf
            r2 = r3
            r2.l0 = r4
            r1 = 3
            r0 = 0
        Lb:
            r2.<init>(r0, r1)
            return
        Lf:
            r2 = r3
            r2.l0 = r4
            r1 = 2
            r0 = 1000(0x3e8, float:1.401E-42)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580850MqJ.<init>(android.view.View$OnClickListener, int):void");
    }

    public static final void LIZ$0(C580850MqJ c580850MqJ, View view) {
        ((C529750Kq5) c580850MqJ.l0).LLJI.performClick();
    }

    public static final void LIZ$1(C580850MqJ c580850MqJ, View view) {
        C526910KlV.LLLLLL((C526910KlV) c580850MqJ.l0, false, true, 5);
    }

    public static final void LIZ$10(C580850MqJ c580850MqJ, View view) {
        ((View.OnClickListener) c580850MqJ.l0).onClick(view);
    }

    public static final void LIZ$11(C580850MqJ c580850MqJ, View view) {
        ((View.OnClickListener) c580850MqJ.l0).onClick(view);
    }

    public static final void LIZ$12(C580850MqJ c580850MqJ, View view) {
        ((View.OnClickListener) c580850MqJ.l0).onClick(view);
    }

    public static final void LIZ$13(C580850MqJ c580850MqJ, View view) {
        ((C0LAO) c580850MqJ.l0).S();
    }

    public static final void LIZ$14(C580850MqJ c580850MqJ, View view) {
        if (((C0LAO) c580850MqJ.l0).LLLLLLZ()) {
            ((C0LAO) c580850MqJ.l0).LLLLIL().LIZ.invoke();
            return;
        }
        ((C0LAO) c580850MqJ.l0).LLLLLZL();
        C0LAO c0lao = (C0LAO) c580850MqJ.l0;
        C0LAX c0lax = c0lao.LLJJJIL.get(c0lao.LLLLILI().LIZ.LIZ);
        if (c0lax != null) {
            c0lax.LIZ();
        }
        C0LAF c0laf = C0LAF.LIZ;
        String str = ((C0LAO) c580850MqJ.l0).LLLLILI().LIZ.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((C0LAO) c580850MqJ.l0).LLLLILI().LIZ.LIZJ;
        c0laf.getClass();
        C0LAF.LIZIZ(videoPublishEditModel, str, "click_confirm");
    }

    public static final void LIZ$15(C580850MqJ c580850MqJ, View view) {
        j jVar = C524780Ki4.LIZ;
        jVar.start("av_video_edit", "click onNext btn");
        if (C298330Bmh.LIZ()) {
            jVar.start("av_video_editor_init", "click onNext btn");
        }
        C526760KlG c526760KlG = (C526760KlG) c580850MqJ.l0;
        if (!c526760KlG.LLJILLL) {
            C526940KlY c526940KlY = c526760KlG.LLILZIL;
            if (c526940KlY == null) {
                c526940KlY = null;
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833193);
            creativeToastBuilder.isTuxToast(true);
            C1390380mHk.LIZLLL(c526940KlY, 3041, creativeToastBuilder);
            C526760KlG c526760KlG2 = (C526760KlG) c580850MqJ.l0;
            c526760KlG2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", c526760KlG2.LL);
            c2344009Gk.LJIIIIZZ("shoot_way", c526760KlG2.LLILLJJLI);
            c2344009Gk.LJIIIIZZ("enter_from", c526760KlG2.LLILZ);
            c2344009Gk.LJIIIIZZ("fail_type", "no_video");
            C20684815ws.LJIILLIIL("upload_sound_from_video_popup_show", c2344009Gk.LIZ);
            C526760KlG c526760KlG3 = (C526760KlG) c580850MqJ.l0;
            InterfaceC528020KnI interfaceC528020KnI = c526760KlG3.LLIZLLLIL;
            if (interfaceC528020KnI != null) {
                interfaceC528020KnI.LIZLLL(c526760KlG3.LLILZLL, false);
                return;
            }
            return;
        }
        InterfaceC528020KnI interfaceC528020KnI2 = c526760KlG.LLIZLLLIL;
        if (interfaceC528020KnI2 != null) {
            interfaceC528020KnI2.LIZLLL(c526760KlG.LLILZLL, true);
        }
    }

    public static final void LIZ$2(C580850MqJ c580850MqJ, View view) {
        TuxTextView tuxTextView = ((C530520KrK) c580850MqJ.l0).LLJILJIL;
        if (tuxTextView != null) {
            C530520KrK.LIZJ(tuxTextView);
        }
        Function0<Unit> function0 = ((C530520KrK) c580850MqJ.l0).LLJJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$3(C580850MqJ c580850MqJ, View view) {
        ((VideoImageMixedController) c580850MqJ.l0).LLJJIJIIJIL.invoke();
    }

    public static final void LIZ$4(C580850MqJ c580850MqJ, View view) {
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        ShortVideoContext shortVideoContext = ((VideoImageMixedController) c580850MqJ.l0).LL;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
            creativeModel2.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        }
        ShortVideoContext shortVideoContext2 = ((VideoImageMixedController) c580850MqJ.l0).LL;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null) {
            creativeModel.liveRecordModel = new LiveRecordModel(new ArrayList());
        }
        ((VideoImageMixedController) c580850MqJ.l0).LJJIIJZLJL(view, false, false, false, false, false, false);
    }

    public static final void LIZ$5(C580850MqJ c580850MqJ, View view) {
        Context context;
        CreativeModel creativeModel;
        VideoImageMixedController videoImageMixedController = (VideoImageMixedController) c580850MqJ.l0;
        AbstractC529520Kpi abstractC529520Kpi = null;
        editorProSchemeModel = null;
        EditorProSchemeModel editorProSchemeModel = null;
        if (!videoImageMixedController.LLLLLILLIL) {
            ShortVideoContext shortVideoContext = videoImageMixedController.LL;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
                editorProSchemeModel = creativeModel.editorProSchemeModel;
            }
            if (C537970L7z.LIZJ(editorProSchemeModel)) {
                ArrayList<TikTokMediaModel> arrayList = ((VideoImageMixedController) c580850MqJ.l0).LLJJLIIIJLLLLLLLZ;
                ArrayList arrayList2 = new ArrayList();
                for (TikTokMediaModel tikTokMediaModel : arrayList) {
                    if (!tikTokMediaModel.LJIIJ()) {
                        arrayList2.add(tikTokMediaModel);
                    }
                }
                if (arrayList2.isEmpty() && (context = view.getContext()) != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131833193);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 3041, creativeToastBuilder);
                    return;
                }
                return;
            }
            return;
        }
        if (videoImageMixedController.LJJLIIIJ() && C290470Ba1.LIZ()) {
            VideoImageMixedController videoImageMixedController2 = (VideoImageMixedController) c580850MqJ.l0;
            InterfaceC524200Kh8 interfaceC524200Kh8 = videoImageMixedController2.LLLIIII;
            if (interfaceC524200Kh8 != null) {
                AbstractC529520Kpi abstractC529520Kpi2 = videoImageMixedController2.LLJJJJLIIL;
                if (abstractC529520Kpi2 != null) {
                    abstractC529520Kpi = abstractC529520Kpi2;
                }
                interfaceC524200Kh8.LIZ(VideoImageMixedController.LJJJJJL(abstractC529520Kpi.LL));
                return;
            }
            return;
        }
        VideoImageMixedController videoImageMixedController3 = (VideoImageMixedController) c580850MqJ.l0;
        InterfaceC524200Kh8 interfaceC524200Kh82 = videoImageMixedController3.LLLIIII;
        if (interfaceC524200Kh82 == null) {
            return;
        }
        interfaceC524200Kh82.LIZ(videoImageMixedController3.LJJJJZI());
    }

    public static final void LIZ$6(C580850MqJ c580850MqJ, View view) {
        boolean z;
        if (((VideoImageMixedController) c580850MqJ.l0).LJJIIZ()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131828261);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZLLL(view, 9005, creativeToastBuilder);
            ArrayList<TikTokMediaModel> arrayListLJJJJZI = ((VideoImageMixedController) c580850MqJ.l0).LJJJJZI();
            if ((arrayListLJJJJZI instanceof Collection) && arrayListLJJJJZI.isEmpty()) {
                z = true;
            } else {
                Iterator<TikTokMediaModel> it2 = arrayListLJJJJZI.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().LJIIJ()) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            C522180Kds.LIZ.getClass();
            C522180Kds.LIZIZ("upload_page", "edit", !z, true);
            return;
        }
        ((VideoImageMixedController) c580850MqJ.l0).LJJIIJZLJL(view, true, false, false, false, false, false);
    }

    public static final void LIZ$7(C580850MqJ c580850MqJ, View view) {
        ((VideoImageMixedController) c580850MqJ.l0).LJJIIJZLJL(view, false, false, true, false, false, false);
    }

    public static final void LIZ$8(C580850MqJ c580850MqJ, View view) {
        ((VideoImageMixedController) c580850MqJ.l0).LLJJIJIIJIL.invoke();
    }

    public static final void LIZ$9(C580850MqJ c580850MqJ, View view) {
        ((View.OnClickListener) c580850MqJ.l0).onClick(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580850MqJ(C529750Kq5 c529750Kq5, int i) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        this.l0 = c529750Kq5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580850MqJ(Object obj, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580850MqJ(Object obj, int i, int i2) {
        super(1100, 2);
        this.$t = i;
        this.l0 = obj;
    }
}
