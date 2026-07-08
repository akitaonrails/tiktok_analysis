package X;

import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QAI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAI implements C0QAF {
    public C0QAJ LIZ;
    public SearchVisualInspirationSharedVM LIZIZ;
    public boolean LIZJ;

    public final void LIZJ() {
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM;
        if (this.LIZJ || (searchVisualInspirationSharedVM = this.LIZIZ) == null || !searchVisualInspirationSharedVM.LJIIJJI()) {
            return;
        }
        this.LIZJ = true;
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM2 = this.LIZIZ;
        if (searchVisualInspirationSharedVM2 != null) {
            searchVisualInspirationSharedVM2.DQ2();
        }
    }

    @Override // X.C0QAF
    public final void LIZIZ(Exception exc, Boolean bool) {
        C0QAJ c0qaj = this.LIZ;
        if (c0qaj != null) {
            c0qaj.Lo(bool);
        }
        this.LIZJ = false;
    }

    @Override // X.C0QAF
    public final void LLLLLJIL(Integer num, List list, boolean z) {
        C0QAJ c0qaj = this.LIZ;
        if (c0qaj != null) {
            c0qaj.LLLLLJIL(num, list, z);
        }
        this.LIZJ = false;
    }

    @Override // X.C0QAF
    public final void LIZ(List<ImageData> list, boolean z, Integer num, int i) {
        String str;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            InsiteImageData insiteImageData = ((ImageData) it2.next()).insiteImage;
            if (insiteImageData != null) {
                str = insiteImageData.url;
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        List<ImageData> listLL = C13LP.LL(list, i);
        List listLJJJJIZL = C13LP.LJJJJIZL(list, i);
        C0QAJ c0qaj = this.LIZ;
        if (c0qaj != null) {
            c0qaj.Y8(listLL);
        }
        this.LIZJ = false;
        if (!listLJJJJIZL.isEmpty()) {
            LLLLLJIL(num, listLJJJJIZL, z);
        }
    }
}
