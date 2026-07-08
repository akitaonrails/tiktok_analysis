package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0Jqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504830Jqz extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;
    public final /* synthetic */ C504910Jr7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504830Jqz(SubSpaceDetailListAssem subSpaceDetailListAssem, C504910Jr7 c504910Jr7) {
        super(1);
        this.LL = subSpaceDetailListAssem;
        this.LLILLJJLI = c504910Jr7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        final SubSpaceDetailVM subSpaceDetailVMKp = this.LL.kp();
        final SpaceCommentItem spaceCommentItem = this.LLILLJJLI.LIZ;
        final C505560JsA c505560JsA = new C505560JsA();
        final C505050JrL c505050JrL = new C505050JrL(this.LL);
        C480460Ism.LIZ().getClass();
        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).deleteComment(spaceCommentItem.postId, spaceCommentItem.commentId), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/comment/delete", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceDetailVMKp));
        if (c0j1n != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jqw
                /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r13) {
                    /*
                        Method dump skipped, instruction units count: 215
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C504800Jqw.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.07xr
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceDetailVM@ca2c.deleteComment$2");
                    c505050JrL.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.deleteComment$2");
                }
            });
        }
        subSpaceDetailVMKp.wQ2().LIZIZ("delete");
        return Unit.LIZ;
    }
}
