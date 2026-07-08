package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Yn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884650Yn9 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C884270YmX LL;
    public final /* synthetic */ ChatListEngine LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884650Yn9(C884270YmX c884270YmX, ChatListEngine chatListEngine, String str) {
        super(1);
        this.LL = c884270YmX;
        this.LLILLJJLI = chatListEngine;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.LJIIJ().clear();
        this.LL.LJIIIZ().clear();
        this.LL.LJJIFFI = null;
        String str = this.LLILLJJLI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishFireAccessoryUpdateJob page=");
        sbLIZ.append(this.LL.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        C884270YmX c884270YmX = this.LL;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZIZ("fire_accessory_update", C2097908Jt.LIZJ(new Pair("output_size", Integer.valueOf(c884270YmX.LJIIL().size()))));
        }
        return Unit.LIZ;
    }
}
