package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08N3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N3 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (!u.LJJIIJZLJL(str, "__MACOSX/", false) && !a0.LJJIIZI(str, "/.DS_Store", false) && !Intrinsics.LJFF(str, ".DS_Store") && !a0.LJJIIZI(str, "/Thumbs.db", false) && !Intrinsics.LJFF(str, "Thumbs.db")) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(String str, String str2) {
        try {
            LIZJ(str, str2);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Compress fail: ");
            sbLIZ.append(e.getMessage());
            C1720106oR.LIZ("minis-ZipUtils", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:101:0x01ab
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08N3.LIZJ(java.lang.String, java.lang.String):void");
    }
}
