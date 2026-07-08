package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushLocalCompensationProcessor$observeToUpdateReshowTimeOnShow$1$onIMInnerPushShow$1", f = "IMInnerPushLocalCompensationProcessor.kt", l = {}, m = "invokeSuspend")
public final class C876360YZm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C879180YeK LL;
    public final /* synthetic */ EnumC876540Ya4 LLILLJJLI;
    public final /* synthetic */ Map<String, Integer> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C876390YZp LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876360YZm(C879180YeK c879180YeK, EnumC876540Ya4 enumC876540Ya4, Map<String, Integer> map, boolean z, C876390YZp c876390YZp, InterfaceC1364105Vn<? super C876360YZm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c879180YeK;
        this.LLILLJJLI = enumC876540Ya4;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = c876390YZp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876360YZm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String strLIZ;
        C1C7U.LIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeToUpdateReshowTimeOnShow$1$onIMInnerPushShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C876550Ya5> list = this.LL.LIZIZ;
        if (list != null) {
            EnumC876540Ya4 enumC876540Ya4 = this.LLILLJJLI;
            ArrayList<String> arrayList = new ArrayList();
            for (C876550Ya5 c876550Ya5 : list) {
                if (c876550Ya5.LIZIZ == enumC876540Ya4 && (strLIZ = c876550Ya5.LIZ()) != null) {
                    arrayList.add(strLIZ);
                }
            }
            Map<String, Integer> map = this.LLILLL;
            boolean z = this.LLILZ;
            EnumC876540Ya4 enumC876540Ya42 = this.LLILLJJLI;
            C876390YZp c876390YZp = this.LLILZIL;
            for (String str2 : arrayList) {
                Integer num = map.get(str2);
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (!z) {
                        int i = C876380YZo.LIZ[enumC876540Ya42.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                str = "show_as_message_request_aggregated_push_time";
                            } else {
                                continue;
                            }
                        } else {
                            str = "reshow_as_inner_push_time";
                        }
                        C0YNP.LJIIIIZZ(str2, str, String.valueOf(iIntValue + 1));
                    }
                    map.remove(str2);
                    if (map.isEmpty()) {
                        Object obj2 = ((LinkedHashMap) c876390YZp.LJFF).get(enumC876540Ya42);
                        if (obj2 != null) {
                            C0Z2O c0z2oLIZJ = c876390YZp.LIZ.LIZJ();
                            if (c0z2oLIZJ.LJ.contains(obj2)) {
                                c0z2oLIZJ.LJ.remove(obj2);
                            }
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeToUpdateReshowTimeOnShow$1$onIMInnerPushShow$1");
                        return unit;
                    }
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeToUpdateReshowTimeOnShow$1$onIMInnerPushShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
