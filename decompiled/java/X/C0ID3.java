package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.commentpost.CommentPostDemoDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ID3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID3 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(C0ID3 c0id3, Throwable th) {
    }

    public static final void onFailed$1(C0ID3 c0id3, Throwable th) {
    }

    public static final void onFailed$2(C0ID3 c0id3, Throwable th) {
    }

    public static final void onFailed$4(C0ID3 c0id3, Throwable th) {
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
            case 5:
                LIZ$5(this, bitmap);
                break;
            case 6:
                LIZ$6(this, bitmap);
                break;
            case 7:
                LIZ$7(this, bitmap);
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
            case 5:
                onFailed$5(this, th);
                break;
            case 6:
                onFailed$6(this, th);
                break;
            case 7:
                onFailed$7(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C0ID3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C0ID3 c0id3, Bitmap bitmap) {
        if (bitmap != null) {
            C433850Gzn c433850Gzn = (C433850Gzn) c0id3.l0;
            c433850Gzn.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C433830Gzl(bitmap, c433850Gzn, null), 3);
        }
    }

    public static final void LIZ$1(C0ID3 c0id3, Bitmap bitmap) {
        if (bitmap != null) {
            ((C424610Gkt) c0id3.l0).setImageBitmap(bitmap);
        }
    }

    public static final void LIZ$2(C0ID3 c0id3, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) c0id3.l0).setBackground(null);
        ((TuxIconView) c0id3.l0).setBackgroundDrawable(bitmapDrawable);
        C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        c19me.bottomToBottom = R.id.f6o;
        c19me.endToEnd = R.id.f6o;
        c19me.topToTop = R.id.f6o;
        c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        C786410Ut5.M6((TuxIconView) c0id3.l0, c19me);
    }

    public static final void LIZ$3(C0ID3 c0id3, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) c0id3.l0).setBackground(null);
        ((TuxIconView) c0id3.l0).setBackgroundDrawable(bitmapDrawable);
    }

    public static final void LIZ$4(C0ID3 c0id3, Bitmap bitmap) {
        Integer numLIZJ;
        Pair<Integer, Integer> pairLIZ = C1346390l8n.LIZ(bitmap);
        if (pairLIZ == null) {
            return;
        }
        int iIntValue = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{pairLIZ.getFirst().intValue(), pairLIZ.getSecond().intValue()});
        CommentPostDemoDialog commentPostDemoDialog = (CommentPostDemoDialog) c0id3.l0;
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(10));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        Context context = commentPostDemoDialog.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        gradientDrawable.setStroke(iLIZIZ, iIntValue);
        CommentPostDemoDialog commentPostDemoDialog2 = (CommentPostDemoDialog) c0id3.l0;
        View viewFindViewById = commentPostDemoDialog2.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = commentPostDemoDialog2.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.rj_);
            } else {
                viewFindViewById = null;
            }
            commentPostDemoDialog2.LLIZLLLIL = (LinearLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        viewFindViewById.setBackground(gradientDrawable);
    }

    public static final void LIZ$5(C0ID3 c0id3, Bitmap bitmap) {
        Integer numValueOf;
        Integer numValueOf2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bitmap wxh = ");
        if (bitmap != null) {
            numValueOf = Integer.valueOf(bitmap.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        if (bitmap != null) {
            numValueOf2 = Integer.valueOf(bitmap.getHeight());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(' ');
        sbLIZ.append(bitmap);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bitmap == null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0id3.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn.resumeWith(null);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c0id3.l0;
            C428600GrK c428600GrK = new C428600GrK(bitmap.getWidth(), bitmap.getHeight());
            C189200o6.m2constructorimpl(c428600GrK);
            interfaceC1364105Vn2.resumeWith(c428600GrK);
        }
    }

    public static final void LIZ$6(C0ID3 c0id3, Bitmap bitmap) {
        ((Function1) c0id3.l0).invoke(bitmap);
    }

    public static final void LIZ$7(C0ID3 c0id3, Bitmap bitmap) {
        Function2 function2 = (Function2) c0id3.l0;
        if (function2 != null) {
            function2.invoke(bitmap, null);
        }
    }

    public static final void onFailed$3(C0ID3 c0id3, Throwable th) {
        ((TuxIconView) c0id3.l0).setBackgroundResource(R.drawable.dhi);
        TuxIconView tuxIconView = (TuxIconView) c0id3.l0;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZ = R.raw.icon_effect_house;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public static final void onFailed$5(C0ID3 c0id3, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0id3.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$6(C0ID3 c0id3, Throwable th) {
        ((Function1) c0id3.l0).invoke(null);
    }

    public static final void onFailed$7(C0ID3 c0id3, Throwable th) {
        Function2 function2 = (Function2) c0id3.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }
}
