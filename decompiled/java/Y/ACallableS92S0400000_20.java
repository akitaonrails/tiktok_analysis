package Y;

import X.C1290500jge;
import X.C1290800jh8;
import X.C1290850jhD;
import X.C1291600jiQ;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC1290730jh1;
import X.InterfaceC1290780jh6;
import Y.ARunnableS2S1500000_20;
import android.graphics.Bitmap;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import z76.g$a;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS92S0400000_20 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static final Object call$0(ACallableS92S0400000_20 aCallableS92S0400000_20) {
        C1290500jge c1290500jge;
        final ReadableMap readableMap = (ReadableMap) aCallableS92S0400000_20.l0;
        final InterfaceC1290730jh1 interfaceC1290730jh1 = (InterfaceC1290730jh1) aCallableS92S0400000_20.l1;
        final C1291600jiQ c1291600jiQ = (C1291600jiQ) aCallableS92S0400000_20.l2;
        final LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aCallableS92S0400000_20.l3;
        C1C7U.LIZ("LynxBytedLottieView@7d8e.fetchPolyfillBitmap$1L");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        final HashMap map = new HashMap();
        if (readableMap.size() == 0) {
            interfaceC1290730jh1.onSuccess("");
            c1290500jge = new C1290500jge("");
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(readableMap.size());
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string = readableMap.getString(strNextKey);
                C1290800jh8 c1290800jh8 = c1291600jiQ.LIZLLL.get(strNextKey);
                if (c1290800jh8 != null) {
                    final C259800zU c259800zU = new C259800zU();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1290800jh8.LJ);
                    sbLIZ.append(string);
                    ?? LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c259800zU.element = LIZIZ;
                    lynxBytedLottieView.LJJJ(lynxBytedLottieView.LJJIZ(LIZIZ), strNextKey, c1290800jh8, new InterfaceC1290780jh6() { // from class: X.0jh0
                        @Override // X.InterfaceC1290780jh6
                        public final void onFailed(String str) throws JSONException {
                            if (!a0.LJJJIL(str)) {
                                LynxBytedLottieView lynxBytedLottieView2 = lynxBytedLottieView;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("fetch polyfill bitmap failed, map: ");
                                sbLIZ2.append(readableMap);
                                sbLIZ2.append(", path: ");
                                sbLIZ2.append(c259800zU.element);
                                sbLIZ2.append(", msg: ");
                                sbLIZ2.append(str);
                                lynxBytedLottieView2.LJJIJIIJIL(1, C2188811AlT.LIZIZ(sbLIZ2), c259800zU.element);
                            }
                            interfaceC1290730jh1.onFailed();
                        }

                        @Override // X.InterfaceC1290780jh6
                        public final void LIZ(Bitmap bitmap, String str) {
                            C1289620jfE.LIZJ(new ARunnableS2S1500000_20(map, str, bitmap, atomicInteger, interfaceC1290730jh1, c1291600jiQ, 0));
                        }
                    });
                    readableMap = readableMap;
                }
            }
            c1290500jge = new C1290500jge("");
        }
        C1C7U.LIZIZ("LynxBytedLottieView@7d8e.fetchPolyfillBitmap$1L");
        return c1290500jge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static final Object call$1(ACallableS92S0400000_20 aCallableS92S0400000_20) {
        C1290500jge c1290500jge;
        final com.bytedance.sdui.render.bridge.ReadableMap readableMap = (com.bytedance.sdui.render.bridge.ReadableMap) aCallableS92S0400000_20.l0;
        final InterfaceC1290730jh1 interfaceC1290730jh1 = (InterfaceC1290730jh1) aCallableS92S0400000_20.l1;
        final C1291600jiQ c1291600jiQ = (C1291600jiQ) aCallableS92S0400000_20.l2;
        final C1290850jhD c1290850jhD = (C1290850jhD) aCallableS92S0400000_20.l3;
        C1C7U.LIZ("SDUIBytedLottieView@4d0c.fetchPolyfillBitmap$1L");
        com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        final HashMap map = new HashMap();
        if (readableMap.size() == 0) {
            interfaceC1290730jh1.onSuccess("");
            c1290500jge = new C1290500jge("");
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(readableMap.size());
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string = readableMap.getString(strNextKey);
                C1290800jh8 c1290800jh8 = c1291600jiQ.LIZLLL.get(strNextKey);
                if (c1290800jh8 != null) {
                    final C259800zU c259800zU = new C259800zU();
                    ?? LJIIJJI = Intrinsics.LJIIJJI(string, c1290800jh8.LJ);
                    c259800zU.element = LJIIJJI;
                    C1290850jhD.LJLLLLLL(LJIIJJI);
                    c1290850jhD.LJLZ(LJIIJJI, strNextKey, c1290800jh8, new g$a() { // from class: X.0jh2
                        @Override // z76.g$a
                        public final void onFailed(String str) throws JSONException {
                            if (!a0.LJJJIL(str)) {
                                C1290850jhD c1290850jhD2 = c1290850jhD;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("fetch polyfill bitmap failed, map: ");
                                sbLIZ.append(readableMap);
                                sbLIZ.append(", path: ");
                                sbLIZ.append(c259800zU.element);
                                sbLIZ.append(", msg: ");
                                sbLIZ.append(str);
                                c1290850jhD2.LJLLJ(1, C2188811AlT.LIZIZ(sbLIZ), c259800zU.element);
                            }
                            interfaceC1290730jh1.onFailed();
                        }

                        @Override // z76.g$a
                        public final void LIZ(Bitmap bitmap, String str) {
                            C1290750jh3.LIZLLL(new ARunnableS2S1500000_20(map, str, bitmap, atomicInteger, interfaceC1290730jh1, c1291600jiQ, 2));
                        }
                    });
                    readableMap = readableMap;
                }
            }
            c1290500jge = new C1290500jge("");
        }
        C1C7U.LIZIZ("SDUIBytedLottieView@4d0c.fetchPolyfillBitmap$1L");
        return c1290500jge;
    }

    public ACallableS92S0400000_20(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
