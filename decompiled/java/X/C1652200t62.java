package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mn3.e0;

/* JADX INFO: renamed from: X.0t62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652200t62 {
    public final e0 LIZ;
    public final InterfaceC1648570t0B LIZIZ;
    public final ShortVideoContext LIZJ;
    public final ICreationFeatureBridge LJFF;
    public final InterfaceC1644770su3 LIZLLL = null;
    public final InterfaceC1650620t3U LJ = null;
    public final AtomicInteger LJI = new AtomicInteger(0);
    public final AtomicReference<String> LJII = new AtomicReference<>("");
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final C1652210t63 LJIIIZ = new InterfaceC770150UIz() { // from class: X.0t63
        @Override // X.InterfaceC770150UIz
        public final void LIZ(List<Float> list) {
            Boolean boolValueOf;
            try {
                boolValueOf = Boolean.valueOf(this.LIZ.LJFF.isFeatureEnabled());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                boolValueOf = null;
            }
            if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.LIZ.LJI.set(((ArrayList) list).size());
        }
    };
    public final AObjectS246S0100000_25 LJIIJ = new AObjectS246S0100000_25(this, 716);

    public static Map LIZ(float f, int i, int i2) {
        return C2097608Jq.LJIIIIZZ(new Pair("pixels", Integer.valueOf(i * i2)), new Pair("w", Integer.valueOf(i)), new Pair("h", Integer.valueOf(i2)), new Pair("ratio", Float.valueOf(f)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0t63] */
    public C1652200t62(e0 e0Var, InterfaceC1648570t0B interfaceC1648570t0B, ShortVideoContext shortVideoContext, ICreationFeatureBridge iCreationFeatureBridge) {
        this.LIZ = e0Var;
        this.LIZIZ = interfaceC1648570t0B;
        this.LIZJ = shortVideoContext;
        this.LJFF = iCreationFeatureBridge;
    }
}
