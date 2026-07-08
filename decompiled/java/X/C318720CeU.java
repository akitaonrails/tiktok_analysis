package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C318720CeU extends C2217421BqW implements Function0<Unit> {
    public C318720CeU(CreateTabBottomBtnViewModel createTabBottomBtnViewModel) {
        super(0, createTabBottomBtnViewModel, CreateTabBottomBtnViewModel.class, "onAiEntranceClick", "onAiEntranceClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CreateTabBottomBtnViewModel createTabBottomBtnViewModel = (CreateTabBottomBtnViewModel) this.receiver;
        createTabBottomBtnViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(createTabBottomBtnViewModel), null, null, new C318710CeT(createTabBottomBtnViewModel, null), 3);
        return Unit.LIZ;
    }
}
