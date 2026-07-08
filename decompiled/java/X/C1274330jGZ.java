package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274330jGZ extends VideoSink {
    public long LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public ByteBuffer LLILZLL;
    public final /* synthetic */ C1274810jHL LLJI;
    public final String LL = "RtcVideoSink";
    public final List<C1269610j8x> LLIZ = new LinkedList();
    public final C1274380jGe LLIZLLLIL = new C1274380jGe();
    public final C1274370jGd LLJ = new C1274370jGd();

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final void OnDiscardedFrame() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final String getNodeName() {
        return "RtcVideoSink";
    }

    public C1274330jGZ(C1274810jHL c1274810jHL) {
        this.LLJI = c1274810jHL;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final void handleSerializedEvents(List<C1269610j8x> list) {
        if (list != null && list.size() != 0) {
            ((LinkedList) this.LLIZ).addAll(list);
        }
        List<C1269610j8x> list2 = this.LLIZ;
        if (list2 != null && ((LinkedList) list2).size() != 0) {
            Iterator<C1269610j8x> it2 = this.LLIZ.iterator();
            while (it2.hasNext()) {
                C1269610j8x next = it2.next();
                int i = next.LJFF;
                int i2 = C1269570j8t.LJFF;
                if ((i & i2) != 0) {
                    int i3 = C1276390jJt.LIZLLL[next.LIZLLL.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2 && (next instanceof C1269630j8z)) {
                            C1269630j8z c1269630j8z = (C1269630j8z) next;
                            AbstractC1273900jFs abstractC1273900jFsLIZ = this.LLJI.LIZJ.LIZ();
                            if (abstractC1273900jFsLIZ != null) {
                                abstractC1273900jFsLIZ.LLL(c1269630j8z.LIZLLL(i2));
                            }
                            this.LLJI.LJJZZIII.LJ((C1271990jCn[]) c1269630j8z.LJII, (C1272000jCo) c1269630j8z.LJIIIIZZ);
                            int i4 = c1269630j8z.LJFF & (~i2);
                            c1269630j8z.LJFF = i4;
                            if (i4 == 0) {
                                it2.remove();
                            }
                        }
                    } else if (next instanceof C1269600j8w) {
                        JSONObject jSONObjectLIZLLL = next.LIZLLL(i2);
                        AbstractC1273900jFs abstractC1273900jFsLIZ2 = this.LLJI.LIZJ.LIZ();
                        if (abstractC1273900jFsLIZ2 != null) {
                            abstractC1273900jFsLIZ2.LLL(jSONObjectLIZLLL);
                        }
                        String str = next.LJ;
                        if (str != null) {
                            C1274810jHL c1274810jHL = this.LLJI;
                            c1274810jHL.LJIILJJIL.LIZLLL = str;
                            c1274810jHL.LJI.LJJIIJ(str);
                            c1274810jHL.LJII = c1274810jHL.LJI.LJIIL();
                        }
                        int i5 = next.LJFF & (~i2);
                        next.LJFF = i5;
                        if (i5 == 0) {
                            it2.remove();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (r6.equals(r0) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05b0  */
    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame r29) {
        /*
            Method dump skipped, instruction units count: 1527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274330jGZ.onFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame):void");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        onFrame(videoFrame);
    }
}
