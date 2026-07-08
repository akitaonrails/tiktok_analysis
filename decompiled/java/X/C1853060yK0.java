package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853060yK0 implements InterfaceC0148002o {
    public final PreviewMediaState LL;
    public final List<TikTokMediaModel> LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Integer> LLILZ;
    public final C1852860yJg LLILZIL;
    public final List<C1163730gOB> LLILZLL;
    public final List<TikTokMediaModel> LLIZ;
    public final boolean LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final boolean LLJI;
    public final EnumC1853160yKA LLJIJIL;
    public final C291001Au<TikTokMediaModel> LLJILJIL;
    public final C998810c6B LLJILJILJ;
    public final C291001Au<EnumC1783210wVL> LLJILLL;
    public final int LLJJ;
    public final C291001Au<List<TikTokMediaModel>> LLJJI;

    public C1853060yK0() {
        this(null, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853060yK0)) {
            return false;
        }
        C1853060yK0 c1853060yK0 = (C1853060yK0) obj;
        return Intrinsics.LJFF(this.LL, c1853060yK0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1853060yK0.LLILLJJLI) && this.LLILLL == c1853060yK0.LLILLL && Intrinsics.LJFF(this.LLILZ, c1853060yK0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1853060yK0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1853060yK0.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1853060yK0.LLIZ) && this.LLIZLLLIL == c1853060yK0.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1853060yK0.LLJ) && this.LLJI == c1853060yK0.LLJI && this.LLJIJIL == c1853060yK0.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1853060yK0.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1853060yK0.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1853060yK0.LLJILLL) && this.LLJJ == c1853060yK0.LLJJ && Intrinsics.LJFF(this.LLJJI, c1853060yK0.LLJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Integer> c291001Au = this.LLILZ;
        int iHashCode2 = (((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        List<C1163730gOB> list = this.LLILZLL;
        int iHashCode3 = (((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLJ;
        int iHashCode4 = (((((iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31;
        C291001Au<TikTokMediaModel> c291001Au3 = this.LLJILJIL;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C998810c6B c998810c6B = this.LLJILJILJ;
        int iHashCode6 = (iHashCode5 + (c998810c6B == null ? 0 : c998810c6B.hashCode())) * 31;
        C291001Au<EnumC1783210wVL> c291001Au4 = this.LLJILLL;
        return ((((iHashCode6 + (c291001Au4 != null ? c291001Au4.hashCode() : 0)) * 31) + this.LLJJ) * 31) + this.LLJJI.hashCode();
    }

    public final String toString() {
        return "ChooseMediaState(previewMediaState=" + this.LL + ", previewMediaModelList=" + this.LLILLJJLI + ", previewSelectedMediaModel=" + this.LLILLL + ", previewPosition=" + this.LLILZ + ", photoMediaRefresh=" + this.LLILZIL + ", imageAlbumList=" + this.LLILZLL + ", selectedPhotoMediaList=" + this.LLIZ + ", showAlbum=" + this.LLIZLLLIL + ", sheetStatus=" + this.LLJ + ", showPermissionGuide=" + this.LLJI + ", currentPermissionState=" + this.LLJIJIL + ", scrollToSelectedPhoto=" + this.LLJILJIL + ", bottomSheetContainerConfig=" + this.LLJILJILJ + ", bottomSheetAction=" + this.LLJILLL + ", mediaChooseBottomSheetState=" + this.LLJJ + ", forceRefreshBottomData=" + this.LLJJI + ')';
    }

    public C1853060yK0(EnumC1853160yKA enumC1853160yKA, int i) {
        PreviewMediaState previewMediaState;
        C13BV c13bv;
        C1852860yJg c1852860yJg;
        C13BV c13bv2;
        EnumC1853160yKA enumC1853160yKA2 = enumC1853160yKA;
        if ((i & 1) != 0) {
            previewMediaState = new PreviewMediaState(null, -1);
        } else {
            previewMediaState = null;
        }
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 16) != 0) {
            c1852860yJg = C1853080yK2.LIZ;
        } else {
            c1852860yJg = null;
        }
        if ((i & 64) != 0) {
            c13bv2 = C13BV.INSTANCE;
        } else {
            c13bv2 = null;
        }
        this(previewMediaState, c13bv, false, null, c1852860yJg, null, c13bv2, false, null, false, (i & 1024) != 0 ? EnumC1853160yKA.DENIED : enumC1853160yKA2, null, null, null, (i & 16384) != 0 ? -1 : 0, (i & 32768) != 0 ? new C291001Au(C13BV.INSTANCE) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1853060yK0(PreviewMediaState previewMediaState, List<? extends TikTokMediaModel> list, boolean z, C291001Au<Integer> c291001Au, C1852860yJg c1852860yJg, List<C1163730gOB> list2, List<? extends TikTokMediaModel> list3, boolean z2, C291001Au<Boolean> c291001Au2, boolean z3, EnumC1853160yKA enumC1853160yKA, C291001Au<? extends TikTokMediaModel> c291001Au3, C998810c6B c998810c6B, C291001Au<? extends EnumC1783210wVL> c291001Au4, int i, C291001Au<? extends List<? extends TikTokMediaModel>> c291001Au5) {
        this.LL = previewMediaState;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = c291001Au;
        this.LLILZIL = c1852860yJg;
        this.LLILZLL = list2;
        this.LLIZ = list3;
        this.LLIZLLLIL = z2;
        this.LLJ = c291001Au2;
        this.LLJI = z3;
        this.LLJIJIL = enumC1853160yKA;
        this.LLJILJIL = c291001Au3;
        this.LLJILJILJ = c998810c6B;
        this.LLJILLL = c291001Au4;
        this.LLJJ = i;
        this.LLJJI = c291001Au5;
    }

    public static C1853060yK0 LIZ(C1853060yK0 c1853060yK0, PreviewMediaState previewMediaState, List list, boolean z, C291001Au c291001Au, C1852860yJg c1852860yJg, List list2, List list3, boolean z2, C291001Au c291001Au2, EnumC1853160yKA enumC1853160yKA, C291001Au c291001Au3, C998810c6B c998810c6B, C291001Au c291001Au4, int i, C291001Au c291001Au5, int i2) {
        boolean z3;
        C291001Au c291001Au6 = c291001Au5;
        int i3 = i;
        C291001Au c291001Au7 = c291001Au4;
        C998810c6B c998810c6B2 = c998810c6B;
        C291001Au c291001Au8 = c291001Au3;
        EnumC1853160yKA enumC1853160yKA2 = enumC1853160yKA;
        C291001Au c291001Au9 = c291001Au2;
        boolean z4 = z2;
        List list4 = list3;
        List list5 = list2;
        C1852860yJg c1852860yJg2 = c1852860yJg;
        C291001Au c291001Au10 = c291001Au;
        boolean z5 = z;
        List list6 = list;
        PreviewMediaState previewMediaState2 = previewMediaState;
        if ((i2 & 1) != 0) {
            previewMediaState2 = c1853060yK0.LL;
        }
        if ((i2 & 2) != 0) {
            list6 = c1853060yK0.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z5 = c1853060yK0.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au10 = c1853060yK0.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c1852860yJg2 = c1853060yK0.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            list5 = c1853060yK0.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            list4 = c1853060yK0.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z4 = c1853060yK0.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c291001Au9 = c1853060yK0.LLJ;
        }
        if ((i2 & 512) != 0) {
            z3 = c1853060yK0.LLJI;
        } else {
            z3 = false;
        }
        if ((i2 & 1024) != 0) {
            enumC1853160yKA2 = c1853060yK0.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au8 = c1853060yK0.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c998810c6B2 = c1853060yK0.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            c291001Au7 = c1853060yK0.LLJILLL;
        }
        if ((i2 & 16384) != 0) {
            i3 = c1853060yK0.LLJJ;
        }
        if ((i2 & 32768) != 0) {
            c291001Au6 = c1853060yK0.LLJJI;
        }
        c1853060yK0.getClass();
        return new C1853060yK0(previewMediaState2, list6, z5, c291001Au10, c1852860yJg2, list5, list4, z4, c291001Au9, z3, enumC1853160yKA2, c291001Au8, c998810c6B2, c291001Au7, i3, c291001Au6);
    }
}
