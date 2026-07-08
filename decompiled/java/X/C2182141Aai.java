package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Aai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182141Aai extends C09AY implements Function0<C2181731Aa3> {
    public final /* synthetic */ C2181471AZd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182141Aai(C2181471AZd c2181471AZd) {
        super(0);
        this.LL = c2181471AZd;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Aa3] */
    @Override // kotlin.jvm.functions.Function0
    public final C2181731Aa3 invoke() {
        final C2181471AZd c2181471AZd = this.LL;
        return new AbstractC2182271Aav() { // from class: X.1Aa3
            @Override // X.InterfaceC2182131Aah
            public final void LIZ(C2182171Aal c2182171Aal) {
                String str = c2182171Aal.LIZ.LIZ;
                List<InterfaceC2182181Aam> list = c2181471AZd.LLILZ;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (Intrinsics.LJFF(((InterfaceC2182261Aau) obj).LIZ(), str)) {
                        arrayList.add(obj);
                    }
                }
                ((ArrayList) c2181471AZd.LLILZ).removeAll(arrayList);
                StringBuilder sb = new StringBuilder("onPipelineEndSuccess, layoutKey=");
                sb.append(str);
                sb.append(", list:");
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((InterfaceC2182261Aau) it2.next()).getTaskId()));
                }
                sb.append(arrayList2);
                C20441214yg.LIZIZ("LayoutAnimationManager", sb.toString());
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC2182181Aam) it3.next()).LIZJ(c2182171Aal);
                }
            }
        };
    }
}
