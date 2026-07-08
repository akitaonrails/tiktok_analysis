package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BroadcastResumeInfo;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0UP1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UP1 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ DialogC780480UjW LL;
    public final /* synthetic */ LiveMode LLILLJJLI;
    public final /* synthetic */ Room LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ C772320URi LLILZIL;
    public final /* synthetic */ C772320URi LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;
    public final /* synthetic */ BroadcastResumeInfo LLJI;
    public final /* synthetic */ Fragment LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UP1(DialogC780480UjW dialogC780480UjW, LiveMode liveMode, Room room, DataChannel dataChannel, C772320URi c772320URi, C772320URi c772320URi2, long j, Context context, C013C c013c, BroadcastResumeInfo broadcastResumeInfo, Integer num, Fragment fragment) {
        super(1);
        this.LL = dialogC780480UjW;
        this.LLILLJJLI = liveMode;
        this.LLILLL = room;
        this.LLILZ = dataChannel;
        this.LLILZIL = c772320URi;
        this.LLILZLL = c772320URi2;
        this.LLIZ = j;
        this.LLIZLLLIL = context;
        this.LLJ = c013c;
        this.LLJI = broadcastResumeInfo;
        this.LLJIJIL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        GameTag gameTag;
        Long l;
        List<GameTag> list;
        Hashtag hashtag;
        C500260Jjc.LJJLIIIJL(this.LL);
        if (bool.booleanValue()) {
            if (C781520UlC.LJI(this.LLILLJJLI)) {
                Room room = this.LLILLL;
                if (room != null && (hashtag = room.hashtag) != null) {
                    this.LLILZ.zW(HashtagChangedChannel.class, hashtag);
                }
                Room room2 = this.LLILLL;
                if (room2 != null && (list = room2.gameTags) != null) {
                    gameTag = (GameTag) C13LP.LJJJLZIJ(0, list);
                } else {
                    gameTag = null;
                }
                PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                Room room3 = this.LLILLL;
                DataChannel dataChannel = this.LLILZ;
                C772320URi c772320URi = this.LLILZIL;
                C772320URi c772320URi2 = this.LLILZLL;
                long j = this.LLIZ;
                previewContinueLiveHelper.getClass();
                PreviewContinueLiveHelper.LJIIIIZZ(room3, dataChannel, c772320URi, c772320URi2, j);
                if (gameTag != null && (l = gameTag.id) != null) {
                    DataChannel dataChannel2 = this.LLILZ;
                    Fragment fragment = this.LLJIJIL;
                    Room room4 = this.LLILLL;
                    GameTag gameTagY61 = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).y61(dataChannel2, fragment, l.longValue());
                    if (gameTagY61 != null) {
                        gameTag = gameTagY61;
                    }
                    EnumC754690Tj1.SCREEN_RECORD.updateHashTagGameTag(room4.hashtag, gameTag);
                }
            }
            PreviewContinueLiveHelper previewContinueLiveHelper2 = PreviewContinueLiveHelper.LIZ;
            LiveMode liveMode = this.LLILLJJLI;
            DataChannel dataChannel3 = this.LLILZ;
            Context context = this.LLIZLLLIL;
            boolean z = this.LLJ.element;
            Room room5 = this.LLILLL;
            BroadcastResumeInfo broadcastResumeInfo = this.LLJI;
            Fragment fragment2 = this.LLJIJIL;
            C772320URi c772320URi3 = this.LLILZIL;
            C772320URi c772320URi4 = this.LLILZLL;
            long j2 = this.LLIZ;
            previewContinueLiveHelper2.getClass();
            PreviewContinueLiveHelper.LIZLLL(liveMode, dataChannel3, context, z, room5, broadcastResumeInfo, fragment2, true, c772320URi3, c772320URi4, j2);
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841531));
        }
        return Unit.LIZ;
    }
}
