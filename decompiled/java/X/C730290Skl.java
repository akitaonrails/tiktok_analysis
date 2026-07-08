package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS33S0310000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Skl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C730290Skl extends C2217421BqW implements Function1<List<C730370Skt>, Unit> {
    public C730290Skl(Object obj) {
        super(1, obj, C730300Skm.class, "secretRepliesStickerDataUpdate", "secretRepliesStickerDataUpdate(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<C730370Skt> list) {
        List arrayList;
        InterfaceC1891350zJl interfaceC1891350zJl;
        int i;
        String aid;
        C1C1T c1c1t;
        C1C1Q c1c1q;
        C1518210pbv c1518210pbv;
        String str;
        List<C730370Skt> list2 = list;
        C730300Skm c730300Skm = (C730300Skm) this.receiver;
        C730280Skk c730280Skk = c730300Skm.LIZIZ().LLJILJIL;
        if (c730280Skk == null || (arrayList = c730280Skk.LL) == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C730370Skt> it2 = list2.iterator();
        while (true) {
            interfaceC1891350zJl = null;
            if (!it2.hasNext()) {
                break;
            }
            C730370Skt next = it2.next();
            Aweme aweme = c730300Skm.LIZIZ;
            String str2 = "";
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            String str3 = next.LIZIZ.replyId;
            Aweme aweme2 = next.LIZ;
            if (aweme2 != null && C730150SkX.LIZIZ(aweme2) && (c1c1t = C2203191BKr.LIZ(aweme2).socialBlob) != null && (c1c1q = c1c1t.secret_reply_blob) != null && (c1518210pbv = c1c1q.secret_reply_sticker_blob) != null && (str = c1518210pbv.prompt_text) != null) {
                str2 = str;
            }
            arrayList2.add(new C730340Skq(aid, str3, str2, next.LIZIZ.replyText));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            C730340Skq c730340Skq = (C730340Skq) obj;
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(((C730340Skq) it3.next()).LLILLJJLI, c730340Skq.LLILLJJLI)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj);
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C730280Skk(arrayList, c730300Skm.LIZIZ));
        C737640Swc c737640SwcLIZIZ = c730300Skm.LIZIZ();
        c737640SwcLIZIZ.LLILZLL.LIZLLL(arrayList4, null);
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) C13LP.LJJJLL(arrayList4);
        if (interfaceC1891350zJl2 instanceof C730280Skk) {
            interfaceC1891350zJl = interfaceC1891350zJl2;
        }
        if (interfaceC1891350zJl != null) {
            C730280Skk c730280Skk2 = (C730280Skk) interfaceC1891350zJl2;
            c737640SwcLIZIZ.LLJILJIL = c730280Skk2;
            int size = c730280Skk2.LL.size();
            TuxTextView tuxTextView = (TuxTextView) c737640SwcLIZIZ.LLJIJIL.getValue();
            if (size > 1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (size > 0) {
                C786410Ut5.LJLLLLLL(0, c737640SwcLIZIZ.cP());
                c737640SwcLIZIZ.LJII(c737640SwcLIZIZ.cP());
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("action_type", "show");
                C20684815ws.LJIILLIIL("secret_reply_views_list_panel", c0lab.LIZ);
            } else {
                C786410Ut5.LJLLLLLL(8, c737640SwcLIZIZ.cP());
                c737640SwcLIZIZ.LJIJJLI(c737640SwcLIZIZ.cP());
            }
            AssemVMLazy assemVMLazy = c737640SwcLIZIZ.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737640Swc.LLJJ;
            StoryViewerListViewModel storyViewerListViewModel = (StoryViewerListViewModel) assemVMLazy.getValue();
            storyViewerListViewModel.withState(new AwS33S0310000_11(storyViewerListViewModel, (StoryViewerListViewModel) true, (boolean) c730280Skk2.LL, (List<C730340Skq>) c737640SwcLIZIZ.LLJILLL, (Aweme) 2));
        } else {
            C786410Ut5.LJLLLLLL(8, c737640SwcLIZIZ.cP());
            c737640SwcLIZIZ.LJIJJLI(c737640SwcLIZIZ.cP());
        }
        c730300Skm.LIZIZ().LLJILJILJ = Integer.valueOf(((InterfaceC730270Skj) c730300Skm.LJII.getValue()).LJ());
        return Unit.LIZ;
    }
}
