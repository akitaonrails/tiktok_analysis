package X;

import X.C2204101BOe;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Settings;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204091BOd extends C09AY implements Function0<C2204111BOf> {
    public final /* synthetic */ Settings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204091BOd(Settings settings) {
        super(0);
        this.LL = settings;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [V, X.018F] */
    @Override // kotlin.jvm.functions.Function0
    public final C2204111BOf invoke() {
        C2204111BOf c2204111BOf = new C2204111BOf();
        for (String str : this.LL.urlRules) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(str);
                ?? LIZ = C018F.LIZ(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                if (LIZ != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : LIZ.LIZ) {
                        if (str2.startsWith("^")) {
                            arrayList.add(str2.substring(1));
                        } else {
                            arrayList.add(str2);
                        }
                    }
                    C2204101BOe<String, C018F>.b bVar = c2204111BOf.LIZ.LIZ;
                    for (Object obj : arrayList) {
                        C2204101BOe<String, C018F>.b bVar2 = (C2204101BOe.b) ((HashMap) bVar.LIZ).get(obj);
                        if (bVar2 == null) {
                            bVar2 = new C2204101BOe.b();
                            ((HashMap) bVar.LIZ).put(obj, bVar2);
                        }
                        bVar = bVar2;
                    }
                    bVar.LIZIZ = LIZ;
                    c2204111BOf.LIZIZ.clear();
                }
            }
        }
        return c2204111BOf;
    }
}
