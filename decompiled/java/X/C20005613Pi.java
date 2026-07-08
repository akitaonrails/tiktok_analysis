package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20005613Pi extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final C20005913Pl LIZIZ;
    public final C20008613Qm LIZJ;
    public final C20006313Pp LIZLLL;
    public final String[] LJ;
    public final int LJFF;
    public final String LJI;
    public final C13NJ LJII;
    public final C19999213Mw LJIIIIZZ;
    public final InterfaceExecutorC740550T3d LJIIIZ;
    public final Effect LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public C13N2 LJIIZILJ;
    public final C563400M7u LJIJ;
    public final C563400M7u LJIJI;
    public final CopyOnWriteArrayList<C13QB> LJIJJ;

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void cancel() {
        C13N1 c13n1;
        Effect effect = this.LJIIJ;
        boolean z = false;
        Boolean boolValueOf = null;
        if (effect != null) {
            C13NJ c13nj = this.LJII;
            if (c13nj != null) {
                if (C13LQ.LJIILLIIL(effect.getPanel(), c13nj.LIZJ) && c13nj.LIZ && c13nj.LIZLLL) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                try {
                    Iterator<C13QB> it2 = this.LJIJJ.iterator();
                    while (it2.hasNext()) {
                        C20007113Px c20007113Px = it2.next().LIZIZ;
                        C13NB c13nb = c20007113Px.LIZIZ;
                        if ((c13nb instanceof C13N1) && (c13n1 = (C13N1) c13nb) != null) {
                            c13n1.LJJIIJ(c20007113Px.LJ);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                super.cancel();
            }
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void execute() throws Exception {
        String[] strArr = this.LJ;
        C13NJ c13nj = this.LJII;
        if (c13nj == null || !c13nj.LIZIZ(this.LJIIJ)) {
            if (strArr == null) {
                return;
            }
        } else if (strArr == null) {
            C19999213Mw c19999213Mw = this.LJIIIIZZ;
            if (c19999213Mw != null) {
                c19999213Mw.LIZ(new AwS574S0100000_30(this, 449));
                return;
            }
            return;
        }
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Model][Dependent][Effect_ID:");
        Effect effect = this.LJIIJ;
        sbLIZ.append(effect != null ? effect.getEffect_id() : null);
        sbLIZ.append("][");
        sbLIZ.append(this.LJI);
        sbLIZ.append("][");
        sbLIZ.append(C20009113Qr.LIZIZ(strArr));
        sbLIZ.append("][Count:");
        sbLIZ.append(strArr.length);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("JKL", strLIZIZ);
        this.LJIILL = strArr.length;
        C13NJ c13nj2 = this.LJII;
        if (c13nj2 != null && c13nj2.LIZIZ(this.LJIIJ)) {
            LJI(strArr);
            return;
        }
        C2278408wI c2278408wI = C13QS.LIZ;
        c2278408wI.LIZ();
        try {
            LJI(strArr);
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final void LJI(String[] strArr) throws Exception {
        C19999213Mw c19999213Mw;
        boolean z;
        try {
            ArrayList<ModelInfo> arrayListLIZIZ = LIZIZ(this.LJFF, strArr, true);
            if (!(!arrayListLIZIZ.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                for (ModelInfo modelInfo : arrayListLIZIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(modelInfo.getName());
                    sbLIZ.append(", ");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LJIILLIIL = arrayListLIZIZ.size();
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Model][Download][");
                sbLIZ2.append(this.LJI);
                sbLIZ2.append("][");
                sbLIZ2.append((Object) sb);
                sbLIZ2.append("][Count:");
                sbLIZ2.append(arrayListLIZIZ.size());
                sbLIZ2.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZ("JKL", strLIZIZ);
            } else {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[Model][Download][");
                sbLIZ3.append(this.LJI);
                sbLIZ3.append("][All is download completely]");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZ("JKL", strLIZIZ2);
            }
            C13NJ c13nj = this.LJII;
            if (c13nj != null && c13nj.LIZIZ(this.LJIIJ)) {
                LJFF(this.LJIIJ, arrayListLIZIZ);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            LJ(this.LJIIJ, arrayListLIZIZ);
            this.LJIILIIL = System.currentTimeMillis() - jCurrentTimeMillis;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss3 = C13SS.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("fetchModels: ");
            sbLIZ4.append(C13LQ.LJJLL(strArr));
            sbLIZ4.append(" exception happens!");
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            c13ss3.getClass();
            C13SS.LIZIZ("effect_platform", strLIZIZ3, e);
            C089E c089e = new C089E(strArr);
            while (c089e.hasNext()) {
                if (!LJIIIIZZ((String) c089e.next())) {
                    throw e;
                }
            }
            C13NJ c13nj2 = this.LJII;
            if (c13nj2 != null && c13nj2.LIZIZ(this.LJIIJ) && (c19999213Mw = this.LJIIIIZZ) != null) {
                c19999213Mw.LIZ(new AwS574S0100000_30(this, 447));
            }
        }
    }

    public final boolean LJIIIIZZ(String str) {
        C20008613Qm c20008613Qm = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13M2.LIZ("model"));
        sbLIZ.append(str);
        boolean zLIZ = c20008613Qm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("model: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" is built in resource");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZ("effect_platform", strLIZIZ);
        }
        return zLIZ;
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void pause(boolean z) {
        Boolean boolValueOf;
        C13N1 c13n1;
        C19999213Mw c19999213Mw;
        boolean z2;
        Effect effect = this.LJIIJ;
        if (effect != null) {
            C13NJ c13nj = this.LJII;
            if (c13nj != null) {
                if (C13LQ.LJIILLIIL(effect.getPanel(), c13nj.LIZJ) && c13nj.LIZ && c13nj.LIZLLL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                super.pause(z);
                int iLIZJ = this.LJIJ.LIZJ();
                for (int i = 0; i < iLIZJ; i++) {
                    this.LJIJI.LIZIZ();
                }
                if (this.LJIJI.LIZJ() == 0 && (c19999213Mw = this.LJIIIIZZ) != null) {
                    c19999213Mw.LIZ(new AwS574S0100000_30(this, 448));
                }
                try {
                    for (C13QB c13qb : this.LJIJJ) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[Model][Pause][Downloading Task][");
                        sbLIZ.append(c13qb.LIZ.getName());
                        sbLIZ.append("][");
                        sbLIZ.append(c13qb.LIZ.getMD5());
                        sbLIZ.append(']');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZIZ("JKL", strLIZIZ, null);
                        C20007113Px c20007113Px = c13qb.LIZIZ;
                        C13NB c13nb = c20007113Px.LIZIZ;
                        if ((c13nb instanceof C13N1) && (c13n1 = (C13N1) c13nb) != null) {
                            c13n1.pause(c20007113Px.LJ);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static boolean LJIIIZ(C20006813Pu c20006813Pu, ModelInfo modelInfo) {
        if (c20006813Pu == null) {
            return true;
        }
        if (!C504670Jqj.LIZ(c20006813Pu.LIZLLL(), modelInfo.getVersion())) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("model ");
            sbLIZ.append(c20006813Pu.LIZIZ());
            sbLIZ.append(" version not equals, local model version:");
            sbLIZ.append(c20006813Pu.LIZLLL());
            sbLIZ.append(", lastest model: ");
            sbLIZ.append(modelInfo.getVersion());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("effect_platform", strLIZIZ);
            return true;
        }
        if (c20006813Pu.LIZJ() != modelInfo.getType()) {
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("model ");
            sbLIZ2.append(c20006813Pu.LIZIZ());
            sbLIZ2.append(" size not equals, local model size:");
            sbLIZ2.append(c20006813Pu.LIZJ());
            sbLIZ2.append(", lastest model: ");
            sbLIZ2.append(modelInfo.getType());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LIZ("effect_platform", strLIZIZ2);
            return true;
        }
        if (!C504670Jqj.LIZ(c20006813Pu.LIZ(), modelInfo.getMD5())) {
            C13SS c13ss3 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("model ");
            sbLIZ3.append(c20006813Pu.LIZIZ());
            sbLIZ3.append(" md5 not equals, local model size:");
            sbLIZ3.append(c20006813Pu.LIZ());
            sbLIZ3.append(", lastest model: ");
            sbLIZ3.append(modelInfo.getMD5());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss3.getClass();
            C13SS.LIZ("effect_platform", strLIZIZ3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Effect LJIILIIL(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Effect effect2 = new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    public final ArrayList<ModelInfo> LIZ(ModelInfo modelInfo, String str) {
        List<ModelInfo> demotion_list;
        ArrayList<ModelInfo> arrayList = new ArrayList<>();
        int i = this.LJIIL;
        if (i == 0) {
            return arrayList;
        }
        boolean z = false;
        if (i > 0) {
            List<ModelInfo> demotion_list2 = modelInfo.getDemotion_list();
            if (demotion_list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ModelInfo modelInfo2 : demotion_list2) {
                    if (modelInfo2.getLevel() == this.LJIIL) {
                        arrayList2.add(modelInfo2);
                    }
                }
                z = true;
                demotion_list = arrayList2;
            }
            return arrayList;
        }
        if (!this.LJIIJJI) {
            return arrayList;
        }
        demotion_list = modelInfo.getDemotion_list();
        if (demotion_list != null) {
            for (ModelInfo modelInfo3 : demotion_list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_level");
                sbLIZ.append(modelInfo3.getLevel());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ModelInfo modelInfoLJII = LJII(this.LJFF, strLIZIZ);
                if (modelInfoLJII == null) {
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("server model list has null with name: ");
                    sbLIZ2.append(strLIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss.getClass();
                    C13SS.LIZIZ("effect_platform", strLIZIZ2, null);
                } else if (LJIIIZ(this.LIZLLL.LJIJ(strLIZIZ), modelInfoLJII)) {
                    arrayList.add(modelInfoLJII);
                } else if (z) {
                    C1286890jap.LIZ(modelInfo3.getLevel(), strLIZIZ);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZLLL(com.ss.android.ugc.effectmanager.common.model.FetchModelType r22, final com.ss.android.ugc.effectmanager.common.model.ModelInfo r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20005613Pi.LIZLLL(com.ss.android.ugc.effectmanager.common.model.FetchModelType, com.ss.android.ugc.effectmanager.common.model.ModelInfo):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.effectmanager.effect.model.Effect r20, java.util.ArrayList<com.ss.android.ugc.effectmanager.common.model.ModelInfo> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20005613Pi.LJ(com.ss.android.ugc.effectmanager.effect.model.Effect, java.util.ArrayList):void");
    }

    public final void LJFF(final Effect effect, ArrayList<ModelInfo> arrayList) throws C1633840scQ {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (!C278790AwH.LIZ() && !C786590UtN.LIZ(this.LIZ.LJJIIZI) && (!arrayList.isEmpty())) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download ");
            sbLIZ.append(C13LP.LLIIII(arrayList));
            sbLIZ.append(" failed!, network unavailable!");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("effect_platform", strLIZIZ, null);
            throw new C1633840scQ(10011, "network unavailable");
        }
        if (arrayList.size() == 0) {
            C19999213Mw c19999213Mw = this.LJIIIIZZ;
            if (c19999213Mw != null) {
                c19999213Mw.LIZ(new AwS574S0100000_30(this, 445));
                return;
            }
            return;
        }
        this.LJIJI.LJ(arrayList.size());
        Executor executorLIZ = this.LJIIIZ;
        if (executorLIZ == null) {
            executorLIZ = C1042510dEf.LIZ(5, 15000L);
        }
        C13N2 c13n2 = this.LJIIZILJ;
        if (c13n2 != null) {
            c13n2.LIZ = null;
        }
        for (final ModelInfo modelInfo : arrayList) {
            executorLIZ.execute(new Runnable() { // from class: X.13Pj
                public final void LIZ() throws Throwable {
                    C20005613Pi c20005613Pi;
                    String md5;
                    String md52;
                    long jCurrentTimeMillis2;
                    C20005613Pi c20005613Pi2;
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("download model: ");
                    sbLIZ2.append(modelInfo.getName());
                    sbLIZ2.append(", version: ");
                    sbLIZ2.append(modelInfo.getVersion());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("effect_platform", strLIZIZ2);
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (this.isCanceled) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[Model][Pause][");
                        sbLIZ3.append(this.LJI);
                        sbLIZ3.append("][");
                        sbLIZ3.append(modelInfo.getName());
                        sbLIZ3.append("][The task is paused/cancel.Return!]");
                        C13SS.LJ("JKL", C2188811AlT.LIZIZ(sbLIZ3));
                        this.LJIJI.LIZIZ();
                        if (this.LJIJI.LIZJ() == 0) {
                            C20005613Pi c20005613Pi3 = this;
                            C19999213Mw c19999213Mw2 = c20005613Pi3.LJIIIIZZ;
                            if (c19999213Mw2 != null) {
                                c19999213Mw2.LIZ(new AwS574S0100000_30(c20005613Pi3, 446));
                            }
                            this.LJIILIIL = System.currentTimeMillis() - jCurrentTimeMillis;
                            return;
                        }
                        return;
                    }
                    C13QF.LIZ();
                    this.LIZ.getClass();
                    long jLIZ = C13QG.LIZ();
                    try {
                        try {
                            this.LJIJ.LIZLLL();
                            String md53 = modelInfo.getMD5();
                            if (md53 != null) {
                                try {
                                    C20005613Pi c20005613Pi4 = this;
                                    ModelInfo modelInfo2 = modelInfo;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    String str = c20005613Pi4.LJI;
                                    if (str == null) {
                                        str = "";
                                    }
                                    sbLIZ4.append(str);
                                    sbLIZ4.append(modelInfo2.getName());
                                    C19998713Mr.LIZIZ(md53, C2188811AlT.LIZIZ(sbLIZ4));
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = true;
                                }
                            }
                            this.LJIJ.LIZIZ();
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                            c20005613Pi2 = this;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                    }
                    if (c20005613Pi2.isCanceled) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("[Model][Pause][");
                        sbLIZ5.append(this.LJI);
                        sbLIZ5.append("][");
                        sbLIZ5.append(modelInfo.getName());
                        sbLIZ5.append("][The task is paused/cancel.Return!]");
                        C13SS.LJ("JKL", C2188811AlT.LIZIZ(sbLIZ5));
                        String md54 = modelInfo.getMD5();
                        if (md54 != null) {
                            C20005613Pi c20005613Pi5 = this;
                            ModelInfo modelInfo3 = modelInfo;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            String str2 = c20005613Pi5.LJI;
                            sbLIZ6.append(str2 != null ? str2 : "");
                            sbLIZ6.append(modelInfo3.getName());
                            C19998713Mr.LIZ(md54, C2188811AlT.LIZIZ(sbLIZ6));
                        }
                        this.LJIJI.LIZIZ();
                        if (this.LJIJI.LIZJ() == 0) {
                            C20005613Pi c20005613Pi6 = this;
                            C19999213Mw c19999213Mw3 = c20005613Pi6.LJIIIIZZ;
                            if (c19999213Mw3 != null) {
                                c19999213Mw3.LIZ(new AwS574S0100000_30(c20005613Pi6, 446));
                            }
                            this.LJIILIIL = System.currentTimeMillis() - jCurrentTimeMillis;
                            return;
                        }
                        return;
                    }
                    if (c20005613Pi2.LIZIZ(c20005613Pi2.LJFF, new String[]{modelInfo.getName()}, false).isEmpty() ^ true) {
                        C20005613Pi c20005613Pi7 = this;
                        long jLIZLLL = c20005613Pi7.LIZLLL(c20005613Pi7.LIZ.LJJIJ, modelInfo);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("[DownloadSuc][");
                        sbLIZ7.append(this.LJI);
                        sbLIZ7.append("][");
                        sbLIZ7.append(modelInfo.getMD5());
                        sbLIZ7.append("][Model:");
                        sbLIZ7.append(modelInfo.getName());
                        sbLIZ7.append("][Duration:");
                        try {
                            sbLIZ7.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                            sbLIZ7.append("][");
                            sbLIZ7.append(jLIZLLL);
                            sbLIZ7.append(']');
                            C13SS.LIZ("LLL", C2188811AlT.LIZIZ(sbLIZ7));
                            if (jLIZLLL > 0) {
                                C20005613Pi c20005613Pi8 = this;
                                c20005613Pi8.LJIILJJIL += jLIZLLL;
                                c20005613Pi8.LJIIJJI(C20005613Pi.LJIILIIL(effect, modelInfo), modelInfo, jLIZ, jLIZLLL / ((long) 1024));
                            } else if (jLIZLLL != -2 && jLIZLLL != -3) {
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("[Model][Error][FileSize : ");
                                sbLIZ8.append(jLIZLLL);
                                sbLIZ8.append(']');
                                C13SS.LIZIZ("JKL", C2188811AlT.LIZIZ(sbLIZ8), null);
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("download model fail, downloadFileSize = ");
                                sbLIZ9.append(jLIZLLL);
                                RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ9));
                                C20005613Pi c20005613Pi9 = this;
                                Effect effect2 = effect;
                                ModelInfo modelInfo4 = modelInfo;
                                c20005613Pi9.getClass();
                                c20005613Pi9.LJIIJ(C20005613Pi.LJIILIIL(effect2, modelInfo4), modelInfo, runtimeException);
                                this.LJIIL(modelInfo, runtimeException);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            z = true;
                            TryCatchGuardChecker.doCheck(e);
                            C13SS c13ss3 = C13SS.LIZ;
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("[Exception][");
                            sbLIZ10.append(this.LJI);
                            sbLIZ10.append("][");
                            sbLIZ10.append(modelInfo.getMD5());
                            sbLIZ10.append("][Model:");
                            sbLIZ10.append(modelInfo.getName());
                            sbLIZ10.append("][Msg:");
                            sbLIZ10.append(e.getMessage());
                            sbLIZ10.append(']');
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ10);
                            c13ss3.getClass();
                            C13SS.LIZIZ("LLL", strLIZIZ3, null);
                            C20005613Pi c20005613Pi10 = this;
                            Effect effect3 = effect;
                            ModelInfo modelInfo5 = modelInfo;
                            c20005613Pi10.getClass();
                            c20005613Pi10.LJIIJ(C20005613Pi.LJIILIIL(effect3, modelInfo5), modelInfo, e);
                            C13N2 c13n22 = this.LJIIZILJ;
                            if (c13n22 != null) {
                                c13n22.LIZ = e;
                            }
                            if (z && (md5 = modelInfo.getMD5()) != null) {
                                C20005613Pi c20005613Pi11 = this;
                                ModelInfo modelInfo6 = modelInfo;
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                String str3 = c20005613Pi11.LJI;
                                sbLIZ11.append(str3 != null ? str3 : "");
                                sbLIZ11.append(modelInfo6.getName());
                                C19998713Mr.LIZ(md5, C2188811AlT.LIZIZ(sbLIZ11));
                            }
                            this.LJIJI.LIZIZ();
                            if (this.LJIJI.LIZJ() != 0) {
                                return;
                            }
                            C20005613Pi c20005613Pi12 = this;
                            C19999213Mw c19999213Mw4 = c20005613Pi12.LJIIIIZZ;
                            if (c19999213Mw4 != null) {
                                c19999213Mw4.LIZ(new AwS574S0100000_30(c20005613Pi12, 446));
                            }
                            c20005613Pi = this;
                        } catch (Throwable th4) {
                            th = th4;
                            z = true;
                        }
                    } else {
                        C20005613Pi c20005613Pi13 = this;
                        Effect effect4 = effect;
                        ModelInfo modelInfo7 = modelInfo;
                        c20005613Pi13.getClass();
                        c20005613Pi13.LJIIJJI(C20005613Pi.LJIILIIL(effect4, modelInfo7), modelInfo, jLIZ, 0L);
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("[DownloadSuc][");
                        sbLIZ12.append(this.LJI);
                        sbLIZ12.append("][");
                        sbLIZ12.append(modelInfo.getMD5());
                        sbLIZ12.append("][Model:");
                        sbLIZ12.append(modelInfo.getName());
                        sbLIZ12.append("][Duration:");
                        sbLIZ12.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                        sbLIZ12.append("][Do not Repeat download!]");
                        C13SS.LIZIZ("LLL", C2188811AlT.LIZIZ(sbLIZ12), null);
                    }
                    String md55 = modelInfo.getMD5();
                    if (md55 != null) {
                        C20005613Pi c20005613Pi14 = this;
                        ModelInfo modelInfo8 = modelInfo;
                        StringBuilder sb = new StringBuilder();
                        String str4 = c20005613Pi14.LJI;
                        sb.append(str4 != null ? str4 : "");
                        sb.append(modelInfo8.getName());
                        C19998713Mr.LIZ(md55, sb.toString());
                    }
                    this.LJIJI.LIZIZ();
                    if (this.LJIJI.LIZJ() == 0) {
                        C20005613Pi c20005613Pi15 = this;
                        C19999213Mw c19999213Mw5 = c20005613Pi15.LJIIIIZZ;
                        if (c19999213Mw5 != null) {
                            c19999213Mw5.LIZ(new AwS574S0100000_30(c20005613Pi15, 446));
                        }
                        c20005613Pi = this;
                        c20005613Pi.LJIILIIL = System.currentTimeMillis() - jCurrentTimeMillis;
                        return;
                    }
                    return;
                    z = true;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            break;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    if (z && (md52 = modelInfo.getMD5()) != null) {
                        C20005613Pi c20005613Pi16 = this;
                        ModelInfo modelInfo9 = modelInfo;
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        String str5 = c20005613Pi16.LJI;
                        sbLIZ13.append(str5 != null ? str5 : "");
                        sbLIZ13.append(modelInfo9.getName());
                        C19998713Mr.LIZ(md52, C2188811AlT.LIZIZ(sbLIZ13));
                    }
                    this.LJIJI.LIZIZ();
                    if (this.LJIJI.LIZJ() == 0) {
                        C20005613Pi c20005613Pi17 = this;
                        C19999213Mw c19999213Mw6 = c20005613Pi17.LJIIIIZZ;
                        if (c19999213Mw6 != null) {
                            c19999213Mw6.LIZ(new AwS574S0100000_30(c20005613Pi17, 446));
                        }
                        this.LJIILIIL = System.currentTimeMillis() - jCurrentTimeMillis;
                    }
                    throw th;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FetchModelTask@fc06.downloadAndUpdateModelList2$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FetchModelTask@fc06.downloadAndUpdateModelList2$2");
                }
            });
        }
    }

    public final ModelInfo LJII(int i, String str) {
        C20006713Pt c20006713PtLIZ;
        Map<String, ModelInfo> mapLIZIZ;
        try {
            C20005913Pl c20005913Pl = this.LIZIZ;
            if (c20005913Pl == null || (c20006713PtLIZ = c20005913Pl.LIZ(i, false)) == null || (mapLIZIZ = c20006713PtLIZ.LIZIZ()) == null) {
                return null;
            }
            return (ModelInfo) ((LinkedHashMap) mapLIZIZ).get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("effect_platform", "exception happens in getLatestModelInfo", e);
        }
        return null;
    }

    public final void LJIIL(ModelInfo modelInfo, Exception exc) throws Exception {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model::");
        sbLIZ.append(modelInfo.getName());
        sbLIZ.append(",info.getVersion() = ");
        sbLIZ.append(modelInfo.getVersion());
        sbLIZ.append(", size = ");
        sbLIZ.append(modelInfo.getType());
        sbLIZ.append(" download failure");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("effect_platform", strLIZIZ, exc);
        C20006813Pu c20006813PuLJIJ = this.LIZLLL.LJIJ(modelInfo.getName());
        if (c20006813PuLJIJ != null) {
            String strLIZLLL = c20006813PuLJIJ.LIZLLL();
            String version = modelInfo.getVersion();
            if (!C504670Jqj.LIZIZ(strLIZLLL) && !C504670Jqj.LIZIZ(version)) {
                if (!C504670Jqj.LIZ(strLIZLLL, version)) {
                    try {
                        if (C504670Jqj.LIZ(strLIZLLL.substring(0, a0.LJJJ(strLIZLLL, e3.d, 0, false, 6)), version.substring(0, a0.LJJJ(strLIZLLL, e3.d, 0, false, 6)))) {
                            return;
                        } else {
                            throw exc;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw exc;
                    }
                }
                return;
            }
            throw exc;
        }
        throw exc;
    }

    public final ArrayList<ModelInfo> LIZIZ(int i, String[] strArr, boolean z) {
        C20006713Pt c20006713PtLIZ;
        C20005913Pl c20005913Pl = this.LIZIZ;
        if (c20005913Pl != null && (c20006713PtLIZ = c20005913Pl.LIZ(i, z)) != null) {
            return LIZJ(i, strArr, c20006713PtLIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model list with ");
        sbLIZ.append(i);
        sbLIZ.append(" not found!");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.ss.android.ugc.effectmanager.common.model.ModelInfo> LIZJ(int r14, java.lang.String[] r15, X.C20006713Pt r16) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20005613Pi.LIZJ(int, java.lang.String[], X.13Pt):java.util.ArrayList");
    }

    public final void LJIIJ(Effect effect, ModelInfo modelInfo, Exception exc) {
        String strLIZLLL;
        List<String> url_list;
        C1662010tLr c1662010tLr = new C1662010tLr(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        Object obj = null;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null && (!url_list.isEmpty())) {
            obj = ListProtector.get(url_list, 0);
        }
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String string = this.LIZ.LJJIJ.toString();
            Pair[] pairArr = new Pair[3];
            String md5 = modelInfo.getMD5();
            if (md5 == null) {
                md5 = "";
            }
            pairArr[0] = new Pair("md5", md5);
            if (obj == null) {
                obj = "";
            }
            pairArr[1] = new Pair("download_url", obj);
            pairArr[2] = new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            String message = exc.getMessage();
            if (message != null && !a0.LJJJIL(message)) {
                strLIZLLL = exc.getMessage();
            } else {
                strLIZLLL = C13LE.LIZ(exc.getClass()).LIZLLL();
            }
            C19997513Mf.LJI(interfaceC1633730scF, false, c13rd, effect, name, version, string, mapLJIIIIZZ, strLIZLLL);
        }
        this.LIZ.getClass();
    }

    public final void LJIIJJI(Effect effect, ModelInfo modelInfo, long j, long j2) {
        List<String> url_list;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model::");
        sbLIZ.append(modelInfo.getName());
        sbLIZ.append(",version = ");
        sbLIZ.append(modelInfo.getVersion());
        sbLIZ.append(",size = ");
        sbLIZ.append(modelInfo.getType());
        sbLIZ.append(" download success!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("effect_platform", strLIZIZ);
        modelInfo.setTotalSize(j2 / ((long) 1024));
        long jLIZ = C13QG.LIZ() - j;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        Object obj = null;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null && (!url_list.isEmpty())) {
            obj = ListProtector.get(url_list, 0);
        }
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        String str = "";
        if (interfaceC1633730scF != null) {
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String string = this.LIZ.LJJIJ.toString();
            Pair[] pairArr = new Pair[4];
            String md5 = modelInfo.getMD5();
            if (md5 == null) {
                md5 = "";
            }
            pairArr[0] = new Pair("md5", md5);
            if (obj == null) {
                obj = "";
            }
            pairArr[1] = new Pair("download_url", obj);
            pairArr[2] = new Pair("size", Long.valueOf(j2));
            pairArr[3] = new Pair("duration", Long.valueOf(jLIZ));
            C19997513Mf.LJI(interfaceC1633730scF, true, c13rd, effect, name, version, string, C2097608Jq.LJIIIIZZ(pairArr), "");
        }
        this.LIZ.getClass();
        if (EnumC818700W9s.ANDROID != EnumC818700W9s.PC) {
            String name2 = modelInfo.getName();
            C20006813Pu c20006813Pu = new C20006813Pu("");
            c20006813Pu.LIZIZ = name2;
            String md52 = modelInfo.getMD5();
            if (md52 != null) {
                str = md52;
            }
            c20006813Pu.LIZLLL = str;
            c20006813Pu.LJ = modelInfo.getType();
            c20006813Pu.LIZJ = modelInfo.getVersion();
            c20006813Pu.LJFF = false;
            C13QH c13qh = new C13QH(c20006813Pu, modelInfo);
            C2278408wI c2278408wI = C13P7.LIZ;
            c2278408wI.LIZ();
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("model: ");
                sbLIZ2.append(name2);
                sbLIZ2.append(" write in cache!");
                C13SS.LIZ("AlgorithmModelInfoMemoryCache", C2188811AlT.LIZIZ(sbLIZ2));
                C13P7.LIZIZ.put(name2, c13qh);
                c2278408wI.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2278408wI.LIZIZ();
                throw th;
            }
        }
        if (this.LJIIL > 0 && modelInfo.getLevel() > 0) {
            C1286890jap.LIZ(modelInfo.getLevel(), modelInfo.getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20005613Pi(C13RD c13rd, C20005913Pl c20005913Pl, C20008613Qm c20008613Qm, C20006313Pp c20006313Pp, String[] strArr, int i, int i2) {
        int i3;
        int i4 = i;
        String[] strArr2 = (i2 & 16) != 0 ? null : strArr;
        i4 = (i2 & 32) != 0 ? 0 : i4;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(c13rd, c20005913Pl, c20008613Qm, c20006313Pp, strArr2, i4, null, null, null, null, null, false, i3);
    }

    public C20005613Pi(C13RD c13rd, C20005913Pl c20005913Pl, C20008613Qm c20008613Qm, C20006313Pp c20006313Pp, String[] strArr, int i, String str, C13NJ c13nj, C19999213Mw c19999213Mw, InterfaceExecutorC740550T3d interfaceExecutorC740550T3d, Effect effect, boolean z, int i2) {
        super(str, c13rd.LJJJIL);
        this.LIZ = c13rd;
        this.LIZIZ = c20005913Pl;
        this.LIZJ = c20008613Qm;
        this.LIZLLL = c20006313Pp;
        this.LJ = strArr;
        this.LJFF = i;
        this.LJI = str;
        this.LJII = c13nj;
        this.LJIIIIZZ = c19999213Mw;
        this.LJIIIZ = interfaceExecutorC740550T3d;
        this.LJIIJ = effect;
        this.LJIIJJI = z;
        this.LJIIL = i2;
        this.LJIJ = new C563400M7u(0);
        this.LJIJI = new C563400M7u(0);
        this.LJIJJ = new CopyOnWriteArrayList<>();
    }
}
