package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.album.bottombar.util.AlbumCenterLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526720KlC extends AbstractC1664490tPr<C526500Kkq, C526100KkC> {
    public RecyclerView LLJJJIL;
    public C529450Kpb LLJJJJ;
    public AlbumCenterLayoutManager LLJJJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RecyclerView recyclerView = (RecyclerView) requireViewById(R.id.av_);
        AlbumCenterLayoutManager albumCenterLayoutManager = new AlbumCenterLayoutManager(requireSceneContext());
        this.LLJJJJJIL = albumCenterLayoutManager;
        recyclerView.setLayoutManager(albumCenterLayoutManager);
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILLL = 0L;
        c423520Gj8.LLILZIL = 250L;
        c423520Gj8.LLILZ = 0L;
        c423520Gj8.LLILZLL = 250L;
        recyclerView.setItemAnimator(c423520Gj8);
        this.LLJJJIL = recyclerView;
        C529450Kpb c529450Kpb = new C529450Kpb();
        new C21688219uK(new C530290Kqx(c529450Kpb)).LJ(this.LLJJJIL);
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c529450Kpb);
        }
        c529450Kpb.LLILZLL = new InterfaceC528100KnQ() { // from class: X.0KkD
            @Override // X.InterfaceC528100KnQ
            public final void LIZIZ(TikTokMediaModel tikTokMediaModel) {
                if (tikTokMediaModel == null) {
                    return;
                }
                this.LIZ.LLLLIL().LIZIZ.invoke(tikTokMediaModel);
            }

            @Override // X.InterfaceC528100KnQ
            public final void LIZ(int i, int i2) {
                this.LIZ.LLLLIL().LIZ.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }

            @Override // X.InterfaceC528100KnQ
            public final void LIZJ(TikTokMediaModel tikTokMediaModel, View view) {
                if (tikTokMediaModel == null) {
                    return;
                }
                this.LIZ.LLLLIL().LIZJ.invoke(tikTokMediaModel, view);
            }
        };
        this.LLJJJJ = c529450Kpb;
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Kku
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C526500Kkq) obj).LIZ;
            }
        }), new AwS587S0100000_8(this, 101));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Kkr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C526500Kkq) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 102));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Kks
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C526500Kkq) obj).LIZJ;
            }
        }, new AwS587S0100000_8(this, 103));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Kkt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C526500Kkq) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 100));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emu, viewGroup, false);
    }
}
