package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0hG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197110hG1 implements InterfaceC1066840dru {
    public Aweme LIZ;
    public AnchorCommonStruct LIZIZ;
    public PoiDataStruct LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        return R.raw.icon_map_thumbtack_fill;
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        PoiAnchorInfo poiAnchorInfo;
        PoiDataStruct poiDataStruct = this.LIZJ;
        if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.videoAnchor) == null) {
            return null;
        }
        return poiAnchorInfo.suffix;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[PHI: r0
      0x0027: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v6 java.lang.String) binds: [B:19:0x0024, B:14:0x001b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.InterfaceC1066840dru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r3.LIZJ
            r2 = 0
            if (r0 == 0) goto Ld
            boolean r1 = r0.isProductAnchor()
            r0 = 1
            if (r1 != r0) goto Ld
            r2 = 1
        Ld:
            java.lang.String r1 = ""
            if (r2 == 0) goto L1e
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r3.LIZJ
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.title
            if (r0 != 0) goto L27
        L1d:
            return r1
        L1e:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r3.LIZJ
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.poiName
            if (r0 != 0) goto L27
            return r1
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1197110hG1.LIZIZ():java.lang.String");
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1197110hG1 c1197110hG1 = new C1197110hG1();
        c1197110hG1.LIZLLL = this.LIZLLL;
        c1197110hG1.LIZ = this.LIZ;
        c1197110hG1.LIZIZ = this.LIZIZ;
        c1197110hG1.LIZJ = this.LIZJ;
        return c1197110hG1;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:28:0x008b, B:29:0x0090, B:25:0x007f, B:27:0x0085), top: B:43:0x007f }] */
    @Override // X.InterfaceC1066840dru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C2344009Gk r25) {
        /*
            r24 = this;
            r1 = r24
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r1.LIZ
            if (r7 == 0) goto Lc0
            java.lang.String r0 = r1.LIZLLL
            r2 = r25
            X.C1065370dpX.LIZIZ(r1, r0, r7, r2)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            X.1An6 r0 = X.C0SUC.LIZ(r0)
            java.lang.String r9 = r0.getEventType()
            java.lang.String r13 = ""
            if (r9 != 0) goto L23
            r9 = r13
        L23:
            java.lang.String r8 = "title_panel_video_anchor"
            X.0lha r0 = X.C1367960lha.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.poi_api.service.IPoiService r0 = X.C1367960lha.LIZ()
            X.0hG2 r4 = r0.LJJJZ()
            r3 = 0
            r4.LLLILZLLLI(r7, r8, r9, r3)
            java.lang.String r21 = ""
            X.09Gk r22 = new X.09Gk
            r22.<init>()
            r6 = 0
            r11 = 0
            r14 = r4
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r6
            r19 = r3
            r20 = r3
            r23 = r6
            r14.LLJJJJ(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r7.getPoiDataStruct()
            r2 = 0
            if (r0 == 0) goto L7c
            X.0h2o r16 = r0.getAnchorNavigateTarget(r3)
        L5b:
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto Lc0
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto Lc0
            android.app.Activity r5 = X.C1388190mED.LIZ(r0)
            if (r5 == 0) goto Lc0
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.LIZJ
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.trackInfo
        L77:
            if (r1 == 0) goto L8b
            goto L7f
        L7a:
            r1 = r2
            goto L77
        L7c:
            r16 = r2
            goto L5b
        L7f:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L8b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L98
            goto L90
        L8b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
        L90:
            java.lang.String r1 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L98
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L98
            goto La4
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La4:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Lab
            r2 = r1
        Lab:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lb0
            r13 = r2
        Lb0:
            java.lang.String r14 = "click"
            if (r16 != 0) goto Lb6
            X.0h2o r16 = X.EnumC1188920h2o.DEFAULT
        Lb6:
            r10 = r6
            r12 = r6
            r15 = r11
            r17 = r6
            r18 = r6
            r4.LLLLIIL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1197110hG1.LIZJ(X.09Gk):void");
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZLLL, this.LIZ, c2344009Gk);
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        this.LIZLLL = str;
        this.LIZ = aweme;
        this.LIZIZ = anchorCommonStruct;
        this.LIZJ = aweme.getPoiDataStruct();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null || anchors.size() <= 0 || anchorCommonStruct.getType() != EnumC1430380nKG.POI.getTYPE()) {
            return false;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme)) || aweme.getPoiDataStruct() == null) {
            return false;
        }
        return true;
    }
}
