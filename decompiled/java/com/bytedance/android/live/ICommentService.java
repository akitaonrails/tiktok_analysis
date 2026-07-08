package com.bytedance.android.live;

import X.C006A;
import X.C0JCN;
import X.C1115500f8O;
import X.C497590JfJ;
import X.InterfaceC1114710f77;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ICommentService extends C006A {
    Class<? extends LiveRecyclableWidget> EW0();

    void H42(InterfaceC1114710f77 interfaceC1114710f77);

    Class<? extends LiveRecyclableWidget> KK1();

    List<C1115500f8O> Mf1();

    void Pv1(long j, List list, ISendCommentEvent.Sender sender);

    Class<? extends LiveRecyclableWidget> TO0();

    void bF1(InterfaceC1114710f77 interfaceC1114710f77);

    C497590JfJ kz2();

    void oJ1(DataChannel dataChannel);

    void sj2(Context context, DataChannel dataChannel);

    void su2(FragmentManager fragmentManager, C0JCN c0jcn, DataChannel dataChannel, SpaceCommentItem spaceCommentItem, SpacePost spacePost, int i, boolean z);

    void vF2(long j, String str, String str2, int i, ISendCommentEvent.Sender sender);
}
