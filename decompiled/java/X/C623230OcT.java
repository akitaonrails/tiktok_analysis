package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.inbox.bulletin.animation.BulletinInputAnimationManagerAssem;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623230OcT extends C09AY implements Function1<C620650OVz, Unit> {
    public final /* synthetic */ BulletinInputAnimationManagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623230OcT(BulletinInputAnimationManagerAssem bulletinInputAnimationManagerAssem) {
        super(1);
        this.LL = bulletinInputAnimationManagerAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C620650OVz c620650OVz) {
        boolean z;
        List listGl;
        C0OWE c0owe;
        View view;
        View view2;
        int iIntValue;
        Integer num;
        LinearLayout.LayoutParams layoutParams;
        TextView textView;
        int measuredHeight;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        float f;
        int maxHeight;
        int i2;
        int marginStart;
        int marginEnd;
        int i3;
        TextView textView2;
        LinearLayout.LayoutParams layoutParams3;
        C620650OVz c620650OVz2 = c620650OVz;
        BulletinInputAnimationManagerAssem bulletinInputAnimationManagerAssem = this.LL;
        bulletinInputAnimationManagerAssem.m244do();
        if (!c620650OVz2.LIZ() && !c620650OVz2.LIZJ()) {
            ((ArrayList) bulletinInputAnimationManagerAssem.LLIZ).clear();
            ((ArrayList) bulletinInputAnimationManagerAssem.LLIZLLLIL).clear();
            Iterator it2 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
            while (it2.hasNext()) {
                InterfaceC623330Ocd interfaceC623330Ocd = (InterfaceC623330Ocd) ((Reference) it2.next()).get();
                if (interfaceC623330Ocd != null) {
                    interfaceC623330Ocd.D4(c620650OVz2, EnumC617880OLi.PREPARE, bulletinInputAnimationManagerAssem);
                }
            }
            Iterator it3 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
            while (it3.hasNext()) {
                InterfaceC623330Ocd interfaceC623330Ocd2 = (InterfaceC623330Ocd) ((Reference) it3.next()).get();
                if (interfaceC623330Ocd2 != null) {
                    interfaceC623330Ocd2.D4(c620650OVz2, EnumC617880OLi.PERFORM, bulletinInputAnimationManagerAssem);
                }
            }
            bulletinInputAnimationManagerAssem.ho(c620650OVz2);
        } else {
            ((ArrayList) bulletinInputAnimationManagerAssem.LLIZ).clear();
            ((ArrayList) bulletinInputAnimationManagerAssem.LLIZLLLIL).clear();
            Iterator it4 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
            while (it4.hasNext()) {
                InterfaceC623330Ocd interfaceC623330Ocd3 = (InterfaceC623330Ocd) ((Reference) it4.next()).get();
                if (interfaceC623330Ocd3 != null) {
                    interfaceC623330Ocd3.D4(c620650OVz2, EnumC617880OLi.PREPARE, bulletinInputAnimationManagerAssem);
                }
            }
            ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLJI).clear();
            ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLJIJIL).clear();
            bulletinInputAnimationManagerAssem.LLJILJIL.clear();
            Iterator it5 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                InterfaceC623330Ocd interfaceC623330Ocd4 = (InterfaceC623330Ocd) ((Reference) it5.next()).get();
                if (interfaceC623330Ocd4 != null && (listGl = interfaceC623330Ocd4.Gl(C0OSF.NORMAL, C0OWM.HIDE)) != null && (c0owe = (C0OWE) C13LP.LJJJLL(listGl)) != null && (view = c0owe.LIZ) != null) {
                    Object parent = view.getParent();
                    if ((parent instanceof LinearLayout) && (view2 = (View) parent) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it6 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
                        while (it6.hasNext()) {
                            InterfaceC623330Ocd interfaceC623330Ocd5 = (InterfaceC623330Ocd) ((Reference) it6.next()).get();
                            if (interfaceC623330Ocd5 != null) {
                                for (C0OWE c0owe2 : interfaceC623330Ocd5.Gl(c620650OVz2.LIZLLL, c620650OVz2.LIZIZ)) {
                                    linkedHashMap.put(c0owe2.LIZ, c0owe2.LIZIZ);
                                }
                                for (C0OWE c0owe3 : interfaceC623330Ocd5.eb(c620650OVz2.LIZLLL, c620650OVz2.LIZIZ)) {
                                    linkedHashMap2.put(c0owe3.LIZ, c0owe3.LIZIZ);
                                }
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            bulletinInputAnimationManagerAssem.LLJILJIL.putAll(linkedHashMap2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[LayoutAnim] Compute targets: page(");
                            sbLIZ.append(c620650OVz2.LIZJ);
                            sbLIZ.append("->");
                            sbLIZ.append(c620650OVz2.LIZLLL);
                            sbLIZ.append("), panel(");
                            sbLIZ.append(c620650OVz2.LIZ);
                            sbLIZ.append("->");
                            sbLIZ.append(c620650OVz2.LIZIZ);
                            sbLIZ.append("), animViews=");
                            sbLIZ.append(linkedHashMap.size());
                            sbLIZ.append(", transitionViews=");
                            sbLIZ.append(linkedHashMap2.size());
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                            Set setKeySet = linkedHashMap.keySet();
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
                            int i4 = 16;
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                            for (Object obj : setKeySet) {
                                linkedHashMap3.put(obj, Integer.valueOf(((View) obj).getHeight()));
                            }
                            Set setKeySet2 = linkedHashMap2.keySet();
                            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet2, 10));
                            if (iLIZIZ2 >= 16) {
                                i4 = iLIZIZ2;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i4);
                            for (Object obj2 : setKeySet2) {
                                View view3 = (View) obj2;
                                ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                                } else {
                                    marginLayoutParams = null;
                                }
                                if (layoutParams4 != null) {
                                    i = layoutParams4.height;
                                } else {
                                    i = 0;
                                }
                                int visibility = view3.getVisibility();
                                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                                    f = layoutParams3.weight;
                                } else {
                                    f = 0.0f;
                                }
                                if ((view3 instanceof TextView) && (textView2 = (TextView) view3) != null) {
                                    maxHeight = textView2.getMaxHeight();
                                } else {
                                    maxHeight = Integer.MAX_VALUE;
                                }
                                if (marginLayoutParams != null) {
                                    i2 = marginLayoutParams.topMargin;
                                    marginStart = marginLayoutParams.getMarginStart();
                                    marginEnd = marginLayoutParams.getMarginEnd();
                                    i3 = marginLayoutParams.bottomMargin;
                                } else {
                                    i2 = 0;
                                    marginStart = 0;
                                    marginEnd = 0;
                                    i3 = 0;
                                }
                                linkedHashMap4.put(obj2, new C623290OcZ(i, visibility, f, maxHeight, i2, marginStart, marginEnd, i3, view3.getMinimumHeight(), view3.getPaddingTop(), view3.getPaddingStart(), view3.getPaddingEnd(), view3.getPaddingBottom()));
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                View view4 = (View) entry.getKey();
                                C623320Occ c623320Occ = (C623320Occ) entry.getValue();
                                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                                if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams5) != null) {
                                    layoutParams2.weight = c623320Occ.LIZ;
                                    layoutParams2.height = c623320Occ.LIZIZ;
                                    C786410Ut5.W5(view4, layoutParams2);
                                }
                                C786410Ut5.LJLLLLLL(0, view4);
                            }
                            BulletinInputAnimationManagerAssem.bo(linkedHashMap2);
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 1073741824));
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                View view5 = (View) entry2.getKey();
                                C623320Occ c623320Occ2 = (C623320Occ) entry2.getValue();
                                if (c623320Occ2.LIZJ == 8) {
                                    measuredHeight = 0;
                                } else {
                                    measuredHeight = view5.getMeasuredHeight();
                                }
                                bulletinInputAnimationManagerAssem.LLJI.put(view5, Integer.valueOf(measuredHeight));
                                bulletinInputAnimationManagerAssem.LLJIJIL.put(view5, c623320Occ2);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("[LayoutAnim]   view=");
                                sbLIZ2.append(view5.getId());
                                sbLIZ2.append(": start=");
                                sbLIZ2.append(linkedHashMap3.get(view5));
                                sbLIZ2.append(", measured=");
                                sbLIZ2.append(view5.getMeasuredHeight());
                                sbLIZ2.append(", target=");
                                sbLIZ2.append(measuredHeight);
                                sbLIZ2.append(", targetVis=");
                                sbLIZ2.append(c623320Occ2.LIZJ);
                                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            if (!c620650OVz2.LIZ()) {
                                Iterator it7 = linkedHashMap2.entrySet().iterator();
                                while (it7.hasNext()) {
                                    View view6 = (View) ((Map.Entry) it7.next()).getKey();
                                    C623290OcZ c623290OcZ = (C623290OcZ) linkedHashMap4.get(view6);
                                    if (c623290OcZ != null) {
                                        ViewGroup.LayoutParams layoutParams6 = view6.getLayoutParams();
                                        if (layoutParams6 != null) {
                                            layoutParams6.height = c623290OcZ.LIZ;
                                            if (layoutParams6 instanceof LinearLayout.LayoutParams) {
                                                ((LinearLayout.LayoutParams) layoutParams6).weight = c623290OcZ.LIZJ;
                                            }
                                            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                                marginLayoutParams2.topMargin = c623290OcZ.LJ;
                                                marginLayoutParams2.setMarginStart(c623290OcZ.LJFF);
                                                marginLayoutParams2.setMarginEnd(c623290OcZ.LJI);
                                                marginLayoutParams2.bottomMargin = c623290OcZ.LJII;
                                            }
                                            C786410Ut5.W5(view6, layoutParams6);
                                        }
                                        if ((view6 instanceof TextView) && (textView = (TextView) view6) != null) {
                                            textView.setMaxHeight(c623290OcZ.LIZLLL);
                                        }
                                        view6.setMinimumHeight(c623290OcZ.LJIIIIZZ);
                                        view6.setPaddingRelative(c623290OcZ.LJIIJ, c623290OcZ.LJIIIZ, c623290OcZ.LJIIJJI, c623290OcZ.LJIIL);
                                        C786410Ut5.LJLLLLLL(c623290OcZ.LIZIZ, view6);
                                    }
                                }
                            }
                            Iterator it8 = linkedHashMap.entrySet().iterator();
                            while (it8.hasNext()) {
                                View view7 = (View) ((Map.Entry) it8.next()).getKey();
                                Integer num2 = (Integer) linkedHashMap3.get(view7);
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                ViewGroup.LayoutParams layoutParams7 = view7.getLayoutParams();
                                if ((layoutParams7 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams7) != null) {
                                    layoutParams.weight = 0.0f;
                                    layoutParams.height = iIntValue;
                                    C786410Ut5.W5(view7, layoutParams);
                                }
                                if (iIntValue > 0 || ((num = (Integer) ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLJI).get(view7)) != null && num.intValue() > 0)) {
                                    C786410Ut5.LJLLLLLL(0, view7);
                                }
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry3 : ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLJI).entrySet()) {
                View view8 = (View) entry3.getKey();
                int iIntValue2 = ((Number) entry3.getValue()).intValue();
                int height = view8.getHeight();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[LayoutAnim] animateHeight: viewId=");
                sbLIZ3.append(view8.getId());
                sbLIZ3.append(", currentHeight=");
                sbLIZ3.append(height);
                sbLIZ3.append(", targetHeight=");
                sbLIZ3.append(iIntValue2);
                sbLIZ3.append(", skip=");
                if (height == iIntValue2) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ3.append(z);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
                bulletinInputAnimationManagerAssem.He(view8, iIntValue2, 250L, false);
            }
            Iterator it9 = ((LinkedHashMap) bulletinInputAnimationManagerAssem.LLILLJJLI).values().iterator();
            while (it9.hasNext()) {
                InterfaceC623330Ocd interfaceC623330Ocd6 = (InterfaceC623330Ocd) ((Reference) it9.next()).get();
                if (interfaceC623330Ocd6 != null) {
                    interfaceC623330Ocd6.D4(c620650OVz2, EnumC617880OLi.PERFORM, bulletinInputAnimationManagerAssem);
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[LayoutAnim] AnimatorSet: pendingCount=");
            sbLIZ4.append(((ArrayList) bulletinInputAnimationManagerAssem.LLIZ).size());
            sbLIZ4.append(", immediateCount=");
            sbLIZ4.append(((ArrayList) bulletinInputAnimationManagerAssem.LLJ).size());
            sbLIZ4.append(", change=");
            sbLIZ4.append(c620650OVz2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ4));
            ((ArrayList) bulletinInputAnimationManagerAssem.LLIZLLLIL).add(new C623240OcU(bulletinInputAnimationManagerAssem, c620650OVz2));
            bulletinInputAnimationManagerAssem.ho(c620650OVz2);
        }
        return Unit.LIZ;
    }
}
