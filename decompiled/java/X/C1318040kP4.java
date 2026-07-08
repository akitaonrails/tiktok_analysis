package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kP4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318040kP4 extends AbstractC1585810rMx {
    public final AbstractC1298750jtx LL;
    public final RecyclerView LLILLJJLI;
    public int LLILLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public final UIList LLJI;
    public int LLJILJIL;
    public boolean LLJILLL;
    public int LLILZ = 200;
    public int LLILZIL = 50;
    public int LLILZLL = 50;
    public boolean LLJIJIL = true;
    public int LLJILJILJ = 1;

    public final JavaOnlyArray LJJIZ() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        ArrayList arrayList = new ArrayList();
        RecyclerView.LayoutManager layoutManager = this.LLILLJJLI.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = r1.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                arrayList.add(Integer.valueOf(iFindFirstVisibleItemPosition));
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArrLJIJ = staggeredGridLayoutManager.LJIJ(null);
            int[] iArrLJIJJ = staggeredGridLayoutManager.LJIJJ(null);
            int iMax = Integer.MIN_VALUE;
            for (int i : iArrLJIJ) {
                arrayList.add(Integer.valueOf(i));
                iMax = Math.max(iMax, i);
            }
            int iMin = Integer.MAX_VALUE;
            for (int i2 : iArrLJIJJ) {
                arrayList.add(Integer.valueOf(i2));
                iMin = Math.min(iMin, i2);
            }
            while (true) {
                iMax++;
                if (iMax >= iMin) {
                    break;
                }
                arrayList.add(Integer.valueOf(iMax));
            }
            Collections.sort(arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            C1318570kPv c1318570kPv = (C1318570kPv) this.LLILLJJLI.findViewHolderForLayoutPosition(iIntValue);
            if (c1318570kPv != null && c1318570kPv.LL.LLILLJJLI != null) {
                View view = c1318570kPv.itemView;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put(FollowStatusChangeMethod.PARAM_UID, c1318570kPv.LL.LLILLJJLI.getIdSelector());
                javaOnlyMap.put("position", Integer.valueOf(iIntValue));
                javaOnlyMap.put("index", Integer.valueOf(iIntValue));
                javaOnlyMap.put("itemKey", c1318570kPv.LL.LLILLJJLI.LLILLJJLI);
                javaOnlyMap.put("top", Float.valueOf(C1311130kDv.LIZJ(view.getTop())));
                javaOnlyMap.put("bottom", Float.valueOf(C1311130kDv.LIZJ(view.getBottom())));
                javaOnlyMap.put("left", Float.valueOf(C1311130kDv.LIZJ(view.getLeft())));
                javaOnlyMap.put("right", Float.valueOf(C1311130kDv.LIZJ(view.getRight())));
                javaOnlyArray.add(javaOnlyMap);
            }
        }
        return javaOnlyArray;
    }

    public final void LJJJJJ(int i) {
        JavaOnlyArray javaOnlyArrayLJJIZ;
        if ((this.LLILLL & 8) == 0) {
            return;
        }
        C1298110jsv c1298110jsv = new C1298110jsv(this.LLJI.getSign(), "scrollstatechange");
        if (this.LLJILLL) {
            javaOnlyArrayLJJIZ = LJJIZ();
        } else {
            javaOnlyArrayLJJIZ = null;
        }
        c1298110jsv.LIZIZ(Integer.valueOf(i), "state");
        if (javaOnlyArrayLJJIZ != null) {
            c1298110jsv.LJ(javaOnlyArrayLJJIZ);
        }
        this.LL.LIZIZ(c1298110jsv);
    }

    public static boolean LJJIJIIJIL(InterfaceC1298070jsr interfaceC1298070jsr, boolean z) {
        if (interfaceC1298070jsr == null) {
            return z;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.String) {
            return Boolean.parseBoolean(interfaceC1298070jsr.asString());
        }
        if (type != ReadableType.Int && type != ReadableType.Number && type != ReadableType.Long) {
            if (type != ReadableType.Boolean) {
                return z;
            }
            return interfaceC1298070jsr.asBoolean();
        }
        if (interfaceC1298070jsr.asInt() != 0) {
            return true;
        }
        return false;
    }

    public static int LJJIL(InterfaceC1298070jsr interfaceC1298070jsr, int i) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.String) {
            try {
                i = CastIntegerProtector.parseInt(interfaceC1298070jsr.asString());
                return i;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return i;
            }
        }
        if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
            return interfaceC1298070jsr.asInt();
        }
        return i;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        this.LLJI.recognizeGesturere();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJJJJJ(3);
                    UIList uIList = this.LLJI;
                    if (uIList.mEnableScrollMonitor) {
                        uIList.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(recyclerView, uIList.getTagName(), this.LLJI.mScrollMonitorTag));
                    }
                    this.LLJI.notifyScrollStateChanged(2);
                    return;
                }
                return;
            }
            this.LLJI.mContext.LJIIIZ().LIZIZ(this.LLJI.getSign(), this.LLJI.mScrollMonitorTag);
            this.LLJIJIL = false;
            LJJJJJ(2);
            UIList uIList2 = this.LLJI;
            if (uIList2.mEnableScrollMonitor) {
                uIList2.mContext.LLJJIJI.LJJII(new C1318050kP5(recyclerView, uIList2.getTagName(), this.LLJI.mScrollMonitorTag));
            }
            this.LLJI.notifyScrollStateChanged(1);
            return;
        }
        this.LLJI.mContext.LJIIIZ().LIZJ(this.LLJI.getSign());
        LJJJJJ(1);
        UIList uIList3 = this.LLJI;
        if (uIList3.mEnableScrollMonitor) {
            uIList3.mContext.LLJJIJI.LJJIII(new C1318050kP5(recyclerView, uIList3.getTagName(), this.LLJI.mScrollMonitorTag));
        }
        if (this.LLJI.LLLIIIIL) {
            recyclerView.invalidateItemDecorations();
        }
        this.LLJI.notifyScrollStateChanged(0);
    }

    public final void LJJJ(int i, int i2) {
        if (!this.LLJIJIL && i2 == 0) {
            if (i > 0) {
                if (this.LLJI.LLJLLIL && (this.LLIZLLLIL != 0 || this.LLILZLL != 0)) {
                    return;
                }
                int i3 = this.LLJILJIL;
                LJJJJ(4, i3, i3, 0, 0, "scrolltolower");
                this.LLJIJIL = true;
                return;
            }
            if (i < 0) {
                this.LLJILJIL = 0;
                if (this.LLJI.LLJLLIL && (this.LLIZ != 0 || this.LLILZIL != 0)) {
                    return;
                }
                LJJJJ(2, 0, 0, 0, 0, "scrolltoupper");
                this.LLJIJIL = true;
            }
        }
    }

    public C1318040kP4(AbstractC1298750jtx abstractC1298750jtx, RecyclerView recyclerView, UIList uIList) {
        this.LL = abstractC1298750jtx;
        this.LLILLJJLI = recyclerView;
        recyclerView.addOnScrollListener(this);
        this.LLJI = uIList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b  */
    @Override // X.AbstractC1585810rMx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318040kP4.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void LJJJJ(int i, int i2, int i3, int i4, int i5, String str) {
        JavaOnlyArray javaOnlyArrayLJJIZ;
        if ((i & this.LLILLL) != 0) {
            C1298110jsv c1298110jsv = new C1298110jsv(this.LLJI.getSign(), str);
            if (this.LLJILLL) {
                javaOnlyArrayLJJIZ = LJJIZ();
            } else {
                javaOnlyArrayLJJIZ = null;
            }
            c1298110jsv.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i2)), "scrollLeft");
            c1298110jsv.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i3)), "scrollTop");
            c1298110jsv.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i4)), "deltaX");
            c1298110jsv.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i5)), "deltaY");
            c1298110jsv.LJ(javaOnlyArrayLJJIZ);
            this.LL.LIZIZ(c1298110jsv);
        }
    }
}
