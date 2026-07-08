package X;

import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15f1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20574115f1 implements InterfaceC1499080p74 {
    public C1499070p73 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1482));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1481));

    @Override // X.InterfaceC1499080p74
    public final void LIZ() {
    }

    @Override // X.InterfaceC1499080p74
    public final void LIZIZ(C1499070p73 c1499070p73) {
        this.LIZ = c1499070p73;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LIZIZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.15f0
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    int size;
                    List<Aweme> listFg;
                    Aweme aweme;
                    PhotoModeImageInfo photoModeImageInfo;
                    List<PhotoModeImageUrlModel> imageList;
                    int size2;
                    List<PhotoModeImageUrlModel> imageList2;
                    PhotoModeImageUrlModel photoModeImageUrlModel;
                    LinkedHashMap linkedHashMap;
                    int width;
                    int height;
                    String str;
                    List<Aweme> listFg2;
                    C20574115f1 c20574115f1 = this.LL;
                    C0SR4 c0sr4 = (C0SR4) c20574115f1.LIZJ.getValue();
                    if (c0sr4 != null && (listFg2 = c0sr4.Fg()) != null) {
                        size = listFg2.size();
                    } else {
                        size = 0;
                    }
                    int iMin = Math.min(size, C277360Aty.LIZIZ + i);
                    if (iMin < i) {
                        return;
                    }
                    while (i < iMin) {
                        C0SR4 c0sr42 = (C0SR4) c20574115f1.LIZJ.getValue();
                        if (c0sr42 != null && (listFg = c0sr42.Fg()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i, listFg)) != null && aweme.getAid() != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (size2 = imageList.size()) >= 0) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                                if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i2, imageList2)) != null && photoModeImageUrlModel.srLevel == null) {
                                    String deviceMLFeatures = aweme.getDeviceMLFeatures();
                                    if (deviceMLFeatures != null && deviceMLFeatures.length() != 0) {
                                        linkedHashMap = new LinkedHashMap();
                                        try {
                                            JSONObject jSONObject = new JSONObject(deviceMLFeatures);
                                            Iterator<String> itKeys = jSONObject.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                linkedHashMap.put(next, jSONObject.opt(next));
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    } else {
                                        linkedHashMap = null;
                                    }
                                    IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
                                    C1306400k6I c1306400k6I = new C1306400k6I(C0B1T.LIZIZ);
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("index", Integer.valueOf(i2));
                                    UrlModel urlModel = photoModeImageUrlModel.targetMultiRateImageUrl;
                                    if (urlModel == null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null) {
                                        width = 0;
                                    } else {
                                        width = urlModel.getWidth();
                                    }
                                    linkedHashMap2.put("imageWidth", Integer.valueOf(width));
                                    UrlModel urlModel2 = photoModeImageUrlModel.targetMultiRateImageUrl;
                                    if (urlModel2 == null && (urlModel2 = photoModeImageUrlModel.displayImageNoWatermark) == null) {
                                        height = 0;
                                    } else {
                                        height = urlModel2.getHeight();
                                    }
                                    linkedHashMap2.put("imageHeight", Integer.valueOf(height));
                                    C1499070p73 c1499070p732 = c20574115f1.LIZ;
                                    if (c1499070p732 == null || (str = c1499070p732.LIZIZ) == null) {
                                        str = "";
                                    }
                                    linkedHashMap2.put("enterFrom", str);
                                    if (linkedHashMap != null) {
                                        Object obj = linkedHashMap.get("lab_diversity4_tier1_tag");
                                        if (obj != null) {
                                            linkedHashMap2.put("labelTier1", obj);
                                        }
                                        Object obj2 = linkedHashMap.get("ies_diversity_tags");
                                        if (obj2 != null) {
                                            linkedHashMap2.put("labelTier2", obj2);
                                        }
                                        Object obj3 = linkedHashMap.get("mt_diversity_tier3_tags");
                                        if (obj3 != null) {
                                            linkedHashMap2.put("labelTier3", obj3);
                                        }
                                    }
                                    c1306400k6I.LIZIZ = linkedHashMap2;
                                    iStarShipStrategy.runStrategy(c1306400k6I, new AwS610S0100000_31(c20574115f1, photoModeImageUrlModel, 463));
                                }
                            }
                        }
                        i++;
                    }
                }
            });
        }
    }
}
