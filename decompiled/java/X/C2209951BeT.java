package X;

import Y.ARunnableS134S0100000_34;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.applog.priority.PriorityWrapper;
import com.bytedance.applog.store.DbStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209951BeT {
    public static final List<String> LJ = Collections.singletonList("BgSessionTaskModel");
    public final Context LIZ;
    public final DbStore LIZIZ;
    public final C2209771BeB LIZJ;
    public final C2209901BeO LIZLLL;

    public final void LIZ() {
        this.LIZLLL.LJJZZI.LJIIIZ(0, LJ, "[Task] clear task session sp", new Object[0]);
        LJ("");
    }

    public final String LIZIZ() {
        if (this.LIZLLL.LJ() != null) {
            return this.LIZLLL.LJ().LJJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applog_task@");
        sbLIZ.append(this.LIZLLL.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZJ(C2210121Bek c2210121Bek) {
        int i;
        if (c2210121Bek == null) {
            return false;
        }
        try {
            final C2210011BeZ c2210011BeZ = new C2210011BeZ();
            C2209901BeO c2209901BeO = this.LIZLLL;
            if (c2209901BeO.LJIILIIL != null) {
                c2209901BeO.LJIILIIL.LLJIJIL.LIZ(c2210011BeZ);
            }
            c2210011BeZ.LLILLJJLI = c2210121Bek.LIZ;
            c2210011BeZ.LLILZ = c2210121Bek.LIZIZ;
            c2210011BeZ.LLJLL = 1;
            if (!TextUtils.isEmpty(c2210121Bek.LIZLLL)) {
                c2210011BeZ.LLJLILLLLZIIL = c2210121Bek.LIZLLL;
            }
            if (!TextUtils.isEmpty(c2210121Bek.LJFF)) {
                c2210011BeZ.LLJLIL = c2210121Bek.LJFF;
            }
            c2210011BeZ.LLJJJJLIIL = Math.max(0L, (c2210121Bek.LJII - c2210121Bek.LIZ) - c2210121Bek.LJIIIIZZ);
            c2210011BeZ.LLJJL = c2210121Bek.LJII;
            boolean z = c2210121Bek.LIZJ;
            boolean z2 = c2210121Bek.LJ;
            if (!z) {
                if (!z2) {
                    i = 1;
                } else {
                    i = 3;
                }
            } else if (!z2) {
                i = 2;
            } else {
                i = 4;
            }
            c2210011BeZ.LLJL = Integer.valueOf(i);
            JSONObject jSONObject = c2210121Bek.LJI;
            if (jSONObject != null) {
                c2210011BeZ.LLJLLIL = C786410Ut5.J3(jSONObject);
            }
            if (this.LIZLLL.LJJIIZ && this.LIZLLL.LLLI() != null) {
                PriorityWrapper priorityWrapperLLLI = this.LIZLLL.LLLI();
                EnumC2192521ArS enumC2192521ArS = EnumC2192521ArS.Terminate;
                if (priorityWrapperLLLI.LJFF(enumC2192521ArS.value()) && this.LIZLLL.LLLI().LJII(enumC2192521ArS.value(), "terminate", new InterfaceC2190741Aoa() { // from class: X.1BfW
                    @Override // X.InterfaceC2190741Aoa
                    public final Object load() {
                        JSONObject jSONObject2;
                        C2210011BeZ c2210011BeZ2 = c2210011BeZ;
                        synchronized (c2210011BeZ2) {
                            try {
                                if (c2210011BeZ2.LLJJJIL == null) {
                                    c2210011BeZ2.LLJJJIL = c2210011BeZ2.LJIILJJIL();
                                }
                                jSONObject2 = c2210011BeZ2.LLJJJIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return jSONObject2;
                    }
                })) {
                    this.LIZLLL.LJJZZI.LJFF(0, LJ, "[Task] save session terminate to priority success", new Object[0]);
                    return true;
                }
            }
            if (this.LIZJ.LIZJ) {
                JSONObject jSONObjectLIZ = this.LIZJ.LIZ();
                InterfaceC2209861BeK interfaceC2209861BeK = this.LIZLLL.LJIILLIIL;
                if (interfaceC2209861BeK != null) {
                    try {
                        C2210791Bfp.LIZ(jSONObjectLIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZLLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PACK_ERROR_COUNT, 1);
                        this.LIZLLL.LJJZZI.LJIIZILJ(LJ, "header custom callback updateHeader error", th, new Object[0]);
                    }
                }
                this.LIZLLL.LJJZZI.LJIIIZ(0, LJ, "[Task] save task session to db : {}", c2210121Bek);
                C2209881BeM c2209881BeM = new C2209881BeM();
                c2209881BeM.LJJIFFI(this.LIZLLL.LJIIIZ, jSONObjectLIZ, null, c2210011BeZ, null, new JSONArray[]{null, null, null}, new long[]{-1, -1, -1}, null, null, 9);
                this.LIZIZ.LJJIIJ(c2209881BeM, true, null, null);
                return true;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LIZLLL.LJJZZI.LJIIZILJ(LJ, "[Task] Save task session to pack failed", th2, new Object[0]);
        }
        return false;
    }

    public final void LIZLLL(C2210121Bek c2210121Bek) {
        if (c2210121Bek == null) {
            return;
        }
        this.LIZLLL.LJJZZI.LJIIIZ(0, LJ, "[Task] saveTaskSessionToSp : {}", c2210121Bek);
        LJ(c2210121Bek.LIZ());
    }

    public final void LJ(String str) {
        if (str == null) {
            str = "";
        }
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LIZ, 0, LIZIZ()).edit();
            editorEdit.putString("key_task_session", str);
            editorEdit.apply();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C2209951BeT(C2209901BeO c2209901BeO, DbStore dbStore, C2209771BeB c2209771BeB) {
        this.LIZIZ = dbStore;
        this.LIZJ = c2209771BeB;
        this.LIZLLL = c2209901BeO;
        this.LIZ = c2209901BeO.LJIIJ;
        C0V1A.LIZJ().LIZIZ(new ARunnableS134S0100000_34(this, 42));
    }
}
