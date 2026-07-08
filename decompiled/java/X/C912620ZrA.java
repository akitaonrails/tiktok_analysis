package X;

import android.util.Patterns;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.IMTiktokLinkRegexConfig;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0ZrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912620ZrA implements InterfaceC454400Hrq {
    public static final C01GW<C912620ZrA> LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(587));

    public static String LIZJ(String str) {
        C13EA groups;
        MatchGroup matchGroupLJ;
        String str2 = null;
        try {
            MatchResult matchResultFind$default = Regex.find$default(new Regex(((IMTiktokLinkRegexConfig) C912650ZrD.LIZIZ.getValue()).tiktokVideoIdRegex), str, 0, 2, null);
            if (matchResultFind$default != null && (groups = matchResultFind$default.getGroups()) != null && (matchGroupLJ = groups.LJ(1)) != null) {
                str2 = matchGroupLJ.LIZ;
                return str2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str2;
    }

    @Override // X.InterfaceC454400Hrq
    public final boolean LIZ(CharSequence charSequence) {
        return Patterns.WEB_URL.matcher(charSequence).find();
    }

    @Override // X.InterfaceC454400Hrq
    public final String LIZIZ(CharSequence charSequence) {
        C13EA groups;
        MatchGroup matchGroupLJ;
        String str = null;
        try {
            MatchResult matchResultFind$default = Regex.find$default(new Regex(((IMTiktokLinkRegexConfig) C912650ZrD.LIZIZ.getValue()).tiktokDomainRegex), charSequence, 0, 2, null);
            if (matchResultFind$default != null && (groups = matchResultFind$default.getGroups()) != null && (matchGroupLJ = groups.LJ(1)) != null) {
                str = matchGroupLJ.LIZ;
                return str;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C869590Y9l r8, X.InterfaceC1364105Vn<? super X.C869590Y9l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C912630ZrB
            if (r0 == 0) goto L73
            r5 = r9
            X.0ZrB r5 = (X.C912630ZrB) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r3 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            java.lang.String r2 = "1"
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto La3
            com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = r5.LLILLJJLI
            X.0Y9l r8 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L28:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L79
            return r8
        L2d:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = X.C0ZDX.LJJJJLI(r8)
            if (r0 == 0) goto L37
            return r8
        L37:
            java.util.Map r1 = r8.getLocalExt()
            java.lang.String r0 = "html_link"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L46
            return r8
        L46:
            java.util.Map r1 = r8.getLocalExt()
            java.lang.String r0 = "has_tiktok_link"
            r1.put(r0, r2)
            com.bytedance.im.core.proto.ReferenceInfo r0 = r8.getReferenceInfo()
            if (r0 == 0) goto L56
            return r8
        L56:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.content.BaseContent> r0 = com.ss.android.ugc.aweme.im.message.content.BaseContent.class
            com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r8, r0)
            if (r1 != 0) goto L5f
            return r8
        L5f:
            com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceVideo r0 = r1.getRefVideo()
            if (r0 == 0) goto L66
            return r8
        L66:
            r5.LL = r8
            r5.LLILLJJLI = r1
            r5.LLILZIL = r4
            java.lang.Object r3 = r7.LJ(r3, r5)
            if (r3 != r6) goto L28
            return r6
        L73:
            X.0ZrB r5 = new X.0ZrB
            r5.<init>(r7, r9)
            goto L12
        L79:
            com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceSceneType r0 = com.ss.android.ugc.aweme.im.message.content.BaseContent.ReferenceSceneType.QUOTED_PREVIEW
            int r0 = r0.ordinal()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.setReferenceScene(r0)
            com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceVideo r0 = new com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceVideo
            r0.<init>()
            r0.setRefVideoId(r3)
            r1.setRefVideo(r0)
            r0 = 0
            java.lang.String r0 = X.C051M.LJ(r1, r0)
            r8.setContent(r0)
            java.util.Map r1 = r8.getLocalExt()
            java.lang.String r0 = "has_tiktok_link_video_id"
            r1.put(r0, r2)
            return r8
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912620ZrA.LIZLLL(X.0Y9l, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C912640ZrC
            if (r0 == 0) goto L44
            r5 = r8
            X.0ZrC r5 = (X.C912640ZrC) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L4f
            X.C155000ia.LIZIZ(r4)
        L23:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L4a
            return r2
        L28:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r0 = LIZJ(r7)
            if (r0 == 0) goto L32
            return r0
        L32:
            r5.LL = r7
            r5.LLILZ = r1
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0Hp2 r0 = new X.0Hp2
            r0.<init>(r7, r2)
            java.lang.Object r4 = X.C23250099c.LJI(r5, r1, r0)
            if (r4 != r3) goto L23
            return r3
        L44:
            X.0ZrC r5 = new X.0ZrC
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.String r0 = LIZJ(r4)
            return r0
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912620ZrA.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
