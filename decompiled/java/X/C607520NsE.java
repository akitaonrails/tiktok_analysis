package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS60S1000000_9;

/* JADX INFO: renamed from: X.0NsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607520NsE {
    public static final C607520NsE LIZ = new C607520NsE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C607530NsF());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C607540NsG());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2350409Iw());
    public static final C01GW LJ = C452501pT.LIZIZ(new C607550NsH());

    public static Map LIZIZ() {
        return (Map) LJ.getValue();
    }

    public static void LIZ(EnumC607570NsJ... enumC607570NsJArr) {
        if (enumC607570NsJArr.length == 0) {
            Iterator it2 = LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                ((Set) ((Map.Entry) it2.next()).getValue()).clear();
            }
            return;
        }
        for (EnumC607570NsJ enumC607570NsJ : enumC607570NsJArr) {
            LIZ.getClass();
            Set set = (Set) LIZIZ().get(enumC607570NsJ);
            if (set != null) {
                set.clear();
            }
        }
    }

    @C14EU
    public final void onVideoStatusChanged(C581630MrZ c581630MrZ) {
        String str = c581630MrZ.LIZIZ;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i = c581630MrZ.LIZ;
        if (i != 2) {
            if (i != 6 || !((Boolean) FollowRealTimeReadExp.LJ.getValue()).booleanValue()) {
                return;
            }
            ((CopyOnWriteArrayList) LIZIZ.getValue()).add(str);
            return;
        }
        C607610NsN.LIZ.getClass();
        C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C607510NsD(str, null), 3).LJII(new AwS60S1000000_9(str, 8));
    }

    public static void LIZJ(String str, EnumC607570NsJ... enumC607570NsJArr) {
        if (enumC607570NsJArr.length == 0) {
            Iterator it2 = LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                ((Set) ((Map.Entry) it2.next()).getValue()).remove(str);
            }
            return;
        }
        for (EnumC607570NsJ enumC607570NsJ : enumC607570NsJArr) {
            LIZ.getClass();
            Set set = (Set) LIZIZ().get(enumC607570NsJ);
            if (set != null) {
                set.remove(str);
            }
        }
    }
}
