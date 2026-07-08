package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129650fVD {
    public static final /* synthetic */ int LJ = 0;
    public final Set<Integer> LIZ = C13LQ.LJLIIL(new Integer[]{2, 101, 27});
    public final ConcurrentHashMap<Long, C11NJ> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Boolean> LIZJ = new ConcurrentHashMap<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(232));

    public final void LIZ(long j) {
        this.LIZJ.remove(Long.valueOf(j));
        C11NJ c11njRemove = this.LIZIZ.remove(Long.valueOf(j));
        if (c11njRemove != null) {
            boolean z = true;
            int size = this.LIZIZ.size() + 1;
            int iLJI = c11njRemove.LJI();
            c11njRemove.dispose();
            if (iLJI <= 0) {
                z = false;
            }
            C1131270fXp.LJFF(size, iLJI, z);
            LIZIZ(j, Integer.valueOf(iLJI), Integer.valueOf(size), "GiftListCancel", "cancel");
        }
    }

    public final C11NZ LIZLLL(BaseResponse baseResponse) {
        if (baseResponse != null && baseResponse.data != 0) {
            R r = baseResponse.extra;
            if (r != 0) {
                C1129310fUf c1129310fUf = C1129310fUf.LIZ;
                String str = ((GiftListExtra) r).logId;
                c1129310fUf.getClass();
                C1129310fUf.LIZJ = str;
            }
            return C11NZ.LJJJJZ(new C0WIY(baseResponse.data, GsonProtectorUtils.toJson((Gson) this.LIZLLL.getValue(), baseResponse.data)));
        }
        return C11NZ.LJJIJLIJ(new C501520Jle(2, new Throwable("Response is empty")));
    }

    public static void LJ(long j, String str, InterfaceC211900rl interfaceC211900rl, int i) {
        C480460Ism.LIZ().getClass();
        ((GiftRetrofitApi) C480460Ism.LIZIZ(GiftRetrofitApi.class)).saveFavoriteGift(j, str, i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(interfaceC211900rl, 248), new C516201zk(interfaceC211900rl, 249));
    }

    public final void LIZIZ(long j, Integer num, Integer num2, String str, String str2) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" roomId=");
        sbLIZ.append(j);
        sbLIZ.append(" disposableSize=");
        if (num == null) {
            C11NJ c11nj = this.LIZIZ.get(Long.valueOf(j));
            if (c11nj != null) {
                num = Integer.valueOf(c11nj.LJI());
            } else {
                num = null;
            }
        }
        sbLIZ.append(num);
        sbLIZ.append(" mapSize=");
        if (num2 != null) {
            size = num2.intValue();
        } else {
            size = this.LIZIZ.size();
        }
        sbLIZ.append(size);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final int r46, final long r47, final boolean r49, final X.AbstractC1132980faa r50, final java.lang.String r51) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1129650fVD.LJFF(int, long, boolean, X.0faa, java.lang.String):void");
    }
}
