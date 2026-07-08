package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import java.util.List;

/* JADX INFO: renamed from: X.0bBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963550bBJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final LynxCommonData.LinkedUser LIZ(C954460awe c954460awe) {
        String str;
        List urls;
        ?? LJ;
        int iOrdinal;
        ImageModel imageModel;
        C754570Tip c754570Tip = c954460awe.LJIJJ;
        if (c754570Tip == null || (str = c754570Tip.LIZIZ) == null) {
            str = "";
        }
        if (c754570Tip == null || (imageModel = c754570Tip.LIZJ) == null || (urls = imageModel.getUrls()) == null) {
            urls = C13BV.INSTANCE;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        ?? LJI = 0;
        if (interfaceC954180awCLJIIIZ != null) {
            LJ = interfaceC954180awCLJIIIZ.LJ(c954460awe.LJIIJJI);
        } else {
            LJ = 0;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null) {
            LJI = interfaceC954180awCLJIIIZ2.LJI(c954460awe.LJIIJJI);
        }
        if (C915980Zwa.LJII().isAnchor()) {
            iOrdinal = EnumC963560bBK.ANCHOR.ordinal();
        } else {
            iOrdinal = EnumC963560bBK.AUDIENCE.ordinal();
        }
        return new LynxCommonData.LinkedUser(String.valueOf(c954460awe.LJ), str, urls, c954460awe.LJJIII, String.valueOf(c954460awe.LJ), c954460awe.LJJIII, LJ, LJI ^ 1, String.valueOf(c954460awe.LJII), iOrdinal, 0, c954460awe.LJIIJJI, c954460awe.LJJIJL, c954460awe.LJIIIZ, c954460awe.LJIJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[PHI: r3
      0x00c9: PHI (r3v1 ??) = (r3v8 ??), (r3v9 ??), (r3v10 ??) binds: [B:38:0x009e, B:40:0x00a2, B:42:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData.Layout LIZIZ(X.C942080acg r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C963550bBJ.LIZIZ(X.0acg):com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$Layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9 A[PHI: r0 r5
      0x01a9: PHI (r0v26 long) = (r0v25 long), (r0v74 long), (r0v74 long), (r0v74 long) binds: [B:84:0x01e7, B:66:0x019d, B:68:0x01a1, B:70:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v9 java.lang.String), (r5v9 java.lang.String), (r5v9 java.lang.String) binds: [B:84:0x01e7, B:66:0x019d, B:68:0x01a1, B:70:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1 A[LOOP:3: B:76:0x01cb->B:78:0x01d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6 A[PHI: r0
      0x01e6: PHI (r0v25 long) = (r0v24 long), (r0v75 long) binds: [B:81:0x01e3, B:63:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020d  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData LIZJ(kotlin.jvm.functions.Function1<? super X.C963570bBL, kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C963550bBJ.LIZJ(kotlin.jvm.functions.Function1):com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[PHI: r1
      0x005d: PHI (r1v3 int) = (r1v1 int), (r1v4 int) binds: [B:15:0x0069, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData.LayoutWindow LIZLLL(X.C957020b0m r15) {
        /*
            X.0ZwL r0 = r15.getShapeDescriptor()
            android.graphics.Rect r1 = r0.LIZ
            java.lang.String r0 = r15.getCohostSpotExtra()
            tikcast.linkmic.common.CohostTypeSpotExtra r3 = X.C957830b25.LJIILIIL(r0)
            com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$LayoutWindow r6 = new com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$LayoutWindow
            java.lang.String r7 = r15.getLinkMicId()
            if (r7 != 0) goto L1e
            java.lang.String r7 = r15.getContentLinkMicId()
            if (r7 != 0) goto L1e
            java.lang.String r7 = ""
        L1e:
            long r4 = r15.getSpotId()
            int r8 = (int) r4
            X.0axz r0 = r15.getWinState()
            int r9 = r0.ordinal()
            X.0acf r0 = r15.getOnlineState()
            int r10 = r0.ordinal()
            int r0 = r1.left
            float r0 = X.C497740JfY.LJJI(r0)
            int r11 = (int) r0
            int r0 = r1.top
            float r0 = X.C497740JfY.LJJI(r0)
            int r12 = (int) r0
            int r0 = r1.width()
            float r0 = X.C497740JfY.LJJI(r0)
            int r13 = (int) r0
            int r0 = r1.height()
            float r0 = X.C497740JfY.LJJI(r0)
            int r14 = (int) r0
            com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$CoHostSpotExtra r15 = new com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$CoHostSpotExtra
            r2 = 0
            if (r3 == 0) goto L68
            boolean r0 = r3.isEnlarged
            r1 = 1
            if (r0 != r1) goto L68
        L5d:
            int r0 = r3.contentType
            int r2 = r3.preEnlargeSpotId
        L61:
            r15.<init>(r1, r0, r2)
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L68:
            r1 = 0
            if (r3 != 0) goto L5d
            r0 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C963550bBJ.LIZLLL(X.0b0m):com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData$LayoutWindow");
    }
}
