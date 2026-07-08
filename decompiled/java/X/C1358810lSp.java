package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import defpackage.z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358810lSp implements InterfaceC1358860lSu {
    public final /* synthetic */ C1358820lSq LIZ;
    public final /* synthetic */ UpvotePanelListViewModel LIZIZ;

    @Override // X.InterfaceC1358860lSu
    public final void LIZ(Throwable th) {
        Exception exc;
        InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf = this.LIZ.LIZIZ;
        if (interfaceC20236714Gf == null) {
            interfaceC20236714Gf = null;
        }
        if (!interfaceC20236714Gf.isCancelled()) {
            InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf2 = this.LIZ.LIZIZ;
            if (interfaceC20236714Gf2 == null) {
                interfaceC20236714Gf2 = null;
            }
            if (!interfaceC20236714Gf2.isCompleted() && (th instanceof Exception) && (exc = (Exception) th) != null) {
                InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf3 = this.LIZ.LIZIZ;
                if (interfaceC20236714Gf3 == null) {
                    interfaceC20236714Gf3 = null;
                }
                AbstractC316870CbV.LIZ.getClass();
                interfaceC20236714Gf3.LJJIFFI(null, new C316650Cb9(exc));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.InterfaceC1358860lSu
    public final void LIZIZ(UpvoteList upvoteList) {
        ?? LJ;
        ?? arrayList;
        String str;
        String strLIZIZ;
        Fragment fragment;
        String uid;
        int size;
        int iMin;
        int i;
        String nickname;
        Comment comment;
        User user;
        int size2;
        int iMin2;
        int i2;
        String uid2;
        InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf = this.LIZ.LIZIZ;
        if (interfaceC20236714Gf == null) {
            interfaceC20236714Gf = null;
        }
        if (!interfaceC20236714Gf.isCancelled()) {
            InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf2 = this.LIZ.LIZIZ;
            if (interfaceC20236714Gf2 == null) {
                interfaceC20236714Gf2 = null;
            }
            if (!interfaceC20236714Gf2.isCompleted()) {
                ArrayList arrayList2 = new ArrayList();
                int i3 = 1;
                if (C298730BnL.LIZIZ()) {
                    List<UpvoteStruct> commentUpvotes = upvoteList.getCommentUpvotes();
                    ArrayList arrayList3 = new ArrayList();
                    for (UpvoteStruct upvoteStruct : commentUpvotes) {
                        if (upvoteStruct.carrierType == CarrierType.COMMENT.getValue()) {
                            arrayList3.add(upvoteStruct);
                        }
                    }
                    LJ = new LinkedHashMap();
                    for (Object obj : arrayList3) {
                        User user2 = ((UpvoteStruct) obj).user;
                        if (user2 == null || (uid2 = user2.getUid()) == null) {
                            uid2 = "";
                        }
                        Object arrayList4 = LJ.get(uid2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            LJ.put(uid2, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                List<UpvoteStruct> list = upvoteList.upvotes;
                UpvotePanelListViewModel upvotePanelListViewModel = this.LIZIZ;
                C1358820lSq c1358820lSq = this.LIZ;
                for (UpvoteStruct upvoteStruct2 : list) {
                    User user3 = upvoteStruct2.user;
                    if (user3 == null || (uid = user3.getUid()) == null) {
                        uid = "";
                    }
                    List list2 = (List) LJ.get(uid);
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    if ((!list2.isEmpty()) && !upvotePanelListViewModel.LLJJ.containsKey(uid)) {
                        List<UpvoteStruct> listLL = C13LP.LL(list2, Math.min(3, list2.size()));
                        ArrayList arrayList5 = new ArrayList();
                        for (UpvoteStruct upvoteStruct3 : listLL) {
                            C1358770lSl.LIZ.getClass();
                            String strLJII = C1358770lSl.LJII(upvoteStruct3);
                            if (strLJII != null) {
                                arrayList5.add(strLJII);
                            }
                        }
                        Set<String> setLLIIIZ = C13LP.LLIIIZ(arrayList5);
                        upvotePanelListViewModel.LLJJ.put(uid, setLLIIIZ);
                        upvotePanelListViewModel.LLJILLL.put(uid, Integer.valueOf(setLLIIIZ.size()));
                    }
                    if ((!list2.isEmpty()) && (!C1359720lUI.LJ(upvoteStruct2) || !C263730AVf.LIZ())) {
                        arrayList2.add(new C1358130lRj(upvoteStruct2, upvotePanelListViewModel.LLJI, c1358820lSq.LIZ(upvoteStruct2), (UpvoteStruct) C13LP.LJJJJZI(list2)));
                        List listLJJJJIZL = C13LP.LJJJJIZL(list2, i3);
                        Map<String, Integer> map = upvotePanelListViewModel.LLJILLL;
                        Set set = (Set) ((LinkedHashMap) upvotePanelListViewModel.LLJJ).get(uid);
                        if (set != null) {
                            size2 = set.size();
                        } else {
                            size2 = 3;
                        }
                        int iLJ = C13LZ.LJ(((Number) C1359720lUI.LIZIZ(map, uid, Integer.valueOf(size2))).intValue() - i3, 0, listLJJJJIZL.size());
                        Iterator it2 = C13LP.LL(listLJJJJIZL, iLJ).iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new C1357250lQJ((UpvoteStruct) it2.next(), upvoteStruct2, upvotePanelListViewModel.LLJI));
                        }
                        int size3 = list2.size();
                        Set set2 = (Set) ((LinkedHashMap) upvotePanelListViewModel.LLJJ).get(uid);
                        if (set2 != null) {
                            iMin2 = set2.size();
                        } else {
                            iMin2 = Math.min(3, size3);
                        }
                        int i4 = iLJ + 1;
                        if (size3 > iMin2) {
                            int iMax = Math.max(iMin2, 1);
                            if (i4 >= list2.size()) {
                                i2 = 2;
                            } else if (i4 > iMax && i4 < list2.size()) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            arrayList2.add(new C1358780lSm(upvoteStruct2, list2.size(), i4, i2));
                        }
                    } else {
                        arrayList2.add(new C1358130lRj(upvoteStruct2, upvotePanelListViewModel.LLJI, c1358820lSq.LIZ(upvoteStruct2), null));
                        if (!list2.isEmpty()) {
                            Map<String, Integer> map2 = upvotePanelListViewModel.LLJILLL;
                            Set set3 = (Set) ((LinkedHashMap) upvotePanelListViewModel.LLJJ).get(uid);
                            if (set3 != null) {
                                size = set3.size();
                            } else {
                                size = 3;
                            }
                            int iLJ2 = C13LZ.LJ(((Number) C1359720lUI.LIZIZ(map2, uid, Integer.valueOf(size))).intValue(), 0, list2.size());
                            for (UpvoteStruct upvoteStruct4 : C13LP.LL(list2, iLJ2)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("prepare data: ");
                                CommentInfoStruct commentInfoStruct = upvoteStruct4.commentInfo;
                                if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null && (user = comment.getUser()) != null) {
                                    nickname = user.getNickname();
                                } else {
                                    nickname = null;
                                }
                                sbLIZ.append(nickname);
                                C2188811AlT.LIZIZ(sbLIZ);
                                arrayList2.add(new C1357250lQJ(upvoteStruct4, upvoteStruct2, upvotePanelListViewModel.LLJI));
                            }
                            int size4 = list2.size();
                            Set set4 = (Set) ((LinkedHashMap) upvotePanelListViewModel.LLJJ).get(uid);
                            if (set4 != null) {
                                iMin = set4.size();
                            } else {
                                iMin = Math.min(3, size4);
                            }
                            if (size4 > iMin) {
                                if (iLJ2 >= list2.size()) {
                                    i = 2;
                                } else if (iLJ2 > iMin && iLJ2 < list2.size()) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                arrayList2.add(new C1358780lSm(upvoteStruct2, list2.size(), iLJ2, i));
                            }
                        }
                    }
                    i3 = 1;
                }
                List<UpvoteStruct> list3 = upvoteList.mafUpvotes;
                if (list3 != null) {
                    UpvotePanelListViewModel upvotePanelListViewModel2 = this.LIZIZ;
                    C1358820lSq c1358820lSq2 = this.LIZ;
                    arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (UpvoteStruct upvoteStruct5 : list3) {
                        arrayList.add(new C1358130lRj(upvoteStruct5, upvotePanelListViewModel2.LLJI, c1358820lSq2.LIZ(upvoteStruct5), null));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                arrayList2.addAll(arrayList);
                C1587150rP7 c1587150rP7 = C1587150rP7.LIZIZ;
                VideoItemParams videoItemParams = this.LIZIZ.LLJI;
                if (videoItemParams != null) {
                    str = videoItemParams.mEventType;
                } else {
                    str = null;
                }
                VideoItemParams videoItemParams2 = this.LIZIZ.LLJI;
                if (videoItemParams2 != null && (fragment = videoItemParams2.fragment) != null) {
                    strLIZIZ = C1389300mG0.LIZIZ(fragment);
                } else {
                    strLIZIZ = null;
                }
                if (c1587150rP7.LJIILIIL(str, strLIZIZ)) {
                    arrayList2.add(new z7());
                }
                if (upvoteList.hasMore) {
                    InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf3 = this.LIZ.LIZIZ;
                    if (interfaceC20236714Gf3 == null) {
                        interfaceC20236714Gf3 = null;
                    }
                    interfaceC20236714Gf3.LJJIFFI(null, C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Long.valueOf(upvoteList.cursor), arrayList2, 1));
                    return;
                }
                InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> interfaceC20236714Gf4 = this.LIZ.LIZIZ;
                if (interfaceC20236714Gf4 == null) {
                    interfaceC20236714Gf4 = null;
                }
                AbstractC316870CbV.LIZ.getClass();
                interfaceC20236714Gf4.LJJIFFI(null, new C316640Cb8(arrayList2));
            }
        }
    }

    public C1358810lSp(C1358820lSq c1358820lSq, UpvotePanelListViewModel upvotePanelListViewModel) {
        this.LIZ = c1358820lSq;
        this.LIZIZ = upvotePanelListViewModel;
    }
}
