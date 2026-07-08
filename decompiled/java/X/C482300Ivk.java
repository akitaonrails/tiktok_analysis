package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0Ivk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482300Ivk {
    public static ToplivePageItem LIZIZ;
    public static ToplivePageItem LIZJ;
    public static ToplivePageItem LIZLLL;
    public static boolean LJ;
    public static final C482300Ivk LIZ = new C482300Ivk();
    public static final List<Long> LJFF = new ArrayList();
    public static final ConcurrentHashMap<List<String>, C482460Iw0> LJI = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.bytedance.android.live.network.response.BaseListResponse<X.AbstractC482420Ivw, com.bytedance.android.live.base.model.feed.FeedExtra>> r10) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482300Ivk.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r1 = new webcast.api.feed.ToplivePageItem();
        r1.enterMethod = "following_module";
        r1.room = r9;
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r8, 0, r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.List r13, final webcast.api.feed.ToplivePageItem r14) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482300Ivk.LIZ(java.util.List, webcast.api.feed.ToplivePageItem):void");
    }

    public static int LIZIZ(ToplivePageItem toplivePageItem, int i) {
        if (toplivePageItem.subItems.isEmpty()) {
            return 1;
        }
        int iLIZIZ = 0;
        for (ToplivePageItem toplivePageItem2 : toplivePageItem.subItems) {
            LIZ.getClass();
            iLIZIZ += LIZIZ(toplivePageItem2, i + 1);
        }
        return iLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[Catch: Exception -> 0x01e9, TryCatch #3 {Exception -> 0x01e9, blocks: (B:28:0x00db, B:30:0x00e8, B:32:0x00ec, B:34:0x00f2, B:35:0x00f6, B:37:0x00fc, B:41:0x010f, B:43:0x0118, B:45:0x011e, B:47:0x0126, B:48:0x012a, B:50:0x013d, B:51:0x013f, B:57:0x014e, B:58:0x0157, B:60:0x015d, B:62:0x016c, B:63:0x0170, B:66:0x0179, B:67:0x017d, B:69:0x0183, B:70:0x0194, B:71:0x019b, B:73:0x01a1, B:75:0x01a9, B:76:0x01b5, B:77:0x01b8, B:78:0x01b9, B:80:0x01c1, B:82:0x01c5, B:83:0x01ca, B:85:0x01d0, B:87:0x01e2, B:21:0x009e, B:25:0x00ae), top: B:132:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179 A[Catch: Exception -> 0x01e9, TryCatch #3 {Exception -> 0x01e9, blocks: (B:28:0x00db, B:30:0x00e8, B:32:0x00ec, B:34:0x00f2, B:35:0x00f6, B:37:0x00fc, B:41:0x010f, B:43:0x0118, B:45:0x011e, B:47:0x0126, B:48:0x012a, B:50:0x013d, B:51:0x013f, B:57:0x014e, B:58:0x0157, B:60:0x015d, B:62:0x016c, B:63:0x0170, B:66:0x0179, B:67:0x017d, B:69:0x0183, B:70:0x0194, B:71:0x019b, B:73:0x01a1, B:75:0x01a9, B:76:0x01b5, B:77:0x01b8, B:78:0x01b9, B:80:0x01c1, B:82:0x01c5, B:83:0x01ca, B:85:0x01d0, B:87:0x01e2, B:21:0x009e, B:25:0x00ae), top: B:132:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1 A[Catch: Exception -> 0x01e9, TryCatch #3 {Exception -> 0x01e9, blocks: (B:28:0x00db, B:30:0x00e8, B:32:0x00ec, B:34:0x00f2, B:35:0x00f6, B:37:0x00fc, B:41:0x010f, B:43:0x0118, B:45:0x011e, B:47:0x0126, B:48:0x012a, B:50:0x013d, B:51:0x013f, B:57:0x014e, B:58:0x0157, B:60:0x015d, B:62:0x016c, B:63:0x0170, B:66:0x0179, B:67:0x017d, B:69:0x0183, B:70:0x0194, B:71:0x019b, B:73:0x01a1, B:75:0x01a9, B:76:0x01b5, B:77:0x01b8, B:78:0x01b9, B:80:0x01c1, B:82:0x01c5, B:83:0x01ca, B:85:0x01d0, B:87:0x01e2, B:21:0x009e, B:25:0x00ae), top: B:132:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r26, java.util.List r27, X.InterfaceC1364105Vn r28) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482300Ivk.LIZJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
