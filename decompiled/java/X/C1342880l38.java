package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S1000100_6;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0l38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM$fetchCommentList$1$2$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1342880l38 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentListAssemVM LL;
    public final /* synthetic */ CommentItemList LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1342550l2b>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1342880l38(CommentListAssemVM commentListAssemVM, CommentItemList commentItemList, String str, InterfaceC1364105Vn<? super AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1342880l38> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = commentListAssemVM;
        this.LLILLJJLI = commentItemList;
        this.LLILLL = str;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342880l38(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        Integer numValueOf;
        Integer numValueOf2;
        C1340940l00 c1340940l00;
        Comment comment;
        String cid;
        List<Comment> list;
        C1340940l00 c1340940l002;
        Comment comment2;
        String cid2;
        Object objLJJJLIIL;
        List<Comment> list2;
        C1C7U.LIZ("CommentListAssemVM@3a88.fetchCommentList$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentListAssemVM commentListAssemVM = this.LL;
        CommentItemList commentItemList = this.LLILLJJLI;
        String str = this.LLILLL;
        InterfaceC1364105Vn<AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn = this.LLILZ;
        commentListAssemVM.getClass();
        commentListAssemVM.LL = commentItemList.hasMore;
        commentListAssemVM.LLILLJJLI = commentItemList.cursor;
        List<Comment> list3 = commentItemList.items;
        if (list3 != null && !C086I.LIZIZ(list3) && commentItemList.logPd != null) {
            Iterator<Comment> it2 = list3.iterator();
            while (it2.hasNext()) {
                it2.next().setLogPb(commentItemList.logPd);
            }
        }
        commentListAssemVM.LLJILJIL = false;
        ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        List<Comment> list4 = commentItemList.items;
        if (list4 != null) {
            int i = 0;
            for (Comment comment3 : list4) {
                int i2 = i + 1;
                if (i >= 0) {
                    Comment comment4 = comment3;
                    if (!commentListAssemVM.LLILLL.contains(comment4.getCid()) && !linkedHashSet.contains(comment4.getCid())) {
                        linkedHashSet.add(comment4.getCid());
                    } else {
                        arrayList2.add(Integer.valueOf(i));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Iterator it3 = C13LP.LJLLL(arrayList2).iterator();
        while (it3.hasNext()) {
            int iIntValue3 = ((Number) it3.next()).intValue();
            List<Comment> list5 = commentItemList.items;
            if (list5 != null && C1697810uHb.LJIIIZ(list5).LJLJL(iIntValue3) && (list2 = commentItemList.items) != null) {
                ListProtector.remove(list2, iIntValue3);
            }
        }
        List<Comment> list6 = commentItemList.items;
        if (list6 != null || (list6 = C13BV.INSTANCE) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
                if ((interfaceC1891350zJl instanceof C1340940l00) && (c1340940l00 = (C1340940l00) interfaceC1891350zJl) != null && (comment = c1340940l00.LLILLL) != null && (cid = comment.getCid()) != null) {
                    arrayList3.add(cid);
                }
            }
            for (Comment comment5 : list6) {
                if (arrayList3.contains(comment5.getCid())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get the same comment ");
                    sbLIZ.append(comment5.getCid());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (C2344809Gs.LIZ) {
                        C2344809Gs.LIZLLL(4, "BaseCommentListHandler", strLIZIZ);
                    }
                } else {
                    int i3 = 6;
                    comment5.setCurTextMaxLines(6);
                    comment5.setCommentType(1);
                    arrayList.add(new C1340940l00(comment5, C1340960l02.LIZ(comment5)));
                    List<Comment> replyComments = comment5.getReplyComments();
                    if (replyComments != null) {
                        for (final Comment comment6 : replyComments) {
                            comment6.setCommentType(2);
                            comment6.isDefaultExpandComment = true;
                            comment6.setCurTextMaxLines(i3);
                            final C1340950l01 c1340950l01LIZ = C1340960l02.LIZ(comment6);
                            arrayList.add(new C1340920kzy(comment6, c1340950l01LIZ) { // from class: X.0kzz
                                public final Comment LLILLL;
                                public final C1340950l01 LLILZ;

                                public final boolean equals(Object obj2) {
                                    if (this == obj2) {
                                        return true;
                                    }
                                    if (!(obj2 instanceof C1340930kzz)) {
                                        return false;
                                    }
                                    C1340930kzz c1340930kzz = (C1340930kzz) obj2;
                                    return Intrinsics.LJFF(this.LLILLL, c1340930kzz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1340930kzz.LLILZ);
                                }

                                public final int hashCode() {
                                    return (this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode();
                                }

                                @Override // X.C1340920kzy
                                public final String toString() {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("CommentSecondaryItem(comment=");
                                    sbLIZ2.append(this.LLILLL);
                                    sbLIZ2.append(", commentUIState=");
                                    sbLIZ2.append(this.LLILZ);
                                    sbLIZ2.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ2);
                                }

                                @Override // X.C1340920kzy
                                public final Comment LIZ() {
                                    return this.LLILLL;
                                }

                                @Override // X.C1340920kzy
                                public final C1340950l01 LIZIZ() {
                                    return this.LLILZ;
                                }

                                {
                                    super(comment6, c1340950l01LIZ);
                                    this.LLILLL = comment6;
                                    this.LLILZ = c1340950l01LIZ;
                                }
                            });
                            i3 = 6;
                        }
                    }
                    List<Comment> replyComments2 = comment5.getReplyComments();
                    if (replyComments2 != null && (numValueOf2 = Integer.valueOf(replyComments2.size())) != null) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < comment5.getReplyCommentTotal()) {
                        List<Comment> replyComments3 = comment5.getReplyComments();
                        if (replyComments3 != null && (numValueOf = Integer.valueOf(replyComments3.size())) != null) {
                            iIntValue2 = numValueOf.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        String cid3 = comment5.getCid();
                        C1340860kzs c1340860kzs = new C1340860kzs();
                        c1340860kzs.LIZJ = comment5.getReplyCommentTotal();
                        List<Comment> replyComments4 = comment5.getReplyComments();
                        if (replyComments4 != null) {
                            c1340860kzs.LIZ = replyComments4.size();
                        }
                        c1340860kzs.LIZLLL = comment5;
                        arrayList.add(new C1340850kzr(iIntValue2, cid3, c1340860kzs));
                    }
                }
            }
        }
        String.valueOf(arrayList.size());
        int size = (commentListAssemVM.LLILLL.size() + arrayList.size()) - 100;
        if (size > 0) {
            int i4 = 0;
            do {
                if (commentListAssemVM.LLILLL.size() > 0 && (objLJJJLIIL = C13LP.LJJJLIIL(commentListAssemVM.LLILLL)) != null) {
                    commentListAssemVM.LLILLL.remove(objLJJJLIIL);
                }
                i4++;
            } while (i4 < size);
        }
        LinkedHashSet<String> linkedHashSet2 = commentListAssemVM.LLILLL;
        ArrayList arrayList4 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : arrayList) {
            if ((interfaceC1891350zJl2 instanceof C1340940l00) && (c1340940l002 = (C1340940l00) interfaceC1891350zJl2) != null && (comment2 = c1340940l002.LLILLL) != null && (cid2 = comment2.getCid()) != null) {
                arrayList4.add(cid2);
            }
        }
        linkedHashSet2.addAll(arrayList4);
        commentListAssemVM.LLILZ.getValue().setState(new AwS5S1000100_6(str, commentItemList.total, 2));
        if (commentItemList.hasMore && (list = commentItemList.items) != null && !list.isEmpty()) {
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C1342550l2b(commentItemList.cursor), arrayList, 1);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        } else {
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn.resumeWith(c316640Cb8);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentListAssemVM@3a88.fetchCommentList$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
