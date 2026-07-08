package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput.TakoPhotoDisplayCell;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* JADX INFO: renamed from: X.0Dhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346180Dhg extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void cm$0(C346180Dhg c346180Dhg, Uri uri, View view, Throwable th) {
    }

    public static final void cm$1(C346180Dhg c346180Dhg, Uri uri, View view, Throwable th) {
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
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C346180Dhg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void Ad$0(C346180Dhg c346180Dhg, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        View view2 = ((TakoPhotoDisplayCell) c346180Dhg.l0).LLILLL;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
            c384050F3z.LIZJ = Float.valueOf(C0DSB.LIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
            view2.setBackground(c384050F3z.LIZ((Context) c346180Dhg.l1));
        }
    }

    public static final void Ad$1(C346180Dhg c346180Dhg, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((ImageView) c346180Dhg.l0).setTag(R.id.dui, ((File) c346180Dhg.l1).getPath());
    }
}
