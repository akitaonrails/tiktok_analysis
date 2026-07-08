package X;

import com.bytedance.otis.protos.BackgroundTask;
import com.bytedance.otis.protos.PerfData;
import com.bytedance.otis.resource.diagnose.server.IBackgroundTaskApi;
import com.bytedance.sliver.Sliver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS578S0100000_34;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C8J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8J {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C799220VWu c799220VWu, int i, int i2) {
        int length;
        int iIntValue;
        C0XAI c0xai;
        String str = c799220VWu.LIZIZ;
        if (str.length() != 0 && (c0xai = C0XAG.LIZ) != null) {
            c0xai.LIZ(i, str);
        }
        if (C0XAH.LIZ) {
            return;
        }
        try {
            C1C8S c1c8s = new C1C8S();
            for (C0VX3 c0vx3 : (ArrayList) c799220VWu.LIZ) {
                if (c0vx3.LIZ.length != 0 && r1.length - 1 >= 0) {
                    while (true) {
                        int i3 = length - 1;
                        long[] jArr = c0vx3.LIZ;
                        long j = jArr[length];
                        Integer num = c1c8s.LIZ.get(Long.valueOf(j));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            c1c8s.LIZ.put(Long.valueOf(j), Integer.valueOf(c1c8s.LIZIZ));
                            iIntValue = c1c8s.LIZIZ;
                            c1c8s.LIZIZ = iIntValue + 1;
                        }
                        jArr[length] = iIntValue;
                        if (i3 >= 0) {
                            length = i3;
                        }
                    }
                }
            }
            Set<Long> setKeySet = c1c8s.LIZ.keySet();
            String stackTrace = "";
            if (!setKeySet.isEmpty()) {
                long[] jArr2 = new long[setKeySet.size()];
                Iterator<Long> it2 = setKeySet.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    jArr2[i4] = it2.next().longValue();
                    i4++;
                }
                try {
                    stackTrace = Sliver.getStackTrace(jArr2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (stackTrace.length() == 0) {
                return;
            }
            LIZ(c799220VWu, stackTrace, i, i2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.1C8T] */
    public static void LIZ(C799220VWu c799220VWu, String str, int i, int i2) {
        C1C8N c1c8n = new C1C8N();
        ArrayList arrayList = new ArrayList();
        for (C0VX3 c0vx3 : (ArrayList) c799220VWu.LIZ) {
            C1C8O c1c8o = new C1C8O();
            c1c8o.LIZLLL = Long.valueOf(c799220VWu.LIZJ);
            c1c8o.LJFF = Integer.valueOf(EnumC2008007tm.SliverType.getValue());
            long[] jArr = c0vx3.LIZ;
            ArrayList arrayList2 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList2.add(Long.valueOf(j));
            }
            c1c8o.LJ = arrayList2;
            c1c8o.LJI = c799220VWu.LIZIZ;
            c1c8o.LJIIIZ = Long.valueOf(c0vx3.LIZIZ);
            arrayList.add(c1c8o.build());
        }
        c1c8n.LIZLLL = arrayList;
        c1c8n.LJ = Long.valueOf(i2);
        c1c8n.LJFF = c799220VWu.LJFF;
        c1c8n.LJII = c799220VWu.LJ;
        C1C8R c1c8r = new C1C8R();
        c1c8r.LIZLLL = Long.valueOf(c799220VWu.LIZJ);
        c1c8r.LJ = Long.valueOf(c799220VWu.LIZLLL);
        c1c8n.LJIIIIZZ = c1c8r.build();
        C1C8Q c1c8q = new C1C8Q();
        c1c8q.LJFF = Long.valueOf(c799220VWu.LIZJ);
        c1c8q.LJI = Long.valueOf(c799220VWu.LIZLLL);
        c1c8q.LIZLLL = Long.valueOf(c799220VWu.LIZJ);
        c1c8q.LJ = Long.valueOf(c799220VWu.LIZLLL);
        c1c8n.LJI = c1c8q.build();
        C1C3V c1c3v = new C1C3V();
        c1c3v.LIZLLL = str;
        c1c3v.LJ.add(c1c8n.build());
        long jCurrentTimeMillis = System.currentTimeMillis();
        BackgroundTask backgroundTaskBuild = c1c3v.build();
        C1C8G c1c8g = new C1C8G();
        c1c8g.LJ = Long.valueOf(C07KH.LIZIZ);
        c1c8g.LJFF = C07KH.LJII;
        List<PerfData> list = c1c8g.LIZLLL;
        C1C8D c1c8d = new C1C8D();
        c1c8d.LIZLLL = Long.valueOf(jCurrentTimeMillis);
        c1c8d.LJ = Integer.valueOf(i);
        byte[] bArrEncode = backgroundTaskBuild.encode();
        c1c8d.LJFF = ByteString.of(Arrays.copyOf(bArrEncode, bArrEncode.length));
        list.add(c1c8d.build());
        C1C8X c1c8x = IBackgroundTaskApi.LIZ;
        ?? r2 = new C1C8Z(c1c8g.build()) { // from class: X.1C8T
            public final C1C8W LIZ;

            @Override // X.C1C8Z
            public final void LIZIZ() {
            }

            @Override // X.C1C8Z
            public final void LIZJ() {
            }

            @Override // X.C1C8Z
            public final C1C8W LIZ() {
                return this.LIZ;
            }

            {
                C1C8W c1c8w = new C1C8W();
                c1c8w.LIZ = perfDataRequest.encode();
                this.LIZ = c1c8w;
            }
        };
        c1c8x.getClass();
        C07KI.LIZ(new AwS578S0100000_34((C1C8T) r2, 22));
    }
}
