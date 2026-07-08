package X;

import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1A6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174091A6t {
    public static final C1372990lph LJIIIIZZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIZ;
    public static final C01GW<C2174091A6t> LJIIJ;
    public boolean LIZ;
    public boolean LIZIZ;
    public C2174101A6u LIZJ;
    public C2174101A6u LIZLLL;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public long LJFF;
    public final C2174111A6v LJI;
    public final C717590SCv LJII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lph] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C2174091A6t.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LJIIIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LJIIIIZZ = new Object() { // from class: X.0lph
        };
        LJIIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(440));
    }

    public C2174091A6t() {
        this.LJI = Build.VERSION.SDK_INT >= 34 ? C2174111A6v.LIZ : null;
        this.LJII = new C717590SCv(AFwS224S0000000_33.get$arr$(441));
    }

    public final void LIZ(long j) {
        this.LJFF = j;
        C20343314it c20343314it = C20343314it.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startListenTime change to ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20343314it.getClass();
        C20343314it.LIZ(strLIZIZ);
    }
}
