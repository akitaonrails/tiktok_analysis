package X;

import Y.ARunnableS72S0200000_3;
import android.content.res.AssetManager;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.08Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124908Ud {
    public final AssetManager LIZ;
    public final Executor LIZIZ;
    public final InterfaceC2125108Uf LIZJ;
    public final byte[] LIZLLL;
    public final File LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public boolean LJIIIIZZ;
    public C2125508Uj[] LJIIIZ;
    public byte[] LJIIJ;

    public final InputStream LIZ(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.LIZJ.LIZ();
                return null;
            }
            return null;
        }
    }

    public final void LIZIZ(int i, Object obj) {
        this.LIZIZ.execute(new ARunnableS72S0200000_3(this, i, obj, 51));
    }

    public C2124908Ud(AssetManager assetManager, Executor executor, InterfaceC2125108Uf interfaceC2125108Uf, String str, String str2, String str3, C0VSJ c0vsj) {
        byte[] bArr;
        this.LIZ = assetManager;
        this.LIZIZ = executor;
        this.LIZJ = interfaceC2125108Uf;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJ = c0vsj;
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            bArr = null;
        } else if (i >= 31) {
            bArr = C2125008Ue.LIZ;
        } else {
            switch (i) {
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                    bArr = C2125008Ue.LJ;
                    break;
                case 26:
                    bArr = C2125008Ue.LIZLLL;
                    break;
                case 27:
                    bArr = C2125008Ue.LIZJ;
                    break;
                default:
                    bArr = C2125008Ue.LIZIZ;
                    break;
            }
        }
        this.LIZLLL = bArr;
    }
}
