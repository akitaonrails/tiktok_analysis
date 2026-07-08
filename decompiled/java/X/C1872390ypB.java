package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ypB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872390ypB implements InterfaceC1872430ypF {
    public final /* synthetic */ AbstractC1872380ypA LIZ;
    public final /* synthetic */ InterfaceC1063920dnC LIZIZ;

    public C1872390ypB(AbstractC1872380ypA abstractC1872380ypA, InterfaceC1063920dnC interfaceC1063920dnC) {
        this.LIZ = abstractC1872380ypA;
        this.LIZIZ = interfaceC1063920dnC;
    }

    @Override // X.InterfaceC1872430ypF
    public final void LIZ(C1872410ypD c1872410ypD, String str) {
        if (c1872410ypD.LIZ == null) {
            AbstractC1872380ypA abstractC1872380ypA = this.LIZ;
            InterfaceC1063920dnC interfaceC1063920dnC = this.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            abstractC1872380ypA.getClass();
            AbstractC1064500do8.LIZJ(interfaceC1063920dnC, -5, "", linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str2 = c1872410ypD.LIZ;
        if (str2 != null) {
            linkedHashMap2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        }
        Boolean bool = c1872410ypD.LIZIZ;
        if (bool != null) {
            linkedHashMap2.put("alreadyLoggedIn", Boolean.valueOf(bool.booleanValue()));
        }
        AbstractC1872380ypA abstractC1872380ypA2 = this.LIZ;
        InterfaceC1063920dnC interfaceC1063920dnC2 = this.LIZIZ;
        abstractC1872380ypA2.getClass();
        AbstractC1064500do8.LJ(interfaceC1063920dnC2, str, linkedHashMap2);
    }
}
