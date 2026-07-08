package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1878307Xh extends AbstractC1878107Xf {
    public abstract boolean LIZLLL();

    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return Collections.singletonList(EnumC1980607pM.EQUAL);
    }

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        if (Intrinsics.LJFF(str, "1")) {
            return LIZLLL();
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return !LIZLLL();
        }
        return false;
    }
}
