package X;

import Y.AfS148S0200000_12;
import Y.AkS15S0000100_12;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TBZ<T> implements InterfaceC969510bKv {
    public static C11JF LJIIIIZZ;
    public DataChannel LIZ;
    public T LIZIZ;
    public final MutableLiveData<List<C954460awe>> LIZJ;
    public final MutableLiveData LIZLLL;
    public final MutableLiveData<Map<Long, Boolean>> LJ;
    public final MutableLiveData LJFF;
    public final MutableLiveData<Long> LJI;
    public final MutableLiveData LJII;

    public static final void LIZIZ() {
        C11JF c11jf = LJIIIIZZ;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        LJIIIIZZ = null;
    }

    @Override // X.InterfaceC969510bKv
    public void onCleared() {
        this.LIZJ.setValue(C13BV.INSTANCE);
        this.LJ.setValue(new HashMap());
        this.LJI.setValue(0L);
        LIZIZ();
    }

    public C0TBZ() {
        MutableLiveData<List<C954460awe>> mutableLiveData = new MutableLiveData<>(C13BV.INSTANCE);
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData;
        MutableLiveData<Map<Long, Boolean>> mutableLiveData2 = new MutableLiveData<>(new HashMap());
        this.LJ = mutableLiveData2;
        this.LJFF = mutableLiveData2;
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>(0L);
        this.LJI = mutableLiveData3;
        this.LJII = mutableLiveData3;
    }

    public final void LIZJ(long j, boolean z) {
        Map<Long, Boolean> map = (Map) this.LJFF.getValue();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(Long.valueOf(j), Boolean.valueOf(z));
        this.LJ.setValue(map);
    }

    public final void LIZ(DataChannel dataChannel, long j, Function0<Unit> function0) {
        LIZIZ();
        LJIIIIZZ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(j).LJJJJZI(new AkS15S0000100_12(j, 2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS148S0200000_12(dataChannel, this, 60), new C09JN() { // from class: X.0T7s
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CatchBeansInviterInviteeViewModel@a3f3.startInviteCountdown$3");
                C20441214yg.LIZIZ("CatchBeansInviterInviteeViewModel", ((Throwable) obj).getMessage());
                C1C7U.LIZIZ("CatchBeansInviterInviteeViewModel@a3f3.startInviteCountdown$3");
            }
        }, new C786160Usg(dataChannel, function0, 3));
    }
}
