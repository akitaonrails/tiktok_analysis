package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0S5U implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ TranslationStatusViewModel LL;

    public C0S5U(TranslationStatusViewModel translationStatusViewModel) {
        this.LL = translationStatusViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, TranslationStatusViewModel.class, "handleMasterToggleChanged", "handleMasterToggleChanged(Lcom/ss/android/ugc/aweme/sharedmodel/MasterToggleState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2788016c c2788016cLIZ;
        Aweme aweme;
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        TranslationStatusViewModel translationStatusViewModel = this.LL;
        if (translationStatusViewModel.LLILLJJLI) {
            VideoItemParams item = translationStatusViewModel.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                c2788016cLIZ = C715660S5k.LIZ(aweme);
            } else {
                c2788016cLIZ = null;
            }
            translationStatusViewModel.setState(new AwS590S0100000_11(new AwS220S0300000_11(translationStatusViewModel, c708250RqJ, c2788016cLIZ, 27), 485));
        }
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
