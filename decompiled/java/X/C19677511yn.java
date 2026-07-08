package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS71S0100000_29;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS434S0200000_33;

/* JADX INFO: renamed from: X.11yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19677511yn extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final LifecycleOwner LL;
    public final PhotoSearchEnterParams LLILLJJLI;
    public List<? extends MediaModel> LLILLL;
    public boolean LLILZ;
    public final Function0<Unit> LLILZIL;
    public final InterfaceC1631630sYr<MediaModel, Integer, Bitmap, Long, Unit> LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ ? this.LLILLL.size() + 1 : this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == 0 && this.LLILZ) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C19677711yp) && !this.LLIZ) {
            C675940QfI.LIZJ("photo_search_limit_access_page_show", this.LLILLJJLI, AFwS273S0000000_29.get$arr$(402));
            this.LLIZ = true;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object c098200Yq;
        int i2 = i - (this.LLILZ ? 1 : 0);
        if (viewHolder instanceof C19677611yo) {
            C19677611yo c19677611yo = (C19677611yo) viewHolder;
            MediaModel mediaModel = (MediaModel) ListProtector.get(this.LLILLL, i2);
            c19677611yo.LLILZ = mediaModel;
            c19677611yo.LLILZIL = i;
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
                SmartImageView smartImageView = c19677611yo.LLILLL;
                if (uri != null) {
                    string = uri.toString();
                }
                C1324750kZt.LJIIIZ(smartImageView, string, c19677611yo.LLILZLL.getWidth(), c19677611yo.LLILZLL.getHeight());
                return;
            }
            return;
        }
        C786410Ut5.I7(new AjS71S0100000_29(this, 6), viewHolder.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19677611yo;
        if (i == 1) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bp1, viewGroup, false);
            c19677611yo = new RecyclerView.ViewHolder(viewTd) { // from class: X.11yp
                public final View LL;

                {
                    super(viewTd);
                    this.LL = viewTd;
                    C2482209o4.LIZ(viewTd);
                }
            };
        } else {
            c19677611yo = new C19677611yo(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bq7, viewGroup, false), this.LLILZLL);
        }
        try {
            View view = c19677611yo.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19677611yo.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19677611yo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19677611yo.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19677611yo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19677611yo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19677611yo.getClass().getName();
        return c19677611yo;
    }

    public C19677511yn(LifecycleOwner lifecycleOwner, PhotoSearchEnterParams photoSearchEnterParams, List list, boolean z, AwS434S0200000_33 awS434S0200000_33, C1770206wW c1770206wW) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = photoSearchEnterParams;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = awS434S0200000_33;
        this.LLILZLL = c1770206wW;
    }
}
