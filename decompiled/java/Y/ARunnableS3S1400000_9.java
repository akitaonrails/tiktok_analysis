package Y;

import X.C098200Yq;
import X.C0NKM;
import X.C1133910fc5;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C630900Ooq;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS125S1200000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS3S1400000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        try {
            c098200Yq = ((Function0) this.l1).invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = this.s0;
        Object obj = this.l3;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("worker task failed: ");
            sbLIZ.append(str);
            C1133910fc5.LIZJ("GiftMessageScheduling", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            c098200Yq = obj;
        }
        ((C0NKM) this.l2).LIZ(this.s0 + ".callback", new AwS125S1200000_9((C0NKM) this.l2, (Function1) this.l4, c098200Yq, this.s0, 17));
    }

    public final void LIZ$1() {
        ((MusicDescAssem) this.l1).sp((TuxTextView) this.l2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s0);
        C630900Ooq c630900Ooq = C630900Ooq.LIZ;
        Music music = (Music) this.l3;
        Context context = (Context) this.l4;
        c630900Ooq.getClass();
        C630900Ooq.LIZ(spannableStringBuilder, music, context, true, true);
        ((TuxTextView) this.l2).setText(spannableStringBuilder);
        MusicDescAssem musicDescAssem = (MusicDescAssem) this.l1;
        Music music2 = (Music) this.l3;
        String str = musicDescAssem.lp().LLILZ;
        if (musicDescAssem.LLJJJJJIL) {
            return;
        }
        c630900Ooq.getClass();
        musicDescAssem.LLJJJJJIL = C630900Ooq.LIZIZ(music2, str, true);
    }

    public static final void run$0(ARunnableS3S1400000_9 aRunnableS3S1400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("GiftMessageScheduling@370d.postToWorkerAtFrontAndMain$1");
        try {
            aRunnableS3S1400000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftMessageScheduling@370d.postToWorkerAtFrontAndMain$1");
    }

    public static final void run$1(ARunnableS3S1400000_9 aRunnableS3S1400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDescAssem@1774.startUpMusicDesc$2$1");
        try {
            aRunnableS3S1400000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDescAssem@1774.startUpMusicDesc$2$1");
    }

    public ARunnableS3S1400000_9(Function0 function0, C0NKM c0nkm, String str, Function1 function1, int i) {
        this.$t = i;
        this.l1 = function0;
        this.l2 = c0nkm;
        this.s0 = str;
        this.l3 = null;
        this.l4 = function1;
    }

    public ARunnableS3S1400000_9(MusicDescAssem musicDescAssem, TuxTextView tuxTextView, String str, Music music, Context context, int i) {
        this.$t = i;
        this.l1 = musicDescAssem;
        this.l2 = tuxTextView;
        this.s0 = str;
        this.l3 = music;
        this.l4 = context;
    }
}
