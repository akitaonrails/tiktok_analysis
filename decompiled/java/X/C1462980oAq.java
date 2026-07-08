package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VETimelineParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462980oAq implements InterfaceC574710MgP {
    public final InterfaceC1452170ntP LIZ;
    public final C1463500oBg LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public VETimelineParams LJI;
    public C1463750oC5 LJII;
    public boolean LJIIIIZZ;
    public final Map<String, String> LIZLLL = new LinkedHashMap();
    public final Map<String, String> LJ = new LinkedHashMap();
    public int LJFF = -1;
    public boolean LJIIIZ = true;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData LIZLLL() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LIZJ
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r0.getAILivePhotoModel()
            boolean r0 = r0.LJII()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LIZJ
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r1 = r0.getCurMultiEditVideoRecordData()
        L12:
            if (r1 != 0) goto L19
        L14:
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r1 = new com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData
            r1.<init>()
        L19:
            java.util.List<com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData> r0 = r1.segmentDataList
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.setThreadSafeSegmentDataList(r0)
        L25:
            return r1
        L26:
            X.0oBg r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData r0 = r0.LIZLLL
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r1 = r0.curMultiEditVideoRecordData
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462980oAq.LIZLLL():com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData");
    }

    public final void LJ(int i, int i2) {
        this.LIZ.uf(i, i2);
    }

    public final void LJFF(int i, int i2) {
        if (!this.LIZIZ.LIZIZ) {
            ((MultiEditVideoSegmentRecordData) ListProtector.get(LIZLLL().segmentDataList, i)).rotate = i2;
        }
        if (C1462990oAr.LIZ(this.LIZIZ)) {
            VETimelineParams vETimelineParamsLIZLLL = this.LJI;
            if (vETimelineParamsLIZLLL == null) {
                vETimelineParamsLIZLLL = C574800MgY.LIZLLL(LIZLLL());
            }
            if (i >= 0) {
                ROTATE_DEGREE[] rotate_degreeArr = vETimelineParamsLIZLLL.rotate;
                if (i < rotate_degreeArr.length) {
                    rotate_degreeArr[i] = C571620MbQ.LIZJ(i2);
                }
            }
            if (C301400Bre.LIZ()) {
                this.LIZ.Sf(vETimelineParamsLIZLLL, true, i, false);
                return;
            } else {
                this.LIZ.Sf(vETimelineParamsLIZLLL, true, -1, false);
                return;
            }
        }
        C1463750oC5 c1463750oC5LIZJ = this.LJII;
        if (c1463750oC5LIZJ == null) {
            c1463750oC5LIZJ = LIZJ(LIZLLL(), false, this.LIZLLL, this.LJ, i);
        }
        ROTATE_DEGREE[] rotate_degreeArr2 = c1463750oC5LIZJ.LJIIJ;
        if (rotate_degreeArr2 != null) {
            rotate_degreeArr2[0] = C571620MbQ.LIZJ(i2);
        }
        this.LIZ.Lf(c1463750oC5LIZJ, false);
    }

    public C1462980oAq(InterfaceC1452170ntP interfaceC1452170ntP, C1463500oBg c1463500oBg, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = interfaceC1452170ntP;
        this.LIZIZ = c1463500oBg;
        this.LIZJ = videoPublishEditModel;
        if (c1463500oBg.LIZ != 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1219770hqZ(this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    @Override // X.InterfaceC574710MgP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(kotlin.Pair r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462980oAq.LIZIZ(kotlin.Pair, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String[]] */
    public static C1463750oC5 LIZJ(MultiEditVideoRecordData multiEditVideoRecordData, boolean z, Map map, Map map2, int i) {
        ?? arrayList;
        if (i >= 0 && i < multiEditVideoRecordData.segmentDataList.size()) {
            arrayList = Collections.singletonList(ListProtector.get(multiEditVideoRecordData.segmentDataList, i));
        } else if (z && !C301400Bre.LIZ()) {
            arrayList = multiEditVideoRecordData.segmentDataList;
        } else {
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
            arrayList = new ArrayList();
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (multiEditVideoSegmentRecordData.enable) {
                    arrayList.add(multiEditVideoSegmentRecordData);
                }
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        ?? r5 = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            r5[i2] = "";
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        String[] strArr2 = new String[size];
        Object[] objArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = "";
        }
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        float[] fArr3 = new float[size];
        Iterator it2 = arrayList.iterator();
        int i4 = 0;
        while (true) {
            String[] strArr3 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) next;
                    String str = multiEditVideoSegmentRecordData2.videoPath;
                    strArr[i4] = str;
                    Object obj = ((LinkedHashMap) map).get(str);
                    if (obj == null) {
                        obj = "";
                    }
                    r5[i4] = obj;
                    iArr[i4] = (int) multiEditVideoSegmentRecordData2.getStartTime();
                    iArr2[i4] = (int) multiEditVideoSegmentRecordData2.getEndTime();
                    fArr[i4] = multiEditVideoSegmentRecordData2.getVideoSpeed();
                    String str2 = multiEditVideoSegmentRecordData2.audioPath;
                    strArr2[i4] = str2;
                    Object obj2 = ((LinkedHashMap) map2).get(str2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    objArr[i4] = obj2;
                    iArr3[i4] = (int) (multiEditVideoSegmentRecordData2.getStartTime() * multiEditVideoSegmentRecordData2.audioSpeed);
                    float endTime = multiEditVideoSegmentRecordData2.getEndTime();
                    float f = multiEditVideoSegmentRecordData2.audioSpeed;
                    iArr4[i4] = (int) (endTime * f);
                    fArr2[i4] = f;
                    rotate_degreeArr[i4] = C571620MbQ.LIZJ(multiEditVideoSegmentRecordData2.rotate);
                    fArr3[i4] = multiEditVideoSegmentRecordData2.scale;
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = 0; i6 < size; i6++) {
                    String str3 = strArr2[i6];
                    if (str3 != null && str3.length() != 0) {
                        arrayList2.add(str3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    objArr = null;
                } else {
                    strArr3 = strArr2;
                }
                return new C1463750oC5(strArr, r5, iArr, iArr2, fArr, strArr3, objArr, iArr3, iArr4, fArr2, rotate_degreeArr, fArr3);
            }
        }
    }

    @Override // X.InterfaceC574710MgP
    public final boolean LIZ(float f, float f2, float f3, int i, int i2) {
        this.LIZ.setDisplayState(f2, f3, f, i, i2);
        return true;
    }
}
