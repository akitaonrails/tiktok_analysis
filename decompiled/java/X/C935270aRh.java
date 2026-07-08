package X;

import android.content.Context;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0aRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C935270aRh extends C935280aRi<C935270aRh> {
    public final List<C935260aRg> LIZJ;
    public C933150aOH LIZLLL;

    public final LiveActionSheetDialog LIZ() {
        return new LiveActionSheetDialog(this.LIZ, this);
    }

    public C935270aRh(final Context context) {
        new AbstractC782280UmQ<C935280aRi<T>>(context) { // from class: X.0aRi
        };
        this.LIZJ = new ArrayList();
    }

    public final void LIZIZ(List list) {
        C935250aRf c935250aRf = new C935250aRf();
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c935250aRf.LIZ((C933130aOF) it2.next());
            }
        }
        C935260aRg c935260aRg = new C935260aRg(c935250aRf);
        List<C933130aOF> list2 = c935260aRg.LIZIZ;
        if (list2 != null && !list2.isEmpty()) {
            ((ArrayList) this.LIZJ).add(c935260aRg);
        }
    }
}
