package Y;

import X.AbstractC795160VHe;
import X.C0V52;
import X.C0V5P;
import X.C0VHL;
import X.C0VI8;
import X.C0VIG;
import X.C0VIH;
import X.C0W56;
import X.C0W8M;
import X.C0WOT;
import X.C0WPO;
import X.C0WPQ;
import X.C0WPS;
import X.C0WQ6;
import X.C0WQ8;
import X.C0WQE;
import X.C0WZX;
import X.C0X2A;
import X.C0X2B;
import X.C0XGR;
import X.C0XQ7;
import X.C0XVX;
import X.C134N;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1471660oOq;
import X.C1B91;
import X.C1C7U;
import X.C20684815ws;
import X.C2086108Ff;
import X.C2179971ATj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C340190DVh;
import X.C786410Ut5;
import X.C791970V4x;
import X.C791990V4z;
import X.C792400V6o;
import X.C793770VBv;
import X.C794950VGj;
import X.C800840VbG;
import X.C805130ViB;
import X.C807660VmG;
import X.C985403tE;
import X.EnumC1910390zoT;
import X.EnumC823400WRu;
import X.InterfaceC800830VbF;
import X.InterfaceC805220ViK;
import X.InterfaceC849390XTt;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.j2;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AwS379S0200000_13;
import org.json.JSONException;
import org.json.JSONObject;
import zm6.b;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS18S1200000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        try {
            try {
                AbstractC795160VHe abstractC795160VHe = (AbstractC795160VHe) ((C134N) this.l1).get();
                if (abstractC795160VHe == null) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("%s returned a null result. Treating it as a failure.", new Object[]{((C0VHL) this.l2).LLILZ.LIZJ});
                    c0vi8LIZ.getClass();
                } else {
                    C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                    C786410Ut5.j4("%s returned a %s result.", new Object[]{((C0VHL) this.l2).LLILZ.LIZJ, abstractC795160VHe});
                    c0vi8LIZ2.getClass();
                    ((C0VHL) this.l2).LLIZ = abstractC795160VHe;
                }
            } catch (InterruptedException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
                C786410Ut5.j4("%s failed because it threw an exception/error", new Object[]{this.s0});
                c0vi8LIZ3.getClass();
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C0VI8 c0vi8LIZ4 = C0VI8.LIZ();
                C786410Ut5.j4("%s was cancelled", new Object[]{this.s0});
                c0vi8LIZ4.getClass();
            } catch (ExecutionException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                C0VI8 c0vi8LIZ32 = C0VI8.LIZ();
                C786410Ut5.j4("%s failed because it threw an exception/error", new Object[]{this.s0});
                c0vi8LIZ32.getClass();
            }
            ((C0VHL) this.l2).LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0VHL) this.l2).LIZLLL();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C791970V4x c791970V4x = (C791970V4x) this.l2;
            while (true) {
                C791990V4z c791990V4z = (C791990V4z) c791970V4x.LIZIZ.poll();
                if (c791990V4z == null) {
                    break;
                }
                ((CopyOnWriteArraySet) c791970V4x.LIZJ).remove(c791990V4z.LIZ);
            }
            C791970V4x c791970V4x2 = (C791970V4x) this.l2;
            C791990V4z c791990V4z2 = (C791990V4z) this.l1;
            if (!((CopyOnWriteArraySet) c791970V4x2.LIZJ).contains(c791990V4z2.LIZ)) {
                if (C792400V6o.LJIIIIZZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No Leak First Check:");
                    sbLIZ.append(this.s0);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                return;
            }
            C791970V4x c791970V4x3 = (C791970V4x) this.l2;
            if (!c791970V4x3.LIZLLL.LIZ) {
                c791970V4x3.LIZ((C791990V4z) this.l1, this.s0);
                return;
            }
            C791970V4x.LIZIZ();
            C791970V4x c791970V4x4 = (C791970V4x) this.l2;
            while (true) {
                C791990V4z c791990V4z3 = (C791990V4z) c791970V4x4.LIZIZ.poll();
                if (c791990V4z3 == null) {
                    break;
                }
                ((CopyOnWriteArraySet) c791970V4x4.LIZJ).remove(c791990V4z3.LIZ);
            }
            C791970V4x c791970V4x5 = (C791970V4x) this.l2;
            C791990V4z c791990V4z4 = (C791990V4z) this.l1;
            if (!(!((CopyOnWriteArraySet) c791970V4x5.LIZJ).contains(c791990V4z4.LIZ))) {
                ((C791970V4x) this.l2).LIZ((C791990V4z) this.l1, this.s0);
            } else if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("No Leak:");
                sbLIZ2.append(this.s0);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$3() {
        Activity activity = (Activity) this.l1;
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJIIIZ = new C340190DVh(activity, R.raw.icon_color_tiktok_logo_dark, (Integer) null, 12);
        c1397580mTM.LJI(((Activity) this.l1).getString(2131827375));
        c1397580mTM.LIZIZ(this.s0);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS379S0200000_13((Activity) this.l1, (InterfaceC849390XTt) this.l2, 17));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C0XVX.LIZ.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "log_out");
        C20684815ws.LJIILLIIL("show_verify_email_popup", c0xgr.LIZ);
    }

    public final void LIZ$4() {
        C0VIG c0vigLJIIIIZZ = ((C0VIH) ((WorkDatabase) this.l1).LJIIIIZZ()).LJIIIIZZ(this.s0);
        if (c0vigLJIIIIZZ == null || !c0vigLJIIIIZZ.LIZIZ()) {
            return;
        }
        synchronized (((C794950VGj) this.l2).LLILLL) {
            try {
                ((HashMap) ((C794950VGj) this.l2).LLILZLL).put(this.s0, c0vigLJIIIIZZ);
                ((HashSet) ((C794950VGj) this.l2).LLIZ).add(c0vigLJIIIIZZ);
                C794950VGj c794950VGj = (C794950VGj) this.l2;
                c794950VGj.LLIZLLLIL.LIZJ(c794950VGj.LLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$5() throws JSONException {
        Object objLIZJ;
        EnumC1910390zoT enumC1910390zoTLIZIZ;
        Object objLIZIZ;
        String string;
        if (C805130ViB.LIZJ != null) {
            Map map = (Map) this.l1;
            InterfaceC800830VbF interfaceC800830VbF = (InterfaceC800830VbF) this.l2;
            String str = this.s0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("map_data", map);
            linkedHashMap.put("bert_cache_dict", new LinkedHashMap());
            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(C805130ViB.LIZJ, "predict_task_online", new TTMParamData((Map<String, Object>) linkedHashMap));
            if (interfaceC805220ViKRunScene != null) {
                objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                enumC1910390zoTLIZIZ = interfaceC805220ViKRunScene.LIZIZ();
            } else {
                objLIZJ = null;
                enumC1910390zoTLIZIZ = null;
            }
            if (enumC1910390zoTLIZIZ != EnumC1910390zoT.CelResult) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", str);
                jSONObject.put("error_info", "result is nil");
                if (interfaceC805220ViKRunScene == null || (objLIZIZ = interfaceC805220ViKRunScene.LIZIZ()) == null) {
                    objLIZIZ = 0;
                }
                jSONObject.put("error_code", objLIZIZ);
                if (interfaceC805220ViKRunScene == null || (string = interfaceC805220ViKRunScene.toString()) == null) {
                    string = "";
                }
                jSONObject.put("error_desc", string);
                C793770VBv.LJII("pns_kv_model_metric", jSONObject, null, null);
                return;
            }
            if (objLIZJ instanceof Map) {
                Map map2 = (Map) objLIZJ;
                if (!map2.isEmpty()) {
                    Object obj = map2.get("bsusiness_ai_results");
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof ArrayList) {
                        for (Object obj2 : (ArrayList) obj) {
                            if (obj2 instanceof Map) {
                                Map map3 = (Map) obj2;
                                Object obj3 = map3.get("path");
                                Object obj4 = map3.get("probability");
                                Object obj5 = map3.get("data_type");
                                if (obj3 != null && (obj3 instanceof String) && obj4 != null && (obj4 instanceof Double) && obj5 != null && (obj5 instanceof String)) {
                                    ((Number) obj4).doubleValue();
                                    arrayList.add(new C800840VbG((String) obj3, (String) obj5));
                                }
                            }
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source", str);
                        jSONObject2.put("error_info", "none");
                        C793770VBv.LJII("pns_kv_model_metric", jSONObject2, null, null);
                        if (interfaceC800830VbF != null) {
                            interfaceC800830VbF.LIZ(arrayList);
                        }
                    }
                }
            }
        }
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uncompliant web request, method=");
        sbLIZ.append(this.s0);
        sbLIZ.append(", url=");
        sbLIZ.append(((WebResourceRequest) this.l1).getUrl());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        WebView webView = (WebView) this.l2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("console.warn(\"");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("\");");
        webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ2), new ValueCallback() { // from class: X.0X5J
            @Override // android.webkit.ValueCallback
            public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            }
        });
    }

    public static final void run$0(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        try {
            ((C0W56) aRunnableS18S1200000_13.l2).LLILLL.LIZ((Bundle) aRunnableS18S1200000_13.l1, aRunnableS18S1200000_13.s0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        try {
            ((C0W56) aRunnableS18S1200000_13.l2).LLILLL.LJ((Bundle) aRunnableS18S1200000_13.l1, aRunnableS18S1200000_13.s0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$10(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        try {
            aRunnableS18S1200000_13.LIZ$4();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$11(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("KVAIManager@6a61.predictMap$1$1");
        try {
            aRunnableS18S1200000_13.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KVAIManager@6a61.predictMap$1$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:3:0x0011, B:5:0x001f, B:6:0x002e, B:11:0x0060, B:12:0x0068, B:14:0x0087, B:15:0x008b, B:17:0x0092, B:19:0x0096, B:20:0x009f, B:22:0x00a3, B:28:0x00b3, B:32:0x00bd, B:35:0x00c4, B:37:0x00d9, B:39:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00f6, B:49:0x0100, B:51:0x0107, B:53:0x010f, B:55:0x0116, B:56:0x011f, B:57:0x0124, B:59:0x012e, B:61:0x0132, B:62:0x013b, B:64:0x0142, B:65:0x014b, B:67:0x0157, B:69:0x015f, B:70:0x0168, B:72:0x016e, B:73:0x0178, B:74:0x017d, B:76:0x0181, B:78:0x0185, B:79:0x0188), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:3:0x0011, B:5:0x001f, B:6:0x002e, B:11:0x0060, B:12:0x0068, B:14:0x0087, B:15:0x008b, B:17:0x0092, B:19:0x0096, B:20:0x009f, B:22:0x00a3, B:28:0x00b3, B:32:0x00bd, B:35:0x00c4, B:37:0x00d9, B:39:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00f6, B:49:0x0100, B:51:0x0107, B:53:0x010f, B:55:0x0116, B:56:0x011f, B:57:0x0124, B:59:0x012e, B:61:0x0132, B:62:0x013b, B:64:0x0142, B:65:0x014b, B:67:0x0157, B:69:0x015f, B:70:0x0168, B:72:0x016e, B:73:0x0178, B:74:0x017d, B:76:0x0181, B:78:0x0185, B:79:0x0188), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142 A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:3:0x0011, B:5:0x001f, B:6:0x002e, B:11:0x0060, B:12:0x0068, B:14:0x0087, B:15:0x008b, B:17:0x0092, B:19:0x0096, B:20:0x009f, B:22:0x00a3, B:28:0x00b3, B:32:0x00bd, B:35:0x00c4, B:37:0x00d9, B:39:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00f6, B:49:0x0100, B:51:0x0107, B:53:0x010f, B:55:0x0116, B:56:0x011f, B:57:0x0124, B:59:0x012e, B:61:0x0132, B:62:0x013b, B:64:0x0142, B:65:0x014b, B:67:0x0157, B:69:0x015f, B:70:0x0168, B:72:0x016e, B:73:0x0178, B:74:0x017d, B:76:0x0181, B:78:0x0185, B:79:0x0188), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[Catch: all -> 0x0199, LOOP:1: B:70:0x0168->B:72:0x016e, LOOP_END, TryCatch #0 {all -> 0x0199, blocks: (B:3:0x0011, B:5:0x001f, B:6:0x002e, B:11:0x0060, B:12:0x0068, B:14:0x0087, B:15:0x008b, B:17:0x0092, B:19:0x0096, B:20:0x009f, B:22:0x00a3, B:28:0x00b3, B:32:0x00bd, B:35:0x00c4, B:37:0x00d9, B:39:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00f6, B:49:0x0100, B:51:0x0107, B:53:0x010f, B:55:0x0116, B:56:0x011f, B:57:0x0124, B:59:0x012e, B:61:0x0132, B:62:0x013b, B:64:0x0142, B:65:0x014b, B:67:0x0157, B:69:0x015f, B:70:0x0168, B:72:0x016e, B:73:0x0178, B:74:0x017d, B:76:0x0181, B:78:0x0185, B:79:0x0188), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$12(Y.ARunnableS18S1200000_13 r12) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S1200000_13.run$12(Y.ARunnableS18S1200000_13):void");
    }

    public static final void run$13(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadMonitorReport@6c1b.monitorEvent$1");
        try {
            ((C1B91) aRunnableS18S1200000_13.l2).LIZJ(aRunnableS18S1200000_13.s0, (JSONObject) aRunnableS18S1200000_13.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadMonitorReport@6c1b.monitorEvent$1");
    }

    public static final void run$14(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        Set<String> set;
        Request request = (Request) aRunnableS18S1200000_13.l1;
        Request request2 = (Request) aRunnableS18S1200000_13.l2;
        String str = aRunnableS18S1200000_13.s0;
        C1C7U.LIZ("TTNetRequestComparator@b468.compare$1L");
        if (request != null && request2 != null) {
            try {
                set = C0W8M.LIZIZ.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(e, new Throwable(), 102));
            }
            if (set != null && !set.isEmpty()) {
                Map<String, String> mapLIZIZ = C0WOT.LIZIZ(request.getHeaders());
                Map<String, String> mapLIZIZ2 = C0WOT.LIZIZ(request2.getHeaders());
                HashMap map = (HashMap) mapLIZIZ;
                HashSet<String> hashSet = new HashSet(map.keySet());
                HashMap map2 = (HashMap) mapLIZIZ2;
                hashSet.addAll(map2.keySet());
                for (String str2 : hashSet) {
                    if (!set.contains(str2)) {
                        String str3 = (String) map.get(str2);
                        String str4 = (String) map2.get(str2);
                        if (!Objects.equals(str3, str4)) {
                            HashMap map3 = new HashMap();
                            map3.put("key", str2);
                            map3.put("newValue", str3);
                            map3.put("oldValue", str4);
                            map3.put("interceptorId", str);
                            IExceptionMonitor iExceptionMonitor = (IExceptionMonitor) ServiceManager.get().getService(IExceptionMonitor.class);
                            Throwable th = new Throwable();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("not valid header `");
                            sbLIZ.append(str2);
                            sbLIZ.append("`");
                            iExceptionMonitor.monitorThrowable(th, C2188811AlT.LIZIZ(sbLIZ), map3);
                            C1C7U.LIZIZ("TTNetRequestComparator@b468.compare$1L");
                            return;
                        }
                    }
                }
                C2086108Ff c2086108Ff = C2086108Ff.LIZ;
                String query = new URL(request.getUrl()).getQuery();
                c2086108Ff.getClass();
                Map mapLIZ = C2086108Ff.LIZ(query);
                Map mapLIZ2 = C2086108Ff.LIZ(new URL(request2.getUrl()).getQuery());
                HashSet<String> hashSet2 = new HashSet(mapLIZ.keySet());
                hashSet2.addAll(mapLIZ2.keySet());
                for (String str5 : hashSet2) {
                    if (!set.contains(str5)) {
                        List arrayList = (List) mapLIZ.get(str5);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Object arrayList2 = (List) mapLIZ2.get(str5);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        if (!arrayList.equals(arrayList2)) {
                            HashMap map4 = new HashMap();
                            map4.put("key", str5);
                            map4.put("newValue", arrayList.toString());
                            map4.put("oldValue", arrayList2.toString());
                            map4.put("interceptorId", str);
                            IExceptionMonitor iExceptionMonitor2 = (IExceptionMonitor) ServiceManager.get().getService(IExceptionMonitor.class);
                            Throwable th2 = new Throwable();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("not valid query `");
                            sbLIZ2.append(str5);
                            sbLIZ2.append("`");
                            iExceptionMonitor2.monitorThrowable(th2, C2188811AlT.LIZIZ(sbLIZ2), map4);
                            C1C7U.LIZIZ("TTNetRequestComparator@b468.compare$1L");
                            return;
                        }
                    }
                }
                C1C7U.LIZIZ("TTNetRequestComparator@b468.compare$1L");
                return;
            }
            C1C7U.LIZIZ("TTNetRequestComparator@b468.compare$1L");
            return;
        }
        C1C7U.LIZIZ("TTNetRequestComparator@b468.compare$1L");
    }

    public static final void run$15(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LogObserver@225e.notifyObservers$1");
        try {
            Iterator<C0V5P> it2 = ((C0V52) aRunnableS18S1200000_13.l2).LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(aRunnableS18S1200000_13.s0, (JSONObject) aRunnableS18S1200000_13.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LogObserver@225e.notifyObservers$1");
    }

    public static final void run$16(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AppLinkData@fc20.fetchDeferredAppLinkData$1");
        try {
            if (!C807660VmG.LIZ(aRunnableS18S1200000_13)) {
                try {
                    b.LIZIZ((Context) aRunnableS18S1200000_13.l1, aRunnableS18S1200000_13.s0, (b.a) aRunnableS18S1200000_13.l2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppLinkData@fc20.fetchDeferredAppLinkData$1");
    }

    public static final void run$2(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DetectActivityLeakTask@4e87.checkActivityLeak$1");
        try {
            aRunnableS18S1200000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetectActivityLeakTask@4e87.checkActivityLeak$1");
    }

    public static final void run$3(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewTTnetHook@3785.hookWebView$2$shouldInterceptRequest$1");
        try {
            aRunnableS18S1200000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewTTnetHook@3785.hookWebView$2$shouldInterceptRequest$1");
    }

    public static final void run$4(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        C0X2B c0x2b = (C0X2B) aRunnableS18S1200000_13.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS18S1200000_13.l2;
        String str = aRunnableS18S1200000_13.s0;
        c0x2b.getClass();
        C1C7U.LIZ("AbsIESCronetDependAdapter@e01f.sendAppMonitorEvent$1L");
        String curUserId = C0XQ7.LJFF().getCurUserId();
        String str2 = C0X2A.LIZIZ;
        String str3 = C0X2A.LIZLLL;
        String lowerCase = C0X2A.LIZJ;
        if (!TextUtils.isEmpty(lowerCase)) {
            lowerCase = lowerCase.toLowerCase();
        }
        String strOptString = jSONObject.optString("source");
        String strOptString2 = jSONObject.optString("store_region");
        if (!TextUtils.isEmpty(lowerCase)) {
            lowerCase = lowerCase.toLowerCase();
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            strOptString2 = strOptString2.toLowerCase();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("operation", "Monitor Event");
        arrayMap.put("uid", curUserId);
        arrayMap.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        arrayMap.put("region_source", str3);
        arrayMap.put("region_code", lowerCase);
        if (!TextUtils.isEmpty(str2)) {
            arrayMap.put("region_idc", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            if (ALog.sConfig != null) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("RegionEvent", str);
            }
            Matcher matcher = C0X2B.LIZIZ.matcher(str);
            if (matcher.find() && matcher.groupCount() >= 4) {
                arrayMap.put("url", matcher.group(1).replaceAll("\\\\", ""));
                arrayMap.put("logId", matcher.group(2));
                arrayMap.put("new_region_code", matcher.group(3));
                arrayMap.put("new_region_source", matcher.group(4));
                if (!Objects.equals(matcher.group(3), strOptString2) || !Objects.equals(matcher.group(4), strOptString)) {
                    arrayMap.put("log_source", strOptString);
                    arrayMap.put("log_code", strOptString2);
                    arrayMap.put("diff", Boolean.TRUE);
                    Matcher matcher2 = C0X2B.LIZJ.matcher(str);
                    if (matcher2.find() && matcher2.groupCount() >= 1 && !TextUtils.isEmpty(matcher2.group(1))) {
                        arrayMap.put("x-tt-tnc-attr", matcher2.group(1));
                    }
                    Matcher matcher3 = C0X2B.LIZLLL.matcher(str);
                    if (matcher3.find() && matcher3.groupCount() >= 1 && !TextUtils.isEmpty(matcher3.group(1))) {
                        arrayMap.put("x-tt-with-tnc", matcher3.group(1));
                    }
                }
            }
        }
        C1C7U.LIZIZ("AbsIESCronetDependAdapter@e01f.sendAppMonitorEvent$1L");
    }

    public static final void run$5(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        try {
            aRunnableS18S1200000_13.LIZ$2();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$6(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LogoutVerifyEmailHandler@148e.showDialog$1");
        try {
            aRunnableS18S1200000_13.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LogoutVerifyEmailHandler@148e.showDialog$1");
    }

    public static final void run$7(ARunnableS18S1200000_13 aRunnableS18S1200000_13) throws Throwable {
        C0WPO c0wpo = (C0WPO) aRunnableS18S1200000_13.l1;
        String str = aRunnableS18S1200000_13.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS18S1200000_13.l2;
        c0wpo.getClass();
        C1C7U.LIZ("AppLogEngineUploader@26e8.onEvent$1L");
        int i = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("AppLogEngineUploader", "onEvent event " + str);
        C0WPO.LIZ();
        if (C0WPO.LIZIZ != null && C0WPO.LIZJ != null) {
            try {
                jSONObject.put("session_id", (String) C2204961BRm.a0(C0WPO.LIZIZ, null, new Object[0], new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFuc2P232gRhQKcsJoMAtzC1eZv9IYp5r+", null)));
                jSONObject.put("auto_report", 1);
                AtomicInteger atomicInteger = C0WPO.LJ;
                if (1 == atomicInteger.get()) {
                    C2204961BRm.a0(C0WPO.LIZJ, null, new Object[]{c0wpo.LIZ, str, jSONObject}, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFuc2P232gRhQKcsJoMAtzC1eZv9IYp5r+", null));
                } else if (2 == atomicInteger.get()) {
                    C2204961BRm.a0(C0WPO.LIZJ, null, new Object[]{str, jSONObject}, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFuc2P232gRhQKcsJoMAtzC1eZv9IYp5r+", null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("AppLogEngineUploader", "upload error " + e.toString());
            }
        }
        C0WPS.LIZJ(jSONObject);
        C0WPQ.LIZ.getClass();
        C1C7U.LIZIZ("AppLogEngineUploader@26e8.onEvent$1L");
    }

    public static final void run$8(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        String str = aRunnableS18S1200000_13.s0;
        Map map = (Map) aRunnableS18S1200000_13.l1;
        C0WQE c0wqe = (C0WQE) aRunnableS18S1200000_13.l2;
        C1C7U.LIZ("AggregatedReportAction@6adf.onExecuteAction$1L");
        map.put("is_timeout_report", new C0WQ8(EnumC823400WRu.Bool, Boolean.TRUE));
        synchronized (map) {
            try {
                C0WQ6.LIZIZ(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c0wqe.remove(str);
        C1C7U.LIZIZ("AggregatedReportAction@6adf.onExecuteAction$1L");
    }

    public static final void run$9(ARunnableS18S1200000_13 aRunnableS18S1200000_13) {
        String str = aRunnableS18S1200000_13.s0;
        Map map = (Map) aRunnableS18S1200000_13.l1;
        C0WQE c0wqe = (C0WQE) aRunnableS18S1200000_13.l2;
        C1C7U.LIZ("MergeReportAction@8235.onExecuteAction$1L");
        synchronized (map) {
            try {
                map.put("merge_report_reason", new C0WQ8(EnumC823400WRu.String, "timeout"));
                C0WQ6.LIZIZ(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c0wqe.remove(str);
        C1C7U.LIZIZ("MergeReportAction@8235.onExecuteAction$1L");
    }

    public ARunnableS18S1200000_13(Context context, String str, int i) {
        this.$t = i;
        j2 j2Var = j2.LIZ;
        this.l1 = context;
        this.s0 = str;
        this.l2 = j2Var;
    }

    public ARunnableS18S1200000_13(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }

    public ARunnableS18S1200000_13(C0V52 c0v52, String str, String str2, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = c0v52;
        this.s0 = str2;
        this.l1 = jSONObject;
    }
}
