package X;

import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313320kHS {
    public WeakReference<LynxUI> LIZ;
    public C1313370kHX[] LIZIZ;
    public HashMap<String, C1313330kHT> LIZJ = new HashMap<>();

    public final void LIZ() {
        this.LIZ = null;
        HashMap<String, C1313330kHT> map = this.LIZJ;
        if (map == null) {
            return;
        }
        for (C1313330kHT c1313330kHT : map.values()) {
            c1313330kHT.LJ();
            c1313330kHT.LJIIJ();
            c1313330kHT.LIZIZ = null;
            c1313330kHT.LIZJ = null;
        }
    }

    public final void LIZIZ() {
        HashMap<String, C1313330kHT> map = this.LIZJ;
        if (map == null) {
            return;
        }
        Iterator<C1313330kHT> it2 = map.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJFF();
        }
        this.LIZJ = null;
        this.LIZIZ = null;
    }

    public final void LIZJ() {
        C1313330kHT c1313330kHT;
        if (this.LIZIZ != null) {
            if (this.LIZ.get().getHeight() == 0 && this.LIZ.get().getWidth() == 0) {
                return;
            }
            HashMap<String, C1313330kHT> map = new HashMap<>();
            for (C1313370kHX c1313370kHX : this.LIZIZ) {
                if (c1313370kHX != null && !TextUtils.isEmpty(c1313370kHX.LL)) {
                    HashMap<String, C1313330kHT> map2 = this.LIZJ;
                    if (map2 == null || (c1313330kHT = map2.get(c1313370kHX.LL)) == null) {
                        c1313330kHT = new C1313330kHT(this.LIZ.get().mView, this.LIZ.get());
                    } else {
                        this.LIZJ.remove(c1313370kHX.LL);
                    }
                    map.put(c1313370kHX.LL, c1313330kHT);
                }
            }
            HashMap<String, C1313330kHT> map3 = this.LIZJ;
            if (map3 != null) {
                Iterator<C1313330kHT> it2 = map3.values().iterator();
                while (it2.hasNext()) {
                    it2.next().LJFF();
                }
            }
            for (C1313370kHX c1313370kHX2 : this.LIZIZ) {
                if (c1313370kHX2 != null && !TextUtils.isEmpty(c1313370kHX2.LL)) {
                    map.get(c1313370kHX2.LL).LIZ(c1313370kHX2);
                }
            }
            this.LIZJ = map;
        }
    }

    public C1313320kHS(LynxUI lynxUI) {
        this.LIZ = new WeakReference<>(lynxUI);
    }

    public final void LIZLLL(Object obj, String str) {
        HashMap<String, C1313330kHT> map = this.LIZJ;
        if (map == null) {
            return;
        }
        for (C1313330kHT c1313330kHT : map.values()) {
            if (c1313330kHT.LIZLLL.containsKey(str)) {
                c1313330kHT.LIZLLL.put(str, obj);
            }
            if (str.equals("BackgroundColor") && c1313330kHT.LIZLLL.containsKey("Color")) {
                c1313330kHT.LIZLLL.put("Color", obj);
            }
        }
    }
}
