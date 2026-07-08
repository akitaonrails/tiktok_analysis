package Y;

import X.C1412860ms0;
import X.C1412940ms8;
import X.C1414450muZ;
import X.C1455250nyN;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1437705jz;
import com.ss.android.ugc.gamora.editor.mixediting.resource.utils.MixAssetDownloader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS11S0310000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> linkedList = ((MixAssetDownloader) this.l0).LLILZ;
        C1412860ms0 c1412860ms0 = (C1412860ms0) this.l1;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                if (MixAssetDownloader.LJII(it2.next().getFirst(), c1412860ms0)) {
                    MixAssetDownloader mixAssetDownloader = (MixAssetDownloader) this.l0;
                    ((C1412860ms0) this.l1).LIZ.getAsset_id();
                    ((MixAssetDownloader) this.l0).LLILZ.size();
                    mixAssetDownloader.getClass();
                    ((MixAssetDownloader) this.l0).LLILZ.add(new Pair<>((C1412860ms0) this.l1, (InterfaceC1437705jz) this.l2));
                    return;
                }
            }
        }
        if (this.z3) {
            ((MixAssetDownloader) this.l0).LLILZLL.add(0, new Pair<>((C1412860ms0) this.l1, (InterfaceC1437705jz) this.l2));
        } else {
            ((MixAssetDownloader) this.l0).LLIZ.add(new Pair<>((C1412860ms0) this.l1, (InterfaceC1437705jz) this.l2));
        }
        ((MixAssetDownloader) this.l0).LJFF();
    }

    public final void LIZ$1() {
        MixAssetDownloader mixAssetDownloader = (MixAssetDownloader) this.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess(), name=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getTitle());
        sbLIZ.append(", id=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getAsset_id());
        sbLIZ.append(", type=");
        sbLIZ.append(((C1412860ms0) this.l1).LIZ.getAsset_consumer_type());
        sbLIZ.append(", ");
        sbLIZ.append(this.z3);
        C2188811AlT.LIZIZ(sbLIZ);
        mixAssetDownloader.getClass();
        LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> linkedList = ((MixAssetDownloader) this.l0).LLILZ;
        C1412860ms0 c1412860ms0 = (C1412860ms0) this.l1;
        ArrayList arrayList = new ArrayList();
        for (Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair : linkedList) {
            if (MixAssetDownloader.LJII(pair.getFirst(), c1412860ms0)) {
                arrayList.add(pair);
            }
        }
        C1412860ms0 c1412860ms02 = (C1412860ms0) this.l2;
        boolean z = this.z3;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1437705jz) ((Pair) it2.next()).getSecond()).LIZIZ(c1412860ms02, z);
        }
        C1412940ms8.LIZ(C1412940ms8.LIZ, (C1412860ms0) this.l2, this.z3, 0, ((MixAssetDownloader) this.l0).LLILLL.invoke());
        MixAssetDownloader mixAssetDownloader2 = (MixAssetDownloader) this.l0;
        C1412860ms0 c1412860ms03 = (C1412860ms0) this.l1;
        C1414450muZ.LJFF(mixAssetDownloader2.LLILZ, new AwS388S0200000_22(mixAssetDownloader2, c1412860ms03, 279));
        C1414450muZ.LJFF(mixAssetDownloader2.LLILZIL, new AwS388S0200000_22(mixAssetDownloader2, c1412860ms03, 280));
        mixAssetDownloader2.LJFF();
    }

    public static final void run$0(ARunnableS11S0310000_22 aRunnableS11S0310000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.nextStepCustom$2$1$1");
        try {
            ((C1455250nyN) aRunnableS11S0310000_22.l0).LLLLLZL(aRunnableS11S0310000_22.z3, (Runnable) aRunnableS11S0310000_22.l1, (Runnable) aRunnableS11S0310000_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.nextStepCustom$2$1$1");
    }

    public static final void run$1(ARunnableS11S0310000_22 aRunnableS11S0310000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MixAssetDownloader@efb0.downloadData$1");
        try {
            aRunnableS11S0310000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixAssetDownloader@efb0.downloadData$1");
    }

    public static final void run$2(ARunnableS11S0310000_22 aRunnableS11S0310000_22) {
        boolean zLIZ;
        C1C7U.LIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onSuccess$1");
        try {
            aRunnableS11S0310000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixAssetDownloader@efb0.getWrappedCallback$1$onSuccess$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S0310000_22(Object obj, MixAssetDownloader mixAssetDownloader, C1412860ms0 c1412860ms0, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = mixAssetDownloader;
        this.l2 = c1412860ms0;
        this.z3 = interfaceC1437705jz;
    }
}
