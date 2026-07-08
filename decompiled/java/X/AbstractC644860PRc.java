package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0PRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC644860PRc implements InterfaceC644890PRf {
    public ComponentInfo LIZ;
    public final ViewGroup LIZIZ;
    public final Map<String, InterfaceC644890PRf> LIZJ = new LinkedHashMap();
    public View LIZLLL;
    public boolean LJ;

    public abstract boolean LIZLLL(ComponentInfo componentInfo);

    public abstract InterfaceC644890PRf LJ(ViewGroup viewGroup, ComponentInfo componentInfo);

    public abstract int LJFF();

    public abstract void LJII();

    @Override // X.InterfaceC644890PRf
    public final void LJI() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view = this.LIZLLL;
        ViewParent parent = view != null ? view.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LIZLLL, viewGroup2);
        }
        View view2 = this.LIZLLL;
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC644890PRf) ((Map.Entry) it2.next()).getValue()).LJI();
        }
    }

    @Override // X.InterfaceC644890PRf
    public void init() {
        List<ComponentInfo> list;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ.getContext()), LJFF(), this.LIZIZ, false);
        this.LIZLLL = viewTd;
        if ((viewTd instanceof ViewGroup) && (list = this.LIZ.components) != null) {
            for (ComponentInfo componentInfo : list) {
                InterfaceC644890PRf interfaceC644890PRfLJ = LJ((ViewGroup) viewTd, componentInfo);
                if (interfaceC644890PRfLJ != null) {
                    this.LIZJ.put(componentInfo.type, interfaceC644890PRfLJ);
                    interfaceC644890PRfLJ.init();
                }
            }
        }
        this.LJ = true;
    }

    @Override // X.InterfaceC644890PRf
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC644890PRf
    public final ComponentInfo LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC644890PRf
    public final Map<String, InterfaceC644890PRf> getChildNodes() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC644890PRf
    public final View getContentView() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC644890PRf
    public final void LIZJ(ComponentInfo componentInfo) {
        View view = this.LIZLLL;
        if (view != null) {
            if (view instanceof ViewGroup) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<ComponentInfo> list = componentInfo.components;
                if (list != null) {
                    for (ComponentInfo componentInfo2 : list) {
                        InterfaceC644890PRf interfaceC644890PRfLJ = (InterfaceC644890PRf) ((LinkedHashMap) this.LIZJ).get(componentInfo2.type);
                        if (interfaceC644890PRfLJ != null || (interfaceC644890PRfLJ = LJ((ViewGroup) view, componentInfo2)) != null) {
                            if (interfaceC644890PRfLJ.LIZ()) {
                                interfaceC644890PRfLJ.LIZJ(componentInfo2);
                            } else {
                                interfaceC644890PRfLJ.init();
                            }
                            linkedHashMap.put(componentInfo2.type, interfaceC644890PRfLJ);
                        }
                    }
                }
                for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        ((InterfaceC644890PRf) entry.getValue()).LJI();
                    }
                }
                ((LinkedHashMap) this.LIZJ).clear();
                this.LIZJ.putAll(linkedHashMap);
            }
            if (LIZLLL(componentInfo)) {
                this.LIZ = componentInfo;
                LJII();
                return;
            }
            return;
        }
        "component should call init(parentView: ViewGroup) method first".toString();
        throw new IllegalStateException("component should call init(parentView: ViewGroup) method first");
    }

    public AbstractC644860PRc(ViewGroup viewGroup, ComponentInfo componentInfo) {
        this.LIZ = componentInfo;
        this.LIZIZ = viewGroup;
    }
}
