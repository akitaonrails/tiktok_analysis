package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002040cBO extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1001930cBD LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C1002030cBN LLILZ;
    public final /* synthetic */ PhotoModeImageUrlModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002040cBO(int i, C1001930cBD c1001930cBD, Aweme aweme, C1002030cBN c1002030cBN, PhotoModeImageUrlModel photoModeImageUrlModel) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1001930cBD;
        this.LLILLL = aweme;
        this.LLILZ = c1002030cBN;
        this.LLILZIL = photoModeImageUrlModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int i;
        Object objLJJJLZIJ;
        int i2;
        LivePhotoStruct livePhotoStruct;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        Function1<Integer, Boolean> function1;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1002050cBP.LIZ.getClass();
        int i3 = 1;
        c1023640ckE2.withParam(C1002050cBP.LJI, Integer.valueOf(this.LL + 1));
        C1002190cBd c1002190cBd = C1002050cBP.LIZIZ;
        C1001930cBD c1001930cBD = this.LLILLJJLI;
        if (c1001930cBD != null && (function1 = c1001930cBD.LIZJ) != null && function1.invoke(Integer.valueOf(this.LL)).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        c1023640ckE2.withParam(c1002190cBd, Integer.valueOf(i));
        C1002190cBd c1002190cBd2 = C1002050cBP.LJIIIIZZ;
        Aweme aweme = this.LLILLL;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(this.LL, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList)) == null) {
            objLJJJLZIJ = "";
        }
        c1023640ckE2.withParam(c1002190cBd2, objLJJJLZIJ);
        c1023640ckE2.withParam(C1002050cBP.LJIIIZ, this.LLILZ.LJJIIZI(this.LL));
        C1002190cBd c1002190cBd3 = C1002050cBP.LIZJ;
        C1002030cBN c1002030cBN = this.LLILZ;
        C1001930cBD c1001930cBD2 = this.LLILLJJLI;
        if (c1001930cBD2 != null) {
            i2 = c1001930cBD2.LIZ;
        } else {
            i2 = -1;
        }
        c1023640ckE2.withParam(c1002190cBd3, Integer.valueOf(c1002030cBN.LJJIIZ(i2)));
        C1002190cBd c1002190cBd4 = C1002050cBP.LJIIJ;
        PhotoModeImageUrlModel photoModeImageUrlModel2 = this.LLILZIL;
        if (photoModeImageUrlModel2 == null || (livePhotoStruct = photoModeImageUrlModel2.livePhotoStruct) == null || !livePhotoStruct.isLivePhoto()) {
            i3 = 0;
        }
        c1023640ckE2.withParam(c1002190cBd4, Integer.valueOf(i3));
        return Unit.LIZ;
    }
}
