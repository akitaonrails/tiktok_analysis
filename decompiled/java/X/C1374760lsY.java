package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374760lsY extends C09AY implements Function0<List<? extends String>> {
    public C1374760lsY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List<ShareChannelInfo> list = C1374750lsX.LIZ;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<ShareChannelInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().channelKey);
        }
        return arrayList;
    }
}
