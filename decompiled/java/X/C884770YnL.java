package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884770YnL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ List<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ List<C879540Yeu<?>> LLILZ;
    public final /* synthetic */ C878550YdJ LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C884770YnL(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, C878550YdJ c878550YdJ, boolean z, boolean z2, String str) {
        super(0);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c878550YdJ;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIIJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
