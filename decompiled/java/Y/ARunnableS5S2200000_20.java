package Y;

import X.C0VSJ;
import X.C0VSV;
import X.C1271480jBy;
import X.C1272090jCx;
import X.C1272260jDE;
import X.C1317210kNj;
import X.C143900gn;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1271470jBx;
import X.InterfaceC1317280kNq;
import X.InterfaceC1317400kO2;
import Y.ARunnableS5S2200000_20;
import android.os.Process;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.common.event.ModuleInvokeCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.Transport;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS5S2200000_20 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0VSV c0vsv;
        C0VSJ c0vsj;
        String parent;
        C0VSJ c0vsj2;
        boolean z = false;
        Process.setThreadPriority(C143900gn.LIZ(0, "DumpH264Thread_"));
        this.s0 = this.s1;
        C1271480jBy c1271480jBy = (C1271480jBy) this.l3;
        try {
            c0vsj = new C0VSJ(this.s0);
            parent = c0vsj.getParent();
            c0vsj2 = new C0VSJ(parent);
            if (!c0vsj2.exists()) {
                c0vsj2.mkdirs();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VSV c0vsv2 = (C0VSV) this.l2;
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                this.l2 = null;
            }
            InterfaceC1271470jBx interfaceC1271470jBx = ((C1271480jBy) this.l3).LLILZLL.LLJJIJIIJIL;
            if (interfaceC1271470jBx != null) {
                interfaceC1271470jBx.onError(-5, e.toString());
            }
        }
        if (!c0vsj2.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(parent);
            sbLIZ.append(" doesn't exist.");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!c0vsj2.canWrite()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(parent);
            sbLIZ2.append(" is forbidden to write.");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (c0vsj.exists() && c0vsj.isFile()) {
            c0vsj.delete();
        }
        this.l2 = new C0VSV((File) c0vsj, false);
        z = true;
        c1271480jBy.LLILZ = z;
        while (true) {
            C1271480jBy c1271480jBy2 = (C1271480jBy) this.l3;
            if (!c1271480jBy2.LLILZ) {
                if (((C0VSV) this.l2) != null) {
                    while (!((C1271480jBy) this.l3).LLILLJJLI.isEmpty()) {
                        Transport.c cVarPoll = ((C1271480jBy) this.l3).LLILLJJLI.poll();
                        if (cVarPoll != null) {
                            try {
                                ((C0VSV) this.l2).getChannel().write(cVarPoll.LIZ);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                InterfaceC1271470jBx interfaceC1271470jBx2 = ((C1271480jBy) this.l3).LLILZLL.LLJJIJIIJIL;
                                if (interfaceC1271470jBx2 != null) {
                                    interfaceC1271470jBx2.onError(-5, e3.toString());
                                }
                            }
                        }
                    }
                    try {
                        ((C0VSV) this.l2).close();
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    this.l2 = null;
                }
                if (((C1271480jBy) this.l3).LLILZIL != 0) {
                    try {
                        C0VSJ c0vsj3 = new C0VSJ(this.s0);
                        if (c0vsj3.exists() && c0vsj3.isFile()) {
                            c0vsj3.delete();
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        return;
                    }
                }
                return;
            }
            if (c1271480jBy2.LLILLJJLI.isEmpty()) {
                try {
                    synchronized (((C1271480jBy) this.l3).LLILLL) {
                        try {
                            ((C1271480jBy) this.l3).LLILLL.wait();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    InterfaceC1271470jBx interfaceC1271470jBx3 = ((C1271480jBy) this.l3).LLILZLL.LLJJIJIIJIL;
                    if (interfaceC1271470jBx3 != null) {
                        interfaceC1271470jBx3.onError(-5, e6.toString());
                    }
                }
            }
            Transport.c cVarPoll2 = ((C1271480jBy) this.l3).LLILLJJLI.poll();
            if (cVarPoll2 != null && (c0vsv = (C0VSV) this.l2) != null) {
                try {
                    c0vsv.getChannel().write(cVarPoll2.LIZ);
                } catch (Exception e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    InterfaceC1271470jBx interfaceC1271470jBx4 = ((C1271480jBy) this.l3).LLILZLL.LLJJIJIIJIL;
                    if (interfaceC1271470jBx4 != null) {
                        interfaceC1271470jBx4.onError(-5, e7.toString());
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS5S2200000_20 aRunnableS5S2200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("EffectManager@a3e3.composerCheckNodeExclusion$1");
        try {
            int iComposerCheckNodeExclusion = ((C1272260jDE) aRunnableS5S2200000_20.l2).LLIZLLLIL.composerCheckNodeExclusion(aRunnableS5S2200000_20.s0, aRunnableS5S2200000_20.s1, (int[]) aRunnableS5S2200000_20.l3);
            if (iComposerCheckNodeExclusion != 0) {
                ((C1272260jDE) aRunnableS5S2200000_20.l2).LLJILJIL.onError(iComposerCheckNodeExclusion, "composerCheckNodeExclusion failed");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectManager@a3e3.composerCheckNodeExclusion$1");
    }

    public static final void run$1(ARunnableS5S2200000_20 aRunnableS5S2200000_20) {
        boolean zLIZ;
        int effectABInfo;
        C1C7U.LIZ("FilterManager@d45d.setABInfoToEffect$1");
        try {
            if (((C1272090jCx) aRunnableS5S2200000_20.l3).isValid() && (effectABInfo = ((C1272090jCx) aRunnableS5S2200000_20.l3).LLJJIJIIJIL.setEffectABInfo((JSONObject) aRunnableS5S2200000_20.l2, aRunnableS5S2200000_20.s0)) != 0) {
                ((C1272090jCx) aRunnableS5S2200000_20.l3).LLJZIJLIL.onError(effectABInfo, aRunnableS5S2200000_20.s1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.setABInfoToEffect$1");
    }

    public static final void run$2(ARunnableS5S2200000_20 aRunnableS5S2200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCatcher$H264Dumper@d3c1.setupUrl$1");
        try {
            aRunnableS5S2200000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCatcher$H264Dumper@d3c1.setupUrl$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0kNi] */
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
    public static final void run$3(final ARunnableS5S2200000_20 aRunnableS5S2200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SDUIModuleManager@ed05.onMethodCall$1");
        try {
            InterfaceC1317280kNq interfaceC1317280kNq = ((C1317210kNj) aRunnableS5S2200000_20.l3).LIZ;
            if (interfaceC1317280kNq != 0) {
                interfaceC1317280kNq.LIZ(aRunnableS5S2200000_20.s0, aRunnableS5S2200000_20.s1, new InterfaceC1317400kO2() { // from class: X.0kNi
                    @Override // X.InterfaceC1317400kO2
                    public final void LIZ(String str) {
                        SDUIEventManager sDUIEventManager;
                        ARunnableS5S2200000_20 aRunnableS5S2200000_202 = this.LIZ;
                        Long l = (Long) aRunnableS5S2200000_202.l2;
                        if (l != C1317210kNj.LIZJ) {
                            C1317210kNj c1317210kNj = (C1317210kNj) aRunnableS5S2200000_202.l3;
                            String str2 = aRunnableS5S2200000_202.s0;
                            AbstractC1317090kNX abstractC1317090kNX = c1317210kNj.LIZIZ;
                            if (abstractC1317090kNX != null && (sDUIEventManager = abstractC1317090kNX.LLJJJ) != null) {
                                ClientEvent clientEvent = new ClientEvent();
                                ModuleInvokeCallback moduleInvokeCallback = new ModuleInvokeCallback();
                                moduleInvokeCallback.LIZIZ = str;
                                moduleInvokeCallback.LIZ = l.longValue();
                                clientEvent.LJ = moduleInvokeCallback;
                                sDUIEventManager.LIZ(clientEvent, !((ArrayList) C1317250kNn.LIZ).contains(str2));
                            }
                        }
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SDUIModuleManager@ed05.onMethodCall$1");
    }

    public ARunnableS5S2200000_20(C1271480jBy c1271480jBy, String str, int i) {
        this.$t = i;
        this.l3 = c1271480jBy;
        this.s1 = str;
    }

    public ARunnableS5S2200000_20(C1272090jCx c1272090jCx, JSONObject jSONObject, String str, int i) {
        this.$t = i;
        this.l3 = c1272090jCx;
        this.l2 = jSONObject;
        this.s0 = "live";
        this.s1 = str;
    }

    public ARunnableS5S2200000_20(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
