package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM$refreshStorageManagerDeviceInfo$1$2$1", f = "DiskManagerSettingsVM.kt", l = {}, m = "invokeSuspend")
public final class C20185313yV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DiskManagerSettingsVM LL;
    public final /* synthetic */ C20185513yX LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20185313yV(DiskManagerSettingsVM diskManagerSettingsVM, C20185513yX c20185513yX, Context context, InterfaceC1364105Vn<? super C20185313yV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = diskManagerSettingsVM;
        this.LLILLJJLI = c20185513yX;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20185313yV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        double d;
        C1C7U.LIZ("DiskManagerSettingsVM@985e.refreshStorageManagerDeviceInfo$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DiskManagerSettingsVM diskManagerSettingsVM = this.LL;
        C20185513yX c20185513yX = this.LLILLJJLI;
        diskManagerSettingsVM.LL = c20185513yX;
        if (c20185513yX != null) {
            Context context = this.LLILLL;
            long j = c20185513yX.LIZ;
            if (j < 0) {
                d = 0.0d;
            } else {
                d = j / c20185513yX.LIZIZ;
            }
            double dLIZIZ = C0FV2.LIZIZ(context) - C11VU.LIZJ(48.0d, context);
            diskManagerSettingsVM.setState(new C20185413yW(diskManagerSettingsVM, (int) (d * dLIZIZ), (int) ((((double) 1) - (c20185513yX.LIZJ / c20185513yX.LIZIZ)) * dLIZIZ)));
            diskManagerSettingsVM.zQ2(context, EnumC1335420kr6.CACHE);
            diskManagerSettingsVM.zQ2(context, EnumC1335420kr6.RESOURCE);
            diskManagerSettingsVM.zQ2(context, EnumC1335420kr6.DRAFT);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.refreshStorageManagerDeviceInfo$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
