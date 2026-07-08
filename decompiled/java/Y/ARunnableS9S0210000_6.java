package Y;

import X.C098200Yq;
import X.C0HBZ;
import X.C1378990lzN;
import X.C1398620mV2;
import X.C189200o6;
import X.C1C7U;
import X.C339190DRl;
import X.C415480GQw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.ViewOnClickListenerC725830SdZ;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardLogicAssem;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS9S0210000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S0210000_6.LIZ$0():void");
    }

    public final void LIZ$1() {
        if (((C1398620mV2) this.l0).LLJLLL) {
            if (this.z2) {
                ((TransitionDrawable) this.l1).resetTransition();
                ((TransitionDrawable) this.l1).reverseTransition(LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                ((TransitionDrawable) this.l1).resetTransition();
                ((TransitionDrawable) this.l1).startTransition(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            C1398620mV2 c1398620mV2 = (C1398620mV2) this.l0;
            HandlerHook.viewPostDelay(c1398620mV2.LLILLJJLI, new ARunnableS9S0210000_6(c1398620mV2, (TransitionDrawable) this.l1, !this.z2, 2), 1200L);
        }
    }

    public final void LIZ$2() {
        Object c098200Yq;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.l0;
        StoryGuideUploadCardLogicAssem storyGuideUploadCardLogicAssem = (StoryGuideUploadCardLogicAssem) this.l1;
        boolean z = this.z2;
        try {
            int measuredWidth = constraintLayout.getMeasuredWidth() > 0 ? constraintLayout.getMeasuredWidth() : C497820Jfg.LIZIZ(constraintLayout.getContext());
            int measuredHeight = constraintLayout.getMeasuredHeight() > 0 ? constraintLayout.getMeasuredHeight() : C497820Jfg.LIZ(constraintLayout.getContext()) - storyGuideUploadCardLogicAssem.LLLIIIIL;
            StoryGuideUploadCardManager.LL.getClass();
            Bitmap bitmapCreateBitmap = ((C0HBZ) StoryGuideUploadCardManager.LLIZ.getValue()).LIZJ;
            if (bitmapCreateBitmap == null || !z) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredHeight, (int[]) storyGuideUploadCardLogicAssem.LLLI.getValue(), (float[]) storyGuideUploadCardLogicAssem.LLLII.getValue(), Shader.TileMode.CLAMP));
                bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, (Bitmap.Config) storyGuideUploadCardLogicAssem.LLLIIIL.getValue());
                new Canvas(bitmapCreateBitmap).drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(constraintLayout.getResources(), bitmapCreateBitmap);
            C1378990lzN.LIZIZ(constraintLayout, Float.valueOf(C339190DRl.LIZ(12)), null, null, null, null, 30);
            constraintLayout.setBackground(bitmapDrawable);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static final void run$0(ARunnableS9S0210000_6 aRunnableS9S0210000_6) {
        boolean zLIZ;
        float f;
        C1C7U.LIZ("BaseBulletinBarAssem@9ce8.updateMuteButtonIcon$1");
        try {
            C415480GQw c415480GQwJo = ((BaseBulletinBarAssem) aRunnableS9S0210000_6.l0).Jo();
            if (c415480GQwJo != null) {
                if (aRunnableS9S0210000_6.z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c415480GQwJo.LIZIZ = f;
                c415480GQwJo.invalidateSelf();
            }
            C786410Ut5.T4((View) aRunnableS9S0210000_6.l1, 1.0f);
            ((View) aRunnableS9S0210000_6.l1).invalidate();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseBulletinBarAssem@9ce8.updateMuteButtonIcon$1");
    }

    public static final void run$1(ARunnableS9S0210000_6 aRunnableS9S0210000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StyleBubbleView@959f.animatorEasyInOut$1");
        try {
            aRunnableS9S0210000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StyleBubbleView@959f.animatorEasyInOut$1");
    }

    public static final void run$2(ARunnableS9S0210000_6 aRunnableS9S0210000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailAwemeViewHolder@87e5.transitionDrawable$1");
        try {
            aRunnableS9S0210000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailAwemeViewHolder@87e5.transitionDrawable$1");
    }

    public static final void run$3(ARunnableS9S0210000_6 aRunnableS9S0210000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VSAMultiPhotoItemView@b4f6.startScaleAnim$1");
        try {
            if (aRunnableS9S0210000_6.z2) {
                ViewOnClickListenerC725830SdZ.i0((ViewOnClickListenerC725830SdZ) aRunnableS9S0210000_6.l0, (View) aRunnableS9S0210000_6.l1, 1.0f, 1000L, false, 8);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VSAMultiPhotoItemView@b4f6.startScaleAnim$1");
    }

    public static final void run$4(ARunnableS9S0210000_6 aRunnableS9S0210000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StoryGuideUploadCardLogicAssem@82fe.renderBackground$1$1");
        try {
            aRunnableS9S0210000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryGuideUploadCardLogicAssem@82fe.renderBackground$1$1");
    }

    public ARunnableS9S0210000_6(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
