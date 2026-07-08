package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0Yne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884960Yne extends C09AY implements Function0<C884610Yn5> {
    public final /* synthetic */ ChatListEngine LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884960Yne(ChatListEngine chatListEngine) {
        super(0);
        this.LL = chatListEngine;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Yn5] */
    @Override // kotlin.jvm.functions.Function0
    public final C884610Yn5 invoke() {
        final ChatListEngine chatListEngine = this.LL;
        return new InterfaceC878540YdI() { // from class: X.0Yn5
            @Override // X.InterfaceC878540YdI
            public final void LIZIZ(InterfaceC879010Ye3 interfaceC879010Ye3, String str) {
                String str2 = chatListEngine.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dataSourceOnRefresh, source=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(str2);
                C1729806q0.LIZ(interfaceC879010Ye3, new C884600Yn4(chatListEngine, interfaceC879010Ye3, str, null));
            }

            @Override // X.InterfaceC878540YdI
            public final void LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends InterfaceC1491305sd> list, List<? extends InterfaceC1491305sd> list2, String str) {
                String str2 = chatListEngine.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dataSourceOnRemove size=");
                sbLIZ.append(list.size());
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(str2);
                ChatListEngine chatListEngine2 = chatListEngine;
                chatListEngine2.getClass();
                C1729806q0.LIZ(interfaceC879010Ye3, new C884550Ymz(chatListEngine2, interfaceC879010Ye3, null, null, list, list2, str, null));
            }

            @Override // X.InterfaceC878540YdI
            public final void LIZJ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, String str) {
                String str2 = chatListEngine.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dataSourceOnUpdate size=");
                sbLIZ.append(list.size());
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(str2);
                ChatListEngine chatListEngine2 = chatListEngine;
                chatListEngine2.getClass();
                C1729806q0.LIZ(interfaceC879010Ye3, new C884550Ymz(chatListEngine2, interfaceC879010Ye3, list, list2, null, null, str, null));
            }

            @Override // X.InterfaceC878540YdI
            public final void LIZLLL(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, C878550YdJ c878550YdJ, boolean z, boolean z2, String str) {
                String str2 = chatListEngine.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dataSourceOnQueryResult size=");
                sbLIZ.append(list.size());
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(str2);
                if (!C880900Yh6.LIZIZ() && ((Number) C269870Aht.LIZ.getValue()).intValue() != 1) {
                    C1729806q0.LIZ(interfaceC879010Ye3, new C884630Yn7(chatListEngine, interfaceC879010Ye3, null));
                    C1729806q0.LIZ(interfaceC879010Ye3, new C884620Yn6(chatListEngine, interfaceC879010Ye3, list, list2, c878550YdJ, z, z2, str, null));
                } else {
                    C1729806q0.LIZJ(interfaceC879010Ye3, new AwS415S0200000_14(chatListEngine, interfaceC879010Ye3, 33));
                    C1729806q0.LIZJ(interfaceC879010Ye3, new C884770YnL(chatListEngine, interfaceC879010Ye3, list, list2, c878550YdJ, z, z2, str));
                }
            }
        };
    }
}
