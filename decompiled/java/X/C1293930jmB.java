package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.ttminisnative.TTMinisNative;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0jmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293930jmB {
    public static final C1293930jmB LIZ = new C1293930jmB();

    static {
        LoadSoLancet.LIZJ("ttminisnative");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("ttminisnative");
        LoadSoLancet.LJ(jUptimeMillis, "ttminisnative");
        LoadSoLancet.LIZLLL(jUptimeMillis, "ttminisnative");
        LoadSoLancet.LIZIZ("ttminisnative");
        new TTMinisNative().initPKGMethod();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:21:0x0045, B:25:0x0057, B:30:0x006f, B:66:0x00a7, B:64:0x00a2, B:60:0x009c, B:61:0x009f), top: B:83:0x0045 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x0033
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1293930jmB.LIZ(java.lang.String, java.lang.String, boolean):void");
    }
}
