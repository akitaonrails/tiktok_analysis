package X;

import Y.ARunnableS107S0000000_34;
import com.bytedance.otis.attribution.server.IAttributionApi;
import com.bytedance.scalpel.protos.AttributionMsg;
import com.bytedance.scalpel.protos.PerfData;
import com.bytedance.scalpel.protos.PerfDataRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS578S0100000_34;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225431C8f {
    public static int LIZIZ;
    public static int LIZJ;
    public static ArrayList<AttributionMsg.AttributionItemMsg> LIZ = new ArrayList<>();
    public static final ARunnableS107S0000000_34 LIZLLL = new ARunnableS107S0000000_34(9);

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1C8e] */
    public static void LIZIZ() {
        if (LIZ.size() == 0) {
            return;
        }
        ArrayList<AttributionMsg.AttributionItemMsg> arrayList = LIZ;
        LIZ = new ArrayList<>();
        LIZIZ = 0;
        C2225511C8n c2225511C8n = new C2225511C8n();
        c2225511C8n.LIZLLL = arrayList;
        AttributionMsg attributionMsgBuild = c2225511C8n.build();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2225501C8m c2225501C8m = new C2225501C8m();
        c2225501C8m.LJ = C07KM.LIZ.invoke();
        c2225501C8m.LJFF = C07KM.LIZJ;
        List<PerfData> list = c2225501C8m.LIZLLL;
        C2225471C8j c2225471C8j = new C2225471C8j();
        c2225471C8j.LIZLLL = Long.valueOf(jCurrentTimeMillis);
        c2225471C8j.LJ = Integer.valueOf(C1EOX.TypeAttribution.getValue());
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        byte[] bArrEncode = attributionMsgBuild.encode();
        byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
        c1496910p3Z.getClass();
        c2225471C8j.LJFF = C1496910p3Z.LIZIZ(bArrCopyOf);
        list.add(c2225471C8j.build());
        C2225391C8b c2225391C8b = IAttributionApi.LIZ;
        final PerfDataRequest perfDataRequestBuild = c2225501C8m.build();
        ?? r2 = new InterfaceC2225401C8c(perfDataRequestBuild) { // from class: X.1C8e
            public final C2225411C8d LIZ;

            @Override // X.InterfaceC2225401C8c
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2225401C8c
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2225401C8c
            public final C2225411C8d LIZ() {
                return this.LIZ;
            }

            {
                C2225411C8d c2225411C8d = new C2225411C8d();
                c2225411C8d.LIZ = perfDataRequestBuild.encode();
                this.LIZ = c2225411C8d;
            }
        };
        c2225391C8b.getClass();
        C07KQ.LIZ(new AwS578S0100000_34((C2225421C8e) r2, 21));
    }

    public static void LIZ(ArrayList arrayList, int i, String str, EnumC2225211C7j enumC2225211C7j, boolean z) {
        C2225461C8i c2225461C8i = new C2225461C8i();
        c2225461C8i.LIZLLL = str;
        c2225461C8i.LJ = Integer.valueOf(enumC2225211C7j.getValue());
        c2225461C8i.LJFF = arrayList;
        LIZ.add(c2225461C8i.build());
        int i2 = LIZIZ + i;
        LIZIZ = i2;
        if (!z && i2 < 50000) {
            int i3 = LIZJ + 1;
            LIZJ = i3;
            if (i3 <= 1) {
                C786410Ut5.LJLIIL(C146T.LIZIZ.LIZIZ, C146T.LIZ.LIZ(), LIZLLL);
                return;
            }
            LIZJ = i3 - 1;
            return;
        }
        LIZIZ();
    }
}
