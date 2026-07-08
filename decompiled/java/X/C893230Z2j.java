package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: renamed from: X.0Z2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893230Z2j implements InterfaceC893240Z2k {
    public final InterfaceC1755906uD LIZ;

    @Override // X.InterfaceC905160Zf8
    public final InterfaceC904700ZeO get() {
        final InterfaceC1755906uD interfaceC1755906uD = this.LIZ;
        return new InterfaceC904700ZeO(interfaceC1755906uD) { // from class: X.0Z1U
            public final InterfaceC1755906uD LIZ;
            public final C2252321DDq LIZIZ;
            public final C2252321DDq LIZJ;
            public int LIZLLL;

            @Override // X.InterfaceC904700ZeO
            public final void C() {
                if (this.LIZ.LJJJJI()) {
                    return;
                }
                this.LIZ.LJ();
            }

            @Override // X.InterfaceC904700ZeO
            public final void Fj() {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZ.getConversationId());
                boolean zHasMore = c0y8tLIZ != null ? c0y8tLIZ.isStranger() ? false : c0y8tLIZ.hasMore() : true;
                if (!this.LIZ.LJIJ() || zHasMore) {
                    LJ(this.LIZ.LJJJJIZL());
                }
            }

            @Override // X.InterfaceC904700ZeO
            public final boolean LIZ() {
                return this.LIZ.LJIJ();
            }

            @Override // X.InterfaceC904700ZeO
            public final boolean LIZIZ() {
                return this.LIZ.LJJJJI();
            }

            @Override // X.InterfaceC904700ZeO
            public final void LIZJ() {
                int iLJJJJIZL = this.LIZ.LJJJJIZL();
                if (50 >= iLJJJJIZL) {
                    iLJJJJIZL = 50;
                }
                LJ(iLJJJJIZL + 1);
            }

            {
                this.LIZ = interfaceC1755906uD;
                C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC2006307tV.NORMAL_STATE);
                this.LIZIZ = c2252321DDqLIZ;
                this.LIZJ = c2252321DDqLIZ;
            }

            public final void LJ(int i) {
                Object value = this.LIZJ.getValue();
                EnumC2006307tV enumC2006307tV = EnumC2006307tV.LOAD_MORE_STATE;
                if (value == enumC2006307tV) {
                    return;
                }
                this.LIZLLL = this.LIZ.LJJJJIZL();
                this.LIZ.LJIIJJI(i);
                this.LIZIZ.setValue(enumC2006307tV);
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                if (iMALogApiLIZ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LoadMoreMsgController loadMore saved=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", set=");
                    sbLIZ.append(i);
                    sbLIZ.append(", modelLimit=");
                    sbLIZ.append(this.LIZ.LJJJJIZL());
                    sbLIZ.append(", convId=");
                    sbLIZ.append(this.LIZ.getConversationId());
                    iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZ.LJIIJ();
                IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
                if (iIMMessageAdapterAnalytics != null) {
                    iIMMessageAdapterAnalytics.LJIIJ(this.LIZ.LIZLLL().size(), C0I0B.LJFF.LIZIZ());
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
            @Override // X.InterfaceC904700ZeO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(java.util.List r6, kotlin.jvm.internal.AwS558S0100000_14 r7) {
                /*
                    r5 = this;
                    boolean r4 = r6 instanceof java.util.Collection
                    r2 = 0
                    if (r4 == 0) goto L12
                    boolean r0 = r6.isEmpty()
                    if (r0 == 0) goto L12
                Lb:
                    boolean r0 = r6.isEmpty()
                    if (r0 == 0) goto L9d
                L11:
                    return
                L12:
                    java.util.Iterator r3 = r6.iterator()
                L16:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L99
                    java.lang.Object r1 = r3.next()
                    X.0ZeS r1 = (X.InterfaceC904740ZeS) r1
                    boolean r0 = r1 instanceof X.C1762006vC
                    if (r0 != 0) goto L36
                    boolean r0 = r1 instanceof X.C07U1
                    if (r0 != 0) goto L36
                    boolean r0 = r1 instanceof X.C07U2
                    if (r0 == 0) goto L16
                    X.07U2 r1 = (X.C07U2) r1
                    java.lang.Object r0 = r1.LIZ
                    boolean r0 = r0 instanceof X.C888320Yt4
                    if (r0 == 0) goto L16
                L36:
                    X.1DDq r0 = r5.LIZJ
                    java.lang.Object r1 = r0.getValue()
                    X.07tV r0 = X.EnumC2006307tV.LOAD_MORE_STATE
                    if (r1 != r0) goto L53
                    int r1 = r5.LIZLLL
                    if (r1 <= 0) goto L53
                    X.06uD r0 = r5.LIZ
                    int r0 = r0.LJJJJIZL()
                    if (r1 == r0) goto L53
                    r5.LIZLLL = r2
                    X.06uD r0 = r5.LIZ
                    r0.LJIIJJI(r2)
                L53:
                    X.1DDq r1 = r5.LIZIZ
                    X.07tV r0 = X.EnumC2006307tV.NORMAL_STATE
                    r1.setValue(r0)
                    X.0Z53 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi r3 = X.C0Z53.LIZ()
                    if (r3 == 0) goto L99
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "LoadMoreMsgController clearState savedAfter="
                    r1.append(r0)
                    int r0 = r5.LIZLLL
                    r1.append(r0)
                    java.lang.String r0 = ", modelLimitAfter="
                    r1.append(r0)
                    X.06uD r0 = r5.LIZ
                    int r0 = r0.LJJJJIZL()
                    r1.append(r0)
                    java.lang.String r0 = ", convId="
                    r1.append(r0)
                    X.06uD r0 = r5.LIZ
                    java.lang.String r0 = r0.getConversationId()
                    r1.append(r0)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                    r1 = 4
                    java.lang.String r0 = "IM-Chatroom"
                    r3.LIZ(r1, r0, r2)
                L99:
                    if (r4 == 0) goto L9d
                    goto Lb
                L9d:
                    java.util.Iterator r1 = r6.iterator()
                La1:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L11
                    java.lang.Object r0 = r1.next()
                    boolean r0 = r0 instanceof X.C1762006vC
                    if (r0 == 0) goto La1
                    java.lang.Object r0 = r7.invoke()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L11
                    r5.Fj()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Z1U.LIZLLL(java.util.List, kotlin.jvm.internal.AwS558S0100000_14):void");
            }
        };
    }

    public C893230Z2j(InterfaceC1755906uD interfaceC1755906uD) {
        this.LIZ = interfaceC1755906uD;
    }
}
