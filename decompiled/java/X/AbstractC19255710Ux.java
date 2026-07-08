package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19255710Ux extends C10VA {
    public abstract boolean LIZLLL();

    @Override // X.C10VA
    public final List<EnumC19255510Uv> LIZJ() {
        return Collections.singletonList(EnumC19255510Uv.EQUAL);
    }

    @Override // X.C10VA
    public final boolean LIZIZ(EnumC19255510Uv enumC19255510Uv, String str) {
        if (Intrinsics.LJFF(str, "1")) {
            return LIZLLL();
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return !LIZLLL();
        }
        return false;
    }
}
