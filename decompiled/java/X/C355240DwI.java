package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEAudioBeatTracking;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355240DwI implements InterfaceC355180DwC {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final InterfaceC497601wk LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(404));
    public AnonymousClass0956 LJ;
    public NLEAudioBeatTracking LJFF;
    public InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super List<BeatInfo>, Unit> LJI;
    public AVMusic LJII;
    public long LJIIIIZZ;

    @Override // X.InterfaceC355180DwC
    public final void hb() {
        if (this.LJ == null) {
            return;
        }
        NLEAudioBeatTracking nLEAudioBeatTracking = this.LJFF;
        if (nLEAudioBeatTracking != null) {
            nLEAudioBeatTracking.notifyStop();
        }
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super List<BeatInfo>, Unit> interfaceC1631620sYq = this.LJI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Boolean.FALSE, Boolean.TRUE, C13BV.INSTANCE);
        }
        this.LJ = null;
        this.LJI = null;
        this.LJFF = null;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
        AVMusic aVMusic = this.LJII;
        if (aVMusic != null) {
            LIZLLL(false, -1, aVMusic, EnumC356040Dxa.NONE, jCurrentTimeMillis);
        }
        C356530DyN.LIZ(C0E5P.LIZIZ, "cancelGenerate: call");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C355260DwK
            if (r0 == 0) goto L9c
            r6 = r9
            X.0DwK r6 = (X.C355260DwK) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r0 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r2 = r6.LLILZ
            r5 = 2
            r1 = 1
            if (r2 == 0) goto L47
            if (r2 == r1) goto L7b
            if (r2 != r5) goto La3
            boolean r4 = r6.LL
            X.C155000ia.LIZIZ(r0)
        L27:
            java.lang.String r0 = (java.lang.String) r0
        L29:
            X.0E5P r3 = X.C0E5P.LIZIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "fetchAlgorithmModel2: isSuccess:"
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "  path:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            X.C356530DyN.LIZ(r3, r1)
            return r0
        L47:
            X.C155000ia.LIZIZ(r0)
            r6.LLILZ = r1
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r4.<init>(r1, r0)
            r4.LJIJJ()
            com.ss.android.ugc.effectmanager.DownloadableModelSupport r3 = com.ss.android.ugc.effectmanager.DownloadableModelSupport.getInstance()
            java.lang.String r0 = "bt_espresso_mobile_offline"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            X.08z8 r1 = new X.08z8
            r1.<init>()
            r0 = 0
            r3.fetchResourcesWithModelNames(r0, r2, r1)
            java.lang.Object r0 = r4.LJIJ()
            java.lang.Object r1 = X.C099R.LJFF()
            if (r0 != r1) goto L78
            X.C099Q.LIZJ(r6)
        L78:
            if (r0 != r7) goto L7e
            return r7
        L7b:
            X.C155000ia.LIZIZ(r0)
        L7e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L99
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0DwO r1 = new X.0DwO
            r0 = 0
            r1.<init>(r0)
            r6.LL = r4
            r6.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r7) goto L27
            return r7
        L99:
            java.lang.String r0 = ""
            goto L29
        L9c:
            X.0DwK r6 = new X.0DwK
            r6.<init>(r8, r9)
            goto L12
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355240DwI.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final Function1<String, List<BeatInfo>> LIZJ(AVMusic aVMusic, String str) {
        if (Intrinsics.LJFF(str, aVMusic.getStickPointMusicAlg().getDownBeatsPath())) {
            return new C355150Dw9(this);
        }
        if (Intrinsics.LJFF(str, aVMusic.getStickPointMusicAlg().getNoStrengthBeatsPath())) {
            return new C355140Dw8(this);
        }
        if (Intrinsics.LJFF(str, aVMusic.getStickPointMusicAlg().getVeBeatsPath())) {
            return new C355160DwA(this);
        }
        return AFwS234S0000000_5.get$arr$(562);
    }

    public C355240DwI(InterfaceC497601wk interfaceC497601wk, Context context, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = context;
        this.LIZJ = videoPublishEditModel;
    }

    public static void LIZLLL(boolean z, int i, AVMusic aVMusic, EnumC356040Dxa enumC356040Dxa, long j) {
        String str;
        C0LAB c0lab = new C0LAB();
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("music_id", aVMusic.getMusicId());
        c0lab.LJ("music_name", aVMusic.musicName);
        c0lab.LIZ(aVMusic.getDuration(), "music_duration");
        c0lab.LJ("duration", String.valueOf(j));
        String str2 = "";
        if (!z) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        str2 = "user_cancel";
                    }
                } else {
                    str2 = "net_error";
                }
            } else {
                str2 = "algorithm_error";
            }
            c0lab.LJ("error_msg", str2);
        } else {
            int i2 = C355270DwL.LIZ[enumC356040Dxa.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str2 = "local_algorithm";
                    }
                } else {
                    str2 = "music_info";
                }
            } else {
                str2 = "local_cache";
            }
            c0lab.LJ("get_from", str2);
        }
        C20684815ws.LJIILLIIL("auto_beat_loading_success", c0lab.LIZ);
    }

    @Override // X.InterfaceC355180DwC
    public final void LIZ(NLESegmentAudio nLESegmentAudio, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super List<BeatInfo>, Unit> interfaceC1631620sYq, EnumC355940DxQ enumC355940DxQ, Function1<? super List<BeatInfo>, ? extends List<BeatInfo>> function1, Function1<? super List<BeatInfo>, ? extends List<BeatInfo>> function12) {
        this.LJI = interfaceC1631620sYq;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C355220DwG(function0, this, interfaceC1631620sYq, enumC355940DxQ, function02, function1, nLESegmentAudio, function12, null), 2);
    }
}
