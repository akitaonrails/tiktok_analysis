package X;

import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS151S0101000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS54S0001000_11;

/* JADX INFO: renamed from: X.0SAX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAX implements C0S9I {
    public final Map<String, C0SAZ> LIZ = new LinkedHashMap();
    public final C716860SAa LIZIZ;
    public String LIZJ;
    public Integer LIZLLL;
    public String LJ;
    public Boolean LJFF;

    @Override // X.C0S9I
    public final String getEventName() {
        return "slides_image_show_end";
    }

    public C0SAX() {
        C0SQK.LIZ.getClass();
        this.LIZIZ = new C716860SAa("slides_image_show_end", true, true);
    }

    public final C0SAZ LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.LIZJ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0SAZ c0saz = (C0SAZ) ((LinkedHashMap) this.LIZ).get(strLIZIZ);
        if (c0saz == null) {
            C0SAZ c0saz2 = new C0SAZ();
            this.LIZ.put(strLIZIZ, c0saz2);
            return c0saz2;
        }
        return c0saz;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r15) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SAX.LIZIZ(int):void");
    }

    public final void LIZJ(int i) {
        C0SAZ c0sazLIZ = LIZ(i);
        c0sazLIZ.LIZ = System.currentTimeMillis();
        c0sazLIZ.LJFF = i;
        this.LIZIZ.LIZIZ(null, null, new AwS151S0101000_11(i, c0sazLIZ, 12));
    }

    public final void LIZLLL(SlidesImageLoadParams slidesImageLoadParams) {
        C0SAZ c0sazLIZ = LIZ(slidesImageLoadParams.index);
        c0sazLIZ.LIZJ = System.currentTimeMillis();
        c0sazLIZ.LJI = slidesImageLoadParams;
        C716870SAb c716870SAb = C0SAY.Companion;
        Integer numValueOf = Integer.valueOf(slidesImageLoadParams.imageLoadStatus);
        c716870SAb.getClass();
        c0sazLIZ.LJII = C716870SAb.LIZ(numValueOf);
        this.LIZIZ.LIZIZ(null, null, new AwS412S0200000_11(slidesImageLoadParams, c0sazLIZ, 105));
    }

    public final void LJ(int i) {
        C0SAZ c0sazLIZ = LIZ(i);
        if (((Boolean) C277660AuS.LIZ.getValue()).booleanValue() && c0sazLIZ.LJII == C0SAY.SUCCESS) {
            c0sazLIZ.LIZLLL = 0;
            this.LIZIZ.LIZIZ(null, null, new AwS54S0001000_11(i, 2));
        } else {
            if (c0sazLIZ.LJII != C0SAY.UNKNOWN) {
                c0sazLIZ.LIZLLL = 0;
            }
            c0sazLIZ.LJII = C0SAY.LOADING;
            this.LIZIZ.LIZIZ(null, null, new AwS54S0001000_11(i, 3));
        }
    }
}
