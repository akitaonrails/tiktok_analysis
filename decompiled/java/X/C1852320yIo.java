package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852320yIo extends C09AY implements Function1<List<? extends C1853170yKB>, Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> LL;
    public final /* synthetic */ CreativeTemplate LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C19EG LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852320yIo(InterfaceC1631620sYq<? super CreativeTemplate, ? super Integer, ? super List<BaseImage>, Unit> interfaceC1631620sYq, CreativeTemplate creativeTemplate, int i, C19EG c19eg, String str, String str2, C19EG c19eg2) {
        super(1);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = creativeTemplate;
        this.LLILLL = i;
        this.LLILZ = c19eg;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = c19eg2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C1853170yKB> list) {
        String str;
        C19EG c19eg = this.LLIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C1853170yKB> it2 = list.iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            C1853170yKB next = it2.next();
            if (next.LIZ()) {
                C1852730yJT c1852730yJTLIZIZ = C20188913z5.LIZIZ(c19eg, next.LIZIZ);
                String str2 = next.LIZIZ;
                float f = c1852730yJTLIZIZ.LIZLLL;
                int i = (int) f;
                int i2 = (int) c1852730yJTLIZIZ.LIZJ;
                C1854260yLw c1854260yLw = C1854260yLw.LIZ;
                Float fValueOf = Float.valueOf(f);
                Float fValueOf2 = Float.valueOf(c1852730yJTLIZIZ.LIZJ);
                c1854260yLw.getClass();
                arrayList.add(new BaseImage(null, null, null, null, i, i2, str2, null, null, null, null, "album", null, null, null, C1854260yLw.LIZLLL(fValueOf, fValueOf2), 0, null, 227215, null));
            }
        }
        if (!arrayList.isEmpty()) {
            InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> interfaceC1631620sYq = this.LL;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(this.LLILLJJLI, Integer.valueOf(this.LLILLL), arrayList);
            } else {
                C1854260yLw c1854260yLw2 = C1854260yLw.LIZ;
                String str3 = this.LLILLJJLI.templatePrompt;
                C1852270yIj.LIZ.getClass();
                C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1852270yIj.LJIIJJI();
                String str4 = this.LLILLJJLI.templateId;
                if (C123100dR.LIZ(C1852270yIj.LIZJ.get("push_id")) && (str = C1852270yIj.LIZJ.get("push_id")) == null) {
                    str = "";
                }
                C19EG c19eg2 = this.LLILZ;
                String str5 = this.LLILZIL;
                String str6 = this.LLILZLL;
                c1854260yLw2.getClass();
                C1854260yLw.LJIIIIZZ(c19eg2, c1852650yJL, interfaceC665370Q7zLJIIJJI, false, str3, arrayList, str4, str5, str6, 1001, str);
            }
        }
        return Unit.LIZ;
    }
}
