package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19631611rO extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1664680tQA<DMGroupChatStickerModel> LL;
    public final /* synthetic */ C20280014Ww LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19631611rO(C1664680tQA<DMGroupChatStickerModel> c1664680tQA, C20280014Ww c20280014Ww, boolean z, Aweme aweme) {
        super(2);
        this.LL = c1664680tQA;
        this.LLILLJJLI = c20280014Ww;
        this.LLILLL = z;
        this.LLILZ = aweme;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        Integer groupMemberCount;
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            DMGroupChatStickerGroupInfo groupInfo = this.LL.LIZ.getGroupInfo();
            if (groupInfo != null) {
                groupMemberCount = groupInfo.getGroupMemberCount();
            } else {
                groupMemberCount = null;
            }
            if (C294790Bgz.LIZ() && groupMemberCount != null && groupMemberCount.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.LL.LIZ.getUiStyle() != EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue() && this.LL.LIZ.getUiStyle() != EnumC19620411pa.STICKER_WITH_BUTTON_DARK.getValue()) {
                interfaceC1680500tpg2.LJJIIJZLJL(364289448);
                this.LLILLJJLI.LJ(this.LL, this.LLILLL, this.LLILZ, z, interfaceC1680500tpg2, 0, 0);
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(364022786);
                if (z) {
                    interfaceC1680500tpg2.LJJIIJZLJL(364056390);
                    this.LLILLJJLI.LIZLLL(this.LL, this.LLILLL, this.LLILZ, interfaceC1680500tpg2, 0, 0);
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(364165417);
                    this.LLILLJJLI.LIZIZ(this.LL, this.LLILLL, this.LLILZ, interfaceC1680500tpg2, 0, 0);
                    interfaceC1680500tpg2.LJ();
                }
                interfaceC1680500tpg2.LJ();
            }
        }
        return Unit.LIZ;
    }
}
