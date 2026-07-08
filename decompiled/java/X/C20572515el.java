package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.15el, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20572515el extends C09AY implements InterfaceC1631620sYq<C127A, EnumC1392960mLu, Boolean, Unit> {
    public final /* synthetic */ ViewOnClickListenerC20572415ek LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20572515el(ViewOnClickListenerC20572415ek viewOnClickListenerC20572415ek, String str, String str2) {
        super(3);
        this.LL = viewOnClickListenerC20572415ek;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C127A c127a, EnumC1392960mLu enumC1392960mLu, Boolean bool) {
        C20572315ej c20572315ej;
        HideAccountViewModel hideAccountViewModel;
        C127A c127a2 = c127a;
        EnumC1392960mLu enumC1392960mLu2 = enumC1392960mLu;
        boolean zBooleanValue = bool.booleanValue();
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = this.LL.getBindingAdapter();
        if ((bindingAdapter instanceof C20572315ej) && (c20572315ej = (C20572315ej) bindingAdapter) != null && (hideAccountViewModel = c20572315ej.LL) != null) {
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            int bindingAdapterPosition = this.LL.getBindingAdapterPosition();
            hideAccountViewModel.vQ2();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                hideAccountViewModel.setState(new AwS597S0100000_18(hideAccountViewModel, 816));
            } else {
                hideAccountViewModel.withState(new C20573015eq(zBooleanValue, str, enumC1392960mLu2, bindingAdapterPosition, hideAccountViewModel, str2, c127a2));
            }
        }
        return Unit.LIZ;
    }
}
