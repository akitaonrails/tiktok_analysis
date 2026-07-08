package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869270yk9 {
    public static final List<SchemaParserData> LIZ(List<String> list) {
        SchemaParserData schemaParserData;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                Uri uri = UriProtector.parse(it2.next());
                schemaParserData = new SchemaParserData(0);
                schemaParserData.LJIIL(uri);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                schemaParserData = null;
            }
            if (schemaParserData != null) {
                arrayList.add(schemaParserData);
            }
        }
        return arrayList;
    }
}
