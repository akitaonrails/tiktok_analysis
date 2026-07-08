package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19257210Vm {
    public static final C19257210Vm LIZ = new C19257210Vm();
    public static final C19257310Vn LIZIZ = new C19257310Vn();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(587));

    public static void LIZIZ(Map map) {
        C0NRA.LIZ("pns_agegate_request", new LinkedHashMap(), map);
        C19257310Vn c19257310Vn = LIZIZ;
        c19257310Vn.getLogParams().clear();
        c19257310Vn.getLogParams().putAll(map);
        c19257310Vn.getLogParams().put("pns_agegate_sdk", "1");
    }

    public static void LIZ(C19257210Vm c19257210Vm, EnumC19257610Vq enumC19257610Vq, C10UK c10uk, final Context context, InterfaceC19257010Vk interfaceC19257010Vk, C10WT c10wt, C19301310fD c19301310fD, Class cls, int i) {
        InterfaceC19258010Vu interfaceC19258010Vu;
        if ((i & 16) != 0) {
            c10wt = null;
        }
        if ((i & 32) != 0) {
            c19301310fD = null;
        }
        c19257210Vm.getClass();
        if (interfaceC19257010Vk.LIZ() instanceof Fragment) {
            if (c10wt == null) {
                int i2 = C19257410Vo.LIZ[enumC19257610Vq.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c10wt = new C19299410eu(context);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c10wt = new C19299210es(context);
                    }
                } else {
                    c10wt = new AbstractC19299810ey(context) { // from class: X.10er
                        public final Context LIZ;

                        @Override // X.C10WT
                        public final C19299010eq LJI() {
                            return new C19299010eq("", this.LIZ.getString(2131829332), this.LIZ.getString(2131829331), this.LIZ.getString(2131827417), null, this.LIZ.getString(2131837631), AbstractC19299810ey.LJIIIZ(), AbstractC19299810ey.LJIIIZ(), null, EnumC19300610f6.HIDE, Collections.singletonList(new PNSNavButton(EnumC19300410f4.LEFT, EnumC19300210f2.BACK, null, "", "")), null, null, null);
                        }

                        @Override // X.C10WT
                        public final Context getContext() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = context;
                        }

                        @Override // X.C10WT
                        public final PNSFeedbackModel LIZLLL(C19249810Sq c19249810Sq) {
                            if (C10WM.LIZ[c19249810Sq.LIZ.ordinal()] == 1) {
                                return LJ();
                            }
                            return null;
                        }
                    };
                }
            }
            if (c19301310fD != null && (c10wt instanceof InterfaceC19258010Vu) && (interfaceC19258010Vu = (InterfaceC19258010Vu) c10wt) != null) {
                interfaceC19258010Vu.LIZ(c19301310fD);
            }
            C19257810Vs.LIZ.put(enumC19257610Vq, c10wt);
            C19257310Vn c19257310Vn = LIZIZ;
            c19257310Vn.setScene(enumC19257610Vq);
            C19257910Vt.LIZ.put(enumC19257610Vq, interfaceC19257010Vk);
            C19257710Vr.LIZ.put(enumC19257610Vq, c10uk);
            Intent intent = new Intent(context, (Class<?>) cls);
            if (!c19257310Vn.getHasTransitionAnimation()) {
                intent.addFlags(65536);
            }
            intent.addFlags(268435456);
            intent.putExtra("age_gate_params", c19257310Vn);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqmcNHP2zfB3AXRA84DH/tKmmG6hszaDwPteBgV", null));
        }
    }
}
