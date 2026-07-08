package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EX6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EX6 implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.INFO_STICKER;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EX6.class, "newInfoStickerApi", "getNewInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EX6.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EX6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    public final InterfaceC1461650o8h LJIIIIZZ() {
        return ((InterfaceC1455850nzL) this.LLILZ.getValue(this, LLILZLL[1])).Iz2().LIZJ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EX6(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC363820EOe.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return C351220Dpo.LLJLIL(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return C351220Dpo.LLJJLIIIJLLLLLLLZ(nLETrackSlot);
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        ArrayList arrayList;
        List<NLETrackSlot> list;
        int iIntValue;
        StickerItemModel stickerItemModelRQ;
        List<NLETrackSlot> list2;
        int iIntValue2;
        StickerItemModel stickerItemModelRQ2;
        List<C0EXF> list3;
        List<StickerItemModel> list4;
        C348100Dkm c348100DkmLIZIZ;
        C0FW6 c0fw6LJIIIZ;
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLILZLL[2])).g().getValue();
        ArrayList<NLENode> arrayList2 = null;
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            c0fw6LJIIIZ.LJIIJJI(c0ey3.LIZ);
        }
        if (c0ey3.LIZIZ.getInfoStickerModel() == null) {
            c0ey3.LIZIZ.setInfoStickerModel(new InfoStickerModel(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJ(c0ey3.LIZIZ)));
        }
        InfoStickerModel infoStickerModel = c0ey3.LIZIZ.getInfoStickerModel();
        if (infoStickerModel != null && (list4 = infoStickerModel.stickers) != null) {
            arrayList = new ArrayList(list4);
        } else {
            arrayList = new ArrayList();
        }
        List<NLETrack> listLJJJLIIL = C351220Dpo.LJJJLIIL(c0ey3.LIZ);
        ArrayList arrayList3 = new ArrayList();
        for (NLETrack nLETrack : listLJJJLIIL) {
            int layer = nLETrack.getLayer();
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new Pair(it2.next().getUUID(), Integer.valueOf(layer)));
            }
            C19719612Di.LJJI(arrayList4, arrayList3);
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList3);
        C0EY1 c0ey1 = c0exh.LIZIZ;
        if (c0ey1 != null && (list3 = c0ey1.LIZIZ) != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<C0EXF> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ.getSecond());
            }
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            for (NLENode nLENode : arrayList2) {
                InterfaceC1461650o8h interfaceC1461650o8hLJIIIIZZ = LJIIIIZZ();
                if (interfaceC1461650o8hLJIIIIZZ != null) {
                    interfaceC1461650o8hLJIIIIZZ.eX(nLENode.getUUID());
                }
            }
            ArrayList<StickerItemModel> arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) it4.next();
                Integer num = (Integer) mapLJIILLIIL.get(nLETrackSlot.getUUID());
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                InterfaceC363820EOe interfaceC363820EOe = (InterfaceC363820EOe) this.LLILLL.getValue(this, LLILZLL[0]);
                if (interfaceC363820EOe != null && (stickerItemModelRQ2 = interfaceC363820EOe.rQ(nLETrackSlot, iIntValue2)) != null) {
                    arrayList5.add(stickerItemModelRQ2);
                }
            }
            for (StickerItemModel stickerItemModel : arrayList5) {
                C364520EQw.LIZ(arrayList, new AwS584S0100000_5(stickerItemModel, 1219));
                arrayList.add(stickerItemModel);
            }
            InterfaceC1461650o8h interfaceC1461650o8hLJIIIIZZ2 = LJIIIIZZ();
            if (interfaceC1461650o8hLJIIIIZZ2 != null) {
                interfaceC1461650o8hLJIIIIZZ2.Dc2(arrayList5);
            }
        }
        C0EXG c0exg = c0exh.LIZJ;
        if (c0exg != null && (list2 = c0exg.LIZIZ) != null && (!list2.isEmpty())) {
            for (NLETrackSlot nLETrackSlot2 : list2) {
                InterfaceC1461650o8h interfaceC1461650o8hLJIIIIZZ3 = LJIIIIZZ();
                if (interfaceC1461650o8hLJIIIIZZ3 != null) {
                    interfaceC1461650o8hLJIIIIZZ3.eX(nLETrackSlot2.getUUID());
                }
            }
            Iterator<NLETrackSlot> it5 = list2.iterator();
            while (it5.hasNext()) {
                C364520EQw.LIZ(arrayList, new AwS584S0100000_5(it5.next(), 1218));
            }
        }
        C0EXG c0exg2 = c0exh.LIZ;
        if (c0exg2 != null && (list = c0exg2.LIZIZ) != null && (!list.isEmpty())) {
            for (NLETrackSlot nLETrackSlot3 : list) {
                InterfaceC1461650o8h interfaceC1461650o8hLJIIIIZZ4 = LJIIIIZZ();
                if (interfaceC1461650o8hLJIIIIZZ4 != null) {
                    interfaceC1461650o8hLJIIIIZZ4.eX(nLETrackSlot3.getUUID());
                }
            }
            ArrayList<StickerItemModel> arrayList6 = new ArrayList();
            for (NLETrackSlot nLETrackSlot4 : list) {
                Integer num2 = (Integer) mapLJIILLIIL.get(nLETrackSlot4.getUUID());
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                InterfaceC363820EOe interfaceC363820EOe2 = (InterfaceC363820EOe) this.LLILLL.getValue(this, LLILZLL[0]);
                if (interfaceC363820EOe2 != null && (stickerItemModelRQ = interfaceC363820EOe2.rQ(nLETrackSlot4, iIntValue)) != null) {
                    arrayList6.add(stickerItemModelRQ);
                }
            }
            for (StickerItemModel stickerItemModel2 : arrayList6) {
                C364520EQw.LIZ(arrayList, new AwS584S0100000_5(stickerItemModel2, 1217));
                arrayList.add(stickerItemModel2);
            }
            InterfaceC1461650o8h interfaceC1461650o8hLJIIIIZZ5 = LJIIIIZZ();
            if (interfaceC1461650o8hLJIIIIZZ5 != null) {
                interfaceC1461650o8hLJIIIIZZ5.Dc2(arrayList6);
            }
        }
        InfoStickerModel infoStickerModel2 = c0ey3.LIZIZ.getInfoStickerModel();
        if (infoStickerModel2 != null) {
            infoStickerModel2.stickers = arrayList;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
