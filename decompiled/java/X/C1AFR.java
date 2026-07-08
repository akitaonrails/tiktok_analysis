package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AFR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFR extends C09AY implements Function0<C1AFT> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AFR(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1AFT] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1AFT invoke() {
        C1AXM c1axm = this.LL;
        final C2177031AIb c2177031AIb = c1axm.LL;
        final C1AFQ c1afq = new C1AFQ(c1axm);
        final C1AFP c1afp = new C1AFP(this.LL);
        return new C1AFV(c2177031AIb, c1afq, c1afp) { // from class: X.1AFT
            public final C2177031AIb LIZ;
            public final Function0<LinkUser> LIZIZ;
            public final Function0<Boolean> LIZJ;
            public final int LIZLLL = hashCode();

            public final String LIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InternalMicPositionManager");
                sbLIZ.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C1AFV
            public final LinkUser LJIIJ(String str) {
                Long l;
                if (this.LIZJ.invoke().booleanValue()) {
                    LinkUser linkUserLJJIFFI = this.LIZ.LJFF.LJJIFFI(str);
                    LinkUser linkUserInvoke = this.LIZIZ.invoke();
                    if (linkUserLJJIFFI == null && Intrinsics.LJFF(str, linkUserInvoke.getActualLinkMicId())) {
                        return linkUserInvoke;
                    }
                    String str2 = null;
                    if (linkUserLJJIFFI != null) {
                        l = linkUserLJJIFFI.userId;
                    } else {
                        l = null;
                    }
                    if (Intrinsics.LJFF(l, linkUserInvoke.userId)) {
                        if (linkUserLJJIFFI != null) {
                            str2 = linkUserLJJIFFI.linkMicId;
                        }
                        linkUserInvoke.setLinkMicId(str2);
                    }
                    String strLIZ = LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InternalUserManager.findLinkUserByLinkMicId(");
                    sbLIZ.append(str);
                    sbLIZ.append(") ForAnchorAndGuest. result is linkUser = ");
                    sbLIZ.append(linkUserLJJIFFI);
                    C20441214yg.LIZIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ));
                    return linkUserLJJIFFI;
                }
                String strLIZ2 = LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audience findLinkUserByLinkMicId linkMicId = ");
                sbLIZ2.append(str);
                C20441214yg.LJIIIZ(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2));
                return this.LIZ.LJFF.LJJIZ(str);
            }

            @Override // X.C1AFV
            public final LinkUser LJIIJJI(long j) {
                Long l;
                Long l2;
                if (this.LIZJ.invoke().booleanValue()) {
                    LinkUser linkUserLJJIJL = this.LIZ.LJFF.LJJIJL(j);
                    LinkUser linkUserInvoke = this.LIZIZ.invoke();
                    if (linkUserLJJIJL == null && (l2 = linkUserInvoke.userId) != null && j == l2.longValue()) {
                        return linkUserInvoke;
                    }
                    String str = null;
                    if (linkUserLJJIJL != null) {
                        l = linkUserLJJIJL.userId;
                    } else {
                        l = null;
                    }
                    if (Intrinsics.LJFF(l, linkUserInvoke.userId)) {
                        if (linkUserLJJIJL != null) {
                            str = linkUserLJJIJL.linkMicId;
                        }
                        linkUserInvoke.setLinkMicId(str);
                    }
                    String strLIZ = LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InternalUserManager.findLinkUserByUid(");
                    sbLIZ.append(j);
                    sbLIZ.append(") result is linkUser = ");
                    sbLIZ.append(linkUserLJJIJL);
                    C20441214yg.LIZIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ));
                    return linkUserLJJIJL;
                }
                return this.LIZ.LJFF.LJJJJ(j);
            }

            {
                this.LIZ = c2177031AIb;
                this.LIZIZ = c1afq;
                this.LIZJ = c1afp;
            }
        };
    }
}
