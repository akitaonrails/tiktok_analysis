package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Npc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605900Npc extends AbstractC605970Npj<BulletinAccountInfoResponse> {
    public final long LJFF;
    public final Function1<BulletinAccountInfoResponse, Unit> LJI;
    public final C01GW LJII;
    public final C605460Nou LJIIIIZZ;
    public final BulletinPeriodicRequestConfig LJIIIZ;
    public final Map<String, String> LJIIJ;

    @Override // X.AbstractC605970Npj
    public final String LJI() {
        return "BulletinAccountInfoPeriodicRequestHandler";
    }

    @Override // X.AbstractC605970Npj
    public final Function1<BulletinAccountInfoResponse, Unit> LIZJ() {
        return this.LJI;
    }

    @Override // X.AbstractC605970Npj
    public final Map<String, String> LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC605970Npj
    public final BulletinPeriodicRequestConfig LJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC605970Npj
    public final Function1<InterfaceC1364105Vn<? super BulletinAccountInfoResponse>, Object> LJFF() {
        return this.LJIIIIZZ;
    }

    public C605900Npc(long j, C605990Npl c605990Npl, LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(lifecycleCoroutineScope);
        this.LJFF = j;
        this.LJI = c605990Npl;
        this.LJII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(607));
        this.LJIIIIZZ = new C605460Nou(this);
        BulletinPeriodicRequestConfig bulletinPeriodicRequestConfig = C605920Npe.LIZ;
        this.LJIIIZ = bulletinPeriodicRequestConfig;
        this.LJIIJ = C2097608Jq.LJIIJ(new Pair("trigger_type", "create_channel"), new Pair("poll_interval", String.valueOf(bulletinPeriodicRequestConfig.syncInterval)), new Pair("poll_total_time", String.valueOf(bulletinPeriodicRequestConfig.syncTotalTime)), new Pair("channel_id", String.valueOf(j)));
    }
}
