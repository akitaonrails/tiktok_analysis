package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1905130zfz {
    public static final /* synthetic */ int LIZJ = 0;
    public final MusNotice LIZ;
    public final C1905050zfr LIZIZ;

    public String LIZ(EnumC1905950zhJ enumC1905950zhJ, String str) {
        return null;
    }

    public void LIZIZ(String str) {
    }

    public void LIZJ() {
    }

    public void LIZLLL(EnumC1905020zfo enumC1905020zfo, Context context) {
    }

    public void LJ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.bytedance.tux.drawable.TuxIconDrawable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, com.bytedance.tux.drawable.TuxIconDrawable] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, com.bytedance.tux.drawable.TuxIconDrawable] */
    public C1905130zfz(MusNotice musNotice) {
        GeneralTemplateNotice generalTemplateNotice;
        Integer num;
        Integer num2;
        this.LIZ = musNotice;
        C1905050zfr c1905050zfr = new C1905050zfr();
        this.LIZIZ = c1905050zfr;
        C259800zU c259800zU = new C259800zU();
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (num = generalTemplateNotice.type) != null) {
            if (num.intValue() == 31) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                C844470XAv.LIZ.getClass();
                c259800zU.element = c419910GdJ.LIZ(C844470XAv.LIZ());
            } else if (num.intValue() == 41) {
                Integer num3 = generalTemplateNotice.legacySubType;
                if ((num3 != null && num3.intValue() == 9) || ((num2 = generalTemplateNotice.legacySubType) != null && num2.intValue() == 10)) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_exclamation_mark_circle;
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                    C844470XAv.LIZ.getClass();
                    c259800zU.element = c419910GdJ2.LIZ(C844470XAv.LIZ());
                }
            } else if (num.intValue() == 45) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_exclamation_mark_circle;
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ3.LJ = Integer.valueOf(R.attr.a1k);
                C844470XAv.LIZ.getClass();
                c259800zU.element = c419910GdJ3.LIZ(C844470XAv.LIZ());
            }
        }
        c1905050zfr.LIZJ = (Drawable) c259800zU.element;
        c1905050zfr.LIZIZ = true;
        C1905080zfu.LIZIZ(musNotice);
    }
}
