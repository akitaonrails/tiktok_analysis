package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0W15, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W15 implements Iterable<Intent> {
    public final ArrayList<Intent> LL = new ArrayList<>();
    public final Context LLILLJJLI;

    public final void LJFF() {
        if (this.LL.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.LL.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        C838410Wul.LJII(this.LLILLJJLI, intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.LL.iterator();
    }

    public C0W15(Context context) {
        this.LLILLJJLI = context;
    }

    public final void LIZJ(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null || (component = intent.resolveActivity(this.LLILLJJLI.getPackageManager())) != null) {
            LJ(component);
        }
        this.LL.add(intent);
    }

    public final void LJ(ComponentName componentName) {
        int size = this.LL.size();
        try {
            Intent intentLIZIZ = C815500Vyu.LIZIZ(componentName, this.LLILLJJLI);
            while (intentLIZIZ != null) {
                ListProtector.add(this.LL, size, intentLIZIZ);
                intentLIZIZ = C815500Vyu.LIZIZ(intentLIZIZ.getComponent(), this.LLILLJJLI);
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
