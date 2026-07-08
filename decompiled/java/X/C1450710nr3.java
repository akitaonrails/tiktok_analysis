package X;

import Y.ACallableS250S0200000_22;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450710nr3 implements InterfaceC1450690nr1 {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public InterfaceC1450810nrD LIZJ;
    public final List<InterfaceC1450730nr5> LIZLLL = new ArrayList();
    public final MutableLiveData LJ = new MutableLiveData();

    @Override // X.InterfaceC1450690nr1
    public final void LJ() {
        Iterator<InterfaceC1450730nr5> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF();
        }
    }

    @Override // X.InterfaceC1450690nr1
    public final C11NZ<List<StickerItemModel>> LJIIIIZZ() {
        List<InterfaceC1450730nr5> list = this.LIZLLL;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        List<InterfaceC1450730nr5> list2 = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1450730nr5) it2.next()).LJI());
        }
        return C11NZ.LJJJJIZL(arrayList).LJJJ(new InterfaceC1487280oo2() { // from class: X.0TIQ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((C11NZ) obj).LJJJLZIJ(C11S5.LIZ());
            }
        }, false).LJLJLLL().LJJIJLIJ();
    }

    @Override // X.InterfaceC1450750nr7
    public final void LJFF() {
        List<StickerItemModel> list;
        List<CanvasFilterParam> transformList;
        CanvasFilterParam canvasFilterParam;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditCanvasEmbeddedStickerController->");
        sbLIZ.append("onRenderContextReady");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = C1453840nw6.LJ(this.LIZIZ) && ((Boolean) C0B0F.LIZ.getValue()).booleanValue();
        InfoStickerModel infoStickerModel = this.LIZIZ.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList<StickerItemModel> arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                StickerItemModel stickerItemModel2 = stickerItemModel;
                if (stickerItemModel2.type == 1000 && C123100dR.LIZ(stickerItemModel2.extra)) {
                    arrayList.add(stickerItemModel);
                }
            }
            if (!arrayList.isEmpty()) {
                for (StickerItemModel stickerItemModel3 : arrayList) {
                    if (stickerItemModel3.isAttributionLink) {
                        List<InterfaceC1450730nr5> list2 = this.LIZLLL;
                        Context context = this.LIZ;
                        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
                        ((ArrayList) list2).add(new C1449860npg(context, videoPublishEditModel.mIsFromDraft && !videoPublishEditModel.isFromRestoreRecover(), stickerItemModel3, new AwS566S0100000_22(this, 1046)));
                    } else {
                        List<InterfaceC1450730nr5> list3 = this.LIZLLL;
                        Context context2 = this.LIZ;
                        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
                        boolean z2 = videoPublishEditModel2.mIsFromDraft && !videoPublishEditModel2.isFromRestoreRecover();
                        CanvasVideoData canvasVideoData = this.LIZIZ.getCanvasVideoData();
                        ((ArrayList) list3).add(new C1449870nph(context2, z2, stickerItemModel3, (canvasVideoData == null || (transformList = canvasVideoData.getTransformList()) == null || (canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList)) == null) ? 1 : canvasFilterParam.getNickNameStyle(), z, new AwS566S0100000_22(this, 1047)));
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(((ArrayList) this.LIZLLL).size());
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1450730nr5) it2.next()).LJ(new AwS566S0100000_22(countDownLatch, 1048));
        }
        C15O7.LIZJ(new ACallableS250S0200000_22(countDownLatch, this, 13));
    }

    @Override // X.InterfaceC1450690nr1
    public final MutableLiveData LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC1450750nr7
    public final void LIZ(float f) {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1450730nr5) it2.next()).LIZ(f);
        }
    }

    @Override // X.InterfaceC1450750nr7
    public final void LIZIZ(Pair<Pair<Float, Float>, Pair<Float, Float>> pair) {
        Pair<Float, Float> first = pair.getFirst();
        float fFloatValue = first.getFirst().floatValue();
        float fFloatValue2 = first.getSecond().floatValue();
        Pair<Float, Float> second = pair.getSecond();
        float fFloatValue3 = second.getFirst().floatValue();
        float fFloatValue4 = second.getSecond().floatValue();
        if (fFloatValue3 - fFloatValue > 0.0f && fFloatValue4 - fFloatValue2 > 0.0f) {
            Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1450730nr5) it2.next()).LIZIZ(pair);
            }
        }
    }

    @Override // X.InterfaceC1450750nr7
    public final void LIZJ(float f) {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1450730nr5) it2.next()).LIZJ(f);
        }
    }

    @Override // X.InterfaceC1450750nr7
    public final void LJII(C1450720nr4 c1450720nr4) {
        this.LIZJ = c1450720nr4;
    }

    public C1450710nr3(Context context, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = context;
        this.LIZIZ = videoPublishEditModel;
    }

    @Override // X.InterfaceC1450750nr7
    public final void LIZLLL(float f, float f2) {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1450730nr5) it2.next()).LIZLLL(f, f2);
        }
    }
}
