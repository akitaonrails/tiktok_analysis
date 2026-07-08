package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1376390lvB extends AbstractC1376120luk {
    public abstract String LJJIJL();

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public boolean LJIIZILJ(Context context) {
        String strLJJIJL = LJJIJL();
        if (TextUtils.isEmpty(strLJJIJL)) {
            return true;
        }
        return C516560KNq.LIZ(context, strLJJIJL);
    }

    public Intent LJFF(Context context, C1371420lnA c1371420lnA) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(LJJIJL());
        intent.putExtra("android.intent.extra.TEXT", AbstractC1376120luk.LIZ(c1371420lnA));
        return intent;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        String strLJJIJL = LJJIJL();
        if (TextUtils.isEmpty(strLJJIJL)) {
            return true;
        }
        return C516560KNq.LIZ(context, strLJJIJL);
    }

    public Intent LJJ(Context context, C1375540lto c1375540lto) {
        Object objValueOf;
        String strLIZ = C1374110lrV.LIZ(c1375540lto);
        boolean z = false;
        String str = "image/*";
        boolean z2 = true;
        if (!c1375540lto.LJI) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(1);
            intent.addFlags(2);
            String string = c1375540lto.LIZIZ.toString();
            if (string != null && string.length() != 0) {
                z2 = false;
            }
            if (z2) {
                str = "";
            } else if (u.LJIIZILJ(string.toLowerCase(Locale.getDefault()), ".gif", false)) {
                str = "image/gif";
            }
            intent.setType(str);
            intent.setPackage(LJJIJL());
            intent.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
            intent.putExtra("android.intent.extra.TEXT", strLIZ);
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
        intent2.putExtra("android.intent.extra.TEXT", strLIZ);
        intent2.addFlags(1);
        intent2.addFlags(2);
        intent2.setPackage(LJJIJL());
        intent2.setType("image/*");
        List<String> list = c1375540lto.LJFF;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (!z) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    objValueOf = Boolean.valueOf(arrayList.add(C2203008k8.LIZ(context, new C0VSJ(it2.next()))));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    objValueOf = Unit.LIZ;
                }
                arrayList2.add(objValueOf);
            }
        }
        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        return intent2;
    }

    public Intent LJJIIZ(Context context, C1374270lrl c1374270lrl) {
        Intent intent = new Intent("android.intent.action.SEND");
        String strLIZ = C1374110lrV.LIZ(c1374270lrl);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("video/*");
        intent.setPackage(LJJIJL());
        intent.putExtra("android.intent.extra.STREAM", c1374270lrl.LIZIZ);
        intent.putExtra("android.intent.extra.SUBJECT", c1374270lrl.LIZLLL);
        intent.putExtra("android.intent.extra.TEXT", strLIZ);
        return intent;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        return LJ(context, LJFF(context, c1371420lnA));
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        return LJ(context, LJJIIZ(context, c1374270lrl));
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        return LJ(context, LJJ(context, c1375540lto));
    }
}
