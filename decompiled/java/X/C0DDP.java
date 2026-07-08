package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DDP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0DDP extends C2217421BqW implements Function1<C0D3I, Unit> {
    public C0DDP(Object obj) {
        super(1, obj, C0DDM.class, "setupMediaIndicators", "setupMediaIndicators(Lcom/ss/android/ugc/aweme/commercialize/ucp/impl/ui/pages/pdp/PdpMediaState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0D3I c0d3i) {
        int size;
        List<String> list;
        C0D3I c0d3i2 = c0d3i;
        C0DDM c0ddm = (C0DDM) this.receiver;
        c0ddm.LIZLLL = c0d3i2;
        int currentItem = 0;
        if (c0d3i2 != null && (list = c0d3i2.imageUrls) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        LinearLayout linearLayout = (LinearLayout) c0ddm.LIZIZ.LL.findViewById(R.id.n_m);
        if (linearLayout != null) {
            if (c0d3i2 != null && c0d3i2.getShouldShowIndicator()) {
                C786410Ut5.LJZL(0, linearLayout);
                if (linearLayout.getChildCount() != size) {
                    C786410Ut5.LJJJJJL(linearLayout);
                    for (int i = 0; i < size; i++) {
                        View view = new View(c0ddm.LIZ);
                        C786410Ut5.W5(view, new LinearLayout.LayoutParams(0, 0));
                        linearLayout.addView(view);
                    }
                }
                C20632315oP c20632315oP = (C20632315oP) c0ddm.LIZIZ.LL.findViewById(R.id.vpProductMedia);
                if (c20632315oP != null) {
                    currentItem = c20632315oP.getCurrentItem();
                }
                c0ddm.LIZ(currentItem);
            } else {
                C786410Ut5.LJJJJJL(linearLayout);
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        return Unit.LIZ;
    }
}
