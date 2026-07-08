package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.model.InternalShareExpHitResponse;
import com.ss.android.ugc.aweme.internalshare.impl.data.api.InternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitRequest$request$1", f = "InternalShareExpHitManager.kt", l = {118}, m = "invokeSuspend")
public final class C1472705pd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InternalShareExpHitRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1472705pd(InternalShareExpHitRequest internalShareExpHitRequest, InterfaceC1364105Vn<? super C1472705pd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = internalShareExpHitRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1472705pd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        C1C7U.LIZ("InternalShareExpHitRequest@799a.request$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IMContactApi.LIZ.getClass();
                List<IMUser> allFriends = C069P.LIZ().LJ().getAllFriends();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allFriends, 10));
                Iterator<IMUser> it2 = allFriends.iterator();
                while (it2.hasNext()) {
                    String uid = it2.next().getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    arrayList.add(uid);
                }
                CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
                if (collaborativeCollectionConfigLIZJ != null) {
                    i = collaborativeCollectionConfigLIZJ.abSize;
                } else {
                    i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }
                List listLL = C13LP.LL(arrayList, i);
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                if (((Boolean) C1171750gb7.LIZIZ.getValue()).booleanValue()) {
                    CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ2 = C1171750gb7.LIZJ();
                    if (collaborativeCollectionConfigLIZJ2 != null && collaborativeCollectionConfigLIZJ2.isFullyLaunch == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList2.add("collaborative_collection_config.is_enable");
                }
                if (arrayList2.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InternalShareExpHitRequest@799a.request$1");
                    return unit;
                }
                String strLJIILL = this.LLILLJJLI.LL.LJIILL(arrayList2);
                String string = listLL.toString();
                InternalShareApi.LIZ.getClass();
                InternalShareApi value = C1473705pn.LIZIZ.getValue();
                this.LL = 1;
                obj = value.checkExpHit(strLJIILL, string, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InternalShareExpHitRequest@799a.request$1");
                    return objLJFF;
                }
            }
            InternalShareExpHitResponse internalShareExpHitResponse = (InternalShareExpHitResponse) obj;
            internalShareExpHitResponse.checkValid();
            Map<String, String> map = internalShareExpHitResponse.hitInfo;
            C1277504zF.LIZIZ(map);
            if (map != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1472805pe(map, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InternalShareExpHitRequest@799a.request$1");
        return unit2;
    }
}
