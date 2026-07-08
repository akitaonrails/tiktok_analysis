package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20604615jw implements InterfaceC20605515k5 {
    public final /* synthetic */ C1891440zJu LIZ;
    public final /* synthetic */ PowerAdapter LIZIZ;

    @Override // X.InterfaceC20605515k5
    public final void LIZ(List<? extends InterfaceC1891350zJl> list) {
        if (!this.LIZ.LIZ) {
            ((ConcurrentHashMap) this.LIZIZ.LLJJJJJIL).clear();
            int i = 0;
            for (PowerStub powerStub : (ArrayList) this.LIZIZ.LLLLLJIL()) {
                int size = ((ArrayList) powerStub.LLJJIJI).size();
                int i2 = size + i;
                ((ConcurrentHashMap) this.LIZIZ.LLJJJJJIL).put(new C20605615k6(i, i2), powerStub);
                i = i2;
            }
            PowerAdapter powerAdapter = this.LIZIZ;
            powerAdapter.LLJJIJIIJIL.LJ(powerAdapter.LLJJL, powerAdapter.LLJJJJLIIL, list, this.LIZ);
        }
    }

    public C20604615jw(C1891440zJu c1891440zJu, PowerAdapter powerAdapter) {
        this.LIZ = c1891440zJu;
        this.LIZIZ = powerAdapter;
    }
}
