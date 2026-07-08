package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.LruCache;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS386S0200000_20;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290330jgN {
    public final List<IHostSubscription.SpriteImage> LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final BitmapFactory.Options LJ;
    public final Map<String, String> LJFF;
    public final LruCache<Integer, WeakReference<Bitmap>> LJI;
    public final AtomicInteger LJII;

    public final Bitmap LIZ(int i) {
        Bitmap bitmap;
        if (i >= this.LIZLLL) {
            return null;
        }
        WeakReference<Bitmap> weakReference = this.LJI.get(Integer.valueOf(i));
        if (weakReference != null && (bitmap = weakReference.get()) != null) {
            return bitmap;
        }
        this.LJI.remove(Integer.valueOf(i));
        int i2 = i;
        for (IHostSubscription.SpriteImage spriteImage : this.LIZ) {
            int i3 = spriteImage.spriteNum;
            if (i3 > i2) {
                Pair pair = new Pair(Integer.valueOf(i2), spriteImage);
                int iIntValue = ((Number) pair.getFirst()).intValue();
                IHostSubscription.SpriteImage spriteImage2 = (IHostSubscription.SpriteImage) pair.getSecond();
                String str = (String) ((LinkedHashMap) this.LJFF).get(spriteImage2.url);
                if (str == null || str.length() == 0 || !new C0VSJ(str).exists()) {
                    return null;
                }
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(str, false);
                int i4 = spriteImage2.imageXNum;
                int i5 = spriteImage2.imageWidth;
                int i6 = (iIntValue % i4) * i5;
                int i7 = iIntValue / i4;
                int i8 = spriteImage2.imageHeight;
                int i9 = i7 * i8;
                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(new Rect(i6, i9, i5 + i6, i8 + i9), this.LJ);
                if (bitmapDecodeRegion != null) {
                    this.LJI.put(Integer.valueOf(i), new WeakReference<>(bitmapDecodeRegion));
                }
                return bitmapDecodeRegion;
            }
            i2 -= i3;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1290330jgN(List<IHostSubscription.SpriteImage> list, Function1<? super Boolean, Unit> function1) {
        this.LIZ = list;
        this.LIZIZ = function1;
        this.LIZJ = 5;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.LJ = options;
        this.LJFF = new LinkedHashMap();
        new LinkedHashMap();
        this.LJI = new LruCache<>(30);
        int i = 0;
        this.LJII = new AtomicInteger(0);
        Iterator<IHostSubscription.SpriteImage> it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += it2.next().spriteNum;
        }
        this.LIZLLL = i2;
        IHostSubscription.SpriteImage spriteImage = (IHostSubscription.SpriteImage) C13LP.LJJJLL(this.LIZ);
        this.LIZJ = spriteImage != null ? spriteImage.fps : 5;
        this.LJII.set(this.LIZ.size());
        try {
            for (IHostSubscription.SpriteImage spriteImage2 : this.LIZ) {
                String str = spriteImage2.url;
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, i, 6);
                if (!listLJJLIIIJILLIZJL.isEmpty()) {
                    str = (String) ListProtector.get(listLJJLIIIJILLIZJL, listLJJLIIIJILLIZJL.size() - 1);
                }
                C207232167i.LIZIZ(new C207209166l(str, EnumC771350UNp.LIVE_REPLAY_SPRITE_IMAGE, null, null, spriteImage2.url, null, true, 1, false, 620), new AwS386S0200000_20(new AwS386S0200000_20(this, spriteImage2, 8), new AwS386S0200000_20(this, spriteImage2, 9), 7));
                i = 0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("downloadSpriteImage", th);
        }
    }
}
