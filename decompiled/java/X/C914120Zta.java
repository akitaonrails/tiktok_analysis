package X;

import Y.ACListenerS117S0200000_14;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.Response;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.experiment.IMRecallEnhancementConfig;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.DeleteForMeUndoCoordinator;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS12S0002000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914120Zta implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$1(C914120Zta c914120Zta, C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
            case 6:
                LIZIZ$6(this, c0ymw);
                break;
            case 7:
                LIZIZ$7(this, c0ymw);
                break;
            case 8:
                LIZIZ$8(this, c0ymw);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, c0ymw);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ$11(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZIZ$12(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSuccess$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onSuccess$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSuccess$12(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C914120Zta c914120Zta, C0YMW c0ymw) {
        ((InterfaceC863600XuI) c914120Zta.l0).LIZIZ(c0ymw);
        ((C0YJ9) c914120Zta.l1).LIZ(0, "imsdk_result");
        ((C0YJ9) c914120Zta.l1).LIZ(Integer.valueOf(c0ymw.getCode()), "error_code");
        ((C0YJ9) c914120Zta.l1).LIZLLL();
    }

    public static final void LIZIZ$10(C914120Zta c914120Zta, C0YMW c0ymw) {
        Function1 function1 = (Function1) c914120Zta.l1;
        if (function1 != null) {
            function1.invoke((Map) c914120Zta.l0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[PHI: r0
      0x0058: PHI (r0v12 java.lang.String) = (r0v10 java.lang.String), (r0v14 java.lang.String) binds: [B:20:0x0056, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$11(X.C914120Zta r4, X.C0YMW r5) {
        /*
            X.0YjW r0 = X.C882400YjW.LIZ
            r0.getClass()
            X.C882400YjW.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sendHttp failed: "
            r1.append(r0)
            java.lang.Object r0 = r4.l1
            X.0Yl9 r0 = (X.C883410Yl9) r0
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SDKNetworkBridge"
            X.C882690Yjz.LJFF(r0, r1)
            r3 = -1000(0xfffffffffffffc18, float:NaN)
            if (r5 == 0) goto L73
            int r0 = r5.getStatus()
            if (r0 != 0) goto L75
        L35:
            r1 = 0
            if (r5 == 0) goto L71
            java.lang.Throwable r2 = r5.getThrowable()
        L3c:
            boolean r0 = r2 instanceof java.lang.Exception
            if (r0 == 0) goto L44
            java.lang.Exception r2 = (java.lang.Exception) r2
            if (r2 != 0) goto L5f
        L44:
            java.lang.Exception r2 = new java.lang.Exception
            if (r5 == 0) goto L54
            java.lang.Throwable r0 = r5.getThrowable()
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L58
        L54:
            java.lang.String r0 = "empty_throwable"
            if (r5 == 0) goto L5c
        L58:
            java.lang.Throwable r1 = r5.getThrowable()
        L5c:
            r2.<init>(r0, r1)
        L5f:
            java.lang.Object r1 = r4.l0
            X.0YSu r1 = (X.InterfaceC874620YSu) r1
            if (r5 == 0) goto L6b
            java.lang.String r0 = r5.getStatusMsg()
            if (r0 != 0) goto L6d
        L6b:
            java.lang.String r0 = "net_request_failed_bridge"
        L6d:
            r1.LIZ(r2, r0, r3)
            return
        L71:
            r2 = r1
            goto L3c
        L73:
            r0 = -1000(0xfffffffffffffc18, float:NaN)
        L75:
            r3 = r0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914120Zta.LIZIZ$11(X.0Zta, X.0YMW):void");
    }

    public static final void LIZIZ$12(C914120Zta c914120Zta, C0YMW c0ymw) {
        Function1 function1 = (Function1) c914120Zta.l1;
        if (function1 != null) {
            function1.invoke(c0ymw);
        }
    }

    public static final void LIZIZ$2(C914120Zta c914120Zta, C0YMW c0ymw) {
        C868780Y6i c868780Y6iLIZLLL = ((C0YJJ) c914120Zta.l0).LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real batch fetch error, from: ");
        sbLIZ.append((String) ((Pair) c914120Zta.l1).getSecond());
        c868780Y6iLIZLLL.LJIIIIZZ("ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static final void LIZIZ$3(C914120Zta c914120Zta, C0YMW c0ymw) {
        C868780Y6i c868780Y6iLIZLLL = ((C0YJJ) c914120Zta.l0).LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real fetch error, from: ");
        sbLIZ.append((String) ((Pair) c914120Zta.l1).getSecond());
        c868780Y6iLIZLLL.LJIIIIZZ("ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static final void LIZIZ$4(C914120Zta c914120Zta, C0YMW c0ymw) {
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914120Zta.l1;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
    }

    public static final void LIZIZ$5(C914120Zta c914120Zta, C0YMW c0ymw) {
        String statusMsg;
        CompletionBlock completionBlock = (CompletionBlock) c914120Zta.l0;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        C2382909Vj.LIZ(completionBlock, 9999, statusMsg, null, 4);
    }

    public static final void LIZIZ$6(C914120Zta c914120Zta, C0YMW c0ymw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteForMe failure msgId=");
        sbLIZ.append(((C869590Y9l) c914120Zta.l1).getMsgId());
        sbLIZ.append(" error=");
        sbLIZ.append(c0ymw.getCheckMsg());
        C2188811AlT.LIZIZ(sbLIZ);
        ((DeleteForMeUndoCoordinator) c914120Zta.l0).getClass();
    }

    public static final void LIZIZ$7(C914120Zta c914120Zta, C0YMW c0ymw) {
        int code;
        int i;
        if (c0ymw != null) {
            c0ymw.getCheckMsg();
            c0ymw.getCode();
            c0ymw.getLogId();
            if (c0ymw.getThrowable() != null && c0ymw.getThrowable() == null) {
                new Throwable();
            }
        }
        InterfaceC889250YuZ interfaceC889250YuZ = (InterfaceC889250YuZ) c914120Zta.l0;
        if (interfaceC889250YuZ != null) {
            interfaceC889250YuZ.hide();
        }
        if (((C893630Z3x) c914120Zta.l1).LLILLJJLI.isVisible()) {
            if (c0ymw != null) {
                code = c0ymw.getCode();
            } else {
                code = -1;
            }
            if (C0YIG.fromValue(code) == C0YIG.STATUS_CODE_TIME_LIMIT_EXCEEDED) {
                if (((IMRecallEnhancementConfig) C462300IAy.LIZIZ.getValue()).oneHourRecallWindow) {
                    i = 2131831149;
                } else {
                    i = 2131831150;
                }
            } else {
                i = 2131831143;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(((C893630Z3x) c914120Zta.l1).LLILLJJLI);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZIZ$8(C914120Zta c914120Zta, C0YMW c0ymw) {
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    public static final void LIZIZ$9(C914120Zta c914120Zta, C0YMW c0ymw) {
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    public static final void onSuccess$0(C914120Zta c914120Zta, Object obj) {
        ((InterfaceC863600XuI) c914120Zta.l0).onSuccess(obj);
        ((C0YJ9) c914120Zta.l1).LIZ(1, "imsdk_result");
        ((C0YJ9) c914120Zta.l1).LIZLLL();
    }

    public static final void onSuccess$1(C914120Zta c914120Zta, Object obj) {
        String strLIZIZ = C1710306mr.LIZIZ(2131830213, C1383370m6R.LJIIJ(((NoticeFeature) c914120Zta.l0).LJIIJJI()));
        C1389910mGz c1389910mGz = new C1389910mGz((Activity) c914120Zta.l1);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJIIJ(strLIZIZ);
        c1389910mGz.LIZ.LIZLLL = 3;
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C14KQ.LIZLLL((Activity) c914120Zta.l1));
        c1389910mGz.LJIIJJI();
    }

    public static final void onSuccess$10(C914120Zta c914120Zta, Object obj) {
        IMChatService iMChatService = IMChatService.LIZIZ;
        Map map = (Map) c914120Zta.l0;
        iMChatService.getClass();
        IMChatService.LJJIL((List) obj, map);
        Function1 function1 = (Function1) c914120Zta.l1;
        if (function1 != null) {
            function1.invoke((Map) c914120Zta.l0);
        }
    }

    public static final void onSuccess$11(C914120Zta c914120Zta, Object obj) {
        InterfaceC874620YSu interfaceC874620YSu = (InterfaceC874620YSu) c914120Zta.l0;
        C0YIX c0yix = new C871860YIe().LIZ;
        c0yix.LIZ = 200;
        c0yix.LIZJ = (Response) obj;
        interfaceC874620YSu.LIZIZ(c0yix);
    }

    public static final void onSuccess$12(C914120Zta c914120Zta, Object obj) {
        Function1 function1 = (Function1) c914120Zta.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    public static final void onSuccess$2(C914120Zta c914120Zta, Object obj) {
        if (obj != null) {
            C868780Y6i c868780Y6iLIZLLL = ((C0YJJ) c914120Zta.l0).LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real batch fetch success, from: ");
            sbLIZ.append((String) ((Pair) c914120Zta.l1).getSecond());
            C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), 4);
            ((C0YJJ) c914120Zta.l0).LIZ.LIZ(new C0YJS(((C0YJJ) c914120Zta.l0).LIZIZ, (String) ((Pair) c914120Zta.l1).getSecond()), obj);
        }
    }

    public static final void onSuccess$3(C914120Zta c914120Zta, Object obj) {
        List<ParticipantReadIndex> list = (List) obj;
        if (list != null) {
            C868780Y6i c868780Y6iLIZLLL = ((C0YJJ) c914120Zta.l0).LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real fetch success, from: ");
            sbLIZ.append((String) ((Pair) c914120Zta.l1).getSecond());
            C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), 4);
            C0YJZ c0yjz = ((C0YJJ) c914120Zta.l0).LIZ;
            C0YJS c0yjs = new C0YJS(((C0YJJ) c914120Zta.l0).LIZIZ, (String) ((Pair) c914120Zta.l1).getSecond());
            C0YJU c0yju = new C0YJU();
            c0yju.LIZLLL = (String) ((Pair) c914120Zta.l1).getFirst();
            c0yju.LJ = 0L;
            C1516540pZE.LIZ(list);
            c0yju.LJFF = list;
            c0yjz.LIZ(c0yjs, Collections.singletonList(c0yju.build()));
        }
    }

    public static final void onSuccess$4(C914120Zta c914120Zta, Object obj) {
        List list = (List) obj;
        C866530Xz1 c866530Xz1 = (C866530Xz1) c914120Zta.l0;
        c866530Xz1.getClass();
        if (list != null && !list.isEmpty()) {
            if (C0BIJ.LIZ()) {
                C866740XzM c866740XzM = (C866740XzM) c866530Xz1.LJI.getValue();
                String str = c866530Xz1.LIZIZ;
                c866740XzM.getClass();
                C866780XzQ c866780XzQ = new C866780XzQ(str, list);
                Set<Pair<String, InterfaceC866850XzX>> setKeySet = c866740XzM.LIZJ.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (Intrinsics.LJFF(((Pair) obj2).getFirst(), str)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C866740XzM.LIZ((InterfaceC866850XzX) ((Pair) it2.next()).getSecond(), c866780XzQ);
                }
            } else {
                ArrayList arrayList2 = new ArrayList(list);
                Iterator<InterfaceC866850XzX> it3 = c866530Xz1.LJII.iterator();
                while (it3.hasNext()) {
                    it3.next().LJLI(c866530Xz1.LIZIZ, arrayList2);
                }
            }
        }
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914120Zta.l1;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.onSuccess(list);
        }
    }

    public static final void onSuccess$5(C914120Zta c914120Zta, Object obj) {
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        String containerID = null;
        if (c869590Y9l == null) {
            C2382909Vj.LIZ((CompletionBlock) c914120Zta.l0, 9999, "result is null", null, 4);
            return;
        }
        CompletionBlock completionBlock = (CompletionBlock) c914120Zta.l0;
        C0YYD c0yyd = (C0YYD) c914120Zta.l1;
        c0yyd.getClass();
        InterfaceC634840OvC interfaceC634840OvC = c0yyd.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        InterfaceC875870YXp interfaceC875870YXp = (InterfaceC875870YXp) C1909107dp.LIZJ(InterfaceC875870YXp.class, containerID);
        interfaceC875870YXp.setContent(c869590Y9l.getContent());
        Map<String, String> ext = c869590Y9l.getExt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(ext.size()));
        Iterator<T> it2 = ext.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        interfaceC875870YXp.setExt(linkedHashMap);
        interfaceC875870YXp.setConversationShortId(String.valueOf(c869590Y9l.getConversationShortId()));
        interfaceC875870YXp.setConversationType(Integer.valueOf(c869590Y9l.getConversationType()));
        interfaceC875870YXp.setCreatedAt(Long.valueOf(c869590Y9l.getCreatedAt()));
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(localExt.size()));
        Iterator<T> it3 = localExt.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        interfaceC875870YXp.setLocalExt(linkedHashMap2);
        interfaceC875870YXp.setMsgId(C876050YYh.LJFF(c869590Y9l.getMsgId()));
        interfaceC875870YXp.setMsgStatus(Integer.valueOf(C876050YYh.LJ(c869590Y9l.getMsgStatus())));
        interfaceC875870YXp.setMsgType(Integer.valueOf(c869590Y9l.getMsgType()));
        interfaceC875870YXp.setOrderInConversation(String.valueOf(c869590Y9l.getOrderIndex()));
        interfaceC875870YXp.setIndexInConversation(String.valueOf(c869590Y9l.getIndex()));
        interfaceC875870YXp.setSender(String.valueOf(c869590Y9l.getSender()));
        interfaceC875870YXp.setUuid(c869590Y9l.getUuid());
        completionBlock.onSuccess(interfaceC875870YXp, "");
    }

    public static final void onSuccess$6(C914120Zta c914120Zta, Object obj) {
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        DeleteForMeUndoCoordinator deleteForMeUndoCoordinator = (DeleteForMeUndoCoordinator) c914120Zta.l0;
        if (deleteForMeUndoCoordinator.LIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C1389910mGz c1389910mGz = deleteForMeUndoCoordinator.LIZIZ;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
            TuxTextView tuxTextView = new TuxTextView(new C1361400lX0(deleteForMeUndoCoordinator.LIZ.requireContext(), R.style.y0), null, 6, 0);
            tuxTextView.setText(2131831099);
            tuxTextView.setTuxFont(42);
            tuxTextView.setTextColorRes(R.attr.a1n);
            C786410Ut5.h9(tuxTextView, new ACListenerS117S0200000_14(deleteForMeUndoCoordinator, c869590Y9l, 43));
            C1389910mGz c1389910mGz2 = new C1389910mGz(deleteForMeUndoCoordinator.LIZ);
            c1389910mGz2.LJI(R.style.y0);
            c1389910mGz2.LIZ.LIZIZ = 4;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c1389910mGz2.LJIIL(c419910GdJ);
            c1389910mGz2.LJIIIZ(2131831098);
            c1389910mGz2.LIZ.LIZLLL = 3;
            c1389910mGz2.LIZ.LJ = new AwS593S0100000_14(tuxTextView, 341);
            c1389910mGz2.LJ(3000L);
            c1389910mGz2.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + C14KQ.LIZLLL(deleteForMeUndoCoordinator.LIZ.requireContext()));
            deleteForMeUndoCoordinator.LIZIZ = c1389910mGz2;
            c1389910mGz2.LJIIJJI();
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("ttsocial_snack_bar_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair(Scene.SCENE_SERVICE, "message_delete_for_me")));
        }
    }

    public static final void onSuccess$7(C914120Zta c914120Zta, Object obj) {
        InterfaceC889250YuZ interfaceC889250YuZ = (InterfaceC889250YuZ) c914120Zta.l0;
        if (interfaceC889250YuZ != null) {
            interfaceC889250YuZ.hide();
        }
    }

    public static final void onSuccess$8(C914120Zta c914120Zta, Object obj) {
        int i;
        int i2;
        int i3;
        C0Y8T c0y8t = (C0Y8T) obj;
        boolean z = false;
        if (c0y8t != null && C879070Ye9.LJ(c0y8t, false)) {
            z = true;
            i = R.raw.icon_archive;
            i2 = 2131845351;
        } else {
            i = R.raw.icon_exclamation_mark_polygon;
            i2 = 2131845350;
        }
        ((BaseActionViewModel) c914120Zta.l0).vQ2(new AwS12S0002000_14(i2, i, 2));
        if (z) {
            i3 = 2131845313;
        } else {
            i3 = 2131845314;
        }
        Activity activity = (Activity) c914120Zta.l1;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(i3);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccess$9(X.C914120Zta r6, java.lang.Object r7) {
        /*
            X.0Y8T r7 = (X.C0Y8T) r7
            if (r7 == 0) goto L57
            boolean r0 = X.C879070Ye9.LJFF(r7)
            r5 = 1
            if (r0 != r5) goto L57
        Lb:
            java.lang.Object r4 = r6.l0
            com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel r4 = (com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel) r4
            if (r5 == 0) goto L50
            r3 = 2131845353(0x7f1160e9, float:1.9324125E38)
            r2 = 2130774744(0x7f010ad8, float:1.7152672E38)
        L17:
            kotlin.jvm.internal.AwS12S0002000_14 r1 = new kotlin.jvm.internal.AwS12S0002000_14
            r0 = 1
            r1.<init>(r3, r2, r0)
            r4.vQ2(r1)
            if (r5 == 0) goto L4c
            r2 = 2131845372(0x7f1160fc, float:1.9324163E38)
        L25:
            java.lang.Object r0 = r6.l1
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L4a
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r1.LJIIIZ(r2)
        L33:
            if (r5 == 0) goto L47
            if (r1 == 0) goto L46
            r0 = 2130774900(0x7f010b74, float:1.7152988E38)
            r1.LJFF(r0)
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r1.LJII(r0)
        L43:
            r1.LJIIJJI()
        L46:
            return
        L47:
            if (r1 == 0) goto L46
            goto L43
        L4a:
            r1 = 0
            goto L33
        L4c:
            r2 = 2131845373(0x7f1160fd, float:1.9324165E38)
            goto L25
        L50:
            r3 = 2131845352(0x7f1160e8, float:1.9324123E38)
            r2 = 2130774732(0x7f010acc, float:1.7152647E38)
            goto L17
        L57:
            r5 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914120Zta.onSuccess$9(X.0Zta, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C914120Zta(Object obj, CompletionBlock<InterfaceC875870YXp> completionBlock, C0YYD c0yyd) {
        this.$t = c0yyd;
        this.l0 = obj;
        this.l1 = completionBlock;
    }
}
