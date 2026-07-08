package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456880o10 implements InterfaceC572170McJ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1466810oH1 LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1456880o10.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1456880o10.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1456880o10.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1456880o10.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC572170McJ
    public final void refresh() {
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1456880o10(C1DRG c1drg) {
        this.LL = c1drg;
        C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILLJJLI = new C1466810oH1(this, 11);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1457600o2A.class, null);
    }

    @Override // X.InterfaceC572170McJ
    public final void LIZ(C1456890o11 c1456890o11) {
        MutableLiveData<Boolean> mutableLiveDataFz0;
        boolean z = c1456890o11.LIZ;
        boolean z2 = c1456890o11.LIZIZ;
        boolean z3 = c1456890o11.LIZJ;
        if (!z2) {
            InterfaceC1455010nxz interfaceC1455010nxz = (InterfaceC1455010nxz) this.LLILLJJLI.getValue(this, LLILZIL[1]);
            if (interfaceC1455010nxz != null && (mutableLiveDataFz0 = interfaceC1455010nxz.fz0()) != null) {
                mutableLiveDataFz0.setValue(Boolean.valueOf(z3));
            }
        } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "photo_toolbar_collapse_mode", true, false)) {
            ((InterfaceC1455610nyx) this.LLILLL.getValue(this, LLILZIL[2])).bo();
        }
        C1664750tQH c1664750tQH = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        ((InterfaceC1455610nyx) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).Jf1(z, z);
        ((InterfaceC1457600o2A) this.LLILZ.getValue(this, interfaceC2217461BqaArr[3])).I60(z);
        ((InterfaceC1457610o2B) this.LLILZ.getValue(this, interfaceC2217461BqaArr[3])).nf1(z);
        ((InterfaceC1455610nyx) this.LLILLL.getValue(this, interfaceC2217461BqaArr[2])).Uh1(1, true);
        ((InterfaceC1457600o2A) this.LLILZ.getValue(this, interfaceC2217461BqaArr[3])).rT(z);
    }
}
