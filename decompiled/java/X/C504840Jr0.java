package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.CommentPageResponse;

/* JADX INFO: renamed from: X.0Jr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504840Jr0 extends C502700JnY {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final View LLILZLL;

    public final void U5(final C504920Jr8 c504920Jr8) {
        boolean z;
        C503200JoM c503200JoM;
        ArrayList<AbstractC503810JpL> arrayList;
        C504760Jqs c504760Jqs = this.LLILLJJLI.LLILZ;
        if (c504760Jqs != null && (c503200JoM = c504760Jqs.LLILLL) != null && (arrayList = c503200JoM.LL) != null) {
            Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC503810JpL next = it2.next();
                if (next instanceof C504910Jr7) {
                    C504910Jr7 c504910Jr7 = (C504910Jr7) next;
                    if (c504910Jr7.LIZJ() != EnumC503250JoR.COMMENT && c504910Jr7.LIZLLL() == c504920Jr8.LIZLLL()) {
                        if (i >= 0) {
                            z = true;
                        }
                    }
                }
                i++;
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLJJJJ(this.LLILZIL, 0);
            C786410Ut5.l8(this.LLILZIL, new View.OnClickListener() { // from class: X.0Jr1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C503200JoM c503200JoM2;
                    ArrayList<AbstractC503810JpL> arrayList2;
                    SubSpaceDetailVM subSpaceDetailVM = this.LL.LLILLJJLI;
                    C504920Jr8 c504920Jr82 = c504920Jr8;
                    C504760Jqs c504760Jqs2 = subSpaceDetailVM.LLILZ;
                    if (c504760Jqs2 != null && (c503200JoM2 = c504760Jqs2.LLILLL) != null && (arrayList2 = c503200JoM2.LL) != null) {
                        Iterator<AbstractC503810JpL> it3 = arrayList2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                AbstractC503810JpL next2 = it3.next();
                                if (next2 instanceof C504910Jr7) {
                                    C504910Jr7 c504910Jr72 = (C504910Jr7) next2;
                                    if (c504910Jr72.LIZJ() == EnumC503250JoR.COMMENT && c504910Jr72.LIZLLL() == c504920Jr82.LIZLLL()) {
                                        break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        if (numValueOf.intValue() >= 0 && 1 != 0) {
                            int iIntValue = numValueOf.intValue();
                            Integer numValueOf2 = Integer.valueOf(arrayList2.indexOf(c504920Jr82));
                            if (numValueOf2.intValue() > iIntValue) {
                                int i3 = iIntValue + 1;
                                List listLLIIII = C13LP.LLIIII(arrayList2.subList(i3, numValueOf2.intValue()));
                                arrayList2.removeAll(C13LP.LLIIJI(listLLIIII));
                                C503200JoM c503200JoM3 = c504760Jqs2.LLILLL;
                                if (c503200JoM3 != null) {
                                    c503200JoM3.notifyItemRangeRemoved(i3, listLLIIII.size());
                                }
                                c504920Jr82.LIZJ = 0L;
                                c504920Jr82.LIZIZ = c504920Jr82.LIZLLL;
                                C503200JoM c503200JoM4 = c504760Jqs2.LLILLL;
                                if (c503200JoM4 != null) {
                                    c503200JoM4.notifyItemChanged(i3);
                                }
                            }
                        }
                    }
                }
            });
        } else {
            C786410Ut5.LLJJJJ(this.LLILZIL, 8);
        }
        if (c504920Jr8.LIZIZ > 0) {
            this.LLILZ.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131844302), Arrays.copyOf(new Object[]{C474270Iin.LIZIZ(c504920Jr8.LIZIZ)}, 1)));
            C786410Ut5.LLJJJJ(this.LLILZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LLILZLL);
        } else {
            C786410Ut5.LLJJJJ(this.LLILZ, 4);
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        }
        C786410Ut5.LJJJJI(this.LLILLL);
    }

    public C504840Jr0(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (ViewGroup) view.findViewById(R.id.nlo);
        this.LLILZ = (C16F5) view.findViewById(R.id.a50);
        this.LLILZIL = (C16F5) view.findViewById(R.id.a3b);
        this.LLILZLL = view.findViewById(R.id.view_more_comment_divider);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C504920Jr8 c504920Jr8;
        if ((abstractC503810JpL instanceof C504920Jr8) && (c504920Jr8 = (C504920Jr8) abstractC503810JpL) != null) {
            U5(c504920Jr8);
            C786410Ut5.l8(this.LLILZ, new View.OnClickListener() { // from class: X.0Jqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C504880Jr4 c504880Jr4;
                    SpacePost spacePost;
                    C504840Jr0 c504840Jr0 = this.LL;
                    c504840Jr0.getClass();
                    c504840Jr0.LLILLL.addView(new C16FZ(c504840Jr0.LL.getContext(), null));
                    C786410Ut5.LJLZ(0, c504840Jr0.LLILLL);
                    C786410Ut5.LLJJJJ(c504840Jr0.LLILZIL, 8);
                    C786410Ut5.LLJJJJ(c504840Jr0.LLILZ, 4);
                    C786410Ut5.LJLLLLLL(8, c504840Jr0.LLILZLL);
                    C504840Jr0 c504840Jr02 = this.LL;
                    SubSpaceDetailVM subSpaceDetailVM = c504840Jr02.LLILLJJLI;
                    final C504920Jr8 c504920Jr82 = c504920Jr8;
                    final C505530Js7 c505530Js7 = new C505530Js7();
                    final C505000JrG c505000JrG = new C505000JrG(c504840Jr02, c504920Jr82);
                    final C504760Jqs c504760Jqs = subSpaceDetailVM.LLILZ;
                    if (c504760Jqs != null && (c504880Jr4 = c504760Jqs.LLILLJJLI) != null && (spacePost = c504880Jr4.LLILLL) != null) {
                        long j = spacePost.postId;
                        long j2 = c504920Jr82.LIZJ;
                        String str = c504880Jr4.LLJIJIL;
                        if (str != null) {
                            int value = EnumC504930Jr9.REPLY.getValue();
                            long jLIZLLL = c504920Jr82.LIZLLL();
                            C480460Ism.LIZ().getClass();
                            C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getCommentPages(j, j2, str, value, jLIZLLL), EnumC510330Jzr.GENERAL, C504760Jqs.class.getSimpleName(), "sub/space/comment/page", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(c504760Jqs.LL));
                            if (c0j1n != null) {
                                c0j1n.LIZ(new C09JN() { // from class: X.0Jqx
                                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        ArrayList<AbstractC503810JpL> arrayList;
                                        ArrayList<AbstractC503810JpL> arrayList2;
                                        SpacePost spacePost2;
                                        C1C7U.LIZ("DetailFeedManager@154d.loadNextReply$1");
                                        c505530Js7.invoke();
                                        CommentPageResponse.ResponseData responseData = (CommentPageResponse.ResponseData) ((BaseResponse) obj).data;
                                        if (responseData != null) {
                                            C504760Jqs c504760Jqs2 = c504760Jqs;
                                            C504920Jr8 c504920Jr83 = c504920Jr82;
                                            SpaceCommentItem spaceCommentItem = c504920Jr83.LIZ;
                                            c504760Jqs2.getClass();
                                            c504920Jr83.LIZJ = responseData.offset;
                                            C503200JoM c503200JoM = c504760Jqs2.LLILLL;
                                            if (c503200JoM != null && (arrayList = c503200JoM.LL) != null) {
                                                int iIndexOf = arrayList.indexOf(c504920Jr83);
                                                if (iIndexOf > 0) {
                                                    ListProtector.remove(arrayList, iIndexOf);
                                                    C503200JoM c503200JoM2 = c504760Jqs2.LLILLL;
                                                    if (c503200JoM2 != null) {
                                                        c503200JoM2.notifyItemRemoved(iIndexOf);
                                                    }
                                                }
                                                ListIterator<AbstractC503810JpL> listIterator = arrayList.listIterator(arrayList.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        break;
                                                    }
                                                    AbstractC503810JpL abstractC503810JpLPrevious = listIterator.previous();
                                                    if ((abstractC503810JpLPrevious instanceof C504910Jr7) && ((C504910Jr7) abstractC503810JpLPrevious).LIZLLL() == c504920Jr83.LIZLLL()) {
                                                        int iNextIndex = listIterator.nextIndex();
                                                        if (iNextIndex >= 0) {
                                                            List<SpaceCommentItem> list = responseData.commentList;
                                                            ArrayList arrayList3 = new ArrayList();
                                                            C503200JoM c503200JoM3 = c504760Jqs2.LLILLL;
                                                            if (c503200JoM3 != null && (arrayList2 = c503200JoM3.LL) != null) {
                                                                for (SpaceCommentItem spaceCommentItem2 : list) {
                                                                    Iterator<AbstractC503810JpL> it2 = arrayList2.iterator();
                                                                    int i = 0;
                                                                    while (true) {
                                                                        if (!it2.hasNext()) {
                                                                            break;
                                                                        }
                                                                        AbstractC503810JpL next = it2.next();
                                                                        if ((next instanceof C504910Jr7) && ((C504910Jr7) next).LIZ.commentId == spaceCommentItem2.commentId) {
                                                                            if (i >= 0) {
                                                                            }
                                                                        } else {
                                                                            i++;
                                                                        }
                                                                    }
                                                                    spaceCommentItem2.replyCommentInfo = spaceCommentItem;
                                                                    C504880Jr4 c504880Jr42 = c504760Jqs2.LLILLJJLI;
                                                                    if (c504880Jr42 != null) {
                                                                        spacePost2 = c504880Jr42.LLILLL;
                                                                    } else {
                                                                        spacePost2 = null;
                                                                    }
                                                                    arrayList3.add(new C504910Jr7(spaceCommentItem2, spacePost2));
                                                                }
                                                            }
                                                            int i2 = iNextIndex + 1;
                                                            arrayList.addAll(i2, arrayList3);
                                                            long jLIZLLL2 = c504920Jr83.LIZLLL();
                                                            ArrayList arrayList4 = new ArrayList();
                                                            for (AbstractC503810JpL abstractC503810JpL2 : arrayList) {
                                                                AbstractC503810JpL abstractC503810JpL3 = abstractC503810JpL2;
                                                                if (abstractC503810JpL3 instanceof C504910Jr7) {
                                                                    C504910Jr7 c504910Jr7 = (C504910Jr7) abstractC503810JpL3;
                                                                    if (c504910Jr7.LIZJ() != EnumC503250JoR.COMMENT && c504910Jr7.LIZLLL() == jLIZLLL2) {
                                                                        arrayList4.add(abstractC503810JpL2);
                                                                    }
                                                                }
                                                            }
                                                            int size = arrayList4.size();
                                                            long j3 = responseData.totalCount;
                                                            c504920Jr83.LIZIZ = j3 - ((long) size);
                                                            c504920Jr83.LIZLLL = j3;
                                                            ListProtector.add(arrayList, arrayList3.size() + i2, c504920Jr83);
                                                            C503200JoM c503200JoM4 = c504760Jqs2.LLILLL;
                                                            if (c503200JoM4 != null) {
                                                                c503200JoM4.notifyItemRangeInserted(i2, arrayList3.size() + 1);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C1C7U.LIZIZ("DetailFeedManager@154d.loadNextReply$1");
                                    }
                                }, new C09JN() { // from class: X.07xq
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        C1C7U.LIZ("DetailFeedManager@154d.loadNextReply$2");
                                        c505000JrG.invoke(obj);
                                        C1C7U.LIZIZ("DetailFeedManager@154d.loadNextReply$2");
                                    }
                                });
                            }
                        }
                    }
                }
            });
        }
    }
}
