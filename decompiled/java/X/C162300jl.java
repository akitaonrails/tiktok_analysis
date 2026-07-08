package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162300jl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(long j, Object obj) {
        Object c098200Yq;
        if (j > 0 && obj != null) {
            String strValueOf = String.valueOf(j);
            if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (LIZJ(j, it2.next(), strValueOf)) {
                            return true;
                        }
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    if (LIZJ(j, obj2, strValueOf)) {
                        return true;
                    }
                }
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (LIZJ(j, jSONArray.opt(i), strValueOf)) {
                        return true;
                    }
                }
            } else if (obj instanceof String) {
                String string = a0.LJLIIIL((String) obj).toString();
                if (string.length() != 0) {
                    if (u.LJJIIJZLJL(string, e3.e, false) && u.LJIIZILJ(string, e3.f, false)) {
                        try {
                            c098200Yq = new JSONArray(string);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        JSONArray jSONArray2 = (JSONArray) c098200Yq;
                        if (jSONArray2 != null) {
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                if (LIZJ(j, jSONArray2.opt(i2), strValueOf)) {
                                    return true;
                                }
                            }
                        }
                    }
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                    if ((listLJJLIIIJILLIZJL instanceof Collection) && listLJJLIIIJILLIZJL.isEmpty()) {
                        return false;
                    }
                    Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(a0.LJLIIIL((String) it3.next()).toString(), strValueOf)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ(Context context, Gift gift, long j) {
        String str;
        IHybridContainerService iHybridContainerService;
        if (gift == null || !gift.LIZ()) {
            return false;
        }
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null && giftLockInfo.mLock) {
            return false;
        }
        if (j > 0) {
            try {
                if (LIZ(j, ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).Pp2(context, "guardian_send_gift_popup_dismissed", null))) {
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        GiftLockInfo giftLockInfo2 = gift.giftSubInfo;
        if (giftLockInfo2 == null || (str = giftLockInfo2.unlockSchema) == null) {
            str = "";
        }
        if (!a0.LJJJIL(str) && (iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)) != null) {
            iHybridContainerService.YC1(context, str, null);
        }
        return true;
    }

    public static boolean LIZJ(long j, Object obj, String str) {
        if (obj instanceof Number) {
            if (((Number) obj).longValue() == j) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            return Intrinsics.LJFF(a0.LJLIIIL((String) obj).toString(), str);
        }
        return false;
    }

    public static C012M LIZLLL(LinkedHashMap linkedHashMap, int i, boolean z) {
        boolean z2 = false;
        if (!linkedHashMap.containsKey(5)) {
            return new C012M(linkedHashMap, false);
        }
        Object obj = linkedHashMap.get(5);
        if (obj == null) {
            return new C012M(linkedHashMap, false);
        }
        if (!z && i >= 3 && linkedHashMap.containsKey(2)) {
            z2 = true;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        if (z2) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                Object value = entry.getValue();
                if (iIntValue != 2) {
                    if (iIntValue != 5) {
                        linkedHashMap2.put(Integer.valueOf(iIntValue), value);
                    }
                } else {
                    linkedHashMap2.put(5, obj);
                    linkedHashMap2.put(Integer.valueOf(iIntValue), value);
                }
            }
        } else {
            linkedHashMap2.put(5, obj);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue2 = ((Number) entry2.getKey()).intValue();
                Object value2 = entry2.getValue();
                if (iIntValue2 != 5) {
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), value2);
                }
            }
        }
        return new C012M(linkedHashMap2, z2);
    }
}
