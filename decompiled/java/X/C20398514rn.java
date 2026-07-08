package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.14rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20398514rn extends AbstractC960460b6K<C20390914qZ, C20399914s1> {
    public final InterfaceC20405014sq LIZIZ;
    public final int LIZJ;
    public final EnumC992490bvz LIZLLL;
    public final boolean LJ;
    public final DataChannel LJFF;

    static {
        C439101nJ.LIZ(88);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public C20399914s1 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C20399914s1 c20399914s1 = new C20399914s1(C786410Ut5.Td(layoutInflater, R.layout.h_n, viewGroup, false), this.LIZLLL, this.LIZIZ, this.LJ, this.LJFF);
        ViewGroup.LayoutParams layoutParams = c20399914s1.itemView.getLayoutParams();
        layoutParams.width = this.LIZJ;
        if (this.LIZLLL == EnumC992490bvz.RECOMMENDATIONS_TYPE) {
            c20399914s1.itemView.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezk, viewGroup.getContext()));
        }
        C786410Ut5.W5(c20399914s1.itemView, layoutParams);
        return c20399914s1;
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        C20399914s1 c20399914s1 = (C20399914s1) viewHolder;
        C20390914qZ c20390914qZ = (C20390914qZ) obj;
        if (!list.isEmpty()) {
            c20399914s1.I5(c20390914qZ, c20399914s1.getLayoutPosition());
        } else {
            LIZJ(c20399914s1, c20390914qZ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20398514rn(InterfaceC20405014sq interfaceC20405014sq, EnumC992490bvz enumC992490bvz, DataChannel dataChannel, int i) {
        boolean z;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(interfaceC20405014sq, enumC992490bvz, z, (i & 16) != 0 ? null : dataChannel);
    }

    public C20398514rn(InterfaceC20405014sq interfaceC20405014sq, EnumC992490bvz enumC992490bvz, boolean z, DataChannel dataChannel) {
        this.LIZIZ = interfaceC20405014sq;
        this.LIZJ = -1;
        this.LIZLLL = enumC992490bvz;
        this.LJ = z;
        this.LJFF = dataChannel;
    }
}
