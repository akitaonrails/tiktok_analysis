package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19628211qq extends AbstractC2255721DQs<InterfaceC19627111qf> implements InterfaceC19627111qf, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), C1456770o0p.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 673));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19628211qq.class, "socialNewEditConfig", "getSocialNewEditConfig()Lcom/ss/android/ugc/aweme/social/creation/api/edit/exp/SocialNewEditConfig;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19628211qq.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19628211qq.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InterfaceC19627111qf W1() {
        return this;
    }

    private final C19629111qz X1() {
        return (C19629111qz) this.LLILZIL.getValue();
    }

    private final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    public final C1456770o0p Z1() {
        return (C1456770o0p) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLILZLL[2]);
    }

    @Override // X.InterfaceC19627111qf
    public InterfaceC19628411qs LJIIJ() {
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

    public C19628211qq(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC19627111qf
    public void kD0(StickerModel stickerModel, Function1<? super StickerModel, Unit> function1) {
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.Tn0(EnumC1466150oFx.MENTION, null, "sticker_panel", function1);
        }
    }
}
