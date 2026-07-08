package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS1S0103000_20;
import Y.ARunnableS1S2101000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS2S0120000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS4S1101000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS7S0102000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateFpsResolutionCommand;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.augur.AugurAdaptiveWrapper;
import com.ss.lyrax.augur.command.AbsAugurCommand;
import com.ss.lyrax.augur.command.AugurEffectStrategyCommand;
import com.ss.lyrax.engine.LyraxBaseContext;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoFrameStatistics;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0j3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266350j3h implements InterfaceC1273910jFt, InterfaceC1269420j8e, InterfaceC1267920j6E, InterfaceC1272510jDd, InterfaceC1267000j4k, InterfaceC1268590j7J, InterfaceC1270850jAx {
    public final AtomicBoolean A;
    public final ARunnableS120S0100000_20 B;
    public final C1268720j7W C;
    public final C1269940j9U D;
    public final boolean E;
    public final boolean F;
    public JSONObject G;
    public final C1266840j4U H;
    public boolean I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1269850j9L f148J;
    public final C1273370jF1 K;
    public C1268260j6m L;
    public final Handler LL;
    public final Handler LLILLJJLI;
    public final Handler LLILLL;
    public final InterfaceC1272120jD0 LLILZ;
    public final AudioDeviceModule LLILZIL;
    public final C1269160j8E LLILZLL;
    public InterfaceC1266360j3i LLIZ;
    public C1266700j4G LLIZLLLIL;
    public InterfaceC1274510jGr LLJ;
    public final InterfaceC1266960j4g LLJI;
    public MediaEncodeStream LLJIJIL;
    public final VideoFrameStatistics LLJILJIL;
    public VideoTrack LLJILJILJ;
    public AudioTrack LLJILLL;
    public MediaEngineFactory LLJJ;
    public VideoSink LLJJI;
    public InterfaceC775290Ub9 LLJJIII;
    public C0UHL LLJJIJI;
    public InterfaceC1268540j7E LLJJIJIIJIL;
    public LiveStreamVideoCapture LLJJIJIL;
    public InterfaceC1266410j3n LLJJJ;
    public C1266420j3o LLJJJIL;
    public final C1270640jAc LLJJJJ;
    public final C1269730j99 LLJJJJJIL;
    public C1269370j8Z LLJJL;
    public C1268550j7F LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public InterfaceC1268640j7O LLJLILLLLZIIL;
    public final C1273620jFQ LLJLL;
    public AbstractC765580U1k LLJLLIL;
    public C1270500jAO LLJLLL;
    public final AtomicInteger LLJZ;
    public SafeHandlerThread LLJZIJLIL;
    public SafeHandlerThread LLL;
    public SafeHandlerThread LLLF;
    public String LLLFF;
    public List<String> LLLFFI;
    public String LLLFZ;
    public TEBundle LLLI;
    public volatile long LLLIIII;
    public C1272040jCs LLLIIIIL;
    public C1267850j67 LLLIIIL;
    public InterfaceC1267860j68 LLLIILIL;
    public final ArrayList<InterfaceC1268820j7g> LLLILZ;
    public final ArrayList<InterfaceC1274500jGq> LLLILZJ;
    public final C1269780j9E LLLILZLLLI;
    public AudioMixer.AudioMixerDescription LLLJIL;
    public final VideoMixer.VideoMixerDescription LLLJL;
    public boolean LLLL;
    public final HashMap<String, C1266760j4M> LLLLJI;
    public boolean LLLLLILLIL;
    public C1268410j71 LLLLLJIL;
    public volatile boolean LLLLLJLJLL;
    public volatile boolean LLLLLL;
    public TEBundle LLLLLLIL;
    public final boolean LLLLLLJ;
    public C1267900j6C LLLLLLL;
    public final C1266720j4I LLLLLLLLL;
    public C1267350j5J LLLLLLLLLL;
    public C1266650j4B LLLLLLLZIL;
    public C1266770j4N LLLLLLZ;
    public boolean LLLLLZ;
    public volatile EnumC1267980j6K LLLLZ;
    public final EnumC1267980j6K LLLLZI;
    public C1279020jO8 LLLLZIL;
    public C1267550j5d LLLLZLL;
    public C1267840j66 LLLLZLLIL;
    public ARunnableS120S0100000_20 LLLLZLLLI;
    public View LLLZ;
    public EnumC1269700j96 LLLZI;
    public boolean LLLZIIL;
    public boolean LLLZIL;
    public final C1267620j5k LLLZL;
    public final C1267610j5j LLLZLL;
    public final C1266390j3l LLLZLZ;
    public C1271420jBs LLLZZ;
    public int LLLZZIL;
    public int LLZ;
    public int LLZIL;
    public int LLZILL;
    public int LLZL;
    public int LLZLI;
    public int LLZLL;
    public int LLZLLIL;
    public int LLZLLLL;
    public int LLZZ;
    public int LLZZJLIL;
    public int LLZZLLIL;
    public int LLZZZIL;
    public C1267280j5C LLZZZZ;
    public final C1266850j4V M;
    public final C1266800j4Q N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C1268020j6O f149O;
    public final C1269750j9B P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final C1266640j4A V;
    public final C1266430j3p W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC1266830j4T f150X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f151Y;
    public final ARunnableS120S0100000_20 Z;
    public SafeHandlerThread a;
    public InterfaceC1269980j9Y a0;
    public Handler b;
    public AugurAdaptiveWrapper c;
    public InterfaceC1274230jGP d;
    public TTLHAbnormalDetectorJava e;
    public WeakReference<TTLHSceneDetector> f;
    public final Object g;
    public final Object h;
    public long i;
    public C1268130j6Z j;
    public C923980a9U k;
    public final C1267500j5Y l;
    public C0UHH m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public C1267560j5e t;
    public final C1267790j61 u;
    public volatile C1269240j8M v;
    public final Object w;
    public final C1266580j44 x;
    public C1267690j5r y;
    public RunnableC1266370j3j z;
    public volatile String LLJJJJLIIL = "";
    public boolean LLJL = true;
    public final ReentrantReadWriteLock LLLII = new ReentrantReadWriteLock();
    public C1267930j6F LLLIIL = new C1267930j6F(this);
    public final Object LLLIL = new Object();
    public final C1266780j4O LLLIZZ = new InterfaceC1269920j9S() { // from class: X.0j4O
        @Override // X.InterfaceC1269920j9S
        public final void LIZ(int i) {
            this.LIZ.LJJLIIIIJ(105, 10, i);
        }
    };
    public final Object LLLJ = new Object();
    public boolean LLLLII = true;
    public int LLLLIIIILLL = 0;
    public int LLLLIIL = 1;
    public boolean LLLLIILL = false;
    public boolean LLLLIILLL = false;
    public boolean LLLLIL = false;
    public final int[] LLLLILI = new int[3];
    public long LLLLJ = 0;
    public int LLLLL = 0;
    public long LLLLLIL = 0;
    public long LLLLLLZZ = 0;
    public long LLLLLZIL = 0;
    public final List<C1269610j8x> LLLLLZL = new LinkedList();

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJIZL(DnsOptimizer dnsOptimizer) {
    }

    @Override // X.InterfaceC1273910jFt
    public final /* synthetic */ int LJJJJZI(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1274500jGq LJJZ() {
        return LJLZ(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0j71, android.media.AudioManager$AudioRecordingCallback] */
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
    public final void LJZL() {
        AudioDeviceModule audioDeviceModule;
        C1267850j67 c1267850j67;
        if (this.LLJZ.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_ERROR");
            LLLIIL(1, -100, new Exception("Error status call on start"));
            return;
        }
        if (this.LLJZ.get() == 7) {
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            AVLog.iow("LiveStream", "Already start audio capture");
            return;
        }
        int i = this.LLLLIIL;
        this.LLILZLL.LJIIIIZZ().getClass();
        int i2 = this.LLILZLL.LJIIIIZZ().LIZ;
        this.LLILZLL.LJIIIIZZ().getClass();
        this.LLJJLIIIJLLLLLLLZ = new C1268550j7F(i, i2, this, this.LLILZLL.LJIIJJI(), this.LLILZIL);
        if (this.LLILZIL != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                final C1269780j9E c1269780j9E = this.LLLILZLLLI;
                ?? r3 = new AudioManager.AudioRecordingCallback(c1269780j9E) { // from class: X.0j71
                    public final WeakReference<C1269780j9E> LIZ;

                    {
                        this.LIZ = new WeakReference<>(c1269780j9E);
                    }

                    @Override // android.media.AudioManager.AudioRecordingCallback
                    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                        final C1269780j9E c1269780j9E2;
                        super.onRecordingConfigChanged(list);
                        if (list.size() > 0) {
                            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(list, 0);
                            if (Build.VERSION.SDK_INT >= 29 && (c1269780j9E2 = this.LIZ.get()) != null && audioRecordingConfiguration != null) {
                                final boolean zIsClientSilenced = audioRecordingConfiguration.isClientSilenced();
                                final long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                C786410Ut5.LJJZZIII(c1269780j9E2.LL, new Runnable() { // from class: X.0j70
                                    public final void LIZ() {
                                        JSONObject jSONObjectLIZIZ = c1269780j9E2.LIZIZ(jCurrentTimeMillis);
                                        if (jSONObjectLIZIZ != null) {
                                            try {
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put("clockMs", jNativeNanoTime);
                                                jSONObject.put("interrupt", zIsClientSilenced);
                                                jSONObjectLIZIZ.put("event_key", "session_interrupt").put("message", C786410Ut5.J3(jSONObject));
                                                InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E2.LLILZIL;
                                                if (interfaceC1266880j4Y != null) {
                                                    interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                                                }
                                            } catch (JSONException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("LiveStreamLogService@648d.onSessionInterrupt$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("LiveStreamLogService@648d.onSessionInterrupt$1");
                                    }
                                });
                            }
                        }
                    }
                };
                this.LLLLLJIL = r3;
                this.LLILZIL.registerAudioRecordingCallback(r3, this.LL);
            }
            this.LLJJLIIIJLLLLLLLZ.setAudioDeviceModule(this.LLILZIL);
        }
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F != null) {
            this.LLJILLL = this.LLJJ.createAudioTrack(c1268550j7F);
            this.LLJJLIIIJLLLLLLLZ.setCalculatePcmPowerEventObserver(this);
            this.LLJJLIIIJLLLLLLLZ.setAudioQuantizeGapPeriod(this.LLILZLL.LJIILJJIL);
        }
        C1268550j7F c1268550j7F2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F2 != null) {
            c1268550j7F2.nativeAdaptedOutputFormat(this.LLILZLL.LJIIJ(), 2, this.LLILZLL.LJIILLIIL);
            AudioDeviceModule audioDeviceModule2 = this.LLILZIL;
            if (audioDeviceModule2 != null) {
                TEBundle parameter = audioDeviceModule2.getParameter();
                this.LLILZLL.LJIIIIZZ().getClass();
                parameter.setInt("audio_sample", 44100);
                parameter.setInt("audio_channels", this.LLILZLL.LJIIIIZZ().LIZ);
                parameter.setInt("audio_bit_width", this.LLILZLL.LJIILLIIL);
                this.LLILZIL.setParameter(parameter);
            }
        }
        boolean z = false;
        if (this.LLJILLL != null) {
            LJJLIIIIJ(7, 0, 0);
            try {
                if (!LLLLLLJ()) {
                    this.LLJJLIIIJLLLLLLLZ.start();
                }
                int iUpdateChannel = this.LLJJLIIIJLLLLLLLZ.updateChannel();
                if (iUpdateChannel != this.LLILZLL.LJIIIIZZ().LIZ) {
                    LJJLIIIIJ(17, iUpdateChannel, 0);
                }
                this.LLILZLL.LJIIIIZZ().LIZ = iUpdateChannel;
                this.LLJL = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLJL) {
                    this.LLJL = false;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Open capture failed(");
                    sbLIZ.append(e.getCause());
                    sbLIZ.append(e3.h);
                    sbLIZ.append(Log.getStackTraceString(e));
                    sbLIZ.append(")) with try open audio capture at after ");
                    sbLIZ.append(400L);
                    sbLIZ.append(" ms later");
                    AVLog.iow("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.LJLIIL(400L, this.LL, new ARunnableS120S0100000_20(this, 370));
                    return;
                }
                this.LLJZ.set(8);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Start audio capture failed: ");
                sbLIZ2.append(e.toString());
                AVLog.ioe("LiveStream", C2188811AlT.LIZIZ(sbLIZ2));
                LLLIIL(3, -300, e);
            }
            this.LLJJLIIIJLLLLLLLZ.getClass();
            C1270500jAO c1270500jAO = this.LLJLLL;
            if (c1270500jAO != null) {
                c1270500jAO.LLJJJ = this.LLJJLIIIJLLLLLLLZ;
            }
            AudioDeviceModule audioDeviceModule3 = this.LLILZIL;
            if (audioDeviceModule3 != null) {
                C1267850j67 c1267850j672 = this.LLLIIIL;
                if (c1267850j672 != null) {
                    audioDeviceModule3.addAudioSink(3, c1267850j672);
                }
            } else {
                AudioTrack audioTrack = this.LLJILLL;
                if (audioTrack != null && (c1267850j67 = this.LLLIIIL) != null) {
                    audioTrack.addAudioSink(c1267850j67);
                }
            }
            if (this.LLLIIIL != null) {
                this.LLJJLIIIJLLLLLLLZ.getClass();
            }
            AVLog.ioi("LiveStream", "Start audio capture success");
            LJJLIIIIJ(8, 0, 0);
            if (this.LLILZLL.LJLJI.LJJIFFI) {
                C1269520j8o.LIZ("startAudioCapture");
            }
        }
        C1267500j5Y c1267500j5Y = this.l;
        if (c1267500j5Y.LIZ.captureBase.videoCapture.LIZ == 3 && (audioDeviceModule = this.LLILZIL) != null) {
            C1268810j7f c1268810j7f = c1267500j5Y.LIZIZ.LJJIL;
            if (c1268810j7f.LIZ && !c1268810j7f.LJFF) {
                z = true;
            }
            audioDeviceModule.enableAudioPushStream(!z);
        }
        if (LLJL()) {
            LJLIIL();
        }
    }

    public final void LLD() {
        AudioTrack audioTrack;
        C1268410j71 c1268410j71;
        AVLog.logKibana(5, "LiveStream", "doStopAudioSource", null);
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            AudioDeviceModule audioDeviceModule = this.LLILZIL;
            if (audioDeviceModule != null && (c1268410j71 = this.LLLLLJIL) != null) {
                audioDeviceModule.unRegisterAudioRecordingCallback(c1268410j71);
            }
            this.LLLII.writeLock().lock();
            MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
            if (mediaEncodeStream != null && (audioTrack = this.LLJILLL) != null) {
                mediaEncodeStream.removeTrack(audioTrack);
                LLLIIII(false);
            }
            C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
            if (c1268550j7F != null) {
                c1268550j7F.setCalculatePcmPowerEventObserver(null);
                this.LLJJLIIIJLLLLLLLZ.getClass();
                this.LLJJLIIIJLLLLLLLZ.stop();
                this.LLJJLIIIJLLLLLLLZ.release();
                this.LLJJLIIIJLLLLLLLZ = null;
                AVLog.ioi("LiveStream", "Stop audio capture success");
            }
            AudioTrack audioTrack2 = this.LLJILLL;
            if (audioTrack2 != null) {
                AudioDeviceModule audioDeviceModule2 = this.LLILZIL;
                if (audioDeviceModule2 != null) {
                    C1267850j67 c1267850j67 = this.LLLIIIL;
                    if (c1267850j67 != null) {
                        audioDeviceModule2.removeAudioSink(3, c1267850j67);
                    }
                } else {
                    C1267850j67 c1267850j672 = this.LLLIIIL;
                    if (c1267850j672 != null) {
                        audioTrack2.removeAudioSink(c1267850j672);
                    }
                }
                this.LLJILLL.setAudioProcessor(null);
                this.LLJILLL.release();
                this.LLJILLL = null;
            }
            this.LLLII.writeLock().unlock();
            C1270500jAO c1270500jAO = this.LLJLLL;
            if (c1270500jAO != null) {
                c1270500jAO.LLJJJ = null;
            }
            LJJLIIIIJ(9, 0, 0);
        }
        if (this.LLILZLL.LJLJI.LJJIFFI) {
            C1269520j8o.LIZ("stopAudioCapture");
        }
    }

    public final void LLJLL() {
        this.LLLZIL = true;
        this.LLJZ.set(2);
        if (this.LLLZIIL) {
            return;
        }
        if (LLJL()) {
            LJLIIL();
        }
        LJJLIIIIJ(2, 0, 0);
    }

    public final synchronized void LLLI() {
        C1272810jE7 c1272810jE7;
        Looper looper;
        Thread thread;
        Looper looper2;
        Thread thread2;
        C1269910j9R c1269910j9RLJIJJ;
        C1271230jBZ c1271230jBZ;
        this.A.set(true);
        this.LLLZLZ.LLILZIL = true;
        AVLog.logApiCall("LiveCoreAPI", "releaseTTLH", null);
        Handler handler = C1269260j8O.LIZIZ(this.l) ? this.l.LIZIZ.LJJJZ : this.LL;
        LLLILZJ();
        LyraxBaseContext.dispose();
        C1273620jFQ c1273620jFQ = this.LLJLL;
        if (c1273620jFQ != null) {
            c1273620jFQ.LJIIJ = true;
            if (c1273620jFQ.LIZ.enable2sJankCallback) {
                c1273620jFQ.LJII.removeCallbacks(c1273620jFQ.LJIIZILJ);
            }
        }
        synchronized (this.w) {
            try {
                C1269240j8M c1269240j8M = this.v;
                this.v = null;
                if (c1269240j8M != null) {
                    c1269240j8M.release();
                }
            } finally {
            }
        }
        if (this.l.LIZ.LJIIL) {
            this.f151Y = false;
            Handler handler2 = this.LL;
            if (handler2 != null) {
                handler2.removeCallbacks(this.Z);
            }
        }
        C1267790j61 c1267790j61 = this.u;
        if (c1267790j61 != null) {
            c1267790j61.LIZ();
        }
        C1268130j6Z c1268130j6Z = this.j;
        if (c1268130j6Z != null) {
            c1268130j6Z.LJFF();
            this.j = null;
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O instanceof C1272090jCx) {
            C1272090jCx c1272090jCx = (C1272090jCx) interfaceC1268640j7O;
            if (this.E) {
                c1272090jCx.LLLLIL = null;
                c1272090jCx.LLLZZ = null;
            }
            if (this.LLILZLL.LJLJI.LJJI && (c1271230jBZ = c1272090jCx.LL) != null) {
                c1271230jBZ.LJ = true;
            }
        }
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (c1269160j8E != null && (c1269910j9RLJIJJ = c1269160j8E.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LIZJ(this.LLLIZZ);
        }
        LJIILL();
        C1267690j5r c1267690j5r = this.y;
        if (c1267690j5r != null) {
            c1267690j5r.LIZJ = -1;
            c1267690j5r.LIZ.removeCallbacks(c1267690j5r.LJIIIIZZ);
            c1267690j5r.LIZLLL.unregisterComponentCallbacks(c1267690j5r.LJII);
        }
        LLLLLLLLLL();
        if (this.LLJZ.get() != 7 && this.LLJLLL != null) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 344));
        }
        stop();
        if (handler != null) {
            handler.removeCallbacks(this.B);
        }
        RunnableC1266370j3j runnableC1266370j3j = this.z;
        if (runnableC1266370j3j != null) {
            this.LL.removeCallbacks(runnableC1266370j3j);
        }
        if (this.LLLLLJIL != null) {
            this.LLLLLJIL = null;
        }
        if (this.LLILZLL.LJ) {
            this.LLLLLILLIL = false;
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 350));
        C1271420jBs c1271420jBs = this.LLLZZ;
        if (c1271420jBs != null) {
            c1271420jBs.release();
            this.LLLZZ = null;
        }
        boolean[] zArr = {true};
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS89S0200000_20(this, zArr, 214));
            synchronized (this.LLLJ) {
                try {
                    this.LLLJ.wait(3000L);
                    if (zArr[0]) {
                        AVLog.iow("LiveStream", "Waiting work thread timeout with dump thread stack:");
                        Handler handler3 = this.LL;
                        if (handler3 != null && (looper2 = handler3.getLooper()) != null && (thread2 = looper2.getThread()) != null) {
                            LLF(thread2, "LiveStream");
                        }
                        Handler handler4 = this.LLILLL;
                        if (handler4 != null && (looper = handler4.getLooper()) != null && (thread = looper.getThread()) != null) {
                            LLF(thread, "LiveStream");
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.LLJZ.set(7);
        if (zArr[0]) {
            if (this.LLJJLIIIJLLLLLLLZ != null) {
                AVLog.iow("LiveStream", "dangerous, try to stop audio record not on worker thread");
                C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
                C786410Ut5.LJJZZIII(c1268550j7F.LLILLL, new ARunnableS120S0100000_20(c1268550j7F, 441));
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture != null) {
                liveStreamVideoCapture.stop();
            }
            AVLog.iow("LiveStream", "Release on work thread timeout.");
        }
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        if (interfaceC1266410j3n != null) {
            interfaceC1266410j3n.release();
            this.LLJJJ = null;
        }
        C1266420j3o c1266420j3o = this.LLJJJIL;
        if (c1266420j3o != null) {
            c1266420j3o.LIZLLL();
            this.LLJJJIL = null;
        }
        C1269780j9E c1269780j9E = this.LLLILZLLLI;
        if (c1269780j9E != null && c1269780j9E.LLJ.LIZIZ.LJJIJLIJ.LIZ) {
            C1266970j4h.LIZ.LIZJ = true;
        }
        SafeHandlerThread safeHandlerThread = this.LLJZIJLIL;
        if (safeHandlerThread != null) {
            this.LLJZIJLIL = null;
            C1273730jFb.LIZLLL(safeHandlerThread);
        }
        SafeHandlerThread safeHandlerThread2 = this.LLL;
        if (safeHandlerThread2 != null) {
            C1273730jFb.LIZLLL(safeHandlerThread2);
            this.LLL = null;
        }
        SafeHandlerThread safeHandlerThread3 = this.LLLF;
        if (safeHandlerThread3 != null) {
            C1273730jFb.LIZLLL(safeHandlerThread3);
            this.LLLF = null;
        }
        this.LLJJIJI = null;
        this.LLJJIII = null;
        this.LLILZLL.LJJJJI();
        this.LLLLJI.clear();
        C1266530j3z.LIZIZ = null;
        if (!LLJILLL() && (c1272810jE7 = this.l.LIZJ) != null) {
            c1272810jE7.LIZIZ();
        }
        this.m = null;
    }

    public final void LLLIL() {
        if (this.A.get()) {
            return;
        }
        C1266620j48 c1266620j48 = this.LLILZLL.LJLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restoreInitPipeLineBySnapShot: ");
        sbLIZ.append(c1266620j48);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        C1269160j8E c1269160j8E = this.LLILZLL;
        c1269160j8E.getClass();
        c1269160j8E.LJJLIIIJLLLLLLLZ(c1266620j48.LIZJ, c1266620j48.LIZLLL);
        c1269160j8E.LJJIIZ().LJIIL(c1266620j48.LJ);
        c1269160j8E.LJJJJLL(c1266620j48.LIZ, c1266620j48.LIZIZ);
        c1269160j8E.LIZ.mPushBase.LJJJJLI(c1266620j48.LJFF);
        LJLI(this.LLILZLL.LJIILJJIL(0), this.LLILZLL.LJIILIIL(0), this.LLILZLL.LJJIJIIJI());
        LLLLLZL(this.LLILZLL.LJJIIZI(), this.LLILZLL.LJJIIJ(), this.LLILZLL.LJJIIJZLJL(), this.LLILZLL.LJJIII(), this.LLILZLL.LJJIIZ().LIZIZ);
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (interfaceC1266360j3i != null) {
            interfaceC1266360j3i.LJJ();
        }
        LLLLLZ();
    }

    public final void LLLZLL() throws Exception {
        LLLZLZ(-1, -1, "");
    }

    @Override // X.InterfaceC1273910jFt
    public final void stop() {
        LLLLLLL("", true);
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJIIIZ() {
        return this.LLJZ.get();
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIILL() {
        AVLog.logApiCall("LiveCoreAPI", "stopVideoCapture", null);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 363), new int[]{0}));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJIILLIIL() {
        int i = this.LLJZ.get();
        return i == 2 || i == 3;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJJ() {
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (!c1269160j8E.LJLJI.LJJIL.LJII) {
            c1269160j8E.LJI.LJJI();
            return;
        }
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            audioDeviceModule.setInAnchorNet(false);
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 362));
        LLLIIL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, -302, new Exception("Anchor Net LinkMic Fallback"));
    }

    @Override // X.InterfaceC1273910jFt
    public final C1266510j3x LJJJJL() {
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (c1269160j8E == null) {
            return new C1266510j3x();
        }
        C1266510j3x c1266510j3x = new C1266510j3x();
        int iLJJIL = c1269160j8E.LJJIL(2);
        int iLJJIJIIJIL = this.LLILZLL.LJJIJIIJIL(2);
        C1269160j8E c1269160j8E2 = this.LLILZLL;
        if (c1269160j8E2.LIZ != null) {
            iLJJIL = c1269160j8E2.LJJIL(2);
            iLJJIJIIJIL = this.LLILZLL.LJJIJIIJIL(2);
        }
        c1266510j3x.LIZ = this.LLILZLL.LJJIL(1);
        c1266510j3x.LIZIZ = this.LLILZLL.LJJIJIIJIL(1);
        c1266510j3x.LIZJ = iLJJIL;
        c1266510j3x.LIZLLL = iLJJIJIIJIL;
        C1266810j4R c1266810j4R = this.LLILZLL.LIZ.mVPassInteractCfg.LIZIZ;
        if (c1266810j4R != null) {
            C1267440j5S c1267440j5S = c1266810j4R.LIZ;
            C1267440j5S c1267440j5S2 = c1266810j4R.LIZIZ;
            if (c1267440j5S != null && c1267440j5S.LIZ == 1) {
                c1266510j3x.LJFF = c1267440j5S.LIZJ;
                c1266510j3x.LJI = c1267440j5S.LIZLLL;
            }
            if (c1267440j5S2 != null && c1267440j5S2.LIZ == 1) {
                c1266510j3x.LJII = c1267440j5S2.LIZJ;
                c1266510j3x.LJIIIIZZ = c1267440j5S2.LIZLLL;
            }
        }
        float f = (iLJJIL * 1.0f) / iLJJIJIIJIL;
        c1266510j3x.LJ = Math.abs(0.5625d - ((double) f)) < ((double) Math.abs(f - 0.5f)) ? EnumC945180ahg.ASPECT_RATIO_16_9 : EnumC945180ahg.ASPECT_RATIO_2_1;
        return c1266510j3x;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJLIIL() {
        InterfaceC1266360j3i interfaceC1266360j3i;
        if (!this.LLILZLL.LJJJ() || (interfaceC1266360j3i = this.LLILZLL.LJI) == null) {
            return;
        }
        interfaceC1266360j3i.LJJIJLIJ();
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJZZI() {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.LIZIZ();
        }
    }

    public final void LJLJJI() {
        if ((this.LLLLZ != EnumC1267980j6K.GAME_LIVE && this.LLLLZ != EnumC1267980j6K.GAME_DUAL_DEVICE) || this.LLJJIJIL == null || this.c == null) {
            return;
        }
        if (this.LLZZZIL == -1) {
            this.LLZZZIL = this.LLILZLL.LJJIJIIJI();
        }
        if (this.LLZZJLIL == -1) {
            this.LLZZJLIL = this.LLILZLL.LJJIL(0);
        }
        if (this.LLZZLLIL == -1) {
            this.LLZZLLIL = this.LLILZLL.LJJIJIIJIL(0);
        }
        boolean z = this.LLILZLL.LJJIIZI() > this.LLILZLL.LJJIIJ();
        if (z) {
            this.c.updateFeature("game_capture_landscape", 1);
        } else {
            this.c.updateFeature("game_capture_landscape", 0);
        }
        BitrateConfig bitrateConfigLLIIIZ = LLIIIZ(this.LLILZLL.LJJIII);
        if (bitrateConfigLLIIIZ != null) {
            this.c.updateFeature("initial_encode_width", z ? bitrateConfigLLIIIZ.height : bitrateConfigLLIIIZ.width);
            this.c.updateFeature("initial_encode_height", z ? bitrateConfigLLIIIZ.width : bitrateConfigLLIIIZ.height);
        } else {
            this.c.updateFeature("initial_encode_width", 0);
            this.c.updateFeature("initial_encode_width", 0);
        }
        this.c.updateFeature("initial_game_resolution_width", this.LLILZLL.LJJIL(0));
        this.c.updateFeature("initial_game_resolution_height", this.LLILZLL.LJJIJIIJIL(0));
        BitrateConfig bitrateConfigLLIIIZ2 = LLIIIZ(this.LLILZLL.LJJIIJ);
        if (bitrateConfigLLIIIZ2 != null) {
            this.c.updateFeature("game_capture_width", z ? bitrateConfigLLIIIZ2.height : bitrateConfigLLIIIZ2.width);
            this.c.updateFeature("game_capture_height", z ? bitrateConfigLLIIIZ2.width : bitrateConfigLLIIIZ2.height);
        } else {
            this.c.updateFeature("game_capture_width", 0);
            this.c.updateFeature("game_capture_height", 0);
        }
        this.c.updateFeature("target_fps", this.LLZZZIL);
        this.c.updateFeature("game_resolution_width", this.LLZZJLIL);
        this.c.updateFeature("game_resolution_height", this.LLZZLLIL);
        this.c.updateFeature("initial_fps", this.LLILZLL.LJJIJIIJI());
    }

    public final void LJLJJL() {
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoSource gate -> wrapperEnabled=");
        sbLIZ.append(LLJJIII());
        sbLIZ.append(", videoNodeManager=");
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        sbLIZ.append(interfaceC1266410j3n == null ? "null" : interfaceC1266410j3n.getClass().getName());
        sbLIZ.append(", isPlatformWrapper=");
        sbLIZ.append(this.LLJJJ instanceof ILyraxVideoPlatformWrapper);
        sbLIZ.append(", pusher=");
        sbLIZ.append(interfaceC1266360j3i != null ? interfaceC1266360j3i.getClass().getName() : "null");
        C2188811AlT.LIZIZ(sbLIZ);
        if (LLJJIII()) {
            InterfaceC1266410j3n interfaceC1266410j3n2 = this.LLJJJ;
            if ((interfaceC1266410j3n2 instanceof ILyraxVideoPlatformWrapper) && interfaceC1266360j3i != null) {
                interfaceC1266360j3i.setVideoSource((ILyraxVideoPlatformWrapper) interfaceC1266410j3n2);
            }
        }
    }

    public final boolean LJLJLJ() {
        if (this.LLJZ.get() != 2 || !this.LLLZIIL || !this.LLLZIL) {
            return false;
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 369));
        return true;
    }

    public final void LJLLL() {
        C1268090j6V c1268090j6V;
        C1267280j5C c1267280j5C = this.LLZZZZ;
        if (c1267280j5C != null && (c1268090j6V = c1267280j5C.LIZJ) != null && ((HashMap) c1268090j6V.LIZIZ).containsKey("simulcast_strategy")) {
            ((HashMap) c1268090j6V.LIZIZ).remove("simulcast_strategy");
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.clearStrategyReport("simulcast_strategy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.0j5d] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.0j66, com.ss.ttlivestreamer.core.engine.AudioSink] */
    public final void LJLLLL() {
        MediaEngineFactory mediaEngineFactory;
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (this.LLILZLL.LJJJIL() && interfaceC1266360j3i != null) {
            Iterator<Map.Entry<String, C1266760j4M>> it2 = this.LLLLJI.entrySet().iterator();
            while (it2.hasNext()) {
                C1266760j4M value = it2.next().getValue();
                interfaceC1266360j3i.LJIIIIZZ(value.LIZ, value.LIZIZ, value.LIZJ);
            }
            this.LLILZLL.LIZ.mPushBase.getClass();
            if (this.LLLLLLJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setPusherSeiShiftDiffTime: ");
                sbLIZ.append(this.LLLLJ);
                AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
            }
            interfaceC1266360j3i.LJIJJLI(new C1268990j7x(this.LLLLJ));
        }
        C1267500j5Y c1267500j5Y = this.l;
        C1268810j7f c1268810j7f = c1267500j5Y.LIZIZ.LJJIL;
        boolean z = (c1268810j7f.LIZ && !c1268810j7f.LJFF) && c1267500j5Y.LIZ.captureBase.videoCapture.LIZ == 3;
        if (this.LLJIJIL == null && (mediaEngineFactory = this.LLJJ) != null) {
            MediaEncodeStream mediaEncodeStreamCreateMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(null, null, null, c1267500j5Y.LIZJ, false);
            this.LLJIJIL = mediaEncodeStreamCreateMediaEncodeStream;
            this.LLLI = mediaEncodeStreamCreateMediaEncodeStream.getParameter();
        }
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.createNativeVideoMixer();
            if (!z) {
                mediaEncodeStream.createNativeAudioMixer();
            }
            mediaEncodeStream.enableAudioMixer(!z);
        }
        if (this.LLLLLLL == null) {
            C1267900j6C c1267900j6C = new C1267900j6C(this.LLLI, this);
            c1267900j6C.LLILZIL = this.LLILZLL;
            this.LLLLLLL = c1267900j6C;
        }
        if (this.LLLI != null) {
            AudioMixer audioMixer = this.LLJIJIL.getAudioMixer();
            VideoMixer videoMixer = this.LLJIJIL.getVideoMixer();
            if (audioMixer != 0) {
                audioMixer.setEnable(this.LLLL);
            }
            videoMixer.setEnable(this.LLLLII);
            if (this.LLILZLL.LJJJIL()) {
                if (this.LLLLZLL != null && !LLJILLL()) {
                    if (LLJJIJIL()) {
                        this.LLLZLZ.LJIILIIL(EnumC1267970j6J.TYPE_PUSHER);
                        release();
                        this.LLLLZLL = null;
                    } else {
                        C1267550j5d c1267550j5d = this.LLLLZLL;
                        if (c1267550j5d != null) {
                            videoMixer.removeVideoSink(c1267550j5d);
                            release();
                            this.LLLLZLL = null;
                        }
                    }
                }
                if (C1267520j5a.LIZ()) {
                    this.l.LIZ.ttlhABSettingsConfigs.LJIIJ();
                }
                this.LLLLZLL = new VideoSink() { // from class: X.0j5d
                    public boolean LL;
                    public int LLILLJJLI;
                    public int LLILLL;
                    public final List<C1269610j8x> LLILZ = new LinkedList();
                    public final Object LLILZIL = new Object();

                    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                    public final void OnDiscardedFrame() {
                    }

                    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                    public final String getNodeName() {
                        return "VeLiveVideoSink";
                    }

                    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                    public final void handleSerializedEvents(List<C1269610j8x> list) {
                        synchronized (this.LLILZIL) {
                            if (list != null) {
                                try {
                                    if (list.size() != 0) {
                                        ((LinkedList) this.LLILZ).addAll(list);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            List<C1269610j8x> list2 = this.LLILZ;
                            if (list2 != null && ((LinkedList) list2).size() != 0) {
                                Iterator<C1269610j8x> it3 = this.LLILZ.iterator();
                                while (it3.hasNext()) {
                                    C1269610j8x next = it3.next();
                                    if ((next.LJFF & C1269570j8t.LJ) != 0 && C1270020j9c.LJI[next.LIZLLL.ordinal()] == 1) {
                                        LLIZ(next, it3);
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        int i;
                        int i2;
                        boolean z2;
                        C1266350j3h c1266350j3h = this.LLILZLL;
                        if (!c1266350j3h.Q) {
                            c1266350j3h.Q = true;
                        }
                        if (c1266350j3h.LLIZ()) {
                            return;
                        }
                        C1266790j4P c1266790j4P = (C1266790j4P) this.LLILZLL.l.LIZJ.getService(C1266790j4P.class);
                        if (c1266790j4P != null) {
                            c1266790j4P.LL.LIZIZ(videoFrame.getBuffer().getCaptureMs());
                        }
                        if (this.LLILZLL.LLJJI()) {
                            handleSerializedEvents(videoFrame.getEvents());
                        }
                        if (C1267520j5a.LIZ() && (this.LLILLJJLI != videoFrame.getRotatedWidth() || this.LLILLL != videoFrame.getRotatedHeight())) {
                            this.LLILLJJLI = videoFrame.getRotatedWidth();
                            this.LLILLL = videoFrame.getRotatedHeight();
                        }
                        if (this.LLILZLL.LLLLZ == EnumC1267980j6K.GAME_LIVE && this.LLILZLL.K != null && (videoFrame.getBuffer().getBufferType() == 2 || videoFrame.getBuffer().getBufferType() == 1)) {
                            if (videoFrame.getBuffer().getBufferType() == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.LLILZLL.K.LIZIZ(videoFrame.getTextureId(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), z2, videoFrame, ((InterfaceC1271560jC6) videoFrame.getBuffer()).getTransformMatrix());
                        }
                        Handler mainGlHandle = GLThreadManager.getMainGlHandle();
                        C1266350j3h c1266350j3h2 = this.LLILZLL;
                        C1277560jLm c1277560jLmLIZ = C1272060jCu.LIZ(videoFrame, mainGlHandle, c1266350j3h2.D, c1266350j3h2.LLILZLL.LIZ);
                        long captureServerNtpMs = videoFrame.getBuffer().getCaptureServerNtpMs();
                        long effectServerNtpMs = videoFrame.getBuffer().getEffectServerNtpMs();
                        if (captureServerNtpMs > 0 && effectServerNtpMs > 0) {
                            this.LLILZLL.i = captureServerNtpMs;
                            c1277560jLmLIZ.LJI = captureServerNtpMs;
                            c1277560jLmLIZ.LJII = effectServerNtpMs;
                        }
                        if (this.LLILZLL.LLJJ()) {
                            C1266350j3h c1266350j3h3 = this.LLILZLL;
                            int i3 = c1266350j3h3.LLLZZIL;
                            if (i3 > 0 && (i = c1266350j3h3.LLZ) > 0 && (i2 = c1266350j3h3.LLZIL) > 0 && (i3 != c1266350j3h3.LLZILL || i != c1266350j3h3.LLZL || i2 != c1266350j3h3.LLZLI)) {
                                InterfaceC1266360j3i interfaceC1266360j3i2 = c1266350j3h3.LLIZ;
                                if (interfaceC1266360j3i2 != null && !c1266350j3h3.A.get()) {
                                    C1266350j3h c1266350j3h4 = this.LLILZLL;
                                    interfaceC1266360j3i2.LJJIJIL(c1266350j3h4.LLLZZIL, c1266350j3h4.LLZ, c1266350j3h4.LLZIL);
                                }
                                C1266350j3h c1266350j3h5 = this.LLILZLL;
                                c1266350j3h5.LLZILL = c1266350j3h5.LLLZZIL;
                                c1266350j3h5.LLZL = c1266350j3h5.LLZ;
                                c1266350j3h5.LLZLI = c1266350j3h5.LLZIL;
                                c1266350j3h5.LLLZZIL = 0;
                                c1266350j3h5.LLZ = 0;
                                c1266350j3h5.LLZIL = 0;
                            }
                        } else {
                            C1266350j3h c1266350j3h6 = this.LLILZLL;
                            int i4 = c1266350j3h6.LLLZZIL;
                            if (i4 > 0 && c1266350j3h6.LLZ > 0 && c1266350j3h6.LLZIL > 0 && c1277560jLmLIZ != null && i4 == c1277560jLmLIZ.LIZIZ() && this.LLILZLL.LLZ == c1277560jLmLIZ.LIZ()) {
                                C1266350j3h c1266350j3h7 = this.LLILZLL;
                                InterfaceC1266360j3i interfaceC1266360j3i3 = c1266350j3h7.LLIZ;
                                if (interfaceC1266360j3i3 != null && !c1266350j3h7.A.get()) {
                                    C1266350j3h c1266350j3h8 = this.LLILZLL;
                                    interfaceC1266360j3i3.LJJIJIL(c1266350j3h8.LLLZZIL, c1266350j3h8.LLZ, c1266350j3h8.LLZIL);
                                }
                                C1266350j3h c1266350j3h9 = this.LLILZLL;
                                c1266350j3h9.LLLZZIL = 0;
                                c1266350j3h9.LLZ = 0;
                                c1266350j3h9.LLZIL = 0;
                            }
                        }
                        C1266350j3h c1266350j3h10 = this.LLILZLL;
                        InterfaceC1266360j3i interfaceC1266360j3i4 = c1266350j3h10.LLIZ;
                        if (interfaceC1266360j3i4 != null) {
                            if (c1277560jLmLIZ != null) {
                                C1269850j9L c1269850j9L = c1266350j3h10.f148J;
                                if (c1269850j9L != null && c1266350j3h10.l.LIZ.captureBase.videoCapture.LIZ == 3) {
                                    c1269850j9L.LIZJ(EnumC1269840j9K.DURATION_TYPE_PRE_ENCODE, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                                }
                                interfaceC1266360j3i4.LJJIL(c1277560jLmLIZ);
                                c1277560jLmLIZ.LIZJ();
                            }
                        } else if (c1277560jLmLIZ != null) {
                            c1277560jLmLIZ.LIZJ();
                        }
                        if (!this.LL) {
                            this.LL = true;
                            AVLog.logKibana(6, "LiveStream", "push first video frame to rtc", null);
                        }
                    }

                    public final void LLIZ(C1269610j8x c1269610j8x, Iterator<C1269610j8x> it3) {
                        if (c1269610j8x instanceof C1269600j8w) {
                            C1269600j8w c1269600j8w = (C1269600j8w) c1269610j8x;
                            int i = C1269570j8t.LJ;
                            this.LLILZLL.LLLIIIL(c1269600j8w.LIZLLL(i));
                            C1266350j3h c1266350j3h = this.LLILZLL;
                            c1266350j3h.LLLZZIL = c1269600j8w.LJIILIIL;
                            c1266350j3h.LLZ = c1269600j8w.LJIILJJIL;
                            c1266350j3h.LLZIL = c1269600j8w.LJIILL;
                            int i2 = (~i) & c1269600j8w.LJFF;
                            c1269600j8w.LJFF = i2;
                            if (i2 == 0) {
                                it3.remove();
                            }
                        }
                    }

                    @Override // com.ss.ttlivestreamer.core.engine.VideoSink, X.InterfaceC1269980j9Y
                    public final void onData(VideoFrame videoFrame, Bundle bundle) {
                        onFrame(videoFrame);
                    }
                };
                if (LLJILLL()) {
                    InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
                    if (interfaceC1266410j3n != null) {
                        interfaceC1266410j3n.LJJJLIIL(this.LLLLZLL);
                    }
                } else if (LLJJIJIL()) {
                    this.LLLZLZ.LJIIJ(EnumC1267970j6J.TYPE_PUSHER, this.LLLLZLL);
                } else {
                    videoMixer.addVideoSink(this.LLLLZLL);
                }
                if (audioMixer != 0 && !this.LLILZLL.LJJIZ()) {
                    C1267840j66 c1267840j66 = this.LLLLZLLIL;
                    if (c1267840j66 != null) {
                        audioMixer.removeAudioSink(c1267840j66);
                        release();
                        this.LLLLZLLIL = null;
                    }
                    ?? r0 = new AudioSink() { // from class: X.0j66
                        public boolean LL;

                        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                        public final void onNoData() {
                        }

                        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                        public final void onData(Buffer buffer, int i, int i2, int i3, long j) {
                            InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLILLJJLI.LLIZ;
                            if (interfaceC1266360j3i2 != null) {
                                EnumC1278060jMa enumC1278060jMaFromInt = EnumC1278060jMa.fromInt(i3);
                                interfaceC1266360j3i2.LJIIZILJ(new C1278180jMm(EnumC1278080jMc.fromInt(i2), enumC1278060jMaFromInt, j * 1000, (ByteBuffer) buffer));
                                if (!this.LL) {
                                    this.LL = true;
                                    AVLog.logKibana(6, "LiveStream", "push first audio frame to rtc", null);
                                }
                            }
                        }
                    };
                    this.LLLLZLLIL = r0;
                    audioMixer.addAudioSink(r0);
                }
            }
            if (this.LLILZLL.LJJII() == 3) {
                videoMixer.setEnable(false);
            }
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", this.LLLLIIIILLL);
            if (this.LLILZLL.LJJII() == 3 && this.LLILZLL.LJJJIL()) {
                this.LLLLLZ = false;
            }
            tEBundle.setBool("vmixer_planar_render", this.LLLLLZ);
            tEBundle.setBool("draw_with_diff_size", true);
            tEBundle.setBool("vmixer_clear_stencil", true);
            tEBundle.setBool("vmixer_enable_stencil", false);
            int i = tEBundle.getInt("vmixer_width");
            if ((tEBundle.getInt("vmixer_height") != this.LLILZLL.LJJIJIIJIL(0) || i != this.LLILZLL.LJJIL(0)) && this.LLILZLL.LJJJIL()) {
                tEBundle.setInt("vmixer_width", this.LLILZLL.LJJIL(0));
                tEBundle.setInt("vmixer_height", this.LLILZLL.LJJIJIIJIL(0));
            }
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
            this.LLILZLL.getClass();
        }
        C1273370jF1 c1273370jF1 = this.K;
        if (c1273370jF1 != null) {
            c1273370jF1.LLIZ = true;
        }
    }

    public final InterfaceC1268820j7g LJLLLLLL() {
        C1266590j45 c1266590j45 = new C1266590j45(this);
        this.LLILZLL.LJIIJ();
        C1266600j46 c1266600j46 = new C1266600j46(c1266590j45);
        synchronized (this.LLLIL) {
            try {
                this.LLLILZ.add(c1266600j46);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1283100jUi.LIZIZ(this.LL, new ARunnableS89S0200000_20(this, c1266600j46, 217));
        return c1266600j46;
    }

    public final void LJZ() {
        MediaEncodeStream mediaEncodeStream;
        C1267550j5d c1267550j5d;
        C1267840j66 c1267840j66;
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        C1273370jF1 c1273370jF1 = this.K;
        if (c1273370jF1 != null) {
            c1273370jF1.LLIZ = false;
        }
        C1267900j6C c1267900j6C = this.LLLLLLL;
        if (c1267900j6C != null) {
            c1267900j6C.release();
            this.LLLLLLL = null;
        }
        MediaEncodeStream mediaEncodeStream2 = this.LLJIJIL;
        if (mediaEncodeStream2 != null) {
            mediaEncodeStream2.stop();
        }
        MediaEncodeStream mediaEncodeStream3 = this.LLJIJIL;
        if (mediaEncodeStream3 != null && (videoTrack = this.LLJILJILJ) != null) {
            mediaEncodeStream3.removeTrack(videoTrack);
            LLLIIII(true);
        }
        MediaEncodeStream mediaEncodeStream4 = this.LLJIJIL;
        if (mediaEncodeStream4 != null && (audioTrack = this.LLJILLL) != null) {
            mediaEncodeStream4.removeTrack(audioTrack);
            LLLIIII(false);
        }
        this.LLLII.writeLock().lock();
        TEBundle tEBundle = this.LLLI;
        if (tEBundle != null) {
            tEBundle.release();
            this.LLLI = null;
        }
        if (this.LLIZ != null && (mediaEncodeStream = this.LLJIJIL) != null) {
            AudioMixer audioMixer = mediaEncodeStream.getAudioMixer();
            VideoMixer videoMixer = this.LLJIJIL.getVideoMixer();
            if (LLJJIJIL()) {
                this.LLLZLZ.LJIILIIL(EnumC1267970j6J.TYPE_PUSHER);
                C1267550j5d c1267550j5d2 = this.LLLLZLL;
                if (c1267550j5d2 != null) {
                    c1267550j5d2.release();
                    this.LLLLZLL = null;
                }
            } else if (videoMixer != null && (c1267550j5d = this.LLLLZLL) != null) {
                videoMixer.removeVideoSink(c1267550j5d);
                release();
                this.LLLLZLL = null;
            }
            if (audioMixer != null && (c1267840j66 = this.LLLLZLLIL) != null) {
                audioMixer.removeAudioSink(c1267840j66);
                release();
                this.LLLLZLLIL = null;
            }
        }
        MediaEncodeStream mediaEncodeStream5 = this.LLJIJIL;
        if (mediaEncodeStream5 != null) {
            mediaEncodeStream5.release();
            this.LLJIJIL = null;
        }
        this.LLLII.writeLock().unlock();
        if (this.LLLILZLLLI != null) {
            this.LLJZ.get();
        }
    }

    public final void LL() {
        if (this.LLJZ.get() == 4) {
            return;
        }
        this.LLLZIL = false;
        LJZ();
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLZLLLI;
        if (aRunnableS120S0100000_20 != null) {
            this.LL.removeCallbacks(aRunnableS120S0100000_20);
            this.LLLLZLLLI = null;
        }
        if (this.LLJZ.get() != 8) {
            this.LLJZ.set(4);
            LJJLIIIIJ(3, 0, 0);
        } else {
            AVLog.iow("LiveStream", "Try to stop live stream while mStatus is STATUS_ERROR");
        }
        if (this.LLILZLL.LJLJI.LJJIFFI) {
            C1269520j8o.LIZ("LiveCore.stop");
        }
    }

    public final boolean LLFF() {
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (c1269160j8E != null) {
            return c1269160j8E.LIZJ();
        }
        return false;
    }

    public final boolean LLFZ() {
        InterfaceC1266360j3i interfaceC1266360j3i;
        if (!this.l.LIZ.mPushBase.LJIIIIZZ || (interfaceC1266360j3i = this.LLIZ) == null) {
            return true;
        }
        EnumC1277890jMJ enumC1277890jMJLJJIJIIJIL = interfaceC1266360j3i.LJJIJIIJIL();
        return (enumC1277890jMJLJJIJIIJIL == EnumC1277890jMJ.LiveStreamSession_V1 || enumC1277890jMJLJJIJIIJIL == EnumC1277890jMJ.LiveStreamSession_V4) ? false : true;
    }

    public final float LLIFFJFJJ() {
        VideoSink videoSink = this.LLJJI;
        if (videoSink != null) {
            return videoSink.getAvgRenderCountAndInvalidate();
        }
        return -1.0f;
    }

    public final JSONObject LLII() {
        boolean zLJIIJ = this.l.LIZ.mPushBase.LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBMFColorCorrectionSetting valid:");
        sbLIZ.append(zLJIIJ);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!zLJIIJ) {
            return null;
        }
        if (LLJILLL()) {
            InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
            if (interfaceC1266410j3n != null) {
                return interfaceC1266410j3n.LJZI();
            }
            return null;
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O != null) {
            return interfaceC1268640j7O.LLIIII();
        }
        return null;
    }

    public final int LLIIIJ() {
        if (this.l.LIZ.LJIIL) {
            Object objLIZIZ = C1963707md.LIZIZ("getLastStatus", new Class[0], new Object[0]);
            this.s = objLIZIZ instanceof Integer ? ((Integer) objLIZIZ).intValue() : -2;
        }
        return this.s;
    }

    public final JSONObject LLIIL() {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e == null) {
            return null;
        }
        c1267560j5e.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) c1267560j5e.LIZ).entrySet()) {
                C0VVR c0vvr = ((C1271310jBh) entry.getValue()).LLJILJIL;
                if (c0vvr != null) {
                    jSONObject.put((String) entry.getKey(), c0vvr.LIZJ());
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMediaPlayerInfoJson error: ");
            sbLIZ.append(e.getMessage());
            AVLog.logKibana(6, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        return jSONObject;
    }

    public final float LLIILZL() {
        VideoFrameStatics videoFrameStatics;
        C1266390j3l c1266390j3l = this.LLLZLZ;
        if (c1266390j3l == null || (videoFrameStatics = c1266390j3l.LLILZLL) == null) {
            return 0.0f;
        }
        return videoFrameStatics.getRealRatePerSecond();
    }

    public final Map<String, String> LLIIZ() {
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            return augurAdaptiveWrapper.getPerfAdaptiveMetricInfo();
        }
        C1267280j5C c1267280j5C = this.LLZZZZ;
        if (c1267280j5C == null) {
            return null;
        }
        c1267280j5C.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        HashMap map = new HashMap();
        try {
            Iterator it2 = ((HashMap) c1267280j5C.LIZJ.LIZIZ).entrySet().iterator();
            String str = "";
            String str2 = "default";
            while (it2.hasNext()) {
                AbstractC1268060j6S abstractC1268060j6S = (AbstractC1268060j6S) ((Map.Entry) it2.next()).getValue();
                if (!TextUtils.isEmpty(abstractC1268060j6S.adaptiveStrategyName)) {
                    arrayList.add(abstractC1268060j6S.adaptiveStrategyName);
                }
                for (Map.Entry<String, Object> entry : abstractC1268060j6S.adaptiveStrategyLevelMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                if (!TextUtils.isEmpty(abstractC1268060j6S.adaptiveStrategyStatus)) {
                    if (TextUtils.equals(str2, "default")) {
                        str2 = abstractC1268060j6S.adaptiveStrategyStatus;
                    } else if (TextUtils.equals(str2, "up")) {
                        if (TextUtils.equals(abstractC1268060j6S.adaptiveStrategyStatus, "down")) {
                            str2 = "mix";
                        }
                    } else if (TextUtils.equals(str2, "down") && TextUtils.equals(abstractC1268060j6S.adaptiveStrategyStatus, "up")) {
                        str2 = "mix";
                    }
                }
                if (abstractC1268060j6S instanceof TTLHUpdateFpsResolutionCommand) {
                    str = abstractC1268060j6S.resolutionStrategyExtraStatus;
                }
                if (!TextUtils.isEmpty(abstractC1268060j6S.adaptiveStrategyStatusListItem)) {
                    arrayList2.add(abstractC1268060j6S.adaptiveStrategyStatusListItem);
                }
            }
            Map<String, String> map2 = c1267280j5C.LJIIJ;
            if (map2 != null && !((HashMap) map2).isEmpty()) {
                if (((HashMap) c1267280j5C.LJIIJ).containsKey("adaptive_strategy_name")) {
                    arrayList.add((String) ((HashMap) c1267280j5C.LJIIJ).get("adaptive_strategy_name"));
                }
                if (((HashMap) c1267280j5C.LJIIJ).containsKey("adaptive_strategy_status") && !TextUtils.equals(str2, (CharSequence) ((HashMap) c1267280j5C.LJIIJ).get("adaptive_strategy_status"))) {
                    str2 = TextUtils.equals(str2, "default") ? (String) ((HashMap) c1267280j5C.LJIIJ).get("adaptive_strategy_status") : "mix";
                }
                if (((HashMap) c1267280j5C.LJIIJ).containsKey("adaptive_strategy_status_list")) {
                    arrayList2.add((String) ((HashMap) c1267280j5C.LJIIJ).get("adaptive_strategy_status_list"));
                }
                if (((HashMap) c1267280j5C.LJIIJ).containsKey("adaptive_strategy_level_list")) {
                    String str3 = (String) ((HashMap) c1267280j5C.LJIIJ).get("adaptive_strategy_level_list");
                    Objects.requireNonNull(str3);
                    JSONObject jSONObject2 = new JSONObject(str3);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            }
            map.put("adaptive_strategy_status", str2);
            if (arrayList.size() > 0) {
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                StringBuilder sb = new StringBuilder();
                if (charSequenceArr.length > 0) {
                    sb.append(charSequenceArr[0]);
                    for (int i = 1; i < charSequenceArr.length; i++) {
                        sb.append((CharSequence) "#");
                        sb.append(charSequenceArr[i]);
                    }
                }
                map.put("adaptive_strategy_name_list", sb.toString());
                map.put("adaptive_strategy_level_list", C786410Ut5.J3(jSONObject));
            }
            if (arrayList2.size() > 0) {
                CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new String[0]);
                StringBuilder sb2 = new StringBuilder();
                if (charSequenceArr2.length > 0) {
                    sb2.append(charSequenceArr2[0]);
                    for (int i2 = 1; i2 < charSequenceArr2.length; i2++) {
                        sb2.append((CharSequence) "#");
                        sb2.append(charSequenceArr2[i2]);
                    }
                }
                map.put("adaptive_strategy_status_list", sb2.toString());
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("resolution_strategy_extra_status", str);
                return map;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map;
    }

    public final String LLILIL() {
        if (TextUtils.isEmpty(this.LLLFZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLLFZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(0L);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1269340j8W.LJZI = strLIZIZ;
        return strLIZIZ;
    }

    public final JSONObject LLILLIZIL() {
        JSONObject jSONObject;
        C1267810j63 c1267810j63 = (C1267810j63) this.l.LIZJ.getService(C1267810j63.class);
        if (c1267810j63 == null) {
            return new JSONObject();
        }
        C1267790j61 c1267790j61 = c1267810j63.LL;
        if (c1267790j61 == null) {
            return new JSONObject();
        }
        synchronized (c1267790j61) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("maxSizePerResolution", c1267790j61.LIZ);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                int size = 0;
                for (Map.Entry<String, List<C1267830j65>> entry : c1267790j61.LJFF.entrySet()) {
                    String key = entry.getKey();
                    List<C1267830j65> value = entry.getValue();
                    JSONObject jSONObject4 = new JSONObject();
                    for (C1267830j65 c1267830j65 : value) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tex_");
                        k kVar = c1267830j65.LIZ;
                        sbLIZ.append(kVar != null ? Integer.valueOf(kVar.getTextureId()) : null);
                        jSONObject4.put(C2188811AlT.LIZIZ(sbLIZ), c1267830j65.toString());
                    }
                    jSONObject2.put(key, jSONObject4);
                    jSONObject3.put(key, value.size());
                    size += value.size();
                }
                jSONObject.put("poolTotalSize", size);
                jSONObject.put("resolutionPools", jSONObject2);
                jSONObject.put("resolutionPoolSizes", jSONObject3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public final JSONObject LLILLJJLI() {
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        return interfaceC1266410j3n == null ? new JSONObject() : interfaceC1266410j3n.getStatus();
    }

    public final Bundle LLILLL() {
        C1269730j99 c1269730j99 = this.LLJJJJJIL;
        return c1269730j99 == null ? new Bundle() : c1269730j99.LIZ(null);
    }

    public final void LLILZIL() {
        Handler handler = C1269260j8O.LIZIZ(this.l) ? this.l.LIZIZ.LJJJZ : this.LL;
        if (handler != null) {
            handler.removeCallbacks(this.B);
            C786410Ut5.LJJZZIII(handler, this.B);
        }
    }

    public final boolean LLIZ() {
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        return this.LLILZLL.LJJJ() && interfaceC1266360j3i != null && interfaceC1266360j3i.LJJIJ() == EnumC1276080jJO.LinkMic;
    }

    public final boolean LLIZLLLIL() {
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        return this.LLILZLL.LJJJ() && interfaceC1266360j3i != null && interfaceC1266360j3i.LJJIJ() == EnumC1276080jJO.Live;
    }

    public final boolean LLJILJIL() {
        C1268130j6Z c1268130j6Z = this.j;
        return c1268130j6Z != null && c1268130j6Z.LJJIJLIJ && LLJILJILJ();
    }

    public final boolean LLJILJILJ() {
        LiveSdkSetting liveSdkSetting = this.LLILZLL.LIZ;
        return liveSdkSetting != null && liveSdkSetting.LJIJ().enableLinkMicVideoParamsGenerate;
    }

    public final boolean LLJILLL() {
        return this.l.LIZ.LJIIIZ() && LLJJIJIIJIL();
    }

    public final boolean LLJJ() {
        return this.l.LIZ.LJIIJ() && LLJILLL();
    }

    public final boolean LLJJIJIIJIL() {
        this.l.LIZ.ttlhABSettingsConfigs.getClass();
        return this.l.LIZ.enableNewVideoBufferPool && !TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && LLJJI();
    }

    public final boolean LLJJIJIL() {
        return this.LLILZLL.LIZ.mPushBase.LJIJJLI();
    }

    public final boolean LLJJJIL() {
        return this.LLLLZ == EnumC1267980j6K.LINKMIC_CO_HOST || this.LLLLZ == EnumC1267980j6K.LINKMIC_MULTI_GUEST || this.LLLLZ == EnumC1267980j6K.LINKMIC_UNKNOWN;
    }

    public final boolean LLJJJJ() {
        C1267500j5Y c1267500j5Y = this.l;
        if (c1267500j5Y == null) {
            return false;
        }
        return c1267500j5Y.LIZ.LJI;
    }

    public final boolean LLJJJJLIIL() {
        LiveSdkSetting liveSdkSetting = this.LLILZLL.LIZ;
        boolean z = liveSdkSetting.enableNewVideoBufferPool;
        liveSdkSetting.ttlhABSettingsConfigs.getClass();
        return z && !TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && this.LLILZLL.LIZ.mPushBase.LJIILIIL() && this.LLILZLL.LIZ.mPushBase.LJIJJLI();
    }

    public final boolean LLJJLIIIJLLLLLLLZ() {
        InterfaceC1266360j3i interfaceC1266360j3i;
        return this.LLILZLL.LJJLJ && (interfaceC1266360j3i = this.LLIZ) != null && interfaceC1266360j3i.LJIIJJI() && this.LLILZLL.LJJII() == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r7 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJL() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LLJL():boolean");
    }

    public final void LLLF() {
        AVLog.logApiCall("LiveCoreAPI", "pauseTTLH", null);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 377), new int[]{0, 1}));
        }
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.LIZ(true);
        }
    }

    public final void LLLIIIIL() {
        View view = this.LLLZ;
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (view == null || !LLJJIII() || interfaceC1266360j3i == null || interfaceC1266360j3i.LJIL(view) != LyraxErrorCode.SUCCESS.value()) {
            return;
        }
        this.LLLZ = null;
    }

    public final void LLLILZ() {
        AVLog.logApiCall("LiveCoreAPI", "resumeTTLH", null);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 358), new int[]{1, 0}));
        }
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.LIZ(false);
        }
    }

    public final void LLLILZJ() {
        C1267280j5C c1267280j5C = this.LLZZZZ;
        if (c1267280j5C != null) {
            if (c1267280j5C.LJIIIIZZ != 1) {
                C1267480j5W.LIZ.LIZ = null;
                C1267490j5X.LIZJ = false;
            } else {
                c1267280j5C.LJIIIZ.set(false);
                PthreadTimer pthreadTimer = c1267280j5C.LJ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                    c1267280j5C.LJ = null;
                }
                Handler handler = c1267280j5C.LJI;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    Looper looper = c1267280j5C.LJI.getLooper();
                    if (looper != null) {
                        looper.quitSafely();
                    }
                    c1267280j5C.LJI = null;
                }
                Map<String, C1266710j4H> map = c1267280j5C.LIZIZ.LJ;
                if (map != null && C1267480j5W.LIZ.LIZ != null) {
                    try {
                        Iterator it2 = ((HashMap) map).entrySet().iterator();
                        while (it2.hasNext()) {
                            C1266710j4H c1266710j4H = (C1266710j4H) ((Map.Entry) it2.next()).getValue();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("rule_name", c1266710j4H.LIZ);
                            jSONObject.put("succ_cnt", c1266710j4H.LIZIZ);
                            jSONObject.put("fail_cnt", c1266710j4H.LIZJ);
                            StringBuilder sb = new StringBuilder(e3.e);
                            for (int i = 0; i < ((ArrayList) c1266710j4H.LIZLLL).size(); i++) {
                                if (i > 0) {
                                    sb.append(",");
                                }
                                sb.append(((ArrayList) c1266710j4H.LIZLLL).get(i));
                            }
                            sb.append(e3.f);
                            jSONObject.put("error_code_list", sb.toString());
                            ((C1266460j3s) C1267480j5W.LIZ.LIZ).LIZ("ttlh_adaptive_rule_running", jSONObject);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C1268280j6o c1268280j6o = c1267280j5C.LIZIZ;
                c1268280j6o.LIZLLL = null;
                Map<String, AbstractC1268360j6w> map2 = c1268280j6o.LIZ;
                if (map2 != null) {
                    Iterator<Map.Entry<String, AbstractC1268360j6w>> it3 = map2.entrySet().iterator();
                    while (it3.hasNext()) {
                        AbstractC1268360j6w value = it3.next().getValue();
                        if (value != null) {
                            value.LIZ();
                        }
                    }
                    c1268280j6o.LIZ.clear();
                    c1268280j6o.LIZIZ = null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("api", "stop");
                    jSONObject2.put("feature_null_count", c1267280j5C.LJFF);
                    C1267490j5X.LIZ(jSONObject2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("action", "stop");
                    InterfaceC1267460j5U interfaceC1267460j5U = C1267480j5W.LIZ.LIZ;
                    if (interfaceC1267460j5U != null) {
                        ((C1266460j3s) interfaceC1267460j5U).LIZ("ttlh_adaptive_framework_execute", jSONObject3);
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C1267480j5W.LIZ.LIZ = null;
                C1267490j5X.LIZJ = false;
                c1267280j5C.LJIIIIZZ = 0;
                Map<String, String> map3 = c1267280j5C.LJIIJ;
                if (map3 != null) {
                    ((HashMap) map3).clear();
                }
            }
        }
        SafeHandlerThread safeHandlerThread = this.a;
        if (safeHandlerThread != null) {
            C1273730jFb.LIZLLL(safeHandlerThread);
            this.a = null;
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.stop();
            this.c.destroy();
            C1276090jJP.LJIIIIZZ = null;
        }
        if (AugurAdaptiveWrapper.getInstance() != null) {
            AugurAdaptiveWrapper.getInstance().stop();
            AugurAdaptiveWrapper.getInstance().destroy();
        }
    }

    public final boolean LLLLLLJ() {
        if (!(this.LLJJLIIIJLLLLLLLZ instanceof C1268550j7F)) {
            return false;
        }
        if (!this.LLLLLJLJLL && !this.LLLLLL) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAudioSourceOnBackgroundOrMute: paused ");
        sbLIZ.append(this.LLLLLJLJLL);
        sbLIZ.append(", muted ");
        sbLIZ.append(this.LLLLLL);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        boolean z = this.LLLLLJLJLL;
        boolean z2 = this.LLLLLL;
        synchronized (c1268550j7F) {
            C786410Ut5.LJJZZIII(c1268550j7F.LLILLL, new ARunnableS2S0120000_20(c1268550j7F, z2, z, 2));
        }
        return true;
    }

    public final void LLLLLLLLLL() {
        AVLog.logApiCall("LiveCoreAPI", "stopAudioCapture", null);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 347), new int[]{1}));
        }
    }

    public final JSONObject LLLLLLZZ() {
        JSONObject jSONObject = this.G;
        this.G = null;
        return jSONObject;
    }

    public final void LLLLLZ() {
        C786410Ut5.LJLIIL(1000L, this.LL, new ARunnableS120S0100000_20(this, 368));
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
    public final void LLLLLZIL() {
        if (this.LLZZZZ != null) {
            C1266470j3t c1266470j3t = new C1266470j3t();
            this.LLILZLL.LJIJJLI.getClass();
            c1266470j3t.LIZ = 0;
            C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
            int i = this.LLILZLL.LJJLJLI;
            c1267080j4s.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("enable_1080p_downgrade_480p", i);
                jSONObject.put("resolution_strategy", jSONObject2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1267080j4s c1267080j4s2 = this.LLZZZZ.LIZLLL;
            String str = this.LLILZLL.LIZ.LJIIIZ.adaptiveABConfigString;
            c1267080j4s2.getClass();
            try {
                if (!TextUtils.isEmpty(str)) {
                    C190600oK.LIZ(jSONObject, new JSONObject(str));
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            c1266470j3t.LIZLLL = jSONObject;
            List<BitrateConfig> list = this.LLILZLL.LJJLL;
            if (list != null && list.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (BitrateConfig bitrateConfig : list) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("level", CastIntegerProtector.parseInt(bitrateConfig.level));
                        jSONObject3.put(FollowStatusChangeMethod.PARAM_UID, bitrateConfig.LIZIZ);
                        jSONObject3.put("width", bitrateConfig.width);
                        jSONObject3.put("height", bitrateConfig.height);
                        jSONArray.put(jSONObject3);
                    }
                    c1266470j3t.LJFF = jSONArray;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            C1269160j8E c1269160j8E = this.LLILZLL;
            c1266470j3t.LJI = c1269160j8E.LJJZ;
            c1266470j3t.LJII = c1269160j8E.LJJZZI;
            if (c1269160j8E.LJJZZIII != null) {
                c1266470j3t.LJIIIIZZ = new JSONObject(this.LLILZLL.LJJZZIII);
            }
            C1267080j4s c1267080j4s3 = this.LLZZZZ.LIZLLL;
            c1267080j4s3.LIZ(c1267080j4s3.LIZ, c1266470j3t);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("os", "android");
            AugurAdaptiveWrapper augurAdaptiveWrapper2 = this.c;
            this.LLILZLL.LJIJJLI.getClass();
            augurAdaptiveWrapper2.updateFeature("app_version", 0);
            int i2 = this.LLILZLL.LJJLJLI;
            JSONObject jSONObject4 = new JSONObject();
            try {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("enable_1080p_downgrade_480p", i2);
                jSONObject4.put("resolution_strategy", jSONObject5);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            String str2 = this.LLILZLL.LIZ.LJIIIZ.adaptiveABConfigString;
            try {
                if (!TextUtils.isEmpty(str2)) {
                    C190600oK.LIZ(jSONObject4, new JSONObject(str2));
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            this.c.updateFeature("ab_params", jSONObject4);
            List<BitrateConfig> list2 = this.LLILZLL.LJJLL;
            if (list2 != null && list2.size() > 0) {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    for (BitrateConfig bitrateConfig2 : list2) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("level", CastIntegerProtector.parseInt(bitrateConfig2.level));
                        jSONObject6.put(FollowStatusChangeMethod.PARAM_UID, bitrateConfig2.LIZIZ);
                        jSONObject6.put("width", bitrateConfig2.width);
                        jSONObject6.put("height", bitrateConfig2.height);
                        jSONArray2.put(jSONObject6);
                    }
                    this.c.updateFeature("live_adaptive_resolution_list", jSONArray2);
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            }
            this.c.updateFeature("probe_max_level", this.LLILZLL.LJJZ);
            this.c.updateFeature("probe_min_level", this.LLILZLL.LJJZZI);
            if (this.LLILZLL.LJJZZIII != null) {
                this.c.updateFeature("portraits_group", new JSONObject(this.LLILZLL.LJJZZIII));
            }
            this.c.updateFeature("enable_linkmic_simulcast", 0);
            this.c.updateFeature("linkmic_layout_config_id", "not_set");
            this.c.updateFeature("linkmic_layout_config", new JSONObject());
            this.c.updateFeature("prev_multi_stream_stats", "not_set");
            this.c.updateFeature("simulcast_type", "simulcast");
            this.c.updateFeature("simulcast_stream_name", "not_set");
            this.c.updateFeature("force_downgrade_status", -1);
            this.c.updateFeature("initial_effect_face_model_name", "");
            this.c.updateFeature("initial_effect_matting_model_name", "");
            this.c.updateFeature("effect_face_model_name", "");
            this.c.updateFeature("effect_matting_model_name", "");
            this.c.updateFeature("perf_score", -1);
            this.c.updateFeature("thermal_score", -1);
            this.c.updateFeature("anchor_stable_mode", -1);
            this.c.updateFeature("anchor_stable_perf_state", -1);
            this.c.updateFeature("down_perf_score_threshold", -1);
            this.c.updateFeature("encoder_change_reason", "");
            this.c.updateFeature("adapted_resolution_width", 0);
            this.c.updateFeature("adapted_resolution_height", 0);
            this.c.updateFeature("linkmic_enable_performance_strategy", 0);
        }
    }

    public final void LLLLZI() {
        C1269160j8E c1269160j8E;
        C1267200j54 c1267200j54;
        if ((this.LLLLZ != EnumC1267980j6K.GAME_LIVE && this.LLLLZ != EnumC1267980j6K.GAME_DUAL_DEVICE) || (c1269160j8E = this.LLILZLL) == null || (c1267200j54 = c1269160j8E.LJLLLLLL) == null) {
            return;
        }
        Map<String, ? extends Object> map = c1267200j54.LIZ;
        if (this.LLZZZZ != null) {
            C1267200j54 c1267200j542 = new C1267200j54();
            if (map != null) {
                c1267200j542.LIZ = map;
            }
            C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJIILIIL, c1267200j542);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper == null || map == null) {
            return;
        }
        augurAdaptiveWrapper.updateFeatures(map);
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
    public final void LLLLZLL() {
        if (this.LLZZZZ != null) {
            C1267100j4u c1267100j4u = new C1267100j4u();
            C1269160j8E c1269160j8E = this.LLILZLL;
            if (c1269160j8E != null) {
                c1267100j4u.LIZ = c1269160j8E.LJJJ() ? 1 : 0;
            }
            C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJI, c1267100j4u);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("is_anchor_net", this.LLILZLL.LJJJ() ? 1 : 0);
        }
    }

    public final void LLLLZLLIL() {
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (c1269160j8E.LJJJIL) {
            this.LLJLLL = null;
            return;
        }
        if (c1269160j8E.LIZLLL) {
            this.LLJLLL = new C1270500jAO(c1269160j8E, this.LLJJ, new C1267870j69(new WeakReference(this)));
        } else {
            this.LLJLLL = new C1270500jAO(c1269160j8E, this.LLJJ, null);
        }
        C1270500jAO c1270500jAO = this.LLJLLL;
        c1270500jAO.LLJZIJLIL = this.LLILZIL;
        c1270500jAO.LLJJJ = this.LLJJLIIIJLLLLLLLZ;
    }

    public final void LLLZIL() {
        if (this.LLZZZZ != null) {
            C1267180j52 c1267180j52 = new C1267180j52();
            if (this.LLLLZ == EnumC1267980j6K.GAME_LIVE) {
                c1267180j52.LIZIZ = EnumC1268010j6N.ANCHOR;
                c1267180j52.LIZ = EnumC1268000j6M.GAME_LIVE;
                C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
                c1267080j4s.LIZ(c1267080j4s.LIZLLL, c1267180j52);
                c1267180j52.LIZLLL = this.LLILZLL.LJIILL();
            } else if (this.LLLLZ == EnumC1267980j6K.GAME_DUAL_DEVICE) {
                c1267180j52.LIZIZ = EnumC1268010j6N.ANCHOR;
                c1267180j52.LIZ = EnumC1268000j6M.GAME_DUAL_DEVICE;
                C1267080j4s c1267080j4s2 = this.LLZZZZ.LIZLLL;
                c1267080j4s2.LIZ(c1267080j4s2.LIZLLL, c1267180j52);
                c1267180j52.LIZLLL = this.LLILZLL.LJIILL();
            } else {
                if (this.LLILZLL.LJLJI.LJJIII) {
                    c1267180j52.LIZIZ = EnumC1268010j6N.ANCHOR;
                } else {
                    c1267180j52.LIZIZ = EnumC1268010j6N.GUEST;
                }
                EnumC1267980j6K enumC1267980j6K = this.LLLLZ;
                if (enumC1267980j6K == EnumC1267980j6K.NORMAL_LIVE) {
                    c1267180j52.LIZ = EnumC1268000j6M.LIVE;
                } else if (enumC1267980j6K == EnumC1267980j6K.LINKMIC_CO_HOST || enumC1267980j6K == EnumC1267980j6K.LINKMIC_MULTI_GUEST) {
                    c1267180j52.LIZ = EnumC1268000j6M.LINK_MIC;
                }
                C1267080j4s c1267080j4s3 = this.LLZZZZ.LIZLLL;
                c1267080j4s3.LIZ(c1267080j4s3.LIZLLL, c1267180j52);
                if (c1267180j52.LIZ == EnumC1268000j6M.LINK_MIC) {
                    LLLLZ(false);
                }
            }
        }
        if (this.c != null) {
            if (this.LLLLZ == EnumC1267980j6K.GAME_LIVE) {
                this.c.updateFeature("role", EnumC1268010j6N.ANCHOR.getName());
                this.c.updateFeature(Scene.SCENE_SERVICE, EnumC1268000j6M.GAME_LIVE.getName());
                this.c.updateFeature("short_long_ratio_tolerance_threshold", this.LLILZLL.LJIILL());
                return;
            }
            if (this.LLLLZ == EnumC1267980j6K.GAME_DUAL_DEVICE) {
                this.c.updateFeature("role", EnumC1268010j6N.ANCHOR.getName());
                this.c.updateFeature(Scene.SCENE_SERVICE, EnumC1268000j6M.GAME_DUAL_DEVICE.getName());
                this.c.updateFeature("short_long_ratio_tolerance_threshold", this.LLILZLL.LJIILL());
                return;
            }
            if (this.LLILZLL.LJLJI.LJJIII) {
                this.c.updateFeature("role", EnumC1268010j6N.ANCHOR.getName());
            } else {
                this.c.updateFeature("role", EnumC1268010j6N.GUEST.getName());
            }
            EnumC1267980j6K enumC1267980j6K2 = this.LLLLZ;
            if (enumC1267980j6K2 == EnumC1267980j6K.NORMAL_LIVE) {
                this.c.updateFeature(Scene.SCENE_SERVICE, EnumC1268000j6M.LIVE.getName());
            } else if (enumC1267980j6K2 == EnumC1267980j6K.LINKMIC_CO_HOST || enumC1267980j6K2 == EnumC1267980j6K.LINKMIC_MULTI_GUEST) {
                this.c.updateFeature(Scene.SCENE_SERVICE, EnumC1268000j6M.LINK_MIC.getName());
                LLLLZ(false);
            }
            if (enumC1267980j6K2 == EnumC1267980j6K.LINKMIC_CO_HOST || enumC1267980j6K2 == EnumC1267980j6K.LINKMIC_MULTI_GUEST) {
                LLLLZ(false);
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void startAudioCapture() {
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 361), new int[]{1}));
        } else {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_END");
        }
    }

    public static String LLILII() {
        String strLIZIZ = "\n";
        for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(C786410Ut5.u3())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("LiveStream-StreamTrace");
            sbLIZ.append("    at ");
            sbLIZ.append(stackTraceElement.getClassName());
            sbLIZ.append(e3.d);
            sbLIZ.append(stackTraceElement.getMethodName());
            sbLIZ.append(e3.h);
            sbLIZ.append(stackTraceElement.getFileName());
            sbLIZ.append(" :");
            sbLIZ.append(stackTraceElement.getLineNumber());
            sbLIZ.append(")\n");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(71896);
        AVLog.logApiCall("LiveCoreAPI", "startVideoCapture", null);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 346), new int[]{0}));
        } else {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_END");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1269420j8e
    public final void LJ() {
        if (LLJJ()) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 373));
        } else if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 374));
        }
        if (!this.LLILZLL.LJJIIZ().LJIIIZ()) {
            this.LLLLIILLL = false;
        }
        C1270500jAO c1270500jAO = this.LLJLLL;
        if (c1270500jAO != null) {
            c1270500jAO.LLJJIJIL = null;
        }
    }

    @Override // X.InterfaceC1269420j8e
    public final void LJIIJ() {
        TEFrameRateRange tEFrameRateRange;
        int i;
        LiveStreamVideoCapture liveStreamVideoCapture;
        if (!LLJJ() && ((liveStreamVideoCapture = this.LLJJIJIL) == null || liveStreamVideoCapture.LLJJIII != 1)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoCapture[");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append("] exception, status[");
            LiveStreamVideoCapture liveStreamVideoCapture2 = this.LLJJIJIL;
            sbLIZ.append(liveStreamVideoCapture2 == null ? -1 : liveStreamVideoCapture2.LLJJIII);
            sbLIZ.append(e3.f);
            AVLog.ioe("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJJIJIL == null) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, video capture status exception.");
                C1274080jGA.LIZ.LIZ("LiveStream.onVideoCaptureStarted", androidRuntimeException);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException;
                }
            }
        }
        int i2 = 0;
        if (this.LLILZLL.LJJIIZ().LJIIIZ()) {
            this.LLLLIILLL = false;
        }
        C1270500jAO c1270500jAO = this.LLJLLL;
        if (c1270500jAO != null) {
            C1268610j7L c1268610j7L = c1270500jAO.LLJLLL;
            C1269130j8B c1269130j8B = c1268610j7L != null ? c1268610j7L.LLILZLL : null;
            VideoTrack videoTrack = this.LLJILJILJ;
            if (videoTrack != null && c1269130j8B != null) {
                videoTrack.addVideoSink(c1269130j8B);
            }
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 371));
        if (!LLJJ()) {
            if (this.LLJZ.get() != 7) {
                C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 372));
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture3 = this.LLJJIJIL;
        if (liveStreamVideoCapture3 != null) {
            C1270610jAZ c1270610jAZLLJILJIL = liveStreamVideoCapture3.LLJILJIL();
            if (c1270610jAZLLJILJIL != null) {
                C1DJ6 c1dj6 = c1270610jAZLLJILJIL.LLJJJJ;
                if (c1dj6 != null && (i = (tEFrameRateRange = c1dj6.LLILLL).fpsUnitFactor) > 0) {
                    i2 = tEFrameRateRange.max / i;
                }
            } else {
                i2 = liveStreamVideoCapture3.LLJJ;
            }
        }
        LJJLIIIIJ(5, this.LLILZLL.LJJII(), i2);
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1268690j7T LJIJJLI() {
        if (LLJJ()) {
            return this.LLJJJJ;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null) {
            return null;
        }
        liveStreamVideoCapture.getClass();
        return liveStreamVideoCapture;
    }

    @Override // X.InterfaceC1273910jFt
    public final long LJJ() {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = LJIJJLI();
        if (interfaceC1268690j7TLJIJJLI != null) {
            return interfaceC1268690j7TLJIJJLI.LLIL();
        }
        return -1L;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJI() {
        C1267670j5p c1267670j5p;
        if (!LLJJ()) {
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture != null) {
                C786410Ut5.LJJZZIII(liveStreamVideoCapture.LLJILJIL, new ARunnableS13S0301000_20(0, null, null, liveStreamVideoCapture, 8));
                return;
            }
            return;
        }
        C1266420j3o c1266420j3o = this.LLJJJIL;
        if (c1266420j3o == null || (c1267670j5p = c1266420j3o.LJFF) == null) {
            return;
        }
        if (c1267670j5p.LLIZ == null) {
            c1267670j5p.LIZIZ();
        }
        C1270280jA2 c1270280jA2 = c1267670j5p.LLJ;
        if (c1270280jA2 != null) {
            c1270280jA2.LJFF = c1267670j5p.LLIZ;
            Handler handler = c1270280jA2.LJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20((Object) null, c1270280jA2, (Object) null, 69));
            }
        }
    }

    public final void LJLIIL() {
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start publish, See Stack:");
            sbLIZ.append(LLILII());
            AVLog.w("LiveStream-StreamTrace", C2188811AlT.LIZIZ(sbLIZ));
        }
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream != null) {
            VideoTrack videoTrack = this.LLJILJILJ;
            if (videoTrack != null) {
                mediaEncodeStream.removeTrack(videoTrack);
                LLLIIII(true);
                mediaEncodeStream.addTrack(this.LLJILJILJ);
                mediaEncodeStream.setOriginVideoTrack(this.LLJILJILJ.id());
                LJJLIIIIJ(40, 0, 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setOriginVideoTrack to:");
                sbLIZ2.append(this.LLJILJILJ.id());
                sbLIZ2.append(",Orig Track is:");
                sbLIZ2.append(this.W.name());
                AVLog.iow("LiveStream-StreamTrace", C2188811AlT.LIZIZ(sbLIZ2));
                LJLIIIL(true);
                mediaEncodeStream.setVideoMixerDescription(this.LLJILJILJ.id(), this.LLLJL);
                LJL(0, null);
            }
            AudioTrack audioTrack = this.LLJILLL;
            if (audioTrack != null) {
                mediaEncodeStream.removeTrack(audioTrack);
                LLLIIII(false);
                mediaEncodeStream.addTrack(this.LLJILLL);
                mediaEncodeStream.setOriginAudioTrack(this.LLJILLL.id());
                LJJLIIIIJ(41, 0, 0);
                LJLIIIL(false);
                mediaEncodeStream.setAudioMixerDescription(this.LLJILLL.id(), this.LLLJIL);
            }
        }
        LJLLILLLL(this.LLLLLILLIL);
    }

    public final int LLIIIILZ() {
        int iLJJII;
        if (LLJJ()) {
            iLJJII = this.LLILZLL.LJJII();
        } else {
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture == null) {
                return -1;
            }
            iLJJII = liveStreamVideoCapture.LLJIJIL;
        }
        if (iLJJII == 1) {
            return 0;
        }
        return iLJJII == 2 ? 1 : -1;
    }

    public final C1269410j8d LLILL() {
        if (LLJJ()) {
            return null;
        }
        return this.LLJJL.LJ;
    }

    public final void LLILZLL() {
        if (LLJJ()) {
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        int i = this.LLILZLL.LJIIJ;
        liveStreamVideoCapture.getClass();
        if (i > 0 && i < 15) {
            liveStreamVideoCapture.LLLF = i;
        }
        LiveStreamVideoCapture liveStreamVideoCapture2 = this.LLJJIJIL;
        C1269160j8E c1269160j8E = this.LLILZLL;
        liveStreamVideoCapture2.LLLFFI = c1269160j8E.LJIIJJI;
        liveStreamVideoCapture2.LLLFF = this.LLJLILLLLZIIL;
        liveStreamVideoCapture2.LLJJIJIL = c1269160j8E.LJIIJJI();
    }

    public final boolean LLJJI() {
        return LLJJIJIL() && this.LLILZLL.LIZ.mPushBase.LJIILIIL();
    }

    public final boolean LLJJIII() {
        return LLJILLL() && this.l.LIZ.ttlhABSettingsConfigs.LJI();
    }

    public final boolean LLJJIJI() {
        return LLJJIII() && this.l.LIZ.ttlhABSettingsConfigs.LJII();
    }

    public final boolean LLJJJJJIL() {
        if (LLJJ()) {
            return false;
        }
        return this.LLJJL.LJII;
    }

    @Override // X.InterfaceC1273910jFt
    public final void i0() {
        AbstractC1268600j7K abstractC1268600j7K;
        TECameraCapture tECameraCapture;
        C1270620jAa c1270620jAa;
        Handler handler;
        if (LLJJ()) {
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o == null || (c1270620jAa = c1266420j3o.LJI) == null || (handler = c1270620jAa.LLILZ) == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(c1270620jAa, 40));
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null || (abstractC1268600j7K = liveStreamVideoCapture.LLJJL) == null || !(abstractC1268600j7K instanceof C1270610jAZ) || (tECameraCapture = ((C1270610jAZ) abstractC1268600j7K).LLJJJIL) == null) {
            return;
        }
        tECameraCapture.setDeviceRotation(-1);
    }

    @Override // X.InterfaceC1273910jFt
    public final AbstractC765580U1k LJII() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1268640j7O LJIIL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJJII() {
        return this.p;
    }

    @Override // X.InterfaceC1273910jFt
    public final C1267500j5Y LJJIIJZLJL() {
        return this.l;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1270540jAS LJJIJ() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1269980j9Y LJJJIL() {
        return this.a0;
    }

    @Override // X.InterfaceC1273910jFt
    public final AudioDeviceModule LJJJJJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1274500jGq LJJJJJL() {
        return this.W;
    }

    public final int LLIIII() {
        return this.q;
    }

    public final long LLIIJI() {
        return this.i;
    }

    public final C1269160j8E LLIIJLIL() {
        return this.LLILZLL;
    }

    public final C1273620jFQ LLIL() {
        return this.LLJLL;
    }

    public final boolean LLJI() {
        return this.r;
    }

    public static boolean LLJJJ(String str) {
        if (str == null) {
            return false;
        }
        List listAsList = Arrays.asList(str.split("\\?"));
        if (listAsList.size() != 2) {
            return false;
        }
        Iterator it2 = Arrays.asList(((String) ListProtector.get(listAsList, 1)).split("&")).iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it2.hasNext()) {
            List listAsList2 = Arrays.asList(((String) it2.next()).split("=", 2));
            if (listAsList2.size() == 2) {
                String str2 = (String) ListProtector.get(listAsList2, 0);
                String str3 = (String) ListProtector.get(listAsList2, 1);
                if (str2.equals("rtcStreamId") && !str3.isEmpty()) {
                    z = true;
                } else if (str2.equals("rtcRoomId") && !str3.isEmpty()) {
                    z2 = true;
                } else if (str2.equals("rtcToken") && !str3.isEmpty()) {
                    z3 = true;
                } else if (str2.equals("rtcUserId") && !str3.isEmpty()) {
                    z4 = true;
                }
            }
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    public static String LLLLLLZ(String str) {
        String[] strArrSplit;
        String[] strArrSplit2 = str.split("\\?");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strArrSplit2[0]);
        sbLIZ.append("?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strArrSplit2.length > 1 && (strArrSplit = strArrSplit2[1].split("&")) != null) {
            boolean z = false;
            boolean z2 = false;
            for (String str2 : strArrSplit) {
                String[] strArrSplit3 = str2.split("=");
                if (strArrSplit3 != null && strArrSplit3.length == 2) {
                    if (!TextUtils.equals(strArrSplit3[0], "rtcRoomId") && !TextUtils.equals(strArrSplit3[0], "rtcUserId") && !TextUtils.equals(strArrSplit3[0], "rtcToken")) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append("&");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(strArrSplit3[0]);
                        sbLIZ3.append("=");
                        sbLIZ3.append(strArrSplit3[1]);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append("&pri=");
                sbLIZ4.append(System.currentTimeMillis());
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            return strLIZIZ;
        }
        return strLIZIZ;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LIZIZ(String str) {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseMediaPlayer streamID:");
            sbLIZ.append(str);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            InterfaceC1271360jBm interfaceC1271360jBm = (InterfaceC1271360jBm) ((ConcurrentHashMap) c1267560j5e.LIZ).get(str);
            if (interfaceC1271360jBm != null) {
                interfaceC1271360jBm.release();
                ((ConcurrentHashMap) c1267560j5e.LIZ).remove(str);
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LIZLLL(String str) {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopPlayer streamID:");
            sbLIZ.append(str);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            C1271310jBh c1271310jBh = (C1271310jBh) ((ConcurrentHashMap) c1267560j5e.LIZ).get(str);
            if (c1271310jBh != null) {
                c1271310jBh.stop();
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJFF(C0UHL c0uhl) {
        this.LLJJIJI = c0uhl;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIILJJIL(InterfaceC775290Ub9 interfaceC775290Ub9) {
        this.LLJJIII = interfaceC775290Ub9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147 A[Catch: JSONException -> 0x020e, TryCatch #2 {JSONException -> 0x020e, blocks: (B:9:0x0058, B:11:0x005e, B:13:0x007f, B:15:0x0085, B:17:0x008b, B:24:0x00b5, B:26:0x00bb, B:27:0x00c3, B:29:0x00c9, B:30:0x00d1, B:32:0x00d7, B:33:0x00e1, B:35:0x00e7, B:37:0x00ed, B:39:0x00f3, B:40:0x0109, B:42:0x010f, B:43:0x0117, B:45:0x011f, B:46:0x012b, B:48:0x0133, B:49:0x013f, B:51:0x0147, B:18:0x009a, B:20:0x00a0, B:22:0x00a6), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187 A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5 A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0201 A[Catch: JSONException -> 0x020a, TryCatch #0 {JSONException -> 0x020a, blocks: (B:53:0x014f, B:55:0x0157, B:56:0x015c, B:59:0x0166, B:62:0x017f, B:64:0x0187, B:65:0x0193, B:67:0x019b, B:68:0x01a7, B:70:0x01af, B:71:0x01ba, B:74:0x01ca, B:76:0x01d5, B:79:0x01ec, B:80:0x01f8, B:82:0x0201, B:83:0x0206, B:61:0x016c), top: B:92:0x014f }] */
    @Override // X.InterfaceC1273910jFt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LJIIZILJ(java.lang.String):void");
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJI(C0UHD c0uhd) {
        Handler handler = this.LL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, c0uhd, 215));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final LyraxPreProcessVideoNodeStats LJIL(JSONObject jSONObject) {
        C1270620jAa c1270620jAa;
        C1269190j8H c1269190j8H;
        LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats = new LyraxPreProcessVideoNodeStats();
        lyraxPreProcessVideoNodeStats.adapted_resolution_width = this.LLILZLL.LJIILJJIL(0);
        lyraxPreProcessVideoNodeStats.adapted_resolution_height = this.LLILZLL.LJIILIIL(0);
        if (LLJJ()) {
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null && (c1270620jAa = c1266420j3o.LJI) != null && (c1269190j8H = c1270620jAa.LLJ) != null) {
                lyraxPreProcessVideoNodeStats.original_capture_width = c1269190j8H.LJFF;
                lyraxPreProcessVideoNodeStats.original_capture_height = c1269190j8H.LJI;
                lyraxPreProcessVideoNodeStats.frame_rate_camera_output = c1269190j8H.LIZLLL;
            }
            InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = LJIJJLI();
            if (interfaceC1268690j7TLJIJJLI != null) {
                lyraxPreProcessVideoNodeStats.frame_rate_render_input = interfaceC1268690j7TLJIJJLI.LLILL();
            }
        } else {
            InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI2 = LJIJJLI();
            if (interfaceC1268690j7TLJIJJLI2 != null) {
                lyraxPreProcessVideoNodeStats.frame_rate_camera_output = interfaceC1268690j7TLJIJJLI2.LLFF();
                lyraxPreProcessVideoNodeStats.original_capture_width = interfaceC1268690j7TLJIJJLI2.LJJL();
                lyraxPreProcessVideoNodeStats.original_capture_height = interfaceC1268690j7TLJIJJLI2.LJJJJ();
                lyraxPreProcessVideoNodeStats.frame_rate_render_input = interfaceC1268690j7TLJIJJLI2.LLILL();
            }
        }
        if (LLJILLL()) {
            if (LLJJ()) {
                lyraxPreProcessVideoNodeStats.frame_rate_render_output = LLLFFI("key_pre_encode_fps").getFloat("key_pre_encode_fps", 0.0f);
            } else {
                lyraxPreProcessVideoNodeStats.frame_rate_render_output = LLLFFI("key_effect_out_fps").getFloat("key_effect_out_fps", 0.0f);
            }
        } else if (LLJJIJIL()) {
            lyraxPreProcessVideoNodeStats.frame_rate_render_output = LLIILZL();
        }
        if (jSONObject != null) {
            lyraxPreProcessVideoNodeStats.up_render_stall_100 = (int) jSONObject.optLong("render_stall", 0L);
            lyraxPreProcessVideoNodeStats.up_render_stall_200 = (int) jSONObject.optLong("render_stall_200", 0L);
            lyraxPreProcessVideoNodeStats.up_render_stall_500 = (int) jSONObject.optLong("render_stall_500", 0L);
            lyraxPreProcessVideoNodeStats.effect_process_details = jSONObject.optString("effect_process_details", "");
            lyraxPreProcessVideoNodeStats.render_stall_details = String.valueOf(jSONObject.optJSONArray("render_stall_details"));
            lyraxPreProcessVideoNodeStats.average_bmf_process_time = (int) jSONObject.optLong("average_bmf_process_time", 0L);
            lyraxPreProcessVideoNodeStats.average_effect_process_time = (int) jSONObject.optLong("average_effect_process_time", 0L);
            lyraxPreProcessVideoNodeStats.average_render_process_time = (int) jSONObject.optLong("average_render_process_time", 0L);
            lyraxPreProcessVideoNodeStats.average_frame_interval_time = (int) jSONObject.optLong("average_frame_interval_time", 0L);
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O != null) {
            lyraxPreProcessVideoNodeStats.effect_process_details = interfaceC1268640j7O.LLFII();
        }
        return lyraxPreProcessVideoNodeStats;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1273910jFt
    public final double LJJIFFI(String str) {
        VideoTrack videoTrack;
        C1266390j3l c1266390j3l;
        float realRatePerSecond;
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (str.equals("estream_transport_real_fps") || str.equals("estream_transport_real_bps") || str.equals("estream_venc_real_fps")) {
            if (this.LLIZ != null) {
                C1279020jO8 c1279020jO8 = this.LLLLZIL;
                if (c1279020jO8 == null) {
                    return 0.0d;
                }
                switch (str.hashCode()) {
                    case 731959924:
                        if (str.equals("estream_transport_real_bps")) {
                            return c1279020jO8.LJI;
                        }
                        break;
                    case 731963768:
                        if (str.equals("estream_transport_real_fps")) {
                            return c1279020jO8.LIZJ;
                        }
                        break;
                    case 1569124713:
                        if (str.equals("estream_venc_real_fps")) {
                            return c1279020jO8.LIZ;
                        }
                        break;
                }
            } else if (mediaEncodeStream != null) {
                return mediaEncodeStream.getStaticsInfoWithKey(str);
            }
        }
        if (str.equals("vsourc_deliver_fps") && (c1266390j3l = this.LLLZLZ) != null) {
            VideoFrameStatics videoFrameStatics = c1266390j3l.LLILZLL;
            if (videoFrameStatics != null) {
                realRatePerSecond = videoFrameStatics.getRealRatePerSecond();
            } else {
                realRatePerSecond = 0.0f;
            }
            return realRatePerSecond;
        }
        if ((!str.equals("vsourc_deliver_fps") && !str.equals("vsourc_drop_fps")) || (videoTrack = this.LLJILJILJ) == null) {
            return 0.0d;
        }
        return videoTrack.getStaticsInfoWithKey(str);
    }

    @Override // X.InterfaceC1270850jAx
    public final void LJJIII(long j) {
        TTLHSceneDetector tTLHSceneDetector = this.f.get();
        if (tTLHSceneDetector != null) {
            tTLHSceneDetector.onExposureTime(j);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIIZI(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F != null) {
            c1268550j7F.unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJIIJI(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", z);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "enableAnchorStableMode", jSONObject);
        LLLILZLLLI(new ARunnableS39S0110000_20(this, z, 25));
    }

    @Override // X.InterfaceC1270850jAx
    public final void LJJIJIIJIL(long j) {
        TTLHSceneDetector tTLHSceneDetector = this.f.get();
        if (tTLHSceneDetector != null) {
            tTLHSceneDetector.onIso(j);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJIL(int i) {
        Object obj;
        if (i != 6 && this.LLILZLL.LJJII() == 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Screen mode ignore switch, current mode ");
            sbLIZ.append(this.LLLLIIL);
            sbLIZ.append(", mode=");
            if (this.LLJJLIIIJLLLLLLLZ != null) {
                obj = 1;
            } else {
                obj = "-1";
            }
            sbLIZ.append(obj);
            AVLog.iod("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLLLIIL = i;
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F != null) {
            c1268550j7F.setMode(i);
        }
        C1268550j7F c1268550j7F2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F2 != null) {
            c1268550j7F2.LLJILLL(i);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJL(boolean z) throws JSONException {
        C1268130j6Z c1268130j6Z = this.j;
        if (c1268130j6Z != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable", z);
            AVLog.logApiCall("linkmic_video_api", "enableAdaptiveLinkMicLayoutParams", jSONObject);
            c1268130j6Z.LJJIJLIJ = z;
            if (!z) {
                c1268130j6Z.LJI();
                c1268130j6Z.LIZ();
                c1268130j6Z.LJIIJJI(false);
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJLIJ(Bitmap bitmap) {
        int i;
        C1269990j9Z c1269990j9Z;
        Bitmap bitmapCreateBitmap = bitmap;
        int i2 = 0;
        Bitmap bitmapCopy = null;
        if (LLJJ()) {
            if (LLJJIII()) {
                Object obj = this.LLJJJ;
                if (obj instanceof C1271980jCm) {
                    C1269160j8E c1269160j8E = this.LLILZLL;
                    if (c1269160j8E != null) {
                        i2 = c1269160j8E.LJIIJ;
                    }
                    if (((AbsLyraxVideoPlatformWrapper) obj).pushStaticImageBitmap(bitmapCreateBitmap, i2) == LyraxErrorCode.SUCCESS) {
                        return;
                    }
                }
            }
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null) {
                if (c1266420j3o.LJIIIIZZ == null) {
                    c1266420j3o.LIZ(6);
                }
                C1267420j5Q c1267420j5Q = c1266420j3o.LJIIIIZZ;
                if (c1267420j5Q != null && (c1269990j9Z = c1267420j5Q.LLILLJJLI) != null) {
                    if (bitmapCreateBitmap != null) {
                        bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    c1269990j9Z.LLILZLL = bitmapCopy;
                    c1269990j9Z.LLJILLL = EnumC1267990j6L.BITMAP;
                    return;
                }
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture != null) {
            int i3 = liveStreamVideoCapture.LLJILJILJ;
            if (i3 != 0 && (i = liveStreamVideoCapture.LLJILLL) != 0) {
                if (bitmapCreateBitmap instanceof Bitmap) {
                    if (bitmapCreateBitmap != null) {
                        if (liveStreamVideoCapture.LLL) {
                            i3 = liveStreamVideoCapture.LLLIILIL;
                            i = liveStreamVideoCapture.LLLIL;
                        }
                        if (bitmapCreateBitmap.getWidth() == i3 && bitmapCreateBitmap.getHeight() == i) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap);
                        } else {
                            Matrix matrixLIZJ = C1273520jFG.LIZJ(false);
                            matrixLIZJ.reset();
                            matrixLIZJ.postScale(i3 / bitmapCreateBitmap.getWidth(), i / bitmapCreateBitmap.getHeight());
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrixLIZJ, true);
                        }
                    }
                } else {
                    bitmapCreateBitmap = null;
                }
                C786410Ut5.LJJZZIII(liveStreamVideoCapture.LLJILJIL, new ARunnableS89S0200000_20(liveStreamVideoCapture, bitmapCreateBitmap, 241));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Size is 0!");
            sbLIZ.append(liveStreamVideoCapture.LLJILJILJ);
            sbLIZ.append(",");
            sbLIZ.append(liveStreamVideoCapture.LLJILLL);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C1274080jGA.LIZ.LIZ("LiveStreamVideoCapture.setBackGroundPhotoPath", androidRuntimeException);
            if (!C1274040jG6.LIZ()) {
                AVLog.ioe("LiveStreamVideoCapture", "setBackgroundPhotoPath failed. Size is 0");
                return;
            }
            throw androidRuntimeException;
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJJIL(C1269240j8M c1269240j8M) {
        double avgCostTimePerFrameMs;
        if (c1269240j8M == null) {
            return false;
        }
        try {
            if (this.LLLII.readLock().tryLock(100L, TimeUnit.MILLISECONDS)) {
                c1269240j8M.clear();
                c1269240j8M.setLong("trans_adjust_bps", this.LLLIIII);
                MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
                if (mediaEncodeStream != null) {
                    mediaEncodeStream.getStaticsReport(c1269240j8M);
                    AudioMixer audioMixer = this.LLJIJIL.getAudioMixer();
                    if (audioMixer == null) {
                        avgCostTimePerFrameMs = 0.0d;
                    } else {
                        avgCostTimePerFrameMs = audioMixer.getAvgCostTimePerFrameMs();
                    }
                    c1269240j8M.setDouble("audio_mixer_cost_time_per_frame_ms", avgCostTimePerFrameMs);
                    c1269240j8M.setDouble("video_mixer_cost_time_per_frame_ms", this.LLJIJIL.getVideoMixer().getAvgCostTimePerFrameMs());
                }
                VideoTrack videoTrack = this.LLJILJILJ;
                if (videoTrack != null) {
                    videoTrack.getStaticsReport(c1269240j8M);
                }
                AudioTrack audioTrack = this.LLJILLL;
                if (audioTrack != null) {
                    audioTrack.getStaticsReport(c1269240j8M);
                }
                LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
                if (liveStreamVideoCapture != null) {
                    liveStreamVideoCapture.getStaticsReport(c1269240j8M);
                }
                c1269240j8M.setLong("capture_utc_ts", this.i);
                VideoFrameStatistics videoFrameStatistics = this.LLJILJIL;
                C1269160j8E c1269160j8E = this.LLILZLL;
                if (videoFrameStatistics != null && c1269160j8E != null) {
                    videoFrameStatistics.getStaticsReport(c1269240j8M);
                }
                this.LLLII.readLock().unlock();
                return true;
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C1274080jGA.LIZ.LIZ("LiveStream.getLiveStreamInfo", e);
            if (C1274040jG6.LIZ()) {
                throw new RuntimeException("mReportFence.readLock()", e);
            }
        }
        AVLog.w("LiveStream", "Maybe be stream will be release.");
        return false;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJ(InterfaceC1268540j7E interfaceC1268540j7E) {
        boolean z;
        this.LLJJIJIIJIL = interfaceC1268540j7E;
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            if (interfaceC1268540j7E != null) {
                z = true;
            } else {
                z = false;
            }
            audioDeviceModule.enableAdmObserver(z);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJLL(C1267140j4y c1267140j4y) throws JSONException {
        AugurAdaptiveWrapper augurAdaptiveWrapper;
        String str;
        C1268130j6Z c1268130j6Z = this.j;
        if (c1268130j6Z != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("linkMicLayoutParams", c1267140j4y);
            AVLog.logApiCall("linkmic_video_api", "updateLinkMicLayoutParams", jSONObject);
            c1268130j6Z.LJJIZ = System.currentTimeMillis();
            c1268130j6Z.LJJJ = 0L;
            c1268130j6Z.LJJIJL++;
            c1268130j6Z.LIZ();
            c1268130j6Z.LJI();
            c1268130j6Z.LJI = c1267140j4y.LIZ;
            c1268130j6Z.LJII = c1267140j4y.LIZIZ;
            c1268130j6Z.LJIIIIZZ = c1267140j4y.LIZJ;
            c1268130j6Z.LJIIIZ = c1267140j4y.LIZLLL;
            Map<String, ? extends Object> map = c1267140j4y.LJ;
            c1268130j6Z.LJIL = map;
            if (map != null) {
                Object obj = map.get("layout_config_id");
                Object obj2 = null;
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = "";
                }
                c1268130j6Z.LJIJ = str;
                Object obj3 = map.get("enable_simulcast");
                if (obj3 instanceof String) {
                    obj2 = obj3;
                }
                c1268130j6Z.LJIIL = Intrinsics.LJFF(obj2, "1");
            }
            c1268130j6Z.LJJIL = c1267140j4y;
            C1267280j5C c1267280j5C = c1268130j6Z.LJIJI;
            if (c1267280j5C == null ? !((augurAdaptiveWrapper = c1268130j6Z.LJIJJ) == null || !augurAdaptiveWrapper.isAugurInited()) : c1267280j5C.LJIIIIZZ == 1) {
                Handler handler = c1268130j6Z.LJJIIZ;
                if (handler != null) {
                    C786410Ut5.LJLIIL(c1268130j6Z.LJIIZILJ, handler, c1268130j6Z.LJJIIJZLJL);
                }
                c1268130j6Z.LJIIL();
                c1268130j6Z.LJII("updateLinkMicLayoutParams");
                return;
            }
            c1268130j6Z.LJIIIZ("updateLinkMicLayoutParams");
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJZ(InterfaceC1267860j68 interfaceC1267860j68) {
        Handler handler = this.LL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, interfaceC1267860j68, 216));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJJLI(int[] iArr) {
        if (LLJJ()) {
            if (iArr != null && iArr.length > 1) {
                iArr[0] = this.LLILZLL.LJIILJJIL(0);
                iArr[1] = this.LLILZLL.LJIILIIL(0);
                return true;
            }
        } else {
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture != null && iArr != null && iArr.length > 1) {
                iArr[0] = liveStreamVideoCapture.LLLIILIL;
                iArr[1] = liveStreamVideoCapture.LLLIL;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJLIIIJILLIZJL(boolean z) {
        if (z) {
            if (LLJJ()) {
                return this.LLILZLL.LJJII();
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture == null) {
                return 0;
            }
            return liveStreamVideoCapture.LLJIJIL;
        }
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F == null) {
            return 0;
        }
        return c1268550j7F.LL();
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJJI(C774490UZr c774490UZr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params", c774490UZr.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "setExternalAdaptiveConfig", jSONObject);
        LLLILZLLLI(new ARunnableS89S0200000_20(c774490UZr, this, 208));
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJL(int i) {
        VideoMixer videoMixer;
        this.LLLLIIIILLL = i;
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", i);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJLJLI(List<String> list) {
        if (this.LLJZ.get() != 7 && !this.A.get()) {
            this.LLLFFI = list;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Try to start live stream with ");
            sbLIZ.append(list);
            AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
            int i = 0;
            while (i < this.LLLFFI.size()) {
                if (((String) ListProtector.get(this.LLLFFI, i)).isEmpty()) {
                    ListProtector.remove(this.LLLFFI, i);
                } else {
                    i++;
                }
            }
            if (this.LLLFFI.isEmpty()) {
                return;
            }
            RunnableC1266370j3j runnableC1266370j3j = this.z;
            if (runnableC1266370j3j != null) {
                this.LL.removeCallbacks(runnableC1266370j3j);
                RunnableC1266370j3j runnableC1266370j3j2 = this.z;
                runnableC1266370j3j2.LL = list;
                Boolean bool = Boolean.TRUE;
                runnableC1266370j3j2.LLILLL = bool;
                runnableC1266370j3j2.LLILLJJLI = bool;
            } else {
                this.z = new RunnableC1266370j3j(this, list, true, true, false);
            }
            C1283100jUi.LIZIZ(this.LL, this.z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    @Override // X.InterfaceC1273910jFt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(com.ss.ttlivestreamer.core.utils.TEBundle r22) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LJJLIIJ(com.ss.ttlivestreamer.core.utils.TEBundle):void");
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveStream Call switchVideoCapture.from");
        sbLIZ.append(this.LLILZLL.LJJII());
        sbLIZ.append(" ,to ");
        sbLIZ.append(i);
        AVLog.ioi("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJLIIL = "";
        if (LLJJ()) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS31S0101000_20(this, i, 32));
        } else {
            if (this.LLJZ.get() == 7 || this.A.get()) {
                return;
            }
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS31S0101000_20(this, i, 33), new int[]{0}));
        }
    }

    @Override // X.InterfaceC1272510jDd
    public final void LJJLJ(JSONObject jSONObject) {
        InterfaceC1266880j4Y interfaceC1266880j4Y;
        C1269160j8E c1269160j8E = this.LLILZLL;
        if (c1269160j8E != null && (interfaceC1266880j4Y = c1269160j8E.LJLJI.LJJIIJ) != null) {
            interfaceC1266880j4Y.LIZ(jSONObject);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLL(boolean z) {
        VideoMixer videoMixer;
        this.LLLLLZ = z;
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPublishPlanarRender:");
            sbLIZ.append(z);
            AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setPublishPlanarRender:");
            sbLIZ2.append(z);
            AVLog.w("LiveStream", C2188811AlT.LIZIZ(sbLIZ2));
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setBool("vmixer_planar_render", this.LLLLLZ);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    public final void LJLIIIL(boolean z) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream == null) {
            return;
        }
        if (z) {
            synchronized (this.LLLIL) {
                try {
                    for (InterfaceC1274500jGq interfaceC1274500jGq : this.LLLILZJ) {
                        if ((interfaceC1274500jGq instanceof C1266560j42) && (videoTrack = ((C1266560j42) interfaceC1274500jGq).LLILLL) != null) {
                            mediaEncodeStream.addTrack(videoTrack);
                            mediaEncodeStream.setVideoMixerDescription(interfaceC1274500jGq.name(), interfaceC1274500jGq.LIZ());
                        }
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (this.LLLIL) {
            try {
                for (InterfaceC1268820j7g interfaceC1268820j7g : this.LLLILZ) {
                    if (interfaceC1268820j7g instanceof C1266600j46) {
                        ((C1266600j46) interfaceC1268820j7g).getClass();
                    }
                }
            } finally {
            }
        }
    }

    public final void LJLIL(C1274330jGZ c1274330jGZ) {
        C1266390j3l c1266390j3l = this.LLLZLZ;
        if (c1266390j3l != null) {
            c1266390j3l.LJIIJ(EnumC1267970j6J.TYPE_RTC, c1274330jGZ);
        }
    }

    public final void LJLILLLLZI(C1269610j8x c1269610j8x) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.appendSerializedEvent(c1269610j8x);
        } else {
            if (this.LLLLLZL == null || !this.LLILZLL.LIZ.mPushBase.LJIIL()) {
                return;
            }
            ((LinkedList) this.LLLLLZL).add(c1269610j8x);
        }
    }

    public final void LJLLI(int i) {
        C1267670j5p c1267670j5p;
        C1270180j9s c1270180j9s;
        Handler handler;
        if (LLJJ()) {
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null && (c1267670j5p = c1266420j3o.LJFF) != null && (c1270180j9s = c1267670j5p.LLIZLLLIL) != null && c1270180j9s.LLJJJIL != null && (handler = c1270180j9s.LLILZ) != null && i % 90 == 0) {
                C1283100jUi.LIZIZ(handler, new ARunnableS31S0101000_20(i, c1270180j9s, 35));
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null) {
            return;
        }
        AbstractC1268600j7K abstractC1268600j7K = liveStreamVideoCapture.LLJJL;
        if (abstractC1268600j7K instanceof C1270170j9r) {
            C1270170j9r c1270170j9r = (C1270170j9r) abstractC1268600j7K;
            synchronized (c1270170j9r) {
                c1270170j9r.LLJIJIL();
                if (c1270170j9r.LLJIJIL == null) {
                    return;
                }
                if (i % 90 != 0) {
                    return;
                }
                C1283100jUi.LIZIZ(c1270170j9r.LLJILJIL.getHandler(), new ARunnableS31S0101000_20(i, c1270170j9r, 22));
                return;
            }
        }
        AVLog.ioe("LiveStreamVideoCapture", "Can not changeScreenCaptureOrientation");
    }

    public final void LJLLILLLL(boolean z) {
        if (LLJILLL() || !this.LLILZLL.LJ) {
            return;
        }
        C1283100jUi.LIZIZ(this.LL, new ARunnableS39S0110000_20(this, z, 27));
    }

    public final boolean LJLLJ(boolean z) {
        C1269510j8n c1269510j8nLIZLLL = C1269500j8m.LIZJ().LIZLLL(1);
        if (c1269510j8nLIZLLL == null || C1270300jA4.LIZ(c1269510j8nLIZLLL.LIZIZ)) {
            c1269510j8nLIZLLL = new C1269510j8n(1, "LiveCoreImpl.startAudioCapture", C1270290jA3.LIZIZ().LIZ(EnumC1270240j9y.AUDIO_START).LIZ);
        }
        try {
            c1269510j8nLIZLLL.LIZ();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Method \"");
            sbLIZ.append(c1269510j8nLIZLLL.LIZJ);
            sbLIZ.append("\" check audio cert failed.");
            AVLog.logToIODeviceInternal(6, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), e);
            if (z) {
                this.LLJZ.set(8);
                LLLIIL(3, 1128616533, e);
                return false;
            }
            return false;
        }
    }

    public final InterfaceC1274500jGq LJLZ(String str) {
        MediaEngineFactory mediaEngineFactory = this.LLJJ;
        if (mediaEngineFactory == null) {
            AVLog.logKibana(6, "LiveStream", "createInputVideoStream error: mMediaEngineFactory is null", null);
            return null;
        }
        Handler handler = this.LLILLL;
        if (handler == null) {
            AVLog.logKibana(6, "LiveStream", "createInputVideoStream error: mVideoCaptureHandler is null", null);
            return null;
        }
        C1266570j43 c1266570j43 = new C1266570j43(this);
        int iLJJIL = this.LLILZLL.LJJIL(0);
        int iLJJIJIIJIL = this.LLILZLL.LJJIJIIJIL(0);
        int iLJJIJIIJI = this.LLILZLL.LJJIJIIJI();
        this.LLILZLL.LIZ.mPushBase.getClass();
        C1266560j42 c1266560j42 = new C1266560j42(mediaEngineFactory, handler, c1266570j43, iLJJIL, iLJJIJIIJIL, iLJJIJIIJI, str);
        synchronized (this.LLLIL) {
            try {
                this.LLLILZJ.add(c1266560j42);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1283100jUi.LIZIZ(this.LL, new ARunnableS89S0200000_20(this, c1266560j42, 219));
        return c1266560j42;
    }

    public final void LLFFF(boolean z) {
        boolean zLJIIJ = this.l.LIZ.mPushBase.LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableBMFColorCorrection valid:");
        sbLIZ.append(zLJIIJ);
        sbLIZ.append(" enable:");
        sbLIZ.append(z);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!zLJIIJ) {
            return;
        }
        this.I = z;
        if (LLJILLL()) {
            InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
            if (interfaceC1266410j3n != null) {
                interfaceC1266410j3n.LJJIIJZLJL(z);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O == null) {
            return;
        }
        interfaceC1268640j7O.LJLLLL(z);
    }

    public final void LLFII(boolean z) {
        C1268130j6Z c1268130j6Z = this.j;
        if (c1268130j6Z != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableHighBitrate enable:");
            sbLIZ.append(z);
            sbLIZ.append(" enableHighBitrate:");
            sbLIZ.append(c1268130j6Z.LJIILJJIL);
            AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
            if (c1268130j6Z.LJIILJJIL != z) {
                c1268130j6Z.LJIILJJIL = z;
                c1268130j6Z.LIZ();
                c1268130j6Z.LJIIL();
                c1268130j6Z.LJII("enableHighBitrate");
            }
        }
    }

    public final void LLI(boolean z) {
        InterfaceC1266410j3n interfaceC1266410j3n;
        C1266390j3l c1266390j3l;
        C1269370j8Z c1269370j8Z;
        if (!LLJJ() && (c1269370j8Z = this.LLJJL) != null) {
            c1269370j8Z.LJIIIZ = z;
        }
        if (this.p != z) {
            this.p = z;
            if (!this.l.LIZ.LJII) {
                if (!z) {
                    VideoSink videoSink = this.LLJJI;
                    if (videoSink != null && (c1266390j3l = this.LLLZLZ) != null) {
                        c1266390j3l.LJIIJ(EnumC1267970j6J.TYPE_RENDER, videoSink);
                    }
                } else {
                    C1266390j3l c1266390j3l2 = this.LLLZLZ;
                    if (c1266390j3l2 != null) {
                        c1266390j3l2.LJIILIIL(EnumC1267970j6J.TYPE_RENDER);
                    }
                }
            }
        }
        if (LLJILLL() && (interfaceC1266410j3n = this.LLJJJ) != null) {
            interfaceC1266410j3n.LJFF(z);
        }
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (interfaceC1266360j3i != null) {
            interfaceC1266360j3i.LJJIII(this.p, this.LLLZI);
        }
    }

    public final BitrateConfig LLIIIZ(String str) {
        EnumC2178851APb enumC2178851APb;
        if (str != null && !str.isEmpty()) {
            C1269160j8E c1269160j8E = this.LLILZLL;
            if (c1269160j8E != null) {
                List<BitrateConfig> list = c1269160j8E.LJJLL;
                if (list != null && !list.isEmpty()) {
                    for (BitrateConfig bitrateConfig : list) {
                        if (bitrateConfig != null && (enumC2178851APb = bitrateConfig.LIZ) != null) {
                            if (str.equals(enumC2178851APb.getSdkKey())) {
                                return bitrateConfig;
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getGameStandardResolution config==null || gamelevel==null. config=");
                            sbLIZ.append(bitrateConfig);
                            AVLog.logKibana(5, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
                            return null;
                        }
                    }
                } else {
                    AVLog.logKibana(5, "LiveStream", "getGameStandardResolution: adaptiveBitrateConfigList is null or empty.", null);
                    return null;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getGameStandardResolution cannot find right config. sdkKey=");
            sbLIZ2.append(str);
            AVLog.logKibana(5, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), null);
            return null;
        }
        AVLog.logKibana(5, "LiveStream", "getGameStandardResolution: sdkKey is null or empty.", null);
        return null;
    }

    public final EnumC1269640j90 LLIILII(String str) {
        C1271310jBh c1271310jBh;
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e == null || (c1271310jBh = (C1271310jBh) ((ConcurrentHashMap) c1267560j5e.LIZ).get(str)) == null) {
            return null;
        }
        return c1271310jBh.LLILZLL;
    }

    public final boolean LLJ(AbsAugurCommand absAugurCommand) {
        if (TextUtils.equals(absAugurCommand.scene, EnumC1268000j6M.LINK_MIC.getName()) && LLJJJIL()) {
            return true;
        }
        if (TextUtils.equals(absAugurCommand.scene, EnumC1268000j6M.LIVE.getName()) && this.LLLLZ == EnumC1267980j6K.NORMAL_LIVE) {
            return true;
        }
        return false;
    }

    public final boolean LLJIJIL(AbstractC1268060j6S abstractC1268060j6S) {
        if (TextUtils.equals(abstractC1268060j6S.scene, EnumC1268000j6M.LINK_MIC.getName()) && LLJJJIL()) {
            return true;
        }
        if (TextUtils.equals(abstractC1268060j6S.scene, EnumC1268000j6M.LIVE.getName()) && this.LLLLZ == EnumC1267980j6K.NORMAL_LIVE) {
            return true;
        }
        return false;
    }

    public final void LLJLIL(String str) {
        C1267280j5C c1267280j5C = this.LLZZZZ;
        if (c1267280j5C != null) {
            C1268090j6V c1268090j6V = c1267280j5C.LIZJ;
            c1268090j6V.getClass();
            if (TextUtils.equals(str, "face_extra_model_name")) {
                ((HashMap) c1268090j6V.LIZIZ).remove("effect_face_strategy");
            } else if (TextUtils.equals(str, "matting_model_name")) {
                ((HashMap) c1268090j6V.LIZIZ).remove("effect_matting_strategy");
            }
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.clearEffectStrategyReport(str);
        }
    }

    public final void LLJLILLLLZIIL(JSONObject jSONObject) {
        InterfaceC1266830j4T interfaceC1266830j4T = this.f150X;
        if (interfaceC1266830j4T != null) {
            interfaceC1266830j4T.LIZ(jSONObject);
        }
    }

    public final void LLJLLIL(EnumC1267980j6K enumC1267980j6K) {
        boolean z;
        AugurAdaptiveWrapper augurAdaptiveWrapper;
        C1266620j48 c1266620j48;
        InterfaceC1266360j3i interfaceC1266360j3i;
        C1268090j6V c1268090j6V;
        boolean z2;
        boolean z3;
        this.LLZZJLIL = -1;
        this.LLZZLLIL = -1;
        this.LLZZZIL = -1;
        C1269160j8E c1269160j8E = this.LLILZLL;
        c1269160j8E.LJJIIJ = c1269160j8E.LJJIII;
        EnumC1267980j6K enumC1267980j6K2 = EnumC1267980j6K.NORMAL_LIVE;
        if (enumC1267980j6K != enumC1267980j6K2 && enumC1267980j6K != EnumC1267980j6K.GAME_LIVE) {
            z = true;
        } else {
            z = false;
        }
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        c1271250jBb.LJIIIZ(z);
        C1269850j9L c1269850j9L = this.f148J;
        if (c1269850j9L != null) {
            if (enumC1267980j6K == enumC1267980j6K2) {
                z3 = true;
            } else {
                z3 = false;
            }
            c1269850j9L.LLILZIL = z3;
        }
        C1273370jF1 c1273370jF1 = this.K;
        if (c1273370jF1 != null) {
            if (enumC1267980j6K != enumC1267980j6K2 && enumC1267980j6K != EnumC1267980j6K.GAME_LIVE) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1273370jF1.LLIZLLLIL = z2;
        }
        if (!this.A.get()) {
            InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
            C1267500j5Y c1267500j5Y = this.l;
            boolean z4 = this.LLILZLL.LJLJI.LJJIII;
            boolean z5 = this.F;
            if (interfaceC1268640j7O != null) {
                int i = c1267500j5Y.LIZ.captureBase.videoCapture.LIZ;
                if (i != 0 && i != 3 && !z5) {
                    int i2 = C1266930j4d.LIZ[enumC1267980j6K.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            interfaceC1268640j7O.setClientState(11);
                        } else if (z4) {
                            interfaceC1268640j7O.setClientState(13);
                        } else {
                            interfaceC1268640j7O.setClientState(14);
                        }
                    } else {
                        interfaceC1268640j7O.setClientState(12);
                    }
                } else {
                    interfaceC1268640j7O.setClientState(15);
                }
            }
        }
        if (enumC1267980j6K == enumC1267980j6K2) {
            LLLLZ(false);
        }
        if ((enumC1267980j6K == EnumC1267980j6K.LINKMIC_MULTI_GUEST || enumC1267980j6K == EnumC1267980j6K.LINKMIC_CO_HOST || enumC1267980j6K == EnumC1267980j6K.GAME_DUAL_DEVICE) && this.LLILZLL.LJLIIIL == 1 && this.LLIZ != null && !this.A.get()) {
            this.LLIZ.LJJ();
        }
        if (enumC1267980j6K == enumC1267980j6K2) {
            C1267280j5C c1267280j5C = this.LLZZZZ;
            if (c1267280j5C != null && (c1268090j6V = c1267280j5C.LIZJ) != null) {
                ((HashMap) c1268090j6V.LIZIZ).remove("resolution_strategy");
            }
            C1269160j8E c1269160j8E2 = this.LLILZLL;
            if (c1269160j8E2.LJLIIIL == 1 && (c1266620j48 = c1269160j8E2.LJLIIL) != null) {
                if ((this.LLLLZ == enumC1267980j6K2 || this.LLLLZ == EnumC1267980j6K.GAME_LIVE) && (interfaceC1266360j3i = this.LLIZ) != null && !this.A.get()) {
                    interfaceC1266360j3i.LJJ();
                }
                int i3 = c1266620j48.LIZ;
                int i4 = c1266620j48.LIZIZ;
                int i5 = c1266620j48.LJFF;
                InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLIZ;
                if (interfaceC1266360j3i2 != null && !this.A.get()) {
                    int[] iArrLJ = c1271250jBb.LJ(i3, i4, 2);
                    interfaceC1266360j3i2.LJJIJIL(iArrLJ[0], iArrLJ[1], i5);
                }
            }
        }
        if (enumC1267980j6K != this.LLLLZ && (augurAdaptiveWrapper = this.c) != null) {
            augurAdaptiveWrapper.clearStrategyReport("resolution_strategy");
            this.c.clearStrategyReport("subscribe_simulcast_strategy");
        }
        this.LLLLZ = enumC1267980j6K;
        this.l.LIZIZ.LJJLI = enumC1267980j6K;
        C1268260j6m c1268260j6m = this.L;
        if (c1268260j6m != null) {
            c1268260j6m.LIZJ = enumC1267980j6K;
        }
        LLLZIL();
        LLLLZI();
        if (this.c != null && this.LLILZLL.LIZ.ttlhABSettingsConfigs.LIZIZ()) {
            this.c.updateFeature("event_type", "scene_changed");
            this.c.runStrategyGraphOnce();
        }
    }

    public final void LLJLLL(VideoFrame videoFrame) {
        if (!this.Q) {
            this.Q = true;
        }
        if (C1267520j5a.LIZ()) {
            if (this.S != videoFrame.getRotatedWidth() || this.T != videoFrame.getRotatedHeight()) {
                this.S = videoFrame.getRotatedWidth();
                this.T = videoFrame.getRotatedHeight();
            }
        }
    }

    public final void LLJZ(VideoFrame videoFrame) {
        C1266790j4P c1266790j4P = (C1266790j4P) this.l.LIZJ.getService(C1266790j4P.class);
        if (c1266790j4P != null) {
            c1266790j4P.LL.LIZIZ(videoFrame.getBuffer().getCaptureMs());
        }
    }

    public final void LLL(VideoFrame videoFrame) {
        if (this.LLLLZ == EnumC1267980j6K.GAME_LIVE && this.K != null) {
            boolean z = true;
            if (videoFrame.getBuffer().getBufferType() == 2 || videoFrame.getBuffer().getBufferType() == 1) {
                if (videoFrame.getBuffer().getBufferType() != 2) {
                    z = false;
                }
                this.K.LIZIZ(videoFrame.getTextureId(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), z, videoFrame, ((InterfaceC1271560jC6) videoFrame.getBuffer()).getTransformMatrix());
            }
        }
    }

    public final Bundle LLLFFI(String str) {
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        if (interfaceC1266410j3n == null) {
            return new Bundle();
        }
        return interfaceC1266410j3n.query(str);
    }

    public final void LLLFZ(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        C1268550j7F c1268550j7F = this.LLJJLIIIJLLLLLLLZ;
        if (c1268550j7F != null) {
            c1268550j7F.LLJILJIL(audioRecordingCallback);
        }
    }

    public final void LLLII(C1274330jGZ c1274330jGZ) {
        C1266390j3l c1266390j3l = this.LLLZLZ;
        if (c1266390j3l != null) {
            c1266390j3l.LJIILIIL(EnumC1267970j6J.TYPE_RTC);
        }
    }

    public final void LLLIIII(boolean z) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream == null) {
            return;
        }
        if (this.LLILZLL.LJ) {
            C1283100jUi.LIZIZ(this.LL, new ARunnableS112S0100000_12(this, 451));
        }
        if (z) {
            synchronized (this.LLLIL) {
                try {
                    for (InterfaceC1274500jGq interfaceC1274500jGq : this.LLLILZJ) {
                        if ((interfaceC1274500jGq instanceof C1266560j42) && (videoTrack = ((C1266560j42) interfaceC1274500jGq).LLILLL) != null) {
                            mediaEncodeStream.removeTrack(videoTrack);
                        }
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (this.LLLIL) {
            try {
                for (InterfaceC1268820j7g interfaceC1268820j7g : this.LLLILZ) {
                    if (interfaceC1268820j7g instanceof C1266600j46) {
                        ((C1266600j46) interfaceC1268820j7g).getClass();
                    }
                }
            } finally {
            }
        }
    }

    public final void LLLIIIL(JSONObject jSONObject) {
        C1269780j9E c1269780j9E = this.LLLILZLLLI;
        if (c1269780j9E != null) {
            c1269780j9E.getClass();
            try {
                InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E.LLILZIL;
                if (interfaceC1266880j4Y != null) {
                    interfaceC1266880j4Y.LIZ(jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LLLILZLLLI(Runnable runnable) {
        Handler handler;
        C1269140j8C c1269140j8C = this.l.LIZIZ;
        if (c1269140j8C.LJJJLIIL && (handler = c1269140j8C.LJJJZ) != null) {
            C786410Ut5.LJJZZIII(handler, runnable);
        } else {
            runnable.run();
        }
    }

    public final void LLLIZZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioMute(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), new Throwable());
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new RunnableC741150T5l(new ARunnableS39S0110000_20(this, z, 26), new int[]{1}));
        }
    }

    public final void LLLJ(JSONObject jSONObject) {
        boolean zLJIIJ = this.l.LIZ.mPushBase.LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBMFColorCorrectionSetting valid:");
        sbLIZ.append(zLJIIJ);
        sbLIZ.append(" setting:");
        sbLIZ.append(jSONObject);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!zLJIIJ) {
            return;
        }
        if (LLJILLL()) {
            InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
            if (interfaceC1266410j3n != null) {
                interfaceC1266410j3n.LLF(jSONObject);
                return;
            }
            return;
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O == null) {
            return;
        }
        interfaceC1268640j7O.LLIILII(jSONObject);
    }

    public final void LLLJIL(int i) {
        C1270610jAZ c1270610jAZLLJILJIL;
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture != null && (c1270610jAZLLJILJIL = liveStreamVideoCapture.LLJILJIL()) != null) {
            c1270610jAZLLJILJIL.LLJJIJIIJIL = i;
        }
    }

    public final void LLLL(TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava) {
        synchronized (this.g) {
            try {
                this.e = tTLHAbnormalDetectorJava;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LLLLII(TTLHSceneDetector tTLHSceneDetector) {
        synchronized (this.h) {
            try {
                this.f = new WeakReference<>(tTLHSceneDetector);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LLLLIIIILLL(C923980a9U c923980a9U) {
        float fFloatValue;
        this.l.LIZLLL = c923980a9U;
        float fFloatValue2 = 8.0f;
        if (this.LLZZZZ != null && c923980a9U != null) {
            C1266550j41 c1266550j41 = new C1266550j41();
            Float f = c923980a9U.LIZ;
            if (f != null) {
                c1266550j41.LIZ = f.floatValue();
            }
            Float f2 = c923980a9U.LIZIZ;
            if (f2 != null) {
                if (f2.floatValue() == -1.0f) {
                    fFloatValue = 8.0f;
                } else {
                    fFloatValue = c923980a9U.LIZIZ.floatValue();
                }
                c1266550j41.LIZIZ = fFloatValue;
            }
            C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LIZIZ, c1266550j41);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null && c923980a9U != null) {
            Float f3 = c923980a9U.LIZ;
            if (f3 != null) {
                augurAdaptiveWrapper.updateFeature("device_score", f3.floatValue());
                this.c.updateFeature("video_record_score", c923980a9U.LIZ.floatValue());
            }
            Float f4 = c923980a9U.LIZIZ;
            if (f4 != null) {
                AugurAdaptiveWrapper augurAdaptiveWrapper2 = this.c;
                if (f4.floatValue() != -1.0f) {
                    fFloatValue2 = c923980a9U.LIZIZ.floatValue();
                }
                augurAdaptiveWrapper2.updateFeature("video_record_score", fFloatValue2);
            }
        }
        this.k = c923980a9U;
    }

    public final void LLLLIIL(List<LyraxTranscoderFeature> list) {
        this.LLILZLL.LIZ.mVPassInteractCfg.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (LyraxTranscoderFeature lyraxTranscoderFeature : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("featureName", lyraxTranscoderFeature.getFeatureName());
                    jSONObject2.put("projectKey", lyraxTranscoderFeature.getProjectKey());
                    jSONObject2.put("options", lyraxTranscoderFeature.getOptions());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("features", jSONArray);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "setFeatures", jSONObject);
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS89S0200000_20(this, list, 213));
    }

    public final void LLLLIILL(C1273190jEj c1273190jEj) {
        this.a0 = c1273190jEj;
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            for (C1271310jBh c1271310jBh : ((ConcurrentHashMap) c1267560j5e.LIZ).values()) {
                EnumC1269640j90 enumC1269640j90 = c1271310jBh.LLILZLL;
                if (enumC1269640j90 == EnumC1269640j90.LOCAL_RENDER || enumC1269640j90 == EnumC1269640j90.LOCAL_RENDER_AND_REMOTE_MIX) {
                    InterfaceC1273910jFt interfaceC1273910jFt = c1267560j5e.LIZIZ;
                    if (interfaceC1273910jFt != null && interfaceC1273910jFt.LJJII()) {
                        c1271310jBh.LJI(c1273190jEj);
                    }
                }
            }
        }
    }

    public final void LLLLIILLL(InterfaceC1272020jCq interfaceC1272020jCq) {
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        if (interfaceC1266410j3n instanceof C1271980jCm) {
            C1271980jCm c1271980jCm = (C1271980jCm) interfaceC1266410j3n;
            String name = "null";
            if (c1271980jCm.LLJJIII == interfaceC1272020jCq) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setLinkmicFrameObserver no-op: already ");
                if (interfaceC1272020jCq != null) {
                    name = interfaceC1272020jCq.getClass().getName();
                }
                sbLIZ.append(name);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setLinkmicFrameObserver ");
            if (interfaceC1272020jCq != null) {
                name = interfaceC1272020jCq.getClass().getName();
            }
            sbLIZ2.append(name);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1271980jCm.LLJJIII = interfaceC1272020jCq;
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
    public final void LLLLIL(C923790a9B c923790a9B) {
        InterfaceC1268640j7O interfaceC1268640j7O;
        Float f = c923790a9B.LJIIJJI;
        if (f != null) {
            this.q = (int) (f.floatValue() * 100.0f);
        }
        this.r = Boolean.TRUE.equals(c923790a9B.LJIIL);
        if (this.LLZZZZ != null) {
            C1266450j3r c1266450j3r = new C1266450j3r();
            if (c923790a9B.LJIIIIZZ != null) {
                c1266450j3r.LJ = c923790a9B.LJIIIZ.floatValue();
            }
            c1266450j3r.LJFF = c923790a9B.LIZ;
            c1266450j3r.LJII = c923790a9B.LIZLLL;
            Float f2 = c923790a9B.LJ;
            if (f2 != null) {
                c1266450j3r.LJI = f2.floatValue();
            }
            if (this.l.LIZ.LJIIJJI) {
                c1266450j3r.LJIIIZ = this.q;
                c1266450j3r.LJIIIIZZ = this.r ? 1 : 0;
                c1266450j3r.LJIIJ = this.s;
                c1266450j3r.LJIIJJI = 0;
            }
            C1269160j8E c1269160j8E = this.LLILZLL;
            c1269160j8E.LJJL = c923790a9B.LIZ;
            c1269160j8E.LJJJZ = c923790a9B.LIZLLL;
            if (c1269160j8E.LJJII() != 3) {
                LLLLLJLJLL(c1266450j3r);
            }
            this.LLZZZZ.LIZLLL.LIZIZ(c1266450j3r);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("timestamp", System.currentTimeMillis());
            if (c923790a9B.LJIIIIZZ != null) {
                this.c.updateFeature("single_cores_cpu_speed", c923790a9B.LJIIIZ.floatValue());
            }
            this.c.updateFeature("perf_score", c923790a9B.LIZ);
            this.c.updateFeature("thermal_score", c923790a9B.LIZLLL);
            Float f3 = c923790a9B.LJ;
            if (f3 != null) {
                this.c.updateFeature("game_performance_score_host", f3.floatValue());
            }
            if (this.l.LIZ.LJIIJJI) {
                this.c.updateFeature("battery_value", this.q);
                this.c.updateFeature("is_charging", this.r ? 1 : 0);
                this.c.updateFeature("is_ecom_for_anchor", 0);
                this.c.updateFeature("device_motion_status", this.s);
            }
            if (this.LLILZLL.LJJII() == 3) {
                LJLJJI();
            }
            C1269160j8E c1269160j8E2 = this.LLILZLL;
            c1269160j8E2.LJJL = c923790a9B.LIZ;
            c1269160j8E2.LJJJZ = c923790a9B.LIZLLL;
            if (c1269160j8E2.LJJII() != 3 && (interfaceC1268640j7O = this.LLJLILLLLZIIL) != null && this.c != null) {
                Map<String, String> mapLJLZ = interfaceC1268640j7O.LJLZ();
                if (!TextUtils.isEmpty(mapLJLZ.get("face_extra_model_name"))) {
                    this.c.updateFeature("effect_face_model_name", mapLJLZ.get("face_extra_model_name"));
                } else {
                    this.c.updateFeature("effect_face_model_name", "");
                }
                if (!TextUtils.isEmpty(mapLJLZ.get("matting_model_name"))) {
                    this.c.updateFeature("effect_matting_model_name", mapLJLZ.get("matting_model_name"));
                } else {
                    this.c.updateFeature("effect_matting_model_name", "");
                }
            }
        }
    }

    public final int LLLLILI(View view) {
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (LLJJIII() && interfaceC1266360j3i != null) {
            int iLJIL = interfaceC1266360j3i.LJIL(view);
            InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLIZ;
            if (interfaceC1266360j3i2 != null) {
                interfaceC1266360j3i2.LJJIII(this.p, this.LLLZI);
            }
            if (iLJIL == LyraxErrorCode.SUCCESS.value()) {
                if (view == this.LLLZ) {
                    this.LLLZ = null;
                }
                return iLJIL;
            }
            this.LLLZ = view;
            return iLJIL;
        }
        this.LLLZ = view;
        return LyraxErrorCode.NOT_SUPPORT.value();
    }

    public final void LLLLJ(C1267580j5g c1267580j5g) {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMediaPlayerProxy mediaPlayerProxy:");
            sbLIZ.append(c1267580j5g);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            c1267560j5e.LIZJ = c1267580j5g;
        }
    }

    public final void LLLLJI(C1268510j7B c1268510j7B) {
        InterfaceC1266410j3n interfaceC1266410j3n;
        if (LLJILLL() && (interfaceC1266410j3n = this.LLJJJ) != null) {
            this.LLJJI = c1268510j7B;
            interfaceC1266410j3n.LJJLIIIJL(c1268510j7B);
        } else if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS89S0200000_20(this, c1268510j7B, 209));
        }
    }

    public final void LLLLL(InterfaceC1268200j6g interfaceC1268200j6g) {
        C1268130j6Z c1268130j6Z = this.j;
        if (c1268130j6Z != null) {
            c1268130j6Z.LJIJJLI = interfaceC1268200j6g;
            interfaceC1268200j6g.LJIIJJI(c1268130j6Z);
        }
    }

    public final void LLLLLIL(VideoSink videoSink) {
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        if (interfaceC1266410j3n != null) {
            interfaceC1266410j3n.LJJLIIIJLLLLLLLZ(videoSink);
        }
    }

    public final void LLLLLILLIL(EnumC1267980j6K enumC1267980j6K) {
        InterfaceC1266410j3n interfaceC1266410j3n;
        boolean z;
        boolean z2;
        LLJLLIL(enumC1267980j6K);
        boolean z3 = true;
        if (this.LLILZLL.LIZ.mPushBase.LJIL()) {
            EnumC1267980j6K enumC1267980j6K2 = this.LLLLZI;
            EnumC1267980j6K enumC1267980j6K3 = EnumC1267980j6K.GAME_LIVE;
            if (enumC1267980j6K2 != enumC1267980j6K3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableStreamHDWhenSceneSwitch scene:");
                sbLIZ.append(enumC1267980j6K);
                AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
                JSONObject jSONObjectLJJJJI = this.LLILZLL.LIZ.mPushBase.LJJJJI();
                if (this.LLLLZI == enumC1267980j6K3) {
                    jSONObjectLJJJJI = this.LLILZLL.LIZ.mPushBase.LJJI();
                }
                if (jSONObjectLJJJJI != null && jSONObjectLJJJJI.optBoolean("interact_disable_video_denoise", true)) {
                    if (LLJILLL()) {
                        InterfaceC1266410j3n interfaceC1266410j3n2 = this.LLJJJ;
                        if (interfaceC1266410j3n2 != null) {
                            if (enumC1267980j6K == EnumC1267980j6K.NORMAL_LIVE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC1266410j3n2.LJLJI(32, 4, z2);
                        }
                    } else {
                        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
                        if (interfaceC1268640j7O != null) {
                            if (enumC1267980j6K == EnumC1267980j6K.NORMAL_LIVE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            interfaceC1268640j7O.LJJZZI(4, z);
                        }
                    }
                }
            }
        }
        if (this.LLILZLL.LIZ.mPushBase.LJIIJJI()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enableDenoiseWhenSceneSwitch scene:");
            sbLIZ2.append(enumC1267980j6K);
            AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), null);
            JSONObject jSONObjectLJJJI = this.LLILZLL.LIZ.mPushBase.LJJJI();
            if (jSONObjectLJJJI != null && jSONObjectLJJJI.optBoolean("interact_disable_video_denoise", true)) {
                if (LLJILLL()) {
                    InterfaceC1266410j3n interfaceC1266410j3n3 = this.LLJJJ;
                    if (interfaceC1266410j3n3 != null) {
                        if (enumC1267980j6K != EnumC1267980j6K.NORMAL_LIVE) {
                            z3 = false;
                        }
                        interfaceC1266410j3n3.LJLJI(8, 4, z3);
                    }
                } else {
                    InterfaceC1268640j7O interfaceC1268640j7O2 = this.LLJLILLLLZIIL;
                    if (interfaceC1268640j7O2 != null) {
                        if (enumC1267980j6K != EnumC1267980j6K.NORMAL_LIVE) {
                            z3 = false;
                        }
                        interfaceC1268640j7O2.LLILIL(4, z3);
                    }
                }
            }
        }
        this.LLLLZ = enumC1267980j6K;
        this.l.LIZIZ.LJJLI = enumC1267980j6K;
        C1268260j6m c1268260j6m = this.L;
        if (c1268260j6m != null) {
            c1268260j6m.LIZJ = enumC1267980j6K;
        }
        if (LLJILLL() && (interfaceC1266410j3n = this.LLJJJ) != null) {
            interfaceC1266410j3n.LJJIZ(enumC1267980j6K);
        }
    }

    public final void LLLLLJLJLL(C1266450j3r c1266450j3r) {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLJLILLLLZIIL;
        if (interfaceC1268640j7O != null) {
            Map<String, String> mapLJLZ = interfaceC1268640j7O.LJLZ();
            if (!TextUtils.isEmpty(mapLJLZ.get("face_extra_model_name"))) {
                c1266450j3r.LIZJ = mapLJLZ.get("face_extra_model_name");
            } else {
                c1266450j3r.LIZJ = "";
            }
            if (!TextUtils.isEmpty(mapLJLZ.get("matting_model_name"))) {
                c1266450j3r.LIZLLL = mapLJLZ.get("matting_model_name");
            } else {
                c1266450j3r.LIZLLL = "";
            }
        }
    }

    public final void LLLLLLLLL(boolean z) {
        C1269780j9E c1269780j9E = this.LLLILZLLLI;
        if (c1269780j9E != null && c1269780j9E.LLJ.LIZIZ.LJJIJLIJ.LIZ) {
            C1266970j4h.LIZ.LIZJ = true;
        }
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (interfaceC1266360j3i != null) {
            interfaceC1266360j3i.enableCalculateAudioLoudness(false);
        }
        LL();
        if (z) {
            C1269160j8E c1269160j8E = this.LLILZLL;
            c1269160j8E.LJLJI.LJJIL.LJFF = true;
            InterfaceC1266360j3i interfaceC1266360j3i2 = c1269160j8E.LJI;
            if (interfaceC1266360j3i2 != null && interfaceC1266360j3i2.LJIIJJI()) {
                c1269160j8E.LJLJI.LJJIL.LJI = true;
            }
        }
        InterfaceC1266360j3i interfaceC1266360j3i3 = this.LLIZ;
        this.LLIZ = null;
        if (interfaceC1266360j3i3 != null) {
            boolean z2 = !z;
            interfaceC1266360j3i3.stopPush(z2);
            AVLog.iod("LiveStream-VeLivePusher", "mVeLivePusher.onDestroy() -->");
            interfaceC1266360j3i3.LJIIIZ(z2);
        }
    }

    public final void LLLLZ(boolean z) {
        C1272880jEE c1272880jEE = this.l.LIZIZ.LJJIJL;
        if (c1272880jEE != null) {
            c1272880jEE.LLJIJIL(z);
        }
    }

    public final void LLLLZIL(C1266380j3k c1266380j3k) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.LLLLZ == EnumC1267980j6K.GAME_LIVE || this.LLLLZ == EnumC1267980j6K.GAME_DUAL_DEVICE) {
            if (LLJJ() || this.LLJJIJIL != null) {
                if (this.LLZZZIL == -1) {
                    this.LLZZZIL = this.LLILZLL.LJJIJIIJI();
                }
                if (this.LLZZJLIL == -1) {
                    this.LLZZJLIL = this.LLILZLL.LJJIL(0);
                }
                if (this.LLZZLLIL == -1) {
                    this.LLZZLLIL = this.LLILZLL.LJJIJIIJIL(0);
                }
                if (this.LLILZLL.LJJIIZI() > this.LLILZLL.LJJIIJ()) {
                    z = true;
                    c1266380j3k.LJIJJLI = 1;
                } else {
                    z = false;
                    c1266380j3k.LJIJJLI = 0;
                }
                BitrateConfig bitrateConfigLLIIIZ = LLIIIZ(this.LLILZLL.LJJIII);
                if (bitrateConfigLLIIIZ != null) {
                    if (z) {
                        i3 = bitrateConfigLLIIIZ.height;
                    } else {
                        i3 = bitrateConfigLLIIIZ.width;
                    }
                    c1266380j3k.LJI = i3;
                    if (z) {
                        i4 = bitrateConfigLLIIIZ.width;
                    } else {
                        i4 = bitrateConfigLLIIIZ.height;
                    }
                    c1266380j3k.LJII = i4;
                } else {
                    c1266380j3k.LJI = 0;
                    c1266380j3k.LJII = 0;
                }
                c1266380j3k.LJIL = this.LLILZLL.LJJIL(0);
                c1266380j3k.LJJ = this.LLILZLL.LJJIJIIJIL(0);
                BitrateConfig bitrateConfigLLIIIZ2 = LLIIIZ(this.LLILZLL.LJJIIJ);
                if (bitrateConfigLLIIIZ2 != null) {
                    if (z) {
                        i = bitrateConfigLLIIIZ2.height;
                    } else {
                        i = bitrateConfigLLIIIZ2.width;
                    }
                    c1266380j3k.LJIIZILJ = i;
                    if (z) {
                        i2 = bitrateConfigLLIIIZ2.width;
                    } else {
                        i2 = bitrateConfigLLIIIZ2.height;
                    }
                    c1266380j3k.LJIJ = i2;
                } else {
                    c1266380j3k.LJIIZILJ = 0;
                    c1266380j3k.LJIJ = 0;
                }
                c1266380j3k.LJIILIIL = this.LLZZZIL;
                c1266380j3k.LJIJI = this.LLZZJLIL;
                c1266380j3k.LJIJJ = this.LLZZLLIL;
            }
        }
    }

    public final void LLLLZLLLI(Intent intent) {
        C1267670j5p c1267670j5p;
        if (LLJJ()) {
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null && (c1267670j5p = c1266420j3o.LJFF) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateScreenIntent ");
                sbLIZ.append(intent);
                AVLog.logKibana(4, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
                c1267670j5p.LLILLJJLI = intent;
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null) {
            return;
        }
        liveStreamVideoCapture.LLJJIJIIJIL = intent;
    }

    public final int LLLZ(String str) {
        C1269160j8E c1269160j8E = this.LLILZLL;
        c1269160j8E.LJIJJ = str;
        InterfaceC1266360j3i interfaceC1266360j3i = c1269160j8E.LJI;
        if (interfaceC1266360j3i != null) {
            return interfaceC1266360j3i.LJIJJLI(new C1936907iJ(str));
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLZI(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LLLZI(java.lang.String):int");
    }

    public final void LLLZL(C1267110j4v c1267110j4v) {
        C1267280j5C c1267280j5C = this.LLZZZZ;
        if (c1267280j5C != null) {
            C1267080j4s c1267080j4s = c1267280j5C.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJII, c1267110j4v);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void k3(List<String> list) {
        LLLLLL(list, true, false);
    }

    @Override // X.InterfaceC1273910jFt
    public final void setSeiCurrentShiftDiffTime(long j) {
        InterfaceC1266360j3i interfaceC1266360j3i;
        this.LLILZLL.LIZ.mPushBase.getClass();
        this.LLLLJ = j;
        if (this.LLILZLL.LJJJIL() && (interfaceC1266360j3i = this.LLIZ) != null) {
            if (this.LLLLLLJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setPusherSeiShiftDiffTime: ");
                sbLIZ.append(j);
                AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
            }
            interfaceC1266360j3i.LJIJJLI(new C1268990j7x(this.LLLLJ));
        }
    }

    public static void LLF(Thread thread, String str) {
        if (!C1268530j7D.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{status:");
        sbLIZ.append(ThreadMethodProxy.getState(thread));
        sbLIZ.append(",id:");
        sbLIZ.append(thread.getId());
        sbLIZ.append(",name:");
        sbLIZ.append(thread.getName());
        sbLIZ.append("}");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".ANR");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        AVLog.iow(strLIZIZ2, strLIZIZ);
        AVLog.w(strLIZIZ2, strLIZIZ);
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(thread)) {
                stringBuffer.append(stackTraceElement.getFileName());
                stringBuffer.append(stackTraceElement.getMethodName());
                stringBuffer.append("\n");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("    at ");
                sbLIZ3.append(stackTraceElement.getClassName());
                sbLIZ3.append(e3.d);
                sbLIZ3.append(stackTraceElement.getMethodName());
                sbLIZ3.append(e3.h);
                sbLIZ3.append(stackTraceElement.getFileName());
                sbLIZ3.append(" :");
                sbLIZ3.append(stackTraceElement.getLineNumber());
                sbLIZ3.append(")\n");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                AVLog.iow(strLIZIZ2, strLIZIZ3);
                AVLog.w(strLIZIZ2, strLIZIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ANR@");
            sbLIZ4.append(str);
            AVLog.logKibana(6, C2188811AlT.LIZIZ(sbLIZ4), stringBuffer.toString(), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LIZJ(long j, String str) {
        InterfaceC1273910jFt interfaceC1273910jFt;
        InterfaceC1269980j9Y interfaceC1269980j9YLJJJIL;
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPlayer streamID:");
            sbLIZ.append(str);
            sbLIZ.append(" offset:");
            sbLIZ.append(j);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            C1271310jBh c1271310jBh = (C1271310jBh) ((ConcurrentHashMap) c1267560j5e.LIZ).get(str);
            if (c1271310jBh != null) {
                c1271310jBh.start((int) j);
                EnumC1269640j90 enumC1269640j90 = c1271310jBh.LLILZLL;
                if ((enumC1269640j90 == EnumC1269640j90.LOCAL_RENDER || enumC1269640j90 == EnumC1269640j90.LOCAL_RENDER_AND_REMOTE_MIX) && (interfaceC1273910jFt = c1267560j5e.LIZIZ) != null && interfaceC1273910jFt.LJJII() && (interfaceC1269980j9YLJJJIL = c1267560j5e.LIZIZ.LJJJIL()) != null) {
                    c1271310jBh.LJI(interfaceC1269980j9YLJJJIL);
                }
            }
        }
    }

    @Override // X.InterfaceC1269420j8e
    public final void LJI(int i, Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoCaptureError out: code ");
        sbLIZ.append(i);
        sbLIZ.append(" mStatus:");
        sbLIZ.append(this.LLJZ.get());
        sbLIZ.append(" mWorkThreadHandler：");
        sbLIZ.append(this.LL);
        AVLog.logKibana(6, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), exc);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS26S0201000_20(exc, i, this, 15));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJ(Bundle bundle, C0UH1 c0uh1) {
        LJLJLLL(bundle, c0uh1);
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIIJ(final boolean z, boolean z2) {
        final Throwable th = new Throwable();
        this.n = z;
        this.o = true;
        C786410Ut5.LJJZZIII(this.LL, new Runnable() { // from class: X.0j3q
            public final /* synthetic */ boolean LLILLJJLI = true;

            public final void LIZ() {
                Object objValueOf;
                if (this.LLILZ.LLJJ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Call enableMirror(");
                    sbLIZ.append(z);
                    sbLIZ.append(", ");
                    sbLIZ.append(this.LLILLJJLI);
                    AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), th);
                    C1269730j99 c1269730j99 = this.LLILZ.LLJJJJJIL;
                    if (c1269730j99 == null || !this.LLILLJJLI) {
                        return;
                    }
                    c1269730j99.LJFF = z;
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Call enableMirror(");
                sbLIZ2.append(z);
                sbLIZ2.append(", ");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append("), last mirror status: ");
                LiveStreamVideoCapture liveStreamVideoCapture = this.LLILZ.LLJJIJIL;
                if (liveStreamVideoCapture != null) {
                    objValueOf = Boolean.valueOf(this.LLILLJJLI ? liveStreamVideoCapture.LLJLLIL : liveStreamVideoCapture.LLJLLL);
                } else {
                    objValueOf = "null";
                }
                sbLIZ2.append(objValueOf);
                sbLIZ2.append(". ");
                AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), th);
                LiveStreamVideoCapture liveStreamVideoCapture2 = this.LLILZ.LLJJIJIL;
                if (liveStreamVideoCapture2 != null) {
                    C786410Ut5.LJJZZIII(liveStreamVideoCapture2.LLJILJIL, new ARunnableS2S0120000_20(liveStreamVideoCapture2, this.LLILLJJLI, z, 3));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveStream@24e7.enableMirror$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveStream@24e7.enableMirror$1");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r3 != false) goto L12;
     */
    @Override // X.InterfaceC1273910jFt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(boolean r3, boolean r4) {
        /*
            r2 = this;
            if (r3 != 0) goto Le
            boolean r0 = r2.LLLLIILL
            if (r0 == 0) goto Le
            java.lang.String r1 = "LiveStream"
            java.lang.String r0 = "Can not set VideoMixerMode In BlackFrameMode,Set it to false."
            com.ss.ttlivestreamer.core.utils.AVLog.iow(r1, r0)
            r4 = 0
        Le:
            com.ss.ttlivestreamer.core.engine.MediaEncodeStream r0 = r2.LLJIJIL
            if (r0 == 0) goto L20
            if (r3 == 0) goto L23
            com.ss.ttlivestreamer.core.mixer.AudioMixer r0 = r0.getAudioMixer()
            if (r0 == 0) goto L1d
            r0.setEnable(r4)
        L1d:
            r2.LLLL = r4
            return
        L20:
            if (r3 == 0) goto L2a
            goto L1d
        L23:
            com.ss.ttlivestreamer.core.mixer.VideoMixer r0 = r0.getVideoMixer()
            r0.setEnable(r4)
        L2a:
            r2.LLLLII = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LJJIIZ(boolean, boolean):void");
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJI(String str, String str2) {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null) {
            c1267560j5e.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDataSource streamID:");
            sbLIZ.append(str);
            sbLIZ.append(" videoPath:");
            sbLIZ.append(str2);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            C1271310jBh c1271310jBh = (C1271310jBh) ((ConcurrentHashMap) c1267560j5e.LIZ).get(str);
            if (c1271310jBh != null) {
                c1271310jBh.setDataSource(str2);
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJI(EnumC775870Uc5 enumC775870Uc5, JSONObject jSONObject) {
        int value;
        String strJ3;
        JSONObject jSONObject2 = new JSONObject();
        if (enumC775870Uc5 == null) {
            value = -1;
        } else {
            try {
                value = enumC775870Uc5.getValue();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        jSONObject2.put("state", value);
        if (jSONObject == null) {
            strJ3 = "null";
        } else {
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        jSONObject2.put("reason", strJ3);
        AVLog.logApiCall("LiveCoreAPI", "runAdaptiveStrategyWithModeAndReason", jSONObject2);
        if (enumC775870Uc5 != null && jSONObject != null) {
            LLLILZLLLI(new ARunnableS89S0200000_20(this, enumC775870Uc5, jSONObject, 211));
        }
    }

    @Override // X.InterfaceC1268590j7J
    public final void LJJJJLI(int i, Exception exc) {
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS26S0201000_20(exc, i, this, 16));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJJIZ(Bundle bundle, C1152850g6d c1152850g6d) {
        if (LLJILLL()) {
            bundle.putInt("width", this.LLILZLL.LJJIL(0));
            bundle.putInt("height", this.LLILZLL.LJJIJIIJIL(0));
            this.LLJJJ.LJLJLLL(bundle, c1152850g6d);
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture != null && liveStreamVideoCapture.LLJJIII == 1) {
            if (this.LLJLILLLLZIIL instanceof C1272090jCx) {
                bundle.putInt("width", this.LLILZLL.LJJIL(0));
                bundle.putInt("height", this.LLILZLL.LJJIJIIJIL(0));
                C1272090jCx c1272090jCx = (C1272090jCx) this.LLJLILLLLZIIL;
                C786410Ut5.LJJZZIII(c1272090jCx.LLILZLL, new ARunnableS53S0300000_20(bundle, c1152850g6d, c1272090jCx, 35));
                return;
            }
            c1152850g6d.onError(-2, "FilterManager is not ready.");
            return;
        }
        c1152850g6d.onError(-2, "Maybe VideoCapture not started.");
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJLLLLLLLZ(String str, EnumC1269700j96 enumC1269700j96) {
        this.LLLZI = enumC1269700j96;
        InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
        if (interfaceC1266410j3n != null) {
            interfaceC1266410j3n.LJIJJ(enumC1269700j96);
        }
        InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
        if (interfaceC1266360j3i != null) {
            interfaceC1266360j3i.LJJIII(this.p, this.LLLZI);
        }
    }

    public final void LJL(int i, String str) {
        VideoTrack videoTrack;
        if (this.LLILZLL.LJJJIL() || this.LL == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS4S1101000_20(i, str, this, 9));
            return;
        }
        C1266720j4I c1266720j4I = this.LLLLLLLLL;
        synchronized (c1266720j4I) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = c1266720j4I.LJ.get(str);
                if (i <= 0) {
                    if (num != null) {
                        c1266720j4I.LJ.remove(str);
                    }
                } else if (num == null || num.intValue() != i) {
                    c1266720j4I.LJ.put(str, Integer.valueOf(i));
                }
            }
        }
        MediaEncodeStream mediaEncodeStream = this.LLJIJIL;
        if (mediaEncodeStream != null && (videoTrack = this.LLJILJILJ) != null && mediaEncodeStream.containTrack(videoTrack)) {
            TEBundle tEBundle = new TEBundle();
            TEBundle tEBundle2 = new TEBundle();
            int iLIZLLL = this.LLLLLLLLL.LIZLLL();
            this.LLILZLL.LIZ.mPushBase.getClass();
            tEBundle2.setString("trackId", this.LLJILJILJ.id());
            tEBundle2.setInt("video_fps", iLIZLLL);
            tEBundle2.setBool("video_adapter_enable_smooth", false);
            tEBundle.setBundle("video_fps_param_for_encode", tEBundle2);
            this.LLJIJIL.setParameter(tEBundle);
        }
    }

    public final void LJLJI(int i, int i2) {
        if (this.LLLZZIL > 0 && this.LLZ > 0 && this.LLZIL > 0) {
            if (LLJJ()) {
                if (this.LLLZZIL == this.LLZILL && this.LLZ == this.LLZL && this.LLZIL == this.LLZLI) {
                    return;
                }
                InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
                if (interfaceC1266360j3i != null && !this.A.get()) {
                    interfaceC1266360j3i.LJJIJIL(this.LLLZZIL, this.LLZ, this.LLZIL);
                }
                this.LLZILL = this.LLLZZIL;
                this.LLZL = this.LLZ;
                this.LLZLI = this.LLZIL;
                this.LLLZZIL = 0;
                this.LLZ = 0;
                this.LLZIL = 0;
                return;
            }
            if (i > 0 && i2 > 0 && this.LLLZZIL == i && this.LLZ == i2) {
                InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLIZ;
                if (interfaceC1266360j3i2 != null && !this.A.get()) {
                    interfaceC1266360j3i2.LJJIJIL(this.LLLZZIL, this.LLZ, this.LLZIL);
                }
                this.LLLZZIL = 0;
                this.LLZ = 0;
                this.LLZIL = 0;
            }
        }
    }

    public final void LJLJLLL(Bundle bundle, InterfaceC1267390j5N interfaceC1267390j5N) {
        int i;
        InterfaceC1268640j7O interfaceC1268640j7O;
        int i2;
        if (bundle != null) {
            i = bundle.getInt("mode", -1);
            if (i >= 0) {
                if (!LLJILLL()) {
                    LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
                    if (liveStreamVideoCapture != null && liveStreamVideoCapture.LLJJIII == 1) {
                        if (this.LLJJ != null && (interfaceC1268640j7O = this.LLJLILLLLZIIL) != null && (interfaceC1268640j7O instanceof C1272090jCx)) {
                            int[] iArr = new int[2];
                            if (LJJLI(iArr) && (i2 = iArr[0]) > 0 && iArr[1] > 0) {
                                bundle.putInt("width", i2);
                                bundle.putInt("height", iArr[1]);
                                bundle.putInt("fps", this.LLILZLL.LJJIJIIJI());
                                C1272090jCx c1272090jCx = (C1272090jCx) this.LLJLILLLLZIIL;
                                MediaEngineFactory mediaEngineFactory = this.LLJJ;
                                c1272090jCx.getClass();
                                C786410Ut5.LJJZZIII(c1272090jCx.LLILZLL, new ARunnableS28S0400000_20(interfaceC1267390j5N, new WeakReference(mediaEngineFactory), bundle, c1272090jCx, 9));
                                return;
                            }
                            if (interfaceC1267390j5N == null) {
                                return;
                            }
                            interfaceC1267390j5N.onError(-2, "getAdaptedVideoResolution fail.");
                            return;
                        }
                        if (interfaceC1267390j5N == null) {
                            return;
                        }
                        interfaceC1267390j5N.onError(-2, "FilterManager is not ready.");
                        return;
                    }
                    if (interfaceC1267390j5N == null) {
                        return;
                    }
                    interfaceC1267390j5N.onError(-2, "Maybe VideoCapture not started.");
                    return;
                }
                return;
            }
        } else {
            i = -2;
        }
        if (interfaceC1267390j5N != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("param error: mode ");
            sbLIZ.append(i);
            sbLIZ.append(", param ");
            sbLIZ.append(bundle);
            interfaceC1267390j5N.onError(-1, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final String LLIIIL(int i, int i2) {
        C1269160j8E c1269160j8E;
        BitrateConfig next;
        if (i > 0 && i2 > 0 && (c1269160j8E = this.LLILZLL) != null) {
            List<BitrateConfig> list = c1269160j8E.LJJLL;
            if (list != null && !list.isEmpty()) {
                Iterator<BitrateConfig> it2 = list.iterator();
                while (it2.hasNext() && (next = it2.next()) != null && next.LIZ != null) {
                    if (Math.max(next.width, next.height) == Math.max(i, i2)) {
                        return next.LIZ.getSdkKey();
                    }
                }
                return null;
            }
            AVLog.logKibana(6, "LiveStream", "getGameSdkKeyByResolution. list is null", null);
            try {
                JSONObject jSONObject = new JSONObject(new HashMap(2));
                jSONObject.put("target_width", i);
                jSONObject.put("target_height", i2);
                jSONObject.put("room_id", this.LLILZLL.LJJJJZ);
                InterfaceC1266960j4g interfaceC1266960j4g = this.LLJI;
                if (interfaceC1266960j4g != null) {
                    interfaceC1266960j4g.LIZ("ttlh_game_adaptive_error_case", jSONObject);
                    return null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final void LLILZ(C1277690jLz c1277690jLz, boolean z) {
        InterfaceC1266360j3i c1277540jLk;
        List<LyraxTranscoderFeature> listLIZ;
        if (this.A.get()) {
            return;
        }
        if (this.LLIZ == null) {
            if (this.LLILZLL.LJJIZ()) {
                try {
                    Handler handler = this.LLILZLL.LJJIL;
                    if (handler != null) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (C786410Ut5.LJJZZIII(handler, new ARunnableS103S0100000_3(countDownLatch, 141))) {
                            try {
                                int i = this.LLILZLL.LJJIJLIJ;
                                if (i > 0) {
                                    countDownLatch.await(i, TimeUnit.MILLISECONDS);
                                } else {
                                    countDownLatch.await();
                                }
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            C1269160j8E c1269160j8E = this.LLILZLL;
            C1266840j4U c1266840j4U = this.H;
            if (c1269160j8E == null) {
                c1277540jLk = null;
            } else {
                try {
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (c1269160j8E.LIZ.LJIILIIL()) {
                    c1277540jLk = new C1277530jLj(c1269160j8E);
                    if (c1277690jLz != null) {
                        c1277540jLk.LJIIJ(c1277690jLz, false);
                    }
                } else {
                    c1277540jLk = new C1277540jLk(c1269160j8E, c1266840j4U);
                }
            }
            c1277540jLk.LJJIIJZLJL(this.P);
            c1277540jLk.LJIIL(this.l);
            c1277540jLk.LJJII(this.LLJ);
            c1277540jLk.LJIIJ(c1277690jLz, z);
            if (this.LLLLZ != EnumC1267980j6K.GAME_LIVE) {
                c1277540jLk.enableCalculateAudioLoudness(true);
            }
            if (GLThreadManager.isDynamicGLVersionEnable()) {
                AbstractC1277570jLn.setEGLVersion(GLThreadManager.getConfigGLVersion());
            } else {
                AbstractC1277570jLn.setEGLVersion(3);
            }
            AbstractC1277570jLn.setEGLContext(GLThreadManager.getEGLContext());
            AbstractC1277570jLn.setLogLevel(EnumC1280060jPo.Warn);
            c1277540jLk.LJIILIIL(this.f149O);
            this.LLILZLL.LJI = c1277540jLk;
            this.LLIZ = c1277540jLk;
            LJLJJL();
            LLLIIIIL();
            C1266700j4G c1266700j4G = this.LLIZLLLIL;
            if (c1266700j4G != null && (listLIZ = c1266700j4G.LIZ()) != null && !listLIZ.isEmpty()) {
                c1277540jLk.LJJIJL(listLIZ);
            }
        }
        if (this.A.get()) {
            InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
            if (interfaceC1266360j3i != null) {
                interfaceC1266360j3i.LJIIIZ(true);
            }
            this.LLIZ = null;
        }
        int iLJIJI = this.l.LIZ.ttlhABSettingsConfigs.LJIJI();
        if (iLJIJI > 0) {
            if (this.L == null) {
                C1268260j6m c1268260j6m = new C1268260j6m();
                this.L = c1268260j6m;
                c1268260j6m.LIZIZ = this.LLZZZZ;
                c1268260j6m.LIZJ = this.LLLLZ;
                this.L.LIZLLL = iLJIJI;
            }
            InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLIZ;
            if (interfaceC1266360j3i2 != null) {
                interfaceC1266360j3i2.setVideoStrategyRunner(this.L);
            }
        }
    }

    public final void LLJZIJLIL(VideoFrame videoFrame, boolean z) {
        if (videoFrame == null) {
            return;
        }
        long captureServerNtpMs = videoFrame.getBuffer().getCaptureServerNtpMs();
        if (captureServerNtpMs > 0) {
            this.i = captureServerNtpMs;
        }
        C1269850j9L c1269850j9L = this.f148J;
        if (c1269850j9L != null && this.l.LIZ.captureBase.videoCapture.LIZ == 3) {
            c1269850j9L.LIZJ(EnumC1269840j9K.DURATION_TYPE_PRE_ENCODE, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        }
        if (z && !this.R) {
            this.R = true;
            AVLog.logKibana(6, "LiveStream", "push first video frame to rtc", null);
        }
    }

    public final boolean LLLFF(VideoFrame videoFrame, String str) {
        LyraxErrorCode lyraxErrorCodePushExternalFrameToNative;
        boolean z;
        if (LLJJIII()) {
            InterfaceC1266410j3n interfaceC1266410j3n = this.LLJJJ;
            if (interfaceC1266410j3n instanceof C1271980jCm) {
                C1271980jCm c1271980jCm = (C1271980jCm) interfaceC1266410j3n;
                c1271980jCm.getClass();
                if (videoFrame.getBuffer() == null) {
                    lyraxErrorCodePushExternalFrameToNative = LyraxErrorCode.INVALID_PARAMS;
                } else {
                    LyraxVideoFrame lyraxVideoFrameLLJ = c1271980jCm.LLJ(videoFrame);
                    int i = 6;
                    if (lyraxVideoFrameLLJ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pushExternalVideoFrameToNative build failed overload=");
                        sbLIZ.append(str);
                        sbLIZ.append(", buffer=");
                        sbLIZ.append(videoFrame.getBuffer().getClass().getName());
                        c1271980jCm.LLJJ(6, C2188811AlT.LIZIZ(sbLIZ), true);
                        lyraxErrorCodePushExternalFrameToNative = LyraxErrorCode.FAILURE;
                    } else {
                        try {
                            lyraxErrorCodePushExternalFrameToNative = c1271980jCm.pushExternalFrameToNative(lyraxVideoFrameLLJ);
                            if (lyraxErrorCodePushExternalFrameToNative != LyraxErrorCode.SUCCESS && lyraxErrorCodePushExternalFrameToNative != LyraxErrorCode.TIMESTAMP_ERROR) {
                                z = false;
                            } else {
                                z = true;
                            }
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            int iValue = lyraxErrorCodePushExternalFrameToNative.value();
                            long j = c1271980jCm.LLJILLL;
                            if (j == 0 || iValue != c1271980jCm.LLJJ || jElapsedRealtime - j >= 60000) {
                                c1271980jCm.LLJILLL = jElapsedRealtime;
                                c1271980jCm.LLJJ = iValue;
                                if (z) {
                                    i = 4;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("pushVideoFrame stage5 cxx vdm external source device_push overload:");
                                sbLIZ2.append(str);
                                sbLIZ2.append(" result:");
                                sbLIZ2.append(lyraxErrorCodePushExternalFrameToNative.value());
                                sbLIZ2.append(" frame=");
                                sbLIZ2.append(videoFrame.getRotatedWidth());
                                sbLIZ2.append("x");
                                sbLIZ2.append(videoFrame.getRotatedHeight());
                                AVLog.logKibana(i, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
                            }
                            lyraxVideoFrameLLJ.release();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            lyraxVideoFrameLLJ.release();
                            throw th;
                        }
                    }
                }
                if (lyraxErrorCodePushExternalFrameToNative != LyraxErrorCode.SUCCESS && lyraxErrorCodePushExternalFrameToNative != LyraxErrorCode.TIMESTAMP_ERROR) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LLLJL(int i, int i2) {
        C1270610jAZ c1270610jAZLLJILJIL;
        Handler handler;
        if (LLJJ()) {
            C1270620jAa c1270620jAa = this.LLJJJIL.LJI;
            if (c1270620jAa != null && (handler = c1270620jAa.LLILZ) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS7S0102000_20(i, c1270620jAa, i2, 10));
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null || (c1270610jAZLLJILJIL = liveStreamVideoCapture.LLJILJIL()) == null) {
            return;
        }
        c1270610jAZLLJILJIL.LLJL(i, i2);
    }

    public final void LLLLLLIL(final String str, final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call ttlh start url->");
        sbLIZ.append(z);
        sbLIZ.append(";");
        sbLIZ.append(str);
        AVLog.logKibana(4, "LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("rtmpURL", str);
            jSONObject.put("params", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "setPushUrl", jSONObject);
        AVLog.logApiCall("LiveCoreAPI", "startLivePush", null);
        int i = this.LLILZLL.LJJJJL;
        if (C1267370j5L.LIZ(i)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sandbox rtc shutdown ");
            sbLIZ2.append(i);
            LLLIIL(4, i, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
            return;
        }
        if (z && LJLJLJ()) {
            return;
        }
        if (this.LLJZ.get() != 7 && !this.A.get()) {
            this.LLLFF = str;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Try to start live stream with ");
            sbLIZ3.append(str);
            AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ3));
            C786410Ut5.LJJZZIII(this.LL, new Runnable() { // from class: X.0j3m
                public final /* synthetic */ boolean LLILLL = false;

                public final void LIZ() {
                    C1269910j9R c1269910j9RLJIJJ;
                    if (this.LLILZ.A.get()) {
                        return;
                    }
                    C1266530j3z.LIZ.onEvent(EnumC1269710j97.START);
                    this.LLILZ.LJZI(str, null, z, this.LLILLL);
                    C1266350j3h c1266350j3h = this.LLILZ;
                    C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
                    if (c1269160j8E != null && (c1269910j9RLJIJJ = c1269160j8E.LJIJJ()) != null) {
                        c1269910j9RLJIJJ.LIZ(c1266350j3h.LLLIZZ);
                    }
                    this.LLILZ.LLLILZLLLI.LIZLLL();
                    this.LLILZ.LLLILZLLLI.LJ();
                    this.LLILZ.LLLZIIL = !z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStream@24e7.start$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStream@24e7.start$1");
                }
            });
            return;
        }
        AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_END");
    }

    public final void LLLLLLL(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLJZ.get());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "stopLivePush", jSONObject);
        if (this.LLJZ.get() != 7) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS5S1110000_20(this, str, z, 9));
        }
    }

    public final void LLLLLLLZIL(String str, String str2) {
        if (!LLJJIII() || !(this.LLJJJ instanceof C1271980jCm) || str.equals(this.LLJJJJLIIL)) {
            return;
        }
        LyraxErrorCode lyraxErrorCodeLLJJI = ((C1271980jCm) this.LLJJJ).LLJJI(4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pushVideoFrame stage5 cxx vdm external source overload:");
        sbLIZ.append(str);
        sbLIZ.append(" result:");
        sbLIZ.append(lyraxErrorCodeLLJJI.value());
        sbLIZ.append(" androidFallback:LiveStream");
        AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pushVideoFrame stage5 cxx vdm external source overload:");
        sbLIZ2.append(str);
        sbLIZ2.append(" result:");
        sbLIZ2.append(lyraxErrorCodeLLJJI.value());
        sbLIZ2.append(" androidFallback:");
        sbLIZ2.append(str2);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), null);
        if (lyraxErrorCodeLLJJI == LyraxErrorCode.SUCCESS) {
            this.LLJJJJLIIL = str;
        }
    }

    public final int LLLZZ(float f, C1271210jBX c1271210jBX) {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = LJIJJLI();
        if (interfaceC1268690j7TLJIJJLI != null) {
            return interfaceC1268690j7TLJIJJLI.LJJZZIII(f, c1271210jBX);
        }
        return -1;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIIIIZZ(String str, String str2, int i) {
        this.LLLLJI.put(str, new C1266760j4M(str, str2, i));
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS1S2101000_20(this, str, str2, i, 3));
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIIJ(int i, int i2, int i3) {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        C0UHL c0uhl = this.LLJJIJI;
        if (c0uhl != null) {
            try {
                c0uhl.LIZLLL(i, i2, i3);
            } finally {
                if (zLIZ) {
                }
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLJLI(InterfaceC1272460jDY interfaceC1272460jDY, int i, Cert cert) {
        C1267670j5p c1267670j5p;
        if (LLJJ()) {
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null && (c1267670j5p = c1266420j3o.LJFF) != null) {
                if (c1267670j5p.LLIZ == null) {
                    c1267670j5p.LIZIZ();
                }
                C1270280jA2 c1270280jA2 = c1267670j5p.LLJ;
                if (c1270280jA2 != null) {
                    c1270280jA2.LJFF = c1267670j5p.LLIZ;
                    Handler handler = c1270280jA2.LJI;
                    if (handler != null) {
                        C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(interfaceC1272460jDY, c1270280jA2, cert, 69));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture == null) {
            return;
        }
        C786410Ut5.LJJZZIII(liveStreamVideoCapture.LLJILJIL, new ARunnableS13S0301000_20(i, interfaceC1272460jDY, cert, liveStreamVideoCapture, 8));
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJZZIII(String str, EnumC1269640j90 enumC1269640j90, C947150akr c947150akr) {
        C1267560j5e c1267560j5e = this.t;
        if (c1267560j5e != null && !((ConcurrentHashMap) c1267560j5e.LIZ).containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createMediaPlayer streamID:");
            sbLIZ.append(str);
            AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
            InterfaceC1266890j4Z interfaceC1266890j4Z = c1267560j5e.LIZJ;
            if (interfaceC1266890j4Z != null) {
                C1484780ok0 c1484780ok0LIZ = interfaceC1266890j4Z.LIZ();
                ((ConcurrentHashMap) c1267560j5e.LIZ).put(str, new C1271310jBh(c1484780ok0LIZ, str, c1267560j5e.LIZIZ, enumC1269640j90, c947150akr));
            }
        }
    }

    public final void LJLI(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Encode Params changed(changeAdaptedResolution): Change to:(");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append(",");
        sbLIZ.append(i3);
        sbLIZ.append(")");
        AVLog.iod("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LL;
        ARunnableS1S0103000_20 aRunnableS1S0103000_20 = new ARunnableS1S0103000_20(this, i, i2, i3, 2);
        if (handler != null) {
            if (handler.getLooper().getThread() == C786410Ut5.u3()) {
                aRunnableS1S0103000_20.run();
            } else {
                C786410Ut5.LJJZZIII(handler, aRunnableS1S0103000_20);
            }
        }
    }

    public final JSONObject LJLJJLL(C1268070j6T c1268070j6T, String str, int i) {
        JSONObject jSONObject;
        Map<String, Object> map = c1268070j6T.adaptiveResultMap;
        JSONObject jSONObject2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = null;
                }
                JSONObject jSONObject3 = new JSONObject(map);
                if (jSONObject != null) {
                    try {
                        C190800oM.LIZIZ(jSONObject3, jSONObject);
                    } catch (Exception e) {
                        e = e;
                        jSONObject2 = jSONObject3;
                        TryCatchGuardChecker.doCheck(e);
                        return jSONObject2;
                    }
                }
                jSONObject3.put("execute", i);
                this.LLJI.LIZ("ttlh_adaptive_rule_execute", jSONObject3);
                return jSONObject3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return jSONObject2;
    }

    public final JSONObject LJLJL(AugurEffectStrategyCommand augurEffectStrategyCommand, String str, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = augurEffectStrategyCommand.adaptiveResultJSONObject;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C190800oM.LIZIZ(jSONObject2, jSONObject);
                }
                jSONObject2.put("execute", i);
                this.LLJI.LIZ("ttlh_adaptive_rule_execute", jSONObject2);
                return jSONObject2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject2;
    }

    public final void LJLL(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
        Handler handler;
        InterfaceC1266680j4E interfaceC1266680j4ELIZIZ;
        if (interfaceC1270140j9o != null && bundle.getInt("mode", -1) == 2) {
            if (LLJJ()) {
                C1266420j3o c1266420j3o = this.LLJJJIL;
                if (c1266420j3o != null && (interfaceC1266680j4ELIZIZ = c1266420j3o.LIZIZ()) != null) {
                    interfaceC1266680j4ELIZIZ.LJ(bundle, c777170UeB, interfaceC1270140j9o);
                    return;
                }
                return;
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
            if (liveStreamVideoCapture == null || bundle.getInt("mode", -1) != 2 || (handler = liveStreamVideoCapture.LLJILJIL) == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(bundle, c777170UeB, interfaceC1270140j9o, liveStreamVideoCapture, 3));
        }
    }

    public final void LLJJL(int i, int i2, int i3) {
        boolean z = true;
        if (!C1271270jBd.LIZ.LIZ.LIZLLL ? i < 1080 ? i < 720 || i2 > 480 : i2 > 576 : i < 1920 ? i < 1280 || i2 > 864 : i2 > 1024) {
            z = false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLLLLZZ < 300000) {
            z = false;
        }
        C0UHL c0uhl = this.LLJJIJI;
        if (c0uhl != null && z) {
            this.LLLLLLZZ = jCurrentTimeMillis;
            c0uhl.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, i3, 0);
        }
    }

    public final void LLLIIL(int i, int i2, Exception exc) {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        InterfaceC775290Ub9 interfaceC775290Ub9 = this.LLJJIII;
        if (interfaceC775290Ub9 != null) {
            try {
                interfaceC775290Ub9.V3(i, i2, exc);
            } finally {
                if (zLIZ) {
                }
            }
        }
    }

    public final void LLLIILIL(int i, int i2, String str) {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        C0UHL c0uhl = this.LLJJIJI;
        if (c0uhl != null) {
            try {
                c0uhl.onInfo(i, i2, str);
            } finally {
                if (zLIZ) {
                }
            }
        }
    }

    public final void LLLLLL(List<String> list, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call ttlh start urls->");
        sbLIZ.append(z);
        sbLIZ.append(";");
        sbLIZ.append(list);
        AVLog.logKibana(4, "LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append((String) ListProtector.get(list, i2));
                if (i2 < list.size() - 1) {
                    sb.append(", ");
                }
            }
            jSONObject2.put("URLs", sb.toString());
            jSONObject.put("params", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("LiveCoreAPI", "setPushUrl", jSONObject);
        AVLog.logApiCall("LiveCoreAPI", "startLivePush", null);
        int i3 = this.LLILZLL.LJJJJL;
        if (C1267370j5L.LIZ(i3)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sandbox rtc shutdown ");
            sbLIZ2.append(i3);
            LLLIIL(4, i3, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
            return;
        }
        if ((!z || !LJLJLJ()) && this.LLJZ.get() != 7 && !this.A.get()) {
            this.LLLFFI = list;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Try to start live stream with ");
            sbLIZ3.append(list);
            AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ3));
            while (i < this.LLLFFI.size()) {
                if (((String) ListProtector.get(this.LLLFFI, i)).isEmpty()) {
                    ListProtector.remove(this.LLLFFI, i);
                } else {
                    i++;
                }
            }
            if (this.LLLFFI.isEmpty()) {
                return;
            }
            RunnableC1266370j3j runnableC1266370j3j = this.z;
            if (runnableC1266370j3j != null) {
                this.LL.removeCallbacks(runnableC1266370j3j);
                RunnableC1266370j3j runnableC1266370j3j2 = this.z;
                runnableC1266370j3j2.LL = list;
                runnableC1266370j3j2.LLILLJJLI = Boolean.valueOf(z);
                RunnableC1266370j3j runnableC1266370j3j3 = this.z;
                runnableC1266370j3j3.LLILLL = Boolean.FALSE;
                runnableC1266370j3j3.LLILZ = Boolean.valueOf(z2);
            } else {
                this.z = new RunnableC1266370j3j(this, list, z, false, z2);
            }
            C786410Ut5.LJJZZIII(this.LL, this.z);
        }
    }

    public final void LLLZLZ(int i, int i2, String str) throws Exception {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            if (this.LLZZZZ != null) {
                C1266380j3k c1266380j3k = new C1266380j3k();
                c1266380j3k.LIZ = this.LLILZLL.LJJIIZI();
                c1266380j3k.LIZIZ = this.LLILZLL.LJJIIJ();
                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = LJIJJLI();
                if (interfaceC1268690j7TLJIJJLI != null) {
                    c1266380j3k.LJIIL = interfaceC1268690j7TLJIJJLI.LLILL();
                } else {
                    c1266380j3k.LJIIL = 0.0f;
                }
                C1269140j8C c1269140j8C = this.LLILZLL.LJLJI;
                int i9 = c1269140j8C.LJIILL;
                int i10 = c1269140j8C.LJIILLIIL;
                C1271250jBb c1271250jBb = C1271270jBd.LIZ;
                c1266380j3k.LJ = c1271250jBb.LIZ.LJ(i9, i10, 1);
                C1269140j8C c1269140j8C2 = this.LLILZLL.LJLJI;
                int i11 = c1269140j8C2.LJIILL;
                int i12 = c1269140j8C2.LJIILLIIL;
                C1271260jBc c1271260jBc = c1271250jBb.LIZ;
                if (i12 > 0) {
                    if (c1271260jBc.LJFF(1) && (i11 * 1.0f) / i12 >= c1271260jBc.LIZLLL() && (i8 = c1271260jBc.LJJI) > 0) {
                        i12 = (((i12 + i8) - 1) / i8) * i8;
                    }
                } else {
                    c1271260jBc.getClass();
                }
                c1266380j3k.LJFF = i12;
                C1269140j8C c1269140j8C3 = this.LLILZLL.LJLJI;
                c1266380j3k.LJI = c1271250jBb.LIZ.LJ(c1269140j8C3.LJJJJJ, c1269140j8C3.LJJJJJL, 1);
                C1269140j8C c1269140j8C4 = this.LLILZLL.LJLJI;
                int i13 = c1269140j8C4.LJJJJJ;
                int i14 = c1269140j8C4.LJJJJJL;
                C1271260jBc c1271260jBc2 = c1271250jBb.LIZ;
                if (i14 > 0) {
                    if (c1271260jBc2.LJFF(1) && (i13 * 1.0f) / i14 >= c1271260jBc2.LIZLLL() && (i7 = c1271260jBc2.LJJI) > 0) {
                        i14 = (((i14 + i7) - 1) / i7) * i7;
                    }
                } else {
                    c1271260jBc2.getClass();
                }
                c1266380j3k.LJII = i14;
                C1269140j8C c1269140j8C5 = this.LLILZLL.LJLJI;
                c1266380j3k.LJIIIIZZ = c1269140j8C5.LJJJIL;
                c1266380j3k.LJIIIZ = c1269140j8C5.LJJJJ;
                c1266380j3k.LJIIJ = c1271250jBb.LIZ.LJ(c1269140j8C5.LJJJJI, c1269140j8C5.LJJJJIZL, 1);
                C1269140j8C c1269140j8C6 = this.LLILZLL.LJLJI;
                int i15 = c1269140j8C6.LJJJJI;
                int i16 = c1269140j8C6.LJJJJIZL;
                C1271260jBc c1271260jBc3 = c1271250jBb.LIZ;
                if (i16 > 0) {
                    if (c1271260jBc3.LJFF(1) && (i15 * 1.0f) / i16 >= c1271260jBc3.LIZLLL() && (i6 = c1271260jBc3.LJJI) > 0) {
                        i16 = (((i16 + i6) - 1) / i6) * i6;
                    }
                } else {
                    c1271260jBc3.getClass();
                }
                c1266380j3k.LJIIJJI = i16;
                c1266380j3k.LJIILL = this.LLILZLL.LJJIJIIJI();
                if (LLJJ()) {
                    c1266380j3k.LIZJ = this.LLILZLL.LJIILJJIL(1);
                    c1266380j3k.LIZLLL = this.LLILZLL.LJIILIIL(1);
                    c1266380j3k.LJIILIIL = this.LLILZLL.LJFF();
                } else {
                    LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
                    if (liveStreamVideoCapture != null) {
                        int[] iArrLIZIZ = c1271250jBb.LIZIZ(liveStreamVideoCapture.LLLIILIL, liveStreamVideoCapture.LLLIL);
                        c1266380j3k.LIZJ = iArrLIZIZ[0];
                        c1266380j3k.LIZLLL = iArrLIZIZ[1];
                        c1266380j3k.LJIILIIL = this.LLJJIJIL.LLLII;
                    } else {
                        c1266380j3k.LIZJ = 0;
                        c1266380j3k.LIZLLL = 0;
                        c1266380j3k.LJIILIIL = 0;
                    }
                }
                if (i > -1 && i2 > -1) {
                    c1266380j3k.LIZJ = i;
                    c1266380j3k.LIZLLL = i2;
                }
                if (!TextUtils.isEmpty(str)) {
                    c1266380j3k.LJIILLIIL = str;
                }
                LLLLZIL(c1266380j3k);
                C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
                c1267080j4s.LIZ(c1267080j4s.LJ, c1266380j3k);
            }
            AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
            if (augurAdaptiveWrapper != null) {
                augurAdaptiveWrapper.updateFeature("camera_capture_width", this.LLILZLL.LJJIIZI());
                this.c.updateFeature("camera_capture_height", this.LLILZLL.LJJIIJ());
                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI2 = LJIJJLI();
                if (interfaceC1268690j7TLJIJJLI2 == null) {
                    this.c.updateFeature("in_cap_fps", 0);
                } else {
                    this.c.updateFeature("in_cap_fps", interfaceC1268690j7TLJIJJLI2.LLILL());
                }
                AugurAdaptiveWrapper augurAdaptiveWrapper2 = this.c;
                C1269140j8C c1269140j8C7 = this.LLILZLL.LJLJI;
                int i17 = c1269140j8C7.LJIILL;
                int i18 = c1269140j8C7.LJIILLIIL;
                C1271250jBb c1271250jBb2 = C1271270jBd.LIZ;
                augurAdaptiveWrapper2.updateFeature("encode_width", c1271250jBb2.LIZ.LJ(i17, i18, 1));
                AugurAdaptiveWrapper augurAdaptiveWrapper3 = this.c;
                C1269140j8C c1269140j8C8 = this.LLILZLL.LJLJI;
                int i19 = c1269140j8C8.LJIILL;
                int i20 = c1269140j8C8.LJIILLIIL;
                C1271260jBc c1271260jBc4 = c1271250jBb2.LIZ;
                if (i20 > 0) {
                    if (c1271260jBc4.LJFF(1) && (i19 * 1.0f) / i20 >= c1271260jBc4.LIZLLL() && (i5 = c1271260jBc4.LJJI) > 0) {
                        i20 = (((i20 + i5) - 1) / i5) * i5;
                    }
                } else {
                    c1271260jBc4.getClass();
                }
                augurAdaptiveWrapper3.updateFeature("encode_height", i20);
                AugurAdaptiveWrapper augurAdaptiveWrapper4 = this.c;
                C1269140j8C c1269140j8C9 = this.LLILZLL.LJLJI;
                augurAdaptiveWrapper4.updateFeature("initial_encode_width", c1271250jBb2.LIZ.LJ(c1269140j8C9.LJJJJJ, c1269140j8C9.LJJJJJL, 1));
                AugurAdaptiveWrapper augurAdaptiveWrapper5 = this.c;
                C1269140j8C c1269140j8C10 = this.LLILZLL.LJLJI;
                int i21 = c1269140j8C10.LJJJJJ;
                int i22 = c1269140j8C10.LJJJJJL;
                C1271260jBc c1271260jBc5 = c1271250jBb2.LIZ;
                if (i22 > 0) {
                    if (c1271260jBc5.LJFF(1) && (i21 * 1.0f) / i22 >= c1271260jBc5.LIZLLL() && (i4 = c1271260jBc5.LJJI) > 0) {
                        i22 = (((i22 + i4) - 1) / i4) * i4;
                    }
                } else {
                    c1271260jBc5.getClass();
                }
                augurAdaptiveWrapper5.updateFeature("initial_encode_height", i22);
                this.c.updateFeature("initial_camera_width", this.LLILZLL.LJLJI.LJJJIL);
                this.c.updateFeature("initial_camera_height", this.LLILZLL.LJLJI.LJJJJ);
                AugurAdaptiveWrapper augurAdaptiveWrapper6 = this.c;
                C1269140j8C c1269140j8C11 = this.LLILZLL.LJLJI;
                augurAdaptiveWrapper6.updateFeature("initial_effect_width", c1271250jBb2.LIZ.LJ(c1269140j8C11.LJJJJI, c1269140j8C11.LJJJJIZL, 1));
                AugurAdaptiveWrapper augurAdaptiveWrapper7 = this.c;
                C1269140j8C c1269140j8C12 = this.LLILZLL.LJLJI;
                int i23 = c1269140j8C12.LJJJJI;
                int i24 = c1269140j8C12.LJJJJIZL;
                C1271260jBc c1271260jBc6 = c1271250jBb2.LIZ;
                if (i24 > 0) {
                    if (c1271260jBc6.LJFF(1) && (i23 * 1.0f) / i24 >= c1271260jBc6.LIZLLL() && (i3 = c1271260jBc6.LJJI) > 0) {
                        i24 = (((i24 + i3) - 1) / i3) * i3;
                    }
                } else {
                    c1271260jBc6.getClass();
                }
                augurAdaptiveWrapper7.updateFeature("initial_effect_height", i24);
                this.c.updateFeature("initial_fps", this.LLILZLL.LJJIJIIJI());
                if (LLJJ()) {
                    this.c.updateFeature("adapted_resolution_width", this.LLILZLL.LJIILJJIL(1));
                    this.c.updateFeature("adapted_resolution_height", this.LLILZLL.LJIILIIL(1));
                    this.c.updateFeature("target_fps", this.LLILZLL.LJFF());
                } else {
                    LiveStreamVideoCapture liveStreamVideoCapture2 = this.LLJJIJIL;
                    if (liveStreamVideoCapture2 != null) {
                        int[] iArrLIZIZ2 = c1271250jBb2.LIZIZ(liveStreamVideoCapture2.LLLIILIL, liveStreamVideoCapture2.LLLIL);
                        this.c.updateFeature("adapted_resolution_width", iArrLIZIZ2[0]);
                        this.c.updateFeature("adapted_resolution_height", iArrLIZIZ2[1]);
                        this.c.updateFeature("target_fps", this.LLJJIJIL.LLLII);
                    } else {
                        this.c.updateFeature("adapted_resolution_width", 0);
                        this.c.updateFeature("adapted_resolution_height", 0);
                        this.c.updateFeature("target_fps", 0);
                    }
                }
                if (i > -1 && i2 > -1) {
                    this.c.updateFeature("adapted_resolution_width", i);
                    this.c.updateFeature("adapted_resolution_height", i2);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.c.updateFeature("encoder_change_reason", str);
                }
                LJLJJI();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1274080jGA.LIZ.LIZ("LiveStream.updateTTLHStreamFeature", e);
            if (!C1274040jG6.LIZ()) {
                AVLog.logKibana(4, "LiveStream", "updateTTLHStreamFeature exception->", e);
                return;
            }
            throw e;
        }
    }

    @Override // X.InterfaceC1269420j8e
    public final void LJIILIIL(int i, int i2, int i3, String str) {
        int i4;
        if (i == 2) {
            C1269160j8E c1269160j8E = this.LLILZLL;
            if (c1269160j8E != null) {
                c1269160j8E.LJJLIIIJLLLLLLLZ(i2, i3);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fallback using capture resolution:");
                sbLIZ.append(i2);
                sbLIZ.append(",");
                sbLIZ.append(i3);
                AVLog.logKibana(5, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
            }
        } else if (4 == i) {
            C1269160j8E c1269160j8E2 = this.LLILZLL;
            boolean z = false;
            if (c1269160j8E2 != null && (i4 = c1269160j8E2.LJIIIZ) > 0) {
                try {
                    if (0 == this.LLLLLZIL % ((long) i4)) {
                        this.LLLLLZIL = 0L;
                        z = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLLLLZIL++;
            if (!z) {
                return;
            }
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS1S0103000_20(this, i, i2, i3, 3));
    }

    public final void LJZI(String str, List<String> list, boolean z, boolean z2) {
        List<LyraxTranscoderFeature> listLIZ;
        List<LyraxTranscoderFeature> listLIZ2;
        if (this.LLJZ.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_ERROR");
            LLLIIL(1, -102, new Exception("Error status call on start"));
            return;
        }
        if (this.LLJZ.get() != 3 && this.LLJZ.get() != 2) {
            if (this.LLJZ.get() != 7 && !this.A.get()) {
                this.LLJZ.set(3);
                LJLLLL();
                if (this.LLILZLL.LJJJIL() && !this.A.get() && this.LLIZ != null) {
                    if (!TextUtils.isEmpty(str)) {
                        if (this.LLIZ.LJIIJJI() && !LLJJJ(str)) {
                            this.LLIZ.LJIIIZ(false);
                            this.LLIZ = null;
                            LLILZ(null, true);
                        }
                        if (z2) {
                            this.LLIZ.LJIILJJIL();
                            this.LLIZ.enableCalculateAudioLoudness(true);
                            InterfaceC1266360j3i interfaceC1266360j3i = this.LLIZ;
                            C1266700j4G c1266700j4G = this.LLIZLLLIL;
                            if (c1266700j4G != null) {
                                listLIZ2 = c1266700j4G.LIZ();
                            } else {
                                listLIZ2 = null;
                            }
                            if (interfaceC1266360j3i != null && listLIZ2 != null && !listLIZ2.isEmpty()) {
                                interfaceC1266360j3i.LJJIJL(listLIZ2);
                            }
                        } else {
                            this.LLIZ.LJIJ(str, z);
                            LLLIIIIL();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pusher.startPush/switchSceneToLive url=");
                        sbLIZ.append(str);
                        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
                    } else if (list != null && list.size() > 0) {
                        if (this.LLIZ.LJIIJJI() && !LLJJJ((String) ListProtector.get(list, 0))) {
                            this.LLIZ.LJIIIZ(false);
                            this.LLIZ = null;
                            LLILZ(null, true);
                        }
                        String[] strArr = new String[list.size()];
                        if (z2) {
                            this.LLIZ.LJIILJJIL();
                            this.LLIZ.enableCalculateAudioLoudness(true);
                            InterfaceC1266360j3i interfaceC1266360j3i2 = this.LLIZ;
                            C1266700j4G c1266700j4G2 = this.LLIZLLLIL;
                            if (c1266700j4G2 != null) {
                                listLIZ = c1266700j4G2.LIZ();
                            } else {
                                listLIZ = null;
                            }
                            if (interfaceC1266360j3i2 != null && listLIZ != null && !listLIZ.isEmpty()) {
                                interfaceC1266360j3i2.LJJIJL(listLIZ);
                            }
                        } else {
                            this.LLIZ.LJIILLIIL((String[]) list.toArray(strArr), z);
                            LLLIIIIL();
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("pusher.startPush/switchSceneToLive urls=");
                        sbLIZ2.append(Arrays.toString(list.toArray(strArr)));
                        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), null);
                    }
                }
                if (LLJJLIIIJLLLLLLLZ()) {
                    LLJLL();
                    return;
                }
                return;
            }
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_END");
            return;
        }
        AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_STARTING or STATUS_STARTED");
    }

    public final void LLLLLJIL(int i, int i2, int i3, boolean z) {
        Handler handler;
        if (i > 0 && i2 > 0) {
            C1271250jBb c1271250jBb = C1271270jBd.LIZ;
            if (c1271250jBb.LIZ.LIZLLL) {
                int[] iArrLJ = c1271250jBb.LJ(i, i2, 2);
                i = iArrLJ[0];
                i2 = iArrLJ[1];
                LJLI(i, i2, i3);
                this.LLZLLIL = Math.max(i2, this.LLZLLIL);
            } else {
                LJLI(i, i2, i3);
                this.LLZLL = Math.max(i, this.LLZLL);
            }
            if (z && (handler = this.LLILLL) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS1S0103000_20(this, i, i2, i3, 1));
            }
        }
    }

    public final void LLLZIIL(int i, int i2, boolean z, boolean z2) {
        if (this.LLZZZZ != null) {
            C1266540j40 c1266540j40 = new C1266540j40();
            c1266540j40.LIZIZ = z ? 1 : 0;
            c1266540j40.LIZ = i;
            c1266540j40.LIZJ = this.LLILZLL.LIZ.mPushBase.LJJIJIIJI();
            c1266540j40.LIZLLL = this.LLILZLL.LIZ.mPushBase.LJJIJ();
            c1266540j40.LJFF = z2 ? 1 : 0;
            c1266540j40.LJ = i2;
            c1266540j40.LJI = this.LLILZLL.LIZ.mPushBase.LJJIJIL();
            c1266540j40.LJII = this.LLILZLL.LIZ.mPushBase.LJJIJIIJIL();
            C1267080j4s c1267080j4s = this.LLZZZZ.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJIIIZ, c1266540j40);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.c;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("bmf_denoise_enable", z ? 1 : 0);
            this.c.updateFeature("bmf_denoise_mask", i);
            this.c.updateFeature("min_denoise_adapted_resolution_width", this.LLILZLL.LIZ.mPushBase.LJJIJIIJI());
            this.c.updateFeature("min_denoise_adapted_resolution_height", this.LLILZLL.LIZ.mPushBase.LJJIJ());
            this.c.updateFeature("bmf_streamhd_adaptive_enable", z2 ? 1 : 0);
            this.c.updateFeature("bmf_streamhd_mask", i2);
            this.c.updateFeature("min_streamhd_adapted_resolution_width", this.LLILZLL.LIZ.mPushBase.LJJIJIL());
            this.c.updateFeature("min_streamhd_adapted_resolution_height", this.LLILZLL.LIZ.mPushBase.LJJIJIIJIL());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0493  */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0j44] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0j9B] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0j4A] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0j4O] */
    /* JADX WARN: Type inference failed for: r1v56, types: [X.0jAc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1266350j3h(X.C1269160j8E r23, android.os.Handler r24, android.os.Handler r25, com.ss.ttlivestreamer.core.engine.AudioDeviceModule r26, X.C1267500j5Y r27) {
        /*
            Method dump skipped, instruction units count: 2303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.<init>(X.0j8E, android.os.Handler, android.os.Handler, com.ss.ttlivestreamer.core.engine.AudioDeviceModule, X.0j5Y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL(int r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266350j3h.LLLLLZL(int, int, int, int, int):void");
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJIZ(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return LJJJLL(str, obj, i, z, z2, 0, str2);
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJIIJJI(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z) {
        return LJJJJ(i, z, i2, i3, i4, fArr, j, null);
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJJLL(final String str, final Object obj, final int i, final boolean z, final boolean z2, final int i2, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLLLLIL == 0) {
            this.LLLLLIL = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.LLLLLIL > 30000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addSeiField is called ");
            sbLIZ.append(this.LLLLL);
            sbLIZ.append(" times in last 30s.");
            AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLLLIL = jCurrentTimeMillis;
            this.LLLLL = 0;
        }
        this.LLLLL++;
        if (this.LLILZLL.LJJJIL() && this.LLIZ != null) {
            return ((Integer) C1283100jUi.LIZ(this.LL, new Callable() { // from class: X.0j4C
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1266350j3h c1266350j3h = this.LL;
                    String str3 = str;
                    Object obj2 = obj;
                    int i3 = i;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i4 = i2;
                    c1266350j3h.getClass();
                    C1C7U.LIZ("LiveStream@24e7.addSeiField$1L");
                    InterfaceC1266360j3i interfaceC1266360j3i = c1266350j3h.LLIZ;
                    if (interfaceC1266360j3i == null) {
                        C1C7U.LIZIZ("LiveStream@24e7.addSeiField$1L");
                        return -1;
                    }
                    Integer numValueOf = Integer.valueOf(interfaceC1266360j3i.LJJIJIIJI(str3, obj2, i3, z3, z4, i4));
                    C1C7U.LIZIZ("LiveStream@24e7.addSeiField$1L");
                    return numValueOf;
                }
            })).intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJJJ(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        AbstractC1268600j7K abstractC1268600j7K;
        C1266520j3y c1266520j3y;
        C1270360jAA c1270360jAA;
        Bundle bundle2;
        EnumC1273550jFJ enumC1273550jFJ;
        float[] fArrLIZIZ = fArr;
        if (LLJJ()) {
            LLLLLLLZIL("texture", "ExternalVideoFrameNode");
            C1266420j3o c1266420j3o = this.LLJJJIL;
            if (c1266420j3o != null && (c1266520j3y = c1266420j3o.LJII) != null && (c1270360jAA = c1266520j3y.LL) != null) {
                C1269730j99 c1269730j99 = c1270360jAA.LLILZ;
                if (c1269730j99 != null) {
                    bundle2 = c1269730j99.LIZ(null);
                } else {
                    bundle2 = new Bundle();
                }
                if (bundle != null) {
                    C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                }
                if (z) {
                    enumC1273550jFJ = EnumC1273550jFJ.OES;
                } else {
                    enumC1273550jFJ = EnumC1273550jFJ.RGB;
                }
                k kVar = new k(i2, i3, enumC1273550jFJ, i, null);
                if (fArrLIZIZ == null) {
                    fArrLIZIZ = C1273510jFF.LIZIZ();
                }
                if (bundle2.getBoolean("horizontal_flipped", false)) {
                    float[] fArr2 = new float[16];
                    android.opengl.Matrix.multiplyMM(fArr2, 0, C1267770j5z.LIZ, 0, fArrLIZIZ, 0);
                    kVar.setTransformMatrixArray(fArr2);
                } else {
                    kVar.setTransformMatrixArray(fArrLIZIZ);
                }
                kVar.updateCaptureMs(TimeUtils.currentTimeMs());
                kVar.updateCaptureServerNtpMs(TimeUtils.nativeTimeUTCMicros() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                kVar.release();
                VideoFrame videoFrame = new VideoFrame(kVar, i4, j);
                C1266350j3h c1266350j3h = c1270360jAA.LLILLL;
                if (c1266350j3h != null && c1266350j3h.LLLFF(videoFrame, "texture")) {
                    return 0;
                }
                c1270360jAA.LJIIIZ(videoFrame, bundle2);
                return 0;
            }
            return -1;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJIJIL;
        if (liveStreamVideoCapture != null) {
            if ((liveStreamVideoCapture.LLJJIJIL != 1 && !liveStreamVideoCapture.LLJJJJJIL) || (abstractC1268600j7K = liveStreamVideoCapture.LLJJL) == null || !(abstractC1268600j7K instanceof C1269670j93)) {
                return -1;
            }
            long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
            return ((C1270350jA9) abstractC1268600j7K).LLJIJIL(i, z, i2, i3, i4, fArrLIZIZ, jNativeNanoTime, bundle, jNativeNanoTime / 1000, 0L);
        }
        return -1;
    }
}
