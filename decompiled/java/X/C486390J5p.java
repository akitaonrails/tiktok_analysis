package X;

import Y.ARunnableS0S2200200_7;
import Y.AfS0S2200100_7;
import Y.AfS176S0100000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.live.api.LiveRoomPreloadApi;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.audience.WebcastIMRegistryReqParams;

/* JADX INFO: renamed from: X.0J5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486390J5p implements InterfaceC1602300rnY, C0CW2<C0CW3> {
    public static final C486390J5p LLJI = new C486390J5p();
    public C481910Iv7 LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new C486420J5s());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C486430J5t());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C481900Iv6(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C0J7V());
    public final C01GW LLJ = C452501pT.LIZIZ(new C481920Iv8());

    @Override // X.InterfaceC1602300rnY
    public final C486450J5v LIZIZ() {
        C486450J5v c486450J5v = new C486450J5v();
        c486450J5v.LIZ = true;
        LiveSignalingSystemSetting liveSignalingSystemSetting = LiveSignalingSystemSetting.INSTANCE;
        liveSignalingSystemSetting.enableTimer();
        liveSignalingSystemSetting.timerInterval();
        liveSignalingSystemSetting.connectWs();
        c486450J5v.LIZIZ = liveSignalingSystemSetting.preloadEnable();
        c486450J5v.LIZJ = liveSignalingSystemSetting.preloadDelay();
        return c486450J5v;
    }

    @Override // X.InterfaceC1602300rnY
    public final boolean LJFF() {
        C481760Ius.LL.getClass();
        return C481760Ius.LLILLL;
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
    @Override // X.InterfaceC1602300rnY
    public final void LJIIIIZZ() {
        C481760Ius c481760Ius = C481760Ius.LL;
        c481760Ius.getClass();
        C01GW c01gw = C481760Ius.LLILZ;
        if (((Boolean) c01gw.getValue()).booleanValue() && !C481760Ius.LLILLL) {
            C20441214yg.LIZIZ("LiveHostRoomStateListener", "registerWs");
            C481760Ius.LLILLL = true;
            C486410J5r c486410J5r = C486410J5r.LL;
            ((CopyOnWriteArrayList) C486410J5r.LLILLJJLI.getValue()).add(c481760Ius);
            if (!C486410J5r.LLILLL) {
                C2203431BLp.LIZIZ.LJI(134217784, 1, c486410J5r);
                C486410J5r.LLILLL = true;
            }
            C481670Iuj c481670Iuj = C481670Iuj.LIZ;
            Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
            Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
            if (obj == null) {
                synchronized (c481670Iuj) {
                    try {
                        Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                        obj = obj2;
                        if (obj2 == null) {
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                            C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                            map.put(C13LE.LIZ(C486370J5n.class), c486370J5n);
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
            boolean z = obj instanceof C486370J5n;
            Object obj3 = obj;
            if (!z) {
                obj3 = null;
            }
            C0J66 c0j66 = (C0J66) obj3;
            if (c0j66 != null) {
                c0j66.LIZ(c481760Ius, null);
            }
        }
        InterfaceC481880Iv4 interfaceC481880Iv4 = (InterfaceC481880Iv4) this.LLIZ.getValue();
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C481760Ius.LLILLJJLI = interfaceC481880Iv4;
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
    @Override // X.InterfaceC1602300rnY
    public final void LJIILL() {
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(C13LE.LIZ(C481660Iui.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C481660Iui.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C481660Iui.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C481660Iui.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        boolean z = obj instanceof C481660Iui;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            c0j66.LJII(this);
        }
        Object obj4 = linkedHashMap.get(C13LE.LIZ(C481660Iui.class));
        if (obj4 == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj5 = ((LinkedHashMap) map).get(C13LE.LIZ(C481660Iui.class));
                    obj4 = obj5;
                    if (obj5 == null) {
                        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(C481660Iui.class);
                        C0J66<?, ?> c486370J5n2 = Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C481660Iui.class), c486370J5n2);
                        obj4 = c486370J5n2;
                        if (c486370J5n2 != null) {
                            C0J65.LL.LJI(c486370J5n2);
                            obj4 = c486370J5n2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        boolean z2 = obj4 instanceof C481660Iui;
        Object obj6 = obj4;
        if (!z2) {
            obj6 = null;
        }
        C0J66 c0j662 = (C0J66) obj6;
        if (c0j662 != null) {
            c0j662.LIZ(this, null);
        }
    }

    @Override // X.InterfaceC1602300rnY
    public final boolean LIZJ() {
        return this.LLILZLL;
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
    @Override // X.InterfaceC1602300rnY
    public final void LJIIJJI(String str) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
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
                        map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
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
        boolean z = obj instanceof C486370J5n;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C486380J5o c486380J5o = new C486380J5o(null, null, null, 63);
            c486380J5o.LIZJ = str;
            c0j66.LJIIJ(c486380J5o);
        }
    }

    @Override // X.InterfaceC1602300rnY
    public final boolean LJIIL(String str) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (C1533950q1J.LJ(this.LLILZ) && C1533950q1J.LJ(str) && Intrinsics.LJFF(this.LLILZ, str) && jUptimeMillis <= this.LLILZIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIILLIIL(String str) {
        ((Map) this.LL.getValue()).remove(str);
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIIZILJ(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1602300rnY
    public final void LIZ(long j, String str) {
        this.LLILZ = str;
        this.LLILZIL = SystemClock.uptimeMillis() + j;
    }

    @Override // X.InterfaceC1602300rnY
    public final void LIZLLL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
        Set set = (Set) ((Map) this.LLILLJJLI.getValue()).get(str);
        if (set == null) {
            ((Map) this.LLILLJJLI.getValue()).put(str, C093Y.LJ(interfaceC481880Iv4));
        } else {
            set.add(interfaceC481880Iv4);
        }
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJ(Set set, C018E c018e) {
        if (set.isEmpty()) {
            c018e.LIZ(C2097608Jq.LJ());
            return;
        }
        Set<String> setLLIIJI = C13LP.LLIIJI(set);
        C0J7Y c0j7yLIZIZ = C0J7Y.LJIILIIL.LIZIZ();
        C515801zg c515801zg = new C515801zg(setLLIIJI, c018e, 21);
        C516201zk c516201zk = new C516201zk(c018e, 100);
        c0j7yLIZIZ.getClass();
        if (C086I.LIZIZ(setLLIIJI)) {
            try {
                c515801zg.accept(new HashMap());
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : setLLIIJI) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        if (TextUtils.isEmpty(string)) {
            try {
                c515801zg.accept(new HashMap());
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        c0j7yLIZIZ.LJIIJJI.liveStates(string, "at_user_live_head").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(c515801zg, 8), new AfS176S0100000_7(c516201zk, 9));
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIILIIL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
        ((Map) this.LL.getValue()).put(str, new WeakReference(interfaceC481880Iv4));
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIILJJIL(InterfaceC481880Iv4 interfaceC481880Iv4, String str) {
        Set set = (Set) ((Map) this.LLILLJJLI.getValue()).get(str);
        if (set != null) {
            set.remove(interfaceC481880Iv4);
        }
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJI(Set set, Set set2, C1602340rnc c1602340rnc) {
        WebcastIMRegistryReqParams webcastIMRegistryReqParams = new WebcastIMRegistryReqParams();
        webcastIMRegistryReqParams.flags = 1L;
        WebcastIMRegistryReqParams.RegisterData registerData = new WebcastIMRegistryReqParams.RegisterData();
        registerData.rooms = new ArrayList(set2);
        registerData.users = new ArrayList(set);
        webcastIMRegistryReqParams.register = registerData;
        ((LiveStateApi) this.LLIZLLLIL.getValue()).imRegistry(webcastIMRegistryReqParams).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(c1602340rnc, 108), new AfS176S0100000_7(c1602340rnc, 109));
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        C1478160oZK.LIZ().LJJJJIZL(31238, GsonProtectorUtils.toJson(C09C2.LIZ(), uplinkMessageResponse));
    }

    public static void LJIJJ(int i, String str, long j, String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_preload_room_api");
        c474500IjALIZ.LJJII(str, "api_from");
        c474500IjALIZ.LJJII(str2, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "duration");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIIIZ(long j, long j2, long j3, C0J7N c0j7n) {
        if (j3 > 0) {
            C2487409ou.LIZLLL(j3, new ARunnableS0S2200200_7(this, j, j2, c0j7n, 1));
        } else {
            LJIL(j, j2, "inbox_dm_head", "inbox_dm_head", c0j7n);
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
    @Override // X.InterfaceC1602300rnY
    public final void LJIJ(int i, String str, Set set, boolean z) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
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
                        map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
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
        boolean z2 = obj instanceof C486370J5n;
        Object obj3 = obj;
        if (!z2) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C486380J5o c486380J5o = new C486380J5o(null, null, null, 63);
            c486380J5o.LIZJ = str;
            if (i == 5) {
                c486380J5o.LIZLLL = set;
                c486380J5o.LJFF = z;
            } else {
                c486380J5o.LJ = set;
            }
            c0j66.LJIIJ(c486380J5o);
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
    @Override // X.InterfaceC1602300rnY
    public final void LJIJI(int i, String str, Set set, boolean z) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        this.LLILLL = new C481910Iv7(str);
        if (!set.isEmpty()) {
            C481670Iuj c481670Iuj = C481670Iuj.LIZ;
            Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
            Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
            if (obj == null) {
                synchronized (c481670Iuj) {
                    try {
                        Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                        obj = obj2;
                        if (obj2 == null) {
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
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
                            map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
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
            boolean z2 = obj instanceof C486370J5n;
            Object obj3 = obj;
            if (!z2) {
                obj3 = null;
            }
            C0J66 c0j66 = (C0J66) obj3;
            if (c0j66 != null) {
                C486380J5o c486380J5o = new C486380J5o(null, null, null, 63);
                c486380J5o.LIZJ = str;
                if (i == 5) {
                    c486380J5o.LIZLLL = set;
                    c486380J5o.LJFF = z;
                } else {
                    c486380J5o.LJ = set;
                    c486380J5o.LJFF = false;
                }
                c0j66.LJIIJ(c486380J5o);
            }
        }
    }

    public final void LJIJJLI(long j, long j2, String str, String str2, Function1 function1) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        ((LiveRoomPreloadApi) this.LLJ.getValue()).preloadSlimRoom(j, j2, str2).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0J5q
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                SlimRoom slimRoom = (SlimRoom) baseResponse.data;
                if (slimRoom == null || slimRoom.getId() == 0) {
                    return null;
                }
                return GsonProtectorUtils.toJson(C09C2.LIZ(), baseResponse.data);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S2200100_7(jUptimeMillis, this, str, str2, function1, 1), new AfS0S2200100_7(jUptimeMillis, this, str, str2, function1, 2));
    }

    public final void LJIL(long j, long j2, String str, String str2, Function1 function1) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        ((LiveRoomPreloadApi) this.LLJ.getValue()).preloadSlimRoom(j, j2, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S2200100_7(jUptimeMillis, this, str, str2, function1, 3), new AfS0S2200100_7(jUptimeMillis, this, str, str2, function1, 0));
    }

    @Override // X.InterfaceC1602300rnY
    public final void LJIIJ(String str, long j, long j2, String str2, long j3, Function1<? super String, Unit> function1) {
        if (j3 > 0) {
            C2487409ou.LIZLLL(j3, new ARunnableS0S2200200_7(this, str, j, j2, str2, function1, 0));
        } else {
            LJIJJLI(j, j2, str, str2, function1);
        }
    }
}
