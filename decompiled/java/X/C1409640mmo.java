package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409640mmo extends AbstractC381020Ewm<InterfaceC1409680mms> implements InterfaceC1409680mms, C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LLILLL;
    public final Scene LLILZ;
    public final Function0<C1462070o9N> LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1409640mmo.class, "imageEditPreviewApi", "getImageEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1409640mmo.class, "inspirationPanelUIComponentApi", "getInspirationPanelUIComponentApi()Lcom/ss/android/ugc/aweme/image/inspiration/ui/panel/ImageInspirationPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1409640mmo.class, "inspirationDataApi", "getInspirationDataApi()Lcom/ss/android/ugc/aweme/image/inspiration/data/IImageInspirationDataApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1409640mmo.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJIJIL = 8;
    }

    public InterfaceC1409680mms X1() {
        return this;
    }

    @Override // X.InterfaceC1409680mms
    public C0FKH LJIIJ() {
        return new C0FKH() { // from class: X.0mmn
            @Override // X.C0FKH
            public final boolean A5() {
                InterfaceC1409660mmq interfaceC1409660mmqW2 = this.LIZ.w2();
                if (interfaceC1409660mmqW2 != null) {
                    return interfaceC1409660mmqW2.A5();
                }
                return false;
            }

            @Override // X.C0FKH
            public final void LIZ() {
                InterfaceC1409500mma interfaceC1409500mmaO2 = this.LIZ.o2();
                if (interfaceC1409500mmaO2 != null) {
                    interfaceC1409500mmaO2.ju0(EnumC1409650mmp.TEXT_STICKER);
                }
            }

            @Override // X.C0FKH
            public final boolean LIZJ() {
                C1453810nw3 c1453810nw3 = C1453810nw3.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                c1453810nw3.getClass();
                return C1453810nw3.LIZ(videoPublishEditModelLJJJLIIL);
            }

            @Override // X.C0FKH
            public final int LIZLLL() {
                return ((Number) C0AK9.LIZ.getValue()).intValue();
            }

            @Override // X.C0FKH
            public final void LJFF() {
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                C1409620mmm.LIZ.getClass();
                C20684815ws.LJIILLIIL("click_mention_entrance", C1409620mmm.LIZ(videoPublishEditModelLJJJLIIL).LIZ);
            }

            @Override // X.C0FKH
            public final void LJII() {
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                EnumC1409650mmp enumC1409650mmp = EnumC1409650mmp.TEXT_STICKER;
                InterfaceC1451050nrb interfaceC1451050nrbZ1 = this.LIZ.Z1();
                C1409620mmm.LIZJ(videoPublishEditModelLJJJLIIL, enumC1409650mmp, (interfaceC1451050nrbZ1 == null || interfaceC1451050nrbZ1.h7() != 0) ? EnumC1409600mmk.IDEAS : EnumC1409600mmk.TITLE);
            }

            @Override // X.C0FKH
            public final void LJIIIIZZ() {
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                C1409620mmm.LIZ.getClass();
                C20684815ws.LJIILLIIL("show_mention_entrance", C1409620mmm.LIZ(videoPublishEditModelLJJJLIIL).LIZ);
            }

            @Override // X.C0FKH
            public final boolean LJIIJ() {
                InterfaceC1409660mmq interfaceC1409660mmqW2 = this.LIZ.w2();
                if (interfaceC1409660mmqW2 != null) {
                    return interfaceC1409660mmqW2.uW0();
                }
                return false;
            }

            @Override // X.C0FKH
            public final int LJIIJJI() {
                return ((Number) C0AK6.LIZ.getValue()).intValue();
            }

            @Override // X.C0FKH
            public final int LJIILIIL() {
                InterfaceC1451050nrb interfaceC1451050nrbZ1 = this.LIZ.Z1();
                if (interfaceC1451050nrbZ1 != null) {
                    return interfaceC1451050nrbZ1.h7();
                }
                ImageAlbumData imageAlbumData = this.LIZ.LJJJLIIL().creativeModel.imageAlbumModel;
                if (imageAlbumData != null) {
                    return imageAlbumData.getCurrentPreviewIndex();
                }
                return 0;
            }

            @Override // X.C0FKH
            public final boolean Oh() {
                InterfaceC1409660mmq interfaceC1409660mmqW2 = this.LIZ.w2();
                if (interfaceC1409660mmqW2 != null) {
                    return interfaceC1409660mmqW2.Oh();
                }
                return false;
            }

            @Override // X.C0FKH
            public final void LJIIL() {
                if (LIZJ()) {
                    VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                    EnumC1409650mmp enumC1409650mmp = EnumC1409650mmp.TEXT_STICKER;
                    InterfaceC1451050nrb interfaceC1451050nrbZ1 = this.LIZ.Z1();
                    C1409620mmm.LJ(videoPublishEditModelLJJJLIIL, enumC1409650mmp, (interfaceC1451050nrbZ1 == null || interfaceC1451050nrbZ1.h7() != 0) ? EnumC1409600mmk.IDEAS : EnumC1409600mmk.TITLE);
                }
            }

            @Override // X.C0FKH
            public final void LJI(EnumC1409650mmp enumC1409650mmp) {
                InterfaceC1409660mmq interfaceC1409660mmqW2 = this.LIZ.w2();
                if (interfaceC1409660mmqW2 != null) {
                    interfaceC1409660mmqW2.bn2();
                }
                InterfaceC1409660mmq interfaceC1409660mmqW22 = this.LIZ.w2();
                if (interfaceC1409660mmqW22 != null) {
                    interfaceC1409660mmqW22.Uy(false, enumC1409650mmp, AFwS210S0000000_22.get$arr$(78));
                }
            }

            @Override // X.C0FKH
            public final void LJIIIZ(EnumC1409650mmp enumC1409650mmp) {
                InterfaceC1409660mmq interfaceC1409660mmqW2 = this.LIZ.w2();
                if (interfaceC1409660mmqW2 != null) {
                    interfaceC1409660mmqW2.Uy(true, enumC1409650mmp, AFwS210S0000000_22.get$arr$(79));
                }
            }

            @Override // X.C0FKH
            public final void LIZIZ(EnumC1409650mmp enumC1409650mmp, int i) {
                EnumC1409600mmk enumC1409600mmk;
                String value;
                String value2;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                InterfaceC1451050nrb interfaceC1451050nrbZ1 = this.LIZ.Z1();
                if (interfaceC1451050nrbZ1 != null && interfaceC1451050nrbZ1.h7() == 0) {
                    enumC1409600mmk = EnumC1409600mmk.TITLE;
                } else {
                    enumC1409600mmk = EnumC1409600mmk.IDEAS;
                }
                C1409620mmm.LIZ.getClass();
                C0LAB c0labLIZ = C1409620mmm.LIZ(videoPublishEditModelLJJJLIIL);
                String str = "";
                if (enumC1409650mmp == null || (value = enumC1409650mmp.getValue()) == null) {
                    value = "";
                }
                c0labLIZ.LJ("from_previous_entrance", value);
                if (enumC1409600mmk != null && (value2 = enumC1409600mmk.getValue()) != null) {
                    str = value2;
                }
                c0labLIZ.LJ("idea_type", str);
                c0labLIZ.LJ("inspiration_language", C0CHQ.LIZ().getAppLanguage());
                c0labLIZ.LIZ(i, "inspiration_length");
                C20684815ws.LJIILLIIL("edit_text_inspiration_ideas", c0labLIZ.LIZ);
            }

            @Override // X.C0FKH
            public final void LJ(EnumC1409650mmp enumC1409650mmp, boolean z, boolean z2, int i) {
                EnumC1409650mmp enumC1409650mmp2;
                EnumC1409600mmk enumC1409600mmk;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
                C1409670mmr c1409670mmr = EnumC1409650mmp.Companion;
                String value = enumC1409650mmp.getValue();
                c1409670mmr.getClass();
                EnumC1409650mmp[] enumC1409650mmpArrValues = EnumC1409650mmp.values();
                int length = enumC1409650mmpArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        enumC1409650mmp2 = enumC1409650mmpArrValues[i2];
                        if (Intrinsics.LJFF(enumC1409650mmp2.getValue(), value)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        enumC1409650mmp2 = EnumC1409650mmp.EDIT_BOTTOM;
                        break;
                    }
                }
                InterfaceC1451050nrb interfaceC1451050nrbZ1 = this.LIZ.Z1();
                if (interfaceC1451050nrbZ1 != null && interfaceC1451050nrbZ1.h7() == 0) {
                    enumC1409600mmk = EnumC1409600mmk.TITLE;
                } else {
                    enumC1409600mmk = EnumC1409600mmk.IDEAS;
                }
                C1409620mmm.LIZ.getClass();
                C0LAB c0labLIZ = C1409620mmm.LIZ(videoPublishEditModelLJJJLIIL);
                c0labLIZ.LJ("from_previous_entrance", enumC1409650mmp2.getValue());
                c0labLIZ.LJ("idea_type", enumC1409600mmk.getValue());
                c0labLIZ.LIZ(z ? 1 : 0, "is_used_ideas");
                c0labLIZ.LIZ(z2 ? 1 : 0, "is_edit_ideas");
                c0labLIZ.LJ("inspiration_language", C0CHQ.LIZ().getAppLanguage());
                c0labLIZ.LIZ(i, "inspiration_length");
                C20684815ws.LJIILLIIL("edit_text_inspiration_ideas_finish", c0labLIZ.LIZ);
            }
        };
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJI[3]);
    }

    public final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLILZLL.getValue(this, LLJI[0]);
    }

    public final InterfaceC1409500mma o2() {
        return (InterfaceC1409500mma) this.LLIZLLLIL.getValue(this, LLJI[2]);
    }

    public final InterfaceC1409660mmq w2() {
        return (InterfaceC1409660mmq) this.LLIZ.getValue(this, LLJI[1]);
    }

    public final Scene G2() {
        return this.LLILZ;
    }

    public final Function0<C1462070o9N> H2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1409640mmo(C1DRG c1drg, Scene scene, Function0<? extends C1462070o9N> function0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = scene;
        this.LLILZIL = function0;
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1409660mmq.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1409500mma.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
