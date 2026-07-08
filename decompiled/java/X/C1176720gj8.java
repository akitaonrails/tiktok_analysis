package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeErrorFragment;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeMapAssem;
import com.ss.android.ugc.aweme.poi.mapmode.map.PoiMapModeClusterPicLoader;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0gj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176720gj8 extends C09AY implements Function1<C2189211Am7, Unit> {
    public final /* synthetic */ PoiMapModeMapAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176720gj8(PoiMapModeMapAssem poiMapModeMapAssem) {
        super(1);
        this.LL = poiMapModeMapAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2189211Am7 c2189211Am7) {
        boolean z;
        C1174650gfn request;
        EnumC1174760gfy enumC1174760gfy;
        C1176580giu c1176580giuLIZJ;
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1174650gfn request2;
        EnumC1174760gfy enumC1174760gfy2;
        C1176580giu c1176580giuLIZJ2;
        InterfaceC1177250gjz interfaceC1177250gjz2;
        C1174450gfT c1174450gfT;
        PoiLandmark poiLandmark;
        InterfaceC1177250gjz interfaceC1177250gjz3;
        Double d;
        Double d2;
        List<PoiLandmark> mapLandmarkList;
        AbstractC443520HaI abstractC443520HaI;
        PoiLandmark poiLandmark2;
        List<PoiDiscoveryCard> poiList;
        String pagePoiId;
        String fromPoiId;
        String fromGroupId;
        String poiDetailEnterFrom;
        String poiDetailEnterMethod;
        String initialPoiEnterFrom;
        String poiDetailEnterMethod2;
        String str;
        String pageCollectInfo;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Double d3;
        int size;
        C1174680gfq c1174680gfq = PoiMapModeErrorFragment.LLJI;
        PoiMapModeResponse poiMapModeResponse = this.LL.Ho().LLJIJIL;
        c1174680gfq.getClass();
        if (C1174680gfq.LIZ(poiMapModeResponse) != null) {
            InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl = this.LL.LLJILJILJ;
            if (interfaceC1177110gjl != null) {
                interfaceC1177110gjl.clearData();
            }
            InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl2 = this.LL.LLJILJILJ;
            if (interfaceC1177110gjl2 != null) {
                interfaceC1177110gjl2.LJIIIIZZ();
            }
        } else {
            PoiMapModeMapAssem poiMapModeMapAssem = this.LL;
            poiMapModeMapAssem.getClass();
            ArrayList arrayList = new ArrayList();
            PoiMapModeResponse poiMapModeResponse2 = poiMapModeMapAssem.Ho().LLJIJIL;
            ArrayList arrayList2 = null;
            if (poiMapModeResponse2 != null) {
                List<PoiDiscoveryCard> poiList2 = poiMapModeResponse2.getPoiList();
                if (poiList2 != null) {
                    int i = 0;
                    for (PoiDiscoveryCard poiDiscoveryCard : poiList2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            PoiDiscoveryCard poiDiscoveryCard2 = poiDiscoveryCard;
                            Location location = poiDiscoveryCard2.location;
                            if (location != null && (d3 = location.lat) != null) {
                                double dDoubleValue = d3.doubleValue();
                                Double d4 = poiDiscoveryCard2.location.lng;
                                if (d4 != null) {
                                    double dDoubleValue2 = d4.doubleValue();
                                    String str2 = poiDiscoveryCard2.poiId;
                                    String str3 = "";
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String str4 = poiDiscoveryCard2.poiName;
                                    if (str4 != null) {
                                        str3 = str4;
                                    }
                                    C1178490glz c1178490glz = new C1178490glz(dDoubleValue, dDoubleValue2);
                                    String str5 = poiDiscoveryCard2.poiTitleImg;
                                    List<PoiDiscoveryCard> poiList3 = poiMapModeResponse2.getPoiList();
                                    if (poiList3 != null) {
                                        size = poiList3.size();
                                    } else {
                                        size = 0;
                                    }
                                    arrayList.add(new C1177210gjv(str2, str3, size - i, c1178490glz, str5, 386));
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl3 = poiMapModeMapAssem.LLJILJILJ;
                if (interfaceC1177110gjl3 != null) {
                    interfaceC1177110gjl3.clearData();
                }
                InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl4 = poiMapModeMapAssem.LLJILJILJ;
                if (interfaceC1177110gjl4 != null) {
                    interfaceC1177110gjl4.LJII(arrayList);
                }
                InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl5 = poiMapModeMapAssem.LLJILJILJ;
                if (interfaceC1177110gjl5 != null) {
                    interfaceC1177110gjl5.LJIIIIZZ();
                }
                PoiMapModeClusterPicLoader poiMapModeClusterPicLoader = poiMapModeMapAssem.LLJJ;
                if (poiMapModeClusterPicLoader != null) {
                    AnonymousClass0956 anonymousClass0956 = poiMapModeClusterPicLoader.LLILLL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    poiMapModeClusterPicLoader.LLILLL = C23250099c.LIZLLL(poiMapModeClusterPicLoader, C0PEM.LIZJ, null, new C1177200gju(arrayList, poiMapModeClusterPicLoader, null), 2);
                }
                PoiMapModeResponse poiMapModeResponse3 = poiMapModeMapAssem.Ho().LLJIJIL;
                if (poiMapModeResponse3 != null && (poiList = poiMapModeResponse3.getPoiList()) != null) {
                    for (PoiDiscoveryCard poiDiscoveryCard3 : poiList) {
                        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
                        String str6 = poiDiscoveryCard3.poiId;
                        PoiMapModeDataParams poiMapModeDataParams = poiMapModeMapAssem.Ho().LLILZIL;
                        if (poiMapModeDataParams != null) {
                            pagePoiId = poiMapModeDataParams.getPagePoiId();
                        } else {
                            pagePoiId = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams != null) {
                            fromPoiId = poiMapModeMobParams.getFromPoiId();
                        } else {
                            fromPoiId = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams2 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams2 != null) {
                            fromGroupId = poiMapModeMobParams2.getFromGroupId();
                        } else {
                            fromGroupId = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams3 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams3 != null) {
                            poiDetailEnterFrom = poiMapModeMobParams3.getPoiDetailEnterFrom();
                        } else {
                            poiDetailEnterFrom = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams4 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams4 != null) {
                            poiDetailEnterMethod = poiMapModeMobParams4.getPoiDetailEnterMethod();
                        } else {
                            poiDetailEnterMethod = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams5 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams5 != null) {
                            initialPoiEnterFrom = poiMapModeMobParams5.getInitialPoiEnterFrom();
                        } else {
                            initialPoiEnterFrom = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams6 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams6 != null) {
                            poiDetailEnterMethod2 = poiMapModeMobParams6.getPoiDetailEnterMethod();
                        } else {
                            poiDetailEnterMethod2 = null;
                        }
                        C1174450gfT c1174450gfT2 = poiMapModeMapAssem.Ho().getState().LLILLL;
                        if (c1174450gfT2 != null) {
                            str = c1174450gfT2.tabCode;
                        } else {
                            str = null;
                        }
                        PoiMapModeMobParams poiMapModeMobParams7 = poiMapModeMapAssem.Ho().LLILZLL;
                        if (poiMapModeMobParams7 != null) {
                            pageCollectInfo = poiMapModeMobParams7.getPageCollectInfo();
                        } else {
                            pageCollectInfo = null;
                        }
                        String str7 = poiDiscoveryCard3.collectInfo;
                        Fragment fragmentLJI = C724240Sb0.LJI(poiMapModeMapAssem);
                        if (fragmentLJI != null) {
                            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
                        } else {
                            interfaceC665370Q7zLJFF = null;
                        }
                        PageFinder pageFinder = (PageFinder) poiMapModeMapAssem.LLJJIJI.getValue();
                        c1174730gfv.getClass();
                        C1174730gfv.LJIILJJIL("map_mode", str6, fromPoiId, pagePoiId, fromGroupId, poiDetailEnterFrom, poiDetailEnterMethod, initialPoiEnterFrom, poiDetailEnterMethod2, str, pageCollectInfo, str7, interfaceC665370Q7zLJFF, pageFinder);
                    }
                }
            }
            PoiMapModeMapAssem poiMapModeMapAssem2 = this.LL;
            C1176730gj9 c1176730gj9 = poiMapModeMapAssem2.LLJJI;
            if (c1176730gj9 != null) {
                PoiMapModeResponse poiMapModeResponse4 = poiMapModeMapAssem2.Ho().LLJIJIL;
                if (poiMapModeResponse4 != null) {
                    mapLandmarkList = poiMapModeResponse4.getMapLandmarkList();
                } else {
                    mapLandmarkList = null;
                }
                C1174450gfT c1174450gfT3 = this.LL.Ho().getState().LLILLL;
                if (c1174450gfT3 != null && (poiLandmark2 = c1174450gfT3.poiLandmark) != null) {
                    ((ArrayList) c1176730gj9.LJFF).clear();
                    ((ArrayList) c1176730gj9.LJFF).add(poiLandmark2);
                }
                c1176730gj9.LIZ();
                if (mapLandmarkList != null) {
                    for (final PoiLandmark poiLandmark3 : mapLandmarkList) {
                        final C1176880gjO c1176880gjO = new C1176880gjO(c1176730gj9.LIZ);
                        final AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(c1176730gj9, poiLandmark3, 264);
                        final String iconUrl = poiLandmark3.getIconUrl();
                        if (iconUrl != null && iconUrl.length() != 0) {
                            SoftReference<AbstractC443520HaI> softReferenceLIZJ = C1177170gjr.LIZ.LIZJ(iconUrl);
                            if (softReferenceLIZJ != null && (abstractC443520HaI = softReferenceLIZJ.get()) != null) {
                                c1176880gjO.LIZ(abstractC443520HaI, poiLandmark3, awS384S0200000_18);
                            } else {
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(iconUrl);
                                c1331670kl3LJIIIZ.LJIL = Bitmap.Config.RGB_565;
                                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                                c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
                                c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
                                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
                                c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0gjn
                                    @Override // X.InterfaceC1331910klR
                                    public final void onCanceled() {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onFailed(Throwable th) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onProgress(float f) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void LIZ(Bitmap bitmap) {
                                        int i3;
                                        if (bitmap != null) {
                                            C1176880gjO c1176880gjO2 = c1176880gjO;
                                            String str8 = iconUrl;
                                            PoiLandmark poiLandmark4 = poiLandmark3;
                                            Function1<Bitmap, Unit> function1 = awS384S0200000_18;
                                            Resources resources = c1176880gjO2.LIZ.getResources();
                                            int width = bitmap.getWidth();
                                            int height = bitmap.getHeight();
                                            if (width >= height) {
                                                i3 = height;
                                            } else {
                                                i3 = width;
                                            }
                                            C443530HaJ c443530HaJ = new C443530HaJ(resources, Bitmap.createBitmap(bitmap, (width - i3) / 2, (height - i3) / 2, i3, i3));
                                            c443530HaJ.LIZIZ();
                                            C1177170gjr.LIZ.LIZLLL(str8, new SoftReference<>(c443530HaJ));
                                            c1176880gjO2.LIZ(c443530HaJ, poiLandmark4, function1);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
            C01GW c01gw = C280250Ayd.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 4 && ((Number) c01gw.getValue()).intValue() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                PoiMapModeMapAssem poiMapModeMapAssem3 = this.LL;
                PoiMapModeResponse poiMapModeResponse5 = poiMapModeMapAssem3.Ho().LLJIJIL;
                if (poiMapModeResponse5 != null && (request2 = poiMapModeResponse5.getRequest()) != null && (enumC1174760gfy2 = request2.key) != null) {
                    switch (C1174770gfz.LIZ[enumC1174760gfy2.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                            MapBounds mapWindow = poiMapModeResponse5.getMapWindow();
                            if (mapWindow != null && (c1176580giuLIZJ2 = C1175070ggT.LIZJ(mapWindow)) != null && (interfaceC1177250gjz2 = poiMapModeMapAssem3.LLJIJIL) != null) {
                                C1178480gly c1178480gly = new C1178480gly();
                                c1178480gly.LIZ = false;
                                interfaceC1177250gjz2.LJIIIIZZ(0, c1178480gly, c1176580giuLIZJ2.southwest, c1176580giuLIZJ2.northeast);
                            }
                            break;
                        case 5:
                            C1174450gfT c1174450gfT4 = poiMapModeMapAssem3.Ho().getState().LLILLL;
                            if (c1174450gfT4 != null && c1174450gfT4.poiLandmark != null && (c1174450gfT = poiMapModeMapAssem3.Ho().getState().LLILLL) != null && (poiLandmark = c1174450gfT.poiLandmark) != null && poiLandmark.getLatitude() != null && poiLandmark.getLongitude() != null) {
                                C1177960gl8 c1177960gl8 = new C1177960gl8(C1175120ggY.LIZ(poiLandmark.getLatitude()), C1175120ggY.LIZ(poiLandmark.getLongitude()));
                                List<PoiDiscoveryCard> poiList4 = poiMapModeResponse5.getPoiList();
                                if (poiList4 != null) {
                                    ArrayList<PoiDiscoveryCard> arrayList3 = new ArrayList();
                                    for (PoiDiscoveryCard poiDiscoveryCard4 : poiList4) {
                                        Location location2 = poiDiscoveryCard4.location;
                                        if (location2 != null && location2.lat != null && location2.lng != null) {
                                            arrayList3.add(poiDiscoveryCard4);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                                    for (PoiDiscoveryCard poiDiscoveryCard5 : arrayList3) {
                                        Location location3 = poiDiscoveryCard5.location;
                                        if (location3 != null) {
                                            d = location3.lat;
                                        } else {
                                            d = null;
                                        }
                                        double dLIZ = C1175120ggY.LIZ(d);
                                        Location location4 = poiDiscoveryCard5.location;
                                        if (location4 != null) {
                                            d2 = location4.lng;
                                        } else {
                                            d2 = null;
                                        }
                                        arrayList4.add(new C1177960gl8(dLIZ, C1175120ggY.LIZ(d2)));
                                    }
                                    arrayList2 = arrayList4;
                                }
                                C1177030gjd.LIZ.getClass();
                                List listLIZ = C1177030gjd.LIZ(arrayList2, c1177960gl8);
                                if (listLIZ != null && (interfaceC1177250gjz3 = poiMapModeMapAssem3.LLJIJIL) != null) {
                                    C1178480gly c1178480gly2 = new C1178480gly();
                                    c1178480gly2.LIZ = false;
                                    C1177960gl8[] c1177960gl8Arr = (C1177960gl8[]) listLIZ.toArray(new C1177960gl8[0]);
                                    interfaceC1177250gjz3.LJIIIIZZ(100, c1178480gly2, (C1177960gl8[]) Arrays.copyOf(c1177960gl8Arr, c1177960gl8Arr.length));
                                }
                            }
                            break;
                    }
                }
            } else {
                PoiMapModeMapAssem poiMapModeMapAssem4 = this.LL;
                PoiMapModeResponse poiMapModeResponse6 = poiMapModeMapAssem4.Ho().LLJIJIL;
                if (poiMapModeResponse6 != null && (request = poiMapModeResponse6.getRequest()) != null && (enumC1174760gfy = request.key) != null) {
                    switch (C1174770gfz.LIZ[enumC1174760gfy.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            MapBounds mapWindow2 = poiMapModeResponse6.getMapWindow();
                            if (mapWindow2 != null && (c1176580giuLIZJ = C1175070ggT.LIZJ(mapWindow2)) != null && (interfaceC1177250gjz = poiMapModeMapAssem4.LLJIJIL) != null) {
                                C1178480gly c1178480gly3 = new C1178480gly();
                                c1178480gly3.LIZ = false;
                                interfaceC1177250gjz.LJIIIIZZ(0, c1178480gly3, c1176580giuLIZJ.southwest, c1176580giuLIZJ.northeast);
                            }
                            break;
                    }
                }
            }
        }
        this.LL.LLJI.LIZ(AFwS256S0000000_18.get$arr$(947));
        return Unit.LIZ;
    }
}
