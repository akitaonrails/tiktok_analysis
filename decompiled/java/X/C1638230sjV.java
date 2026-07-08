package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638230sjV implements InterfaceC1326460kce<Effect> {
    public static final C1638230sjV LIZ = new C1638230sjV();

    @Override // X.InterfaceC1326460kce
    public final String LIZIZ(Effect effect) {
        return C1326470kcf.LIZLLL(this, effect);
    }

    @Override // X.InterfaceC1326460kce
    public final String LIZJ(Effect effect) {
        Effect effect2 = effect;
        String transResPath = effect2.getTransResPath();
        if (a0.LJJJIL(transResPath)) {
            transResPath = effect2.getUnzipPath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(transResPath);
        sbLIZ.append(File.separator);
        sbLIZ.append(LIZIZ(effect2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1326460kce
    public final Uri LJ(Effect effect) {
        String str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
        if (str != null) {
            return UriProtector.parse(str);
        }
        return null;
    }

    @Override // X.InterfaceC1326460kce
    public final void LIZ(int i, String str) {
        C2281251EQx.LIZ.LJI(i, str);
    }

    @Override // X.InterfaceC1326460kce
    public final C1339420kxY LIZLLL(C1320700kTM c1320700kTM, Function0 function0) {
        return new C1339420kxY(function0, c1320700kTM, 1);
    }

    public final void LJI(Object obj, String str) {
        if (C1326470kcf.LIZJ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1326450kcd(this, obj, str, null), 3);
        }
    }

    @Override // X.InterfaceC1326460kce
    public final boolean LJFF(Effect effect, C1322110kVd c1322110kVd, int i, int i2, Bitmap.Config config, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Function0 function0) {
        return C1326470kcf.LIZ(this, effect, c1322110kVd, i, i2, config, interfaceC1325670kbN, c1320700kTM, function0);
    }
}
