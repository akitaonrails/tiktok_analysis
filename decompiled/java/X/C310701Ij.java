package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C310701Ij<T extends Channel<C946060aj6<O>>, O> {
    public final DataChannel LIZ;
    public final Class<T> LIZIZ;
    public final MutableLiveData<Integer> LIZJ;
    public final C01GW LIZLLL;

    public final C946050aj5 LIZ() {
        DataChannel dataChannel;
        C946060aj6 c946060aj6;
        if (!C758560TpG.LIZ() || (dataChannel = this.LIZ) == null || (c946060aj6 = (C946060aj6) dataChannel.gg0(this.LIZIZ)) == null) {
            return null;
        }
        if (Intrinsics.LJFF(c946060aj6.LIZIZ, "playbook_entity") || Intrinsics.LJFF(c946060aj6.LIZIZ, "scheme")) {
            return c946060aj6.LIZIZ();
        }
        return null;
    }

    public final void LIZIZ() {
        Function0<Unit> function0;
        C946050aj5 c946050aj5LIZ = LIZ();
        if (c946050aj5LIZ != null) {
            System.currentTimeMillis();
            c946050aj5LIZ.LJFF(0);
            C946050aj5 c946050aj5LIZ2 = LIZ();
            if (c946050aj5LIZ2 == null || (function0 = c946050aj5LIZ2.LIZ.LJ) == null) {
                return;
            }
            function0.invoke();
        }
    }

    public C310701Ij(DataChannel dataChannel, Class cls, MutableLiveData mutableLiveData) {
        this.LIZ = dataChannel;
        this.LIZIZ = cls;
        this.LIZJ = mutableLiveData;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C5182020e(this, (C310701Ij<Channel<C946060aj6<Object>>, Object>) 17));
        this.LIZLLL = c01gwLIZIZ;
        if (C758560TpG.LIZ()) {
            mutableLiveData.observeForever((Observer) c01gwLIZIZ.getValue());
        }
    }
}
