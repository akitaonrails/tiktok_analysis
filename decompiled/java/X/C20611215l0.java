package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611215l0 {
    public static final void LIZIZ(String str, String str2, String str3) {
        int i;
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "immersive_story");
        c2344009Gk.LJIIIIZZ("function", "mention");
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("position", str3);
        if (C298470Bmv.LIZ() && Intrinsics.LJFF(str, "tag_mention_head_click")) {
            IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService != null && iStoryMentionShareService.isPrivateAccount()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_private_account");
            if (iStoryMentionShareService != null && iStoryMentionShareService.LJII()) {
                str4 = "on";
            } else {
                str4 = "off";
            }
            c2344009Gk.LJIIIIZZ("checkbox_status", str4);
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[PHI: r1
      0x006f: PHI (r1v4 boolean) = (r1v3 boolean), (r1v12 boolean) binds: [B:22:0x006c, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.List r12) {
        /*
            java.lang.String r1 = ","
            r2 = 0
            r4 = 0
            r0 = 705(0x2c1, float:9.88E-43)
            kotlin.jvm.internal.AFwS257S0000000_19 r6 = kotlin.jvm.internal.AFwS257S0000000_19.get$arr$(r0)
            r7 = 30
            r0 = r12
            r3 = r2
            r5 = r2
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r0, r1, r2, r3, r4, r5, r6, r7)
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r0 = "position"
            r3.LJIIIIZZ(r0, r9)
            java.lang.String r0 = "mentioned_uid"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r10)
            boolean r0 = X.C298470Bmv.LIZ()
            if (r0 == 0) goto L5d
            java.lang.Class<com.ss.android.ugc.aweme.story.service.IStoryMentionShareService> r5 = com.ss.android.ugc.aweme.story.service.IStoryMentionShareService.class
            r9 = 14
            r10 = 0
            r6 = r4
            r7 = r4
            r8 = r4
            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.story.service.IStoryMentionShareService r4 = (com.ss.android.ugc.aweme.story.service.IStoryMentionShareService) r4
            r2 = 1
            if (r4 == 0) goto L6b
            boolean r0 = r4.LJIIJJI(r11)
            if (r0 != r2) goto L6b
            r1 = 1
        L45:
            boolean r0 = r4.LJII()
            if (r0 != r2) goto L6f
        L4b:
            if (r1 != r2) goto L68
            java.lang.String r1 = "0"
        L4f:
            java.lang.String r0 = "is_change_reshare_status"
            r3.LJFF(r0, r1)
            if (r2 == 0) goto L65
            java.lang.String r1 = "on"
        L58:
            java.lang.String r0 = "final_reshare_status"
            r3.LJIIIIZZ(r0, r1)
        L5d:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "story_add_mention_result"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L65:
            java.lang.String r1 = "off"
            goto L58
        L68:
            java.lang.String r1 = "1"
            goto L4f
        L6b:
            r1 = 0
            if (r4 == 0) goto L6f
            goto L45
        L6f:
            r2 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20611215l0.LIZ(java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
