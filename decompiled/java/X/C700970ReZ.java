package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ReZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700970ReZ extends C701030Ref implements C0RZK {
    public final String LIZJ;
    public FcpNodeProtocol LIZLLL;
    public C700950ReX LJFF;
    public boolean LJI;
    public boolean LJII;
    public C701240Rf0 LJIIIIZZ;
    public String LJ = "inited";
    public final Map<String, C701030Ref> LJIIIZ = new LinkedHashMap();

    @Override // X.C0RZK
    public final String LLLII() {
        return this.LIZJ;
    }

    @Override // X.C0RZK
    public final String getKey() {
        return this.LIZJ;
    }

    public C700970ReZ(String str) {
        this.LIZJ = str;
    }

    public final void LJ(C701030Ref c701030Ref) {
        C700970ReZ c700970ReZ;
        String str;
        synchronized (this) {
            Intrinsics.LJFF(c701030Ref.LIZ, this);
            c701030Ref.LIZ = null;
            ((ArrayList) this.LIZIZ).remove(c701030Ref);
        }
        if ((c701030Ref instanceof C700970ReZ) && (c700970ReZ = (C700970ReZ) c701030Ref) != null && (str = c700970ReZ.LIZJ) != null) {
            this.LJIIIZ.put(str, c701030Ref);
        }
    }

    public final void LIZLLL(C700970ReZ c700970ReZ, int i) {
        synchronized (this) {
            c700970ReZ.LIZ = this;
            if (i != ((ArrayList) this.LIZIZ).size() && i != -1) {
                if (i < ((ArrayList) this.LIZIZ).size()) {
                    ListProtector.set(this.LIZIZ, i, c700970ReZ);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("adoptChild index: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", children.size: ");
                    sbLIZ.append(((ArrayList) this.LIZIZ).size());
                    throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                ((ArrayList) this.LIZIZ).add(c700970ReZ);
            }
        }
        String str = c700970ReZ.LIZJ;
        if (str != null) {
            this.LJIIIZ.remove(str);
        }
    }
}
