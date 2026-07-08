package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptPlaybackViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSI extends C09AY implements Function2<String, C2230008oU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ IMVoiceTranscriptPlaybackViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ C899820ZRs LLILZIL;
    public final /* synthetic */ SessionInfo LLILZLL;
    public final /* synthetic */ C0ZSJ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZSI(String str, IMVoiceTranscriptPlaybackViewModel iMVoiceTranscriptPlaybackViewModel, Context context, C869590Y9l c869590Y9l, C899820ZRs c899820ZRs, SessionInfo sessionInfo, C0ZSJ c0zsj) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = iMVoiceTranscriptPlaybackViewModel;
        this.LLILLL = context;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = c899820ZRs;
        this.LLILZLL = sessionInfo;
        this.LLIZ = c0zsj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, C2230008oU c2230008oU) {
        C2230008oU c2230008oU2 = c2230008oU;
        IMVoiceMessageUtil.LIZ.getClass();
        if (Intrinsics.LJFF(IMVoiceMessageUtil.LIZLLL, this.LL)) {
            this.LLILLJJLI.wQ2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, c2230008oU2);
        }
        return Unit.LIZ;
    }
}
