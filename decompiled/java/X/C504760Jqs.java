package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504760Jqs implements InterfaceC503850JpP {
    public final SubSpaceDetailVM LL;
    public final C504880Jr4 LLILLJJLI;
    public C503200JoM LLILLL;
    public RecyclerView LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C503740JpE(this));

    public final void LJI() {
        ArrayList<AbstractC503810JpL> arrayList;
        ArrayList<AbstractC503810JpL> arrayList2;
        C503200JoM c503200JoM = this.LLILLL;
        if (c503200JoM == null || (arrayList = c503200JoM.LL) == null) {
            return;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C503240JoQ) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C503200JoM c503200JoM2 = this.LLILLL;
        if (c503200JoM2 != null && (arrayList2 = c503200JoM2.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C503200JoM c503200JoM3 = this.LLILLL;
        if (c503200JoM3 != null) {
            c503200JoM3.notifyItemRemoved(numValueOf.intValue());
        }
        LJI();
    }

    public final void LJII() {
        ArrayList<AbstractC503810JpL> arrayList;
        ArrayList<AbstractC503810JpL> arrayList2;
        C503200JoM c503200JoM = this.LLILLL;
        if (c503200JoM == null || (arrayList = c503200JoM.LL) == null) {
            return;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C503230JoP) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C503200JoM c503200JoM2 = this.LLILLL;
        if (c503200JoM2 != null && (arrayList2 = c503200JoM2.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C503200JoM c503200JoM3 = this.LLILLL;
        if (c503200JoM3 != null) {
            c503200JoM3.notifyItemRemoved(numValueOf.intValue());
        }
    }

    @Override // X.InterfaceC503850JpP
    public final boolean LJIIJJI() {
        C502890Jnr c502890Jnr;
        C504880Jr4 c504880Jr4 = this.LLILLJJLI;
        return C176600m4.LIZIZ((c504880Jr4 == null || (c502890Jnr = c504880Jr4.LLIZLLLIL) == null) ? null : c502890Jnr.LIZIZ);
    }

    public static final SpaceCommentItem LIZIZ(SpaceCommentItem spaceCommentItem) {
        if (spaceCommentItem == null) {
            return null;
        }
        int i = spaceCommentItem.commentType;
        if (i != EnumC504930Jr9.COMMENT.getValue()) {
            if (i != EnumC504930Jr9.REPLY.getValue() && i != EnumC504930Jr9.REPLY_TO_REPLY.getValue()) {
                return null;
            }
            return spaceCommentItem.replyCommentInfo;
        }
        return spaceCommentItem;
    }

    public final void LJ(SpacePost spacePost) {
        C503200JoM c503200JoM;
        ArrayList<AbstractC503810JpL> arrayList;
        if (spacePost != null && (c503200JoM = this.LLILLL) != null && (arrayList = c503200JoM.LL) != null) {
            int i = 0;
            for (AbstractC503810JpL abstractC503810JpL : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC503810JpL abstractC503810JpL2 = abstractC503810JpL;
                    if (abstractC503810JpL2.LIZIZ() == spacePost.postId) {
                        if (!(abstractC503810JpL2 instanceof C503080JoA)) {
                            if ((abstractC503810JpL2 instanceof C503010Jo3) || (abstractC503810JpL2 instanceof C503190JoL)) {
                                if (abstractC503810JpL2 instanceof C503010Jo3) {
                                    ((C503010Jo3) abstractC503810JpL2).LIZ = spacePost;
                                }
                            }
                        } else {
                            ((C503080JoA) abstractC503810JpL2).LIZLLL(spacePost);
                        }
                        C503200JoM c503200JoM2 = this.LLILLL;
                        if (c503200JoM2 != null) {
                            c503200JoM2.notifyItemChanged(i);
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

    public final void LJFF(C504910Jr7 c504910Jr7) {
        ArrayList<AbstractC503810JpL> arrayList;
        C503200JoM c503200JoM;
        C503200JoM c503200JoM2 = this.LLILLL;
        if (c503200JoM2 != null && (arrayList = c503200JoM2.LL) != null) {
            Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), c504910Jr7)) {
                    if (i >= 0 && (c503200JoM = this.LLILLL) != null) {
                        c503200JoM.notifyItemChanged(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public C504760Jqs(SubSpaceDetailVM subSpaceDetailVM, C504880Jr4 c504880Jr4) {
        this.LL = subSpaceDetailVM;
        this.LLILLJJLI = c504880Jr4;
    }

    public static final int LIZ(SpaceCommentItem spaceCommentItem, ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            AbstractC503810JpL abstractC503810JpL = (AbstractC503810JpL) it2.next();
            if (abstractC503810JpL instanceof C504910Jr7) {
                if (spaceCommentItem.commentType == EnumC504930Jr9.COMMENT.getValue()) {
                    C504910Jr7 c504910Jr7 = (C504910Jr7) abstractC503810JpL;
                    if (c504910Jr7.LIZLLL() == spaceCommentItem.commentId && c504910Jr7.LIZ.postId == spaceCommentItem.postId) {
                        return i;
                    }
                } else {
                    SpaceCommentItem spaceCommentItem2 = ((C504910Jr7) abstractC503810JpL).LIZ;
                    if (spaceCommentItem2.commentId == spaceCommentItem.commentId && spaceCommentItem2.postId == spaceCommentItem.postId) {
                        return i;
                    }
                }
            }
            i++;
        }
        return -1;
    }

    public final ArrayList<AbstractC503810JpL> LIZJ(SpaceCommentItem spaceCommentItem, SpaceCommentItem spaceCommentItem2) {
        boolean z;
        SpaceCommentItem spaceCommentItemLIZIZ = LIZIZ(spaceCommentItem2);
        if (spaceCommentItemLIZIZ != null && spaceCommentItem.commentId == spaceCommentItemLIZIZ.commentId) {
            z = true;
        } else {
            z = false;
        }
        SpacePost spacePost = null;
        if (z) {
            return null;
        }
        ArrayList<AbstractC503810JpL> arrayList = new ArrayList<>();
        C504880Jr4 c504880Jr4 = this.LLILLJJLI;
        if (c504880Jr4 != null) {
            spacePost = c504880Jr4.LLILLL;
        }
        arrayList.add(new C504910Jr7(spaceCommentItem, spacePost));
        long j = spaceCommentItem.replyCount;
        if (j > 0) {
            arrayList.add(new C504920Jr8(spaceCommentItem, j));
        }
        return arrayList;
    }

    public final ArrayList<AbstractC503810JpL> LIZLLL(SpaceCommentItem spaceCommentItem, ArrayList<AbstractC503810JpL> arrayList) {
        int i;
        SpacePost spacePost;
        SpacePost spacePost2 = null;
        if (spaceCommentItem == null) {
            return null;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC503810JpL next = it2.next();
            AbstractC503810JpL abstractC503810JpL = next;
            SpaceCommentItem spaceCommentItemLIZIZ = LIZIZ(spaceCommentItem);
            if ((abstractC503810JpL instanceof C504910Jr7) && spaceCommentItemLIZIZ != null && ((C504910Jr7) abstractC503810JpL).LIZLLL() == spaceCommentItemLIZIZ.commentId) {
                if (next != null) {
                    return null;
                }
            }
        }
        ArrayList<AbstractC503810JpL> arrayList2 = new ArrayList<>();
        SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyCommentInfo;
        if (spaceCommentItem2 != null) {
            C504880Jr4 c504880Jr4 = this.LLILLJJLI;
            if (c504880Jr4 != null) {
                spacePost = c504880Jr4.LLILLL;
            } else {
                spacePost = null;
            }
            arrayList2.add(new C504910Jr7(spaceCommentItem2, spacePost));
        } else {
            i = 0;
        }
        C504880Jr4 c504880Jr42 = this.LLILLJJLI;
        if (c504880Jr42 != null) {
            spacePost2 = c504880Jr42.LLILLL;
        }
        arrayList2.add(new C504910Jr7(spaceCommentItem, spacePost2));
        SpaceCommentItem spaceCommentItemLIZIZ2 = LIZIZ(spaceCommentItem);
        if (spaceCommentItemLIZIZ2 != null) {
            long j = spaceCommentItemLIZIZ2.replyCount;
            if (j > 0) {
                arrayList2.add(new C504920Jr8(spaceCommentItemLIZIZ2, j - ((long) i)));
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC503850JpP
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Boolean bool;
        String str;
        C502890Jnr c502890Jnr;
        Long l;
        C502890Jnr c502890Jnr2;
        C504880Jr4 c504880Jr4 = this.LLILLJJLI;
        if (c504880Jr4 != null && (c502890Jnr2 = c504880Jr4.LLIZLLLIL) != null) {
            bool = c502890Jnr2.LIZIZ;
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool)) {
            ((C503820JpM) function1).invoke(new IllegalArgumentException("has more is false"));
            return;
        }
        C504880Jr4 c504880Jr42 = this.LLILLJJLI;
        if (c504880Jr42 != null && (str = c504880Jr42.LLJIJIL) != null && (c502890Jnr = c504880Jr42.LLIZLLLIL) != null && (l = c502890Jnr.LIZ) != null) {
            long jLongValue = l.longValue();
            SpacePost spacePost = this.LLILLJJLI.LLILLL;
            if (spacePost != null) {
                long j = spacePost.postId;
                int value = EnumC504930Jr9.COMMENT.getValue();
                C480460Ism.LIZ().getClass();
                C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getCommentPages(j, jLongValue, str, value, 0L), EnumC510330Jzr.GENERAL, C504760Jqs.class.getSimpleName(), "sub/space/comment/page", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this.LL));
                if (c0j1n != null) {
                    final C503860JpQ c503860JpQ = (C503860JpQ) function0;
                    final C503820JpM c503820JpM = (C503820JpM) function1;
                    c0j1n.LIZ(new C09JN() { // from class: X.0Jqv
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
                        
                            r0 = r4.LLILLJJLI;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
                        
                            if (r0 == null) goto L36;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
                        
                            r0 = r0.LLJJIJIIJIL;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
                        
                            if (r0 == null) goto L36;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
                        
                            r8 = r0.topComment;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
                        
                            r0 = r4.LIZJ(r9, r8);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
                        
                            if (r0 == null) goto L64;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
                        
                            r5.addAll(r0);
                         */
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
                        @Override // X.C09JN
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void accept(java.lang.Object r15) {
                            /*
                                Method dump skipped, instruction units count: 208
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C504790Jqv.accept(java.lang.Object):void");
                        }
                    }, new C09JN() { // from class: X.0JrD
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("DetailFeedManager@154d.loadNextPage$2");
                            c503820JpM.invoke(obj);
                            C1C7U.LIZIZ("DetailFeedManager@154d.loadNextPage$2");
                        }
                    });
                }
            }
        }
    }
}
