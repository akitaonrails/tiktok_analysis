package X;

import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: renamed from: X.12IR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12IR implements InterfaceC1684900twm {
    public final /* synthetic */ InterfaceC770150UIz LIZ;

    public C12IR(InterfaceC770150UIz interfaceC770150UIz) {
        this.LIZ = interfaceC770150UIz;
    }

    @Override // X.InterfaceC1684900twm
    public final void LIZ(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        final ArrayList arrayList = new ArrayList();
        if (aSSimpleFaceInfoArr != null && aSSimpleFaceInfoArr.length > 0) {
            Arrays.stream(aSSimpleFaceInfoArr).forEach(new Consumer() { // from class: X.12IQ
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add(Float.valueOf(((ASSimpleFaceInfo) obj).boyProb));
                }
            });
        }
        InterfaceC770150UIz interfaceC770150UIz = this.LIZ;
        if (interfaceC770150UIz != null) {
            interfaceC770150UIz.LIZ(arrayList);
        }
    }
}
