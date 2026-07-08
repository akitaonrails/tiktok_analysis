package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217480hms extends C09AY implements Function0<ViewOnAttachStateChangeListenerC20604515jv> {
    public final /* synthetic */ LiveBoardsPageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217480hms(LiveBoardsPageContentAssem liveBoardsPageContentAssem) {
        super(0);
        this.LL = liveBoardsPageContentAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15jv, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewOnAttachStateChangeListenerC20604515jv invoke() {
        return this.LL.LJJIJL().findViewById(R.id.c6y);
    }
}
