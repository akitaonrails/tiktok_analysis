package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.DetailEmptyAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ju6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506760Ju6 extends C09AY implements Function2<UIAssem, C291001Au<? extends SpaceCommentItem>, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ DetailEmptyAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506760Ju6(View view, DetailEmptyAssem detailEmptyAssem) {
        super(2);
        this.LL = view;
        this.LLILLJJLI = detailEmptyAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends SpaceCommentItem> c291001Au) {
        if (c291001Au != null) {
            C786410Ut5.LJLLLLLL(8, this.LL);
            C504760Jqs c504760Jqs = this.LLILLJJLI.hp().LLILZ;
            if (c504760Jqs != null) {
                c504760Jqs.LJII();
            }
        }
        return Unit.LIZ;
    }
}
