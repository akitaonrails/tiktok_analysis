package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenGamePlayAssem;
import com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity;

/* JADX INFO: renamed from: X.0P4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639030P4r implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C639030P4r c639030P4r) {
    }

    public static final void onProgress$0(C639030P4r c639030P4r, float f) {
    }

    public static final void onProgress$1(C639030P4r c639030P4r, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                C0OPX.LJIIIIZZ("GamePlay background preload canceled");
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public C639030P4r(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C639030P4r c639030P4r, Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParams;
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            SmartImageView smartImageView = ((EditorProAnchorGuideActivity) c639030P4r.l0).LLJIJIL;
            if (smartImageView != null && (layoutParams = smartImageView.getLayoutParams()) != null) {
                EditorProAnchorGuideActivity editorProAnchorGuideActivity = (EditorProAnchorGuideActivity) c639030P4r.l0;
                layoutParams.height = (int) ((C497820Jfg.LIZIZ(editorProAnchorGuideActivity) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) / width);
                SmartImageView smartImageView2 = editorProAnchorGuideActivity.LLJIJIL;
                if (smartImageView2 != null) {
                    C786410Ut5.G6(smartImageView2, layoutParams);
                }
            }
            SmartImageView smartImageView3 = ((EditorProAnchorGuideActivity) c639030P4r.l0).LLJIJIL;
            if (smartImageView3 != null) {
                smartImageView3.setImageBitmap(bitmap);
                return;
            }
            return;
        }
        c639030P4r.onFailed(null);
    }

    public static final void LIZ$1(C639030P4r c639030P4r, Bitmap bitmap) {
        BulletinFullScreenGamePlayAssem bulletinFullScreenGamePlayAssem = (BulletinFullScreenGamePlayAssem) c639030P4r.l0;
        bulletinFullScreenGamePlayAssem.LLJJ = bitmap;
        bulletinFullScreenGamePlayAssem.LLJILLL = true;
        C0OPX.LJII("GamePlay background preloaded successfully");
        if (((BulletinFullScreenGamePlayAssem) c639030P4r.l0).So()) {
            ((BulletinFullScreenGamePlayAssem) c639030P4r.l0).Go();
        }
    }

    public static final void onFailed$0(C639030P4r c639030P4r, Throwable th) {
        ((EditorProAnchorGuideActivity) c639030P4r.l0).LLLLZI(C592920NNi.LIZ);
    }

    public static final void onFailed$1(C639030P4r c639030P4r, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamePlay background preload failed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
