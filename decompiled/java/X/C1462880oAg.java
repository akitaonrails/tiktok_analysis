package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import kotlin.jvm.internal.AwS163S1100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462880oAg implements InterfaceC1660130tIp<C1678310tm9>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462880oAg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1462880oAg.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1462880oAg.class, "lco", "getLco()Landroidx/lifecycle/LifecycleOwner;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1462880oAg.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) this.LLIZ.getValue(this, LLIZLLLIL[3]);
        if (interfaceC1455360nyY != null) {
            interfaceC1455360nyY.pc2();
        }
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C861130XqJ> getState() {
        return this.LLILLL;
    }

    public C1462880oAg(C1DRG c1drg) {
        this.LL = c1drg;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C861130XqJ());
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, LifecycleOwner.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455360nyY.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        String strLIZIZ;
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
        if (Intrinsics.LJFF(interfaceC1660090tIl, C1460150o6H.LIZ)) {
            boolean z = true;
            if ((!LIZJ().creativeModel.stickerModel.dmGroupChatStickerModel.isEmpty()) && ((DMGroupChatStickerModel) C13LP.LJJJJZI(LIZJ().creativeModel.stickerModel.dmGroupChatStickerModel)).getUseNewToolTip()) {
                strLIZIZ = C555520LqY.LIZIZ(2131838719);
            } else {
                z = false;
                strLIZIZ = C555520LqY.LIZIZ(2131845527);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C861090XqF(this, z, new AwS163S1100000_14(this, strLIZIZ, 6), null), 3);
        }
    }
}
