package com.bytedance.ammt.mmt.impl;

import android.os.SystemClock;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kf.a;

/* JADX INFO: loaded from: classes14.dex */
public class NativeMMTPlugin extends a {
    public static volatile NativeMMTPlugin LIZLLL;
    public static final String LJ;
    public String LIZIZ;
    public String LIZJ;

    public static native void native_dump(String str, String str2);

    public static native void native_setConfigParams(int i);

    public static native void native_setMemoryThreshold(long j, long j2);

    public static native void native_start();

    public static native void native_stop();

    static {
        LoadSoLancet.LIZJ("mmt");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("mmt");
        LoadSoLancet.LJ(jUptimeMillis, "mmt");
        LoadSoLancet.LIZLLL(jUptimeMillis, "mmt");
        LoadSoLancet.LIZIZ("mmt");
        LJ = "nmt";
    }

    public final void LIZ() {
        native_dump(this.LIZIZ, this.LIZJ);
    }

    public final void LIZJ() {
        ByteHook.init();
        native_start();
        this.LIZ = true;
    }

    public final void LIZIZ(long j, long j2) {
        native_setMemoryThreshold(j, j2);
    }
}
