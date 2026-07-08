package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20604915jz implements InterfaceC20605515k5 {
    public final /* synthetic */ PowerAdapter LIZ;

    public C20604915jz(PowerAdapter powerAdapter) {
        this.LIZ = powerAdapter;
    }

    @Override // X.InterfaceC20605515k5
    public final void LIZ(List<? extends InterfaceC1891350zJl> list) {
        ((ConcurrentHashMap) this.LIZ.LLJJJJJIL).clear();
        int i = 0;
        for (PowerStub powerStub : (ArrayList) this.LIZ.LLLLLJIL()) {
            int size = ((ArrayList) powerStub.LLJJIJI).size();
            int i2 = size + i;
            ((ConcurrentHashMap) this.LIZ.LLJJJJJIL).put(new C20605615k6(i, i2), powerStub);
            i = i2;
        }
        this.LIZ.notifyDataSetChanged();
    }
}
