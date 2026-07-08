package X;

import com.ss.android.ugc.aweme.im.common.experiment.ImageMessageSamplingConfig;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Zao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902480Zao {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C902470Zan> LIZJ;
    public final boolean LIZLLL;

    public static void LIZ(C902480Zao c902480Zao) {
        float fFloatValue;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        if (!c902480Zao.LIZJ.isEmpty()) {
            IMHitSampleDetector.LIZ.getClass();
            IMHitSampleDetector value = C1493705t1.LIZIZ.getValue();
            if (value != null) {
                String str = c902480Zao.LIZIZ;
                Map<String, Float> map = ((ImageMessageSamplingConfig) C902510Zar.LIZIZ.getValue()).sceneToSamplingRate;
                Iterator<T> it2 = map.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    if (u.LJJIIJZLJL(str, str2, false)) {
                        Float f = map.get(str2);
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        }
                    }
                }
                fFloatValue = 0.1f;
                if (!value.isHitSample("im_image_message_load", fFloatValue)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C902460Zam(c902480Zao, interfaceC1493505szLIZIZ, null), 3);
                }
            }
        }
    }

    public C902480Zao(String str, String str2, List<C902470Zan> list, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = z;
    }

    public static C902480Zao LIZIZ(C902480Zao c902480Zao, List list, boolean z, int i) {
        String str;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c902480Zao.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c902480Zao.LIZIZ;
        }
        if ((i & 4) != 0) {
            list = c902480Zao.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c902480Zao.LIZLLL;
        }
        return new C902480Zao(str, str2, list, z);
    }
}
