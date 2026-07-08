package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689240u3m extends AbstractC1689260u3o {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final List<AbstractC1689250u3n> LL;

    public C1689240u3m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1689240u3m) && Intrinsics.LJFF(this.LL, ((C1689240u3m) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(settingItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AbstractC1689250u3n> LIZ() {
        List<AbstractC1689250u3n> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1689250u3n abstractC1689250u3n : list) {
            if (abstractC1689250u3n.LIZLLL()) {
                arrayList.add(abstractC1689250u3n);
            }
        }
        return arrayList;
    }

    public final List<AbstractC1689250u3n> LIZIZ() {
        List<AbstractC1689250u3n> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1689250u3n abstractC1689250u3n : list) {
            if (!abstractC1689250u3n.LIZLLL()) {
                arrayList.add(abstractC1689250u3n);
            }
        }
        return arrayList;
    }

    public C1689240u3m(int i) {
        this(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1689240u3m(List<? extends AbstractC1689250u3n> list) {
        this.LL = list;
    }
}
