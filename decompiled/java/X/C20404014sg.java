package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoriteSelectFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20404014sg extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PlaybookFavoriteSelectFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20404014sg(PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment) {
        super(1);
        this.LL = playbookFavoriteSelectFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        InterfaceC20403914sf interfaceC20403914sf = this.LL.LLILZ;
        if (interfaceC20403914sf != null) {
            interfaceC20403914sf.n2();
        }
        return Unit.LIZ;
    }
}
