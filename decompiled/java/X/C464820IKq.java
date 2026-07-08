package X;

import com.bytedance.android.livesdk.chatroom.backroom.StackContext;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464820IKq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(326));
    public static final ArrayList<InterfaceC464890IKx> LIZIZ;
    public static final ArrayList<InterfaceC464860IKu> LIZJ;

    static {
        ArrayList<InterfaceC464890IKx> arrayList = new ArrayList<>();
        LIZIZ = arrayList;
        ArrayList<InterfaceC464860IKu> arrayList2 = new ArrayList<>();
        LIZJ = arrayList2;
        LIZIZ(new InterfaceC464860IKu() { // from class: X.0IKt
            @Override // X.InterfaceC464860IKu
            public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2) {
                EnterRoomConfig.RoomsData roomsData;
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && roomsData.roomId > 0) {
                    return false;
                }
                return true;
            }
        }, arrayList2);
        LIZIZ(new InterfaceC464860IKu() { // from class: X.0IK9
            @Override // X.InterfaceC464860IKu
            public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2) {
                Long lValueOf;
                Long lValueOf2;
                String str;
                String str2;
                Map<String, String> map;
                EnterRoomConfig.RoomsData roomsData;
                String str3 = null;
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    lValueOf = Long.valueOf(roomsData.roomId);
                } else {
                    lValueOf = null;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                if (roomsData2 != null) {
                    lValueOf2 = Long.valueOf(roomsData2.roomId);
                } else {
                    lValueOf2 = null;
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.mRoomsData;
                    if (roomsData3 != null) {
                        str = roomsData3.enterFromMerge;
                        str2 = roomsData3.enterMethod;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (!LiveInfeedSkylightEntranceSetting.matchNearbyFeed(str, str2)) {
                        EnterRoomConfig.LogData logData = enterRoomConfig2.mLogData;
                        if (logData != null && (map = logData.singleRoomLogMap) != null) {
                            str3 = map.get("is_watch_later");
                        }
                        if (!Intrinsics.LJFF(str3, "1")) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }, arrayList2);
        LIZIZ(new InterfaceC464860IKu() { // from class: X.0IKs
            @Override // X.InterfaceC464860IKu
            public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2) {
                String strLIZ = C464640IJy.LIZ(enterRoomConfig2);
                C01GW c01gw = C0IL0.LIZ;
                if (!((List) c01gw.getValue()).contains("jump_source_all") && !C13LP.LJJJJ(strLIZ, (Iterable) c01gw.getValue())) {
                    return false;
                }
                return true;
            }
        }, arrayList2);
        LIZIZ(new InterfaceC464860IKu() { // from class: X.0IKr
            @Override // X.InterfaceC464860IKu
            public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2) {
                return C13LP.LJJJJ(C464640IJy.LIZ(enterRoomConfig2), (Iterable) C0IL0.LIZJ.getValue());
            }
        }, arrayList2);
        LIZIZ(new InterfaceC464890IKx() { // from class: X.0IKv
            @Override // X.InterfaceC464890IKx
            public final void LIZ() {
            }
        }, arrayList);
        LIZIZ(new InterfaceC464890IKx() { // from class: X.0IKw
            @Override // X.InterfaceC464890IKx
            public final void LIZ() {
            }
        }, arrayList);
    }

    public static C0IRL LIZ(AbstractC1387200mCc abstractC1387200mCc) {
        int iHashCode;
        if (abstractC1387200mCc != null) {
            iHashCode = abstractC1387200mCc.hashCode();
        } else {
            iHashCode = 0;
        }
        C01GW c01gw = LIZ;
        C0IRL c0irl = (C0IRL) ((Map) c01gw.getValue()).get(Integer.valueOf(iHashCode));
        if (c0irl == null) {
            final ArrayList<InterfaceC464860IKu> arrayList = LIZJ;
            final ArrayList<InterfaceC464890IKx> arrayList2 = LIZIZ;
            c0irl = new C0IRL(arrayList, arrayList2) { // from class: X.0IKz
                public final List<InterfaceC464860IKu> LIZ;
                public final List<InterfaceC464890IKx> LIZIZ;
                public final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(325));

                public final Stack<EnterRoomConfig> LIZLLL() {
                    return (Stack) this.LIZJ.getValue();
                }

                @Override // X.C0IRL
                public final EnterRoomConfig LIZ() {
                    Stack<EnterRoomConfig> stackLIZLLL = LIZLLL();
                    if (!stackLIZLLL.isEmpty()) {
                        return stackLIZLLL.peek();
                    }
                    return null;
                }

                @Override // X.C0IRL
                public final EnterRoomConfig LIZIZ() {
                    Stack<EnterRoomConfig> stackLIZLLL = LIZLLL();
                    if (!stackLIZLLL.isEmpty()) {
                        return stackLIZLLL.pop();
                    }
                    return null;
                }

                @Override // X.C0IRL
                public final void clear() {
                    LIZLLL().clear();
                }

                @Override // X.C0IRL
                public final int size() {
                    return LIZLLL().size();
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = arrayList;
                    this.LIZIZ = arrayList2;
                }

                @Override // X.C0IRL
                public final void LIZJ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
                    if (enterRoomConfig != null) {
                        Iterator<InterfaceC464860IKu> it2 = this.LIZ.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().LIZ(enterRoomConfig, enterRoomConfig2)) {
                                enterRoomConfig = null;
                                break;
                            }
                        }
                    } else {
                        enterRoomConfig = null;
                        break;
                    }
                    if (enterRoomConfig == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("abort push to stack, filtered by at least one of ");
                        sbLIZ.append(this.LIZ);
                        C20441214yg.LJIIIZ("LiveBackRoomStack", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    Iterator<InterfaceC464890IKx> it3 = this.LIZIZ.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ();
                    }
                    boolean z = false;
                    if (C13LP.LJJJJ(C464640IJy.LIZ(enterRoomConfig2), (Iterable) C0IL0.LIZLLL.getValue())) {
                        LIZLLL().clear();
                        LIZLLL().push(enterRoomConfig);
                    } else {
                        String strLIZ = C464640IJy.LIZ(enterRoomConfig2);
                        C01GW c01gw2 = C0IL0.LIZIZ;
                        if (((List) c01gw2.getValue()).contains("jump_source_all") || C13LP.LJJJJ(strLIZ, (Iterable) c01gw2.getValue())) {
                            LIZLLL().push(enterRoomConfig);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pushToStack: ");
                    sbLIZ2.append(enterRoomConfig);
                    sbLIZ2.append(", success: ");
                    if ((!LIZLLL().isEmpty()) && Intrinsics.LJFF(LIZLLL().peek(), enterRoomConfig)) {
                        z = true;
                    }
                    sbLIZ2.append(z);
                    C20441214yg.LJIIIZ("LiveBackRoomStack", C2188811AlT.LIZIZ(sbLIZ2));
                }
            };
        }
        if (((Map) c01gw.getValue()).get(Integer.valueOf(iHashCode)) == null) {
            ((Map) c01gw.getValue()).put(Integer.valueOf(iHashCode), c0irl);
        }
        return c0irl;
    }

    public static void LIZIZ(Object obj, ArrayList arrayList) {
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
    }
}
