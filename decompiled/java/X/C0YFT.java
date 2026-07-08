package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: renamed from: X.0YFT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YFT implements C0YDH {
    public final Function0<InterfaceC869500Y9c> LL;
    public final Function0<int[]> LLILLJJLI;
    public final Function2<Integer, Boolean, Pair<Integer, Integer>> LLILLL;
    public final Function0<Long> LLILZ;

    @Override // X.C0YDH
    public final Map<String, Object> LLLFFI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int[] iArrInvoke = this.LLILLJJLI.invoke();
        String strLIZ = LIZ(iArrInvoke, new AwS593S0100000_14(this, 337));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" }");
        linkedHashMap.put("user_chain_cursor", C2188811AlT.LIZIZ(sbLIZ));
        String strLIZ2 = LIZ(iArrInvoke, new AwS593S0100000_14(this, 334));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{ ");
        sbLIZ2.append(strLIZ2);
        sbLIZ2.append(" }");
        linkedHashMap.put("last_init_by_user", C2188811AlT.LIZIZ(sbLIZ2));
        String strLIZ3 = LIZ(iArrInvoke, new AwS593S0100000_14(this, 336));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("{ ");
        sbLIZ3.append(strLIZ3);
        sbLIZ3.append(" }");
        linkedHashMap.put("last_get_msg_by_user", C2188811AlT.LIZIZ(sbLIZ3));
        String strLIZ4 = LIZ(iArrInvoke, new AwS593S0100000_14(this, 335));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("{ ");
        sbLIZ4.append(strLIZ4);
        sbLIZ4.append(" }");
        linkedHashMap.put("last_new_msg_notify", C2188811AlT.LIZIZ(sbLIZ4));
        Function2<Integer, Boolean, Pair<Integer, Integer>> function2 = this.LLILLL;
        Boolean bool = Boolean.FALSE;
        Pair<Integer, Integer> pairInvoke = function2.invoke(0, bool);
        Pair<Integer, Integer> pairInvoke2 = this.LLILLL.invoke(1, bool);
        long jLongValue = this.LLILZ.invoke().longValue();
        int iIntValue = pairInvoke.getFirst().intValue();
        int iIntValue2 = pairInvoke.getSecond().intValue();
        int iIntValue3 = pairInvoke2.getFirst().intValue();
        int iIntValue4 = pairInvoke2.getSecond().intValue();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("{ total_count:");
        sbLIZ5.append(jLongValue);
        sbLIZ5.append(", stranger_count:");
        sbLIZ5.append((jLongValue - ((long) iIntValue)) - ((long) iIntValue3));
        sbLIZ5.append(", private_count:");
        sbLIZ5.append(iIntValue);
        sbLIZ5.append(", local_private_count:");
        sbLIZ5.append(iIntValue2);
        sbLIZ5.append(", group_count:");
        sbLIZ5.append(iIntValue3);
        sbLIZ5.append(", local_group_count:");
        sbLIZ5.append(iIntValue4);
        sbLIZ5.append(" }");
        linkedHashMap.put("conversation_in_db", C2188811AlT.LIZIZ(sbLIZ5));
        return linkedHashMap;
    }

    public C0YFT(C0YEM c0yem) {
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c0yem, 1604);
        AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(c0yem, 1605);
        AwS628S0100000_14 awS628S0100000_14 = new AwS628S0100000_14(c0yem, 76);
        AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14(c0yem, 1606);
        this.LL = awS558S0100000_14;
        this.LLILLJJLI = awS558S0100000_142;
        this.LLILLL = awS628S0100000_14;
        this.LLILZ = awS558S0100000_143;
    }

    public static String LIZ(int[] iArr, Function1 function1) {
        return C13LQ.LJJIL(iArr, ", ", new C5183020f(function1, (Function1<? super Long, Object>) 314), 30);
    }
}
