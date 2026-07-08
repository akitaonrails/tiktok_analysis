package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.PovModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421380n5k {
    public static final C0NTY LIZ = new C0NTY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3515));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3513));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3512));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3514));
    public static C1421450n5r LJFF;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<PovItemInfo> list;
        String str;
        PovModel povModel = videoPublishEditModel.creativeModel.povModel;
        if (povModel == null || (list = povModel.povList) == null || list.isEmpty()) {
            return true;
        }
        String strLIZIZ = LIZIZ(videoPublishEditModel);
        PovModel povModel2 = videoPublishEditModel.creativeModel.povModel;
        String str2 = null;
        if (povModel2 != null) {
            str = povModel2.fileIdentifier;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "-1")) {
            PovModel povModel3 = videoPublishEditModel.creativeModel.povModel;
            if (povModel3 != null) {
                str2 = povModel3.fileIdentifier;
            }
            if (!Intrinsics.LJFF(strLIZIZ, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
            boolean r0 = r4.isPhotoMvMode()
            r3 = 1
            r1 = 0
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r4.getCanvasVideoData()
            boolean r0 = X.C1444940nhk.LJII(r0)
            if (r0 != 0) goto L44
            boolean r0 = X.C1428470nHB.LJJZZI(r4)
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r4.getPreviewInfo()
            java.util.List r0 = r0.getVideoList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            java.lang.String r0 = r0.getVideoPath()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L38
            android.app.Application r0 = X.C0CHQ.LIZ
            java.lang.String r2 = X.C09N5.LIZ(r0, r1)
            if (r2 != 0) goto L3a
        L38:
            java.lang.String r2 = ""
        L3a:
            int r0 = r2.length()
            if (r0 == 0) goto L41
            r3 = 0
        L41:
            if (r3 != 0) goto Lc0
            goto La6
        L44:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r4.getCanvasVideoData()
            if (r0 == 0) goto La4
            r0 = 1
        L4b:
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r4.getCanvasVideoData()
            if (r0 == 0) goto La2
            java.util.List<java.lang.String> r2 = r0.sourceInfo
        L55:
            if (r2 == 0) goto L38
            java.lang.Object r2 = X.C13LP.LJJJLL(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L3a
            goto L38
        L60:
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r0 = r4.getMvCreateVideoData()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r0 = r4.getMvCreateVideoData()
            if (r0 == 0) goto La2
            java.util.ArrayList<java.lang.String> r2 = r0.srcSelectMediaList
            goto L55
        L6f:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r4.getImageAlbumData()
            if (r0 == 0) goto La2
            java.util.List r1 = r0.getImageList()
            if (r1 == 0) goto La2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r0.getSrcImageInfo()
            java.lang.String r0 = r0.getPath()
            r2.add(r0)
            goto L8a
        La2:
            r2 = 0
            goto L55
        La4:
            r0 = 0
            goto L4b
        La6:
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.SecurityException -> Lbc
            r1.<init>(r2)     // Catch: java.lang.SecurityException -> Lbc
            boolean r0 = r1.exists()     // Catch: java.lang.SecurityException -> Lbc
            if (r0 == 0) goto Lc0
            long r3 = r1.length()     // Catch: java.lang.SecurityException -> Lbc
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc0
            goto Lc2
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc0:
            r3 = -1
        Lc2:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421380n5k.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(long r11, java.lang.String r13) {
        /*
            X.08y5 r0 = X.C2275708vr.LIZIZ
            r4 = 0
            if (r0 == 0) goto L7
            X.08yQ r4 = r0.LIZLLL
        L7:
            long r9 = java.lang.System.currentTimeMillis()
            r3 = 1
            r8 = 0
            if (r4 == 0) goto L5e
            long r0 = r4.LIZIZ
            long r5 = r9 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5e
            r7 = 1
        L1a:
            long r5 = r4.LIZIZ
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            r7 = 0
        L23:
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            X.08y5 r0 = X.C2275708vr.LIZIZ
            if (r0 == 0) goto L31
            X.11PQ<java.lang.String> r0 = r0.LJIJJ
            java.lang.Object r2 = r0.LJLZ()
            if (r2 != 0) goto L33
        L31:
            java.lang.String r2 = ""
        L33:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "err_msg"
            r1.<init>(r0, r2)
            r3[r8] = r1
            java.util.HashMap r1 = X.C2097608Jq.LJI(r3)
            X.0n5p r0 = X.C1421430n5p.LIZ
            X.0n5q r5 = new X.0n5q
            if (r7 == 0) goto L56
            r7 = 0
        L48:
            r6 = 0
            long r9 = r9 - r11
            r12 = r13
            r11 = r6
            r5.<init>(r6, r7, r9, r11, r12)
            r0.getClass()
            X.C1421430n5p.LIZ(r5, r1)
            return
        L56:
            if (r4 == 0) goto L5b
            long r7 = r4.LIZ
            goto L48
        L5b:
            long r7 = r9 - r11
            goto L48
        L5e:
            r7 = 0
            if (r4 == 0) goto L23
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421380n5k.LIZLLL(long, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(long r13, java.lang.String r15, com.ss.android.ugc.gamora.editor.sticker.pov.api.PovResponse r16) {
        /*
            X.08y5 r0 = X.C2275708vr.LIZIZ
            if (r0 == 0) goto L87
            X.08yQ r4 = r0.LIZLLL
        L6:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
            if (r4 == 0) goto L83
            long r0 = r4.LIZIZ
            long r5 = r5 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L83
            r12 = 1
        L17:
            long r1 = r4.LIZIZ
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L20
            r12 = 0
        L20:
            long r10 = java.lang.System.currentTimeMillis()
            r3 = r16
            java.lang.String r2 = r3.extraParams
            java.lang.String r5 = ""
            if (r2 != 0) goto L2d
            r2 = r5
        L2d:
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            X.04Zc r0 = new X.04Zc
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 != 0) goto L48
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L48:
            java.lang.String r1 = r3.statusMessage
            if (r1 != 0) goto L4d
            r1 = r5
        L4d:
            java.lang.String r0 = "err_msg"
            r2.put(r0, r1)
            java.lang.Integer r0 = r3.statusCode
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5d
            r5 = r0
        L5d:
            java.lang.String r0 = "err_code"
            r2.put(r0, r5)
            X.0n5p r1 = X.C1421430n5p.LIZ
            X.0n5q r6 = new X.0n5q
            if (r12 != 0) goto L80
            if (r4 == 0) goto L80
            long r8 = r4.LIZ
        L6c:
            long r10 = r10 - r13
            java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo> r0 = r3.povInfoList
            if (r0 == 0) goto L75
            int r7 = r0.size()
        L75:
            r13 = r15
            r6.<init>(r7, r8, r10, r12, r13)
            r1.getClass()
            X.C1421430n5p.LIZ(r6, r2)
            return
        L80:
            r8 = 0
            goto L6c
        L83:
            r12 = 0
            if (r4 == 0) goto L20
            goto L17
        L87:
            r4 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421380n5k.LJ(long, java.lang.String, com.ss.android.ugc.gamora.editor.sticker.pov.api.PovResponse):void");
    }

    public static void LIZJ(boolean z, VideoPublishEditModel videoPublishEditModel, final Function1 function1, final Function1 function12) {
        C1421450n5r c1421450n5r;
        Uri uri = UriProtector.parse(((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoPath());
        if (uri != null) {
            C09N5.LIZ(C0CHQ.LIZ, uri);
        }
        String strLIZIZ = LIZIZ(videoPublishEditModel);
        strLIZIZ.toString();
        final C1421450n5r c1421450n5r2 = new C1421450n5r(strLIZIZ);
        if (!(!Intrinsics.LJFF(strLIZIZ, "-1"))) {
            if (LJFF == null) {
                function12.invoke(0);
                return;
            }
            return;
        }
        C1421450n5r c1421450n5r3 = LJFF;
        if (c1421450n5r3 != null && Intrinsics.LJFF(c1421450n5r3.LIZ, strLIZIZ) && (c1421450n5r = LJFF) != null && c1421450n5r.LIZIZ && !c1421450n5r.LIZJ) {
            return;
        }
        C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
        C201955140j.LIZJ(c1421570n63, "new request gpt");
        C1421450n5r c1421450n5r4 = LJFF;
        if (c1421450n5r4 != null) {
            c1421450n5r4.LIZJ = true;
        }
        LJFF = c1421450n5r2;
        c1421450n5r2.LIZIZ = true;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C11NZ c11nzLIZ = C1411930mqV.LIZ(videoPublishEditModel, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tosUriObservable:");
        sbLIZ.append(c11nzLIZ);
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
        if (c11nzLIZ != null) {
            c11nzLIZ.LJL(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0n5o
                public final /* synthetic */ C0NTY LLILLJJLI = C1421380n5k.LIZ;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PovTask@b799.requestPovData$1");
                    String str = (String) obj;
                    C1421570n63 c1421570n632 = C1421570n63.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("tosUri:");
                    sbLIZ2.append(str);
                    C201955140j.LIZJ(c1421570n632, C2188811AlT.LIZIZ(sbLIZ2));
                    if (str.length() == 0) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01X6(c1421450n5r2, function12, null), 3);
                        C1421380n5k.LIZLLL(jCurrentTimeMillis, "fetch_pov");
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        C0NTY c0nty = this.LLILLJJLI;
                        int iIntValue = ((Number) C1421380n5k.LIZIZ.getValue()).intValue();
                        int iIntValue2 = ((Number) C1421380n5k.LIZJ.getValue()).intValue();
                        String str2 = (String) C1421380n5k.LIZLLL.getValue();
                        String str3 = (String) C1421380n5k.LJ.getValue();
                        C1421390n5l c1421390n5l = new C1421390n5l(c1421450n5r2, jCurrentTimeMillis2, jCurrentTimeMillis, function12, function1);
                        c0nty.getClass();
                        C0NTY.LIZ(iIntValue, iIntValue2, str, str2, str3, c1421390n5l);
                    }
                    C1C7U.LIZIZ("PovTask@b799.requestPovData$1");
                }
            });
        } else {
            function12.invoke(0);
        }
    }

    public static void LJFF(final boolean z, VideoPublishEditModel videoPublishEditModel, final Function1 function1, final Function1 function12) {
        String strLIZ;
        C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
        C201955140j.LIZJ(c1421570n63, "try to request gpt");
        Uri uri = UriProtector.parse(((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoPath());
        if (uri == null || (strLIZ = C09N5.LIZ(C0CHQ.LIZ, uri)) == null) {
            strLIZ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadTask videoPath:");
        sbLIZ.append(strLIZ);
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C11NZ c11nzLIZ = C1411930mqV.LIZ(videoPublishEditModel, z);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tosUriObservable:");
        sbLIZ2.append(c11nzLIZ);
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ2));
        if (c11nzLIZ != null) {
            c11nzLIZ.LJL(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0n5n
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str;
                    C1C7U.LIZ("PovTaskManager@581d.requestDataFromGPT$1");
                    String str2 = (String) obj;
                    C1421570n63 c1421570n632 = C1421570n63.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("tosUri:");
                    sbLIZ3.append(str2);
                    C201955140j.LIZJ(c1421570n632, C2188811AlT.LIZIZ(sbLIZ3));
                    if (str2.length() == 0) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01R0(function12, null), 3);
                        long j = jCurrentTimeMillis;
                        if (z) {
                            str = "fetch_pov";
                        } else {
                            str = "load_more_pov";
                        }
                        C1421380n5k.LIZLLL(j, str);
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        int iIntValue = ((Number) C1421380n5k.LIZIZ.getValue()).intValue();
                        int iIntValue2 = ((Number) C1421380n5k.LIZJ.getValue()).intValue();
                        String str3 = (String) C1421380n5k.LIZLLL.getValue();
                        String str4 = (String) C1421380n5k.LJ.getValue();
                        Function1<Integer, Unit> function13 = function12;
                        C0NTY.LIZ(iIntValue, iIntValue2, str2, str3, str4, new C1421400n5m(jCurrentTimeMillis, jCurrentTimeMillis2, function13, function1, z));
                    }
                    C1C7U.LIZIZ("PovTaskManager@581d.requestDataFromGPT$1");
                }
            });
        } else {
            function12.invoke(0);
        }
    }
}
