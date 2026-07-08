package X;

import android.app.Activity;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Vbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801200Vbq implements Serializable {
    public static final C801220Vbs Companion = new Object() { // from class: X.0Vbs
    };
    public int LL;
    public final Map<String, Pair<Integer, Boolean>> LLILLJJLI = new LinkedHashMap();
    public boolean LLILLL;
    public Integer LLILZ;
    public long LLILZIL;

    public final void markPermissionHasPopUp() {
        this.LLILLL = true;
    }

    public final void reset() {
        this.LL = 0;
        ((LinkedHashMap) this.LLILLJJLI).clear();
        this.LLILLL = false;
        this.LLILZ = null;
    }

    public final boolean isRequestingPermission() {
        return this.LL == 1;
    }

    public final Map<String, Pair<Integer, Boolean>> getGrantResultsBeforeRequest() {
        return this.LLILLJJLI;
    }

    public final void markCurrentGrantStatus(Activity activity, String[] strArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.LL = 1;
        for (String str2 : strArr) {
            this.LLILLJJLI.put(str2, new Pair<>(Integer.valueOf(C838410Wul.LIZ(activity, str2)), Boolean.valueOf(C0VE9.LJIIJ(activity, str2))));
        }
        this.LLILZ = Integer.valueOf(i);
        this.LLILZIL = System.currentTimeMillis();
    }

    public final void markRequestPermissionResults(Activity activity, int i, String[] strArr, int[] iArr) {
        Integer num;
        EnumC801210Vbr enumC801210Vbr;
        try {
            this.LL = 0;
            num = this.LLILZ;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (num != null && i == num.intValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : strArr) {
                linkedHashMap.put(str, new Pair(Integer.valueOf(C838410Wul.LIZ(activity, str)), Boolean.valueOf(C0VE9.LJIIJ(activity, str))));
            }
            C013C c013c = new C013C();
            C013C c013c2 = new C013C();
            for (Map.Entry entry : ((LinkedHashMap) this.LLILLJJLI).entrySet()) {
                String str2 = (String) entry.getKey();
                Pair pair = (Pair) entry.getValue();
                Pair pair2 = (Pair) linkedHashMap.get(str2);
                if (pair2 != null) {
                    if (((Number) pair.getFirst()).intValue() != ((Number) pair2.getFirst()).intValue()) {
                        c013c.element = true;
                    }
                    if (((Boolean) pair.getSecond()).booleanValue() != ((Boolean) pair2.getSecond()).booleanValue()) {
                        c013c2.element = true;
                    }
                }
            }
            if (!c013c.element && !c013c2.element && !this.LLILLL) {
                PermissionPopUpService.LL.getClass();
                PermissionPopUpService.LLILZ.removeMessages(4387);
                reset();
                return;
            } else {
                if (System.currentTimeMillis() - this.LLILZIL <= 200) {
                    PermissionPopUpService.LL.getClass();
                    PermissionPopUpService.LLILZ.removeMessages(4387);
                    reset();
                    return;
                }
                C801240Vbu c801240Vbu = PermissionPopUpService.LL;
                if (c013c.element) {
                    enumC801210Vbr = EnumC801210Vbr.Approve;
                } else {
                    enumC801210Vbr = EnumC801210Vbr.Deny;
                }
                c801240Vbu.getClass();
                C801240Vbu.LIZIZ(activity, strArr, iArr, enumC801210Vbr);
                reset();
                return;
            }
        }
        reset();
    }
}
