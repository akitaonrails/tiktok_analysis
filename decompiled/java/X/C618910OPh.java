package X;

import Y.AfS34S1300000_9;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0OPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618910OPh {
    public static WeakReference<C0OOI> LIZJ;
    public static final C618910OPh LIZ = new C618910OPh();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("tiktokv.com", "tiktokcdn.com", "byteoversea.com", "sgsnssdk.com", "isnssdk.com", "ibyteimg.com", "ibytedtos.com", "tiktok.com", "xzcs3zlph.com");
    public static final Map<String, String> LIZLLL = new LinkedHashMap();

    public static C0OOI LJ() {
        WeakReference<C0OOI> weakReference = LIZJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static AbstractC1623806Xk LIZ(int i) {
        EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
        if (i == enumC617060OIe.getValue()) {
            return new C1623606Xi(enumC617060OIe);
        }
        EnumC617060OIe enumC617060OIe2 = EnumC617060OIe.IDENTITY_SUBSCRIBER;
        if (i == enumC617060OIe2.getValue()) {
            return new C1623606Xi(enumC617060OIe2);
        }
        return new C491001vg(new Throwable());
    }

    public static Uri LIZJ(Uri uri) {
        String str;
        boolean z;
        Iterator<String> it2 = C0OQ2.LIZIZ.getValue().LIZ.keySet().iterator();
        while (it2.hasNext()) {
            C10ZB.LIZ.put(it2.next(), 35);
        }
        String[] strArrLIZIZ = C1E64.LIZIZ();
        int length = strArrLIZIZ.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "";
                break;
            }
            str = strArrLIZIZ[i];
            if (TextUtils.equals(str, uri.getHost())) {
                break;
            }
            i++;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String string = uri.toString();
        if (TextUtils.equals(uri.getPath(), "/") && C1907940zkW.LIZJ(uri).isEmpty()) {
            return null;
        }
        if (TextUtils.isEmpty(uri.getPath()) && C1907940zkW.LIZJ(uri).isEmpty()) {
            return null;
        }
        if (PatternProtector.compile("@([\\w\\.]+)/live").matcher(uri.toString()).find()) {
            return C1E64.LIZ(18, uri, (String) ListProtector.get(uri.getPathSegments(), 0));
        }
        if (TextUtils.isEmpty(string)) {
            string = "";
        } else {
            Uri uri2 = UriProtector.parse(string);
            if (!uri2.isOpaque()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri2.getScheme());
                sbLIZ.append("://");
                sbLIZ.append(uri2.getEncodedAuthority());
                sbLIZ.append(uri2.getEncodedPath());
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) C10ZB.LIZ;
        Iterator it3 = linkedHashMap.keySet().iterator();
        if (it3.hasNext()) {
            String str2 = (String) it3.next();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://");
            sbLIZ2.append(str);
            sbLIZ2.append('/');
            sbLIZ2.append(str2);
            Matcher matcher = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ2)).matcher(string);
            if (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    matcher.group(1);
                }
                Integer num = (Integer) linkedHashMap.get(str2);
                if (num != null) {
                    num.intValue();
                }
            } else {
                return C1E64.LIZ(0, uri, "");
            }
        }
        return null;
    }

    @C14EU
    public final void onSendMsgFromRecordPage(C0I1O c0i1o) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        BaseShortVideoContext baseShortVideoContext = c0i1o.LIZ;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && C1434160nQM.LIZIZ(creativeModel)) {
            BaseShortVideoContext baseShortVideoContext2 = c0i1o.LIZ;
            Map<String, String> map = c0i1o.LIZIZ;
            C0OOI c0ooiLJ = LJ();
            if (c0ooiLJ != null) {
                c0ooiLJ.Gq0(baseShortVideoContext2, map);
                return;
            }
            return;
        }
        BaseShortVideoContext baseShortVideoContext3 = c0i1o.LIZ;
        Map<String, String> map2 = c0i1o.LIZIZ;
        C0OOI c0ooiLJ2 = LJ();
        if (c0ooiLJ2 == null) {
            return;
        }
        c0ooiLJ2.IG1(baseShortVideoContext3, map2);
    }

    public static List LJIIJ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    BulletinEmojiInfo bulletinEmojiInfo = (BulletinEmojiInfo) obj;
                    String str2 = bulletinEmojiInfo.emoji;
                    if (str2 == null) {
                        str2 = "";
                    }
                    BulletinEmojiItem bulletinEmojiItem = new BulletinEmojiItem(str2, bulletinEmojiInfo.count, bulletinEmojiInfo.isReaction(), str, i, false);
                    bulletinEmojiItem.LLILZ = C498380Jga.LIZ.LIZ(bulletinEmojiInfo.count);
                    arrayList.add(bulletinEmojiItem);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static void LJI(Context context, String str, Map map) {
        final String strLIZIZ;
        String scheme = UriProtector.parse(str).getScheme();
        if (scheme != null && scheme.length() != 0) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        new C828330WeV(new ThirdPartyBizCert(402685967)).LIZIZ(context, strLIZIZ, new InterfaceC828360WeY() { // from class: X.0dUk
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context2, String str2) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = strLIZIZ;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402685967);
                C1554300qY8.LIZIZ(context2, sparkThirdContext);
            }
        }, null);
        C0OPQ.LIZ.getClass();
        C0OPQ.LJIL(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0374 A[PHI: r9
      0x0374: PHI (r9v7 java.lang.String) = (r9v4 java.lang.String), (r9v8 java.lang.String) binds: [B:130:0x0372, B:128:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0378 A[PHI: r9
      0x0378: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:130:0x0372, B:132:0x0376] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fc A[PHI: r13
      0x03fc: PHI (r13v8 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String) binds: [B:159:0x03fa, B:157:0x03f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0400 A[PHI: r13
      0x0400: PHI (r13v7 java.lang.String) = (r13v3 java.lang.String), (r13v8 java.lang.String) binds: [B:159:0x03fa, B:161:0x03fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0404 A[PHI: r13 r14
      0x0404: PHI (r13v4 java.lang.String) = (r13v7 java.lang.String), (r13v8 java.lang.String) binds: [B:163:0x0402, B:161:0x03fe] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r14v1 java.lang.String) = (r14v4 java.lang.String), (r14v5 java.lang.String) binds: [B:163:0x0402, B:161:0x03fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0408 A[PHI: r13 r14
      0x0408: PHI (r13v6 java.lang.String) = (r13v4 java.lang.String), (r13v7 java.lang.String) binds: [B:165:0x0406, B:163:0x0402] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r14v3 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String) binds: [B:165:0x0406, B:163:0x0402] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0421 A[PHI: r4
      0x0421: PHI (r4v1 long) = (r4v0 long), (r4v3 long) binds: [B:174:0x0419, B:176:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem LIZIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem r52, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r53, X.C0OOH r54) {
        /*
            Method dump skipped, instruction units count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618910OPh.LIZIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, X.0OOH):com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem");
    }

    public static C11JF LJFF(Context context, DialogC1389620mGW dialogC1389620mGW, String str, Map map) {
        String host;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        if (str != null && str.length() != 0 && (host = UriProtector.parse(str).getHost()) != null) {
            for (String str2 : LIZIZ) {
                if (!Intrinsics.LJFF(host, str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('.');
                    sbLIZ.append(str2);
                    if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    }
                }
                if (dialogC1389620mGW != null) {
                    C786410Ut5.J4(dialogC1389620mGW);
                }
                return (C11JF) ((InterfaceC313100CPc) C0CPE.LIZ.getValue()).transUrl(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS34S1300000_9(context, dialogC1389620mGW, str, map, 0), new AfS34S1300000_9(context, dialogC1389620mGW, str, map, 1));
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(C1618770sE7.LIZJ(2131828051));
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        LJI(context, str, map);
        return null;
    }

    public static void LJII(C19EG c19eg, String str, User user, Map map) {
        if (c19eg != null) {
            InterfaceC898260ZLs interfaceC898260ZLsLIZIZ = C1076010e6h.LIZJ.LIZIZ().LIZIZ(c19eg);
            C0OVM c0ovm = new C0OVM();
            c0ovm.LIZJ(str);
            c0ovm.LIZ.LIZLLL = 1;
            C1252380ihA c1252380ihALIZ = c0ovm.LIZ();
            String str2 = (String) map.get("enter_from");
            if (str2 == null) {
                str2 = "";
            }
            interfaceC898260ZLsLIZIZ.AI2(c1252380ihALIZ, str2, new AwS445S0200000_9(user, map, 38));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(android.content.Context r14, long r15, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618910OPh.LJIILIIL(android.content.Context, long, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIIJJI(java.util.List r9, int r10, java.lang.String r11, boolean r12, java.lang.String r13, com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r14) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = X.C293310Beb.LIZJ()
            r8 = r11
            if (r0 == 0) goto L3b
            r1 = r14
            if (r1 == 0) goto L3b
            java.lang.Integer r0 = r1.total
            if (r0 == 0) goto La2
            int r5 = r0.intValue()
            if (r5 <= 0) goto La3
            r2 = 1
        L1a:
            java.lang.Boolean r1 = r1.enableComment
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L26
            if (r2 == 0) goto L3b
        L26:
            X.0OQC r3 = new X.0OQC
            r3.<init>(r8, r5, r2, r0)
            if (r2 == 0) goto L9f
            if (r5 <= 0) goto L9f
            X.0Jga r2 = X.C498380Jga.LIZ
            long r0 = (long) r5
            java.lang.String r0 = r2.LIZ(r0)
        L36:
            r3.LLILZIL = r0
            r4.add(r3)
        L3b:
            if (r9 != 0) goto L9d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L42:
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L47:
            boolean r0 = r3.hasNext()
            r7 = r10
            if (r0 == 0) goto L66
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem r1 = (com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem) r1
            if (r2 >= r7) goto L64
            java.lang.String r0 = r1.emoji
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L64
            r4.add(r1)
            int r2 = r2 + 1
            goto L47
        L64:
            if (r2 < r7) goto L47
        L66:
            if (r9 == 0) goto L9b
            int r6 = r9.size()
        L6c:
            if (r6 <= r7) goto L92
            X.0OQ8 r5 = new X.0OQ8
            r9 = r13
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            r0 = 43
            r3.append(r0)
            X.0Jga r2 = X.C498380Jga.LIZ
            int r6 = r6 - r7
            long r0 = (long) r6
            java.lang.String r0 = r2.LIZ(r0)
            r3.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            r5.LLILZLL = r0
            r4.add(r5)
        L92:
            X.0501 r0 = new X.0501
            r0.<init>(r8)
            r4.add(r0)
            return r4
        L9b:
            r6 = 0
            goto L6c
        L9d:
            r0 = r9
            goto L42
        L9f:
            java.lang.String r0 = ""
            goto L36
        La2:
            r5 = 0
        La3:
            r2 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618910OPh.LJIIJJI(java.util.List, int, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0199, code lost:
    
        if (r3 != null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem LIZLLL(X.C618910OPh r35, long r36, int r38, java.lang.String r39, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, int r44) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618910OPh.LIZLLL(X.0OPh, long, int, java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo, java.lang.String, java.lang.String, java.lang.String, int):com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: Exception -> 0x0111, TryCatch #2 {Exception -> 0x0111, blocks: (B:33:0x00bd, B:34:0x00c0, B:36:0x00c6, B:38:0x00ca, B:42:0x00d3, B:44:0x00db, B:45:0x00df, B:51:0x00f6, B:54:0x0100, B:56:0x0106), top: B:72:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r20, long r21, java.lang.String r23, boolean r24, java.util.Map<java.lang.String, java.lang.String> r25, java.lang.String r26, java.lang.String r27, com.ss.android.ugc.aweme.profile.model.User r28, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super java.lang.Boolean> r30) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618910OPh.LJIIIIZZ(android.content.Context, long, java.lang.String, boolean, java.util.Map, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
