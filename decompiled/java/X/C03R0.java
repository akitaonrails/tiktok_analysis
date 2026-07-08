package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03R0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03R0 {
    public final Activity LIZ;
    public Integer LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C03R0(Activity activity, String str, Integer num) {
        this.LIZ = activity;
        this.LIZIZ = num;
        this.LIZJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024e  */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams r72, java.lang.String r73, int r74) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03R0.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams, java.lang.String, int):void");
    }
}
