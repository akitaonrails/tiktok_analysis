package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetTaskData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCollectionParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269851Dst extends ITTMParamData {
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;
    public final StreakData LJIIJJI;
    public final C595660NXw LJIIL;
    public final boolean LJIILIIL;
    public final Boolean LJIILJJIL;
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 271));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 273));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 272));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 268));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 269));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 270));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(407));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2269851Dst)) {
            return false;
        }
        C2269851Dst c2269851Dst = (C2269851Dst) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2269851Dst.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2269851Dst.LIZJ) && this.LIZLLL == c2269851Dst.LIZLLL && Intrinsics.LJFF(this.LJ, c2269851Dst.LJ) && this.LJFF == c2269851Dst.LJFF && this.LJI == c2269851Dst.LJI && this.LJII == c2269851Dst.LJII && this.LJIIIIZZ == c2269851Dst.LJIIIIZZ && this.LJIIIZ == c2269851Dst.LJIIIZ && this.LJIIJ == c2269851Dst.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c2269851Dst.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c2269851Dst.LJIIL) && this.LJIILIIL == c2269851Dst.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c2269851Dst.LJIILJJIL);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31;
        StreakData streakData = this.LJIIJJI;
        int iHashCode2 = (iHashCode + (streakData == null ? 0 : streakData.hashCode())) * 31;
        C595660NXw c595660NXw = this.LJIIL;
        int iHashCode3 = (((iHashCode2 + (c595660NXw == null ? 0 : c595660NXw.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31;
        Boolean bool = this.LJIILJJIL;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ConvBasicInfoModel(currUid=" + this.LIZIZ + ", convId=" + this.LIZJ + ", convShortId=" + this.LIZLLL + ", peerUid=" + this.LJ + ", convType=" + this.LJFF + ", unreadCount=" + this.LJI + ", lastMessageType=" + this.LJII + ", lastMessageCreatedAt=" + this.LJIIIIZZ + ", lastMessageFromSelf=" + this.LJIIIZ + ", updateTime=" + this.LJIIJ + ", streakData=" + this.LJIIJJI + ", activityStatusData=" + this.LJIIL + ", isSelfHitStreakExp=" + this.LJIILIIL + ", isMute=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r3.equals("convId") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r3.equals("unreadCount") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r3.equals("peerUid") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r3.equals("convType") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        if (r3.equals("maximumClientGenerateStreakDataDay") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r3.equals("updateTime") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        if (r3.equals("convShortId") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        if (r3.equals("lastMessageCreatedAt") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        if (r3.equals("currUid") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00dc, code lost:
    
        if (r3.equals("lastMessageType") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:
    
        if (r3.equals("lastMessageFromSelf") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f1, code lost:
    
        if (r3.equals("streakLevelArray") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fb, code lost:
    
        if (r3.equals("nDayStartArraySecondV2") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0105, code lost:
    
        if (r3.equals("nDayStartArraySecond") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3.equals("clientInteractionRecordSize") == false) goto L5;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2269851Dst.containsKey(java.lang.String):boolean");
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long[] getAllIntValue(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1785035076) {
                if (iHashCode != 1641078611) {
                    if (iHashCode == 1941463769 && str.equals("nDayStartArraySecond")) {
                        return C13LP.LLIIIILZ((Collection) this.LJIJI.getValue());
                    }
                } else if (str.equals("streakLevelArray")) {
                    int size = ((List) this.LJIJJLI.getValue()).size();
                    long[] jArr = new long[size];
                    for (int i = 0; i < size; i++) {
                        jArr[i] = ((Number) ListProtector.get((List) this.LJIJJLI.getValue(), i)).intValue();
                    }
                    return jArr;
                }
            } else if (str.equals("serverNDayStartArraySecond")) {
                return C13LP.LLIIIILZ((Collection) this.LJIJJ.getValue());
            }
        }
        return super.getAllIntValue(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        final C595660NXw c595660NXw;
        final StreakPetData streakPetData;
        StreakData streakData;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1785035076:
                if (!str.equals("serverNDayStartArraySecond")) {
                    return null;
                }
                return new TTMCollectionParam((List<Object>) this.LJIJJ.getValue());
            case -1197095864:
                if (!str.equals("streakData") || (streakData = this.LJIIJJI) == null) {
                    return null;
                }
                return new C1577206Fm(streakData, this.LJIILIIL);
            case -744106005:
                if (!str.equals("serverStreakData")) {
                    return null;
                }
                return (ITTMParamData) this.LJIIZILJ.getValue();
            case -686779789:
                if (!str.equals("clientStreakData")) {
                    return null;
                }
                return (ITTMParamData) this.LJIJ.getValue();
            case -678007447:
                if (!str.equals("petData") || (streakPetData = (StreakPetData) this.LJIILLIIL.getValue()) == null) {
                    return null;
                }
                return new ITTMParamData(streakPetData) { // from class: X.06E5
                    public final StreakPetData LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C06E5) && Intrinsics.LJFF(this.LIZIZ, ((C06E5) obj).LIZIZ);
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final Object getInputData() {
                        return this;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final int getType() {
                        return 2;
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("StreakPetDataParamModel(streakPetData=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZIZ = streakPetData;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final boolean containsKey(String str2) {
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1939413420:
                                    if (str2.equals("feCommonData")) {
                                        return true;
                                    }
                                    break;
                                case -1758376641:
                                    if (str2.equals("streakPetAnimState")) {
                                        return true;
                                    }
                                    break;
                                case -1676095234:
                                    if (str2.equals("conversationId")) {
                                        return true;
                                    }
                                    break;
                                case -892481550:
                                    if (str2.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                                        return true;
                                    }
                                    break;
                                case -543453324:
                                    if (str2.equals("isHidden")) {
                                        return true;
                                    }
                                    break;
                                case -386086318:
                                    if (str2.equals("subStatus")) {
                                        return true;
                                    }
                                    break;
                                case -114432419:
                                    if (str2.equals("conversationType")) {
                                        return true;
                                    }
                                    break;
                                case 3373707:
                                    if (str2.equals("name")) {
                                        return true;
                                    }
                                    break;
                                case 28185227:
                                    if (str2.equals("serverDataVersion")) {
                                        return true;
                                    }
                                    break;
                                case 110132110:
                                    if (str2.equals("tasks")) {
                                        return true;
                                    }
                                    break;
                                case 421294996:
                                    if (str2.equals("hatchingTimestamp")) {
                                        return true;
                                    }
                                    break;
                                case 476735963:
                                    if (str2.equals("feExtraData")) {
                                        return true;
                                    }
                                    break;
                                case 925199085:
                                    if (str2.equals("experiencePoints")) {
                                        return true;
                                    }
                                    break;
                                case 1174287274:
                                    if (str2.equals("inviterUidStr")) {
                                        return true;
                                    }
                                    break;
                                case 1268971457:
                                    if (str2.equals("expForLevelArray")) {
                                        return true;
                                    }
                                    break;
                                case 1369213417:
                                    if (str2.equals("createTime")) {
                                        return true;
                                    }
                                    break;
                                case 1514896389:
                                    if (str2.equals("isEggHidden")) {
                                        return true;
                                    }
                                    break;
                            }
                        }
                        return false;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final long[] getAllIntValue(String str2) {
                        if (Intrinsics.LJFF(str2, "expForLevelArray")) {
                            int size = this.LIZIZ.expForLevel.size();
                            long[] jArr = new long[size];
                            for (int i = 0; i < size; i++) {
                                jArr[i] = ((Number) ListProtector.get(this.LIZIZ.expForLevel, i)).intValue();
                            }
                            return jArr;
                        }
                        return super.getAllIntValue(str2);
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final ITTMParamData getObjectItem(String str2) {
                        if (Intrinsics.LJFF(str2, "expForLevelArray")) {
                            List<Integer> list = this.LIZIZ.expForLevel;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator<Integer> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Long.valueOf(it2.next().intValue()));
                            }
                            return new TTMCollectionParam((List<Object>) arrayList);
                        }
                        if (Intrinsics.LJFF(str2, "tasks")) {
                            Map<String, StreakPetTaskData> map = this.LIZIZ.tasks;
                            ArrayList arrayList2 = new ArrayList(map.size());
                            Iterator<Map.Entry<String, StreakPetTaskData>> it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                final StreakPetTaskData value = it3.next().getValue();
                                arrayList2.add(new ITTMParamData(value) { // from class: X.06E6
                                    public final StreakPetTaskData LIZIZ;

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        return (obj instanceof C06E6) && Intrinsics.LJFF(this.LIZIZ, ((C06E6) obj).LIZIZ);
                                    }

                                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                                    public final int getType() {
                                        return 2;
                                    }

                                    public final int hashCode() {
                                        return this.LIZIZ.hashCode();
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("StreakPetTaskParamModel(taskData=");
                                        sbLIZ.append(this.LIZIZ);
                                        sbLIZ.append(')');
                                        return C2188811AlT.LIZIZ(sbLIZ);
                                    }

                                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                                    public final Object getInputData() {
                                        return this.LIZIZ;
                                    }

                                    {
                                        this.LIZIZ = value;
                                    }

                                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                                    public final long getIntValue(String str3, int i) {
                                        if (Intrinsics.LJFF(str3, "reward_points")) {
                                            return this.LIZIZ.rewardPoints;
                                        }
                                        if (Intrinsics.LJFF(str3, "completed")) {
                                            return C06E7.LIZ(Boolean.valueOf(this.LIZIZ.completed));
                                        }
                                        return 0L;
                                    }

                                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                                    public final String getStringValue(String str3, int i) {
                                        if (Intrinsics.LJFF(str3, "description")) {
                                            return this.LIZIZ.description;
                                        }
                                        return "";
                                    }
                                });
                            }
                            return new TTMCollectionParam((List<Object>) arrayList2);
                        }
                        return null;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final long getIntValue(String str2, int i) {
                        int i2;
                        if (str2 == null) {
                            return 0L;
                        }
                        switch (str2.hashCode()) {
                            case -892481550:
                                if (!str2.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                                    return 0L;
                                }
                                i2 = this.LIZIZ.status;
                                break;
                                break;
                            case -543453324:
                                if (!str2.equals("isHidden")) {
                                    return 0L;
                                }
                                return C06E7.LIZ(Boolean.valueOf(this.LIZIZ.isHidden));
                            case -386086318:
                                if (!str2.equals("subStatus")) {
                                    return 0L;
                                }
                                i2 = this.LIZIZ.subStatus;
                                break;
                                break;
                            case -114432419:
                                if (!str2.equals("conversationType")) {
                                    return 0L;
                                }
                                i2 = this.LIZIZ.conversationType;
                                break;
                                break;
                            case 421294996:
                                if (!str2.equals("hatchingTimestamp")) {
                                    return 0L;
                                }
                                return this.LIZIZ.hatchingTimestampInSeconds;
                            case 925199085:
                                if (!str2.equals("experiencePoints")) {
                                    return 0L;
                                }
                                i2 = this.LIZIZ.experiencePoints;
                                break;
                                break;
                            case 1369213417:
                                if (!str2.equals("createTime")) {
                                    return 0L;
                                }
                                return this.LIZIZ.createTime;
                            case 1514896389:
                                if (!str2.equals("isEggHidden")) {
                                    return 0L;
                                }
                                return C06E7.LIZ(Boolean.valueOf(this.LIZIZ.isEggHidden));
                            default:
                                return 0L;
                        }
                        return i2;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final String getStringValue(String str2, int i) {
                        if (str2 == null) {
                            return "";
                        }
                        switch (str2.hashCode()) {
                            case -1939413420:
                                if (!str2.equals("feCommonData")) {
                                    return "";
                                }
                                return this.LIZIZ.feCommonData;
                            case -1758376641:
                                if (!str2.equals("streakPetAnimState")) {
                                    return "";
                                }
                                return this.LIZIZ.streakPetAnimState;
                            case -1676095234:
                                if (!str2.equals("conversationId")) {
                                    return "";
                                }
                                return this.LIZIZ.conversationId;
                            case 3373707:
                                if (!str2.equals("name")) {
                                    return "";
                                }
                                return this.LIZIZ.name;
                            case 28185227:
                                if (!str2.equals("serverDataVersion")) {
                                    return "";
                                }
                                return this.LIZIZ.serverDataVersion;
                            case 476735963:
                                if (!str2.equals("feExtraData")) {
                                    return "";
                                }
                                return this.LIZIZ.feExtraData;
                            case 1174287274:
                                if (!str2.equals("inviterUidStr")) {
                                    return "";
                                }
                                return String.valueOf(this.LIZIZ.inviterUid);
                            default:
                                return "";
                        }
                    }
                };
            case 271676203:
                if (!str.equals("activityStatusData") || (c595660NXw = this.LJIIL) == null) {
                    return null;
                }
                return new ITTMParamData(c595660NXw) { // from class: X.0NYg
                    public final C595660NXw LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C595760NYg) && Intrinsics.LJFF(this.LIZIZ, ((C595760NYg) obj).LIZIZ);
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final Object getInputData() {
                        return this;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final int getType() {
                        return 2;
                    }

                    public final int hashCode() {
                        return this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ActivityStatusDataParamModel(activityStatusData=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZIZ = c595660NXw;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final long getIntValue(String str2, int i) {
                        C0NXK c0nxk;
                        if (Intrinsics.LJFF(str2, "lastActiveTimestamp")) {
                            C0NXK c0nxk2 = this.LIZIZ.LIZIZ;
                            if (c0nxk2 == null) {
                                return 0L;
                            }
                            return c0nxk2.LIZIZ;
                        }
                        if (!Intrinsics.LJFF(str2, "lastInactiveTimestamp") || (c0nxk = this.LIZIZ.LIZIZ) == null) {
                            return 0L;
                        }
                        return c0nxk.LIZJ;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final String getStringValue(String str2, int i) {
                        C0NXK c0nxk;
                        String str3;
                        if (!Intrinsics.LJFF(str2, "uid") || (c0nxk = this.LIZIZ.LIZIZ) == null || (str3 = c0nxk.LIZ) == null) {
                            return "";
                        }
                        return str3;
                    }
                };
            case 1641078611:
                if (!str.equals("streakLevelArray")) {
                    return null;
                }
                return new TTMCollectionParam((List<Object>) this.LJIJJLI.getValue());
            case 1941463769:
                if (!str.equals("nDayStartArraySecond")) {
                    return null;
                }
                return new TTMCollectionParam((List<Object>) this.LJIJI.getValue());
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        int iLIZ;
        if (str == null) {
            return 0L;
        }
        switch (str.hashCode()) {
            case -1925962599:
                if (!str.equals("clientInteractionRecordSize")) {
                    return 0L;
                }
                IStreakPSPContextProvider.LIZ.getClass();
                iLIZ = C06GG.LIZ().LIZJ();
                break;
                break;
            case -1180291485:
                if (!str.equals("isMute")) {
                    return 0L;
                }
                Boolean bool = this.LJIILJJIL;
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    return 1L;
                }
                if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    return 0L;
                }
                return -1L;
            case -1070996832:
                if (!str.equals("unreadCount")) {
                    return 0L;
                }
                iLIZ = this.LJI;
                break;
                break;
            case -565970802:
                if (!str.equals("convType")) {
                    return 0L;
                }
                iLIZ = this.LJFF;
                break;
                break;
            case -308905612:
                if (!str.equals("maximumClientGenerateStreakDataDay")) {
                    return 0L;
                }
                IStreakPSPContextProvider.LIZ.getClass();
                iLIZ = C06GG.LIZ().LIZ();
                break;
                break;
            case -295931082:
                if (!str.equals("updateTime")) {
                    return 0L;
                }
                return this.LJIIJ;
            case -169179933:
                if (!str.equals("convShortId")) {
                    return 0L;
                }
                return this.LIZLLL;
            case 917409706:
                if (!str.equals("lastMessageCreatedAt")) {
                    return 0L;
                }
                return this.LJIIIIZZ;
            case 1314153323:
                if (!str.equals("lastMessageType")) {
                    return 0L;
                }
                iLIZ = this.LJII;
                break;
                break;
            case 1536543175:
                if (!str.equals("lastMessageFromSelf")) {
                    return 0L;
                }
                return C169O.LIZJ(this.LJIIIZ);
            default:
                return 0L;
        }
        return iLIZ;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1354777745) {
                if (iHashCode != -690501746) {
                    if (iHashCode == 1126924478 && str.equals("currUid")) {
                        return this.LIZIZ;
                    }
                    return "";
                }
                if (str.equals("peerUid")) {
                    return this.LJ;
                }
                return "";
            }
            if (str.equals("convId")) {
                return this.LIZJ;
            }
            return "";
        }
        return "";
    }

    public C2269851Dst(String str, String str2, long j, String str3, int i, int i2, int i3, long j2, boolean z, long j3, StreakData streakData, C595660NXw c595660NXw, boolean z2, Boolean bool) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = z;
        this.LJIIJ = j3;
        this.LJIIJJI = streakData;
        this.LJIIL = c595660NXw;
        this.LJIILIIL = z2;
        this.LJIILJJIL = bool;
    }
}
