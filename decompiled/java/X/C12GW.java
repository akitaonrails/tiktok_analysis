package X;

import Y.ARunnableS2S0211000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.image.thumbnail.CenterLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12GW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12GW extends AbstractC1664490tPr<C1457190o1V, C1450910nrN> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 622));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 621));

    public final C1880110z1d LLLLLJLJLL() {
        return (C1880110z1d) this.LLJJJJ.getValue();
    }

    public final RecyclerView LLLLLL() {
        return (RecyclerView) this.LLJJJIL.getValue();
    }

    public final List<C12GP> LLLLLJIL() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = LLLLILI().LIZ.LIZ.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
        for (SingleImageData singleImageData : imageList) {
            arrayList.add(new C12GP(singleImageData.getSrcImageInfo().getPath(), false, singleImageData.isAICover(), 2));
        }
        return arrayList;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerViewLLLLLL = LLLLLL();
        C426750GoL.LJIIIZ(recyclerViewLLLLLL, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(158))), false, 23);
        recyclerViewLLLLLL.setHasFixedSize(true);
        recyclerViewLLLLLL.setLayoutManager(new CenterLinearLayoutManager(recyclerViewLLLLLL.getContext()));
        recyclerViewLLLLLL.setAdapter(LLLLLJLJLL());
        recyclerViewLLLLLL.addItemDecoration(new C19773312Xz(recyclerViewLLLLLL, this, 1));
        C1880110z1d c1880110z1dLLLLLJLJLL = LLLLLJLJLL();
        List<C12GP> listLLLLLJIL = LLLLLJIL();
        int i = C12GK.LLJILJIL;
        c1880110z1dLLLLLJLJLL.LLLIILIL(listLLLLLJIL, false);
        c1880110z1dLLLLLJLJLL.LLJJJJ = new AwS601S0100000_22(this, 306);
        c1880110z1dLLLLLJLJLL.LLIZLLLIL = new C12GQ() { // from class: X.12GX
            @Override // X.C12GQ
            public final void LIZ() {
            }

            @Override // X.C12GQ
            public final void LIZJ(int i2) {
            }

            @Override // X.C12GQ
            public final void LIZLLL() {
            }

            @Override // X.C12GQ
            public final void LIZIZ(int i2, boolean z, boolean z2) {
                C12GW c12gw;
                RecyclerView recyclerViewLLLLLL2;
                Function1<Integer, Unit> function1 = this.LIZ.LLLLIL().LIZ;
                this.LIZ.getClass();
                int i3 = i2 - 1;
                function1.invoke(Integer.valueOf(i3));
                C1402680mba c1402680mba = C1402680mba.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LIZ.LLLLILI().LIZ.LIZ;
                this.LIZ.getClass();
                c1402680mba.getClass();
                C0LAB c0labLIZIZ = C1402680mba.LIZIZ(videoPublishEditModel);
                c0labLIZIZ.LIZ(i3 + 1, "pic_number");
                C20684815ws.LJIILLIIL("click_thumbnail_bar", c0labLIZIZ.LIZ);
                if (z && (recyclerViewLLLLLL2 = (c12gw = this.LIZ).LLLLLL()) != null) {
                    HandlerHook.viewPost(recyclerViewLLLLLL2, new ARunnableS2S0211000_29(c12gw, recyclerViewLLLLLL2, i2, z2, 1));
                }
            }
        };
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1457190o1V) obj).LIZIZ;
            }
        }, new AwS608S0100000_29(this, 352));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12GS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1457190o1V) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 353));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0o1W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1457190o1V) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 354));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KxK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1457190o1V) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 355));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.d5m, viewGroup, false);
    }
}
