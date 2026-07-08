package X;

import Y.ARunnableS134S0100000_34;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1Bet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210211Bet {
    public static volatile boolean LJFF = false;
    public static volatile long LJI = 500;
    public static volatile Set<String> LJII = new HashSet();
    public final Handler LIZ;
    public final InterfaceC2211261Bga LIZIZ;
    public volatile boolean LIZLLL;
    public final ArrayList<AbstractC2209931BeR> LIZJ = new ArrayList<>();
    public final ARunnableS134S0100000_34 LJ = new ARunnableS134S0100000_34(this, 4);

    public C2210211Bet(BPEAHandler bPEAHandler, C2210501BfM c2210501BfM) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = c2210501BfM;
    }
}
