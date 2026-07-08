package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell;
import java.util.List;

/* JADX INFO: renamed from: X.0may, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402300may implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;

    public static final void A3$1(C1402300may c1402300may, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$2(C1402300may c1402300may, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Bh$1(C1402300may c1402300may, Uri uri, View view) {
    }

    public static final void Bh$2(C1402300may c1402300may, Uri uri, View view) {
    }

    public static final void cm$1(C1402300may c1402300may, Uri uri, View view, Throwable th) {
    }

    public static final void e1$1(C1402300may c1402300may, Uri uri) {
    }

    public static final void e1$2(C1402300may c1402300may, Uri uri) {
    }

    public static final void lg$1(C1402300may c1402300may, Uri uri, Throwable th) {
    }

    public static final void lg$2(C1402300may c1402300may, Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                A3$0(this, uri, c428600GrK);
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
            case 2:
                A3$2(this, uri, c428600GrK);
                break;
        }
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
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
                Bh$1(this, uri, view);
                break;
            case 2:
                Bh$2(this, uri, view);
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
            case 2:
                cm$2(this, uri, view, th);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                e1$0(this, uri);
                break;
            case 1:
                e1$1(this, uri);
                break;
            case 2:
                e1$2(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                lg$0(this, uri, th);
                break;
            case 1:
                lg$1(this, uri, th);
                break;
            case 2:
                lg$2(this, uri, th);
                break;
        }
    }

    public C1402300may(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void e1$0(C1402300may c1402300may, Uri uri) {
    }

    public static final void Bh$0(C1402300may c1402300may, Uri uri, View view) {
        UrlModel urlModel;
        PhotoDetailActivity photoDetailActivity = (PhotoDetailActivity) c1402300may.l0;
        if (photoDetailActivity.LLILLJJLI == null) {
            C786410Ut5.LLLZLZ((C1749280vcc) photoDetailActivity.LLJIJIL.getValue(), 0);
            ((C1749280vcc) ((PhotoDetailActivity) c1402300may.l0).LLJIJIL.getValue()).LJ();
        }
        List<? extends UrlModel> list = ((PhotoDetailActivity) c1402300may.l0).LLILLL;
        if (list != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list)) != null) {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String strValueOf = String.valueOf(urlModel.hashCode());
            boolean zLIZIZ = C708740Rr6.LIZIZ(urlModel);
            c2208281Bbm.getClass();
            C2208281Bbm.LJIILIIL(strValueOf, "detail", urlModel, false, false, zLIZIZ);
        }
    }

    public static final void A3$0(C1402300may c1402300may, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void lg$0(C1402300may c1402300may, Uri uri, Throwable th) {
    }

    public static final void cm$0(C1402300may c1402300may, Uri uri, View view, Throwable th) {
        ((C1749280vcc) ((PhotoDetailActivity) c1402300may.l0).LLJIJIL.getValue()).setStatus((C1722300uv6) ((PhotoDetailActivity) c1402300may.l0).LLJILJILJ.getValue());
        C786410Ut5.LLLZLZ((C1749280vcc) ((PhotoDetailActivity) c1402300may.l0).LLJIJIL.getValue(), 0);
    }

    public static final void cm$2(C1402300may c1402300may, Uri uri, View view, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("badge");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void Ad$0(C1402300may c1402300may, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C786410Ut5.LLLZLZ((C1749280vcc) ((PhotoDetailActivity) c1402300may.l0).LLJIJIL.getValue(), 8);
        ((PhotoDetailActivity) c1402300may.l0).LLJILLL = System.currentTimeMillis();
    }

    public static final void Ad$1(C1402300may c1402300may, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = ((BaseCommentCell) c1402300may.l0).LLLF;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
    }

    public static final void Ad$2(C1402300may c1402300may, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = ((CommentItemCell) c1402300may.l0).LLLF;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
    }
}
