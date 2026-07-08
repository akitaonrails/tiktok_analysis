package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.14rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20399014rs extends C20398514rn {
    public final C980350bcP LJI;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.14sh, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // X.C20398514rn
    public final C20404114sh LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        C20399914s1 c20399914s1LJIIJ = super.LJIIJ(layoutInflater, viewGroup);
        final View view = c20399914s1LJIIJ.itemView;
        final EnumC992490bvz enumC992490bvz = c20399914s1LJIIJ.LL;
        final InterfaceC20405014sq interfaceC20405014sq = c20399914s1LJIIJ.LLILLJJLI;
        final DataChannel dataChannel = c20399914s1LJIIJ.LLILZ;
        ?? r4 = new C20399914s1(view, enumC992490bvz, interfaceC20405014sq, dataChannel) { // from class: X.14sh
            @Override // X.C20399914s1, X.AbstractC960470b6L
            public final void I5(int i, Object obj) {
                super.I5((C20390914qZ) obj, i);
            }

            @Override // X.C20399914s1
            /* JADX INFO: renamed from: N5 */
            public final void I5(C20390914qZ c20390914qZ, int i) {
                super.I5(c20390914qZ, i);
            }
        };
        C980350bcP c980350bcP = this.LJI;
        if (c980350bcP != null && (num = c980350bcP.LIZ) != null) {
            r4.itemView.setBackgroundColor(C20736316Cj.LIZIZ(num.intValue(), viewGroup.getContext()));
        }
        return r4;
    }

    public C20399014rs(DataChannel dataChannel, C20394614rA c20394614rA, C980350bcP c980350bcP) {
        super((InterfaceC20405014sq) c20394614rA, EnumC992490bvz.RECOMMENDATIONS_TYPE, true, dataChannel);
        this.LJI = c980350bcP;
    }
}
