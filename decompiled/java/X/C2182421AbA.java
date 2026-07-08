package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayerConfig;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182421AbA {
    public static LinkMicLayoutLayerConfig LIZ(boolean z, long j, double d, EnumC2181801AaA enumC2181801AaA, C2182431AbB c2182431AbB, C2182441AbC c2182441AbC, C2182601AbS c2182601AbS, C1308530k9j c1308530k9j, C2181491AZf c2181491AZf, C2181481AZe c2181481AZe, C2181561AZm c2181561AZm, C2181391AYv c2181391AYv, C1AZY c1azy, InterfaceC972880bQM interfaceC972880bQM) {
        C1CIG c1cigLJI;
        C1CIG c1cigLJIIJ;
        Boolean boolValueOf = Boolean.valueOf(z);
        Long lValueOf = Long.valueOf(j);
        Double dValueOf = Double.valueOf(d);
        EnumC2182351Ab3 enumC2182351Ab3Into = enumC2181801AaA.into();
        C1CSP c1csp = new C1CSP(Long.valueOf(c2182431AbB.LIZ), Double.valueOf(c2182431AbB.LIZIZ), Double.valueOf(c2182431AbB.LIZJ));
        C2230371CRf c2230371CRfLIZ = c2182441AbC.LIZ();
        C2182631AbV c2182631AbV = new C2182631AbV(c2182601AbS);
        C972890bQN c972890bQN = C972890bQN.LIZ;
        C1CIG c1cig = new C1CIG(-4497105466725977504L, Long.valueOf(c972890bQN.LIZ(c2182631AbV)));
        C1CIG c1cig2 = new C1CIG(-999611455321152273L, Long.valueOf(c972890bQN.LIZ(new C2182561AbO(c1308530k9j))));
        C1CIG c1cig3 = new C1CIG(-6474877707189437551L, Long.valueOf(c972890bQN.LIZ(new C2183501Acu(c2181491AZf))));
        C1CIG c1cig4 = new C1CIG(7972153393899259172L, Long.valueOf(c972890bQN.LIZ(new C2228251CJb(c2181481AZe))));
        C1CIG c1cigLJII = null;
        if (c2181561AZm != null) {
            c1cigLJI = C2231651CWd.LJI(c2181561AZm);
        } else {
            c1cigLJI = null;
        }
        if (c2181391AYv != null) {
            c1cigLJIIJ = C2231651CWd.LJIIJ(c2181391AYv);
        } else {
            c1cigLJIIJ = null;
        }
        C1CIG c1cigLJIIIIZZ = C2231651CWd.LJIIIIZZ(c1azy);
        if (interfaceC972880bQM != null) {
            c1cigLJII = C2231651CWd.LJII(interfaceC972880bQM);
        }
        C2233821Cbs c2233821Cbs = new C2233821Cbs(boolValueOf, lValueOf, dValueOf, enumC2182351Ab3Into, c1csp, c2230371CRfLIZ, null, c1cig, c1cig2, c1cig3, c1cig4, c1cigLJI, c1cigLJIIJ, c1cigLJIIIIZZ, c1cigLJII);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(C2233821Cbs.ADAPTER.encodedSize(c2233821Cbs));
        c2233821Cbs.encode(new C1283530jVP(byteBufferAllocateDirect));
        return new LinkMicLayoutLayerConfig(new C1283590jVV(LinkMicLayoutLayerConfig.MoltenFfiNativeNewX1166122948281177197(byteBufferAllocateDirect)));
    }
}
