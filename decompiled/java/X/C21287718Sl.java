package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21287718Sl extends i<InterfaceC21295718Vn, C212364188s, C433160Gyg, C21287918Sn> implements InterfaceC21295718Vn, InterfaceC379610EuV {
    public static final C21287818Sm LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final C21167617sY LLJJ;
    public final InterfaceC332260D0u<List<C427580Gpg>> LLJJI;
    public String LLJJIII;
    public final InterfaceC332260D0u<AIChatGenPrompt> LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public volatile InterfaceC1888430zF3 LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18Sm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21287718Sl.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C21287718Sl.class, "actionBarRepository", "getActionBarRepository()Lcom/ss/android/ugc/tools/chat/input/model/AiChatActionBarRepository;", 0)};
        LLJJJ = new Object() { // from class: X.18Sm
        };
        LLJJJJ = 8;
    }

    public final InterfaceC1888430zF3 F4() {
        InterfaceC1888430zF3 interfaceC1888430zF3 = this.LLJJIJIL;
        if (interfaceC1888430zF3 == null) {
            synchronized (this) {
                interfaceC1888430zF3 = this.LLJJIJIL;
                if (interfaceC1888430zF3 == null) {
                    C1888480zF8 c1888480zF8 = (C1888480zF8) C1807670x8n.s((C12856051i) C1807670x8n.r(), (C1888500zFA) C1807670x8n.t());
                    this.LLJJIJIL = c1888480zF8;
                    return c1888480zF8;
                }
            }
        }
        return interfaceC1888430zF3;
    }

    public final C18UJ H4() {
        return (C18UJ) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    @Override // X.InterfaceC21295718Vn
    public void NP1() {
        this.LLJJIJI.setValue(null);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C433160Gyg> o2() {
        return new AwS550S0100000_6(this, 976);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21287918Sn> w2() {
        return AFwS223S0000000_32.get$arr$(124);
    }

    private final void init() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432340GxM(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1888420zF2(this, null), 2);
    }

    public final String K4() {
        return H4().LIZLLL;
    }

    @Override // X.InterfaceC21295718Vn
    public void LN2() {
        if (T2().LIZIZ) {
            ((C1888480zF8) F4()).LIZ.LIZJ();
        }
    }

    public final boolean P4() {
        return ((C1888480zF8) F4()).LIZ.LIZIZ();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        init();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432360GxO(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C18UP.LIZ.getClass();
        C18UP.LIZIZ.clear();
    }

    public InterfaceC332260D0u<AIChatGenPrompt> O4() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC21295718Vn
    public /* bridge */ /* synthetic */ C05YD uM() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC21295718Vn
    public void uH(String str) {
        Object next;
        if (this.LLJJI.getValue().isEmpty()) {
            this.LLJJIII = str;
            return;
        }
        AIChatGenPrompt aIChatGenPrompt = null;
        this.LLJJIII = null;
        InterfaceC332260D0u<AIChatGenPrompt> interfaceC332260D0u = this.LLJJIJI;
        Iterator<T> it2 = this.LLJJI.getValue().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C427580Gpg) next).LL, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C427580Gpg c427580Gpg = (C427580Gpg) next;
        if (c427580Gpg != null) {
            String str2 = c427580Gpg.LLILLL;
            String str3 = c427580Gpg.LL;
            aIChatGenPrompt = new AIChatGenPrompt(UUID.randomUUID().toString(), str2, str3, str3, c427580Gpg.LLILZIL, c427580Gpg.LLILZLL);
        }
        interfaceC332260D0u.setValue(aIChatGenPrompt);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18ujH4 = H4();
        c18up.getClass();
        C0LAB c0lab = new C0LAB();
        C18UP.LIZ(c0lab, c18ujH4);
        c0lab.LJ("vp_prompt_type", str);
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("vp_default_prompt_select", c0lab.LIZ);
    }

    @Override // X.InterfaceC21295718Vn
    public void yp2(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    public C21287718Sl(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
        this.LLJJ = C21167617sY.LIZ;
        this.LLJJI = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLJJIJI = C1BNE.LIZ(null);
        this.LLJJIJIIJIL = new ArrayList();
    }
}
