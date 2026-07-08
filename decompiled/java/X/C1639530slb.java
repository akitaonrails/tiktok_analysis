package X;

import com.ss.android.ugc.aweme.filter.repository.internal.main.FilterCategoryExtra;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0slb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639530slb implements InterfaceC1639390slN {
    public final int LIZ;

    public C1639530slb(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1639390slN
    public final boolean LIZ(FilterCategoryExtra filterCategoryExtra) {
        String str = filterCategoryExtra.abGroup;
        if (str == null) {
            return false;
        }
        return a0.LJJIIZI(str, String.valueOf(this.LIZ), false);
    }
}
