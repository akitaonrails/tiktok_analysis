package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619020OPs {
    public static final C619020OPs LIZ = new C619020OPs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(665));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(664));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(666));

    public static List LIZIZ(BulletinListResponse bulletinListResponse, String str, boolean z) {
        LIZIZ.getValue().getClass();
        List list = bulletinListResponse.bulletinItems;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C619060OPw c619060OPwLIZ = AbstractC618980OPo.LIZ((BulletinItem) it2.next(), str, z);
            if (c619060OPwLIZ != null) {
                arrayList.add(c619060OPwLIZ);
            }
        }
        return arrayList;
    }

    public static final List LIZJ(String str, boolean z, List list) {
        LIZLLL.getValue();
        return C618990OPp.LIZ(str, z, list);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:49:0x00f2, B:51:0x00f6, B:53:0x00fa, B:55:0x0102, B:57:0x010a, B:58:0x010e, B:60:0x0112, B:70:0x0128, B:72:0x012c, B:73:0x0130, B:74:0x0132, B:76:0x0145, B:77:0x0147), top: B:142:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse LIZ(java.util.List r40, com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemCursor r41, java.util.List r42, java.util.Map r43, java.lang.Long r44) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619020OPs.LIZ(java.util.List, com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemCursor, java.util.List, java.util.Map, java.lang.Long):com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse");
    }
}
