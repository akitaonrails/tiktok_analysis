package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.componentservices.ImageEditComponentService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.services.ExternalImageEditComponentService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jg5.AvS541S0100000_22;
import kotlin.Pair;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462080o9O extends C1462070o9N {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZI;
    public final C1664740tQG LLLLLZIL;
    public final C1466810oH1 LLLLLZL;
    public final C1664740tQG LLLLZ;
    public final C1664740tQG LLLLZI;
    public final C01GW LLLLZIL;
    public final C1664750tQH LLLLZLL;
    public final C1664740tQG LLLLZLLIL;
    public InterfaceC1409680mms LLLLZLLLI;
    public final C01GW LLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462080o9O.class, "globalEditStickerNewEngineApi", "getGlobalEditStickerNewEngineApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1462080o9O.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1462080o9O.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1462080o9O.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1462080o9O.class, "imageEditTempModel", "getImageEditTempModel()Lcom/ss/android/ugc/aweme/image/base/ImageEditTempModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1462080o9O.class, "imageEditAddYoursStickerApi", "getImageEditAddYoursStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0);
        c09r3.getClass();
        LLLZI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.C1462070o9N
    public final List<?> LLLLL() {
        InterfaceC1464960oE2 interfaceC1464960oE2 = (InterfaceC1464960oE2) this.LLLLLZIL.getValue(this, LLLZI[0]);
        if (interfaceC1464960oE2 != null) {
            return interfaceC1464960oE2.LLLLLZ(EnumC1466150oFx.DM_GROUP_CHAT);
        }
        return null;
    }

    @Override // X.C1462070o9N
    public final InterfaceC196906122e LLLLLIL() {
        return new InterfaceC196906122e() { // from class: X.0o9S
            @Override // X.InterfaceC196906122e
            public final boolean LJLIIIL() {
                return true;
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLILLLLZI() {
                return true;
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLJI() {
                return false;
            }

            @Override // X.InterfaceC196906122e
            public final int[] LJLJJI(View view) {
                return null;
            }

            @Override // X.InterfaceC196906122e
            public final InfoStickerModel LJLI() {
                C1462080o9O c1462080o9O = this.LIZ;
                return (InfoStickerModel) ((C1451230nrt) c1462080o9O.LLLLZLL.getValue(c1462080o9O, C1462080o9O.LLLZI[4])).LIZIZ.getValue();
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLIIL() {
                return !this.LIZ.LLLLIILL();
            }

            @Override // X.InterfaceC196906122e
            public final Pair<Integer, Integer> LJLIL() {
                return new Pair<>(Integer.valueOf(C1450870nrJ.LIZIZ), Integer.valueOf(C1450870nrJ.LIZ));
            }
        };
    }

    @Override // X.C1462070o9N
    public final C124T LLLLLLLLLL() {
        return (C124T) this.LLLZ.getValue();
    }

    @Override // X.C1462070o9N
    public final void LLLZZIL() {
        C122Q c122q = this.LLLLLJLJLL;
        if (c122q != null) {
            c122q.b(new Pair<>(Integer.valueOf(C1450870nrJ.LIZIZ), Integer.valueOf(C1450870nrJ.LIZ)));
        }
    }

    public final InterfaceC559500Lwy LLZIL() {
        return (InterfaceC559500Lwy) this.LLLLZ.getValue(this, LLLZI[2]);
    }

    public final C0FVY LLZL() {
        return (C0FVY) this.LLLLLZL.getValue(this, LLLZI[1]);
    }

    @Override // X.C1462070o9N, X.InterfaceC1444170ngV
    public final List<TextStickerData> LJJL() {
        return super.LJJL();
    }

    @Override // X.C1462070o9N
    public final void LLLZIIL(C1DRF c1drf) {
        c1drf.LJFF(InterfaceC1453510nvZ.class, null, new AvS541S0100000_22(this, 16));
    }

    @Override // X.C1462070o9N
    public final void LLLZIL(C539960LFq c539960LFq) {
        super.LLLZIL(c539960LFq);
        if (C1416310mxZ.LJJLIIIJJIZ(LLLLLLL())) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C0FVD.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C0FVF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C0FVF.class, C0FVD.class, new AwS371S0200000_5(new C0ET4(), (C559610Lx9) c539960LFq, this, 8));
        }
        C1453810nw3 c1453810nw3 = C1453810nw3.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLLL = LLLLLLL();
        c1453810nw3.getClass();
        if (C1453810nw3.LIZ(videoPublishEditModelLLLLLLL)) {
            EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.LAZY;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C1409640mmo.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(InterfaceC1409680mms.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, InterfaceC1409680mms.class, C1409640mmo.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, this, 25));
        }
        Set<ImageEditComponentService> services = ServiceManager.get().getServices(ImageEditComponentService.class, true);
        if (services != null) {
            for (ImageEditComponentService imageEditComponentService : services) {
                VideoPublishEditModel videoPublishEditModelLLLLLLL2 = LLLLLLL();
                LLLLLLL();
                imageEditComponentService.LIZ(c539960LFq, videoPublishEditModelLLLLLLL2, this, EnumC1989707qp.STICKER);
            }
        }
        Set services2 = ServiceManager.get().getServices(ExternalImageEditComponentService.class, true);
        if (services2 != null) {
            Iterator it2 = services2.iterator();
            while (it2.hasNext()) {
                ((ExternalImageEditComponentService) it2.next()).registerComponents(c539960LFq, LLLLLLL().creativeModel, this);
            }
        }
    }

    @Override // X.C1462070o9N, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C0FVT c0fvtKR;
        C0FVY c0fvyAj;
        super.onActivityCreated(bundle);
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLLLZLLLI = (InterfaceC1409680mms) c1drg.LJIIL(null, InterfaceC1409680mms.class);
            LLLLLLJ().ss1(new C121M() { // from class: X.0o9a
                @Override // X.C121M
                public final void LIZ() {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }

                @Override // X.C121M
                public final void LIZIZ() {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }

                @Override // X.C121M
                public final void LIZJ() {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }
            });
            if (C1416310mxZ.LJJLIIIJJIZ(LLLLLLL())) {
                if (this.LLLLLL != null && (c0fvtKR = LLLLLLLLL().kR()) != null && (c0fvyAj = c0fvtKR.Aj()) != null) {
                    c0fvyAj.LJJZZI(new C0FTB() { // from class: X.0o9X
                        @Override // X.C0FTB
                        public final void LIZIZ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LIZJ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJFF(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJI(StickerModel stickerModel, boolean z) {
                        }

                        @Override // X.C0FTB
                        public final void LJII() {
                        }

                        @Override // X.C0FTB
                        public final void LJIIIIZZ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIIIZ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIIJJI(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIIL(StickerModel stickerModel, int i) {
                        }

                        @Override // X.C0FTB
                        public final void LJIILIIL(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIILJJIL(int i) {
                        }

                        @Override // X.C0FTB
                        public final void LJIILL(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIILLIIL(int i) {
                        }

                        @Override // X.C0FTB
                        public final void LJIJI(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIJJ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIJJLI(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJIL() {
                        }

                        @Override // X.C0FTB
                        public final void LJJ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJJI(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIFFI(int i) {
                        }

                        @Override // X.C0FTB
                        public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIII(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIIJ(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIIZ() {
                        }

                        @Override // X.C0FTB
                        public final void LJJIIZI(int i) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIJ() {
                        }

                        @Override // X.C0FTB
                        public final void LJJIJIIJI(StickerModel stickerModel) {
                        }

                        @Override // X.C0FTB
                        public final void LJJIJIIJIL(int i) {
                        }

                        @Override // X.C0FTB
                        public final EnumC1466150oFx[] LJJIJIL() {
                            return EnumC1466150oFx.values();
                        }

                        @Override // X.C0FTB
                        public final void LIZLLL(StickerModel stickerModel) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void LJ(StickerModel stickerModel) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void LJIIZILJ(StickerModel stickerModel) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void LJIJ(int i) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void f4(StickerModel stickerModel) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void LIZ(StickerModel stickerModel, boolean z) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }

                        @Override // X.C0FTB
                        public final void LJIIJ(StickerModel stickerModel, String str) {
                            InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LL.LLZIL();
                            if (interfaceC559500LwyLLZIL != null) {
                                interfaceC559500LwyLLZIL.Qk(false);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            C122Q c122q = this.LLLLLJLJLL;
            if (c122q == null) {
                return;
            }
            c122q.XD(new InterfaceC196929123b() { // from class: X.0o9Z
                @Override // X.InterfaceC196929123b
                public final void LJ() {
                }

                @Override // X.InterfaceC196929123b
                public final void LIZ(C196925122x c196925122x) {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }

                @Override // X.InterfaceC196929123b
                public final void LIZIZ(C196925122x c196925122x) {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }

                @Override // X.InterfaceC196929123b
                public final void LIZJ(C196925122x c196925122x) {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }

                @Override // X.InterfaceC196929123b
                public final void LIZLLL(C196925122x c196925122x) {
                    InterfaceC559500Lwy interfaceC559500LwyLLZIL = this.LIZ.LLZIL();
                    if (interfaceC559500LwyLLZIL != null) {
                        interfaceC559500LwyLLZIL.Qk(false);
                    }
                }
            });
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C1462070o9N
    public final void LLLLIIIILLL(DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo, Map<String, String> map) {
        InterfaceC1464960oE2 interfaceC1464960oE2 = (InterfaceC1464960oE2) this.LLLLLZIL.getValue(this, LLLZI[0]);
        if (interfaceC1464960oE2 != null) {
            interfaceC1464960oE2.f4(new DMGroupChatStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), dMGroupChatStickerGroupInfo, EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue(), false, false, map));
        }
    }

    @Override // X.C1462070o9N, X.InterfaceC1406950miT
    public final void Ph(Effect effect, String str) {
        ConcurrentHashMap<String, Object> concurrentHashMapLIZ;
        C196864120o c196864120o;
        LLLLLZL();
        if (C545820Lau.LIZIZ(this) == null) {
            return;
        }
        C1439740nZM c1439740nZM = (C1439740nZM) this.LLJJJJ.getValue(this, C1462070o9N.LLLLLZ[4]);
        AbstractC214814194y abstractC214814194yLIZIZ = C372650EjH.LIZIZ(this);
        c1439740nZM.getClass();
        new C1645820svk(C1624570sNT.LIZ(effect), abstractC214814194yLIZIZ).LIZ(new C1439760nZO(c1439740nZM, effect));
        LLLZI(effect, str);
        if (C1462570oAB.LJII(effect)) {
            LLLLLLZZ();
            return;
        }
        if (!C1462570oAB.LJ(effect) && !C1635160seY.LIZ(effect)) {
            List<String> tags = effect.getTags();
            if (tags != null && tags.contains("hashtag_global")) {
                InterfaceC1464960oE2 interfaceC1464960oE2 = (InterfaceC1464960oE2) this.LLLLLZIL.getValue(this, LLLZI[0]);
                if (interfaceC1464960oE2 == null) {
                    return;
                }
                interfaceC1464960oE2.SO2();
                return;
            }
            List<String> tags2 = effect.getTags();
            if (tags2 != null && tags2.contains("hashtag_single")) {
                C0FVY c0fvyLLZL = LLZL();
                if (c0fvyLLZL == null) {
                    return;
                }
                c0fvyLLZL.VY();
                return;
            }
            List<String> tags3 = effect.getTags();
            if (tags3 != null && tags3.contains("hashtag_embed")) {
                C0FVY c0fvyLLZL2 = LLZL();
                if (c0fvyLLZL2 == null) {
                    return;
                }
                c0fvyLLZL2.h51();
                return;
            }
            if (C1462570oAB.LIZJ(effect)) {
                if (u4.LJJIJIIJIL(LLLLLLL())) {
                    InterfaceC1465010oE7 interfaceC1465010oE7 = (InterfaceC1465010oE7) this.LLLLZLLIL.getValue(this, LLLZI[5]);
                    if (interfaceC1465010oE7 == null) {
                        return;
                    }
                    interfaceC1465010oE7.rj(null);
                    return;
                }
                InterfaceC1465010oE7 interfaceC1465010oE72 = (InterfaceC1465010oE7) this.LLLLZLLIL.getValue(this, LLLZI[5]);
                if (interfaceC1465010oE72 == null) {
                    return;
                }
                interfaceC1465010oE72.LJLLL("edit_page_sticker");
                return;
            }
            if (C1462570oAB.LJIJ(effect)) {
                LLLLLLL().creativeModel.stickerModel.musicStickerPreAdded = true;
                InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) this.LLLLZI.getValue(this, LLLZI[3]);
                if (interfaceC1455610nyx == null) {
                    return;
                }
                interfaceC1455610nyx.Ws(1);
                return;
            }
            if (C1462570oAB.LJIIZILJ(effect)) {
                C0FVY c0fvyLLZL3 = LLZL();
                if (c0fvyLLZL3 == null) {
                    return;
                }
                c0fvyLLZL3.Yp2();
                return;
            }
            if (C1462570oAB.LIZLLL(effect)) {
                C0FVY c0fvyLLZL4 = LLZL();
                if (c0fvyLLZL4 == null) {
                    return;
                }
                c0fvyLLZL4.Ie0();
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("extra", str);
            }
            linkedHashMap.put("sticker_source", "2");
            if (!u4.LJLL(LLLLLLL()) && C2490009pK.LIZ() && C1429880nJS.LIZIZ(effect) && C123100dR.LIZ((String) C13LP.LJJJLL(effect.getIconUrl().getUrlList())) && C1462570oAB.LIZ(effect)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ.plus(new C09AL())), null, null, new C353650Dtj(effect, this, linkedHashMap, null), 3);
                return;
            }
            C196864120o c196864120o2 = (C196864120o) this.LLLLZIL.getValue();
            if (c196864120o2 == null) {
                return;
            }
            c196864120o2.LLLIIIIL(effect, linkedHashMap);
            return;
        }
        if (TextUtils.isEmpty(str) || (concurrentHashMapLIZ = C178100mJ.LIZ(str)) == null || (c196864120o = (C196864120o) this.LLLLZIL.getValue()) == null) {
            return;
        }
        c196864120o.LLLII((String) concurrentHashMapLIZ.get("stickerId"), (String) concurrentHashMapLIZ.get("path"), CastIntegerProtector.parseInt((String) concurrentHashMapLIZ.get("width")), CastIntegerProtector.parseInt((String) concurrentHashMapLIZ.get("height")), Boolean.parseBoolean((String) concurrentHashMapLIZ.get("cutout")), C2097608Jq.LJIIIIZZ(new Pair("aigc_info", String.valueOf(concurrentHashMapLIZ.get("aigc_info"))), new Pair("sticker_source", "2"), new Pair("info_sticker_subtype", "29")));
    }

    public C1462080o9O(C1DRG c1drg, int i, InterfaceC1462140o9U interfaceC1462140o9U) {
        super(c1drg, i, false, interfaceC1462140o9U, 4);
        this.LLLLLZIL = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC1464960oE2.class, null);
        this.LLLLLZL = new C1466810oH1(this, 4);
        this.LLLLZ = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC559500Lwy.class, null);
        this.LLLLZI = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC1460000o62.class, null);
        this.LLLLZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 191));
        this.LLLLZLL = C1664770tQJ.LIZ(c1drg, C1451230nrt.class, null);
        this.LLLLZLLIL = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC1465010oE7.class, null);
        this.LLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 193));
    }
}
