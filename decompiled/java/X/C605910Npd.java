package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestConfig;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Npd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605910Npd extends AbstractC605970Npj<BulletinListResponse> {
    public final String LJFF;
    public final C0OJU LJI;
    public final C605720NpK LJII;
    public final C605940Npg LJIIIIZZ;
    public final BulletinPeriodicRequestConfig LJIIIZ;
    public final Map<String, String> LJIIJ;

    @Override // X.AbstractC605970Npj
    public final String LJI() {
        return "BulletinItemListPeriodicRequestHandler";
    }

    @Override // X.AbstractC605970Npj
    public final Function1<BulletinListResponse, Unit> LIZJ() {
        return this.LJIIIIZZ;
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
    public final /* bridge */ /* synthetic */ Function1<InterfaceC1364105Vn<? super BulletinListResponse>, Object> LJFF() {
        return this.LJII;
    }

    public C605910Npd(String str, BulletinListViewModel bulletinListViewModel, InterfaceC497601wk interfaceC497601wk) {
        super(interfaceC497601wk);
        this.LJFF = str;
        this.LJI = bulletinListViewModel;
        this.LJII = new C605720NpK(this);
        this.LJIIIIZZ = new C605940Npg(this);
        BulletinPeriodicRequestConfig bulletinPeriodicRequestConfig = C605930Npf.LIZ;
        this.LJIIIZ = bulletinPeriodicRequestConfig;
        this.LJIIJ = C2097608Jq.LJIIJ(new Pair("trigger_type", "post_bulletin"), new Pair("poll_interval", String.valueOf(bulletinPeriodicRequestConfig.syncInterval)), new Pair("poll_total_time", String.valueOf(bulletinPeriodicRequestConfig.syncTotalTime)), new Pair("channel_id", str));
    }
}
