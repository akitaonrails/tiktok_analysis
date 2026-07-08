package X;

import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.IMChatRoomImpl$tryAddEducationForVoiceMessage$1", f = "IMChatRoomImpl.kt", l = {}, m = "invokeSuspend")
public final class C1518105wx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518105wx(UIAssem uIAssem, SessionInfo sessionInfo, InterfaceC1364105Vn<? super C1518105wx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uIAssem;
        this.LLILLJJLI = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518105wx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatRoomImpl@ac4d.tryAddEducationForVoiceMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva repo = Keva.getRepo("voice_message_entrance_keva");
        if (repo.getBoolean("has_shown_entrance_inline", false)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMChatRoomImpl@ac4d.tryAddEducationForVoiceMessage$1");
            return unit;
        }
        repo.storeBoolean("has_shown_entrance_inline", true);
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZJ(this.LL.getContext());
        c1684506ih.LIZ(this.LLILLJJLI);
        c1684506ih.LIZLLL(24);
        c1684506ih.LIZJ = "uuid_voice_message";
        Context context = this.LL.getContext();
        if (context == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMChatRoomImpl@ac4d.tryAddEducationForVoiceMessage$1");
            return unit2;
        }
        c1684506ih.LJFF = context.getString(2131832297);
        ((ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this.LL), ChatRoomFakeMsgOperatorAbility.class)).yl2(c1684506ih, null);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMChatRoomImpl@ac4d.tryAddEducationForVoiceMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
