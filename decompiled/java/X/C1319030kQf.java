package X;

import Y.ARunnableS120S0100000_20;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0kQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1319030kQf extends AbstractC21673619ry<C1318570kPv> {
    public final UIList LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public JavaOnlyArray LLIZLLLIL;
    public JavaOnlyArray LLJ;
    public JavaOnlyArray LLJI;
    public JavaOnlyArray LLJIJIL;
    public JavaOnlyArray LLJILJIL;
    public JavaOnlyArray LLJILJILJ;
    public JavaOnlyArray LLJILLL;
    public JavaOnlyArray LLJJ;
    public JavaOnlyArray LLJJI;
    public int LLJJIJI;
    public final C1319150kQr LLJJIJIIJIL;
    public JavaOnlyArray LLJJIJIL;
    public HashMap<String, Integer> LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final ARunnableS120S0100000_20 LLJJL = new ARunnableS120S0100000_20(this, 59);
    public final ARunnableS120S0100000_20 LLJJLIIIJLLLLLLLZ = new ARunnableS120S0100000_20(this, 60);
    public final ArrayList<HashMap<Integer, Integer>> LLJL = new ArrayList<>();
    public final HashMap<String, Integer> LLJLIL = new HashMap<>();
    public final HashMap<String, Integer> LL = new HashMap<>();
    public final HashMap<Long, C1318570kPv> LLILLJJLI = new HashMap<>();
    public final C1319110kQn LLJJIII = new C1319110kQn(this);

    public final long LLLI() {
        long sign = ((long) this.LLILLL.getSign()) << 32;
        int i = this.LLJJIJI;
        this.LLJJIJI = i + 1;
        return sign + ((long) i);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        JavaOnlyArray javaOnlyArray = this.LLIZLLLIL;
        if (javaOnlyArray != null) {
            return javaOnlyArray.size();
        }
        return 0;
    }

    public final int LLLII(int i) {
        for (int i2 = 0; i2 < this.LLJ.size(); i2++) {
            Integer num = (Integer) this.LLJ.get(i2);
            if (num.intValue() >= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final int LLLIIIIL(int i) {
        for (int size = this.LLJ.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.LLJ.get(size);
            if (num.intValue() <= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final int LLLIILIL(int i) {
        for (int i2 = 0; i2 < this.LLJ.size(); i2++) {
            Integer num = (Integer) this.LLJ.get(i2);
            if (num.intValue() >= i) {
                if (this.LLJIJIL.contains(Integer.valueOf(num.intValue()))) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final int LLLIL(int i) {
        for (int size = this.LLJ.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.LLJ.get(size);
            if (num.intValue() <= i) {
                if (this.LLJI.contains(Integer.valueOf(num.intValue()))) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final boolean LLLILZ(UIComponent uIComponent) {
        ViewGroup viewGroup;
        UIComponent uIComponent2;
        String str;
        UIList uIList = this.LLILLL;
        if (uIList != null && (viewGroup = (ViewGroup) uIList.mView) != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C1318540kPs) && (uIComponent2 = ((C1318540kPs) childAt).getUIComponent()) != null && (str = uIComponent2.LLILLJJLI) != null && str.equals(uIComponent.LLILLJJLI)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LLLILZLLLI(int i) {
        return this.LLJ.contains(Integer.valueOf(i));
    }

    public final void LLLJL(C1318570kPv c1318570kPv) {
        C1319060kQi c1319060kQi;
        UIComponent uIComponent = c1318570kPv.LL.LLILLJJLI;
        if (uIComponent != null) {
            c1318570kPv.I5();
            if (this.LLILLL.LLLII != null && (LLLILZ(uIComponent) || ((c1319060kQi = this.LLILLL.LLLII) != null && c1319060kQi.LIZIZ(uIComponent.LLILLJJLI)))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("when recycling the child asynchronously,if the view of the component is used, you cannot recycle the component. the itemKey is :");
                sbLIZ.append(uIComponent.LLILLJJLI);
                sbLIZ.append(" position:");
                sbLIZ.append(c1318570kPv.getAdapterPosition());
                LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (this.LLIZ) {
                UIList uIList = this.LLILLL;
                InterfaceC1311870kF7 interfaceC1311870kF7 = uIList.LL;
                int sign = uIList.getSign();
                int sign2 = uIComponent.getSign();
                LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.LJJJLIIL(sign, sign2);
                }
                c1318570kPv.LL.LL = 0;
                return;
            }
            this.LLILLL.LJJIJIIJIL(uIComponent);
        }
    }

    public final void LLLL(UIComponent uIComponent) {
        C1319060kQi c1319060kQi;
        if (uIComponent != null) {
            if (this.LLILLL.LLLII != null && (LLLILZ(uIComponent) || ((c1319060kQi = this.LLILLL.LLLII) != null && c1319060kQi.LIZIZ(uIComponent.LLILLJJLI)))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recycleHolderComponent the component is used. itemKey :");
                sbLIZ.append(uIComponent.LLILLJJLI);
                LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (this.LLIZ) {
                UIList uIList = this.LLILLL;
                InterfaceC1311870kF7 interfaceC1311870kF7 = uIList.LL;
                int sign = uIList.getSign();
                int sign2 = uIComponent.getSign();
                LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.LJJJLIIL(sign, sign2);
                    return;
                }
                return;
            }
            this.LLILLL.LJJIJIIJIL(uIComponent);
        }
    }

    public final void LLLLIIL(JavaOnlyMap javaOnlyMap) {
        boolean z;
        UIList uIList;
        T t;
        UIList uIList2;
        T t2;
        JavaOnlyArray javaOnlyArray = this.LLIZLLLIL;
        if (javaOnlyArray != null && this.LLJ != null && javaOnlyArray.size() == this.LLJ.size()) {
            z = true;
        } else {
            z = false;
        }
        if (javaOnlyMap != null && !javaOnlyMap.isEmpty()) {
            ReadableArray array = javaOnlyMap.getArray("itemkeys");
            if (array instanceof JavaOnlyArray) {
                this.LLJJIJIL = (JavaOnlyArray) array;
            }
            this.LLJJJ = new HashMap<>();
            for (int i = 0; i < this.LLJJIJIL.size(); i++) {
                this.LLJJJ.put(this.LLJJIJIL.getString(i), Integer.valueOf(i));
            }
            ReadableArray array2 = javaOnlyMap.getArray("fullspan");
            if (array2 instanceof JavaOnlyArray) {
                this.LLJ = (JavaOnlyArray) array2;
            }
            ReadableArray array3 = javaOnlyMap.getArray("viewTypes");
            if (array3 instanceof JavaOnlyArray) {
                this.LLIZLLLIL = (JavaOnlyArray) array3;
            }
            ReadableArray array4 = javaOnlyMap.getArray("stickyTop");
            if (array4 instanceof JavaOnlyArray) {
                this.LLJI = (JavaOnlyArray) array4;
            }
            ReadableArray array5 = javaOnlyMap.getArray("stickyBottom");
            if (array5 instanceof JavaOnlyArray) {
                this.LLJIJIL = (JavaOnlyArray) array5;
            }
            ReadableArray array6 = javaOnlyMap.getArray("estimatedHeight");
            if (array6 instanceof JavaOnlyArray) {
                this.LLJILJIL = (JavaOnlyArray) array6;
            }
            ReadableArray array7 = javaOnlyMap.getArray("estimatedHeightPx");
            if (array7 instanceof JavaOnlyArray) {
                this.LLJILJILJ = (JavaOnlyArray) array7;
            }
            boolean z2 = javaOnlyMap.getBoolean("diffable");
            this.LLILZ = javaOnlyMap.getBoolean("newarch");
            for (int i2 = 0; i2 < this.LLIZLLLIL.size(); i2++) {
                String string = this.LLIZLLLIL.getString(i2);
                if (!this.LL.containsKey(string)) {
                    HashMap<String, Integer> map = this.LL;
                    map.put(string, Integer.valueOf(map.size()));
                }
            }
            if (!z && z2 && this.LLILZIL) {
                ReadableMap map2 = javaOnlyMap.getMap("diffResult");
                if (map2 != null && map2.size() > 0) {
                    this.LLJJJJLIIL = true;
                }
                C1319110kQn c1319110kQn = this.LLJJIII;
                c1319110kQn.getClass();
                c1319110kQn.LIZ = map2.getArray("insertions");
                c1319110kQn.LIZIZ = map2.getArray("removals");
                c1319110kQn.LIZJ = map2.getArray("updateFrom");
                c1319110kQn.LIZLLL = map2.getArray("updateTo");
                c1319110kQn.LJ = map2.getArray("moveFrom");
                c1319110kQn.LJFF = map2.getArray("moveTo");
                if (C1319110kQn.LIZIZ(c1319110kQn.LIZ) || C1319110kQn.LIZIZ(c1319110kQn.LIZIZ) || C1319110kQn.LIZIZ(c1319110kQn.LIZJ) || C1319110kQn.LIZIZ(c1319110kQn.LIZLLL) || C1319110kQn.LIZIZ(c1319110kQn.LJ) || C1319110kQn.LIZIZ(c1319110kQn.LJFF)) {
                    c1319110kQn.LJI.LLILZIL = false;
                }
                if (this.LLILZ && (uIList2 = this.LLILLL) != null && (t2 = uIList2.mView) != 0 && ((RecyclerView) t2).isComputingLayout()) {
                    C1289620jfE.LIZJ(this.LLJJL);
                    return;
                } else {
                    this.LLJJL.run();
                    return;
                }
            }
            this.LLJJJJLIIL = true;
            this.LLJLIL.clear();
            if (this.LLILZ && (uIList = this.LLILLL) != null && (t = uIList.mView) != 0 && ((RecyclerView) t).isComputingLayout()) {
                C1289620jfE.LIZJ(this.LLJJLIIIJLLLLLLLZ);
            } else {
                this.LLJJLIIIJLLLLLLLZ.run();
            }
        }
    }

    public final void LLLLIILL(UIComponent uIComponent) {
        int width;
        if (this.LLILLL.LLLI && uIComponent != null && !TextUtils.isEmpty(uIComponent.LLILLJJLI)) {
            if (this.LLILLL.LLJJJJJIL) {
                width = uIComponent.getHeight();
            } else {
                width = uIComponent.getWidth();
            }
            int i = UIList.LLLL;
            this.LLJLIL.put(uIComponent.LLILLJJLI, Integer.valueOf(width));
        }
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        if (this.mHasStableIds) {
            return i;
        }
        return -1L;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Integer num = this.LL.get(this.LLIZLLLIL.getString(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        int height;
        int i;
        C1318570kPv c1318570kPv = (C1318570kPv) viewHolder;
        if (c1318570kPv.LL.LLILLJJLI == null && (!this.LLIZ || !this.LLILLJJLI.containsValue(c1318570kPv))) {
            if (this.LLILZ) {
                LLLFZ(c1318570kPv, c1318570kPv.getAdapterPosition());
            } else {
                onBindViewHolder(c1318570kPv, c1318570kPv.getAdapterPosition());
            }
        }
        if (!this.LLIZ) {
            this.LLJJIJIIJIL.LIZJ(c1318570kPv);
        }
        if (this.LLILZ) {
            C1318540kPs c1318540kPs = c1318570kPv.LL;
            if (c1318540kPs.LLILLJJLI != null && this.LLJJJIL) {
                UIComponent uIComponent = c1318540kPs.LLILLJJLI;
                uIComponent.onListCellAppear(uIComponent.LLILLJJLI, this.LLILLL);
            }
        }
        int adapterPosition = c1318570kPv.getAdapterPosition();
        int itemCount = (getItemCount() - c1318570kPv.getAdapterPosition()) - 1;
        int i2 = 0;
        if (itemCount == 0 || (itemCount < this.LLILLL.LLILZ && LLLII(adapterPosition) == -1)) {
            c1318570kPv.LL.LLIZ = 0;
        } else {
            C1318540kPs c1318540kPs2 = c1318570kPv.LL;
            UIList uIList = this.LLILLL;
            if (uIList.LLLIIIIL) {
                i = 0;
            } else {
                i = uIList.LLILZIL;
            }
            c1318540kPs2.LLIZ = i;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c1318570kPv.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = LLLILZLLLI(adapterPosition);
        }
        if (!this.LLJL.isEmpty()) {
            UIComponent uIComponent2 = c1318570kPv.LL.LLILLJJLI;
            if (uIComponent2 == null) {
                height = 0;
            } else {
                height = uIComponent2.getHeight();
            }
            if (((RecyclerView) this.LLILLL.mView).getLayoutManager() instanceof ListLayoutManager.ListLinearLayoutManager) {
                ((HashMap) ListProtector.get(this.LLJL, 0)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                return;
            }
            if (((RecyclerView) this.LLILLL.mView).getLayoutManager() instanceof C1319080kQk) {
                C21681819tI c21681819tI = (C21681819tI) c1318570kPv.itemView.getLayoutParams();
                if (LLLILZLLLI(adapterPosition)) {
                    while (i2 < this.LLJL.size()) {
                        ((HashMap) ListProtector.get(this.LLJL, i2)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                        i2++;
                    }
                    return;
                } else {
                    while (i2 < this.LLJL.size()) {
                        if (c21681819tI.LIZ() == i2) {
                            ((HashMap) ListProtector.get(this.LLJL, i2)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                        } else {
                            ((HashMap) ListProtector.get(this.LLJL, i2)).remove(Integer.valueOf(adapterPosition));
                        }
                        i2++;
                    }
                    return;
                }
            }
            if (!(((RecyclerView) this.LLILLL.mView).getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.LLILLL.mView).getLayoutManager();
            int iLJ = gridLayoutManager.LLIZ.LJ(adapterPosition, gridLayoutManager.LLILLJJLI);
            if (LLLILZLLLI(adapterPosition)) {
                while (i2 < this.LLJL.size()) {
                    ((HashMap) ListProtector.get(this.LLJL, i2)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                    i2++;
                }
            } else {
                while (i2 < this.LLJL.size()) {
                    if (iLJ == i2) {
                        ((HashMap) ListProtector.get(this.LLJL, i2)).put(Integer.valueOf(adapterPosition), Integer.valueOf(height));
                    } else {
                        ((HashMap) ListProtector.get(this.LLJL, i2)).remove(Integer.valueOf(adapterPosition));
                    }
                    i2++;
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        boolean zContains;
        C1318570kPv c1318570kPv = (C1318570kPv) viewHolder;
        this.LLJJIJIIJIL.LIZ(c1318570kPv);
        if (this.LLILZ) {
            UIComponent uIComponent = c1318570kPv.LL.LLILLJJLI;
            if (uIComponent != null && this.LLJJJJ) {
                JavaOnlyArray javaOnlyArray = this.LLJJIJIL;
                if (javaOnlyArray == null) {
                    zContains = false;
                } else {
                    zContains = javaOnlyArray.contains(uIComponent.LLILLJJLI);
                }
                UIComponent uIComponent2 = c1318570kPv.LL.LLILLJJLI;
                uIComponent2.onListCellDisAppear(uIComponent2.LLILLJJLI, this.LLILLL, zContains);
            }
            if (!this.LLIZ) {
                LLLJL(c1318570kPv);
            }
        }
    }

    public C1319030kQf(UIList uIList, C1319150kQr c1319150kQr) {
        this.LLILLL = uIList;
        this.LLJJIJIIJIL = c1319150kQr;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLFZ(X.C1318570kPv r10, int r11) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1319030kQf.LLLFZ(X.0kPv, int):void");
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C1318570kPv c1318570kPv, int i) {
        int i2;
        int iLIZIZ;
        C1318540kPs c1318540kPs;
        if (c1318570kPv != null && (c1318540kPs = c1318570kPv.LL) != null && c1318540kPs.getMeasureListener() == null) {
            c1318570kPv.LL.setMeasureListener(new C1318550kPt(this));
        }
        int i3 = UIList.LLLL;
        if (this.LLILZ) {
            LLLFZ(c1318570kPv, i);
            return;
        }
        long jLLLI = LLLI();
        this.LLILLJJLI.put(Long.valueOf(jLLLI), c1318570kPv);
        C1318540kPs c1318540kPs2 = c1318570kPv.LL;
        UIComponent uIComponent = c1318540kPs2.LLILLJJLI;
        if (uIComponent == null) {
            UIList uIList = this.LLILLL;
            InterfaceC1311870kF7 interfaceC1311870kF7 = uIList.LL;
            int sign = uIList.getSign();
            LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
            if (lynxTemplateRender != null) {
                lynxTemplateRender.LJJLI(sign, i, jLLLI);
            }
            LynxUI lynxUI = (LynxUI) uIList.LLILLJJLI;
            uIList.LLILLJJLI = null;
            UIComponent uIComponent2 = (UIComponent) lynxUI;
            if (uIComponent2 != null) {
                c1318570kPv.L5(uIComponent2);
                this.LLJJIJIIJIL.LIZLLL(c1318570kPv);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Adapter onBindViewHolder ");
                sbLIZ.append(i);
                sbLIZ.append("child null");
                LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c1318540kPs2.LL = 1;
            this.LLILLL.LJJIJIL(uIComponent, i, jLLLI);
        }
        JavaOnlyArray javaOnlyArray = this.LLJILJILJ;
        if (javaOnlyArray != null && javaOnlyArray.size() > i && (iLIZIZ = (int) C1311130kDv.LIZIZ(this.LLJILJILJ.getInt(i), 0.0f)) > 0) {
            c1318570kPv.LL.LLILZ = iLIZIZ;
        }
        JavaOnlyArray javaOnlyArray2 = this.LLJILJIL;
        if (javaOnlyArray2 != null && javaOnlyArray2.size() > i && (i2 = this.LLJILJIL.getInt(i)) > 0) {
            c1318570kPv.LL.LLILZ = i2;
        }
    }

    public C1318570kPv LLLJIL(int i, ViewGroup viewGroup) {
        int i2 = UIList.LLLL;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        C1318540kPs c1318540kPs = new C1318540kPs(viewGroup.getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1318540kPs);
        c1318540kPs.setLayoutParams(layoutParams);
        c1318540kPs.setComponentInitMeasure(this.LLILZLL);
        c1318540kPs.setLayoutDirection(this.LLILLL.mView.getLayoutDirection());
        return new C1318570kPv(c1318540kPs);
    }

    public final void LLLLII(C1318570kPv c1318570kPv, int i) {
        JavaOnlyArray javaOnlyArray = this.LLJILJILJ;
        if (javaOnlyArray != null && javaOnlyArray.size() > i) {
            LLLLIIIILLL(c1318570kPv, (int) C1311130kDv.LIZIZ(this.LLJILJILJ.getInt(i), 0.0f));
        }
        JavaOnlyArray javaOnlyArray2 = this.LLJILJIL;
        if (javaOnlyArray2 != null && javaOnlyArray2.size() > i) {
            LLLLIIIILLL(c1318570kPv, this.LLJILJIL.getInt(i));
        }
    }

    public final void LLLLIIIILLL(C1318570kPv c1318570kPv, int i) {
        if (c1318570kPv == null) {
            return;
        }
        if (this.LLILLL.LLJJJJJIL) {
            if (i > 0) {
                c1318570kPv.LL.LLILZ = i;
            }
        } else {
            if (i <= 0) {
                return;
            }
            c1318570kPv.LL.LLILZIL = i;
        }
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1318570kPv c1318570kPvLLLJIL = LLLJIL(i, viewGroup);
        if (c1318570kPvLLLJIL != null) {
            try {
                View view = c1318570kPvLLLJIL.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c1318570kPvLLLJIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1318570kPvLLLJIL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1318570kPv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1318570kPvLLLJIL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1318570kPvLLLJIL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1318570kPv.class.getName();
        return c1318570kPvLLLJIL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1318540kPs c1318540kPs;
        C1318570kPv c1318570kPv = (C1318570kPv) viewHolder;
        if (c1318570kPv != null && (c1318540kPs = c1318570kPv.LL) != null && c1318540kPs.getMeasureListener() == null) {
            c1318570kPv.LL.setMeasureListener(new C1318550kPt(this));
        }
        if (this.LLILZ) {
            if (!list.isEmpty()) {
                i = ((Integer) ListProtector.get(list, list.size() - 1)).intValue();
            }
            LLLFZ(c1318570kPv, Integer.valueOf(i).intValue());
        } else {
            if (list.isEmpty()) {
                onBindViewHolder(c1318570kPv, i);
                return;
            }
            if (c1318570kPv.LL.LLILLJJLI == null) {
                return;
            }
            long jLLLI = LLLI();
            Integer num = (Integer) ListProtector.get(list, list.size() - 1);
            this.LLILLJJLI.put(Long.valueOf(jLLLI), c1318570kPv);
            this.LLJJIJIIJIL.LIZ(c1318570kPv);
            C1318540kPs c1318540kPs2 = c1318570kPv.LL;
            c1318540kPs2.LL = 1;
            this.LLILLL.LJJIJIL(c1318540kPs2.LLILLJJLI, num.intValue(), jLLLI);
            this.LLJJIJIIJIL.LIZJ(c1318570kPv);
            LLLLII(c1318570kPv, i);
        }
    }
}
