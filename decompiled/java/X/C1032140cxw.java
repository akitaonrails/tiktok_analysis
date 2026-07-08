package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.PhotoCarouselInfoStruct;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.PhotoCarouselProductStruct;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.PhotoCarouselInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.rich.reward.DisplayImage;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ImageItem;
import com.ss.android.ugc.aweme.rich.reward.ImagePostInfo;
import com.ss.android.ugc.aweme.rich.reward.ui.carousel.RewardPagerLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032140cxw {
    public final GmtRewardAdModel LIZ;
    public final InterfaceC1032120cxu LIZIZ;
    public RecyclerView LIZJ;
    public RewardPagerLayoutManager LIZLLL;
    public C1845050y75 LJ;
    public int LJIIIIZZ;
    public InterfaceC1032440cyQ LJIIIZ;
    public boolean LJIIJ;
    public Integer LJIIJJI;
    public boolean LJIIL;
    public C427190Gp3 LJIILIIL;
    public boolean LJIILJJIL;
    public Context LJIILL;
    public C1032180cy0 LJIILLIIL;
    public int LJIJJ;
    public int LJIL;
    public List<String> LJFF = C13BV.INSTANCE;
    public boolean LJI = true;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public int LJIIZILJ = -1;
    public List<Integer> LJIJ = new ArrayList();
    public List<Boolean> LJIJI = new ArrayList();
    public String LJIJJLI = "auto";
    public final C01GW LJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 827));
    public long LJJI = -1;
    public final ARunnableS116S0100000_16 LJJIFFI = new ARunnableS116S0100000_16(this, 201);

    public final Map<String, Object> LIZIZ() {
        return this.LJFF.isEmpty() ? C2097608Jq.LJ() : LIZ(this.LJIJJ, this.LJIJJLI, null);
    }

    public final void LIZJ() {
        if (this.LJIJI.size() != this.LJFF.size()) {
            int size = this.LJFF.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Boolean.FALSE);
            }
            this.LJIJI = arrayList;
        }
    }

    public final void LIZLLL() {
        if (this.LJIJ.size() != this.LJFF.size()) {
            int size = this.LJFF.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(0);
            }
            this.LJIJ = arrayList;
        }
    }

    public final boolean LJ() {
        RecyclerView recyclerView;
        C1845050y75 c1845050y75;
        int itemCount;
        View viewFindViewByPosition;
        RewardPagerLayoutManager rewardPagerLayoutManager = this.LIZLLL;
        return (rewardPagerLayoutManager == null || (recyclerView = this.LIZJ) == null || (c1845050y75 = this.LJ) == null || (itemCount = c1845050y75.getItemCount() - 1) < 0 || recyclerView.getWidth() == 0 || (viewFindViewByPosition = rewardPagerLayoutManager.findViewByPosition(itemCount)) == null || viewFindViewByPosition.getLeft() >= recyclerView.getWidth() || viewFindViewByPosition.getRight() <= 0) ? false : true;
    }

    public final void LJI() {
        AdRewardData adRewardData;
        PhotoCarouselInfo photoCarouselInfo;
        Long autoSlideInterval;
        this.LJII.removeCallbacks(this.LJJIFFI);
        BPEAHandler bPEAHandler = this.LJII;
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LJJIFFI;
        GMTBaseModel gMTBaseModel = this.LIZ.awemeRawAd;
        C786410Ut5.LJLIIL((gMTBaseModel == null || (adRewardData = gMTBaseModel.adRewardData) == null || (photoCarouselInfo = adRewardData.getPhotoCarouselInfo()) == null || (autoSlideInterval = photoCarouselInfo.getAutoSlideInterval()) == null) ? 2000L : autoSlideInterval.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), bPEAHandler, aRunnableS116S0100000_16);
    }

    public C1032140cxw(GmtRewardAdModel gmtRewardAdModel, InterfaceC1032120cxu interfaceC1032120cxu) {
        this.LIZ = gmtRewardAdModel;
        this.LIZIZ = interfaceC1032120cxu;
    }

    public static void LJII(C1032140cxw c1032140cxw, int i) {
        RecyclerView recyclerView;
        RewardPagerLayoutManager rewardPagerLayoutManager = c1032140cxw.LIZLLL;
        if (rewardPagerLayoutManager != null && (recyclerView = c1032140cxw.LIZJ) != null) {
            final Context context = recyclerView.getContext();
            final float f = 100.0f;
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0dAY
                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    return f / displayMetrics.densityDpi;
                }
            };
            c21674119s3.LIZ = i;
            rewardPagerLayoutManager.startSmoothScroll(c21674119s3);
        }
    }

    public final Map<String, Object> LIZ(int i, String str, String str2) {
        Object obj;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        String productId;
        List<ImageItem> list;
        ImageItem imageItem;
        DisplayImage displayImage;
        if (this.LJFF.isEmpty()) {
            return C2097608Jq.LJ();
        }
        int iLJ = C13LZ.LJ(i, 0, this.LJFF.size() - 1);
        LIZLLL();
        List<Integer> list2 = this.LJIJ;
        if (iLJ >= 0 && iLJ < ((ArrayList) list2).size()) {
            obj = ListProtector.get(list2, iLJ);
        } else {
            obj = 0;
        }
        int iIntValue = ((Number) obj).intValue();
        ImagePostInfo imagePostInfo = this.LIZ.imagePostInfo;
        String str3 = null;
        if (imagePostInfo != null && (list = imagePostInfo.images) != null && (imageItem = (ImageItem) C13LP.LJJJLZIJ(iLJ, list)) != null && (displayImage = imageItem.displayImage) != null) {
            str3 = displayImage.uri;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("image_location", Integer.valueOf(iLJ + 1));
        pairArr[1] = new Pair("image_cnt", Integer.valueOf(this.LJFF.size()));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("image_id", str3);
        pairArr[3] = new Pair("image_show_count", Integer.valueOf(iIntValue));
        pairArr[4] = new Pair("enter_method", str);
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str2 != null && str2.length() != 0) {
            mapLJIIJ.put("action_type", str2);
        }
        if (this.LJJI > 0) {
            mapLJIIJ.put("first_slide_duration", Long.valueOf(System.currentTimeMillis() - this.LJJI));
        }
        GMTBaseModel gMTBaseModel = this.LIZ.awemeRawAd;
        if (gMTBaseModel != null && (photoCarouselInfo = gMTBaseModel.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList)) != null && (productId = photoCarouselProductStruct.getProductId()) != null && productId.length() != 0) {
            mapLJIIJ.put("product_id", productId);
        }
        return mapLJIIJ;
    }

    public final void LJFF(int i, int i2, String str) {
        if (i >= 0 && i < this.LJFF.size()) {
            LIZLLL();
            if (((ArrayList) this.LJIJ).size() > i) {
                List<Integer> list = this.LJIJ;
                ListProtector.set(list, i, Integer.valueOf(((Number) ListProtector.get(list, i)).intValue() + 1));
            }
            this.LJIJJ = i;
            InterfaceC1032440cyQ interfaceC1032440cyQ = this.LJIIIZ;
            if (interfaceC1032440cyQ != null) {
                interfaceC1032440cyQ.LJ(i, i2, str);
            }
        }
    }
}
