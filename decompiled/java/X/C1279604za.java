package X;

import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.04za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279604za {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        String string;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MediaLocationMetaDataModel mediaLocationMetaDataModel = (MediaLocationMetaDataModel) it2.next();
                String str = mediaLocationMetaDataModel.encryptLatitude;
                String str2 = mediaLocationMetaDataModel.encryptLongitude;
                Long l = mediaLocationMetaDataModel.createTimestamp;
                if (str != null && str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(',');
                    sbLIZ.append(str);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    if (l != null && l.longValue() != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(',');
                        sbLIZ2.append(l);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    string = sb.toString();
                } else {
                    string = "";
                }
                arrayList.add(string);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
