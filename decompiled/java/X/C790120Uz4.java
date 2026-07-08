package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790120Uz4 implements Comparator<InterfaceC1370310llN> {
    public final List<ShareItemOrderBean> LL;

    static {
        List listLIZIZ = C1375060lt2.LIZIZ();
        if (listLIZIZ != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ShareItemOrderBean) it2.next()).actionId);
            }
        } else {
            new ArrayList();
        }
        List listLIZ = C1375060lt2.LIZ();
        if (listLIZ == null) {
            new ArrayList();
            return;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        Iterator it3 = listLIZ.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ShareItemOrderBean) it3.next()).actionId);
        }
    }

    public C790120Uz4(String str) {
        List<ShareItemOrderBean> listLIZIZ;
        if (Intrinsics.LJFF(str, "long_press")) {
            listLIZIZ = C1375060lt2.LIZ();
        } else {
            listLIZIZ = C1375060lt2.LIZIZ();
        }
        this.LL = listLIZIZ;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC1370310llN interfaceC1370310llN, InterfaceC1370310llN interfaceC1370310llN2) {
        int i;
        InterfaceC1370310llN interfaceC1370310llN3 = interfaceC1370310llN;
        InterfaceC1370310llN interfaceC1370310llN4 = interfaceC1370310llN2;
        if (interfaceC1370310llN3 == null) {
            return -1;
        }
        if (interfaceC1370310llN4 == null) {
            return 1;
        }
        List<ShareItemOrderBean> list = this.LL;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            String strKey = interfaceC1370310llN3.key();
            List<ShareItemOrderBean> list2 = this.LL;
            int size = list2.size();
            int i3 = 0;
            while (true) {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
                if (i3 < size) {
                    if (TextUtils.equals(((ShareItemOrderBean) ListProtector.get(list2, i3)).actionId, strKey)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = LSPassThroughRecordSizeConfig.DEFAULT;
                    break;
                }
            }
            String strKey2 = interfaceC1370310llN4.key();
            List<ShareItemOrderBean> list3 = this.LL;
            int size2 = list3.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                if (TextUtils.equals(((ShareItemOrderBean) ListProtector.get(list3, i2)).actionId, strKey2)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            return i3 - i;
        }
        return 0;
    }
}
