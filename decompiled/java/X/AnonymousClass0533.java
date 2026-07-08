package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0533, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0533 implements C053I<FrequencyMarkRecord> {
    public static final Type LIZJ = new TypeToken<FrequencyMarkRecord>() { // from class: X.0534
    }.getType();
    public final AnonymousClass0531 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1078));

    @Override // X.C053I
    public final List<String> LJ() {
        return C13LP.LLIIII(((Keva) this.LIZIZ.getValue()).getAllKey());
    }

    public AnonymousClass0533(AnonymousClass0531 anonymousClass0531) {
        this.LIZ = anonymousClass0531;
    }

    public static boolean LIZ(FrequencyMarkRecord frequencyMarkRecord) {
        Long l;
        Boolean bool;
        Integer num = frequencyMarkRecord.count;
        if ((num == null || num.intValue() <= 0) && (((l = frequencyMarkRecord.lastShowTimeMs) == null || l.longValue() <= 0) && ((bool = frequencyMarkRecord.pendingClientOverride) == null || !bool.booleanValue()))) {
            return false;
        }
        return true;
    }

    @Override // X.C053I
    public final void LJI(String str) {
        ((Keva) this.LIZIZ.getValue()).erase(str);
    }

    @Override // X.C053I
    public final /* bridge */ /* synthetic */ boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
        return LIZ(frequencyMarkRecord);
    }

    @Override // X.C053I
    public final Pair<Boolean, FrequencyMarkRecord> getData(String str) {
        Object c098200Yq;
        String string = ((Keva) this.LIZIZ.getValue()).getString(str, "");
        if (string != null && string.length() != 0) {
            try {
                FrequencyMarkRecord frequencyMarkRecord = (FrequencyMarkRecord) C051M.LIZ.LJIIIIZZ(string, LIZJ);
                c098200Yq = new Pair(Boolean.valueOf(LIZ(frequencyMarkRecord)), frequencyMarkRecord);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Pair pair = new Pair(Boolean.FALSE, FrequencyMarkRecord.LIZ);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = pair;
            }
            return (Pair) c098200Yq;
        }
        return new Pair<>(Boolean.FALSE, FrequencyMarkRecord.LIZ);
    }

    @Override // X.C053I
    public final void LJFF(Object obj, String str) {
        ((Keva) this.LIZIZ.getValue()).storeString(str, GsonProtectorUtils.toJson(C051M.LIZ, obj));
    }
}
