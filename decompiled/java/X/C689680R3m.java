package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689680R3m extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

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
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
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
            case 3:
                cm$3(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C689680R3m(UrlModel urlModel, int i) {
        this.$t = i;
        C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
        this.l0 = urlModel;
    }

    public C689680R3m(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void Bh$0(C689680R3m c689680R3m, Uri uri, View view) {
        String aid;
        super.Bh(uri, view);
        Aweme mAweme = ((C661440Px0) c689680R3m.l0).getMAweme();
        if (mAweme == null || (aid = mAweme.getAid()) == null) {
            aid = "";
        }
        C661720PxS c661720PxSLIZ = C661630PxJ.LIZ(aid);
        c661720PxSLIZ.getClass();
        if (!Intrinsics.LJFF(c661720PxSLIZ, C661810Pxb.LIZ)) {
            System.currentTimeMillis();
            c661720PxSLIZ.getClass();
        }
    }

    public static final void cm$0(C689680R3m c689680R3m, Uri uri, View view, Throwable th) {
        String aid;
        Aweme mAweme = ((C661440Px0) c689680R3m.l0).getMAweme();
        if (mAweme == null || (aid = mAweme.getAid()) == null) {
            aid = "";
        }
        C661630PxJ.LIZ(aid).LIZ();
    }

    public static final void cm$1(C689680R3m c689680R3m, Uri uri, View view, Throwable th) {
        C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
        UrlModel urlModel = (UrlModel) c689680R3m.l0;
        C1483205rK<UrlModel> c1483205rK2 = C1483305rL.LIZ;
        synchronized (c1483205rK2) {
            c1483205rK2.LIZ.remove(urlModel);
        }
    }

    public static final void cm$2(C689680R3m c689680R3m, Uri uri, View view, Throwable th) {
        String message;
        ((SearchTakoCardAssem) c689680R3m.l0).Fp(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("botIconPath imageLoad onFailed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void cm$3(C689680R3m c689680R3m, Uri uri, View view, Throwable th) {
        String message;
        ((SearchTakoCardAssem) c689680R3m.l0).Fp(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("botIconPath imageLoad onFailed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void Ad$0(C689680R3m c689680R3m, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String aid;
        Aweme mAweme = ((C661440Px0) c689680R3m.l0).getMAweme();
        if (mAweme == null || (aid = mAweme.getAid()) == null) {
            aid = "";
        }
        C661630PxJ.LIZ(aid).LIZ();
    }

    public static final void Ad$1(C689680R3m c689680R3m, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
        UrlModel urlModel = (UrlModel) c689680R3m.l0;
        C1483205rK<UrlModel> c1483205rK2 = C1483305rL.LIZ;
        synchronized (c1483205rK2) {
            c1483205rK2.LIZ.remove(urlModel);
        }
    }

    public static final void Ad$2(C689680R3m c689680R3m, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((SearchTakoCardAssem) c689680R3m.l0).Fp(true);
    }

    public static final void Ad$3(C689680R3m c689680R3m, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((SearchTakoCardAssem) c689680R3m.l0).Fp(true);
    }
}
