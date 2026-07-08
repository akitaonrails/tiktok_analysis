package X;

import Y.AfS172S0100000_3;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09SX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SX extends AbstractC2255721DQs<InterfaceC2246608rA> implements InterfaceC2246608rA, InterfaceC379610EuV {
    public final C1DRG LL;
    public final InterfaceC2246608rA LLILLJJLI = this;
    public List<? extends List<? extends ReadTextEffectBean>> LLILLL = C13BV.INSTANCE;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 75));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 74));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(594));
    public final LinkedHashMap<String, String> LLIZ = new LinkedHashMap<>();

    private final InterfaceC1635390sev G2() {
        return (InterfaceC1635390sev) this.LLILZIL.getValue();
    }

    private final TextToSpeechApi w2() {
        return (TextToSpeechApi) this.LLILZLL.getValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZ.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC2246608rA o2() {
        return this.LLILLJJLI;
    }

    public C09SX(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC2246608rA
    public List<ReadTextEffectBean> FY1(List<ReadTextEffectBean> list) {
        Keva keva = SpeakerCenter.LIZ;
        List listLJJLL = C13LQ.LJJLL(SpeakerCenter.LIZ.getStringArray(C2084808Es.LIZ(C0CHQ.LIZ().getAccountService().getCurrentUserID()), new String[0]));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLL) {
            Iterator<ReadTextEffectBean> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ReadTextEffectBean next = it2.next();
                    if (Intrinsics.LJFF(next.mSpeaker.speakreID, obj)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
        Iterator<ReadTextEffectBean> it3 = list.iterator();
        while (it3.hasNext()) {
            ReadTextEffectBean next2 = it3.next();
            if (next2.mSpeaker.lockEasterEgg == 1) {
                it3.remove();
            } else if (zYi2 && next2.LIZJ()) {
                it3.remove();
            }
        }
        list.addAll(0, arrayList);
        return list;
    }

    private final void X1(final List<String> list, final CreativeInfo creativeInfo, final InterfaceC1631620sYq<? super List<String>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        int i;
        C201955140j.LIZIZ("TTSPanelUIComponent", "fetchMultiAudioFile begin");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it2 = list.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            String str = this.LLIZ.get(C08F1.LIZIZ(next));
            if (str != null && str.length() != 0) {
                linkedHashMap.put(C08F1.LIZIZ(next), str);
            } else {
                linkedHashMap.put(C08F1.LIZIZ(next), "");
            }
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (final String str2 : list) {
            String str3 = (String) linkedHashMap.get(C08F1.LIZIZ(str2));
            if (str3 == null || str3.length() <= 0 || !new C0VSJ(str3).exists()) {
                TextToSpeechApi.Api api = (TextToSpeechApi.Api) w2().LIZ.getValue();
                w2().getClass();
                HashMap map = new HashMap();
                C1493620oyG c1493620oyG = new C1493620oyG();
                c1493620oyG.LIZLLL = 30000L;
                c1493620oyG.LIZJ = 30000L;
                c1493620oyG.LJ = 30000L;
                api.requestAudio(str2, i, map, c1493620oyG).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.09SY
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String str4;
                        String str5;
                        String absolutePath;
                        String absolutePath2;
                        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$3$2");
                        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = (TextToSpeechApi.FetchTextAudioResponse) obj;
                        C09SX c09sx = this.LL;
                        List<String> list2 = arrayList;
                        List<Pair<Integer, String>> list3 = arrayList2;
                        List<String> list4 = list;
                        InterfaceC1631620sYq<List<String>, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
                        CreativeInfo creativeInfo2 = creativeInfo;
                        String str6 = str2;
                        synchronized (c09sx) {
                            try {
                                int iIntValue = -1;
                                if (fetchTextAudioResponse.status_code == 0 && fetchTextAudioResponse.getData() != null) {
                                    C201955140j.LIZIZ("TTSPanelUIComponent", "fetchMultiAudioFile success");
                                    String str7 = fetchTextAudioResponse.getData().audio;
                                    if (str7 != null) {
                                        int iIntValue2 = 0;
                                        if (str7.length() > 0) {
                                            C0VSJ c0vsjLIZ = C2279808wW.LIZ(creativeInfo2, str7, C08F1.LIZIZ(str6));
                                            if (c0vsjLIZ != null && c0vsjLIZ.exists()) {
                                                String absolutePath3 = c0vsjLIZ.getAbsolutePath();
                                                if (absolutePath3 == null) {
                                                    absolutePath3 = "";
                                                }
                                                list2.add(absolutePath3);
                                                String strLIZIZ = C08F1.LIZIZ(str6);
                                                if (c0vsjLIZ == null || (absolutePath = c0vsjLIZ.getAbsolutePath()) == null) {
                                                    absolutePath = "";
                                                }
                                                linkedHashMap2.put(strLIZIZ, absolutePath);
                                                LinkedHashMap<String, String> linkedHashMap3 = c09sx.LLIZ;
                                                String strLIZIZ2 = C08F1.LIZIZ(str6);
                                                if (c0vsjLIZ == null || (absolutePath2 = c0vsjLIZ.getAbsolutePath()) == null) {
                                                    absolutePath2 = "";
                                                }
                                                linkedHashMap3.put(strLIZIZ2, absolutePath2);
                                            } else {
                                                list2.add("");
                                                list3.add(new Pair<>(-1, "base64ToFile error"));
                                            }
                                            if (list2.size() == list4.size()) {
                                                List<String> listLLIIII = C13LP.LLIIII(linkedHashMap2.values());
                                                Pair pair = (Pair) C13LP.LJJJLL(list3);
                                                if (pair != null) {
                                                    iIntValue2 = ((Number) pair.getFirst()).intValue();
                                                }
                                                Integer numValueOf = Integer.valueOf(iIntValue2);
                                                Pair pair2 = (Pair) C13LP.LJJJLL(list3);
                                                if (pair2 == null || (str5 = (String) pair2.getSecond()) == null) {
                                                    str5 = "";
                                                }
                                                interfaceC1631620sYq2.invoke(listLLIIII, numValueOf, str5);
                                            }
                                        }
                                    }
                                } else if (fetchTextAudioResponse.status_code != 0) {
                                    C201955140j.LIZIZ("TTSPanelUIComponent", "fetchMultiAudioFile failed");
                                    list2.add("");
                                    Integer numValueOf2 = Integer.valueOf(fetchTextAudioResponse.status_code);
                                    String statusMsg = fetchTextAudioResponse.getStatusMsg();
                                    if (statusMsg == null) {
                                        statusMsg = "";
                                    }
                                    list3.add(new Pair<>(numValueOf2, statusMsg));
                                    if (list2.size() == list4.size()) {
                                        List<String> listLLIIII2 = C13LP.LLIIII(linkedHashMap2.values());
                                        Pair pair3 = (Pair) C13LP.LJJJLL(list3);
                                        if (pair3 != null) {
                                            iIntValue = ((Number) pair3.getFirst()).intValue();
                                        }
                                        Integer numValueOf3 = Integer.valueOf(iIntValue);
                                        Pair pair4 = (Pair) C13LP.LJJJLL(list3);
                                        if (pair4 == null || (str4 = (String) pair4.getSecond()) == null) {
                                            str4 = "";
                                        }
                                        interfaceC1631620sYq2.invoke(listLLIIII2, numValueOf3, str4);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$3$2");
                    }
                }, new AfS172S0100000_3(interfaceC1631620sYq, 18));
            }
            i = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // X.InterfaceC2246608rA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object UY(kotlin.jvm.functions.Function1<? super com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.lang.Boolean> r8, java.util.Map<java.lang.String, java.lang.String> r9, X.InterfaceC1364105Vn<? super java.util.List<? extends java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C01RY
            if (r0 == 0) goto L23
            r4 = r10
            X.01RY r4 = (X.C01RY) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L6c
            if (r0 != r5) goto L2d
            goto L29
        L23:
            X.01RY r4 = new X.01RY
            r4.<init>(r7, r10)
            goto L12
        L29:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.RuntimeException -> L84
            goto L88
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r6)
            java.util.List<? extends java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r0 = r7.LLILLL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5a
            java.util.List<? extends java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r0 = r7.LLILLL
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L58
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L58
            r0 = 0
        L53:
            if (r0 != 0) goto L5a
            java.util.List<? extends java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r0 = r7.LLILLL
            return r0
        L58:
            r0 = 1
            goto L53
        L5a:
            X.0sev r1 = r7.G2()     // Catch: java.lang.RuntimeException -> L84
            X.08rE r0 = new X.08rE     // Catch: java.lang.RuntimeException -> L84
            r0.<init>(r1, r9)     // Catch: java.lang.RuntimeException -> L84
            r4.LLILLL = r2     // Catch: java.lang.RuntimeException -> L84
            java.lang.Object r6 = r0.LIZIZ(r4, r8)     // Catch: java.lang.RuntimeException -> L84
            if (r6 != r3) goto L6f
            return r3
        L6c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.RuntimeException -> L84
        L6f:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.RuntimeException -> L84
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.RuntimeException -> L84
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.RuntimeException -> L84
            X.01RX r1 = new X.01RX     // Catch: java.lang.RuntimeException -> L84
            r0 = 0
            r1.<init>(r6, r7, r0)     // Catch: java.lang.RuntimeException -> L84
            r4.LLILLL = r5     // Catch: java.lang.RuntimeException -> L84
            java.lang.Object r0 = X.C23250099c.LJI(r4, r2, r1)     // Catch: java.lang.RuntimeException -> L84
            if (r0 != r3) goto L88
            return r3
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L88:
            java.util.List<? extends java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r0 = r7.LLILLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09SX.UY(kotlin.jvm.functions.Function1, java.util.Map, X.05Vn):java.lang.Object");
    }

    private final void Z1(final List<String> list, final List<String> list2, CreativeInfo creativeInfo, List<Boolean> list3, final InterfaceC1631620sYq<? super List<String>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        C201955140j.LIZIZ("TTSPanelUIComponent", "fetchMultiAudioFile begin");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C344201Vg(list, linkedHashMap, list2, creativeInfo, list3, new ITTSCallback() { // from class: X.01bP
            public final List<String> LIZ = new ArrayList();
            public final List<Pair<Integer, String>> LIZIZ = new ArrayList();

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onCancel(int i) {
            }

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onConnectToServerSuc() {
            }

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
            }

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onStreamTTSPlayFinish() {
            }

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onSuccess(int i, File file, String str, SAMICoreServerEvent sAMICoreServerEvent) {
                String str2;
                String str3;
                String str4;
                List<String> list4 = list;
                InterfaceC1631620sYq<List<String>, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
                List<String> list5 = list2;
                synchronized (this) {
                    try {
                        ((ArrayList) this.LIZ).add(file.getAbsolutePath());
                        int iIntValue = 0;
                        int i2 = 0;
                        for (String str5 : list4) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                String str6 = str5;
                                String str7 = (String) C13LP.LJJJLZIJ(i2, list5);
                                if (str7 == null) {
                                    str7 = "";
                                }
                                String strLIZIZ = C08F1.LIZIZ(str7);
                                if (a0.LJJIIZI(file.getAbsolutePath(), str6, false) && a0.LJJIIZI(file.getAbsolutePath(), strLIZIZ, false)) {
                                    StringBuilder sb = new StringBuilder();
                                    if (i2 < list4.size()) {
                                        str3 = list4.get(i2);
                                    } else {
                                        str3 = "";
                                    }
                                    sb.append(str3);
                                    if (i2 < list5.size()) {
                                        str4 = list5.get(i2);
                                    } else {
                                        str4 = "";
                                    }
                                    sb.append(str4);
                                    linkedHashMap2.put(sb.toString(), file.getAbsolutePath());
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        if (((ArrayList) this.LIZ).size() == list4.size()) {
                            List<String> listLLIIII = C13LP.LLIIII(linkedHashMap2.values());
                            Pair pair = (Pair) C13LP.LJJJLL(this.LIZIZ);
                            if (pair != null) {
                                iIntValue = ((Number) pair.getFirst()).intValue();
                            }
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            Pair pair2 = (Pair) C13LP.LJJJLL(this.LIZIZ);
                            if (pair2 == null || (str2 = (String) pair2.getSecond()) == null) {
                                str2 = "";
                            }
                            interfaceC1631620sYq2.invoke(listLLIIII, numValueOf, str2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
            public final void onFailure(int i, int i2, String str, String str2, SAMICoreServerEvent sAMICoreServerEvent) {
                String str3;
                String str4;
                List<String> list4 = list;
                InterfaceC1631620sYq<List<String>, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
                synchronized (this) {
                    try {
                        ((ArrayList) this.LIZ).add("");
                        List<Pair<Integer, String>> list5 = this.LIZIZ;
                        Integer numValueOf = Integer.valueOf(i2);
                        if (str == null) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        ((ArrayList) list5).add(new Pair(numValueOf, str3));
                        if (((ArrayList) this.LIZ).size() == list4.size()) {
                            if (str == null) {
                                str = "";
                            }
                            List<String> listLLIIII = C13LP.LLIIII(linkedHashMap2.values());
                            Pair pair = (Pair) C13LP.LJJJLL(this.LIZIZ);
                            if (pair != null) {
                                i2 = ((Number) pair.getFirst()).intValue();
                            }
                            Integer numValueOf2 = Integer.valueOf(i2);
                            Pair pair2 = (Pair) C13LP.LJJJLL(this.LIZIZ);
                            if (pair2 != null && (str4 = (String) pair2.getSecond()) != null) {
                                str = str4;
                            }
                            interfaceC1631620sYq2.invoke(listLLIIII, numValueOf2, str);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }, null), 3);
    }

    @Override // X.InterfaceC2246608rA
    public void Cm(List<String> list, List<String> list2, List<Boolean> list3, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01RU(function2, this, list, list2, list3, function1, null), 3);
    }

    public final Object W1(List<String> list, List<String> list2, CreativeInfo creativeInfo, List<Boolean> list3, InterfaceC1364105Vn<? super C443120HZe<? extends List<String>, Integer, String>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (list.isEmpty()) {
            X1(list2, creativeInfo, new C01RV(c23260099m));
        } else {
            Z1(list, list2, creativeInfo, list3, new C01RW(c23260099m));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
