package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575180r5o extends C09AY implements Function1<EnumC1575230r5t, Unit> {
    public final /* synthetic */ VibeFeedEntranceViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575180r5o(VibeFeedEntranceViewModel vibeFeedEntranceViewModel, boolean z, String str, String str2) {
        super(1);
        this.LL = vibeFeedEntranceViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0r5m] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC1575230r5t enumC1575230r5t) {
        int i;
        EnumC1575230r5t enumC1575230r5t2 = EnumC1575230r5t.STARTED;
        if (enumC1575230r5t == enumC1575230r5t2) {
            VibeFeedEntranceViewModel vibeFeedEntranceViewModel = this.LL;
            boolean z = this.LLILLJJLI;
            String str = vibeFeedEntranceViewModel.LLJI;
            if (str != null && z) {
                if (vibeFeedEntranceViewModel.LLILZLL == null) {
                    vibeFeedEntranceViewModel.LLILZLL = C0YNP.LIZIZ(str);
                }
                if (vibeFeedEntranceViewModel.LLIZ == null) {
                    vibeFeedEntranceViewModel.LLIZ = new InterfaceC866830XzV(str) { // from class: X.0r5m
                        public final String LL;

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJJJJJL(C0Y8T c0y8t) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJJLJLI(List<C0YAE> list) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJJLL(List<C0YAE> list) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJJZZI(List<C0YAE> list) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJLI(String str2, List<C0YAE> list) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJLILLLLZI(C0Y8T c0y8t) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJLJI(int i2, C0Y8T c0y8t) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJLL(C1711306n1 c1711306n1) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LLIIII(int i2, String str2) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LLIILZL(int i2, String str2, List list) {
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final int LLLIIII() {
                            return 0;
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
                        public final void LLLIZZ(Map<String, C0Y8T> map) {
                        }

                        {
                            this.LL = str;
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJJLIIIJ(C0Y8T c0y8t) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onDeleteConversation conversationId:");
                            sbLIZ.append(this.LL);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                        public final void LJZI(C0Y8T c0y8t) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onLeaveConversation conversationId:");
                            sbLIZ.append(this.LL);
                            C299700Bou.LIZIZ("VibeGroupConversationObserver", C2188811AlT.LIZIZ(sbLIZ));
                            C0P30.LIZ().LIZIZ(this.LL, "leave group");
                            C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
                            c1575210r5r.LJII(EnumC1575230r5t.CLOSED, this.LL);
                            EnumC897860ZKe enumC897860ZKe = EnumC897860ZKe.LEAVE_GROUP;
                            String str2 = this.LL;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c1575210r5r.LJI(enumC897860ZKe, str2, true);
                        }
                    };
                }
                C1575160r5m c1575160r5m = vibeFeedEntranceViewModel.LLIZ;
                if (c1575160r5m != null) {
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(c1575160r5m);
                }
            }
            VibeFeedEntranceViewModel vibeFeedEntranceViewModel2 = this.LL;
            C23250099c.LIZLLL(vibeFeedEntranceViewModel2.getAssemVMScope(), C0PEM.LIZJ, null, new C1574760r58(this.LLILLL, vibeFeedEntranceViewModel2, this.LLILZ, null), 2);
        } else {
            this.LL.setState(AFwS264S0000000_24.get$arr$(534));
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str2 = this.LLILZ;
        if (str2 == null) {
            str2 = "";
        }
        if (enumC1575230r5t == enumC1575230r5t2) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = !Intrinsics.LJFF(this.LL.getState().LL, Boolean.FALSE) ? 1 : 0;
        EnumC912680ZrG enumC912680ZrG = this.LL.LLJIJIL;
        c1575290r5z.getClass();
        C20684815ws.LJIILLIIL("ttsocial_shared_feed_feature_enable_state", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("conversation_id", str2), new Pair("feed_status", String.valueOf(i)), new Pair("feature_status", String.valueOf(i2)), new Pair("chat_type", enumC912680ZrG.stringValue())));
        return Unit.LIZ;
    }
}
