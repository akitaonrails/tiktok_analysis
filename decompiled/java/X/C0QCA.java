package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import wh6.AbS692S0100000_10;

/* JADX INFO: renamed from: X.0QCA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QCA {
    public static final C0QCA LIZ = new C0QCA();

    public static void LIZ(FragmentManager fragmentManager, List list, Function0 function0, final Function1 function1, Function1 function12) {
        if (list.isEmpty()) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0QCC c0qcc = (C0QCC) it2.next();
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(c0qcc.LIZ);
            c1247530iZL.LIZIZ(c0qcc.LIZIZ);
            c1247530iZL.LJ = new AbS692S0100000_10(c0qcc, 24);
            arrayList.add(c1247530iZL);
        }
        c1390850mIV.LJFF(arrayList);
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0QCB
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str = TuxSheet._pnsPageId;
                AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                Function1<AbstractC343940De4, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(abstractC343940De4LJIIJ);
                }
            }
        };
        TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
        tuxActionSheet.LL = onCancelListener;
        tuxActionSheet.LLILLJJLI = new C0R4A(function12, 5);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        if (function0 != null) {
            function0.invoke();
        }
        tuxActionSheetLIZJ.show(fragmentManager, "SearchActionSheet");
    }
}
