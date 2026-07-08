package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;

/* JADX INFO: renamed from: X.040Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C040Q extends AbstractC1760900vvM {
    public final Fragment LLJ;
    public final DeliveryPanelViewModel LLJI;

    public abstract void LJ(Bundle bundle);

    public abstract void LJI(DialogInterface dialogInterface);

    public abstract void LJII(Bundle bundle);

    public abstract View LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void LJIIIZ();

    public abstract void LJIIJ(Dialog dialog);

    public abstract void LJIIJJI();

    public C040Q(Fragment fragment, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(null, fragment, 1);
        this.LLJ = fragment;
        this.LLJI = deliveryPanelViewModel;
    }
}
