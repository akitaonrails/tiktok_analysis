package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19675611yU extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final LifecycleOwner LL;
    public final PhotoSearchEnterParams LLILLJJLI;
    public SysRecommendModel LLILLL = null;
    public final EcPhotoSearchAlbumVM LLILZ;
    public List<? extends MediaModel> LLILZIL;
    public final InterfaceC1631630sYr<SysRecommendModel, SysRecommendFeedItem, Integer, String, Unit> LLILZLL;
    public final InterfaceC1631630sYr<MediaModel, Integer, Long, Bitmap, Unit> LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL == null ? this.LLILZIL.size() : this.LLILZIL.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == 0 && this.LLILLL != null) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJI(new C19773112Xx(gridLayoutManager, this, 2));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Object c098200Yq;
        SysRecommendModel sysRecommendModel = this.LLILLL;
        if (sysRecommendModel != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i - i2;
        if (viewHolder instanceof C19675711yV) {
            C19675711yV c19675711yV = (C19675711yV) viewHolder;
            MediaModel mediaModel = (MediaModel) ListProtector.get(this.LLILZIL, i3);
            c19675711yV.LLILZ = mediaModel;
            c19675711yV.LLILZIL = i;
            if (mediaModel != null) {
                try {
                    c098200Yq = C2471909mP.LJIILIIL(mediaModel.LJFF());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String string = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Uri uri = (Uri) c098200Yq;
                SmartImageView smartImageView = c19675711yV.LLILLL;
                if (uri != null) {
                    string = uri.toString();
                }
                C1324750kZt.LJIIIZ(smartImageView, string, c19675711yV.LLILZLL.getWidth(), c19675711yV.LLILZLL.getHeight());
                return;
            }
            return;
        }
        if (viewHolder instanceof C19675111yP) {
            ((C19675111yP) viewHolder).I5(sysRecommendModel, true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19675711yV;
        if (i == 1) {
            c19675711yV = new C19675111yP(this.LL, this.LLILLJJLI, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bs_, viewGroup, false), this.LLILZ, new AwS643S0100000_29(this, 152));
        } else {
            c19675711yV = new C19675711yV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bq7, viewGroup, false), this.LLIZ);
        }
        try {
            View view = c19675711yV.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19675711yV.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19675711yV.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19675711yV.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19675711yV.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19675711yV.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19675711yV.getClass().getName();
        return c19675711yV;
    }

    public C19675611yU(LifecycleOwner lifecycleOwner, PhotoSearchEnterParams photoSearchEnterParams, EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, C13BV c13bv, C19775812Yy c19775812Yy, C19775812Yy c19775812Yy2) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = photoSearchEnterParams;
        this.LLILZ = ecPhotoSearchAlbumVM;
        this.LLILZIL = c13bv;
        this.LLILZLL = c19775812Yy;
        this.LLIZ = c19775812Yy2;
    }
}
