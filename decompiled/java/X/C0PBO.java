package X;

import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;

/* JADX INFO: renamed from: X.0PBO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBO implements InterfaceC655050Pmh, InterfaceC594520NTm {
    public final QueryCorrectComponentInfo LL;
    public final int LLILLJJLI = C321460Ciu.LIZ();

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchQueryCorrectData(queryCorrectInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        QueryCorrectComponentInfo queryCorrectComponentInfo = this.LL;
        return ((queryCorrectComponentInfo != null ? queryCorrectComponentInfo.hashCode() : 0) * 31) + this.LLILLJJLI;
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LLILLJJLI;
    }

    public C0PBO(QueryCorrectComponentInfo queryCorrectComponentInfo) {
        this.LL = queryCorrectComponentInfo;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0PBO) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0PBO;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C0PBO;
    }
}
