package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20693515yH extends AbstractC19293010ds {
    public final String LLILZIL;
    public final EnumC1216700hlc LLILZLL;
    public final C419910GdJ LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final View.OnClickListener LLJILJILJ;
    public final View.OnClickListener LLJILLL;
    public final Object LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final CharSequence LLJJIJI;
    public final Integer LLJJIJIIJIL;

    @Override // X.AbstractC19293010ds
    public boolean LIZ() {
        return this.LLIZLLLIL;
    }

    public boolean LIZIZ() {
        return this.LLJJI;
    }

    public boolean LIZLLL() {
        return this.LLJJIII;
    }

    public EnumC1216700hlc LJ() {
        return this.LLILZLL;
    }

    public View.OnClickListener LJI() {
        return this.LLJILLL;
    }

    public boolean LJIIIIZZ() {
        return this.LLJ;
    }

    public boolean LJIILIIL() {
        return this.LLJIJIL;
    }

    public C419910GdJ LJIIZILJ() {
        return this.LLIZ;
    }

    public boolean LJIJJLI() {
        return this.LLJILJIL;
    }

    public CharSequence LJIL() {
        return this.LLJJIJI;
    }

    public Integer LJJ() {
        return this.LLJJIJIIJIL;
    }

    public String LJJIFFI() {
        return this.LLILZIL;
    }

    public String getSubTitle() {
        return this.LLJI;
    }

    public boolean equals(Object obj) {
        AbstractC19293010ds abstractC19293010ds;
        String str = this.LLILLL;
        String str2 = null;
        if ((obj instanceof C20693515yH) && (abstractC19293010ds = (AbstractC19293010ds) obj) != null) {
            str2 = abstractC19293010ds.LLILLL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20693515yH(String str, EnumC1216700hlc enumC1216700hlc, C419910GdJ c419910GdJ, boolean z, boolean z2, String str2, boolean z3, boolean z4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Object obj, boolean z5, boolean z6, int i) {
        C419910GdJ c419910GdJ2 = c419910GdJ;
        boolean z7 = z;
        boolean z8 = z2;
        String str3 = str2;
        View.OnClickListener onClickListener3 = onClickListener;
        boolean z9 = z4;
        Object obj2 = obj;
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z10 = z5;
        EnumC1216700hlc enumC1216700hlc2 = (i & 2) != 0 ? EnumC1216700hlc.NORMAL : enumC1216700hlc;
        c419910GdJ2 = (i & 4) != 0 ? null : c419910GdJ2;
        z7 = (i & 8) != 0 ? true : z7;
        z8 = (i & 16) != 0 ? false : z8;
        str3 = (i & 32) != 0 ? null : str3;
        boolean z11 = (i & 64) == 0 ? z3 : true;
        z9 = (i & 128) != 0 ? false : z9;
        onClickListener3 = (i & 256) != 0 ? null : onClickListener3;
        onClickListener4 = (i & 512) != 0 ? null : onClickListener4;
        obj2 = (i & 1024) != 0 ? null : obj2;
        z10 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z10;
        boolean z12 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z6 : false;
        super(z7, obj2, 8);
        this.LLILZIL = str;
        this.LLILZLL = enumC1216700hlc2;
        this.LLIZ = c419910GdJ2;
        this.LLIZLLLIL = z7;
        this.LLJ = z8;
        this.LLJI = str3;
        this.LLJIJIL = z11;
        this.LLJILJIL = z9;
        this.LLJILJILJ = onClickListener3;
        this.LLJILLL = onClickListener4;
        this.LLJJ = obj2;
        this.LLJJI = z10;
        this.LLJJIII = z12;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
    }
}
