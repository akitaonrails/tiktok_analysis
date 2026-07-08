package X;

import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.ui.actions.InboxSortOrderDebugAction$doAction$1", f = "ActionSheetItemsNew.kt", l = {1159}, m = "invokeSuspend")
public final class C872810YLv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0Y8T LL;
    public C869590Y9l LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ LastMessageProperty LLILZLL;
    public final /* synthetic */ C0Y8T LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C877470YbZ LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872810YLv(String str, C869590Y9l c869590Y9l, LastMessageProperty lastMessageProperty, C0Y8T c0y8t, String str2, C877470YbZ c877470YbZ, InterfaceC1364105Vn<? super C872810YLv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = lastMessageProperty;
        this.LLIZ = c0y8t;
        this.LLIZLLLIL = str2;
        this.LLJ = c877470YbZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872810YLv(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C0Y8T c0y8t;
        C869590Y9l c869590Y9lLJIJ;
        String conversationId;
        long jLongValue;
        boolean z;
        Long lLJFF;
        Long lLJFF2;
        Integer numLJ;
        Integer numLJ2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Long create_at_in_seconds;
        Long lLJFF3;
        boolean z2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Long create_at_in_seconds2;
        Long lValueOf5;
        Long create_at_in_seconds3;
        Long lValueOf6;
        Boolean boolValueOf7;
        boolean z3;
        Long lLJIILIIL;
        Object objLIZIZ = obj;
        C1C7U.LIZ("InboxSortOrderDebugAction@c5b8.doAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c869590Y9lLJIJ = this.LLILLJJLI;
                c0y8t = this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIJJI(C869770YAd.LIZ(new C869690Y9v(new C1261404we(this.LLILZ), null, null, null, null, null, 1022), 0, 0L, false, 62));
            if (c0y6qLJIIJJI.LIZIZ == null) {
                list = c0y6qLJIIJJI.LIZ.LIZIZ;
            } else {
                list = C13BV.INSTANCE;
            }
            c0y8t = (C0Y8T) C13LP.LJJJLL(list);
            c869590Y9lLJIJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIJ(this.LLILZ);
            InterfaceC873120YNa interfaceC873120YNaLIZ = C0YNZ.LIZ(InterfaceC873120YNa.LIZ);
            String str = this.LLILZ;
            this.LL = c0y8t;
            this.LLILLJJLI = c869590Y9lLJIJ;
            this.LLILLL = 1;
            objLIZIZ = interfaceC873120YNaLIZ.LIZIZ(str);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("InboxSortOrderDebugAction@c5b8.doAction$1");
                return objLJFF;
            }
        }
        C0YA1 c0ya1 = (C0YA1) objLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conversationInDB: ");
        sbLIZ.append(c0y8t);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lastMsgInDb: ");
        sbLIZ2.append(c869590Y9lLJIJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("lastPropertyInDB: ");
        sbLIZ3.append(c0ya1);
        C2188811AlT.LIZIZ(sbLIZ3);
        if (c0y8t == null || (conversationId = c0y8t.getConversationId()) == null) {
            conversationId = "";
        }
        String strLJFF = C0YNP.LJFF(conversationId, "chat_cell_preview_draft_time_ms");
        if (strLJFF != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        String strValueOf = String.valueOf(jLongValue);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("chatPreviewDraftTimestampInDB: ");
        sbLIZ4.append(strValueOf);
        sbLIZ4.append("  ");
        if (c0y8t != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ4.append(z);
        C2188811AlT.LIZIZ(sbLIZ4);
        C869590Y9l c869590Y9l = this.LLILZIL;
        if (c869590Y9l != null) {
            lLJFF = C2286608xc.LJFF(c869590Y9l.getCreatedAt());
        } else {
            lLJFF = null;
        }
        if (c869590Y9lLJIJ != null) {
            lLJFF2 = C2286608xc.LJFF(c869590Y9lLJIJ.getCreatedAt());
        } else {
            lLJFF2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(lLJFF, lLJFF2);
        C869590Y9l c869590Y9l2 = this.LLILZIL;
        if (c869590Y9l2 != null) {
            numLJ = C2286608xc.LJ(c869590Y9l2.getConvRankUpdateRule());
        } else {
            numLJ = null;
        }
        if (c869590Y9lLJIJ != null) {
            numLJ2 = C2286608xc.LJ(c869590Y9lLJIJ.getConvRankUpdateRule());
        } else {
            numLJ2 = null;
        }
        boolean zLJFF2 = Intrinsics.LJFF(numLJ, numLJ2);
        C869590Y9l c869590Y9l3 = this.LLILZIL;
        if (c869590Y9l3 != null) {
            boolValueOf = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9l3));
        } else {
            boolValueOf = null;
        }
        if (c869590Y9lLJIJ != null) {
            boolValueOf2 = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9lLJIJ));
        } else {
            boolValueOf2 = null;
        }
        boolean zLJFF3 = Intrinsics.LJFF(boolValueOf, boolValueOf2);
        LastMessageProperty lastMessageProperty = this.LLILZLL;
        if (lastMessageProperty != null) {
            create_at_in_seconds = lastMessageProperty.getCreate_at_in_seconds();
        } else {
            create_at_in_seconds = null;
        }
        if (c0ya1 != null) {
            lLJFF3 = C2286608xc.LJFF(c0ya1.getCreateTimeSeconds());
        } else {
            lLJFF3 = null;
        }
        boolean zLJFF4 = Intrinsics.LJFF(create_at_in_seconds, lLJFF3);
        if (c0y8t != null && this.LLIZ.isStickTop() == c0y8t.isStickTop()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJFF5 = Intrinsics.LJFF(this.LLIZLLLIL, strValueOf);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("lastMsgCreateAtCheck: ");
        sbLIZ5.append(zLJFF);
        sbLIZ5.append(", canRankUpdateRuleCheck: ");
        sbLIZ5.append(zLJFF2);
        sbLIZ5.append(", isSentBySelfCheck: ");
        sbLIZ5.append(zLJFF3);
        sbLIZ5.append(", lastMessagePropertyCheck: ");
        sbLIZ5.append(zLJFF4);
        sbLIZ5.append(", isStickTopCheck: ");
        sbLIZ5.append(z2);
        sbLIZ5.append(", draftTimestampCheck: ");
        sbLIZ5.append(zLJFF5);
        C2188811AlT.LIZIZ(sbLIZ5);
        C877470YbZ c877470YbZ = this.LLJ;
        C0Y8T c0y8t2 = this.LLIZ;
        C869590Y9l c869590Y9l4 = this.LLILZIL;
        LastMessageProperty lastMessageProperty2 = this.LLILZLL;
        c877470YbZ.getClass();
        StringBuilder sb = new StringBuilder("======last msg part=====\n");
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("createAt: ");
        if (c869590Y9l4 != null) {
            lValueOf = Long.valueOf(c869590Y9l4.getCreatedAt());
        } else {
            lValueOf = null;
        }
        sbLIZ6.append(lValueOf);
        sbLIZ6.append(", ");
        if (c869590Y9lLJIJ != null) {
            lValueOf2 = Long.valueOf(c869590Y9lLJIJ.getCreatedAt());
        } else {
            lValueOf2 = null;
        }
        sbLIZ6.append(lValueOf2);
        sbLIZ6.append(" isSame: ");
        if (c869590Y9l4 != null) {
            lValueOf3 = Long.valueOf(c869590Y9l4.getCreatedAt());
        } else {
            lValueOf3 = null;
        }
        if (c869590Y9lLJIJ != null) {
            lValueOf4 = Long.valueOf(c869590Y9lLJIJ.getCreatedAt());
        } else {
            lValueOf4 = null;
        }
        sbLIZ6.append(Intrinsics.LJFF(lValueOf3, lValueOf4));
        sbLIZ6.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("canRankUpdateRule: ");
        if (c869590Y9l4 != null) {
            numValueOf = Integer.valueOf(c869590Y9l4.getConvRankUpdateRule());
        } else {
            numValueOf = null;
        }
        sbLIZ7.append(numValueOf);
        sbLIZ7.append(", ");
        if (c869590Y9lLJIJ != null) {
            numValueOf2 = Integer.valueOf(c869590Y9lLJIJ.getConvRankUpdateRule());
        } else {
            numValueOf2 = null;
        }
        sbLIZ7.append(numValueOf2);
        sbLIZ7.append(" isSame: ");
        if (c869590Y9l4 != null) {
            numValueOf3 = Integer.valueOf(c869590Y9l4.getConvRankUpdateRule());
        } else {
            numValueOf3 = null;
        }
        if (c869590Y9lLJIJ != null) {
            numValueOf4 = Integer.valueOf(c869590Y9lLJIJ.getConvRankUpdateRule());
        } else {
            numValueOf4 = null;
        }
        sbLIZ7.append(Intrinsics.LJFF(numValueOf3, numValueOf4));
        sbLIZ7.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("isSentBySelf: ");
        if (c869590Y9l4 != null) {
            boolValueOf3 = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9l4));
        } else {
            boolValueOf3 = null;
        }
        sbLIZ8.append(boolValueOf3);
        sbLIZ8.append(", ");
        if (c869590Y9lLJIJ != null) {
            boolValueOf4 = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9lLJIJ));
        } else {
            boolValueOf4 = null;
        }
        sbLIZ8.append(boolValueOf4);
        sbLIZ8.append(" isSame: ");
        if (c869590Y9l4 != null) {
            boolValueOf5 = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9l4));
        } else {
            boolValueOf5 = null;
        }
        if (c869590Y9lLJIJ != null) {
            boolValueOf6 = Boolean.valueOf(C0ZDX.LJJJJIZL(c869590Y9lLJIJ));
        } else {
            boolValueOf6 = null;
        }
        sbLIZ8.append(Intrinsics.LJFF(boolValueOf5, boolValueOf6));
        sbLIZ8.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        sb.append("======property part=====\n");
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("propertyCreateAt: ");
        if (lastMessageProperty2 != null) {
            create_at_in_seconds2 = lastMessageProperty2.getCreate_at_in_seconds();
        } else {
            create_at_in_seconds2 = null;
        }
        sbLIZ9.append(create_at_in_seconds2);
        sbLIZ9.append(", ");
        if (c0ya1 != null) {
            lValueOf5 = Long.valueOf(c0ya1.getCreateTimeSeconds());
        } else {
            lValueOf5 = null;
        }
        sbLIZ9.append(lValueOf5);
        sbLIZ9.append(" isSame: ");
        if (lastMessageProperty2 != null) {
            create_at_in_seconds3 = lastMessageProperty2.getCreate_at_in_seconds();
        } else {
            create_at_in_seconds3 = null;
        }
        if (c0ya1 != null) {
            lValueOf6 = Long.valueOf(c0ya1.getCreateTimeSeconds());
        } else {
            lValueOf6 = null;
        }
        sbLIZ9.append(Intrinsics.LJFF(create_at_in_seconds3, lValueOf6));
        sbLIZ9.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        sb.append("======conversation part=====\n");
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("isStickTop: ");
        sbLIZ10.append(c0y8t2.isStickTop());
        sbLIZ10.append(", ");
        if (c0y8t != null) {
            boolValueOf7 = Boolean.valueOf(c0y8t.isStickTop());
        } else {
            boolValueOf7 = null;
        }
        sbLIZ10.append(boolValueOf7);
        sbLIZ10.append(" isSame: ");
        if (c0y8t != null && c0y8t2.isStickTop() == c0y8t.isStickTop()) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ10.append(z3);
        sbLIZ10.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        String string = sb.toString();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C859010Xmt(this.LLJ, string, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSortOrderDebugAction@c5b8.doAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
