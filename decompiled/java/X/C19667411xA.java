package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19667411xA extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C20280014Ww LL;
    public final /* synthetic */ C1664680tQA<DMGroupChatStickerModel> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19667411xA(C20280014Ww c20280014Ww, C1664680tQA<DMGroupChatStickerModel> c1664680tQA, boolean z, Aweme aweme, boolean z2, int i, int i2) {
        super(2);
        this.LL = c20280014Ww;
        this.LLILLJJLI = c1664680tQA;
        this.LLILLL = z;
        this.LLILZ = aweme;
        this.LLILZIL = z2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
