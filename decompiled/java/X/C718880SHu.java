package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718880SHu extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718880SHu(C718770SHj c718770SHj) {
        super(0);
        this.LL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme = this.LL.LLLLIIL;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false)) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(this.LL.LJJJLIIL(true), this.LL.LJJJLIIL(false));
            C718770SHj c718770SHj = this.LL;
            Iterator it2 = listLJIIJJI.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMeasureText = c718770SHj.LLJ.getPaint().measureText(((C0SJA) it2.next()).getText());
            while (it2.hasNext()) {
                fMeasureText = Math.max(fMeasureText, c718770SHj.LLJ.getPaint().measureText(((C0SJA) it2.next()).getText()));
            }
            float fLJII = C718770SHj.LJII(this.LL, fMeasureText, null, true, false, 26);
            C0GU3 c0gu3 = this.LL.LLJLLIL;
            if (c0gu3 != null) {
                c0gu3.getWidth();
            }
            C0GU3 c0gu32 = this.LL.LLJLLIL;
            if (c0gu32 != null) {
                Integer numValueOf = Integer.valueOf(c0gu32.getWidth());
                if (numValueOf.intValue() > 0) {
                    return Boolean.valueOf(fLJII > ((float) numValueOf.intValue()));
                }
            }
        }
        return null;
    }
}
