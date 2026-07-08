package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.engage.service.ClusterMetadata;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Vsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811820Vsy {
    public final C811810Vsx LIZ;

    public C811820Vsy(Context context) {
        C811810Vsx c811810Vsx = C811810Vsx.LJIIIIZZ;
        if (c811810Vsx == null || c811810Vsx.LJ == null || !C2460009kU.LIZ(context)) {
            synchronized (C811810Vsx.class) {
                try {
                    C811810Vsx c811810Vsx2 = C811810Vsx.LJIIIIZZ;
                    if (c811810Vsx2 == null || c811810Vsx2.LJ == null || !C2460009kU.LIZ(context)) {
                        C811810Vsx.LJIIIIZZ = new C811810Vsx(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZ = C811810Vsx.LJIIIIZZ;
    }

    public final AbstractC835450Wpz<Void> LIZ(C809940Vpw c809940Vpw) {
        AbstractC19852312lt abstractC19852312ltOf;
        final C811810Vsx c811810Vsx = this.LIZ;
        c811810Vsx.getClass();
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("engage_sdk_version", c811810Vsx.LIZLLL, bundle);
        C786410Ut5.LJJJI("calling_package_name", c811810Vsx.LIZJ, bundle);
        if (c809940Vpw.LIZ.isEmpty()) {
            abstractC19852312ltOf = AbstractC19852312lt.absent();
        } else {
            C811870Vt3 c811870Vt3 = new C811870Vt3();
            AbstractC19875512pd abstractC19875512pd = c809940Vpw.LIZ;
            int size = abstractC19875512pd.size();
            for (int i = 0; i < size; i++) {
                c811870Vt3.LIZ.LIZLLL(Integer.valueOf(((Integer) ListProtector.get(abstractC19875512pd, i)).intValue()));
            }
            abstractC19852312ltOf = AbstractC19852312lt.of(new ClusterMetadata(c811870Vt3));
        }
        if (abstractC19852312ltOf.isPresent()) {
            C786410Ut5.LJJIJL(bundle, "cluster_metadata", (Parcelable) abstractC19852312ltOf.get());
            ClusterMetadata clusterMetadata = (ClusterMetadata) abstractC19852312ltOf.get();
            clusterMetadata.getClass();
            Bundle bundle2 = new Bundle();
            if (!clusterMetadata.zza.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(clusterMetadata.zza);
                C786410Ut5.LJJIJIL(bundle2, "A", arrayList);
            }
            C786410Ut5.LJJIIZI(bundle, bundle2, "cluster_metadata_v2");
        }
        return c811810Vsx.LIZIZ(new InterfaceC811950VtB() { // from class: X.0Vt6
            @Override // X.InterfaceC811950VtB
            public final void LIZ(InterfaceC811930Vt9 interfaceC811930Vt9, C835520Wq6 c835520Wq6) {
                interfaceC811930Vt9.g(bundle, new BinderC812170VtX(c811810Vsx, c835520Wq6));
            }
        }).LJIILLIIL(EnumC2272608vM.LL, new InterfaceC835700WqO() { // from class: X.0Vt2
            @Override // X.InterfaceC835700WqO
            public final C835510Wq5 then(Object obj) {
                return C835460Wq0.LJ(null);
            }
        });
    }
}
