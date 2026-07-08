package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.AwS212S0300000_3;
import kotlin.jvm.internal.AwS37S0600000_22;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0nYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439160nYQ {
    public final Context LIZ;
    public final InterfaceC1421890n6Z LIZIZ;
    public final C1439840nZW LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 122));

    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r19) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439160nYQ.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft):void");
    }

    public C1439160nYQ(Context context, C1421880n6Y c1421880n6Y) {
        this.LIZ = context;
        this.LIZIZ = c1421880n6Y;
        this.LIZJ = new C1439840nZW(context);
    }

    public final void LIZIZ(CreativeInfo creativeInfo, List<C2492609pk> list, AtomicInteger atomicInteger, ArrayList<C2492609pk> arrayList) throws Throwable {
        int i = atomicInteger.get();
        if (i >= list.size()) {
            if (!arrayList.isEmpty()) {
                C0MVS.LIZ(C0MVS.LIZIZ(creativeInfo));
            }
            this.LIZIZ.LIZ(arrayList);
            return;
        }
        C2492609pk c2492609pk = (C2492609pk) ListProtector.get(list, i);
        AwS37S0600000_22 awS37S0600000_22 = new AwS37S0600000_22((ArrayList) arrayList, (ArrayList<C2492609pk>) c2492609pk, (C2492609pk) atomicInteger, (AtomicInteger) this, (C1439160nYQ) creativeInfo, (CreativeInfo) list, (List<C2492609pk>) 2);
        C1439840nZW c1439840nZW = this.LIZJ;
        String str = c2492609pk.LIZ;
        String str2 = c2492609pk.LIZIZ;
        AwS212S0300000_3 awS212S0300000_3 = new AwS212S0300000_3(awS37S0600000_22, c2492609pk, this, 10);
        c1439840nZW.getClass();
        C1439840nZW.LIZ(str, new AwS105S1200000_22(awS212S0300000_3, c1439840nZW, str2, 6));
    }
}
