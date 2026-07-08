package X;

import Y.AObjectS368S0100000_25;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.gamora.recorder.configs.UpdateAlbumUploadButtonPlaceholderImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0spl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1642110spl extends FrameLayout implements InterfaceC535290Kz1 {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C1325000kaI LL;
    public TuxIconView LLILLJJLI;
    public ImageView LLILLL;
    public RelativeLayout LLILZ;
    public C371650Ehf LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Function1<? super Bitmap, Unit> LLJI;

    private float getRoundRadius() {
        return C418440Gaw.LIZIZ(10);
    }

    public final void LIZIZ() {
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            C786410Ut5.e6(this.LLILZ, marginLayoutParams);
        }
        C371650Ehf c371650Ehf = this.LLILZIL;
        if (c371650Ehf != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c371650Ehf.getLayoutParams();
            int i = 0 - ((int) this.LLILZLL);
            marginLayoutParams2.setMargins(i, i, i, i);
            C371650Ehf c371650Ehf2 = this.LLILZIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371650Ehf2);
            c371650Ehf2.setLayoutParams(marginLayoutParams2);
        }
    }

    public Function1<Bitmap, Unit> getBitmapReadyCallback() {
        return this.LLJI;
    }

    public final void LIZJ(boolean z) {
        if (z) {
            C786410Ut5.LJZI(0, this.LLILLL);
        } else {
            C786410Ut5.LJZI(8, this.LLILLL);
        }
    }

    public void setBgBorderDrawable(Drawable drawable) {
        this.LLILLL.setImageDrawable(drawable);
    }

    public void setBitmapReadyCallback(Function1<? super Bitmap, Unit> function1) {
        this.LLJI = function1;
    }

    public void setDefaultIconWidth(int i) {
        this.LLIZ = i;
    }

    public void setFullHorizontalCarrouselStyleButton(int i) {
        C371650Ehf c371650Ehf = this.LLILZIL;
        if (c371650Ehf != null) {
            int visibility = c371650Ehf.getVisibility();
            c371650Ehf.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c371650Ehf);
        }
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null) {
            ViewParent parent = relativeLayout.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = i;
                layoutParams.width = i;
                C786410Ut5.X5(layoutParams, viewGroup);
            }
        }
        RelativeLayout relativeLayout2 = this.LLILZ;
        if (relativeLayout2 != null) {
            ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, 0);
                layoutParams2.height = i;
                layoutParams2.width = i;
                C786410Ut5.e6(this.LLILZ, layoutParams2);
            }
        }
        C1325000kaI c1325000kaI = this.LL;
        if (c1325000kaI != null) {
            ViewGroup.LayoutParams layoutParams3 = c1325000kaI.getLayoutParams();
            layoutParams3.height = i;
            layoutParams3.width = i;
            C786410Ut5.W5(c1325000kaI, layoutParams3);
        }
    }

    public void setRoundRectRadius(int i) {
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new C663220Pzs((int) C11VU.LIZ(i)));
            this.LLILZ.setClipToOutline(true);
        }
    }

    public void setUploadSize(int i) {
        int iLIZ = (int) C11VU.LIZ(i);
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = iLIZ;
            layoutParams.width = iLIZ;
            C786410Ut5.W5(relativeLayout, layoutParams);
        }
        C371650Ehf c371650Ehf = this.LLILZIL;
        if (c371650Ehf != null) {
            int i2 = (((int) this.LLILZLL) * 2) + iLIZ;
            ViewGroup.LayoutParams layoutParams2 = c371650Ehf.getLayoutParams();
            layoutParams2.height = i2;
            layoutParams2.width = i2;
            C786410Ut5.W5(c371650Ehf, layoutParams2);
        }
        C1325000kaI c1325000kaI = this.LL;
        if (c1325000kaI != null) {
            ViewGroup.LayoutParams layoutParams3 = c1325000kaI.getLayoutParams();
            layoutParams3.height = iLIZ;
            layoutParams3.width = iLIZ;
            C786410Ut5.W5(c1325000kaI, layoutParams3);
        }
    }

    public C1642110spl(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        this.LLIZ = C366700EZg.LIZ(32.0d);
        this.LLIZLLLIL = false;
        this.LLJI = null;
        if (UpdateAlbumUploadButtonPlaceholderImage.isEnabled()) {
            i = R.layout.iat;
        } else {
            i = R.layout.ias;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
        this.LL = (C1325000kaI) viewTd.findViewById(R.id.lyv);
        this.LLILLJJLI = (TuxIconView) viewTd.findViewById(R.id.lrw);
        this.LLILLL = (ImageView) viewTd.findViewById(R.id.view_bg2);
        this.LLILZ = (RelativeLayout) viewTd.findViewById(R.id.i6f);
        C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(getRoundRadius());
        C1325000kaI c1325000kaI = this.LL;
        if (c1325000kaI != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1325000kaI.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            C1325000kaI c1325000kaI2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1325000kaI2);
            c1325000kaI2.setLayoutParams(marginLayoutParams);
        }
        C786410Ut5.LJZI(8, this.LLILLL);
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new C663220Pzs((int) C11VU.LIZ(8.0f)));
            this.LLILZ.setClipToOutline(true);
        }
        this.LL.getHierarchy().LJJIII(c1331100kk8LIZLLL);
        this.LL.setOutlineProvider(new C1447460nlo(0.0f, Float.valueOf(getRoundRadius())));
        this.LL.setClipToOutline(true);
        if (UpdateAlbumUploadButtonPlaceholderImage.isEnabled()) {
            this.LLILZIL = (C371650Ehf) viewTd.findViewById(R.id.lyw);
            this.LLILZLL = C11VU.LIZ(3.0f);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_image_square_mountain_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zk);
            this.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.LL.getHierarchy().LJIJ(c419910GdJ.LIZ(this.LL.getContext()), 1);
        }
    }

    public final void LIZLLL(String str, boolean z) {
        C1325000kaI c1325000kaI;
        this.LLIZLLLIL = z;
        if (!z) {
            return;
        }
        if (C522630Keb.LIZ() == 1) {
            this.LL.setImageResource(R.drawable.ccj);
        } else if (C522630Keb.LIZ() == 2) {
            this.LL.setImageResource(R.drawable.a4x);
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
            this.LLILLJJLI.setIconRes(R.raw.icon_eye_slash_fill);
            this.LLILLJJLI.setTintColorRes(R.attr.zi);
        } else if (C522630Keb.LIZ() == 3) {
            this.LL.setImageResource(R.drawable.a4x);
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
            this.LLILLJJLI.setIconRes(R.raw.icon_lock_large_fill);
            this.LLILLJJLI.setTintColorRes(R.attr.zi);
        } else if (C522630Keb.LIZ() == 4) {
            this.LL.setImageResource(R.drawable.a4y);
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
            this.LLILLJJLI.setIconRes(R.raw.icon_lock_large_fill);
            this.LLILLJJLI.setTintColorRes(R.attr.zd);
        } else if (C522630Keb.LIZ() == 5) {
            if (str.equals("full_horizontal_carrousel")) {
                C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_image_square_mountain_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                this.LL.setImageDrawable(c419910GdJ.LIZ(getContext()));
                HandlerHook.viewPost(this.LL, new ARunnableS113S0100000_13(this, 118));
            } else {
                this.LL.setImageResource(R.drawable.a4w);
                C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
                this.LLILLJJLI.setIconRes(R.raw.icon_image_square_mountain_fill);
                this.LLILLJJLI.setTintColorRes(R.attr.zi);
                HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS113S0100000_13(this, 119));
            }
        }
        if (str.equals("default") && (c1325000kaI = this.LL) != null) {
            int iLIZ = (int) C11VU.LIZ(2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1325000kaI.getLayoutParams();
            marginLayoutParams.setMargins(iLIZ, iLIZ, iLIZ, iLIZ);
            C786410Ut5.W5(c1325000kaI, marginLayoutParams);
        }
    }

    @Override // X.InterfaceC535290Kz1
    public final void LIZ(boolean z, int i, List<MediaModel> list, AbstractC530360Kr4 abstractC530360Kr4) {
        MediaModel mediaModel;
        if (this.LLIZLLLIL && C522630Keb.LIZ() != 0) {
            return;
        }
        if (z && (i == 1 || i == 3 || (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_upload_icon_cover_support_video_v2", true, false) && i == 0))) {
            int measuredWidth = this.LL.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = this.LLIZ;
            }
            if (list != null && list.size() > 0 && (mediaModel = (MediaModel) ListProtector.get(list, 0)) != null) {
                this.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C1325000kaI c1325000kaI = this.LL;
                Size size = new Size(measuredWidth, measuredWidth);
                AObjectS368S0100000_25 aObjectS368S0100000_25 = new AObjectS368S0100000_25(this, 1);
                C23216097u c23216097u = C23215097t.LIZ;
                C23215097t.LIZLLL(c1325000kaI, mediaModel, size, new C5185020h(aObjectS368S0100000_25, (Function1<? super PTYError, Unit>) 11));
                return;
            }
            Function1<? super Bitmap, Unit> function1 = this.LLJI;
            if (function1 == null) {
                return;
            }
            function1.invoke(null);
            return;
        }
        Function1<? super Bitmap, Unit> function12 = this.LLJI;
        if (function12 == null) {
            return;
        }
        function12.invoke(null);
    }
}
