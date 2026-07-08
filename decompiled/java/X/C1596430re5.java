package X;

import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0re5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596430re5 {
    public static final C1596430re5 LIZ = new C1596430re5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(514));

    public static int LIZ(EnumC1596540reG enumC1596540reG) {
        int i = C1596520reE.LIZ[enumC1596540reG.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4 && i == 5) {
                    return 1;
                }
                return -1;
            }
            return 2;
        }
        return 0;
    }

    public static String LIZIZ(EnumC1596540reG enumC1596540reG) {
        switch (C1596520reE.LIZ[enumC1596540reG.ordinal()]) {
            case 1:
                return "notification_page";
            case 2:
                return "homepage_friends";
            case 3:
                return "homepage_follow";
            case 4:
                return "fyp_card";
            case 5:
                return "homepage_hot";
            case 6:
                return "chat_list";
            default:
                return "";
        }
    }

    public static void LIZLLL(EnumC1596540reG enumC1596540reG, List list) {
        C1597900rgS c1597900rgSLIZJ;
        int i = C1596520reE.LIZ[enumC1596540reG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    c1597900rgSLIZJ = C1597910rgT.LIZ();
                }
            } else {
                c1597900rgSLIZJ = C1597910rgT.LIZIZ();
            }
        } else {
            c1597900rgSLIZJ = C1597910rgT.LIZJ();
        }
        if (list.contains(2)) {
            c1597900rgSLIZJ.LIZLLL(1, false, true);
        }
        if (list.contains(1)) {
            c1597900rgSLIZJ.LIZLLL(1, false, false);
        }
    }

    public static void LIZJ(EnumC1596540reG enumC1596540reG, List list, boolean z) {
        AbstractC1569120qw2 abstractC1569120qw2;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i = C1596520reE.LIZ[enumC1596540reG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            abstractC1569120qw2 = C1569130qw3.LIZIZ;
                        } else {
                            return;
                        }
                    } else {
                        abstractC1569120qw2 = C1569170qw7.LIZIZ;
                    }
                } else {
                    abstractC1569120qw2 = C1569140qw4.LIZIZ;
                }
            } else {
                abstractC1569120qw2 = C1569150qw5.LIZIZ;
            }
        } else {
            abstractC1569120qw2 = C1569160qw6.LIZIZ;
        }
        if (abstractC1569120qw2 != null) {
            if (z) {
                ((InterfaceC1569000qvq) LIZIZ.getValue()).LJ(abstractC1569120qw2, list);
            } else {
                ((InterfaceC1569000qvq) LIZIZ.getValue()).LIZIZ(abstractC1569120qw2, list);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.bean.MixRankSkylightRequest r33, kotlin.jvm.functions.Function1<? super X.C1594810rbT, kotlin.Unit> r34, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.bean.MixRankSkylightResponse> r35) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596430re5.LJ(com.ss.android.ugc.aweme.bean.MixRankSkylightRequest, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0390  */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(long r39, java.lang.Long r41, java.lang.String r42, X.EnumC1596540reG r43, int r44, int r45, int r46, java.lang.Boolean r47, int r48, java.lang.String r49, kotlin.jvm.functions.Function1<? super X.C1594810rbT, kotlin.Unit> r50, java.lang.Long r51, java.lang.Long r52, java.lang.String r53, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse> r54) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596430re5.LJFF(long, java.lang.Long, java.lang.String, X.0reG, int, int, int, java.lang.Boolean, int, java.lang.String, kotlin.jvm.functions.Function1, java.lang.Long, java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
