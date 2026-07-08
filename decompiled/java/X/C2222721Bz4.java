package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackAction;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.MsgExtParam;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.1Bz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222721Bz4 extends IDAVHTTPClientDelegateWrapper {
    public static final C01GW<C2222721Bz4> LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(2));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(3));

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final long getContentLength(long j) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ.getValue()).get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r19, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE r20, long r21, com.ss.ugc.android.davinciresource.jni.MapStringString r23, com.ss.ugc.android.davinciresource.jni.MapStringString r24, java.lang.String r25, byte[] r26, com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void r27, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222721Bz4.LIZ(java.lang.String, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE, long, com.ss.ugc.android.davinciresource.jni.MapStringString, com.ss.ugc.android.davinciresource.jni.MapStringString, java.lang.String, byte[], com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate):void");
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final boolean requestNet(final String str, final HTTP_TYPE http_type, final long j, final MapStringString mapStringString, final MapStringString mapStringString2, final String str2, final byte[] bArr, final SWIGTYPE_p_void sWIGTYPE_p_void, final HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (str == null || sWIGTYPE_p_void == null || httpClientCallbackDelegate == null) {
            return false;
        }
        C15O7.LIZIZ(new Callable() { // from class: X.1Bz7
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Object obj;
                C1C7U.LIZ("TemplateDavNetworkImpl@ab74.requestNet$1");
                try {
                    this.LIZ(str, http_type, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate);
                    obj = Boolean.TRUE;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    MsgExtParam msgExtParam = new MsgExtParam();
                    HTTP_TYPE http_type2 = http_type;
                    if (http_type2 == null) {
                        http_type2 = HTTP_TYPE.HTTP_GET;
                    }
                    msgExtParam.setEHttpType(http_type2);
                    msgExtParam.setUiReqId(j);
                    msgExtParam.setErrorCode(-1);
                    httpClientCallbackDelegate.onCallback(sWIGTYPE_p_void, HttpClientCallbackAction.FAIL, "Network Failed".getBytes(Charsets.UTF_8), r6.length, msgExtParam);
                    obj = Unit.LIZ;
                }
                C1C7U.LIZIZ("TemplateDavNetworkImpl@ab74.requestNet$1");
                return obj;
            }
        }, C15O7.LJI, null);
        return true;
    }
}
