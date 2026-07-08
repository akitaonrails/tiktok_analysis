package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06HT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06HT implements InterfaceC883330Yl1 {
    public static final Map<String, StreakExtension> LL = new ConcurrentHashMap();

    public static StreakExtension LIZ(String str) {
        return (StreakExtension) ((ConcurrentHashMap) LL).get(str);
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (enumC883280Ykw != EnumC883280Ykw.UNKNOWN) {
            ((ConcurrentHashMap) LL).clear();
        }
    }
}
