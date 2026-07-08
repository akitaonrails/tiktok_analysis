package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalData;
import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalUploadData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J62, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J62 implements C0CW2<GameDualDeviceSignalData>, InterfaceC742680TBi, C0XEZ {
    public String LLILLL;
    public Boolean LLILZLL;
    public final ArrayList<C0J63> LL = new ArrayList<>();
    public final C11NJ LLILLJJLI = new C11NJ();
    public final String LLILZ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    public C0XE1 LLILZIL = C0XE1.CONNECTION_UNKNOWN;

    @Override // X.InterfaceC742680TBi
    public final boolean isWsConnected() {
        return Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE);
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
    @Override // X.InterfaceC742680TBi
    public final void release() {
        this.LL.clear();
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0J60.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C0J60.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0J66 c0j66 = (C0J66) (obj instanceof C0J60 ? obj : null);
        if (c0j66 != null) {
            c0j66.LJII(this);
        }
        C2203431BLp.LIZIZ.LJIIJJI(this);
        this.LLILLJJLI.dispose();
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
    public C0J62() {
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0J60.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C0J60.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0J66 c0j66 = (C0J66) (obj instanceof C0J60 ? obj : null);
        if (c0j66 != null) {
            c0j66.LIZ(this, null);
        }
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        this.LLILZLL = Boolean.valueOf(c2203431BLp.isConnected());
        c2203431BLp.LIZLLL(this);
    }

    @Override // X.InterfaceC742680TBi
    public final void LIZIZ(String str) {
        this.LLILLL = str;
    }

    @Override // X.InterfaceC742680TBi
    public final void LJFF(C0J63 c0j63) {
        this.LL.add(c0j63);
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        boolean z;
        C0XE1 c0xe1 = c821280WJq.LIZIZ;
        if (this.LLILZIL == c0xe1) {
            return;
        }
        this.LLILZIL = c0xe1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.onWsStateChanged: state=");
        sbLIZ.append(c0xe1.name());
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (c0xe1 == C0XE1.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.valueOf(z))) {
            return;
        }
        this.LLILZLL = Boolean.valueOf(z);
        Iterator<C0J63> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE));
        }
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
    @Override // X.InterfaceC742680TBi
    public final void LIZLLL(int i, String str) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessage() didTarget is null ,deviceId = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",message = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("SignalingManager_DualDevice", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0J60.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C0J60.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C0J60) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LJIIJ(new GameDualDeviceSignalUploadData(i, "", this.LLILZ, System.currentTimeMillis(), str));
        }
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
    @Override // X.InterfaceC742680TBi
    public final void LJ(int i, String str) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        String str2 = this.LLILLL;
        if (str2 == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            C20441214yg.LJ("SignalingManager_DualDevice", "sendMessage() didTarget is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessage() didTarget = ");
        sbLIZ.append(str2);
        sbLIZ.append(",deviceId = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",message = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("SignalingManager_DualDevice", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0J60.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C0J60.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C0J60) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LJIIJ(new GameDualDeviceSignalUploadData(i, str2, this.LLILZ, System.currentTimeMillis(), str));
        }
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
    @Override // X.InterfaceC742680TBi
    public final void LIZJ(int i, String str, String str2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessageWithTargetDid() didTarget = ");
        sbLIZ.append(str);
        sbLIZ.append(",deviceId = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",message = ");
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("SignalingManager_DualDevice", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C0J60.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0J60.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C0J60.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C0J60) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LJIIJ(new GameDualDeviceSignalUploadData(i, str, this.LLILZ, System.currentTimeMillis(), str2));
        }
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        GameDualDeviceSignalData gameDualDeviceSignalData = (GameDualDeviceSignalData) baseDownlinkData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownlinkMessageReceived() message = ");
        sbLIZ.append(gameDualDeviceSignalData);
        C20441214yg.LJIIIZ("SignalingManager_DualDevice", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<C0J63> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(gameDualDeviceSignalData);
        }
    }
}
