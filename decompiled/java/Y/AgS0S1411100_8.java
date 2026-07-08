package Y;

import X.AbstractC1437870nWL;
import X.C0MKE;
import X.C0MKF;
import X.C0MKJ;
import X.C0ML7;
import X.C0MLM;
import X.C13LP;
import X.C1431780nMW;
import X.C1438570nXT;
import X.C1439360nYk;
import X.C566860MLc;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AgS0S1411100_8 implements InterfaceC346701Wf {
    public final int $t;
    public int i6;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

    @Override // X.InterfaceC346701Wf
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C0MKF r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS0S1411100_8.LIZ$0(X.0MKF, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$0(AgS0S1411100_8 agS0S1411100_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS0S1411100_8.LIZ$0((C0MKF) obj, interfaceC1364105Vn);
    }

    public static final Object emit$1(AgS0S1411100_8 agS0S1411100_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Bundle extras;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        Pair pair = (Pair) obj;
        if (((C0MLM) agS0S1411100_8.l1).LLIZLLLIL) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jX1 = ((C0MLM) agS0S1411100_8.l1).X1(agS0S1411100_8.j7);
            int i = agS0S1411100_8.i6;
            String str = agS0S1411100_8.s0;
            c0ml7.getClass();
            C0ML7.LJIIJJI(2, 0, i, jX1, str, "");
            return Unit.LIZ;
        }
        C0ML7 c0ml72 = C0ML7.LIZ;
        long jX12 = ((C0MLM) agS0S1411100_8.l1).X1(agS0S1411100_8.j7);
        int i2 = agS0S1411100_8.i6;
        String str2 = agS0S1411100_8.s0;
        c0ml72.getClass();
        C0ML7.LJIIJJI(0, 0, i2, jX12, str2, "");
        C0MKJ c0mkj = C0MKJ.LIZ;
        Context context = (Context) agS0S1411100_8.l2;
        C0MKE c0mke = (C0MKE) pair.getFirst();
        CanvasVideoData canvasVideoData = (CanvasVideoData) pair.getSecond();
        VideoPublishEditModel videoPublishEditModelH2 = ((C0MLM) agS0S1411100_8.l1).H2();
        c0mkj.getClass();
        Intent intentLJIILIIL = C0MKJ.LJIILIIL(context, c0mke, canvasVideoData, videoPublishEditModelH2);
        new C1438570nXT("forward");
        try {
            extras = intentLJIILIIL.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        C1438570nXT.LJII(extras, ((C0MLM) agS0S1411100_8.l1).H2());
        ((C0MLM) agS0S1411100_8.l1).o2((ForwardMedia) agS0S1411100_8.l3);
        C1431780nMW c1431780nMW = C1431780nMW.LIZ;
        VideoPublishEditModel videoPublishEditModelH22 = ((C0MLM) agS0S1411100_8.l1).H2();
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(((C0MLM) agS0S1411100_8.l1).H2());
        c1431780nMW.getClass();
        C1431780nMW.LJIIIZ(videoPublishEditModelH22, abstractC1437870nWLLIZ, false);
        PhotoModeImageInfo photoModeImageInfo = ((ForwardMedia) agS0S1411100_8.l3).photoModeImageInfo;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && photoModeImageUrlModel.displayImageNoWatermark != null) {
            C566860MLc.LIZ(((C0MLM) agS0S1411100_8.l1).H2());
        }
        ((C0MLM) agS0S1411100_8.l1).W1(agS0S1411100_8.z5, (ForwardMedia) agS0S1411100_8.l3);
        ((C0MLM) agS0S1411100_8.l1).H2().creativeModel.stickerModel.textUseNewEngine = true;
        if (agS0S1411100_8.z5) {
            ((C0MLM) agS0S1411100_8.l1).c3().iX(new AwS552S0100000_8((CreativeLoadingDialog) agS0S1411100_8.l4, 661));
        } else {
            ((C0MLM) agS0S1411100_8.l1).T2().MC(new AwS552S0100000_8((CreativeLoadingDialog) agS0S1411100_8.l4, 662));
        }
        return Unit.LIZ;
    }

    public AgS0S1411100_8(C0MLM c0mlm, long j, int i, String str, Context context, ForwardMedia forwardMedia, boolean z, CreativeLoadingDialog creativeLoadingDialog, int i2) {
        this.$t = i2;
        this.l1 = c0mlm;
        this.j7 = j;
        this.i6 = i;
        this.s0 = str;
        this.l2 = context;
        this.l3 = forwardMedia;
        this.z5 = z;
        this.l4 = creativeLoadingDialog;
    }
}
