package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Gnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426290Gnb extends FrameLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final View LLILZ;

    public C426290Gnb(Context context) {
        super(context, null, 0);
        View viewInflate = FrameLayout.inflate(new C1361400lX0(context, R.style.y3), R.layout.i79, this);
        this.LL = (TuxTextView) viewInflate.findViewById(R.id.e7v);
        SmartImageView smartImageView = (SmartImageView) viewInflate.findViewById(R.id.cover);
        this.LLILLL = smartImageView;
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
        this.LLILLJJLI = (TuxIconView) viewInflate.findViewById(R.id.jzt);
        this.LLILZ = viewInflate.findViewById(R.id.e6t);
    }

    public final void setCollectionDetail(CollectionDetail collectionDetail) {
        String str;
        UrlModel urlModel;
        List<String> urlList;
        this.LL.setText(collectionDetail.name);
        Integer num = collectionDetail.type;
        if (num != null && num.intValue() == 1) {
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
            TuxIconView tuxIconView = this.LLILLJJLI;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
        List<UrlModel> list = collectionDetail.covers;
        if (list == null || (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LLILLL);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }
}
