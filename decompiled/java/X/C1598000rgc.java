package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598000rgc extends AbstractC1598350rhB<InterfaceC1891350zJl> {
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public final InterfaceC1598040rgg LJI() {
        return (InterfaceC1598040rgg) this.LJ.getValue();
    }

    @Override // X.AbstractC1598350rhB
    public final Unit LIZIZ() {
        LJI().LJFF();
        return Unit.LIZ;
    }

    public C1598000rgc(InterfaceC1598020rge interfaceC1598020rge) {
        super(interfaceC1598020rge);
        this.LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(669));
        this.LJ = C452501pT.LIZIZ(new AwS568S0100000_24(interfaceC1598020rge, 1875));
    }

    @Override // X.AbstractC1598350rhB
    public final Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn) {
        LJI().LIZLLL();
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC1598350rhB
    public final Object LJ(EnumC1155010gA7 enumC1155010gA7) {
        List<T> list;
        this.LIZIZ.addAll(LJI().LJ());
        AbstractC1598350rhB<?> abstractC1598350rhB = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL);
        boolean z = false;
        if (abstractC1598350rhB != null && (list = abstractC1598350rhB.LIZIZ) != 0 && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next() instanceof AbstractC1598130rgp) {
                    z = true;
                    break;
                }
            }
        }
        if (!this.LIZ.LJ().isLoadMoreData()) {
            LJI().LJI(this.LIZIZ, z);
        }
        return this;
    }

    public final Pair<List<InterfaceC1891350zJl>, List<InterfaceC1891350zJl>> LJII(int i) {
        return C614770O9j.LIZIZ.LJI().LIZIZ(3, i, this.LIZIZ, this.LIZ.LJ().getInsertStoryUid(), new C1598010rgd(this, i));
    }

    @Override // X.AbstractC1598350rhB
    public final void LIZ(C1598410rhH c1598410rhH, List<InterfaceC1891350zJl> list) {
        List<InterfaceC1891350zJl> list2;
        ConcurrentHashMap<Integer, List<T>> concurrentHashMap;
        List<InterfaceC1891350zJl> list3;
        User user;
        ConcurrentHashMap<Integer, List<T>> concurrentHashMap2;
        List<InterfaceC1891350zJl> list4;
        User user2;
        ConcurrentHashMap<Integer, List<T>> concurrentHashMap3;
        int i = c1598410rhH.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            List<T> list5 = this.LIZIZ;
                            AbstractC1598350rhB<?> abstractC1598350rhB = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL);
                            if (abstractC1598350rhB != null && (concurrentHashMap3 = abstractC1598350rhB.LIZJ) != 0) {
                                list4 = (List) concurrentHashMap3.get(3);
                            } else {
                                list4 = null;
                            }
                            for (T t : list5) {
                                if (t instanceof StoryInboxItem) {
                                    StoryInboxItem storyInboxItem = (StoryInboxItem) t;
                                    if (!storyInboxItem.isMe() && storyInboxItem.hasUnreadStory() && !C10EU.LJIILJJIL(storyInboxItem.getStoryCollection().getAuthor())) {
                                        storyInboxItem.setPriority(3500);
                                        LJIIIIZZ(3500, t);
                                    }
                                }
                            }
                            if (list4 != null) {
                                for (InterfaceC1891350zJl interfaceC1891350zJl : list4) {
                                    if (interfaceC1891350zJl instanceof AbstractC1598130rgp) {
                                        AbstractC1598130rgp abstractC1598130rgp = (AbstractC1598130rgp) interfaceC1891350zJl;
                                        InboxLiveNotice inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ();
                                        if (inboxLiveNoticeLIZIZ != null) {
                                            user2 = inboxLiveNoticeLIZIZ.user;
                                        } else {
                                            user2 = null;
                                        }
                                        if (!C10EU.LJIILJJIL(user2)) {
                                            InboxLiveNotice inboxLiveNoticeLIZIZ2 = abstractC1598130rgp.LIZIZ();
                                            if (inboxLiveNoticeLIZIZ2 != null) {
                                                inboxLiveNoticeLIZIZ2.setPriority(3250);
                                            }
                                            LJIIIIZZ(3250, interfaceC1891350zJl);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        List<T> list6 = this.LIZIZ;
                        AbstractC1598350rhB<?> abstractC1598350rhB2 = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL);
                        if (abstractC1598350rhB2 != null && (concurrentHashMap2 = abstractC1598350rhB2.LIZJ) != 0) {
                            list3 = (List) concurrentHashMap2.get(3);
                        } else {
                            list3 = null;
                        }
                        for (T t2 : list6) {
                            if (t2 instanceof StoryInboxItem) {
                                StoryInboxItem storyInboxItem2 = (StoryInboxItem) t2;
                                if (!storyInboxItem2.isMe() && storyInboxItem2.hasUnreadStory() && !C10EU.LJIILJJIL(storyInboxItem2.getStoryCollection().getAuthor())) {
                                    storyInboxItem2.setPriority(4500);
                                    LJIIIIZZ(4500, t2);
                                }
                            }
                        }
                        if (list3 != null) {
                            for (InterfaceC1891350zJl interfaceC1891350zJl2 : list3) {
                                if (interfaceC1891350zJl2 instanceof AbstractC1598130rgp) {
                                    AbstractC1598130rgp abstractC1598130rgp2 = (AbstractC1598130rgp) interfaceC1891350zJl2;
                                    InboxLiveNotice inboxLiveNoticeLIZIZ3 = abstractC1598130rgp2.LIZIZ();
                                    if (inboxLiveNoticeLIZIZ3 != null) {
                                        user = inboxLiveNoticeLIZIZ3.user;
                                    } else {
                                        user = null;
                                    }
                                    if (!C10EU.LJIILJJIL(user)) {
                                        InboxLiveNotice inboxLiveNoticeLIZIZ4 = abstractC1598130rgp2.LIZIZ();
                                        if (inboxLiveNoticeLIZIZ4 != null) {
                                            inboxLiveNoticeLIZIZ4.setPriority(3250);
                                        }
                                        LJIIIIZZ(3250, interfaceC1891350zJl2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    LJII(2);
                    AbstractC1598350rhB<?> abstractC1598350rhB3 = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL);
                    if (abstractC1598350rhB3 == null || (concurrentHashMap = abstractC1598350rhB3.LIZJ) == 0 || (list2 = (List) concurrentHashMap.get(3)) == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    boolean z = false;
                    if (!list2.isEmpty()) {
                        for (InterfaceC1891350zJl interfaceC1891350zJl3 : list2) {
                            if (interfaceC1891350zJl3 instanceof AbstractC1598130rgp) {
                                ((AbstractC1598130rgp) interfaceC1891350zJl3).LLILLJJLI = 2;
                                z = true;
                            }
                        }
                        if (z) {
                            C614770O9j.LIZIZ.LJI().LIZ(2);
                        }
                    }
                }
            } else if (!LJII(1).getFirst().isEmpty()) {
                C614770O9j.LIZIZ.LJI().LIZ(1);
            }
        }
        LJI().LIZ(c1598410rhH, list, this.LIZIZ);
        LJI().LIZIZ(i, this.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[PHI: r4
      0x008a: PHI (r4v5 java.util.ArrayList) = (r4v0 java.util.ArrayList), (r4v6 java.util.ArrayList) binds: [B:7:0x0024, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[PHI: r4
      0x0090: PHI (r4v1 java.util.ArrayList) = (r4v0 java.util.ArrayList), (r4v5 java.util.ArrayList), (r4v6 java.util.ArrayList) binds: [B:5:0x001e, B:28:0x008e, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[PHI: r3 r4
      0x0094: PHI (r3v3 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>) = 
      (r3v0 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r3v4 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
     binds: [B:30:0x0092, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r4v4 java.util.ArrayList) = (r4v1 java.util.ArrayList), (r4v5 java.util.ArrayList) binds: [B:30:0x0092, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[PHI: r3 r4
      0x009a: PHI (r3v2 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>) = 
      (r3v0 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r3v3 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
     binds: [B:30:0x0092, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r4v3 java.util.ArrayList) = (r4v1 java.util.ArrayList), (r4v4 java.util.ArrayList) binds: [B:30:0x0092, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1598350rhB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC1155010gA7 r8, X.InterfaceC1364105Vn<? super X.AbstractC1598350rhB<X.InterfaceC1891350zJl>> r9) {
        /*
            r7 = this;
            java.util.List<T extends X.0zJl> r0 = r7.LIZIZ
            r0.clear()
            X.01GW r0 = r7.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.story.inbox.IStoryInboxService r0 = (com.ss.android.ugc.aweme.story.inbox.IStoryInboxService) r0
            boolean r0 = r0.canShowStoryCell()
            r4 = 0
            if (r0 == 0) goto La8
            X.0rge r0 = r7.LIZ
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r0.LJ()
            com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse r6 = r0.getStoryGetFeedByPageResponse()
            if (r6 == 0) goto L90
            java.util.List r0 = r6.getUserLatestStoryNotes()
            if (r0 == 0) goto L8a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.story.inbox.StoryNoteBubbleInfo r0 = (com.ss.android.ugc.aweme.story.inbox.StoryNoteBubbleInfo) r0
            java.lang.Integer r0 = r0.status
            if (r0 == 0) goto L2f
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L2f
            r5.add(r2)
            goto L2f
        L4b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r5.iterator()
        L54:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.story.inbox.StoryNoteBubbleInfo r0 = (com.ss.android.ugc.aweme.story.inbox.StoryNoteBubbleInfo) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            if (r0 == 0) goto L54
            r4.add(r0)
            goto L54
        L68:
            java.util.Iterator r3 = r4.iterator()
        L6c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            r0.LLILLL(r2)
            goto L6c
        L88:
            if (r6 == 0) goto L90
        L8a:
            java.util.List r3 = r6.getAwemes()
            if (r3 != 0) goto L94
        L90:
            X.13BV r3 = X.C13BV.INSTANCE
            if (r6 == 0) goto L9a
        L94:
            java.util.List r2 = r6.getHighlightUsers()
            if (r2 != 0) goto L9c
        L9a:
            X.13BV r2 = X.C13BV.INSTANCE
        L9c:
            X.0rgg r1 = r7.LJI()
            java.util.Map r0 = X.C2097608Jq.LJ()
            r1.LIZJ(r3, r0, r4, r2)
            return r7
        La8:
            X.0rgg r2 = r7.LJI()
            X.13BV r1 = X.C13BV.INSTANCE
            java.util.Map r0 = X.C2097608Jq.LJ()
            r2.LIZJ(r1, r0, r4, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598000rgc.LIZJ(X.0gA7, X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        User user;
        String uid;
        if (interfaceC1891350zJl instanceof StoryInboxItem) {
            User author = ((StoryInboxItem) interfaceC1891350zJl).getStoryCollection().getAuthor();
            if (author != null) {
                uid = author.getUid();
            } else {
                return;
            }
        } else if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (inboxLiveNoticeLIZIZ = ((AbstractC1598130rgp) interfaceC1891350zJl).LIZIZ()) != null && (user = inboxLiveNoticeLIZIZ.user) != null) {
            uid = user.getUid();
        } else {
            return;
        }
        if (uid != null && this.LIZ.LIZJ(i, uid)) {
            this.LIZ.LIZ().put(uid, Integer.valueOf(i));
        }
    }
}
