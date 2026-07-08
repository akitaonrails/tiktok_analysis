package X;

import com.ss.android.ugc.aweme.music.model.MusicAwemeList;

/* JADX INFO: renamed from: X.0mZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401330mZP implements InterfaceC635960Ox0<MusicAwemeList> {
    public final /* synthetic */ C1401370mZT LIZ;
    public final /* synthetic */ Long LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C1401320mZO LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc A[Catch: Exception -> 0x0282, all -> 0x02de, TRY_ENTER, TryCatch #1 {Exception -> 0x0282, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x0024, B:8:0x0047, B:10:0x004b, B:11:0x0058, B:12:0x006d, B:14:0x0073, B:16:0x007d, B:18:0x0083, B:19:0x0089, B:20:0x008f, B:22:0x0095, B:24:0x00a5, B:26:0x00ab, B:28:0x00e0, B:30:0x00e6, B:31:0x0107, B:33:0x010d, B:35:0x0113, B:36:0x0135, B:37:0x0157, B:39:0x015b, B:40:0x0178, B:42:0x017e, B:44:0x0197, B:46:0x019b, B:48:0x01af, B:54:0x01cc, B:56:0x01f9, B:55:0x01e3, B:57:0x0265, B:59:0x026b, B:60:0x026e), top: B:72:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e3 A[Catch: Exception -> 0x0282, all -> 0x02de, TryCatch #1 {Exception -> 0x0282, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x0024, B:8:0x0047, B:10:0x004b, B:11:0x0058, B:12:0x006d, B:14:0x0073, B:16:0x007d, B:18:0x0083, B:19:0x0089, B:20:0x008f, B:22:0x0095, B:24:0x00a5, B:26:0x00ab, B:28:0x00e0, B:30:0x00e6, B:31:0x0107, B:33:0x010d, B:35:0x0113, B:36:0x0135, B:37:0x0157, B:39:0x015b, B:40:0x0178, B:42:0x017e, B:44:0x0197, B:46:0x019b, B:48:0x01af, B:54:0x01cc, B:56:0x01f9, B:55:0x01e3, B:57:0x0265, B:59:0x026b, B:60:0x026e), top: B:72:0x0006, outer: #0 }] */
    @Override // X.InterfaceC635960Ox0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.music.model.MusicAwemeList r15) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401330mZP.LIZ(com.ss.android.ugc.aweme.music.model.MusicAwemeList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC635960Ox0
    public final void onFailed(int i, String str, String str2) {
        ((MusicAwemeList) this.LIZLLL.mData).requestingSquareData = false;
        C1401370mZT c1401370mZT = this.LIZ;
        c1401370mZT.LIZ.LJ(Long.valueOf(System.currentTimeMillis() - this.LIZIZ.longValue()), "total_duration");
        this.LIZ.LIZ.LJFF("log_id", str2);
        C1401370mZT c1401370mZT2 = this.LIZ;
        c1401370mZT2.LIZ.LJ(Integer.valueOf(i), "error_code");
        c1401370mZT2.LIZ.LJFF("error_msg", str);
        C20684815ws.LJIILLIIL("mdp_square_request", this.LIZ.LIZ.LIZ);
        C1400860mYe c1400860mYe = this.LIZLLL.LLJJJ;
        if (c1400860mYe != null) {
            c1400860mYe.LIZ();
        }
        if (this.LIZJ == 0) {
            C636120OxG.LIZ.getClass();
            C636120OxG.LIZ("square_refresh", str, false);
        }
        String str3 = this.LIZLLL.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMusicSquareList, failed-->errorCode:");
        sbLIZ.append(i);
        sbLIZ.append(" errorMsg:");
        sbLIZ.append(str);
        sbLIZ.append(" logId:");
        sbLIZ.append(str2);
        C201955140j.LJIILIIL(str3, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1401330mZP(C1401320mZO c1401320mZO, C1401370mZT c1401370mZT, Long l, long j) {
        this.LIZLLL = c1401320mZO;
        this.LIZ = c1401370mZT;
        this.LIZIZ = l;
        this.LIZJ = j;
    }
}
