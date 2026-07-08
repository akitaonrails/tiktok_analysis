package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1878207Xg extends AbstractC1878107Xf {
    public abstract String LIZLLL();

    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return Collections.singletonList(EnumC1980607pM.EQUAL);
    }

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        return Intrinsics.LJFF(LIZLLL(), str);
    }
}
