package Y;

import X.C1417310mzB;
import X.C1417330mzD;
import X.C1431840nMc;
import X.C1440005kM;
import X.C1457270o1d;
import X.C1C7U;
import X.C2188811AlT;
import X.ExecutorC527170Klv;
import X.InterfaceC1446740nke;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.ISampledBitmapDecoderService;
import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS17S1300000_22 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Bitmap bitmapLIZ;
        C1457270o1d.LIZ.getClass();
        ISampledBitmapDecoderService iSampledBitmapDecoderService = (ISampledBitmapDecoderService) C1457270o1d.LJ.getValue();
        if (iSampledBitmapDecoderService == null || (bitmapLIZ = iSampledBitmapDecoderService.LIZ((Context) this.l1, this.s0, 1080, Bitmap.Config.RGB_565, false)) == null) {
            C1457270o1d.LJ("[legacy] decode returned null");
            return;
        }
        if (!C1457270o1d.LIZIZ) {
            bitmapLIZ.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ);
            C1457270o1d.LJ("[legacy] decode completed but placeholder already cleared, bitmap recycled");
            return;
        }
        ImageView.ScaleType scaleTypeLJIIIIZZ = C1457270o1d.LJIIIIZZ(bitmapLIZ.getWidth(), bitmapLIZ.getHeight());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[legacy] decoded: ");
        sbLIZ.append(bitmapLIZ.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(bitmapLIZ.getHeight());
        sbLIZ.append(", scaleType=");
        sbLIZ.append(scaleTypeLJIIIIZZ);
        C1457270o1d.LJ(C2188811AlT.LIZIZ(sbLIZ));
        ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS30S0400000_22(bitmapLIZ, (ImageView) this.l2, scaleTypeLJIIIIZZ, (InterfaceC1446740nke) this.l3, 2));
    }

    public final void LIZ$1() {
        VideoPublishEditModel videoPublishEditModelClone = ((SendToDMComponent) this.l1).m3().clone();
        videoPublishEditModelClone.creativeModel.dmMediaModel = new DMMediaModel(3, "", "", "", false, true, true, null);
        IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEventX1 = ((SendToDMComponent) this.l1).X1(new IMMediaPublishEvent.DMRecordMediaPublishEvent("", videoPublishEditModelClone, true, true, null, null, false, !r1.m3().creativeModel.stickerModel.textStickerModels.isEmpty(), this.s0, null, null, false, false, false, (Map) this.l2), videoPublishEditModelClone);
        ((SendToDMComponent) this.l1).uu("update video publish event");
        C1440005kM.LIZIZ(new C1431840nMc(dMRecordMediaPublishEventX1));
        ((SendToDMComponent) this.l1).v3();
        Function1 function1 = (Function1) this.l3;
        if (function1 != null) {
            function1.invoke((Map) this.l2);
        }
    }

    public static final void run$0(ARunnableS17S1300000_22 aRunnableS17S1300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditAutoCutComponent@9215.ensureReuseMusicDownloadedThenApply$1$onSuccess$1");
        try {
            AVMusic aVMusic = (AVMusic) aRunnableS17S1300000_22.l1;
            String str = aRunnableS17S1300000_22.s0;
            aVMusic.path = str;
            C1417310mzB c1417310mzB = (C1417310mzB) aRunnableS17S1300000_22.l2;
            c1417310mzB.LJFF = str;
            C1417330mzD c1417330mzD = (C1417330mzD) aRunnableS17S1300000_22.l3;
            C1417310mzB c1417310mzB2 = c1417330mzD.LLLLLJIL;
            if (c1417310mzB2 != null && c1417330mzD.Nc(c1417310mzB2, c1417310mzB)) {
                C1417330mzD.O4((C1417330mzD) aRunnableS17S1300000_22.l3, (C1417310mzB) aRunnableS17S1300000_22.l2, false, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditAutoCutComponent@9215.ensureReuseMusicDownloadedThenApply$1$onSuccess$1");
    }

    public static final void run$1(ARunnableS17S1300000_22 aRunnableS17S1300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$2");
        try {
            aRunnableS17S1300000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$2");
    }

    public static final void run$2(ARunnableS17S1300000_22 aRunnableS17S1300000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$4");
        try {
            aRunnableS17S1300000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$4");
    }

    public ARunnableS17S1300000_22(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
