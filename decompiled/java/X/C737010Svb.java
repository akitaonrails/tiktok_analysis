package X;

import Y.ARunnableS11S1300000_11;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.firstlike.FirstLikeToastData;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Svb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737010Svb extends C09AY implements Function1<C737030Svd, Unit> {
    public final /* synthetic */ DiggPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737010Svb(DiggPanelComponent diggPanelComponent) {
        super(1);
        this.LL = diggPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C737030Svd c737030Svd) {
        C0SZ8 c0sz8LJLIL;
        InterfaceC689860R4e interfaceC689860R4eK9;
        Aweme awemeLJIIIIZZ;
        C19EG c19egLIZ;
        LifecycleOwner lifecycleOwnerRequireSAFExpLifecycleOwner;
        final DiggPanelComponent diggPanelComponent = this.LL;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = diggPanelComponent.Mb();
        if (iViewPagerComponentAbilityMb != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ()) != null && (c19egLIZ = diggPanelComponent.getPanelContext().LIZ()) != null && !C0T1R.LJ(awemeLJIIIIZZ) && !DiggPanelComponent.LLJJJ.getBoolean("didLike", false)) {
            if (!C1591220rVg.LIZLLL() || (lifecycleOwnerRequireSAFExpLifecycleOwner = C724240Sb0.LJI(diggPanelComponent)) == null) {
                lifecycleOwnerRequireSAFExpLifecycleOwner = IMainSAFLifecycleKt.requireSAFExpLifecycleOwner(diggPanelComponent.LJJIJL(), true, c19egLIZ);
            }
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            EnumC19241510Pl enumC19241510Pl = EnumC19241510Pl.FIRST_LIKE_TOAST_DATA;
            Objects.requireNonNull(lifecycleOwnerRequireSAFExpLifecycleOwner);
            iPluginService.observe(enumC19241510Pl, lifecycleOwnerRequireSAFExpLifecycleOwner, new C11N2<C0TA0>() { // from class: X.10Sp
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(Object obj) {
                    FirstLikeToastData firstLikeToastData;
                    String str;
                    ARunnableS11S1300000_11 aRunnableS11S1300000_11;
                    IPluginService.PluginDataWrapper value = ((C0TA0) obj).getValue();
                    if (value != null && (firstLikeToastData = value.firstLikeToastdata) != null && (str = firstLikeToastData.text) != null && str.length() != 0) {
                        Integer num = firstLikeToastData.style;
                        C00IY c00iy = C00IY.TOP_DARK;
                        int iOrdinal = c00iy.ordinal();
                        if (num == null || num.intValue() != iOrdinal) {
                            c00iy = C00IY.MID_DARK;
                            int iOrdinal2 = c00iy.ordinal();
                            if (num == null || num.intValue() != iOrdinal2) {
                                return;
                            }
                        }
                        C10TD c10td = new C10TD(firstLikeToastData.text, c00iy, firstLikeToastData.showDurationMs);
                        String str2 = c10td.LIZ;
                        C00IY c00iy2 = c10td.LIZIZ;
                        Long l = c10td.LIZJ;
                        DiggPanelComponent diggPanelComponent2 = diggPanelComponent;
                        diggPanelComponent2.LLJJIJIIJIL = new ARunnableS11S1300000_11(diggPanelComponent2, l, str2, c00iy2, 0);
                        if ((C303210BuZ.LIZIZ() != 0 || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) && (aRunnableS11S1300000_11 = diggPanelComponent.LLJJIJIIJIL) != null) {
                            aRunnableS11S1300000_11.run();
                            diggPanelComponent.LLJJIJIIJIL = null;
                        }
                    }
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = this.LL.Mb();
        if (iViewPagerComponentAbilityMb2 != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb2.LJLIL()) != null && c0sz8LJLIL.K9() != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null) {
            interfaceC689860R4eK9.LJJLIIIJLJLI();
        }
        return Unit.LIZ;
    }
}
