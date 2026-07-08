package X;

import Y.ARunnableS5S1201000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.core.LynxEngineProxy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0jto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298660jto {
    public static void LIZ(LynxModuleWrapper lynxModuleWrapper, LynxEngineProxy lynxEngineProxy, ReadableMap readableMap, String str) throws Throwable {
        boolean z;
        ReadableMap map = readableMap.getMap("methodDetail", new JavaOnlyMap());
        map.getString("module", null);
        String string = map.getString("method", null);
        char c = 0;
        final boolean z2 = readableMap.getBoolean("fromPiper", false);
        final String string2 = readableMap.getString("tasmEntryName", null);
        final int i = readableMap.getInt("callbackId", -1);
        char c2 = 1;
        if (str.equals("call") || (string != null && string.length() != 0)) {
            z = true;
        } else {
            z = false;
        }
        try {
            for (MethodDescriptor methodDescriptor : lynxModuleWrapper.getMethodDescriptors()) {
                String name = methodDescriptor.getName();
                if (name != null && !name.isEmpty() && name.equals(str)) {
                    final WeakReference weakReference = new WeakReference(lynxEngineProxy);
                    if (z) {
                        Method method = methodDescriptor.getMethod();
                        LynxModule module = lynxModuleWrapper.getModule();
                        Object[] objArr = new Object[3];
                        objArr[c] = string;
                        objArr[c2] = map;
                        objArr[2] = new Callback() { // from class: X.0jtp
                            @Override // com.lynx.react.bridge.Callback
                            public final void invoke(Object... objArr2) {
                                LynxEngineProxy lynxEngineProxy2 = (LynxEngineProxy) weakReference.get();
                                if (lynxEngineProxy2 == null) {
                                    LynxLog.i("LynxLepusModule", "triggerLepusBridgeAsync failed, LynxEngine has been released.");
                                    return;
                                }
                                if (objArr2.length > 0 && !z2) {
                                    C1298840ju6 c1298840ju6 = C1298840ju6.LIZ;
                                    Object obj = objArr2[0];
                                    c1298840ju6.getClass();
                                    C1289620jfE.LIZLLL(new ARunnableS5S1201000_20(lynxEngineProxy2, i, string2, C1298840ju6.LIZIZ(obj), 0));
                                }
                            }
                        };
                        C2204961BRm.a0(method, module, objArr, new C0WZX("dzBzEg4jUdKSWVIxUAHKSuowiIK8DPt4mJDHQ7lw", null));
                    } else if (z2) {
                        C2204961BRm.a0(methodDescriptor.getMethod(), lynxModuleWrapper.getModule(), map.getArray("param", new JavaOnlyArray()).asArrayList().toArray(), new C0WZX("dzBzEg4jUdKSWVIxUAHKSuowiIK8DPt4mJDHQ7lw", null));
                    } else {
                        Method method2 = methodDescriptor.getMethod();
                        LynxModule module2 = lynxModuleWrapper.getModule();
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = map;
                        objArr2[1] = new Callback() { // from class: X.0jtq
                            @Override // com.lynx.react.bridge.Callback
                            public final void invoke(Object... objArr3) {
                                LynxEngineProxy lynxEngineProxy2 = (LynxEngineProxy) weakReference.get();
                                if (lynxEngineProxy2 == null) {
                                    LynxLog.i("LynxLepusModule", "triggerLepusBridgeAsync failed, LynxEngine has been released.");
                                    return;
                                }
                                if (objArr3.length > 0) {
                                    C1298840ju6 c1298840ju6 = C1298840ju6.LIZ;
                                    Object obj = objArr3[0];
                                    c1298840ju6.getClass();
                                    C1289620jfE.LIZLLL(new ARunnableS5S1201000_20(lynxEngineProxy2, i, string2, C1298840ju6.LIZIZ(obj), 0));
                                }
                            }
                        };
                        C2204961BRm.a0(method2, module2, objArr2, new C0WZX("dzBzEg4jUdKSWVIxUAHKSuowiIK8DPt4mJDHQ7lw", null));
                    }
                }
                c2 = 1;
                c = 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Lepus Module invokeAsync: ");
            sbLIZ.append(e.toString());
            LynxLog.e("LynxLepusModule", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
