package X;

import Y.ARunnableS27S0101000_16;
import android.content.Context;
import android.os.Looper;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000880c9W implements C0SCF {
    public final InterfaceC1000870c9V LL;
    public AnonymousClass0956 LLILLJJLI;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1000910c9Z LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public AbstractC996990c3F LLJI;
    public Runnable LLJILJIL;
    public final List<InterfaceC1000910c9Z> LLILLL = new ArrayList();
    public final C1000890c9X[] LLILZ = new C1000890c9X[3];
    public final BPEAHandler LLJIJIL = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0c9a] */
    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        AwemeRawAd awemeRawAd;
        AmazonCheckoutAdModel amazonCheckoutData;
        List<AmazonProductDetailsModel> amazonProductDetails;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        ((ArrayList) this.LLILLL).clear();
        C997400c3u.LIZJ.LIZIZ();
        Context context = this.LL.getContext();
        if (context != null) {
            int length = this.LLILZ.length;
            for (int i = 0; i < length; i++) {
                this.LLILZ[i] = new C1000890c9X(context, this.LL.getAweme(), i);
            }
        }
        AwemeRawAd awemeRawAd2 = this.LL.getAweme().getAwemeRawAd();
        if (awemeRawAd2 != null && (photoCarouselInfo = awemeRawAd2.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
            final int i2 = 0;
            for (PhotoCarouselProductStruct photoCarouselProductStruct : productList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                final PhotoCarouselProductStruct photoCarouselProductStruct2 = photoCarouselProductStruct;
                List<InterfaceC1000910c9Z> list = this.LLILLL;
                final ?? r0 = new InterfaceC1000930c9b() { // from class: X.0c9a
                    @Override // X.InterfaceC1000930c9b
                    public final C1000890c9X LIZIZ() {
                        C1000890c9X[] c1000890c9XArr = this.LIZ.LLILZ;
                        return c1000890c9XArr[i2 % c1000890c9XArr.length];
                    }

                    @Override // X.InterfaceC1000930c9b
                    public final PhotoCarouselProductStruct LIZ() {
                        return photoCarouselProductStruct2;
                    }

                    @Override // X.InterfaceC1000930c9b
                    public final int LIZJ() {
                        return i2;
                    }
                };
                ((ArrayList) list).add(new InterfaceC1000910c9Z(r0) { // from class: X.0c9Y
                    public final InterfaceC1000930c9b LL;
                    public FrameLayout LLILLJJLI;

                    @Override // X.InterfaceC1037910d7F
                    public final void initialize() {
                    }

                    @Override // X.InterfaceC1000910c9Z
                    public final void Pl() {
                        FrameLayout frameLayout = this.LLILLJJLI;
                        if (frameLayout != null) {
                            C786410Ut5.LJZ(8, frameLayout);
                        }
                    }

                    @Override // X.InterfaceC1000910c9Z
                    public final void onHide() throws JSONException {
                        C1000890c9X c1000890c9XLIZIZ = this.LL.LIZIZ();
                        if (c1000890c9XLIZIZ != null) {
                            c1000890c9XLIZIZ.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1000910c9Z
                    public final void onShow() throws JSONException {
                        FrameLayout frameLayout = this.LLILLJJLI;
                        if (frameLayout != null) {
                            C786410Ut5.LJZ(0, frameLayout);
                            C1000890c9X c1000890c9XLIZIZ = this.LL.LIZIZ();
                            if (c1000890c9XLIZIZ != null) {
                                c1000890c9XLIZIZ.LIZIZ(this.LL.LIZJ(), frameLayout);
                            }
                        }
                    }

                    @Override // X.InterfaceC1010530cP5
                    public final /* bridge */ /* synthetic */ InterfaceC1000930c9b Mh() {
                        return this.LL;
                    }

                    {
                        this.LL = r0;
                    }

                    @Override // X.InterfaceC1000910c9Z
                    public final void se1(FrameLayout frameLayout) throws JSONException {
                        C786410Ut5.LJZ(0, frameLayout);
                        this.LLILLJJLI = frameLayout;
                        C1000890c9X c1000890c9XLIZIZ = this.LL.LIZIZ();
                        if (c1000890c9XLIZIZ != null) {
                            c1000890c9XLIZIZ.LIZJ(this.LL.LIZJ(), frameLayout);
                        }
                    }
                });
                i2 = i3;
            }
        }
        if (C1017070cZd.LJJLJ(this.LL.getAweme())) {
            Aweme aweme = this.LL.getAweme();
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (amazonCheckoutData = awemeRawAd.getAmazonCheckoutData()) == null || (amazonProductDetails = amazonCheckoutData.getAmazonProductDetails()) == null || amazonProductDetails.isEmpty()) {
                this.LLILLJJLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0SCR(this.LL.getAweme(), null), 3);
            }
        }
    }

    @Override // X.C0SCF
    public final void clear() {
        for (Class cls : C1010170cOV.LIZ(this)) {
            C1010170cOV.LIZIZ.LIZJ.remove(cls);
        }
        Runnable runnable = this.LLJILJIL;
        if (runnable != null) {
            this.LLJIJIL.removeCallbacks(runnable);
        }
        this.LLJILJIL = null;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = null;
        InterfaceC1000910c9Z interfaceC1000910c9Z = this.LLIZ;
        if (interfaceC1000910c9Z != null) {
            interfaceC1000910c9Z.onHide();
        }
        this.LLIZ = null;
        this.LLILZLL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1000910c9Z) it2.next()).Pl();
        }
    }

    @Override // X.C0SCF
    public final void LJL() {
        clear();
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1000870c9V Mh() {
        return this.LL;
    }

    public C1000880c9W(C1000180c8O c1000180c8O) {
        this.LL = c1000180c8O;
    }

    @Override // X.C0SCF
    public final void J82(int i) {
        C1010170cOV.LIZJ(this);
        this.LLIZLLLIL = true;
        this.LLILZLL = false;
        ARunnableS27S0101000_16 aRunnableS27S0101000_16 = new ARunnableS27S0101000_16(i, this, 10);
        C786410Ut5.LJJZZIII(this.LLJIJIL, aRunnableS27S0101000_16);
        this.LLJILJIL = aRunnableS27S0101000_16;
        if (C1017070cZd.LJJLJ(this.LL.getAweme())) {
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0SCQ(this.LL.getAweme(), new AwS595S0100000_16(this, 247), null), 3);
        }
    }

    public final void LIZ(boolean z) {
        String productId;
        InterfaceC1000930c9b interfaceC1000930c9bMh;
        PhotoCarouselProductStruct photoCarouselProductStructLIZ;
        this.LLILZLL = z;
        if (this.LLILZIL) {
            return;
        }
        if (z) {
            InterfaceC1000910c9Z interfaceC1000910c9Z = this.LLIZ;
            if (interfaceC1000910c9Z != null) {
                interfaceC1000910c9Z.onHide();
                return;
            }
            return;
        }
        InterfaceC1000910c9Z interfaceC1000910c9Z2 = this.LLIZ;
        if (interfaceC1000910c9Z2 == null || (interfaceC1000930c9bMh = interfaceC1000910c9Z2.Mh()) == null || (photoCarouselProductStructLIZ = interfaceC1000930c9bMh.LIZ()) == null || (productId = photoCarouselProductStructLIZ.getProductId()) == null) {
            productId = "";
        }
        LIZJ(productId);
        InterfaceC1000910c9Z interfaceC1000910c9Z3 = this.LLIZ;
        if (interfaceC1000910c9Z3 == null) {
            return;
        }
        interfaceC1000910c9Z3.onShow();
    }

    public final void LIZIZ(int i) {
        int size;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        InterfaceC1000930c9b interfaceC1000930c9bMh;
        PhotoCarouselProductStruct photoCarouselProductStructLIZ;
        String productId;
        InterfaceC1000930c9b interfaceC1000930c9bMh2;
        PhotoCarouselProductStruct photoCarouselProductStructLIZ2;
        Object c997000c3G;
        String uri;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList2;
        UrlModel urlModel;
        InterfaceC1000930c9b interfaceC1000930c9b;
        PhotoCarouselProductStruct photoCarouselProductStructLIZ3;
        boolean z;
        String str = "";
        int productCount = 0;
        if (!this.LLJ) {
            C1000890c9X[] c1000890c9XArr = this.LLILZ;
            ArrayList<AbstractC996990c3F> arrayList = new ArrayList(c1000890c9XArr.length);
            int length = c1000890c9XArr.length;
            int i2 = 0;
            while (true) {
                c997000c3G = null;
                if (i2 >= length) {
                    break;
                }
                C1000890c9X c1000890c9X = c1000890c9XArr[i2];
                if (c1000890c9X != null) {
                    C997400c3u c997400c3u = C997400c3u.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("product_label");
                    sbLIZ.append(c1000890c9X.LL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c997400c3u.getClass();
                    int iLIZ = C997400c3u.LIZ(strLIZIZ);
                    if (iLIZ == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!c1000890c9X.LLILLJJLI) {
                        c997000c3G = new C997010c3H(c1000890c9X.LLILZ);
                    } else if (!z) {
                        c997000c3G = new C997000c3G(iLIZ);
                    } else {
                        c997000c3G = C997020c3I.LIZIZ;
                    }
                }
                arrayList.add(c997000c3G);
                i2++;
            }
            Iterator it2 = arrayList.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                i3 += !Intrinsics.LJFF(it2.next(), C997020c3I.LIZIZ) ? 1 : 0;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_error", this.LL.getAweme().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("carousel_label", "refer");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "is_under_guide");
            c1022820ciuLIZLLL.LJII();
            AbstractC996990c3F c997010c3H = C997020c3I.LIZIZ;
            for (AbstractC996990c3F abstractC996990c3F : arrayList) {
                if (!(abstractC996990c3F instanceof C997010c3H)) {
                    if (abstractC996990c3F instanceof C997000c3G) {
                        if (c997010c3H instanceof C997010c3H) {
                        }
                    } else if (!Intrinsics.LJFF(abstractC996990c3F, C997020c3I.LIZIZ)) {
                        c997010c3H = new C997010c3H("");
                    }
                }
                c997010c3H = abstractC996990c3F;
            }
            this.LLJI = c997010c3H;
            this.LLJ = true;
            InterfaceC1010530cP5 interfaceC1010530cP5 = (InterfaceC1010530cP5) C13LP.LJJJLZIJ(i, this.LLILLL);
            if (interfaceC1010530cP5 == null || (interfaceC1000930c9b = (InterfaceC1000930c9b) interfaceC1010530cP5.Mh()) == null || (photoCarouselProductStructLIZ3 = interfaceC1000930c9b.LIZ()) == null || !photoCarouselProductStructLIZ3.getDisableLabel()) {
                if (PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null) != null && (photoModeImageInfo = this.LL.getAweme().getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo.getImageList()) != null && i >= 0 && i < imageList2.size() && (urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList2, i)).displayImageNoWatermark) != null) {
                    uri = urlModel.getUri();
                } else {
                    uri = null;
                }
                if (Intrinsics.LJFF(this.LLJI, C997020c3I.LIZIZ)) {
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LL.getAweme().getAwemeRawAd());
                    c1022820ciuLIZLLL2.LIZJ("carousel_label", "refer");
                    c1022820ciuLIZLLL2.LIZIZ(uri, "image_id");
                    c1022820ciuLIZLLL2.LJII();
                } else {
                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", this.LL.getAweme().getAwemeRawAd());
                    c1022820ciuLIZLLL3.LIZJ("carousel_label", "refer");
                    AbstractC996990c3F abstractC996990c3F2 = this.LLJI;
                    if (abstractC996990c3F2 != null) {
                        c997000c3G = abstractC996990c3F2.LIZ;
                    }
                    c1022820ciuLIZLLL3.LIZIZ(c997000c3G, "fail_reason");
                    c1022820ciuLIZLLL3.LIZIZ(uri, "image_id");
                    c1022820ciuLIZLLL3.LJII();
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJI, C997020c3I.LIZIZ)) {
            return;
        }
        InterfaceC1000910c9Z interfaceC1000910c9Z = this.LLIZ;
        InterfaceC1000910c9Z interfaceC1000910c9Z2 = (InterfaceC1000910c9Z) C13LP.LJJJLZIJ(i, this.LLILLL);
        this.LLIZ = interfaceC1000910c9Z2;
        if ((interfaceC1000910c9Z2 == null || (interfaceC1000930c9bMh2 = interfaceC1000910c9Z2.Mh()) == null || (photoCarouselProductStructLIZ2 = interfaceC1000930c9bMh2.LIZ()) == null || !photoCarouselProductStructLIZ2.getDisableLabel()) && !Intrinsics.LJFF(interfaceC1000910c9Z, this.LLIZ)) {
            InterfaceC1000910c9Z interfaceC1000910c9Z3 = this.LLIZ;
            if (interfaceC1000910c9Z3 != null && (interfaceC1000930c9bMh = interfaceC1000910c9Z3.Mh()) != null && (photoCarouselProductStructLIZ = interfaceC1000930c9bMh.LIZ()) != null && (productId = photoCarouselProductStructLIZ.getProductId()) != null) {
                str = productId;
            }
            if (!this.LLILZLL && !this.LLILZIL) {
                if (interfaceC1000910c9Z != null) {
                    interfaceC1000910c9Z.onHide();
                }
                InterfaceC1000910c9Z interfaceC1000910c9Z4 = this.LLIZ;
                if (interfaceC1000910c9Z4 != null) {
                    interfaceC1000910c9Z4.onShow();
                }
                LIZJ(str);
                return;
            }
            IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
            int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL() + 1;
            PhotoModeImageInfo photoModeImageInfo2 = this.LL.getAweme().getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            AwemeRawAd awemeRawAd = this.LL.getAweme().getAwemeRawAd();
            if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
                productCount = photoCarouselInfo.getProductCount();
            }
            iAdPhotoModeService.LJIIIZ(iLJJIJIIJIL, size, productCount, this.LL.getAweme(), str, iAdPhotoModeService.getEnterMethod());
        }
    }

    public final void LIZJ(String str) {
        int size;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
        int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL() + 1;
        PhotoModeImageInfo photoModeImageInfo = this.LL.getAweme().getPhotoModeImageInfo();
        int productCount = 0;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        AwemeRawAd awemeRawAd = this.LL.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
            productCount = photoCarouselInfo.getProductCount();
        }
        iAdPhotoModeService.LJFF(iLJJIJIIJIL, size, productCount, this.LL.getAweme(), str, iAdPhotoModeService.getEnterMethod());
    }

    @Override // X.C0SCF
    public final void LJJLJ(IAdTranslationData iAdTranslationData) throws JSONException {
        C997610c4F c997610c4FLIZJ;
        JSONObject jSONObject;
        AbstractC1028360crq abstractC1028360crq;
        for (C1000890c9X c1000890c9X : this.LLILZ) {
            if (c1000890c9X != null && (c997610c4FLIZJ = C997720c4Q.LIZJ(iAdTranslationData)) != null && (jSONObject = c997610c4FLIZJ.LIZ) != null && (abstractC1028360crq = c1000890c9X.LLILZIL) != null) {
                abstractC1028360crq.LJJIIJ(C2097908Jt.LIZJ(new Pair("updatedFrontendData", jSONObject)));
                C1001090c9r.LIZ(new AwS630S0100000_16(abstractC1028360crq, 69));
            }
        }
    }

    @Override // X.C0SCF
    public final void LJZ(IAdTranslatableData iAdTranslatableData) throws JSONException {
        C997700c4O c997700c4OLIZ;
        JSONObject jSONObject;
        AbstractC1028360crq abstractC1028360crq;
        for (C1000890c9X c1000890c9X : this.LLILZ) {
            if (c1000890c9X != null && (c997700c4OLIZ = C997750c4T.LIZ(iAdTranslatableData)) != null && (jSONObject = c997700c4OLIZ.LIZ) != null && (abstractC1028360crq = c1000890c9X.LLILZIL) != null) {
                abstractC1028360crq.LJJIIJ(C2097908Jt.LIZJ(new Pair("updatedFrontendData", jSONObject)));
                C1001090c9r.LIZ(new AwS630S0100000_16(abstractC1028360crq, 69));
            }
        }
    }

    @Override // X.C0SCF
    public final void SP(int i) {
        InterfaceC1000910c9Z interfaceC1000910c9Z = (InterfaceC1000910c9Z) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (interfaceC1000910c9Z != null) {
            interfaceC1000910c9Z.Pl();
        }
    }

    @Override // X.C0SCF
    public final void LG0(int i, FrameLayout frameLayout) {
        InterfaceC1000910c9Z interfaceC1000910c9Z;
        if (frameLayout != null && (interfaceC1000910c9Z = (InterfaceC1000910c9Z) C13LP.LJJJLZIJ(i, this.LLILLL)) != null) {
            interfaceC1000910c9Z.se1(frameLayout);
        }
    }

    @Override // X.C0SCF
    public final void Uy1(int i, boolean z) {
        if (!this.LLIZLLLIL) {
            return;
        }
        Runnable runnable = this.LLJILJIL;
        if (runnable != null) {
            this.LLJIJIL.removeCallbacks(runnable);
        }
        ARunnableS27S0101000_16 aRunnableS27S0101000_16 = new ARunnableS27S0101000_16(i, this, 11);
        if (z) {
            C786410Ut5.LJJZZIII(this.LLJIJIL, aRunnableS27S0101000_16);
        } else {
            C786410Ut5.LJLIIL(800L, this.LLJIJIL, aRunnableS27S0101000_16);
        }
        this.LLJILJIL = aRunnableS27S0101000_16;
    }
}
