package X;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126480fQ6 {
    public static long LJIIJ;
    public static long LJIIJJI;
    public final Function0<Gift> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Paint LIZJ;
    public final float LIZLLL;
    public final Map<EnumC1126490fQ7, C1126500fQ8> LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public C1126300fPo LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1126300fPo LIZ(int r20) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126480fQ6.LIZ(int):X.0fPo");
    }

    public C1126480fQ6(Context context, AwS561S0100000_17 awS561S0100000_17, AwS561S0100000_17 awS561S0100000_172) {
        this.LIZ = awS561S0100000_17;
        this.LIZIZ = awS561S0100000_172;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(C497740JfY.LIZIZ(22));
        C1119920fFW.LJII(context, paint, OppoPermissionPopupMaskDelayExp.DEFAULT);
        this.LIZJ = paint;
        this.LIZLLL = C497740JfY.LIZIZ(72);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJ = linkedHashMap;
        linkedHashMap.put(EnumC1126490fQ7.LL, new C1126500fQ8(2131851908));
        linkedHashMap.put(EnumC1126490fQ7.LLILLJJLI, new C1126500fQ8(2131851909));
        linkedHashMap.put(EnumC1126490fQ7.LLILLL, new C1126500fQ8(2131851910));
        linkedHashMap.put(EnumC1126490fQ7.LLILZ, new C1126500fQ8(2131851907));
        linkedHashMap.put(EnumC1126490fQ7.LLILZIL, new C1126500fQ8(2131851911));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C1126500fQ8 c1126500fQ8 = (C1126500fQ8) ((Map.Entry) it2.next()).getValue();
            c1126500fQ8.LIZIZ = C497740JfY.LJIJI(c1126500fQ8.LIZ);
            int i = 22;
            while (true) {
                if (8 < i) {
                    float f = i;
                    this.LIZJ.setTextSize(C497740JfY.LIZIZ(f));
                    int iMeasureText = ((int) this.LIZJ.measureText(c1126500fQ8.LIZIZ)) + (((int) C497740JfY.LIZIZ(8)) * 2);
                    if (iMeasureText <= this.LIZLLL) {
                        c1126500fQ8.LIZJ = iMeasureText;
                        c1126500fQ8.LIZLLL = C497740JfY.LIZIZ(f);
                        break;
                    }
                    i--;
                }
            }
        }
    }
}
