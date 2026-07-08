package X;

import android.util.Log;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.096N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096N {
    public static final C096N LIZ = new C096N();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(995));

    public static CreativeInfo LIZJ(String str) {
        AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartMovieMediaProcessor getCreativeInfo: extra=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LogLevel logLevel = LogLevel.LEVEL_INFO;
        anonymousClass0968.getClass();
        AnonymousClass0968.LIZ(logLevel, strLIZIZ);
        try {
            C1227904rF.LIZ.getClass();
            return (CreativeInfo) C1227904rF.LIZIZ(str, CreativeInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C1398350mUb.LIZIZ, "SmartMovieMediaProcessor", Log.getStackTraceString(e));
            AnonymousClass0968 anonymousClass09682 = AnonymousClass0968.LIZ;
            LogLevel logLevel2 = LogLevel.LEVEL_ERROR;
            anonymousClass09682.getClass();
            AnonymousClass0968.LIZ(logLevel2, "SmartMovieMediaProcessor Failed to parse creativeInfo from extra");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt LIZIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C096N.LIZIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt, java.lang.String):com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt r9, java.lang.String r10, X.InterfaceC1364105Vn r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.AnonymousClass0967
            if (r0 == 0) goto L78
            r6 = r11
            X.0967 r6 = (X.AnonymousClass0967) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r3 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L52
            if (r0 != r5) goto Lae
            X.C155000ia.LIZIZ(r3)
        L23:
            X.096Q r3 = (X.C096Q) r3
            boolean r0 = r3 instanceof X.C096O
            if (r0 == 0) goto L7e
            X.0968 r2 = X.AnonymousClass0968.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SmartMovieMediaProcessor Compression succeeded: "
            r1.append(r0)
            X.096O r3 = (X.C096O) r3
            java.lang.String r0 = r3.LIZ
            r1.append(r0)
            java.lang.String r0 = ", fromCache="
            r1.append(r0)
            boolean r0 = r3.LIZIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.ies.nle.editor_jni.LogLevel r0 = com.bytedance.ies.nle.editor_jni.LogLevel.LEVEL_INFO
            r2.getClass()
            X.AnonymousClass0968.LIZ(r0, r1)
            return r4
        L52:
            X.C155000ia.LIZIZ(r3)
            X.096R r0 = new X.096R
            r0.<init>(r9, r10, r4, r12)
            kotlinx.coroutines.flow.b r1 = X.C09IC.LJ(r0)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.01Wa r3 = X.C09IC.LJIL(r1, r0)
            X.096M r2 = new X.096M
            r2.<init>(r4)
            X.09r7 r1 = new X.09r7
            r0 = 0
            r1.<init>(r2, r3, r0)
            r6.LLILLL = r5
            java.lang.Object r3 = X.C09IC.LJJ(r1, r6)
            if (r3 != r7) goto L23
            return r7
        L78:
            X.0967 r6 = new X.0967
            r6.<init>(r8, r11)
            goto L12
        L7e:
            boolean r0 = r3 instanceof X.C096P
            if (r0 == 0) goto La3
            X.0968 r2 = X.AnonymousClass0968.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SmartMovieMediaProcessor Compression failed: "
            r1.append(r0)
            X.096P r3 = (X.C096P) r3
            java.lang.String r0 = r3.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.ies.nle.editor_jni.LogLevel r0 = com.bytedance.ies.nle.editor_jni.LogLevel.LEVEL_ERROR
            r2.getClass()
            X.AnonymousClass0968.LIZ(r0, r1)
            java.lang.String r4 = r3.LIZ
            return r4
        La3:
            if (r3 != 0) goto La8
            java.lang.String r4 = "Compression failed: empty result"
            return r4
        La8:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C096N.LIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }
}
