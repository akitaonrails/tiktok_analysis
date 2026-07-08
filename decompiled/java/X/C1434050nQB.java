package X;

import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434050nQB extends C1434070nQD {
    public static final Map<String, List<InterfaceC1433860nPs>> LLJILJIL = new LinkedHashMap();
    public final String LLJI;
    public final InterfaceC1433250nOt LLJIJIL;

    @Override // X.C1434070nQD
    public final void LJI(boolean z) {
        C1433500nPI c1433500nPILIZ = this.LLJIJIL.LIZ(this.LLILLJJLI);
        if (c1433500nPILIZ == null) {
            C1434060nQC.LIZ(this.LLJI);
            super.LJI(z);
            return;
        }
        if (!z) {
            Map<String, List<InterfaceC1433860nPs>> map = LLJILJIL;
            String str = this.LLJI;
            if (str == null) {
                str = "";
            }
            List list = (List) ((LinkedHashMap) map).get(str);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C1433730nPf.LJJI((InterfaceC1433360nP4) it2.next());
                }
            }
            C1434060nQC.LIZ(this.LLJI);
            return;
        }
        C1433730nPf.LJJI(this);
        LJIIIZ(c1433500nPILIZ.LLILZIL.LIZ);
        LJIIIIZZ(c1433500nPILIZ.LLILZIL.LIZ, new AwS601S0100000_22(this, 223));
    }

    public final C443120HZe<Integer, Integer, Float> LJIIJ(float f) {
        StoryGroupPublishModel storyGroupPublishModel = this.LLILLL.storyGroupPublishModel;
        if (storyGroupPublishModel != null) {
            float f2 = 1.0f / storyGroupPublishModel.scheduleCount;
            return new C443120HZe<>(Integer.valueOf(storyGroupPublishModel.childCount), Integer.valueOf(storyGroupPublishModel.childIndex + 1), Float.valueOf((storyGroupPublishModel.scheduleIndex * f2 * 100) + (f * f2)));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C1434070nQD, X.InterfaceC1433360nP4
    public final void LJFF(int i, C1434900nRY c1434900nRY) {
        String str;
        PublishModel publishModel;
        if (c1434900nRY != null && (publishModel = c1434900nRY.LIZJ) != null) {
            str = publishModel.publishId;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, this.LLILZIL.LJIIIIZZ.getValue())) {
            return;
        }
        C443120HZe<Integer, Integer, Float> c443120HZeLJIIJ = LJIIJ(i);
        if (c443120HZeLJIIJ.getThird().floatValue() < this.LLIZLLLIL) {
            this.LLILZIL.LIZJ.setValue(new C443120HZe<>(c443120HZeLJIIJ.getFirst(), c443120HZeLJIIJ.getSecond(), Float.valueOf(this.LLIZLLLIL)));
        } else {
            this.LLILZIL.LIZJ.setValue(c443120HZeLJIIJ);
            this.LLIZ = (int) c443120HZeLJIIJ.getThird().floatValue();
        }
    }

    public C1434050nQB(C1447790nmL c1447790nmL, String str, PublishModel publishModel, String str2, C1433240nOs c1433240nOs) {
        super(c1447790nmL, str, publishModel);
        this.LLJI = str2;
        this.LLJIJIL = c1433240nOs;
        if (Intrinsics.LJFF(str, ((IAVPublishService) this.LLILZLL.getValue()).getCurrentPublishTaskId())) {
            C1434100nQG c1434100nQG = this.LLILZIL;
            c1434100nQG.LIZJ.setValue(LJIIJ(0.0f));
        }
    }
}
