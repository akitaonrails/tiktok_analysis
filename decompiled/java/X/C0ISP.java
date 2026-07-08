package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.setting.LoadMoreRetrySetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ISP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.live.listprovider.BackupDataManager$onProviderLoadMoreStart$1", f = "BackupDataManager.kt", l = {73}, m = "invokeSuspend")
public final class C0ISP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ISZ LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function2<List<? extends FeedItem>, FeedExtra, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ISP(C0ISZ c0isz, String str, Function2<? super List<? extends FeedItem>, ? super FeedExtra, Unit> function2, InterfaceC1364105Vn<? super C0ISP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0isz;
        this.LLILLL = str;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ISP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackupDataManager@227c.onProviderLoadMoreStart$1");
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
            long jBackupDataDelay = LoadMoreRetrySetting.INSTANCE.backupDataDelay();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jBackupDataDelay, this) == objLJFF) {
                C1C7U.LIZIZ("BackupDataManager@227c.onProviderLoadMoreStart$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJ(this.LLILLL, this.LLILZ, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackupDataManager@227c.onProviderLoadMoreStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
