package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Aaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182151Aaj extends C09AY implements Function0<C2181721Aa2> {
    public final /* synthetic */ C2181471AZd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182151Aaj(C2181471AZd c2181471AZd) {
        super(0);
        this.LL = c2181471AZd;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Aa2] */
    @Override // kotlin.jvm.functions.Function0
    public final C2181721Aa2 invoke() {
        final C2181471AZd c2181471AZd = this.LL;
        return new C1AZC() { // from class: X.1Aa2
            @Override // X.C1AZC
            public final void LIZ(C1AZ9 c1az9, C2181431AYz c2181431AYz, List list) {
                String str = c2181431AYz.LIZIZ;
                List<InterfaceC2182021AaW> list2 = c2181471AZd.LLILZIL;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list2) {
                    if (Intrinsics.LJFF(((InterfaceC2182261Aau) obj).LIZ(), str)) {
                        arrayList.add(obj);
                    }
                }
                ((ArrayList) c2181471AZd.LLILZIL).removeAll(arrayList);
                StringBuilder sb = new StringBuilder("onMixStreamDataUpdate, layoutKey=");
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
                    ((InterfaceC2182021AaW) it3.next()).LIZIZ(c1az9, list);
                }
            }
        };
    }
}
