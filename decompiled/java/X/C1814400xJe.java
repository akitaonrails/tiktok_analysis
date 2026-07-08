package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814400xJe extends C09AY implements Function1<C1817550xOj, Unit> {
    public final /* synthetic */ DecorationDoneButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814400xJe(DecorationDoneButtonAssem decorationDoneButtonAssem) {
        super(1);
        this.LL = decorationDoneButtonAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1817550xOj c1817550xOj) {
        String str;
        HashMap<String, String> map;
        C1817550xOj c1817550xOj2 = c1817550xOj;
        if (c1817550xOj2 == null || (map = c1817550xOj2.LIZ) == null || (str = map.get("decoration_entrance")) == null) {
            str = "live_take_page";
        }
        C291301Ax c291301Ax = (C291301Ax) this.LL.LLJIJIL.getValue();
        if (c291301Ax != null) {
            c291301Ax.LL = str;
        }
        C291301Ax c291301Ax2 = (C291301Ax) this.LL.LLJIJIL.getValue();
        if (c291301Ax2 != null) {
            c291301Ax2.LLILLL = Intrinsics.LJFF(str, "ai_summary");
        }
        return Unit.LIZ;
    }
}
