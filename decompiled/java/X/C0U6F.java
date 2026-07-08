package X;

import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import webcast.data.EffectStruct;

/* JADX INFO: renamed from: X.0U6F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6F extends C0U5H {
    public final C0U6E LIZJ = new C0U6E();
    public final C0U64 LIZLLL = new C0U64();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(557));

    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        return this.LIZJ.LJI(effectChannelResponse);
    }

    @Override // X.C0U5H, X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        this.LIZLLL.LJIIIZ(list);
        return list;
    }

    public static List LJIIZILJ(String str, boolean z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiveEffect liveEffectLJ = C0UEO.LJ((EffectStruct) it2.next());
            liveEffectLJ.LJIIJJI("search");
            liveEffectLJ.LJLLI(C0U6H.SEARCH);
            liveEffectLJ.LJIJI();
            if (!z) {
                liveEffectLJ.LJFF(str);
            }
            C767250U7v.LIZIZ(1, liveEffectLJ);
            arrayList.add(liveEffectLJ);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C767780U9w c767780U9w = C767780U9w.LIZ;
            if (!C767780U9w.LIZIZ((LiveEffect) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static Object LJIILLIIL(String str, int i, boolean z, C0U6G c0u6g) {
        int i2;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c0u6g));
        C480460Ism.LIZ().getClass();
        EffectRelatedApi effectRelatedApi = (EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class);
        if (z) {
            i2 = 10;
        } else {
            i2 = 20;
        }
        effectRelatedApi.requestSearchEffectList(str, i, i2, C0UD4.LIZIZ, ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).getEPVersion()).LJL(C11S5.LIZ()).LJJLL(new C516201zk(c23260099m, 346), new C516201zk(c23260099m, 347));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c0u6g);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.lang.String r9, int r10, boolean r11, X.InterfaceC1364105Vn<? super X.C402501hP> r12) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U6F.LJIJ(java.lang.String, int, boolean, X.05Vn):java.lang.Object");
    }
}
