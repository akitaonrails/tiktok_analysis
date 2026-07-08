package X;

import Y.ARunnableS95S0200000_26;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0umr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717190umr implements InterfaceC1716260ulM, InterfaceC1717160umo {
    public final BaseRegisterManager LIZ;
    public final C19EG LIZIZ;
    public final List<InterfaceC1717200ums> LIZJ;
    public final int LIZLLL;
    public final InterfaceC1717210umt LJ;
    public final String LJFF;
    public final boolean LJI;

    @Override // X.InterfaceC1717160umo
    public final void LIZLLL() {
        int i = this.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= 0 && i2 < this.LIZJ.size()) {
                ((InterfaceC1717200ums) ListProtector.get(this.LIZJ, i2)).LIZJ();
            }
        }
    }

    @Override // X.InterfaceC1717160umo
    public final void LJ() {
        Iterator<InterfaceC1717200ums> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.InterfaceC1716260ulM
    public final void LIZ(Object obj) {
        int i = this.LIZLLL - 2;
        if (i >= 0 && i < this.LIZJ.size()) {
            ((InterfaceC1717200ums) ListProtector.get(this.LIZJ, i)).LJIIJJI();
        }
        int i2 = this.LIZLLL - 1;
        if (i2 >= 0 && i2 < this.LIZJ.size()) {
            InterfaceC1717200ums interfaceC1717200ums = (InterfaceC1717200ums) ListProtector.get(this.LIZJ, i2);
            String strLJIIIZ = interfaceC1717200ums.LJIIIZ();
            if (strLJIIIZ != null && strLJIIIZ.length() != 0 && Intrinsics.LJFF(interfaceC1717200ums.LJFF(), Boolean.TRUE)) {
                String strLJI = interfaceC1717200ums.LJI();
                if (!Intrinsics.LJFF(strLJI, "COLLECT_INFO_PAGE") ? !(!Intrinsics.LJFF(strLJI, "CREATE_BIO") || (!Intrinsics.LJFF(obj, "create_bio_unavailable") && !Intrinsics.LJFF(obj, "create_bio_risk_blocked") && !Intrinsics.LJFF(obj, "create_bio_auth_limit_reached") && !Intrinsics.LJFF(obj, "create_bio_max_fail_skip") && !Intrinsics.LJFF(obj, "create_bio_params_error"))) : Intrinsics.LJFF(obj, "collect_info_page_user_skip")) {
                    LJFF(interfaceC1717200ums, i2);
                    BaseRegisterManager baseRegisterManager = this.LIZ;
                    C19EG c19eg = this.LIZIZ;
                    List<InterfaceC1717200ums> list = this.LIZJ;
                    String strLJIIIZ2 = interfaceC1717200ums.LJIIIZ();
                    int i3 = this.LIZLLL;
                    while (i3 >= 0 && i3 < this.LIZJ.size()) {
                        InterfaceC1717200ums interfaceC1717200ums2 = (InterfaceC1717200ums) ListProtector.get(this.LIZJ, i3);
                        if (!Intrinsics.LJFF(interfaceC1717200ums2.LJIIIZ(), strLJIIIZ2) || !Intrinsics.LJFF(interfaceC1717200ums2.LJFF(), Boolean.TRUE)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    new C1717190umr(baseRegisterManager, c19eg, (List<? extends InterfaceC1717200ums>) list, i3, this.LJ, this.LJFF, false).LIZJ(null, this.LJFF, null);
                    return;
                }
            }
            this.LIZ.LJIIJ(interfaceC1717200ums, obj);
        }
    }

    @Override // X.InterfaceC1717160umo
    public final void LIZIZ(EnumC1717220umu enumC1717220umu) {
        for (int i = this.LIZLLL; -1 < i; i--) {
            if (i < this.LIZJ.size() && Intrinsics.LJFF(((InterfaceC1717200ums) ListProtector.get(this.LIZJ, i)).LJI(), enumC1717220umu.name())) {
                ((InterfaceC1717200ums) ListProtector.get(this.LIZJ, i)).LIZJ();
            }
        }
    }

    public final void LJFF(InterfaceC1717200ums interfaceC1717200ums, int i) {
        String strLJIIIZ = interfaceC1717200ums.LJIIIZ();
        if (strLJIIIZ == null) {
            return;
        }
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (i2 < this.LIZJ.size()) {
                InterfaceC1717200ums interfaceC1717200ums2 = (InterfaceC1717200ums) ListProtector.get(this.LIZJ, i2);
                if (Intrinsics.LJFF(interfaceC1717200ums2.LJI(), "COLLECT_INFO_PAGE") && Intrinsics.LJFF(interfaceC1717200ums2.LJIIIZ(), strLJIIIZ)) {
                    interfaceC1717200ums2.LIZJ();
                }
            }
        }
    }

    @Override // X.InterfaceC1716260ulM
    public final void LIZJ(Object obj, String str, List list) {
        Object obj2;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LIZJ, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(662), 30);
        if (this.LJI) {
            int i = this.LIZLLL - 2;
            if (i >= 0 && i < this.LIZJ.size()) {
                ((InterfaceC1717200ums) ListProtector.get(this.LIZJ, i)).LJIIJJI();
            }
            int i2 = this.LIZLLL - 1;
            if (i2 >= 0 && i2 < this.LIZJ.size()) {
                obj2 = ListProtector.get(this.LIZJ, i2);
                InterfaceC1717200ums interfaceC1717200ums = (InterfaceC1717200ums) obj2;
                this.LIZ.LJIIJJI(interfaceC1717200ums, obj);
                if (list != null) {
                    for (Object obj3 : list) {
                        if (obj3 != null) {
                            interfaceC1717200ums.LIZLLL().add(new WeakReference<>(obj3));
                        }
                    }
                }
                C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(strLJJLIIIJ);
                sbLIZ.append(']');
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, this.LIZ.LL), new Pair("step_name", interfaceC1717200ums.LJI()), new Pair("all_step", C2188811AlT.LIZIZ(sbLIZ)), new Pair("cur_step_index", String.valueOf(i2)));
                c1716310ulR.getClass();
                C1716310ulR.LIZLLL("rd_pipo_wallet_step_leave", mapLJIIJ);
                if (Intrinsics.LJFF(interfaceC1717200ums.LJI(), "CREATE_BIO")) {
                    LJFF(interfaceC1717200ums, i2);
                }
            } else {
                C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(strLJJLIIIJ);
                sbLIZ2.append(']');
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, this.LIZ.LL), new Pair("all_step", C2188811AlT.LIZIZ(sbLIZ2)));
                c1716310ulR2.getClass();
                C1716310ulR.LIZLLL("rd_pipo_wallet_step_start", mapLJIIJ2);
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        int size = this.LIZJ.size();
        int i3 = this.LIZLLL;
        if (i3 >= 0 && i3 < size) {
            InterfaceC1717200ums interfaceC1717200ums2 = (InterfaceC1717200ums) ListProtector.get(this.LIZJ, i3);
            interfaceC1717200ums2.LJIIJ(this);
            if (obj != null) {
                interfaceC1717200ums2.LJIIIIZZ((InterfaceC1717200ums) obj2, obj);
            }
            BaseRegisterManager baseRegisterManager = this.LIZ;
            C19EG c19eg = this.LIZIZ;
            interfaceC1717200ums2.LJII(c19eg, new C1717190umr(baseRegisterManager, c19eg, this.LIZJ, this.LIZLLL + 1, this.LJ, str, 64), str);
            C1716310ulR c1716310ulR3 = C1716310ulR.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('[');
            sbLIZ3.append(strLJJLIIIJ);
            sbLIZ3.append(']');
            Map mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, this.LIZ.LL), new Pair("step_name", interfaceC1717200ums2.LJI()), new Pair("all_step", C2188811AlT.LIZIZ(sbLIZ3)), new Pair("cur_step_index", String.valueOf(this.LIZLLL)));
            c1716310ulR3.getClass();
            C1716310ulR.LIZLLL("rd_pipo_wallet_step_show", mapLJIIJ3);
            C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS95S0200000_26(this, interfaceC1717200ums2, 42));
            return;
        }
        InterfaceC1717210umt interfaceC1717210umt = this.LJ;
        if (interfaceC1717210umt != null) {
            interfaceC1717210umt.LIZIZ();
        }
        InterfaceC1717210umt interfaceC1717210umt2 = this.LJ;
        if (interfaceC1717210umt2 != null) {
            interfaceC1717210umt2.LIZ();
        }
        this.LIZ.LJIIIZ(this);
        C1716310ulR c1716310ulR4 = C1716310ulR.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append('[');
        sbLIZ4.append(strLJJLIIIJ);
        sbLIZ4.append(']');
        Map mapLJIIJ4 = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, this.LIZ.LL), new Pair("all_step", C2188811AlT.LIZIZ(sbLIZ4)));
        c1716310ulR4.getClass();
        C1716310ulR.LIZLLL("rd_pipo_wallet_step_end", mapLJIIJ4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1717190umr(BaseRegisterManager baseRegisterManager, C19EG c19eg, List<? extends InterfaceC1717200ums> list, int i, InterfaceC1717210umt interfaceC1717210umt, String str, boolean z) {
        this.LIZ = baseRegisterManager;
        this.LIZIZ = c19eg;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = interfaceC1717210umt;
        this.LJFF = str;
        this.LJI = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1717190umr(BaseRegisterManager baseRegisterManager, C19EG c19eg, List list, int i, InterfaceC1717210umt interfaceC1717210umt, String str, int i2) {
        boolean z;
        str = (i2 & 32) != 0 ? null : str;
        if ((i2 & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(baseRegisterManager, c19eg, (List<? extends InterfaceC1717200ums>) list, i, interfaceC1717210umt, str, z);
    }
}
