package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZ5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "messageListFooterViewModel", "<v#0>", 1);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C0ZZ5.class, "streakVM", "<v#1>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(C0ZZ5.class, "collapseInlineVM", "<v#6>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(C0ZZ5.class, "messageListViewModel", "<v#17>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(C0ZZ5.class, "networkStateViewModel", "<v#28>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(C0ZZ5.class, "liveCardViewModel", "<v#30>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU7 = new C2217401BqU(C0ZZ5.class, "panelStateVM", "<v#31>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU8 = new C2217401BqU(C0ZZ5.class, "addStickerToFavVM", "<v#34>", 1);
        c09r3.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7, c2217401BqU8};
    }

    public static final EmojiGameInfo LIZ(InterfaceC461380I7k interfaceC461380I7k) {
        String str;
        String str2;
        ImageComponent imageComponent;
        List<String> list;
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        BaseRequestComponent baseRequestComponent2;
        QueryDataComponent queryDataComponent2;
        Map<String, String> map2;
        if (interfaceC461380I7k instanceof InterfaceC461490I7v) {
            return new EmojiGameInfo(0, ((InterfaceC461490I7v) interfaceC461380I7k).LJIILL().toString(), null);
        }
        if (interfaceC461380I7k instanceof C0ZS8) {
            return new EmojiGameInfo(0, ((C0ZS8) interfaceC461380I7k).LJIILL().toString(), null);
        }
        String str3 = null;
        if (!(interfaceC461380I7k instanceof C0ICT)) {
            return null;
        }
        C0ICT c0ict = (C0ICT) interfaceC461380I7k;
        StickerTemplate content = c0ict.getContent();
        if (content != null && (baseRequestComponent2 = content.baseRequestComponent) != null && (queryDataComponent2 = baseRequestComponent2.queryData) != null && (map2 = queryDataComponent2.extras) != null) {
            str = map2.get("a:sticker_id");
        } else {
            str = null;
        }
        StickerTemplate content2 = c0ict.getContent();
        if (content2 != null && (baseRequestComponent = content2.baseRequestComponent) != null && (queryDataComponent = baseRequestComponent.queryData) != null && (map = queryDataComponent.extras) != null) {
            str2 = map.get("a:sticker_set_id");
        } else {
            str2 = null;
        }
        StickerTemplate content3 = c0ict.getContent();
        if (content3 != null && (imageComponent = content3.imageComponent) != null && (list = imageComponent.urls) != null) {
            str3 = (String) C13LP.LJJJLZIJ(0, list);
        }
        return new EmojiGameInfo(1, null, new StickerMatchStruct(str2, str, str3));
    }

    public static final String LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if (!(layoutManager instanceof ChatLinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return null;
        }
        List<InterfaceC1891350zJl> listLJII = viewOnAttachStateChangeListenerC20604515jv.getState().LJII();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindLastCompletelyVisibleItemPosition >= 0 && iFindFirstCompletelyVisibleItemPosition >= 0 && iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
            while (true) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(iFindFirstCompletelyVisibleItemPosition, listLJII);
                if (interfaceC1891350zJl instanceof C0ZZ9) {
                    C0ZZ3 c0zz3LJJJLL = ((C0ZZ9) interfaceC1891350zJl).LJJJLL();
                    if ((c0zz3LJJJLL instanceof C0ZZB) && ((C0ZZB) c0zz3LJJJLL).LIZJ.LIZ.liveSubOnly == 0) {
                        return C0I6Y.LIZ((InterfaceC461380I7k) interfaceC1891350zJl).getUuid();
                    }
                }
                if (iFindFirstCompletelyVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
                    break;
                }
                iFindFirstCompletelyVisibleItemPosition++;
            }
        }
        return null;
    }

    public static final LiveCardViewModel LIZJ(AssemVMLazy<InterfaceC0148002o, LiveCardViewModel> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        return (LiveCardViewModel) assemVMLazy.getValue();
    }

    public static final ChatRoomStreakViewModel LIZLLL(AssemVMLazy<C06PY, ChatRoomStreakViewModel> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        return (ChatRoomStreakViewModel) assemVMLazy.getValue();
    }
}
