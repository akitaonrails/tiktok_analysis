package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LiveData;
import ayh.i5;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.ss.android.ugc.aweme.utils.oh;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0syo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647720syo extends AbstractC2255721DQs<InterfaceC1653050t7P> implements InterfaceC1653050t7P, InterfaceC379610EuV {
    public static final C1647730syp LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1DRG LL;
    public boolean LLJI;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648870t0f.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(88));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(89));
    public boolean LLJIJIL = true;
    public final List<String> LLJILJIL = C1697810uHb.LJIILJJIL(EnumC1647570syZ.PHOTO_SHORT.getTag(), EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.RECORD_COMBINE_180.getTag(), EnumC1647570syZ.RECORD_COMBINE_600.getTag(), EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_PHOTO.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag(), EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_QUICK.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag());
    public final List<String> LLJILJILJ = C1697810uHb.LJIILJJIL(EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag(), "record_mode_duet", "DUET_MODE_CAMERA_RECORD", "record_mode_mv", EnumC1647570syZ.LIVE.getTag(), "AISelf");

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0syp] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647720syo.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1647720syo.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1647720syo.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0), new C2217381BqS(C1647720syo.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1647720syo.class, "albumDockerBarApi", "getAlbumDockerBarApi()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0), new C2217381BqS(C1647720syo.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
        LLJILLL = new Object() { // from class: X.0syp
        };
        LLJJI = 8;
    }

    public InterfaceC1653050t7P o2() {
        return this;
    }

    private final InterfaceC1648870t0f Z1() {
        return (InterfaceC1648870t0f) this.LLILZLL.getValue(this, LLJJ[4]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZ.getValue(this, LLJJ[5]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLILLJJLI.getValue(this, LLJJ[0]);
    }

    public final Keva G2() {
        return (Keva) this.LLJ.getValue();
    }

    public final InterfaceC1648020szI H2() {
        return (InterfaceC1648020szI) this.LLILZIL.getValue(this, LLJJ[3]);
    }

    @Override // X.InterfaceC1653050t7P
    public InterfaceC390170FRn LJIIJ() {
        return new InterfaceC390170FRn() { // from class: X.0syr
            @Override // X.InterfaceC390170FRn
            public final InterfaceC390200FRq LIZ() {
                return null;
            }

            @Override // X.InterfaceC390170FRn
            public final LiveData<List<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo>> LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC390170FRn
            public final boolean LIZLLL() {
                return true;
            }

            @Override // X.InterfaceC390170FRn
            public final void LJFF() {
            }

            @Override // X.InterfaceC390170FRn
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC390170FRn
            public final void LJIIJJI(int i, String str) {
            }

            @Override // X.InterfaceC390170FRn
            public final void LJIIL() {
            }

            @Override // X.InterfaceC390170FRn
            public final boolean LJ() {
                C01GW c01gw = C299960BpK.LIZ;
                return C299960BpK.LIZIZ;
            }

            @Override // X.InterfaceC390170FRn
            public final boolean LJI() {
                return this.LIZ.getShortVideoContext().creativeModel.stickerModel.isFromFollowAddYours;
            }

            @Override // X.InterfaceC390170FRn
            public final AddYoursStickerTopicRepo LJII() {
                return this.LIZ.X1();
            }

            @Override // X.InterfaceC390170FRn
            public final int LJIIIIZZ() {
                return (!this.LIZ.getShortVideoContext().creativeModel.stickerModel.isFromFollowAddYours || C299960BpK.LIZIZ) ? 2131825072 : 2131836221;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            @Override // X.InterfaceC390170FRn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(java.lang.String r5, java.lang.String r6, boolean r7) {
                /*
                    r4 = this;
                    X.0syo r1 = r4.LIZ
                    boolean r0 = r1.LLJI
                    if (r0 == 0) goto L1f
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.C13LP.LJJJLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L19
                    return
                L19:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L21
                L1f:
                    java.lang.String r1 = "video_shoot_page"
                L21:
                    java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
                    X.0LAB r2 = new X.0LAB
                    r2.<init>()
                    X.0syo r3 = r4.LIZ
                    java.lang.String r0 = "enter_from"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.getCreationId()
                    java.lang.String r0 = "creation_id"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJ(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJ(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJ(r0, r6)
                    java.lang.String r0 = "from_title"
                    r2.LJ(r0, r5)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZ(r7, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZ(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "enter_add_yours_edit_page"
                    X.C2341909Fp.LIZ(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1647750syr.LIZJ(java.lang.String, java.lang.String, boolean):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
            @Override // X.InterfaceC390170FRn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIJ(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, int r9, com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel r10) {
                /*
                    r4 = this;
                    X.0syo r2 = r4.LIZ
                    boolean r1 = r2.LLJI
                    r0 = 0
                    if (r1 == 0) goto L22
                    r2.LLJI = r0
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.C13LP.LJJJLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L1c
                    return
                L1c:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L24
                L22:
                    java.lang.String r1 = "video_shoot_page"
                L24:
                    boolean r0 = kotlin.text.a0.LJJJIL(r5)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto Lac
                    int r0 = r5.length()
                    if (r0 <= 0) goto Lac
                    java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
                    X.0LAB r2 = new X.0LAB
                    r2.<init>()
                    X.0syo r3 = r4.LIZ
                    java.lang.String r0 = "enter_from"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.getCreationId()
                    java.lang.String r0 = "creation_id"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJ(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJ(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJ(r0, r8)
                    java.lang.String r0 = "save_title"
                    r2.LJ(r0, r5)
                    java.lang.String r0 = "input_mode"
                    r2.LJ(r0, r6)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZ(r7, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZ(r1, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.lang.Integer r1 = r0.trendSource
                    java.lang.String r0 = "trend_source"
                    r2.LIZLLL(r1, r0)
                    java.lang.String r0 = "is_operation_set"
                    r2.LIZ(r9, r0)
                    X.0mdY r0 = X.C1403900mdY.LIZ
                    r0.getClass()
                    X.C1403900mdY.LJIIIIZZ(r10, r2)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "complete_add_yours_edit_page"
                    X.C2341909Fp.LIZ(r0, r1)
                Lac:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1647750syr.LJIIJ(java.lang.String, java.lang.String, boolean, java.lang.String, int, com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            @Override // X.InterfaceC390170FRn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIILIIL(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
                /*
                    r4 = this;
                    X.0syo r1 = r4.LIZ
                    boolean r0 = r1.LLJI
                    if (r0 == 0) goto L1f
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.C13LP.LJJJLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L19
                    return
                L19:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L21
                L1f:
                    java.lang.String r1 = "video_shoot_page"
                L21:
                    java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
                    X.0LAB r2 = new X.0LAB
                    r2.<init>()
                    X.0syo r3 = r4.LIZ
                    java.lang.String r0 = "enter_from"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJ(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.getCreationId()
                    java.lang.String r0 = "creation_id"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJ(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJ(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJ(r0, r9)
                    java.lang.String r0 = "from_title"
                    r2.LJ(r0, r6)
                    java.lang.String r0 = "to_title"
                    r2.LJ(r0, r7)
                    java.lang.String r0 = "click_method"
                    r2.LJ(r0, r8)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZ(r10, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZ(r1, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.lang.Integer r1 = r0.trendSource
                    java.lang.String r0 = "trend_source"
                    r2.LIZLLL(r1, r0)
                    java.lang.String r0 = "is_operation_set"
                    r2.LIZ(r5, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "click_add_yours_edit_page_icon"
                    X.C2341909Fp.LIZ(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1647750syr.LJIILIIL(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
            }
        };
    }

    public final AddYoursStickerTopicRepo X1() {
        return (AddYoursStickerTopicRepo) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1647520syU getInfiniStickerApi() {
        return (InterfaceC1647520syU) this.LLILZ.getValue(this, LLJJ[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJJ[1]);
    }

    private final boolean w2() {
        return getShortVideoContext().shootMode == 16;
    }

    @Override // X.InterfaceC1653050t7P
    public void J2() {
        String addYoursEnterMethod;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ c0ftj;
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi != null && (listLLLLLZ = infiniStickerApi.LLLLLZ(EnumC1466150oFx.ADD_YOURS)) != null && (c0ftj = (C0FTJ) C13LP.LJJJLL(listLLLLLZ)) != null) {
            rY1(false);
            InterfaceC1647520syU infiniStickerApi2 = getInfiniStickerApi();
            if (infiniStickerApi2 != null) {
                infiniStickerApi2.TQ(EnumC1466150oFx.ADD_YOURS, c0ftj.getStickerId());
                return;
            }
            return;
        }
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(getShortVideoContext().creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras == null || (addYoursEnterMethod = addYoursStickerExtras.getAddYoursEnterMethod()) == null) {
            addYoursEnterMethod = "shoot_page_entrance";
        }
        InterfaceC1647520syU infiniStickerApi3 = getInfiniStickerApi();
        if (infiniStickerApi3 != null) {
            infiniStickerApi3.mn2(EnumC1466150oFx.ADD_YOURS, addYoursEnterMethod, AFwS266S0000000_25.get$arr$(84));
        }
    }

    @Override // X.InterfaceC1653050t7P
    public boolean ji0() {
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(getShortVideoContext().creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras == null || !addYoursStickerExtras.getAutoEnterStickerEdit()) {
            return C1443960ngA.LJI(getShortVideoContext()) && ((Boolean) C275650ArD.LIZ.getValue()).booleanValue();
        }
        return true;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            return;
        }
        if (C573130Mdr.LIZ()) {
            List<String> list = this.LLJILJIL;
            EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_NOW;
            list.addAll(Collections.singletonList(enumC1647570syZ.getTag()));
            this.LLJILJILJ.removeAll(Collections.singletonList(enumC1647570syZ.getTag()));
        }
        if (getDiContainer().LIZJ(InterfaceC1647520syU.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647520syU.class, new AwS604S0100000_25(this, 79));
        }
        getRecordControlApi().lC2().LIZ(this, new AObjectS246S0100000_25(this, 38));
        getRecordControlApi().Vt0().LIZ(this, new AObjectS246S0100000_25(this, 39));
        getRecordControlApi().xk1().LIZ(this, new AObjectS246S0100000_25(this, 40));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1(false);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        rY1((getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || !this.LLJIJIL) ? false : true);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1647720syo(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T2(X.C1647390syH r5) {
        /*
            r4 = this;
            boolean r0 = r5.LJFF
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L22
            java.util.List<java.lang.String> r1 = r4.LLJILJIL
            java.lang.Object r0 = r5.LIZIZ
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L20
            java.util.List<java.lang.String> r1 = r4.LLJILJIL
            java.lang.Object r0 = r5.LJI
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L20
        L1a:
            r4.LLJIJIL = r3
            r4.rY1(r3)
            return
        L20:
            r3 = 0
            goto L1a
        L22:
            java.util.List<java.lang.String> r1 = r4.LLJILJILJ
            java.lang.Object r0 = r5.LJI
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L32
            r4.LLJIJIL = r2
            r4.rY1(r2)
            return
        L32:
            boolean r0 = X.C573130Mdr.LIZ()
            if (r0 != 0) goto L3f
            boolean r0 = r4.w2()
            if (r0 == 0) goto L3f
            r3 = 0
        L3f:
            r4.LLJIJIL = r3
            r4.rY1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1647720syo.T2(X.0syH):void");
    }

    public final void W1(boolean z) {
        C860560XpO.LIZIZ(getShortVideoContext());
        if (z) {
            oh.LIZJ("tool_performance_add_yours_record", i5.LIZIZ(), -1L, null, null);
        } else {
            oh.LJ("tool_performance_add_yours_record");
        }
    }

    @Override // X.InterfaceC1653050t7P
    public void rY1(boolean z) {
        InterfaceC1647520syU infiniStickerApi;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        InterfaceC1647520syU infiniStickerApi2;
        if ((!z || (!getShortVideoContext().cameraComponentModel.isRetakeMode && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode)) && (infiniStickerApi = getInfiniStickerApi()) != null && (listLLLLLZ = infiniStickerApi.LLLLLZ(EnumC1466150oFx.ADD_YOURS)) != null && (!listLLLLLZ.isEmpty())) {
            ((C0FTJ) ListProtector.get(listLLLLLZ, 0)).setVisible(z);
            if (!z && (infiniStickerApi2 = getInfiniStickerApi()) != null) {
                infiniStickerApi2.LJ0(false, "", (C0FTJ) ListProtector.get(listLLLLLZ, 0), null, null, null);
            }
        }
    }

    @Override // X.InterfaceC1653050t7P
    public void rj(StickerModel stickerModel) {
        C344010DeB c344010DeB = C344010DeB.LIZIZ;
        c344010DeB.LIZJ(C1664590tQ1.LJII(this), c344010DeB.LIZ(), new AwS391S0200000_25(stickerModel, this, 42));
    }

    public final void c3(C390150FRl c390150FRl, String str) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C19642911tD(c390150FRl, this, str, null), 3);
    }
}
