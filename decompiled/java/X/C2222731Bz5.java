package X;

import Y.AObjectS81S0000000_34;
import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Bz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222731Bz5 extends IDAVHTTPClientDelegateWrapper {
    public static boolean LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(new AObjectS81S0000000_34(5));

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final long getContentLength(long j) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ.getValue()).get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:60:0x010b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r18, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE r19, long r20, com.ss.ugc.android.davinciresource.jni.MapStringString r22, com.ss.ugc.android.davinciresource.jni.MapStringString r23, java.lang.String r24, byte[] r25, com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void r26, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222731Bz5.LIZ(java.lang.String, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE, long, com.ss.ugc.android.davinciresource.jni.MapStringString, com.ss.ugc.android.davinciresource.jni.MapStringString, java.lang.String, byte[], com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate):void");
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final boolean requestNet(String str, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (str == null || sWIGTYPE_p_void == null || httpClientCallbackDelegate == null) {
            return false;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2222741Bz6(str, this, http_type, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate, null), 2);
        return true;
    }
}
