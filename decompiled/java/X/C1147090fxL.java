package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147090fxL {
    public final long LIZ;
    public final long LIZIZ;
    public final C1147020fxE LIZJ;
    public final IMusicGiftService LIZLLL;
    public boolean LJ;
    public final int LJFF = !Intrinsics.LJFF(InterfaceC1094160eZy.m1.LIZIZ(), Boolean.TRUE) ? 1 : 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C474500IjA LIZ(java.lang.String r8, X.C1147350fxl r9, X.C1147390fxp r10) {
        /*
            r7 = this;
            X.0IjA r6 = X.C0IJT.LIZ(r8)
            r6.LJIL()
            long r0 = r7.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "room_id"
            r6.LJJII(r1, r0)
            long r0 = r7.LIZIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r6.LJJII(r1, r0)
            X.0fxE r0 = r7.LIZJ
            java.lang.String r1 = r0.LJFF
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L80
            if (r1 == 0) goto L80
        L2b:
            java.lang.String r0 = "enter_from"
            r6.LJJII(r1, r0)
            int r0 = r7.LJFF
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_new_user"
            r6.LJJII(r1, r0)
            r3 = 0
            if (r9 == 0) goto L68
            long r0 = r9.LIZ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r1 = r5.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L68
            long r0 = r5.longValue()
        L51:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "gift_id"
            r6.LJJII(r1, r0)
            if (r10 == 0) goto L5e
            long r3 = r10.LIZ
        L5e:
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "mood_id"
            r6.LJJII(r1, r0)
            return r6
        L68:
            X.0fxE r0 = r7.LIZJ
            long r0 = r0.LIZ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r1 = r5.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7d
            long r0 = r5.longValue()
            goto L51
        L7d:
            r0 = 0
            goto L51
        L80:
            X.0fxE r0 = r7.LIZJ
            X.0fpR r0 = r0.LJ
            int[] r1 = X.C1142200fpS.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L95;
                case 2: goto L98;
                case 3: goto L9b;
                case 4: goto L9e;
                case 5: goto La1;
                case 6: goto La1;
                case 7: goto La4;
                case 8: goto La4;
                case 9: goto La4;
                case 10: goto La4;
                case 11: goto La4;
                default: goto L8f;
            }
        L8f:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L95:
            java.lang.String r1 = "music_tab"
            goto L2b
        L98:
            java.lang.String r1 = "gift_tab"
            goto L2b
        L9b:
            java.lang.String r1 = "gift_tray"
            goto L2b
        L9e:
            java.lang.String r1 = "gift_panel_bubble"
            goto L2b
        La1:
            java.lang.String r1 = "gtm_campaign"
            goto L2b
        La4:
            java.lang.String r1 = ""
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1147090fxL.LIZ(java.lang.String, X.0fxl, X.0fxp):X.0IjA");
    }

    public final void LIZIZ(String str, C1147350fxl c1147350fxl, C1147390fxp c1147390fxp) {
        C474500IjA c474500IjALIZ = LIZ("livesdk_music_gift_page_click", c1147350fxl, c1147390fxp);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public C1147090fxL(long j, long j2, C1147020fxE c1147020fxE, IMusicGiftService iMusicGiftService) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c1147020fxE;
        this.LIZLLL = iMusicGiftService;
    }
}
