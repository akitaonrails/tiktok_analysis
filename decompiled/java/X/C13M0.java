package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.13M0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13M0 implements C13MA<List<? extends Effect>> {
    public final /* synthetic */ C13NY LIZ;

    public C13M0(C13NY c13ny) {
        this.LIZ = c13ny;
    }

    @Override // X.C13MA
    public final void onSuccess(List<? extends Effect> list) {
        List<? extends Effect> list2 = list;
        if (!list2.isEmpty()) {
            C13NY c13ny = this.LIZ;
            if (c13ny != null) {
                c13ny.onSuccess(ListProtector.get(list2, 0));
                return;
            }
            return;
        }
        C13NY c13ny2 = this.LIZ;
        if (c13ny2 == null) {
            return;
        }
        c13ny2.onFail(null, new C1662010tLr(1));
    }

    @Override // X.C13MA
    public final /* bridge */ /* synthetic */ void preProcess(List<? extends Effect> list) {
    }

    @Override // X.C13MA
    public final void onFail(List<? extends Effect> list, C1662010tLr c1662010tLr) {
        C13NY c13ny = this.LIZ;
        if (c13ny != null) {
            c13ny.onFail(null, c1662010tLr);
        }
    }
}
