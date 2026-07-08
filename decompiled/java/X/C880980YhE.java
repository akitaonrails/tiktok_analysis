package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestIntelligentMgr$preDownLoad$1", f = "MessageRequestIntelligentMgr.kt", l = {}, m = "invokeSuspend")
public final class C880980YhE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C880980YhE(InterfaceC1364105Vn<? super C880980YhE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C880980YhE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestIntelligentMgr@7328.preDownLoad$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C885630Yoj.LIZ(false)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestIntelligentMgr@7328.preDownLoad$1");
            return unit;
        }
        C881270Yhh c881270Yhh = C881270Yhh.LIZ;
        c881270Yhh.getClass();
        AnonymousClass1455.LIZ.LIZLLL("PitayaInitTask", null, null);
        EnumC881060YhM enumC881060YhM = EnumC881060YhM.PRE_DOWNLOAD;
        C880830Ygz.LIZLLL(enumC881060YhM);
        C0Z0Y c0z0yLIZ = c881270Yhh.LIZ();
        if (c0z0yLIZ == null) {
            C880830Ygz.LIZ(enumC881060YhM, false, "null inst");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestIntelligentMgr@7328.preDownLoad$1");
            return unit2;
        }
        c0z0yLIZ.LJFF(new InterfaceC882520Yji() { // from class: X.0YhO
            @Override // X.InterfaceC882520Yji
            public final void LIZIZ(Map<String, ? extends Object> map) {
            }

            @Override // X.InterfaceC882520Yji
            public final void LIZ(C892820Z0u c892820Z0u) {
                C880830Ygz.LIZ(EnumC881060YhM.PRE_DOWNLOAD, false, c892820Z0u.getMessage());
            }

            @Override // X.InterfaceC882520Yji
            public final void onSuccess(Object obj2) {
                C880830Ygz.LIZ(EnumC881060YhM.PRE_DOWNLOAD, true, null);
            }
        });
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestIntelligentMgr@7328.preDownLoad$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C880980YhE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
