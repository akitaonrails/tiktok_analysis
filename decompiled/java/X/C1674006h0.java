package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.MessageRequestPromptViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1674006h0 extends C06O6<C06OO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1600706On LLILZ;
    public final InterfaceC1634606ae LLILZIL;
    public final C06OC LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C1674006h0.class, "viewModel", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    public C1674006h0(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1600706On.LJIIJJI;
        this.LLILZLL = new C06OC(R.layout.cqm);
        this.LLIZ = Collections.singleton(EnumC1596306Mv.MESSAGE_REQUEST_BANNER);
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C0Z1R c0z1r;
        View view = this.LLILLL;
        if ((view instanceof C0Z1R) && (c0z1r = (C0Z1R) view) != null) {
            c0z1r.LIZIZ();
        }
    }

    @Override // X.C06O6, X.AnonymousClass0684
    public final boolean LIZJ(C869590Y9l c869590Y9l, EnumC1596306Mv enumC1596306Mv) {
        if (this.LLILZ.LJI.isMessageRequest() && c869590Y9l.getMsgStatus() == C0YIF.LIZ) {
            InterfaceC1674206h2 value = this.LLILZIL.LIZ().getValue();
            if (value != null) {
                value.kP();
            }
            return true;
        }
        return false;
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        String conversationId;
        Boolean boolValueOf;
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        if (C0Z1S.LIZ()) {
            IMContactApi.LIZ.getClass();
            if (C069P.LIZ().LIZ().LJJIII() == EnumC899370ZPz.DISABLED) {
                return new C06OH("Message request banner disabled by self config");
            }
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZ.LJI.getConversationId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in isValid convId = ");
        Boolean boolValueOf2 = null;
        if (c0y8tLIZ != null) {
            conversationId = c0y8tLIZ.getConversationId();
        } else {
            conversationId = null;
        }
        sbLIZ.append(conversationId);
        sbLIZ.append(" isStranger = ");
        if (c0y8tLIZ != null) {
            boolValueOf = Boolean.valueOf(c0y8tLIZ.isStranger());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" isRisky = ");
        if (c0y8tLIZ != null) {
            boolValueOf2 = Boolean.valueOf(c0y8tLIZ.isRisky());
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0y8tLIZ != null && C882340YjQ.LJ(c0y8tLIZ)) {
            return C06OI.LIZ;
        }
        return new C06OH("Is not message request");
    }

    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0Z1R c0z1r;
        C909290Zln c909290Zln;
        boolean zLJIIIIZZ;
        AssemVMLazy assemVMLazy;
        View view = this.LLILLL;
        MessageRequestPromptViewModel messageRequestPromptViewModel = null;
        if ((view instanceof C0Z1R) && (c0z1r = (C0Z1R) view) != null) {
            SessionInfo sessionInfo = this.LLILZ.LJI;
            if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null) {
                IChatRequestRepository.LIZ.getClass();
                IChatRequestRepository iChatRequestRepositoryLIZ = C15596068s.LIZ();
                if (iChatRequestRepositoryLIZ != null) {
                    zLJIIIIZZ = ((AnonymousClass0693) iChatRequestRepositoryLIZ).LJIIIIZZ(this.LLILZ.LJI.getConversationId());
                } else {
                    zLJIIIIZZ = false;
                }
                Fragment fragment = this.LLILZ.LJ;
                if (fragment != null) {
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestPromptViewModel.class);
                    AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 1061);
                    AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(704);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 1062), aFwS229S0000000_2, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2(fragment, 1063), aFwS229S0000000_2, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 1064), aFwS229S0000000_2, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
                    messageRequestPromptViewModel = (MessageRequestPromptViewModel) assemVMLazy.getValue();
                }
                c0z1r.LLIZLLLIL = new C1674106h1(new AwS246S0300000_2(messageRequestPromptViewModel, this, c909290Zln, 24), new AwS546S0100000_2(this, 1060));
                c0z1r.LLJ = c909290Zln;
                c0z1r.LLJIJIL = zLJIIIIZZ;
                C786410Ut5.LJLLLLLL(0, c0z1r);
                IIMChatAnalytics.LIZ.getClass();
                IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
                if (iIMChatAnalyticsLIZ != null) {
                    iIMChatAnalyticsLIZ.LIZLLL(c909290Zln, C0I0B.LJFF.LIZIZ());
                }
            }
        }
        return Unit.LIZ;
    }
}
