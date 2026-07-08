package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.150b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractRunnableC204495150b implements Runnable {
    public final EnumC1153730g83 LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public final List<Class<? extends AbstractRunnableC204495150b>> LLILZLL;
    public volatile EnumC1782320wTu LLIZ;
    public final Set<AbstractC204498150e> LLIZLLLIL;
    public int LLJ;

    public abstract void LIZIZ(AwS397S0200000_31 awS397S0200000_31);

    public final boolean LIZJ() {
        AbstractRunnableC204495150b next;
        List<Class<? extends AbstractRunnableC204495150b>> list = this.LLILZLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Class<? extends AbstractRunnableC204495150b> cls : list) {
                Iterator<AbstractRunnableC204495150b> it2 = C204496150c.LIZIZ.LIZJ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getClass(), cls)) {
                        break;
                    }
                }
                AbstractRunnableC204495150b abstractRunnableC204495150b = next;
                if ((abstractRunnableC204495150b != null ? abstractRunnableC204495150b.LLIZ : null) != EnumC1782320wTu.SUCCESS) {
                    return false;
                }
            }
        }
        return this.LLIZ == EnumC1782320wTu.UNSCHEDULED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ECPageTask@63c1.run");
        try {
            if (LIZJ()) {
                LIZ(EnumC1782320wTu.RUNNING);
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1372);
                AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(this, 1371);
                try {
                    LIZIZ(new AwS397S0200000_31(awS575S0100000_31, awS575S0100000_312, 90));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    awS575S0100000_312.invoke();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECPageTask@63c1.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(": taskGroup-");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priority-");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onMainThread-");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", delayTime-");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", status-");
        sbLIZ.append(this.LLIZ.name());
        sbLIZ.append(", dependencies-");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(EnumC1782320wTu enumC1782320wTu) {
        if (this.LLIZ != enumC1782320wTu) {
            this.LLIZ = enumC1782320wTu;
            int i = C1782330wTv.LIZ[enumC1782320wTu.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Iterator<AbstractC204498150e> it2 = this.LLIZLLLIL.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZIZ();
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        Iterator<AbstractC204498150e> it3 = this.LLIZLLLIL.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZJ();
                        }
                    }
                } else {
                    Iterator<AbstractC204498150e> it4 = this.LLIZLLLIL.iterator();
                    while (it4.hasNext()) {
                        it4.next().getClass();
                    }
                }
            } else {
                Iterator<AbstractC204498150e> it5 = this.LLIZLLLIL.iterator();
                while (it5.hasNext()) {
                    it5.next().LIZ();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("task_name", getClass().getSimpleName());
            jSONObject.put("task_group", this.LL.name());
            jSONObject.put("on_main_thread", this.LLILLL);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, enumC1782320wTu.name());
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("ec_page_task_execute_result", jSONObject);
        }
    }

    public /* synthetic */ AbstractRunnableC204495150b(EnumC1153730g83 enumC1153730g83, boolean z) {
        this(enumC1153730g83, 1, z, 0L, false, new ArrayList());
    }

    public AbstractRunnableC204495150b(EnumC1153730g83 enumC1153730g83, int i, boolean z, long j, boolean z2, List<Class<? extends AbstractRunnableC204495150b>> list) {
        this.LL = enumC1153730g83;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = z2;
        this.LLILZLL = list;
        this.LLIZ = EnumC1782320wTu.UNSCHEDULED;
        this.LLIZLLLIL = new LinkedHashSet();
        this.LLJ = 3;
    }
}
