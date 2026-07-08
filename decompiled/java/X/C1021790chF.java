package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0chF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021790chF {
    public static final /* synthetic */ C1021790chF LIZ = new C1021790chF();
    public static final List<InterfaceC1021760chC> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC1021760chC() { // from class: X.0chG
        @Override // X.InterfaceC1021760chC
        public final InterfaceC1021730ch9 LIZ(String str, final AnoleProductTilesModel anoleProductTilesModel) {
            if (!Intrinsics.LJFF(str, "absolute") || anoleProductTilesModel == null || anoleProductTilesModel.tileSize == null || anoleProductTilesModel.tileSpace == null) {
                return null;
            }
            return new AbstractC1021850chL(anoleProductTilesModel) { // from class: X.0chH
                public final AnoleProductTilesModel LJFF;

                @Override // X.InterfaceC1021730ch9
                public final void LIZJ(C1021680ch4 c1021680ch4) {
                }

                @Override // X.AbstractC1021850chL
                public final int LJI() {
                    Integer num = this.LJFF.tileSize;
                    if (num != null) {
                        return num.intValue();
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }

                @Override // X.AbstractC1021850chL
                public final int LJII() {
                    Integer num = this.LJFF.tileSpace;
                    if (num != null) {
                        return num.intValue();
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }

                {
                    this.LJFF = anoleProductTilesModel;
                }

                @Override // X.InterfaceC1021730ch9
                public final void LIZIZ(C1021680ch4 c1021680ch4) {
                    ViewParent parent;
                    ViewParent parent2;
                    ViewParent parent3;
                    ViewGroup viewGroup;
                    ViewGroup.LayoutParams layoutParams;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    View view = c1021680ch4.LLJJIJIL;
                    if (view != null && (parent = view.getParent()) != null && (parent2 = parent.getParent()) != null && (parent3 = parent2.getParent()) != null && (layoutParams = (viewGroup = (ViewGroup) parent3).getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.bottomMargin = 0;
                        C786410Ut5.X5(marginLayoutParams, viewGroup);
                    }
                }
            };
        }
    }, new InterfaceC1021760chC() { // from class: X.0chJ
        @Override // X.InterfaceC1021760chC
        public final InterfaceC1021730ch9 LIZ(String str, AnoleProductTilesModel anoleProductTilesModel) {
            if (!Intrinsics.LJFF(str, "bybusiness")) {
                return null;
            }
            return new C1021820chI(anoleProductTilesModel);
        }
    }, new InterfaceC1021760chC() { // from class: X.0chK
        @Override // X.InterfaceC1021760chC
        public final InterfaceC1021730ch9 LIZ(String str, AnoleProductTilesModel anoleProductTilesModel) {
            return new C1021820chI(anoleProductTilesModel);
        }
    });
}
