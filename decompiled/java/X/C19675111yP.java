package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.Extra;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS71S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS52S0301000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19675111yP extends RecyclerView.ViewHolder {
    public final LifecycleOwner LL;
    public final PhotoSearchEnterParams LLILLJJLI;
    public final boolean LLILLL;
    public final View LLILZ;
    public final EcPhotoSearchAlbumVM LLILZIL;
    public final Function2<Integer, SysRecommendFeedItem, Unit> LLILZLL;
    public final GridLayout LLIZ;
    public final View LLIZLLLIL;
    public final Size LLJ;

    public final void I5(SysRecommendModel sysRecommendModel, boolean z) {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        String str;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        BcmStandardTrackEvent bcmStandardTrackEvent2;
        String str2;
        if (sysRecommendModel == null) {
            return;
        }
        List<SysRecommendFeedItem> list = sysRecommendModel.feedList;
        char c = 1;
        if (list != null && list.size() == 4) {
            C786410Ut5.LJJJJJ(this.LLIZ);
            List<SysRecommendFeedItem> list2 = sysRecommendModel.feedList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<SysRecommendFeedItem> it2 = list2.iterator();
            int i = 0;
            while (true) {
                String str3 = "";
                if (it2.hasNext()) {
                    SysRecommendFeedItem next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        SysRecommendFeedItem sysRecommendFeedItem = next;
                        C19675411yS c19675411yS = new C19675411yS(this.LLILZ.getContext(), sysRecommendFeedItem, new AwS52S0301000_29(this, i, sysRecommendFeedItem, sysRecommendModel, 2));
                        if (this.LLILLL) {
                            PhotoSearchEnterParams photoSearchEnterParams = this.LLILLJJLI;
                            Pair[] pairArr = new Pair[2];
                            pairArr[0] = new Pair("product_id", sysRecommendFeedItem.id);
                            pairArr[c] = new Pair("item_order", String.valueOf(i2));
                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                            SysRecommendProduct sysRecommendProduct = sysRecommendFeedItem.product;
                            if (sysRecommendProduct != null) {
                                bcmStandardTrackEvent = sysRecommendProduct.bcmStandardTrackEvent;
                            } else {
                                bcmStandardTrackEvent = null;
                            }
                            C675940QfI.LIZJ("photo_search_recom_product_show", photoSearchEnterParams, new AwS376S0200000_10(mapLJIIJ, (Map<String, String>) bcmStandardTrackEvent, (BcmStandardTrackEvent) 79));
                            PhotoSearchEnterParams photoSearchEnterParams2 = this.LLILLJJLI;
                            Pair[] pairArr2 = new Pair[8];
                            pairArr2[0] = new Pair("page_name", "photo_search_page_view");
                            pairArr2[1] = new Pair("source_page_type", "photo_search_page_view");
                            pairArr2[2] = new Pair("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
                            pairArr2[3] = new Pair("item_order", String.valueOf(i2));
                            pairArr2[4] = new Pair("product_id", sysRecommendFeedItem.id);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(sysRecommendModel.requestId);
                            sbLIZ.append('_');
                            sbLIZ.append(sysRecommendFeedItem.id);
                            sbLIZ.append('_');
                            sbLIZ.append(i2);
                            pairArr2[5] = new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ));
                            String str4 = sysRecommendModel.requestId;
                            if (str4 == null) {
                                str4 = "";
                            }
                            pairArr2[6] = new Pair("request_id", str4);
                            Extra extra = sysRecommendFeedItem.extra;
                            if (extra != null && (str2 = extra.recommendInfo) != null) {
                                str3 = str2;
                            }
                            pairArr2[7] = new Pair("rec_params", str3);
                            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
                            SysRecommendProduct sysRecommendProduct2 = sysRecommendFeedItem.product;
                            if (sysRecommendProduct2 != null) {
                                bcmStandardTrackEvent2 = sysRecommendProduct2.bcmStandardTrackEvent;
                            } else {
                                bcmStandardTrackEvent2 = null;
                            }
                            C19676011yY.LIZJ(photoSearchEnterParams2, mapLJIIJ2, bcmStandardTrackEvent2);
                        }
                        arrayList.add(c19675411yS);
                        i = i2;
                        c = 1;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    int i3 = 0;
                    for (Object obj : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            View view = (View) obj;
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.LLJ.getWidth(), this.LLJ.getHeight());
                            if (i3 == 0) {
                                marginLayoutParams.setMargins(0, 0, C0H9H.LIZIZ(1), 0);
                            } else if (i3 == sysRecommendModel.feedList.size() - 1) {
                                marginLayoutParams.setMargins(C0H9H.LIZIZ(1), 0, 0, 0);
                            } else {
                                marginLayoutParams.setMargins(C0H9H.LIZIZ(1), 0, C0H9H.LIZIZ(1), 0);
                            }
                            this.LLIZ.addView(view, marginLayoutParams);
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (this.LLILLL && z) {
                        PhotoSearchEnterParams photoSearchEnterParams3 = this.LLILLJJLI;
                        Pair[] pairArr3 = new Pair[2];
                        if (photoSearchEnterParams3 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams3.businessParams) != null && (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) != null) {
                            str3 = str;
                        }
                        pairArr3[0] = new Pair("current_page", str3);
                        pairArr3[1] = new Pair("item_num", "4");
                        C675940QfI.LIZJ("photo_search_recom_module_show", photoSearchEnterParams3, new AwS608S0100000_29(C2097608Jq.LJIIJ(pairArr3), (Map<String, String>) 515));
                    }
                    EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LLILZIL;
                    if (ecPhotoSearchAlbumVM != null) {
                        C948503nH.LJFF(ecPhotoSearchAlbumVM, C0PEM.LIZJ, new C1309550kBN(sysRecommendModel, null));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C19675111yP(LifecycleOwner lifecycleOwner, PhotoSearchEnterParams photoSearchEnterParams, View view, EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, AwS643S0100000_29 awS643S0100000_29) {
        NextLiveData<SysRecommendModel> nextLiveData;
        super(view);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = photoSearchEnterParams;
        this.LLILLL = true;
        this.LLILZ = view;
        this.LLILZIL = ecPhotoSearchAlbumVM;
        this.LLILZLL = awS643S0100000_29;
        this.LLIZ = (GridLayout) view.findViewById(R.id.sx4);
        View viewFindViewById = view.findViewById(R.id.sxn);
        this.LLIZLLLIL = viewFindViewById;
        Context context = view.getContext();
        int iLJIIJ = (int) ((C12ES.LJIIJ(context) - (3 * C12ES.LIZJ(1.5f, context))) / 4);
        this.LLJ = new Size(iLJIIJ, iLJIIJ);
        C786410Ut5.I7(new AjS71S0100000_29(this, context, 2), viewFindViewById);
        if (ecPhotoSearchAlbumVM != null && (nextLiveData = ecPhotoSearchAlbumVM.LLILLL) != null) {
            nextLiveData.observe(lifecycleOwner, new AObserverS231S0100000_29(this, 128));
        }
    }
}
