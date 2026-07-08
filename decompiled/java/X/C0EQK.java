package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQK implements InterfaceC379610EuV, InterfaceC350220DoC, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664740tQG LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EQK.class, "editorProStickerApi", "getEditorProStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EQK.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EQK(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, C0EHC.class, null);
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        List<LyricStickerModel> listI4;
        List<LyricStickerModel> listI42;
        List<LyricStickerModel> listI43;
        List<LyricStickerModel> listI44;
        List<LyricStickerModel> listI45;
        List<LyricStickerModel> listI46;
        C1664740tQG c1664740tQG = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
        C0EZ1 c0ez1WM2 = null;
        if (interfaceC1461350o8D != null) {
            c0ez1WM2 = interfaceC1461350o8D.WM2();
        }
        C0EHC c0ehc = (C0EHC) this.LLILLJJLI.getValue(this, interfaceC2217461BqaArr[0]);
        if (c0ehc != null && (listI45 = c0ehc.i4()) != null) {
            ArrayList<LyricStickerModel> arrayList = new ArrayList();
            for (LyricStickerModel lyricStickerModel : listI45) {
                LyricStickerModel lyricStickerModel2 = lyricStickerModel;
                if (c0ez1WM2 != null && (listI46 = c0ez1WM2.i4()) != null) {
                    Iterator<LyricStickerModel> it2 = listI46.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            LyricStickerModel next = it2.next();
                            if (Intrinsics.LJFF(next.getUuid(), lyricStickerModel2.getUuid())) {
                                if (next != null) {
                                    arrayList.add(lyricStickerModel);
                                }
                            }
                        }
                    }
                }
            }
            for (LyricStickerModel lyricStickerModel3 : arrayList) {
                if (c0ez1WM2 != null) {
                    c0ez1WM2.x1(lyricStickerModel3, EnumC356070Dxd.NONE);
                }
            }
        }
        C0EHC c0ehc2 = (C0EHC) this.LLILLJJLI.getValue(this, LLILZ[0]);
        if (c0ehc2 != null && (listI43 = c0ehc2.i4()) != null) {
            ArrayList<LyricStickerModel> arrayList2 = new ArrayList();
            for (LyricStickerModel lyricStickerModel4 : listI43) {
                LyricStickerModel lyricStickerModel5 = lyricStickerModel4;
                if (c0ez1WM2 != null && (listI44 = c0ez1WM2.i4()) != null) {
                    Iterator<LyricStickerModel> it3 = listI44.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LyricStickerModel next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUuid(), lyricStickerModel5.getUuid())) {
                            if (next2 == null) {
                            }
                        }
                    }
                }
                arrayList2.add(lyricStickerModel4);
            }
            for (LyricStickerModel lyricStickerModel6 : arrayList2) {
                if (c0ez1WM2 != null) {
                    c0ez1WM2.h1(lyricStickerModel6, EnumC356070Dxd.NONE);
                }
            }
        }
        if (c0ez1WM2 != null && (listI4 = c0ez1WM2.i4()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (LyricStickerModel lyricStickerModel7 : listI4) {
                LyricStickerModel lyricStickerModel8 = lyricStickerModel7;
                C0EHC c0ehc3 = (C0EHC) this.LLILLJJLI.getValue(this, LLILZ[0]);
                if (c0ehc3 != null && (listI42 = c0ehc3.i4()) != null) {
                    Iterator<LyricStickerModel> it4 = listI42.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        LyricStickerModel next3 = it4.next();
                        if (Intrinsics.LJFF(next3.getUuid(), lyricStickerModel8.getUuid())) {
                            if (next3 == null) {
                            }
                        }
                    }
                }
                arrayList3.add(lyricStickerModel7);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                String uuid = ((LyricStickerModel) it5.next()).getUuid();
                if (uuid == null) {
                    uuid = "";
                }
                c0ez1WM2.g3(uuid, EnumC356070Dxd.NONE);
            }
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZJ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZIZ) == null) {
            return;
        }
        videoPublishEditModel2.creativeModel.stickerModel.lyricStickerModels = videoPublishEditModel.creativeModel.stickerModel.lyricStickerModels;
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
