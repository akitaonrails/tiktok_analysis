package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0c5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998500c5g {
    public static final void LIZ(AwemeRawAd awemeRawAd, int i, int i2) {
        List<AdTagStruct> adTags;
        int i3;
        boolean zAdd;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (awemeRawAd != null && (adTags = awemeRawAd.getAdTags()) != null) {
            ArrayList<AdTagStruct> arrayList3 = new ArrayList();
            Iterator<AdTagStruct> it2 = adTags.iterator();
            while (true) {
                i3 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                AdTagStruct next = it2.next();
                if (next.getPosition() == i) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (AdTagStruct adTagStruct : arrayList3) {
                if (!TextUtils.isEmpty(adTagStruct.getTagText())) {
                    int i4 = i3 + 1;
                    if (i3 < i2) {
                        zAdd = arrayList.add(adTagStruct.getType());
                        i3 = i4;
                    } else {
                        i3 = i4;
                        zAdd = arrayList2.add(adTagStruct.getType());
                    }
                } else {
                    zAdd = arrayList2.add(adTagStruct.getType());
                }
                arrayList4.add(Boolean.valueOf(zAdd));
            }
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("tag", "refer");
        HashMap map = new HashMap();
        map.put("tag_position", Integer.valueOf(i));
        map.put("success_type_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        map.put("fail_type_list", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        c1022820ciuLIZLLL.LIZ(map);
        c1022820ciuLIZLLL.LJII();
    }
}
