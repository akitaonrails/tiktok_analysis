package X;

import android.util.Pair;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0IM6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IM6 {
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public Pair<String, String> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 777));

    public abstract Pair LIZIZ(C0IHF c0ihf, DataChannel dataChannel);

    public abstract void LIZJ(int i, int i2, long j);

    public void LIZLLL(DataChannel dataChannel) {
    }

    public boolean LJ(int i, long j) {
        return false;
    }

    public final boolean LIZ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public C0IM6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
