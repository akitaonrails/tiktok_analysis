package X;

import Y.AObjectS245S0100000_22;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450890nrL extends i<InterfaceC1450540nqm, C12GW, C1457190o1V, C1450910nrN> implements InterfaceC1450540nqm, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJILJILJ;
    public final C1462760oAU LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final HashMap<Integer, C1450570nqp> LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public List<C1152980g6q> LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450890nrL.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450890nrL.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1450890nrL.class, "cropApi", "getCropApi()Lcom/ss/android/ugc/gamora/editor/crop/CropApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1450890nrL.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1450890nrL.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final InterfaceC1452510ntx H4() {
        return (InterfaceC1452510ntx) this.LLJJIII.getValue(this, LLJJL[2]);
    }

    private final InterfaceC1441090nbX P4() {
        return (InterfaceC1441090nbX) this.LLJJIJIIJIL.getValue(this, LLJJL[4]);
    }

    private final InterfaceC1453410nvP T4() {
        return (InterfaceC1453410nvP) this.LLJJI.getValue(this, LLJJL[1]);
    }

    private final NLEEditor d5() {
        return (NLEEditor) this.LLJJIJIL.getValue();
    }

    private final void x5() {
        this.LLJJJ.clear();
    }

    public final InterfaceC1451050nrb O4() {
        return (InterfaceC1451050nrb) this.LLJJIJI.getValue(this, LLJJL[3]);
    }

    public final VideoPublishEditModel Z4() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1457190o1V> o2() {
        return new AwS566S0100000_22(this, 445);
    }

    public final void v5() {
        List<C1152980g6q> list = this.LLJJJJJIL;
        List<C1152980g6q> listF4 = F4();
        if (Intrinsics.LJFF(list, listF4)) {
            return;
        }
        k5(list, listF4);
        this.LLJJJIL = n5(this.LLJJJIL, list, listF4);
        this.LLJJJJ = n5(this.LLJJJJ, list, listF4);
        this.LLJJJJJIL = listF4;
        if (this.LLJJJJLIIL) {
            i3(new AwS601S0100000_22(this, 305));
        }
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1450910nrN> w2() {
        return new AwS566S0100000_22(this, 447);
    }

    private final List<C1152980g6q> F4() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = Z4().getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
        for (SingleImageData singleImageData : imageList) {
            final String id = singleImageData.getId();
            final String path = singleImageData.getSrcImageInfo().getPath();
            arrayList.add(new Object(id, path) { // from class: X.0g6q
                public final String LIZ;
                public final String LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1152980g6q)) {
                        return false;
                    }
                    C1152980g6q c1152980g6q = (C1152980g6q) obj;
                    return Intrinsics.LJFF(this.LIZ, c1152980g6q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1152980g6q.LIZIZ);
                }

                public final int hashCode() {
                    String str = this.LIZ;
                    return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ImageItemKey(id=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", path=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = id;
                    this.LIZIZ = path;
                }
            });
        }
        return arrayList;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C560530Lyd<Integer> c560530LydAd;
        super.onCreate();
        C1446760nkg.LIZ.getClass();
        if (C1446760nkg.LIZJ()) {
            this.LLJJJJJIL = F4();
            InterfaceC1441090nbX interfaceC1441090nbXP4 = P4();
            if (interfaceC1441090nbXP4 == null || (c560530LydAd = interfaceC1441090nbXP4.Ad()) == null) {
                return;
            }
            c560530LydAd.LIZ(this, new AObjectS245S0100000_22(this, 116));
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1450540nqm
    public HashMap<Integer, C1450570nqp> nM2() {
        return this.LLJJJ;
    }

    private final C1450570nqp K4(int i) {
        return this.LLJJJ.get(Integer.valueOf(i));
    }

    private final void gP0(int i) {
        i3(new AwS35S0001000_22(i, 14));
    }

    @Override // X.InterfaceC1450540nqm
    public void EN0(C1450520nqk c1450520nqk) {
        C1450570nqp c1450570nqpK4 = K4(this.LLJJJIL);
        if (c1450570nqpK4 != null) {
            c1450570nqpK4.LIZIZ = c1450520nqk;
        }
    }

    @Override // X.InterfaceC1450540nqm
    public void Fx2(C1450520nqk c1450520nqk) {
        C1450570nqp c1450570nqpK4 = K4(this.LLJJJJ);
        if (c1450570nqpK4 != null) {
            c1450570nqpK4.LIZIZ = c1450520nqk;
        }
    }

    @Override // X.InterfaceC1450540nqm
    public void Pg2(boolean z) {
        i3(new AwS35S0010000_22(z, 20));
    }

    @Override // X.InterfaceC1450540nqm
    public void Tr(boolean z) {
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        NLEModel model2;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next;
        this.LLJJJJLIIL = z;
        if (z) {
            x5();
            this.LLJJJJJIL = F4();
            show();
            i3(new AwS35S0010000_22(z, 21));
            this.LLJJJJ = -1;
            int currentItem = this.LLJILLL.getCurrentItem();
            this.LLJJJIL = currentItem;
            gP0(currentItem);
            if (C295670BiP.LIZ()) {
                NLEEditor nLEEditorD5 = d5();
                if (nLEEditorD5 != null && (model2 = nLEEditorD5.getModel()) != null && (mainTrack2 = model2.getMainTrack()) != null && (slots = mainTrack2.getSlots()) != null) {
                    Iterator<NLETrackSlot> it2 = slots.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (C351220Dpo.LLJJIJIL(next)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    slotByIndex = next;
                    if (slotByIndex == null) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                NLEEditor nLEEditorD52 = d5();
                if (nLEEditorD52 == null || (model = nLEEditorD52.getModel()) == null || (mainTrack = model.getMainTrack()) == null || (slotByIndex = mainTrack.getSlotByIndex(0)) == null) {
                    return;
                }
            }
            t5(this.LLJJJIL, new C1450570nqp(C389780FQa.LIZ(slotByIndex)));
            return;
        }
        i3(new AwS35S0010000_22(z, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UA2(int r15) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450890nrL.UA2(int):void");
    }

    private final void k5(List<C1152980g6q> list, List<C1152980g6q> list2) {
        int iIndexOf;
        if (this.LLJJJ.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (Map.Entry<Integer, C1450570nqp> entry : this.LLJJJ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C1450570nqp value = entry.getValue();
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(iIntValue, list);
            if (objLJJJLZIJ != null && (iIndexOf = list2.indexOf(objLJJJLZIJ)) >= 0) {
                map.put(Integer.valueOf(iIndexOf), value);
            }
        }
        this.LLJJJ.clear();
        this.LLJJJ.putAll(map);
    }

    private final void t5(int i, C1450570nqp c1450570nqp) {
        this.LLJJJ.put(Integer.valueOf(i), c1450570nqp);
    }

    public C1450890nrL(C19A3 c19a3, C1DRG c1drg, C1462760oAU c1462760oAU) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c1462760oAU;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452510ntx.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 446));
        this.LLJJJ = new HashMap<>();
        this.LLJJJJ = -1;
        this.LLJJJJJIL = C13BV.INSTANCE;
    }

    private final int n5(int i, List<C1152980g6q> list, List<C1152980g6q> list2) {
        int iIndexOf;
        if (i < 0) {
            return i;
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, list);
        if (objLJJJLZIJ != null && (iIndexOf = list2.indexOf(objLJJJLZIJ)) >= 0) {
            return iIndexOf;
        }
        int currentItem = this.LLJILLL.getCurrentItem();
        int size = list2.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return C13LZ.LJ(currentItem, 0, size);
    }
}
