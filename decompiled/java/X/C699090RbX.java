package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699090RbX<T extends ComponentPriorityProtocol> implements Comparable<C699090RbX<T>> {
    public final T LL;
    public final GlobalComponentData LLILLJJLI;
    public int LLILLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Boolean LLJ;
    public boolean LLJIJIL;
    public Boolean LLJILJIL;
    public Boolean LLJILJILJ;
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public final AtomicBoolean LLJI = new AtomicBoolean(false);
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C699680RcU());

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityProtocolData(priorityProtocol=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priorityData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", priorityIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (this.LLILLL >= ((C699090RbX) obj).LLILLL) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        C699090RbX c699090RbX;
        T t = this.LL;
        T t2 = null;
        if ((obj instanceof C699090RbX) && (c699090RbX = (C699090RbX) obj) != null) {
            t2 = c699090RbX.LL;
        }
        return Intrinsics.LJFF(t, t2);
    }

    public C699090RbX(T t, GlobalComponentData globalComponentData, int i) {
        this.LL = t;
        this.LLILLJJLI = globalComponentData;
        this.LLILLL = i;
    }
}
