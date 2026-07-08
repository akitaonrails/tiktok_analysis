package X;

import X.C0OB8;
import X.C0RGF;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS1S1110100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SZR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SZR<R extends C0RGF<R, ITEM>, ITEM extends C0OB8> implements C0SR9<R, ITEM> {
    public final InterfaceC692440REc LIZ;
    public ConcurrentHashMap<String, C0SZS<R, ITEM>> LIZIZ = new ConcurrentHashMap<>();

    public abstract String LIZLLL(ITEM item, R r, int i);

    @Override // X.C0SR9
    public final void LJFF() {
        this.LIZIZ.clear();
    }

    public C0SZR(InterfaceC692440REc interfaceC692440REc) {
        this.LIZ = interfaceC692440REc;
    }

    @Override // X.C0SR9
    public final void LIZ(Aweme aweme) {
        Iterator<Map.Entry<String, C0SZS<R, ITEM>>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getKey(), C0SP9.LIZIZ(aweme))) {
                it2.remove();
            }
        }
    }

    @Override // X.C0SR9
    public final void LIZJ(List<? extends Aweme> list) {
        String strLIZIZ;
        ConcurrentHashMap<String, C0SZS<R, ITEM>> concurrentHashMap = new ConcurrentHashMap<>();
        if (list != null && !list.isEmpty()) {
            for (Aweme aweme : new ArrayList(list)) {
                if (aweme != null && (strLIZIZ = C0SP9.LIZIZ(aweme)) != null && !TextUtils.isEmpty(strLIZIZ) && this.LIZIZ.get(strLIZIZ) != null) {
                    concurrentHashMap.put(strLIZIZ, this.LIZIZ.get(strLIZIZ));
                }
            }
        }
        this.LIZIZ = concurrentHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C0RF2
    public final void LIZIZ(InterfaceC1587906Jp interfaceC1587906Jp, C0SMO<?, ?> c0smo, int i, List<? extends Object> list) {
        C0OB8 c0ob8 = (C0OB8) interfaceC1587906Jp;
        C725270Scf c725270Scf = C725270Scf.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725270Scf);
                }
            }
            if (C725480Sd0.LIZ(c725270Scf)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725270Scf, "default", SystemClock.elapsedRealtimeNanos(), 22));
            }
        }
        C259800zU c259800zU = new C259800zU();
        ?? LIZIZ = C0SP9.LIZIZ(c0ob8.getAweme());
        c259800zU.element = LIZIZ;
        if (LIZIZ == 0 || LIZIZ.length() == 0) {
            c259800zU.element = UUID.randomUUID().toString();
            AwemeBizExtKt.setFakeAid(c0ob8.getAweme(), (String) c259800zU.element);
            C1AF0.LIZJ(LIZLLL(c0ob8, (C0RGF) c0smo, i));
        }
        C0SZS<R, ITEM> c0szs = this.LIZIZ.get(c259800zU.element);
        if (c0szs == null) {
            C0SZU child = c0smo.getChild();
            if (!(child instanceof C0SZU)) {
                child = null;
            }
            c0szs = new C0SZS<>(C13LE.LIZ(c0smo.getClass()), child, null);
            this.LIZIZ.put((String) c259800zU.element, c0szs);
        }
        C0SZS<R, ?> proxy = c0smo.getProxy();
        C725270Scf c725270Scf2 = C725270Scf.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725270Scf2);
                }
            }
            if (C725480Sd0.LIZ(c725270Scf2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725270Scf2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 2));
            }
        }
        C725200ScY c725200ScY = C725200ScY.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
            if (arrayList3.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventBegin(c725200ScY);
                }
            }
            if (C725480Sd0.LIZ(c725200ScY)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725200ScY, "default", SystemClock.elapsedRealtimeNanos(), 23));
            }
        }
        if (proxy != 0) {
            proxy.LIZIZ();
        }
        C725200ScY c725200ScY2 = C725200ScY.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList4 = C725430Scv.LIZIZ;
            if (arrayList4.size() > 0) {
                Iterator<InterfaceC725440Scw> it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    it5.next().onEventEnd(c725200ScY2);
                }
            }
            if (C725480Sd0.LIZ(c725200ScY2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725200ScY2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 3));
            }
        }
        c0szs.LIZ(i, c0smo, interfaceC1587906Jp, list, new C0SZM(c0szs, i, list), new C692430REb(this, c259800zU, i));
    }
}
