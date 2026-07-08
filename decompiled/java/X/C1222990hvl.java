package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel$refreshMutualRelationList$1", f = "MutualRelationViewModel.kt", l = {64}, m = "invokeSuspend")
public final class C1222990hvl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MutualRelationViewModel LLILLJJLI;
    public final /* synthetic */ ArrayList<String> LLILLL;
    public final /* synthetic */ ArrayList<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222990hvl(MutualRelationViewModel mutualRelationViewModel, ArrayList<String> arrayList, ArrayList<String> arrayList2, InterfaceC1364105Vn<? super C1222990hvl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mutualRelationViewModel;
        this.LLILLL = arrayList;
        this.LLILZ = arrayList2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1222990hvl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("MutualRelationViewModel@5db5.refreshMutualRelationList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(298));
                AbstractC19484711Kz<MutualRelationListResponse> abstractC19484711KzLIZ = C1243980iTc.LIZIZ.LIZ(1, C13LP.LJJLIIIJ(this.LLILLL, ",", "", "", 0, null, null, 56), C13LP.LJJLIIIJ(this.LLILZ, ",", "", "", 0, null, null, 56), null, null, "", "", "", "");
                this.LL = 1;
                objLIZIZ = C11UD.LIZIZ(abstractC19484711KzLIZ, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("MutualRelationViewModel@5db5.refreshMutualRelationList$1");
                    return objLJFF;
                }
            }
            MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) objLIZIZ;
            mutualRelationListResponse.checkValid();
            List<User> userList = mutualRelationListResponse.getUserList();
            ArrayList arrayList = new ArrayList();
            for (User user : userList) {
                if (!user.isBlock()) {
                    arrayList.add(user);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    User user2 = (User) obj2;
                    C1243240iSQ.LIZ.getClass();
                    arrayList2.add(new C1164490gPP(i2, user2, C1243240iSQ.LIZ(user2, true)));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (mutualRelationListResponse.getUserList().isEmpty()) {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(299));
            } else {
                this.LLILLJJLI.setState(new AwS598S0100000_19(arrayList2, (List<? extends ProfileComponents>) 230));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutualRelationViewModel@5db5.refreshMutualRelationList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
