package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EXN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXN implements InterfaceC379610EuV, InterfaceC366210EXj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.MUSIC;
    public Pair<String, ? extends AVMusic> LLILLL;
    public final C1664740tQG LLILZ;
    public boolean LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C1664750tQH LLIZ;
    public final C0EY7 LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXN.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXN.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EXN.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EXN.class, "editorContext", "getEditorContext()Lcom/ss/ugc/android/editor/core/EditorContextApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
        if (C301670Bs5.LIZ()) {
            this.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXN(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1454960nxu.class, null);
        C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC357200DzS.class, null);
        this.LLIZLLLIL = new C0EY7(this);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return C351220Dpo.LLLFF(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        InterfaceC1419190n2D interfaceC1419190n2D;
        InterfaceC1419190n2D interfaceC1419190n2D2;
        boolean z = this.LLILZIL;
        this.LLILZIL = false;
        if (z) {
            Pair<String, ? extends AVMusic> pair = this.LLILLL;
            if (pair != null) {
                C0EY7 c0ey7 = this.LLIZLLLIL;
                String first = pair.getFirst();
                AVMusic second = pair.getSecond();
                C0EXN c0exn = c0ey7.LIZ;
                InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) c0exn.LLILZ.getValue(c0exn, LLJ[0]);
                if (interfaceC1454960nxu != null) {
                    interfaceC1454960nxu.Rq(first, second, false, true, false, false, -1L, false, true, "", false, null);
                }
            }
        } else if (((Boolean) C284730BDz.LIZ.getValue()).booleanValue() && (interfaceC1419190n2D = (InterfaceC1419190n2D) ((C0ETY) this.LL.LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class)) != null) {
            interfaceC1419190n2D.gy();
        }
        if (!c0eyd.LIZIZ && (interfaceC1419190n2D2 = (InterfaceC1419190n2D) ((C0ETY) this.LL.LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class)) != null) {
            interfaceC1419190n2D2.II1();
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        InterfaceC359850E8x interfaceC359850E8xB20;
        String uuid;
        List<C0EY8> list;
        Object next;
        InterfaceC359850E8x interfaceC359850E8xB202;
        NLEModel nLEModel = c0ey3.LIZ;
        Map<String, InterfaceC352990Dsf> map = C353810Dtz.LIZ;
        C353890Du7 c353890Du7LIZIZ = C353810Dtz.LIZIZ("bottom_item_root_sound_sync", nLEModel, this.LL);
        C1664740tQG c1664740tQG = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C0EGY c0egy = (C0EGY) c1664740tQG.getValue(this, interfaceC2217461BqaArr[2]);
        if (c0egy != null && (interfaceC359850E8xB202 = c0egy.B20()) != null) {
            interfaceC359850E8xB202.LJIIZILJ("bottom_item_root_sound_sync", c353890Du7LIZIZ, false);
        }
        C0EGY c0egy2 = (C0EGY) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[2]);
        if (c0egy2 != null && (interfaceC359850E8xB20 = c0egy2.B20()) != null) {
            NLETrackSlot nLETrackSlotLLLLLLIL = ((InterfaceC357200DzS) this.LLIZ.getValue(this, interfaceC2217461BqaArr[3])).LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null && (uuid = nLETrackSlotLLLLLLIL.getUUID()) != null) {
                C361980EHc c361980EHcLJIL = interfaceC359850E8xB20.LJIL();
                if (c361980EHcLJIL == null) {
                    return Unit.LIZ;
                }
                C0EY1 c0ey1 = c0exh.LIZIZ;
                if (c0ey1 != null && (list = c0ey1.LIZ) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<C0EY8> it2 = list.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().LIZIZ.getSlots(), arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((NLENode) next).getUUID(), uuid)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
                    if (nLETrackSlot != null) {
                        ArrayList arrayList2 = (ArrayList) c361980EHcLJIL.LIZ;
                        ArrayList<C361980EHc> arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (!Intrinsics.LJFF(((C361980EHc) obj).LJI, "bottom_item_bgm_edit_lyric")) {
                                arrayList3.add(obj);
                            }
                        }
                        for (C361980EHc c361980EHc : arrayList3) {
                            Map<String, InterfaceC352990Dsf> map2 = C353810Dtz.LIZ;
                            interfaceC359850E8xB20.LJIIZILJ(c361980EHc.LJI, C353810Dtz.LIZ(nLETrackSlot, c361980EHc.LJI), false);
                        }
                    }
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    @Override // X.InterfaceC366210EXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C0EXH r15, X.C0EY3 r16, X.C366230EXl r17) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXN.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
