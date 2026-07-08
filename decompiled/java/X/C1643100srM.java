package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0srM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$select$2", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1643100srM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1643220srY LLILLJJLI;
    public final /* synthetic */ OptionCategoryViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643100srM(C1643220srY c1643220srY, OptionCategoryViewModel optionCategoryViewModel, InterfaceC1364105Vn<? super C1643100srM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1643220srY;
        this.LLILLL = optionCategoryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1643100srM c1643100srM = new C1643100srM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1643100srM.LL = obj;
        return c1643100srM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC1154660g9Y enumC1154660g9Y;
        Effect effect;
        C1C7U.LIZ("OptionCategoryViewModel@f2b8.select$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1643220srY c1643220srY = this.LLILLJJLI;
        C1643300srg c1643300srg = c1643220srY.LJ;
        Unit unit = null;
        if (c1643300srg != null) {
            enumC1154660g9Y = c1643300srg.LJIIIZ;
        } else {
            enumC1154660g9Y = null;
        }
        if (enumC1154660g9Y == EnumC1154660g9Y.LOCAL) {
            if (c1643300srg != null) {
                OptionCategoryViewModel optionCategoryViewModel = this.LLILLL;
                if (Intrinsics.LJFF(c1643220srY.LIZJ, "Green Screen")) {
                    if (Intrinsics.LJFF(c1643300srg.LIZJ, "plus")) {
                        optionCategoryViewModel.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_support_flag", 1);
                        bundle.putInt("key_choose_scene", 3);
                        bundle.putInt("key_photo_select_min_count", 1);
                        bundle.putInt("key_photo_select_max_count", 1);
                        Activity activity = optionCategoryViewModel.LL;
                        if (activity != null) {
                            Intent intentLIZIZ = C1660670tJh.LIZ().LIZIZ(activity, bundle, 10001);
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZIZ, "Activity_startActivityForResult_2");
                            C1701330uNH.LIZ(intentLIZIZ, activity);
                            C2204961BRm.LJIIZILJ(10001, activity, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6S6ZpzBzjZpGDlHrqJcl8/bMC8iKnDeO1vUgahOios1FAz6+zZ6x5m3Vjxik/f0IdVuT5KsxCP2G5DulRB2", null));
                        }
                    } else {
                        optionCategoryViewModel.LLILLL.LIZ(c1643220srY, new C1643170srT(optionCategoryViewModel, c1643220srY));
                    }
                }
                unit = Unit.LIZ;
            }
        } else {
            if (c1643300srg != null && (effect = c1643300srg.LJFF) != null) {
                OptionCategoryViewModel optionCategoryViewModel2 = this.LLILLL;
                if (!new C0VSJ(effect.getUnzipPath()).exists()) {
                    optionCategoryViewModel2.LLILLJJLI.LJIIL(effect, new C1698190uID(optionCategoryViewModel2, c1643220srY, 2));
                } else {
                    optionCategoryViewModel2.vQ2(c1643220srY);
                }
            } else {
                this.LLILLL.vQ2(c1643220srY);
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("OptionCategoryViewModel@f2b8.select$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
