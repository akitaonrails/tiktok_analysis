package X;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718450SGd extends C09AY implements Function0<List<? extends C0SIR>> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PaidContentInfo LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718450SGd(Context context, String str, PaidContentInfo paidContentInfo, Aweme aweme) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = paidContentInfo;
        this.LLILZ = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0SIR> invoke() {
        String string = C20642515q3.LJFF().getString(2131848665);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append('|');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ei, this.LL);
        int i = 0;
        List listLJIILJJIL = numLIZJ != null ? C1697810uHb.LJIILJJIL(new ForegroundColorSpan(numLIZJ.intValue())) : new ArrayList();
        C0SIK c0sik = C0SIK.PAID_CONTENT;
        C0SIR c0sir = new C0SIR(strLIZIZ, listLJIILJJIL, c0sik, 8);
        String str = this.LLILLJJLI;
        if (str == null || str.length() == 0) {
            String episodeNumber = this.LLILLL.getEpisodeNumber();
            Integer numValueOf = episodeNumber != null ? Integer.valueOf(CastIntegerProtector.parseInt(episodeNumber)) : null;
            Context context = this.LL;
            if (!C08A4.LIZ(numValueOf)) {
                return C13BV.INSTANCE;
            }
            C0SIR c0sir2 = new C0SIR(context.getString(2131847442, numValueOf), (List) null, c0sik, 10);
            String desc = this.LLILZ.getDesc();
            return (desc == null || desc.length() == 0) ? Collections.singletonList(c0sir2) : C1697810uHb.LJIIJJI(c0sir2, c0sir);
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.LLILLJJLI, new String[]{" | "}, 0, 6);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (Object obj : listLJJLIIIJILLIZJL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            c13dvLIZIZ.add(new C0SIR((String) obj, (List) null, C0SIK.PAID_CONTENT, 10));
            if (i != listLJJLIIIJILLIZJL.size() - 1 || listLJJLIIIJILLIZJL.size() == 1) {
                c13dvLIZIZ.add(c0sir);
            }
            i = i2;
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
