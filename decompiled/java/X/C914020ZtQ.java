package X;

import android.util.Pair;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ZtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914020ZtQ implements InterfaceC864800XwE {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC864800XwE
    public final void LIZ(Object obj) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, obj);
                break;
            case 1:
                LIZ$1(this, obj);
                break;
            case 2:
                LIZ$2(this, obj);
                break;
            case 3:
                LIZ$3(this, obj);
                break;
            case 4:
                LIZ$4(this, obj);
                break;
            case 5:
                LIZ$5(this, obj);
                break;
            case 6:
                LIZ$6(this, obj);
                break;
            case 7:
                LIZ$7(this, obj);
                break;
            case 8:
                LIZ$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, obj);
                break;
            case 14:
                LIZ$14(this, obj);
                break;
            case 15:
                LIZ$15(this, obj);
                break;
        }
    }

    public static final void LIZ$0(C914020ZtQ c914020ZtQ, Object obj) {
        List<C0YAE> list = (List) obj;
        C867970Y3f c867970Y3f = (C867970Y3f) c914020ZtQ.l1;
        c867970Y3f.LJLI(c867970Y3f.LLILLL, list);
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914020ZtQ.l0;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.onSuccess(list);
        }
    }

    public static final void LIZ$1(C914020ZtQ c914020ZtQ, Object obj) {
        List<C869590Y9l> list = (List) obj;
        ((C872420YKi) c914020ZtQ.l1).LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformLoadNewerToEnd onCallback");
        if (list == null) {
            ((C872420YKi) c914020ZtQ.l1).LLJIJIL.set(false);
            return;
        }
        ((C872420YKi) c914020ZtQ.l1).LLIZ = true;
        C872420YKi c872420YKi = (C872420YKi) c914020ZtQ.l1;
        C868780Y6i c868780Y6iLIZLLL = c872420YKi.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onPerformLoadNewerToEnd, result:");
        sbLIZ.append(list.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        Collections.reverse(list);
        c872420YKi.LLILLJJLI.addList(list);
        c872420YKi.LLJIJIL.set(false);
        c872420YKi.LJIJJLI();
        c872420YKi.u6(list, true);
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914020ZtQ.l0;
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.onSuccess(null);
    }

    public static final void LIZ$10(C914020ZtQ c914020ZtQ, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            ((C0Y1C) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(5, c0y8t);
            ((C0Y1C) c914020ZtQ.l1).LIZJ(c0y8t);
        } else {
            C0Y1C c0y1c = (C0Y1C) c914020ZtQ.l1;
            c0y1c.LIZ(C0YIN.LJFF(c0y1c.LIZJ, -3001));
        }
        ((Runnable) c914020ZtQ.l0).run();
    }

    public static final void LIZ$11(C914020ZtQ c914020ZtQ, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            ((C864930XwR) c914020ZtQ.l1).LJIILJJIL((C0Y8T) pair.second);
            InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914020ZtQ.l0;
            if (interfaceC863600XuI != null) {
                interfaceC863600XuI.onSuccess(pair.first);
                return;
            }
            return;
        }
        InterfaceC863600XuI interfaceC863600XuI2 = (InterfaceC863600XuI) c914020ZtQ.l0;
        if (interfaceC863600XuI2 == null) {
            return;
        }
        interfaceC863600XuI2.LIZIZ(C0YMW.from(C0YIN.LJFF(((C864930XwR) c914020ZtQ.l1).LIZJ, -3001)));
    }

    public static final void LIZ$12(C914020ZtQ c914020ZtQ, Object obj) {
        ArrayList arrayList;
        List<SetConversationSettingInfoResponseBody> list;
        ResponseBody responseBody;
        BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody;
        ResponseBody responseBody2;
        BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody2;
        List<SetConversationSettingInfoResponseBody> list2;
        kotlin.Pair pair = (kotlin.Pair) obj;
        C868780Y6i c868780Y6iLIZLLL = ((C868070Y3p) c914020ZtQ.l0).LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleResponse callback, local updated success num: ");
        sbLIZ.append(((List) pair.getFirst()).size());
        C868780Y6i.LJ(c868780Y6iLIZLLL, "BatchSetConversationSettingHandler", C2188811AlT.LIZIZ(sbLIZ), 4);
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ((Iterable) pair.getFirst());
        Response response = ((C0YIN) c914020ZtQ.l1).LLIZ;
        List<SetConversationSettingInfoResponseBody> listLJLIL = null;
        if (response != null && (responseBody2 = response.body) != null && (batchSetConversationSettingInfoResponseBody2 = responseBody2.batch_set_conversation_setting_info_body) != null && (list2 = batchSetConversationSettingInfoResponseBody2.success_list) != null) {
            arrayList = new ArrayList();
            for (SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody : list2) {
                if (!hashSetLLIFFJFJJ.contains(setConversationSettingInfoResponseBody.setting_info.conversation_id)) {
                    arrayList.add(setConversationSettingInfoResponseBody);
                }
            }
        } else {
            arrayList = null;
        }
        Response response2 = ((C0YIN) c914020ZtQ.l1).LLIZ;
        if (response2 != null && (responseBody = response2.body) != null && (batchSetConversationSettingInfoResponseBody = responseBody.batch_set_conversation_setting_info_body) != null) {
            list = batchSetConversationSettingInfoResponseBody.failed_list;
        } else {
            list = null;
        }
        if (arrayList == null) {
            if (list != null) {
                listLJLIL = list;
            }
        } else if (list == null) {
            listLJLIL = arrayList;
        } else {
            listLJLIL = C13LP.LJLIL(list, arrayList);
        }
        ((C868070Y3p) c914020ZtQ.l0).LIZJ(listLJLIL);
    }

    public static final void LIZ$13(C914020ZtQ c914020ZtQ, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            ((C0Y1E) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(5, c0y8t);
            ((C0Y1E) c914020ZtQ.l1).LIZJ(c0y8t);
        } else {
            C0Y1E c0y1e = (C0Y1E) c914020ZtQ.l1;
            c0y1e.LIZ(C0YIN.LJFF(c0y1e.LIZJ, -1015));
        }
        ((Runnable) c914020ZtQ.l0).run();
    }

    public static final void LIZ$14(C914020ZtQ c914020ZtQ, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            ((C0Y1D) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(5, c0y8t);
            ((C0Y1D) c914020ZtQ.l1).LIZJ(c0y8t);
        } else {
            C0Y1D c0y1d = (C0Y1D) c914020ZtQ.l1;
            c0y1d.LIZ(C0YIN.LJFF(c0y1d.LIZJ, -1015));
        }
        ((Runnable) c914020ZtQ.l0).run();
    }

    public static final void LIZ$15(C914020ZtQ c914020ZtQ, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            ((C0Y11) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJJZ((List) c914020ZtQ.l0);
        }
    }

    public static final void LIZ$2(C914020ZtQ c914020ZtQ, Object obj) {
        ((ConcurrentHashMap) ((C0Y60) c914020ZtQ.l1).LJI).remove(((C869290Y8h) c914020ZtQ.l0).LIZ);
    }

    public static final void LIZ$3(C914020ZtQ c914020ZtQ, Object obj) {
        Map map = (Map) obj;
        if (map != null && ((InterfaceC863600XuI) c914020ZtQ.l0) != null) {
            ((Map) c914020ZtQ.l1).putAll(map);
            ((InterfaceC863600XuI) c914020ZtQ.l0).onSuccess((Map) c914020ZtQ.l1);
        }
    }

    public static final void LIZ$4(C914020ZtQ c914020ZtQ, Object obj) {
        C868200Y4c c868200Y4c = ((C0Y9I) c914020ZtQ.l1).LL.LJIIZILJ().getDomain().LIZ;
        C0Y3I c0y3i = (C0Y3I) c914020ZtQ.l0;
        c0y3i.getClass();
        c868200Y4c.LJJIIJZLJL(c0y3i, (List) obj);
    }

    public static final void LIZ$5(C914020ZtQ c914020ZtQ, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C0Y2D) c914020ZtQ.l1).LIZJ(((C0Y8T) c914020ZtQ.l0).getConversationId());
            ((C0Y2D) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJIL((C0Y8T) c914020ZtQ.l0);
        } else {
            C0Y2D c0y2d = (C0Y2D) c914020ZtQ.l1;
            c0y2d.LIZ(C0YIN.LJFF(c0y2d.LIZJ, -3001));
        }
    }

    public static final void LIZ$6(C914020ZtQ c914020ZtQ, Object obj) {
        if (obj == null) {
            ((C870470YCv) c914020ZtQ.l1).LIZ((C0YIN) c914020ZtQ.l0);
        } else {
            ((C870470YCv) c914020ZtQ.l1).LIZJ(obj);
        }
    }

    public static final void LIZ$7(C914020ZtQ c914020ZtQ, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            ((C864930XwR) c914020ZtQ.l1).LJIILJJIL((C0Y8T) pair.second);
            ((C864930XwR) c914020ZtQ.l1).LIZJ((C869590Y9l) c914020ZtQ.l0);
        } else {
            C864930XwR c864930XwR = (C864930XwR) c914020ZtQ.l1;
            c864930XwR.LIZ(C0YIN.LJFF(c864930XwR.LIZJ, -3001));
        }
    }

    public static final void LIZ$8(C914020ZtQ c914020ZtQ, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            ((C0Y1F) c914020ZtQ.l1).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(5, c0y8t);
            ((C0Y1F) c914020ZtQ.l1).LIZJ(c0y8t);
        } else {
            C0Y1F c0y1f = (C0Y1F) c914020ZtQ.l1;
            c0y1f.LIZ(C0YIN.LJFF(c0y1f.LIZJ, -3001));
        }
        ((Runnable) c914020ZtQ.l0).run();
    }

    public static final void LIZ$9(C914020ZtQ c914020ZtQ, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            ((C864930XwR) c914020ZtQ.l1).LJIILJJIL((C0Y8T) pair.second);
            ((C864930XwR) c914020ZtQ.l1).LIZJ((C869590Y9l) c914020ZtQ.l0);
        } else {
            C864930XwR c864930XwR = (C864930XwR) c914020ZtQ.l1;
            c864930XwR.LIZ(C0YIN.LJFF(c864930XwR.LIZJ, -3001));
        }
    }

    public C914020ZtQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
