package X;

import Y.ARunnableS120S0100000_20;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274900jHU implements InterfaceC1274450jGl {
    public final /* synthetic */ C1274810jHL LIZ;

    public C1274900jHU(C1274810jHL c1274810jHL) {
        this.LIZ = c1274810jHL;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(int i, int i2, String str) {
        boolean z;
        char c;
        Object obj;
        C1267500j5Y c1267500j5Y;
        this.LIZ.LLD();
        C1274810jHL c1274810jHL = this.LIZ;
        c1274810jHL.getClass();
        String str2 = c1274810jHL.LJJLIIIJJI;
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        new StreamKey(str2, str, streamIndex);
        if (!c1274810jHL.LLIIL() && c1274810jHL.LJJ == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View viewLJLLLLLL = c1274810jHL.LJLLLLLL(str);
            AbstractC1273900jFs abstractC1273900jFsLIZ = c1274810jHL.LIZJ.LIZ();
            if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LJJII() && (c1267500j5Y = c1274810jHL.LJLIIL) != null && c1267500j5Y.LIZ.LJI) {
                c1274810jHL.LJZL.LIZ(c1274810jHL, 14, 1L, 0L, str, null, Integer.valueOf(c1274810jHL.LIZLLL.LJIILL(str)), Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                c1274810jHL.LJZL.LIZ(c1274810jHL, 14, 0L, 0L, str, viewLJLLLLLL, Integer.valueOf(c1274810jHL.LIZLLL.LJIILL(str)), Integer.valueOf(i), Integer.valueOf(i2));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_render_msg_sent");
                jSONObject.put("rtc_channel_id", c1274810jHL.LJII.LIZLLL);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1274690jH9.LJ(new ARunnableS120S0100000_20(jSONObject, 288));
            AVLog.ioi("ClientImpl", "MSG_INFO_FIRST_REMOTE_VIDEO_RENDER: uid " + str + ", view " + viewLJLLLLLL + ", width " + i + ", height " + i2);
        } else {
            if (c1274810jHL.LJIILJJIL.LJIILIIL == EnumC1275500jIS.SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(c1274810jHL.LJIILJJIL.LIZIZ);
                c1274810jHL.LJI.setRemoteVideoCanvas(new StreamKey(c1274810jHL.LJJLIIIJJI, str, streamIndex), new VideoCanvas(surfaceView, 1));
                c = 1;
                obj = surfaceView;
            } else {
                TextureView textureView = new TextureView(c1274810jHL.LJIILJJIL.LIZIZ);
                StreamKey streamKey = new StreamKey(c1274810jHL.LJJLIIIJJI, str, streamIndex);
                c = 1;
                c1274810jHL.LJI.setRemoteVideoCanvas(streamKey, new VideoCanvas(textureView, 1));
                obj = textureView;
            }
            C1274700jHA c1274700jHA = c1274810jHL.LJZL;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[c] = obj;
            objArr[2] = Integer.valueOf(c1274810jHL.LIZLLL.LJIILL(str));
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(i2);
            c1274700jHA.LIZ(c1274810jHL, 14, 0L, 0L, objArr);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("key", "rtc_first_remote_video_render_msg_sent");
                jSONObject2.put("rtc_channel_id", c1274810jHL.LJII.LIZLLL);
                jSONObject2.put("timestamp", System.currentTimeMillis());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1274690jH9.LJ(new ARunnableS120S0100000_20(jSONObject2, 290));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MSG_INFO_FIRST_REMOTE_VIDEO_RENDER with rtc render video internal: uid ");
            sbLIZ.append(str);
            sbLIZ.append(", view ");
            sbLIZ.append(obj);
            sbLIZ.append(", width ");
            sbLIZ.append(i);
            sbLIZ.append(", height ");
            sbLIZ.append(i2);
            AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LLIIJI(true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:4)(2:25|(2:29|(1:31)(2:32|(1:34))))|5|(1:7)(4:9|(3:11|(2:77|(2:17|(1:24)))|39)(3:18|(2:22|(0))|39)|43|44)|8|47|35|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0134, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r25, int r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274900jHU.LIZIZ(int, int, java.lang.String, java.lang.String):void");
    }
}
