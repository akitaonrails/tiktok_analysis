package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0h7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191620h7A implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function0<Integer> LIZIZ;
    public final C1191750h7N LIZJ;
    public InterfaceC1191840h7W LIZLLL;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    public final PoiReviewsApi.PoiReviewModel LIZLLL() {
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
        if (interfaceC1191840h7W != null) {
            return interfaceC1191840h7W.LJIL();
        }
        return null;
    }

    public final PageFinder LJ() {
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
        if (interfaceC1191840h7W == null || (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) == null || (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) == null) {
            return null;
        }
        return PageFinder.via(view);
    }

    public final InterfaceC1191710h7J LJFF() {
        return this.LIZ.invoke();
    }

    public final void LJI() {
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL2;
        Fragment fragmentLJIIJ;
        if (this.LIZJ.LIZIZ.invoke().booleanValue()) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
            Fragment fragmentLJIIJ2 = null;
            String strXq1 = interfaceC1191710h7JLJFF != null ? interfaceC1191710h7JLJFF.Xq1() : null;
            InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = (interfaceC1191840h7W == null || (abstractRefactorPoiReviewCellLLLLLLIL2 = interfaceC1191840h7W.LLLLLLIL()) == null || (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL2)) == null) ? null : C1558360qeg.LJFF(fragmentLJIIJ, null);
            InterfaceC1191840h7W interfaceC1191840h7W2 = this.LIZLLL;
            if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W2.LLLLLLIL()) != null) {
                fragmentLJIIJ2 = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL);
            }
            C1185430gxB.LJJIJL(c1185430gxB, strXq1, "click", interfaceC665370Q7zLJFF, "poi_secondary_reviews_page", "poi_review", PageFinder.via(fragmentLJIIJ2));
        }
    }

    public final void LJII() {
        String str;
        String str2;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        String strZZ1;
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null) {
            return;
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
        String strLJJLIIIJJI = interfaceC1191710h7JLJFF != null ? interfaceC1191710h7JLJFF.LJJLIIIJJI() : null;
        String str3 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String strInvoke = this.LIZJ.LJ.invoke();
        String reviewId = poiReviewModelLIZLLL.getReviewId();
        if (reviewId == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModelLIZLLL.getAuthor();
        if (author == null || (str = author.userId) == null) {
            str = "";
        }
        String poiId = poiReviewModelLIZLLL.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF2 = LJFF();
        if (interfaceC1191710h7JLJFF2 != null && (strZZ1 = interfaceC1191710h7JLJFF2.ZZ1()) != null) {
            str3 = strZZ1;
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModelLIZLLL.getContent();
        float fLIZIZ = C1175120ggY.LIZIZ(content != null ? Float.valueOf(C1190820h5s.LIZLLL(content)) : null);
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModelLIZLLL.getContent();
        boolean zLIZ = C123100dR.LIZ(content2 != null ? content2.text : null);
        Integer numInvoke = this.LIZIZ.invoke();
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModelLIZLLL.getStatistics();
        int iLongValue = (statistics == null || (l = statistics.likeCount) == null) ? 0 : (int) l.longValue();
        PoiReviewsApi.PoiReviewContentModel content3 = poiReviewModelLIZLLL.getContent();
        int size = (content3 == null || (list = content3.images) == null) ? 0 : list.size();
        PoiReviewsApi.PoiReviewContentModel content4 = poiReviewModelLIZLLL.getContent();
        int length = (content4 == null || (str2 = content4.text) == null) ? 0 : str2.length();
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLIZLLL.getAuthor();
        String str4 = author2 != null ? author2.reviewUserSource : null;
        Integer source = poiReviewModelLIZLLL.getSource();
        int iIntValue = source != null ? source.intValue() : EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF3 = LJFF();
        String logId = interfaceC1191710h7JLJFF3 != null ? interfaceC1191710h7JLJFF3.getLogId() : null;
        PoiReviewsApi.PoiReviewContentModel content5 = poiReviewModelLIZLLL.getContent();
        String str5 = content5 != null ? content5.textLang : null;
        boolean wantTranslate = poiReviewModelLIZLLL.getWantTranslate();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF4 = LJFF();
        String strYy = interfaceC1191710h7JLJFF4 != null ? interfaceC1191710h7JLJFF4.yy() : null;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF5 = LJFF();
        String strO32 = interfaceC1191710h7JLJFF5 != null ? interfaceC1191710h7JLJFF5.o32() : null;
        boolean zIsAnonymous = poiReviewModelLIZLLL.isAnonymous();
        InterfaceC665370Q7z interfaceC665370Q7zInvoke = this.LIZJ.LIZLLL.invoke(this.LIZLLL);
        Integer numInvoke2 = this.LIZJ.LIZ.invoke();
        Integer numInvoke3 = this.LIZJ.LIZJ.invoke(poiReviewModelLIZLLL);
        String verifiedDisplay = poiReviewModelLIZLLL.getVerifiedDisplay();
        PageFinder pageFinderLJ = LJ();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIIJ(strLJJLIIIJJI, strInvoke, reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, numInvoke, iLongValue, size, length, str4, iIntValue, logId, str5, wantTranslate, strYy, strO32, "reviews_button", zIsAnonymous ? 1 : 0, interfaceC665370Q7zInvoke, numInvoke2, numInvoke3, verifiedDisplay, pageFinderLJ);
    }

    public final void LJIIIIZZ() {
        String str;
        String str2;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        String strZZ1;
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null) {
            return;
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
        String strLJJLIIIJJI = interfaceC1191710h7JLJFF != null ? interfaceC1191710h7JLJFF.LJJLIIIJJI() : null;
        String str3 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String reviewId = poiReviewModelLIZLLL.getReviewId();
        if (reviewId == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModelLIZLLL.getAuthor();
        if (author == null || (str = author.userId) == null) {
            str = "";
        }
        String poiId = poiReviewModelLIZLLL.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF2 = LJFF();
        if (interfaceC1191710h7JLJFF2 != null && (strZZ1 = interfaceC1191710h7JLJFF2.ZZ1()) != null) {
            str3 = strZZ1;
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModelLIZLLL.getContent();
        float fLIZIZ = C1175120ggY.LIZIZ(content != null ? Float.valueOf(C1190820h5s.LIZLLL(content)) : null);
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModelLIZLLL.getContent();
        boolean zLIZ = C123100dR.LIZ(content2 != null ? content2.text : null);
        int iIntValue = this.LIZIZ.invoke().intValue();
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModelLIZLLL.getStatistics();
        int iLongValue = (statistics == null || (l = statistics.likeCount) == null) ? 0 : (int) l.longValue();
        PoiReviewsApi.PoiReviewContentModel content3 = poiReviewModelLIZLLL.getContent();
        int size = (content3 == null || (list = content3.images) == null) ? 0 : list.size();
        PoiReviewsApi.PoiReviewContentModel content4 = poiReviewModelLIZLLL.getContent();
        int length = (content4 == null || (str2 = content4.text) == null) ? 0 : str2.length();
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLIZLLL.getAuthor();
        String str4 = author2 != null ? author2.reviewUserSource : null;
        Integer source = poiReviewModelLIZLLL.getSource();
        int iIntValue2 = source != null ? source.intValue() : EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF3 = LJFF();
        String logId = interfaceC1191710h7JLJFF3 != null ? interfaceC1191710h7JLJFF3.getLogId() : null;
        PoiReviewsApi.PoiReviewContentModel content5 = poiReviewModelLIZLLL.getContent();
        String str5 = content5 != null ? content5.textLang : null;
        boolean wantTranslate = poiReviewModelLIZLLL.getWantTranslate();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF4 = LJFF();
        String strYy = interfaceC1191710h7JLJFF4 != null ? interfaceC1191710h7JLJFF4.yy() : null;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF5 = LJFF();
        String strO32 = interfaceC1191710h7JLJFF5 != null ? interfaceC1191710h7JLJFF5.o32() : null;
        boolean zIsAnonymous = poiReviewModelLIZLLL.isAnonymous();
        InterfaceC665370Q7z interfaceC665370Q7zInvoke = this.LIZJ.LIZLLL.invoke(this.LIZLLL);
        String verifiedDisplay = poiReviewModelLIZLLL.getVerifiedDisplay();
        PageFinder pageFinderLJ = LJ();
        c1191160h6Q.getClass();
        C1191160h6Q.LJII(strLJJLIIIJJI, reviewId, str, poiId, str3, fLIZIZ, zLIZ ? 1 : 0, iIntValue, iLongValue, size, length, str4, iIntValue2, logId, str5, wantTranslate, strYy, strO32, zIsAnonymous ? 1 : 0, interfaceC665370Q7zInvoke, verifiedDisplay, pageFinderLJ);
    }

    public final void LJIIJJI() {
        String str;
        Boolean bool;
        String str2;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        String strZZ1;
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null) {
            return;
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
        String strLJJLIIIJJI = interfaceC1191710h7JLJFF != null ? interfaceC1191710h7JLJFF.LJJLIIIJJI() : null;
        String str3 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String reviewId = poiReviewModelLIZLLL.getReviewId();
        if (reviewId == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModelLIZLLL.getAuthor();
        if (author == null || (str = author.userId) == null) {
            str = "";
        }
        String poiId = poiReviewModelLIZLLL.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF2 = LJFF();
        if (interfaceC1191710h7JLJFF2 != null && (strZZ1 = interfaceC1191710h7JLJFF2.ZZ1()) != null) {
            str3 = strZZ1;
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModelLIZLLL.getContent();
        float fLIZIZ = C1175120ggY.LIZIZ(content != null ? Float.valueOf(C1190820h5s.LIZLLL(content)) : null);
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModelLIZLLL.getContent();
        boolean zLIZ = C123100dR.LIZ(content2 != null ? content2.text : null);
        int iIntValue = this.LIZIZ.invoke().intValue();
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModelLIZLLL.getStatistics();
        int iLongValue = (statistics == null || (l = statistics.likeCount) == null) ? 0 : (int) l.longValue();
        PoiReviewsApi.PoiReviewContentModel content3 = poiReviewModelLIZLLL.getContent();
        int size = (content3 == null || (list = content3.images) == null) ? 0 : list.size();
        PoiReviewsApi.PoiReviewContentModel content4 = poiReviewModelLIZLLL.getContent();
        int length = (content4 == null || (str2 = content4.text) == null) ? 0 : str2.length();
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLIZLLL.getAuthor();
        String str4 = author2 != null ? author2.reviewUserSource : null;
        Integer source = poiReviewModelLIZLLL.getSource();
        int iIntValue2 = source != null ? source.intValue() : EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF3 = LJFF();
        String logId = interfaceC1191710h7JLJFF3 != null ? interfaceC1191710h7JLJFF3.getLogId() : null;
        PoiReviewsApi.PoiReviewContentModel content5 = poiReviewModelLIZLLL.getContent();
        String str5 = content5 != null ? content5.textLang : null;
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
        boolean zBooleanValue = (interfaceC1191840h7W == null || (bool = (Boolean) interfaceC1191840h7W.LLLZIL("translate.hasBeenTranslate")) == null) ? false : bool.booleanValue();
        InterfaceC1191710h7J interfaceC1191710h7JLJFF4 = LJFF();
        String strYy = interfaceC1191710h7JLJFF4 != null ? interfaceC1191710h7JLJFF4.yy() : null;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF5 = LJFF();
        String strO32 = interfaceC1191710h7JLJFF5 != null ? interfaceC1191710h7JLJFF5.o32() : null;
        boolean zIsAnonymous = poiReviewModelLIZLLL.isAnonymous();
        InterfaceC665370Q7z interfaceC665370Q7zInvoke = this.LIZJ.LIZLLL.invoke(this.LIZLLL);
        Integer numInvoke = this.LIZJ.LIZ.invoke();
        Integer numInvoke2 = this.LIZJ.LIZJ.invoke(poiReviewModelLIZLLL);
        String verifiedDisplay = poiReviewModelLIZLLL.getVerifiedDisplay();
        PageFinder pageFinderLJ = LJ();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJIIJI(fLIZIZ, zLIZ ? 1 : 0, iIntValue, iLongValue, size, length, iIntValue2, zIsAnonymous ? 1 : 0, pageFinderLJ, interfaceC665370Q7zInvoke, numInvoke, numInvoke2, strLJJLIIIJJI, reviewId, str, poiId, str3, str4, logId, str5, strYy, strO32, verifiedDisplay, zBooleanValue);
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        this.LIZLLL = interfaceC1191840h7W;
    }

    public final void LJIIIZ(boolean z) {
        String strLJJLIIIJJI;
        String str;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String str3;
        int value;
        String logId;
        String str4;
        String strYy;
        String str5;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        String strZZ1;
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null) {
            return;
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
        String strO32 = null;
        if (interfaceC1191710h7JLJFF != null) {
            strLJJLIIIJJI = interfaceC1191710h7JLJFF.LJJLIIIJJI();
        } else {
            strLJJLIIIJJI = null;
        }
        String str6 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String reviewId = poiReviewModelLIZLLL.getReviewId();
        if (reviewId == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModelLIZLLL.getAuthor();
        if (author == null || (str = author.userId) == null) {
            str = "";
        }
        String poiId = poiReviewModelLIZLLL.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF2 = LJFF();
        if (interfaceC1191710h7JLJFF2 != null && (strZZ1 = interfaceC1191710h7JLJFF2.ZZ1()) != null) {
            str6 = strZZ1;
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModelLIZLLL.getContent();
        if (content != null) {
            fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content));
        } else {
            fValueOf = null;
        }
        float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModelLIZLLL.getContent();
        if (content2 != null) {
            str2 = content2.text;
        } else {
            str2 = null;
        }
        boolean zLIZ = C123100dR.LIZ(str2);
        int iIntValue = this.LIZIZ.invoke().intValue();
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModelLIZLLL.getStatistics();
        if (statistics != null && (l = statistics.likeCount) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        PoiReviewsApi.PoiReviewContentModel content3 = poiReviewModelLIZLLL.getContent();
        if (content3 != null && (list = content3.images) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        PoiReviewsApi.PoiReviewContentModel content4 = poiReviewModelLIZLLL.getContent();
        if (content4 != null && (str5 = content4.text) != null) {
            length = str5.length();
        } else {
            length = 0;
        }
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLIZLLL.getAuthor();
        if (author2 != null) {
            str3 = author2.reviewUserSource;
        } else {
            str3 = null;
        }
        Integer source = poiReviewModelLIZLLL.getSource();
        if (source != null) {
            value = source.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF3 = LJFF();
        if (interfaceC1191710h7JLJFF3 != null) {
            logId = interfaceC1191710h7JLJFF3.getLogId();
        } else {
            logId = null;
        }
        PoiReviewsApi.PoiReviewContentModel content5 = poiReviewModelLIZLLL.getContent();
        if (content5 != null) {
            str4 = content5.textLang;
        } else {
            str4 = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF4 = LJFF();
        if (interfaceC1191710h7JLJFF4 != null) {
            strYy = interfaceC1191710h7JLJFF4.yy();
        } else {
            strYy = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF5 = LJFF();
        if (interfaceC1191710h7JLJFF5 != null) {
            strO32 = interfaceC1191710h7JLJFF5.o32();
        }
        boolean zIsAnonymous = poiReviewModelLIZLLL.isAnonymous();
        InterfaceC665370Q7z interfaceC665370Q7zInvoke = this.LIZJ.LIZLLL.invoke(this.LIZLLL);
        Integer numInvoke = this.LIZJ.LIZ.invoke();
        Integer numInvoke2 = this.LIZJ.LIZJ.invoke(poiReviewModelLIZLLL);
        String verifiedDisplay = poiReviewModelLIZLLL.getVerifiedDisplay();
        PageFinder pageFinderLJ = LJ();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILJJIL(fLIZIZ, zLIZ ? 1 : 0, iIntValue, iLongValue, size, length, value, zIsAnonymous ? 1 : 0, pageFinderLJ, interfaceC665370Q7zInvoke, numInvoke, numInvoke2, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    public final void LJIIJ(boolean z) {
        String strLJJLIIIJJI;
        String str;
        Float fValueOf;
        String str2;
        int iLongValue;
        int size;
        int length;
        String str3;
        String logId;
        String str4;
        int value;
        String strYy;
        String str5;
        List<PoiReviewsApi.ImageDataModel> list;
        Long l;
        String strZZ1;
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null) {
            return;
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        InterfaceC1191710h7J interfaceC1191710h7JLJFF = LJFF();
        String strO32 = null;
        if (interfaceC1191710h7JLJFF != null) {
            strLJJLIIIJJI = interfaceC1191710h7JLJFF.LJJLIIIJJI();
        } else {
            strLJJLIIIJJI = null;
        }
        String str6 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String reviewId = poiReviewModelLIZLLL.getReviewId();
        if (reviewId == null) {
            reviewId = "";
        }
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModelLIZLLL.getAuthor();
        if (author == null || (str = author.userId) == null) {
            str = "";
        }
        String poiId = poiReviewModelLIZLLL.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF2 = LJFF();
        if (interfaceC1191710h7JLJFF2 != null && (strZZ1 = interfaceC1191710h7JLJFF2.ZZ1()) != null) {
            str6 = strZZ1;
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModelLIZLLL.getContent();
        if (content != null) {
            fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content));
        } else {
            fValueOf = null;
        }
        float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModelLIZLLL.getContent();
        if (content2 != null) {
            str2 = content2.text;
        } else {
            str2 = null;
        }
        boolean zLIZ = C123100dR.LIZ(str2);
        int iIntValue = this.LIZIZ.invoke().intValue();
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModelLIZLLL.getStatistics();
        if (statistics != null && (l = statistics.likeCount) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        PoiReviewsApi.PoiReviewContentModel content3 = poiReviewModelLIZLLL.getContent();
        if (content3 != null && (list = content3.images) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        PoiReviewsApi.PoiReviewContentModel content4 = poiReviewModelLIZLLL.getContent();
        if (content4 != null && (str5 = content4.text) != null) {
            length = str5.length();
        } else {
            length = 0;
        }
        PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLIZLLL.getAuthor();
        if (author2 != null) {
            str3 = author2.reviewUserSource;
        } else {
            str3 = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF3 = LJFF();
        if (interfaceC1191710h7JLJFF3 != null) {
            logId = interfaceC1191710h7JLJFF3.getLogId();
        } else {
            logId = null;
        }
        PoiReviewsApi.PoiReviewContentModel content5 = poiReviewModelLIZLLL.getContent();
        if (content5 != null) {
            str4 = content5.textLang;
        } else {
            str4 = null;
        }
        Integer source = poiReviewModelLIZLLL.getSource();
        if (source != null) {
            value = source.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF4 = LJFF();
        if (interfaceC1191710h7JLJFF4 != null) {
            strYy = interfaceC1191710h7JLJFF4.yy();
        } else {
            strYy = null;
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJFF5 = LJFF();
        if (interfaceC1191710h7JLJFF5 != null) {
            strO32 = interfaceC1191710h7JLJFF5.o32();
        }
        boolean zIsAnonymous = poiReviewModelLIZLLL.isAnonymous();
        InterfaceC665370Q7z interfaceC665370Q7zInvoke = this.LIZJ.LIZLLL.invoke(this.LIZLLL);
        Integer numInvoke = this.LIZJ.LIZ.invoke();
        Integer numInvoke2 = this.LIZJ.LIZJ.invoke(poiReviewModelLIZLLL);
        String verifiedDisplay = poiReviewModelLIZLLL.getVerifiedDisplay();
        PageFinder pageFinderLJ = LJ();
        c1191160h6Q.getClass();
        C1191160h6Q.LJIILIIL(fLIZIZ, zLIZ ? 1 : 0, iIntValue, iLongValue, size, length, value, zIsAnonymous ? 1 : 0, pageFinderLJ, interfaceC665370Q7zInvoke, numInvoke, numInvoke2, strLJJLIIIJJI, reviewId, str, poiId, str6, str3, logId, str4, strYy, strO32, verifiedDisplay, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191620h7A(Function0<? extends InterfaceC1191710h7J> function0, Function0<Integer> function02, C1191750h7N c1191750h7N) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = c1191750h7N;
    }
}
