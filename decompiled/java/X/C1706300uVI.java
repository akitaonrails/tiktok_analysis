package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0uVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706300uVI implements InterfaceC1706450uVX {
    public final C1705360uTm LIZ = C1706360uVO.LIZ().LIZ();

    @Override // X.InterfaceC1706450uVX
    public final void LIZ(boolean z, final C1706350uVN c1706350uVN) {
        Object objLIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMainScriptRes, forceUpdate: ");
        sbLIZ.append(z);
        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        this.LIZ.getClass();
        C1569570qwl c1569570qwlLIZ = C1706510uVd.LIZ();
        if (c1569570qwlLIZ != null) {
            objLIZ = c1569570qwlLIZ.LIZ(InterfaceC1706480uVa.class);
        } else {
            objLIZ = null;
        }
        InterfaceC1706480uVa interfaceC1706480uVa = (InterfaceC1706480uVa) objLIZ;
        if (interfaceC1706480uVa != null) {
            interfaceC1706480uVa.isOpen();
        }
        this.LIZ.getClass();
        c1706130uV1LJIIIZ.LIZIZ("effecttooldefault", "main_script");
        C1706380uVQ.LIZ().LJIIIZ("effecttooldefault", "main_script", z, new C1705850uUZ(), new InterfaceC1705380uTo<Effect>() { // from class: X.0uVK
            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("categoryFetch onFail, code ");
                sbLIZ2.append(num);
                sbLIZ2.append(", msg ");
                sbLIZ2.append(str);
                C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ2));
                c1706350uVN.LIZ(num, str);
            }

            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(Effect effect, boolean z2) {
                Effect effect2 = effect;
                c1706350uVN.LIZIZ = Boolean.valueOf(z2);
                if (effect2 == null) {
                    C1706630uVp.LJFF("MainResImpl", "onFail, empty effect");
                    c1706350uVN.LIZ(-1, "");
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("categoryFetch onSuccess, cost: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1705430uTt interfaceC1705430uTtLIZ = C1706380uVQ.LIZ();
                final C1706350uVN c1706350uVN2 = c1706350uVN;
                final long j = jCurrentTimeMillis;
                interfaceC1705430uTtLIZ.LJIJI(effect2, new InterfaceC1705380uTo<Effect>() { // from class: X.0uVM
                    @Override // X.InterfaceC1705380uTo
                    public final void LIZ(Integer num, String str) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMainScriptRes download onFail, code ");
                        sbLIZ3.append(num);
                        sbLIZ3.append(", msg ");
                        sbLIZ3.append(str);
                        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        c1706350uVN2.LIZ(num, str);
                    }

                    @Override // X.InterfaceC1705380uTo
                    public final void LIZIZ(Effect effect3, boolean z3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMainScriptRes download onSuccess, total cost: ");
                        sbLIZ3.append(System.currentTimeMillis() - j);
                        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        c1706350uVN2.LIZIZ(effect3, z3);
                    }
                });
            }
        }, 0, 0, 0, CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC1706450uVX
    public final void LIZIZ(boolean z, final C1706350uVN c1706350uVN) {
        Object objLIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMainDraftRes, forceUpdate: ");
        sbLIZ.append(z);
        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        this.LIZ.getClass();
        C1569570qwl c1569570qwlLIZ = C1706510uVd.LIZ();
        if (c1569570qwlLIZ != null) {
            objLIZ = c1569570qwlLIZ.LIZ(InterfaceC1706480uVa.class);
        } else {
            objLIZ = null;
        }
        InterfaceC1706480uVa interfaceC1706480uVa = (InterfaceC1706480uVa) objLIZ;
        if (interfaceC1706480uVa != null) {
            interfaceC1706480uVa.isOpen();
        }
        this.LIZ.getClass();
        c1706130uV1LJIIIZ.LIZIZ("effecttooldefault", "main_draft_auto");
        C1706380uVQ.LIZ().LJIIIZ("effecttooldefault", "main_draft_auto", z, new C1705850uUZ(), new InterfaceC1705380uTo<Effect>() { // from class: X.0uVJ
            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFail, code ");
                sbLIZ2.append(num);
                sbLIZ2.append(", msg ");
                sbLIZ2.append(str);
                C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ2));
                c1706350uVN.LIZ(num, str);
            }

            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(Effect effect, boolean z2) {
                Effect effect2 = effect;
                c1706350uVN.LIZIZ = Boolean.valueOf(z2);
                if (effect2 == null) {
                    C1706630uVp.LJFF("MainResImpl", "onFail, empty effect");
                    c1706350uVN.LIZ(-1, "");
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onSuccess, cost: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1705430uTt interfaceC1705430uTtLIZ = C1706380uVQ.LIZ();
                final C1706350uVN c1706350uVN2 = c1706350uVN;
                final long j = jCurrentTimeMillis;
                interfaceC1705430uTtLIZ.LJIJI(effect2, new InterfaceC1705380uTo<Effect>() { // from class: X.0uVL
                    @Override // X.InterfaceC1705380uTo
                    public final void LIZ(Integer num, String str) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMainDraftRes download onFail, code ");
                        sbLIZ3.append(num);
                        sbLIZ3.append(", msg ");
                        sbLIZ3.append(str);
                        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        c1706350uVN2.LIZ(num, str);
                    }

                    @Override // X.InterfaceC1705380uTo
                    public final void LIZIZ(Effect effect3, boolean z3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMainDraftRes download onSuccess, cost: ");
                        sbLIZ3.append(System.currentTimeMillis() - j);
                        C1706630uVp.LJFF("MainResImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        c1706350uVN2.LIZIZ(effect3, z3);
                    }
                });
            }
        }, 0, 0, 0, CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC1706450uVX
    public final void LIZJ(InterfaceC1705380uTo interfaceC1705380uTo, String str) {
        C1706380uVQ.LIZ().LJI(interfaceC1705380uTo, str);
    }
}
