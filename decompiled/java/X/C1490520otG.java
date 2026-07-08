package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;
import java.io.File;

/* JADX INFO: renamed from: X.0otG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490520otG {
    public static C1490520otG LJ;
    public InterfaceC1490530otH LIZ;
    public InterfaceC1490530otH LIZIZ;
    public Context LIZJ;
    public boolean LIZLLL;

    public static C1490520otG LJFF() {
        if (LJ == null) {
            synchronized (C1490520otG.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1490520otG();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final String LIZ() {
        if (this.LIZ == null) {
            LJI();
        }
        InterfaceC1490530otH interfaceC1490530otH = this.LIZ;
        if (interfaceC1490530otH == null) {
            return "";
        }
        String path = interfaceC1490530otH.getPath();
        if (TextUtils.isEmpty(path)) {
            return "";
        }
        if (path.endsWith("/")) {
            return path;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI() {
        if (this.LIZLLL) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LIZLLL) {
                    IProviderConfigOut iProviderConfigOut = (IProviderConfigOut) PluggableExtentionKt.pluggableSpi(IProviderConfigOut.class);
                    if (iProviderConfigOut != null) {
                        this.LIZJ = iProviderConfigOut.getContext();
                        iProviderConfigOut.LIZIZ();
                        this.LIZ = new InterfaceC1490530otH() { // from class: X.09fT
                            @Override // X.InterfaceC1490530otH
                            public final String getPath() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().musicDir());
                                sbLIZ.append("download/");
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }
                        };
                        iProviderConfigOut.LIZ();
                        this.LIZIZ = new InterfaceC1490530otH() { // from class: X.09fU
                            @Override // X.InterfaceC1490530otH
                            public final String getPath() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().musicDir());
                                sbLIZ.append("cache/");
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }
                        };
                    }
                    this.LIZLLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String LIZIZ(String str) {
        String strLIZ = LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(C1487190ont.LIZJ(str));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZLLL(String str) {
        String strLIZ = LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(C1487190ont.LIZJ(str));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ(String str, String str2) {
        if (C297100Bki.LIZ() && str2 != null && !str2.isEmpty()) {
            String strLIZ = LIZ();
            if (TextUtils.isEmpty(strLIZ)) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str2);
            sbLIZ.append(".mp3");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return LIZIZ(str);
    }

    public final String LJ(String str, String str2) {
        if (C297100Bki.LIZ() && str2 != null && !str2.isEmpty()) {
            String strLIZ = LIZ();
            if (TextUtils.isEmpty(strLIZ)) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str2);
            sbLIZ.append(".mp3");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return LIZLLL(str);
    }
}
