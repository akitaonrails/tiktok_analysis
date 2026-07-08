package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.experiment.BigCardUIFixConfig;
import com.ss.android.ugc.aweme.relation.model.BigCardMusicUrlResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.BigCardMusicConfig$fetchMusicConfig$1", f = "TTRecommendBgmPlayerManager.kt", l = {92, 106, 109}, m = "invokeSuspend")
public final class C323660CmS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C323660CmS(InterfaceC1364105Vn<? super C323660CmS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323660CmS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BigCardMusicUrlResponse bigCardMusicUrlResponse;
        C1C7U.LIZ("BigCardMusicConfig@2c8.fetchMusicConfig$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C155000ia.LIZIZ(obj);
                        bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                    } else {
                        C155000ia.LIZIZ(obj);
                        bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                int i2 = C2187451AjH.LIZ;
                if (C19228210Ki.LIZJ()) {
                    C01GW c01gw = C19228210Ki.LIZIZ;
                    if (((BigCardUIFixConfig) c01gw.getValue()).bigCardBgmIdList.isEmpty()) {
                        AbstractC19484711Kz<BigCardMusicUrlResponse> abstractC19484711KzLIZIZ = C323680CmU.LIZIZ.LIZIZ(1);
                        this.LL = 1;
                        obj = C11UD.LIZIZ(abstractC19484711KzLIZIZ, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("BigCardMusicConfig@2c8.fetchMusicConfig$1");
                            return objLJFF;
                        }
                        bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                    } else {
                        int size = ((BigCardUIFixConfig) c01gw.getValue()).bigCardBgmIdList.size();
                        List<String> list = ((BigCardUIFixConfig) c01gw.getValue()).bigCardBgmIdList;
                        C323670CmT.LIZ.getClass();
                        int iIndexOf = (list.indexOf(C323670CmT.LIZ().getString("music_clip_id", "")) + 1) % size;
                        if (iIndexOf < 0) {
                            iIndexOf = 0;
                        }
                        int i3 = size - 1;
                        if (iIndexOf > i3) {
                            iIndexOf = i3;
                        }
                        String str = ((BigCardUIFixConfig) c01gw.getValue()).bigCardBgmIdList.get(iIndexOf);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("load big card BGM clip ID ");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C323670CmT.LIZ().storeString("music_clip_id", str);
                        AbstractC19484711Kz<BigCardMusicUrlResponse> abstractC19484711KzLIZ = C323680CmU.LIZIZ.LIZ(1, str);
                        this.LL = 2;
                        obj = C11UD.LIZIZ(abstractC19484711KzLIZ, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("BigCardMusicConfig@2c8.fetchMusicConfig$1");
                            return objLJFF;
                        }
                        bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                    }
                } else {
                    AbstractC19484711Kz<BigCardMusicUrlResponse> abstractC19484711KzLIZIZ2 = C323680CmU.LIZIZ.LIZIZ(1);
                    this.LL = 3;
                    obj = C11UD.LIZIZ(abstractC19484711KzLIZIZ2, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("BigCardMusicConfig@2c8.fetchMusicConfig$1");
                        return objLJFF;
                    }
                    bigCardMusicUrlResponse = (BigCardMusicUrlResponse) obj;
                }
            }
            if (bigCardMusicUrlResponse.status_code == 0) {
                C0CVA.LIZ = bigCardMusicUrlResponse.getMediaPlayInfo().getMediaPlayUrl();
                C0CVA.LIZIZ = bigCardMusicUrlResponse.getMediaPlayInfo().getMediaExpireTime();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(e);
            C0CVA.LIZ = "";
            C0CVA.LIZIZ = 0L;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BigCardMusicConfig@2c8.fetchMusicConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C323660CmS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
