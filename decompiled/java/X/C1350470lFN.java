package X;

import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.experiment.CommentTopBarRefactorBizSettingsModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350470lFN {
    public static final C1350470lFN LIZ = new C1350470lFN();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static final Map<String, Integer> LIZLLL = new LinkedHashMap();
    public static final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();
    public static final List<CommentTopBarComponent> LJFF;
    public static final HashMap<Integer, CommentTopBarComponent> LJI;
    public static final ConcurrentHashMap<String, ArrayList<CommentTopBarComponent>> LJII;

    static {
        EnumC1350510lFR enumC1350510lFR = EnumC1350510lFR.AD_TOP_BAR_BG;
        int i = 0;
        EnumC1350510lFR enumC1350510lFR2 = EnumC1350510lFR.AD_TOP_ANCHOR_BG;
        LJFF = C1697810uHb.LJIIJJI(new CommentTopBarComponent(null, Integer.valueOf(enumC1350510lFR.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), new CommentTopBarComponent(null, Integer.valueOf(enumC1350510lFR2.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
        HashMap<Integer, CommentTopBarComponent> map = new HashMap<>();
        int[] iArr = {enumC1350510lFR.getValue(), enumC1350510lFR2.getValue(), EnumC1350510lFR.TTBA_BG.getValue(), EnumC1350510lFR.TTCM_BG.getValue(), EnumC1350510lFR.POI_BG.getValue(), EnumC1350510lFR.TT_SHOWCASE_BG.getValue(), EnumC1350510lFR.SEARCH_BG.getValue(), EnumC1350510lFR.SEARCH_TAKO_BG.getValue(), EnumC1350510lFR.ACTIVITY_BG.getValue()};
        do {
            int i2 = iArr[i];
            Integer numValueOf = Integer.valueOf(i2);
            CommentTopBarComponent commentTopBarComponent = new CommentTopBarComponent(Integer.valueOf(EnumC804003Cc.ANCHOR_TEMPLATE.getValue()), Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            commentTopBarComponent.setLocalDefault(Boolean.TRUE);
            map.put(numValueOf, commentTopBarComponent);
            i++;
        } while (i < 9);
        LJI = map;
        LJII = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static List LJ(String str) {
        switch (str.hashCode()) {
            case -862809120:
                if (!str.equals("CommentAdTopBar")) {
                    return null;
                }
                return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.AD_TOP_BAR_BG.getValue()));
            case 111178:
                if (!str.equals("poi")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.POI_BG.getValue()), Integer.valueOf(EnumC1350510lFR.POI.getValue()));
            case 2585279:
                if (!str.equals("TTBA")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.TTBA.getValue()), Integer.valueOf(EnumC1350510lFR.TTBA_BG.getValue()));
            case 2585322:
                if (!str.equals("TTCM")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.TTCM_BG.getValue()), Integer.valueOf(EnumC1350510lFR.TTCM.getValue()));
            case 3552401:
                if (!str.equals("tako")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.SEARCH_TAKO.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_TAKO_BG.getValue()));
            case 490785401:
                if (!str.equals("commerce_comment_anchor")) {
                    return null;
                }
                return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.AD_TOP_ANCHOR_BG.getValue()));
            case 1034766433:
                if (!str.equals("search_keywords")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.SEARCH.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_PRODUCT.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_BG.getValue()));
            case 1108865263:
                if (!str.equals("comment_activity")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.ACTIVITY.getValue()), Integer.valueOf(EnumC1350510lFR.ACTIVITY_BG.getValue()));
            case 1515275907:
                if (!str.equals("ecom_cart")) {
                    return null;
                }
                return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.TT_SHOP.getValue()), Integer.valueOf(EnumC1350510lFR.TT_SHOWCASE.getValue()), Integer.valueOf(EnumC1350510lFR.TT_SHOWCASE_BG.getValue()));
            default:
                return null;
        }
    }

    public static Integer LJI(Aweme aweme) {
        String aid;
        Map<String, Integer> map = LIZLLL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num = (Integer) linkedHashMap.get(aid);
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        return (Integer) linkedHashMap.get(aid2);
    }

    public static CommentTopBarComponent LJII(Aweme aweme) {
        String aid;
        Integer num;
        if (aweme != null && (aid = aweme.getAid()) != null && (num = LJ.get(aid)) != null) {
            return LJIIIZ(aweme, Integer.valueOf(num.intValue()), false);
        }
        return null;
    }

    public static String LJIIIIZZ(Integer num) {
        int value = EnumC1350510lFR.SEARCH.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC1350510lFR.SEARCH_PRODUCT.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1350510lFR.SEARCH_BG.getValue();
                if (num != null && num.intValue() == value3) {
                    return "search_keywords";
                }
                int value4 = EnumC1350510lFR.ACTIVITY.getValue();
                if (num == null || num.intValue() != value4) {
                    int value5 = EnumC1350510lFR.ACTIVITY_BG.getValue();
                    if (num != null && num.intValue() == value5) {
                        return "comment_activity";
                    }
                    int value6 = EnumC1350510lFR.POI_BG.getValue();
                    if (num == null || num.intValue() != value6) {
                        int value7 = EnumC1350510lFR.POI.getValue();
                        if (num != null && num.intValue() == value7) {
                            return "poi";
                        }
                        int value8 = EnumC1350510lFR.SEARCH_TAKO.getValue();
                        if (num == null || num.intValue() != value8) {
                            int value9 = EnumC1350510lFR.SEARCH_TAKO_BG.getValue();
                            if (num != null && num.intValue() == value9) {
                                return "tako";
                            }
                            int value10 = EnumC1350510lFR.TTBA_BG.getValue();
                            if (num == null || num.intValue() != value10) {
                                int value11 = EnumC1350510lFR.TTBA.getValue();
                                if (num != null && num.intValue() == value11) {
                                    return "TTBA";
                                }
                                int value12 = EnumC1350510lFR.TTCM_BG.getValue();
                                if (num == null || num.intValue() != value12) {
                                    int value13 = EnumC1350510lFR.TTCM.getValue();
                                    if (num != null && num.intValue() == value13) {
                                        return "TTCM";
                                    }
                                    int value14 = EnumC1350510lFR.TT_SHOP.getValue();
                                    if (num == null || num.intValue() != value14) {
                                        int value15 = EnumC1350510lFR.TT_SHOWCASE.getValue();
                                        if (num == null || num.intValue() != value15) {
                                            int value16 = EnumC1350510lFR.TT_SHOWCASE_BG.getValue();
                                            if (num != null && num.intValue() == value16) {
                                                return "ecom_cart";
                                            }
                                            int value17 = EnumC1350510lFR.AD_TOP_ANCHOR_BG.getValue();
                                            if (num != null && num.intValue() == value17) {
                                                return "commerce_comment_anchor";
                                            }
                                            int value18 = EnumC1350510lFR.AD_TOP_BAR_BG.getValue();
                                            if (num != null && num.intValue() == value18) {
                                                return "CommentAdTopBar";
                                            }
                                            return null;
                                        }
                                        return "ecom_cart";
                                    }
                                    return "ecom_cart";
                                }
                                return "TTCM";
                            }
                            return "TTBA";
                        }
                        return "tako";
                    }
                    return "poi";
                }
                return "comment_activity";
            }
            return "search_keywords";
        }
        return "search_keywords";
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8) {
        /*
            r2 = 0
            if (r7 == 0) goto La4
            java.lang.String r5 = r7.getAid()
            if (r5 == 0) goto La4
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r7.getCommentConfig()
            if (r0 == 0) goto L11
            java.util.List<com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent> r2 = r0.commentTopBarComponent
        L11:
            com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig r0 = com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig.LIZ()
            if (r0 == 0) goto L8c
            if (r8 != 0) goto L8c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent>> r0 = X.C1350470lFN.LJII
            java.lang.Object r4 = r0.get(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L8b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig$Config r0 = com.ss.android.ugc.aweme.experiment.CommentTopBarPriorityConfig.LIZIZ()
            java.util.List<java.lang.Integer> r0 = r0.typePriorityList
            if (r0 == 0) goto L80
            java.util.Iterator r6 = r0.iterator()
        L39:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r7.getCommentConfig()
            if (r0 == 0) goto L70
            java.util.List<com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent> r0 = r0.commentTopBarComponent
            if (r0 == 0) goto L70
            java.util.Iterator r2 = r0.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r0 = (com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent) r0
            java.lang.Integer r0 = r0.bizType
            if (r0 == 0) goto L57
            int r0 = r0.intValue()
            if (r3 != r0) goto L57
            if (r1 != 0) goto L7c
        L70:
            java.util.HashMap<java.lang.Integer, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent> r1 = X.C1350470lFN.LJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L39
        L7c:
            r4.add(r1)
            goto L39
        L80:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent>> r0 = X.C1350470lFN.LJII
            java.lang.Object r0 = r0.putIfAbsent(r5, r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L8b
            return r0
        L8b:
            return r4
        L8c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent> r0 = X.C1350470lFN.LJFF
            r1.addAll(r0)
            if (r2 == 0) goto La3
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La3
            r1.addAll(r2)
        La3:
            return r1
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350470lFN.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.util.List");
    }

    public static void LIZ(Aweme aweme, Integer num, boolean z) {
        String aid;
        int iIntValue;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            if (z) {
                LJ.put(aid, Integer.valueOf(iIntValue));
            } else {
                LIZLLL.put(aid, Integer.valueOf(iIntValue));
            }
        }
    }

    public static CommentTopBarComponent LJIIIZ(Aweme aweme, Integer num, boolean z) {
        List listLIZLLL;
        Object obj = null;
        if (num == null || (listLIZLLL = LIZLLL(aweme, z)) == null) {
            return null;
        }
        Iterator it2 = listLIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(num, ((CommentTopBarComponent) next).bizType)) {
                obj = next;
                break;
            }
        }
        return (CommentTopBarComponent) obj;
    }

    public static int LIZIZ(C19EG c19eg, Aweme aweme, CommentContextSource commentContextSource, CommentTopBarComponent commentTopBarComponent, boolean z) {
        String strEventType;
        C2189821An6 c2189821An6 = null;
        if (commentContextSource != null) {
            strEventType = CommentContextSourceKt.eventType(commentContextSource);
            CommentCommonModel commonModel = commentContextSource.getCommonModel();
            if (commonModel != null) {
                c2189821An6 = commonModel.feedParam;
            }
        } else {
            strEventType = null;
        }
        return LIZJ(c19eg, aweme, strEventType, c2189821An6, commentTopBarComponent, z);
    }

    public static int LIZJ(C19EG c19eg, Aweme aweme, String str, C2189821An6 c2189821An6, CommentTopBarComponent commentTopBarComponent, boolean z) {
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        CommentTopBarRefactorBizSettingsModel commentTopBarRefactorBizSettingsModel = C1350400lFG.LIZ;
        if (!C1350400lFG.LIZ(commentTopBarComponent.bizType) && !z) {
            return EnumC1350530lFT.OUT_OF_SETTINGS_CONFIG.getValue();
        }
        Map<String, InterfaceC1350540lFU> map = C1350520lFS.LIZ;
        String str2 = commentTopBarComponent.name;
        InterfaceC1350540lFU interfaceC1350540lFU = (InterfaceC1350540lFU) ((LinkedHashMap) C1350520lFS.LIZ).get(C1350520lFS.LIZ(commentTopBarComponent.bizType, str2));
        if (interfaceC1350540lFU != null && !interfaceC1350540lFU.LIZIZ(commentTopBarComponent.bizId, commentTopBarComponent.displayStrategy)) {
            return EnumC1350530lFT.NOT_MEET_STRATEGY.getValue();
        }
        C1350500lFQ.LIZ.getClass();
        Integer num = commentTopBarComponent.bizType;
        if (num != null && (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num.intValue())) != null && !iCommentTopBarImplementServiceLIZLLL.canShow(c19eg, commentTopBarComponent, aweme, str, c2189821An6)) {
            return EnumC1350530lFT.NOT_MEET_BUSINESS_CONDITION.getValue();
        }
        return 0;
    }

    public static CommentTopBarComponent LJFF(C1350470lFN c1350470lFN, C19EG c19eg, Aweme aweme, String str, C2189821An6 c2189821An6, boolean z, int i) {
        String aid;
        List<CommentTopBarComponent> listLIZLLL;
        boolean z2 = z;
        if ((i & 32) != 0) {
            z2 = false;
        }
        c1350470lFN.getClass();
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0 && ((C295960Bis.LIZ() || z2) && (listLIZLLL = LIZLLL(aweme, z2)) != null && !listLIZLLL.isEmpty())) {
            for (CommentTopBarComponent commentTopBarComponent : listLIZLLL) {
                LIZ.getClass();
                if (LIZJ(c19eg, aweme, str, c2189821An6, commentTopBarComponent, z2) == 0) {
                    return commentTopBarComponent;
                }
            }
        }
        return null;
    }
}
