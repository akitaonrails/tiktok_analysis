package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoExternalVideoSei;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoFeatureOptions;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoRTCData;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoVideoNewUserGuide;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoVideoSummaryRequest;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.UserQueryPayload;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse;
import com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer;
import com.ss.bytertc.engine.avclient.LyraxAVAudioRoute;
import com.ss.bytertc.engine.avclient.LyraxAVAudioSource;
import com.ss.bytertc.engine.avclient.LyraxAVClientImpl;
import com.ss.bytertc.engine.avclient.LyraxAVClientOption;
import com.ss.bytertc.engine.avclient.LyraxVideoFrame;
import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301890jz1 implements InterfaceC1302070jzJ {
    public static final ByteBuffer LLJJJ = ByteBuffer.allocateDirect(0);
    public final Context LL;
    public final C2189821An6 LLILLJJLI;
    public volatile LyraxAVClientImpl LLILLL;
    public C1863380yae LLILZ;
    public volatile AudioAuthResponse LLILZIL;
    public volatile String LLILZLL;
    public volatile String LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;
    public volatile String LLJILJIL;
    public volatile int LLJILJILJ;
    public boolean LLJILLL;
    public final Object LLJJ;
    public volatile boolean LLJJI;
    public volatile AnonymousClass0956 LLJJIII;
    public volatile boolean LLJJIJI;
    public InterfaceC497601wk LLJJIJIIJIL;
    public final Set<LyraxAVAudioPlayer> LLJJIJIL;

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJFF() {
        throw null;
    }

    @Override // X.InterfaceC1302070jzJ
    public final void destroyClient() {
        this.LLILZLL = null;
        this.LLIZ = null;
        LJIILL();
        this.LLJJIJIIJIL = null;
        this.LLJJIJI = false;
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIII = null;
        C2252321DDq c2252321DDq = this.LLIZLLLIL;
        Boolean bool = Boolean.FALSE;
        c2252321DDq.setValue(bool);
        this.LLJ.setValue(bool);
        LJIJI();
        this.LLILZIL = null;
        this.LLJILJIL = "";
        this.LLJILJILJ = -1;
        this.LLILZ = null;
        LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
        if (lyraxAVClientImpl != null) {
            LJIILLIIL(lyraxAVClientImpl);
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LIZIZ() {
        return this.LLILLL != null && LJ();
    }

    public final boolean LJ() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final void LJIILL() {
        Object c098200Yq;
        if (((CopyOnWriteArraySet) this.LLJJIJIL).isEmpty()) {
            return;
        }
        List listLLIIII = C13LP.LLIIII(this.LLJJIJIL);
        ((CopyOnWriteArraySet) this.LLJJIJIL).clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            try {
                ((LyraxAVAudioPlayer) it2.next()).stop();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public final void LJIJI() {
        String str;
        LyraxAVClientImpl lyraxAVClientImpl;
        String str2;
        LyraxAVClientImpl lyraxAVClientImpl2;
        AudioAuthResponse audioAuthResponse;
        String str3;
        LyraxAVClientImpl lyraxAVClientImpl3;
        boolean z = ((Boolean) this.LLIZLLLIL.getValue()).booleanValue() && ((Boolean) this.LLJ.getValue()).booleanValue();
        if (z == ((Boolean) this.LLJI.getValue()).booleanValue()) {
            return;
        }
        this.LLJI.setValue(Boolean.valueOf(z));
        if (z) {
            this.LLJJIJI = false;
            if (this.LLJJI && (lyraxAVClientImpl3 = this.LLILLL) != null) {
                lyraxAVClientImpl3.muteAllRemoteUsers();
            }
            if (LJ() && (str2 = this.LLIZ) != null && (lyraxAVClientImpl2 = this.LLILLL) != null && (audioAuthResponse = this.LLILZIL) != null && (str3 = audioAuthResponse.agentUserID) != null) {
                this.LLIZ = null;
                LJIIL(lyraxAVClientImpl2, str3, str2);
            }
            if (!LJ() || (str = this.LLILZLL) == null || (lyraxAVClientImpl = this.LLILLL) == null) {
                return;
            }
            this.LLILZLL = null;
            LJIILJJIL(lyraxAVClientImpl, str);
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJJIFFI() {
        boolean z;
        synchronized (this.LLJJ) {
            try {
                z = this.LLJILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean startAudioCapture() {
        synchronized (this.LLJJ) {
            try {
                if (this.LLJILLL) {
                    return true;
                }
                this.LLJILLL = true;
                LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
                if (lyraxAVClientImpl == null) {
                    return false;
                }
                lyraxAVClientImpl.startAudioCapture();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean stopAudioCapture() {
        synchronized (this.LLJJ) {
            try {
                if (!this.LLJILLL) {
                    return true;
                }
                this.LLJILLL = false;
                LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
                if (lyraxAVClientImpl == null) {
                    return false;
                }
                lyraxAVClientImpl.stopAudioCapture();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final C05YD<Boolean> LJII() {
        return this.LLJIJIL;
    }

    public static void LJIIIIZZ(ByteBuffer byteBuffer) {
        if (byteBuffer != LLJJJ && byteBuffer.isDirect()) {
            try {
                Method method = byteBuffer.getClass().getMethod("cleaner", new Class[0]);
                method.setAccessible(true);
                Object objInvoke = method.invoke(byteBuffer, new Object[0]);
                if (objInvoke == null) {
                    return;
                }
                Method method2 = objInvoke.getClass().getMethod("clean", new Class[0]);
                method2.setAccessible(true);
                method2.invoke(objInvoke, new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIILLIIL(LyraxAVClientImpl lyraxAVClientImpl) {
        LJIJ(new AwS564S0100000_20(lyraxAVClientImpl, 30));
        LJIJ(new AwS564S0100000_20(lyraxAVClientImpl, 31));
        LJIJ(new AwS564S0100000_20(lyraxAVClientImpl, 32));
    }

    public static final void LJIJ(Function0 function0) {
        Object c098200Yq;
        try {
            c098200Yq = function0.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LIZ(boolean z) {
        if (this.LLJJI == z) {
            return LIZIZ();
        }
        this.LLJJI = z;
        LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
        if (lyraxAVClientImpl != null && LJ()) {
            if (z) {
                lyraxAVClientImpl.muteAllRemoteUsers();
                return true;
            }
            lyraxAVClientImpl.unmuteAllRemoteUsers();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJI(Message message) {
        int i;
        if (message.LIZIZ == 0) {
            if (message.sender.isSelf) {
                i = 2;
            } else {
                i = 6;
            }
            message.LIZIZ = i;
        }
        if (message.LIZLLL == 0) {
            message.LIZLLL = System.currentTimeMillis();
        }
        message.LIZ = true;
        C1863380yae c1863380yae = this.LLILZ;
        if (c1863380yae != null) {
            C1863280yaU c1863280yaU = c1863380yae.LJIILL;
            c1863280yaU.getClass();
            c1863280yaU.LJJJLIIL(message, false, false);
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIIJJI(EnumC1284940jXg enumC1284940jXg) {
        AudioAuthResponse audioAuthResponse;
        String str;
        String strLIZIZ;
        String str2;
        LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
        if (lyraxAVClientImpl != null && LJ() && (audioAuthResponse = this.LLILZIL) != null && (str = audioAuthResponse.agentUserID) != null) {
            if (enumC1284940jXg == EnumC1284940jXg.MUTE) {
                strLIZIZ = C1301860jyy.LIZIZ(enumC1284940jXg, this.LLJILJIL, this.LLJILJILJ);
            } else {
                strLIZIZ = C1301860jyy.LIZIZ(enumC1284940jXg, "", -1);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("interrupt: type=");
            sbLIZ.append(enumC1284940jXg);
            sbLIZ.append(", roomId=");
            AudioAuthResponse audioAuthResponse2 = this.LLILZIL;
            String str3 = null;
            if (audioAuthResponse2 != null) {
                str2 = audioAuthResponse2.roomId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", streamId=");
            AudioAuthResponse audioAuthResponse3 = this.LLILZIL;
            if (audioAuthResponse3 != null) {
                str3 = audioAuthResponse3.streamId;
            }
            sbLIZ.append(str3);
            sbLIZ.append(", message=");
            sbLIZ.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            lyraxAVClientImpl.sendUserMessage(str, strLIZIZ);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIILIIL(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
            if (lyraxAVClientImpl != null && LJ()) {
                LJIILJJIL(lyraxAVClientImpl, str);
                InterfaceC497601wk interfaceC497601wk = this.LLJJIJIIJIL;
                if (interfaceC497601wk != null) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C641430PDx(this, null), 3);
                }
                return true;
            }
            this.LLILZLL = str;
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean LJIIZILJ(String str) {
        String str2;
        if (str != null && (!a0.LJJJIL(str))) {
            LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
            if (lyraxAVClientImpl != null && LJ()) {
                AudioAuthResponse audioAuthResponse = this.LLILZIL;
                if (audioAuthResponse != null && (str2 = audioAuthResponse.agentUserID) != null) {
                    LJIIL(lyraxAVClientImpl, str2, str);
                }
                return true;
            }
            this.LLIZ = str;
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJJ(LyraxAVAudioPlayer lyraxAVAudioPlayer) {
        Object c098200Yq;
        ((CopyOnWriteArraySet) this.LLJJIJIL).remove(lyraxAVAudioPlayer);
        try {
            lyraxAVAudioPlayer.stop();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC1302070jzJ
    public final LyraxAVAudioPlayer createAudioPlayer(LyraxAVAudioSource lyraxAVAudioSource) {
        LyraxAVAudioPlayer lyraxAVAudioPlayerCreateAudioPlayer;
        LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
        if (lyraxAVClientImpl == null || (lyraxAVAudioPlayerCreateAudioPlayer = lyraxAVClientImpl.createAudioPlayer(lyraxAVAudioSource)) == null) {
            return null;
        }
        ((CopyOnWriteArraySet) this.LLJJIJIL).add(lyraxAVAudioPlayerCreateAudioPlayer);
        return lyraxAVAudioPlayerCreateAudioPlayer;
    }

    public C1301890jz1(Context context, C2189821An6 c2189821An6) {
        this.LL = context;
        this.LLILLJJLI = c2189821An6;
        Boolean bool = Boolean.FALSE;
        this.LLIZLLLIL = C1BNE.LIZ(bool);
        this.LLJ = C1BNE.LIZ(bool);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(bool);
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJILJIL = "";
        this.LLJILJILJ = -1;
        this.LLJJ = new Object();
        this.LLJJI = C2174741A9g.LIZIZ.LJIILJJIL();
        this.LLJJIJIL = new CopyOnWriteArraySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(boolean r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C641440PDy
            if (r0 == 0) goto L4a
            r4 = r7
            X.0PDy r4 = (X.C641440PDy) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.String r3 = (java.lang.String) r3
            com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse r0 = r5.LLILZIL
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.agentUserID
            if (r1 == 0) goto L50
            if (r3 == 0) goto L50
            com.ss.bytertc.engine.avclient.LyraxAVClientImpl r0 = r5.LLILLL
            if (r0 == 0) goto L39
            long r0 = r0.sendUserMessage(r1, r3)
            X.C2286608xc.LJFF(r0)
        L39:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r2
            java.lang.Object r3 = X.C1301860jyy.LIZ(r6, r4)
            if (r3 != r1) goto L22
            return r1
        L4a:
            X.0PDy r4 = new X.0PDy
            r4.<init>(r5, r7)
            goto L12
        L50:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301890jz1.LJIIIZ(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1302070jzJ
    public final void LJIIJ(int i, String str) {
        if (i > this.LLJILJILJ) {
            this.LLJILJIL = str;
            this.LLJILJILJ = i;
        }
    }

    public final void LJIILJJIL(LyraxAVClientImpl lyraxAVClientImpl, String str) {
        String str2;
        AudioAuthResponse audioAuthResponse = this.LLILZIL;
        if (audioAuthResponse != null && (str2 = audioAuthResponse.agentUserID) != null) {
            lyraxAVClientImpl.sendUserMessage(str2, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoRTCData("tako", "client", "server", System.currentTimeMillis(), "passthrough_message", "watch_new_video", "", -1, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoVideoSummaryRequest(str, UUID.randomUUID().toString())), "")));
        }
    }

    @Override // X.InterfaceC1302070jzJ
    public final boolean sendUserMessage(String str, String str2) {
        LyraxAVClientImpl lyraxAVClientImpl;
        String str3;
        if (str != null) {
            String str4 = null;
            if ((!a0.LJJJIL(str)) && (lyraxAVClientImpl = this.LLILLL) != null && LJ()) {
                AudioAuthResponse audioAuthResponse = this.LLILZIL;
                if (audioAuthResponse != null && (str3 = audioAuthResponse.agentUserID) != null) {
                    lyraxAVClientImpl.sendUserMessage(str3, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoRTCData("tako", "client", "mediaX", System.currentTimeMillis(), "user_input_text", "text_input", "", -1, str, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new UserQueryPayload(str2)))));
                    return true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendUserMessageInternal: skip, agentUserId is null, roomId=");
                if (audioAuthResponse != null) {
                    str4 = audioAuthResponse.roomId;
                }
                sbLIZ.append(str4);
                sbLIZ.append(", uuid=");
                sbLIZ.append(str2);
                sbLIZ.append(", message=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIIL(LyraxAVClientImpl lyraxAVClientImpl, String str, String str2) {
        lyraxAVClientImpl.sendUserMessage(str, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoRTCData("tako", "client", "server", System.currentTimeMillis(), "passthrough_message", "user_guide", "", -1, GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoVideoNewUserGuide(str2)), "")));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(49:0|2|(2:4|(1:6)(1:12))(0)|7|(1:(1:(30:11|209|13|16|211|57|63|(1:65)(1:96)|66|(1:95)(1:70)|71|(1:94)(1:75)|(1:77)(1:93)|(1:92)(1:81)|(1:83)(1:91)|(1:85)(1:90)|(1:87)(1:89)|88|215|97|(4:99|(1:101)(1:102)|(1:104)|(1:106))|(4:108|(1:110)(1:111)|(1:113)|(1:115))|(4:117|(1:119)(1:120)|(1:122)|(1:124))|125|(4:127|(1:129)(1:130)|(1:132)|(1:134))|(4:136|(1:138)(1:139)|(1:141)|(1:143))|(4:145|(1:147)(1:148)|(1:150)|(1:152))|(4:154|(1:156)(1:157)|(1:159)|(1:161))|162|(12:181|(1:183)(1:206)|(1:185)|186|(1:205)(1:190)|191|(1:193)(1:204)|194|(1:196)|(1:203)(1:200)|201|202)(7:168|(1:174)(1:172)|173|207|175|176|177))(2:17|18))(1:44))(10:19|(1:21)|22|(4:24|(1:26)(1:42)|(1:28)(1:41)|29)(1:43)|30|(1:32)(1:40)|33|(1:35)(1:39)|36|(1:38))|45|(1:49)|50|213|51|(2:53|(1:55)(39:56|211|57|63|(0)(0)|66|(2:68|95)(0)|71|(2:73|94)(0)|(0)(0)|(2:79|92)(0)|(0)(0)|(0)(0)|(0)(0)|88|215|97|(0)|(0)|(0)|125|(0)|(0)|(0)|(0)|162|(1:166)|181|(0)(0)|(0)|186|(2:188|205)(0)|191|(0)(0)|194|(0)|(2:198|203)(0)|201|202))(37:58|63|(0)(0)|66|(0)(0)|71|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|88|215|97|(0)|(0)|(0)|125|(0)|(0)|(0)|(0)|162|(0)|181|(0)(0)|(0)|186|(0)(0)|191|(0)(0)|194|(0)|(0)(0)|201|202)|62|63|(0)(0)|66|(0)(0)|71|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|88|215|97|(0)|(0)|(0)|125|(0)|(0)|(0)|(0)|162|(0)|181|(0)(0)|(0)|186|(0)(0)|191|(0)(0)|194|(0)|(0)(0)|201|202|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0282, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0283, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fb A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0210 A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022a A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023f A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0254 A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0269 A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6 A[Catch: Exception -> 0x0282, TryCatch #4 {Exception -> 0x0282, blocks: (B:97:0x01df, B:99:0x01e6, B:106:0x01f4, B:108:0x01fb, B:115:0x0209, B:117:0x0210, B:124:0x021e, B:125:0x0223, B:127:0x022a, B:134:0x0238, B:136:0x023f, B:143:0x024d, B:145:0x0254, B:152:0x0262, B:154:0x0269, B:161:0x0277, B:162:0x027c), top: B:215:0x01df }] */
    /* JADX WARN: Type inference failed for: r14v7, types: [X.0jP4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC497601wk r31, X.C1279700jPE r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301890jz1.LIZJ(X.01wk, X.0jPE, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1302070jzJ
    public final Object LJJIIZI(InterfaceC497601wk interfaceC497601wk, C1279700jPE c1279700jPE, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (LIZIZ()) {
            return Unit.LIZ;
        }
        if (this.LLJJIJI) {
            return Unit.LIZ;
        }
        this.LLJJIJI = true;
        LJIILL();
        LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
        if (lyraxAVClientImpl != null) {
            LJIILLIIL(lyraxAVClientImpl);
        }
        this.LLILLL = null;
        this.LLJILJIL = "";
        this.LLJILJILJ = -1;
        Object objLIZJ = LIZJ(interfaceC497601wk, c1279700jPE, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1302070jzJ
    public final int LJJIIJ(ByteBuffer byteBuffer, int i, int i2, long j, int i3, TakoExternalVideoSei takoExternalVideoSei) {
        String strLJIILL;
        ByteBuffer byteBufferAllocateDirect;
        int iPushExternalVideo;
        if (takoExternalVideoSei == null) {
            byteBufferAllocateDirect = LLJJJ;
        } else {
            try {
                strLJIILL = C1222790hvR.LIZ().LJIILL(takoExternalVideoSei);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLJIILL = "";
            }
            if (strLJIILL.length() == 0) {
                byteBufferAllocateDirect = LLJJJ;
            } else {
                try {
                    byte[] bytes = strLJIILL.getBytes(Charsets.UTF_8);
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
                    byteBufferAllocateDirect.put(bytes);
                    byteBufferAllocateDirect.flip();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    byteBufferAllocateDirect = LLJJJ;
                }
            }
        }
        try {
            LyraxAVClientImpl lyraxAVClientImpl = this.LLILLL;
            if (lyraxAVClientImpl != null) {
                iPushExternalVideo = lyraxAVClientImpl.pushExternalVideo(new LyraxVideoFrame(byteBuffer, i, i2, i3, j, byteBufferAllocateDirect));
            } else {
                iPushExternalVideo = -1;
            }
            LJIIIIZZ(byteBufferAllocateDirect);
            return iPushExternalVideo;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LJIIIIZZ(byteBufferAllocateDirect);
            throw th2;
        }
    }

    public final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C1279600jP4 c1279600jP4) {
        boolean z;
        String strLJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("innerInitClient: rtcAppId=");
        sbLIZ.append(str);
        sbLIZ.append(", rtcUserId=");
        sbLIZ.append(str2);
        sbLIZ.append(", rtcRoomId=");
        sbLIZ.append(str3);
        sbLIZ.append(", idc=");
        sbLIZ.append(str5);
        sbLIZ.append(", agentUserID=");
        sbLIZ.append(str6);
        sbLIZ.append(", rtcStreamId=");
        sbLIZ.append(str7);
        sbLIZ.append(", bizId=");
        sbLIZ.append(str10);
        sbLIZ.append(", rtcTokenLen=");
        sbLIZ.append(str4.length());
        sbLIZ.append(", rtcStreamTokenLen=");
        sbLIZ.append(str8.length());
        sbLIZ.append(", streamAccessHostPresent=");
        if (str9 != null && !a0.LJJJIL(str9)) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(!z);
        C2188811AlT.LIZIZ(sbLIZ);
        LyraxAVClientOption lyraxAVClientOption = new LyraxAVClientOption();
        lyraxAVClientOption.setRtcUserID(str2);
        lyraxAVClientOption.setRtcRoomID(str3);
        lyraxAVClientOption.setRtcToken(str4);
        lyraxAVClientOption.setRtcAppID(str);
        lyraxAVClientOption.setRtcStreamId(str7);
        lyraxAVClientOption.setRtcStreamToken(str8);
        lyraxAVClientOption.setAndroidContext(this.LL);
        lyraxAVClientOption.setDeviceID(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        C844470XAv.LIZ.getClass();
        lyraxAVClientOption.setAppID(String.valueOf(C844470XAv.LJIIJ));
        lyraxAVClientOption.setAppChannel(C844470XAv.LJIILL);
        lyraxAVClientOption.setAppVersion(String.valueOf(C844470XAv.LJ()));
        lyraxAVClientOption.setIdc(str5);
        lyraxAVClientOption.setLyraxAVListener(c1279600jP4);
        C1279490jOt.LIZ.getClass();
        lyraxAVClientOption.setSdkParams((String) C1279490jOt.LIZJ.getValue());
        if (str9 != null && !a0.LJJJIL(str9)) {
            lyraxAVClientOption.setAccessHost(C1697810uHb.LJ(str9));
        }
        LyraxAVClientImpl lyraxAVClientImplCreate = LyraxAVClientImpl.LyraxAVClientBuilder.Companion.create(lyraxAVClientOption);
        lyraxAVClientImplCreate.enableAudioPropertiesMonitor(new LyraxAudioPropertiesConfig(100));
        lyraxAVClientImplCreate.setDefaultAudioRoute(LyraxAVAudioRoute.ROUTE_SPEAKERPHONE);
        try {
            strLJIILL = C1222790hvR.LIZ().LJIILL(new TakoFeatureOptions(str6, str3, str2, str10));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        lyraxAVClientImplCreate.setFeature("voiceChat", new LyraxTranscoderFeature("voiceChat", "voiceChatForTako", strLJIILL));
        lyraxAVClientImplCreate.startVoiceCall();
        this.LLILLL = lyraxAVClientImplCreate;
        lyraxAVClientImplCreate.stopAudioCapture();
    }
}
