package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpSyncItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpSyncMessage;
import defpackage.k9;
import defpackage.p2;
import defpackage.r2;
import defpackage.u2;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863280yaU implements InterfaceC320160Cgo {
    public static MessageDatabase LJIIZILJ;
    public final Context LIZ;
    public final String LIZIZ;
    public final Function0<EntryDoc> LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final MessageDatabase LJI;
    public u2 LJII;
    public SubConversationConfig LJIIIIZZ;
    public final C054G LJIIIZ;
    public C05YC<u2> LJIIJ;
    public final C2252331DDr LJIIJJI;
    public final AwS606S0100000_27 LJIIL;
    public final AFwS269S0000000_27 LJIILIIL;
    public final C054G LJIILJJIL;
    public InterfaceC1859700yUi LJIILL;
    public static String LJIILLIIL = "";
    public static final C01GW<ITakoDebugService> LJIJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(393));
    public static final AFwS315S0000000_28 LJIJI = AFwS315S0000000_28.get$arr$(33);
    public static final CopyOnWriteArrayList<InterfaceC1861820yY8> LJIJJ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZ(String str, Aweme aweme, List<TakoVideoItem> list, String str2, C1863380yae c1863380yae, boolean z, Map<String, String> map, String str3, ActionDoc actionDoc) {
        throw null;
    }

    public static void LJJIIZI(r2 r2Var) {
        String strLIZIZ = r2Var.LIZIZ();
        if (C123100dR.LIZ(strLIZIZ) && strLIZIZ != null) {
            C325210Cox c325210Cox = C325210Cox.LIZ;
            AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(r2Var, 134);
            c325210Cox.getClass();
            C325210Cox.LIZJ(strLIZIZ, awS583S0100000_4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIJIIJIL(r2 r2Var) {
        w2.a aVar = w2.a.NEW;
        Message message = new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null);
        message.uuid = UUID.randomUUID().toString();
        message.replyMsgId = "";
        message.msgType = -6000;
        message.LIZIZ = 4;
        TakoMixFeed takoMixFeed = new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
        takoMixFeed.status = 3;
        message.LJIIJ(takoMixFeed);
        message.sender = new MessageSender(2, 0L, 0L, false, "");
        w2 w2Var = new w2(aVar, Collections.singletonList(message), false, false, false, 0, null, null, new k9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127), 252);
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320120Cgk(r2Var, w2Var, null));
    }

    public static void LJJIJLIJ(r2 r2Var) {
        int i;
        if (r2Var.LIZLLL() || (i = r2Var.LIZIZ) == 6 || i == 7 || i == 15) {
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320110Cgj(r2Var, null));
        }
    }

    public static boolean LJJJZ(UpSyncItem upSyncItem) {
        return C13LP.LJJJJ(upSyncItem.upSyncScene, C1697810uHb.LJIIJJI(5, 7, 6));
    }

    public final void LJ(r2 r2Var) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C321980Cjk(r2Var, this, null));
    }

    public final void LJFF(r2 r2Var) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C322000Cjm(r2Var, this, null));
    }

    public final void LJIIIIZZ(r2 r2Var) {
        if (r2Var.LJJIJLIJ) {
            this.LJI.LIZ().LJIJI(1, r2Var.LJJIL, r2Var.LJJIZ);
            this.LJI.LIZ().LIZIZ(r2Var.LJJIL, r2Var.LJJIZ);
        }
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C321990Cjl(r2Var, this, null));
    }

    public final void LJIIIZ(r2 r2Var) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C1863310yaX(r2Var, this, null));
    }

    public final void LJIIJJI(r2 r2Var) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, r2Var.LJIILIIL, new C1863300yaW(r2Var, this, null));
    }

    public final void LJIIL(r2 r2Var) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C1863290yaV(r2Var, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL(r2 r2Var) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = r2Var;
        C1862430yZ7.LIZ.invoke();
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZIZ()) {
            this.LJIILL = new C1785070wYL(this.LJIIIZ);
        }
        this.LJIILL.LIZ();
        C23250099c.LIZLLL(this.LJIIIZ, null, null, new C1859770yUp(this, r2Var, c259800zU, null), 3);
    }

    public final void LJIILLIIL(r2 r2Var) {
        if (r2Var.LJJIJLIJ) {
            this.LJI.LIZ().LJIJI(2, r2Var.LJJIL, r2Var.LJJIZ);
            this.LJI.LIZ().LIZIZ(r2Var.LJJIL, r2Var.LJJIZ);
        }
    }

    public final void LJIIZILJ(r2 r2Var) {
        ((ArrayList) C1863380yae.LJJIJLIJ).add(r2Var.LJJ.uuid);
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        p2.b bVar = p2.b.IMMEDIATE;
        C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C320140Cgm(r2Var, this, null));
        LJJIJL(r2Var, true);
        Message messageLJ = r2Var.LJJ.LJ();
        C1870240yli.LIZ(new AwS548S0100000_4(messageLJ, 255), false);
        String str = messageLJ.uuid;
        C1785120wYQ c1785120wYQLIZIZ = C1785140wYS.LIZIZ(str);
        if (c1785120wYQLIZIZ != null) {
            C1785140wYS.LJIIJ(str, C1785120wYQ.LIZ(c1785120wYQLIZIZ, true, true, 0, 0, false, 57));
        }
        C1785140wYS.LJFF(0, messageLJ.uuid);
        C1785140wYS.LJFF(1, messageLJ.uuid);
        C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C320250Cgx(this, r2Var, messageLJ, null));
    }

    public final void LJIJJ(r2 r2Var) {
        for (BatchUpdateMessage batchUpdateMessage : r2Var.LJIJJ) {
            Message message = batchUpdateMessage.LIZ;
            message.LIZIZ = 11;
            message.LIZJ = batchUpdateMessage.updateList;
            message.LJ++;
            LJJJLIIL(message, false, false);
        }
    }

    public final void LJIJJLI(r2 r2Var) {
        for (Message message : r2Var.LJIJI) {
            message.LIZIZ = 8;
            message.LJ++;
            LJJJLIIL(message, false, false);
        }
    }

    public final void LJJII(r2 r2Var) {
        List<BatchUpdateMessage> list = r2Var.LJIJJ;
        ArrayList arrayList = new ArrayList();
        for (BatchUpdateMessage batchUpdateMessage : list) {
            BatchUpdateMessage batchUpdateMessage2 = batchUpdateMessage;
            if (TextUtils.isEmpty(batchUpdateMessage2.msgId) || TextUtils.equals(batchUpdateMessage2.msgId, CardStruct.IStatusCode.DEFAULT)) {
                arrayList.add(batchUpdateMessage);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Message message = ((BatchUpdateMessage) it2.next()).LIZ;
            message.LIZIZ = 6;
            LJJJLIIL(message, false, false);
        }
    }

    public final void LJJIII(r2 r2Var) {
        List<Message> list = r2Var.LJIJI;
        ArrayList<Message> arrayList = new ArrayList();
        for (Message message : list) {
            Message message2 = message;
            if (TextUtils.isEmpty(message2.msgId) || TextUtils.equals(message2.msgId, CardStruct.IStatusCode.DEFAULT)) {
                arrayList.add(message);
            }
        }
        for (Message message3 : arrayList) {
            message3.LIZIZ = 9;
            LJJJLIIL(message3, false, false);
        }
    }

    public final int LJJIJ(Message message) {
        Iterator it2 = ((ArrayList) LJJLI(message.replyUuid)).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(((Message) it2.next()).msgId, message.msgId)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final Message LJJIJIIJI(String str) {
        try {
            List<C1862400yZ4> listLJIIJ = this.LJI.LIZ().LJIIJ(str);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
            Iterator<C1862400yZ4> it2 = listLJIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1862370yZ1.LIZIZ(it2.next()));
            }
            return (Message) C13LP.LJJJLL(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJJJJL(r2 r2Var) {
        SubConversationInfo subConversationInfo = r2Var.LJJJJ;
        if (subConversationInfo != null && C123100dR.LIZ(subConversationInfo.subConversationId) && subConversationInfo.createNewConversation && 1 != 0) {
            this.LJIIIIZZ.status = 4;
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320290Ch1(this, null));
            this.LJI.LIZ().LJIILL(C1863450yal.LIZ(this.LJIIIIZZ, 0L, 6));
            C1870240yli.LIZ(new AwS548S0100000_4(this, 250), false);
        }
    }

    public final void LJJJJLL(r2 r2Var) {
        SubConversationInfo subConversationInfo = r2Var.LJJJJ;
        if (subConversationInfo != null && C123100dR.LIZ(subConversationInfo.subConversationId) && subConversationInfo.createNewConversation && 1 != 0) {
            SubConversationConfig subConversationConfig = this.LJIIIIZZ;
            if (subConversationConfig.status == 3) {
                subConversationConfig.status = 6;
                ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
                C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320300Ch2(this, subConversationConfig, null));
                this.LJI.LIZ().LJIILL(C1863450yal.LIZ(subConversationConfig, 0L, 6));
                C1870240yli.LIZ(new AwS548S0100000_4(subConversationConfig, 252), false);
            }
        }
    }

    public final void LJJJLZIJ(Message message) {
        if (((Boolean) C2279711EKz.LJIIIIZZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(this.LJIILJJIL, null, null, new C320260Cgy(this, message, null), 3);
        } else {
            LJJJLIIL(message, false, false);
        }
    }

    public final void LJJL(r2 r2Var) {
        LJJJJLL(r2Var);
        LJIJ(r2Var, false);
        LJJIJL(r2Var, false);
        LJJJJI(this, r2Var.LIZJ, r2Var, 0, null, null, null, null, 124);
    }

    public final List<Message> LJJLI(String str) {
        List<C1862400yZ4> listLJIIIIZZ = this.LJI.LIZ().LJIIIIZZ(str);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
        Iterator<C1862400yZ4> it2 = listLJIIIIZZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1862370yZ1.LIZIZ(it2.next()));
        }
        return arrayList;
    }

    public final void LJJLIIIIJ(r2 r2Var) {
        r2 r2Var2 = new r2(1, r2Var.LIZJ, r2Var.LIZLLL, r2Var.LJ, r2Var.LJFF, r2Var.LJI, r2Var.LJII, r2Var.LJIIIIZZ, r2Var.LJIIIZ, r2Var.LJIIJ, r2Var.LJIIJJI, r2Var.LJIIL, r2Var.LJIILIIL, r2Var.LJIILJJIL, r2Var.LJIILL, r2Var.LJIILLIIL, r2Var.LJIIZILJ, r2Var.LJIJ, r2Var.LJIJI, r2Var.LJIJJ, r2Var.LJIJJLI, r2Var.LJIL, r2Var.LJJ, r2Var.LJJI, r2Var.LJJIFFI, r2Var.LJJII, r2Var.LJJIII, r2Var.LJJIIJ, r2Var.LJJIIJZLJL, r2Var.LJJIIZ, r2Var.LJJIIZI, r2Var.LJJIJ, r2Var.LJJIJIIJI, r2Var.LJJIJIIJIL, r2Var.LJJIJIL, r2Var.LJJIJL, r2Var.LJJIJLIJ, r2Var.LJJIL, r2Var.LJJIZ, r2Var.LJJJ, r2Var.LJJJI, r2Var.LJJJIL, r2Var.LJJJJ, r2Var.LJJJJI, r2Var.LJJJJIZL);
        r2Var2.LJJJJJ = p2.b.IMMEDIATE;
        LJIILIIL(r2Var2);
    }

    public final Object LJJLIIIJ(InterfaceC1364105Vn<? super u2> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        u2 u2Var = this.LJII;
        if (!u2Var.LIZ && TextUtils.isEmpty(u2Var.LJ)) {
            C1870240yli.LIZ(AFwS217S0000000_28.get$arr$(399), true);
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C325140Coq(this, c2252611DEt, null));
        } else {
            C1870240yli.LIZ(new AwS548S0100000_4(this, 256), true);
            u2 u2Var2 = this.LJII;
            C189200o6.m2constructorimpl(u2Var2);
            c2252611DEt.resumeWith(u2Var2);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object LJJLIIIJILLIZJL(InterfaceC1364105Vn<? super SubConversationConfig> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        SubConversationConfig subConversationConfig = this.LJIIIIZZ;
        if (!subConversationConfig.LIZ && subConversationConfig.subConversationId.length() != 0) {
            C1870240yli.LIZ(AFwS217S0000000_28.get$arr$(401), true);
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C325130Cop(this, c2252611DEt, null));
        } else {
            C1870240yli.LIZ(new AwS548S0100000_4(this, 257), true);
            SubConversationConfig subConversationConfig2 = this.LJIIIIZZ;
            C189200o6.m2constructorimpl(subConversationConfig2);
            c2252611DEt.resumeWith(subConversationConfig2);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LJJIJIL(C1863280yaU c1863280yaU, r2 r2Var) {
        k9 k9VarLIZ = r2Var.LIZ();
        List<BatchUpdateMessage> list = r2Var.LJIJJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<BatchUpdateMessage> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320380ChA(arrayList, r2Var, k9VarLIZ, null));
    }

    public static void LJJJJIZL(TakoQuestionnaire takoQuestionnaire, r2 r2Var) {
        Message message = new Message(null, null, null, new MessageSender(2, 0L, 0L, false, ""), null, null, false, null, 0L, 0L, UUID.randomUUID().toString(), 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 6, null, System.currentTimeMillis(), 0, 0, null, 0L, null, false, null, null, null, null, null, takoQuestionnaire, false, null, -1033, 1834927, null);
        message.LIZJ(new AwS606S0100000_27(takoQuestionnaire, 185));
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.QUEUE, AFwS232S0000000_4.get$arr$(267), new C320210Cgt(r2Var, message, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e9 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0476 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a5 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04df A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04fe A[Catch: Exception -> 0x05be, TRY_LEAVE, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0528 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x053a A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0540 A[Catch: Exception -> 0x05be, TryCatch #0 {Exception -> 0x05be, blocks: (B:107:0x019a, B:108:0x01a0, B:110:0x01a6, B:111:0x01b2, B:124:0x01ca, B:125:0x01cd, B:127:0x01d2, B:128:0x01db, B:131:0x01f5, B:134:0x0230, B:135:0x0239, B:137:0x0245, B:138:0x024a, B:139:0x0258, B:143:0x0265, B:147:0x0271, B:148:0x0281, B:278:0x0520, B:280:0x0528, B:283:0x052e, B:289:0x053a, B:291:0x0540, B:293:0x0546, B:294:0x054a, B:304:0x0575, B:305:0x0580, B:307:0x0587, B:308:0x058b, B:310:0x0590, B:312:0x0596, B:315:0x05a0, B:317:0x05a4, B:323:0x05b2, B:297:0x0551, B:298:0x055a, B:300:0x0560, B:302:0x056f, B:146:0x026b, B:151:0x0291, B:152:0x0299, B:153:0x029e, B:154:0x02a6, B:155:0x02ab, B:272:0x0508, B:158:0x02c9, B:159:0x02d1, B:161:0x02db, B:163:0x02df, B:164:0x02e2, B:165:0x02e7, B:169:0x02f9, B:171:0x02ff, B:173:0x0309, B:175:0x030f, B:177:0x0313, B:209:0x03bf, B:215:0x03d1, B:217:0x03d9, B:218:0x03db, B:220:0x03e9, B:221:0x03eb, B:227:0x03f5, B:231:0x0403, B:234:0x0454, B:235:0x0461, B:236:0x0470, B:238:0x0476, B:240:0x0480, B:242:0x0486, B:245:0x048c, B:246:0x0490, B:247:0x049f, B:249:0x04a5, B:251:0x04b4, B:253:0x04ba, B:255:0x04c0, B:257:0x04cc, B:259:0x04d0, B:260:0x04d2, B:262:0x04df, B:264:0x04eb, B:266:0x04f3, B:268:0x04f9, B:269:0x04fe, B:180:0x0322, B:182:0x0326, B:184:0x032a, B:185:0x032f, B:186:0x0334, B:188:0x0349, B:275:0x0516, B:191:0x035f, B:194:0x036a, B:198:0x0376, B:199:0x0386, B:201:0x0391, B:202:0x0394, B:197:0x0370, B:206:0x03b1, B:208:0x03bc, B:271:0x0505, B:274:0x0513, B:277:0x051d), top: B:328:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [X.0yPQ] */
    /* JADX WARN: Type inference failed for: r53v0, types: [X.0yaU] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fe -> B:42:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(defpackage.r2 r54, X.InterfaceC1364105Vn<? super kotlin.Unit> r55) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJIILL(r2, X.05Vn):java.lang.Object");
    }

    public final void LJIJ(r2 r2Var, boolean z) {
        int i = 3;
        if (r2Var.LIZLLL()) {
            if (r2Var.LIZIZ == 16) {
                Message message = r2Var.LIZJ;
                if (z) {
                    i = 2;
                }
                message.LIZIZ = i;
            } else {
                Message message2 = r2Var.LIZJ;
                if (message2.LIZIZ == 1) {
                    message2.LIZIZ = 3;
                }
            }
            LJJJLIIL(r2Var.LIZJ, false, false);
            return;
        }
        if (r2Var.LJFF()) {
            Iterator<UpSyncMessage> it2 = r2Var.LJIIJ.messages.iterator();
            while (it2.hasNext()) {
                Message message3 = it2.next().LIZ;
                if (message3 != null) {
                    message3.LIZIZ = 3;
                }
                LJJJLIIL(r2Var.LIZJ, false, false);
            }
        }
    }

    public final void LJIJI(Message message, boolean z) {
        message.LIZIZ = 6;
        if (message.LIZLLL == 0 && !z) {
            message.LIZLLL = System.currentTimeMillis();
            message.LJ = 0;
        }
        if (message.serverStatus == 2) {
            message.LIZIZ = 9;
            message.LJ = 0;
        }
        message.LJII = System.currentTimeMillis();
        LJJJLZIJ(message);
    }

    public final void LJIL(r2 r2Var, u2 u2Var) {
        Message message = r2Var.LIZJ;
        if (message.msgType <= 0) {
            message.msgType = 1;
        }
        message.sender = new MessageSender(1, 0L, 0L, true, "");
        String str = r2Var.LJJIFFI.get("image_template_info");
        if ((str != null || (str = r2Var.LJJIFFI.get("template_info")) != null) && C123100dR.LIZ(str)) {
            r2Var.LIZJ.ext.imageTemplateInfo = str;
        }
        LJJ(r2Var.LIZJ, r2Var.LJIILLIIL, u2Var);
        C1863380yae.LJJIL = r2Var.LIZJ.uuid;
    }

    public final void LJJI(r2 r2Var, u2 u2Var) {
        List<UpSyncMessage> list = r2Var.LJIIJ.messages;
        ArrayList<Message> arrayList = new ArrayList();
        Iterator<UpSyncMessage> it2 = list.iterator();
        while (it2.hasNext()) {
            Message message = it2.next().LIZ;
            if (message != null) {
                arrayList.add(message);
            }
        }
        for (Message message2 : arrayList) {
            message2.LJ++;
            LJJ(message2, r2Var.LJIILLIIL, u2Var);
        }
    }

    public final void LJJIFFI(Message message, u2 u2Var) {
        message.LIZIZ = 7;
        if (message.conversationId.length() == 0) {
            message.conversationId = u2Var.LIZIZ;
        }
        if (message.LIZLLL == 0) {
            message.LIZLLL = System.currentTimeMillis();
        }
        LJJJLZIJ(message);
    }

    public final void LJJIIJ(Message message, u2 u2Var) {
        if (message.conversationId.length() == 0) {
            message.conversationId = u2Var.LIZIZ;
        }
        if (message.LIZLLL == 0) {
            message.LIZLLL = System.currentTimeMillis();
            message.LJ = 0;
        }
        message.LJIIIIZZ = null;
        LJJJLZIJ(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(boolean r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r15 = this;
            r4 = r17
            r0 = r16
            boolean r1 = r4 instanceof X.C1863650yb5
            if (r1 == 0) goto L61
            r5 = r4
            X.0yb5 r5 = (X.C1863650yb5) r5
            int r3 = r5.LLILZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L61
            int r3 = r3 - r2
            r5.LLILZ = r3
        L16:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r3 = r5.LLILZ
            r2 = 1
            if (r3 == 0) goto L53
            if (r3 != r2) goto L67
            boolean r0 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            u2 r1 = (defpackage.u2) r1
            r1.LJIIJ = r0
            com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase r0 = r15.LJI
            X.0yao r0 = r0.LIZ()
            java.lang.String r2 = r1.LIZIZ
            long r3 = r1.LIZJ
            boolean r5 = r1.LJFF
            boolean r6 = r1.LJI
            int r7 = r1.LJII
            boolean r8 = r1.LJIIIIZZ
            boolean r14 = r1.LJIIIZ
            java.lang.String r9 = r1.LJIIL
            boolean r10 = r1.LJIIJ
            long r11 = r1.LJIILIIL
            int r13 = r1.LJIILJJIL
            X.0ybO r1 = new X.0ybO
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            r0.LJIIZILJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.C155000ia.LIZIZ(r1)
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r1 = r15.LJJLIIIJ(r5)
            if (r1 != r4) goto L28
            return r4
        L61:
            X.0yb5 r5 = new X.0yb5
            r5.<init>(r15, r4)
            goto L16
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJIIJZLJL(boolean, X.05Vn):java.lang.Object");
    }

    public final void LJJIJL(r2 r2Var, boolean z) {
        int i;
        if (r2Var.LIZLLL() || (i = r2Var.LIZIZ) == 6 || i == 7 || i == 15 || z) {
            C1870240yli.LIZ(AFwS217S0000000_28.get$arr$(400), false);
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            p2.b bVar = p2.b.IMMEDIATE;
            C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C320140Cgm(r2Var, this, null));
            C321910Cjd.LIZ(bVar, AFwS232S0000000_4.get$arr$(267), new C320130Cgl(r2Var, null));
        }
    }

    public final void LJJJJLI(r2 r2Var, u2 u2Var) {
        String str;
        SubConversationInfo subConversationInfo = r2Var.LJJJJ;
        if (subConversationInfo != null && C123100dR.LIZ(subConversationInfo.subConversationId) && subConversationInfo.createNewConversation && 1 != 0) {
            String str2 = u2Var.LIZIZ;
            String str3 = subConversationInfo.subConversationId;
            if (str3 == null) {
                str3 = "";
            }
            this.LJIIIIZZ = new SubConversationConfig(true, str2, str3, "", u2Var.LJIILJJIL, u2Var.LJIILIIL, 0L, 0L, 0L, System.currentTimeMillis(), null, 3);
            ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
            C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320280Ch0(this, null));
            this.LJI.LIZ().LIZLLL(C1863450yal.LIZ(this.LJIIIIZZ, 0L, 6));
            SubConversationEntranceInfo subConversationEntranceInfo = r2Var.LJIILLIIL.LJIILJJIL;
            if (subConversationEntranceInfo != null && (str = subConversationEntranceInfo.unreadMsgId) != null && str.length() > 0) {
                this.LJI.LIZ().LJIJJ(str, this.LJIIIIZZ.subConversationId);
            }
            C1870240yli.LIZ(new AwS548S0100000_4(this, 251), false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:66))(0)|7|(1:(1:(1:(3:12|13|14)(2:67|68))(3:69|70|71))(1:18))(2:15|(1:17))|19|(1:31)(1:23)|24|(2:26|(4:28|(1:30)|70|71))|72|32|(1:36)(7:40|(1:42)(1:65)|43|(1:64)(1:47)|(2:63|61)(4:53|(1:62)|(1:60)(0)|61)|13|14)|37|(1:39)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r12);
        com.bytedance.crash.Npth.reportBizException("tako", r12, "tryInitSubConversation fail", X.C2097608Jq.LJ());
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJI(X.C1863380yae r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJLIIIJJI(X.0yae, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJLJLI(X.C1863380yae r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C321660CjE
            if (r0 == 0) goto L81
            r6 = r9
            X.0CjE r6 = (X.C321660CjE) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L87
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.0yai r3 = X.C1863380yae.LJJII
            long r0 = r8.LJII
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)
            int r0 = r8.LJIIIIZZ
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = r8.LJIILIIL
            X.0D0u r0 = r3.LIZLLL(r1, r2, r0)
            r1 = 0
            if (r0 == 0) goto L76
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r4) goto L76
            long r0 = r8.LJII
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)
            int r0 = r8.LJIIIIZZ
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = r8.LJIILIIL
            X.0D0u r3 = r3.LIZLLL(r1, r2, r0)
            if (r3 == 0) goto L22
            X.0Ch9 r2 = new X.0Ch9
            r0 = 0
            r2.<init>(r0)
            X.14dG r1 = new X.14dG
            r0 = 2
            r1.<init>(r2, r3, r0)
            r6.LLILLL = r4
            java.lang.Object r0 = X.C09IC.LJI(r1, r6)
            if (r0 != r5) goto L22
            return r5
        L76:
            r0 = 2037(0x7f5, float:2.854E-42)
            kotlin.jvm.internal.AFwS190S0000000_4 r0 = kotlin.jvm.internal.AFwS190S0000000_4.get$arr$(r0)
            X.C1870240yli.LIZ(r0, r1)
            r4 = 0
            goto L22
        L81:
            X.0CjE r6 = new X.0CjE
            r6.<init>(r7, r9)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJLIIIJLJLI(X.0yae, X.05Vn):java.lang.Object");
    }

    public static void LJJIZ(C1863280yaU c1863280yaU, List list, r2 r2Var) {
        k9 k9VarLIZ = r2Var.LIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Message) it2.next()).LJ());
        }
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320360Ch8(arrayList, r2Var, k9VarLIZ, null));
    }

    public static void LJJJJ(C1863280yaU c1863280yaU, Message message, r2 r2Var) {
        k9 k9VarLIZ = r2Var.LIZ();
        c1863280yaU.getClass();
        Message messageLJ = message.LJ();
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320350Ch7(r2Var, messageLJ, k9VarLIZ, null));
    }

    public static void LJJJJJ(r2 r2Var, Message message, Message message2) {
        if (r2Var.LIZJ.msgType == 6) {
            String str = null;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C320230Cgv(r2Var, null), 2);
            C1863380yae.LJJIJL = message;
            String str2 = r2Var.LIZJ.uuid;
            if (message2 != null) {
                str = message2.uuid;
            }
            if (Intrinsics.LJFF(str2, str)) {
                C1863380yae.LJJIJIL = message2;
            }
        }
    }

    public final boolean LJI(Message message, u2 u2Var, SubConversationConfig subConversationConfig) {
        long j;
        boolean z;
        if (u2Var.LIZIZ.length() == 0 || message.sessionId.length() == 0) {
            return false;
        }
        if (C123100dR.LIZ(subConversationConfig.subConversationId) && message.isPush && !message.LIZ) {
            message.LIZ = true;
            LJJJLIIL(message, false, false);
            return true;
        }
        C801390Vc9 c801390Vc9 = (C801390Vc9) C13LP.LJJJLL(this.LJI.LIZ().LJIILIIL(u2Var.LIZIZ, subConversationConfig.subConversationId));
        if (c801390Vc9 == null) {
            return false;
        }
        if (subConversationConfig.subConversationId.length() != 0 && !C1861740yY0.LIZ(subConversationConfig.subConversationId) && !message.isPush) {
            j = message.subServerSeq;
        } else {
            j = message.serverSeq;
        }
        if (j > c801390Vc9.LJ) {
            z = true;
        } else {
            z = false;
        }
        if (!message.LIZ) {
            message.LIZ = true;
            if (!z) {
                LJJJLIIL(message, false, false);
            }
        }
        return z;
    }

    public final void LJII(r2 r2Var, List<BaseImage> list, Function0<Unit> function0) {
        List<BaseImage> list2;
        Integer num;
        String str;
        boolean z = list instanceof Collection;
        if (z && list.isEmpty()) {
            return;
        }
        Iterator<BaseImage> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().imageSceneType == 10002) {
                if (z && list.isEmpty()) {
                    return;
                }
                Iterator<BaseImage> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (it3.next().imageSceneType == 0) {
                        if (z && list.isEmpty()) {
                            return;
                        }
                        Iterator<BaseImage> it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (it4.next().imageSceneType == 10001) {
                                ArrayList arrayList = new ArrayList();
                                for (BaseImage baseImage : list) {
                                    if (AnonymousClass1418.LJII(baseImage)) {
                                        arrayList.add(baseImage);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        if (!C1856460yPU.LIZIZ((BaseImage) it5.next())) {
                                            return;
                                        }
                                    }
                                }
                                ArrayList<BaseImage> arrayList2 = new ArrayList();
                                for (BaseImage baseImage2 : list) {
                                    BaseImage baseImage3 = baseImage2;
                                    if (AnonymousClass1418.LJII(baseImage3) || (baseImage3.imageSceneType == 10003 && (str = baseImage3.uri) != null && str.length() != 0)) {
                                        arrayList2.add(baseImage2);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    for (BaseImage baseImage4 : arrayList2) {
                                        if (!C1856460yPU.LIZIZ(baseImage4) && ((num = baseImage4.uploadStatus) == null || num.intValue() != 4)) {
                                            return;
                                        }
                                    }
                                }
                                if (((ArrayList) C1856460yPU.LIZ(list)).size() < arrayList.size()) {
                                    return;
                                }
                                function0.invoke();
                                r2Var.LIZJ.LJIIJJI(new AwS606S0100000_27(C1856460yPU.LIZ(list), (List<TakoActiveBotItem>) 617));
                                LJJJJI(this, r2Var.LIZJ, r2Var, 0, null, null, null, null, 124);
                                LJJJLIIL(r2Var.LIZJ, false, true);
                                TakoMixFeed takoMixFeedLJIIIZ = r2Var.LIZJ.LJIIIZ();
                                if (takoMixFeedLJIIIZ == null || (list2 = takoMixFeedLJIIIZ.images) == null) {
                                    list2 = C13BV.INSTANCE;
                                }
                                LJJLIIIIJ(r2Var);
                                Function1<List<BaseImage>, Unit> function1 = r2Var.LJ;
                                if (function1 != null) {
                                    function1.invoke(list2);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void LJIIJ(r2 r2Var, u2 u2Var, SubConversationConfig subConversationConfig) {
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(r2Var.LJJJJJ, AFwS232S0000000_4.get$arr$(267), new C1863320yaY(r2Var, subConversationConfig, u2Var, this, null));
    }

    public final void LJJ(Message message, C1863380yae c1863380yae, u2 u2Var) {
        message.LIZIZ = 1;
        if (message.conversationId.length() == 0) {
            message.conversationId = u2Var.LIZIZ;
        }
        if (TextUtils.isEmpty(message.sessionId)) {
            message.sessionId = c1863380yae.LJ;
        }
        if (TextUtils.isEmpty(message.uuid)) {
            message.uuid = UUID.randomUUID().toString();
        }
        String str = c1863380yae.LJIILIIL;
        if (C123100dR.LIZ(str) && str != null && TextUtils.isEmpty(message.subConversationId)) {
            message.subConversationId = str;
        }
        if (message.LIZLLL == 0) {
            message.LIZLLL = System.currentTimeMillis();
        }
        LJJJLIIL(message, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b2 A[PHI: r7 r8 r9 r21 r27
      0x02b2: PHI (r7v5 boolean) = (r7v3 boolean), (r7v6 boolean) binds: [B:152:0x0325, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r8v6 int) = (r8v4 int), (r8v7 int) binds: [B:152:0x0325, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r9v6 boolean) = (r9v4 boolean), (r9v7 boolean) binds: [B:152:0x0325, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r21v6 boolean) = (r21v4 boolean), (r21v7 boolean) binds: [B:152:0x0325, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r27v2 boolean) = (r27v0 boolean), (r27v3 boolean) binds: [B:152:0x0325, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c1 A[PHI: r6 r12
      0x02c1: PHI (r6v8 int) = (r6v3 int), (r6v9 int) binds: [B:136:0x030e, B:126:0x02c0] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r12v5 java.lang.String) = (r12v0 java.lang.String), (r12v6 java.lang.String) binds: [B:136:0x030e, B:126:0x02c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0311 A[PHI: r6 r12
      0x0311: PHI (r6v4 int) = (r6v3 int), (r6v8 int) binds: [B:136:0x030e, B:128:0x02c3] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v5 java.lang.String) binds: [B:136:0x030e, B:128:0x02c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0315 A[PHI: r4 r6 r12
      0x0315: PHI (r4v10 boolean) = (r4v9 boolean), (r4v12 boolean) binds: [B:139:0x0312, B:131:0x02c9] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r6v5 int) = (r6v4 int), (r6v7 int) binds: [B:139:0x0312, B:131:0x02c9] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:139:0x0312, B:131:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0317 A[PHI: r21
      0x0317: PHI (r21v1 boolean) = (r21v0 boolean), (r21v10 boolean) binds: [B:105:0x0292, B:107:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031b A[PHI: r9 r21
      0x031b: PHI (r9v2 boolean) = (r9v1 boolean), (r9v9 boolean) binds: [B:143:0x0318, B:110:0x029c] A[DONT_GENERATE, DONT_INLINE]
      0x031b: PHI (r21v2 boolean) = (r21v1 boolean), (r21v9 boolean) binds: [B:143:0x0318, B:110:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031f A[PHI: r8 r9 r21
      0x031f: PHI (r8v3 int) = (r8v2 int), (r8v8 int) binds: [B:146:0x031c, B:113:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r9v3 boolean) = (r9v2 boolean), (r9v8 boolean) binds: [B:146:0x031c, B:113:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r21v3 boolean) = (r21v2 boolean), (r21v8 boolean) binds: [B:146:0x031c, B:113:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0323 A[PHI: r7 r8 r9 r21
      0x0323: PHI (r7v3 boolean) = (r7v2 boolean), (r7v6 boolean), (r7v6 boolean) binds: [B:149:0x0320, B:116:0x02a8, B:118:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r8v4 int) = (r8v3 int), (r8v7 int), (r8v7 int) binds: [B:149:0x0320, B:116:0x02a8, B:118:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r9v4 boolean) = (r9v3 boolean), (r9v7 boolean), (r9v7 boolean) binds: [B:149:0x0320, B:116:0x02a8, B:118:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r21v4 boolean) = (r21v3 boolean), (r21v7 boolean), (r21v7 boolean) binds: [B:149:0x0320, B:116:0x02a8, B:118:0x02ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(X.InterfaceC1364105Vn r36, kotlin.jvm.functions.Function1 r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJJJZI(X.05Vn, kotlin.jvm.functions.Function1, boolean):java.lang.Object");
    }

    public final boolean LJJJLIIL(Message message, boolean z, boolean z2) {
        boolean zLJIIIZ = false;
        if (((Boolean) this.LJIIL.invoke(message)).booleanValue()) {
            C1870240yli.LIZ(AFwS219S0000000_30.get$arr$(106), false);
            return false;
        }
        if (((Boolean) this.LJIILIIL.invoke(message)).booleanValue()) {
            C1870240yli.LIZ(AFwS219S0000000_30.get$arr$(107), false);
            return false;
        }
        try {
            zLJIIIZ = this.LJI.LIZ().LJIIIZ(message, z, z2);
            return zLJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJIIIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJIZ(X.InterfaceC1364105Vn r28, kotlin.jvm.functions.Function1 r29, boolean r30) {
        /*
            r27 = this;
            r3 = r28
            boolean r0 = r3 instanceof X.C1863660yb6
            r5 = r27
            if (r0 == 0) goto L71
            r6 = r3
            X.0yb6 r6 = (X.C1863660yb6) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r6.LLILZ = r2
        L16:
            java.lang.Object r4 = r6.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L2c
            if (r1 != r2) goto L77
            X.C155000ia.LIZIZ(r4)
        L29:
            u2 r0 = r5.LJII
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L3e
            goto L7f
        L30:
            X.C155000ia.LIZIZ(r4)
            r6.LLILZ = r0     // Catch: java.lang.Exception -> L3e
            r0 = r30
            r1 = r29
            java.lang.Object r4 = r5.LJJJJZI(r6, r1, r0)     // Catch: java.lang.Exception -> L3e
            goto L80
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            u2 r7 = new u2
            r8 = 0
            r9 = 0
            r10 = 0
            r26 = 32767(0x7fff, float:4.5916E-41)
            r12 = r10
            r14 = r9
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r9
            r23 = r10
            r25 = r8
            r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            r5.LJII = r7
            X.05YC<u2> r0 = r5.LJIIJ
            r6.LL = r1
            r6.LLILZ = r2
            java.lang.Object r0 = r0.emit(r7, r6)
            if (r0 != r3) goto L29
            return r3
        L71:
            X.0yb6 r6 = new X.0yb6
            r6.<init>(r5, r3)
            goto L16
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7f:
            return r4
        L80:
            if (r4 != r3) goto L83
            return r3
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJLIIIJJIZ(X.05Vn, kotlin.jvm.functions.Function1, boolean):java.lang.Object");
    }

    public static void LJJIL(C1863280yaU c1863280yaU, MessageChunkResult messageChunkResult, Message message, int i) {
        c1863280yaU.getClass();
        ITakoDebugService value = LJIJ.getValue();
        if (value != null) {
            value.isOpen();
        }
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZLLL(C1863380yae c1863380yae, boolean z, int i, Map<String, String> map) {
        return C1863390yaf.LJIIJ(c1863380yae, z, i, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(int r16, int r17, java.lang.String r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r15 = this;
            r4 = r19
            r2 = r18
            r6 = r16
            r7 = r17
            boolean r0 = r4 instanceof X.C1863630yb3
            if (r0 == 0) goto L90
            r5 = r4
            X.0yb3 r5 = (X.C1863630yb3) r5
            int r3 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L90
            int r3 = r3 - r1
            r5.LLILZLL = r3
        L1a:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r3 = 1
            if (r0 == 0) goto L7e
            if (r0 != r3) goto L96
            int r7 = r5.LLILLJJLI
            int r6 = r5.LL
            java.lang.Object r2 = r5.LLILLL
            java.lang.String r2 = (java.lang.String) r2
            X.C155000ia.LIZIZ(r1)
        L32:
            u2 r1 = (defpackage.u2) r1
            if (r6 == 0) goto L7b
            if (r6 == r3) goto L76
            r0 = 2
            if (r6 == r0) goto L71
            r0 = 3
            if (r6 == r0) goto L7b
            r0 = 7
            if (r6 == r0) goto L6e
            r0 = 9
            if (r6 != r0) goto L47
            r1.LJIIIZ = r3
        L47:
            com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase r0 = r15.LJI
            X.0yao r0 = r0.LIZ()
            java.lang.String r2 = r1.LIZIZ
            long r3 = r1.LIZJ
            boolean r5 = r1.LJFF
            boolean r6 = r1.LJI
            int r7 = r1.LJII
            boolean r8 = r1.LJIIIIZZ
            boolean r14 = r1.LJIIIZ
            java.lang.String r9 = r1.LJIIL
            boolean r10 = r1.LJIIJ
            long r11 = r1.LJIILIIL
            int r13 = r1.LJIILJJIL
            X.0ybO r1 = new X.0ybO
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            r0.LJIIZILJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6e:
            r1.LJIIIIZZ = r3
            goto L47
        L71:
            r1.LJI = r3
            r1.LJII = r7
            goto L47
        L76:
            r1.LJFF = r3
            r1.LJII = r7
            goto L47
        L7b:
            r1.LJIIL = r2
            goto L47
        L7e:
            X.C155000ia.LIZIZ(r1)
            r5.LLILLL = r2
            r5.LL = r6
            r5.LLILLJJLI = r7
            r5.LLILZLL = r3
            java.lang.Object r1 = r15.LJJLIIIJ(r5)
            if (r1 != r4) goto L32
            return r4
        L90:
            X.0yb3 r5 = new X.0yb3
            r5.<init>(r15, r4)
            goto L1a
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJIIZ(int, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo r37, long r38, int r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJJJJL(com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo, long, int, X.05Vn):java.lang.Object");
    }

    public final void LJJJJZ(TakoSug takoSug, r2 r2Var, k9 k9Var, int i) {
        C1870240yli.LIZ(new AwS548S0100000_4(takoSug, 253), false);
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.IMMEDIATE, AFwS232S0000000_4.get$arr$(267), new C320460ChI(r2Var, takoSug, this, k9Var, i, null));
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZIZ(int i, C1863380yae c1863380yae, Message message, Function1<? super w2, Unit> function1, C1E8R c1e8r) {
        return C1863390yaf.LJIIIIZZ(i, c1863380yae, message, function1, c1e8r);
    }

    public final void LJIILJJIL(r2 r2Var, int i, String str, k9 k9Var, boolean z) {
        LJIJ(r2Var, z);
        if (r2Var.LIZLLL() || r2Var.LJ()) {
            LJJJJI(this, r2Var.LIZJ, r2Var, i, str, k9Var, null, null, 96);
        }
        if (r2Var.LJFF()) {
            List<UpSyncMessage> list = r2Var.LJIIJ.messages;
            ArrayList arrayList = new ArrayList();
            Iterator<UpSyncMessage> it2 = list.iterator();
            while (it2.hasNext()) {
                Message message = it2.next().LIZ;
                if (message != null) {
                    arrayList.add(message);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                LJJJJI(this, (Message) it3.next(), r2Var, i, str, k9Var, null, null, 96);
            }
        }
        if (r2Var.LIZIZ == 5) {
            LJJJJZ(new TakoSug(true, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, System.currentTimeMillis(), false, null, false, r2Var.LJJJI, false, r2Var.LJJJIL, false, null, null, 1744830462, 29, null), r2Var, k9Var, i);
        }
        if (r2Var.LIZIZ == 14) {
            Function1<TakoSug, Unit> function1 = r2Var.LJII;
            if (function1 != null) {
                function1.invoke(null);
            }
            Function1<EntityIntro, Unit> function12 = r2Var.LJIIIIZZ;
            if (function12 != null) {
                function12.invoke(null);
            }
        }
        LJJJJLL(r2Var);
        InterfaceC1859790yUr interfaceC1859790yUr = r2Var.LJIL;
        if (interfaceC1859790yUr != null) {
            interfaceC1859790yUr.onFail();
        }
        if (r2Var.LIZIZ == 12) {
            Message message2 = r2Var.LJJ;
            message2.LJ++;
            message2.LIZIZ = 14;
            LJJJLIIL(message2, false, true);
        }
        LJIIL(LIZLLL(r2Var.LJIILLIIL, false, 4, new LinkedHashMap()));
    }

    public C1863280yaU(Context context, String str, Function0<EntryDoc> function0, long j, int i, String str2) {
        InterfaceC1859700yUi c1785070wYL;
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = function0;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJFF = str2;
        MessageDatabase messageDatabase = LJIIZILJ;
        if (messageDatabase == null || !TextUtils.equals(LJIILLIIL, str)) {
            C1863400yag.LIZ.getClass();
            C1863400yag.LIZ(null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_im_");
            sbLIZ.append(str);
            sbLIZ.append(".db");
            C796500VMi c796500VMiLIZ = C0OGG.LIZ(context, MessageDatabase.class, C2188811AlT.LIZIZ(sbLIZ));
            c796500VMiLIZ.LJII = true;
            c796500VMiLIZ.LIZJ();
            if (!((Boolean) C0B1A.LIZ.getValue()).booleanValue()) {
                AbstractC796510VMj[] abstractC796510VMjArr = (AbstractC796510VMj[]) C797090VOp.LIZ.toArray(new AbstractC796510VMj[0]);
                c796500VMiLIZ.LIZ((AbstractC796510VMj[]) Arrays.copyOf(abstractC796510VMjArr, abstractC796510VMjArr.length));
            }
            messageDatabase = (MessageDatabase) c796500VMiLIZ.LIZIZ();
            LJIILLIIL = str;
            LJIIZILJ = messageDatabase;
        }
        this.LJI = messageDatabase;
        this.LJII = new u2(false, null, 0L, 0L, null, false, false, 0, false, false, false, false, null, 0L, 0, 32767);
        this.LJIIIIZZ = new SubConversationConfig(false, "", "", "", 0, 0L, 0L, 0L, 0L, 0L, null, 0);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LJIIIZ = c054gLIZ;
        this.LJIIJ = C09IR.LIZIZ(1, 1, null, 4);
        this.LJIIJJI = C09IR.LIZIZ(1, 1, null, 4);
        this.LJIIL = new AwS606S0100000_27(this, 184);
        this.LJIILIIL = AFwS269S0000000_27.get$arr$(155);
        this.LJIILJJIL = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()));
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZIZ()) {
            c1785070wYL = new C1785070wYL(c054gLIZ);
        } else {
            c1785070wYL = new InterfaceC1859700yUi() { // from class: X.0wYP
                @Override // X.InterfaceC1859700yUi
                public final void LIZ() {
                }

                @Override // X.InterfaceC1859700yUi
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1859700yUi
                public final void LJI() {
                }

                @Override // X.InterfaceC1859700yUi
                public final void LIZIZ(AwS393S0200000_27 awS393S0200000_27) {
                    awS393S0200000_27.invoke(null);
                }

                @Override // X.InterfaceC1859700yUi
                public final void LIZJ(MessageChunkResult messageChunkResult, Message message, Function1<? super C1785090wYN, Unit> function1) {
                    function1.invoke(null);
                }

                @Override // X.InterfaceC1859700yUi
                public final void LJ(MessageChunkResult messageChunkResult, Message message, C1859780yUq c1859780yUq) {
                    c1859780yUq.invoke(null);
                }

                @Override // X.InterfaceC1859700yUi
                public final void LJFF(MessageChunkResult messageChunkResult, Message message, C1858680yT4 c1858680yT4) {
                    c1858680yT4.invoke(null);
                }
            };
        }
        this.LJIILL = c1785070wYL;
    }

    @Override // X.InterfaceC320160Cgo
    public final r2 LIZJ(Message message, C1863380yae c1863380yae, boolean z, Map<String, String> map, String str, ActionDoc actionDoc) {
        return C1863390yaf.LJIILIIL(message, c1863380yae, z, map, str);
    }

    public static void LJJJIL(C1863280yaU c1863280yaU, Message message, r2 r2Var, int i, k9 k9Var, boolean z, int i2) {
        Message messageLJ = message;
        boolean z2 = z;
        k9 k9VarLIZ = k9Var;
        if ((i2 & 8) != 0) {
            k9VarLIZ = r2Var.LIZ();
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        C07QJ.LIZ.getClass();
        if (!C07QJ.LIZIZ()) {
            messageLJ = messageLJ.LJ();
        }
        C1870240yli.LIZ(new AwS548S0100000_4(messageLJ, 535), false);
        ConcurrentLinkedQueue<AbstractC321890Cjb> concurrentLinkedQueue = AbstractC321890Cjb.LIZIZ;
        C321910Cjd.LIZ(p2.b.QUEUE, AFwS232S0000000_4.get$arr$(267), new C320200Cgs(r2Var, z2, messageLJ, i, k9VarLIZ, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJ(java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.Message> r28, defpackage.r2 r29, boolean r30, boolean r31, defpackage.k9 r32, boolean r33, X.InterfaceC1364105Vn<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJJ(java.util.List, r2, boolean, boolean, k9, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0269 A[PHI: r30 r31
      0x0269: PHI (r30v3 java.lang.String) = (r30v2 java.lang.String), (r30v7 java.lang.String) binds: [B:98:0x0266, B:84:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r31v1 java.lang.Integer) = (r31v0 java.lang.Integer), (r31v5 java.lang.Integer) binds: [B:98:0x0266, B:84:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026e A[PHI: r6 r16 r30 r31
      0x026e: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:101:0x026b, B:91:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v2 java.lang.String) binds: [B:101:0x026b, B:91:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r30v5 java.lang.String) = (r30v3 java.lang.String), (r30v6 java.lang.String) binds: [B:101:0x026b, B:91:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r31v3 java.lang.Integer) = (r31v1 java.lang.Integer), (r31v4 java.lang.Integer) binds: [B:101:0x026b, B:91:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221 A[PHI: r30 r31
      0x0221: PHI (r30v7 java.lang.String) = (r30v2 java.lang.String), (r30v9 java.lang.String) binds: [B:98:0x0266, B:82:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r31v5 java.lang.Integer) = (r31v0 java.lang.Integer), (r31v6 java.lang.Integer) binds: [B:98:0x0266, B:82:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJI(X.C1863280yaU r38, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r39, defpackage.r2 r40, int r41, java.lang.String r42, defpackage.k9 r43, com.ss.android.ugc.aweme.tako.ccl.model.api.Extra r44, java.lang.String r45, int r46) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863280yaU.LJJJJI(X.0yaU, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, r2, int, java.lang.String, k9, com.ss.android.ugc.aweme.tako.ccl.model.api.Extra, java.lang.String, int):void");
    }
}
