package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.Set;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624150sMn {
    public final Keva LIZ = KevaImpl.getRepo("block_sticker_list", 1);
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(68));

    public final void LIZ(String str) {
        String str2 = (String) this.LIZIZ.getValue();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("block_sticker_list_");
        sbLIZ.append(str2);
        Set setLJLIIIL = C13LQ.LJLIIIL(keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]));
        setLJLIIIL.add(str);
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("block_sticker_list_");
        sbLIZ2.append((String) this.LIZIZ.getValue());
        keva2.storeStringArray(C2188811AlT.LIZIZ(sbLIZ2), (String[]) setLJLIIIL.toArray(new String[0]));
    }
}
