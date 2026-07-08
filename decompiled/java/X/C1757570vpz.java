package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757570vpz implements InterfaceC1757550vpx {
    public final FrameLayout LIZ;

    public C1757570vpz(View view) {
        this.LIZ = (FrameLayout) view.findViewById(R.id.gdk);
    }

    @Override // X.InterfaceC1757550vpx
    public final void LIZ(AbstractC1757620vq4 abstractC1757620vq4) {
        InterfaceC1757590vq1 interfaceC1757590vq1;
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            C03DZ.LIZJ(frameLayout);
            abstractC1757620vq4.getView();
            if (abstractC1757620vq4.getParent() == null) {
                FrameLayout frameLayout2 = this.LIZ;
                int i = abstractC1757620vq4.getWindowConfig().LIZJ;
                int childCount = frameLayout2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    KeyEvent.Callback childAt = frameLayout2.getChildAt(i2);
                    if ((childAt instanceof InterfaceC1757590vq1) && (interfaceC1757590vq1 = (InterfaceC1757590vq1) childAt) != null && interfaceC1757590vq1.getWindowConfig().LIZJ > i) {
                        childCount = i2;
                        break;
                    }
                    i2++;
                }
                abstractC1757620vq4.getView();
                frameLayout2.addView(abstractC1757620vq4, childCount);
            }
        }
    }

    @Override // X.InterfaceC1757550vpx
    public final void LIZIZ(String str) {
        Object obj;
        InterfaceC1757590vq1 interfaceC1757590vq1;
        C1757580vq0 windowConfig;
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            Iterator it2 = new C1077420e8y(frameLayout, 16).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                obj = null;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                Object next = c1077410e8x.next();
                KeyEvent.Callback callback = (View) next;
                if ((callback instanceof InterfaceC1757590vq1) && (interfaceC1757590vq1 = (InterfaceC1757590vq1) callback) != null && (windowConfig = interfaceC1757590vq1.getWindowConfig()) != null) {
                    obj = windowConfig.LIZ;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    obj = next;
                    break;
                }
            }
            View view = (View) obj;
            if (view != null) {
                C786410Ut5.LJJJLZIJ(view, frameLayout);
            }
        }
    }

    @Override // X.InterfaceC1757550vpx
    public final List<InterfaceC1757590vq1> LIZJ(EnumC1757300vpY enumC1757300vpY) {
        if (enumC1757300vpY == null) {
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                C1776010wJj c1776010wJj = new C1776010wJj(frameLayout, 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c1776010wJj) {
                    if (obj instanceof InterfaceC1757590vq1) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        FrameLayout frameLayout2 = this.LIZ;
        if (frameLayout2 != null) {
            C1776010wJj c1776010wJj2 = new C1776010wJj(frameLayout2, 1);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c1776010wJj2) {
                if (obj2 instanceof InterfaceC1757590vq1) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((InterfaceC1757590vq1) obj3).getWindowConfig().LIZIZ == enumC1757300vpY) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }
}
