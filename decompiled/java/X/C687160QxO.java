package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.EcSearchCoinManager$setState$1", f = "EcSearchCoinManager.kt", l = {}, m = "invokeSuspend")
public final class C687160QxO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C687160QxO(int i, JSONObject jSONObject, InterfaceC1364105Vn<? super C687160QxO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C687160QxO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        C1C7U.LIZ("EcSearchCoinManager@697c.setState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setState start: newState: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" oldState: ");
        sbLIZ.append(C687150QxN.LLILLJJLI);
        sbLIZ.append(" extraInfo: ");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (this.LL == C687150QxN.LLILLJJLI && this.LL != EnumC687210QxT.RUNNING.getValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
            return unit;
        }
        int i = this.LL;
        EnumC687210QxT enumC687210QxT = EnumC687210QxT.INIT;
        boolean z2 = false;
        if (i != enumC687210QxT.getValue()) {
            EnumC687210QxT enumC687210QxT2 = EnumC687210QxT.RUNNING;
            if (i == enumC687210QxT2.getValue()) {
                if (C687150QxN.LLILLJJLI != enumC687210QxT.getValue() && C687150QxN.LLILLJJLI != EnumC687210QxT.PAUSE.getValue() && C687150QxN.LLILLJJLI != enumC687210QxT2.getValue()) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
                    return unit2;
                }
                if (C687150QxN.LLILLJJLI == EnumC687210QxT.PAUSE.getValue()) {
                    C2180691AWd c2180691AWd = C687150QxN.LLILZ;
                    if (c2180691AWd != null) {
                        c2180691AWd.LIZLLL();
                    }
                    C2180691AWd c2180691AWd2 = C687150QxN.LLILLL;
                    if (c2180691AWd2 != null) {
                        c2180691AWd2.LIZLLL();
                    }
                } else if (C687150QxN.LLILLJJLI == enumC687210QxT.getValue()) {
                    C2180691AWd c2180691AWd3 = C687150QxN.LLILZ;
                    if (c2180691AWd3 != null) {
                        c2180691AWd3.LJ();
                    }
                    C2180691AWd c2180691AWd4 = C687150QxN.LLILLL;
                    if (c2180691AWd4 != null) {
                        c2180691AWd4.LJ();
                    }
                }
            } else {
                EnumC687210QxT enumC687210QxT3 = EnumC687210QxT.PAUSE;
                JSONObject jSONObject = null;
                String strOptString = null;
                if (i == enumC687210QxT3.getValue()) {
                    if (C687150QxN.LLILLJJLI != enumC687210QxT2.getValue()) {
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
                        return unit3;
                    }
                    C2180691AWd c2180691AWd5 = C687150QxN.LLILLL;
                    if (c2180691AWd5 != null) {
                        c2180691AWd5.LIZJ();
                    }
                    C2180691AWd c2180691AWd6 = C687150QxN.LLILZ;
                    if (c2180691AWd6 != null) {
                        c2180691AWd6.LIZJ();
                    }
                    JSONObject jSONObject2 = this.LLILLJJLI;
                    if (jSONObject2 != null) {
                        strOptString = jSONObject2.optString("pause_type");
                    }
                    if (!Intrinsics.LJFF(strOptString, EnumC687200QxS.BACK_PRESS.getValue()) && !Intrinsics.LJFF(strOptString, EnumC687200QxS.CLOSE.getValue())) {
                        C687170QxP.LIZJ(this.LLILLJJLI);
                    }
                } else if (i == EnumC687210QxT.STOP.getValue()) {
                    if (C687150QxN.LLILLJJLI != enumC687210QxT2.getValue() && C687150QxN.LLILLJJLI != enumC687210QxT3.getValue()) {
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
                        return unit4;
                    }
                    C687170QxP.LIZJ(this.LLILLJJLI);
                } else if (i == EnumC687210QxT.COMPLETE.getValue()) {
                    if (C687150QxN.LLILLJJLI != enumC687210QxT2.getValue() && C687150QxN.LLILLJJLI != enumC687210QxT3.getValue()) {
                        Unit unit5 = Unit.LIZ;
                        C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
                        return unit5;
                    }
                    JSONObject jSONObject3 = this.LLILLJJLI;
                    if (jSONObject3 != null && jSONObject3.optBoolean("is_success")) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("pause_type", EnumC687200QxS.FINISH_TASK.getValue());
                        C687170QxP.LIZJ(jSONObject4);
                    }
                    JSONObject jSONObject5 = this.LLILLJJLI;
                    if (jSONObject5 != null) {
                        jSONObject5.put("type", "end");
                        jSONObject = jSONObject5;
                    }
                    C687170QxP.LIZLLL(jSONObject);
                } else {
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
                    return unit6;
                }
            }
        }
        C687150QxN.LLILLJJLI = this.LL;
        CopyOnWriteArrayList<InterfaceC687260QxY> copyOnWriteArrayList = C687150QxN.LLIZ;
        if (copyOnWriteArrayList != null) {
            JSONObject jSONObject6 = this.LLILLJJLI;
            Iterator<InterfaceC687260QxY> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(C687150QxN.LLILLJJLI, jSONObject6);
            }
        }
        int i2 = C687150QxN.LLILLJJLI;
        EnumC687210QxT enumC687210QxT4 = EnumC687210QxT.STOP;
        if (i2 == enumC687210QxT4.getValue() || C687150QxN.LLILLJJLI == EnumC687210QxT.COMPLETE.getValue()) {
            C687150QxN c687150QxN = C687150QxN.LL;
            if (C687150QxN.LLILLJJLI == EnumC687210QxT.COMPLETE.getValue()) {
                z = true;
            } else {
                z = false;
            }
            if (C687150QxN.LLILLJJLI == enumC687210QxT4.getValue()) {
                z2 = true;
            }
            c687150QxN.LIZ(z, z2);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setState end: newState: ");
        sbLIZ2.append(this.LL);
        sbLIZ2.append(" oldState: ");
        sbLIZ2.append(C687150QxN.LLILLJJLI);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchCoinManager@697c.setState$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
