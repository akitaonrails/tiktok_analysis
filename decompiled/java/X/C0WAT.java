package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WAT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAT {
    public final int LIZ;
    public final C0WAS LIZIZ;
    public final long LIZLLL;
    public final AtomicBoolean LJ;
    public final Thread LJFF;
    public final EnumMap<C0WAR, Integer> LJI;
    public final LinkedHashMap<C0WAP, Integer> LJII;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final boolean LIZJ = true;

    public C0WAT(int i, C0WAS c0was, long j, AtomicBoolean atomicBoolean, BPEAThread bPEAThread, EnumMap enumMap, LinkedHashMap linkedHashMap) {
        this.LIZ = i;
        this.LIZIZ = c0was;
        this.LIZLLL = j;
        this.LJ = atomicBoolean;
        this.LJFF = bPEAThread;
        this.LJI = enumMap;
        this.LJII = linkedHashMap;
    }
}
