package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$recordRelation$1", f = "ReflowSideProcessor.kt", l = {211}, m = "invokeSuspend")
public final class C1233540iCm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<C189200o6<User>> LLILLJJLI;
    public final /* synthetic */ C1233510iCj LLILLL;
    public final /* synthetic */ C1234160iDm LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1233540iCm(AnonymousClass0957<? extends C189200o6<? extends User>> anonymousClass0957, C1233510iCj c1233510iCj, C1234160iDm c1234160iDm, InterfaceC1364105Vn<? super C1233540iCm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1233510iCj;
        this.LLILZ = c1234160iDm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233540iCm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ILiveOuterService iLiveOuterService;
        InterfaceC1233550iCn interfaceC1233550iCnB5;
        ILiveOuterService iLiveOuterService2;
        InterfaceC1233550iCn interfaceC1233550iCnB52;
        C1C7U.LIZ("ReflowSideProcessor@9181.recordRelation$1");
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
            AnonymousClass0957<C189200o6<User>> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReflowSideProcessor@9181.recordRelation$1");
                return objLJFF;
            }
        }
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        C1233510iCj c1233510iCj = this.LLILLL;
        C1234160iDm c1234160iDm = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            User user = (User) objM10unboximpl;
            if (C1234220iDs.LJ(c1233510iCj.LJ) && c1234160iDm.LJFF() && (iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC1233550iCnB52 = iLiveOuterService2.B5()) != null) {
                ((C1378280lyE) interfaceC1233550iCnB52).LIZIZ(user, CastLongProtector.parseLong(user.getUid()));
            }
            c1234160iDm.LIZJ.setValue(new C612550O0v(c1233510iCj, new C1623606Xi(user)));
            c1234160iDm.LIZIZ.put(c1233510iCj, new C1623606Xi(user));
            C1233600iCs.LIZ.put(Integer.valueOf(user.hashCode()), c1233510iCj);
            String uid = user.getUid();
            if (uid != null && uid.length() != 0) {
                C1233600iCs.LIZIZ.put(user.getUid(), c1233510iCj);
            }
            C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LIZLLL();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post sharer: ");
            sbLIZ.append(C0DR9.LIZLLL(user));
            sbLIZ.append(" from request");
            C1720106oR.LJI("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("request:");
            sbLIZ2.append(c1233510iCj);
            sbLIZ2.append(", resp: ");
            sbLIZ2.append(C0DR9.LIZLLL(user));
            C1720106oR.LJI("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1233510iCj c1233510iCj2 = this.LLILLL;
        C1234160iDm c1234160iDm2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl != null) {
            if (C1234220iDs.LJ(c1233510iCj2.LJ) && c1234160iDm2.LJFF() && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC1233550iCnB5 = iLiveOuterService.B5()) != null) {
                ((C1378280lyE) interfaceC1233550iCnB5).LIZIZ(new User(), CastLongProtector.parseLong(c1233510iCj2.LIZIZ));
            }
            c1234160iDm2.LIZJ.setValue(new C612550O0v(c1233510iCj2, new C491001vg(thM5exceptionOrNullimpl)));
            c1234160iDm2.LIZIZ.put(c1233510iCj2, new C491001vg(thM5exceptionOrNullimpl));
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("request:");
            sbLIZ3.append(c1233510iCj2);
            sbLIZ3.append(" fail! message: ");
            sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
            C1720106oR.LIZ("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ3));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReflowSideProcessor@9181.recordRelation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
