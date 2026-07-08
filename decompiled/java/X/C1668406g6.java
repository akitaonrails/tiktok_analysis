package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.b2c.api.model.ClickToChatItemResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1668406g6 implements IIMBusinessChatService {
    public static final C1668406g6 LIZIZ = new C1668406g6();
    public static final C1669106gD LIZJ = C1669106gD.LIZ;
    public static final C1490005sQ LIZLLL = C1490005sQ.LIZIZ;
    public static final C1669206gE LJ = C1669206gE.LIZ;
    public static final C1668906gB LJFF = C1668906gB.LIZ;
    public static final C1712106n9 LJI = C1712106n9.LIZ;
    public static final C1668606g8 LJII = C1668606g8.LIZ;
    public static final C1668806gA LJIIIIZZ = C1668806gA.LIZ;
    public static final C061E LJIIIZ = C061E.LL;
    public static final C1669406gG LJIIJ = C1669406gG.LIZ;
    public static final C1670006gM LJIIJJI = C1670006gM.LIZ;

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C13IQ<? extends UIContentAssem> LJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJII(ChatFeatureListConf chatFeatureListConf, Assembler assembler, Fragment fragment, C909290Zln c909290Zln, SingleChatAssem singleChatAssem) {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1608000rwk LJIIJ(Aweme aweme, Long l, String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJIIL(BusinessCommandMessage businessCommandMessage) {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C19719912Dl LJIILLIIL() {
        return C13LE.LIZ(AbstractC738140SxQ.class);
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final ChatFeatureListConf LJIJ(SessionInfo sessionInfo, IMUser iMUser, IMUser iMUser2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJIL(IMUser iMUser) {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final void LJJ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C0Z7V LJIILJJIL() {
        return new C0Z7V() { // from class: X.06g7
            @Override // X.C0Z7V
            public final void LIZ(long j) {
            }

            @Override // X.C0Z7V
            public final String LIZIZ(long j) {
                return "";
            }

            @Override // X.C0Z7V
            public final void LIZLLL(SessionInfo sessionInfo) {
            }

            @Override // X.C0Z7V
            public final void LJ(Long l, String str) {
            }

            @Override // X.C0Z7V
            public final void LJFF(long j) {
            }

            @Override // X.C0Z7V
            public final void LJII(C909290Zln c909290Zln) {
            }

            @Override // X.C0Z7V
            public final void LJIIIIZZ(C909290Zln c909290Zln) {
            }

            @Override // X.C0Z7V
            public final int LJIIIZ() {
                return -1;
            }

            @Override // X.C0Z7V
            public final void LJIIJ() {
            }

            @Override // X.C0Z7V
            public final Map<String, String> LJI(SessionInfo sessionInfo) {
                return C2097608Jq.LJ();
            }

            @Override // X.C0Z7V
            public final Object LIZJ(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669506gH LIZIZ() {
        return LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1712506nD LJFF() {
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC894120Z5u LJI() {
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669306gF LJIIIIZZ() {
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1669006gC LJIIJJI() {
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C061D LJIILIIL() {
        return LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1712206nA LJIILL() {
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1670106gN LJIIZILJ() {
        return LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC877200Yb8 LJIJI() {
        return LJII;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final InterfaceC1668206g4 LJIJJ() {
        return new InterfaceC1668206g4() { // from class: X.06g3
            @Override // X.InterfaceC1668206g4
            public final void LIZ(String str, EnumC1665006fY enumC1665006fY) {
            }

            @Override // X.InterfaceC1668206g4
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC1668206g4
            public final Boolean LIZJ(IMUser iMUser) {
                return null;
            }

            @Override // X.InterfaceC1668206g4
            public final boolean LIZLLL(IMUser iMUser) {
                return false;
            }

            @Override // X.InterfaceC1668206g4
            public final C01S9<Pair<String, EnumC1665006fY>> LJ() {
                return C1BNE.LIZ(null);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJI() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final C0ZR3 getFeedbackService() {
        return LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final Map<String, List<Integer>> LJIIIZ(IMUser iMUser) {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService
    public final Object LJIJJLI(AnonymousClass0653 anonymousClass0653, InterfaceC1364105Vn<? super ClickToChatItemResponse> interfaceC1364105Vn) {
        return new ClickToChatItemResponse(0L, 5, null);
    }
}
