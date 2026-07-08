package X;

import Y.AObserverS220S0100000_16;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubSuperFanFeedPreviewUseLocalTextSettings;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPreviewInfoSimplifyEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AB0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AB0 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AB0(LabelContainerWidget labelContainerWidget) {
        super(1);
        this.LL = labelContainerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        String str;
        List<User> list;
        LiveRoomStruct liveRoomStruct;
        LivePreviewPlayerVM livePreviewPlayerVMS1;
        NextLiveData nextLiveData;
        LiveRoomStruct liveRoomStruct2;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list2;
        FeedRoomTag feedRoomTag;
        LiveRoomStruct liveRoomStruct3;
        String str2;
        LiveRoomStruct liveRoomStruct4;
        C1ACA c1acaZ1;
        if (bool.booleanValue()) {
            LabelContainerWidget labelContainerWidget = this.LL;
            C786410Ut5.LJZL(0, labelContainerWidget.Q1());
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            ViewGroup.LayoutParams layoutParams = labelContainerWidget.Q1().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ;
            }
            ViewGroup.LayoutParams layoutParams2 = labelContainerWidget.X1().getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iLIZIZ;
            }
            labelContainerWidget.Q1().setBackgroundResource(R.drawable.aki);
            labelContainerWidget.a2().setBackgroundResource(R.drawable.ap8);
            C786410Ut5.LLLLZLL(labelContainerWidget.R1(), 0);
            C786410Ut5.l((RemoteImageView) labelContainerWidget.LLJI.getValue(), 8);
            TuxTextView tuxTextViewR1 = labelContainerWidget.R1();
            C512350K7l c512350K7l = C512350K7l.LIZ;
            Context context = labelContainerWidget.context;
            c512350K7l.getClass();
            tuxTextViewR1.setText(C512350K7l.LIZIZ(2131841724, context));
            if (!LiveEventPreviewInfoSimplifyEnableSetting.INSTANCE.enable() && (c1acaZ1 = labelContainerWidget.z1()) != null && C1ABT.LJIIJ(c1acaZ1)) {
                labelContainerWidget.R1().setText(C512350K7l.LIZIZ(2131842723, labelContainerWidget.context));
            }
            C1ACA c1acaZ12 = labelContainerWidget.z1();
            String str3 = null;
            if (c1acaZ12 != null && (liveRoomStruct4 = c1acaZ12.LIZJ) != null) {
                str = liveRoomStruct4.linkMic;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    C1ACA c1acaZ13 = labelContainerWidget.z1();
                    if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null) {
                        str3 = liveRoomStruct.linkMic;
                    }
                    SlimRoom.LinkMic linkMic = (SlimRoom.LinkMic) C2183471Acr.LIZ(str3, new C2261501DfQ());
                    if (linkMic != null && (list = linkMic.followedList) != null && list.size() > 0) {
                        labelContainerWidget.R1().setText(labelContainerWidget.context.getString(2131842738));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C1ACA c1acaZ14 = labelContainerWidget.z1();
            if (c1acaZ14 != null && (liveRoomStruct3 = c1acaZ14.LIZJ) != null && (str2 = liveRoomStruct3.videoFeedTag) != null) {
                labelContainerWidget.R1().setText(str2);
                labelContainerWidget.e2(str2);
            }
            C1ACA c1acaZ15 = labelContainerWidget.z1();
            if (c1acaZ15 != null && (liveRoomStruct2 = c1acaZ15.LIZJ) != null && (feedRoomTagList = liveRoomStruct2.feedRoomTagList) != null && (list2 = feedRoomTagList.firstTags) != null && !list2.isEmpty() && (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list2)) != null) {
                String str4 = feedRoomTag.content;
                if (!TextUtils.isEmpty(str4)) {
                    labelContainerWidget.R1().setText(str4);
                    labelContainerWidget.e2(str4);
                    UrlModel urlModel = feedRoomTag.icon;
                    if (urlModel != null) {
                        C1324840ka2.LJFF((RemoteImageView) labelContainerWidget.LLJI.getValue(), urlModel);
                        C786410Ut5.l((RemoteImageView) labelContainerWidget.LLJI.getValue(), 0);
                    }
                }
            }
            labelContainerWidget.k2();
            if (LiveFansClubSuperFanFeedPreviewUseLocalTextSettings.INSTANCE.getValue() && (livePreviewPlayerVMS1 = labelContainerWidget.S1()) != null && (nextLiveData = livePreviewPlayerVMS1.LLJJIJIIJIL) != null) {
                nextLiveData.observe(labelContainerWidget, new AObserverS220S0100000_16(labelContainerWidget, 18));
            }
        } else {
            LabelContainerWidget labelContainerWidget2 = this.LL;
            C1AB2 c1ab2 = labelContainerWidget2.LLJJLIIIJLLLLLLLZ;
            if (c1ab2 != null) {
                c1ab2.cancel();
            }
            C1AB5 c1ab5 = labelContainerWidget2.LLJLILLLLZIIL;
            if (c1ab5 != null) {
                c1ab5.cancel();
            }
            C786410Ut5.LJZL(8, labelContainerWidget2.Q1());
            C786410Ut5.LJZ(8, labelContainerWidget2.X1());
            labelContainerWidget2.j2("liveDidEnd");
        }
        this.LL.LLJLIL = true;
        return Unit.LIZ;
    }
}
