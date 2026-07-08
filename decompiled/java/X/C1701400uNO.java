package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: renamed from: X.0uNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701400uNO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ECAsyncInflaterV2 LL;
    public final /* synthetic */ C1701390uNN LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ LayoutInflater LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701400uNO(ECAsyncInflaterV2 eCAsyncInflaterV2, C1701390uNN c1701390uNN, C118300cf c118300cf, LayoutInflater layoutInflater) {
        super(0);
        this.LL = eCAsyncInflaterV2;
        this.LLILLJJLI = c1701390uNN;
        this.LLILLL = c118300cf;
        this.LLILZ = layoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.09og, java.lang.Runnable] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.LL.isFinishing()) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            try {
                this.LLILLJJLI.LIZ(new C1701420uNQ(this.LLILLL, c259800zU, this.LL, this.LLILZ));
                if (C1701430uNR.LIZIZ()) {
                    Iterator<Map.Entry<Integer, LinkedList<SoftReference<View>>>> it2 = this.LL.LLILLJJLI.entrySet().iterator();
                    int size = 0;
                    while (it2.hasNext()) {
                        LinkedList<SoftReference<View>> value = it2.next().getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : value) {
                            if (((SoftReference) obj).get() != null) {
                                arrayList.add(obj);
                            }
                        }
                        size += arrayList.size();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("asyncInflate: view cache size ");
                    sbLIZ.append(size);
                    sbLIZ.append(' ');
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                Long l = this.LLILLJJLI.LIZLLL;
                if (l != null) {
                    ECAsyncInflaterV2 eCAsyncInflaterV2 = this.LL;
                    final C1701390uNN c1701390uNN = this.LLILLJJLI;
                    long jLongValue = l.longValue();
                    final ConcurrentHashMap<Context, ECAsyncInflaterV2> concurrentHashMap = ECAsyncInflaterV2.LLILZLL;
                    final ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap2 = eCAsyncInflaterV2.LLILLJJLI;
                    RunnableC2486009og runnableC2486009og = eCAsyncInflaterV2.LLILZIL;
                    if (runnableC2486009og != null) {
                        C0CFQ.LIZ.removeCallbacks(runnableC2486009og);
                    }
                    final Activity activity = eCAsyncInflaterV2.LL;
                    ?? r1 = new Runnable(c1701390uNN, activity, concurrentHashMap, concurrentHashMap2) { // from class: X.09og
                        public final WeakReference<Context> LL;
                        public final WeakReference<Map<Context, ECAsyncInflaterV2>> LLILLJJLI;
                        public final WeakReference<C1701390uNN> LLILLL;
                        public final WeakReference<ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>>> LLILZ;

                        public final void LIZ() {
                            Map<Context, ECAsyncInflaterV2> map = this.LLILLJJLI.get();
                            Context context = this.LL.get();
                            C1701390uNN c1701390uNN2 = this.LLILLL.get();
                            ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap3 = this.LLILZ.get();
                            if (context != null && map != null) {
                                map.remove(context);
                            }
                            if (c1701390uNN2 == null || concurrentHashMap3 == null) {
                                return;
                            }
                            c1701390uNN2.LIZ(new AwS617S0100000_3((ConcurrentHashMap) concurrentHashMap3, (ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>>) 32));
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("EcViewGcRunnable@2499.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("EcViewGcRunnable@2499.run");
                        }

                        {
                            this.LL = new WeakReference<>(activity);
                            this.LLILLJJLI = new WeakReference<>(concurrentHashMap);
                            this.LLILLL = new WeakReference<>(c1701390uNN);
                            this.LLILZ = new WeakReference<>(concurrentHashMap2);
                        }
                    };
                    eCAsyncInflaterV2.LLILZIL = r1;
                    C786410Ut5.LJLIIL(jLongValue, C0CFQ.LIZ, r1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILLL.element != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ECAsyncInflaterV2 inflate ");
                    sbLIZ2.append((String) c259800zU.element);
                    sbLIZ2.append(" failed");
                    C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        return Unit.LIZ;
    }
}
