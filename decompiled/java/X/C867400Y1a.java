package X;

import Y.ARunnableS20S0201000_14;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Y1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867400Y1a extends AbstractC867440Y1e {
    public final boolean LJ;
    public long LJFF;
    public List<C0Y8T> LJI;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (getConversationInfoListV2ResponseBody = responseBody.get_conversation_info_list_v2_body) != null && getConversationInfoListV2ResponseBody.conversation_info_list != null) {
            return true;
        }
        return false;
    }

    public C867400Y1a(C0YEM c0yem, boolean z) {
        super(c0yem, C0YMR.GET_CONVERSATION_INFO_LIST_V2.getValue(), null);
        this.LJ = z;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        int size;
        final int iIntValue = c0yin.LLILZLL.inbox_type.intValue();
        final Map<String, MessageBody> map = (Map) c0yin.LLILZIL[0];
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (C0Y81.LJ(c0yin.LLIZ, this.LIZJ.LJIIIZ().LJJJJJ)) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            final AtomicInteger atomicInteger2 = new AtomicInteger(0);
            final ArrayList<MessageBody> arrayList = new ArrayList();
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            InterfaceC863600XuI<C0Y8T> interfaceC863600XuI = new InterfaceC863600XuI<C0Y8T>() { // from class: X.0Y1b
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    if (atomicInteger.get() + atomicInteger2.addAndGet(1) == arrayList.size()) {
                        this.LJII.LJIILIIL(c0yin, iIntValue, map);
                    }
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    C0Y8T c0y8t2 = c0y8t;
                    if (atomicInteger.addAndGet(1) + atomicInteger2.get() == arrayList.size()) {
                        MessageBody messageBody = (MessageBody) map.get(c0y8t2.getConversationId());
                        if (messageBody != null) {
                            C872660YLg c872660YLgNewBuilder = messageBody.newBuilder();
                            c872660YLgNewBuilder.LJII = Long.valueOf(c0y8t2.getConversationShortId());
                            concurrentHashMap.put(c0y8t2.getConversationId(), c872660YLgNewBuilder.build());
                        }
                        if (atomicInteger2.get() == 0) {
                            C867400Y1a.LJIIJJI(this.LJII.LIZJ, iIntValue, concurrentHashMap, false);
                        } else {
                            this.LJII.LJIILIIL(c0yin, iIntValue, map);
                        }
                    }
                }
            };
            for (MessageBody messageBody : map.values()) {
                if (messageBody.conversation_type.intValue() == AbstractC1711506n3.LIZ) {
                    arrayList.add(messageBody);
                } else {
                    concurrentHashMap.put(messageBody.conversation_id, messageBody);
                }
            }
            for (MessageBody messageBody2 : arrayList) {
                this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJLLLLLLLZ(c0yin.LJI(), interfaceC863600XuI, messageBody2.conversation_id);
            }
            return;
        }
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final HashSet hashSet = new HashSet();
            this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<Pair<Pair<C0Y8T, Boolean>, List<C0YAE>>>>() { // from class: X.0Y1T
                @Override // X.InterfaceC872410YKh
                public final List<Pair<Pair<C0Y8T, Boolean>, List<C0YAE>>> LIZ() {
                    Pair pairLJIJJ;
                    Object obj;
                    Boolean bool;
                    List<ConversationInfoV2> list = c0yin.LLIZ.body.get_conversation_info_list_v2_body.conversation_info_list;
                    if (list == null || list.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    boolean z = this.LJ.LIZJ.LJIIIZ().LJJLIIIIJ.LJJIZ && !this.LJ.LIZJ.LJIIZILJ().LIZIZ().getProxy().LJIIIZ();
                    if (z) {
                        this.LJ.LIZJ.LJIIZILJ().LIZIZ().getProxy().LJIILIIL("batchGetConvInfoList");
                    }
                    boolean z2 = z && this.LJ.LIZJ.LJIIZILJ().LIZIZ().getProxy().LJIIIZ();
                    try {
                        for (ConversationInfoV2 conversationInfoV2 : list) {
                            MessageBody messageBody3 = (MessageBody) map.get(conversationInfoV2.conversation_id);
                            if (messageBody3 != null && (pairLJIJJ = C867450Y1f.LJIJJ(this.LJ.LIZJ, iIntValue, messageBody3.create_time.longValue(), conversationInfoV2, c0yin.LJIIIZ())) != null && (obj = pairLJIJJ.first) != null) {
                                List<C0YAE> listLIZJ = conversationInfoV2.first_page_participants != null ? C0Y8V.LIZJ(((C0Y8T) obj).getConversationId(), conversationInfoV2.first_page_participants.participants) : null;
                                arrayList2.add((C0Y8T) pairLJIJJ.first);
                                arrayList3.add(new Pair(pairLJIJJ, listLIZJ));
                                ParticipantsPage participantsPage = conversationInfoV2.first_page_participants;
                                if (participantsPage != null && (bool = participantsPage.has_more) != null && bool.booleanValue()) {
                                    hashSet.add(conversationInfoV2.conversation_id);
                                }
                            }
                        }
                        if (z2) {
                            this.LJ.LIZJ.LJIIZILJ().LIZIZ().getProxy().LIZJ("batchGetConvInfoList", true);
                        }
                        if (!arrayList3.isEmpty()) {
                            this.LJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJJJJ(true, 5, (C0Y8T[]) arrayList2.toArray(new C0Y8T[0]));
                        }
                        return arrayList3;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (z2) {
                            this.LJ.LIZJ.LJIIZILJ().LIZIZ().getProxy().LIZJ("batchGetConvInfoList", false);
                        }
                        throw th;
                    }
                }
            }, new InterfaceC864800XwE<List<Pair<Pair<C0Y8T, Boolean>, List<C0YAE>>>>() { // from class: X.0Y1Z
                @Override // X.InterfaceC864800XwE
                public final void LIZ(List<Pair<Pair<C0Y8T, Boolean>, List<C0YAE>>> list) {
                    int size2;
                    List<Pair<Pair<C0Y8T, Boolean>, List<C0YAE>>> list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Pair<Pair<C0Y8T, Boolean>, List<C0YAE>> pair : list2) {
                            arrayList2.add(((Pair) pair.first).first);
                            arrayList3.add(((C0Y8T) ((Pair) pair.first).first).getConversationId());
                            if (hashSet.contains(((C0Y8T) ((Pair) pair.first).first).getConversationId())) {
                                new C0Y1J(this.LJ.LIZJ).LJIIL(((C0Y8T) ((Pair) pair.first).first).getConversationId());
                            } else {
                                this.LJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJII(((C0Y8T) ((Pair) pair.first).first).getConversationId(), (List) pair.second);
                            }
                        }
                        this.LJ.LJIILJJIL(arrayList2.size(), C0YIF.LIZ, SystemClock.uptimeMillis() - this.LJ.LJFF, SystemClock.uptimeMillis() - jUptimeMillis);
                    } else {
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - this.LJ.LJFF;
                        long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                        C867400Y1a c867400Y1a = this.LJ;
                        Map map2 = map;
                        if (map2 != null) {
                            size2 = map2.size();
                        } else {
                            size2 = 0;
                        }
                        c867400Y1a.LJIILJJIL(size2, -3001, jUptimeMillis2, jUptimeMillis3);
                    }
                    C867400Y1a c867400Y1a2 = this.LJ;
                    if (!c867400Y1a2.LIZJ.LJIIZILJ().getDomain().LIZJ().LLJLIL(iIntValue) && !this.LJ.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJ(iIntValue)) {
                        this.LJ.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIL(iIntValue, 1);
                    }
                    C867400Y1a c867400Y1a3 = this.LJ;
                    if (c867400Y1a3.LJ && map != null) {
                        c867400Y1a3.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIIZ(iIntValue, map.keySet());
                    }
                }
            }, false, this.LIZJ.LJIIL().LIZJ());
            return;
        }
        LJIILIIL(c0yin, iIntValue, map);
        long jUptimeMillis2 = SystemClock.uptimeMillis() - this.LJFF;
        long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        LJIILJJIL(size, c0yin.LLJ, jUptimeMillis2, jUptimeMillis3);
    }

    public final void LJIIL(int i, Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            if (this.LJ) {
                C868140Y3w c868140Y3w = this.LIZJ.LJIIZILJ().getDomain().LIZIZ;
                Set<String> setKeySet = map.keySet();
                c868140Y3w.getClass();
                if (setKeySet != null && !setKeySet.isEmpty()) {
                    if (((ConcurrentHashMap) c868140Y3w.LJIIIIZZ).get(Integer.valueOf(i)) == null) {
                        ArrayList arrayList = new ArrayList(setKeySet);
                        ((ConcurrentHashMap) c868140Y3w.LJIIIIZZ).put(Integer.valueOf(i), arrayList);
                    } else {
                        ((List) ((ConcurrentHashMap) c868140Y3w.LJIIIIZZ).get(Integer.valueOf(i))).addAll(setKeySet);
                    }
                }
            }
            this.LJFF = SystemClock.uptimeMillis();
            this.LIZJ.LJIIL().LIZIZ().execute(new ARunnableS20S0201000_14(map, i, this, 6));
        }
    }

    public final void LJIILIIL(C0YIN c0yin, int i, Map<String, MessageBody> map) {
        List<C0Y8T> list;
        this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIL(i, 2);
        if (map != null) {
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZIZ(i, map.get(it2.next()));
            }
        }
        if (c0yin.LLJ < 0 && (list = this.LJI) != null && !((ArrayList) list).isEmpty()) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLI(6, (C0Y8T[]) ((ArrayList) this.LJI).toArray(new C0Y8T[0]));
        }
        if (this.LJ && map != null) {
            this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIIZ(i, map.keySet());
        }
    }

    public static void LJIIJJI(C0YEM c0yem, int i, Map<String, MessageBody> map, boolean z) {
        if (map != null && !map.isEmpty()) {
            while (true) {
                HashMap map2 = null;
                for (String str : map.keySet()) {
                    MessageBody messageBody = map.get(str);
                    if (messageBody != null) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str, messageBody);
                        if (map2.size() == 50) {
                            break;
                        }
                    }
                }
                new C867400Y1a(c0yem, z).LJIIL(i, map2);
                return;
                new C867400Y1a(c0yem, z).LJIIL(i, map2);
            }
        }
    }

    public final void LJIILJJIL(int i, int i2, long j, long j2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_pull_conv_info_list");
        c0yj9.LIZ(Integer.valueOf(i), "conversation_count");
        c0yj9.LIZ(Long.valueOf(j), "total_cost_time");
        c0yj9.LIZ(Long.valueOf(j2), "local_cost_time");
        c0yj9.LIZ(Integer.valueOf(i2), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZLLL();
    }
}
