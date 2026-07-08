package X;

import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19625611qQ extends AbstractC2255721DQs<InterfaceC19625711qR> implements InterfaceC19625711qR, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 660));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19625611qQ.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19625611qQ.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19625611qQ.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InterfaceC19625711qR W1() {
        return this;
    }

    private final C19630011r8 X1() {
        return (C19630011r8) this.LLILZLL.getValue();
    }

    private final C19EG Z1() {
        return (C19EG) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    private final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final ViewModelStoreOwner LLIIIILZ() {
        return C1659630tI1.LIZIZ(Z1(), this.LLILLJJLI);
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[1]);
    }

    @Override // X.InterfaceC19625711qR
    public InterfaceC19614111oZ LJIIJ() {
        return X1();
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

    public final Scene o2() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19625711qR
    public void A7(StickerModel stickerModel) {
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.Tn0(EnumC1466150oFx.HASH_TAG, null, "sticker_panel", AFwS273S0000000_29.get$arr$(212));
        }
    }

    public C19625611qQ(C1DRG c1drg, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
    }
}
