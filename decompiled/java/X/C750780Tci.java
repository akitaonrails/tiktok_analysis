package X;

import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet$onViewCreated$1", f = "LiveCommentFlagFilterFragmentSheet.kt", l = {110}, m = "invokeSuspend")
public final class C750780Tci extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommentFlagFilterFragmentSheet LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ long[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750780Tci(LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet, Long l, long[] jArr, InterfaceC1364105Vn<? super C750780Tci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommentFlagFilterFragmentSheet;
        this.LLILLL = l;
        this.LLILZ = jArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750780Tci(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        Object objLIZ = obj;
        C1C7U.LIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C751360Tde c751360Tde = C751360Tde.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLJJLI);
            this.LL = 1;
            objLIZ = c751360Tde.LIZ(dataChannelLJ, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onViewCreated$1");
                return objLJFF;
            }
        }
        CommentSwitchSettings commentSwitchSettings = (CommentSwitchSettings) objLIZ;
        View viewFindViewById = null;
        if (commentSwitchSettings != null) {
            numLJ = C2286608xc.LJ(commentSwitchSettings.chatCommunityFlagged);
        } else {
            numLJ = null;
        }
        if (!C750850Tcp.LIZ(false, numLJ) && commentSwitchSettings != null) {
            commentSwitchSettings.chatCommunityFlagged = C750850Tcp.LIZIZ(true);
        }
        LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet = this.LLILLJJLI;
        View view = liveCommentFlagFilterFragmentSheet.LLJZ;
        if (view == null) {
            View view2 = liveCommentFlagFilterFragmentSheet.getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.hyg);
            }
            liveCommentFlagFilterFragmentSheet.LLJZ = (C21411818qq) viewFindViewById;
            view = viewFindViewById;
        }
        C786410Ut5.C7((C21411818qq) view, new C786040UsU(commentSwitchSettings, this.LLILLJJLI, this.LLILLL, this.LLILZ, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentFlagFilterFragmentSheet@d8aa.onViewCreated$1");
        return unit;
    }
}
