package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.ss.android.ugc.aweme.absetting.EffectPanelImageLoadOptConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS88S1300000_25;

/* JADX INFO: renamed from: X.0siE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637440siE {
    public static final void LJ(C1662850tND c1662850tND, boolean z, boolean z2) {
        boolean z3;
        c1662850tND.setCustomSelected(z);
        TextView textView = c1662850tND.getTextView();
        if (textView instanceof C1636840shG) {
            ((C1636840shG) textView).setMarqueeEnable(z);
            return;
        }
        if (!(textView instanceof AnonymousClass1280)) {
            return;
        }
        AnonymousClass1280 anonymousClass1280 = (AnonymousClass1280) textView;
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        anonymousClass1280.setMarqueeEnable$lib_runtime_release(z3);
    }

    public static final void LIZIZ(C1662850tND c1662850tND, String str, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        int width;
        int height;
        Bitmap.Config config;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prop_panel");
            sbLIZ.append("@@");
            sbLIZ.append("creation");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1637450siF.LIZ.getClass();
            boolean z = ((EffectPanelImageLoadOptConfig) C1637450siF.LIZJ.getValue()).enable;
            C1324800kZy imageView = c1662850tND.getImageView();
            if (z) {
                width = c1662850tND.getImageView().getWidth();
                height = c1662850tND.getImageView().getHeight();
                config = Bitmap.Config.RGB_565;
            } else {
                width = -1;
                height = -1;
                config = null;
            }
            C1324750kZt.LJIIJJI(imageView, str, width, height, config, interfaceC1325670kbN, c1320700kTM, strLIZIZ);
        }
    }

    public static final void LIZJ(C1662850tND c1662850tND, List<String> list, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        int width;
        int height;
        Bitmap.Config config;
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prop_panel");
            sbLIZ.append("@@");
            sbLIZ.append("creation");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1637450siF.LIZ.getClass();
            boolean z = ((EffectPanelImageLoadOptConfig) C1637450siF.LIZJ.getValue()).enable;
            C1324800kZy imageView = c1662850tND.getImageView();
            if (z) {
                width = c1662850tND.getImageView().getWidth();
                height = c1662850tND.getImageView().getHeight();
                config = Bitmap.Config.RGB_565;
            } else {
                width = -1;
                height = -1;
                config = null;
            }
            C1324750kZt.LJIILJJIL(imageView, list, width, height, config, interfaceC1325670kbN, c1320700kTM, strLIZIZ);
        }
    }

    public static final void LIZ(C1662850tND c1662850tND, Effect effect, String str, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        C1638230sjV c1638230sjV = C1638230sjV.LIZ;
        if (C1326470kcf.LIZJ()) {
            if (str != null && str.length() != 0) {
                c1638230sjV.LJFF(effect, c1662850tND.getImageView(), -1, -1, Bitmap.Config.ARGB_8888, interfaceC1325670kbN, c1320700kTM, new AwS88S1300000_25(c1662850tND, (C1662850tND) str, (String) interfaceC1325670kbN, (InterfaceC1325670kbN) c1320700kTM, (C1320700kTM<InterfaceC1330440kj4>) 5));
                return;
            }
            return;
        }
        LIZIZ(c1662850tND, str, interfaceC1325670kbN, c1320700kTM);
    }

    public static final void LIZLLL(C1662850tND c1662850tND, Effect effect, List<String> list, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        C1638230sjV c1638230sjV = C1638230sjV.LIZ;
        if (C1326470kcf.LIZJ()) {
            if (list != null && !list.isEmpty()) {
                c1638230sjV.LJFF(effect, c1662850tND.getImageView(), -1, -1, Bitmap.Config.ARGB_8888, interfaceC1325670kbN, c1320700kTM, new AwS153S0400000_25(c1662850tND, (C1662850tND) list, (List<String>) interfaceC1325670kbN, (InterfaceC1325670kbN) c1320700kTM, (C1320700kTM<InterfaceC1330440kj4>) 10));
                return;
            }
            return;
        }
        LIZJ(c1662850tND, list, interfaceC1325670kbN, c1320700kTM);
    }
}
