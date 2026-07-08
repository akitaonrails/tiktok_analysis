package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111308Ox {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x00d5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void LIZ(X.C0VSP r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2111308Ox.LIZ(X.0VSP, java.lang.String):void");
    }

    public static final void LIZIZ(File file, C0VSJ c0vsj) throws Exception {
        try {
            LIZ(new C0VSP(file), c0vsj.getAbsolutePath());
            c0vsj.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0vsj.delete();
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }
}
