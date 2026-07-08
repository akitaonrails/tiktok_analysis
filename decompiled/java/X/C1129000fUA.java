package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0fUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129000fUA {
    public final Function0<InterfaceC497601wk> LIZ;
    public final AbstractC2252651DEx LIZIZ;
    public final CoroutineExceptionHandler LIZJ;
    public final Function0<C1127050fR1> LIZLLL;
    public final Function0<InterfaceC1127990fSX> LJ;
    public AnonymousClass0956 LJFF;
    public long LJI;

    public final void LIZIZ() {
        this.LJI++;
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        C1127050fR1 c1127050fR1Invoke = this.LIZLLL.invoke();
        if (c1127050fR1Invoke != null) {
            long j = c1127050fR1Invoke.LLILZLL;
            c1127050fR1Invoke.LLILZLL = 0L;
            c1127050fR1Invoke.LLIZ = EnumC1142140fpM.IDLE;
            c1127050fR1Invoke.LLLILZLLLI(j);
        }
    }

    public static void LIZ(AbstractC1126600fQI abstractC1126600fQI) {
        Gift gift;
        Gift.MusicGiftInfo musicGiftInfo;
        long j;
        T t = abstractC1126600fQI.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null || !abstractC1126600fQI.LJIJJLI() || (musicGiftInfo = gift.musicInfo) == null) {
            return;
        }
        Gift.MusicGiftInfo.AudioResource audioResource = musicGiftInfo.resource;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preview intent giftId=");
        sbLIZ.append(gift.id);
        sbLIZ.append(", songId=");
        sbLIZ.append(musicGiftInfo.songId);
        sbLIZ.append(", moodId=");
        sbLIZ.append(musicGiftInfo.moodId);
        sbLIZ.append(", snippetId=");
        if (audioResource != null) {
            j = audioResource.snippetId;
        } else {
            j = 0;
        }
        sbLIZ.append(j);
        C20441214yg.LIZIZ("MusicGift", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(AbstractC1126600fQI abstractC1126600fQI) {
        if (abstractC1126600fQI.LJIJJLI()) {
            return;
        }
        C1142070fpF.LIZ.getClass();
        C1142020fpA c1142020fpA = (C1142020fpA) C1142070fpF.LJIILIIL.getValue();
        if (c1142020fpA.LIZ != null) {
            EnumC1142140fpM enumC1142140fpM = c1142020fpA.LIZJ;
            if (enumC1142140fpM != EnumC1142140fpM.LOADING && enumC1142140fpM != EnumC1142140fpM.PLAYING) {
                return;
            }
            C1142070fpF.LJIILLIIL();
        }
    }

    public C1129000fUA(AwS561S0100000_17 awS561S0100000_17, AbstractC2252651DEx abstractC2252651DEx, C522020Kdc c522020Kdc, AwS561S0100000_17 awS561S0100000_172, AwS561S0100000_17 awS561S0100000_173) {
        this.LIZ = awS561S0100000_17;
        this.LIZIZ = abstractC2252651DEx;
        this.LIZJ = c522020Kdc;
        this.LIZLLL = awS561S0100000_172;
        this.LJ = awS561S0100000_173;
    }
}
