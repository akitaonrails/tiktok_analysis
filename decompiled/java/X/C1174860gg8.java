package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0gg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174860gg8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZIZ(AbstractC738140SxQ abstractC738140SxQ) {
        AbstractC738140SxQ abstractC738140SxQ2;
        if (abstractC738140SxQ instanceof InterfaceC1173990gej) {
            return ((InterfaceC1173990gej) abstractC738140SxQ).Wc();
        }
        if (abstractC738140SxQ == 0) {
            return null;
        }
        LifecycleOwner parent = abstractC738140SxQ.getParent();
        if (!(parent instanceof AbstractC738140SxQ) || (abstractC738140SxQ2 = (AbstractC738140SxQ) parent) == null) {
            return null;
        }
        return LIZIZ(abstractC738140SxQ2);
    }

    public static final List LIZ(View view, AFwS256S0000000_18 aFwS256S0000000_18) {
        ArrayList arrayList = new ArrayList();
        if (view == null) {
            return arrayList;
        }
        if (((Boolean) aFwS256S0000000_18.invoke(view)).booleanValue()) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                List listLIZ = LIZ((View) c09re.next(), aFwS256S0000000_18);
                if ((!((ArrayList) listLIZ).isEmpty()) && listLIZ != null) {
                    arrayList.addAll(listLIZ);
                }
            }
        }
        return arrayList;
    }
}
