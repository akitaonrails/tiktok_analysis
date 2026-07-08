package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.13qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20134313qH {
    public final Context LIZ;
    public final Intent LIZIZ;
    public final C20131913pt LIZJ;
    public final List<C20134713qL> LIZLLL;

    public final C0W15 LIZ() {
        if (this.LIZJ == null) {
            "You must call setGraph() before constructing the deep link".toString();
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (!(!((ArrayList) this.LIZLLL).isEmpty())) {
            "You must call setDestination() or addDestination() before constructing the deep link".toString();
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        C20131713pr c20131713pr = null;
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                this.LIZIZ.putExtra("android-support-nav:controller:deepLinkIds", C13LP.LLII(arrayList));
                this.LIZIZ.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                C0W15 c0w15 = new C0W15(this.LIZ);
                c0w15.LIZJ(new Intent(this.LIZIZ));
                int size = c0w15.LL.size();
                while (i < size) {
                    Intent intent = (Intent) ListProtector.get(c0w15.LL, i);
                    if (intent != null) {
                        intent.putExtra("android-support-nav:controller:deepLinkIntent", this.LIZIZ);
                    }
                    i++;
                }
                return c0w15;
            }
            C20134713qL c20134713qL = (C20134713qL) it2.next();
            int i2 = c20134713qL.LIZ;
            Bundle bundle = c20134713qL.LIZIZ;
            C20131713pr c20131713prLIZIZ = LIZIZ(i2);
            if (c20131713prLIZIZ == null) {
                String strLIZIZ = C1308920kAM.LIZIZ(i2, this.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Navigation destination ");
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(" cannot be found in the navigation graph ");
                sbLIZ.append(this.LIZJ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int[] iArrLJFF = c20131713prLIZIZ.LJFF(c20131713pr);
            int length = iArrLJFF.length;
            while (i < length) {
                arrayList.add(Integer.valueOf(iArrLJFF[i]));
                arrayList2.add(bundle);
                i++;
            }
            c20131713pr = c20131713prLIZIZ;
        }
    }

    public final void LIZJ() {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            int i = ((C20134713qL) it2.next()).LIZ;
            if (LIZIZ(i) == null) {
                String strLIZIZ = C1308920kAM.LIZIZ(i, this.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Navigation destination ");
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(" cannot be found in the navigation graph ");
                sbLIZ.append(this.LIZJ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public C20134313qH(C1845220y7M c1845220y7M) {
        Intent launchIntentForPackage;
        Context context = c1845220y7M.LIZ;
        this.LIZ = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.LIZIZ = launchIntentForPackage;
        this.LIZLLL = new ArrayList();
        this.LIZJ = c1845220y7M.LJII();
    }

    public final C20131713pr LIZIZ(int i) {
        C13E8 c13e8 = new C13E8();
        c13e8.addLast(this.LIZJ);
        while (!c13e8.isEmpty()) {
            C20131713pr c20131713pr = (C20131713pr) c13e8.removeFirst();
            if (c20131713pr.LLIZLLLIL == i) {
                return c20131713pr;
            }
            if (c20131713pr instanceof C20131913pt) {
                C20132013pu c20132013pu = new C20132013pu((C20131913pt) c20131713pr);
                while (c20132013pu.hasNext()) {
                    c13e8.addLast(c20132013pu.next());
                }
            }
        }
        return null;
    }
}
