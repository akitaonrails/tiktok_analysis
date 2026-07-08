package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0n94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423440n94<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA> implements InterfaceC1423460n96<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA> {
    public final List<InterfaceC1423460n96<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1423440n94(List<? extends InterfaceC1423460n96<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA>> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC1423460n96
    public final void LIZ(ERROR_DATA error_data) {
        Iterator<InterfaceC1423460n96<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(error_data);
        }
    }

    @Override // X.InterfaceC1423460n96
    public final void LIZIZ(C1422890n8B c1422890n8B, List list) {
        Iterator<InterfaceC1423460n96<DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(c1422890n8B, list);
        }
    }
}
