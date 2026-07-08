package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;

/* JADX INFO: renamed from: X.0PRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC644870PRd {
    View LIZ(Context context, Fragment fragment, SearchTopBarAssemViewModel searchTopBarAssemViewModel, ViewGroup viewGroup, ViewGroup viewGroup2);

    void LIZIZ();

    void LIZJ();

    void LIZLLL();

    View LJ();

    boolean LJI(boolean z, EntityCardTitle entityCardTitle);

    void LJII();

    int getHeight();

    void onConfigurationChanged(Configuration configuration);
}
