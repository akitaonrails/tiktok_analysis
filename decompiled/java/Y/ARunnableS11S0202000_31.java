package Y;

import X.C0JBN;
import X.C1324610kZf;
import X.C1338270kvh;
import X.C15JN;
import X.C15KT;
import X.C1ANM;
import X.C1C7U;
import X.C20430614wy;
import X.C204524151e;
import X.C500260Jjc;
import X.EnumC1083750eJB;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS11S0202000_31 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        int iMax = Math.max(((View) ((C20430614wy) this.l0).LLILLL.getValue()).getHeight(), ((View) ((C20430614wy) this.l0).LLILZ.getValue()).getHeight() + ((C20430614wy) this.l0).L5().getHeight());
        ImageModel imageModel = ((BannerContentMultiGuest) this.l1).coreImage;
        if (imageModel == null || (str = imageModel.mUri) == null || str.length() <= 0) {
            C500260Jjc.LJLL(0, 0, (View) ((C20430614wy) this.l0).LLILZLL.getValue());
        } else {
            C500260Jjc.LJLL(this.i2, iMax, (View) ((C20430614wy) this.l0).LLILZLL.getValue());
            C1324610kZf c1324610kZfLJIIIZ = ((C0JBN) ((C20430614wy) this.l0).LLJ.getValue()).LJIIIZ(((BannerContentMultiGuest) this.l1).coreImage);
            c1324610kZfLJIIIZ.LJJIFFI = true;
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.MATRIX;
            c1324610kZfLJIIIZ.LJIILLIIL = EnumC1083750eJB.LEFT;
            c1324610kZfLJIIIZ.LJ = this.i2;
            c1324610kZfLJIIIZ.LJFF = iMax;
            c1324610kZfLJIIIZ.LJJI((View) ((C20430614wy) this.l0).LLILZLL.getValue());
        }
        if (((BannerContentMultiGuest) this.l1).backgroundImage != null) {
            C500260Jjc.LJLL(this.i3, iMax, (View) ((C20430614wy) this.l0).LLIZ.getValue());
            C1324610kZf c1324610kZfLJIIIZ2 = ((C0JBN) ((C20430614wy) this.l0).LLJI.getValue()).LJIIIZ(((BannerContentMultiGuest) this.l1).backgroundImage);
            c1324610kZfLJIIIZ2.LJJIFFI = true;
            c1324610kZfLJIIIZ2.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ2.LJ = this.i3;
            c1324610kZfLJIIIZ2.LJFF = iMax;
            c1324610kZfLJIIIZ2.LJJI((View) ((C20430614wy) this.l0).LLIZ.getValue());
        }
    }

    public final void LIZ$1() {
        try {
            ((C204524151e) this.l0).LIZLLL((ByteBuffer) this.l1, this.i2, this.i3);
            C204524151e c204524151e = (C204524151e) this.l0;
            Map<String, Object> map = C1338270kvh.LIZ;
            c204524151e.LJ((ByteBuffer) this.l1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C204524151e c204524151e2 = (C204524151e) this.l0;
            Map<String, Object> map2 = C1338270kvh.LIZ;
            c204524151e2.LJ((ByteBuffer) this.l1);
            throw th;
        }
    }

    public static final void run$0(ARunnableS11S0202000_31 aRunnableS11S0202000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CommonBannerViewHolder@a6a3.onBindViewHolder$1$3");
        try {
            aRunnableS11S0202000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommonBannerViewHolder@a6a3.onBindViewHolder$1$3");
    }

    public static final void run$1(ARunnableS11S0202000_31 aRunnableS11S0202000_31) {
        boolean zLIZ;
        C1C7U.LIZ("RecordMusicCutScene@5483.onProgress$1");
        try {
            if (((View) aRunnableS11S0202000_31.l0).getParent() != null) {
                C15KT c15kt = (C15KT) aRunnableS11S0202000_31.l1;
                int i = c15kt.LLJILLL;
                int i2 = aRunnableS11S0202000_31.i2;
                C15JN c15jn = null;
                if (i < i2) {
                    C15JN c15jn2 = c15kt.LLJILJILJ;
                    if (c15jn2 != null) {
                        c15jn = c15jn2;
                    }
                    c15jn.BJ(((aRunnableS11S0202000_31.i3 - c15kt.LLJJIJI) * 1.0f) / i2);
                } else {
                    C15JN c15jn3 = c15kt.LLJILJILJ;
                    if (c15jn3 != null) {
                        c15jn = c15jn3;
                    }
                    c15jn.BJ(((aRunnableS11S0202000_31.i3 - c15kt.LLJJIJI) * 1.0f) / i);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordMusicCutScene@5483.onProgress$1");
    }

    public static final void run$2(ARunnableS11S0202000_31 aRunnableS11S0202000_31) {
        boolean zLIZ;
        C1C7U.LIZ("GameLiveInternalRecordDetectManager@c6fc.onData$posted$1");
        try {
            aRunnableS11S0202000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLiveInternalRecordDetectManager@c6fc.onData$posted$1");
    }

    public static final void run$3(ARunnableS11S0202000_31 aRunnableS11S0202000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CameoPlayerScene@cabc.applyFitCenterSize$1");
        try {
            C1ANM.LLLLLJLJLL((FrameLayout) aRunnableS11S0202000_31.l0, aRunnableS11S0202000_31.i2, aRunnableS11S0202000_31.i3, (FrameLayout) aRunnableS11S0202000_31.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameoPlayerScene@cabc.applyFitCenterSize$1");
    }

    public ARunnableS11S0202000_31(Object obj, Object obj2, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
        this.i3 = i2;
    }
}
