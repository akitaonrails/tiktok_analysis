package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HGL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HGL {
    public final int LIZ;
    public final List<MixStudioNetworkElement> LIZIZ;

    public final List<InterfaceC440090HNn> LIZ(C0H6S c0h6s) {
        InterfaceC440090HNn c435610H6h;
        String str;
        ArrayList arrayList = new ArrayList();
        List<MixStudioNetworkElement> list = this.LIZIZ;
        ArrayList<MixStudioNetworkElement> arrayList2 = new ArrayList();
        for (MixStudioNetworkElement mixStudioNetworkElement : list) {
            MixStudioNetworkElement mixStudioNetworkElement2 = mixStudioNetworkElement;
            Integer num = c0h6s.LIZ;
            if (num == null || Intrinsics.LJFF(mixStudioNetworkElement2.type, num)) {
                Boolean bool = c0h6s.LIZIZ;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        if (!Intrinsics.LJFF(mixStudioNetworkElement2.promoted, Boolean.TRUE)) {
                        }
                    } else if (Intrinsics.LJFF(mixStudioNetworkElement2.promoted, Boolean.TRUE)) {
                    }
                }
                arrayList2.add(mixStudioNetworkElement);
            }
        }
        for (MixStudioNetworkElement mixStudioNetworkElement3 : arrayList2) {
            Integer num2 = mixStudioNetworkElement3.type;
            if (num2 != null && mixStudioNetworkElement3.data != null) {
                if (num2.intValue() == 3) {
                    c435610H6h = new C435610H6h(new Emoji(mixStudioNetworkElement3.data), this.LIZ);
                } else if (num2.intValue() == 4) {
                    String str2 = mixStudioNetworkElement3.url;
                    if (str2 != null && (str = mixStudioNetworkElement3.id) != null) {
                        c435610H6h = new C435750H6v(mixStudioNetworkElement3.data, str2, str, this.LIZ);
                    }
                } else if (num2.intValue() == 2) {
                    c435610H6h = new C0HGK(mixStudioNetworkElement3.data);
                }
                arrayList.add(c435610H6h);
            }
        }
        return arrayList;
    }

    public C0HGL(int i, List<MixStudioNetworkElement> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
