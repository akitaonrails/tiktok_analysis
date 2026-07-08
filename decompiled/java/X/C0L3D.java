package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0L3D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3D extends C0L7R {
    public final ShortVideoContext LJJIZ;
    public final int LJJJ;
    public final float LJJJI;

    @Override // X.C0L7R
    public final void LJJJJZ(int i) {
        int i2 = (int) (i * this.LJJJI);
        if (i2 != 0) {
            i = i2;
        }
        super.LJJJJZ(i);
    }

    public final void LJJJJZI(long j) {
        int i;
        if (j == 0) {
            i = this.LJJJ;
        } else {
            i = (int) (this.LJJJ / j);
        }
        super.LJJJJZ(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:45))(0)|7|(1:(1:(2:11|12)(2:46|47))(1:30))(3:13|(3:29|25|(1:27))(2:15|(7:17|(3:20|(2:51|22)(1:52)|18)|50|28|(1:24)(0)|25|(0))(4:28|(0)(0)|25|(0)))|12)|31|48|32|35|(4:37|(1:39)|40|41)(2:42|(1:44)(1:12))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    @Override // X.C0L7R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJLIJ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r13, android.content.Intent r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L3D.LJJIJLIJ(java.util.List, android.content.Intent, X.05Vn):java.lang.Object");
    }

    public C0L3D(Activity activity, ShortVideoContext shortVideoContext, long j, long j2) {
        super(activity, j, j2, 24);
        this.LJJIZ = shortVideoContext;
        this.LJJJ = 20;
        this.LJJJI = 80 / 100.0f;
    }

    @Override // X.C0L7R
    public final Object LJJJJL(Intent intent, List<? extends VideoSegment> list, List<? extends AVMusic> list2, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel, boolean z, List<? extends MediaModel> list3, boolean z2, boolean z3, int i, InterfaceC1631620sYq<? super Intent, ? super Boolean, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        C0ML7.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (VideoSegment videoSegment : list) {
            linkedHashMap.put(videoSegment.originPath, videoSegment.LJFF(false));
        }
        ArrayList<OnThisDayPostData> arrayList2 = new ArrayList<>();
        ArrayList<OnThisDayPostData> postDataList = creativeModelLIZIZ.onThisDayData.getPostDataList();
        if (postDataList != null) {
            for (OnThisDayPostData onThisDayPostData : postDataList) {
                OnThisDayPostData onThisDayPostDataCopy = onThisDayPostData.copy(onThisDayPostData.aid, onThisDayPostData.recallType, new ArrayList<>());
                arrayList2.add(onThisDayPostDataCopy);
                ArrayList<String> resList = onThisDayPostData.getResList();
                if (resList != null) {
                    for (String str : resList) {
                        String str2 = (String) linkedHashMap.get(str);
                        if (str2 != null) {
                            str = str2;
                        }
                        ArrayList<String> resList2 = onThisDayPostDataCopy.getResList();
                        if (resList2 != null) {
                            resList2.add(new C0VSJ(str).getName());
                        }
                    }
                }
            }
        }
        creativeModelLIZIZ.onThisDayData.setPostDataList(arrayList2);
        C0MUK.LJIIIZ(intent, creativeModelLIZIZ);
        return super.LJJJJL(intent, list, list2, arrayList, cut2EditTransferModel, z, list3, z2, z3, i, interfaceC1631620sYq, interfaceC1364105Vn);
    }
}
