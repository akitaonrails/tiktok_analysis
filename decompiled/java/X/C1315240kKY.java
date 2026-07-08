package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.textra.JavaFontManager;
import com.lynx.textra.TTText;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: renamed from: X.0kKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315240kKY {
    public final ArrayList<InterfaceC1315360kKk> LIZ;
    public final Map<Object, Integer> LIZIZ;
    public final JavaFontManager LIZJ;

    public C1315240kKY() {
        ArrayList<InterfaceC1315360kKk> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        arrayList.add(null);
        this.LIZIZ = new Hashtable();
        this.LIZJ = TTText.mFontManager;
    }

    public final int LIZ(C1315350kKj c1315350kKj) {
        int iIntValue;
        if (c1315350kKj == null) {
            return 0;
        }
        Integer num = (Integer) ((Hashtable) this.LIZIZ).get(c1315350kKj);
        if (num != null && (iIntValue = num.intValue()) != -1) {
            return iIntValue;
        }
        this.LIZ.add(c1315350kKj);
        int size = this.LIZ.size() - 1;
        ((Hashtable) this.LIZIZ).put(c1315350kKj, Integer.valueOf(size));
        return size;
    }

    public final InterfaceC1315360kKk LIZIZ(int i) {
        if (i >= 0 && i < this.LIZ.size()) {
            return (InterfaceC1315360kKk) ListProtector.get(this.LIZ, i);
        }
        return null;
    }
}
