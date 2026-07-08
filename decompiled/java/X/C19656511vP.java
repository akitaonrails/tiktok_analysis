package X;

import Y.AObserverS223S0100000_19;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.shortvideo.component.alttext.AltTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19656511vP extends Scene {
    public VideoPublishEditModel LLJI;
    public AltTextViewModel LLJIJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public String LLJILJIL = "";
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 205));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 204));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 601));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 600));

    public final void LLLII(int i, AltTextChangeStatus altTextChangeStatus) {
        int size;
        int i2;
        int i3;
        int i4;
        CreativeModel creativeModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        CreativeModel creativeModel2;
        EditPostModel editPostModel;
        List<PhotoModeImageUrlModel> imageList2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("entry_method", this.LLJILJIL);
        c0lab.LIZ(C1568130quR.LIZ() ? 1 : 0, "screen_reader_enabled");
        VideoPublishEditModel videoPublishEditModel = this.LLJI;
        int i5 = 0;
        if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel2.editPostModel) != null && (imageList2 = editPostModel.getImageList()) != null) {
            size = imageList2.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "num_photos");
        VideoPublishEditModel videoPublishEditModel2 = this.LLJI;
        if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (imageAlbumData = creativeModel.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (it2.next().getSrcImageInfo().getAltText() != null && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "num_photos_alt_text");
        if (altTextChangeStatus.getAltTextAdded() != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "add_alternative_text");
        if (altTextChangeStatus.getAltTextEdited() != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "edit_alternative_text");
        if (altTextChangeStatus.getAltTextDeleted() != 0) {
            i5 = 1;
        }
        c0lab.LIZ(i5, "delete_alternative_text");
        c0lab.LIZ(altTextChangeStatus.getAltTextAdded(), "num_photos_alt_text_add");
        c0lab.LIZ(altTextChangeStatus.getAltTextEdited(), "num_photos_alt_text_edit");
        c0lab.LIZ(altTextChangeStatus.getAltTextDeleted(), "num_photos_alt_text_delete");
        c0lab.LIZIZ(jElapsedRealtime - this.LLJILJILJ, "duration");
        c0lab.LIZ(i, "final_action");
        C20684815ws.LJIILLIIL("add_edit_alternative_text", c0lab.LIZ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        List<SingleImageData> imageList;
        CreativeModel creativeModel;
        ImageAlbumData imageAlbumData;
        super.onViewCreated(view, bundle);
        this.LLJILJILJ = SystemClock.elapsedRealtime();
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LJII = 2131828871;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS566S0100000_22(this, 282));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getString(2131826460));
        sbLIZ.append(' ');
        c1250250idj.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        String string = getString(2131840893);
        c1250250idj.LJFF = R.raw.icon_info_circle;
        c1250250idj.LJI = string;
        c1250250idj.LIZ(new AwS573S0100000_29(this, 206));
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = getString(2131834695);
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido.LIZ(new AwS566S0100000_22(this, 283));
        c0om1.LIZIZ(c1250300ido);
        tuxNavBar.setNavActions(c0om1);
        AltTextViewModel altTextViewModel = this.LLJIJIL;
        if (altTextViewModel != null) {
            VideoPublishEditModel videoPublishEditModel = this.LLJI;
            ArrayList arrayList = null;
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (imageAlbumData = creativeModel.imageAlbumModel) != null) {
                imageList = imageAlbumData.getImageList();
                if (imageList != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                    Iterator<SingleImageData> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getSrcImageInfo().getAltText());
                    }
                }
            } else {
                imageList = null;
            }
            C1748610vbX c1748610vbX = new C1748610vbX(altTextViewModel, requireSceneContext());
            RecyclerView recyclerView = (RecyclerView) this.LLJJI.getValue();
            recyclerView.setAdapter(c1748610vbX);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            if (arrayList != null) {
                List<String> value = altTextViewModel.LL.getValue();
                if (value != null) {
                    value.addAll(arrayList);
                }
                altTextViewModel.LL.observe(this, new AObserverS223S0100000_19(c1748610vbX, 35));
            }
            if (imageList != null) {
                List<SingleImageData> value2 = altTextViewModel.LLILLJJLI.getValue();
                if (value2 != null) {
                    value2.addAll(imageList);
                }
                altTextViewModel.LLILLJJLI.observe(this, new AObserverS223S0100000_19(c1748610vbX, 36));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJIJIL = (AltTextViewModel) new ViewModelProvider(this).get(AltTextViewModel.class);
        return C786410Ut5.Td(layoutInflater, R.layout.c80, viewGroup, false);
    }
}
