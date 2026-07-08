package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C528750KoT extends C2217421BqW implements Function0<Unit> {
    public C528750KoT(Object obj) {
        super(0, obj, C528760KoU.class, "initShowDefaultHintView", "initShowDefaultHintView()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewStub viewStub;
        C528760KoU c528760KoU = (C528760KoU) this.receiver;
        if (c528760KoU.LLLLLLJ == null && (viewStub = c528760KoU.LLLLLLLLL) != null) {
            C786410Ut5.LJLLLL(viewStub);
            c528760KoU.LLLLLLJ = c528760KoU.LLJJJJJIL.findViewById(R.id.h1u);
        }
        Context sceneContext = c528760KoU.getSceneContext();
        if (sceneContext != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n5;
            ((ImageView) c528760KoU.LLJJJJJIL.findViewById(R.id.anf)).setImageDrawable(c0hti.LIZ(sceneContext));
        }
        return Unit.LIZ;
    }
}
