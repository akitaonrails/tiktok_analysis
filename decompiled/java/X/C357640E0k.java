package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357640E0k implements C0E0I {
    public final /* synthetic */ C357700E0q LIZ;

    @Override // X.C0E0I
    public final void LJ() {
    }

    @Override // X.C0E0I
    public final void LJIIL() {
        DialogC1390150mHN dialogC1390150mHN = this.LIZ.LLJLLL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        LIZ(AFwS234S0000000_5.get$arr$(163));
    }

    public C357640E0k(C357700E0q c357700E0q) {
        this.LIZ = c357700E0q;
    }

    @Override // X.C0E0I
    public final void LIZ(Function1<? super C357930E1n, C357930E1n> function1) {
        this.LIZ.i3(function1);
    }

    @Override // X.C0E0I
    public final void LIZJ(float f) {
        LIZ(new AwS3S0000001_5(f, 3));
    }

    @Override // X.C0E0I
    public final void LIZLLL(ResourceItem resourceItem) {
        String str;
        C0E48 c0e48F4 = this.LIZ.F4();
        if (c0e48F4 != null) {
            String resourceId = resourceItem.getResourceId();
            C357590E0f category = resourceItem.getCategory();
            if (category != null) {
                str = category.LIZIZ;
            } else {
                str = null;
            }
            c0e48F4.S7().LIZIZ(new C351380Dq4(resourceId, str, false, 12), "magic_changed_event", false);
        }
    }

    @Override // X.C0E0I
    public final int LJFF(ResourceItem resourceItem) {
        C361100EDs resourceListAdapter;
        String str;
        C0EDF c0edf = this.LIZ.P6().LLLILZLLLI;
        if (c0edf != null && (resourceListAdapter = c0edf.getResourceListAdapter()) != null) {
            List<ResourceItem> listLLLFZ = resourceListAdapter.LLLFZ();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLLLFZ) {
                C357590E0f category = ((ResourceItem) obj).getCategory();
                String str2 = null;
                if (category != null) {
                    str = category.LIZIZ;
                } else {
                    str = null;
                }
                C357590E0f category2 = resourceItem.getCategory();
                if (category2 != null) {
                    str2 = category2.LIZIZ;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(((ResourceItem) it2.next()).getResourceId(), resourceItem.getResourceId())) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.C0E0I
    public final void LIZIZ(ResourceItem resourceItem, int i) {
        this.LIZ.I7(resourceItem, i);
    }
}
