package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YVE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVE implements InterfaceC906010ZgV {
    public final ConcurrentHashMap<String, InterfaceC332260D0u<StreamingResponseData>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC332260D0u<List<BlockUIData>>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public static InterfaceC870590YDh LJIIJ() {
        C0YHX c0yhxLIZ;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null) {
            return null;
        }
        return c0yhxLIZ.LJIIJ();
    }

    @Override // X.InterfaceC906010ZgV
    public final void LIZ(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C0YVC(set, this, null), 3);
    }

    @Override // X.InterfaceC906010ZgV
    public final void LIZIZ(String str) {
        this.LIZ.remove(str);
        this.LIZIZ.remove(str);
        this.LIZJ.remove(str);
    }

    @Override // X.InterfaceC906010ZgV
    public final C875220YVc LIZJ(C869590Y9l c869590Y9l) {
        byte[] bArrLLJ;
        C906250Zgt c098200Yq;
        String strLJFF;
        String uuid = c869590Y9l.getUuid();
        InterfaceC870590YDh interfaceC870590YDhLJIIJ = LJIIJ();
        String strLJFF2 = null;
        if (interfaceC870590YDhLJIIJ == null || (bArrLLJ = interfaceC870590YDhLJIIJ.LLJ(uuid)) == null) {
            return null;
        }
        try {
            c098200Yq = C906250Zgt.ADAPTER.decode(bArrLLJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C906250Zgt c906250Zgt = (C906250Zgt) c098200Yq;
        if (c906250Zgt == null) {
            return null;
        }
        StreamingResponseData streamingResponseDataLJ = C906350Zh3.LJ(c906250Zgt, null);
        List<C906290Zgx> list = c906250Zgt.blocks;
        ArrayList<StreamBlockComponent> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C906290Zgx> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C906350Zh3.LIZ(it2.next()));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (StreamBlockComponent streamBlockComponent : arrayList) {
            BlockUIData.Companion.getClass();
            arrayList2.add(C906150Zgj.LIZ(streamBlockComponent));
        }
        InterfaceC870590YDh interfaceC870590YDhLJIIJ2 = LJIIJ();
        if (interfaceC870590YDhLJIIJ2 != null) {
            strLJFF = interfaceC870590YDhLJIIJ2.LJFF(uuid, "im_streaming_business_scene");
        } else {
            strLJFF = null;
        }
        InterfaceC870590YDh interfaceC870590YDhLJIIJ3 = LJIIJ();
        if (interfaceC870590YDhLJIIJ3 != null) {
            strLJFF2 = interfaceC870590YDhLJIIJ3.LJFF(uuid, "im_streaming_cancelled");
        }
        boolean zLJFF = Intrinsics.LJFF(strLJFF2, "1");
        LJIIIZ(streamingResponseDataLJ.replyClientMessageId).setValue(streamingResponseDataLJ);
        LJIIIIZZ(streamingResponseDataLJ.replyClientMessageId).setValue(arrayList2);
        if (strLJFF != null) {
            this.LIZJ.put(streamingResponseDataLJ.replyClientMessageId, strLJFF);
        }
        return new C875220YVc(arrayList2, streamingResponseDataLJ, strLJFF, zLJFF);
    }

    @Override // X.InterfaceC906010ZgV
    public final String LJFF(String str) {
        return this.LIZJ.get(str);
    }

    @Override // X.InterfaceC906010ZgV
    public final Unit LJI(String str) {
        InterfaceC870590YDh interfaceC870590YDhLJIIJ = LJIIJ();
        if (interfaceC870590YDhLJIIJ != null) {
            Boolean.valueOf(interfaceC870590YDhLJIIJ.LLJJIJI(str, "im_streaming_data"));
        }
        InterfaceC870590YDh interfaceC870590YDhLJIIJ2 = LJIIJ();
        if (interfaceC870590YDhLJIIJ2 != null) {
            Boolean.valueOf(interfaceC870590YDhLJIIJ2.LLJJIJI(str, "im_streaming_cancelled"));
        }
        return Unit.LIZ;
    }

    public final InterfaceC332260D0u<List<BlockUIData>> LJIIIIZZ(String str) {
        InterfaceC332260D0u<List<BlockUIData>> interfaceC332260D0u;
        InterfaceC332260D0u<List<BlockUIData>> interfaceC332260D0uPutIfAbsent;
        InterfaceC332260D0u<List<BlockUIData>> interfaceC332260D0u2 = this.LIZIZ.get(str);
        if (interfaceC332260D0u2 != null) {
            return interfaceC332260D0u2;
        }
        synchronized (this.LIZIZ) {
            try {
                ConcurrentHashMap<String, InterfaceC332260D0u<List<BlockUIData>>> concurrentHashMap = this.LIZIZ;
                InterfaceC332260D0u<List<BlockUIData>> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
                if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(C13BV.INSTANCE)))) != null) {
                    interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
                }
                interfaceC332260D0u = interfaceC332260D0uLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC332260D0u;
    }

    public final InterfaceC332260D0u<StreamingResponseData> LJIIIZ(String str) {
        InterfaceC332260D0u<StreamingResponseData> interfaceC332260D0u;
        InterfaceC332260D0u<StreamingResponseData> interfaceC332260D0uPutIfAbsent;
        InterfaceC332260D0u<StreamingResponseData> interfaceC332260D0u2 = this.LIZ.get(str);
        if (interfaceC332260D0u2 != null) {
            return interfaceC332260D0u2;
        }
        synchronized (this.LIZ) {
            try {
                ConcurrentHashMap<String, InterfaceC332260D0u<StreamingResponseData>> concurrentHashMap = this.LIZ;
                InterfaceC332260D0u<StreamingResponseData> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
                if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(null)))) != null) {
                    interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
                }
                interfaceC332260D0u = interfaceC332260D0uLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC332260D0u;
    }

    @Override // X.InterfaceC906010ZgV
    public final Object LJ(String str, String str2, C906000ZgU c906000ZgU) throws Throwable {
        Object objLJI = C23250099c.LJI(c906000ZgU, C0PEM.LIZJ, new C0YVF(this, str, str2, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC906010ZgV
    public final Object LIZLLL(String str, String str2, String str3, C905960ZgQ c905960ZgQ) throws Throwable {
        if (str3 != null) {
            this.LIZJ.put(str, str3);
            Object objLJI = C23250099c.LJI(c905960ZgQ, C0PEM.LIZJ, new C0YVD(this, str, str2, str3, null));
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC906010ZgV
    public final Object LJII(String str, String str2, StreamingResponseData streamingResponseData, List list, AbstractC23140094w abstractC23140094w) throws Throwable {
        LJIIIZ(str).setValue(streamingResponseData);
        LJIIIIZZ(str).setValue(list);
        Object objLJI = C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C906170Zgl(streamingResponseData, list, this, str2, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
