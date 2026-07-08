package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19772412Xq extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFailed$2(C19772412Xq c19772412Xq, Throwable th) {
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
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
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
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C19772412Xq c19772412Xq, Bitmap bitmap) {
        if (bitmap != null) {
            ((C19HU) c19772412Xq.l0).setImageBitmap(bitmap);
        } else {
            TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = (TakoViewLargeImageDialogFragment) c19772412Xq.l1;
            C19HU c19hu = (C19HU) c19772412Xq.l0;
            Context context = takoViewLargeImageDialogFragment.getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
                c19hu.setImageDrawable(c384050F3z.LIZ(context));
            }
        }
        ((TakoViewLargeImageDialogFragment) c19772412Xq.l1).LLILZIL = bitmap;
    }

    public static final void LIZ$1(C19772412Xq c19772412Xq, Bitmap bitmap) {
        C11FQ c11fq = (C11FQ) c19772412Xq.l0;
        if ((c11fq instanceof ImageView) && c11fq != null) {
            c11fq.setImageBitmap(bitmap);
        }
        ((C11FQ) c19772412Xq.l0).LIZLLL();
        ((C11FQ) c19772412Xq.l0).LLILLL = true;
    }

    public static final void LIZ$2(C19772412Xq c19772412Xq, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        SeekBar seekBar = (SeekBar) c19772412Xq.l0;
        ((C19601411mW) c19772412Xq.l1).LJIIIIZZ.getValue().getClass();
        seekBar.setThumb(C423380Giu.LIZIZ(bitmap));
    }

    public static final void LIZ$3(C19772412Xq c19772412Xq, Bitmap bitmap) {
        Integer numValueOf;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c19772412Xq.l0;
        String str = ((BackgroundModel) c19772412Xq.l1).switchColor;
        if (str != null) {
            C11GZ.LIZ.getClass();
            numValueOf = Integer.valueOf(C11GZ.LIZJ(str));
        } else {
            numValueOf = null;
        }
        interfaceC1631620sYq.invoke(null, bitmap, numValueOf);
    }

    public static final void LIZ$4(C19772412Xq c19772412Xq, Bitmap bitmap) {
        Integer numValueOf;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c19772412Xq.l0;
        String str = ((BackgroundModel) c19772412Xq.l1).switchColor;
        if (str != null) {
            C11GZ.LIZ.getClass();
            numValueOf = Integer.valueOf(C11GZ.LIZJ(str));
        } else {
            numValueOf = null;
        }
        interfaceC1631620sYq.invoke(null, bitmap, numValueOf);
    }

    public static final void onFailed$0(C19772412Xq c19772412Xq, Throwable th) {
        TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = (TakoViewLargeImageDialogFragment) c19772412Xq.l1;
        C19HU c19hu = (C19HU) c19772412Xq.l0;
        Context context = takoViewLargeImageDialogFragment.getContext();
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            c19hu.setImageDrawable(c384050F3z.LIZ(context));
        }
    }

    public static final void onFailed$1(C19772412Xq c19772412Xq, Throwable th) {
        int i = C2187451AjH.LIZ;
        final C11FQ c11fq = (C11FQ) c19772412Xq.l0;
        QRCodeInfo qRCodeInfo = (QRCodeInfo) c19772412Xq.l1;
        c11fq.getClass();
        C1324840ka2.LJIJI(qRCodeInfo.qrcodeUrl, new InterfaceC1324870ka5() { // from class: X.11FR
            @Override // X.InterfaceC1324870ka5
            public final void onSuccess() {
                C11FQ c11fq2 = c11fq;
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJI(UriProtector.parse(c11fq.LLILZ));
                c1320810kTXLIZJ.LJIILJJIL = c11fq.getController();
                c1320810kTXLIZJ.LJIIIIZZ = c11fq.getImageLoadListener();
                c11fq2.setController(c1320810kTXLIZJ.LIZ());
                c11fq.LIZLLL();
            }

            @Override // X.InterfaceC1324870ka5
            public final void onFailure(Exception exc) {
                c11fq.getClass();
            }
        });
    }

    public static final void onFailed$3(C19772412Xq c19772412Xq, Throwable th) {
        ((InterfaceC1631620sYq) c19772412Xq.l0).invoke(null, null, null);
    }

    public static final void onFailed$4(C19772412Xq c19772412Xq, Throwable th) {
        ((InterfaceC1631620sYq) c19772412Xq.l0).invoke(null, null, null);
    }

    public C19772412Xq(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
