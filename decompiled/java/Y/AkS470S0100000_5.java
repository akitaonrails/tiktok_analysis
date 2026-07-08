package Y;

import X.AbstractC19852312lt;
import X.C0CHQ;
import X.C11NZ;
import X.C13LP;
import X.C1428470nHB;
import X.C15438062q;
import X.C1638440sjq;
import X.C1639650sln;
import X.C1639670slp;
import X.C2356009La;
import X.C297650Blb;
import X.C366710EZh;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class AkS470S0100000_5 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public AkS470S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS470S0100000_5 akS470S0100000_5, Object obj) {
        return AbstractC19852312lt.fromNullable(VEUtils.getVideoFileInfo(((VideoPublishEditModel) akS470S0100000_5.l0).videoPath()));
    }

    public static final Object apply$1(AkS470S0100000_5 akS470S0100000_5, Object obj) {
        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ;
        if (C297650Blb.LIZ() && ((VideoPublishEditModel) akS470S0100000_5.l0).isUploadVideo()) {
            if (C1428470nHB.LJJZZI((VideoPublishEditModel) akS470S0100000_5.l0)) {
                vEVideoFileInfoLIZ = null;
            } else {
                C2356009La c2356009La = C2356009La.LIZ;
                String strVideoPath = ((VideoPublishEditModel) akS470S0100000_5.l0).videoPath();
                c2356009La.getClass();
                vEVideoFileInfoLIZ = C2356009La.LIZ(strVideoPath);
            }
            return AbstractC19852312lt.fromNullable(vEVideoFileInfoLIZ);
        }
        return AbstractC19852312lt.fromNullable(VEUtils.getVideoFileInfo(((VideoPublishEditModel) akS470S0100000_5.l0).videoPath()));
    }

    public static final Object apply$2(AkS470S0100000_5 akS470S0100000_5, Object obj) {
        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ;
        if (C297650Blb.LIZ() && ((VideoPublishEditModel) akS470S0100000_5.l0).isUploadVideo()) {
            if (C1428470nHB.LJJZZI((VideoPublishEditModel) akS470S0100000_5.l0)) {
                vEVideoFileInfoLIZ = null;
            } else {
                C2356009La c2356009La = C2356009La.LIZ;
                String strVideoPath = ((VideoPublishEditModel) akS470S0100000_5.l0).videoPath();
                c2356009La.getClass();
                vEVideoFileInfoLIZ = C2356009La.LIZ(strVideoPath);
            }
            return AbstractC19852312lt.fromNullable(vEVideoFileInfoLIZ);
        }
        return AbstractC19852312lt.fromNullable(VEUtils.getVideoFileInfo(((VideoPublishEditModel) akS470S0100000_5.l0).videoPath()));
    }

    public static final Object apply$3(AkS470S0100000_5 akS470S0100000_5, Object obj) {
        C1639670slp next;
        C11NZ<C1639650sln> c11nzLJIL;
        C1638440sjq c1638440sjq = (C1638440sjq) obj;
        ArrayList<String> arrayList = ((C366710EZh) akS470S0100000_5.l0).LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str : arrayList) {
            Iterator<C1639670slp> it2 = c1638440sjq.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str2 = next.LIZ;
                    str2.toString();
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1639670slp c1639670slp = next;
            if (c1639670slp != null && (c11nzLJIL = C0CHQ.LIZ().LJJIL().LIZIZ().LJIL(c1639670slp)) != null) {
                arrayList2.add(c11nzLJIL);
            } else {
                StringBuilder sb = new StringBuilder("selectedFilterId : ");
                sb.append(str);
                sb.append(" not find In filters : ");
                List<C1639670slp> list = c1638440sjq.LIZ;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1639670slp> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().LIZ);
                }
                sb.append(arrayList3);
                throw new RuntimeException(sb.toString());
            }
        }
        return C11NZ.LJJJLIIL(C13LP.LLIIII(arrayList2));
    }
}
