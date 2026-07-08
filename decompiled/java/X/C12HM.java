package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUesTabInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12HM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HM {
    public static BeautifyUesTabInfo LIZIZ(String str, List list) {
        ComposerBeauty next;
        List<ComposerBeauty> childList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C013C c013c = new C013C();
        ArrayList<ComposerBeauty> arrayList3 = new ArrayList();
        for (Object obj : list) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            if (composerBeauty.getAdd2Nodes() || ((childList = composerBeauty.getChildList()) != null && (!childList.isEmpty()))) {
                arrayList3.add(obj);
            }
        }
        for (ComposerBeauty composerBeauty2 : arrayList3) {
            if (composerBeauty2.getChildList() != null && (!r0.isEmpty())) {
                Iterator<ComposerBeauty> it2 = composerBeauty2.getChildList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getAdd2Nodes()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty3 = next;
                if (composerBeauty3 != null) {
                    LIZ(arrayList, arrayList2, c013c, composerBeauty3);
                }
            } else {
                LIZ(arrayList, arrayList2, c013c, composerBeauty2);
            }
        }
        return new BeautifyUesTabInfo(str, "", c013c.element, arrayList, arrayList2);
    }

    public static final void LIZ(ArrayList<String> arrayList, ArrayList<Integer> arrayList2, C013C c013c, ComposerBeauty composerBeauty) {
        if (!Intrinsics.LJFF(composerBeauty.getEffect().getName(), C2219091BtD.LIZ().getString(0)) && composerBeauty.getProgressValue() > 0) {
            arrayList.add(composerBeauty.getEffect().getName());
            arrayList2.add(Integer.valueOf(composerBeauty.getProgressValue()));
            if (composerBeauty.getProgressValue() != composerBeauty.getDefaultProgress()) {
                c013c.element = true;
            }
        }
    }
}
