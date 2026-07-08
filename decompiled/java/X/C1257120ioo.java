package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ioo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257120ioo {
    public static final C1257120ioo LIZ = new C1257120ioo();
    public static final Map<String, C1257100iom> LIZIZ = new LinkedHashMap();

    public static boolean LIZ(String str) {
        if (((LinkedHashMap) LIZIZ).get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C1257100iom> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1257130iop
            if (r0 == 0) goto L4d
            r3 = r7
            X.0iop r3 = (X.C1257130iop) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r4 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L53
            java.lang.Object r6 = r3.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse r4 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse) r4
            X.0iom r3 = new X.0iom
            r2 = 0
            if (r4 == 0) goto L3a
            java.util.List<com.ss.android.ugc.aweme.story.note.avatar.UserBaseAvatarStruct> r1 = r4.userBaseAvatarStruct
            java.util.List<com.ss.android.ugc.aweme.story.note.avatar.AvatarMetaInfoWithCategory> r0 = r4.userBaseAvatarMeta
            java.lang.Boolean r2 = r4.hasValidAvatarSelfie
        L31:
            r3.<init>(r1, r0, r2)
            java.util.Map<java.lang.String, X.0iom> r0 = X.C1257120ioo.LIZIZ
            r0.put(r6, r3)
            return r3
        L3a:
            r1 = r2
            r0 = r2
            goto L31
        L3d:
            X.C155000ia.LIZIZ(r4)
            X.15gb r0 = X.C20583915gb.LIZ
            r3.LL = r6
            r3.LLILZ = r1
            java.lang.Object r4 = r0.LIZLLL(r3)
            if (r4 != r2) goto L24
            return r2
        L4d:
            X.0iop r3 = new X.0iop
            r3.<init>(r5, r7)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1257120ioo.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
