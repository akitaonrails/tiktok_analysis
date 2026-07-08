package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.image.TakoNovelImageAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346190Dhh extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$2(C346190Dhh c346190Dhh, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        if (this.$t != 0) {
            super.Bh(uri, view);
        } else {
            Bh$0(this, uri, view);
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C346190Dhh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void Bh$0(C346190Dhh c346190Dhh, Uri uri, View view) {
        super.Bh(uri, view);
        TakoNovelImageAssem takoNovelImageAssem = (TakoNovelImageAssem) c346190Dhh.l0;
        C339190DRl.LIZLLL((View) takoNovelImageAssem.LLLZ.getValue());
        C339190DRl.LIZLLL((View) takoNovelImageAssem.LLLZIL.getValue());
    }

    public static final void cm$0(C346190Dhh c346190Dhh, Uri uri, View view, Throwable th) {
        TakoNovelImageAssem takoNovelImageAssem = (TakoNovelImageAssem) c346190Dhh.l0;
        C0DSB.LIZIZ((View) takoNovelImageAssem.LLLZ.getValue());
        C0DSB.LIZIZ((View) takoNovelImageAssem.LLLZIL.getValue());
    }

    public static final void cm$1(C346190Dhh c346190Dhh, Uri uri, View view, Throwable th) {
        C786410Ut5.LJLLLLLL(0, ((View) c346190Dhh.l0).findViewById(R.id.k2o));
    }

    public static final void Ad$0(C346190Dhh c346190Dhh, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        TakoNovelImageAssem takoNovelImageAssem = (TakoNovelImageAssem) c346190Dhh.l0;
        C0DSB.LIZIZ((View) takoNovelImageAssem.LLLZ.getValue());
        C0DSB.LIZIZ((View) takoNovelImageAssem.LLLZIL.getValue());
    }

    public static final void Ad$1(C346190Dhh c346190Dhh, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C786410Ut5.LJLLLLLL(8, ((View) c346190Dhh.l0).findViewById(R.id.k2o));
    }

    public static final void Ad$2(C346190Dhh c346190Dhh, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        View view2 = ((C1854660yMa) c346190Dhh.l0).LLILZLL;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
            c384050F3z.LIZJ = Float.valueOf(C0DSB.LIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
            view2.setBackground(c384050F3z.LIZ(((C1854660yMa) c346190Dhh.l0).getContext()));
        }
    }
}
