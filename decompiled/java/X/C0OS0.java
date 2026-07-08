package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OS0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS0 extends AbstractC619610ORz {
    public final String LL;
    public final String LLILLJJLI;
    public final TuxImageModel LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public BulletinStyleTextModel LLJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentContentItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userAvatar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", commentLanguage=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", textModel=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode;
        ImageUrlModel imageUrlModel;
        String str = this.LL;
        int iHashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        TuxImageModel tuxImageModel = this.LLILLL;
        if (tuxImageModel == null || (imageUrlModel = tuxImageModel.imageUrlLight) == null) {
            iHashCode = 0;
        } else {
            String uri = imageUrlModel.getUri();
            iHashCode = ((uri != null ? uri.hashCode() : 0) * 31) + imageUrlModel.getUrls().hashCode();
        }
        int i = (iHashCode3 + iHashCode) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (i + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + this.LLIZ) * 31;
        String str5 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LLJ;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        BulletinStyleTextModel bulletinStyleTextModel = this.LLJI;
        return iHashCode8 + (bulletinStyleTextModel != null ? bulletinStyleTextModel.hashCode() : 0);
    }

    @Override // X.AbstractC619610ORz
    public final String LIZ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC619610ORz
    public final void LIZIZ(BulletinStyleTextModel bulletinStyleTextModel) {
        this.LLJI = bulletinStyleTextModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0OS0) {
            C0OS0 c0os0 = (C0OS0) obj;
            if (Intrinsics.LJFF(this.LL, c0os0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0os0.LLILLJJLI) && Intrinsics.LJFF(this.LLILZ, c0os0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0os0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0os0.LLILZLL) && this.LLIZ == c0os0.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0os0.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0os0.LLJ) && Intrinsics.LJFF(this.LLJI, c0os0.LLJI)) {
                TuxImageModel tuxImageModel = this.LLILLL;
                TuxImageModel tuxImageModel2 = c0os0.LLILLL;
                if (tuxImageModel == null) {
                    if (tuxImageModel2 != null) {
                        return false;
                    }
                } else if (tuxImageModel2 != null) {
                    ImageUrlModel imageUrlModel = tuxImageModel.imageUrlLight;
                    ImageUrlModel imageUrlModel2 = tuxImageModel2.imageUrlLight;
                    if (imageUrlModel == null) {
                        if (imageUrlModel2 == null) {
                            return true;
                        }
                        return false;
                    }
                    if (imageUrlModel2 != null && Intrinsics.LJFF(imageUrlModel.getUri(), imageUrlModel2.getUri())) {
                        List<String> urls = imageUrlModel.getUrls();
                        List<String> urls2 = imageUrlModel2.getUrls();
                        if (urls.size() == urls2.size()) {
                            int size = urls.size();
                            for (int i = 0; i < size; i++) {
                                if (!Intrinsics.LJFF(ListProtector.get(urls, i), ListProtector.get(urls2, i))) {
                                    return false;
                                }
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public C0OS0(String str, String str2, TuxImageModel tuxImageModel, String str3, String str4, Integer num, int i, String str5, String str6, BulletinStyleTextModel bulletinStyleTextModel) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = tuxImageModel;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = num;
        this.LLIZ = i;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = bulletinStyleTextModel;
    }
}
