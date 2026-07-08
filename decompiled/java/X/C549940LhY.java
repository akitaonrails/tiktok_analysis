package X;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0LhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C549940LhY extends C2217421BqW implements Function0<Unit> {
    public C549940LhY(Object obj) {
        super(0, obj, C528760KoU.class, "initShowAISelfCreationHintView", "initShowAISelfCreationHintView()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewStub viewStub;
        C528760KoU c528760KoU = (C528760KoU) this.receiver;
        if (c528760KoU.LLLLLLJ == null && (viewStub = c528760KoU.LLLLLLLLL) != null) {
            C786410Ut5.LJLLLL(viewStub);
            View viewFindViewById = c528760KoU.LLJJJJJIL.findViewById(R.id.h1u);
            c528760KoU.LLLLLLJ = viewFindViewById;
            C1669670tYD.LJ((ComposeView) viewFindViewById, EnumC1427810nG7.Auto, new C19719212De(138811789, new AwS622S0100000_8(c528760KoU, 15), true));
        }
        return Unit.LIZ;
    }
}
