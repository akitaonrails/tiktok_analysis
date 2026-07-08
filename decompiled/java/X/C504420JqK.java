package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpacePostCategoryAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504420JqK extends C09AY implements InterfaceC1631630sYr<UIAssem, C291001Au<? extends SpacePost>, C291001Au<? extends Boolean>, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SpacePostCategoryAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504420JqK(SpacePostCategoryAssem spacePostCategoryAssem) {
        super(4);
        this.LL = spacePostCategoryAssem;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au, C291001Au<? extends Boolean> c291001Au2, C291001Au<? extends Boolean> c291001Au3) {
        Object obj;
        C503760JpG c503760JpG;
        C291001Au<? extends SpacePost> c291001Au4 = c291001Au;
        if (c291001Au4 != null) {
            obj = c291001Au4.LIZ;
        } else {
            obj = null;
        }
        if (obj != null || ((c503760JpG = this.LL.Ho().LLILZIL) != null && c503760JpG.LIZJ())) {
            C16FS c16fs = this.LL.LLIZLLLIL;
            if (c16fs != null) {
                c16fs.setText(C497740JfY.LJIJI(2131844303));
            }
        } else {
            C16FS c16fs2 = this.LL.LLIZLLLIL;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131844303));
            }
        }
        return Unit.LIZ;
    }
}
