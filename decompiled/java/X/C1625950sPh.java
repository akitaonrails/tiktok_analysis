package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0sPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625950sPh implements InterfaceC1625970sPj {
    public boolean LL = true;
    public final Map<Class<? extends InterfaceC1625960sPi>, InterfaceC1625960sPi> LLILLJJLI = new LinkedHashMap();

    public final void LIZ(InterfaceC1625960sPi interfaceC1625960sPi) {
        this.LLILLJJLI.put((Class<? extends InterfaceC1625960sPi>) interfaceC1625960sPi.getClass(), interfaceC1625960sPi);
    }

    @Override // X.InterfaceC1625960sPi
    public final boolean LLIIIL(int i, int i2, Effect effect) {
        if (this.LL && !C1624570sNT.LJJIFFI(effect) && !C1624200sMs.LJIIIIZZ(effect)) {
            C1446130njf.LIZ.getClass();
            if (TextUtils.isEmpty(C1446130njf.LJIIJ(effect, "guide_video_path"))) {
                Map<Class<? extends InterfaceC1625960sPi>, InterfaceC1625960sPi> map = this.LLILLJJLI;
                if (!map.isEmpty()) {
                    Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC1625960sPi) ((Map.Entry) it2.next()).getValue()).LLIIIL(i, i2, effect)) {
                            this.LL = false;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
