package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.INetworkModelDepend;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515490pXX implements InterfaceC1501660pBE<TypedInput, ComposePbAndJson> {
    public static final AtomicBoolean LJ = new AtomicBoolean(true);
    public static final String LJFF = "wire_convert";
    public final Gson LIZ;
    public final C1515470pXV LIZIZ;
    public final Type LIZJ;
    public final InterfaceC1515510pXZ LIZLLL;

    @Override // X.InterfaceC1501660pBE
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ComposePbAndJson LIZ(TypedInput typedInput) throws IOException {
        boolean z;
        String strMimeType = typedInput.mimeType();
        INetworkModelDepend iNetworkModelDepend = (INetworkModelDepend) PluggableExtentionKt.pluggableSpi$default(INetworkModelDepend.class, false, false, false, 14, null);
        final boolean z2 = true;
        if (iNetworkModelDepend != null && iNetworkModelDepend.isHippo()) {
            z = true;
        } else {
            z = false;
        }
        if ((TextUtils.isEmpty(strMimeType) || !strMimeType.contains("json")) && !z) {
            z2 = false;
        }
        AtomicBoolean atomicBoolean = LJ;
        if (atomicBoolean.get()) {
            atomicBoolean.getAndSet(false);
            C11NZ.LJJJJZ("").LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0pXY
                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z3 = z2;
                    C1C7U.LIZ("ComposePJResponseBodyConverter@434a.reportMimeType$1L");
                    JSONObject jSONObject = new JSONObject();
                    String str = "proto";
                    if (z3) {
                        str = "json";
                    }
                    try {
                        jSONObject.put("service", str);
                        jSONObject.put("type", str);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        INetworkModelDepend iNetworkModelDepend2 = (INetworkModelDepend) PluggableExtentionKt.pluggableSpi$default(INetworkModelDepend.class, false, false, false, 14, null);
                        if (iNetworkModelDepend2 != null) {
                            iNetworkModelDepend2.logException(th);
                        }
                    }
                    C793770VBv.LJ(C1515490pXX.LJFF, jSONObject);
                    C1C7U.LIZIZ("ComposePJResponseBodyConverter@434a.reportMimeType$1L");
                }
            });
        }
        if (z2) {
            if (iNetworkModelDepend != null) {
                iNetworkModelDepend.log("ComposePbAndJson", "response json");
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ComposePbAndJson composePbAndJsonLIZJ = LIZJ(typedInput);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                InterfaceC1515510pXZ interfaceC1515510pXZ = this.LIZLLL;
                if (interfaceC1515510pXZ != null) {
                    interfaceC1515510pXZ.LIZIZ(jCurrentTimeMillis2, composePbAndJsonLIZJ.LL, null, true);
                }
                return composePbAndJsonLIZJ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1515510pXZ interfaceC1515510pXZ2 = this.LIZLLL;
                if (interfaceC1515510pXZ2 != null) {
                    try {
                        interfaceC1515510pXZ2.LIZ(e, typedInput);
                        throw e;
                    } catch (Throwable th) {
                        throw e;
                    }
                }
                throw e;
            }
        }
        try {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            ComposePbAndJson composePbAndJsonLIZIZ = ComposePbAndJson.LIZIZ(this.LIZIZ.LIZ(typedInput));
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
            InterfaceC1515510pXZ interfaceC1515510pXZ3 = this.LIZLLL;
            if (interfaceC1515510pXZ3 != null) {
                interfaceC1515510pXZ3.LIZIZ(jCurrentTimeMillis4, null, composePbAndJsonLIZIZ.LLILLJJLI, false);
            }
            return composePbAndJsonLIZIZ;
        } catch (IOException th2) {
            try {
                this.LIZLLL.LIZ(th2, typedInput);
                throw th2;
            } finally {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final ComposePbAndJson LIZJ(TypedInput typedInput) {
        String charset = "UTF-8";
        if (typedInput.mimeType() != null) {
            charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), charset);
        try {
            ComposePbAndJson composePbAndJsonLIZ = ComposePbAndJson.LIZ(this.LIZ.LJIIIZ(TypeToken.get(this.LIZJ)).read(this.LIZ.LJIIL(inputStreamReader)));
            try {
                inputStreamReader.close();
                return composePbAndJsonLIZ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return composePbAndJsonLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                inputStreamReader.close();
                throw th;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw th;
            }
        }
    }

    public C1515490pXX(ParameterizedType parameterizedType, Gson gson, InterfaceC1515510pXZ interfaceC1515510pXZ) {
        this.LIZ = gson;
        this.LIZLLL = interfaceC1515510pXZ;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.LIZIZ = new C1515470pXV(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.LIZJ = actualTypeArguments[1];
    }
}
