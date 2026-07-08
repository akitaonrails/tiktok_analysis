package X;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0og5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482350og5 {
    public final int LIZ;
    public final C603840NmI<String, JSONObject> LIZIZ = new C603840NmI<>(20);
    public final C603840NmI<String, JSONObject> LIZJ = new C603840NmI<>(20);
    public final CopyOnWriteArraySet<String> LIZLLL = new CopyOnWriteArraySet<>();
    public final LinkedList<String> LJ = new LinkedList<>();
    public final ConcurrentLinkedQueue<String> LJFF = new ConcurrentLinkedQueue<>();
    public final LinkedList<InterfaceC1481930ofP> LJI = new LinkedList<>();
    public final C603840NmI<String, Integer> LJII = new C603840NmI<>(20);

    public final void LJFF() {
        int size = this.LIZLLL.size() - this.LIZ;
        if (size > 0) {
            for (String str : this.LIZLLL) {
                if (!this.LJFF.contains(str)) {
                    if (str != null) {
                        this.LJFF.offer(str);
                    }
                    this.LIZLLL.remove(str);
                    size--;
                    if (size <= 0) {
                        return;
                    }
                }
            }
        }
    }

    public C1482350og5() {
        this.LIZ = 6;
        int iLLIFFJFJJ = C1474810oTv.LLIFFJFJJ();
        if (iLLIFFJFJJ > 0) {
            this.LIZ = iLLIFFJFJJ;
        }
    }

    public final JSONObject LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZLLL.remove(str);
        return this.LIZJ.remove(str);
    }

    public final JSONObject LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZLLL.remove(str);
        return this.LIZIZ.remove(str);
    }

    public final InterfaceC1481930ofP LIZJ(String str) {
        Integer num;
        int iIntValue;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || !this.LJII.containsKey(str) || (num = this.LJII.get(str)) == null || (iIntValue = num.intValue()) < 0 || iIntValue >= this.LJI.size()) {
            return null;
        }
        return this.LJI.get(iIntValue);
    }

    public final void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && this.LJFF.contains(str)) {
            this.LJFF.remove(str);
            InterfaceC1481930ofP interfaceC1481930ofPLIZJ = LIZJ(str);
            if (interfaceC1481930ofPLIZJ != null) {
                interfaceC1481930ofPLIZJ.LIZ();
            }
        }
    }

    public final void LJ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject.length() != 0) {
            this.LIZIZ.put(str, jSONObject);
            this.LIZLLL.add(str);
            LJFF();
        }
    }

    public final void LJI(EnumC1482380og8 enumC1482380og8, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!this.LJFF.contains(str)) {
                this.LJFF.offer(str);
            }
            InterfaceC1481930ofP interfaceC1481930ofPLIZJ = LIZJ(str);
            if (interfaceC1481930ofPLIZJ == null) {
                for (int i = 0; i < this.LJI.size(); i++) {
                    InterfaceC1481930ofP interfaceC1481930ofP = this.LJI.get(i);
                    if (interfaceC1481930ofP != null && interfaceC1481930ofP.LIZJ(C0VT3.VALID_STATUS) && !interfaceC1481930ofP.LIZJ(C0VT3.USING_STATUS)) {
                        if (i >= 0 && i < this.LJI.size() && (interfaceC1481930ofPLIZJ = this.LJI.get(i)) != null) {
                            if (!TextUtils.isEmpty(str) && i >= 0) {
                                this.LJII.put(str, Integer.valueOf(i));
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            interfaceC1481930ofPLIZJ.LIZIZ(str, enumC1482380og8.name(), str2);
        }
    }
}
