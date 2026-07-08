package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649320t1O extends AbstractC1664490tPr<C1649230t1F, C1649270t1J> {
    public ImageView LLJJJIL;
    public View LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJIL = (ImageView) requireViewById(R.id.vr2);
        this.LLJJJJ = requireViewById(R.id.xdz);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t1M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1649230t1F) obj).LIZ;
            }
        }, new AwS604S0100000_25(this, 120));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t1N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1649230t1F) obj).LIZIZ;
            }
        }, new AwS604S0100000_25(this, 121));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en1, viewGroup, false);
    }
}
