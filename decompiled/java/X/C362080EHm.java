package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.startup.task.delay.CheckVoiceEffectResTask;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362080EHm implements InterfaceC359860E8y {
    public final C19EG LIZ;
    public final C0E48 LIZIZ;
    public final NLEModel LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final C362160EHu LJ;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public ArrayList<C361980EHc> LJIIIZ;
    public InterfaceC359850E8x LJIIJ;
    public InterfaceC359940E9g LJIIJJI;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1605));
    public final List<String> LJIIL = C1697810uHb.LJIILJJIL("bottom_item_overlay_edit_", "bottom_item_sticker_edit_", "bottom_item_effect_edit_", "bottom_item_text_edit_", "bottom_item_adjust_adjust_edit", "bottom_item_bgm_edit_", "bottom_item_sound_effect_edit_", "bottom_item_audio_voice_cover_edit_", "bottom_item_filter_edit_", "bottom_item_lyric_edit_");

    public final VideoPublishEditModel LJI() {
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final ArrayList<C361980EHc> LJFF(boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProBottomBarConfig createRootItemList createForSort: ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJII);
        C201955140j.LIZIZ("EditRootScene", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJI) {
            ArrayList<C361980EHc> arrayList = new ArrayList<>();
            arrayList.addAll(((C362110EHp) ((C362090EHn) this.LJFF.getValue()).LJIJ.getValue()).LIZJ());
            return arrayList;
        }
        if (this.LJII) {
            ArrayList<C361980EHc> arrayList2 = new ArrayList<>();
            C362090EHn c362090EHn = (C362090EHn) this.LJFF.getValue();
            c362090EHn.getClass();
            C361970EHb c361970EHb = new C361970EHb();
            c361970EHb.LIZ = c362090EHn.LIZ.getString(2131834153);
            c361970EHb.LJ = "bottom_item_root_retouch";
            c361970EHb.LIZLLL = new AwS549S0100000_5(c362090EHn, 1351);
            arrayList2.addAll(C1697810uHb.LJ(c361970EHb.LIZ()));
            return arrayList2;
        }
        if (this.LJIIIIZZ) {
            return C1697810uHb.LJ(((C362090EHn) this.LJFF.getValue()).LIZIZ().LJII);
        }
        ArrayList<C361980EHc> arrayList3 = this.LJIIIZ;
        if (arrayList3 != null) {
            return arrayList3;
        }
        C362090EHn c362090EHn2 = (C362090EHn) this.LJFF.getValue();
        c362090EHn2.getClass();
        ArrayList<C361980EHc> arrayList4 = new ArrayList<>();
        C361970EHb c361970EHb2 = new C361970EHb();
        c361970EHb2.LIZ = c362090EHn2.LIZ.getString(2131833392);
        c361970EHb2.LJ = "bottom_item_root_edit";
        c361970EHb2.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1366);
        c361970EHb2.LJFF = c362090EHn2.LIZLLL();
        arrayList4.add(c361970EHb2.LIZ());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_smart_trim_in_main_menu", true, false)) {
            C361970EHb c361970EHb3 = new C361970EHb();
            c361970EHb3.LIZ = c362090EHn2.LIZ.getString(2131848555);
            c361970EHb3.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1360);
            c361970EHb3.LJI = 1000L;
            c361970EHb3.LJ = "bottom_item_root_smart_trim";
            arrayList4.add(c361970EHb3.LIZ());
        }
        C361970EHb c361970EHb4 = new C361970EHb();
        c361970EHb4.LIZ = c362090EHn2.LIZ.getString(2131833405);
        c361970EHb4.LJ = "bottom_item_root_sound";
        c361970EHb4.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1372);
        c361970EHb4.LJFF = c362090EHn2.LIZIZ().LIZJ();
        arrayList4.add(c361970EHb4.LIZ());
        C361970EHb c361970EHb5 = new C361970EHb();
        c361970EHb5.LIZ = c362090EHn2.LIZ.getString(2131833411);
        c361970EHb5.LJ = "bottom_item_root_text";
        c361970EHb5.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1327);
        C362190EHx c362190EHx = (C362190EHx) c362090EHn2.LJIILLIIL.getValue();
        c362190EHx.getClass();
        ArrayList arrayList5 = new ArrayList();
        C361970EHb c361970EHb6 = new C361970EHb();
        c361970EHb6.LIZ = c362190EHx.LIZ.getString(2131833412);
        c361970EHb6.LJI = 1000L;
        c361970EHb6.LIZLLL = new AwS549S0100000_5(c362190EHx, 1424);
        c361970EHb6.LJ = "bottom_item_text_add_text";
        c361970EHb6.LIZIZ(c362190EHx.LJFF, "add_icon_res_id");
        arrayList5.add(c361970EHb6.LIZ());
        C361970EHb c361970EHb7 = new C361970EHb();
        c361970EHb7.LIZ = c362190EHx.LIZ.getString(2131826898);
        c361970EHb7.LJI = 1000L;
        c361970EHb7.LIZLLL = new AwS549S0100000_5(c362190EHx, 1427);
        if (!C301720BsA.LIZ(c362190EHx.LIZIZ)) {
            str = "bottom_item_root_caption";
        } else {
            str = "bottom_item_text_captions";
        }
        c361970EHb7.LJ = str;
        arrayList5.add(c361970EHb7.LIZ());
        c361970EHb5.LJFF = arrayList5;
        arrayList4.add(c361970EHb5.LIZ());
        if (c362090EHn2.LJ.LIZ) {
            arrayList4.add(c362090EHn2.LJJIJIIJIL);
        }
        C353560Dta c353560Dta = C353560Dta.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = c362090EHn2.LIZIZ;
        NLEModel nLEModel = c362090EHn2.LIZJ;
        c353560Dta.getClass();
        if (C353560Dta.LJII(videoPublishEditModel2, nLEModel) || z) {
            arrayList4.add(C0E9R.LIZ(c362090EHn2.LIZ, "bottom_item_root_magic"));
        }
        if (C301720BsA.LIZ(c362090EHn2.LIZIZ) || z) {
            C361970EHb c361970EHb8 = new C361970EHb();
            c361970EHb8.LIZ = c362090EHn2.LIZ.getString(2131826898);
            c361970EHb8.LJI = 1000L;
            c361970EHb8.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1364);
            c361970EHb8.LJ = "bottom_item_root_caption";
            arrayList4.add(c361970EHb8.LIZ());
        }
        C361970EHb c361970EHb9 = new C361970EHb();
        c361970EHb9.LIZ = c362090EHn2.LIZ.getString(2131833403);
        c361970EHb9.LJ = "bottom_item_root_overlay";
        c361970EHb9.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1370);
        C362140EHs c362140EHs = (C362140EHs) c362090EHn2.LJIIZILJ.getValue();
        c362140EHs.getClass();
        C361970EHb c361970EHb10 = new C361970EHb();
        c361970EHb10.LIZ = c362140EHs.LIZ.getString(2131833404);
        c361970EHb10.LJI = 1000L;
        c361970EHb10.LIZLLL = new AwS549S0100000_5(c362140EHs, 1390);
        c361970EHb10.LIZIZ(c362140EHs.LJFF, "add_icon_res_id");
        c361970EHb10.LJ = "bottom_item_overlay_add_overlay";
        c361970EHb9.LJFF = C1697810uHb.LJ(c361970EHb10.LIZ());
        arrayList4.add(c361970EHb9.LIZ());
        if (C379370Eu7.LIZIZ(c362090EHn2.LIZIZ) && C0CHQ.LIZ().getAccountService().isLogin() && !((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            C0E9Q c0e9q = (C0E9Q) c362090EHn2.LJIILIIL.getValue();
            c0e9q.getClass();
            C361970EHb c361970EHb11 = new C361970EHb();
            c361970EHb11.LIZ = c0e9q.LIZ.getString(2131825354);
            c361970EHb11.LIZLLL = new AwS549S0100000_5(c0e9q, 1391);
            c361970EHb11.LJ = "bottom_item_root_ai_create";
            c361970EHb11.LJFF = C359870E8z.LIZ(c0e9q.LIZ, "bottom_item_create_ai_image", "bottom_item_create_ai_video", false, false, false);
            arrayList4.add(c361970EHb11.LIZ());
        }
        if (c362090EHn2.LJ.LIZLLL) {
            C361970EHb c361970EHb12 = new C361970EHb();
            C19EG c19eg = c362090EHn2.LIZ;
            if (C298250BmZ.LIZ()) {
                i = 2131848888;
            } else {
                i = 2131848823;
            }
            c361970EHb12.LIZ = c19eg.getString(i);
            c361970EHb12.LJ = "bottom_item_root_sticker";
            c361970EHb12.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1374);
            C362210EHz c362210EHz = (C362210EHz) c362090EHn2.LJIJI.getValue();
            c362210EHz.getClass();
            C361970EHb c361970EHb13 = new C361970EHb();
            c361970EHb13.LIZ = c362210EHz.LIZ.getString(2131848908);
            c361970EHb13.LJI = 1000L;
            c361970EHb13.LIZLLL = new AwS549S0100000_5(c362210EHz, 1462);
            c361970EHb13.LIZIZ(c362210EHz.LJFF, "add_icon_res_id");
            c361970EHb13.LJ = "bottom_item_sticker_add_sticker";
            c361970EHb12.LJFF = C1697810uHb.LJ(c361970EHb13.LIZ());
            arrayList4.add(c361970EHb12.LIZ());
        }
        if (c362090EHn2.LJ.LIZIZ) {
            C361970EHb c361970EHb14 = new C361970EHb();
            c361970EHb14.LIZ = c362090EHn2.LIZ.getString(2131833348);
            c361970EHb14.LJ = "bottom_item_root_filter";
            c361970EHb14.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1368);
            C362200EHy c362200EHy = (C362200EHy) c362090EHn2.LJIJJ.getValue();
            c362200EHy.getClass();
            C361970EHb c361970EHb15 = new C361970EHb();
            c361970EHb15.LIZ = c362200EHy.LIZ.getString(2131833348);
            c361970EHb15.LJI = 1000L;
            c361970EHb15.LIZLLL = new AwS549S0100000_5(c362200EHy, 1464);
            c361970EHb15.LIZIZ(c362200EHy.LJFF, "add_icon_res_id");
            c361970EHb15.LJ = "bottom_item_filter_add_filters";
            c361970EHb14.LJFF = C1697810uHb.LJ(c361970EHb15.LIZ());
            arrayList4.add(c361970EHb14.LIZ());
        }
        if (C288190BRh.LIZ() || ((videoPublishEditModel = c362090EHn2.LIZIZ) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate && C0BO0.LIZ())) {
            C361970EHb c361970EHb16 = new C361970EHb();
            c361970EHb16.LIZ = c362090EHn2.LIZ.getString(2131825206);
            C0EI0 c0ei0 = (C0EI0) c362090EHn2.LJIJJLI.getValue();
            c0ei0.getClass();
            C361970EHb c361970EHb17 = new C361970EHb();
            c361970EHb17.LIZ = c0ei0.LIZ.getString(2131825206);
            c361970EHb17.LJI = 1000L;
            c361970EHb17.LIZLLL = new AwS549S0100000_5(c0ei0, 1403);
            c361970EHb17.LIZIZ(c0ei0.LJFF, "add_icon_res_id");
            c361970EHb17.LJ = "bottom_item_adjust_add_adjust";
            c361970EHb16.LJFF = Collections.singletonList(c361970EHb17.LIZ());
            c361970EHb16.LJ = "bottom_item_root_adjust_filter";
            c361970EHb16.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1362);
            arrayList4.add(c361970EHb16.LIZ());
        }
        C361970EHb c361970EHb18 = new C361970EHb();
        c361970EHb18.LIZ = c362090EHn2.LIZ.getString(2131833409);
        c361970EHb18.LIZLLL = new AwS549S0100000_5(c362090EHn2, 1325);
        c361970EHb18.LJ = "bottom_item_root_sound_sync";
        c361970EHb18.LJIIL = C0EI1.LIZJ(R.raw.icon_color_sound_sync_tick_green, false);
        arrayList4.add(c361970EHb18.LIZ());
        this.LJIIIZ = arrayList4;
        return arrayList4;
    }

    @Override // X.InterfaceC359860E8y
    public final void LIZ(InterfaceC359850E8x interfaceC359850E8x, InterfaceC359940E9g interfaceC359940E9g) {
        this.LJIIJ = interfaceC359850E8x;
        this.LJIIJJI = interfaceC359940E9g;
    }

    @Override // X.InterfaceC359860E8y
    public final boolean LIZIZ(C361980EHc c361980EHc, C0E7I c0e7i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        VideoPublishEditModel videoPublishEditModelLJI = LJI();
        String str7 = null;
        if (videoPublishEditModelLJI != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("bottom_item_bgm_edit_", "bottom_item_sound_effect_edit_", "bottom_item_audio_voice_cover_edit_");
            if (c361980EHc != null) {
                str3 = c361980EHc.LJI;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "bottom_item_text_edit_")) {
                C0EC5.LJIILIIL(videoPublishEditModelLJI, this.LIZIZ, "click_return");
            } else {
                if (c361980EHc != null) {
                    str4 = c361980EHc.LJI;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, "bottom_item_sticker_edit_")) {
                    C0EC5.LJIIL(videoPublishEditModelLJI, this.LIZIZ, "click_return");
                } else {
                    if (c361980EHc != null) {
                        str5 = c361980EHc.LJI;
                    } else {
                        str5 = null;
                    }
                    if (C13LP.LJJJJ(str5, listLJIIJJI)) {
                        C0EC5.LJIIJ(videoPublishEditModelLJI, this.LIZIZ, "click_return");
                    } else {
                        if (c361980EHc != null) {
                            str6 = c361980EHc.LJI;
                        } else {
                            str6 = null;
                        }
                        if (Intrinsics.LJFF(str6, "bottom_item_filter_edit_")) {
                            C362710EJx c362710EJx = C362710EJx.LIZ;
                            C0E48 c0e48 = this.LIZIZ;
                            c362710EJx.getClass();
                            C362710EJx.LIZJ(videoPublishEditModelLJI, c0e48);
                        }
                    }
                }
            }
        }
        if (c361980EHc != null) {
            str = c361980EHc.LJIIL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "root_item")) {
            if (Intrinsics.LJFF(c0e7i, C0E7F.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x = this.LJIIJ;
                if (interfaceC359850E8x != null) {
                    interfaceC359850E8x.LJIIL("bottom_item_root_text");
                }
                VideoPublishEditModel videoPublishEditModelLJI2 = LJI();
                if (videoPublishEditModelLJI2 != null) {
                    C0EC5.LJIILIIL(videoPublishEditModelLJI2, this.LIZIZ, "click_return");
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E7E.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x2 = this.LJIIJ;
                if (interfaceC359850E8x2 != null) {
                    interfaceC359850E8x2.LJIIL("bottom_item_root_sticker");
                }
                VideoPublishEditModel videoPublishEditModelLJI3 = LJI();
                if (videoPublishEditModelLJI3 != null) {
                    C0EC5.LJIIL(videoPublishEditModelLJI3, this.LIZIZ, "click_return");
                    return true;
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E7C.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x3 = this.LJIIJ;
                if (interfaceC359850E8x3 != null) {
                    interfaceC359850E8x3.LJIIL("bottom_item_root_overlay");
                    return true;
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E77.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x4 = this.LJIIJ;
                if (interfaceC359850E8x4 != null) {
                    interfaceC359850E8x4.LJIIL("bottom_item_root_sound");
                }
                VideoPublishEditModel videoPublishEditModelLJI4 = LJI();
                if (videoPublishEditModelLJI4 != null) {
                    C0EC5.LJIIJ(videoPublishEditModelLJI4, this.LIZIZ, "click_return");
                    return true;
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E7G.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x5 = this.LJIIJ;
                if (interfaceC359850E8x5 != null) {
                    interfaceC359850E8x5.LJIIL("bottom_item_root_effects");
                    return true;
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E79.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x6 = this.LJIIJ;
                if (interfaceC359850E8x6 != null) {
                    interfaceC359850E8x6.LJIIL("bottom_item_root_filter");
                }
                VideoPublishEditModel videoPublishEditModelLJI5 = LJI();
                if (videoPublishEditModelLJI5 != null) {
                    C362710EJx c362710EJx2 = C362710EJx.LIZ;
                    C0E48 c0e482 = this.LIZIZ;
                    c362710EJx2.getClass();
                    C362710EJx.LIZJ(videoPublishEditModelLJI5, c0e482);
                    return true;
                }
            } else if (Intrinsics.LJFF(c0e7i, C0E7D.LIZ)) {
                InterfaceC359850E8x interfaceC359850E8x7 = this.LJIIJ;
                if (interfaceC359850E8x7 != null) {
                    interfaceC359850E8x7.LJIIL("bottom_item_root_retouch");
                    return true;
                }
            } else {
                return false;
            }
            return true;
        }
        if (c361980EHc != null) {
            str2 = c361980EHc.LJI;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, "bottom_item_bgm_edit_")) {
            if (c361980EHc != null) {
                str7 = c361980EHc.LJI;
            }
            if (!Intrinsics.LJFF(str7, "bottom_item_lyric_edit_")) {
                return false;
            }
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZIZ);
        boolean zLIZ = C349940Dnk.LIZ(this.LIZIZ, LJI());
        int iIntValue = C349940Dnk.LIZJ(nLEModelLJI).getSecond().intValue();
        if (!zLIZ ? !C348840Dly.LIZ(LJI(), nLEModelLJI) : iIntValue <= 0 && !C351220Dpo.LLFFF(nLEModelLJI)) {
            return true;
        }
        InterfaceC359850E8x interfaceC359850E8x8 = this.LJIIJ;
        if (interfaceC359850E8x8 != null) {
            interfaceC359850E8x8.LJIIL("bottom_item_root_sound");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC359860E8y
    public final ArrayList<C361980EHc> LIZJ(EnumC359810E8t enumC359810E8t, NLETrackSlot nLETrackSlot) {
        boolean z;
        boolean z2;
        NLEModel nLEModelLJI;
        C0E48 c0e48;
        C19EG c19eg;
        int i;
        float f;
        boolean zHasExtra;
        boolean z3;
        C361980EHc c361980EHc;
        C362090EHn c362090EHn = (C362090EHn) this.LJFF.getValue();
        boolean z4 = this.LJIIIIZZ;
        c362090EHn.getClass();
        String string = null;
        NLEModel nLEModelLJI2 = null;
        switch (C359820E8u.LIZ[enumC359810E8t.ordinal()]) {
            case 1:
                return c362090EHn.LIZLLL();
            case 2:
                C362140EHs c362140EHs = (C362140EHs) c362090EHn.LJIIZILJ.getValue();
                c362140EHs.getClass();
                ArrayList<C361980EHc> arrayList = new ArrayList<>();
                C361970EHb c361970EHb = new C361970EHb();
                c361970EHb.LIZ = c362140EHs.LIZ.getString(2131833399);
                c361970EHb.LIZLLL = new AwS549S0100000_5(c362140EHs, 1429);
                c361970EHb.LJ = "bottom_item_overlay_edit_split";
                arrayList.add(c361970EHb.LIZ());
                C361970EHb c361970EHb2 = new C361970EHb();
                c361970EHb2.LIZ = c362140EHs.LIZ.getString(2131833947);
                c361970EHb2.LIZLLL = new AwS549S0100000_5(c362140EHs, 1432);
                c361970EHb2.LJ = "bottom_item_overlay_edit_replace";
                arrayList.add(c361970EHb2.LIZ());
                C361970EHb c361970EHb3 = new C361970EHb();
                c361970EHb3.LIZ = c362140EHs.LIZ.getString(2131833393);
                c361970EHb3.LIZLLL = new AwS549S0100000_5(c362140EHs, 1435);
                c361970EHb3.LJ = "bottom_item_overlay_edit_delete";
                arrayList.add(c361970EHb3.LIZ());
                if (!c362140EHs.LIZJ() ? C0BYR.LIZ() || C301700Bs8.LIZ() : C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_cutout_in_pugc", true, false) || C301700Bs8.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                C361970EHb c361970EHb4 = new C361970EHb();
                c361970EHb4.LIZ = c362140EHs.LIZ.getString(2131834073);
                c361970EHb4.LIZLLL = new AwS549S0100000_5(c362140EHs, 1457);
                c361970EHb4.LJI = 1000L;
                c361970EHb4.LJIIL = C0EI1.LIZ();
                c361970EHb4.LJ = "bottom_item_overlay_edit_cutout";
                C361980EHc c361980EHcLIZ = c361970EHb4.LIZ();
                if (!z && !C376910Eq9.LIZIZ.LIZJ(c362140EHs.LIZIZ)) {
                    z2 = false;
                } else {
                    z2 = true;
                    if (!C284680BDu.LIZ()) {
                        arrayList.add(c361980EHcLIZ);
                    }
                }
                C361970EHb c361970EHb5 = new C361970EHb();
                c361970EHb5.LIZ = c362140EHs.LIZ.getString(2131833398);
                c361970EHb5.LIZLLL = new AwS549S0100000_5(c362140EHs, 1438);
                c361970EHb5.LJ = "bottom_item_overlay_edit_speed";
                c361970EHb5.LJIIL = C0EI1.LIZ();
                arrayList.add(c361970EHb5.LIZ());
                C361970EHb c361970EHb6 = new C361970EHb();
                c361970EHb6.LIZ = c362140EHs.LIZ.getString(2131845441);
                c361970EHb6.LIZLLL = new AwS549S0100000_5(c362140EHs, 1441);
                c361970EHb6.LJ = "bottom_item_overlay_edit_crop";
                c361970EHb6.LJIIL = C0EI1.LIZ();
                arrayList.add(c361970EHb6.LIZ());
                boolean zLIZJ = c362140EHs.LIZJ();
                int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_PIP_VIDEO_ANIMATION_CONFIG, 0)).intValue();
                if (!zLIZJ ? ((iIntValue & 8) >> 3) != 0 : ((iIntValue & 2) >> 1) != 0) {
                    arrayList.add(c362140EHs.LJI);
                }
                if (C0E4N.LIZ(c362140EHs.LIZIZ)) {
                    C361970EHb c361970EHb7 = new C361970EHb();
                    c361970EHb7.LIZ = c362140EHs.LIZ.getString(2131833281);
                    c361970EHb7.LIZLLL = new AwS549S0100000_5(c362140EHs, 1444);
                    c361970EHb7.LJ = "bottom_item_overlay_edit_segment_effect";
                    c361970EHb7.LJIIL = C0EI1.LIZIZ(false, 7);
                    arrayList.add(c361970EHb7.LIZ());
                }
                if (z2 && C284680BDu.LIZ()) {
                    arrayList.add(c361980EHcLIZ);
                }
                VideoPublishEditModel videoPublishEditModel = c362140EHs.LIZIZ;
                NLEModel nLEModelLJI3 = c362140EHs.LIZJ;
                if (nLEModelLJI3 == null) {
                    C0E48 c0e482 = c362140EHs.LIZLLL;
                    if (c0e482 != null) {
                        nLEModelLJI3 = C350870DpF.LJI(c0e482);
                    } else {
                        nLEModelLJI3 = null;
                    }
                }
                if (C289230BVh.LIZ(videoPublishEditModel, nLEModelLJI3)) {
                    C361970EHb c361970EHb8 = new C361970EHb();
                    c361970EHb8.LIZ = c362140EHs.LIZ.getString(2131829754);
                    c361970EHb8.LIZLLL = new AwS549S0100000_5(c362140EHs, 1447);
                    c361970EHb8.LJ = "bottom_item_overlay_edit_magic";
                    c361970EHb8.LJIIL = C0EI1.LIZIZ(false, 7);
                    arrayList.add(c361970EHb8.LIZ());
                }
                C361970EHb c361970EHb9 = new C361970EHb();
                c361970EHb9.LIZ = c362140EHs.LIZ.getString(2131833402);
                c361970EHb9.LIZLLL = new AwS549S0100000_5(c362140EHs, 1452);
                c361970EHb9.LJ = "bottom_item_overlay_edit_volume";
                c361970EHb9.LJIIL = C0EI1.LIZ();
                arrayList.add(c361970EHb9.LIZ());
                if (C301710Bs9.LIZ(c362140EHs.LIZIZ)) {
                    C361970EHb c361970EHb10 = new C361970EHb();
                    c361970EHb10.LIZ = c362140EHs.LIZ.getString(2131834149);
                    c361970EHb10.LIZLLL = new AwS549S0100000_5(c362140EHs, 1454);
                    c361970EHb10.LJ = "bottom_item_overlay_edit_reduce_noise";
                    c361970EHb10.LJIIL = C0EI1.LIZJ(R.raw.icon_color_reduce_noise_tick_green, false);
                    c361970EHb10.LJIIIZ = false;
                    arrayList.add(c361970EHb10.LIZ());
                }
                C361970EHb c361970EHb11 = new C361970EHb();
                c361970EHb11.LIZ = c362140EHs.LIZ.getString(2131833397);
                c361970EHb11.LIZLLL = new AwS549S0100000_5(c362140EHs, 1392);
                c361970EHb11.LJ = "bottom_item_overlay_edit_rotate";
                c361970EHb11.LJIIL = C0EI1.LIZ();
                arrayList.add(c361970EHb11.LIZ());
                if (C289210BVf.LIZ(c362140EHs.LIZIZ)) {
                    C361970EHb c361970EHb12 = new C361970EHb();
                    c361970EHb12.LIZ = c362140EHs.LIZ.getString(2131833348);
                    c361970EHb12.LIZLLL = new AwS549S0100000_5(c362140EHs, 1395);
                    c361970EHb12.LJI = 1000L;
                    c361970EHb12.LJIIL = C0EI1.LIZIZ(false, 7);
                    c361970EHb12.LJ = "bottom_item_overlay_edit_filter";
                    arrayList.add(c361970EHb12.LIZ());
                }
                C0EWB.LIZ.getClass();
                int iLIZIZ = C0EWB.LIZIZ();
                if (iLIZIZ != -1) {
                    VideoPublishEditModel videoPublishEditModel2 = c362140EHs.LIZIZ;
                    NLEModel nLEModelLJI4 = c362140EHs.LIZJ;
                    if (nLEModelLJI4 == null) {
                        C0E48 c0e483 = c362140EHs.LIZLLL;
                        if (c0e483 != null) {
                            nLEModelLJI4 = C350870DpF.LJI(c0e483);
                        } else {
                            nLEModelLJI4 = null;
                        }
                    }
                    if (C0EWB.LJ(videoPublishEditModel2, nLEModelLJI4)) {
                        C361970EHb c361970EHb13 = new C361970EHb();
                        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
                        Context context = C0E46.LIZ().LIZ;
                        if (context == null) {
                            context = null;
                        }
                        Resources resources = context.getResources();
                        if (resources != null) {
                            string = resources.getString(iLIZIZ);
                        }
                        c361970EHb13.LIZ = string;
                        c361970EHb13.LIZLLL = new AwS549S0100000_5(c362140EHs, 1398);
                        c361970EHb13.LJI = 100L;
                        c361970EHb13.LJIIL = C0EI1.LIZ();
                        c361970EHb13.LJ = "bottom_item_overlay_edit_retouch";
                        arrayList.add(c361970EHb13.LIZ());
                    }
                }
                if (C288190BRh.LIZ() || (c362140EHs.LIZJ() && C0BO0.LIZ())) {
                    C361970EHb c361970EHb14 = new C361970EHb();
                    c361970EHb14.LIZ = c362140EHs.LIZ.getString(2131825206);
                    c361970EHb14.LIZLLL = new AwS549S0100000_5(c362140EHs, 1401);
                    c361970EHb14.LJIIL = C0EI1.LIZ();
                    c361970EHb14.LJ = "bottom_item_edit_adjust_filter";
                    arrayList.add(c361970EHb14.LIZ());
                }
                if (((Boolean) C284720BDy.LIZ.getValue()).booleanValue()) {
                    C361970EHb c361970EHb15 = new C361970EHb();
                    c361970EHb15.LIZ = c362140EHs.LIZ.getString(2131833413);
                    c361970EHb15.LIZLLL = new AwS549S0100000_5(c362140EHs, 1404);
                    c361970EHb15.LJ = "bottom_item_overlay_edit_copy";
                    arrayList.add(c361970EHb15.LIZ());
                }
                if (C289160BVa.LIZ(c362140EHs.LIZIZ)) {
                    C361970EHb c361970EHb16 = new C361970EHb();
                    c361970EHb16.LIZ = c362140EHs.LIZ.getString(2131834147);
                    c361970EHb16.LIZLLL = new AwS549S0100000_5(c362140EHs, 1421);
                    c361970EHb16.LJ = "bottom_item_edit_switch_to_pip";
                    arrayList.add(c361970EHb16.LIZ());
                }
                if ((!c362140EHs.LIZJ() && ((Boolean) C284690BDv.LIZ.getValue()).booleanValue()) || ((c362140EHs.LIZJ() && ((Boolean) C0B7V.LIZ.getValue()).booleanValue()) || (((nLEModelLJI = c362140EHs.LIZJ) != null || ((c0e48 = c362140EHs.LIZLLL) != null && (nLEModelLJI = C350870DpF.LJI(c0e48)) != null)) && C351220Dpo.LLIIIILZ(nLEModelLJI)))) {
                    arrayList.add(c362140EHs.LJII);
                }
                if ((!c362140EHs.LIZJ() && ((Boolean) C284600BDm.LIZ.getValue()).booleanValue()) || ((c362140EHs.LIZJ() && ((Boolean) C287320BNy.LIZ.getValue()).booleanValue()) || C346840Dik.LIZ(c362140EHs.LIZJ))) {
                    arrayList.add(c362140EHs.LJIIIIZZ);
                }
                if (C351230Dpp.LIZJ(Boolean.valueOf(c362140EHs.LIZJ()))) {
                    C361970EHb c361970EHb17 = new C361970EHb();
                    c361970EHb17.LIZ = c362140EHs.LIZ.getString(2131834125);
                    c361970EHb17.LIZLLL = new AwS549S0100000_5(c362140EHs, 1423);
                    c361970EHb17.LJ = "bottom_item_overlay_edit_mask";
                    c361970EHb17.LJIIL = C0EI1.LIZIZ(false, 5);
                    arrayList.add(c361970EHb17.LIZ());
                }
                if (C346910Dir.LIZIZ(c362140EHs.LIZIZ, c362140EHs.LIZJ)) {
                    C361970EHb c361970EHb18 = new C361970EHb();
                    c361970EHb18.LIZ = c362140EHs.LIZ.getString(2131834137);
                    c361970EHb18.LIZLLL = new AwS549S0100000_5(c362140EHs, 1426);
                    c361970EHb18.LJ = "bottom_item_overlay_edit_adjust_opacity";
                    c361970EHb18.LJIIL = C0EI1.LIZ();
                    arrayList.add(c361970EHb18.LIZ());
                }
                if (C289170BVb.LIZ(c362140EHs.LIZIZ, c362140EHs.LIZJ)) {
                    arrayList.add(c362140EHs.LJIIIZ);
                }
                if (C256110A1x.LIZ()) {
                    Iterator<C361980EHc> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIIL = "bottom_item_root_edit";
                    }
                    return arrayList;
                }
                return arrayList;
            case 3:
                C0EI0 c0ei0 = (C0EI0) c362090EHn.LJIJJLI.getValue();
                c0ei0.getClass();
                C361970EHb c361970EHb19 = new C361970EHb();
                c361970EHb19.LIZ = c0ei0.LIZ.getString(2131825206);
                c361970EHb19.LJ = "bottom_item_adjust_adjust_edit";
                c361970EHb19.LIZLLL = new AwS549S0100000_5(c0ei0, 1394);
                C361970EHb c361970EHb20 = new C361970EHb();
                c361970EHb20.LIZ = c0ei0.LIZ.getString(2131833413);
                c361970EHb20.LJ = "bottom_item_adjust_adjust_copy";
                c361970EHb20.LIZLLL = new AwS549S0100000_5(c0ei0, 1397);
                C361970EHb c361970EHb21 = new C361970EHb();
                c361970EHb21.LIZ = c0ei0.LIZ.getString(2131833414);
                c361970EHb21.LJ = "bottom_item_adjust_adjust_delete";
                c361970EHb21.LIZLLL = new AwS549S0100000_5(c0ei0, 1400);
                ArrayList<C361980EHc> arrayListLJ = C1697810uHb.LJ(c361970EHb19.LIZ(), c361970EHb20.LIZ(), c361970EHb21.LIZ());
                c0ei0.LIZIZ(arrayListLJ, c0ei0.LJI);
                return arrayListLJ;
            case 4:
                C362190EHx c362190EHx = (C362190EHx) c362090EHn.LJIILLIIL.getValue();
                c362190EHx.getClass();
                ArrayList<C361980EHc> arrayList2 = new ArrayList<>();
                if (C1416310mxZ.LJIILIIL(c362190EHx.LIZIZ)) {
                    c19eg = c362190EHx.LIZ;
                    i = 2131833318;
                } else {
                    c19eg = c362190EHx.LIZ;
                    i = 2131833386;
                }
                String string2 = c19eg.getString(i);
                C361970EHb c361970EHb22 = new C361970EHb();
                c361970EHb22.LIZ = string2;
                c361970EHb22.LJ = "bottom_item_captions_edit_bulk_edit";
                c361970EHb22.LIZLLL = new AwS549S0100000_5(c362190EHx, 1393);
                arrayList2.add(c361970EHb22.LIZ());
                if (C305200Bxm.LIZIZ(c362190EHx.LIZIZ)) {
                    C361970EHb c361970EHb23 = new C361970EHb();
                    c361970EHb23.LIZ = c362190EHx.LIZ.getString(2131828372);
                    c361970EHb23.LJ = "bottom_item_captions_edit_style";
                    c361970EHb23.LIZLLL = new AwS549S0100000_5(c362190EHx, 1396);
                    arrayList2.add(c361970EHb23.LIZ());
                }
                VideoPublishEditModel videoPublishEditModel3 = c362190EHx.LIZIZ;
                if (videoPublishEditModel3 != null && C1416310mxZ.LJIILJJIL(videoPublishEditModel3)) {
                    C0E48 c0e484 = c362190EHx.LIZLLL;
                    if (c0e484 != null) {
                        nLEModelLJI2 = C350870DpF.LJI(c0e484);
                    }
                    String strLIZLLL = C0EJ1.LIZLLL(c362190EHx.LIZIZ, nLEModelLJI2);
                    if (strLIZLLL == null && (nLEModelLJI2 == null || (strLIZLLL = C0EJ1.LJ(nLEModelLJI2)) == null)) {
                        strLIZLLL = "";
                    }
                    C361970EHb c361970EHb24 = new C361970EHb();
                    c361970EHb24.LIZ = c362190EHx.LIZ.getString(2131833311);
                    c361970EHb24.LJ = "bottom_item_captions_edit_remove";
                    c361970EHb24.LIZLLL = new AwS549S0100000_5(c362190EHx, 1399);
                    if (C0EJ1.LJI(strLIZLLL)) {
                        f = 1.0f;
                    } else {
                        f = 0.4f;
                    }
                    c361970EHb24.LJIIJ = f;
                    arrayList2.add(c361970EHb24.LIZ());
                }
                C361970EHb c361970EHb25 = new C361970EHb();
                c361970EHb25.LIZ = c362190EHx.LIZ.getString(2131833388);
                c361970EHb25.LJ = "bottom_item_captions_edit_split";
                c361970EHb25.LIZLLL = new AwS549S0100000_5(c362190EHx, 1402);
                arrayList2.add(c361970EHb25.LIZ());
                C361970EHb c361970EHb26 = new C361970EHb();
                c361970EHb26.LIZ = c362190EHx.LIZ.getString(2131833414);
                c361970EHb26.LJ = "bottom_item_captions_edit_delete";
                c361970EHb26.LIZLLL = new AwS549S0100000_5(c362190EHx, 1405);
                arrayList2.add(c361970EHb26.LIZ());
                if (C346910Dir.LIZIZ(c362190EHx.LIZIZ, c362190EHx.LIZJ)) {
                    C361970EHb c361970EHb27 = new C361970EHb();
                    c361970EHb27.LIZ = c362190EHx.LIZ.getString(2131834137);
                    c361970EHb27.LJ = "bottom_item_captions_edit_adjust_opacity";
                    c361970EHb27.LJIIL = C0EI1.LIZ();
                    c361970EHb27.LIZLLL = new AwS549S0100000_5(c362190EHx, 1422);
                    arrayList2.add(c361970EHb27.LIZ());
                }
                if (C289170BVb.LIZ(c362190EHx.LIZIZ, c362190EHx.LIZJ)) {
                    arrayList2.add(c362190EHx.LJII);
                    return arrayList2;
                }
                return arrayList2;
            case 5:
                if (nLETrackSlot != null) {
                    zHasExtra = nLETrackSlot.hasExtra("text_tts_id");
                } else {
                    zHasExtra = false;
                }
                C362190EHx c362190EHx2 = (C362190EHx) c362090EHn.LJIILLIIL.getValue();
                if (C0CHT.LIZ() && !C311110CHl.LIZ() && zHasExtra) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c362190EHx2.getClass();
                C361970EHb c361970EHb28 = new C361970EHb();
                c361970EHb28.LIZLLL = new AwS549S0100000_5(c362190EHx2, 1442);
                c361970EHb28.LJIIL = C0EI1.LIZ();
                c361970EHb28.LJ = "bottom_item_text_edit_text_to_speech";
                if (z3) {
                    c361970EHb28.LIZ = c362190EHx2.LIZ.getString(R.string.f1_);
                } else {
                    c361970EHb28.LIZ = c362190EHx2.LIZ.getString(2131833415);
                }
                C361970EHb c361970EHb29 = new C361970EHb();
                c361970EHb29.LIZ = c362190EHx2.LIZ.getString(2131834137);
                c361970EHb29.LJ = "bottom_item_text_edit_adjust_opacity";
                c361970EHb29.LJIIL = C0EI1.LIZ();
                c361970EHb29.LIZLLL = new AwS549S0100000_5(c362190EHx2, 1439);
                C361970EHb c361970EHb30 = new C361970EHb();
                c361970EHb30.LIZ = c362190EHx2.LIZ.getString(2131833413);
                c361970EHb30.LJ = "bottom_item_text_edit_copy";
                c361970EHb30.LIZLLL = new AwS549S0100000_5(c362190EHx2, 1433);
                C361970EHb c361970EHb31 = new C361970EHb();
                c361970EHb31.LIZ = c362190EHx2.LIZ.getString(2131833414);
                c361970EHb31.LJ = "bottom_item_text_edit_delete";
                c361970EHb31.LIZLLL = new AwS549S0100000_5(c362190EHx2, 1436);
                ArrayList<C361980EHc> arrayListLJ2 = C1697810uHb.LJ(c361970EHb30.LIZ(), c361970EHb31.LIZ());
                if (C346910Dir.LIZIZ(c362190EHx2.LIZIZ, c362190EHx2.LIZJ)) {
                    arrayListLJ2.add(c361970EHb29.LIZ());
                }
                if (C0CHT.LIZ()) {
                    ListProtector.add(arrayListLJ2, 0, c361970EHb28.LIZ());
                }
                if (((Boolean) C273680Ao2.LIZ.getValue()).booleanValue()) {
                    ListProtector.add(arrayListLJ2, 0, c362190EHx2.LJI);
                }
                if (((Boolean) C273660Ao0.LIZ.getValue()).booleanValue()) {
                    C361970EHb c361970EHb32 = new C361970EHb();
                    c361970EHb32.LIZ = c362190EHx2.LIZ.getString(2131833399);
                    c361970EHb32.LJ = "bottom_item_text_edit_split";
                    c361970EHb32.LIZLLL = new AwS549S0100000_5(c362190EHx2, 1430);
                    ListProtector.add(arrayListLJ2, 0, c361970EHb32.LIZ());
                }
                if (C289170BVb.LIZ(c362190EHx2.LIZIZ, c362190EHx2.LIZJ)) {
                    arrayListLJ2.add(c362190EHx2.LJII);
                    return arrayListLJ2;
                }
                return arrayListLJ2;
            case 6:
                C0E9Q c0e9q = (C0E9Q) c362090EHn.LJIILIIL.getValue();
                c0e9q.getClass();
                ArrayList<C361980EHc> arrayList3 = new ArrayList<>();
                arrayList3.addAll(C359870E8z.LIZ(c0e9q.LIZ, "bottom_item_edit_ai_image", "bottom_item_edit_ai_video", true, true, false));
                arrayList3.add(c0e9q.LJFF.getValue());
                return arrayList3;
            case 7:
                C362110EHp c362110EHp = (C362110EHp) c362090EHn.LJIJ.getValue();
                c362110EHp.getClass();
                C361970EHb c361970EHb33 = new C361970EHb();
                c361970EHb33.LIZ = c362110EHp.LIZ.getString(2131833282);
                c361970EHb33.LIZLLL = new AwS549S0100000_5(c362110EHp, 1456);
                c361970EHb33.LJ = "bottom_item_effect_edit_replace_effect";
                c361970EHb33.LJI = 1000L;
                C361970EHb c361970EHb34 = new C361970EHb();
                c361970EHb34.LIZ = c362110EHp.LIZ.getString(2131833413);
                c361970EHb34.LIZLLL = new AwS549S0100000_5(c362110EHp, 1459);
                c361970EHb34.LJ = "bottom_item_effect_edit_copy";
                C361970EHb c361970EHb35 = new C361970EHb();
                c361970EHb35.LIZ = c362110EHp.LIZ.getString(2131833280);
                c361970EHb35.LIZLLL = new AwS549S0100000_5(c362110EHp, 1461);
                c361970EHb35.LJ = "bottom_item_effect_edit_delete";
                ArrayList<C361980EHc> arrayListLJ3 = C1697810uHb.LJ(c361970EHb33.LIZ(), c361970EHb34.LIZ(), c361970EHb35.LIZ());
                if (C289170BVb.LIZ(c362110EHp.LIZIZ, c362110EHp.LIZJ)) {
                    if (nLETrackSlot != null && C351220Dpo.LLLLIL(nLETrackSlot)) {
                        return arrayListLJ3;
                    }
                    arrayListLJ3.add(c362110EHp.LJI);
                    return arrayListLJ3;
                }
                return arrayListLJ3;
            case 8:
                C362200EHy c362200EHy = (C362200EHy) c362090EHn.LJIJJ.getValue();
                c362200EHy.getClass();
                ArrayList<C361980EHc> arrayList4 = new ArrayList<>();
                if (((Boolean) C273660Ao0.LIZ.getValue()).booleanValue()) {
                    C361970EHb c361970EHb36 = new C361970EHb();
                    c361970EHb36.LIZ = c362200EHy.LIZ.getString(2131833399);
                    c361970EHb36.LIZLLL = new AwS549S0100000_5(c362200EHy, 1467);
                    c361970EHb36.LJ = "bottom_item_filter_edit_split";
                    arrayList4.add(c361970EHb36.LIZ());
                }
                C361970EHb c361970EHb37 = new C361970EHb();
                c361970EHb37.LIZ = c362200EHy.LIZ.getString(2131833357);
                c361970EHb37.LIZLLL = new AwS549S0100000_5(c362200EHy, 1470);
                c361970EHb37.LJ = "bottom_item_filter_edit_replace";
                c361970EHb37.LJI = 1000L;
                arrayList4.add(c361970EHb37.LIZ());
                C361970EHb c361970EHb38 = new C361970EHb();
                c361970EHb38.LIZ = c362200EHy.LIZ.getString(2131833413);
                c361970EHb38.LIZLLL = new AwS549S0100000_5(c362200EHy, 1383);
                c361970EHb38.LJ = "bottom_item_filter_edit_copy";
                arrayList4.add(c361970EHb38.LIZ());
                C361970EHb c361970EHb39 = new C361970EHb();
                c361970EHb39.LIZ = c362200EHy.LIZ.getString(2131833280);
                c361970EHb39.LIZLLL = new AwS549S0100000_5(c362200EHy, 1385);
                c361970EHb39.LJ = "bottom_item_filter_edit_delete";
                arrayList4.add(c361970EHb39.LIZ());
                c362200EHy.LIZIZ(arrayList4, c362200EHy.LJI);
                return arrayList4;
            case BdTuring.TYPE_ECAF /* 9 */:
                C362210EHz c362210EHz = (C362210EHz) c362090EHn.LJIJI.getValue();
                c362210EHz.getClass();
                ArrayList<C361980EHc> arrayList5 = new ArrayList<>();
                if (((Boolean) C273660Ao0.LIZ.getValue()).booleanValue()) {
                    C361970EHb c361970EHb40 = new C361970EHb();
                    c361970EHb40.LIZ = c362210EHz.LIZ.getString(2131833399);
                    c361970EHb40.LIZLLL = new AwS549S0100000_5(c362210EHz, 1465);
                    c361970EHb40.LJ = "bottom_item_sticker_edit_split";
                    arrayList5.add(c361970EHb40.LIZ());
                }
                C361970EHb c361970EHb41 = new C361970EHb();
                c361970EHb41.LIZ = c362210EHz.LIZ.getString(2131846248);
                c361970EHb41.LIZLLL = new AwS549S0100000_5(c362210EHz, 1468);
                c361970EHb41.LJ = "bottom_item_sticker_edit_replace";
                arrayList5.add(c361970EHb41.LIZ());
                C361970EHb c361970EHb42 = new C361970EHb();
                c361970EHb42.LIZ = c362210EHz.LIZ.getString(2131833413);
                c361970EHb42.LIZLLL = new AwS549S0100000_5(c362210EHz, 1384);
                c361970EHb42.LJ = "bottom_item_sticker_edit_copy";
                arrayList5.add(c361970EHb42.LIZ());
                C361970EHb c361970EHb43 = new C361970EHb();
                c361970EHb43.LIZ = c362210EHz.LIZ.getString(2131833280);
                c361970EHb43.LIZLLL = new AwS549S0100000_5(c362210EHz, 1386);
                c361970EHb43.LJ = "bottom_item_sticker_edit_delete";
                arrayList5.add(c361970EHb43.LIZ());
                if (C346910Dir.LIZIZ(c362210EHz.LIZIZ, c362210EHz.LIZJ)) {
                    C361970EHb c361970EHb44 = new C361970EHb();
                    c361970EHb44.LIZ = c362210EHz.LIZ.getString(2131834137);
                    c361970EHb44.LIZLLL = new AwS549S0100000_5(c362210EHz, 1388);
                    c361970EHb44.LJIIL = C0EI1.LIZ();
                    c361970EHb44.LJ = "bottom_item_sticker_edit_adjust_opacity";
                    arrayList5.add(c361970EHb44.LIZ());
                }
                c362210EHz.LIZIZ(arrayList5, c362210EHz.LJI);
                return arrayList5;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C362100EHo c362100EHoLIZIZ = c362090EHn.LIZIZ();
                ArrayList<C361980EHc> arrayListLJ4 = C1697810uHb.LJ(c362100EHoLIZIZ.LJIJ, c362100EHoLIZIZ.LJIIZILJ, c362100EHoLIZIZ.LJIJI);
                if (C289200BVe.LIZ(c362100EHoLIZIZ.LIZIZ, c362100EHoLIZIZ.LIZJ)) {
                    arrayListLJ4.add(c362100EHoLIZIZ.LJIIJ);
                }
                if (C256110A1x.LIZ()) {
                    Iterator<C361980EHc> it3 = arrayListLJ4.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJIIL = "bottom_item_root_sound";
                    }
                    return arrayListLJ4;
                }
                return arrayListLJ4;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C362100EHo c362100EHoLIZIZ2 = c362090EHn.LIZIZ();
                if (z4) {
                    ArrayList<C361980EHc> arrayListLJ5 = C1697810uHb.LJ(c362100EHoLIZIZ2.LJIILJJIL, c362100EHoLIZIZ2.LJIIIIZZ, c362100EHoLIZIZ2.LJIIJJI, c362100EHoLIZIZ2.LJIIL);
                    if (nLETrackSlot != null && C351220Dpo.LLLF(nLETrackSlot)) {
                        arrayListLJ5.remove(c362100EHoLIZIZ2.LJIILJJIL);
                        arrayListLJ5.remove(c362100EHoLIZIZ2.LJIIJJI);
                        return arrayListLJ5;
                    }
                    return arrayListLJ5;
                }
                ArrayList<C361980EHc> arrayListLJ6 = C1697810uHb.LJ(c362100EHoLIZIZ2.LJIIIIZZ, c362100EHoLIZIZ2.LJIILIIL, c362100EHoLIZIZ2.LJIIIZ, c362100EHoLIZIZ2.LJIIJJI, c362100EHoLIZIZ2.LJIIL, c362100EHoLIZIZ2.LJIIJ);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_adjust_entrance_when_selecting_a_sound", true, false)) {
                    C0E48 c0e485 = c362100EHoLIZIZ2.LIZLLL;
                    EditModelProvider.Companion.getClass();
                    boolean zLIZ = C349940Dnk.LIZ(c0e485, C0E1T.LIZ().getEditModel());
                    C0E48 c0e486 = c362100EHoLIZIZ2.LIZLLL;
                    if ((c0e486 == null || !C350890DpH.LJ(c0e486) || zLIZ) && C361460EFc.LIZ(C0E1T.LIZ().getEditModel())) {
                        c361980EHc = c362100EHoLIZIZ2.LJIILJJIL;
                    } else {
                        c361980EHc = c362100EHoLIZIZ2.LJIILL;
                    }
                    ListProtector.add(arrayListLJ6, 0, c361980EHc);
                }
                if (!C289200BVe.LIZ(c362100EHoLIZIZ2.LIZIZ, c362100EHoLIZIZ2.LIZJ)) {
                    arrayListLJ6.remove(c362100EHoLIZIZ2.LJIIJ);
                }
                if (!c362100EHoLIZIZ2.LJFF.LIZJ) {
                    arrayListLJ6.remove(c362100EHoLIZIZ2.LJIIIZ);
                }
                VideoPublishEditModel videoPublishEditModel4 = c362100EHoLIZIZ2.LIZIZ;
                if (videoPublishEditModel4 != null && C1403850mdT.LJFF(videoPublishEditModel4)) {
                    return arrayListLJ6;
                }
                arrayListLJ6.remove(c362100EHoLIZIZ2.LJIILIIL);
                return arrayListLJ6;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C362100EHo c362100EHoLIZIZ3 = c362090EHn.LIZIZ();
                c362100EHoLIZIZ3.getClass();
                C361970EHb c361970EHb45 = new C361970EHb();
                c361970EHb45.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131833399);
                c361970EHb45.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1425);
                c361970EHb45.LJ = "bottom_item_voiceover_edit_split";
                C361970EHb c361970EHb46 = new C361970EHb();
                c361970EHb46.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131833413);
                c361970EHb46.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1428);
                c361970EHb46.LJ = "bottom_item_voiceover_edit_copy";
                ArrayList<C361980EHc> arrayListLJ7 = C1697810uHb.LJ(c361970EHb45.LIZ(), c361970EHb46.LIZ());
                if (C301760BsE.LIZ()) {
                    C361970EHb c361970EHb47 = new C361970EHb();
                    c361970EHb47.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131858355);
                    c361970EHb47.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1437);
                    c361970EHb47.LJIIL = C0EI1.LIZIZ(false, 7);
                    c361970EHb47.LJ = "bottom_item_voiceover_edit_voice_effect";
                    arrayListLJ7.add(c361970EHb47.LIZ());
                }
                C361970EHb c361970EHb48 = new C361970EHb();
                c361970EHb48.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131833402);
                c361970EHb48.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1440);
                c361970EHb48.LJIIL = C0EI1.LIZ();
                c361970EHb48.LJ = "bottom_item_voiceover_edit_volume";
                arrayListLJ7.add(c361970EHb48.LIZ());
                C361970EHb c361970EHb49 = new C361970EHb();
                c361970EHb49.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131833280);
                c361970EHb49.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1431);
                c361970EHb49.LJ = "bottom_item_voiceover_edit_delete";
                arrayListLJ7.add(c361970EHb49.LIZ());
                if (C289200BVe.LIZ(c362100EHoLIZIZ3.LIZIZ, c362100EHoLIZIZ3.LIZJ)) {
                    arrayListLJ7.add(c362100EHoLIZIZ3.LJIIJ);
                }
                if (C301710Bs9.LIZ(c362100EHoLIZIZ3.LIZIZ)) {
                    C361970EHb c361970EHb50 = new C361970EHb();
                    c361970EHb50.LIZ = c362100EHoLIZIZ3.LIZ.getString(2131834149);
                    c361970EHb50.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ3, 1434);
                    c361970EHb50.LJIIL = C0EI1.LIZJ(R.raw.icon_color_reduce_noise_tick_green, false);
                    c361970EHb50.LJ = "bottom_item_voiceover_edit_reduce_noise";
                    arrayListLJ7.add(c361970EHb50.LIZ());
                }
                if (!CheckVoiceEffectResTask.LLILLJJLI) {
                    Iterator<C361980EHc> it4 = arrayListLJ7.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            C361980EHc next = it4.next();
                            if (Intrinsics.LJFF(next.LJI, "bottom_item_voiceover_edit_voice_effect")) {
                                if (next != null) {
                                    arrayListLJ7.remove(next);
                                }
                            }
                        }
                    }
                }
                if (C256110A1x.LIZ()) {
                    Iterator<C361980EHc> it5 = arrayListLJ7.iterator();
                    while (it5.hasNext()) {
                        it5.next().LJIIL = "bottom_item_root_sound";
                    }
                    return arrayListLJ7;
                }
                return arrayListLJ7;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return c362090EHn.LIZIZ().LIZJ();
            case 14:
                ArrayList<C361980EHc> arrayList6 = new ArrayList<>();
                arrayList6.add(C0E9R.LIZ(c362090EHn.LIZ, null));
                arrayList6.add(c362090EHn.LJJIII);
                return arrayList6;
            case 15:
                C362100EHo c362100EHoLIZIZ4 = c362090EHn.LIZIZ();
                c362100EHoLIZIZ4.getClass();
                C361970EHb c361970EHb51 = new C361970EHb();
                c361970EHb51.LIZ = c362100EHoLIZIZ4.LIZ.getString(2131836923);
                c361970EHb51.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ4, 1443);
                c361970EHb51.LJ = "bottom_item_lyric_edit_style";
                C361970EHb c361970EHb52 = new C361970EHb();
                c361970EHb52.LIZ = c362100EHoLIZIZ4.LIZ.getString(2131833280);
                c361970EHb52.LIZLLL = new AwS549S0100000_5(c362100EHoLIZIZ4, 1445);
                c361970EHb52.LJ = "bottom_item_lyric_edit_delete";
                return C1697810uHb.LJ(c361970EHb51.LIZ(), c361970EHb52.LIZ());
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC359860E8y
    public final boolean LIZLLL(C361980EHc c361980EHc, boolean z) {
        if (z && (this.LJI || this.LJIIIIZZ)) {
            return true;
        }
        if (c361980EHc != null && (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_effects") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_effect_add_effects") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_effect_edit_") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_sound_voiceover") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_root_filter") || Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_filter_edit_"))) {
            return true;
        }
        Boolean boolValueOf = null;
        C0E2C c0e2c = (C0E2C) this.LIZIZ.S7().LIZJ("panel_bounce_event", null);
        if (c0e2c != null) {
            boolValueOf = Boolean.valueOf(c0e2c.LIZ);
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            if (Intrinsics.LJFF(c0e2c.LIZJ, "video_transition") || Intrinsics.LJFF(c0e2c.LIZJ, "video_anim_panel") || (C1416310mxZ.LJIILIIL(this.LIZLLL) && Intrinsics.LJFF(c0e2c.LIZJ, "inline_caption"))) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
            return Intrinsics.LJFF(c0e2c.LIZJ, "speed_curve_edit_panel");
        }
        return false;
    }

    public C362080EHm(C19EG c19eg, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C362160EHu c362160EHu, C0E48 c0e48) {
        this.LIZ = c19eg;
        this.LIZIZ = c0e48;
        this.LIZJ = nLEModel;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = c362160EHu;
    }

    @Override // X.InterfaceC359860E8y
    public final boolean LJ(NLETrackSlot nLETrackSlot, boolean z, boolean z2, C361980EHc c361980EHc, String str) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean z3;
        String uuid;
        C0E48 c0e48 = this.LIZIZ;
        NLETrack nLETrackPt = null;
        if (c0e48 != null) {
            nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        C0E48 c0e482 = this.LIZIZ;
        if (c0e482 != null) {
            nLETrackPt = c0e482.Pt();
        }
        C0E48 c0e483 = this.LIZIZ;
        if (c0e483 == null) {
            return false;
        }
        if (nLETrackSlotLLLLLLIL != null && (uuid = nLETrackSlotLLLLLLIL.getUUID()) != null && C346680DiU.LIZ(C350870DpF.LJI(c0e483), uuid) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C289180BVc.LIZ(this.LIZLLL) && C351220Dpo.LLLIIL(nLETrackPt)) {
            return true;
        }
        if (C349940Dnk.LIZ(c0e483, LJI()) && Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_bgm_edit_")) {
            Pair<Integer, Integer> pairLIZJ = C349940Dnk.LIZJ(C350870DpF.LJI(c0e483));
            int iIntValue = pairLIZJ.getFirst().intValue();
            int iIntValue2 = pairLIZJ.getSecond().intValue();
            if (iIntValue + iIntValue2 > 1 && iIntValue2 > 0) {
                return true;
            }
            if (C0E5B.LIZ() && ((nLETrackPt == null || !nLETrackPt.getMainTrack()) && nLETrackSlotLLLLLLIL != null && !z3 && !z2)) {
                return false;
            }
        }
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_bottom_bar_ux_opt", true) == 1 || C0E5B.LIZ()) && z && nLETrackSlot == null && nLETrackSlotLLLLLLIL != null && !z3 && !z2) {
            return false;
        }
        if (C0E5B.LIZ() && ((nLETrackPt == null || !nLETrackPt.getMainTrack()) && nLETrackSlotLLLLLLIL != null && Intrinsics.LJFF(str, "root_item") && !z3 && !z2)) {
            return false;
        }
        if (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_effect_edit_") && this.LJI) {
            return false;
        }
        return this.LJIIL.contains(c361980EHc.LJI);
    }
}
