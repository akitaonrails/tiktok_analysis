package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11xZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19669911xZ extends AbstractC2255721DQs<InterfaceC19627411qi> implements InterfaceC19627411qi, InterfaceC379610EuV {
    public static final C19670211xc LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public InterfaceC19670311xd LLILLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 299));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11xc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19669911xZ.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new Object() { // from class: X.11xc
        };
        LLIZ = 8;
    }

    public InterfaceC19627411qi W1() {
        return this;
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 262));
        }
    }

    @Override // X.InterfaceC19627411qi
    public InterfaceC19605411nA LJIIJ() {
        return new InterfaceC19605411nA() { // from class: X.11xY
            @Override // X.InterfaceC19605411nA
            public final void LIZ(SocialEmoji socialEmoji) {
                InterfaceC19670311xd interfaceC19670311xd = this.LIZ.LLILLL;
                if (interfaceC19670311xd != null) {
                    interfaceC19670311xd.LIZ(socialEmoji);
                }
            }

            @Override // X.InterfaceC19605411nA
            public final void LIZIZ(ViewGroup viewGroup, Context context, C19604411n0 c19604411n0) {
                this.LIZ.LLILLL = C1891950zKj.LIZIZ.LIZ(viewGroup, context, c19604411n0);
            }
        };
    }

    public final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final C19670011xa Z1() {
        return (C19670011xa) this.LLILZ.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19669911xZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC19627411qi
    public void LJLLL(String str) {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqX1;
        InterfaceC391240FVq interfaceC391240FVqX12 = X1();
        if (interfaceC391240FVqX12 != null && (listLLLILZLLLI = interfaceC391240FVqX12.LLLILZLLLI(EnumC1466150oFx.INTERACTIVE_EMOJI)) != null && (stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI)) != null) {
            if (str.length() > 0 && (interfaceC391240FVqX1 = X1()) != null) {
                interfaceC391240FVqX1.sS(stickerModel);
                return;
            }
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqX13 = X1();
        if (interfaceC391240FVqX13 == null) {
            return;
        }
        interfaceC391240FVqX13.Tn0(EnumC1466150oFx.INTERACTIVE_EMOJI, null, str, AFwS273S0000000_29.get$arr$(147));
    }
}
