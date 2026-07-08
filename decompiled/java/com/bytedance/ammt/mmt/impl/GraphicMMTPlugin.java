package com.bytedance.ammt.mmt.impl;

import X.C0VSJ;
import X.C2188811AlT;
import Y.ARunnableS7S2100000_13;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import kf.a;

/* JADX INFO: loaded from: classes14.dex */
public class GraphicMMTPlugin extends a {
    public static GraphicMMTPlugin LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public String LIZIZ;
    public String LIZJ;

    public static native void gmt_native_dump(String str, String str2);

    public static native void gmt_native_setConfigParams(int i);

    public static native void gmt_native_setMemoryThreshold(long j, long j2);

    public static native void gmt_native_start();

    public static native void gmt_native_stop();

    static {
        LoadSoLancet.LIZJ("mmt");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("mmt");
        LoadSoLancet.LJ(jUptimeMillis, "mmt");
        LoadSoLancet.LIZLLL(jUptimeMillis, "mmt");
        LoadSoLancet.LIZIZ("mmt");
        LJ = "gmt";
        LJFF = "_usage";
        LJI = "_profile";
    }

    public static GraphicMMTPlugin LIZJ() {
        if (LIZLLL == null) {
            synchronized (GraphicMMTPlugin.class) {
                try {
                    LIZLLL = new GraphicMMTPlugin();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ() {
        gmt_native_dump(this.LIZIZ, this.LIZJ);
    }

    public final void LJI() {
        ByteHook.init();
        gmt_native_start();
        this.LIZ = true;
    }

    public final void LIZ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(LJFF);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(str);
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(LJI);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        C0VSJ c0vsj2 = new C0VSJ(strLIZIZ2);
        if (c0vsj.exists() && c0vsj2.exists()) {
            new BPEAThread(new ARunnableS7S2100000_13(context, strLIZIZ2, strLIZIZ, 4)).start();
        }
    }

    public final void LIZLLL(int i) {
        gmt_native_setConfigParams(i);
    }

    public final void LJ(long j, long j2) {
        gmt_native_setMemoryThreshold(j, j2);
    }

    public final void LJFF(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        sbLIZ.append(LJ);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = str2;
    }
}
