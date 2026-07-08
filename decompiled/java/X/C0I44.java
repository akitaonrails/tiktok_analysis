package X;

import android.content.Context;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import java.util.List;
import kotlin.jvm.internal.AwS111S0400000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I44, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I44 implements InterfaceC460500I4a {
    public final Context LL;

    public C0I44(Context context) {
        this.LL = context;
    }

    @Override // X.C0I4V
    public final C0I3K<C460810I5f> LIZ(C869590Y9l c869590Y9l) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
        if (referenceInfoHintLJIIIZ == null) {
            final C1233704sB c1233704sB = new C1233704sB(2131831101, (List<String>) null);
            AbstractC1236404sc abstractC1236404sc = new AbstractC1236404sc(c1233704sB) { // from class: X.04sW
                public final InterfaceC460300I3g LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1235804sW) && Intrinsics.LJFF(this.LIZIZ, ((C1235804sW) obj).LIZIZ);
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextFromBaseContent(data=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1236404sc
                public final InterfaceC460300I3g LIZ() {
                    return this.LIZIZ;
                }

                {
                    super(c1233704sB);
                    this.LIZIZ = c1233704sB;
                }
            };
            long refMsgId = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
            if (referenceInfo != null) {
                l3 = referenceInfo.ref_message_type;
            } else {
                l3 = null;
            }
            return new C0I3O(new C460810I5f(null, abstractC1236404sc, new C0I3R(refMsgId, l3), 39));
        }
        BaseContent baseContentLJIIJ = C0ZDX.LJIIJ(c869590Y9l);
        if (baseContentLJIIJ == null) {
            final C1233704sB c1233704sB2 = new C1233704sB(2131831101, (List<String>) null);
            AbstractC1236404sc abstractC1236404sc2 = new AbstractC1236404sc(c1233704sB2) { // from class: X.04sW
                public final InterfaceC460300I3g LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1235804sW) && Intrinsics.LJFF(this.LIZIZ, ((C1235804sW) obj).LIZIZ);
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextFromBaseContent(data=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1236404sc
                public final InterfaceC460300I3g LIZ() {
                    return this.LIZIZ;
                }

                {
                    super(c1233704sB2);
                    this.LIZIZ = c1233704sB2;
                }
            };
            long refMsgId2 = c869590Y9l.getRefMsgId();
            ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
            if (referenceInfo2 != null) {
                l2 = referenceInfo2.ref_message_type;
            } else {
                l2 = null;
            }
            return new C0I3O(new C460810I5f(null, abstractC1236404sc2, new C0I3R(refMsgId2, l2), 39));
        }
        final C1233604sA c1233604sA = new C1233604sA(baseContentLJIIJ.toString(), new AwS111S0400000_14(this, c869590Y9l, baseContentLJIIJ, referenceInfoHintLJIIIZ, 1));
        if (referenceInfoHintLJIIIZ.getRefmsg_type() == 7) {
            z = true;
        } else {
            z = false;
        }
        AbstractC1236404sc abstractC1236404sc3 = new AbstractC1236404sc(c1233604sA) { // from class: X.04sW
            public final InterfaceC460300I3g LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1235804sW) && Intrinsics.LJFF(this.LIZIZ, ((C1235804sW) obj).LIZIZ);
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TextFromBaseContent(data=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1236404sc
            public final InterfaceC460300I3g LIZ() {
                return this.LIZIZ;
            }

            {
                super(c1233604sA);
                this.LIZIZ = c1233604sA;
            }
        };
        Long lValueOf = Long.valueOf(c869590Y9l.getRefMsgId());
        long msgId = c869590Y9l.getMsgId();
        ReferenceInfo referenceInfo3 = c869590Y9l.getReferenceInfo();
        if (referenceInfo3 != null) {
            l = referenceInfo3.ref_message_type;
        } else {
            l = null;
        }
        return new C0I3O(new C460810I5f(null, abstractC1236404sc3, C460710I4v.LIZLLL(z, lValueOf, msgId, l), 39));
    }
}
