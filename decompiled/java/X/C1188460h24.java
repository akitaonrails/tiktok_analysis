package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAddressInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0h24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188460h24 {
    public static final C1188460h24 LIZ = new C1188460h24();

    public static AnchorCommonStruct LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == EnumC1430380nKG.POI.getTYPE()) {
                anchorCommonStruct = next;
                break;
            }
        }
        return anchorCommonStruct;
    }

    public static C1188440h22 LIZIZ(String str) {
        return (C1188440h22) ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJJJZI(C1188500h28.LIZ(EnumC1188490h27.POI_BASIC, str));
    }

    public static String LIZJ(C1188440h22 c1188440h22) {
        if (c1188440h22 != null) {
            String typeLevel = c1188440h22.getTypeLevel();
            if (typeLevel == null) {
                return c1188440h22.getPoiDetailType();
            }
            EnumC1184730gw3.Companion.getClass();
            return C1184920gwM.LIZ(typeLevel, false).getTypeName();
        }
        return null;
    }

    public static String LIZLLL(C1188440h22 c1188440h22) {
        Boolean boolIsClaimed = c1188440h22.isClaimed();
        if (boolIsClaimed != null) {
            if (boolIsClaimed.booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return null;
    }

    public static void LJI(C1188440h22 c1188440h22) {
        if (c1188440h22 == null) {
            return;
        }
        ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LLIIIJ(C1188500h28.LIZ(EnumC1188490h27.POI_BASIC, c1188440h22.getPoiId()), c1188440h22);
    }

    public static C1188440h22 LJII(C1188440h22 c1188440h22, boolean z) {
        return c1188440h22.copy(c1188440h22.LL, c1188440h22.LLILLJJLI, c1188440h22.LLILLL, c1188440h22.LLILZ, c1188440h22.LLILZIL, c1188440h22.LLILZLL, c1188440h22.LLIZ, c1188440h22.LLIZLLLIL, c1188440h22.LLJ, c1188440h22.LLJI, c1188440h22.LLJIJIL, c1188440h22.LLJILJIL, z, c1188440h22.LLJILLL, c1188440h22.LLJJ, c1188440h22.LLJJI, c1188440h22.LLJJIII);
    }

    public static C1188440h22 LJ(Aweme aweme, String str, String str2) {
        String str3;
        String str4;
        Long l;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Boolean boolIsClaimed;
        Long lLJIILIIL;
        String str13;
        String str14;
        String str15;
        String str16;
        Boolean boolIsClaimed2;
        Double dLJII;
        Double dLJII2;
        String str17;
        String str18;
        PoiAnchorExtra poiAnchorExtraLIZ;
        PoiLocation poiLocation = null;
        String str19 = null;
        if (aweme == null) {
            return null;
        }
        LIZ.getClass();
        AnchorCommonStruct anchorCommonStructLIZ = LIZ(aweme);
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        boolean zIsServerCollected = false;
        if (poiDataStruct != null) {
            C1195370hDD c1195370hDD = C1195370hDD.LIZ;
            String str20 = poiDataStruct.poiId;
            String aid = aweme.getAid();
            PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
            c1195370hDD.getClass();
            C1195370hDD.LIZLLL(str, str20, aid, poiDataStruct2, str2);
            Boolean boolIsCollected = poiDataStruct.isCollected();
            if (boolIsCollected != null || ((poiAnchorExtraLIZ = C1188470h25.LIZ(aweme)) != null && (boolIsCollected = Boolean.valueOf(poiAnchorExtraLIZ.isServerCollected())) != null)) {
                zIsServerCollected = boolIsCollected.booleanValue();
            }
            C1188440h22 c1188440h22 = (C1188440h22) ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJJJZI(C1188500h28.LIZ(EnumC1188490h27.POI_BASIC, poiDataStruct.poiId));
            String aid2 = aweme.getAid();
            String str21 = poiDataStruct.poiId;
            String keyword = poiDataStruct.poiName;
            if (keyword == null) {
                if (anchorCommonStructLIZ != null) {
                    keyword = anchorCommonStructLIZ.getKeyword();
                } else {
                    keyword = null;
                }
            }
            String str22 = poiDataStruct.videoCount;
            if (str22 != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str22);
            } else {
                lLJIILIIL = null;
            }
            PoiAddressInfo poiAddressInfo = poiDataStruct.addressInfo;
            if (poiAddressInfo != null) {
                str13 = poiAddressInfo.cityCode;
                str14 = poiAddressInfo.cityName;
                str15 = poiAddressInfo.regionCode;
            } else {
                str13 = null;
                str14 = null;
                str15 = null;
            }
            String str23 = poiDataStruct.collectInfo;
            String str24 = poiDataStruct.typeLevel;
            if (poiAddressInfo != null) {
                str16 = poiAddressInfo.address;
            } else {
                str16 = null;
            }
            String str25 = poiDataStruct.infoSource;
            EnumC1184730gw3.Companion.getClass();
            String typeName = C1184920gwM.LIZ(str24, false).getTypeName();
            if (c1188440h22 != null) {
                boolIsClaimed2 = c1188440h22.isClaimed();
            } else {
                boolIsClaimed2 = null;
            }
            PoiAddressInfo poiAddressInfo2 = poiDataStruct.addressInfo;
            if (poiAddressInfo2 != null && (str18 = poiAddressInfo2.lat) != null) {
                dLJII = C2327809Ae.LJII(str18);
            } else {
                dLJII = null;
            }
            PoiAddressInfo poiAddressInfo3 = poiDataStruct.addressInfo;
            if (poiAddressInfo3 != null && (str17 = poiAddressInfo3.lng) != null) {
                dLJII2 = C2327809Ae.LJII(str17);
            } else {
                dLJII2 = null;
            }
            PoiAddressInfo poiAddressInfo4 = poiDataStruct.addressInfo;
            if (poiAddressInfo4 != null) {
                str19 = poiAddressInfo4.geohash;
            }
            return new C1188440h22(aid2, str21, keyword, lLJIILIIL, str13, str14, str15, str23, str24, str16, str25, typeName, zIsServerCollected, boolIsClaimed2, new PoiLocation(dLJII, dLJII2, str19), poiDataStruct.anchorPassThroughInfo, poiDataStruct.poiRequestExtraParams);
        }
        if (anchorCommonStructLIZ == null) {
            return null;
        }
        PoiAnchorExtra poiAnchorExtraLIZ2 = C1188470h25.LIZ(aweme);
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
        EnumC1188490h27 enumC1188490h27 = EnumC1188490h27.POI_BASIC;
        if (poiAnchorExtraLIZ2 != null) {
            str3 = poiAnchorExtraLIZ2.poiId;
        } else {
            str3 = null;
        }
        C1188440h22 c1188440h222 = (C1188440h22) iPoiService.LJJJJZI(C1188500h28.LIZ(enumC1188490h27, str3));
        String aid3 = aweme.getAid();
        if (poiAnchorExtraLIZ2 != null) {
            str4 = poiAnchorExtraLIZ2.poiId;
        } else {
            str4 = null;
        }
        String keyword2 = anchorCommonStructLIZ.getKeyword();
        if (poiAnchorExtraLIZ2 != null) {
            l = poiAnchorExtraLIZ2.videoCount;
            str5 = poiAnchorExtraLIZ2.poiCityCode;
            str6 = poiAnchorExtraLIZ2.poiCityName;
            str7 = poiAnchorExtraLIZ2.poiRegionCode;
            zIsServerCollected = poiAnchorExtraLIZ2.isServerCollected();
        } else {
            l = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        if (poiAnchorExtraLIZ2 != null) {
            str8 = poiAnchorExtraLIZ2.collectInfo;
            str9 = poiAnchorExtraLIZ2.typeLevel;
            str10 = poiAnchorExtraLIZ2.fallbackAddress;
            str11 = poiAnchorExtraLIZ2.poiInfoSource;
        } else {
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
        }
        C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
        if (poiAnchorExtraLIZ2 != null) {
            str12 = poiAnchorExtraLIZ2.typeLevel;
        } else {
            str12 = null;
        }
        c1184920gwM.getClass();
        String typeName2 = C1184920gwM.LIZ(str12, false).getTypeName();
        if (c1188440h222 != null) {
            boolIsClaimed = c1188440h222.isClaimed();
        } else {
            boolIsClaimed = null;
        }
        if (poiAnchorExtraLIZ2 != null) {
            poiLocation = poiAnchorExtraLIZ2.poiLocation;
        }
        C1188440h22 c1188440h223 = new C1188440h22(aid3, str4, keyword2, l, str5, str6, str7, str8, str9, str10, str11, typeName2, zIsServerCollected, boolIsClaimed, poiLocation, null, null);
        C1195370hDD c1195370hDD2 = C1195370hDD.LIZ;
        String poiId = c1188440h223.getPoiId();
        String aid4 = aweme.getAid();
        PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
        c1195370hDD2.getClass();
        C1195370hDD.LIZLLL(str, poiId, aid4, poiDataStruct3, str2);
        return c1188440h223;
    }
}
