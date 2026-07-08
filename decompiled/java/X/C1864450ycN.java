package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighLightItemAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateCell;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ycN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864450ycN extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void cm$1(C1864450ycN c1864450ycN, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C1864450ycN c1864450ycN, Uri uri, View view, Throwable th) {
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

    public C1864450ycN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void Bh$0(C1864450ycN c1864450ycN, Uri uri, View view) {
        ((TakoTemplateBaseCell) c1864450ycN.l0).LLJ.invoke();
    }

    public static final void cm$0(C1864450ycN c1864450ycN, Uri uri, View view, Throwable th) {
        ((TakoTemplateBaseCell) c1864450ycN.l0).N5((InterfaceC1845470y7l) c1864450ycN.l1);
    }

    public static final void Ad$0(C1864450ycN c1864450ycN, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((TakoTemplateBaseCell) c1864450ycN.l0).N5((InterfaceC1845470y7l) c1864450ycN.l1);
    }

    public static final void Ad$1(C1864450ycN c1864450ycN, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        View view2;
        if (Intrinsics.LJFF(((HighLightItemAssem) c1864450ycN.l0).LLLFFI, (C1835580xro) c1864450ycN.l1)) {
            HighLightItemAssem highLightItemAssem = (HighLightItemAssem) c1864450ycN.l0;
            highLightItemAssem.LLLFZ = true;
            SmartImageView smartImageView = highLightItemAssem.LLJLIL;
            if (smartImageView != null && smartImageView.getVisibility() == 0 && (view2 = ((HighLightItemAssem) c1864450ycN.l0).LLJLILLLLZIIL) != null) {
                C337180DJs.LIZJ(view2);
            }
        }
    }

    public static final void Ad$2(C1864450ycN c1864450ycN, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = (SmartImageView) ((TemplateCell) c1864450ycN.l0).LLILZIL.getValue();
        C1853460yKe c1853460yKe = (C1853460yKe) c1864450ycN.l1;
        TemplateCell templateCell = (TemplateCell) c1864450ycN.l0;
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1853460yKe.getSize().getWidth())));
        if (c428600GrK != null && c428600GrK.LIZ != 0) {
            layoutParams.height = (int) (((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1853460yKe.getSize().getWidth())))) * ((((double) c428600GrK.LIZIZ) * 1.0d) / ((double) c428600GrK.LIZ)));
            C426750GoL.LJIIL((View) templateCell.LLILZLL.getValue(), null, Integer.valueOf(((View) templateCell.LLILZLL.getValue()).getPaddingTop() - layoutParams.height), null, null, 29);
        }
        C786410Ut5.G6(smartImageView, layoutParams);
    }
}
