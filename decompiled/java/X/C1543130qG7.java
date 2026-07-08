package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543130qG7 implements InterfaceC1543170qGB {
    public final List<InterfaceC1543170qGB> LIZ;

    public C1543130qG7() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new InterfaceC1543170qGB() { // from class: X.0qG8
            @Override // X.InterfaceC1543170qGB
            public final Boolean LIZ(C1543910qHN c1543910qHN) {
                boolean z;
                if (UriProtector.parse(c1543910qHN.LJI).getHost() == null) {
                    EnumC1063540dma enumC1063540dma = c1543910qHN.LJIILL;
                    if (enumC1063540dma == null) {
                        return null;
                    }
                    if (enumC1063540dma == EnumC1063540dma.PUBLIC) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EmptyHostAuthFilter doAuthFilter result = ");
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                    return Boolean.valueOf(z);
                }
                int i2 = C2187451AjH.LIZ;
                InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
                return Boolean.FALSE;
            }
        });
        arrayList.add(new InterfaceC1543170qGB() { // from class: X.0qFr
            @Override // X.InterfaceC1543170qGB
            public final Boolean LIZ(C1543910qHN c1543910qHN) {
                String host = UriProtector.parse(c1543910qHN.LJI).getHost();
                EnumC1063540dma enumC1063540dma = c1543910qHN.LJIILL;
                if (enumC1063540dma == null) {
                    return null;
                }
                if (enumC1063540dma != EnumC1063540dma.SECURE && host != null) {
                    for (String str : C1542900qFk.LIZIZ) {
                        if (!Intrinsics.LJFF(host, str)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('.');
                            sbLIZ.append(str);
                            if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            }
                        }
                        c1543910qHN.LJIILLIIL = EnumC1063540dma.PRIVATE;
                        int i = C2187451AjH.LIZ;
                        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                        return Boolean.TRUE;
                    }
                }
                int i2 = C2187451AjH.LIZ;
                InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
                return Boolean.FALSE;
            }
        });
        arrayList.add(new InterfaceC1543170qGB() { // from class: X.0qG6
            /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
            @Override // X.InterfaceC1543170qGB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean LIZ(X.C1543910qHN r17) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1543120qG6.LIZ(X.0qHN):java.lang.Boolean");
            }
        });
    }

    @Override // X.InterfaceC1543170qGB
    public final Boolean LIZ(C1543910qHN c1543910qHN) {
        Boolean bool = Boolean.FALSE;
        Iterator<InterfaceC1543170qGB> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            Boolean boolLIZ = it2.next().LIZ(c1543910qHN);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(boolLIZ, bool2)) {
                return bool2;
            }
            if (boolLIZ == null) {
                bool = null;
            }
        }
        return bool;
    }
}
