package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.template.CCTemplateAreaComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0REP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REP extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REP(View view) {
        super(1);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LIZ = C13LE.LIZ(CCTemplateAreaComponent.class);
        c0req2.LJ = this.LL;
        c0req2.LIZLLL = R.id.dkb;
        return Unit.LIZ;
    }
}
