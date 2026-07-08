package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.UUID;

/* JADX INFO: renamed from: X.0gz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186650gz9 implements InterfaceC1185880gxu {
    public String LIZ;

    @Override // X.InterfaceC1185880gxu
    public final void LIZ(Fragment fragment, String str, final C2238311Cj7 c2238311Cj7) {
        Context context = fragment.getContext();
        if (context != null && str != null && str.length() != 0) {
            this.LIZ = UUID.randomUUID().toString();
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            String str2 = this.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            sparkContext.LJJJZ("sheet_id", str2);
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0(c2238311Cj7, this) { // from class: X.0gzA
                public final /* synthetic */ InterfaceC1186670gzB LIZ;

                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                    this.LIZ.LJ();
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                    this.LIZ.LIZLLL();
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                    if (i != 3) {
                        if (i != 4 && i != 6) {
                            return;
                        }
                        this.LIZ.LIZIZ();
                        return;
                    }
                    this.LIZ.LIZJ();
                }
            });
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }
}
