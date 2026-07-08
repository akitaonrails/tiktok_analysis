package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYS extends C09AY implements Function1<C0JYI, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYS(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C0JYI r8) {
        /*
            r7 = this;
            X.0JYI r8 = (X.C0JYI) r8
            X.0JYf r6 = r8.LLILLJJLI
            r4 = 0
            if (r6 == 0) goto L96
            long r1 = r6.LJ
        La:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L7e
            if (r6 == 0) goto L8f
            long r0 = r6.LJ
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L17:
            java.lang.String r0 = "livesdk_sub_only_live_visibility_settings_entrance"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "show_entrance"
            java.lang.String r0 = r7.LL
            r2.LJJII(r0, r1)
            X.0JYf r0 = r8.LLILLJJLI
            if (r0 == 0) goto L7c
            int r0 = r0.LIZLLL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L43:
            java.lang.String r0 = "all_levels"
            r2.LJJII(r1, r0)
            X.0JYf r0 = r8.LLILLJJLI
            if (r0 == 0) goto L52
            int r0 = r0.LIZJ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L52:
            java.lang.String r0 = "selected_level"
            r2.LJJII(r3, r0)
            java.lang.String r0 = "selected_item"
            r2.LJJII(r4, r0)
            X.0JYf r0 = r8.LLILLJJLI
            if (r0 == 0) goto L79
            int r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L79
            java.lang.String r1 = "months"
        L67:
            java.lang.String r0 = "current_threshold_type"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = r7.LLILLJJLI
            r2.LJJII(r0, r1)
            r2.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L79:
            java.lang.String r1 = "plans"
            goto L67
        L7c:
            r1 = r3
            goto L43
        L7e:
            if (r6 == 0) goto L91
            long r1 = r6.LJFF
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L91
            if (r6 == 0) goto L8f
            long r0 = r6.LJFF
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L17
        L8f:
            r4 = r3
            goto L17
        L91:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L17
        L96:
            r1 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JYS.invoke(java.lang.Object):java.lang.Object");
    }
}
