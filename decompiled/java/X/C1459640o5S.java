package X;

import Y.ALAdapterS5S0200000_8;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS105S0201000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS73S0210000_22;
import x4l.a;

/* JADX INFO: renamed from: X.0o5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459640o5S implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final LifecycleOwner LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664740tQG LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459640o5S.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459640o5S.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459640o5S.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459640o5S.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void LJIJJ() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLIZ[2])).g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
            return;
        }
        slots.size();
    }

    public final C1460620o72 LJJIIJZLJL() {
        int iIntValue;
        int iLIZIZ = 2131833230;
        String string = ((Context) this.LLILLL.getValue(this, LLIZ[0])).getString(2131833230);
        if (C338630DPh.LIZ() || u4.LJJIIZ(LJJIJIIJI())) {
            C1455810nzH.LIZ.getClass();
            string = C1455810nzH.LIZ();
            iLIZIZ = C1455810nzH.LIZIZ();
        }
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(270);
            int iIntValue2 = ((Number) C0APS.LIZ.getValue()).intValue();
            iIntValue = iIntValue2 != 1 ? iIntValue2 != 2 ? ((Number) aFwS210S0000000_22.invoke()).intValue() : R.raw.icon_color_create : R.raw.icon_color_track;
        } else {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 2, "studio_change_editor_pro_icon", true);
            iIntValue = iLJIJ != 1 ? iLJIJ != 2 ? iLJIJ != 3 ? R.raw.icon_video_play_split_fill : R.raw.icon_split_horizontal_bars : R.raw.icon_adjust : R.raw.icon_split_half_fill;
        }
        return new C1460620o72(15, -1, iLIZIZ, string, iIntValue, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8160);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1460620o72 LJJIIZI() {
        /*
            r20 = this;
            X.0o72 r6 = new X.0o72
            r7 = 21
            r8 = 0
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            java.lang.String r2 = "tt_photo_template_enable_show_entrance"
            r0 = 31744(0x7c00, float:4.4483E-41)
            r1 = 1
            boolean r0 = r3.LJIIIZ(r0, r2, r1, r8)
            if (r0 == 0) goto Lc0
            r9 = 2131829980(0x7f1124dc, float:1.9292944E38)
        L17:
            r10 = 0
            X.0tF6 r0 = X.C1657820tF6.LIZ
            r0.getClass()
            boolean r0 = X.C1657820tF6.LIZIZ()
            if (r0 == 0) goto Lbb
            r11 = 2130773440(0x7f0105c0, float:1.7150027E38)
        L26:
            boolean r0 = X.C299100Bnw.LIZ()
            if (r0 == 0) goto Lb9
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r20.LJJIJIIJI()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJJJZ(r0)
            if (r0 == 0) goto Lb9
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r20.LJJIJIIJI()
            boolean r0 = X.C1417220mz2.LIZ(r0)
            if (r0 != 0) goto Lb9
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r20.LJJIJIIJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r2 = r0.autoCutModel
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r20.LJJIJIIJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r5 = X.C1403130mcJ.LIZJ(r0)
            boolean r4 = X.C299100Bnw.LIZ()
            int r3 = r2.curSource
            X.0MJ9 r0 = X.C0MJ9.MIX_EDITING
            int r0 = r0.ordinal()
            if (r3 != r0) goto L62
            if (r4 == 0) goto Lb9
        L62:
            if (r5 == 0) goto Lb9
            r0 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            X.0mre r0 = X.EnumC1412640mre.DESIGNER_FIXED_TEMPLATE
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r8] = r0
            X.0mre r0 = X.EnumC1412640mre.ALGORITHM_TEMPLATE
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            X.0mre r0 = X.EnumC1412640mre.CUT_SAME
            int r0 = r0.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r3[r0] = r1
            X.0mre r0 = X.EnumC1412640mre.PUGC_TEMPLATE
            int r0 = r0.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 3
            r3[r0] = r1
            java.util.Set r1 = X.C13LQ.LJLIIL(r3)
            int r0 = r2.curTemplateType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb9
            r13 = 1
        Laa:
            r19 = 8106(0x1faa, float:1.1359E-41)
            r12 = r10
            r14 = r8
            r15 = r10
            r16 = r10
            r17 = r8
            r18 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r6
        Lb9:
            r13 = 0
            goto Laa
        Lbb:
            r11 = 2130774856(0x7f010b48, float:1.7152899E38)
            goto L26
        Lc0:
            r9 = 2131829812(0x7f112434, float:1.9292604E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459640o5S.LJJIIZI():X.0o72");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1460620o72 LJJIJ() {
        /*
            r17 = this;
            r2 = r17
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LJJIJIIJI()
            java.lang.String r1 = r0.mShootWay
            java.lang.String r0 = "editing_effect_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LJJIJIIJI()
            java.lang.String r1 = r0.mShootWay
            java.lang.String r0 = "editing_effect_template"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L77
            boolean r0 = X.C0F4Z.LIZ()
            if (r0 == 0) goto L73
            r5 = 2130971762(0x7f040c72, float:1.7552272E38)
        L27:
            X.0o72 r3 = new X.0o72
            r4 = 2
            r6 = 2131833490(0x7f113292, float:1.9300064E38)
            r7 = 0
            X.0tF6 r0 = X.C1657820tF6.LIZ
            r0.getClass()
            boolean r0 = X.C1657820tF6.LIZIZ()
            if (r0 == 0) goto L6f
            r8 = 2130773150(0x7f01049e, float:1.7149439E38)
        L3c:
            X.0tQH r1 = r2.LLILZIL
            X.1Bqa<java.lang.Object>[] r0 = X.C1459640o5S.LLIZ
            r0 = r0[r4]
            java.lang.Object r1 = r1.getValue(r2, r0)
            X.0nzM r1 = (X.InterfaceC1455860nzM) r1
            boolean r0 = r1 instanceof X.InterfaceC1446740nke
            if (r0 == 0) goto L6d
            X.0nke r1 = (X.InterfaceC1446740nke) r1
            r10 = 1
            if (r1 == 0) goto L6d
            boolean r0 = r1.eS0()
            if (r0 != r10) goto L6d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LJJIJIIJI()
            boolean r0 = X.C1459800o5i.LIZ(r0)
            if (r0 != 0) goto L6d
        L61:
            r11 = 0
            r16 = 8104(0x1fa8, float:1.1356E-41)
            r9 = r7
            r12 = r7
            r13 = r7
            r14 = r11
            r15 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L6d:
            r10 = 0
            goto L61
        L6f:
            r8 = 2130773643(0x7f01068b, float:1.7150438E38)
            goto L3c
        L73:
            r5 = 2130971999(0x7f040d5f, float:1.7552752E38)
            goto L27
        L77:
            r5 = 2130971341(0x7f040acd, float:1.7551418E38)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459640o5S.LJJIJ():X.0o72");
    }

    public final VideoPublishEditModel LJJIJIIJI() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public static C1460620o72 LJJIIZ() {
        int i = C0C1F.LIZ() ? 2131858287 : 2131858286;
        C1657820tF6.LIZ.getClass();
        return new C1460620o72(20, 0, i, (String) null, C1657820tF6.LIZIZ() ? R.raw.icon_color_mic_star : R.raw.icon_audio_editing_microphone, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8160);
    }

    public final boolean LJJIJIIJIL() {
        return LJJIJIIJI().isEnterFromBulletin();
    }

    public final boolean LJJIJIL() {
        DMMediaModel dMMediaModel;
        return LJJIJIIJI().isEnterFromDM() && (dMMediaModel = LJJIJIIJI().creativeModel.dmMediaModel) != null && dMMediaModel.type == 2;
    }

    public final boolean LJJIJL() {
        NowsShootModel nowsShootModel;
        return C1428470nHB.LJJLIIIJLLLLLLLZ(LJJIJIIJI()) && ((nowsShootModel = LJJIJIIJI().creativeModel.nowsShootModel) == null || nowsShootModel.type != 0) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_photo_support_effect_and_audio", true, false);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public static void LJIIJJI(List list) {
        int i;
        if (!C1429350nIb.LIZ) {
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                i = R.raw.icon_color_filter;
            } else {
                i = R.raw.icon_camera_filter_fill;
            }
            ((ArrayList) list).add(new C1460620o72(5, -1, R.string.jlc, (String) null, i, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
        }
    }

    public final void LIZ(List<C1460620o72> list) {
        int i;
        if (C295910Bin.LIZ()) {
            if ((C295910Bin.LIZJ() == 2 || C295910Bin.LIZJ() == 3) && C1428470nHB.LJJJJI(LJJIJIIJI()) && !C1403860mdU.LIZ(LJJIJIIJI(), true)) {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    i = R.raw.icon_color_caption_ai;
                } else {
                    i = R.raw.icon_caption_ai;
                }
                ((ArrayList) list).add(new C1460620o72(26, 0, 2131820738, (String) null, i, (Function1) null, C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false), 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8104));
            }
        }
    }

    public final void LIZIZ(List<C1460620o72> list) {
        int i;
        EnumC1462540oA8 enumC1462540oA8;
        if (!C565160MEo.LIZIZ(LJJIJIIJI())) {
            return;
        }
        LJJIJIIJI().getAILivePhotoModel().LJIILLIIL(AFwS239S0000000_8.get$arr$(381));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_editor_toolbar_optimize", true, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_icon_default_white", true, false)) {
            i = R.raw.icon_color_live_photo_gradient;
        } else {
            i = R.raw.icon_color_live_photo_ai;
        }
        boolean zLJIIZILJ = LJJIJIIJI().getAILivePhotoModel().LJIIZILJ();
        if (LJJIJIIJI().getAILivePhotoModel().LJIIZILJ()) {
            enumC1462540oA8 = EnumC1462540oA8.APPLIED;
        } else if (LJJIJIIJI().getAILivePhotoModel().LJIIIZ()) {
            enumC1462540oA8 = EnumC1462540oA8.PROGRESS;
        } else {
            enumC1462540oA8 = EnumC1462540oA8.DEFAULT;
        }
        ProgressModel progressModelLIZIZ = LJJIJIIJI().getAILivePhotoModel().LIZIZ();
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C1460620o72(1800, -1, 2131820718, (String) null, i, new AwS601S0100000_22(this, 906), zLJIIZILJ, 0, enumC1462540oA8, new C1659490tHn(Long.valueOf(progressModelLIZIZ.remainTime), Integer.valueOf(progressModelLIZIZ.progress), progressModelLIZIZ.stateMsg, Integer.valueOf(progressModelLIZIZ.remainTimeStage)), LJJIJIIJI().getAILivePhotoModel().LJIIIZ(), 0, 6280));
    }

    public final void LJ(List<C1460620o72> list) {
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(LJJIJIIJI())) {
            if (C365020ESu.LIZ(LJJIJIIJI())) {
                if (a.LIZIZ() && (!a.LIZIZ() || !C1428540nHI.LIZ())) {
                    return;
                }
            } else {
                return;
            }
        }
        boolean zLJLJJI = u4.LJLJJI(LJJIJIIJI());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditToolbarItemModelFactory -> model.supportCutFeature() = ");
        sbLIZ.append(zLJLJJI);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (zLJLJJI || C1417210mz1.LIZJ(LJJIJIIJI())) {
            ((ArrayList) list).add(LJJIIJZLJL());
        }
    }

    public final void LJFF(List<C1460620o72> list) {
        if (!C1444940nhk.LJFF(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIIIZZ(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIL(LJJIJIIJI().getCanvasVideoData()) && !LJJIJIL() && !LJJIJIIJIL() && !LJJIJL() && u4.LJI(LJJIJIIJI())) {
            ((ArrayList) list).add(LJJIIZ());
        }
    }

    public final void LJI(List<C1460620o72> list) {
        boolean zLIZ;
        if (!((CreativeToolsEntranceReversalConfig) C1439110nYL.LIZIZ.getValue()).hideNoiseReduceOnEditPage && !C1444940nhk.LJIIJ(LJJIJIIJI().getCanvasVideoData()) && C1446580nkO.LIZ() && !((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
            if (LJJIJIIJI().getOrigin() == 1) {
                zLIZ = C0A1O.LIZ();
            } else {
                Keva keva = C1446590nkP.LIZ;
                zLIZ = C1446590nkP.LIZ.getBoolean("audio_music_sound", C0A1O.LIZ());
            }
            ((ArrayList) list).add(new C1460620o72(14, -1, 2131838191, (String) null, R.raw.icon_camera_denoise, (Function1) null, zLIZ, R.attr.ee, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 7976));
        }
    }

    public final void LJII(List<C1460620o72> list) {
        if (C1417160myw.LJIJJ(null, LJJIJIIJI())) {
            ((ArrayList) list).add(LJJIIZI());
        }
    }

    public final void LJIIIIZZ(List<C1460620o72> list) {
        int i;
        if (C1403850mdT.LIZ(LJJIJIIJI())) {
            if ((C1403850mdT.LJIIJJI(LJJIJIIJI()) || u4.LJI(LJJIJIIJI())) && !C1444940nhk.LJIIIIZZ(LJJIJIIJI().getCanvasVideoData()) && !LJJIJIL() && !LJJIJIIJIL() && !LJJIJIIJI().isCutSameVideoType() && !u4.LJJIJ(LJJIJIIJI())) {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    i = R.raw.icon_color_closed_caption;
                } else {
                    i = R.raw.icon_closed_caption_fill;
                }
                ((ArrayList) list).add(new C1460620o72(11, -1, 2131826898, (String) null, i, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
        }
    }

    public final void LJIIIZ(List<C1460620o72> list) {
        ImageAlbumData imageAlbumData;
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(LJJIJIIJI())) {
            if (C365020ESu.LIZ(LJJIJIIJI())) {
                if (a.LIZIZ() && (!a.LIZIZ() || !C1428540nHI.LIZ())) {
                    return;
                }
            } else {
                return;
            }
        }
        if (u4.LJLJJI(LJJIJIIJI()) || (C0BMN.LIZ() && C338630DPh.LIZ())) {
            if (C295670BiP.LIZ() && (imageAlbumData = LJJIJIIJI().getImageAlbumData()) != null && C1413430msv.LJIIJ(imageAlbumData) > 0) {
                return;
            }
            LJJIII(list, new C1459740o5c(this));
        }
    }

    public final void LJIIJ(List<C1460620o72> list) {
        if (!LJJIJIL() && !LJJIJIIJIL() && !LJJIJL()) {
            LJJIII(list, new C1459750o5d(this));
        }
    }

    public final void LJIILIIL(List<C1460620o72> list) {
        int i;
        if (!C0MDL.LIZJ(LJJIJIIJI())) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_editor_toolbar_optimize", true, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_icon_default_white", true, false)) {
            i = R.raw.icon_color_live_photo_gradient;
        } else {
            i = R.raw.icon_color_live_photo_ai;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C1460620o72(1800, -1, 2131820718, (String) null, i, (Function1) new AwS601S0100000_22(this, 907), false, 0, EnumC1462540oA8.DEFAULT, (C1659490tHn) null, false, 0, 7880));
    }

    public final void LJIILJJIL(List<C1460620o72> list) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        if ((LJJIJIIJI().isLivePhotoEdit() || C565160MEo.LJII(LJJIJIIJI()) || LJJIJIIJI().isImageLivePhotoEdit()) && !LJJIJIIJI().creativeModel.imageEditModel.enterFromImageMode) {
            if ((!C1416310mxZ.LJJJI(LJJIJIIJI()) || C1428470nHB.LJJZZI(LJJIJIIJI())) && !C1874810yt5.LIZ(LJJIJIIJI().creativeModel.autoPickModel)) {
                if (C1428470nHB.LJJZZI(LJJIJIIJI())) {
                    livePhotoPreviewMode = LivePhotoPreviewMode.LIVE_PHOTO;
                } else {
                    if (LJJIJIIJI().getAILivePhotoModel().restoreData.livePhotoModel != null) {
                        LivePhotoModel livePhotoModel = LJJIJIIJI().getAILivePhotoModel().restoreData.livePhotoModel;
                        if (livePhotoModel != null) {
                            livePhotoPreviewMode = livePhotoModel.previewMode;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    livePhotoPreviewMode = LJJIJIIJI().getLivePhotoPreviewMode();
                }
                if (livePhotoPreviewMode != null) {
                    Pair<Integer, Integer> pairLIZIZ = C534280KxO.LIZIZ(livePhotoPreviewMode);
                    ArrayList arrayList = (ArrayList) list;
                    arrayList.add(new C1460620o72(1105, 0, pairLIZIZ.getSecond().intValue(), (String) null, pairLIZIZ.getFirst().intValue(), (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8170));
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void LJIILL(List<C1460620o72> list) {
        if ((C1428470nHB.LJJLIIIJJIZ(LJJIJIIJI()) && (!C0BMN.LIZ() || ((Number) C0BMN.LIZ.getValue()).intValue() != 2)) || !C1403920mda.LIZ(LJJIJIIJI(), true)) {
            return;
        }
        ((ArrayList) list).add(new C1460620o72(1104, 0, 2131829975, (String) null, R.raw.icon_color_image_stack_rectangle_sparkle, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8170));
    }

    public final void LJIJI(List<C1460620o72> list) {
        int i;
        AwS105S0201000_22 awS105S0201000_22;
        int i2;
        if (u4.LJIIZILJ(LJJIJIIJI()) && C20622315mn.LIZJ()) {
            return;
        }
        if (C1428520nHG.LJJLIIIJJI(LJJIJIIJI()) && C1428520nHG.LJIILJJIL(LJJIJIIJI())) {
            return;
        }
        C1428640nHS c1428640nHS = C1428640nHS.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJIJIIJI = LJJIJIIJI();
        c1428640nHS.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModelLJJIJIIJI) || C1428520nHG.LJJJJZ(LJJIJIIJI())) {
            return;
        }
        C548590LfN.LIZ.getClass();
        if (!C548590LfN.LIZIZ().LJ(LJJIJIIJI().creativeModel)) {
            return;
        }
        IMSharePanelApi.LIZ.getClass();
        boolean zLJFF = C1599690rjL.LIZ().LIZ().LJFF();
        boolean zLIZLLL = C1599690rjL.LIZ().LIZ().LIZLLL();
        boolean zIsEnterFromDM = LJJIJIIJI().isEnterFromDM();
        if (C1416310mxZ.LJJJLZIJ(LJJIJIIJI(), C300650BqR.LIZIZ) || zIsEnterFromDM) {
            return;
        }
        C01GW c01gw = C0BN5.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            i = 2131846769;
        } else {
            i = 2131836997;
        }
        if (C1428520nHG.LJIILJJIL(LJJIJIIJI())) {
            C1460610o71 c1460610o71 = C1460610o71.LIZ;
            VideoPublishEditModel videoPublishEditModelLJJIJIIJI2 = LJJIJIIJI();
            c1460610o71.getClass();
            awS105S0201000_22 = new AwS105S0201000_22(this, i, C1460610o71.LIZIZ(videoPublishEditModelLJJIJIIJI2, 1200), 12);
        } else {
            awS105S0201000_22 = null;
        }
        if (zLJFF || (zLIZLLL && C1428470nHB.LJJLIIIJLLLLLLLZ(LJJIJIIJI()))) {
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                i2 = R.raw.icon_color_arrow_turn_up_right;
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                i2 = R.raw.icon_arrow_turn_up_right_fill;
            } else {
                i2 = R.raw.icon_paperplane_fill;
            }
            ((ArrayList) list).add(new C1460620o72(1200, -1, i, (String) null, i2, (Function1) awS105S0201000_22, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8136));
        }
    }

    public final void LJIJJLI(List<C1460620o72> list) {
        int i;
        int i2;
        if (C577360Mkg.LIZ() && LJJIJIIJIL()) {
            return;
        }
        if (C298250BmZ.LIZ()) {
            i = 2131848888;
        } else {
            i = 2131848823;
        }
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            i2 = R.raw.icon_color_sticker_square;
        } else {
            i2 = R.raw.icon_camera_sticker_round_fill;
        }
        ((ArrayList) list).add(new C1460620o72(4, -1, i, (String) null, i2, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
    }

    public final void LJIL(List<C1460620o72> list) {
        int i;
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            i = R.raw.icon_color_music;
        } else {
            i = R.raw.icon_music_note_s_alt;
        }
        ((ArrayList) list).add(new C1460620o72(1101, 0, 2131837783, (String) null, i, (Function1) null, C1402890mbv.LIZ(LJJIJIIJI()), 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8106));
    }

    public final void LJJ(List<C1460620o72> list) {
        if (C1417160myw.LJIJJ(null, LJJIJIIJI())) {
            LJJIII(list, new C1459760o5e(this));
        }
    }

    public final void LJJII(List<C1460620o72> list) {
        int i;
        int i2;
        int i3;
        if (!C1444940nhk.LJFF(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIIIZZ(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIL(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIJ(LJJIJIIJI().getCanvasVideoData()) && !LJJIJIL() && !LJJIJIIJIL()) {
            if (!C0MT6.LIZ() && !LJJIJIIJI().isDuet() && !C1403850mdT.LJIIL(LJJIJIIJI())) {
                if (C295280Bhm.LIZ()) {
                    i2 = 2131828274;
                } else {
                    i2 = 2131830418;
                }
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    i3 = R.raw.icon_color_scissors;
                } else {
                    i3 = -1;
                }
                ((ArrayList) list).add(new C1460620o72(8, R.drawable.c56, i2, (String) null, i3, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
            if (!C0MT6.LIZ() || LJJIJIIJI().isDuet() || C1403850mdT.LJIIL(LJJIJIIJI())) {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    i = R.raw.icon_color_speaker;
                } else {
                    i = R.raw.icon_speaker_2_fill_ltr;
                }
                ((ArrayList) list).add(new C1460620o72(7, -1, 2131848616, (String) null, i, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
        }
    }

    public final void LJJIIJ(List<C1460620o72> list) {
        if (!C1444940nhk.LJFF(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIIIZZ(LJJIJIIJI().getCanvasVideoData()) && !C1444940nhk.LJIIL(LJJIJIIJI().getCanvasVideoData()) && !LJJIJIL() && !LJJIJIIJIL() && !LJJIJL() && u4.LJI(LJJIJIIJI())) {
            LJJIII(list, new C1459770o5f(this));
        }
    }

    public C1459640o5S(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, Activity.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455680nz4.class, null);
    }

    public static void LJIIZILJ(C1459640o5S c1459640o5S, List list) {
        if (!c1459640o5S.LJJIJIIJI().isLivePhotoEdit() && !c1459640o5S.LJJIJIIJI().isDuet() && !c1459640o5S.LJJIJIIJI().isStitchMode() && !C1428470nHB.LJLIIL(c1459640o5S.LJJIJIIJI()) && !u4.LJIIZILJ(c1459640o5S.LJJIJIIJI())) {
            C0EWB.LIZ.getClass();
            int iLIZIZ = C0EWB.LIZIZ();
            if (iLIZIZ != -1 && !C1428470nHB.LJJLIIIJLJLI(c1459640o5S.LJJIJIIJI())) {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_retouch_in_edit", true) == 2) {
                    ((ArrayList) list).add(new C1460620o72(8000, 0, iLIZIZ, (String) null, C0EWB.LIZ(), (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8042));
                } else {
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_retouch_in_edit", true) != 1) {
                        return;
                    }
                    ((ArrayList) list).add(new C1460620o72(8001, 0, iLIZIZ, (String) null, C0EWB.LIZ(), (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8042));
                }
            }
        }
    }

    public static void LJJIII(List list, Function0 function0) {
        C1460620o72 c1460620o72 = (C1460620o72) function0.invoke();
        ((ArrayList) list).add(C1460620o72.LIZ(c1460620o72, c1460620o72.LIZ | 8192, false, 8190));
    }

    public final void LIZLLL(Integer num, List list) {
        int iIntValue;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_enable_adjust", true, false) && !C1441980ncy.LIZIZ(LJJIJIIJI())) {
            return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.raw.icon_control_fill;
        }
        ((ArrayList) list).add(new C1460620o72(1102, 0, 2131839776, (String) null, iIntValue, (Function1) null, false, R.attr.ee, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8042));
    }

    public final void LJIILLIIL(List<C1460620o72> list, Function0<Boolean> function0) {
        int iIntValue;
        if (function0.invoke().booleanValue() && !LJJIJIIJI().isEnterFromDM() && !LJJIJIIJI().isEnterFromBulletin()) {
            int iIntValue2 = ((Number) C2274431E0r.LIZIZ.getValue()).intValue();
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                iIntValue = R.raw.icon_color_gear;
            } else {
                iIntValue = ((Number) C2274431E0r.LIZ.getValue()).intValue();
            }
            ((ArrayList) list).add(new C1460620o72(17, 0, iIntValue2, (String) null, iIntValue, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8170));
        }
    }

    public final void LJIJ(List<C1460620o72> list, boolean z) {
        int i;
        int i2;
        if (C1428520nHG.LJJLIIIJJI(LJJIJIIJI())) {
            return;
        }
        if (C1428520nHG.LJIILJJIL(LJJIJIIJI()) && !z && !C1416310mxZ.LJJJLZIJ(LJJIJIIJI(), C300650BqR.LIZIZ)) {
            return;
        }
        if (C1428580nHM.LIZ(LJJIJIIJI().isEnterFromDM())) {
            if (C1428520nHG.LJIIJ(LJJIJIIJI())) {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    i2 = R.raw.icon_color_arrow_down_to_line;
                } else {
                    i2 = R.raw.icon_arrow_down_to_line_fill;
                }
                C1460610o71 c1460610o71 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJIJIIJI = LJJIJIIJI();
                c1460610o71.getClass();
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(new C1460620o72(25, 0, 2131846805, (String) null, i2, (Function1) new AwS105S0201000_22(this, 2131846805, C1460610o71.LIZIZ(videoPublishEditModelLJJIJIIJI, 25), 12), false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8138));
                arrayList.add(new C1460620o72(24, 0, 0, (String) null, 0, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8184));
                return;
            }
            return;
        }
        C259800zU c259800zU = new C259800zU();
        boolean zLJJIII = C0CHQ.LIZ().getPublishService().LJJIII();
        if (C1428520nHG.LJIIJ(LJJIJIIJI())) {
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                i = R.raw.icon_color_arrow_down_to_line;
            } else {
                i = R.raw.icon_arrow_down_to_line_fill;
            }
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.add(new C1460620o72(25, 0, 2131846805, (String) null, i, (Function1) new AwS73S0210000_22(zLJJIII, (boolean) this, (C1459640o5S) c259800zU, (C259800zU<ValueAnimator>) 6), false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8138));
            arrayList2.add(new C1460620o72(24, 0, 0, (String) null, 0, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8184));
        }
    }

    public static void LJJI(Integer num, List list, boolean z) {
        int iIntValue;
        int i;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                iIntValue = R.raw.icon_color_text_latin;
            } else {
                iIntValue = R.raw.icon_text_latin;
            }
        }
        if (z) {
            i = R.attr.ee;
        } else {
            i = 0;
        }
        ((ArrayList) list).add(new C1460620o72(3, -1, 2131858549, (String) null, iIntValue, (Function1) null, false, i, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8040));
    }

    public static void LJJIJLIJ(SmartImageView smartImageView, int i, int i2) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (i2 > 0) {
            c419910GdJ.LJ = Integer.valueOf(i2);
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
    }

    public static void LJJIL(SmartImageView smartImageView, C1295960jpS c1295960jpS, VideoPublishEditModel videoPublishEditModel) {
        if (C0MDL.LIZLLL(videoPublishEditModel) && c1295960jpS != null) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_ailive_icon);
            c1295960jpS.setRepeatCount(2);
            c1295960jpS.setRepeatMode(1);
            c1295960jpS.addAnimatorListener(new ALAdapterS5S0200000_8(c1295960jpS, smartImageView, 4));
            c1295960jpS.playAnimation();
        }
    }

    public final void LIZJ(Integer num, List list, boolean z) {
        int iIntValue;
        int i;
        if (!C1444940nhk.LJIIL(LJJIJIIJI().getCanvasVideoData()) && !LJJIJIL() && !LJJIJIIJIL() && u4.LJII(LJJIJIIJI())) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    iIntValue = R.raw.icon_color_camera_plus;
                } else {
                    iIntValue = ((Number) C1459830o5l.LIZ.getValue()).intValue();
                }
            }
            int iIntValue2 = ((Number) C1459830o5l.LIZIZ.getValue()).intValue();
            if (z) {
                i = R.attr.ee;
            } else {
                i = 0;
            }
            ((ArrayList) list).add(new C1460620o72(1100, 0, iIntValue2, (String) null, iIntValue, (Function1) null, false, i, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8042));
        }
    }

    public final void LJIIL(Integer num, List list, boolean z) {
        int iIntValue;
        VideoPublishEditModel videoPublishEditModelLJJIJIIJI = LJJIJIIJI();
        int i = 0;
        if (((videoPublishEditModelLJJIJIIJI.isLivePhotoEdit() && !videoPublishEditModelLJJIJIIJI.isCurrentAutoCutMode() && !C1416310mxZ.LJJJI(LJJIJIIJI())) || C1428470nHB.LJJZZI(LJJIJIIJI()) || C1403930mdb.LIZ(LJJIJIIJI())) && !LJJIJIL() && !LJJIJIIJIL()) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZIZ()) {
                    iIntValue = R.raw.icon_color_crop;
                } else {
                    iIntValue = R.raw.icon_crop_fill;
                }
            }
            if (z) {
                i = R.attr.ee;
            }
            ((ArrayList) list).add(new C1460620o72(16, -1, 2131845441, (String) null, iIntValue, (Function1) null, false, i, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8040));
        }
    }
}
