package X;

import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886020zBA extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ C817403Hg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886020zBA(C817403Hg c817403Hg) {
        super(1);
        this.LL = c817403Hg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        final C817403Hg c817403Hg = this.LL;
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0zB9
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
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
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
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
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
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                C1912890zsV c1912890zsV = sparkPopup.LLJJIII;
                if (c1912890zsV != null) {
                    float f = c817403Hg.element;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1912890zsV);
                    c1912890zsV.setAlpha(f);
                }
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i) {
                String str;
                if (i == 5) {
                    sparkPopup.gS(true);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = "STATE_HALF_EXPANDED";
                                    }
                                } else {
                                    str = "STATE_COLLAPSED";
                                }
                            } else {
                                str = "STATE_EXPANDED";
                            }
                        } else {
                            str = "STATE_SETTLING";
                        }
                    } else {
                        str = "STATE_DRAGGING";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" onStateChanged  newState = ");
                    sbLIZ.append(i);
                    sbLIZ.append("  ");
                    sbLIZ.append(str);
                    C20441214yg.LIZIZ("BottomSheetPage", C2188811AlT.LIZIZ(sbLIZ));
                }
                str = "STATE_HIDDEN";
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" onStateChanged  newState = ");
                sbLIZ2.append(i);
                sbLIZ2.append("  ");
                sbLIZ2.append(str);
                C20441214yg.LIZIZ("BottomSheetPage", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) throws JSONException {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" onSlide slideOffset = ");
                sbLIZ.append(f);
                sbLIZ.append(" ms = ");
                sbLIZ.append(SystemClock.uptimeMillis() - C781450Ul5.LIZJ);
                C20441214yg.LIZIZ("BottomSheetPage", C2188811AlT.LIZIZ(sbLIZ));
                C781450Ul5.LIZJ = SystemClock.uptimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("slide_offset", Float.valueOf(f));
                C389001fE.LIZ("game_sheet_on_slide", jSONObject, System.currentTimeMillis(), false);
            }
        });
        return Unit.LIZ;
    }
}
