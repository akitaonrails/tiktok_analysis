package X;

import android.content.res.AssetManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAssertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0k3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl$initializeInternal$configDeferred$1", f = "TrackerImpl.kt", l = {}, m = "invokeSuspend")
public final class C1304570k3L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C1304570k3L(InterfaceC1364105Vn<? super C1304570k3L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1304570k3L(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        BufferedReader bufferedReader;
        C1C7U.LIZ("TrackerImpl@989c.initializeInternal$configDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = null;
        try {
            if (((Boolean) C1152510g65.LIZ.getValue()).booleanValue()) {
                AssetManager assets = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getAssets();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tiktok_live_link_mic_local/");
                sbLIZ.append("tracker_config.json");
                Reader inputStreamReader = new InputStreamReader(assets.open(C2188811AlT.LIZIZ(sbLIZ)), Charsets.UTF_8);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    c098200Yq = C08KC.LIZJ(bufferedReader);
                    C2107108Nh.LIZ(bufferedReader, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } else {
                File fileLJII = C1143780fs0.LJII(C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_link_mic"), "tracker_config.json");
                if (fileLJII != null && fileLJII.exists() && fileLJII.canRead()) {
                    c098200Yq = C09BH.LJI(fileLJII, Charsets.UTF_8);
                } else {
                    c098200Yq = null;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("call tracker native error: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C939210aY3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), "CallException");
            if (C1304630k3R.LIZIZ && LinkMicAssertSetting.INSTANCE.enable()) {
                throw new AssertionError(thM5exceptionOrNullimpl);
            }
            if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
                C1304660k3U.LIZ.LIZIZ(520, "call tracker error", thM5exceptionOrNullimpl, null);
            }
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("TrackerImpl@989c.initializeInternal$configDeferred$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C1304570k3L(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
