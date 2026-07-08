package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0u8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692310u8j {
    public static final void LIZ(C1692200u8Y c1692200u8Y, InterfaceC1686290tz1 interfaceC1686290tz1, AbstractC1668700tWe abstractC1668700tWe, float f, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES, int i) {
        ArrayList arrayList = (ArrayList) c1692200u8Y.LJII;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(arrayList, i2);
            c1692260u8e.LIZ.LJII(interfaceC1686290tz1, abstractC1668700tWe, f, c1693340uAO, c1693510uAf, abstractC1695860uES, i);
            interfaceC1686290tz1.LJIILJJIL(0.0f, c1692260u8e.LIZ.getHeight());
        }
    }
}
