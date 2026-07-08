package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.BrandImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.OffsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Keyframe;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixBrandPic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixInsitePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixKeyFramePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixLemon8Pic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixOutsitePic;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixPicItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Qq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682640Qq6 {
    public static final TakoSearchCarryInItem LIZIZ(InterfaceC682650Qq7<? extends InterfaceC682670Qq9> interfaceC682650Qq7) {
        List<T> landingPageBlockList;
        List<ReferenceItemBridge> listLIZ;
        if (interfaceC682650Qq7 == null || (landingPageBlockList = interfaceC682650Qq7.getLandingPageBlockList()) == 0 || !C07EG.LIZ() || !Intrinsics.LJFF(interfaceC682650Qq7.isTako(), Boolean.TRUE)) {
            return null;
        }
        ArrayList<InterfaceC682670Qq9> arrayList = new ArrayList();
        for (Object obj : landingPageBlockList) {
            InterfaceC682670Qq9 interfaceC682670Qq9 = (InterfaceC682670Qq9) obj;
            Integer type = interfaceC682670Qq9.getType();
            if (type == null || type.intValue() != 7) {
                Integer type2 = interfaceC682670Qq9.getType();
                if (type2 == null || type2.intValue() != 1) {
                    Integer type3 = interfaceC682670Qq9.getType();
                    if (type3 == null || type3.intValue() != 10002) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (InterfaceC682670Qq9 interfaceC682670Qq92 : arrayList) {
            String takoSummary = interfaceC682670Qq92.getTakoSummary();
            if (takoSummary == null || takoSummary.length() <= 0) {
                takoSummary = interfaceC682670Qq92.getProcessedSummary();
            }
            arrayList2.add(takoSummary);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = landingPageBlockList.iterator();
        while (it2.hasNext()) {
            List<String> takoSugList = ((InterfaceC682670Qq9) it2.next()).getTakoSugList();
            if (takoSugList == null) {
                takoSugList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(takoSugList, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = landingPageBlockList.iterator();
        while (it3.hasNext()) {
            List<String> takoSugList2 = ((InterfaceC682670Qq9) it3.next()).getTakoSugList();
            if (takoSugList2 == null) {
                takoSugList2 = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(takoSugList2, arrayList4);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJLI(arrayList2), "", null, null, 0, null, null, 62);
        List<Aweme> landingVisibleAwemeList = interfaceC682650Qq7.getLandingVisibleAwemeList();
        if (C1839007Ie.LIZ()) {
            listLIZ = C665190Q7h.LIZ(interfaceC682650Qq7.getRefSourceList(), interfaceC682650Qq7.getFlattenAwemeList());
        } else {
            listLIZ = null;
        }
        boolean z = !arrayList4.isEmpty();
        List listLL = arrayList4;
        if (!z) {
            listLL = C13LP.LL(arrayList3, 4);
        }
        return new TakoSearchCarryInItem(strLJJLIIIJ, landingVisibleAwemeList, null, null, listLIZ, null, null, listLL, null, 364, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    public static final TakoSearchCarryInItem LIZ(InterfaceC682650Qq7<? extends InterfaceC682670Qq9> interfaceC682650Qq7, boolean z) {
        List<InterfaceC682670Qq9> landingPageBlockList;
        String str;
        List<ReferenceItemBridge> listLIZ;
        Integer type;
        Integer type2;
        String strLIZIZ;
        Object objPrevious;
        ArrayList arrayList;
        BrandImageData brandImageData;
        TakoMixPicItem takoMixPicItem;
        Integer num;
        double dDoubleValue;
        int iIntValue;
        String str2;
        int iIntValue2;
        ArrayList arrayList2;
        long diggCount;
        String uri;
        List<String> urlList;
        UrlModel cover;
        UrlModel cover2;
        if (interfaceC682650Qq7 != null && (landingPageBlockList = interfaceC682650Qq7.getLandingPageBlockList()) != null) {
            ?? r0 = 0;
            int i = 1;
            if ((C07EG.LIZ() && Intrinsics.LJFF(interfaceC682650Qq7.isTako(), Boolean.TRUE)) || z) {
                ArrayList arrayList3 = new ArrayList();
                HashMap map = new HashMap();
                for (InterfaceC682670Qq9 interfaceC682670Qq9 : landingPageBlockList) {
                    Integer type3 = interfaceC682670Qq9.getType();
                    if ((type3 == null || type3.intValue() != 7) && (((type = interfaceC682670Qq9.getType()) == null || type.intValue() != i) && ((type2 = interfaceC682670Qq9.getType()) == null || type2.intValue() != 10002))) {
                        String takoSummary = interfaceC682670Qq9.getTakoSummary();
                        if ((takoSummary != null && takoSummary.length() > 0) || (takoSummary = interfaceC682670Qq9.getProcessedSummary()) != null) {
                            arrayList3.add(takoSummary);
                        }
                        boolean zLIZ = C756302xN.LIZ(interfaceC682670Qq9.getSubVideos());
                        boolean zLIZ2 = C756302xN.LIZ(interfaceC682670Qq9.getSubImages());
                        String strLIZ = C1017903yT.LIZ();
                        if (!zLIZ && !zLIZ2) {
                            strLIZIZ = null;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("<data-inline type=\"uncertain\" value=\"{&quot;id&quot;:&quot;");
                            sbLIZ.append(strLIZ);
                            sbLIZ.append("&quot;}\"></data-inline>");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                                if (((String) objPrevious).length() > 0) {
                                    break;
                                }
                            } else {
                                objPrevious = null;
                                break;
                            }
                        }
                        ?? r7 = (String) objPrevious;
                        if (r7 != 0) {
                            if (u.LJIIZILJ(r7, "\n\n", r0)) {
                                int size = arrayList3.size() - i;
                                if (size < 0) {
                                    size = 0;
                                }
                                ListProtector.remove(arrayList3, size);
                                arrayList3.add(r7.substring(r0, r7.length() - 2));
                                if (strLIZIZ != null) {
                                    arrayList3.add(strLIZIZ);
                                }
                                arrayList3.add("\n\n");
                            } else if (u.LJIIZILJ(r7, "\n", r0)) {
                                int size2 = arrayList3.size() - i;
                                if (size2 < 0) {
                                    size2 = 0;
                                }
                                ListProtector.remove(arrayList3, size2);
                                arrayList3.add(r7.substring(r0, r7.length() - i));
                                if (strLIZIZ != null) {
                                    arrayList3.add(strLIZIZ);
                                }
                                arrayList3.add("\n\n");
                            } else {
                                if (strLIZIZ != null) {
                                    arrayList3.add(strLIZIZ);
                                }
                                arrayList3.add("\n\n");
                            }
                        } else {
                            if (strLIZIZ != null) {
                                arrayList3.add(strLIZIZ);
                            }
                            arrayList3.add("\n\n");
                        }
                        String str3 = "";
                        if (zLIZ) {
                            C1227904rF c1227904rF = C1227904rF.LIZ;
                            Integer numValueOf = Integer.valueOf((int) r0);
                            List<Aweme> subVideos = interfaceC682670Qq9.getSubVideos();
                            if (subVideos != null) {
                                arrayList2 = new ArrayList(C15438062q.LJIJJ(subVideos, 10));
                                for (Aweme aweme : subVideos) {
                                    String aid = aweme.getAid();
                                    AwemeStatistics statistics = aweme.getStatistics();
                                    if (statistics != null) {
                                        diggCount = statistics.getDiggCount();
                                    } else {
                                        diggCount = 0;
                                    }
                                    Video video = aweme.getVideo();
                                    if (video != null && (cover2 = video.getCover()) != null) {
                                        uri = cover2.getUri();
                                    } else {
                                        uri = null;
                                    }
                                    Video video2 = aweme.getVideo();
                                    if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                                        urlList = C13BV.INSTANCE;
                                    }
                                    arrayList2.add(new TakoVideoItem(aid, diggCount, new BaseImage(null, null, urlList, null, r0 == true ? 1 : 0, r0 == true ? 1 : 0, uri, null, null, null, null, null, null, null, null, r0 == true ? 1 : 0, r0 == true ? 1 : 0, null, 262075, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, r0 == true ? 1 : 0, r0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, r0 == true ? 1 : 0, r0 == true ? 1 : 0, null, 262143, null), "", new TakoCertInfo(r0, ""), new TakoRelationInfo(new TakoBlockInfo(r0, r0), new TakoFollowInfo(-1, -1, r0)), new TakoPrivateInfo(r0)), "", 0L, null, null, new LinkedHashMap(), null, null));
                                }
                            } else {
                                arrayList2 = null;
                            }
                            TakoPlaceholderSource takoPlaceholderSource = new TakoPlaceholderSource(strLIZ, numValueOf, arrayList2, null, null, null, null, null, null, null);
                            c1227904rF.getClass();
                            String strLJI = C1227904rF.LJI(takoPlaceholderSource);
                            if (strLJI != null) {
                                str3 = strLJI;
                            }
                            map.put(strLIZ, str3);
                        } else if (zLIZ2) {
                            C1227904rF c1227904rF2 = C1227904rF.LIZ;
                            List<ImageData> subImages = interfaceC682670Qq9.getSubImages();
                            if (subImages != null) {
                                arrayList = new ArrayList();
                                for (ImageData imageData : subImages) {
                                    Integer num2 = imageData.type;
                                    if (num2 != null) {
                                        if (num2.intValue() == i) {
                                            OffsiteImageData offsiteImageData = imageData.offsiteImage;
                                            if (offsiteImageData != null) {
                                                String str4 = offsiteImageData.title;
                                                String str5 = offsiteImageData.favicon;
                                                String str6 = offsiteImageData.webUrl;
                                                String str7 = offsiteImageData.rootUrl;
                                                String str8 = offsiteImageData.url;
                                                if (str8 == null) {
                                                    str8 = "";
                                                }
                                                takoMixPicItem = new TakoMixPicItem(3, null, null, null, new TakoMixOutsitePic(new BaseImage(null, null, Collections.singletonList(str8), null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), str4, str5, str6, str7), null, null, null);
                                                arrayList.add(takoMixPicItem);
                                            }
                                        } else if (num2.intValue() == 2) {
                                            InsiteImageData insiteImageData = imageData.insiteImage;
                                            if (insiteImageData != null && (num = insiteImageData.insiteType) != null) {
                                                if (num.intValue() == 1) {
                                                    String str9 = insiteImageData.aid;
                                                    Integer num3 = insiteImageData.index;
                                                    if (num3 != null) {
                                                        iIntValue2 = num3.intValue();
                                                    } else {
                                                        iIntValue2 = 0;
                                                    }
                                                    String str10 = insiteImageData.url;
                                                    if (str10 == null) {
                                                        str10 = "";
                                                    }
                                                    takoMixPicItem = new TakoMixPicItem(0, new TakoMixInsitePic(new BaseImage(null, null, Collections.singletonList(str10), null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), str9, iIntValue2, null), null, null, null, null, null, null);
                                                } else if (num.intValue() == 2) {
                                                    String str11 = insiteImageData.aid;
                                                    Integer num4 = insiteImageData.index;
                                                    if (num4 != null) {
                                                        iIntValue = num4.intValue();
                                                    } else {
                                                        iIntValue = 0;
                                                    }
                                                    String str12 = insiteImageData.url;
                                                    if (str12 == null) {
                                                        str12 = "";
                                                    }
                                                    BaseImage baseImage = new BaseImage(null, null, Collections.singletonList(str12), null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null);
                                                    SearchAwemeInfo searchAwemeInfo = insiteImageData.searchAwemeInfo;
                                                    if (searchAwemeInfo != null) {
                                                        str2 = searchAwemeInfo.externalJumpUrl;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    takoMixPicItem = new TakoMixPicItem(1, null, new TakoMixLemon8Pic(baseImage, str11, iIntValue, str2, null), null, null, null, null, null);
                                                } else if (num.intValue() == 3) {
                                                    String str13 = insiteImageData.aid;
                                                    String str14 = insiteImageData.url;
                                                    if (str14 == null) {
                                                        str14 = "";
                                                    }
                                                    BaseImage baseImage2 = new BaseImage(null, null, Collections.singletonList(str14), null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null);
                                                    String str15 = insiteImageData.url;
                                                    if (str15 == null) {
                                                        str15 = "";
                                                    }
                                                    Double d = insiteImageData.cutTime;
                                                    if (d != null) {
                                                        dDoubleValue = d.doubleValue();
                                                    } else {
                                                        dDoubleValue = 0.0d;
                                                    }
                                                    takoMixPicItem = new TakoMixPicItem(2, null, null, new TakoMixKeyFramePic(baseImage2, str13, new Keyframe(str15, dDoubleValue, ""), null), null, null, null, null);
                                                }
                                                arrayList.add(takoMixPicItem);
                                            }
                                        } else if (num2.intValue() == 3 && (brandImageData = imageData.brandImage) != null) {
                                            String str16 = brandImageData.url;
                                            if (str16 == null) {
                                                str16 = "";
                                            }
                                            takoMixPicItem = new TakoMixPicItem(4, null, null, null, null, null, new TakoMixBrandPic(new BaseImage(null, null, Collections.singletonList(str16), null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null)), null);
                                            arrayList.add(takoMixPicItem);
                                        }
                                    }
                                    i = 1;
                                }
                            } else {
                                arrayList = null;
                            }
                            TakoPlaceholderSource takoPlaceholderSource2 = new TakoPlaceholderSource(strLIZ, 3, null, null, null, arrayList, null, null, null, null);
                            c1227904rF2.getClass();
                            String strLJI2 = C1227904rF.LJI(takoPlaceholderSource2);
                            if (strLJI2 != null) {
                                str3 = strLJI2;
                            }
                            map.put(strLIZ, str3);
                        }
                    }
                    r0 = 0;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = landingPageBlockList.iterator();
                while (it2.hasNext()) {
                    List<String> takoSugList = ((InterfaceC682670Qq9) it2.next()).getTakoSugList();
                    if (takoSugList == null) {
                        takoSugList = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(takoSugList, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = landingPageBlockList.iterator();
                while (it3.hasNext()) {
                    List<String> takoSugList2 = ((InterfaceC682670Qq9) it3.next()).getTakoSugList();
                    if (takoSugList2 == null) {
                        takoSugList2 = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(takoSugList2, arrayList5);
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        while (it4.hasNext()) {
                            String str17 = (String) it4.next();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append((String) next);
                            sbLIZ2.append(str17);
                            next = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        str = (String) next;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    str = null;
                }
                if (C1839007Ie.LIZ()) {
                    listLIZ = C665190Q7h.LIZ(interfaceC682650Qq7.getRefSourceList(), interfaceC682650Qq7.getFlattenAwemeList());
                } else {
                    listLIZ = null;
                }
                List<Aweme> flattenAwemeList = interfaceC682650Qq7.getFlattenAwemeList();
                boolean z2 = !arrayList5.isEmpty();
                List listLL = arrayList5;
                if (!z2) {
                    listLL = C13LP.LL(arrayList4, 4);
                }
                return new TakoSearchCarryInItem(str, null, null, null, listLIZ, map, flattenAwemeList, listLL, new TakoEventTracker("", "", Integer.valueOf(C14TF.LIZIZ.LJIILIIL()), "", null, 0), 14, null);
            }
            return null;
        }
        return null;
    }
}
