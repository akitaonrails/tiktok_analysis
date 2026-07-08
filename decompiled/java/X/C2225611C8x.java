package X;

import com.bytedance.scalpel.bigjank.IBigJankApi;
import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.PerfData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS435S0200000_34;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1C8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225611C8x {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1C8o] */
    public static void LIZ(C0XAN c0xan, String str, long j, String str2) throws JSONException {
        C1C94 c1c94 = new C1C94();
        c1c94.LIZLLL = str;
        ArrayList arrayList = new ArrayList();
        for (C0XAR c0xar : (ArrayList) c0xan.LIZIZ) {
            C2225621C8y c2225621C8y = new C2225621C8y();
            if (C0XAD.LIZ().LIZ != null) {
                c2225621C8y.LJ = Long.valueOf(C0XAD.LIZ().LIZ.LIZIZ);
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0XAS c0xas : c0xar.LIZ) {
                C1C91 c1c91 = new C1C91();
                c1c91.LIZLLL = Long.valueOf(c0xar.LJFF);
                long[] jArr = c0xas.LIZ;
                ArrayList arrayList3 = new ArrayList(jArr.length);
                for (long j2 : jArr) {
                    arrayList3.add(Long.valueOf(j2));
                }
                c1c91.LJ = arrayList3;
                c1c91.LJIIIZ = c0xas.LIZIZ;
                arrayList2.add(c1c91.build());
            }
            c2225621C8y.LIZLLL = arrayList2;
            c2225621C8y.LJFF = c0xar.LJIIIIZZ;
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : c0xar.LJII.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            c2225621C8y.LJIIIIZZ = C786410Ut5.J3(jSONObject);
            C1C98 c1c98 = new C1C98();
            c1c98.LJ = c0xar.LIZIZ;
            c1c98.LJIIIIZZ = c0xar.LJ;
            c1c98.LIZLLL = c0xar.LIZJ;
            c1c98.LJFF = c0xar.LIZLLL;
            c2225621C8y.LJI = c1c98.build();
            C1C96 c1c96 = new C1C96();
            c1c96.LIZLLL = Long.valueOf(c0xar.LJFF);
            c1c96.LJ = Long.valueOf(c0xar.LJI);
            c2225621C8y.LJIIIZ = c1c96.build();
            C1C95 c1c95 = new C1C95();
            c1c95.LJFF = Long.valueOf(c0xar.LJFF);
            c1c95.LJI = Long.valueOf(c0xar.LJI);
            c1c95.LIZLLL = Long.valueOf(c0xar.LJFF);
            c1c95.LJ = Long.valueOf(c0xar.LJI);
            c2225621C8y.LJII = c1c95.build();
            arrayList.add(c2225621C8y.build());
        }
        c1c94.LJ = arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        BigJankMsg bigJankMsgBuild = c1c94.build();
        C2225501C8m c2225501C8m = new C2225501C8m();
        c2225501C8m.LJ = Long.valueOf(j);
        c2225501C8m.LJFF = str2;
        List<PerfData> list = c2225501C8m.LIZLLL;
        C2225471C8j c2225471C8j = new C2225471C8j();
        c2225471C8j.LIZLLL = Long.valueOf(jCurrentTimeMillis);
        c2225471C8j.LJ = Integer.valueOf(C1EOX.TypeBigJankV2.getValue());
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        byte[] bArrEncode = bigJankMsgBuild.encode();
        byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
        c1496910p3Z.getClass();
        c2225471C8j.LJFF = C1496910p3Z.LIZIZ(bArrCopyOf);
        list.add(c2225471C8j.build());
        C2225381C8a c2225381C8a = IBigJankApi.LIZ;
        ?? r2 = new InterfaceC2225401C8c(c2225501C8m.build()) { // from class: X.1C8o
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
                c2225411C8d.LIZ = perfDataRequest.encode();
                this.LIZ = c2225411C8d;
            }
        };
        c2225381C8a.getClass();
        C07KQ.LIZ(new AwS435S0200000_34(c2225381C8a, (C2225521C8o) r2, 2));
    }
}
