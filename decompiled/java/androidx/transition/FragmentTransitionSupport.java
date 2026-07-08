package androidx.transition;

import X.AbstractC21463118z7;
import X.AbstractC21463718zD;
import X.AbstractC21466418ze;
import X.C1149100g0a;
import X.C19748612Om;
import X.C21463018z6;
import X.InterfaceC21462418z0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class FragmentTransitionSupport extends AbstractC21466418ze {
    public static boolean hasSimpleTarget(AbstractC21463118z7 abstractC21463118z7) {
        if (AbstractC21466418ze.isNullOrEmpty(abstractC21463118z7.LLILZIL) && AbstractC21466418ze.isNullOrEmpty(null) && AbstractC21466418ze.isNullOrEmpty(null)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21466418ze
    public boolean canHandle(Object obj) {
        return obj instanceof AbstractC21463118z7;
    }

    @Override // X.AbstractC21466418ze
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((AbstractC21463118z7) obj).clone();
        }
        return null;
    }

    @Override // X.AbstractC21466418ze
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        C21463018z6 c21463018z6 = new C21463018z6();
        c21463018z6.LJJJ((AbstractC21463118z7) obj);
        return c21463018z6;
    }

    @Override // X.AbstractC21466418ze
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC21463118z7) obj).LIZIZ(view);
        }
    }

    @Override // X.AbstractC21466418ze
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        Object obj2;
        AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) obj;
        if (abstractC21463118z7 == null) {
            return;
        }
        int i = 0;
        if (abstractC21463118z7 instanceof C21463018z6) {
            C21463018z6 c21463018z6 = (C21463018z6) abstractC21463118z7;
            int size = c21463018z6.LLJJLIIIJLLLLLLLZ.size();
            while (i < size) {
                if (i >= 0 && i < c21463018z6.LLJJLIIIJLLLLLLLZ.size()) {
                    obj2 = ListProtector.get(c21463018z6.LLJJLIIIJLLLLLLLZ, i);
                } else {
                    obj2 = null;
                }
                addTargets(obj2, arrayList);
                i++;
            }
            return;
        }
        if (!hasSimpleTarget(abstractC21463118z7) && AbstractC21466418ze.isNullOrEmpty(abstractC21463118z7.LLILZLL)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC21463118z7.LIZIZ((View) ListProtector.get(arrayList, i));
                i++;
            }
        }
    }

    @Override // X.AbstractC21466418ze
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C19748612Om.LIZ(viewGroup, (AbstractC21463118z7) obj);
    }

    @Override // X.AbstractC21466418ze
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC21463118z7) obj).LJJIII(view);
        }
    }

    @Override // X.AbstractC21466418ze
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((AbstractC21463118z7) obj).LJJIIZI(new AbstractC21463718zD() { // from class: X.18zC
                @Override // X.AbstractC21463718zD
                public final Rect LIZ() {
                    return rect;
                }
            });
        }
    }

    @Override // X.AbstractC21466418ze
    public void setEpicenter(Object obj, final Rect rect) {
        if (obj != null) {
            ((AbstractC21463118z7) obj).LJJIIZI(new AbstractC21463718zD() { // from class: X.18zB
                @Override // X.AbstractC21463718zD
                public final Rect LIZ() {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // X.AbstractC21466418ze
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) obj;
        AbstractC21463118z7 abstractC21463118z72 = (AbstractC21463118z7) obj2;
        AbstractC21463118z7 abstractC21463118z73 = (AbstractC21463118z7) obj3;
        AbstractC21463118z7 abstractC21463118z74 = abstractC21463118z7;
        if (abstractC21463118z7 != null) {
            if (abstractC21463118z72 != null) {
                C21463018z6 c21463018z6 = new C21463018z6();
                c21463018z6.LJJJ(abstractC21463118z7);
                c21463018z6.LJJJ(abstractC21463118z72);
                c21463018z6.LJJJJ(1);
                abstractC21463118z74 = c21463018z6;
            }
        } else if (abstractC21463118z72 != null) {
            abstractC21463118z74 = abstractC21463118z72;
        } else {
            abstractC21463118z74 = null;
        }
        if (abstractC21463118z73 != null) {
            C21463018z6 c21463018z62 = new C21463018z6();
            if (abstractC21463118z74 != null) {
                c21463018z62.LJJJ(abstractC21463118z74);
            }
            c21463018z62.LJJJ(abstractC21463118z73);
            return c21463018z62;
        }
        return abstractC21463118z74;
    }

    @Override // X.AbstractC21466418ze
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C21463018z6 c21463018z6 = new C21463018z6();
        if (obj != null) {
            c21463018z6.LJJJ((AbstractC21463118z7) obj);
        }
        if (obj2 != null) {
            c21463018z6.LJJJ((AbstractC21463118z7) obj2);
        }
        if (obj3 != null) {
            c21463018z6.LJJJ((AbstractC21463118z7) obj3);
        }
        return c21463018z6;
    }

    @Override // X.AbstractC21466418ze
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Object obj2;
        AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) obj;
        int i = 0;
        if (abstractC21463118z7 instanceof C21463018z6) {
            C21463018z6 c21463018z6 = (C21463018z6) abstractC21463118z7;
            int size = c21463018z6.LLJJLIIIJLLLLLLLZ.size();
            while (i < size) {
                if (i >= 0 && i < c21463018z6.LLJJLIIIJLLLLLLLZ.size()) {
                    obj2 = ListProtector.get(c21463018z6.LLJJLIIIJLLLLLLLZ, i);
                } else {
                    obj2 = null;
                }
                replaceTargets(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!hasSimpleTarget(abstractC21463118z7)) {
            ArrayList<View> arrayList3 = abstractC21463118z7.LLILZLL;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        abstractC21463118z7.LIZIZ((View) ListProtector.get(arrayList2, i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        abstractC21463118z7.LJJIII((View) ListProtector.get(arrayList, size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21466418ze
    public void scheduleHideFragmentView(Object obj, final View view, final ArrayList<View> arrayList) {
        ((AbstractC21463118z7) obj).LIZ(new InterfaceC21462418z0() { // from class: X.18jl
            @Override // X.InterfaceC21462418z0
            public final void LIZ() {
            }

            @Override // X.InterfaceC21462418z0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC21462418z0
            public final void LIZJ() {
            }

            @Override // X.InterfaceC21462418z0
            public final void LJFF(AbstractC21460218ye abstractC21460218ye) {
            }

            @Override // X.InterfaceC21462418z0
            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                abstractC21463118z7.LJJII(this);
                C786410Ut5.LJLLLLLL(8, view);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C786410Ut5.LJLLLLLL(0, (View) ListProtector.get(arrayList, i));
                }
            }
        });
    }

    @Override // X.AbstractC21466418ze
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) obj;
        ArrayList<View> arrayList2 = abstractC21463118z7.LLILZLL;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC21466418ze.bfsAddViewChildren(arrayList2, (View) ListProtector.get(arrayList, i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        addTargets(abstractC21463118z7, arrayList);
    }

    @Override // X.AbstractC21466418ze
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) obj;
        if (abstractC21463118z7 != null) {
            abstractC21463118z7.LLILZLL.clear();
            abstractC21463118z7.LLILZLL.addAll(arrayList2);
            replaceTargets(abstractC21463118z7, arrayList, arrayList2);
        }
    }

    @Override // X.AbstractC21466418ze
    public void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((AbstractC21463118z7) obj).LIZ(new C1149100g0a() { // from class: X.18z5
            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZ() {
                Object obj5 = obj2;
                if (obj5 != null) {
                    this.LLIZ.replaceTargets(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    this.LLIZ.replaceTargets(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    this.LLIZ.replaceTargets(obj7, arrayList3, null);
                }
            }

            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                abstractC21463118z7.LJJII(this);
            }
        });
    }
}
