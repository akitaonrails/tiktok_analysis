package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701420uNQ extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ ECAsyncInflaterV2 LLILLL;
    public final /* synthetic */ LayoutInflater LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701420uNQ(C118300cf c118300cf, C259800zU<String> c259800zU, ECAsyncInflaterV2 eCAsyncInflaterV2, LayoutInflater layoutInflater) {
        super(2);
        this.LL = c118300cf;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = eCAsyncInflaterV2;
        this.LLILZ = layoutInflater;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        int iIntValue;
        LinkedList<SoftReference<View>> linkedList;
        Integer num3;
        View viewTd;
        int iIntValue2 = num.intValue();
        num2.intValue();
        this.LL.element = iIntValue2;
        if (C1701430uNR.LIZIZ()) {
            this.LLILLJJLI.element = this.LLILLL.LL.getResources().getResourceName(this.LL.element);
        }
        Integer num4 = this.LLILLL.LLILLL.get(Integer.valueOf(iIntValue2));
        if (num4 != null && (iIntValue = num4.intValue()) > 0) {
            ECAsyncInflaterV2 eCAsyncInflaterV2 = this.LLILLL;
            if (!eCAsyncInflaterV2.LLILZ) {
                LinkedList<SoftReference<View>> linkedList2 = eCAsyncInflaterV2.LLILLJJLI.get(Integer.valueOf(iIntValue2));
                if (linkedList2 == null) {
                    linkedList = new LinkedList<>();
                    this.LLILLL.LLILLJJLI.put(Integer.valueOf(iIntValue2), linkedList);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : linkedList2) {
                        if (((SoftReference) obj).get() != null) {
                            arrayList.add(obj);
                        }
                    }
                    linkedList = new LinkedList<>(arrayList);
                    this.LLILLL.LLILLJJLI.put(Integer.valueOf(iIntValue2), linkedList);
                }
                int size = linkedList.size();
                while (size < iIntValue) {
                    ECAsyncInflaterV2 eCAsyncInflaterV22 = this.LLILLL;
                    if (eCAsyncInflaterV22.LLILZ || (num3 = eCAsyncInflaterV22.LLILLL.get(Integer.valueOf(iIntValue2))) == null || (iIntValue = num3.intValue()) <= 0) {
                        break;
                    }
                    System.currentTimeMillis();
                    try {
                        viewTd = C786410Ut5.Td(this.LLILZ, iIntValue2, new FrameLayout(this.LLILLL.LL), false);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LIZJ("ECAsyncInflaterV2 inflate crash");
                        viewTd = null;
                    }
                    C1701430uNR.LIZIZ();
                    synchronized (linkedList) {
                        if (viewTd != null) {
                            try {
                                linkedList.offer(new SoftReference<>(viewTd));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        size++;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
