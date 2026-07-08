package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC844610XBj implements Cloneable {
    public final boolean LL;
    public final C844660XBo LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C844570XBf LLILZIL = new AbstractC824140WUq<SharedPreferences>() { // from class: X.0XBf
        @Override // X.AbstractC824140WUq
        public final SharedPreferences LIZ(Object[] objArr) {
            String strLIZJ = C844580XBg.LIZJ(this.LIZJ, "ug_install_settings_pref");
            if (TextUtils.equals(strLIZJ, "ug_install_settings_pref")) {
                return C844580XBg.LIZIZ((Context) objArr[0]);
            }
            return C810670Vr7.LIZJ((Context) objArr[0], 0, strLIZJ);
        }
    };
    public final C844600XBi LLILZLL = new C844600XBi(this);

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsEnv{isChildMode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isI18n=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isBoe=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final SharedPreferences LIZ(C844770XBz c844770XBz) {
        Object objLIZ;
        if (c844770XBz.LJJIIZ) {
            return LIZIZ(c844770XBz.LIZJ);
        }
        Context context = c844770XBz.LIZJ;
        String strValueOf = String.valueOf(c844770XBz.LIZ);
        C844600XBi c844600XBi = this.LLILZLL;
        Object[] objArr = {context};
        Object obj = null;
        if (c844600XBi.LIZ == 0) {
            objLIZ = null;
        } else {
            objLIZ = c844600XBi.LIZ.get(strValueOf);
        }
        if (objLIZ == null) {
            synchronized (c844600XBi) {
                try {
                    if (c844600XBi.LIZ != 0) {
                        obj = c844600XBi.LIZ.get(strValueOf);
                    }
                    if (obj != null) {
                        objLIZ = obj;
                    } else {
                        objLIZ = c844600XBi.LIZ(strValueOf, objArr);
                        if (objLIZ != null) {
                            if (c844600XBi.LIZ == 0) {
                                c844600XBi.LIZ = new ConcurrentHashMap<>(4);
                            }
                            c844600XBi.LIZ.put(strValueOf, (T) objLIZ);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (SharedPreferences) objLIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC844610XBj)) {
            return false;
        }
        AbstractC844610XBj abstractC844610XBj = (AbstractC844610XBj) obj;
        if (this.LLILLJJLI.equals(abstractC844610XBj.LLILLJJLI) && this.LLILZ == abstractC844610XBj.LLILZ && this.LLILLL == abstractC844610XBj.LLILLL && this.LL == abstractC844610XBj.LL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XBf] */
    public AbstractC844610XBj(C844660XBo c844660XBo, boolean z, boolean z2, boolean z3) {
        this.LLILLJJLI = c844660XBo;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LL = z3;
    }
}
