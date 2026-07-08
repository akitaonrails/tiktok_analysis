package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import com.ss.bytertc.engine.avclient.LyraxAVAudioMediaInfo;
import com.ss.bytertc.engine.avclient.LyraxAVAudioMixType;
import com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer;
import com.ss.bytertc.engine.avclient.LyraxAVAudioSource;
import com.ss.bytertc.engine.avclient.LyraxAVAudioSourceType;
import com.ss.solution.tako.TakoAudioFrameInfo;
import com.ss.solution.tako.TakoAudioPCMFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0jQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1280370jQJ extends C1280420jQO {
    public final Function0<ITakoRTCAbility> LIZ;
    public final Function0<String> LIZIZ;
    public final AtomicReference<LyraxAVAudioPlayer> LIZJ = new AtomicReference<>(null);
    public final AtomicReference<LyraxAVAudioMediaInfo> LIZLLL = new AtomicReference<>(null);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(530));

    public final LyraxAVAudioPlayer LJI() {
        LyraxAVAudioMediaInfo andSet;
        Object c098200Yq;
        ITakoRTCAbility iTakoRTCAbilityInvoke;
        LyraxAVAudioPlayer lyraxAVAudioPlayerCreateAudioPlayer = this.LIZJ.get();
        if (lyraxAVAudioPlayerCreateAudioPlayer == null) {
            if (!this.LJ.get() && (iTakoRTCAbilityInvoke = this.LIZ.invoke()) != null) {
                lyraxAVAudioPlayerCreateAudioPlayer = iTakoRTCAbilityInvoke.createAudioPlayer(new LyraxAVAudioSource(LyraxAVAudioSourceType.PCM, LyraxAVAudioMixType.ProcessOnly));
                if (lyraxAVAudioPlayerCreateAudioPlayer != null) {
                    this.LIZJ.set(lyraxAVAudioPlayerCreateAudioPlayer);
                    if (this.LJ.get()) {
                        AtomicReference<LyraxAVAudioPlayer> atomicReference = this.LIZJ;
                        while (!atomicReference.compareAndSet(lyraxAVAudioPlayerCreateAudioPlayer, null)) {
                            if (atomicReference.get() != lyraxAVAudioPlayerCreateAudioPlayer) {
                                return null;
                            }
                        }
                        iTakoRTCAbilityInvoke.LJJ(lyraxAVAudioPlayerCreateAudioPlayer);
                    }
                }
            }
            return null;
        }
        if (this.LIZLLL.get() == null || (andSet = this.LIZLLL.getAndSet(null)) == null) {
            return lyraxAVAudioPlayerCreateAudioPlayer;
        }
        if (this.LJ.get()) {
            return null;
        }
        try {
            lyraxAVAudioPlayerCreateAudioPlayer.start(andSet);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            this.LIZIZ.invoke();
            return lyraxAVAudioPlayerCreateAudioPlayer;
        }
        this.LIZIZ.invoke();
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        AtomicReference<LyraxAVAudioPlayer> atomicReference2 = this.LIZJ;
        while (true) {
            if (atomicReference2.compareAndSet(lyraxAVAudioPlayerCreateAudioPlayer, null)) {
                ITakoRTCAbility iTakoRTCAbilityInvoke2 = this.LIZ.invoke();
                if (iTakoRTCAbilityInvoke2 != null) {
                    iTakoRTCAbilityInvoke2.LJJ(lyraxAVAudioPlayerCreateAudioPlayer);
                }
            } else if (atomicReference2.get() != lyraxAVAudioPlayerCreateAudioPlayer) {
                break;
            }
        }
        AtomicReference<LyraxAVAudioMediaInfo> atomicReference3 = this.LIZLLL;
        while (!atomicReference3.compareAndSet(null, andSet) && atomicReference3.get() == null) {
        }
        return null;
    }

    @Override // X.C1ET9
    public final C1280410jQN getConfig() {
        return new C1280410jQN(3);
    }

    @Override // X.C1ET9
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioClose[aid=");
        String strInvoke = this.LIZIZ.invoke();
        if (strInvoke == null) {
            strInvoke = "";
        }
        sbLIZ.append(strInvoke);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        LJII("audioClose");
    }

    @Override // X.C1ET9
    public final void LIZLLL(C1280390jQL c1280390jQL) {
        LyraxAVAudioPlayer lyraxAVAudioPlayerLJI;
        if (!((Boolean) this.LJFF.getValue()).booleanValue() && !this.LJ.get() && (lyraxAVAudioPlayerLJI = LJI()) != null) {
            lyraxAVAudioPlayerLJI.pushAudioFrame(new TakoAudioFrameInfo(c1280390jQL.LIZ, c1280390jQL.LIZIZ));
        }
    }

    @Override // X.C1ET9
    public final void LJ(C1280400jQM c1280400jQM) {
        TakoAudioPCMFormat takoAudioPCMFormat;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioOpen[aid=");
        String strInvoke = this.LIZIZ.invoke();
        if (strInvoke == null) {
            strInvoke = "";
        }
        sbLIZ.append(strInvoke);
        sbLIZ.append("]: sampleRate=");
        sbLIZ.append(c1280400jQM.LIZ);
        sbLIZ.append(", channels=");
        sbLIZ.append(c1280400jQM.LIZIZ);
        sbLIZ.append(", rawFormat=");
        sbLIZ.append(c1280400jQM.LIZJ);
        sbLIZ.append(", released=");
        sbLIZ.append(this.LJ.get());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJ.get()) {
            return;
        }
        int i = c1280400jQM.LIZJ;
        if (i != 1) {
            if (i != 8) {
                takoAudioPCMFormat = TakoAudioPCMFormat.PCM_NONE;
            } else {
                takoAudioPCMFormat = TakoAudioPCMFormat.PCM_FLOAT_PLANAR;
            }
        } else {
            takoAudioPCMFormat = TakoAudioPCMFormat.PCM_S16;
        }
        this.LIZLLL.set(new LyraxAVAudioMediaInfo(c1280400jQM.LIZ, c1280400jQM.LIZIZ, takoAudioPCMFormat.value()));
        LJI();
    }

    public final void LJII(String str) {
        boolean z;
        ITakoRTCAbility iTakoRTCAbilityInvoke;
        LyraxAVAudioPlayer andSet = this.LIZJ.getAndSet(null);
        this.LIZLLL.set(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("[aid=");
        String strInvoke = this.LIZIZ.invoke();
        if (strInvoke == null) {
            strInvoke = "";
        }
        sbLIZ.append(strInvoke);
        sbLIZ.append("]: cleared, hadPlayer=");
        if (andSet != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (andSet != null && (iTakoRTCAbilityInvoke = this.LIZ.invoke()) != null) {
            iTakoRTCAbilityInvoke.LJJ(andSet);
        }
    }

    public C1280370jQJ(AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LIZ = awS555S0100000_11;
        this.LIZIZ = awS555S0100000_112;
    }
}
