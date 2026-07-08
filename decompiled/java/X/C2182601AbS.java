package X;

import android.content.res.AssetManager;
import android.os.Looper;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutDslContentCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixDslLoadThreadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixGeckoUpdateLogicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.TrionesLayoutKeyLocalSwitch;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182601AbS implements InterfaceC2182621AbU {
    public static final C01GW<C1DFT> LLILLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C2182641AbW());
    public final String LL = C0IPN.LIZ("tiktok_live_link_mic_layout_key", "tiktok_live_link_mic_layout_key");
    public WeakReference<C972840bQI> LLILLJJLI;

    @Override // X.InterfaceC2182621AbU
    public final String LIZ(String str) {
        return "";
    }

    public final void LJFF() {
        String str = this.LL;
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        long jPr2 = iHostResource != null ? iHostResource.Pr2(str) : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryUpdateGeckoRes, gecko channel: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", version: ");
        sbLIZ.append(jPr2);
        C20441214yg.LIZIZ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (LinkMicFixGeckoUpdateLogicSetting.getValue() || jPr2 == 0) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).nd1(new AbstractC1552040qUU() { // from class: X.1AaL
                @Override // X.AbstractC1552040qUU
                public final void LJIJ(UpdatePackage updatePackage, Throwable th) throws JSONException {
                    String message;
                    C972840bQI c972840bQI;
                    LinkMicLayoutQosMonitor linkMicLayoutQosMonitor;
                    JSONObject jSONObject = new JSONObject();
                    if (updatePackage != null) {
                        updatePackage.putStatisticModelToJson(jSONObject);
                    }
                    String message2 = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    jSONObject.put("throwable", message);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUpdateFailed, reason:");
                    sbLIZ2.append(jSONObject);
                    sbLIZ2.append(", ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ2));
                    C2182601AbS c2182601AbS = this.LIZ;
                    EnumC2231791CWr enumC2231791CWr = EnumC2231791CWr.ExtraGeckoResUpdatedFailure;
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    WeakReference<C972840bQI> weakReference = c2182601AbS.LLILLJJLI;
                    if (weakReference != null && (c972840bQI = weakReference.get()) != null && (linkMicLayoutQosMonitor = c972840bQI.LLILLL) != null) {
                        linkMicLayoutQosMonitor.LJFF(enumC2231791CWr, strJ3);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIL(long j, UpdatePackage updatePackage) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUpdateSuccess, version: ");
                    sbLIZ2.append(j);
                    C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }, this.LL);
        }
    }

    public C2182601AbS() {
        LJFF();
    }

    public static Object LIZLLL(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                AssetManager assets = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getAssets();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tiktok_live_link_mic_local/");
                sbLIZ.append(str);
                sbLIZ.append(".json");
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(assets.open(C2188811AlT.LIZIZ(sbLIZ))));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            bufferedReader2.close();
                            String string = sb.toString();
                            C189200o6.m2constructorimpl(string);
                            return string;
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("IOException while reading ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(e.getMessage());
                        C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ2));
                        C098200Yq c098200Yq = new C098200Yq(e);
                        C189200o6.m2constructorimpl(c098200Yq);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return c098200Yq;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Throwable while reading ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(',');
                        sbLIZ3.append(th.getMessage());
                        C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ3));
                        C098200Yq c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return c098200Yq2;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (0 != 0) {
                    bufferedReader.close();
                }
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object LJ(String str) throws IOException {
        C098200Yq c098200Yq;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".json");
        File fileLJII = C1143780fs0.LJII(str2, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        if (fileLJII != null && fileLJII.exists()) {
            z = true;
        }
        if (z) {
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(fileLJII));
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                bufferedReader.close();
                                String string = sb.toString();
                                C189200o6.m2constructorimpl(string);
                                return string;
                            }
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJFF("LinkMicLayoutStaticDataChannelProvider", "IOException while reading from stream", e);
                            c098200Yq = new C098200Yq(e);
                            C189200o6.m2constructorimpl(c098200Yq);
                            bufferedReader.close();
                            return c098200Yq;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Throwable while reading from stream, ");
                        sbLIZ2.append(th.getMessage());
                        C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ2));
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        bufferedReader.close();
                        return c098200Yq;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    bufferedReader.close();
                    throw th2;
                }
            }
        } else {
            C20441214yg.LJ("LinkMicLayoutStaticDataChannelProvider", "gecko file not exists");
            C098200Yq c098200Yq2 = new C098200Yq(new FileNotFoundException("gecko file not exists"));
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
    }

    @Override // X.InterfaceC2182621AbU
    public final void LIZJ(String str, LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback) {
        C1DFT value;
        C1DFT value2;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDslContent, mainThread: ");
            sbLIZ.append(Looper.getMainLooper().isCurrentThread());
            sbLIZ.append(", layoutKey: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ));
            if (TrionesLayoutKeyLocalSwitch.INSTANCE.enable()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    if (LinkMicFixDslLoadThreadSetting.getValue()) {
                        value2 = LLILLL.getValue();
                    } else {
                        value2 = C0PEM.LIZJ;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZIZ(), value2, null, new C1703200uQI(this, str, linkMicLayoutDslContentCallback, null), 2);
                    return;
                }
                LIZIZ(LIZLLL(str), EnumC2188971Alj.Local, linkMicLayoutDslContentCallback);
                return;
            }
            if (Looper.getMainLooper().isCurrentThread()) {
                if (LinkMicFixDslLoadThreadSetting.getValue()) {
                    value = LLILLL.getValue();
                } else {
                    value = C0PEM.LIZJ;
                }
                C23250099c.LIZLLL(C2296808zG.LIZIZ(), value, null, new C1703230uQL(str, value, this, linkMicLayoutDslContentCallback, null), 2);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getDslContent, start read from remote, layoutKey: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", Thread:");
            sbLIZ2.append(C786410Ut5.u3());
            C20441214yg.LJIIIZ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC2188971Alj enumC2188971Alj = EnumC2188971Alj.Gecko;
            Object objLJ = LJ(str);
            if (C189200o6.m7isFailureimpl(objLJ)) {
                if (LinkMicLayoutLayerQosMonitor.INSTANCE.isEnable()) {
                    LJFF();
                }
                objLJ = LIZLLL(str);
                enumC2188971Alj = EnumC2188971Alj.Local;
            }
            LIZIZ(objLJ, enumC2188971Alj, linkMicLayoutDslContentCallback);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LinkMicLayoutStaticDataChannelProvider", "getDslContent exception", th);
        }
    }

    public static void LIZIZ(Object obj, EnumC2188971Alj enumC2188971Alj, LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback) throws Exception {
        String message;
        String message2;
        String message3;
        String message4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchResult, dispatch result, result: ");
        sbLIZ.append(C189200o6.m8isSuccessimpl(obj));
        sbLIZ.append(", dslSource: ");
        sbLIZ.append(enumC2188971Alj);
        sbLIZ.append(", error: ");
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Throwable th = null;
        if (thM5exceptionOrNullimpl != null) {
            message = thM5exceptionOrNullimpl.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("LinkMicLayoutStaticDataChannelProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (C189200o6.m8isSuccessimpl(obj)) {
            try {
                if (C189200o6.m7isFailureimpl(obj)) {
                    obj = "";
                }
                linkMicLayoutDslContentCallback.LIZLLL((String) obj, enumC2188971Alj);
                C1306420k6K.LIZ(linkMicLayoutDslContentCallback, null);
            } finally {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C1306420k6K.LIZ(linkMicLayoutDslContentCallback, th);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else if (C189200o6.m7isFailureimpl(obj)) {
            if (C189200o6.m5exceptionOrNullimpl(obj) instanceof FileNotFoundException) {
                try {
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(obj);
                    if (thM5exceptionOrNullimpl2 != null) {
                        message2 = thM5exceptionOrNullimpl2.getMessage();
                    } else {
                        message2 = null;
                    }
                    linkMicLayoutDslContentCallback.LIZIZ(message2);
                    C1306420k6K.LIZ(linkMicLayoutDslContentCallback, null);
                } finally {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1306420k6K.LIZ(linkMicLayoutDslContentCallback, th);
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            } else if (C189200o6.m5exceptionOrNullimpl(obj) instanceof IOException) {
                try {
                    Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(obj);
                    if (thM5exceptionOrNullimpl3 != null) {
                        message4 = thM5exceptionOrNullimpl3.getMessage();
                    } else {
                        message4 = null;
                    }
                    linkMicLayoutDslContentCallback.LJFF(message4);
                    C1306420k6K.LIZ(linkMicLayoutDslContentCallback, null);
                } finally {
                    try {
                        try {
                        } catch (Throwable th8) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th9) {
                    }
                }
            } else {
                try {
                    Throwable thM5exceptionOrNullimpl4 = C189200o6.m5exceptionOrNullimpl(obj);
                    if (thM5exceptionOrNullimpl4 != null) {
                        message3 = thM5exceptionOrNullimpl4.getMessage();
                    } else {
                        message3 = null;
                    }
                    linkMicLayoutDslContentCallback.LJFF(message3);
                    C1306420k6K.LIZ(linkMicLayoutDslContentCallback, null);
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th10) {
                        th = th10;
                        th = th;
                        while (true) {
                        }
                    }
                }
            }
        }
    }
}
