package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C342601Uq {
    public static List<C0U74<RoomSticker>> LIZ;
    public static List<C0U74<RoomSticker>> LIZIZ;
    public static String LIZJ;

    public static List LJFF() {
        ArrayList arrayList = new ArrayList();
        List<C0U74<RoomSticker>> list = LIZ;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<C0U74<RoomSticker>> list2 = LIZIZ;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public static void LJII() {
        if (C342701Ur.LIZ != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C01S0(null), 3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("12345");
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(arrayList, i));
            sb.append(",");
        }
        sb.append((String) C13LP.LJJLIIIJJI(arrayList));
        String string = sb.toString();
        if (string == null || string.length() == 0 || string == null) {
            return;
        }
        ((RoomStickerApi) C482260Ivg.LIZJ(RoomStickerApi.class)).checkEditable(string).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.01Rz
            @Override // X.C09JN
            public final void accept(Object obj) {
                Boolean bool;
                Map<Long, Boolean> map;
                Collection<Boolean> collectionValues;
                C1C7U.LIZ("StickerManager@42fa.requestCheckApi$1");
                StickerCheckResponse stickerCheckResponse = (StickerCheckResponse) ((BaseResponse) obj).data;
                if (stickerCheckResponse == null || (map = stickerCheckResponse.stickerCheckMap) == null || (collectionValues = map.values()) == null || (bool = (Boolean) C13LP.LJJJLIIL(collectionValues)) == null) {
                    bool = Boolean.FALSE;
                }
                C342701Ur.LIZ = bool;
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C335401Rw(null), 3);
                C1C7U.LIZIZ("StickerManager@42fa.requestCheckApi$1");
            }
        }, new C09JN() { // from class: X.01Ry
            @Override // X.C09JN
            public final void accept(Object obj) {
                String localizedMessage;
                C1C7U.LIZ("StickerManager@42fa.requestCheckApi$2");
                Throwable th = (Throwable) obj;
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/webcast/room/stickers/check/ is error, error message:");
                    if (th == null) {
                        localizedMessage = null;
                    } else {
                        localizedMessage = th.getLocalizedMessage();
                    }
                    sbLIZ.append(localizedMessage);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C335501Rx(null), 3);
                C1C7U.LIZIZ("StickerManager@42fa.requestCheckApi$2");
            }
        });
    }

    public static boolean LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && (' ' > cCharAt || (cCharAt >= 55296 && (57344 > cCharAt || (cCharAt >= 65534 && (0 > cCharAt || cCharAt >= 0)))))) {
                return true;
            }
        }
        return false;
    }

    public static String LIZLLL(Long l) {
        Object next;
        String str;
        if (l == null) {
            return null;
        }
        l.longValue();
        if (LIZJ == null) {
            List listLJFF = LJFF();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJFF) {
                C0U74 c0u74 = (C0U74) obj;
                String str2 = c0u74.LIZ;
                String str3 = C0UD4.LIZ;
                if (Intrinsics.LJFF(str2, "livestickertext") || Intrinsics.LJFF(c0u74.LIZ, "livestickerspecial") || Intrinsics.LJFF(c0u74.LIZ, "livestickerevent")) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C0U74) it2.next()).LIZIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((Sticker) next).id == l.longValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Sticker sticker = (Sticker) next;
                if (sticker != null) {
                    str = sticker.LIZ;
                } else {
                    str = null;
                }
                LIZJ = str;
            }
        }
        return LIZJ;
    }

    public static RoomSticker LJ(String str) {
        Object next;
        List listLJFF = LJFF();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C0U74) it2.next()).LIZIZ, arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((Sticker) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (RoomSticker) next;
    }

    public static String LJI(String str) {
        if (str != null) {
            List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{'/'}, false, 0, 6);
            int size = listLJJLIIIJ.size();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJ, size - 2));
            sbLIZ.append('/');
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJ, size - 1));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public static boolean LIZIZ(String str, RoomSticker roomSticker) {
        List listLJFF = LJFF();
        if (!((ArrayList) listLJFF).isEmpty()) {
            if (roomSticker != null) {
                return LIZ(Long.valueOf(roomSticker.id), str, listLJFF);
            }
            return false;
        }
        if (roomSticker != null) {
            return roomSticker.edited;
        }
        return false;
    }

    public static boolean LIZ(Long l, String str, List list) {
        Object next;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C0U74 c0u74 = (C0U74) obj;
            String str3 = c0u74.LIZ;
            String str4 = C0UD4.LIZ;
            if (Intrinsics.LJFF(str3, "livestickertext") || Intrinsics.LJFF(c0u74.LIZ, "livestickerspecial") || Intrinsics.LJFF(c0u74.LIZ, "livestickerevent")) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Iterator it3 = ((C0U74) it2.next()).LIZIZ.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    long j = ((Sticker) next).id;
                    if (l != null && j == l.longValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Sticker sticker = (Sticker) next;
            if (sticker != null && (str2 = sticker.content) != null) {
                z = !Intrinsics.LJFF(str2, str);
            }
        }
        return z;
    }
}
