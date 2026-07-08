package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886407aA extends C09AY implements Function0<Collection<? extends String>> {
    public final /* synthetic */ Settings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886407aA(Settings settings) {
        super(0);
        this.LL = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<? extends String> invoke() {
        if (this.LL.allowedDomains.contains("*")) {
            return Collections.singleton("*");
        }
        List<String> list = this.LL.allowedDomains;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String strLIZIZ : list) {
            if (!a0.LJJLIIIJJIZ(strLIZIZ, '.')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('.');
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            arrayList.add(strLIZIZ);
        }
        return arrayList;
    }
}
