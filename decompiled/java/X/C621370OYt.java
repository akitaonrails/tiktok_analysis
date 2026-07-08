package X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621370OYt {
    public final InterfaceC497601wk LIZ;
    public final Map<String, InterfaceC332260D0u<InterfaceC1256404vq>> LIZIZ = new LinkedHashMap();
    public final Map<String, InterfaceC332260D0u<C2227808o8>> LIZJ = new LinkedHashMap();
    public final C2252321DDq LIZLLL;
    public final C2252321DDq LJ;
    public final C2252321DDq LJFF;
    public final C2252321DDq LJI;
    public MediaPlayer LJII;
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public Function0<Unit> LJIIJ;
    public final C621390OYv LJIIJJI;

    public final void LIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIZ = null;
        try {
            MediaPlayer mediaPlayer = this.LJII;
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoicePlayManager release error: ");
            sbLIZ.append(e2.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJFF.setValue(null);
        this.LJIIJ = null;
        C621390OYv c621390OYv = this.LJIIJJI;
        AudioManager audioManager = c621390OYv.LIZIZ;
        if (audioManager == null || !c621390OYv.LJ) {
            return;
        }
        c621390OYv.LJ = false;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = c621390OYv.LIZLLL;
            if (audioFocusRequest != null) {
                try {
                    c098200Yq2 = Integer.valueOf(audioManager.abandonAudioFocusRequest(audioFocusRequest));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AudioFocusHelper abandon error: ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C189200o6.m1boximpl(c098200Yq2);
            }
            c621390OYv.LIZLLL = null;
        } else {
            try {
                c098200Yq = Integer.valueOf(audioManager.abandonAudioFocus(c621390OYv.LIZJ));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl2 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AudioFocusHelper abandon error: ");
                sbLIZ3.append(thM5exceptionOrNullimpl2.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        C0OPX.LJII("AudioFocusHelper: abandoned");
    }

    public final void LIZLLL() {
        String str;
        MediaPlayer mediaPlayer = this.LJII;
        if (mediaPlayer == null || (str = this.LJIIIIZZ) == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                LJIIIZ(str).setValue(new C1256304vp(str));
                AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJIIIZ = null;
                this.LIZLLL.setValue(null);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoicePlayManager pause error: sourceId=");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            LIZ();
            InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uLJIIIZ = LJIIIZ(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pause failed: ");
            sbLIZ2.append(e.getMessage());
            interfaceC332260D0uLJIIIZ.setValue(new C1256204vo(str, C2188811AlT.LIZIZ(sbLIZ2)));
            this.LIZLLL.setValue(null);
        }
    }

    public final void LJII() {
        String str;
        MediaPlayer mediaPlayer = this.LJII;
        if (mediaPlayer == null || (str = this.LJIIIIZZ) == null) {
            return;
        }
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZIZ).get(str);
        InterfaceC1256404vq interfaceC1256404vq = interfaceC332260D0u != null ? (InterfaceC1256404vq) interfaceC332260D0u.getValue() : null;
        if ((interfaceC1256404vq instanceof C1256304vp) && Intrinsics.LJFF(((C1256304vp) interfaceC1256404vq).LIZ, str)) {
            try {
                mediaPlayer.start();
                LJIIIZ(str).setValue(new C1256104vn(str));
                this.LIZLLL.setValue(str);
                AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJIIIZ = null;
                this.LJIIIZ = C23250099c.LIZLLL(this.LIZ, null, null, new C2228408oE(this, str, null), 3);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoicePlayManager resume error: sourceId=");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sbLIZ.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                LIZ();
                InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uLJIIIZ = LJIIIZ(str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("resume failed: ");
                sbLIZ2.append(e.getMessage());
                interfaceC332260D0uLJIIIZ.setValue(new C1256204vo(str, C2188811AlT.LIZIZ(sbLIZ2)));
                this.LIZLLL.setValue(null);
            }
        }
    }

    public final void LJIIJ() {
        String str = this.LJIIIIZZ;
        if (str == null) {
            return;
        }
        LIZ();
        LJIIIZ(str).setValue(C621300OYm.LIZ);
        LJFF(str).setValue(new C2227808o8(0, 0));
        this.LIZLLL.setValue(null);
    }

    public final void LJI() {
        LIZ();
        Iterator it2 = C13LP.LLIIII(((LinkedHashMap) this.LIZIZ).keySet()).iterator();
        while (it2.hasNext()) {
            InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZIZ).get(it2.next());
            if (interfaceC332260D0u != null) {
                interfaceC332260D0u.setValue(C621330OYp.LIZ);
            }
        }
        ((LinkedHashMap) this.LIZIZ).clear();
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZLLL.setValue(null);
    }

    public C621370OYt(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LIZLLL = c2252321DDqLIZ;
        this.LJ = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LJFF = c2252321DDqLIZ2;
        this.LJI = c2252321DDqLIZ2;
        this.LJIIJJI = new C621390OYv(new AwS547S0100000_3(this, 145));
    }

    public final boolean LIZIZ(String str) {
        Object value;
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZIZ).get(str);
        if (interfaceC332260D0u == null || (value = interfaceC332260D0u.getValue()) == null) {
            return false;
        }
        if (!(value instanceof C1256104vn) && !(value instanceof C1256304vp)) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(String str) {
        Object value;
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZIZ).get(str);
        if (interfaceC332260D0u != null && (value = interfaceC332260D0u.getValue()) != null) {
            return value instanceof C1256104vn;
        }
        return false;
    }

    public final InterfaceC332260D0u<C2227808o8> LJFF(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
        Object objLIZ = linkedHashMap.get(str);
        if (objLIZ == null) {
            objLIZ = C1BNE.LIZ(new C2227808o8(0, 0));
            linkedHashMap.put(str, objLIZ);
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final void LJIIIIZZ(int i) {
        String str;
        MediaPlayer mediaPlayer = this.LJII;
        if (mediaPlayer == null || (str = this.LJIIIIZZ) == null) {
            return;
        }
        try {
            mediaPlayer.seekTo(i);
            InterfaceC332260D0u<C2227808o8> interfaceC332260D0uLJFF = LJFF(str);
            C2227808o8 value = interfaceC332260D0uLJFF.getValue();
            int i2 = value.LIZIZ;
            value.getClass();
            interfaceC332260D0uLJFF.setValue(new C2227808o8(i, i2));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoicePlayManager seekTo error: sourceId=");
            sbLIZ.append(str);
            sbLIZ.append(" pos=");
            sbLIZ.append(i);
            sbLIZ.append(' ');
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final InterfaceC332260D0u<InterfaceC1256404vq> LJIIIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object objLIZ = linkedHashMap.get(str);
        if (objLIZ == null) {
            objLIZ = C1BNE.LIZ(C621320OYo.LIZ);
            linkedHashMap.put(str, objLIZ);
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final void LJ(final String str, final String str2, Function0<Unit> function0) {
        if (!new C0VSJ(str2).exists()) {
            InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uLJIIIZ = LJIIIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("File not found: ");
            sbLIZ.append(str2);
            interfaceC332260D0uLJIIIZ.setValue(new C1256204vo(str, C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        String str3 = this.LJIIIIZZ;
        if (str3 != null && !Intrinsics.LJFF(str3, str)) {
            LIZ();
            LJIIIZ(str3).setValue(C621300OYm.LIZ);
            LJFF(str3).setValue(new C2227808o8(0, 0));
        } else if (Intrinsics.LJFF(str3, str)) {
            LIZ();
        }
        this.LJIIJ = function0;
        this.LJIIIIZZ = str;
        this.LJFF.setValue(str);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(str2);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.0OYs
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BulletinVoicePlayManager playback completed: ");
                    sbLIZ2.append(str);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    Function0<Unit> function02 = this.LJIIJ;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    C621370OYt c621370OYt = this;
                    String str4 = str;
                    c621370OYt.LIZ();
                    c621370OYt.LJIIIZ(str4).setValue(C621310OYn.LIZ);
                    c621370OYt.LJFF(str4).setValue(new C2227808o8(0, 0));
                    c621370OYt.LIZLLL.setValue(null);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.0OYu
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BulletinVoicePlayManager error: sourceId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" what=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" extra=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" path=");
                    sbLIZ2.append(str2);
                    C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ();
                    InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uLJIIIZ2 = this.LJIIIZ(str);
                    String str4 = str;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("MediaPlayer error: ");
                    sbLIZ3.append(i);
                    interfaceC332260D0uLJIIIZ2.setValue(new C1256204vo(str4, C2188811AlT.LIZIZ(sbLIZ3)));
                    this.LIZLLL.setValue(null);
                    return true;
                }
            });
            mediaPlayer.prepare();
            mediaPlayer.start();
            this.LJII = mediaPlayer;
            this.LJIIJJI.LIZ();
            LJIIIZ(str).setValue(new C1256104vn(str));
            LJFF(str).setValue(new C2227808o8(0, mediaPlayer.getDuration()));
            this.LIZLLL.setValue(str);
            AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIIIZ = null;
            this.LJIIIZ = C23250099c.LIZLLL(this.LIZ, null, null, new C2228408oE(this, str, null), 3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinVoicePlayManager play: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", duration=");
            sbLIZ2.append(mediaPlayer.getDuration());
            sbLIZ2.append("ms");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinVoicePlayManager play error: sourceId=");
            sbLIZ3.append(str);
            sbLIZ3.append(" path=");
            sbLIZ3.append(str2);
            sbLIZ3.append(' ');
            sbLIZ3.append(e.getClass().getSimpleName());
            sbLIZ3.append(": ");
            sbLIZ3.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
            LIZ();
            InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uLJIIIZ2 = LJIIIZ(str);
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            interfaceC332260D0uLJIIIZ2.setValue(new C1256204vo(str, message));
            this.LIZLLL.setValue(null);
        }
    }
}
