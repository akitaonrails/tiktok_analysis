package X;

import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3CommentSyncAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3CommentSyncAssem$onVideoEvent$1", f = "FriendsV3CommentSyncAssem.kt", l = {}, m = "invokeSuspend")
public final class C0O1Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C737030Svd LL;
    public final /* synthetic */ FriendsV3CommentSyncAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O1Q(C737030Svd c737030Svd, FriendsV3CommentSyncAssem friendsV3CommentSyncAssem, InterfaceC1364105Vn<? super C0O1Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c737030Svd;
        this.LLILLJJLI = friendsV3CommentSyncAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O1Q(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C737030Svd c737030Svd = this.LL;
        if (c737030Svd == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
            return unit;
        }
        Object obj2 = c737030Svd.LIZIZ;
        if (obj2 == null || (string = obj2.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
            return unit2;
        }
        C737030Svd c737030Svd2 = this.LL;
        if (c737030Svd2.LIZ != 14) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
            return unit3;
        }
        Long l = c737030Svd2.LJIILL;
        if (l != null) {
            long jLongValue = l.longValue();
            for (FriendsV3CommentProtocol friendsV3CommentProtocol : this.LLILLJJLI.bo()) {
                if (friendsV3CommentProtocol.I0(string)) {
                    friendsV3CommentProtocol.Kn0(jLongValue);
                }
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3CommentSyncAssem@467.onVideoEvent$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
