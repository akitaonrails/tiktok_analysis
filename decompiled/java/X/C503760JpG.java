package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503760JpG implements InterfaceC503850JpP {
    public final SubSpaceFeedVM LL;
    public final C504510JqT LLILLJJLI;
    public C503260JoS LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C503750JpF(this));
    public int LLILZIL = -1;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C503800JpK(this));

    public final boolean LIZJ() {
        ArrayList<AbstractC503810JpL> arrayList;
        C503260JoS c503260JoS = this.LLILLL;
        if (c503260JoS == null || (arrayList = c503260JoS.LL) == null) {
            return false;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC503810JpL next = it2.next();
            if ((next instanceof C502910Jnt) || (next instanceof C503010Jo3)) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.InterfaceC503850JpP
    public final boolean LJIIJJI() {
        C502890Jnr c502890Jnr;
        C504510JqT c504510JqT = this.LLILLJJLI;
        return C176600m4.LIZIZ((c504510JqT == null || (c502890Jnr = c504510JqT.LL) == null) ? null : c502890Jnr.LIZIZ);
    }

    public static final ArrayList<AbstractC503810JpL> LIZ(SpacePost spacePost) {
        List<SpacePollOption> list;
        String strValueOf;
        ArrayList<AbstractC503810JpL> arrayList = new ArrayList<>();
        arrayList.add(new C503010Jo3(spacePost));
        if (!spacePost.previewMode) {
            SpacePoll spacePoll = spacePost.pollInfo;
            if (spacePoll != null && (list = spacePoll.optionList) != null) {
                int i = 1;
                for (SpacePollOption spacePollOption : list) {
                    if (1 <= i && i < 27) {
                        strValueOf = String.valueOf((char) ((i + 65) - 1));
                    } else {
                        strValueOf = "?";
                    }
                    arrayList.add(new C503080JoA(spacePost, spacePollOption, strValueOf));
                    i++;
                }
            }
            Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C504910Jr7((SpaceCommentItem) it2.next(), spacePost));
            }
        } else {
            arrayList.add(new C503350Job(spacePost));
        }
        arrayList.add(new C502940Jnw(spacePost));
        return arrayList;
    }

    public static final ArrayList<AbstractC503810JpL> LIZIZ(SpacePost spacePost) {
        ArrayList<AbstractC503810JpL> arrayList = new ArrayList<>();
        arrayList.add(new C502910Jnt(spacePost));
        if (!spacePost.previewMode) {
            Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C504910Jr7((SpaceCommentItem) it2.next(), spacePost));
            }
        } else {
            arrayList.add(new C503350Job(spacePost));
        }
        arrayList.add(new C502940Jnw(spacePost));
        return arrayList;
    }

    public final void LIZLLL(SpacePost spacePost) {
        ArrayList<AbstractC503810JpL> arrayList;
        C503260JoS c503260JoS = this.LLILLL;
        if (c503260JoS != null && (arrayList = c503260JoS.LL) != null) {
            int i = 0;
            for (AbstractC503810JpL abstractC503810JpL : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC503810JpL abstractC503810JpL2 = abstractC503810JpL;
                    if (abstractC503810JpL2.LIZIZ() == spacePost.postId) {
                        if (abstractC503810JpL2 instanceof C503080JoA) {
                            ((C503080JoA) abstractC503810JpL2).LIZLLL(spacePost);
                        } else if (abstractC503810JpL2 instanceof C503010Jo3) {
                            ((C503010Jo3) abstractC503810JpL2).LIZ = spacePost;
                        }
                        C503260JoS c503260JoS2 = this.LLILLL;
                        if (c503260JoS2 != null) {
                            c503260JoS2.notifyItemChanged(i);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public C503760JpG(SubSpaceFeedVM subSpaceFeedVM, C504510JqT c504510JqT) {
        this.LL = subSpaceFeedVM;
        this.LLILLJJLI = c504510JqT;
    }

    @Override // X.InterfaceC503850JpP
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Boolean bool;
        String secUid;
        C502890Jnr c502890Jnr;
        Long l;
        long jLongValue;
        C502890Jnr c502890Jnr2;
        Long l2;
        User user;
        C502890Jnr c502890Jnr3;
        C504510JqT c504510JqT = this.LLILLJJLI;
        if (c504510JqT != null && (c502890Jnr3 = c504510JqT.LL) != null) {
            bool = c502890Jnr3.LIZIZ;
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool)) {
            ((C503820JpM) function1).invoke(new IllegalArgumentException("has more is false"));
            return;
        }
        C504510JqT c504510JqT2 = this.LLILLJJLI;
        if (c504510JqT2 == null || (user = c504510JqT2.LLILLL) == null || (secUid = user.getSecUid()) == null) {
            secUid = "";
        }
        C504510JqT c504510JqT3 = this.LLILLJJLI;
        if (c504510JqT3 != null && (c502890Jnr = c504510JqT3.LL) != null && (l = c502890Jnr.LIZ) != null) {
            long jLongValue2 = l.longValue();
            C504510JqT c504510JqT4 = this.LLILLJJLI;
            if (c504510JqT4 != null && (c502890Jnr2 = c504510JqT4.LL) != null && (l2 = c502890Jnr2.LIZJ) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            C480460Ism.LIZ().getClass();
            C0J1N c0j1n = (C0J1N) ((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getPostPage(secUid, jLongValue2, jLongValue).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this.LL));
            if (c0j1n != null) {
                final C503860JpQ c503860JpQ = (C503860JpQ) function0;
                final C503820JpM c503820JpM = (C503820JpM) function1;
                c0j1n.LIZ(new C09JN() { // from class: X.0JpH
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
                    
                        r0 = r4.LLILLL;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
                    
                        if (r0 == null) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
                    
                        r2 = r0.LL;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
                    
                        if (r2 == null) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
                    
                        r2.add(new X.C502400Jn4((java.lang.Object) null));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
                    
                        r1 = r7.postType;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
                    
                        if (r1 != X.EnumC503090JoB.TEXT.getValue()) goto L52;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
                    
                        r1 = X.C503760JpG.LIZIZ(r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
                    
                        r0 = r4.LLILLL;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
                    
                        if (r0 == null) goto L79;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
                    
                        r0 = r0.LL;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
                    
                        if (r0 == null) goto L80;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
                    
                        r0.addAll(r1);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
                    
                        if (r1 != X.EnumC503090JoB.POLL.getValue()) goto L78;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
                    
                        r1 = X.C503760JpG.LIZ(r7);
                     */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r15) {
                        /*
                            Method dump skipped, instruction units count: 252
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C503770JpH.accept(java.lang.Object):void");
                    }
                }, new C09JN() { // from class: X.0JpJ
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceFeedListManager@ef48.loadNextPage$2");
                        c503820JpM.invoke(obj);
                        C1C7U.LIZIZ("SubSpaceFeedListManager@ef48.loadNextPage$2");
                    }
                });
            }
        }
    }
}
