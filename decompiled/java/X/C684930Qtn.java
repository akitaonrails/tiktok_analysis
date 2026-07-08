package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684930Qtn implements InterfaceC685060Qu0, C07LW, InterfaceC685100Qu4 {
    public final InterfaceC682670Qq9 LL;
    public final boolean LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public Float LLIZLLLIL;
    public Float LLJ;
    public final AnonymousClass0529 LLJI;
    public int LLJILJIL;
    public final List<Aweme> LLJILJILJ;
    public final List<C0R0A> LLJILLL;
    public final String LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final int LLIZ = 0;
    public final String LLJIJIL = String.valueOf(C321460Ciu.LIZ());

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684930Qtn)) {
            return false;
        }
        C684930Qtn c684930Qtn = (C684930Qtn) obj;
        return Intrinsics.LJFF(this.LL, c684930Qtn.LL) && this.LLILLJJLI == c684930Qtn.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c684930Qtn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c684930Qtn.LLILZ) && this.LLILZIL == c684930Qtn.LLILZIL && this.LLILZLL == c684930Qtn.LLILZLL && this.LLIZ == c684930Qtn.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c684930Qtn.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c684930Qtn.LLJ) && Intrinsics.LJFF(this.LLJI, c684930Qtn.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31;
        Float f = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        AnonymousClass0529 anonymousClass0529 = this.LLJI;
        return iHashCode5 + (anonymousClass0529 != null ? anonymousClass0529.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1NimbleCardItem(fusionBlock=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", multiSummaryIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", startLabelIndex=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", asyncRender=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", subItemIndex=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", topSpaceDP=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", bottomSpaceDP=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", animInfo=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC685060Qu0
    public final C1263404wy LJJIIJ() {
        return C07GD.LIZIZ(C2097908Jt.LIZJ(new Pair("preload_scene", "search_top1_nimble")));
    }

    @Override // X.C14NM
    public final int getContentType() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    @Override // X.C07LW
    public final Map<String, Object> getData() {
        return (Map) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJJZ() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJJLI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJLIIJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final Integer LJLJLJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC685060Qu0
    public final InterfaceC682670Qq9 LLJJI() {
        return this.LL;
    }

    @Override // X.InterfaceC685610Qut
    public final List<C0R0A> getImageList() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getItemId() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC685060Qu0
    public final String getLayoutName() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getSubTitle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC684740QtU
    public final List<Aweme> getVideoList() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLJ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLIZLLLIL = f;
    }

    @Override // X.InterfaceC685020Qtw
    public final void LJJLIIIJILLIZJL(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC684740QtU
    public final void LLIIL(int i) {
        this.LLJILJIL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C684930Qtn c684930Qtn;
        InterfaceC682670Qq9 interfaceC682670Qq9;
        if (!C654380Plc.LIZ().fixPovUiFlicker) {
            return C684900Qtk.LIZ(this, interfaceC1891350zJl);
        }
        String bizUniqueKey = this.LL.getBizUniqueKey();
        String bizUniqueKey2 = null;
        if ((interfaceC1891350zJl instanceof C684930Qtn) && (c684930Qtn = (C684930Qtn) interfaceC1891350zJl) != null && (interfaceC682670Qq9 = c684930Qtn.LL) != null) {
            bizUniqueKey2 = interfaceC682670Qq9.getBizUniqueKey();
        }
        if (bizUniqueKey != null && bizUniqueKey.length() != 0 && bizUniqueKey2 != null && bizUniqueKey2.length() != 0) {
            return Intrinsics.LJFF(bizUniqueKey, bizUniqueKey2);
        }
        return C684900Qtk.LIZ(this, interfaceC1891350zJl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<X.0R0A>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C684930Qtn(InterfaceC682670Qq9 interfaceC682670Qq9, boolean z, Integer num, String str, int i, boolean z2, Float f, Float f2, AnonymousClass0529 anonymousClass0529) {
        ?? arrayList;
        String layoutName;
        this.LL = interfaceC682670Qq9;
        this.LLILLJJLI = z;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = z2;
        this.LLIZLLLIL = f;
        this.LLJ = f2;
        this.LLJI = anonymousClass0529;
        List<Aweme> subVideos = interfaceC682670Qq9.getSubVideos();
        this.LLJILJILJ = subVideos == null ? C13BV.INSTANCE : subVideos;
        List<ImageData> subImages = interfaceC682670Qq9.getSubImages();
        if (subImages != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(subImages, 10));
            for (ImageData imageData : subImages) {
                String imageUrl = imageData.getImageUrl();
                if (imageUrl == null) {
                    imageUrl = "";
                }
                arrayList.add(new C0R0A(new C0R09(imageData.getImageWidth(), imageData.getImageHeight()), imageUrl));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLJILLL = arrayList;
        C1839007Ie.LIZ();
        if (this.LLILLJJLI) {
            layoutName = this.LL.getDetailLayoutName();
        } else {
            layoutName = this.LL.getLayoutName();
        }
        this.LLJJ = layoutName;
        this.LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1189));
        this.LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1190));
    }
}
