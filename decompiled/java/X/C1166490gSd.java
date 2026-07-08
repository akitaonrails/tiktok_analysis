package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166490gSd implements C0POE<ShopChunkResponse> {
    public final Map<String, Object> LIZ;
    public final boolean LIZIZ;
    public C0POE<ShopChunkResponse> LIZLLL;
    public int LJI;
    public final CopyOnWriteArrayList<ShopChunkResponse> LIZJ = new CopyOnWriteArrayList<>();
    public final long LJ = System.currentTimeMillis();
    public volatile AtomicBoolean LJFF = new AtomicBoolean(false);

    @Override // X.C0POE
    public final void onComplete() {
        this.LJFF.set(true);
        C0POE<ShopChunkResponse> c0poe = this.LIZLLL;
        if (c0poe != null) {
            c0poe.onComplete();
        }
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", 100), new Pair("is_retry", Boolean.valueOf(this.LIZIZ))));
        this.LJI = 0;
    }

    public final void LIZ(C1166360gSQ c1166360gSQ) {
        this.LIZLLL = c1166360gSQ;
        Iterator<ShopChunkResponse> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            c1166360gSQ.onNext(it2.next());
        }
        if (this.LJFF.get()) {
            c1166360gSQ.onComplete();
        }
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        this.LJFF.set(true);
        C0POE<ShopChunkResponse> c0poe = this.LIZLLL;
        if (c0poe != null) {
            c0poe.onFailed(th);
        }
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", -99), new Pair("is_retry", Boolean.valueOf(this.LIZIZ))));
        this.LJI = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0POE
    public final void onNext(ShopChunkResponse shopChunkResponse) {
        boolean z;
        int iIntValue;
        int i;
        ShopChunkData shopChunkData;
        Integer num;
        ShopChunkResponse shopChunkResponse2 = shopChunkResponse;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (shopChunkResponse2 != null && shopChunkResponse2.isCodeOK()) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[6];
        if (shopChunkResponse2 != null && (shopChunkData = (ShopChunkData) shopChunkResponse2.data) != null && (num = shopChunkData.chunkType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        pairArr[0] = new Pair("tab_id", Integer.valueOf(iIntValue));
        pairArr[1] = new Pair("data_init", Boolean.valueOf(z));
        pairArr[2] = new Pair("is_retry", Boolean.valueOf(this.LIZIZ));
        pairArr[3] = new Pair("cost", Long.valueOf(jCurrentTimeMillis - this.LJ));
        if (shopChunkResponse2 != null) {
            i = shopChunkResponse2.code;
        } else {
            i = -9999;
        }
        pairArr[4] = new Pair("code", Integer.valueOf(i));
        int i2 = this.LJI;
        this.LJI = i2 + 1;
        pairArr[5] = new Pair("index", Integer.valueOf(i2));
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr));
        if (shopChunkResponse2 != null) {
            n nVar = new n();
            nVar.LJJIII(Long.valueOf(this.LJ), "request_api_start");
            nVar.LJJIII(Long.valueOf(jCurrentTimeMillis), "receive_api_res");
            nVar.LJJIII(Long.valueOf(jCurrentTimeMillis - this.LJ), "api_duration");
            shopChunkResponse2.timingInfo = nVar;
            C0POE<ShopChunkResponse> c0poe = this.LIZLLL;
            if (c0poe != null) {
                c0poe.onNext(shopChunkResponse2);
            } else {
                this.LIZJ.add(shopChunkResponse2);
            }
        }
    }

    public C1166490gSd(Map<String, Object> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }
}
