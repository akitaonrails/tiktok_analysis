package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539630LEj {
    public static final C539630LEj LIZ = new C539630LEj();

    public static final void LIZIZ(Integer num, C0L9X c0l9x) {
        EnumC539610LEh enumC539610LEh;
        if (num != null) {
            num.intValue();
            if (c0l9x == C0L9X.FAILED) {
                enumC539610LEh = EnumC539610LEh.ALBUM_AUTH_DENY;
            } else {
                enumC539610LEh = null;
            }
            C539630LEj c539630LEj = LIZ;
            C0LEQ c0leq = C0LEQ.ALBUM_AUTH;
            c539630LEj.getClass();
            LIZ(num, c0l9x, c0leq, enumC539610LEh);
        }
    }

    public static final void LJIIIIZZ(Intent intent, C0L9X c0l9x, C564010MAd c564010MAd) {
        String stringExtra;
        EnumC539610LEh enumC539610LEh;
        String str;
        C0LGC c0lgc;
        if (intent.hasExtra("exterior_record_model")) {
            ExteriorRecordModel exteriorRecordModel = (ExteriorRecordModel) intent.getParcelableExtra("exterior_record_model");
            Integer numValueOf = null;
            try {
                stringExtra = intent.getStringExtra("shoot_way");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (c0l9x == C0L9X.FAILED) {
                enumC539610LEh = EnumC539610LEh.RECORD_AUTH_DENY;
            } else {
                enumC539610LEh = null;
            }
            C539630LEj c539630LEj = LIZ;
            if (exteriorRecordModel != null && (c0lgc = exteriorRecordModel.recordPageType) != null) {
                numValueOf = Integer.valueOf(c0lgc.getType());
            }
            C0LEQ c0leq = C0LEQ.RECORD_AUTH;
            c539630LEj.getClass();
            LIZ(numValueOf, c0l9x, c0leq, enumC539610LEh);
            if (c564010MAd != null) {
                if (exteriorRecordModel == null || (str = exteriorRecordModel.PreviousPage) == null) {
                    str = "";
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                c564010MAd.invoke(str, stringExtra);
            }
        }
    }

    public static void LIZ(Integer num, C0L9X c0l9x, C0LEQ c0leq, EnumC539610LEh enumC539610LEh) {
        int type = C0LG8.ECOMMERCE_COMMENT.getType();
        if (num != null && num.intValue() == type) {
            LJI(C00AU.EC_COMMENT, c0leq, c0l9x, null, enumC539610LEh, 0L, 0);
            return;
        }
        int type2 = C0LG8.PHOTO_SEARCH.getType();
        if (num == null || num.intValue() != type2) {
            return;
        }
        LJI(C00AU.EC_SEARCH, c0leq, c0l9x, null, enumC539610LEh, 0L, 0);
    }

    public static void LJII(int i, String str, String str2, boolean z, Intent intent, Boolean bool) {
        if ((intent != null && intent.hasExtra("exterior_record_model")) || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("previous_page", str);
            c0lab.LIZ(i, "step");
            c0lab.LJ("shoot_way", str2);
            c0lab.LIZ(z ? 1 : 0, "activity_is_valid");
            C20684815ws.LJIILLIIL("external_creation_trace_performance", c0lab.LIZ);
        }
    }

    public static final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, EnumC539610LEh enumC539610LEh, String str3, long j, String str4) {
        Integer numValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJFF("origin_file_exist", C2286708xd.LIZJ(str));
        c0lab.LIZIZ(C2286708xd.LJIIL(str), "origin_file_size");
        c0lab.LJ("resolution", str4);
        c0lab.LJ("content_type", str2);
        c0lab.LJ("failed_reason", enumC539610LEh.getErrorDesc());
        c0lab.LJ("content_source", str3);
        C20684815ws.LJIILLIIL("compress_failure", c0lab.LIZ);
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            numValueOf = null;
        }
        LJ(numValueOf, C0L9X.FAILED, C0LEQ.COMPRESS_SAVE, str2, enumC539610LEh, j, (int) C2286708xd.LJIIL(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(java.lang.Integer r9, X.C0L9X r10, X.C0LEQ r11, java.lang.String r12, X.EnumC539610LEh r13, long r14, int r16) {
        /*
            int r1 = r12.hashCode()
            r0 = 108124(0x1a65c, float:1.51514E-40)
            if (r1 == r0) goto L60
            r0 = 106642994(0x65b3e32, float:4.1235016E-35)
            if (r1 == r0) goto L55
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 != r0) goto L6b
            java.lang.String r0 = "video"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L6b
            X.0LEk r4 = X.EnumC539640LEk.VIDEO
        L1d:
            X.0LG8 r0 = X.C0LG8.ECOMMERCE_COMMENT
            int r1 = r0.getType()
            r6 = r14
            r5 = r13
            r8 = r16
            r2 = r11
            r3 = r10
            if (r9 == 0) goto L3c
            int r0 = r9.intValue()
            if (r0 != r1) goto L3c
            X.0LEj r0 = X.C539630LEj.LIZ
            X.00AU r1 = X.C00AU.EC_COMMENT
            r0.getClass()
            LJI(r1, r2, r3, r4, r5, r6, r8)
        L3b:
            return
        L3c:
            X.0LG8 r0 = X.C0LG8.PHOTO_SEARCH
            int r1 = r0.getType()
            if (r9 == 0) goto L3b
            int r0 = r9.intValue()
            if (r0 != r1) goto L3b
            X.0LEj r0 = X.C539630LEj.LIZ
            X.00AU r1 = X.C00AU.EC_SEARCH
            r0.getClass()
            LJI(r1, r2, r3, r4, r5, r6, r8)
            return
        L55:
            java.lang.String r0 = "photo"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L6b
            X.0LEk r4 = X.EnumC539640LEk.PHOTO
            goto L1d
        L60:
            java.lang.String r0 = "mix"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L6b
            X.0LEk r4 = X.EnumC539640LEk.MIX
            goto L1d
        L6b:
            X.0LEk r4 = X.EnumC539640LEk.UNKNOWN
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539630LEj.LJ(java.lang.Integer, X.0L9X, X.0LEQ, java.lang.String, X.0LEh, long, int):void");
    }

    public static void LJI(C00AU c00au, C0LEQ c0leq, C0L9X c0l9x, EnumC539640LEk enumC539640LEk, EnumC539610LEh enumC539610LEh, long j, int i) {
        Integer numValueOf;
        Integer numValueOf2;
        C0LAB c0lab = new C0LAB();
        String strName = c00au.name();
        Locale locale = Locale.ROOT;
        c0lab.LJ("previous_page", strName.toLowerCase(locale));
        c0lab.LJ("stage", c0leq.name().toLowerCase(locale));
        c0lab.LIZ(c0l9x.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        String errorDesc = null;
        if (enumC539640LEk != null) {
            numValueOf = Integer.valueOf(enumC539640LEk.getValue());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "media_type");
        if (c0l9x == C0L9X.FAILED) {
            if (enumC539610LEh != null) {
                numValueOf2 = Integer.valueOf(enumC539610LEh.getErrorCode());
            } else {
                numValueOf2 = null;
            }
            c0lab.LIZLLL(numValueOf2, "error_code");
            if (enumC539610LEh != null) {
                errorDesc = enumC539610LEh.getErrorDesc();
            }
            c0lab.LJ("error_desc", errorDesc);
        }
        c0lab.LIZJ(Float.valueOf(j), "duration");
        if (c0leq == C0LEQ.COMPRESS_SAVE) {
            c0lab.LIZ(i, "file_size");
        }
        C20684815ws.LJIILLIIL("external_creation_performance", c0lab.LIZ);
    }

    public static final void LJFF(ShortVideoContext shortVideoContext, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        Integer numValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJFF("origin_file_exist", C2286708xd.LIZJ(str));
        c0lab.LIZIZ(C2286708xd.LJIIL(str), "origin_file_size");
        c0lab.LJFF("compress_file_exist", C2286708xd.LIZJ(str2));
        c0lab.LIZIZ(C2286708xd.LJIIL(str2), "compress_file_size");
        c0lab.LJ("resolution", str6);
        c0lab.LJ("process_name", str5);
        c0lab.LJ("content_type", str3);
        c0lab.LJ("content_source", str4);
        C20684815ws.LJIILLIIL("compress_success", c0lab.LIZ);
        if (Intrinsics.LJFF(str5, "video_compress")) {
            return;
        }
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            numValueOf = null;
        }
        LJ(numValueOf, C0L9X.SUCCESS, C0LEQ.COMPRESS_SAVE, str3, null, j, (int) C2286708xd.LJIIL(str2));
    }
}
