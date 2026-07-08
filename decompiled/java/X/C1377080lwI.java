package X;

import Y.ACListenerS48S0201000_21;
import Y.ACListenerS56S0101000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.photodownload.PhotoSelectionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377080lwI extends AbstractC21673619ry<C1377090lwJ> {
    public final Aweme LL;
    public final PhotoSelectionViewModel LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = this.LL.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) {
            return 0;
        }
        return imageList.size();
    }

    public final String LLLFZ(int i) {
        UrlModel urlModel;
        List<String> urlList;
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(this.LL, i, false);
        if (photoModeImageLJIILIIL != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null && (urlList = urlModel.getUrlList()) != null) {
            return (String) C13LP.LJJJLZIJ(0, urlList);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        String strLLLFZ = LLLFZ(i);
        if (strLLLFZ != null) {
            i = strLLLFZ.hashCode();
        }
        return i;
    }

    public C1377080lwI(Aweme aweme, PhotoSelectionViewModel photoSelectionViewModel) {
        this.LL = aweme;
        this.LLILLJJLI = photoSelectionViewModel;
        setHasStableIds(true);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        String str;
        C1377090lwJ c1377090lwJ = (C1377090lwJ) viewHolder;
        String strLLLFZ = LLLFZ(i);
        if (!Intrinsics.LJFF(c1377090lwJ.LLILZIL, strLLLFZ)) {
            if (strLLLFZ == null) {
                str = "";
            } else {
                str = strLLLFZ;
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIIZ.LJJ(c1377090lwJ.LL);
            c1331670kl3LJIIIZ.LIZLLL("DownloadPhotoSelectionAdapter");
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            c1377090lwJ.LLILZIL = strLLLFZ;
        }
        TuxIconView tuxIconView = c1377090lwJ.LLILZ;
        boolean zContains = false;
        if (C721220SQu.LJFF(i, this.LL) && C721220SQu.LJII(i, this.LL) == 2) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxIconView);
        TuxIconView tuxIconView2 = c1377090lwJ.LLILLL;
        if (C721220SQu.LJFF(i, this.LL) && C721220SQu.LJII(i, this.LL) == 1) {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, tuxIconView2);
        C786410Ut5.b9(c1377090lwJ.LLILLJJLI, new ACListenerS56S0101000_21(this, i, 0));
        C786410Ut5.Q8(c1377090lwJ.LL, new ACListenerS48S0201000_21(i, this, c1377090lwJ, 1));
        C0HZQ c0hzq = c1377090lwJ.LLILLJJLI;
        Set<Integer> value = this.LLILLJJLI.wQ2().getValue();
        if (value != null) {
            zContains = value.contains(Integer.valueOf(i));
        }
        c0hzq.setChecked(zContains);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1377090lwJ c1377090lwJ = new C1377090lwJ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eaj, viewGroup, false));
        try {
            View view = c1377090lwJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1377090lwJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1377090lwJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1377090lwJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1377090lwJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1377090lwJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1377090lwJ.class.getName();
        return c1377090lwJ;
    }
}
