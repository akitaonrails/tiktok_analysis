package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerPlaceholderSettingConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ehM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098740ehM {
    public final ViewGroup LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZJ;
    public final Set<ViewGroup> LIZLLL = new LinkedHashSet();
    public final C1098760ehO LJ = new C1098760ehO();
    public final ViewGroupOnHierarchyChangeListenerC1098750ehN LJFF = new ViewGroup.OnHierarchyChangeListener() { // from class: X.0ehN
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            C1098740ehM c1098740ehM = this.LL;
            if (!c1098740ehM.LIZJ) {
                C1098760ehO c1098760ehO = c1098740ehM.LJ;
                c1098760ehO.LIZ = null;
                c1098760ehO.LIZIZ = false;
                c1098760ehO.LIZJ = 0;
                if (c1098740ehM.LIZ.getChildCount() != 0) {
                    c1098740ehM.LJ.LIZIZ = true;
                }
                c1098740ehM.LIZIZ(0, c1098740ehM.LIZ);
                C1098760ehO c1098760ehO2 = c1098740ehM.LJ;
                if (c1098760ehO2.LIZIZ && c1098760ehO2.LIZ == null && c1098760ehO2.LIZJ >= LiveBannerPlaceholderSettingConfig.INSTANCE.config().getBaseSingleLevel()) {
                    c1098740ehM.LIZ();
                    return;
                }
                ViewGroup viewGroup = c1098740ehM.LJ.LIZ;
                if (viewGroup == null || viewGroup.getChildCount() == 0 || c1098740ehM.LJ.LIZJ < LiveBannerPlaceholderSettingConfig.INSTANCE.config().getDynamicBannerLevel()) {
                    return;
                }
                c1098740ehM.LIZ();
            }
        }
    };

    public final void LIZ() {
        this.LIZJ = true;
        this.LIZIZ.invoke();
        Iterator<ViewGroup> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().setOnHierarchyChangeListener(null);
        }
        this.LIZLLL.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ehN] */
    public C1098740ehM(ViewGroup viewGroup, AwS561S0100000_17 awS561S0100000_17) {
        this.LIZ = viewGroup;
        this.LIZIZ = awS561S0100000_17;
    }

    public final void LIZIZ(int i, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setOnHierarchyChangeListener(this.LJFF);
            this.LIZLLL.add(view);
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                C1098760ehO c1098760ehO = this.LJ;
                if (c1098760ehO.LIZ == null && (childAt instanceof ViewGroup) && (childAt instanceof C21405118pl)) {
                    c1098760ehO.LIZ = (ViewGroup) childAt;
                }
                int i3 = c1098760ehO.LIZJ;
                int i4 = i + 1;
                if (i3 < i4) {
                    i3 = i4;
                }
                c1098760ehO.LIZJ = i3;
                LIZIZ(i4, childAt);
            }
        }
    }
}
