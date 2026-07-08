package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel$fetchPreshownSticker$1", f = "MessageListFooterViewModel.kt", l = {126, 133}, m = "invokeSuspend")
public final class C1706606mG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MessageListFooterViewModel LL;
    public PreshownStickerSceneConfig LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ MessageListFooterViewModel LLILZIL;
    public final /* synthetic */ SessionInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706606mG(String str, MessageListFooterViewModel messageListFooterViewModel, SessionInfo sessionInfo, InterfaceC1364105Vn<? super C1706606mG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = messageListFooterViewModel;
        this.LLILZLL = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706606mG(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706606mG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
