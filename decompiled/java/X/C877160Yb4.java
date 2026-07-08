package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.impl.convkv.IMBusinessConvKvService$batchUpdateRelationKvsAsync$1", f = "IMBusinessConvKvService.kt", l = {84}, m = "invokeSuspend")
public final class C877160Yb4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, Pair<C0Y8T, IMUser>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C877160Yb4(Map<String, ? extends Pair<C0Y8T, ? extends IMUser>> map, InterfaceC1364105Vn<? super C877160Yb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877160Yb4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC877200Yb8 interfaceC877200Yb8LJIJI;
        Boolean boolLIZ;
        String str;
        C1C7U.LIZ("IMBusinessConvKvService@6963.batchUpdateRelationKvsAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Pair<C0Y8T, IMUser>> entry : this.LLILLJJLI.entrySet()) {
                String key = entry.getKey();
                Pair<C0Y8T, IMUser> value = entry.getValue();
                if (key.length() != 0) {
                    for (EnumC877180Yb6 enumC877180Yb6 : EnumC877180Yb6.getEntries()) {
                        C877170Yb5 c877170Yb5 = C877170Yb5.LIZ;
                        C0Y8T first = value.getFirst();
                        IMUser second = value.getSecond();
                        c877170Yb5.getClass();
                        if (C877190Yb7.LIZ[enumC877180Yb6.ordinal()] == 1) {
                            IIMBusinessChatService.LIZ.getClass();
                            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                            if (iIMBusinessChatService != null && (interfaceC877200Yb8LJIJI = iIMBusinessChatService.LJIJI()) != null && (boolLIZ = interfaceC877200Yb8LJIJI.LIZ(first, second)) != null) {
                                if (boolLIZ.booleanValue()) {
                                    str = "1";
                                } else {
                                    str = CardStruct.IStatusCode.DEFAULT;
                                }
                                Object linkedHashMap2 = linkedHashMap.get(key);
                                if (linkedHashMap2 == null) {
                                    linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap.put(key, linkedHashMap2);
                                }
                                ((Map) linkedHashMap2).put(enumC877180Yb6.getKvKey(), new C865830Xxt(str));
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMBusinessConvKvService@6963.batchUpdateRelationKvsAsync$1");
                return unit;
            }
            C877170Yb5.LIZ.getClass();
            InterfaceC865850Xxv interfaceC865850XxvLIZJ = C877170Yb5.LIZJ();
            if (interfaceC865850XxvLIZJ != null) {
                this.LL = 1;
                if (interfaceC865850XxvLIZJ.LIZ(linkedHashMap, this) == objLJFF) {
                    C1C7U.LIZIZ("IMBusinessConvKvService@6963.batchUpdateRelationKvsAsync$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessConvKvService@6963.batchUpdateRelationKvsAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
