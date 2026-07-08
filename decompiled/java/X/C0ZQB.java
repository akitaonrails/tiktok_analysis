package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ZQB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQB {
    public static final C0ZLF LIZIZ(C869590Y9l c869590Y9l) {
        BaseResponseComponent baseResponseComponentNc;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseResponseComponentNc = baseTemplateLIZ.Nc()) != null) {
            if (C2241581CoO.LIZ(baseResponseComponentNc, C0ZQC.REACTION)) {
                return new C0ZL7(true);
            }
            return C0ZLL.LIZ;
        }
        return null;
    }

    public static final List<C1562980qm8<C0ZL0>> LIZ(C869590Y9l c869590Y9l, C0ZQI c0zqi) {
        BaseResponseComponent baseResponseComponentNc;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseResponseComponentNc = baseTemplateLIZ.Nc()) != null) {
            ArrayList arrayList = new ArrayList();
            if (C2241581CoO.LIZ(baseResponseComponentNc, C0ZQC.REPLY)) {
                arrayList.add(c0zqi.LJIIL(c869590Y9l));
            }
            if (C2241581CoO.LIZ(baseResponseComponentNc, C0ZQC.FORWARD)) {
                arrayList.add(c0zqi.LIZ(c869590Y9l));
            }
            if (C2241581CoO.LIZ(baseResponseComponentNc, C0ZQC.DELETE)) {
                arrayList.addAll(c0zqi.LJIIIIZZ(c869590Y9l));
            }
            if (C2241581CoO.LIZ(baseResponseComponentNc, C0ZQC.REPORT) && c0zqi.LJFF(c869590Y9l)) {
                arrayList.add(c0zqi.LJIIIZ(c869590Y9l));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
