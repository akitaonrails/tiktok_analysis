package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629290sV5 implements InterfaceC1628910sUT {
    public final InterfaceC1629300sV6 LIZ;
    public final InterfaceC1635390sev LIZIZ;
    public final MutableLiveData<Map<String, Pair<EnumC1641420soe, Integer>>> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<C443120HZe<Effect, EnumC1641420soe, Integer>> LIZLLL = new MutableLiveData<>();

    @Override // X.InterfaceC1628910sUT
    public final MutableLiveData LIZ() {
        return this.LIZLLL;
    }

    public C1629290sV5(InterfaceC1629300sV6 interfaceC1629300sV6, InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = interfaceC1629300sV6;
        this.LIZIZ = interfaceC1635390sev;
    }

    @Override // X.InterfaceC1628910sUT
    public final Pair<EnumC1641420soe, Integer> LIZIZ(Effect effect, boolean z) {
        Pair<EnumC1641420soe, Integer> pair;
        Map<String, Pair<EnumC1641420soe, Integer>> value = this.LIZJ.getValue();
        if (value != null) {
            pair = value.get(effect.getId());
        } else {
            pair = null;
        }
        if (C2281551ESb.LIZIZ.LJIILL()) {
            if (pair == null) {
                return new Pair<>(EnumC1641420soe.UNKNOWN, 0);
            }
            return pair;
        }
        if (pair == null) {
            if (z) {
                if (C2286708xd.LIZJ(effect.getUnzipPath())) {
                    return new Pair<>(EnumC1641420soe.UNKNOWN, 0);
                }
                return new Pair<>(EnumC1641420soe.NOT_DOWNLOAD, 0);
            }
            InterfaceC1629300sV6 interfaceC1629300sV6 = this.LIZ;
            if (interfaceC1629300sV6 != null && interfaceC1629300sV6.LIZIZ(effect)) {
                pair = new Pair<>(EnumC1641420soe.UNKNOWN, 0);
            } else {
                InterfaceC1635390sev interfaceC1635390sev = this.LIZIZ;
                if (interfaceC1635390sev != null && C1629180sUu.LIZ(effect, interfaceC1635390sev)) {
                    pair = new Pair<>(EnumC1641420soe.UNKNOWN, 0);
                } else {
                    pair = new Pair<>(EnumC1641420soe.NOT_DOWNLOAD, 0);
                }
            }
            LIZJ(effect, pair.getFirst(), pair.getSecond(), false);
        }
        return pair;
    }

    @Override // X.InterfaceC1628910sUT
    public final void LIZJ(Effect effect, EnumC1641420soe enumC1641420soe, Integer num, boolean z) {
        Map<String, Pair<EnumC1641420soe, Integer>> value = this.LIZJ.getValue();
        if (value == null) {
            value = new ConcurrentHashMap<>();
        }
        Map<String, Pair<EnumC1641420soe, Integer>> mapLIZJ = C19719512Dh.LIZJ(value);
        mapLIZJ.put(effect.getId(), new Pair<>(enumC1641420soe, num));
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            this.LIZJ.setValue(mapLIZJ);
        } else {
            this.LIZJ.postValue(mapLIZJ);
        }
        if (z) {
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                this.LIZLLL.setValue(new C443120HZe<>(effect, enumC1641420soe, num));
            } else {
                this.LIZLLL.postValue(new C443120HZe<>(effect, enumC1641420soe, num));
            }
        }
    }
}
