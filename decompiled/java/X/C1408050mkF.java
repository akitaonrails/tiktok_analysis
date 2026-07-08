package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0mkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.ScreenAppLifeCycleManager$initialize$1", f = "ScreenAppLifeCycleManager.kt", l = {}, m = "invokeSuspend")
public final class C1408050mkF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1408050mkF(InterfaceC1364105Vn<? super C1408050mkF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408050mkF(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenAppLifeCycleManager@7f7e.initialize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20541515Zl.LIZ(new InterfaceC20541615Zm() { // from class: X.15ZG
            @Override // X.InterfaceC20541615Zm
            public final void LIZ() {
                C622680Oba.LIZJ(this);
            }

            @Override // X.InterfaceC20541615Zm
            public final void LIZIZ() {
                C622680Oba.LIZLLL(this);
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
                C15ZL c15zl;
                try {
                    if (TextUtils.equals("update_screen_time_breaks", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                        String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "screen_time_breaks");
                        String string2 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "session_duration_type");
                        String string3 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "session_duration_source");
                        ComplianceServiceProvider.LJIL().LIZLLL(CastIntegerProtector.parseInt(string), CastIntegerProtector.parseInt(string2));
                        if (CastIntegerProtector.parseInt(string3) == 1 && CastIntegerProtector.parseInt(string) > 0 && (c15zl = C15ZE.LIZ) != null) {
                            c15zl.LJI(0);
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onLoginEvent(C486550J6f c486550J6f) {
                int i = c486550J6f.LIZ;
                if (i == 0) {
                    C15ZL c15zl = C15ZE.LIZ;
                    if (c15zl != null) {
                        c15zl.LJI(0);
                    }
                    C15ZI c15zi = C15ZE.LIZIZ;
                    if (c15zi != null) {
                        c15zi.LJI();
                        return;
                    }
                    return;
                }
                if (i == 1) {
                    C15ZL c15zl2 = C15ZE.LIZ;
                    if (c15zl2 != null) {
                        c15zl2.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
                    }
                    C15ZI c15zi2 = C15ZE.LIZIZ;
                    if (c15zi2 != null) {
                        c15zi2.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
                        c15zi2.LIZLLL = null;
                        c15zi2.LJ = null;
                        c15zi2.LJFF = null;
                    }
                    C15ZL c15zl3 = C15ZE.LIZ;
                    if (c15zl3 != null) {
                        c15zl3.LJI(0);
                    }
                    C15ZI c15zi3 = C15ZE.LIZIZ;
                    if (c15zi3 == null) {
                        return;
                    }
                    c15zi3.LJI();
                    return;
                }
                if (i != 2) {
                    return;
                }
                C15ZL c15zl4 = C15ZE.LIZ;
                if (c15zl4 != null) {
                    c15zl4.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
                }
                C15ZI c15zi4 = C15ZE.LIZIZ;
                if (c15zi4 == null) {
                    return;
                }
                c15zi4.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
                c15zi4.LIZLLL = null;
                c15zi4.LJ = null;
                c15zi4.LJFF = null;
            }

            @C14EU(threadMode = ThreadMode.BACKGROUND)
            public final void onReceivedVideoEvent(C1563520qn0 c1563520qn0) {
                C15ZL c15zl;
                C15ZR c15zr;
                C15ZQ c15zq;
                C15ZR c15zr2;
                C15ZQ c15zq2;
                C15ZM c15zm;
                C15ZL c15zl2 = C15ZE.LIZ;
                if (c15zl2 != null && (c15zm = c15zl2.LIZJ) != null) {
                    c15zm.LJFF(c1563520qn0.LIZ);
                }
                if (!c1563520qn0.LIZ && (c15zl = C15ZE.LIZ) != null) {
                    for (C15ZW c15zw : c15zl.LIZIZ) {
                        if ((c15zw instanceof C15ZY) && (c15zr2 = C15ZR.LIZLLL) != null && (c15zq2 = c15zr2.LIZIZ) != null) {
                            c15zq2.LIZIZ((C15ZY) c15zw, c15zl);
                        }
                        if ((c15zw instanceof C15ZH) && (c15zr = C15ZR.LIZLLL) != null && (c15zq = c15zr.LIZIZ) != null) {
                            Object obj2 = ((LinkedHashMap) c15zq.LIZJ).get(c15zw.LIZIZ);
                            if (Intrinsics.LJFF(c15zw.LIZ, "ScheduleBreakShowStrategy") || obj2 != null) {
                                throw null;
                            }
                        }
                    }
                }
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onScreenTimeChanged(C15XT c15xt) {
                if (c15xt.LIZ > 0) {
                    C15ZL c15zl = C15ZE.LIZ;
                    if (c15zl != null) {
                        c15zl.LJI(1);
                        return;
                    }
                    return;
                }
                C15ZL c15zl2 = C15ZE.LIZ;
                if (c15zl2 == null) {
                    return;
                }
                c15zl2.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenAppLifeCycleManager@7f7e.initialize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1408050mkF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
