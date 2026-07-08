package X;

import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;

/* JADX INFO: renamed from: X.08rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2248908rX {
    public static final Object LIZ(String str, String str2, String str3, InterfaceC1364105Vn<? super C2249008rY> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LJ = str2;
        abstractC2199801B7qWith.LIZJ = str3;
        abstractC2199801B7qWith.LJIIJJI = new C2499809qu(c2252611DEt, 8);
        abstractC2199801B7qWith.LIZJ();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
