package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182551AbN implements InterfaceC2181971AaR, InterfaceC972900bQO {
    public final InterfaceC2181971AaR LL;

    @Override // X.InterfaceC2181971AaR
    public final boolean LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // X.InterfaceC2181971AaR
    public final void LIZLLL(C1AZU c1azu, List<C2181251AYh> list, C1AZ9 c1az9, C2181431AYz c2181431AYz, List<C2181811AaB> list2, C2182111Aaf c2182111Aaf) {
        this.LL.LIZLLL(c1azu, list, c1az9, c2181431AYz, list2, c2182111Aaf);
    }

    @Override // X.InterfaceC2181971AaR
    public final C1AZ9 LJ() {
        return this.LL.LJ();
    }

    public C2182551AbN(C2181391AYv c2181391AYv) {
        this.LL = c2181391AYv;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        C1AZ2 c1az2LJJIFFI;
        if (j == -8319564202206627915L) {
            try {
                C1AZ9 c1az9LJ = LJ();
                c1az9LJ.getClass();
                C1CP2 c1cp2 = new C1CP2(new C2229791COz(Double.valueOf(c1az9LJ.LIZ), Long.valueOf(c1az9LJ.LIZIZ), Long.valueOf(c1az9LJ.LIZJ)));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CP2.ADAPTER.encodedSize(c1cp2), new AwS612S0100000_33(c1cp2, 162)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return C972930bQR.LIZ();
            }
        }
        if (j == 5573789617587916258L) {
            try {
                C1CEC c1cec = new C1CEC(Boolean.valueOf(LIZJ()));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CEC.ADAPTER.encodedSize(c1cec), new AwS612S0100000_33(c1cec, 160)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return C972930bQR.LIZ();
            }
        }
        if (j == -2101058377373431795L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2233431CbF c2233431CbFDecode = C2233431CbF.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                C1AZU c1azuLJIILIIL = C2231651CWd.LJIILIIL(c2233431CbFDecode.arch_type);
                List<C2233221Cau> list = c2233431CbFDecode.canvas_regions;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C2233221Cau> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2231651CWd.LJJII(it2.next()));
                }
                C2229791COz c2229791COz = c2233431CbFDecode.canvas_size;
                C1AZ9 c1az9 = new C1AZ9(c2229791COz.ratio.doubleValue(), c2229791COz.width.longValue(), c2229791COz.height.longValue());
                C2233461CbI c2233461CbI = c2233431CbFDecode.sei_container_info;
                String str = c2233461CbI.layout_id;
                String str2 = c2233461CbI.layout_key;
                double dDoubleValue = c2233461CbI.ratio.doubleValue();
                String str3 = c2233461CbI.mode;
                boolean zBooleanValue = c2233461CbI.has_split_line.booleanValue();
                C2232771CaB c2232771CaB = c2233461CbI.custom_insets;
                if (c2232771CaB != null) {
                    c1az2LJJIFFI = C2231651CWd.LJJIFFI(c2232771CaB);
                } else {
                    c1az2LJJIFFI = null;
                }
                C2181431AYz c2181431AYz = new C2181431AYz(str, str2, dDoubleValue, str3, zBooleanValue, c1az2LJJIFFI, c2233461CbI.dsl_version.longValue());
                List<C2233171Cap> list2 = c2233431CbFDecode.spot_list;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C2233171Cap> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(C2231651CWd.LJJJJJ(it3.next()));
                }
                LIZLLL(c1azuLJIILIIL, arrayList, c1az9, c2181431AYz, arrayList2, C2231651CWd.LJJI(c2233431CbFDecode.layout_extra));
                return new C972940bQS(null);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        return new C972940bQS(null);
    }
}
