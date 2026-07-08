package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardMultiGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728990v5t implements InterfaceC0148002o {
    public final RootData LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final LiveEffect LLILZ;
    public final LiveEffect LLILZIL;
    public final LiveEffect LLILZLL;
    public final LiveEffect LLIZ;
    public final int LLIZLLLIL;
    public final BillboardMultiGuide LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final List<TemplateItem> LLJILJIL;

    public C1728990v5t() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1728990v5t)) {
            return false;
        }
        C1728990v5t c1728990v5t = (C1728990v5t) obj;
        return Intrinsics.LJFF(this.LL, c1728990v5t.LL) && this.LLILLJJLI == c1728990v5t.LLILLJJLI && this.LLILLL == c1728990v5t.LLILLL && Intrinsics.LJFF(this.LLILZ, c1728990v5t.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1728990v5t.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1728990v5t.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1728990v5t.LLIZ) && this.LLIZLLLIL == c1728990v5t.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1728990v5t.LLJ) && this.LLJI == c1728990v5t.LLJI && this.LLJIJIL == c1728990v5t.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1728990v5t.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        LiveEffect liveEffect = this.LLILZ;
        int iHashCode2 = (iHashCode + (liveEffect == null ? 0 : liveEffect.hashCode())) * 31;
        LiveEffect liveEffect2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (liveEffect2 == null ? 0 : liveEffect2.hashCode())) * 31;
        LiveEffect liveEffect3 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (liveEffect3 == null ? 0 : liveEffect3.hashCode())) * 31;
        LiveEffect liveEffect4 = this.LLIZ;
        int iHashCode5 = (((iHashCode4 + (liveEffect4 == null ? 0 : liveEffect4.hashCode())) * 31) + this.LLIZLLLIL) * 31;
        BillboardMultiGuide billboardMultiGuide = this.LLJ;
        return ((((((iHashCode5 + (billboardMultiGuide != null ? billboardMultiGuide.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "BillboardGlobalState(rootData=" + this.LL + ", isShowAutoDisplayGuide=" + this.LLILLJJLI + ", isAutoDisplay=" + this.LLILLL + ", curLiveEffect=" + this.LLILZ + ", greenScreenPhotoEffect=" + this.LLILZIL + ", greenScreenTemplateEffect=" + this.LLILZLL + ", bannerTemplateEffect=" + this.LLIZ + ", maxDisplayCount=" + this.LLIZLLLIL + ", multiGuide=" + this.LLJ + ", canShowMultiGuide=" + this.LLJI + ", canShowMultiImage=" + this.LLJIJIL + ", templateDisplayList=" + this.LLJILJIL + ')';
    }

    public C1728990v5t(int i) {
        this(new RootData(null, null, false, 31), false, true, null, null, null, null, 1, null, false, false, C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1728990v5t(RootData rootData, boolean z, boolean z2, LiveEffect liveEffect, LiveEffect liveEffect2, LiveEffect liveEffect3, LiveEffect liveEffect4, int i, BillboardMultiGuide billboardMultiGuide, boolean z3, boolean z4, List<? extends TemplateItem> list) {
        this.LL = rootData;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = liveEffect;
        this.LLILZIL = liveEffect2;
        this.LLILZLL = liveEffect3;
        this.LLIZ = liveEffect4;
        this.LLIZLLLIL = i;
        this.LLJ = billboardMultiGuide;
        this.LLJI = z3;
        this.LLJIJIL = z4;
        this.LLJILJIL = list;
    }

    public static C1728990v5t LIZ(C1728990v5t c1728990v5t, RootData rootData, boolean z, boolean z2, LiveEffect liveEffect, LiveEffect liveEffect2, LiveEffect liveEffect3, LiveEffect liveEffect4, int i, BillboardMultiGuide billboardMultiGuide, boolean z3, boolean z4, List list, int i2) {
        List list2 = list;
        boolean z5 = z4;
        boolean z6 = z3;
        BillboardMultiGuide billboardMultiGuide2 = billboardMultiGuide;
        int i3 = i;
        LiveEffect liveEffect5 = liveEffect4;
        LiveEffect liveEffect6 = liveEffect3;
        LiveEffect liveEffect7 = liveEffect2;
        LiveEffect liveEffect8 = liveEffect;
        boolean z7 = z2;
        boolean z8 = z;
        RootData rootData2 = rootData;
        if ((i2 & 1) != 0) {
            rootData2 = c1728990v5t.LL;
        }
        if ((i2 & 2) != 0) {
            z8 = c1728990v5t.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z7 = c1728990v5t.LLILLL;
        }
        if ((i2 & 8) != 0) {
            liveEffect8 = c1728990v5t.LLILZ;
        }
        if ((i2 & 16) != 0) {
            liveEffect7 = c1728990v5t.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            liveEffect6 = c1728990v5t.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            liveEffect5 = c1728990v5t.LLIZ;
        }
        if ((i2 & 128) != 0) {
            i3 = c1728990v5t.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            billboardMultiGuide2 = c1728990v5t.LLJ;
        }
        if ((i2 & 512) != 0) {
            z6 = c1728990v5t.LLJI;
        }
        if ((i2 & 1024) != 0) {
            z5 = c1728990v5t.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list2 = c1728990v5t.LLJILJIL;
        }
        c1728990v5t.getClass();
        return new C1728990v5t(rootData2, z8, z7, liveEffect8, liveEffect7, liveEffect6, liveEffect5, i3, billboardMultiGuide2, z6, z5, list2);
    }
}
