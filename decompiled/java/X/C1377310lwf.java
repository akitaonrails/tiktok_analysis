package X;

import android.view.View;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377310lwf extends C09AY implements Function2<View, Integer, Unit> {
    public final /* synthetic */ C1377420lwq LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377310lwf(C1377420lwq c1377420lwq, Integer num, String str, String str2, String str3, String str4) {
        super(2);
        this.LL = c1377420lwq;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, Integer num) {
        View view2 = view;
        num.intValue();
        C1377420lwq c1377420lwq = this.LL;
        Iterator<InterfaceC1370310llN> it2 = c1377420lwq.LIZLLL.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1370310llN next = it2.next();
            if (Intrinsics.LJFF(next.key(), "save_image")) {
                ((C0M7V) next).LLILLL = new AwS565S0100000_21(c1377420lwq, 1070);
                break;
            }
        }
        C1377420lwq c1377420lwq2 = this.LL;
        Integer num2 = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        String str4 = this.LLILZLL;
        int iLJIILJJIL = C12ES.LJIILJJIL(view2.getHeight(), c1377420lwq2.LIZ);
        if (num2 != null && num2.intValue() == 1) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("panel_height", iLJIILJJIL);
            jSONObject.put("panel_frame", jSONObject2);
            IESJsBridge iESJsBridge = c1377420lwq2.LIZIZ;
            if (iESJsBridge != null) {
                iESJsBridge.LJ("H5_sharePanelFrame", jSONObject);
            }
            InterfaceC1541990qEH interfaceC1541990qEH = c1377420lwq2.LIZJ;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ("H5_sharePanelFrame", jSONObject);
            }
        }
        C1377320lwg.LIZ.getClass();
        C1377320lwg.LIZIZ(str, str2, str3, str4);
        return Unit.LIZ;
    }
}
