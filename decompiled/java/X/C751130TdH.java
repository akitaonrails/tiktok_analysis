package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0TdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter$locationSettingsNew$1$1", f = "LiveAdminSettingGuideAdapter.kt", l = {830}, m = "invokeSuspend")
public final class C751130TdH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveAdminSettingGuideAdapter LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C16F5 LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751130TdH(LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, View view, C16F5 c16f5, Context context, InterfaceC1364105Vn<? super C751130TdH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveAdminSettingGuideAdapter;
        this.LLILLL = view;
        this.LLILZ = c16f5;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751130TdH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean zIsLocationPermissionGranted;
        C1C7U.LIZ("LiveAdminSettingGuideAdapter@ff9f.locationSettingsNew$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C752740Tfs.LIZ.getClass();
            Boolean bool = C752740Tfs.LIZLLL;
            if (bool == null || (i = C752740Tfs.LIZIZ) == 0 || (i != 1 && C752740Tfs.LIZJ.length() == 0)) {
                LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter = this.LLILLJJLI;
                View view = this.LLILLL;
                C16F5 c16f5 = this.LLILZ;
                Context context = this.LLILZIL;
                this.LL = 1;
                if (liveAdminSettingGuideAdapter.LJIIIIZZ(view, c16f5, context, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.locationSettingsNew$1$1");
                    return objLJFF;
                }
            } else if (Intrinsics.LJFF(bool, true)) {
                LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter2 = this.LLILLJJLI;
                View view2 = this.LLILLL;
                C16F5 c16f52 = this.LLILZ;
                Context context2 = this.LLILZIL;
                liveAdminSettingGuideAdapter2.getClass();
                C500260Jjc.LLFFF(view2);
                if (view2 != null) {
                    C786410Ut5.I7(new ACListenerS147S0100000_12(liveAdminSettingGuideAdapter2, 7), view2);
                }
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext != null) {
                    zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context2);
                } else {
                    zIsLocationPermissionGranted = false;
                }
                int i3 = C752740Tfs.LIZIZ;
                String str = C752740Tfs.LIZJ;
                if (zIsLocationPermissionGranted && i3 != 1 && str.length() > 0) {
                    C500260Jjc.LLFFF(c16f52);
                    if (c16f52 != null) {
                        c16f52.setText(str);
                    }
                } else {
                    C500260Jjc.LJIILIIL(c16f52);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.locationSettingsNew$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
