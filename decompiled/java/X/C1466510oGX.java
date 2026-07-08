package X;

import Y.ARunnableS119S0100000_19;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0oGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1466510oGX extends C2217421BqW implements Function1<User, Unit> {
    public C1466510oGX(C19628311qr c19628311qr) {
        super(1, c19628311qr, C19628311qr.class, "selectUserCallback", "selectUserCallback(Lcom/ss/android/ugc/aweme/profile/model/User;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) {
        User user2 = user;
        C19628311qr c19628311qr = (C19628311qr) this.receiver;
        c19628311qr.getStateContainer().LIZLLL(new AwS601S0100000_22(user2, 832), true);
        C1664680tQA<MentionStickerModel> c1664680tQA = c19628311qr.LLJILJILJ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS601S0100000_22(user2, 833), true);
        HandlerHook.viewPostDelay(c19628311qr.getMentionStickerView().getEditText(), new ARunnableS119S0100000_19(c19628311qr, 184), 200L);
        return Unit.LIZ;
    }
}
