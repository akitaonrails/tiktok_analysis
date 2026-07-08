package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075810e6N extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1075800e6M LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075810e6N(C1075800e6M c1075800e6M) {
        super(0);
        this.LL = c1075800e6M;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        MatchedFriendStruct matchedFriendStruct;
        List<InterfaceC1891350zJl> listLIZ = this.LL.LIZJ.LIZ();
        int size = 0;
        if (listLIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLIZ) {
                InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                if ((interfaceC1891350zJl2 instanceof C1261650iw7) && (matchedFriendStruct = ((C1261650iw7) interfaceC1891350zJl2).LLILZIL.getMatchedFriendStruct()) != null && Intrinsics.LJFF(matchedFriendStruct.isNewMaF(), Boolean.TRUE)) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            size = arrayList.size();
        }
        return Integer.valueOf(size);
    }
}
