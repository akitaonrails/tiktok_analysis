package Y;

import X.C0FNV;
import X.C0MKE;
import X.C0MKF;
import X.C0MKJ;
import X.C0ML7;
import X.C1388190mED;
import X.C1660680tJi;
import X.C19EG;
import X.C259800zU;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.ProgressDialogC1399790mWv;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AgS0S0411100_8 implements InterfaceC346701Wf {
    public final int $t;
    public int i5;
    public long j6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(AgS0S0411100_8 agS0S0411100_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        if (agS0S0411100_8.z4) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - agS0S0411100_8.j6;
            int i = agS0S0411100_8.i5;
            c0ml7.getClass();
            C0ML7.LJIIJJI(0, 0, i, jCurrentTimeMillis, "edit", "");
        }
        C0MKJ c0mkj = C0MKJ.LIZ;
        Context context = (Context) agS0S0411100_8.l0;
        C0MKE c0mke = (C0MKE) pair.getFirst();
        CanvasVideoData canvasVideoData = (CanvasVideoData) pair.getSecond();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) agS0S0411100_8.l1;
        c0mkj.getClass();
        C1660680tJi.LIZ().LJIILIIL(context, C0MKJ.LJIILIIL(context, c0mke, canvasVideoData, videoPublishEditModel));
        Dialog dialog = (Dialog) ((C259800zU) agS0S0411100_8.l2).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
            C0MKJ.LJ();
        }
        CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) ((C259800zU) agS0S0411100_8.l3).element;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
            C0MKJ.LJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$1(AgS0S0411100_8 agS0S0411100_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0MKF c0mkf = (C0MKF) obj;
        if (agS0S0411100_8.z4) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - agS0S0411100_8.j6;
            int i = agS0S0411100_8.i5;
            c0ml7.getClass();
            C0ML7.LJIIJJI(0, 0, i, jCurrentTimeMillis, "edit", "");
        }
        C0MKJ c0mkj = C0MKJ.LIZ;
        Context context = (Context) agS0S0411100_8.l0;
        final ProgressDialogC1399790mWv progressDialogC1399790mWv = (ProgressDialogC1399790mWv) ((C259800zU) agS0S0411100_8.l1).element;
        final CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) ((C259800zU) agS0S0411100_8.l2).element;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) agS0S0411100_8.l3;
        c0mkj.getClass();
        Bundle bundleLJIILL = C0MKJ.LJIILL(context, c0mkf, videoPublishEditModel);
        IOpenPhotoNextService iOpenPhotoNextServiceOpenGotoNextService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openGotoNextService();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            iOpenPhotoNextServiceOpenGotoNextService.gotoNextPage(c19egLIZIZ, false, bundleLJIILL, c0mkf.LJ, new IPageToFinish() { // from class: X.0MHX
                @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                public final void onFinish(boolean z) {
                    ProgressDialogC1399790mWv progressDialogC1399790mWv2 = progressDialogC1399790mWv;
                    if (progressDialogC1399790mWv2 != null) {
                        C0FNV.LIZ(progressDialogC1399790mWv2);
                    }
                    CreativeLoadingDialog creativeLoadingDialog2 = creativeLoadingDialog;
                    if (creativeLoadingDialog2 != null) {
                        creativeLoadingDialog2.dismiss();
                    }
                }
            });
            if (((C259800zU) agS0S0411100_8.l1).element != 0) {
                C0MKJ.LJ();
            }
            if (((C259800zU) agS0S0411100_8.l2).element != 0) {
                C0MKJ.LJ();
            }
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AgS0S0411100_8(int r2, long r3, android.content.Context r5, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, X.C259800zU r7, X.C259800zU r8, boolean r9, int r10) {
        /*
            r1 = this;
            r1.$t = r10
            if (r10 == 0) goto L17
            r0 = r1
            r0.z4 = r9
            r0.j6 = r3
            r0.i5 = r2
            r0.l0 = r5
            r0.l1 = r7
            r0.l2 = r8
            r0.l3 = r6
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.z4 = r9
            r0.j6 = r3
            r0.i5 = r2
            r0.l0 = r5
            r0.l1 = r6
            r0.l2 = r7
            r0.l3 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS0S0411100_8.<init>(int, long, android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.00zU, X.00zU, boolean, int):void");
    }
}
