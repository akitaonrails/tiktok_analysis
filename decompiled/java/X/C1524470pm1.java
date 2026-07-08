package X;

import Y.AObjectS73S0000000_23;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.amg.minigameruntime.common.network.http.download.DownloadResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524470pm1 implements InterfaceC1524580pmC {
    public static final AtomicInteger LIZLLL = new AtomicInteger(1);
    public final C1304160k2g LIZ;
    public final ConcurrentHashMap<Integer, C1524370plr> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ;

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        Iterator<Map.Entry<Integer, C1524370plr>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ();
        }
        this.LIZIZ.clear();
    }

    public C1524470pm1(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
        C2353409Ka c2353409Ka = c1304160k2g.LJIIIZ;
        C1524510pm5.LIZ = c2353409Ka.LIZIZ.path;
        C1524510pm5.LIZIZ = c2353409Ka.LIZJ.path;
        this.LIZJ = C452501pT.LIZIZ(new AObjectS73S0000000_23(0));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0pm2] */
    @Override // X.InterfaceC1524580pmC
    public final int LJJIZ(final C1524500pm4 c1524500pm4) {
        String str = c1524500pm4.LIZIZ;
        C1502140pC0 c1502140pC0 = c1524500pm4.LIZJ;
        long j = c1524500pm4.LIZLLL;
        if (j <= 0) {
            j = 60000;
        }
        C0VSJ c0vsj = new C0VSJ((String) this.LIZJ.getValue());
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIncrementAndGet = LIZLLL.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(iIncrementAndGet);
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, sb.toString());
        if (c0vsj2.exists()) {
            C816280W0k.LIZIZ(c0vsj2);
        }
        C1524460pm0 c1524460pm0 = new C1524460pm0();
        c1524460pm0.LIZLLL = c1524500pm4.LIZ;
        c1524460pm0.LIZ = str;
        C1502130pBz c1502130pBz = new C1502130pBz(c1502140pC0);
        c1524460pm0.LIZIZ = j;
        int i = c1524460pm0.LIZLLL;
        final C1524440ply c1524440ply = new C1524440ply(i, c1524460pm0.LIZ, c0vsj2, c1502130pBz.LIZIZ(), c1524460pm0.LIZIZ, c1524460pm0.LIZJ);
        C1524370plr c1524370plr = new C1524370plr(i, this.LIZ.LIZ(), c1524440ply, new InterfaceC1524450plz() { // from class: X.0pm2
            @Override // X.InterfaceC1524450plz
            public final void onStart() {
            }

            @Override // X.InterfaceC1524450plz
            public final void onCancel(int i2) {
                c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 603105, null, "abort download task", 603105));
            }

            @Override // X.InterfaceC1524450plz
            public final void LIZ(int i2, long j2, long j3) {
                c1524500pm4.LJFF.invoke(new C1524570pmB((j2 * 100) / j3, i2, j2, j3));
            }

            @Override // X.InterfaceC1524450plz
            public final void LIZIZ(int i2, C1524440ply c1524440ply2, DownloadResponse downloadResponse) {
                int i3;
                boolean z;
                String string;
                if (downloadResponse.getCode() == -202) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 603301, null, "exceed max file size", 21));
                    return;
                }
                if (downloadResponse.getCode() == -104) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 21103, null, "request time out", 20));
                    return;
                }
                if (downloadResponse.getCode() == -101) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 21105, null, "network not available", 85));
                    return;
                }
                if (downloadResponse.getCode() == -107) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 21105, null, "network changed", 23));
                    return;
                }
                if (downloadResponse.getCode() == -108) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 603105, null, "abort download task", 603105));
                }
                if (downloadResponse.getCode() == -111) {
                    c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 21105, null, "url error", 29));
                    return;
                }
                if (downloadResponse.getCode() == -105) {
                    c1524500pm4.LJ.invoke(C1524490pm3.LIZ(i2, "body is null"));
                    return;
                }
                String absolutePath = null;
                if (downloadResponse.getThrowable() != null) {
                    if (downloadResponse.getThrowable() instanceof IOException) {
                        c1524500pm4.LJ.invoke(C1524490pm3.LIZ(i2, downloadResponse.getMessage()));
                        return;
                    }
                    Function1<C1524560pmA, Unit> function1 = c1524500pm4.LJ;
                    Throwable throwable = downloadResponse.getThrowable();
                    if (throwable != null) {
                        absolutePath = throwable.getMessage();
                    }
                    function1.invoke(new C1524560pmA(false, i2, 10402, null, absolutePath, 92));
                    return;
                }
                File targetFile = downloadResponse.getTargetFile();
                if (targetFile != null) {
                    if (targetFile.length() > 209715200) {
                        c1524500pm4.LJ.invoke(new C1524560pmA(false, i2, 21102, null, "user dir saved file size limit exceeded", 30));
                        C816280W0k.LIZIZ(targetFile);
                        return;
                    }
                    C1524470pm1 c1524470pm1 = this;
                    c1524470pm1.getClass();
                    String path = UriProtector.parse(c1524440ply2.LIZ).getPath();
                    if (path != null && a0.LJJJJI(path, e3.d, 0, 6) > 0) {
                        absolutePath = path.substring(a0.LJJJJI(path, e3.d, 0, 6) + 1);
                    }
                    if (TextUtils.isEmpty(absolutePath) || !downloadResponse.isSuccessful()) {
                        for (Object obj : new Regex(";").split(C13LP.LJJLIIIJ(downloadResponse.getHeaders().LIZ("Content-Type"), ",", null, null, 0, null, null, 62), 0).toArray(new String[0])) {
                            String str2 = (String) obj;
                            if (str2.length() > 0) {
                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                int length = str2.length() - 1;
                                int i4 = 0;
                                boolean z2 = false;
                                while (i4 <= length) {
                                    if (!z2) {
                                        i3 = i4;
                                    } else {
                                        i3 = length;
                                    }
                                    if (Intrinsics.LJI(str2.charAt(i3), 32) <= 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!z2) {
                                        if (!z) {
                                            z2 = true;
                                        } else {
                                            i4++;
                                        }
                                    } else if (!z) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                }
                                String extensionFromMimeType = singleton.getExtensionFromMimeType(str2.subSequence(i4, length + 1).toString());
                                if (extensionFromMimeType != null && extensionFromMimeType.length() > 0) {
                                    absolutePath = extensionFromMimeType;
                                }
                            }
                        }
                    }
                    if (absolutePath != null && absolutePath.length() != 0) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        int iIncrementAndGet2 = C1524470pm1.LIZLLL.incrementAndGet();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis2);
                        sb2.append(iIncrementAndGet2);
                        string = C786410Ut5.j4("%s.%s", Arrays.copyOf(new Object[]{sb2.toString(), absolutePath}, 2));
                    } else {
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        int iIncrementAndGet3 = C1524470pm1.LIZLLL.incrementAndGet();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jCurrentTimeMillis3);
                        sb3.append(iIncrementAndGet3);
                        string = sb3.toString();
                    }
                    C0VSJ c0vsj3 = new C0VSJ((String) c1524470pm1.LIZJ.getValue(), string);
                    if (c0vsj3.exists()) {
                        C816280W0k.LIZIZ(c0vsj3);
                    }
                    targetFile.renameTo(c0vsj3);
                    absolutePath = c0vsj3.getAbsolutePath();
                }
                c1524500pm4.LJ.invoke(new C1524560pmA(true, i2, Integer.valueOf(downloadResponse.getCode()), absolutePath, null, null));
            }
        });
        this.LIZIZ.put(Integer.valueOf(i), c1524370plr);
        try {
            c1524370plr.LIZJ();
            this.LIZIZ.remove(Integer.valueOf(i));
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.remove(Integer.valueOf(i));
            throw th;
        }
    }

    @Override // X.InterfaceC1524580pmC
    public final void cancel(int i) {
        C1524370plr c1524370plr = this.LIZIZ.get(Integer.valueOf(i));
        if (c1524370plr != null) {
            c1524370plr.LIZ();
        }
    }
}
