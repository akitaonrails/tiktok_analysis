package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.lifecycle.AtomicReference;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H6P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6P extends C0H6M {
    public static final C0H2N LJIILL = new C0H2N();
    public static final AtomicReference<Bitmap> LJIILLIIL = new AtomicReference<>(null);
    public static final AtomicReference<Bitmap> LJIIZILJ = new AtomicReference<>(null);
    public final Context LJFF;
    public final int LJI;
    public final int LJII;
    public final C0HGY LJIIIIZZ;
    public final C0H7H LJIIIZ;
    public final Integer LJIIJ;
    public Bitmap LJIIJJI;
    public final Rect LJIIL;
    public final C01GW LJIILIIL;
    public final boolean LJIILJJIL;

    @Override // X.C0H6M
    public final boolean LIZ() {
        return false;
    }

    @Override // X.C0H6M
    public final /* bridge */ /* synthetic */ String LIZIZ() {
        return null;
    }

    @Override // X.C0H6M
    public final Integer LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.C0H6M
    public final C0H7H LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.C0H6M
    public final C0HGY LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0H6M
    public final boolean LJFF() {
        return this.LJIILJJIL;
    }

    @Override // X.C0H6M
    public final void LJII(Canvas canvas) {
        Bitmap bitmap = this.LJIIJJI;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.LJIIL, (Paint) null);
        }
    }

    @Override // X.C0H6M
    public final Object LJIIJ(InterfaceC1364105Vn<? super Pair<C0HOC, ? extends EnumC440340HOm>> interfaceC1364105Vn) {
        List<Emoji> listLIZIZ;
        C0HGL c0hglLIZJ;
        Function0<Unit> function0 = this.LJ;
        if (function0 != null) {
            function0.invoke();
        }
        if (C0H6Q.LIZ()) {
            ElementsRepository elementsRepository = (ElementsRepository) this.LJIILIIL.getValue();
            if (elementsRepository != null && (c0hglLIZJ = elementsRepository.LIZJ(this.LJI)) != null) {
                List<InterfaceC440090HNn> listLIZ = c0hglLIZJ.LIZ(new C0H6S(C2286608xc.LJ(this.LJII), 2));
                return new Pair(new C0HOC((InterfaceC440090HNn) ListProtector.get(listLIZ, AbstractC19994813Le.Default.nextInt(((ArrayList) listLIZ).size())), C0H7H.RANDOMIZER, C2286608xc.LJ(-1), true), null);
            }
            return new Pair(null, null);
        }
        if (C440480HPa.LIZJ()) {
            EmojiRepository emojiRepository = (EmojiRepository) PluggableExtentionKt.pluggableSpi$default(EmojiRepository.class, false, false, false, 14, null);
            if (emojiRepository != null && (listLIZIZ = emojiRepository.LIZIZ(Integer.MAX_VALUE)) != null) {
                return new Pair(new C0HOC(new C435610H6h((Emoji) ListProtector.get(listLIZIZ, AbstractC19994813Le.Default.nextInt(listLIZIZ.size())), this.LJI), C0H7H.RANDOMIZER, C2286608xc.LJ(-1), true), null);
            }
            return new Pair(null, null);
        }
        return new Pair(null, null);
    }

    @Override // X.C0H6M
    public final void LJIIIIZZ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJIIL.set(0, 0, i, i2);
    }

    public C0H6P(Context context, InterfaceC497601wk interfaceC497601wk, int i, int i2) {
        C0HGY c0hgy;
        C0H7H c0h7h;
        Integer num;
        this.LJFF = context;
        this.LJI = i;
        this.LJII = i2;
        if (C440480HPa.LIZJ()) {
            c0hgy = C0HGY.EMOJI;
        } else {
            c0hgy = null;
        }
        this.LJIIIIZZ = c0hgy;
        if (C440480HPa.LIZJ()) {
            c0h7h = C0H7H.RANDOMIZER;
        } else {
            c0h7h = null;
        }
        this.LJIIIZ = c0h7h;
        if (C440480HPa.LIZJ()) {
            num = -1;
        } else {
            num = null;
        }
        this.LJIIJ = num;
        this.LJIIL = new Rect();
        this.LJIILIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(435));
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0H2L(this, null), 3);
        this.LJIILJJIL = true;
    }
}
