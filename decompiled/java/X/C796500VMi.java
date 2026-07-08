package X;

import X.AbstractC796540VMm;
import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C796500VMi<T extends AbstractC796540VMm> {
    public final Class<T> LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public ArrayList<C0VK6> LIZLLL;
    public Executor LJ;
    public Executor LJFF;
    public C0VKA LJI;
    public boolean LJII;
    public boolean LJIIJ;
    public Set<Integer> LJIIL;
    public EnumC611420NyW LJIIIIZZ = EnumC611420NyW.AUTOMATIC;
    public boolean LJIIIZ = true;
    public final C796530VMl LJIIJJI = new C796530VMl();

    public final void LIZJ() {
        this.LJIIIZ = false;
        this.LJIIJ = true;
    }

    public final T LIZIZ() {
        String strLIZIZ;
        Context context = this.LIZJ;
        if (context == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor = this.LJ;
        if (executor == null) {
            if (this.LJFF == null) {
                C08D8 c08d8 = C08D9.LIZLLL;
                this.LJFF = c08d8;
                this.LJ = c08d8;
            } else {
                Executor executor2 = this.LJFF;
                if (executor2 != null) {
                    this.LJ = executor2;
                }
            }
        } else if (this.LJFF == null) {
            this.LJFF = executor;
        }
        C0VKA c0vkp = this.LJI;
        if (c0vkp == null) {
            c0vkp = new C0VKP();
        }
        String str = this.LIZIZ;
        C796530VMl c796530VMl = this.LJIIJJI;
        ArrayList<C0VK6> arrayList = this.LIZLLL;
        boolean z = this.LJII;
        EnumC611420NyW enumC611420NyW = this.LJIIIIZZ;
        enumC611420NyW.getClass();
        if (enumC611420NyW == EnumC611420NyW.AUTOMATIC) {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
            enumC611420NyW = (activityManager == null || activityManager.isLowRamDevice()) ? EnumC611420NyW.TRUNCATE : EnumC611420NyW.WRITE_AHEAD_LOGGING;
        }
        C796520VMk c796520VMk = new C796520VMk(context, str, c0vkp, c796530VMl, arrayList, z, enumC611420NyW, this.LJ, this.LJFF, this.LJIIIZ, this.LJIIJ);
        Class<T> cls = this.LIZ;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(canonicalName.replace('.', '_'));
        sbLIZ.append("_Impl");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        try {
            if (name.isEmpty()) {
                strLIZIZ = strLIZIZ2;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(name);
                sbLIZ2.append(e3.d);
                sbLIZ2.append(strLIZIZ2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            T t = (T) Class.forName(strLIZIZ, true, cls.getClassLoader()).newInstance();
            t.init(c796520VMk);
            return t;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cannot find implementation for ");
            sbLIZ3.append(cls.getCanonicalName());
            sbLIZ3.append(". ");
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(" does not exist");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Cannot access the constructor");
            sbLIZ4.append(cls.getCanonicalName());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Failed to create an instance of ");
            sbLIZ5.append(cls.getCanonicalName());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public final void LIZ(AbstractC796510VMj... abstractC796510VMjArr) {
        if (this.LJIIL == null) {
            this.LJIIL = new HashSet();
        }
        for (AbstractC796510VMj abstractC796510VMj : abstractC796510VMjArr) {
            ((HashSet) this.LJIIL).add(Integer.valueOf(abstractC796510VMj.startVersion));
            ((HashSet) this.LJIIL).add(Integer.valueOf(abstractC796510VMj.endVersion));
        }
        this.LJIIJJI.LIZ(abstractC796510VMjArr);
    }

    public C796500VMi(Context context, Class<T> cls, String str) {
        this.LIZJ = context;
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
