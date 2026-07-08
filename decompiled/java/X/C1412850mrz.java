package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mrz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$preDownloadAsset$1$onSuccess$1", f = "VideoMixEditingMaterialComponent.kt", l = {}, m = "invokeSuspend")
public final class C1412850mrz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1412860ms0 LL;
    public final /* synthetic */ C1413530mt5 LLILLJJLI;
    public final /* synthetic */ C1412800mru LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412850mrz(C1412860ms0 c1412860ms0, C1413530mt5 c1413530mt5, C1412800mru c1412800mru, InterfaceC1364105Vn<? super C1412850mrz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1412860ms0;
        this.LLILLJJLI = c1413530mt5;
        this.LLILLL = c1412800mru;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412850mrz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.preDownloadAsset$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1412860ms0 c1412860ms0 = this.LL;
        AbstractC1412880ms2 abstractC1412880ms2 = c1412860ms0.LIZIZ;
        if (abstractC1412880ms2 != null) {
            C1412800mru c1412800mru = this.LLILLL;
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("predownload downloaded Asset(");
            sbLIZ.append(c1412860ms0.LIZ.getAsset_id());
            sbLIZ.append(", ");
            sbLIZ.append(c1412860ms0.LIZ.getTitle());
            sbLIZ.append(", ");
            sbLIZ.append(c1412860ms0.LIZ.getAsset_consumer_type());
            sbLIZ.append(')');
            C201955140j.LIZLLL(c0mj8, "MixAssetDownloader", C2188811AlT.LIZIZ(sbLIZ));
            if (((Boolean) C286890BMh.LIZ.getValue()).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (abstractC1412880ms2 instanceof C1413070msL) {
                    String strLIZ = abstractC1412880ms2.LIZ();
                    if (strLIZ != null) {
                        arrayList.add(strLIZ);
                    }
                } else if (abstractC1412880ms2 instanceof C1413040msI) {
                    C1413040msI c1413040msI = (C1413040msI) abstractC1412880ms2;
                    VecNLEResourceNodeSPtr allResources = c1413040msI.LIZIZ.getAllResources();
                    if (allResources != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (NLEResourceNode nLEResourceNode : allResources) {
                            NLEResourceNode nLEResourceNode2 = nLEResourceNode;
                            if (nLEResourceNode2.getResourceType() == NLEResType.IMAGE || nLEResourceNode2.getResourceType() == NLEResType.VIDEO) {
                                arrayList2.add(nLEResourceNode);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((NLEResourceNode) it2.next()).getResourceFile());
                        }
                        arrayList.addAll(arrayList3);
                    }
                    AVMusic aVMusic = c1413040msI.LIZJ;
                    if (aVMusic != null && (str2 = aVMusic.path) != null) {
                        arrayList.add(str2);
                    }
                } else if (abstractC1412880ms2 instanceof C1413060msK) {
                    String str3 = ((C1413060msK) abstractC1412880ms2).LIZIZ.path;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                } else if ((abstractC1412880ms2 instanceof C1413050msJ) && (str = ((C1413050msJ) abstractC1412880ms2).LIZIZ.path) != null) {
                    arrayList.add(str);
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C351930Dqx(arrayList, null), 3);
            }
            c1412800mru.LJ = abstractC1412880ms2;
        }
        this.LLILLJJLI.LLLIIIIL.remove(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.preDownloadAsset$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
