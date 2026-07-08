package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.tasm.LynxError;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339420kxY extends C1320700kTM {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, th);
                break;
            case 1:
                LIZLLL$1(this, str, th);
                break;
            default:
                super.LIZLLL(str, th);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    public C1339420kxY(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public static final void LIZLLL$0(C1339420kxY c1339420kxY, String str, Throwable th) {
        String message;
        if (th == null) {
            message = "unknown";
        } else {
            message = th.getMessage();
        }
        LynxError lynxError = new LynxError(C846560XIw.LIZIZ(C846560XIw.LIZ(th)), "Failed to load image: ", "", "error");
        lynxError.LJIIIIZZ(message);
        C1315840kLW c1315840kLW = (C1315840kLW) c1339420kxY.l1;
        c1315840kLW.LIZJ.LJJIFFI(c1315840kLW.LJ, "image", lynxError);
    }

    public static final void LIZLLL$1(C1339420kxY c1339420kxY, String str, Throwable th) {
        ((Function0) c1339420kxY.l1).invoke();
        C1320700kTM c1320700kTM = (C1320700kTM) c1339420kxY.l0;
        if (c1320700kTM != null) {
            c1320700kTM.LIZLLL(str, th);
        }
    }

    public static final void LJ$0(C1339420kxY c1339420kxY, String str, Object obj, Animatable animatable) {
        MarkdownShadowNode markdownShadowNode;
        MarkdownShadowNode markdownShadowNode2;
        C1315840kLW c1315840kLW = (C1315840kLW) c1339420kxY.l1;
        float f = c1315840kLW.LIZJ.LLJJJ.density;
        if (obj instanceof C1325120kaU) {
            C1323050kX9<Bitmap> c1323050kX9CloneUnderlyingBitmapReference = ((C1325120kaU) obj).cloneUnderlyingBitmapReference();
            if (c1323050kX9CloneUnderlyingBitmapReference == null) {
                LynxError lynxError = new LynxError(30102, "Failed to load image，the reason is get null bitmap reference from response", "", "error");
                C1315840kLW c1315840kLW2 = (C1315840kLW) c1339420kxY.l1;
                c1315840kLW2.LIZJ.LJJIFFI(c1315840kLW2.LJ, "image", lynxError);
                return;
            }
            if (c1323050kX9CloneUnderlyingBitmapReference.get() == null) {
                LynxError lynxError2 = new LynxError(30102, "Failed to load image，the reason is get null bitmap from response", "", "error");
                C1315840kLW c1315840kLW3 = (C1315840kLW) c1339420kxY.l1;
                c1315840kLW3.LIZJ.LJJIFFI(c1315840kLW3.LJ, "image", lynxError2);
                return;
            }
            ((C1315840kLW) c1339420kxY.l1).LIZ = (int) (r2.getWidth() * f);
            ((C1315840kLW) c1339420kxY.l1).LIZIZ = (int) (r2.getHeight() * f);
            ((C1315840kLW) c1339420kxY.l1).LIZLLL = true;
            WeakReference<MarkdownShadowNode> weakReference = ((C1315280kKc) c1339420kxY.l0).LLILLJJLI;
            if (weakReference == null || (markdownShadowNode2 = weakReference.get()) == null) {
                return;
            }
            markdownShadowNode2.LJJIJIIJI(new ARunnableS120S0100000_20(markdownShadowNode2, 160));
            return;
        }
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            c1315840kLW.LIZ = (int) (animatedDrawable2.getIntrinsicWidth() * f);
            ((C1315840kLW) c1339420kxY.l1).LIZIZ = (int) (animatedDrawable2.getIntrinsicHeight() * f);
            animatedDrawable2.LJI(new C1316320kMI(animatedDrawable2.LLILLL, 0));
            C1315790kLR.LIZJ(animatedDrawable2);
            ((C1315840kLW) c1339420kxY.l1).LIZLLL = true;
            WeakReference<MarkdownShadowNode> weakReference2 = ((C1315280kKc) c1339420kxY.l0).LLILLJJLI;
            if (weakReference2 != null && (markdownShadowNode = weakReference2.get()) != null) {
                markdownShadowNode.LJJIJIIJI(new ARunnableS120S0100000_20(markdownShadowNode, 160));
            }
        }
    }

    public static final void LJ$1(C1339420kxY c1339420kxY, String str, Object obj, Animatable animatable) {
        C1320700kTM c1320700kTM = (C1320700kTM) c1339420kxY.l0;
        if (c1320700kTM != null) {
            c1320700kTM.LJ(str, obj, animatable);
        }
    }
}
