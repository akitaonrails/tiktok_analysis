package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750912Pj extends AbstractC1664490tPr<C19750612Pg, C19750212Pc> {
    public View LLJJJIL;
    public View LLJJJJ;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = requireViewById(R.id.tv_save);
        this.LLJJJJ = requireViewById(R.id.zbp);
        View view2 = this.LLJJJIL;
        View view3 = null;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 23), view2);
        View view4 = this.LLJJJJ;
        if (view4 != null) {
            view3 = view4;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 24), view3);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12Pk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19750612Pg) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 179));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12Pl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19750612Pg) obj).LIZJ;
            }
        }, new AwS608S0100000_29(this, 180));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.es6, viewGroup, false);
    }
}
