package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0vxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762500vxw {
    public static final List<C1763070vyr> LIZ(SeaPdpViewModel seaPdpViewModel, Context context, List<MediaItem> list) {
        int i;
        int iNextIndex;
        String string;
        ProductBase productBase;
        SizeGuide sizeGuide;
        ArrayList arrayList = new ArrayList();
        ListIterator<MediaItem> listIterator = list.listIterator(list.size());
        while (true) {
            i = 0;
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().type == 1) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        boolean zLS2 = seaPdpViewModel.lS2();
        String string2 = context.getString(2131839186);
        String string3 = context.getString(2131850896);
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (sizeGuide = productBase.sizeGuide) == null || (string = sizeGuide.pdpSizeGuideButtonText) == null || !C123100dR.LIZ(string)) {
            string = context.getString(2131850907);
        }
        Iterator<MediaItem> it2 = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            int i2 = i + 1;
            if (it2.next().type == 2) {
                if (!z) {
                    arrayList.add(new C1763070vyr(2, string2, i));
                    z = true;
                }
            } else if (i == iNextIndex && zLS2) {
                arrayList.add(new C1763070vyr(3, string, i));
            } else if (!z2) {
                arrayList.add(new C1763070vyr(1, string3, i));
                z2 = true;
            }
            i = i2;
        }
        return arrayList;
    }
}
