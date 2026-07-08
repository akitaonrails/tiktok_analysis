package X;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09HD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HD {
    public static final C09HH LIZ(List<C09HE> list) {
        String dayDescription;
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy", Locale.getDefault());
        for (C09HE c09he : list) {
            String str = simpleDateFormat.format(new Date(c09he.getTimeStamp()));
            C09HF c09hf = (C09HF) C13LP.LJJLIIIJL(arrayList);
            if (c09hf != null) {
                dayDescription = c09hf.getDayDescription();
            } else {
                dayDescription = null;
            }
            if (!Intrinsics.LJFF(dayDescription, str)) {
                arrayList.add(new C09HF(str, new ArrayList()));
            }
            ((C09HF) C13LP.LJJLIIIJJI(arrayList)).getHistoryRecords().add(c09he);
        }
        return new C09HH(list.size(), false, arrayList);
    }
}
