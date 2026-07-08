package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfoResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: renamed from: X.09rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501609rC implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    public static final void onFailure$8(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<Object> c0x9s, Throwable th) {
        switch (this.$t) {
            case 0:
                onFailure$0(this, c0x9s, th);
                break;
            case 1:
                onFailure$1(this, c0x9s, th);
                break;
            case 2:
                onFailure$2(this, c0x9s, th);
                break;
            case 3:
                onFailure$3(this, c0x9s, th);
                break;
            case 4:
                onFailure$4(this, c0x9s, th);
                break;
            case 5:
                onFailure$5(this, c0x9s, th);
                break;
            case 6:
                onFailure$6(this, c0x9s, th);
                break;
            case 7:
                onFailure$7(this, c0x9s, th);
                break;
            case 8:
                onFailure$8(this, c0x9s, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onFailure$9(this, c0x9s, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onFailure$10(this, c0x9s, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onFailure$11(this, c0x9s, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onFailure$12(this, c0x9s, th);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onFailure$13(this, c0x9s, th);
                break;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<Object> c0x9s, C0X52<Object> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
            case 2:
                onResponse$2(this, c0x9s, c0x52);
                break;
            case 3:
                onResponse$3(this, c0x9s, c0x52);
                break;
            case 4:
                onResponse$4(this, c0x9s, c0x52);
                break;
            case 5:
                onResponse$5(this, c0x9s, c0x52);
                break;
            case 6:
                onResponse$6(this, c0x9s, c0x52);
                break;
            case 7:
                onResponse$7(this, c0x9s, c0x52);
                break;
            case 8:
                onResponse$8(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onResponse$9(this, c0x9s, c0x52);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onResponse$10(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onResponse$11(this, c0x9s, c0x52);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onResponse$12(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onResponse$13(this, c0x9s, c0x52);
                break;
        }
    }

    public C2501609rC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFailure$0(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2501609rC.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onFailure$1(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        String message;
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c2501609rC.l0;
        if (interfaceC1041760dDS != null) {
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            interfaceC1041760dDS.LIZ(1, message);
        }
    }

    public static final void onFailure$10(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((InterfaceC2376809Ta) c2501609rC.l0).LIZ(null, 900, th.getMessage());
    }

    public static final void onFailure$11(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((C05XL) c2501609rC.l0).LJJJJJ(th);
    }

    public static final void onFailure$12(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        if (th instanceof Exception) {
            ((o) c2501609rC.l0).LIZIZ((Exception) th);
        } else {
            ((o) c2501609rC.l0).LIZIZ(new RuntimeException(th));
        }
    }

    public static final void onFailure$13(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((C09US) c2501609rC.l0).LJIJ(th);
    }

    public static final void onFailure$2(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        String message;
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c2501609rC.l0;
        if (interfaceC1041760dDS != null) {
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            interfaceC1041760dDS.LIZ(1, message);
        }
    }

    public static final void onFailure$3(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((InterfaceC2373409Rs) c2501609rC.l0).LIZIZ(th);
    }

    public static final void onFailure$4(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((C2198381B2e) ((InterfaceC2373609Ru) c2501609rC.l0)).LIZ(th.getMessage());
    }

    public static final void onFailure$5(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((Function1) c2501609rC.l0).invoke(new C1504480pFm(null, null, null, th, null, 23));
    }

    public static final void onFailure$6(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2501609rC.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onFailure$7(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        ((C05XL) c2501609rC.l0).LJJJJJ(th);
    }

    public static final void onFailure$9(C2501609rC c2501609rC, C0X9S c0x9s, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2501609rC.l0;
        C443120HZe c443120HZe = new C443120HZe("", 104, th.getMessage());
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
    }

    public static final void onResponse$0(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2501609rC.l0;
            Object obj = c0x52.LIZIZ;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c2501609rC.l0;
        C098200Yq c098200Yq = new C098200Yq(new C09HQ(c0x52));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf2.resumeWith(c098200Yq);
    }

    public static final void onResponse$1(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        Object obj;
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c2501609rC.l0;
        if (interfaceC1041760dDS != null) {
            if (c0x52 != null) {
                obj = c0x52.LIZIZ;
            } else {
                obj = null;
            }
            interfaceC1041760dDS.onSuccess(obj);
        }
    }

    public static final void onResponse$10(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        TypedByteArray typedByteArray;
        byte[] bytes;
        List list;
        int i;
        String str;
        Unit unit;
        Object objLJII = c0x52.LIZIZ;
        if (objLJII == null) {
            try {
                TypedInput typedInput = c0x52.LIZJ;
                if (typedInput != null && (typedInput instanceof TypedByteArray) && (typedInput instanceof TypedByteArray) && (typedByteArray = (TypedByteArray) typedInput) != null && (bytes = typedByteArray.getBytes()) != null) {
                    objLJII = C08JS.LIZIZ().LJII(new String(bytes, Charsets.UTF_8), TTSSpeakerInfoResponse.class);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        TTSSpeakerInfoResponse tTSSpeakerInfoResponse = (TTSSpeakerInfoResponse) objLJII;
        if (tTSSpeakerInfoResponse != null) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(tTSSpeakerInfoResponse.payload).optJSONArray("speaker_infos");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(C08JS.LIZIZ().LJII(jSONArrayOptJSONArray.get(i2).toString(), TTSSpeakerInfo.class));
                    }
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
                list = arrayList;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                list = arrayList;
            }
        } else {
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty()) {
            ((InterfaceC2376809Ta) c2501609rC.l0).LIZ((TTSSpeakerInfo) ListProtector.get(list, 0), c0x52.LIZ.LIZIZ, null);
            return;
        }
        InterfaceC2376809Ta interfaceC2376809Ta = (InterfaceC2376809Ta) c2501609rC.l0;
        if (tTSSpeakerInfoResponse != null) {
            i = tTSSpeakerInfoResponse.status_code;
            str = tTSSpeakerInfoResponse.statusText;
            if (str == null) {
            }
            interfaceC2376809Ta.LIZ(null, i, str);
        }
        i = -1;
        str = null;
        interfaceC2376809Ta.LIZ(null, i, str);
    }

    public static final void onResponse$11(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((C05XL) c2501609rC.l0).LJIIZILJ(c0x52.LIZIZ);
        } else {
            ((C05XL) c2501609rC.l0).LJJJJJ(new C09HQ(c0x52));
        }
    }

    public static final void onResponse$12(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((o) c2501609rC.l0).LIZJ(c0x52);
        } else {
            ((o) c2501609rC.l0).LIZIZ(new RuntimeException("HttpException"));
        }
    }

    public static final void onResponse$13(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        ((C09US) c2501609rC.l0).LJIIZILJ(c0x52);
    }

    public static final void onResponse$2(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        Object obj;
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c2501609rC.l0;
        if (interfaceC1041760dDS != null) {
            if (c0x52 != null) {
                obj = c0x52.LIZIZ;
            } else {
                obj = null;
            }
            interfaceC1041760dDS.onSuccess(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$3(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        HashMap map;
        InterfaceC2373409Rs interfaceC2373409Rs = (InterfaceC2373409Rs) c2501609rC.l0;
        C20109213mE c20109213mE = new C20109213mE();
        c20109213mE.LIZIZ = (String) c0x52.LIZIZ;
        List<C080U> list = c0x52.LIZ.LIZLLL;
        if (list != null && !list.isEmpty()) {
            map = new HashMap();
            for (C080U c080u : list) {
                if (c080u != null) {
                    map.put(c080u.LIZ, c080u.LIZIZ);
                }
            }
        } else {
            map = null;
        }
        c20109213mE.LIZJ = map;
        c20109213mE.LIZLLL = c0x52.LIZ.LIZIZ;
        interfaceC2373409Rs.LIZ(c20109213mE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$4(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        ((C2198381B2e) ((InterfaceC2373609Ru) c2501609rC.l0)).LIZIZ((String) c0x52.LIZIZ);
    }

    public static final void onResponse$5(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        String string;
        T t = c0x52.LIZIZ;
        if (t != 0) {
            string = t.toString();
        } else {
            string = null;
        }
        if (c0x52.LIZJ()) {
            ((Function1) c2501609rC.l0).invoke(new C1504480pFm((Map) c0x52.LIZIZ, C080V.LIZ(c0x52.LIZ.LIZLLL), Integer.valueOf(c0x52.LIZ.LIZIZ), null, null, 24));
            return;
        }
        Function1 function1 = (Function1) c2501609rC.l0;
        Map<String, Object> mapLIZ = C080V.LIZ(c0x52.LIZ.LIZLLL);
        Integer numValueOf = Integer.valueOf(c0x52.LIZ.LIZIZ);
        if (string == null) {
            string = "Unknown error";
        }
        function1.invoke(new C1504480pFm(null, mapLIZ, numValueOf, null, string, 9));
    }

    public static final void onResponse$6(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        Object obj = c0x52.LIZIZ;
        if (c0x52.LIZJ() && obj != null) {
            ((InterfaceC20236714Gf) c2501609rC.l0).LJJIFFI(AFwS231S0000000_3.get$arr$(136), obj);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2501609rC.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HTTP ");
        sbLIZ.append(c0x52.LIZ.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c0x52.LIZ.LJI);
        C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onResponse$7(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((C05XL) c2501609rC.l0).LJIIZILJ(c0x52.LIZIZ);
        } else {
            ((C05XL) c2501609rC.l0).LJJJJJ(new C09HQ(c0x52));
        }
    }

    public static final void onResponse$8(C2501609rC c2501609rC, C0X9S c0x9s, C0X52 c0x52) {
        ((Function1) c2501609rC.l0).invoke(c0x52.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResponse$9(X.C2501609rC r6, X.C0X9S r7, X.C0X52 r8) {
        /*
            T r5 = r8.LIZIZ
            r3 = 0
            if (r5 != 0) goto L28
            com.bytedance.retrofit2.mime.TypedInput r1 = r8.LIZJ     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L28
            boolean r0 = r1 instanceof com.bytedance.retrofit2.mime.TypedByteArray     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L28
            com.bytedance.retrofit2.mime.TypedByteArray r1 = (com.bytedance.retrofit2.mime.TypedByteArray) r1     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L28
            byte[] r4 = r1.getBytes()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L28
            com.google.gson.Gson r2 = X.C08JS.LIZIZ()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSLokiInfoResponse> r0 = com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSLokiInfoResponse.class
            java.lang.Object r5 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> L2e
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L2e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L2e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L3a:
            com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSLokiInfoResponse r5 = (com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSLokiInfoResponse) r5
            r5.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r5.payload     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "loki_info"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5f
            com.google.gson.Gson r2 = X.C08JS.LIZIZ()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiInfo> r0 = com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiInfo.class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiInfo r0 = (com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneLokiInfo) r0     // Catch: java.lang.Throwable -> L63
            goto L70
        L5f:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6f:
            r0 = r3
        L70:
            java.lang.String r4 = ""
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.lokiOnlineId
            if (r0 == 0) goto L79
            r4 = r0
        L79:
            java.lang.Object r2 = r6.l0
            X.05Vn r2 = (X.InterfaceC1364105Vn) r2
            X.0HZe r1 = new X.0HZe
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r4, r0, r3)
            X.C189200o6.m2constructorimpl(r1)
            r2.resumeWith(r1)
            return
        L8e:
            java.lang.Object r3 = r6.l0
            X.05Vn r3 = (X.InterfaceC1364105Vn) r3
            X.0HZe r2 = new X.0HZe
            int r0 = r5.status_code
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.message
            r2.<init>(r4, r1, r0)
            X.C189200o6.m2constructorimpl(r2)
            r3.resumeWith(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2501609rC.onResponse$9(X.09rC, X.0X9S, X.0X52):void");
    }
}
