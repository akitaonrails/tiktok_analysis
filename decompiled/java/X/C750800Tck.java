package X;

import com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet$onDismiss$1", f = "LiveCommentFlagFilterFragmentSheet.kt", l = {145, 147}, m = "invokeSuspend")
public final class C750800Tck extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public CommentSwitchSettings LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveCommentFlagFilterFragmentSheet LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750800Tck(LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet, InterfaceC1364105Vn<? super C750800Tck> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveCommentFlagFilterFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750800Tck(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CommentSwitchSettings commentSwitchSettings;
        C1C7U.LIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onDismiss$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    commentSwitchSettings = this.LL;
                    C155000ia.LIZIZ(obj);
                    if (((C470590Icr) obj) != null && C750850Tcp.LIZ(false, C2286608xc.LJ(commentSwitchSettings.chatCommunityFlagged))) {
                        C766270U4b.LIZLLL(2131833489);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onDismiss$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C751360Tde c751360Tde = C751360Tde.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLL);
            this.LLILLJJLI = 1;
            obj = c751360Tde.LIZ(dataChannelLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onDismiss$1");
                return objLJFF;
            }
        }
        CommentSwitchSettings commentSwitchSettings2 = (CommentSwitchSettings) obj;
        if (commentSwitchSettings2 != null) {
            LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet = this.LLILLL;
            C751360Tde c751360Tde2 = C751360Tde.LIZ;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(liveCommentFlagFilterFragmentSheet);
            this.LL = commentSwitchSettings2;
            this.LLILLJJLI = 2;
            Object objLIZJ = c751360Tde2.LIZJ(commentSwitchSettings2, dataChannelLJ2, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onDismiss$1");
                return objLJFF;
            }
            commentSwitchSettings = commentSwitchSettings2;
            obj = objLIZJ;
            if (((C470590Icr) obj) != null) {
                C766270U4b.LIZLLL(2131833489);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onDismiss$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
