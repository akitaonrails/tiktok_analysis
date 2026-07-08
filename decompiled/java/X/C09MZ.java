package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.09MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MZ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:62:0x0140
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZ(java.lang.String r14, int r15, int r16, int r17, android.app.Activity r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09MZ.LIZ(java.lang.String, int, int, int, android.app.Activity):java.lang.String");
    }

    public static List LIZIZ(List list, int i, int i2, int i3, Activity activity) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String strLIZ = LIZ((String) it2.next(), i, i2, i3, activity);
            if (strLIZ != null) {
                arrayList.add(strLIZ);
            }
        }
        return arrayList;
    }
}
