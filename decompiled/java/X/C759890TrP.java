package X;

import com.bytedance.android.livesdk.chatroom.model.AddableReplay;
import com.bytedance.android.livesdk.chatroom.model.GetPlaylistAddableItemData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mix.model.MixCandidateVideosResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistDataManager$getPlaylistData$1$1", f = "LiveReplayPlaylistDataManager.kt", l = {}, m = "invokeSuspend")
public final class C759890TrP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C470590Icr<GetPlaylistAddableItemData> LL;
    public final /* synthetic */ InterfaceC759900TrQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759890TrP(C470590Icr<GetPlaylistAddableItemData> c470590Icr, InterfaceC759900TrQ interfaceC759900TrQ, InterfaceC1364105Vn<? super C759890TrP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c470590Icr;
        this.LLILLJJLI = interfaceC759900TrQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759890TrP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayPlaylistDataManager@3a1a.getPlaylistData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GetPlaylistAddableItemData getPlaylistAddableItemData = this.LL.data;
        if (getPlaylistAddableItemData != null) {
            InterfaceC759900TrQ interfaceC759900TrQ = this.LLILLJJLI;
            MixCandidateVideosResponse mixCandidateVideosResponse = new MixCandidateVideosResponse();
            List<AddableReplay> list = getPlaylistAddableItemData.replays;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (AddableReplay addableReplay : list) {
                Aweme aweme = new Aweme();
                aweme.setAid(String.valueOf(addableReplay.itemId));
                Video video = new Video();
                if (C08A4.LIZIZ(C2286608xc.LJFF(addableReplay.mixId))) {
                    PlayListInfo playListInfo = new PlayListInfo();
                    playListInfo.setMixId(String.valueOf(addableReplay.mixId));
                    aweme.playlist_info = playListInfo;
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(new ArrayList());
                urlModel.getUrlList().add(addableReplay.coverUrl);
                video.setCover(urlModel);
                aweme.setVideo(video);
                arrayList.add(aweme);
            }
            mixCandidateVideosResponse.setMixVideos(arrayList);
            mixCandidateVideosResponse.setHasMore(getPlaylistAddableItemData.hasMore);
            mixCandidateVideosResponse.setMaxCursor(getPlaylistAddableItemData.nextCursor);
            interfaceC759900TrQ.LIZ(mixCandidateVideosResponse);
        } else {
            this.LLILLJJLI.onFailure();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.getPlaylistData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
