package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: renamed from: X.0LGG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGG {
    public static final void LIZ(C539960LFq c539960LFq, C19A3 c19a3, VideoPublishEditModel videoPublishEditModel, Function1 function1) {
        if (!C311000CHa.LIZ(videoPublishEditModel)) {
            return;
        }
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C578250Mm7.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC578500MmW.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC578500MmW.class, C578250Mm7.class, new AwS374S0200000_8(new C0ET4(), c539960LFq, function1, 32));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C0LGD.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(C0LGI.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C0LGI.class, C0LGD.class, new AwS374S0200000_8(new C0ET4(), c539960LFq, c19a3, 33));
    }
}
