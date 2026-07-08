package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSceneSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: X.0JfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497700JfU {
    public static final C497700JfU LIZ = new C497700JfU();
    public static final Stack<EnumC768840UDy> LIZIZ = new Stack<>();
    public static final Map<Object, InterfaceC497710JfV> LIZJ = new LinkedHashMap();

    public final synchronized EnumC768840UDy LIZ() {
        Stack<EnumC768840UDy> stack;
        stack = LIZIZ;
        return stack.isEmpty() ? EnumC768840UDy.BROADCAST : stack.peek();
    }

    public static void LIZIZ() {
        if (!LiveBroadcastSceneSettings.getValue()) {
            ((LinkedHashMap) LIZJ).clear();
            return;
        }
        Stack<EnumC768840UDy> stack = LIZIZ;
        EnumC768840UDy enumC768840UDyPeek = stack.isEmpty() ^ true ? stack.peek() : EnumC768840UDy.UNKNOWN;
        stack.clear();
        if (enumC768840UDyPeek != EnumC768840UDy.UNKNOWN) {
            Map<Object, InterfaceC497710JfV> map = LIZJ;
            if (!map.isEmpty()) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                List listLLIIII = C13LP.LLIIII(linkedHashMap.entrySet());
                linkedHashMap.clear();
                Iterator it2 = listLLIIII.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC497710JfV) ((Map.Entry) it2.next()).getValue()).LIZ(EnumC768840UDy.UNKNOWN, enumC768840UDyPeek);
                }
                return;
            }
        }
        ((LinkedHashMap) LIZJ).clear();
    }

    public static void LIZLLL(Object obj) {
        LIZJ.remove(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:11:0x001e, B:19:0x003c, B:20:0x004f, B:22:0x0055, B:13:0x0024, B:15:0x002f, B:16:0x0036, B:8:0x0018, B:23:0x005f, B:25:0x0069, B:29:0x0076, B:32:0x007f, B:34:0x0087, B:36:0x008d, B:37:0x00a4, B:39:0x00aa, B:31:0x007c, B:26:0x0070), top: B:45:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(boolean r6, X.EnumC768840UDy r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSceneSettings.getValue()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto L5f
            java.util.Stack<X.0UDy> r1 = X.C497700JfU.LIZIZ     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            r0 = r0 ^ 1
            if (r0 == 0) goto L18
            java.lang.Object r2 = r1.peek()     // Catch: java.lang.Throwable -> Lbe
            X.0UDy r2 = (X.EnumC768840UDy) r2     // Catch: java.lang.Throwable -> Lbe
            goto L1a
        L18:
            X.0UDy r2 = X.EnumC768840UDy.UNKNOWN     // Catch: java.lang.Throwable -> Lbe
        L1a:
            if (r6 == 0) goto L22
            if (r2 == r7) goto L39
            r1.push(r7)     // Catch: java.lang.Throwable -> Lbe
            goto L3a
        L22:
            if (r2 != r7) goto L39
            r1.pop()     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            r0 = r0 ^ 1
            if (r0 == 0) goto L36
            java.lang.Object r7 = r1.peek()     // Catch: java.lang.Throwable -> Lbe
            X.0UDy r7 = (X.EnumC768840UDy) r7     // Catch: java.lang.Throwable -> Lbe
            goto L3a
        L36:
            X.0UDy r7 = X.EnumC768840UDy.UNKNOWN     // Catch: java.lang.Throwable -> Lbe
            goto L3a
        L39:
            r7 = r2
        L3a:
            if (r7 == r2) goto Lbc
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Throwable -> Lbe
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel> r0 = com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel.class
            r1.HQ2(r0, r7)     // Catch: java.lang.Throwable -> Lbe
            java.util.Map<java.lang.Object, X.0JfV> r0 = X.C497700JfU.LIZJ     // Catch: java.lang.Throwable -> Lbe
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lbe
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lbe
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lbe
        L4f:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbe
            X.0JfV r0 = (X.InterfaceC497710JfV) r0     // Catch: java.lang.Throwable -> Lbe
            r0.LIZ(r7, r2)     // Catch: java.lang.Throwable -> Lbe
            goto L4f
        L5f:
            java.util.Stack<X.0UDy> r4 = X.C497700JfU.LIZIZ     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            r0 = r0 ^ 1
            if (r0 == 0) goto L70
            java.lang.Object r3 = r4.peek()     // Catch: java.lang.Throwable -> Lbe
            X.0UDy r3 = (X.EnumC768840UDy) r3     // Catch: java.lang.Throwable -> Lbe
            goto L72
        L70:
            X.0UDy r3 = X.EnumC768840UDy.UNKNOWN     // Catch: java.lang.Throwable -> Lbe
        L72:
            if (r6 == 0) goto L7a
            if (r3 == r7) goto L7f
            r4.push(r7)     // Catch: java.lang.Throwable -> Lbe
            goto L7f
        L7a:
            if (r3 != r7) goto L7f
            r4.pop()     // Catch: java.lang.Throwable -> Lbe
        L7f:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            r0 = r0 ^ 1
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r4.peek()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == r3) goto Lbc
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Throwable -> Lbe
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel> r1 = com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel.class
            java.lang.Object r0 = r4.peek()     // Catch: java.lang.Throwable -> Lbe
            r2.HQ2(r1, r0)     // Catch: java.lang.Throwable -> Lbe
            java.util.Map<java.lang.Object, X.0JfV> r0 = X.C497700JfU.LIZJ     // Catch: java.lang.Throwable -> Lbe
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lbe
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lbe
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Lbe
        La4:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto Lbc
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lbe
            X.0JfV r1 = (X.InterfaceC497710JfV) r1     // Catch: java.lang.Throwable -> Lbe
            java.util.Stack<X.0UDy> r0 = X.C497700JfU.LIZIZ     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> Lbe
            X.0UDy r0 = (X.EnumC768840UDy) r0     // Catch: java.lang.Throwable -> Lbe
            r1.LIZ(r0, r3)     // Catch: java.lang.Throwable -> Lbe
            goto La4
        Lbc:
            monitor-exit(r5)
            return
        Lbe:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C497700JfU.LIZJ(boolean, X.0UDy):void");
    }
}
