package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationCacheSizeSetting;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.revenue.level.api.fansclub.model.FansClubEntranceAnimFreqData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087240eOo {
    public static final int LIZ;
    public static final int LIZIZ;

    static {
        FansClubCelebrationCacheSizeSetting fansClubCelebrationCacheSizeSetting = FansClubCelebrationCacheSizeSetting.INSTANCE;
        LIZ = fansClubCelebrationCacheSizeSetting.getValue().saveMaxSize;
        LIZIZ = fansClubCelebrationCacheSizeSetting.getValue().recentlyMaxSize;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZJ(String str) {
        ArrayList arrayList;
        try {
            C0JT6<List<String>> c0jt6 = InterfaceC1093910eZZ.LLLLZLLIL;
            List<String> listLIZ = c0jt6.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(listLIZ);
            } else {
                arrayList = new ArrayList();
            }
            arrayList.add(str);
            int size = arrayList.size();
            int i = LIZIZ;
            List<String> listSubList = arrayList;
            if (size > i) {
                listSubList = arrayList.subList(arrayList.size() - i, arrayList.size());
            }
            c0jt6.LIZJ(listSubList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("fans club saveAnimRecentlyAnchor", th);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZLLL(String str) {
        ArrayList arrayList;
        try {
            C0JT6<List<String>> c0jt6 = InterfaceC1093910eZZ.LLLLZIL;
            List<String> listLIZ = c0jt6.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(listLIZ);
            } else {
                arrayList = new ArrayList();
            }
            arrayList.add(str);
            int size = arrayList.size();
            int i = LIZIZ;
            List<String> listSubList = arrayList;
            if (size > i) {
                listSubList = arrayList.subList(arrayList.size() - i, arrayList.size());
            }
            c0jt6.LIZJ(listSubList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("fans club saveRecentlyAnchor", th);
        }
    }

    public static FansClubEntranceAnimFreqData LIZ(FansEventData.EntranceGuidanceData entranceGuidanceData, String str) {
        FansClubEntranceAnimFreqData fansClubEntranceAnimFreqData;
        String str2;
        try {
            fansClubEntranceAnimFreqData = (FansClubEntranceAnimFreqData) C19748512Ol.LIZIZ.LJII(str, FansClubEntranceAnimFreqData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (fansClubEntranceAnimFreqData == null) {
            fansClubEntranceAnimFreqData = new FansClubEntranceAnimFreqData(0L, "", 0L);
        }
        fansClubEntranceAnimFreqData.lastShowTimeTs = System.currentTimeMillis();
        if (entranceGuidanceData == null || (str2 = entranceGuidanceData.freqControlKey) == null) {
            str2 = "";
        }
        fansClubEntranceAnimFreqData.freqControlKey = str2;
        fansClubEntranceAnimFreqData.showTimes++;
        return fansClubEntranceAnimFreqData;
    }

    public static boolean LIZIZ(DataChannel dataChannel, FansEventData.EntranceGuidanceData entranceGuidanceData) {
        long ownerUserId;
        if (dataChannel == null || entranceGuidanceData == null) {
            return false;
        }
        try {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            Map<String, String> mapLIZ = InterfaceC1093910eZZ.LLLLZLL.LIZ();
            if (mapLIZ == null || !mapLIZ.containsKey(String.valueOf(ownerUserId))) {
                return true;
            }
            try {
                FansClubEntranceAnimFreqData fansClubEntranceAnimFreqData = (FansClubEntranceAnimFreqData) C19748512Ol.LIZIZ.LJII(mapLIZ.get(String.valueOf(ownerUserId)), FansClubEntranceAnimFreqData.class);
                if (fansClubEntranceAnimFreqData != null) {
                    String str = entranceGuidanceData.freqControlKey;
                    if (str == null) {
                        str = "";
                    }
                    int i = entranceGuidanceData.freqControlValue;
                    long j = entranceGuidanceData.freqControlDuration;
                    if (!TextUtils.equals(fansClubEntranceAnimFreqData.freqControlKey, str)) {
                        return true;
                    }
                    if (fansClubEntranceAnimFreqData.showTimes >= i || Math.abs(System.currentTimeMillis() - fansClubEntranceAnimFreqData.lastShowTimeTs) <= j * 1000) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                new FansClubEntranceAnimFreqData(0L, "", 0L);
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("fans club canPlayAboutUpgradeAnim", th);
            return false;
        }
    }
}
