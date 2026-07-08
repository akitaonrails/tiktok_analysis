package X;

import android.util.Base64;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutWindowExtra;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;

/* JADX INFO: renamed from: X.0bQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973010bQZ {
    public static volatile long LIZIZ;
    public static final C973010bQZ LIZ = new C973010bQZ();
    public static final C563400M7u LIZJ = new C563400M7u(0);
    public static final C098J<String, MultiGuestSpotExtra> LIZLLL = new C098J<>(4);
    public static final C098J<String, MultiGuestSpotNonSeiExtra> LJ = new C098J<>(4);
    public static final C098J<String, MultiGuestLayoutExtra> LJFF = new C098J<>();
    public static final C098J<String, MultiGuestLayoutNonSeiExtra> LJI = new C098J<>();

    public static String LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis != LIZIZ) {
            LIZIZ = jCurrentTimeMillis;
            LIZJ.LJ(0);
            return String.valueOf(jCurrentTimeMillis);
        }
        int iLIZLLL = LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append('_');
        sbLIZ.append(iLIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final CohostLayoutExtra LIZ(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode != null) {
            return (CohostLayoutExtra) C966250bFf.LIZ(bArrDecode, CohostLayoutExtra.class);
        }
        return null;
    }

    public static final CohostLayoutWindowExtra LIZIZ(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode != null) {
            return (CohostLayoutWindowExtra) C966250bFf.LIZ(bArrDecode, CohostLayoutWindowExtra.class);
        }
        return null;
    }

    public static final String LIZJ(CohostLayoutExtra cohostLayoutExtra) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        String str;
        C2237351ChZ c2237351ChZ = new C2237351ChZ(new C2237381Chc(Long.valueOf(cohostLayoutExtra.isZoomLayout), Long.valueOf(cohostLayoutExtra.offsetY), Long.valueOf(cohostLayoutExtra.scene)));
        int iEncodedSize = C2237351ChZ.ADAPTER.encodedSize(c2237351ChZ);
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            c2237351ChZ.encode(new C1283530jVP(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        ByteBuffer byteBufferMoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521 = MoltenFfiLinkMicSdk.MoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521(byteBufferAllocateDirect);
        if (byteBufferMoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521 == null) {
            c19924412xW = new ByteArrayInputStream(new byte[0]);
        } else {
            c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521);
        }
        try {
            str = C1CCW.ADAPTER.decode(c19924412xW).ret;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = C1CCW.ADAPTER.decode(new byte[0]).ret;
        }
        if (byteBufferMoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521 != null) {
            MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeConvertCohostLayoutExtraToBase64X4926245109074220521);
        }
        return str;
    }

    public static final String LIZLLL(CohostLayoutWindowExtra cohostLayoutWindowExtra) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        String str;
        C1CD8 c1cd8 = new C1CD8(new C1CD5(Long.valueOf(cohostLayoutWindowExtra.contentType)));
        int iEncodedSize = C1CD8.ADAPTER.encodedSize(c1cd8);
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            c1cd8.encode(new C1283530jVP(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        ByteBuffer byteBufferMoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980 = MoltenFfiLinkMicSdk.MoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980(byteBufferAllocateDirect);
        if (byteBufferMoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980 == null) {
            c19924412xW = new ByteArrayInputStream(new byte[0]);
        } else {
            c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980);
        }
        try {
            str = C1CCW.ADAPTER.decode(c19924412xW).ret;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = C1CCW.ADAPTER.decode(new byte[0]).ret;
        }
        if (byteBufferMoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980 != null) {
            MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeConvertCohostLayoutWindowExtraToBase64X3628114302356674980);
        }
        return str;
    }

    public static final C917100ZyO LJFF(String str) {
        return new C917100ZyO(str, LJ());
    }

    public static C2181931AaN LJI(String str) {
        return new C2181931AaN(str, LJ());
    }

    public static MultiGuestLayoutExtra LJII(String str) {
        C098J<String, MultiGuestLayoutExtra> c098j = LJFF;
        MultiGuestLayoutExtra multiGuestLayoutExtra = c098j.get(str);
        if (multiGuestLayoutExtra == null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null && (multiGuestLayoutExtra = (MultiGuestLayoutExtra) C966250bFf.LIZ(bArrDecode, MultiGuestLayoutExtra.class)) != null) {
                c098j.put(str, multiGuestLayoutExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toLayoutExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("LinkMicLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return null;
            }
        }
        return multiGuestLayoutExtra;
    }

    public static MultiGuestLayoutNonSeiExtra LJIIIIZZ(String str) {
        C098J<String, MultiGuestLayoutNonSeiExtra> c098j = LJI;
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra = c098j.get(str);
        if (multiGuestLayoutNonSeiExtra == null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null && (multiGuestLayoutNonSeiExtra = (MultiGuestLayoutNonSeiExtra) C966250bFf.LIZ(bArrDecode, MultiGuestLayoutNonSeiExtra.class)) != null) {
                c098j.put(str, multiGuestLayoutNonSeiExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toLayoutNonSeiExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("LinkMicLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return null;
            }
        }
        return multiGuestLayoutNonSeiExtra;
    }

    public static MultiGuestSpotExtra LJIIIZ(String str) {
        C098J<String, MultiGuestSpotExtra> c098j = LIZLLL;
        MultiGuestSpotExtra multiGuestSpotExtra = c098j.get(str);
        if (multiGuestSpotExtra == null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null && (multiGuestSpotExtra = (MultiGuestSpotExtra) C966250bFf.LIZ(bArrDecode, MultiGuestSpotExtra.class)) != null) {
                c098j.put(str, multiGuestSpotExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toSpotExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("LinkMicLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return null;
            }
        }
        return multiGuestSpotExtra;
    }

    public static MultiGuestSpotNonSeiExtra LJIIJ(String str) {
        C098J<String, MultiGuestSpotNonSeiExtra> c098j = LJ;
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra = c098j.get(str);
        if (multiGuestSpotNonSeiExtra == null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null && (multiGuestSpotNonSeiExtra = (MultiGuestSpotNonSeiExtra) C966250bFf.LIZ(bArrDecode, MultiGuestSpotNonSeiExtra.class)) != null) {
                c098j.put(str, multiGuestSpotNonSeiExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toSpotNonSeiExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("LinkMicLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return null;
            }
        }
        return multiGuestSpotNonSeiExtra;
    }
}
