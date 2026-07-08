package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C298301Dp extends AbstractC298401Dq {
    public final List<String> LIZ;

    @Override // X.AbstractC298401Dq
    public final List<Uri> LIZ() {
        List<String> list = this.LIZ;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(UriProtector.parse(it2.next()));
        }
        return arrayList;
    }

    public C298301Dp(List<String> list) {
        this.LIZ = list;
    }
}
