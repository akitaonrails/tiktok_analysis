package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341790l1N {
    public static WeakReference<C1389910mGz> LIZJ;
    public static Boolean LJ;
    public static final C1341790l1N LIZ = new C1341790l1N();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(459));
    public static int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static long LJFF = -1;
    public static int LJI = -1;

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LIZJ() {
        if (LJ == null) {
            LJ = Boolean.valueOf(LIZIZ().getBoolean("key_photo_to_sticker_used", false));
        }
        Boolean bool = LJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int LIZLLL() {
        if (LJI == -1) {
            LJI = LIZIZ().getInt("key_photo_to_sticker_show_count", 0);
        }
        return LJI;
    }

    public static void LIZ(Comment comment, C19EG c19eg, PhotoToStickerExtra photoToStickerExtra) {
        if (comment != null && c19eg != null) {
            Integer photo2StickerEntry = comment.getPhoto2StickerEntry();
            if (photo2StickerEntry != null && photo2StickerEntry.intValue() == 2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("message_type", C1350750lFp.LIZ(comment));
                linkedHashMap.put("is_internal_image_comment", String.valueOf(photoToStickerExtra.isInternalPhoto));
                C1350920lG6.LIZ.getClass();
                linkedHashMap.put("photo_type", C1350920lG6.LJIILIIL(comment));
                C1350920lG6.LJJIJ(photoToStickerExtra.enterFrom, "save_as_sticker", "fail", "safety", "", linkedHashMap);
                C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
                c1389880mGw.LJIIIIZZ(2131829248);
                c1389880mGw.LJIIJ();
                return;
            }
            LJ = Boolean.TRUE;
            LIZIZ().storeBoolean("key_photo_to_sticker_used", true);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1342850l35(comment, c19eg, photoToStickerExtra, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.app.Activity r7, final com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra r8, java.lang.Boolean r9) {
        /*
            r5 = 0
            if (r8 == 0) goto La4
            java.lang.Boolean r1 = r8.fromPhotoInner
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La4
            java.lang.String r3 = "comment_photo_inner"
        Lf:
            if (r8 == 0) goto L30
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.aweme
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.aweme
            boolean r0 = X.C1348690lCV.LIZ(r0)
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.aweme
            boolean r0 = X.C1348690lCV.LIZJ(r0)
            if (r0 != 0) goto La2
            X.0lCX r0 = X.C1348710lCX.LIZ
            r0.getClass()
            boolean r0 = X.C1348710lCX.LIZ()
            if (r0 != 0) goto La2
        L30:
            r4 = 1
        L31:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r1)
            if (r0 == 0) goto L9e
            r6 = 2131829247(0x7f1121ff, float:1.9291458E38)
        L3c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r1)
            r1 = 3
            if (r0 == 0) goto L44
            r5 = 3
        L44:
            if (r4 == 0) goto L47
            r1 = 2
        L47:
            X.0mGz r2 = new X.0mGz
            r2.<init>(r7)
            X.0lWB r0 = r2.LIZ
            r0.LIZIZ = r5
            r2.LJIIIZ(r6)
            X.0lWB r0 = r2.LIZ
            r0.LIZLLL = r1
            r0 = 2131829245(0x7f1121fd, float:1.9291454E38)
            r2.LJFF(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.LJ(r0)
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r2.LJI(r0)
            X.0Hxo r1 = new X.0Hxo
            r1.<init>()
            X.0lWB r0 = r2.LIZ
            r0.LJIIIIZZ = r1
            r0 = 460(0x1cc, float:6.45E-43)
            kotlin.jvm.internal.AFwS209S0000000_21 r0 = kotlin.jvm.internal.AFwS209S0000000_21.get$arr$(r0)
            r2.LIZLLL(r0)
            int r1 = X.C1341790l1N.LIZLLL
            int r0 = X.C14KI.LIZIZ(r7)
            int r1 = r1 + r0
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 - r0
            r2.LIZIZ(r1)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            X.C1341790l1N.LIZJ = r0
            r2.LJIIJJI()
            return
        L9e:
            r6 = 2131829246(0x7f1121fe, float:1.9291456E38)
            goto L3c
        La2:
            r4 = 0
            goto L31
        La4:
            java.lang.String r3 = "comment_panel"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341790l1N.LJ(android.app.Activity, com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra, java.lang.Boolean):void");
    }
}
