package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369900lki {
    public static final void LIZ(Dialog dialog) throws Exception {
        if (dialog != null) {
            C2211631BhB.LIZIZ(dialog);
        }
    }

    public static final void LIZJ(DialogFragment dialogFragment) {
        if (dialogFragment != null) {
            C2211631BhB.LJIIJ(dialogFragment);
        }
    }

    public static final void LIZIZ(Object obj, final InterfaceC1370310llN interfaceC1370310llN) {
        if (obj instanceof C1369800lkY) {
            final C1369800lkY c1369800lkY = (C1369800lkY) obj;
            C2211751BhN.LIZ(c1369800lkY.itemView, new AbstractC2211791BhR(c1369800lkY) { // from class: X.0lkd
                public Function0<String> LJ;
                public final C1402200mao LJFF;
                public final int LJI = 100;
                public final float LJII = 0.1f;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJII;
                }

                {
                    this.LJ = new AwS565S0100000_21(c1369800lkY, 1448);
                    this.LJFF = new C1402200mao(c1369800lkY, 14);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
            return;
        }
        if (obj instanceof C1369820lka) {
            C1369820lka c1369820lka = (C1369820lka) obj;
            C2211751BhN.LIZ(c1369820lka.itemView, new C1402380mb6(c1369820lka, 3));
        } else if (obj instanceof C1370250llH) {
            final C1370250llH c1370250llH = (C1370250llH) obj;
            C2211751BhN.LIZ(c1370250llH.itemView, new AbstractC2211791BhR(c1370250llH) { // from class: X.0lko
                public Function0<String> LJ;
                public final C1402200mao LJFF;
                public final int LJI = 100;
                public final float LJII = 0.1f;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJII;
                }

                {
                    this.LJ = new AwS565S0100000_21(c1370250llH, 1450);
                    this.LJFF = new C1402200mao(c1370250llH, 16);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        } else {
            if (!(obj instanceof C1370230llF)) {
                return;
            }
            if (!(interfaceC1370310llN instanceof InterfaceC1370310llN)) {
                interfaceC1370310llN = null;
            }
            C2211751BhN.LIZ(((RecyclerView.ViewHolder) obj).itemView, new AbstractC2211791BhR(interfaceC1370310llN) { // from class: X.0lkp
                public Function0<String> LJ;
                public final C1402200mao LJFF;
                public final int LJI = 100;
                public final float LJII = 0.1f;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJII;
                }

                {
                    this.LJ = new AwS565S0100000_21(interfaceC1370310llN, 1451);
                    this.LJFF = new C1402200mao(interfaceC1370310llN, 17);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        }
    }
}
