package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0f4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1113150f4b extends AbstractC1113070f4T {
    public long LJJLL;
    public long LJJZ;
    public long LJJZZI;

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public void LJIIJJI(View view, boolean z) {
        super.LJIIJJI(view, z);
        this.LJJLL = System.currentTimeMillis();
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJJIJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (j == 0) {
            this.LJJZ = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        super.LJJIL(j, interfaceC1112060f2q);
        if (j == 0) {
            this.LJJZZI = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJJIJIIJI(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i<AbstractC1136060ffY> abstractC1111980f2i, long j, boolean z, User user) {
        if (j == 0) {
            this.LJJZ = System.currentTimeMillis();
        }
    }
}
