package X;

import Y.AfS181S0100000_12;
import Y.AkS475S0100000_12;
import android.content.Context;
import android.util.Log;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualCameraStateMessage;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.CastLinkerWrapper;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.ICastSource$CastParams;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting2;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS141S0400000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TE2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TE2 implements C0TEE {
    public final String LIZ;
    public final long LIZIZ;
    public final C0TDY LIZJ;
    public C0TEO LJ;
    public ISurfaceListener LJFF;
    public CastLinkerWrapper LJI;
    public final C11PQ<AbstractC743230TDl> LJIIIIZZ;
    public final C11PQ<EnumC743340TDw> LJIIIZ;
    public final C11NJ LJIIJ;
    public ICastSource$CastParams LJIIJJI;
    public ServiceInfo LJIIL;
    public ServiceInfo LJIILIIL;
    public Function1<? super Boolean, Unit> LJIILJJIL;
    public C11JF LJIILL;
    public C11JF LJIILLIIL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(270));
    public boolean LJII = true;

    public final void LIZIZ() {
        C0TEO c0teo;
        ServiceInfo serviceInfo = this.LJIILIIL;
        if (serviceInfo == null || (c0teo = this.LJ) == null) {
            return;
        }
        C0TEM.LIZIZ(new AwS413S0200000_12(c0teo, serviceInfo, 40));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disConnect() info = ");
        sbLIZ.append(serviceInfo);
        C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJ() {
        return this.LJIIIZ.LJLZ() == EnumC743340TDw.CAST_STATE_CONNECTING || this.LJIIIZ.LJLZ() == EnumC743340TDw.CAST_STATE_RECONNECTING || this.LJIIIZ.LJLZ() == EnumC743340TDw.CAST_STATE_UPDATING_PARAMS;
    }

    public final void LJII() throws Throwable {
        this.LJIIJ.dispose();
        CastLinkerWrapper castLinkerWrapper = this.LJI;
        if (castLinkerWrapper != null) {
            castLinkerWrapper.LJI();
        }
        this.LJI = null;
        C0TEO c0teo = this.LJ;
        if (c0teo != null) {
            C0TEM.LIZIZ(new AwS556S0100000_12(c0teo, 800));
            C20441214yg.LJIIIZ("ByteCastSourceWrapper", "stopRecorder()");
        }
        AfS181S0100000_12 afS181S0100000_12 = new AfS181S0100000_12(this, 184);
        if (this.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_MIRRORING) {
            afS181S0100000_12.accept(EnumC743340TDw.CAST_STATE_DISCONNECT);
            return;
        }
        C11JF c11jf = this.LJIILL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LIZIZ();
        this.LJIILL = (C11JF) this.LJIIIZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TE1
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj == EnumC743340TDw.CAST_STATE_DISCONNECT) {
                    return true;
                }
                return false;
            }
        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(afS181S0100000_12, new C09JN() { // from class: X.0TDc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.release$2");
                C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.release$2");
            }
        });
    }

    @Override // X.C0TEE
    public final void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("connect isFromClick = ");
        sbLIZ.append(z);
        sbLIZ.append(",linkState.value  = ");
        sbLIZ.append(this.LJIIIZ.LJLZ());
        C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_MIRRORING && this.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_IDLE) {
            LJIIJ(this, 2, z, false, 4);
        }
    }

    public final void LIZJ(Function1 function1) {
        this.LJ = new C0TEO();
        this.LJIILJJIL = function1;
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        C20441214yg.LIZIZ("GameDualDeviceSourceLink2", "set cast play listener");
        C0TEO c0teo = this.LJ;
        if (c0teo != null) {
            final C11PQ<AbstractC743230TDl> c11pq = this.LJIIIIZZ;
            IMirrorListener iMirrorListener = new IMirrorListener(c11pq) { // from class: X.0TEG
                public final C11PQ<AbstractC743230TDl> LIZ;

                public final /* synthetic */ void onConnectFailed(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LIZIZ(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onConnected(ServiceInfo serviceInfo) {
                    1JMD.LIZJ(this, serviceInfo);
                }

                public final /* synthetic */ void onConnecting(ServiceInfo serviceInfo) {
                    1JMD.LIZLLL(this, serviceInfo);
                }

                public final /* synthetic */ void onDisconnected(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJFF(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onDisconnecting(ServiceInfo serviceInfo) {
                    1JMD.LJI(this, serviceInfo);
                }

                public final /* synthetic */ void onError(int i, int i2, int i3, String str) {
                    1JFt.LIZ(this, i, i2, i3, str);
                }

                public final /* synthetic */ void onInfo(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJIIIIZZ(this, serviceInfo, i, str);
                }

                public final boolean onInvite(String str, int i) {
                    return false;
                }

                public final /* synthetic */ boolean onInvite(String str, int i, String str2) {
                    return 1JFt.LJ(this, str, i, str2);
                }

                public final void onMirrorModeChange(int i) {
                }

                public final boolean onStartMirrorAuthorization() {
                    return true;
                }

                public final void onStatistics(Statistics statistics) {
                }

                {
                    this.LIZ = c11pq;
                }

                public final void onStart(int i) {
                    if (i != 3) {
                        return;
                    }
                    this.LIZ.onNext(new C743180TDg(i));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStart serviceId=");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                }

                public final void onStop(int i) {
                    if (i != 3) {
                        return;
                    }
                    this.LIZ.onNext(new C743240TDm(i));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStop serviceId=");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                }

                public final void onConnect(ServiceInfo serviceInfo, int i) {
                    Boolean boolValueOf;
                    String str;
                    if (serviceInfo != null && (str = serviceInfo.protocols) != null) {
                        boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "ByteLink", false));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                        return;
                    }
                    this.LIZ.onNext(new C743310TDt(serviceInfo, i));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onConnect serviceInfo=");
                    sbLIZ.append(serviceInfo);
                    sbLIZ.append(",extra = ");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                }

                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
                    Boolean boolValueOf;
                    String str;
                    if (serviceInfo != null && (str = serviceInfo.protocols) != null) {
                        boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "ByteLink", false));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                        return;
                    }
                    if ((i != 211005 && i != 211032) || (i2 != 10022011 && i2 != 10022009)) {
                        this.LIZ.onNext(new C743190TDh(serviceInfo, i, i2));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDisconnect serviceInfo=");
                        sbLIZ.append(serviceInfo);
                        sbLIZ.append(",what = ");
                        sbLIZ.append(i);
                        sbLIZ.append(",extra =");
                        sbLIZ.append(i2);
                        C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    this.LIZ.onNext(new C743320TDu(i, i2));
                }

                public final void onError(ServiceInfo serviceInfo, int i, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError what=");
                    sbLIZ.append(211005);
                    sbLIZ.append(",errorCode=");
                    sbLIZ.append(i);
                    sbLIZ.append(",msg=");
                    sbLIZ.append(str);
                    C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                    if (i == 14004004) {
                    }
                    switch (i) {
                        case 10020015:
                            this.LIZ.onNext(new C743220TDk(211005, i, str));
                            break;
                        case 10020016:
                            this.LIZ.onNext(new AbstractC743230TDl(i, str) { // from class: X.0TDj
                                public final int LIZ = 211005;
                                public final int LIZIZ;
                                public final String LIZJ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C743210TDj)) {
                                        return false;
                                    }
                                    C743210TDj c743210TDj = (C743210TDj) obj;
                                    return this.LIZ == c743210TDj.LIZ && this.LIZIZ == c743210TDj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c743210TDj.LIZJ);
                                }

                                public final int hashCode() {
                                    int i2 = ((this.LIZ * 31) + this.LIZIZ) * 31;
                                    String str2 = this.LIZJ;
                                    return i2 + (str2 == null ? 0 : str2.hashCode());
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("CastReconnectingSucceed(what=");
                                    sbLIZ2.append(this.LIZ);
                                    sbLIZ2.append(", extra=");
                                    sbLIZ2.append(this.LIZIZ);
                                    sbLIZ2.append(", msg=");
                                    sbLIZ2.append(this.LIZJ);
                                    sbLIZ2.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ2);
                                }

                                {
                                    this.LIZIZ = i;
                                    this.LIZJ = str;
                                }
                            });
                            break;
                        default:
                            if (i != 10022011 && i != 10022009) {
                                this.LIZ.onNext(new C743290TDr(211005, i, str));
                            } else {
                                this.LIZ.onNext(new C743320TDu(211005, i));
                            }
                            break;
                    }
                }

                public final void onInfo(int i, int i2, int i3, String str) {
                    if (i != 3) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInfo what=");
                    sbLIZ.append(i2);
                    sbLIZ.append(",errorCode=");
                    sbLIZ.append(i3);
                    C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                    if (i2 == 300010 && i3 == 300010 && str != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            C0TEY.LIZIZ = jSONObject.optBoolean("is_hw");
                            C0TEY.LIZJ = jSONObject.optBoolean("dynamic_stream");
                            C0TEY.LJ = jSONObject.optInt("bitrate");
                            C0TFE.LJIILL(new Pair("is_hw", String.valueOf(C0TEY.LIZIZ)));
                            C0TFE.LJIILL(new Pair("is_dynamic_bitrate", String.valueOf(C0TEY.LIZJ)));
                            C0TFE.LJIILL(new Pair("bitrate", String.valueOf(C0TEY.LJ)));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJI("DualDeviceSourceReport", e);
                        }
                    }
                }
            };
            C0TEM.LIZIZ(new AwS413S0200000_12(c0teo, iMirrorListener, 44));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMirrorListener() iMirrorListener = ");
            sbLIZ.append(iMirrorListener);
            C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0TEO c0teo2 = this.LJ;
        if (c0teo2 != null) {
            C0TFE c0tfe = C0TFE.LIZ;
            boolean zBooleanValue = ((Boolean) this.LIZLLL.getValue()).booleanValue();
            c0tfe.getClass();
            Config configLJ = C0TFE.LJ("ByteCast", zBooleanValue);
            IInitListener iInitListener = new IInitListener() { // from class: X.0TDq
                public final /* synthetic */ void onError(int i, String str) {
                    1JMs.LIZ(this, i, str);
                }

                public final void onSuccess() {
                    C20441214yg.LIZIZ("GameDualDeviceSourceLink2", "init success");
                    C11JF c11jf = this.LIZ.LJIILLIIL;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    this.LIZ.LJIILLIIL = (C11JF) C11NZ.LJJJJZ(1).LJJJJZI(new AkS475S0100000_12(this.LIZ, 6)).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(this.LIZ, 185), new C09JN() { // from class: X.0TDp
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.getInitListener$1$onSuccess$3");
                            C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString((Throwable) obj));
                            C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.getInitListener$1$onSuccess$3");
                        }
                    });
                    C0TE2 c0te2 = this.LIZ;
                    C11JF c11jf2 = c0te2.LJIILLIIL;
                    if (c11jf2 != null) {
                        c0te2.LJIIJ.LIZ(c11jf2);
                    }
                }

                public final void onFail(int i, String str, Exception exc) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("init failed:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", errMsg:");
                    sbLIZ2.append(str);
                    C20441214yg.LIZIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ.LJIIIIZZ.onNext(new C743160TDe(i, str));
                }
            };
            C0TEM.LIZIZ(new AwS141S0400000_12(c0teo2, context, configLJ, iInitListener, 1));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init context = ");
            sbLIZ2.append(context);
            sbLIZ2.append(",config = ");
            sbLIZ2.append(configLJ);
            sbLIZ2.append(",listener = ");
            sbLIZ2.append(iInitListener);
            C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJFF(boolean z) {
        int i = !z ? 1 : 0;
        if (this.LJIILIIL != null) {
            C0TFE c0tfe = C0TFE.LIZ;
            DualCameraStateMessage dualCameraStateMessage = new DualCameraStateMessage(i);
            c0tfe.getClass();
            String strLIZ = C0TFE.LIZ(dualCameraStateMessage);
            if (strLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onlySendCameraMsg send camera on or off msg, state : ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                C0TEO c0teo = this.LJ;
                if (c0teo != null) {
                    c0teo.LIZ(10035, strLIZ);
                }
            }
        }
    }

    public final void LJI(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.LJIILJJIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        if (this.LJIIIZ.LJLZ() == EnumC743340TDw.CAST_STATE_MIRRORING) {
            if (z) {
                C0TEO c0teo = this.LJ;
                if (c0teo != null) {
                    C0TEM.LIZIZ(new AwS556S0100000_12(c0teo, 799));
                    C20441214yg.LJIIIZ("ByteCastSourceWrapper", "startRecorder()");
                    return;
                }
                return;
            }
            C0TEO c0teo2 = this.LJ;
            if (c0teo2 == null) {
                return;
            }
            C0TEM.LIZIZ(new AwS556S0100000_12(c0teo2, 800));
            C20441214yg.LJIIIZ("ByteCastSourceWrapper", "stopRecorder()");
        }
    }

    public final void LJIIIIZZ(boolean z) {
        int i;
        if (z) {
            i = 0;
            LJI(false);
        } else {
            i = 1;
            LJI(true);
        }
        if (this.LJIILIIL != null) {
            C0TFE c0tfe = C0TFE.LIZ;
            DualCameraStateMessage dualCameraStateMessage = new DualCameraStateMessage(i);
            c0tfe.getClass();
            String strLIZ = C0TFE.LIZ(dualCameraStateMessage);
            if (strLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("send camera on or off msg, state : ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                C0TEO c0teo = this.LJ;
                if (c0teo != null) {
                    c0teo.LIZ(10035, strLIZ);
                }
            }
        }
    }

    public final void LJIIIZ(IMessageListener iMessageListener) {
        C0TEO c0teo = this.LJ;
        if (c0teo != null) {
            C0TEM.LIZIZ(new AwS413S0200000_12(c0teo, iMessageListener, 42));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMessageListener() listener = ");
            sbLIZ.append(iMessageListener);
            C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C0TE2(LifecycleEventsObservable lifecycleEventsObservable, String str, long j, C0TDY c0tdy) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = c0tdy;
        C0TE4 c0te4 = new C0TE4(this);
        C11PQ<AbstractC743230TDl> c11pqLJLLLLLL = C11PQ.LJLLLLLL(C743260TDo.LIZ);
        this.LJIIIIZZ = c11pqLJLLLLLL;
        C11PQ<EnumC743340TDw> c11pqLJLLLLLL2 = C11PQ.LJLLLLLL(EnumC743340TDw.CAST_STATE_IDLE);
        this.LJIIIZ = c11pqLJLLLLLL2;
        C11NJ c11nj = new C11NJ();
        this.LJIIJ = c11nj;
        CastLinkerWrapper castLinkerWrapper = new CastLinkerWrapper();
        castLinkerWrapper.LIZ = c0te4;
        castLinkerWrapper.setReconnectInterval(LiveGameDualDeviceSourceSetting2.INSTANCE.getRetryDuration());
        this.LJI = castLinkerWrapper;
        c11nj.LIZ(lifecycleEventsObservable.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 182), new C09JN() { // from class: X.010K
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.<init>$3");
                C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.<init>$3");
            }
        }));
        c11nj.LIZ(c11pqLJLLLLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 183), new C09JN() { // from class: X.00qJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.<init>$5");
                C20441214yg.LJI("GameDualDeviceSourceLink2", (Throwable) obj);
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.<init>$5");
            }
        }));
        c11nj.LIZ(c11pqLJLLLLLL2.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00Qt
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.<init>$6");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linkState = ");
                sbLIZ.append(obj);
                C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.<init>$6");
            }
        }, new C09JN() { // from class: X.00qK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.<init>$7");
                C20441214yg.LJI("GameDualDeviceSourceLink2", (Throwable) obj);
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.<init>$7");
            }
        }));
    }

    public static void LJIIJ(final C0TE2 c0te2, final int i, final boolean z, final boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        c0te2.getClass();
        c0te2.LJIIJ.LIZ(C11NZ.LJJJJZ(Integer.valueOf(i)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0TE3
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.startStrategyWrapper$1");
                Integer num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() == 1) {
                        if (!this.LL.LJ() && this.LL.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_ERROR) {
                            CastLinkerWrapper castLinkerWrapper = this.LL.LJI;
                            if (castLinkerWrapper != null) {
                                castLinkerWrapper.startStrategy(i);
                            }
                            this.LL.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_CONNECTING);
                        }
                    } else if (num.intValue() == 2) {
                        if ((z2 || !this.LL.LJ()) && this.LL.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_ERROR && (z || this.LL.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_RECONNECT_FAILED)) {
                            this.LL.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_RECONNECTING);
                            CastLinkerWrapper castLinkerWrapper2 = this.LL.LJI;
                            if (castLinkerWrapper2 != null) {
                                castLinkerWrapper2.startStrategy(i);
                            }
                            if (z) {
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_reconnect_started");
                                c474500IjALIZ.LJJII(C0TEY.LJI, "user_id");
                                c474500IjALIZ.LJJII(C0TEY.LJII, "room_id");
                                c474500IjALIZ.LJJII("manual", "reason");
                                c474500IjALIZ.LIZ();
                                C0TEY.LJIIL++;
                            } else {
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_dual_device_source_reconnect_started");
                                c474500IjALIZ2.LJJII(C0TEY.LJI, "user_id");
                                c474500IjALIZ2.LJJII(C0TEY.LJII, "room_id");
                                c474500IjALIZ2.LJJII("auto", "reason");
                                c474500IjALIZ2.LIZ();
                                C0TEY.LJIIJJI++;
                            }
                        }
                    } else if (num.intValue() == 3 && !this.LL.LJ() && this.LL.LJIIIZ.LJLZ() != EnumC743340TDw.CAST_STATE_ERROR) {
                        this.LL.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_UPDATING_PARAMS);
                        CastLinkerWrapper castLinkerWrapper3 = this.LL.LJI;
                        if (castLinkerWrapper3 != null) {
                            castLinkerWrapper3.startStrategy(i);
                        }
                    }
                }
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.startStrategyWrapper$1");
            }
        }, new C09JN() { // from class: X.010J
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceLink2@53d6.startStrategyWrapper$2");
                C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceSourceLink2@53d6.startStrategyWrapper$2");
            }
        }));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startStrategy strategy = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(int i, String str, int i2, int i3, int i4, Integer num, Float f, int i5) {
        int i6;
        ICastSource$CastParams iCastSource$CastParams = new ICastSource$CastParams(i, str, i2, i3, i4, num, f);
        this.LJIIJJI = iCastSource$CastParams;
        CastLinkerWrapper castLinkerWrapper = this.LJI;
        if (castLinkerWrapper != null) {
            castLinkerWrapper.LJII(iCastSource$CastParams);
        }
        ServiceInfo serviceInfo = new ServiceInfo();
        serviceInfo.port = -1;
        serviceInfo.portMirror = i;
        serviceInfo.ip = str;
        serviceInfo.protocols = "ByteLink";
        this.LJIILIIL = serviceInfo;
        if (i5 >= 2) {
            if (this.LIZJ == C0TDY.CAST_PHONE_AS_CAMERA) {
                i6 = 30000;
            } else {
                i6 = 0;
            }
            CastLinkerWrapper castLinkerWrapper2 = this.LJI;
            if (castLinkerWrapper2 != null) {
                castLinkerWrapper2.setCastSceneNative(i6);
            }
        }
    }
}
