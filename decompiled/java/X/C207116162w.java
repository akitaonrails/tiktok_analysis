package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.162w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207116162w extends C09AY implements Function0<C207136163q> {
    public final /* synthetic */ C163E LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207116162w(C163E c163e) {
        super(0);
        this.LL = c163e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C207136163q invoke() {
        ArrayList arrayList = new ArrayList();
        for (EnumC207101162h enumC207101162h : this.LL.LIZ) {
            if (enumC207101162h != null) {
                int i = C207104162k.LIZ[enumC207101162h.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        arrayList.add(new C207108162o());
                    } else if (i == 3) {
                        arrayList.add(new C207112162s());
                    } else if (i == 4) {
                        arrayList.add(new C207114162u());
                    } else if (i == 5) {
                        arrayList.add(new C207115162v());
                    }
                } else if (C294320BgE.LIZ()) {
                    arrayList.add(new C207111162r());
                } else {
                    arrayList.add(new C207113162t());
                }
            }
        }
        return new C207136163q(arrayList);
    }
}
