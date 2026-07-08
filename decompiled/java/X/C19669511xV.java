package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19669511xV extends AbstractC2255721DQs<InterfaceC19627511qj> implements InterfaceC19627511qj, InterfaceC379610EuV {
    public static final C19670111xb LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public InterfaceC19670311xd LLILZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 293));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.11xb] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19669511xV.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19669511xV.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0)};
        LLILZLL = new Object() { // from class: X.11xb
        };
        LLIZLLLIL = 8;
    }

    public InterfaceC19627511qj W1() {
        return this;
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 257));
        }
    }

    private final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC19627511qj
    public InterfaceC19604511n1 LJIIJ() {
        return new InterfaceC19604511n1() { // from class: X.11xW
            @Override // X.InterfaceC19604511n1
            public final void LIZ(SocialEmoji socialEmoji) {
                InterfaceC19670311xd interfaceC19670311xd = this.LIZ.LLILZ;
                if (interfaceC19670311xd != null) {
                    interfaceC19670311xd.LIZ(socialEmoji);
                }
            }

            @Override // X.InterfaceC19604511n1
            public final void LIZIZ(ViewGroup viewGroup, Context context, C19604311mz c19604311mz) {
                this.LIZ.LLILZ = C1891950zKj.LIZIZ.LIZ(viewGroup, context, c19604311mz);
            }
        };
    }

    public final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLIZ[1]);
    }

    public final C19669711xX Z1() {
        return (C19669711xX) this.LLILZIL.getValue();
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

    public C19669511xV(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC19627511qj
    public void LJLLL(String str) {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqQj;
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        if (interfaceC391240FVqQj2 != null && (listLLLILZLLLI = interfaceC391240FVqQj2.LLLILZLLLI(EnumC1466150oFx.EMOJI_SLIDER)) != null && (stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI)) != null) {
            if (str.length() > 0 && (interfaceC391240FVqQj = qj()) != null) {
                interfaceC391240FVqQj.sS(stickerModel);
                return;
            }
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqX1 = X1();
        if (interfaceC391240FVqX1 == null) {
            return;
        }
        interfaceC391240FVqX1.Tn0(EnumC1466150oFx.EMOJI_SLIDER, null, str, AFwS273S0000000_29.get$arr$(146));
    }
}
