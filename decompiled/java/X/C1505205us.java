package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.manager.EmojiGameJudgeManager", f = "EmojiGameJudgeManager.kt", l = {45}, m = "getIfConversationEnableEmojiGame")
public final class C1505205us extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1505005uq LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505205us(C1505005uq c1505005uq, InterfaceC1364105Vn<? super C1505205us> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1505005uq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiGameJudgeManager@ce86.getIfConversationEnableEmojiGame$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("EmojiGameJudgeManager@ce86.getIfConversationEnableEmojiGame$1");
        return objLIZIZ;
    }
}
