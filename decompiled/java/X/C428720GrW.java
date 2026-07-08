package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428720GrW extends FrameLayout implements InterfaceC1140970fnT {
    public final Context LL;

    @Override // X.InterfaceC1140970fnT
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1140970fnT
    public final void LIZIZ(List<Integer> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= 1) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        int i = -1;
        while (it2.hasNext()) {
            int iIndexOfChild = indexOfChild(findViewById(((Number) it2.next()).intValue()));
            if (iIndexOfChild != -1) {
                if (iIndexOfChild > i) {
                    i = iIndexOfChild;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        View viewFindViewById = findViewById(((Number) it3.next()).intValue());
                        if (viewFindViewById != null) {
                            bringChildToFront(viewFindViewById);
                        }
                    }
                    return;
                }
            }
        }
    }

    public C428720GrW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
    }

    @Override // X.InterfaceC1140970fnT
    public final View LIZ(int i, int i2, InterfaceC428730GrX interfaceC428730GrX) {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getId() == i) {
                    return childAt;
                }
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        View viewCreate = interfaceC428730GrX.create(this.LL);
        viewCreate.setId(i);
        addView(viewCreate, i2, new FrameLayout.LayoutParams(-1, -1));
        InterfaceC1141280fny interfaceC1141280fnyLIZIZ = C1141290fnz.LIZIZ();
        if (interfaceC1141280fnyLIZIZ != null && interfaceC1141280fnyLIZIZ.isOffline()) {
            C16F5 c16f5 = new C16F5(this.LL, null);
            c16f5.setId(View.generateViewId());
            c16f5.setText("render version: 1");
            C786410Ut5.k5(c16f5, 0.2f);
            c16f5.setTextColor(-1);
            c16f5.setBackgroundColor(-65536);
            c16f5.setTextSize(C497740JfY.LIZIZ(8.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            layoutParams.setMargins(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C786410Ut5.y6(c16f5, layoutParams);
            addView(c16f5);
        }
        return viewCreate;
    }
}
