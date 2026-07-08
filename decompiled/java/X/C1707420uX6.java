package X;

import Y.ARunnableS16S0500000_26;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.postpayment.impl.PipoPostPaymentGuideFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707420uX6 {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC1712820ufo LIZ(String str) {
        if (Intrinsics.LJFF(str, "VISA_PAYMENT_SIGNAL")) {
            return new InterfaceC1712820ufo() { // from class: X.0uX5
                @Override // X.InterfaceC1712820ufo
                public final void LIZ(InterfaceC1702850uPj interfaceC1702850uPj) {
                }

                @Override // X.InterfaceC1712820ufo
                public final void LIZIZ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1702820uPg(c1707390uX3, pipoPostPaymentGuideFragment, null), 2);
                }

                @Override // X.InterfaceC1712820ufo
                public final void LIZJ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) {
                    pipoPostPaymentGuideFragment.SR();
                    pipoPostPaymentGuideFragment.Sb(true);
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1702830uPh(c1707390uX3, pipoPostPaymentGuideFragment, null), 2);
                }

                @Override // X.InterfaceC1712820ufo
                public final C1707390uX3 LIZLLL(String str2, String str3) {
                    JSONObject jSONObjectLIZ = C1706720uVy.LIZ(str3);
                    String strOptString = jSONObjectLIZ.optString("after_payment_title");
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(jSONObjectLIZ.optString("after_payment_instruction"), new String[]{"#"}, 0, 6);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((String) obj).length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C1153040g6w((String) it3.next(), null));
                    }
                    String strOptString2 = jSONObjectLIZ.optString("after_payment_enable_btn");
                    String strOptString3 = jSONObjectLIZ.optString("after_payment_skip_btn");
                    String strOptString4 = jSONObjectLIZ.optString("after_payment_success_toast");
                    String strOptString5 = jSONObjectLIZ.optString("after_payment_fail_toast");
                    String strOptString6 = jSONObjectLIZ.optString("after_payment_host");
                    if (!(!a0.LJJJIL(strOptString6))) {
                        strOptString6 = null;
                    }
                    String strOptString7 = jSONObjectLIZ.optString("after_payment_token");
                    if (!(!a0.LJJJIL(strOptString7))) {
                        strOptString7 = null;
                    }
                    String strOptString8 = jSONObjectLIZ.optString("after_payment_merchant_id");
                    if (!(!a0.LJJJIL(strOptString8))) {
                        strOptString8 = null;
                    }
                    String strOptString9 = jSONObjectLIZ.optString("after_payment_merchant_user_id");
                    if (!(!a0.LJJJIL(strOptString9))) {
                        strOptString9 = null;
                    }
                    return new C1707390uX3(str2, strOptString, "", arrayList3, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9, C1706720uVy.LIZ);
                }
            };
        }
        if (Intrinsics.LJFF(str, "AFTER_PAYMENT_BIND_RETAIN")) {
            final int i = 0;
            return new InterfaceC1712820ufo(i) { // from class: X.0uX7
                public final C1707440uX8 LIZ = new C1707440uX8();

                @Override // X.InterfaceC1712820ufo
                public final void LIZ(InterfaceC1702850uPj interfaceC1702850uPj) {
                    if (interfaceC1702850uPj.xj() == null) {
                        interfaceC1702850uPj.Ur("missing_post_payment_context", false);
                    }
                }

                @Override // X.InterfaceC1712820ufo
                public final void LIZIZ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) {
                    if (!pipoPostPaymentGuideFragment.Ur("user_skip", true)) {
                        return;
                    }
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1702810uPf(c1707390uX3, pipoPostPaymentGuideFragment, null), 2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [T, Y.ARunnableS16S0500000_26, java.lang.Runnable] */
                /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0qPP, X.0uX9, java.lang.Object] */
                @Override // X.InterfaceC1712820ufo
                public final void LIZJ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) throws JSONException {
                    C1211110hcb c1211110hcb = pipoPostPaymentGuideFragment.LLILLL;
                    if (c1211110hcb == null) {
                        pipoPostPaymentGuideFragment.Ur("missing_post_payment_context", false);
                        return;
                    }
                    pipoPostPaymentGuideFragment.SR();
                    pipoPostPaymentGuideFragment.Sb(true);
                    C1707440uX8 c1707440uX8 = this.LIZ;
                    final AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(pipoPostPaymentGuideFragment, c1707390uX3, 174);
                    c1707440uX8.getClass();
                    final String str2 = c1211110hcb.actionSessionId;
                    if ((!a0.LJJJIL(str2)) && str2 != null) {
                        final C1548870qPN c1548870qPN = new C1548870qPN();
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        final C259800zU c259800zU = new C259800zU();
                        final C259800zU c259800zU2 = new C259800zU();
                        ?? r4 = new InterfaceC1548890qPP() { // from class: X.0uX9
                            @Override // X.InterfaceC1548890qPP
                            public final void onEvent(String str3, String str4) {
                                Object c098200Yq;
                                try {
                                    c098200Yq = new JSONObject(str4);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                JSONObject jSONObject = (JSONObject) c098200Yq;
                                if (jSONObject == null || !Intrinsics.LJFF(jSONObject.optString("action_session_id"), str2) || !Intrinsics.LJFF(jSONObject.optString("action_type"), "AFTER_PAYMENT_BIND_RETAIN")) {
                                    return;
                                }
                                String strOptString = jSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
                                    strOptString = "completed";
                                }
                                C1707440uX8.LIZ(atomicBoolean, c259800zU2, c259800zU, awS392S0200000_26, c1548870qPN, jSONObject.optBoolean("result", false), strOptString);
                            }
                        };
                        c259800zU.element = r4;
                        C1707440uX8.LIZIZ.add((InterfaceC1548890qPP) r4);
                        c1548870qPN.LJFF("pipo_post_payment_bind_retain_result", r4);
                        ?? aRunnableS16S0500000_26 = new ARunnableS16S0500000_26(atomicBoolean, c259800zU2, c259800zU, awS392S0200000_26, c1548870qPN, 3);
                        c259800zU2.element = aRunnableS16S0500000_26;
                        C786410Ut5.LJLIIL(30000L, C1707440uX8.LIZ, aRunnableS16S0500000_26);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("action_session_id", str2);
                        jSONObject.put("action_type", "AFTER_PAYMENT_BIND_RETAIN");
                        jSONObject.put("result", true);
                        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "requested");
                        c1548870qPN.LJ("pipo_post_payment_bind_retain_request", C786410Ut5.J3(jSONObject));
                        return;
                    }
                    awS392S0200000_26.invoke(new C1265004xE(false, "missing_action_session_id"));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
                /* JADX WARN: Type inference failed for: r14v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r14v3, types: [X.13BV] */
                @Override // X.InterfaceC1712820ufo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C1707390uX3 LIZLLL(java.lang.String r25, java.lang.String r26) {
                    /*
                        Method dump skipped, instruction units count: 340
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1707430uX7.LIZLLL(java.lang.String, java.lang.String):X.0uX3");
                }
            };
        }
        return new InterfaceC1712820ufo() { // from class: X.0uX4
            @Override // X.InterfaceC1712820ufo
            public final void LIZ(InterfaceC1702850uPj interfaceC1702850uPj) {
            }

            @Override // X.InterfaceC1712820ufo
            public final void LIZIZ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) {
                pipoPostPaymentGuideFragment.Ur("unsupported_action", false);
            }

            @Override // X.InterfaceC1712820ufo
            public final void LIZJ(PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment, C1707390uX3 c1707390uX3) {
                pipoPostPaymentGuideFragment.Ur("unsupported_action", false);
            }

            @Override // X.InterfaceC1712820ufo
            public final C1707390uX3 LIZLLL(String str2, String str3) {
                return new C1707390uX3(str2, "", "", C13BV.INSTANCE, "", "", "", "", null, null, null, null, C1706720uVy.LIZ);
            }
        };
    }
}
