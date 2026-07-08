package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: renamed from: X.11pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19621711pn extends AbstractC2255721DQs<InterfaceC1462290o9j> implements InterfaceC1462290o9j, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19621711pn.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public InterfaceC1462290o9j W1() {
        return this;
    }

    private final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLILLL[0]);
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

    public C19621711pn(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1462290o9j
    public void LJLLL(String str) {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqX1;
        InterfaceC391240FVq interfaceC391240FVqX12 = X1();
        if (interfaceC391240FVqX12 != null && (listLLLILZLLLI = interfaceC391240FVqX12.LLLILZLLLI(EnumC1466150oFx.SECRET_REPLIES)) != null && (stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI)) != null) {
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
        interfaceC391240FVqX13.Tn0(EnumC1466150oFx.SECRET_REPLIES, null, str, AFwS273S0000000_29.get$arr$(150));
    }
}
