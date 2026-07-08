package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ynf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884970Ynf extends C09AY implements Function0<C884680YnC> {
    public final /* synthetic */ ChatListEngine LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884970Ynf(ChatListEngine chatListEngine) {
        super(0);
        this.LL = chatListEngine;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YnC] */
    @Override // kotlin.jvm.functions.Function0
    public final C884680YnC invoke() {
        final ChatListEngine chatListEngine = this.LL;
        return new InterfaceC1482905rH() { // from class: X.0YnC
            @Override // X.InterfaceC1482905rH
            public final void LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends InterfaceC1491305sd> list, C884710YnF c884710YnF, String str) {
                if (list.isEmpty()) {
                    return;
                }
                String str2 = chatListEngine.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updaterOnUpdate size=");
                sbLIZ.append(list.size());
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(str2);
                ChatListEngine chatListEngine2 = chatListEngine;
                chatListEngine2.getClass();
                C1729806q0.LIZ(interfaceC879010Ye3, new C884560Yn0(chatListEngine2, interfaceC879010Ye3, list, c884710YnF, str, null));
            }
        };
    }
}
