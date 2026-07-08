package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1BVM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BVM implements InterfaceC1548170qOF, Cloneable {
    public static final AtomicInteger LLILZLL = new AtomicInteger(0);
    public static final List<C1BVM>[] LLIZ = new List[10];
    public static final WeakHashMap<Object, Map<Integer, WeakReference<C1BVM>>> LLIZLLLIL = new WeakHashMap<>();
    public final int LL;
    public int LLILLJJLI;
    public String LLILLL;
    public Object LLILZ;
    public WebView LLILZIL;

    public C1BVM() {
        this.LLILLJJLI = LLILZLL.getAndIncrement();
        this.LL = -1;
    }

    @Override // X.InterfaceC1548170qOF
    public String LIZ() {
        return getClass().getName();
    }

    public final boolean LIZJ() {
        C1BVM c1bvmLJII = LJII(this);
        return c1bvmLJII != null ? c1bvmLJII.LIZJ() : ((Boolean) C1BVO.CAN_GO_BACK.LJFF(this.LLILZ, new Object[0])).booleanValue();
    }

    public final boolean LIZLLL() {
        C1BVM c1bvmLJII = LJII(this);
        return c1bvmLJII != null ? c1bvmLJII.LIZLLL() : ((Boolean) C1BVO.CAN_GO_FORWARD.LJFF(this.LLILZ, new Object[0])).booleanValue();
    }

    public void LJ() {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJ();
        } else {
            C1BVO.DESTROY.LJFF(this.LLILZ, new Object[0]);
        }
    }

    public final void LJIIIIZZ() {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIIIIZZ();
        } else {
            C1BVO.GO_BACK.LJFF(this.LLILZ, new Object[0]);
        }
    }

    public final void LJIIIZ() {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIIIZ();
        } else {
            C1BVO.GO_FORWARD.LJFF(this.LLILZ, new Object[0]);
        }
    }

    public void LJIILIIL() {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIILIIL();
        } else {
            C1BVO.RELOAD.LJFF(this.LLILZ, new Object[0]);
        }
    }

    public void LJIILJJIL() {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIILJJIL();
        } else {
            C1BVO.STOP_LOADING.LJFF(this.LLILZ, new Object[0]);
        }
    }

    public final Object clone() {
        try {
            C1BVM c1bvm = (C1BVM) super.clone();
            c1bvm.LLILLJJLI = this.LLILLJJLI;
            return c1bvm;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("WebViewClientExt clone error");
        }
    }

    public C1BVM(int i) {
        this.LLILLJJLI = LLILZLL.getAndIncrement();
        this.LL = i;
        if (i > 2 && i <= 9) {
        } else {
            throw new RuntimeException("WebViewClientExt priorityRegion out of bounds!");
        }
    }

    public static C1BVM LJII(C1BVM c1bvm) {
        boolean z;
        int i = c1bvm.LL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C1BVM>[] listArr = LLIZ;
            if (i < listArr.length) {
                List<C1BVM> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C1BVM c1bvm2 = (C1BVM) ListProtector.get(list, i2);
                        if (c1bvm2 != null) {
                            if (z) {
                                C1BVM c1bvmLJI = LJI(c1bvm2, c1bvm);
                                if (!C1548160qOE.LIZ(c1bvmLJI.LLILLL, c1bvmLJI)) {
                                    return c1bvmLJI;
                                }
                            } else if (c1bvm2.LLILLJJLI != c1bvm.LLILLJJLI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C1BVM c1bvm3 = (C1BVM) ListProtector.get(list, i3);
                                    if (c1bvm3 != null) {
                                        C1BVM c1bvmLJI2 = LJI(c1bvm3, c1bvm);
                                        if (!C1548160qOE.LIZ(c1bvmLJI2.LLILLL, c1bvmLJI2)) {
                                            return c1bvmLJI2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public void LJIIJJI(String str) {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIIJJI(str);
        } else {
            C1BVO.LOAD_URL_1.LJFF(this.LLILZ, str);
        }
    }

    public static C1BVM LJI(C1BVM c1bvm, C1BVM c1bvm2) {
        C1BVM c1bvm3;
        Map<Integer, WeakReference<C1BVM>> map = LLIZLLLIL.get(c1bvm2.LLILZ);
        if (map == null) {
            map = new HashMap<>();
            LLIZLLLIL.put(c1bvm2.LLILZ, map);
        }
        WeakReference<C1BVM> weakReference = map.get(Integer.valueOf(c1bvm.LLILLJJLI));
        if (weakReference == null || (c1bvm3 = weakReference.get()) == null) {
            try {
                c1bvm3 = (C1BVM) super.clone();
                c1bvm3.LLILLJJLI = c1bvm.LLILLJJLI;
                c1bvm3.LLILZ = c1bvm2.LLILZ;
                c1bvm3.LLILZIL = c1bvm2.LLILZIL;
                map.put(Integer.valueOf(c1bvm.LLILLJJLI), new WeakReference<>(c1bvm3));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("WebViewClientExt clone error");
            }
        }
        c1bvm3.LLILLL = c1bvm2.LLILLL;
        return c1bvm3;
    }

    public void LIZIZ(Object obj, String str) {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LIZIZ(obj, str);
        } else {
            C1BVO.ADD_JAVASCRIPT_INTERFACE.LJFF(this.LLILZ, obj, str);
        }
    }

    public void LJFF(String str, ValueCallback<String> valueCallback) {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJFF(str, valueCallback);
        } else {
            C1BVO.EVALUATE_JAVASCRIPT.LJFF(this.LLILZ, str, valueCallback);
        }
    }

    public void LJIIJ(Map<String, Object> map, boolean z) {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIIJ(map, z);
        } else {
            C1BVO.INIT.LJFF(this.LLILZ, map, Boolean.valueOf(z));
        }
    }

    public void LJIIL(String str, Map<String, String> map) {
        C1BVM c1bvmLJII = LJII(this);
        if (c1bvmLJII != null) {
            c1bvmLJII.LJIIL(str, map);
        } else {
            C1BVO.LOAD_URL_2.LJFF(this.LLILZ, str, map);
        }
    }
}
