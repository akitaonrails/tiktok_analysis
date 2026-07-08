package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Gna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426280Gna extends FrameLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final ConstraintLayout LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public CollectionDetail LLIZ;
    public Integer LLIZLLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    public final void LIZ() {
        ?? r1 = this.LL;
        while (true) {
            if (!((r1 != 0 ? r1.getParent() : null) instanceof ViewGroup)) {
                return;
            }
            ViewParent parent = r1.getParent();
            if (!(parent instanceof ViewGroup) || (r1 = (ViewGroup) parent) == 0) {
                r1 = 0;
            } else {
                r1.setClipChildren(false);
                r1.setClipToPadding(false);
            }
        }
    }

    public final CollectionDetail getCollectionDetail() {
        return this.LLIZ;
    }

    public final Integer getCollectionDetailIndex() {
        return this.LLIZLLLIL;
    }

    public C426280Gna(Context context) {
        super(context, null, 0);
        View viewInflate = FrameLayout.inflate(new C1361400lX0(context, R.style.y3), R.layout.ccz, this);
        viewInflate.findViewById(R.id.tsc);
        this.LL = (TuxTextView) viewInflate.findViewById(R.id.e7v);
        this.LLILZ = (ConstraintLayout) viewInflate.findViewById(R.id.kc4);
        C1378990lzN.LIZIZ(viewInflate.findViewById(R.id.f4p), Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        SmartImageView smartImageView = (SmartImageView) viewInflate.findViewById(R.id.cover);
        this.LLILLL = smartImageView;
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        this.LLILLJJLI = (TuxIconView) viewInflate.findViewById(R.id.jzt);
    }

    public final void setCollectionDetail(CollectionDetail collectionDetail) {
        String str;
        UrlModel urlModel;
        List<String> urlList;
        this.LLIZ = collectionDetail;
        this.LL.setText(collectionDetail.name);
        Integer num = collectionDetail.type;
        if (num != null && num.intValue() == 1) {
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
            TuxIconView tuxIconView = this.LLILLJJLI;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 4);
        List<UrlModel> list = collectionDetail.covers;
        if (list == null || (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LLILLL);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    public final void setCollectionIndex(int i) {
        this.LLIZLLLIL = Integer.valueOf(i);
    }
}
