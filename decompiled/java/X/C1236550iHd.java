package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0iHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236550iHd implements InterfaceC1194840hCM {
    public final /* synthetic */ List<String> LIZ;

    public C1236550iHd(List<String> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC1194840hCM
    public final void LIZ(C1845940y8W c1845940y8W, int i) {
        c1845940y8W.LIZIZ((CharSequence) ListProtector.get(this.LIZ, i));
    }
}
