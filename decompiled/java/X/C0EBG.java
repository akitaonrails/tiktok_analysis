package X;

import Y.ACListenerS140S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EBG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBG extends C0FC9<C360210EAh, C0EAM> {
    public final Activity LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final boolean LLJJL;
    public final C372830EjZ LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public FrameLayout LLJLIL;
    public C0EDF LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public C0EDF LLJLLIL;
    public FrameLayout LLJLLL;
    public C19670911xj LLJZ;
    public TuxIconView LLJZIJLIL;
    public C367060EaG LLL;
    public TuxTextView LLLF;
    public TuxIconView LLLFF;
    public LinearLayout LLLFFI;
    public TuxIconView LLLFZ;
    public LinearLayout LLLI;
    public TuxIconView LLLII;
    public TuxIconView LLLIIII;
    public FrameLayout LLLIIIIL;
    public LinearLayout LLLIIIL;
    public C1295960jpS LLLIIL;
    public LinearLayout LLLIILIL;
    public final C01GW LLLIL;
    public C0ED7 LLLILZ;

    public final C367060EaG LLLLZLL() {
        return (C367060EaG) this.LLLIL.getValue();
    }

    public final LinearLayout LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yhr);
            this.LLLIIIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.bec);
            this.LLJLLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView LLLLLLJ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.bnb);
            this.LLLII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView LLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.eoo);
            this.LLLFF = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1295960jpS LLLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.dmg);
            this.LLLIIL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final C0EDF LLLLLLLZIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ru3);
            this.LLJLILLLLZIIL = (C0EDF) callbackFindViewById;
        }
        return (C0EDF) callbackFindViewById;
    }

    public final LinearLayout LLLLLLZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ru4);
            this.LLLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView LLLLLLZZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.vk6);
            this.LLLF = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout LLLLLZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.tc5);
            this.LLLFFI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout LLLLZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLIILIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.hc6);
            this.LLLIILIL = (LinearLayout) callbackFindViewById;
        }
        LinearLayout linearLayout = (LinearLayout) callbackFindViewById;
        View viewFindViewById = findViewById(R.id.cuf);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.drawable.alj);
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 58), viewFindViewById);
        }
        return linearLayout;
    }

    public final C0EDF LLLLZIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ui6);
            this.LLJLLIL = (C0EDF) callbackFindViewById;
        }
        return (C0EDF) callbackFindViewById;
    }

    public final TuxIconView LLLLZLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.y6r);
            this.LLLIIII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout LLLLZLLLI() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yh3);
            this.LLJLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final void LLLZ() {
        LLLZLL();
        LinearLayout linearLayoutLLLLLZ = LLLLLZ();
        if (linearLayoutLLLLLZ != null) {
            C337180DJs.LIZJ(linearLayoutLLLLLZ);
        }
        C337180DJs.LIZ(LLLLLLJ());
        C337180DJs.LIZ(LLLLZLLIL());
        LinearLayout linearLayoutLLLLLLZ = LLLLLLZ();
        if (linearLayoutLLLLLLZ != null) {
            C337180DJs.LIZJ(linearLayoutLLLLLLZ);
        }
        View viewRequireView = requireView();
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            viewFindViewById = viewRequireView.findViewById(R.id.ui5);
            this.LLJLL = (LinearLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C337180DJs.LIZ(viewFindViewById);
    }

    public final void LLLZIL() {
        C337180DJs.LIZ(LLLLLL());
        C337180DJs.LIZ(LLLLLLLLL());
        LinearLayout linearLayoutLLLLLZ = LLLLLZ();
        if (linearLayoutLLLLLZ != null) {
            C786410Ut5.LJLLLLLL(4, linearLayoutLLLLLZ);
        }
        if (this.LLJJJJLIIL || this.LLJJL) {
            C337180DJs.LIZ(LLLLLLJ());
            C337180DJs.LIZJ(LLLLZLLIL());
        } else {
            C337180DJs.LIZJ(LLLLLLJ());
            C337180DJs.LIZ(LLLLZLLIL());
        }
        LinearLayout linearLayoutLLLLLLZ = LLLLLLZ();
        if (linearLayoutLLLLLLZ != null) {
            C786410Ut5.LJLLLLLL(4, linearLayoutLLLLLLZ);
        }
        View viewRequireView = requireView();
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            viewFindViewById = viewRequireView.findViewById(R.id.ui5);
            this.LLJLL = (LinearLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C337180DJs.LIZJ(viewFindViewById);
    }

    public final void LLLZLL() {
        if (!LLLLIL().LJIIL.invoke().booleanValue()) {
            C337180DJs.LIZJ(LLLLLL());
        }
        C337180DJs.LIZJ(LLLLLLLLL());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C0EDF c0edfLLLLLLLZIL = LLLLLLLZIL();
        if (c0edfLLLLLLLZIL != null) {
            c0edfLLLLLLLZIL.LLJ = null;
            c0edfLLLLLLLZIL.LLJI = null;
            c0edfLLLLLLLZIL.LLJIJIL = null;
        }
        C0EDF c0edfLLLLZIL = LLLLZIL();
        if (c0edfLLLLZIL != null) {
            c0edfLLLLZIL.LLJ = null;
            c0edfLLLLZIL.LLJI = null;
            c0edfLLLLZIL.LLJIJIL = null;
        }
        super.onDestroyView();
    }

    public final C0ED7 LLLLLJLJLL(String str) {
        int i;
        C0ED7 c0ed7 = new C0ED7();
        c0ed7.LIZJ = str;
        c0ed7.LIZ = new ScrollCenterLayoutManager(requireView().getContext());
        c0ed7.LIZIZ = new C0EJC(3, false);
        if (C353850Du3.LIZ(null)) {
            i = R.drawable.bp2;
        } else {
            i = R.drawable.axt;
        }
        c0ed7.LJIL = new C360450EBf(true, Integer.valueOf(i));
        c0ed7.LJIILL = new C0EDU(true, 60, 60, R.drawable.boe, 0, 0, 240);
        c0ed7.LJIIJ = new C361140EDw(false, 0, false, (TuxIconDrawable) null, (String) null, 0, 126);
        c0ed7.LJIIJJI = new C361120EDu(true, LLLLLLL(R.attr.ee), 0, C0EE1.DOWN, 4, 0, 12, 0.0f, new AwS549S0100000_5(this, 587), AFwS234S0000000_5.get$arr$(258), AFwS234S0000000_5.get$arr$(259), 1385);
        c0ed7.LJ = false;
        c0ed7.LJII = false;
        c0ed7.LJIIIZ = false;
        c0ed7.LJIILIIL = new C0EDB(126);
        c0ed7.LJIIL = new C361130EDv(54, 54, 8, null, R.drawable.bon, R.drawable.bon, 0.0f, null, 3985);
        c0ed7.LJIJJLI = new C0EDD(new AwS549S0100000_5(this, 588), new InterfaceC361150EDx() { // from class: X.0EBJ
            @Override // X.InterfaceC361150EDx
            public final void LIZ() {
            }

            @Override // X.InterfaceC361150EDx
            public final void LIZJ(View view) {
                C19670811xi c19670811xi;
                if ((view instanceof C19670911xj) && (c19670811xi = (C19670811xi) view) != null) {
                    c19670811xi.setProgress(100);
                }
            }

            @Override // X.InterfaceC361150EDx
            public final void LIZIZ(int i2, View view) {
                C19670811xi c19670811xi;
                if ((view instanceof C19670911xj) && (c19670811xi = (C19670811xi) view) != null) {
                    c19670811xi.setProgress(i2);
                }
            }
        }, 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindResource bg ");
        sbLIZ.append(R.drawable.bon);
        C201955140j.LIZIZ("ResourceListAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return c0ed7;
    }

    public final int LLLLLLL(int i) {
        Integer numLIZJ;
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(i, sceneContext)) != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    public final ResourceItem LLLLLZL(String str) {
        List<ResourceItem> resourceList;
        List<ResourceItem> resourceList2;
        ResourceItem next;
        C0EDF c0edfLLLLLLLZIL = LLLLLLLZIL();
        ResourceItem resourceItem = null;
        if (c0edfLLLLLLLZIL != null && (resourceList2 = c0edfLLLLLLLZIL.getResourceList()) != null) {
            Iterator<ResourceItem> it2 = resourceList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getResourceId(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ResourceItem resourceItem2 = next;
            if (resourceItem2 != null) {
                return resourceItem2;
            }
        }
        C0EDF c0edfLLLLZIL = LLLLZIL();
        if (c0edfLLLLZIL == null || (resourceList = c0edfLLLLZIL.getResourceList()) == null) {
            return null;
        }
        Iterator<ResourceItem> it3 = resourceList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ResourceItem next2 = it3.next();
            if (Intrinsics.LJFF(next2.getResourceId(), str)) {
                resourceItem = next2;
                break;
            }
        }
        return resourceItem;
    }

    public final void LLLZI(final ResourceItem resourceItem) {
        C0ED7 c0ed7;
        if (this.LLLILZ == null) {
            this.LLLILZ = LLLLLJLJLL(null);
            final C0EDF c0edfLLLLZIL = LLLLZIL();
            if (c0edfLLLLZIL != null) {
                c0edfLLLLZIL.setResourceListInitListener(new C0EDS() { // from class: X.0EB1
                    @Override // X.C0EDS
                    public final List<ResourceItem> LIZ() {
                        return resourceItem.getChildResources();
                    }

                    @Override // X.C0EDS
                    public final List<ResourceItem> LIZJ(List<? extends ResourceItem> list) {
                        ArrayList arrayList = new ArrayList();
                        for (ResourceItem resourceItem2 : list) {
                            C0EWB.LIZ.getClass();
                            if (!C0EWB.LIZLLL(resourceItem2)) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(((ResourceItem) it2.next()).getResourceId(), resourceItem2.getResourceId())) {
                                            break;
                                        }
                                    }
                                }
                                arrayList.add(resourceItem2);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.C0EDS
                    public final void LIZIZ(boolean z, boolean z2) {
                        int size;
                        List<ResourceItem> resourceList;
                        if (this.LIZ.mViewDestroyed) {
                            return;
                        }
                        C0EDF c0edf = c0edfLLLLZIL;
                        C0EDF c0edfLLLLZIL2 = this.LIZ.LLLLZIL();
                        if (c0edfLLLLZIL2 != null && (resourceList = c0edfLLLLZIL2.getResourceList()) != null) {
                            size = resourceList.size();
                        } else {
                            size = 0;
                        }
                        c0edf.LIZJ(size);
                    }
                });
                c0edfLLLLZIL.setOnItemClickListener(new C0E16() { // from class: X.0EAt
                    @Override // X.C0EDC
                    public final void LIZIZ(int i, ResourceItem resourceItem2, boolean z) {
                        if (resourceItem2 == null) {
                            return;
                        }
                        this.LIZ.LLLLIL().LIZIZ.invoke(Boolean.valueOf(z), Integer.valueOf(i), resourceItem2);
                    }
                });
                c0edfLLLLZIL.setResourceListMobListener(new C0EDT() { // from class: X.0EAH
                    @Override // X.C0EDT
                    public final void LIZIZ(boolean z, long j, boolean z2, Exception exc, Integer num, boolean z3) {
                    }

                    @Override // X.C0EDT
                    public final void LIZ(boolean z, boolean z2, long j, Exception exc, Integer num, ResourceItem resourceItem2) {
                        String message;
                        C0EAE c0eae = C0EAE.LIZ;
                        int i = !z ? 1 : 0;
                        String strValueOf = String.valueOf(num);
                        if (exc != null) {
                            message = exc.getMessage();
                        } else {
                            message = null;
                        }
                        Integer numValueOf = Integer.valueOf(z2 ? 1 : 0);
                        Integer numValueOf2 = Integer.valueOf((int) j);
                        String effectId = resourceItem2.getEffectId();
                        String resourceId = resourceItem2.getResourceId();
                        String name = resourceItem2.getName();
                        Boolean bool = Boolean.FALSE;
                        c0eae.getClass();
                        C0EAE.LJII(i, strValueOf, message, numValueOf, numValueOf2, effectId, resourceId, name, bool);
                    }
                });
            }
        }
        C0EDF c0edfLLLLZIL2 = LLLLZIL();
        if (c0edfLLLLZIL2 != null && (c0ed7 = this.LLLILZ) != null) {
            C0EDF.LJFF(c0edfLLLLZIL2, new C0ED8(c0ed7), null, null, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r2
      0x0084: PHI (r2v6 boolean) = (r2v1 boolean), (r2v7 boolean) binds: [B:47:0x00a9, B:37:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZIIL(boolean r11) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EBG.LLLZIIL(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[PHI: r1
      0x0041: PHI (r1v33 android.view.View) = (r1v32 android.view.View), (r1v39 android.view.View) binds: [B:12:0x0031, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[PHI: r1
      0x0080: PHI (r1v30 android.view.View) = (r1v29 android.view.View), (r1v31 android.view.View) binds: [B:28:0x0073, B:30:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028c A[PHI: r1
      0x028c: PHI (r1v2 android.view.View) = (r1v1 android.view.View), (r1v4 android.view.View) binds: [B:67:0x027f, B:69:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EBG.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ() && (this.LLJJJJLIIL || this.LLJJL)) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c26, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c25, viewGroup, false);
    }

    public C0EBG(C1DRG c1drg, Activity activity, boolean z, boolean z2, C372830EjZ c372830EjZ) {
        super(c1drg);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = z;
        this.LLJJL = z2;
        this.LLJJLIIIJLLLLLLLZ = c372830EjZ;
        this.LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 589));
    }
}
